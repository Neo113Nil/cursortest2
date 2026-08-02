package com.vk.clips.design.view.sidecontrols;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.clips.design.view.sidecontrols.a;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;
import xsna.f4m;
import xsna.hgd;
import xsna.hge;
import xsna.hjc;
import xsna.iah0;
import xsna.ktm0;
import xsna.xr8;

/* compiled from: ControlsLayout.kt */
/* loaded from: classes16.dex */
public final class b {
    public final LinearLayout a;

    /* compiled from: ControlsLayout.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public b(LinearLayout linearLayout) {
        this.a = linearLayout;
    }

    public final <T> xr8<T> a(com.vk.clips.design.view.sidecontrols.a<T> aVar, hjc hjcVar, ClipFeedSideControlsStatic clipFeedSideControlsStatic) {
        a i = clipFeedSideControlsStatic.i();
        LinearLayout linearLayout = this.a;
        String string = linearLayout.getContext().getString(clipFeedSideControlsStatic.h());
        int i2 = i.c;
        int i3 = i.a;
        int i4 = i.b;
        if (aVar instanceof a.InterfaceC0576a) {
            LottieAnimationView lottieAnimationView = new LottieAnimationView(linearLayout.getContext());
            lottieAnimationView.setId(i4);
            ktm0.c(lottieAnimationView);
            lottieAnimationView.setRepeatCount(0);
            lottieAnimationView.setContentDescription(string);
            b(lottieAnimationView);
            return ((a.InterfaceC0576a) aVar).a(new hgd(linearLayout.findViewById(i4), (LottieAnimationView) linearLayout.findViewById(i4), null), hjcVar);
        }
        if (aVar instanceof a.b) {
            Context context = linearLayout.getContext();
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(i3);
            ktm0.a(frameLayout);
            LottieAnimationView lottieAnimationView2 = new LottieAnimationView(context);
            lottieAnimationView2.setId(i4);
            int a2 = e3m.a(R.dimen.clips_controls_icon_size, lottieAnimationView2.getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
            layoutParams.gravity = 0;
            lottieAnimationView2.setLayoutParams(layoutParams);
            lottieAnimationView2.setRepeatCount(0);
            lottieAnimationView2.setContentDescription(string);
            TextView textView = new TextView(context);
            textView.setId(i2);
            ktm0.b(textView);
            frameLayout.addView(lottieAnimationView2);
            frameLayout.addView(textView);
            b(frameLayout);
            return ((a.b) aVar).a(new hgd(frameLayout.findViewById(i3), (LottieAnimationView) frameLayout.findViewById(i4), (TextView) frameLayout.findViewById(i2)), hjcVar);
        }
        if (aVar instanceof a.c) {
            ImageView imageView = new ImageView(linearLayout.getContext());
            imageView.setId(i4);
            ktm0.c(imageView);
            imageView.setContentDescription(string);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            b(imageView);
            return ((a.c) aVar).b(new hge(imageView.findViewById(i4), (ImageView) imageView.findViewById(i4), null), hjcVar);
        }
        if (!(aVar instanceof a.d)) {
            throw new NoWhenBranchMatchedException();
        }
        Context context2 = linearLayout.getContext();
        FrameLayout frameLayout2 = new FrameLayout(context2);
        frameLayout2.setId(i3);
        ktm0.a(frameLayout2);
        View imageView2 = new ImageView(context2);
        imageView2.setId(i4);
        int a3 = e3m.a(R.dimen.clips_controls_icon_size, imageView2.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a3, a3);
        layoutParams2.gravity = 0;
        imageView2.setLayoutParams(layoutParams2);
        imageView2.setContentDescription(string);
        TextView textView2 = new TextView(context2);
        textView2.setId(i2);
        ktm0.b(textView2);
        frameLayout2.addView(imageView2);
        frameLayout2.addView(textView2);
        b(frameLayout2);
        return ((a.d) aVar).b(new hge(frameLayout2.findViewById(i3), (ImageView) frameLayout2.findViewById(i4), (TextView) frameLayout2.findViewById(i2)), hjcVar);
    }

    public final void b(View view) {
        if (view == null) {
            return;
        }
        this.a.addView(view);
    }

    public final void c(View view) {
        this.a.addView(view);
        float f = 8;
        f4m.u(view, iah0.a(f), iah0.a(10), iah0.a(f), iah0.a(4));
    }
}
