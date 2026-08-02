package com.vk.attachpicker.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.appfeature.attachpicker.R$styleable;
import com.vkontakte.android.R;
import xsna.e43;
import xsna.iah0;
import xsna.ilq;
import xsna.izt0;
import xsna.l8g;
import xsna.qq2;
import xsna.skd;

/* loaded from: classes15.dex */
public class ColorSelectorView extends ViewPager {
    public static final int f = iah0.v();
    public final boolean b;
    public final int c;
    public final int d;
    public int e;

    public static class a extends View {
        public static final int j = iah0.a(16);
        public static final int k = iah0.a(6);
        public static final int l;
        public static final int m;
        public static final Paint n;
        public static final Paint o;
        public static final Paint p;
        public static final C0395a q;
        public static final b r;
        public static final c s;
        public final Paint b;
        public final boolean c;
        public boolean d;
        public int e;
        public AnimatorSet f;
        public float g;
        public float h;
        public float i;

        /* renamed from: com.vk.attachpicker.widget.ColorSelectorView$a$a, reason: collision with other inner class name */
        public class C0395a extends Property<a, Float> {
            @Override // android.util.Property
            public final Float get(a aVar) {
                return Float.valueOf(aVar.getMainCircleScale());
            }

            @Override // android.util.Property
            public final void set(a aVar, Float f) {
                aVar.setMainCircleScale(f.floatValue());
            }
        }

        public class b extends Property<a, Float> {
            @Override // android.util.Property
            public final Float get(a aVar) {
                return Float.valueOf(aVar.getSelectedCenterCircleScale());
            }

            @Override // android.util.Property
            public final void set(a aVar, Float f) {
                aVar.setSelectedCenterCircleScale(f.floatValue());
            }
        }

        public class c extends Property<a, Float> {
            @Override // android.util.Property
            public final Float get(a aVar) {
                return Float.valueOf(aVar.getSelectedCenterCircleAlpha());
            }

            @Override // android.util.Property
            public final void set(a aVar, Float f) {
                aVar.setSelectedCenterCircleAlpha(f.floatValue());
            }
        }

        static {
            int a = iah0.a(2.5f);
            l = a;
            int a2 = iah0.a(2.5f);
            m = a2;
            Paint paint = new Paint(1);
            Paint paint2 = new Paint(1);
            n = paint2;
            Paint paint3 = new Paint(1);
            o = paint3;
            Paint paint4 = new Paint(1);
            p = paint4;
            q = new C0395a(Float.class, "mainCircleScale");
            r = new b(Float.class, "selectedCenterCircleScale");
            s = new c(Float.class, "selectedCenterCircleAlpha");
            paint2.setColor(-2104602);
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            paint2.setStrokeWidth(a2);
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            paint.setColor(context.getColor(R.color.picker_blue));
            paint.setStyle(style);
            float f = a;
            paint.setStrokeWidth(f);
            paint3.setColor(-1);
            paint3.setStyle(style);
            paint3.setStrokeWidth(f);
            paint4.setColor(-1);
            paint4.setStyle(Paint.Style.FILL);
        }

        public a(int i, Context context, boolean z) {
            super(context);
            Paint paint = new Paint(1);
            this.b = paint;
            this.e = i;
            this.c = z;
            paint.setColor(i);
            paint.setStyle(Paint.Style.FILL);
            this.d = false;
            this.g = 0.75f;
            this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            setContentDescription(context.getString(R.string.story_accessibility_color));
        }

