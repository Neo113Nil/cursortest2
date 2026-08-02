package com.vk.video.ui.slider.impl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh;
import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.libvideo.design.view.info.VideoInfoTextView;
import com.vk.movika.api.InteractiveData;
import com.vk.movika.api.MovikaComponent;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.bwt0;
import xsna.cqs0;
import xsna.dnt0;
import xsna.ebs0;
import xsna.ent0;
import xsna.fpf0;
import xsna.fxc0;
import xsna.iah0;
import xsna.k7m;
import xsna.m7m;
import xsna.rcx;
import xsna.tcx;
import xsna.zps0;

/* compiled from: SliderInteractiveVideoVh.kt */
/* loaded from: classes7.dex */
public final class SliderInteractiveVideoVh extends VideoItemVh implements ent0 {
    public View m;
    public VKCircleImageView n;
    public TextView o;
    public VideoInfoTextView p;
    public ImageView q;
    public rcx r;
    public Group s;
    public final cqs0 t;

    public SliderInteractiveVideoVh(b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider) {
        super(b5aVar, searchStatInfoProvider, null, null, null, null, null, null, 252);
        this.t = new cqs0(null, 3);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        UIBlockVideo uIBlockVideo = uIBlock instanceof UIBlockVideo ? (UIBlockVideo) uIBlock : null;
        if (uIBlockVideo == null) {
            return;
        }
        VideoFile videoFile = uIBlockVideo.B;
        boolean c = fxc0.B().c(videoFile);
        View view = this.m;
        if (view == null) {
            view = null;
        }
        zps0 c2 = this.t.c(videoFile, view.getContext(), null);
        VKCircleImageView vKCircleImageView = this.n;
        if (vKCircleImageView == null) {
            vKCircleImageView = null;
        }
        vKCircleImageView.o0(videoFile.M0(), null);
        TextView textView = this.o;
        if (textView == null) {
            textView = null;
        }
        textView.setText(videoFile.getTitle());
        VideoInfoTextView videoInfoTextView = this.p;
        if (videoInfoTextView == null) {
            videoInfoTextView = null;
        }
        videoInfoTextView.setText(c2);
        Group group = this.s;
        if (group == null) {
            group = null;
        }
        group.setVisibility(c ? 4 : 0);
        rcx rcxVar = this.r;
        (rcxVar != null ? rcxVar : null).y0(new InteractiveData(videoFile, uIBlockVideo.f, videoFile.r(), InteractiveData.From.CATALOG, (SearchStatsLoggingInfo) null, (ebs0) null, false, false, 496));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_interactive_slider_view, (ViewGroup) null);
        this.m = inflate;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.video_wrap);
        int a = iah0.a(174);
        bwt0.m0((int) ((a * 16.0f) / 9.0f), a, frameLayout);
        bwt0.d(frameLayout, iah0.a(8), (r4 & 2) != 0, (r4 & 4) != 0);
        View view = this.m;
        if (view == null) {
            view = null;
        }
        this.n = (VKCircleImageView) view.findViewById(R.id.avatar);
        View view2 = this.m;
        if (view2 == null) {
            view2 = null;
        }
        this.o = (TextView) view2.findViewById(R.id.title);
        View view3 = this.m;
        if (view3 == null) {
            view3 = null;
        }
        this.p = (VideoInfoTextView) view3.findViewById(R.id.subtitle);
        View view4 = this.m;
        if (view4 == null) {
            view4 = null;
        }
        this.q = (ImageView) view4.findViewById(R.id.menu);
        View view5 = this.m;
        if (view5 == null) {
            view5 = null;
        }
        this.s = (Group) view5.findViewById(R.id.bottom_info_group);
        View view6 = this.m;
        if (view6 == null) {
            view6 = null;
        }
        rcx a2 = ((MovikaComponent) ((k7m) m7m.c(view6)).mo408a(fpf0.a(MovikaComponent.class))).U4().a(layoutInflater.getContext(), new tcx.b(3));
        this.r = a2;
        frameLayout.addView(a2.getView(), new ViewGroup.LayoutParams(-1, -1));
        VKCircleImageView vKCircleImageView = this.n;
        if (vKCircleImageView == null) {
            vKCircleImageView = null;
        }
        vKCircleImageView.setOnClickListener(this);
        ImageView imageView = this.q;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setOnClickListener(this);
        View view7 = this.m;
        if (view7 == null) {
            return null;
        }
        return view7;
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        rcx rcxVar = this.r;
        if (rcxVar == null) {
            return null;
        }
        return rcxVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
