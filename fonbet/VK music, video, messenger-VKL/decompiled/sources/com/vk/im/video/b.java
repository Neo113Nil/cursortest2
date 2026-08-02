package com.vk.im.video;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.im.ui.views.BlurredFrameLayout;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.im.ui.views.msg.bubble.MsgBubbleView;
import com.vk.im.ui.views.msg.video.AdaptiveTimeAndStatusLayout;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.movika.api.InteractiveData;
import com.vk.movika.api.MovikaComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.abi0;
import xsna.as30;
import xsna.bwt0;
import xsna.cn70;
import xsna.cnt0;
import xsna.dnt0;
import xsna.e3m;
import xsna.ebs0;
import xsna.ecx;
import xsna.fc;
import xsna.fpf0;
import xsna.h4w;
import xsna.hr30;
import xsna.i13;
import xsna.j4w;
import xsna.jr30;
import xsna.jwx;
import xsna.k7m;
import xsna.m7m;
import xsna.mnt0;
import xsna.msy;
import xsna.nik0;
import xsna.rcx;
import xsna.rik0;
import xsna.sh3;
import xsna.tcx;
import xsna.w8i;
import xsna.wcg;
import xsna.wng0;
import xsna.wp10;
import xsna.xfz;
import xsna.xpm0;
import xsna.ylw;

/* compiled from: ImInlineInteractiveVideoVC.kt */
/* loaded from: classes2.dex */
public final class b implements h4w {
    public static final int m = cn70.b(8);
    public static final Object n = msy.a(LazyThreadSafetyMode.NONE, new i13(13));
    public ConstraintLayout b;
    public TextView c;
    public TextView d;
    public View e;
    public TextView f;
    public ImageView g;
    public AdaptiveTimeAndStatusLayout h;
    public BlurredFrameLayout i;
    public final Object j = msy.a(LazyThreadSafetyMode.NONE, new fc(this));
    public rcx k;
    public j4w l;

    /* compiled from: ImInlineInteractiveVideoVC.kt */
    public static final class a implements w8i {
        public final ecx b = ((MovikaComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(MovikaComponent.class))).U4();
    }

    @Override // xsna.xfz.a
    public final void a(xfz.a.C4001a c4001a) {
        int i = c4001a.d;
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(c4001a.b);
        TextView textView2 = this.d;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setTextColor(i);
        TextView textView3 = this.f;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setTextColor(i);
        AdaptiveTimeAndStatusLayout adaptiveTimeAndStatusLayout = this.h;
        if (adaptiveTimeAndStatusLayout == null) {
            adaptiveTimeAndStatusLayout = null;
        }
        adaptiveTimeAndStatusLayout.getTimeAndStatusView().setTimeTextColor(c4001a.a);
        ImageView imageView = this.g;
        (imageView != null ? imageView : null).setImageTintList(ColorStateList.valueOf(c4001a.c));
    }

    @Override // xsna.xfz.a
    public final void b() {
        rcx rcxVar = this.k;
        if (rcxVar != null) {
            rcxVar.b();
        }
    }

