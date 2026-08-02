package com.vk.im.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.k0;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.AppBarShadowView;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.reporters.DialogsFilterChangeSource;
import com.vk.im.engine.models.search.SearchEntrypoint;
import com.vk.im.ui.components.dialogs_list.InfoModalBottomSheet;
import com.vk.im.ui.components.msg_list.MsgListOpenAtMsgMode;
import com.vk.im.ui.components.msg_list.MsgListOpenAtUnreadMode;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.fragments.chat.ChatAnalyticsParams;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.android.utils.Logger;
import xsna.a1w;
import xsna.asm;
import xsna.d120;
import xsna.did0;
import xsna.e3m;
import xsna.fnj;
import xsna.fpf0;
import xsna.fsm;
import xsna.i7o0;
import xsna.iah0;
import xsna.iz3;
import xsna.krl0;
import xsna.ltm;
import xsna.m9l;
import xsna.mxv;
import xsna.o0w;
import xsna.oz50;
import xsna.q1w;
import xsna.qcy;
import xsna.qd0;
import xsna.r6m;
import xsna.ras;
import xsna.rw30;
import xsna.s520;
import xsna.u180;
import xsna.vtm;
import xsna.wcd;
import xsna.wug0;
import xsna.xo9;
import xsna.zdw;

/* compiled from: SimpleDialogsFilterFragment.kt */
/* loaded from: classes2.dex */
public final class SimpleDialogsFilterFragment extends ImFragment {
    public static final /* synthetic */ qcy<Object>[] Y;
    public final zdw P;
    public final a1w Q;
    public vtm R;
    public com.vk.im.ui.components.dialogs_list.c S;
    public asm T;
    public rw30 U;
    public ImBgSyncState V;
    public final ras W;
    public boolean X;

    /* compiled from: SimpleDialogsFilterFragment.kt */
    public static final class a extends oz50 {
        public a(DialogsFilter dialogsFilter) {
            super(SimpleDialogsFilterFragment.class, null, null);
            this.j.putSerializable("extra_dialogs_filter", dialogsFilter);
        }
    }

