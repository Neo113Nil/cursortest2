package com.vk.posting.presentation.video;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.lists.AbstractPaginatedView;
import com.vk.posting.presentation.model.VideoAttachParams;
import com.vk.posting.presentation.video.a;
import com.vk.posting.presentation.video.model.VideoAlbumParams;
import com.vk.posting.presentation.video.model.VideoPickerFilter;
import com.vk.tab.presentation.TabView;
import com.vkontakte.android.R;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import xsna.bu00;
import xsna.bwt0;
import xsna.cn70;
import xsna.d2t0;
import xsna.e4;
import xsna.f5z;
import xsna.fkq0;
import xsna.gm50;
import xsna.qv20;
import xsna.tlo0;
import xsna.tq;
import xsna.uho0;
import xsna.vlc0;
import xsna.xn50;
import xsna.z6f0;

/* compiled from: VideoPickerView.kt */
/* loaded from: classes5.dex */
public final class f implements gm50 {
    public final Context b;
    public final VideoPickerFragment c;
    public final f5z d;
    public final View e;
    public final UsableRecyclerPaginatedView f;
    public final TabView g;
    public final TabView h;
    public final d2t0 i;

    /* compiled from: VideoPickerView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoPickerFilter.values().length];
            try {
                iArr[VideoPickerFilter.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoPickerFilter.PLAYLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public f(Context context, f5z f5zVar, VideoPickerFragment videoPickerFragment, VideoAlbumParams videoAlbumParams, VideoAttachParams videoAttachParams, UserId userId, boolean z) {
        this.b = context;
        this.c = videoPickerFragment;
        this.d = f5zVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.fragment_video_picker, (ViewGroup) null);
        this.e = inflate;
        UsableRecyclerPaginatedView usableRecyclerPaginatedView = (UsableRecyclerPaginatedView) inflate.findViewById(R.id.rpb_list);
        this.f = usableRecyclerPaginatedView;
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.topbar);
        TabView tabView = (TabView) inflate.findViewById(R.id.video_filter_tab);
        tabView.setTab(new bu00());
        tabView.setTabSelected(true);
        tabView.setPadding(cn70.b(16), z ? cn70.b(15) : cn70.b(4), cn70.b(8), cn70.b(12));
        this.g = tabView;
        TabView tabView2 = (TabView) inflate.findViewById(R.id.video_playlist_filter_tab);
        tabView2.setTab(new qv20());
        tabView2.setPadding(cn70.b(8), z ? cn70.b(15) : cn70.b(4), cn70.b(8), cn70.b(12));
        this.h = tabView2;
        d2t0 d2t0Var = new d2t0(new g(this));
        this.i = d2t0Var;
        if (videoAttachParams != null) {
            Integer num = fkq0.d(userId) ? videoAttachParams.b : videoAttachParams.d;
            Integer num2 = fkq0.d(userId) ? videoAttachParams.c : videoAttachParams.e;
            if (num2 != null && num != null) {
                if (num.intValue() != 0 && num2.intValue() == 0) {
                    bwt0.p0(tabView, false);
                    bwt0.p0(tabView2, false);
                    xn50.a.c(videoPickerFragment, a.b.AbstractC1533a.C1534a.b);
                } else if (num2.intValue() != 0 && num.intValue() == 0) {
                    bwt0.p0(tabView, false);
                    bwt0.p0(tabView2, false);
                    xn50.a.c(videoPickerFragment, a.b.AbstractC1533a.C1535b.b);
                }
            }
        }
        if (videoAlbumParams != null) {
            bwt0.p0(vkTopBar, true);
            vkTopBar.setBack(new VkTopBar.b(new uho0(this, 12), tq.h(tlo0.Companion, R.string.accessibility_toolbar_back), null, null, null, 28));
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(videoAlbumParams.c, (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, null, 14));
            bwt0.p0(tabView, false);
            bwt0.p0(tabView2, false);
        } else {
            bwt0.p0(vkTopBar, false);
        }
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
        usableRecyclerPaginatedView.getClass();
        new AbstractPaginatedView.d(layoutType, usableRecyclerPaginatedView).a();
        usableRecyclerPaginatedView.setAdapter(d2t0Var);
        usableRecyclerPaginatedView.setSwipeRefreshEnabled(true);
        usableRecyclerPaginatedView.getRecyclerView().setPadding(0, cn70.b(2), 0, cn70.b(16));
        usableRecyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        bwt0.i0(tabView, new z6f0(this, 29));
        bwt0.i0(tabView2, new vlc0(this, 27));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.d;
    }
}