    @Override // xsna.xfz.a
    public final void bind(wp10 wp10Var) {
        int a2;
        j4w j4wVar = (j4w) wp10Var;
        this.l = j4wVar;
        VideoFile videoFile = j4wVar.s;
        rcx rcxVar = this.k;
        if (rcxVar != null) {
            rcxVar.y0(new InteractiveData(videoFile, "im", videoFile.r(), InteractiveData.From.MESSENGER, (SearchStatsLoggingInfo) null, (ebs0) null, false, false, 496));
        }
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        textView.setText(j4wVar.n);
        TextView textView2 = this.d;
        if (textView2 == null) {
            textView2 = null;
        }
        int i = j4wVar.p;
        float f = 6;
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) rik0.b(f)).append((CharSequence) "·").append((CharSequence) rik0.b(f));
        ylw ylwVar = new ylw(R.drawable.vk_icon_view_12);
        ylwVar.e = -1.0f;
        ylwVar.d = true;
        ConstraintLayout constraintLayout = this.b;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        SpannableStringBuilder append2 = append.append((CharSequence) ylwVar.b(constraintLayout.getContext())).append((CharSequence) rik0.b(f)).append((CharSequence) xpm0.a(i));
        SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
        textView2.setText(new SpannableString(append2));
        TextView textView3 = this.f;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setText(j4wVar.o);
        ImageView imageView = this.g;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setVisibility(j4wVar.q ? 0 : 8);
        ConstraintLayout constraintLayout2 = this.b;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        int m0 = j4wVar.m0(constraintLayout2.getContext());
        ConstraintLayout constraintLayout3 = this.b;
        if (constraintLayout3 == null) {
            constraintLayout3 = null;
        }
        int c = j4wVar.c(constraintLayout3.getContext());
        BlurredFrameLayout blurredFrameLayout = this.i;
        if (blurredFrameLayout == null) {
            blurredFrameLayout = null;
        }
        blurredFrameLayout.a(m0, c);
        View view = this.e;
        if (view == null) {
            view = null;
        }
        ((wng0) view.getBackground()).c(m0, m0, c, c);
        abi0 abi0Var = j4wVar.B;
        boolean d = abi0Var != null ? abi0Var.d(Integer.valueOf(j4wVar.l)) : false;
        View view2 = this.e;
        if (view2 == null) {
            view2 = null;
        }
        view2.setVisibility(d ? 0 : 8);
        int b = j4wVar.g != 0 ? cn70.b(0) : m;
        TextView textView4 = this.c;
        if (textView4 == null) {
            textView4 = null;
        }
        ViewGroup.LayoutParams layoutParams = textView4.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = b;
        marginLayoutParams.rightMargin = b;
        textView4.setLayoutParams(marginLayoutParams);
        boolean z = j4wVar.f;
        boolean z2 = j4wVar.k;
        ConstraintLayout constraintLayout4 = this.b;
        ConstraintLayout constraintLayout5 = constraintLayout4 == null ? null : constraintLayout4;
        if (z && z2) {
            if (constraintLayout4 == null) {
                constraintLayout4 = null;
            }
            a2 = e3m.a(R.dimen.vkim_video_attach_small_min_width, constraintLayout4.getContext());
        } else {
            if (constraintLayout4 == null) {
                constraintLayout4 = null;
            }
            a2 = e3m.a(R.dimen.vkim_video_attach_large_min_width, constraintLayout4.getContext());
        }
        constraintLayout5.setMinWidth(a2);
        StringBuilder sb = hr30.b;
        jr30 jr30Var = j4wVar.m;
        AdaptiveTimeAndStatusLayout adaptiveTimeAndStatusLayout = this.h;
        TimeAndStatusView timeAndStatusView = (adaptiveTimeAndStatusLayout != null ? adaptiveTimeAndStatusLayout : null).getTimeAndStatusView();
        timeAndStatusView.setGradientBubble(jr30Var.g);
        hr30.a.b(timeAndStatusView, jr30Var, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xfz.a
    public final dnt0 getPresenter() {
        rcx rcxVar = this.k;
        return rcxVar != null ? rcxVar : (C1185b) this.j.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xfz.a
    public final View i(MsgBubbleView msgBubbleView, as30.a aVar) {
        ConstraintLayout constraintLayout = (ConstraintLayout) bwt0.I(R.layout.vkim_msg_part_interactive_video, msgBubbleView, false);
        this.b = constraintLayout;
        this.c = (TextView) constraintLayout.findViewById(R.id.title);
        ConstraintLayout constraintLayout2 = this.b;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        this.d = (TextView) constraintLayout2.findViewById(R.id.subtitle);
        ConstraintLayout constraintLayout3 = this.b;
        if (constraintLayout3 == null) {
            constraintLayout3 = null;
        }
        View findViewById = constraintLayout3.findViewById(R.id.selection_mask);
        wng0 wng0Var = new wng0();
        Context context = findViewById.getContext();
        e3m.a aVar2 = e3m.a;
        wng0Var.b(context.getColor(R.color.vkim_msg_part_selection_mask));
        findViewById.setBackground(wng0Var);
        this.e = findViewById;
        ConstraintLayout constraintLayout4 = this.b;
        if (constraintLayout4 == null) {
            constraintLayout4 = null;
        }
        this.f = (TextView) constraintLayout4.findViewById(R.id.owner);
        ConstraintLayout constraintLayout5 = this.b;
        if (constraintLayout5 == null) {
            constraintLayout5 = null;
        }
        this.g = (ImageView) constraintLayout5.findViewById(R.id.verification_icon);
        ConstraintLayout constraintLayout6 = this.b;
        if (constraintLayout6 == null) {
            constraintLayout6 = null;
        }
        this.h = (AdaptiveTimeAndStatusLayout) constraintLayout6.findViewById(R.id.subtitle_wrapper);
        ConstraintLayout constraintLayout7 = this.b;
        if (constraintLayout7 == null) {
            constraintLayout7 = null;
        }
        BlurredFrameLayout blurredFrameLayout = (BlurredFrameLayout) constraintLayout7.findViewById(R.id.video_wrapper);
        blurredFrameLayout.setBlurPostprocessor((jwx) n.getValue());
        this.i = blurredFrameLayout;
        a aVar3 = new a();
        ConstraintLayout constraintLayout8 = this.b;
        if (constraintLayout8 == null) {
            constraintLayout8 = null;
        }
        rcx a2 = aVar3.b.a(constraintLayout8.getContext(), new tcx.b(true, false));
        this.k = a2;
        BlurredFrameLayout blurredFrameLayout2 = this.i;
        if (blurredFrameLayout2 == null) {
            blurredFrameLayout2 = null;
        }
        blurredFrameLayout2.addView(a2.getView(), new FrameLayout.LayoutParams(-1, -1, 17));
        ConstraintLayout constraintLayout9 = this.b;
        if (constraintLayout9 == null) {
            constraintLayout9 = null;
        }
        bwt0.i0(constraintLayout9, new sh3(18, this, aVar));
        ConstraintLayout constraintLayout10 = this.b;
        if (constraintLayout10 == null) {
            constraintLayout10 = null;
        }
        bwt0.k0(constraintLayout10, new wcg(aVar, 26));
        ConstraintLayout constraintLayout11 = this.b;
        if (constraintLayout11 == null) {
            return null;
        }
        return constraintLayout11;
    }

    @Override // xsna.h4w
    public final boolean isActive() {
        return false;
    }

    @Override // xsna.h4w
    public final Collection<Integer> v(String str) {
        return EmptyList.b;
    }

    /* compiled from: ImInlineInteractiveVideoVC.kt */
    /* renamed from: com.vk.im.video.b$b, reason: collision with other inner class name */
    public final class C1185b implements mnt0 {
        public boolean b;
        public final com.vk.libvideo.autoplay.a c = com.vk.libvideo.autoplay.a.t;

        @Override // xsna.dnt0
        public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
            return null;
        }

        @Override // xsna.mnt0
        public final com.vk.libvideo.autoplay.a getVideoConfig() {
            return this.c;
        }

        @Override // xsna.dnt0
        public final boolean getVideoFocused() {
            return this.b;
        }

        @Override // xsna.mnt0
        /* renamed from: getVideoView */
        public final VideoTextureView mo407getVideoView() {
            return null;
        }

        @Override // xsna.dnt0
        public final void setVideoFocused(boolean z) {
            this.b = z;
        }

        @Override // xsna.mnt0
        public final void G2(View view) {
        }

        @Override // xsna.mnt0
        public final void setFocusController(cnt0 cnt0Var) {
        }

        @Override // xsna.mnt0
        public final void w0(View view) {
        }
    }

    @Override // xsna.g34.a
    public final void c(int i) {
    }

    @Override // xsna.g34.a
    public final void f(int i) {
    }

    @Override // xsna.xfz.a
    public final void g(ArrayList arrayList) {
    }

    @Override // xsna.g34.a
    public final void e(int i, int i2, int i3) {
    }
}
