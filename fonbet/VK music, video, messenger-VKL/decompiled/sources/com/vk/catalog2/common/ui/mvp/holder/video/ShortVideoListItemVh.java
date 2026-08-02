package com.vk.catalog2.common.ui.mvp.holder.video;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.core.view.VideoRestrictionView;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.author.VideoPinType;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.Locale;
import xsna.awt0;
import xsna.b5a;
import xsna.bpn0;
import xsna.cfp0;
import xsna.f4m;
import xsna.fxc0;
import xsna.g7s0;
import xsna.gpt0;
import xsna.hny;
import xsna.ine;
import xsna.jjc;
import xsna.m33;
import xsna.ols0;
import xsna.pvo0;
import xsna.q01;
import xsna.qwe;
import xsna.xlc;
import xsna.ye80;
import xsna.z8s;

/* compiled from: ShortVideoListItemVh.kt */
/* loaded from: classes16.dex */
public final class ShortVideoListItemVh extends VideoItemVh {
    public final bpn0 A;
    public final qwe m;
    public final xlc n;
    public final ine o;
    public TextView p;
    public VKImageView q;
    public View r;
    public View s;
    public ImageView t;
    public ImageView u;
    public View v;
    public View w;
    public TextView x;
    public View y;
    public hny z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ShortVideoListItemVh(b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, qwe qweVar, xlc xlcVar, ine ineVar) {
        super(b5aVar, searchStatInfoProvider, r3, null, null, null, null, null, 248);
        g7s0 B = fxc0.B();
        this.m = qweVar;
        this.n = xlcVar;
        this.o = ineVar;
        this.A = new bpn0(new ye80(B, 16));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        UIBlockVideo uIBlockVideo = uIBlock instanceof UIBlockVideo ? (UIBlockVideo) uIBlock : null;
        if (uIBlockVideo == null) {
            return;
        }
        VideoFile videoFile = uIBlockVideo.B;
        boolean z = ols0.a(videoFile) || videoFile.Z1();
        VKImageView vKImageView = this.q;
        if (vKImageView == null) {
            vKImageView = null;
        }
        if (!videoFile.Z9() || fxc0.B().c(videoFile)) {
            VKImageView vKImageView2 = this.q;
            if (vKImageView2 == null) {
                vKImageView2 = null;
            }
            vKImageView.setPlaceholderImage(m33.a(R.drawable.default_placeholder, vKImageView2.getContext()));
            VKImageView vKImageView3 = this.q;
            if (vKImageView3 == null) {
                vKImageView3 = null;
            }
            vKImageView.F0(m33.a(R.drawable.default_placeholder, vKImageView3.getContext()), ImageView.ScaleType.FIT_XY);
            ImageSize Cb = videoFile.getImage().Cb(ImageScreenSize.BIG.h(), true, false);
            vKImageView.load(Cb != null ? Cb.d.d : null);
        } else {
            vKImageView.clear();
            hny hnyVar = this.z;
            if (hnyVar == null) {
                hnyVar = null;
            }
            vKImageView.setPlaceholderImage(hnyVar);
        }
        TextView textView = this.p;
        if (textView == null) {
            textView = null;
        }
        gpt0 gpt0Var = gpt0.a;
        VKImageView vKImageView4 = this.q;
        if (vKImageView4 == null) {
            vKImageView4 = null;
        }
        textView.setText(z8s.e(videoFile.L8(), vKImageView4.getContext()));
        ImageView imageView = this.t;
        if (imageView == null) {
            imageView = null;
        }
        awt0.v(imageView, this.m.d(videoFile));
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIPS_PIN_ACTION;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            ImageView imageView2 = this.u;
            if (imageView2 == null) {
                imageView2 = null;
            }
            awt0.v(imageView2, ((UIBlockVideo) uIBlock).E == VideoPinType.CLIP);
        } else {
            ImageView imageView3 = this.u;
            if (imageView3 == null) {
                imageView3 = null;
            }
            f4m.j(imageView3);
        }
        View view = this.v;
        if (view == null) {
            view = null;
        }
        awt0.v(view, z || ((Boolean) this.A.getValue()).booleanValue());
        View view2 = this.s;
        if (view2 == null) {
            view2 = null;
        }
        awt0.v(view2, z);
        View view3 = this.r;
        if (view3 == null) {
            view3 = null;
        }
        boolean z2 = !z;
        awt0.v(view3, z2);
        TextView textView2 = this.p;
        if (textView2 == null) {
            textView2 = null;
        }
        awt0.v(textView2, z2);
        View view4 = this.w;
        if (view4 == null) {
            view4 = null;
        }
        awt0.v(view4, ols0.a(videoFile));
        if (ols0.a(videoFile)) {
            TextView textView3 = this.x;
            if (textView3 == null) {
                textView3 = null;
            }
            String i = pvo0.i(false, videoFile.k1(), false, true);
            if (i.length() > 0) {
                i = ((Object) String.valueOf(i.charAt(0)).toUpperCase(Locale.ROOT)) + i.substring(1);
            }
            textView3.setText(i);
        }
        View view5 = this.y;
        awt0.v(view5 != null ? view5 : null, videoFile.Z1());
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog2_short_video_list_item, viewGroup, false);
        bpn0 bpn0Var = jjc.a;
        inflate.setOnClickListener(new q01(this, 2));
        this.q = (VKImageView) inflate.findViewById(R.id.preview);
        this.r = inflate.findViewById(R.id.shadow);
        this.s = inflate.findViewById(R.id.overlay_background);
        this.p = (TextView) inflate.findViewById(R.id.title);
        this.t = (ImageView) inflate.findViewById(R.id.lock_icon);
        this.u = (ImageView) inflate.findViewById(R.id.pin_icon);
        View findViewById = inflate.findViewById(R.id.more_btn);
        this.v = findViewById;
        findViewById.setOnClickListener(new q01(this, 2));
        this.w = inflate.findViewById(R.id.postponed_block);
        this.x = (TextView) inflate.findViewById(R.id.postponed_text);
        this.y = inflate.findViewById(R.id.draft_block);
        int i = VideoRestrictionView.d;
        this.z = VideoRestrictionView.a.a(0, inflate.getContext());
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh, android.view.View.OnClickListener
    public final void onClick(View view) {
        ine ineVar;
        if (view.getId() == R.id.more_btn && (ineVar = this.o) != null) {
            ineVar.w(view, this.j, this.n);
            return;
        }
        UIBlockVideo uIBlockVideo = this.j;
        if (uIBlockVideo != null) {
            this.b.a(new cfp0(uIBlockVideo, null));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
