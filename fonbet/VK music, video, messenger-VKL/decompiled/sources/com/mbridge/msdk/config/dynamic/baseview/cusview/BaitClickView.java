package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* loaded from: classes13.dex */
public class BaitClickView extends ComponentRelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;
    private ImageView a;
    private ImageView b;
    private TextView c;
    private String d;
    private String e;
    private String f;
    private int g;
    private int h;
    private int i;
    private Animation j;
    private Animation k;
    private Animation l;
    private Animation m;

    public class a implements com.mbridge.msdk.foundation.same.image.c {
        final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            BaitClickView.this.b.setImageResource(this.a);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap.isRecycled()) {
                return;
            }
            BaitClickView.this.b.setImageBitmap(bitmap);
        }
    }

    public class b implements com.mbridge.msdk.foundation.same.image.c {
        final /* synthetic */ int a;

        public b(int i) {
            this.a = i;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            BaitClickView.this.a.setImageResource(this.a);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap.isRecycled()) {
                return;
            }
            BaitClickView.this.a.setImageBitmap(bitmap);
        }
    }

    public BaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = "";
        this.e = "";
        this.f = "Click now for details";
        this.g = 1;
        this.h = 1342177280;
        this.i = 0;
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.j.setRepeatCount(-1);
        this.j.setRepeatMode(2);
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.startAnimation(this.j);
        }
    }

    private void e() {
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.j.setRepeatCount(1);
        this.j.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.5f, 1, 0.5f, 1, 0.5f);
        this.k = scaleAnimation2;
        scaleAnimation2.setDuration(1000L);
        this.k.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.l = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.l.setRepeatCount(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.k);
        animationSet.addAnimation(this.l);
        this.k.setAnimationListener(new c());
        this.j.setAnimationListener(new d(animationSet));
        ImageView imageView2 = this.a;
        if (imageView2 != null) {
            imageView2.startAnimation(this.j);
        }
    }

    private void getDefaultClickText() {
        try {
            this.f = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
        } catch (Throwable th) {
            q0.b("BaitClickView", th.getMessage());
        }
    }

    public void init(int i) {
        this.g = i;
        init();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.j;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.k;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.l;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.m;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String valueOf = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(valueOf) && valueOf.equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("radius");
            if (obj instanceof String) {
                this.i = Integer.parseInt(obj.toString());
            }
            init();
        } catch (Exception e2) {
            q0.b("BaitClickView", e2.getMessage());
        }
    }

    public void startAnimation() {
        int i = this.g;
        if (i == 2) {
            this.b.setVisibility(4);
            d();
            return;
        }
        if (i == 3) {
            e();
            return;
        }
        if (i == 4) {
            this.b.setVisibility(4);
            a();
        } else if (i != 5) {
            b();
        } else {
            c();
        }
    }

    private void a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.j.setRepeatCount(1);
        this.j.setAnimationListener(new e());
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.startAnimation(this.j);
        }
    }

    private void b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.j.setRepeatCount(-1);
        this.j.setRepeatMode(2);
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.startAnimation(this.j);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.2f, 1, 0.5f, 1, 0.5f);
        this.k = scaleAnimation2;
        scaleAnimation2.setDuration(400L);
        this.k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        this.l = alphaAnimation;
        alphaAnimation.setDuration(400L);
        this.l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.k);
        animationSet.addAnimation(this.l);
        ImageView imageView2 = this.b;
        if (imageView2 != null) {
            imageView2.startAnimation(animationSet);
        }
    }

    private void c() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.m = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.m.setRepeatMode(2);
        this.m.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.2f, 1, 0.5f, 1, 0.5f);
        this.k = scaleAnimation;
        scaleAnimation.setDuration(600L);
        this.k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.l = alphaAnimation;
        alphaAnimation.setDuration(600L);
        this.l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.k);
        animationSet.addAnimation(this.l);
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.startAnimation(this.m);
        }
        ImageView imageView2 = this.b;
        if (imageView2 != null) {
            imageView2.startAnimation(animationSet);
        }
    }

    public void init(int i, int i2) {
        this.h = i;
        this.g = i2;
        init();
    }

    public void init(int i, int i2, String str, String str2, String str3) {
        this.h = i;
        this.g = i2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        init();
    }

    public void init() {
        try {
            if (this.i == 0) {
                setBackgroundColor(this.h);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(this.h);
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(v0.a(getContext(), this.i));
                setBackground(gradientDrawable);
            }
            getDefaultClickText();
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int a2 = v0.a(getContext(), 55.0f);
            int a3 = v0.a(getContext(), 33.0f);
            this.b = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a2, a2);
            layoutParams.setMargins(a3, a3, 0, 0);
            this.b.setLayoutParams(layoutParams);
            int a4 = i0.a(getContext(), "mbridge_icon_click_circle", "drawable");
            if (TextUtils.isEmpty(this.e)) {
                this.b.setImageResource(a4);
            } else {
                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.d, new a(a4));
            }
            int a5 = v0.a(getContext(), 108.0f);
            int a6 = v0.a(getContext(), 35.0f);
            int a7 = v0.a(getContext(), 43.0f);
            this.a = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a5, a5);
            layoutParams2.setMargins(a6, a7, 0, 0);
            this.a.setLayoutParams(layoutParams2);
            int a8 = i0.a(getContext(), "mbridge_icon_click_hand", "drawable");
            if (TextUtils.isEmpty(this.d)) {
                this.a.setImageResource(a8);
            } else {
                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.d, new b(a8));
            }
            relativeLayout.addView(this.b);
            relativeLayout.addView(this.a);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.c = new TextView(getContext());
            this.c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.c.setText(this.f);
            this.c.setTextColor(-1);
            this.c.setGravity(14);
            linearLayout.addView(this.c);
            addView(linearLayout);
        } catch (Throwable th) {
            q0.b("BaitClickView", th.getMessage());
        }
    }

    public class c implements Animation.AnimationListener {
        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (BaitClickView.this.b != null) {
                BaitClickView.this.b.setVisibility(4);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (BaitClickView.this.b != null) {
                BaitClickView.this.b.setVisibility(0);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    public class d implements Animation.AnimationListener {
        final /* synthetic */ AnimationSet a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.b != null) {
                    BaitClickView.this.b.startAnimation(d.this.a);
                }
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.a != null) {
                    BaitClickView.this.a.startAnimation(BaitClickView.this.j);
                }
            }
        }

        public d(AnimationSet animationSet) {
            this.a = animationSet;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            BaitClickView.this.postDelayed(new b(), 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            BaitClickView.this.postDelayed(new a(), 550L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    public class e implements Animation.AnimationListener {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.a != null) {
                    BaitClickView.this.a.startAnimation(BaitClickView.this.j);
                }
            }
        }

        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            BaitClickView.this.postDelayed(new a(), 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