        public final void a(boolean z, boolean z2) {
            if (this.d == z) {
                return;
            }
            this.d = z;
            AnimatorSet animatorSet = this.f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            if (!z2) {
                boolean z3 = this.d;
                this.g = z3 ? 1.0f : 0.75f;
                this.h = z3 ? 1.0f : 0.0f;
                this.i = z3 ? 1.0f : 0.0f;
                invalidate();
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f = animatorSet2;
            boolean z4 = this.d;
            c cVar = s;
            b bVar = r;
            C0395a c0395a = q;
            if (z4) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, c0395a, 1.0f);
                qq2.g(ofFloat, 2.5f);
                Animator duration = ofFloat.setDuration(300L);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, bVar, 1.0f);
                qq2.g(ofFloat2, 2.5f);
                Animator duration2 = ofFloat2.setDuration(300L);
                ObjectAnimator duration3 = ObjectAnimator.ofFloat(this, cVar, 1.0f).setDuration(150L);
                duration3.setInterpolator(qq2.f);
                animatorSet2.playTogether(duration, duration2, duration3);
            } else {
                ObjectAnimator duration4 = ObjectAnimator.ofFloat(this, c0395a, 0.75f).setDuration(300L);
                ilq ilqVar = qq2.e;
                duration4.setInterpolator(ilqVar);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, bVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ofFloat3.setInterpolator(ilqVar);
                Animator duration5 = ofFloat3.setDuration(300L);
                ObjectAnimator duration6 = ObjectAnimator.ofFloat(this, cVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(150L);
                duration6.setInterpolator(ilqVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat4.setDuration(120);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playSequentially(ofFloat4, duration6);
                animatorSet2.playTogether(duration4, duration5, animatorSet3);
            }
            this.f.start();
        }

        public float getMainCircleScale() {
            return this.g;
        }

        public float getSelectedCenterCircleAlpha() {
            return this.i;
        }

        public float getSelectedCenterCircleScale() {
            return this.h;
        }

        @Override // android.view.View
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int width = getWidth() / 2;
            int height = getHeight() / 2;
            float f = j * this.g;
            float f2 = width;
            float f3 = height;
            canvas.drawCircle(f2, f3, f - 1.0f, this.b);
            boolean z = this.c;
            Paint paint = n;
            if (z) {
                float f4 = f - (l / 2.0f);
                canvas.drawCircle(f2, f3, f4, o);
                if (this.e == -1 && !this.d) {
                    canvas.drawCircle(f2, f3, f4, paint);
                }
            } else if (this.e == -1) {
                canvas.drawCircle(f2, f3, f - m, paint);
            }
            int i = l8g.e(this.e) >= 0.75f ? -16777216 : -1;
            Paint paint2 = p;
            paint2.setColor(i);
            paint2.setAlpha((int) (this.i * 255.0f));
            canvas.drawCircle(f2, f3, k * this.h, paint2);
        }

        public void setColor(int i) {
            this.e = i;
            this.b.setColor(i);
            invalidate();
        }

        public void setMainCircleScale(float f) {
            this.g = f;
            invalidate();
        }

        public void setSelectedCenterCircleAlpha(float f) {
            this.i = f;
            invalidate();
        }

        public void setSelectedCenterCircleScale(float f) {
            this.h = f;
            invalidate();
        }
    }

    public class b extends izt0 {

        public class a implements View.OnClickListener {
            public final /* synthetic */ int b;
            public final /* synthetic */ a c;

            public a(int i, a aVar) {
                this.b = i;
                this.c = aVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar = b.this;
                ColorSelectorView.this.e = this.b;
                for (int i = 0; i < ColorSelectorView.this.getChildCount(); i++) {
                    LinearLayout linearLayout = (LinearLayout) ColorSelectorView.this.getChildAt(i);
                    for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
                        a aVar = (a) linearLayout.getChildAt(i2);
                        aVar.a(aVar == this.c, true);
                    }
                }
            }
        }

        public b() {
        }

        @Override // xsna.izt0
        public final View b(int i, ViewPager viewPager) {
            ColorSelectorView colorSelectorView = ColorSelectorView.this;
            LinearLayout linearLayout = new LinearLayout(colorSelectorView.getContext());
            linearLayout.setOrientation(0);
            float f = 8;
            linearLayout.setPadding(iah0.a(f) + colorSelectorView.c, 0, iah0.a(f) + colorSelectorView.d, 0);
            int i2 = i * 8;
            for (int i3 = i2; i3 < i2 + 8; i3++) {
                int i4 = skd.c[i3];
                a aVar = new a(i4, colorSelectorView.getContext(), colorSelectorView.b);
                aVar.a(i4 == colorSelectorView.e, false);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
                layoutParams.weight = 1.0f;
                layoutParams.gravity = 16;
                linearLayout.addView(aVar, layoutParams);
                aVar.setOnClickListener(new a(i4, aVar));
            }
            return linearLayout;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return 3;
        }
    }

    public ColorSelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = skd.c[0];
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        this.b = obtainStyledAttributes.getBoolean(2, true);
        this.c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        setOffscreenPageLimit(5);
        setAdapter(new b());
    }

    public int getSelectedColor() {
        return this.e;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = f;
        if (size > i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setSelectedColor(int i) {
        this.e = i;
        int i2 = 0;
        while (true) {
            int[] iArr = skd.c;
            if (i2 >= 24) {
                i2 = -1;
                break;
            } else if (iArr[i2] == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            setCurrentItem(i2 / 8);
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            LinearLayout linearLayout = (LinearLayout) getChildAt(i3);
            for (int i4 = 0; i4 < linearLayout.getChildCount(); i4++) {
                ((a) linearLayout.getChildAt(i4)).a(i2 == (i3 * 8) + i4, true);
            }
        }
    }
}
