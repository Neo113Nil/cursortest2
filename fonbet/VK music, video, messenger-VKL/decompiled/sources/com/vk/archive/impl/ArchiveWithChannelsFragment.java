package com.vk.archive.impl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.vk.channels.api.ChannelEntryPoint;
import com.vk.channels.api.ChannelHistoryOpenMode;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.AppBarLayoutWithDrawingOrderCallback;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.ChannelSource;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.search.SearchEntrypoint;
import com.vk.im.ui.components.msg_list.MsgListOpenAtMsgMode;
import com.vk.im.ui.components.msg_list.MsgListOpenAtUnreadMode;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.fragments.ImFragment;
import com.vk.im.ui.fragments.chat.ChatAnalyticsParams;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.List;
import xsna.a1w;
import xsna.awt0;
import xsna.e43;
import xsna.g2v;
import xsna.h8;
import xsna.kb;
import xsna.lb;
import xsna.li3;
import xsna.o0w;
import xsna.oz50;
import xsna.pj3;
import xsna.q1w;
import xsna.r4;
import xsna.rw30;
import xsna.s0b;
import xsna.u180;
import xsna.z0b;

/* compiled from: ArchiveWithChannelsFragment.kt */
/* loaded from: classes15.dex */
public final class ArchiveWithChannelsFragment extends ImFragment {
    public static final /* synthetic */ int V = 0;
    public boolean P;
    public boolean Q;
    public final List<Integer> R;
    public final List<Integer> S;
    public rw30 T;
    public Menu U;

    /* compiled from: ArchiveWithChannelsFragment.kt */
    public static final class b extends oz50 {
    }

    /* compiled from: ArchiveWithChannelsFragment.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImBgSyncState.values().length];
            try {
                iArr[ImBgSyncState.REFRESHING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImBgSyncState.REFRESHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImBgSyncState.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImBgSyncState.DISCONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImBgSyncState.CONNECTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ArchiveWithChannelsFragment() {
        Integer valueOf = Integer.valueOf(R.string.vkim_archive_chats_title);
        this.R = e43.l(valueOf, Integer.valueOf(R.string.vkim_archive_channels_title));
        this.S = e43.l(valueOf, Integer.valueOf(R.string.vkim_archive_communities_title));
    }

    public static void eo(ArchiveWithChannelsFragment archiveWithChannelsFragment, DialogExt dialogExt, Integer num, String str, ImSearchItemLoggingInfo imSearchItemLoggingInfo, int i) {
        Integer num2 = (i & 2) != 0 ? null : num;
        o0w.x(g2v.c().b(), archiveWithChannelsFragment.kn(), null, dialogExt.e, dialogExt, null, num2 == null ? MsgListOpenAtUnreadMode.b : new MsgListOpenAtMsgMode(MsgIdType.CNV_ID, num2.intValue()), (i & 8) == 0, null, null, null, null, null, null, str, null, null, null, false, null, null, new ChatAnalyticsParams(null, null, null, null, false, null, null, (i & 16) != 0 ? null : imSearchItemLoggingInfo, null, 383, null), null, null, 1040179090);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        this.P = arguments != null ? arguments.getBoolean("channels_renamed") : false;
        Bundle arguments2 = getArguments();
        this.Q = arguments2 != null ? arguments2.getBoolean("show_channel_item_as_default_dialog") : false;
        List<Integer> list = this.P ? this.S : this.R;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.im_archive_fragment, viewGroup, false);
        Toolbar toolbar = (Toolbar) viewGroup2.findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.vkim_dialogs_header_filter_archive);
        toolbar.setNavigationOnClickListener(new r4(this, 1));
        toolbar.l(R.menu.vkim_dialogs);
        this.U = toolbar.getMenu();
        Menu menu = toolbar.getMenu();
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            if (item.getItemId() != R.id.search) {
                item.setVisible(false);
            }
        }
        toolbar.setOnMenuItemClickListener(new kb(this, 3));
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        this.N.b(io.reactivex.rxjava3.kotlin.c.f(3, a1wVar.l.a().b0(u180.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()), null, null, new lb(this, toolbar)));
        ((AppBarLayoutWithDrawingOrderCallback) viewGroup2.findViewById(R.id.appbar)).setDrawingOrderCallback(AppBarLayoutWithDrawingOrderCallback.a.C0783a.b);
        TabLayout tabLayout = (TabLayout) viewGroup2.findViewById(R.id.vkim_tabs);
        ViewPager2 viewPager2 = (ViewPager2) viewGroup2.findViewById(R.id.archive_pager);
        g2v.c().getClass();
        li3 li3Var = new li3(this, this.P, this.Q, true);
        viewPager2.setAdapter(li3Var);
        viewPager2.b(new pj3(li3Var, this));
        awt0.v(tabLayout, li3Var.getItemCount() > 1);
        new com.google.android.material.tabs.c(tabLayout, viewPager2, new h8(list, 3)).a();
        return viewGroup2;
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        rw30 rw30Var = this.T;
        if (rw30Var != null) {
            rw30Var.G0();
        }
        this.T = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.IM_ARCHIVE;
    }

    /* compiled from: ArchiveWithChannelsFragment.kt */
    public final class a implements rw30.a {
        public final SearchEntrypoint a = SearchEntrypoint.SEARCH_ARCHIVED_CHATS;

        public a() {
        }

        @Override // xsna.rw30.a
        public final boolean a(Dialog dialog) {
            return true;
        }

        @Override // xsna.rw30.a
        public final boolean b(Dialog dialog) {
            return true;
        }

        @Override // xsna.rw30.a
        public final void c(long j, boolean z) {
            a1w a1wVar = q1w.a;
            if (a1wVar == null) {
                a1wVar = null;
            }
            Serializer.c<Peer> cVar = Peer.CREATOR;
            a1wVar.D(this, new z0b(Peer.a.b(j)));
        }

        @Override // xsna.rw30.a
        public final void d(Dialog dialog, int i) {
            ArchiveWithChannelsFragment.eo(ArchiveWithChannelsFragment.this, new DialogExt(dialog, new ProfilesInfo()), Integer.valueOf(i), "message_search", null, 16);
        }

        @Override // xsna.rw30.a
        public final void e(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo, ImSearchItemLoggingInfo imSearchItemLoggingInfo) {
            ArchiveWithChannelsFragment.eo(ArchiveWithChannelsFragment.this, new DialogExt(dialog, new ProfilesInfo(profilesSimpleInfo)), null, "conversations_search", imSearchItemLoggingInfo, 10);
        }

        @Override // xsna.rw30.a
        public final void f(long j, boolean z) {
            a1w a1wVar = q1w.a;
            if (a1wVar == null) {
                a1wVar = null;
            }
            Serializer.c<Peer> cVar = Peer.CREATOR;
            a1wVar.D(this, new s0b(Peer.a.b(j), z ? ChannelSource.RecommendationsPlus.c : ChannelSource.Plus.c));
        }

        @Override // xsna.rw30.a
        public final SearchEntrypoint g() {
            return this.a;
        }

        @Override // xsna.rw30.a
        public final void h(long j, boolean z) {
            g2v.c().a().c(ArchiveWithChannelsFragment.this.kn(), j, ChannelHistoryOpenMode.OpenAtUnread.b, z ? ChannelEntryPoint.SearchRecommendations.b : ChannelEntryPoint.Search.b);
        }

        @Override // xsna.rw30.a
        public final void i() {
        }
    }
}
