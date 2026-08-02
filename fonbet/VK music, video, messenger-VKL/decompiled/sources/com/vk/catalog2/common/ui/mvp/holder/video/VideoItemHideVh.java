package com.vk.catalog2.common.ui.mvp.holder.video;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.UIBlockVideoHide;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.libvideo.ui.VideoHidePollView;
import com.vk.libvideo.ui.VideoHideView;
import com.vk.stat.scheme.CommonUxpollsStat$TypeUxpollsEvent;
import com.vkontakte.android.R;
import defpackage.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xsna.b25;
import xsna.b5a;
import xsna.bpn0;
import xsna.d3j0;
import xsna.dps0;
import xsna.f4m;
import xsna.fnj;
import xsna.fxc0;
import xsna.g7s0;
import xsna.iah0;
import xsna.o25;
import xsna.qbc0;

/* compiled from: VideoItemHideVh.kt */
/* loaded from: classes16.dex */
public final class VideoItemHideVh extends VideoItemVh {
    public final bpn0 m;
    public final dps0 n;
    public VideoHideView o;
    public VideoHidePollView p;
    public VideoFile q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoItemHideVh(b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider) {
        super(b5aVar, searchStatInfoProvider, r3, null, null, null, null, null, 248);
        g7s0 B = fxc0.B();
        bpn0 bpn0Var = o25.a;
        b25 b25Var = (b25) (bpn0Var == null ? null : bpn0Var).getValue();
        this.m = new bpn0(new d3j0(B, 14));
        this.n = new dps0(b25Var);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.n.b.dispose();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        VideoHidePollView videoHidePollView;
        int i;
        VideoHideView videoHideView;
        super.N6(uIBlock);
        UIBlockVideoHide uIBlockVideoHide = uIBlock instanceof UIBlockVideoHide ? (UIBlockVideoHide) uIBlock : null;
        if (uIBlockVideoHide != null) {
            boolean z = uIBlockVideoHide.z;
            UIBlockVideo uIBlockVideo = uIBlockVideoHide.y;
            if (uIBlockVideo != null) {
                VideoFile videoFile = uIBlockVideo.B;
                this.q = videoFile;
                VideoHideView videoHideView2 = this.o;
                if (videoHideView2 == null) {
                    videoHideView2 = null;
                }
                videoHideView2.setScreenMode(VideoScreenMode.PREVIEW);
                VideoHideView videoHideView3 = this.o;
                if (videoHideView3 == null) {
                    videoHideView3 = null;
                }
                videoHideView3.setVideoFile(videoFile);
                VideoHideView videoHideView4 = this.o;
                if (videoHideView4 == null) {
                    videoHideView4 = null;
                }
                videoHideView4.setIsHideByOwner(z);
            }
            ArrayList Pb = uIBlockVideoHide.Pb();
            if (Pb.isEmpty()) {
                Pb = null;
            }
            if (Pb != null) {
                VideoHideView videoHideView5 = this.o;
                if (videoHideView5 == null) {
                    videoHideView5 = null;
                }
                videoHideView5.setHiddenBlocksIds(Pb);
                List<UIBlock> list = uIBlockVideoHide.A;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        CatalogViewType catalogViewType = ((UIBlock) it.next()).d;
                        catalogViewType.getClass();
                        switch (CatalogViewType.b.$EnumSwitchMapping$0[catalogViewType.ordinal()]) {
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 27:
                                i = R.string.hide_block_of_clips;
                                break;
                        }
                        videoHideView = this.o;
                        if (videoHideView == null) {
                            videoHideView = null;
                        }
                        videoHideView.setText(i);
                    }
                }
                i = R.string.hide_block_of_videos;
                videoHideView = this.o;
                if (videoHideView == null) {
                }
                videoHideView.setText(i);
            }
            if (!((Boolean) this.m.getValue()).booleanValue() || z || !uIBlockVideoHide.Pb().isEmpty() || (videoHidePollView = this.p) == null) {
                return;
            }
            videoHidePollView.setVisibility(0);
            CommonUxpollsStat$TypeUxpollsEvent.EventType eventType = CommonUxpollsStat$TypeUxpollsEvent.EventType.SHOW;
            VideoFile videoFile2 = this.q;
            this.n.a(eventType, null, videoFile2 != null ? videoFile2.r() : null, null);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int a;
        int a2;
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setId(R.id.video_hide_view);
        frameLayout.setLayoutParams(new RecyclerView.p(-1, -2));
        Context context = frameLayout.getContext();
        HashSet hashSet = iah0.a;
        if (fnj.d(context)) {
            a = iah0.a(32);
            a2 = 0;
        } else {
            a = iah0.a(16);
            a2 = iah0.a(20);
        }
        ((RecyclerView.p) frameLayout.getLayoutParams()).setMargins(a, 0, a, a2);
        VideoHideView videoHideView = new VideoHideView(layoutInflater.getContext(), null, 0, 14, 0);
        this.o = videoHideView;
        bpn0 bpn0Var = this.m;
        if (((Boolean) bpn0Var.getValue()).booleanValue()) {
            videoHideView.setOnCancelClickListener(new qbc0(this, 29));
        }
        frameLayout.addView(videoHideView);
        if (((Boolean) bpn0Var.getValue()).booleanValue()) {
            VideoHidePollView videoHidePollView = new VideoHidePollView(layoutInflater.getContext(), null, 0, 14, 0);
            f4m.j(videoHidePollView);
            videoHidePollView.setOnCloseListener(new v(29, videoHidePollView, this));
            this.p = videoHidePollView;
            frameLayout.addView(videoHidePollView);
        }
        return frameLayout;
    }
}
