package com.vk.catalog2.common.ui.mvp.holder.video;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.core.view.VideoRestrictionView;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.donut.design.view.badge.DonutBadge;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoScreenSource;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.author.VideoPinType;
import com.vk.libvideo.design.view.buttons.EpisodeButton;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.info.VideoInfoTextView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.a5o;
import xsna.avj0;
import xsna.azn;
import xsna.b5a;
import xsna.bwt0;
import xsna.c98;
import xsna.cpu;
import xsna.cqr0;
import xsna.cqs0;
import xsna.e43;
import xsna.e5o;
import xsna.eqs0;
import xsna.f4m;
import xsna.fl4;
import xsna.fqs0;
import xsna.fxc0;
import xsna.g620;
import xsna.g7s0;
import xsna.gpt0;
import xsna.gs00;
import xsna.gzs;
import xsna.k1l;
import xsna.k5o;
import xsna.ksq0;
import xsna.l5o;
import xsna.lyd;
import xsna.m33;
import xsna.m8s0;
import xsna.msy;
import xsna.nkt0;
import xsna.o0r0;
import xsna.pkd;
import xsna.s3q0;
import xsna.s490;
import xsna.uho0;
import xsna.x4o;
import xsna.xg5;
import xsna.xwk;
import xsna.y1o;
import xsna.zps0;
import xsna.zyn;

/* compiled from: VideoItemListTabletVh.kt */
/* loaded from: classes16.dex */
public final class VideoItemListTabletVh extends VideoItemVh {
    public final cqs0 A;
    public final m8s0 B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final gs00 G;
    public final g7s0 m;
    public final boolean n;
    public View o;
    public VKImageView p;
    public DurationView q;
    public InteractiveDurationView r;
    public ImageView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public EpisodeButton x;
    public DonutBadge y;
    public LinearLayout z;

    /* compiled from: ViewExt.kt */
    public static final class a implements gzs<s3q0> {
        public final /* synthetic */ TextView b;
        public final /* synthetic */ Ref$IntRef c;
        public final /* synthetic */ Ref$IntRef d;
        public final /* synthetic */ TextView e;