    /* compiled from: SimpleDialogsFilterFragment.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DialogsFilter.values().length];
            try {
                iArr[DialogsFilter.UNREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DialogsFilter.REQUESTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DialogsFilter.BUSINESS_NOTIFY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DialogsFilter.MAIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DialogsFilter.CHATS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DialogsFilter.ARCHIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImBgSyncState.values().length];
            try {
                iArr2[ImBgSyncState.REFRESHING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImBgSyncState.REFRESHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ImBgSyncState.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ImBgSyncState.DISCONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ImBgSyncState.CONNECTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SimpleDialogsFilterFragment.class, "filter", "getFilter()Lcom/vk/im/engine/models/dialogs/DialogsFilter;", 0);
        fpf0.a.getClass();
        Y = new qcy[]{propertyReference1Impl};
    }

    public SimpleDialogsFilterFragment() {
        zdw zdwVar = i7o0.b;
        this.P = zdwVar == null ? null : zdwVar;
        a1w a1wVar = q1w.a;
        this.Q = a1wVar != null ? a1wVar : null;
        this.V = ImBgSyncState.CONNECTED;
        this.W = xo9.v("extra_dialogs_filter");
    }

    public static void go(SimpleDialogsFilterFragment simpleDialogsFilterFragment, DialogExt dialogExt, Integer num, String str, ImSearchItemLoggingInfo imSearchItemLoggingInfo, int i) {
        Integer num2 = (i & 2) != 0 ? null : num;
        o0w.x(simpleDialogsFilterFragment.P.d().b(), simpleDialogsFilterFragment.kn(), null, dialogExt.e, dialogExt, null, num2 == null ? MsgListOpenAtUnreadMode.b : new MsgListOpenAtMsgMode(MsgIdType.CNV_ID, num2.intValue()), (i & 8) == 0, null, null, null, null, null, null, str, null, null, null, false, null, null, new ChatAnalyticsParams(null, null, null, null, false, null, null, (i & 16) != 0 ? null : imSearchItemLoggingInfo, null, 383, null), null, null, 1040179090);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        finish();
        return true;
    }

    public final DialogsFilter eo() {
        qcy<Object> qcyVar = Y[0];
        return (DialogsFilter) this.W.a(this);
    }

    public final int fo() {
        switch (d.$EnumSwitchMapping$0[eo().ordinal()]) {
            case 1:
                return R.string.vkim_dialogs_header_filter_unread;
            case 2:
                return R.string.vkim_msg_request;
            case 3:
                return R.string.vkim_business_notify_count_default;
            case 4:
            case 5:
                return R.string.vkim_dialogs_header_filter_all_rename;
            case 6:
                return R.string.vkim_dialogs_header_filter_archive;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void ho() {
        int i = d.$EnumSwitchMapping$1[this.V.ordinal()];
        int i2 = R.string.vkim_sync_state_refreshing_dots;
        if (i != 1) {
            if (i != 2 && i != 3) {
                i2 = R.string.vkim_sync_state_connecting_dots;
                if (i == 4 || i == 5) {
                    r6m.a.getClass();
                    if (!r6m.j()) {
                        i2 = R.string.vkim_sync_state_wait_for_network_dots;
                    }
                }
            } else if (!this.X) {
                i2 = fo();
            }
        }
        View view = getView();
        Toolbar toolbar = view != null ? (Toolbar) view.findViewById(R.id.toolbar) : null;
        if (toolbar != null) {
            toolbar.setTitle(i2);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.vkim_simple_filter_fragment, viewGroup, false);
        int i = 4;
        if (requireArguments().getBoolean("extra_toolbar_enabled", true)) {
            Toolbar toolbar = (Toolbar) viewGroup2.findViewById(R.id.toolbar);
            toolbar.setTitle(fo());
            FragmentActivity kn = kn();
            HashSet hashSet = iah0.a;
            toolbar.setNavigationIcon(fnj.d(kn) ? null : e3m.e(R.attr.im_ic_back_toolbar, toolbar.getContext()));
            toolbar.setNavigationOnClickListener(new wcd(this, 7));
            toolbar.l(R.menu.vkim_dialogs);
            Menu menu = toolbar.getMenu();
            int size = menu.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = menu.getItem(i2);
                if (item.getItemId() != R.id.search || eo() == DialogsFilter.BUSINESS_NOTIFY) {
                    item.setVisible(false);
                }
            }
            toolbar.setOnMenuItemClickListener(new did0(this, i));
        } else {
            ((AppBarLayout) viewGroup2.findViewById(R.id.appbar)).setVisibility(8);
            ((AppBarShadowView) viewGroup2.findViewById(R.id.shadow)).setVisibility(8);
            ((Toolbar) viewGroup2.findViewById(R.id.toolbar)).setVisibility(8);
        }
        FragmentActivity kn2 = kn();
        a1w a1wVar = this.Q;
        this.T = new asm(kn2, a1wVar);
        FragmentActivity kn3 = kn();
        krl0 stub = krl0.a.getSTUB();
        zdw zdwVar = this.P;
        zdwVar.d().getClass();
        fsm fsmVar = new fsm(kn3, this.P, stub, true, false, true, true, true, BuildInfo.t(), new iz3(29), null, null, 7168);
        k0 o = zdwVar.f().a.d.o();
        LayoutInflater p = zdwVar.f().a.d.p();
        mxv d2 = zdwVar.d();
        asm asmVar = this.T;
        ltm.a.getClass();
        vtm vtmVar = new vtm(o, p, d2, this.P, asmVar, fsmVar.f, ltm.a.b);
        vtmVar.c((ViewStub) viewGroup2.findViewById(R.id.im_dialogs_list_stub));
        this.R = vtmVar;
        com.vk.im.ui.components.dialogs_list.c cVar = new com.vk.im.ui.components.dialogs_list.c(a1wVar, fsmVar);
        cVar.z(false);
        cVar.w(false);
        zdwVar.d().getClass();
        cVar.y(false);
        zdwVar.d().getClass();
        cVar.A(false);
        cVar.s(eo());
        cVar.c(vtmVar);
        cVar.u = new b();
        this.S = cVar;
        this.N.b(a1wVar.l.a().b0(u180.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new d120(new wug0(this, i), 15), new s520(new m9l(1, L.a, L.class, Logger.METHOD_W, "w(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0, 1), 19)));
        return viewGroup2;
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.vk.im.ui.components.dialogs_list.c cVar = this.S;
        if (cVar != null) {
            cVar.u = null;
        }
        if (cVar != null) {
            cVar.e();
        }
        com.vk.im.ui.components.dialogs_list.c cVar2 = this.S;
        if (cVar2 != null) {
            cVar2.d();
        }
        this.S = null;
        vtm vtmVar = this.R;
        if (vtmVar != null) {
            vtmVar.d();
        }
        this.R = null;
        asm asmVar = this.T;
        if (asmVar != null) {
            asmVar.g();
        }
        this.T = null;
        rw30 rw30Var = this.U;
        if (rw30Var != null) {
            rw30Var.G0();
        }
        this.U = null;
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        com.vk.im.ui.components.dialogs_list.c cVar = this.S;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.vk.im.ui.components.dialogs_list.c cVar = this.S;
        if (cVar != null) {
            cVar.h();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        switch (d.$EnumSwitchMapping$0[eo().ordinal()]) {
            case 1:
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.IM_UNREAD;
                break;
            case 2:
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.IM_REQUESTS;
                break;
            case 3:
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.IM_BUSINESS_NOTIFY;
                break;
            case 4:
            case 5:
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.IM;
                break;
            case 6:
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.IM_ARCHIVE;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        uiTrackingScreen.a = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    /* compiled from: SimpleDialogsFilterFragment.kt */
    public final class b implements com.vk.im.ui.components.dialogs_list.a {
        public b() {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void c(DialogExt dialogExt) {
            asm asmVar = SimpleDialogsFilterFragment.this.T;
            if (asmVar != null) {
                asmVar.i(dialogExt);
            }
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void f(DialogExt dialogExt) {
            String str;
            qcy<Object>[] qcyVarArr = SimpleDialogsFilterFragment.Y;
            SimpleDialogsFilterFragment simpleDialogsFilterFragment = SimpleDialogsFilterFragment.this;
            switch (d.$EnumSwitchMapping$0[simpleDialogsFilterFragment.eo().ordinal()]) {
                case 1:
                    str = "list_unread";
                    break;
                case 2:
                    str = "list_requests";
                    break;
                case 3:
                    str = "list_business_notify";
                    break;
                case 4:
                case 5:
                    str = "list_all";
                    break;
                case 6:
                    str = "list_archive";
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            SimpleDialogsFilterFragment.go(simpleDialogsFilterFragment, dialogExt, null, str, null, 26);
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void g(InfoModalBottomSheet.Params params) {
            int i = InfoModalBottomSheet.g1;
            InfoModalBottomSheet.b.a(SimpleDialogsFilterFragment.this.requireContext(), params);
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void h(boolean z) {
            SimpleDialogsFilterFragment simpleDialogsFilterFragment = SimpleDialogsFilterFragment.this;
            simpleDialogsFilterFragment.X = z;
            View view = simpleDialogsFilterFragment.getView();
            if (view != null) {
                view.post(new qd0(simpleDialogsFilterFragment, 14));
            }
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void i() {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void j() {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void l() {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void n() {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void o() {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void k(boolean z) {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void m(DialogsFilter dialogsFilter) {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void b(DialogsFilter dialogsFilter, DialogsFilterChangeSource dialogsFilterChangeSource) {
        }
    }

    /* compiled from: SimpleDialogsFilterFragment.kt */
    public final class c implements rw30.a {

        /* compiled from: SimpleDialogsFilterFragment.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DialogsFilter.values().length];
                try {
                    iArr[DialogsFilter.UNREAD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DialogsFilter.REQUESTS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DialogsFilter.BUSINESS_NOTIFY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DialogsFilter.MAIN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[DialogsFilter.CHATS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[DialogsFilter.ARCHIVE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public c() {
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
        public final void d(Dialog dialog, int i) {
            SimpleDialogsFilterFragment.go(SimpleDialogsFilterFragment.this, new DialogExt(dialog, new ProfilesInfo()), Integer.valueOf(i), "message_search", null, 16);
        }

        @Override // xsna.rw30.a
        public final void e(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo, ImSearchItemLoggingInfo imSearchItemLoggingInfo) {
            SimpleDialogsFilterFragment.go(SimpleDialogsFilterFragment.this, new DialogExt(dialog, new ProfilesInfo(profilesSimpleInfo)), null, "conversations_search", imSearchItemLoggingInfo, 10);
        }

        @Override // xsna.rw30.a
        public final SearchEntrypoint g() {
            qcy<Object>[] qcyVarArr = SimpleDialogsFilterFragment.Y;
            switch (a.$EnumSwitchMapping$0[SimpleDialogsFilterFragment.this.eo().ordinal()]) {
                case 1:
                    return SearchEntrypoint.SEARCH_FILTER_UNREAD_DIALOGS;
                case 2:
                    return SearchEntrypoint.SEARCH_FILTER_REQUESTS_DIALOGS;
                case 3:
                    return SearchEntrypoint.SEARCH_FILTER_BUSINESS_DIALOGS;
                case 4:
                case 5:
                    return SearchEntrypoint.SEARCH_FILTER_ALL_DIALOGS;
                case 6:
                    return SearchEntrypoint.SEARCH_FILTER_ARCHIVE_DIALOGS;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        @Override // xsna.rw30.a
        public final void i() {
        }

        @Override // xsna.rw30.a
        public final void c(long j, boolean z) {
        }

        @Override // xsna.rw30.a
        public final void f(long j, boolean z) {
        }

        @Override // xsna.rw30.a
        public final void h(long j, boolean z) {
        }
    }
}
