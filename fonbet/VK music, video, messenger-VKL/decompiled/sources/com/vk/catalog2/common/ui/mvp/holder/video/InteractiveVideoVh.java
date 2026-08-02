package com.vk.catalog2.common.ui.mvp.holder.video;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.video.VideoItemListSettings;
import com.vk.catalog2.common.ui.holders.video.info_overlays.a;
import com.vk.core.tool.view.AspectRatioFrameLayout;
import com.vk.dto.common.VideoFile;
import com.vk.movika.api.InteractiveData;
import com.vk.movika.api.MovikaComponent;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.bwt0;
import xsna.dnt0;
import xsna.ebs0;
import xsna.ecx;
import xsna.ent0;
import xsna.fpf0;
import xsna.fxc0;
import xsna.iah0;
import xsna.k7a;
import xsna.k7m;
import xsna.m33;
import xsna.m7m;
import xsna.rcx;
import xsna.tcx;
import xsna.u4a;
import xsna.w8i;
import xsna.z6u;

/* compiled from: InteractiveVideoVh.kt */
/* loaded from: classes16.dex */
public final class InteractiveVideoVh extends VideoItemVh implements ent0 {
    public final VideoItemListSettings m;
    public final SearchStatInfoProvider n;
    public final com.vk.catalog2.common.ui.holders.video.info_overlays.a o;
    public LinearLayout p;
    public AspectRatioFrameLayout q;
    public rcx r;

    /* compiled from: InteractiveVideoVh.kt */
    public static final class a implements w8i {
        public final ecx b = ((MovikaComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(MovikaComponent.class))).U4();
    }

    public InteractiveVideoVh(k7a k7aVar, VideoItemListSettings videoItemListSettings, SearchStatInfoProvider searchStatInfoProvider, b5a b5aVar, u4a.a aVar) {
        super(b5aVar, searchStatInfoProvider, fxc0.B(), null, null, null, null, aVar, 120);
        this.m = videoItemListSettings;
        this.n = searchStatInfoProvider;
        this.o = a.C0491a.a(videoItemListSettings, k7aVar, false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        UIBlockVideo uIBlockVideo = uIBlock instanceof UIBlockVideo ? (UIBlockVideo) uIBlock : null;
        if (uIBlockVideo == null) {
            return;
        }
        VideoFile videoFile = uIBlockVideo.B;
        LinearLayout linearLayout = this.p;
        if (linearLayout == null) {
            linearLayout = null;
        }
        VideoItemListSettings videoItemListSettings = this.m;
        bwt0.r0(videoItemListSettings.b() ? -2 : -1, linearLayout);
        AspectRatioFrameLayout aspectRatioFrameLayout = this.q;
        if (aspectRatioFrameLayout == null) {
            aspectRatioFrameLayout = null;
        }
        aspectRatioFrameLayout.setAspectRation(videoItemListSettings.c);
        ViewGroup.LayoutParams layoutParams = aspectRatioFrameLayout.getLayoutParams();
        layoutParams.width = videoItemListSettings.a;
        layoutParams.height = videoItemListSettings.b;
        aspectRatioFrameLayout.setLayoutParams(layoutParams);
        boolean z = videoItemListSettings.b() || videoItemListSettings.e;
        com.vk.catalog2.common.ui.holders.video.info_overlays.a aVar = this.o;
        bwt0.e0(aspectRatioFrameLayout, z ? 0 : iah0.a(aVar.c()), iah0.a(aVar.e()), z ? 0 : iah0.a(aVar.c()), iah0.a(aVar.e()));
        aVar.a(videoFile, null, null);
        rcx rcxVar = this.r;
        if (rcxVar != null) {
            String str = uIBlockVideo.f;
            String r = videoFile.r();
            InteractiveData.From from = InteractiveData.From.CATALOG;
            SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.VIDEO;
            String r2 = videoFile.r();
            if (r2 == null) {
                r2 = "";
            }
            rcxVar.y0(new InteractiveData(videoFile, str, r, from, this.n.b(type, r2, false), (ebs0) null, false, false, 480));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.content);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setForeground(m33.a(R.drawable.highlight, context));
        this.p = linearLayout;
        AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(context, null, 6);
        VideoItemListSettings videoItemListSettings = this.m;
        aspectRatioFrameLayout.setAspectRation(videoItemListSettings.c);
        if (videoItemListSettings.e) {
            aspectRatioFrameLayout.setBackgroundResource(R.drawable.background_borders);
        } else {
            aspectRatioFrameLayout.setBackgroundResource(R.drawable.background_rounded);
            bwt0.d(aspectRatioFrameLayout, this.k, (r4 & 2) != 0, (r4 & 4) != 0);
        }
        this.q = aspectRatioFrameLayout;
        LinearLayout linearLayout2 = this.p;
        if (linearLayout2 == null) {
            linearLayout2 = null;
        }
        linearLayout2.addView(aspectRatioFrameLayout, new ViewGroup.LayoutParams(-1, -2));
        rcx a2 = new a().b.a(context, new tcx.b(1));
        this.r = a2;
        AspectRatioFrameLayout aspectRatioFrameLayout2 = this.q;
        if (aspectRatioFrameLayout2 == null) {
            aspectRatioFrameLayout2 = null;
        }
        aspectRatioFrameLayout2.addView(a2.getView(), new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout3 = this.p;
        LinearLayout linearLayout4 = linearLayout3 == null ? null : linearLayout3;
        AspectRatioFrameLayout aspectRatioFrameLayout3 = this.q;
        this.o.b(layoutInflater, linearLayout4, aspectRatioFrameLayout3 == null ? null : aspectRatioFrameLayout3, this, new z6u(3));
        LinearLayout linearLayout5 = this.p;
        if (linearLayout5 == null) {
            return null;
        }
        return linearLayout5;
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.r;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