        public a(TextView textView, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, VideoItemListTabletVh videoItemListTabletVh, TextView textView2) {
            this.b = textView;
            this.c = ref$IntRef;
            this.d = ref$IntRef2;
            this.e = textView2;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            int i;
            TextView textView = this.b;
            int measuredWidth = textView.getMeasuredWidth();
            int measuredHeight = textView.getMeasuredHeight();
            Ref$IntRef ref$IntRef = this.c;
            int i2 = ref$IntRef.element;
            Ref$IntRef ref$IntRef2 = this.d;
            if (i2 != measuredWidth || ref$IntRef2.element != measuredHeight) {
                ref$IntRef.element = measuredWidth;
                ref$IntRef2.element = measuredHeight;
                TextView textView2 = this.e;
                int measuredHeight2 = textView2.getMeasuredHeight();
                Integer valueOf = Integer.valueOf(measuredHeight2);
                if (measuredHeight2 <= 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    Layout layout = textView2.getLayout();
                    if (layout != null) {
                        i = intValue / layout.getLineBottom(0);
                        if (4 <= i) {
                            i = 4;
                        }
                    } else {
                        i = 2;
                    }
                    textView2.setMaxLines(i);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoItemListTabletVh(b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider) {
        super(b5aVar, searchStatInfoProvider, r3, r4, r5, r6, r7, null, 128);
        fl4 g = lyd.g();
        o0r0 e = xwk.e();
        cpu a2 = xg5.a();
        pkd f = g620.f();
        g7s0 B = fxc0.B();
        this.m = B;
        this.n = true;
        this.A = new cqs0(null, 3);
        this.B = new m8s0();
        cqr0 cqr0Var = new cqr0(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.C = msy.a(lazyThreadSafetyMode, cqr0Var);
        this.D = msy.a(lazyThreadSafetyMode, new uho0(this, 9));
        this.E = msy.a(lazyThreadSafetyMode, new avj0(this, 19));
        this.F = msy.a(lazyThreadSafetyMode, new ksq0(this, 6));
        this.G = new gs00(this, 17);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        VideoFile videoFile;
        CharSequence title;
        CharSequence charSequence;
        CharSequence charSequence2;
        ListBuilder a2;
        azn a3;
        super.N6(uIBlock);
        UIBlockVideo uIBlockVideo = uIBlock instanceof UIBlockVideo ? (UIBlockVideo) uIBlock : null;
        if (uIBlockVideo == null || (videoFile = uIBlockVideo.B) == null) {
            return;
        }
        DonutVideoUiModel a4 = ((l5o) this.D.getValue()).a(nkt0.a(videoFile), DonutVideoCardSource.LARGE_CARD);
        VKImageView vKImageView = this.p;
        if (vKImageView == null) {
            vKImageView = null;
        }
        boolean a5 = e5o.a(videoFile);
        if (!videoFile.Z9() || this.m.c(videoFile) || a5) {
            Drawable a6 = m33.a(R.drawable.default_placeholder_8, vKImageView.getContext());
            vKImageView.setPlaceholderImage(a6);
            vKImageView.F0(a6, ImageView.ScaleType.FIT_XY);
            ImageSize Cb = videoFile.getImage().Cb(ImageScreenSize.BIG.h(), true, false);
            vKImageView.load(Cb != null ? Cb.d.d : null);
        } else {
            vKImageView.clear();
            int i = VideoRestrictionView.d;
            vKImageView.setPlaceholderImage(VideoRestrictionView.a.a((int) this.k, vKImageView.getContext()));
        }
        vKImageView.setContentDescription(gpt0.g(vKImageView.getContext(), videoFile));
        TextView textView = this.t;
        TextView textView2 = textView == null ? null : textView;
        if (videoFile instanceof MusicVideoFile) {
            if (textView == null) {
                textView = null;
            }
            MusicVideoFile musicVideoFile = (MusicVideoFile) videoFile;
            title = s490.d(textView.getContext(), musicVideoFile.l, musicVideoFile.D1, R.attr.vk_ui_text_secondary);
        } else {
            title = videoFile.getTitle();
        }
        textView2.setText(title);
        TextView textView3 = this.u;
        if (textView3 == null) {
            textView3 = null;
        }
        Context context = textView3.getContext();
        cqs0 cqs0Var = this.A;
        CharSequence d = cqs0Var.d(context, videoFile);
        CharSequence e = cqs0.e(context, videoFile);
        String string = context.getString(R.string.live_counters_separator);
        ListBuilder e2 = e43.e();
        e2.add(new eqs0.b(d, e));
        if (cqs0.h(videoFile)) {
            e2.add(new eqs0.c(videoFile.S3()));
        }
        zps0 zps0Var = new zps0(string, e2.g());
        TextView textView4 = this.u;
        if (textView4 == null) {
            textView4 = null;
        }
        VideoInfoTextView videoInfoTextView = textView4 instanceof VideoInfoTextView ? (VideoInfoTextView) textView4 : null;
        if (videoInfoTextView != null) {
            videoInfoTextView.setText(zps0Var);
        }
        if (a4 == null || (a3 = k5o.a(a4)) == null) {
            charSequence = null;
        } else {
            zyn zynVar = (zyn) this.F.getValue();
            View view = this.o;
            if (view == null) {
                view = null;
            }
            charSequence = zynVar.a(a3, view.getContext(), this.G);
        }
        fqs0 fqs0Var = charSequence == null ? null : new fqs0(1, charSequence, null, 4);
        TextView textView5 = this.v;
        if (textView5 == null) {
            textView5 = null;
        }
        Context context2 = textView5.getContext();
        CharSequence g = cqs0Var.g(context2, videoFile);
        gpt0 gpt0Var = gpt0.a;
        String k = gpt0.k(context2, videoFile);
        String string2 = context2.getString(R.string.live_counters_separator);
        List l = e43.l(new eqs0.c(g), new eqs0.c(k));
        if (fqs0Var != null && (a2 = cqs0.a(fqs0Var, l)) != null) {
            l = a2;
        }
        zps0 zps0Var2 = new zps0(string2, l);
        TextView textView6 = this.v;
        if (textView6 == null) {
            textView6 = null;
        }
        VideoInfoTextView videoInfoTextView2 = textView6 instanceof VideoInfoTextView ? (VideoInfoTextView) textView6 : null;
        if (videoInfoTextView2 != null) {
            videoInfoTextView2.setText(zps0Var2);
        }
        TextView textView7 = this.v;
        if (textView7 == null) {
            textView7 = null;
        }
        textView7.setMaxLines((fqs0Var != null ? fqs0Var.b : null) != null ? 2 : 1);
        if (videoFile.q0() || videoFile.z0()) {
            DurationView durationView = this.q;
            if (durationView == null) {
                durationView = null;
            }
            f4m.j(durationView);
            InteractiveDurationView interactiveDurationView = this.r;
            if (interactiveDurationView == null) {
                interactiveDurationView = null;
            }
            f4m.j(interactiveDurationView);
            ImageView imageView = this.s;
            if (imageView == null) {
                imageView = null;
            }
            imageView.setVisibility(0);
        } else if (videoFile.W9()) {
            ImageView imageView2 = this.s;
            if (imageView2 == null) {
                imageView2 = null;
            }
            f4m.j(imageView2);
            DurationView durationView2 = this.q;
            if (durationView2 == null) {
                durationView2 = null;
            }
            f4m.j(durationView2);
            InteractiveDurationView interactiveDurationView2 = this.r;
            if (interactiveDurationView2 == null) {
                interactiveDurationView2 = null;
            }
            interactiveDurationView2.setVisibility(0);
            InteractiveDurationView interactiveDurationView3 = this.r;
            if (interactiveDurationView3 == null) {
                interactiveDurationView3 = null;
            }
            DurationView durationView3 = this.q;
            if (durationView3 == null) {
                durationView3 = null;
            }
            interactiveDurationView3.setDurationText(gpt0.m(durationView3.getContext(), videoFile, true, false));
        } else {
            ImageView imageView3 = this.s;
            if (imageView3 == null) {
                imageView3 = null;
            }
            f4m.j(imageView3);
            InteractiveDurationView interactiveDurationView4 = this.r;
            if (interactiveDurationView4 == null) {
                interactiveDurationView4 = null;
            }
            f4m.j(interactiveDurationView4);
            DurationView durationView4 = this.q;
            if (durationView4 == null) {
                durationView4 = null;
            }
            durationView4.setVisibility(0);
            DurationView durationView5 = this.q;
            DurationView durationView6 = durationView5 == null ? null : durationView5;
            if (durationView5 == null) {
                durationView5 = null;
            }
            durationView6.setText(gpt0.m(durationView5.getContext(), videoFile, true, false));
        }
        if (this.n) {
            TextView textView8 = this.w;
            if (textView8 == null) {
                textView8 = null;
            }
            textView8.setText(videoFile.j1());
            TextView textView9 = this.w;
            if (textView9 == null) {
                textView9 = null;
            }
            textView9.setVisibility(0);
        } else {
            TextView textView10 = this.w;
            if (textView10 == null) {
                textView10 = null;
            }
            f4m.j(textView10);
        }
        UIBlockVideo uIBlockVideo2 = this.j;
        boolean isEmpty = videoFile.Y3().isEmpty();
        if (uIBlockVideo2 == null) {
            uIBlockVideo2 = null;
        }
        boolean z = (uIBlockVideo2 == null || !uIBlockVideo2.C || isEmpty) ? false : true;
        if (z) {
            EpisodeButton episodeButton = this.x;
            if (episodeButton == null) {
                episodeButton = null;
            }
            episodeButton.P4(videoFile);
        }
        EpisodeButton episodeButton2 = this.x;
        if (episodeButton2 == null) {
            episodeButton2 = null;
        }
        episodeButton2.setVisibility(z ? 0 : 8);
        UIBlockVideo uIBlockVideo3 = (UIBlockVideo) uIBlock;
        VideoPinType videoPinType = uIBlockVideo3.E;
        List<String> list = uIBlockVideo3.D;
        boolean z2 = videoPinType == null && !list.isEmpty();
        for (int i2 = 0; i2 < 2; i2++) {
            LinearLayout linearLayout = this.z;
            if (linearLayout == null) {
                linearLayout = null;
            }
            TextView textView11 = (TextView) linearLayout.getChildAt(i2);
            if (!z2 || i2 >= list.size()) {
                textView11.setVisibility(8);
            } else {
                textView11.setText(list.get(i2));
                textView11.setVisibility(0);
            }
        }
        LinearLayout linearLayout2 = this.z;
        if (linearLayout2 == null) {
            linearLayout2 = null;
        }
        linearLayout2.setVisibility(z2 ? 0 : 8);
        DonutVideoUiModel.PreviewBadge previewBadge = a4 != null ? a4.b : null;
        if (previewBadge == null) {
            DonutBadge donutBadge = this.y;
            if (donutBadge != null) {
                f4m.j(donutBadge);
                return;
            }
            return;
        }
        DonutBadge donutBadge2 = this.y;
        if (donutBadge2 != null) {
            donutBadge2.setVisibility(0);
        }
        DonutBadge donutBadge3 = this.y;
        if (donutBadge3 != null) {
            DonutPriceTemplate donutPriceTemplate = previewBadge.c;
            if (donutPriceTemplate != null) {
                View view2 = this.o;
                charSequence2 = y1o.b(donutPriceTemplate, (view2 != null ? view2 : null).getContext());
            } else {
                charSequence2 = previewBadge.b;
            }
            donutBadge3.setText(charSequence2);
        }
        DonutBadge donutBadge4 = this.y;
        if (donutBadge4 != null) {
            donutBadge4.setContentDescription(previewBadge.d);
        }
        DonutBadge donutBadge5 = this.y;
        if (donutBadge5 != null) {
            donutBadge5.setOnClickListener(new k1l(3, this, previewBadge));
        }
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void e(DonutVideoAction donutVideoAction, DonutVideoClickSource donutVideoClickSource) {
        View view = this.o;
        if (view == null) {
            view = null;
        }
        Activity a2 = VideoItemVh.a(view);
        if (donutVideoAction == null || a2 == null) {
            return;
        }
        ((x4o) this.E.getValue()).a(donutVideoAction, a2, new a5o(new a5o.a(DonutVideoScreenSource.VK_VIDEO.h(), donutVideoClickSource.h()), 1));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog2_video_item_list_tablet, viewGroup, false);
        this.o = inflate;
        VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.preview);
        Context context = inflate.getContext();
        this.B.getClass();
        Pair a2 = m8s0.a(context);
        bwt0.m0(((Number) a2.i()).intValue(), ((Number) a2.j()).intValue(), vKImageView);
        this.p = vKImageView;
        this.q = (DurationView) inflate.findViewById(R.id.duration);
        this.r = (InteractiveDurationView) inflate.findViewById(R.id.interactive_duration);
        this.s = (ImageView) inflate.findViewById(R.id.live_badge);
        this.t = (TextView) inflate.findViewById(R.id.title);
        this.u = (TextView) inflate.findViewById(R.id.subtitle_author);
        this.v = (TextView) inflate.findViewById(R.id.subtitle_info);
        TextView textView = (TextView) inflate.findViewById(R.id.description);
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = textView.getMeasuredWidth();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = textView.getMeasuredHeight();
        f4m.a(textView, new a(textView, ref$IntRef, ref$IntRef2, this, textView));
        this.w = textView;
        ((ImageView) inflate.findViewById(R.id.menu)).setOnClickListener(new c98(this, 1));
        this.x = (EpisodeButton) inflate.findViewById(R.id.episodes);
        this.y = (DonutBadge) inflate.findViewById(R.id.donut_price_badge);
        VkContentBadge vkContentBadge = (VkContentBadge) inflate.findViewById(R.id.pinned_badge);
        if (vkContentBadge != null) {
            vkContentBadge.setSize(VkContentBadge.Size.Medium);
            vkContentBadge.setAppearance(VkContentBadge.Appearance.Design.Overlay);
            vkContentBadge.setMode(VkContentBadge.Mode.Primary);
            f4m.j(vkContentBadge);
        }
        inflate.setOnClickListener(new c98(this, 1));
        EpisodeButton episodeButton = this.x;
        if (episodeButton == null) {
            episodeButton = null;
        }
        episodeButton.setOnClickListener(new c98(this, 1));
        ConstraintLayout constraintLayout = inflate instanceof ConstraintLayout ? (ConstraintLayout) inflate : null;
        if (constraintLayout != null) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
            LinearLayout linearLayout = new LinearLayout(constraintLayout2.getContext());
            linearLayout.setOrientation(0);
            this.z = linearLayout;
            int dimension = (int) linearLayout.getContext().getResources().getDimension(R.dimen.video_catalog_snippet_margin_between_marks);
            int i = 0;
            while (i < 2) {
                LayoutInflater from = LayoutInflater.from(linearLayout.getContext());
                LinearLayout linearLayout2 = this.z;
                if (linearLayout2 == null) {
                    linearLayout2 = null;
                }
                TextView textView2 = (TextView) from.inflate(R.layout.catalog_vk_video_snippet_mark, (ViewGroup) linearLayout2, false);
                textView2.setTextAppearance(R.style.VkUiTypography_Caption1);
                textView2.setVisibility(8);
                LinearLayout linearLayout3 = this.z;
                if (linearLayout3 == null) {
                    linearLayout3 = null;
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, 0, i == 1 ? 0 : dimension, 0);
                s3q0 s3q0Var = s3q0.a;
                linearLayout3.addView(textView2, layoutParams);
                i++;
            }
            ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
            bVar.i = 0;
            bVar.t = 0;
            int dimension2 = (int) constraintLayout2.getResources().getDimension(R.dimen.video_catalog_snippet_inset);
            bVar.setMargins(dimension2, dimension2, dimension2, dimension2);
            s3q0 s3q0Var2 = s3q0.a;
            constraintLayout.addView(linearLayout, bVar);
        }
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
