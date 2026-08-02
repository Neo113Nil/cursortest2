package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;
import com.google.android.material.carousel.b;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import xsna.av9;
import xsna.c440;
import xsna.ek3;
import xsna.hu9;
import xsna.lhg;
import xsna.lv9;
import xsna.n8g;
import xsna.obr;
import xsna.rq2;
import xsna.ug10;
import xsna.xu9;
import xsna.xwk;
import xsna.xy9;
import xsna.yq;
import xsna.yu9;
import xsna.zu9;

/* loaded from: classes13.dex */
public class CarouselLayoutManager extends RecyclerView.o implements hu9, RecyclerView.z.b {
    public int b;
    public int c;
    public int d;
    public final c e;

    @NonNull
    public final c440 f;

    @Nullable
    public com.google.android.material.carousel.c g;

    @Nullable
    public com.google.android.material.carousel.b h;
    public int i;

    @Nullable
    public HashMap j;
    public av9 k;
    public final View.OnLayoutChangeListener l;
    public int m;
    public int n;
    public final int o;

    public class a extends v {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.v
        public final int calculateDxToMakeVisible(View view, int i) {
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            if (carouselLayoutManager.g == null || !carouselLayoutManager.isHorizontal()) {
                return 0;
            }
            int position = carouselLayoutManager.getPosition(view);
            return (int) (carouselLayoutManager.b - carouselLayoutManager.x(position, carouselLayoutManager.w(position)));
        }

        @Override // androidx.recyclerview.widget.v
        public final int calculateDyToMakeVisible(View view, int i) {
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            if (carouselLayoutManager.g == null || carouselLayoutManager.isHorizontal()) {
                return 0;
            }
            int position = carouselLayoutManager.getPosition(view);
            return (int) (carouselLayoutManager.b - carouselLayoutManager.x(position, carouselLayoutManager.w(position)));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.z
        @Nullable
        public final PointF computeScrollVectorForPosition(int i) {
            return CarouselLayoutManager.this.computeScrollVectorForPosition(i);
        }
    }

    public static final class b {
        public final View a;
        public final float b;
        public final float c;
        public final d d;

        public b(View view, float f, float f2, d dVar) {
            this.a = view;
            this.b = f;
            this.c = f2;
            this.d = dVar;
        }
    }

    public static class c extends RecyclerView.n {
        public final Paint b;
        public List<b.C0118b> c;

        public c() {
            Paint paint = new Paint();
            this.b = paint;
            this.c = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.a0 a0Var) {
            Canvas canvas2;
            super.onDrawOver(canvas, recyclerView, a0Var);
            float dimension = recyclerView.getResources().getDimension(R$dimen.m3_carousel_debug_keyline_width);
            Paint paint = this.b;
            paint.setStrokeWidth(dimension);
            for (b.C0118b c0118b : this.c) {
                paint.setColor(n8g.d(c0118b.c, -65281, -16776961));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).isHorizontal()) {
                    canvas2 = canvas;
                    canvas2.drawLine(c0118b.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).k.i(), c0118b.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).k.d(), paint);
                } else {
                    float f = ((CarouselLayoutManager) recyclerView.getLayoutManager()).k.f();
                    float f2 = c0118b.b;
                    float g = ((CarouselLayoutManager) recyclerView.getLayoutManager()).k.g();
                    float f3 = c0118b.b;
                    canvas2 = canvas;
                    canvas2.drawLine(f, f2, g, f3, paint);
                }
                canvas = canvas2;
            }
        }
    }

    public static class d {
        public final b.C0118b a;
        public final b.C0118b b;

        public d(b.C0118b c0118b, b.C0118b c0118b2) {
            obr.b(c0118b.a <= c0118b2.a);
            this.a = c0118b;
            this.b = c0118b2;
        }
    }

    public CarouselLayoutManager() {
        c440 c440Var = new c440();
        this.e = new c();
        this.i = 0;
        this.l = new xu9(this, 0);
        this.n = -1;
        this.o = 0;
        this.f = c440Var;
        F();
        setOrientation(0);
    }

    public static d z(List<b.C0118b> list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            b.C0118b c0118b = list.get(i5);
            float f6 = z ? c0118b.b : c0118b.a;
            float abs = Math.abs(f6 - f);
            if (f6 <= f && abs <= f2) {
                i = i5;
                f2 = abs;
            }
            if (f6 > f && abs <= f4) {
                i3 = i5;
                f4 = abs;
            }
            if (f6 <= f5) {
                i2 = i5;
                f5 = f6;
            }
            if (f6 > f3) {
                i4 = i5;
                f3 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new d(list.get(i), list.get(i3));
    }

    public final boolean A() {
        return isHorizontal() && getLayoutDirection() == 1;
    }

    public final boolean B(float f, d dVar) {
        b.C0118b c0118b = dVar.a;
        float f2 = c0118b.d;
        b.C0118b c0118b2 = dVar.b;
        float b2 = rq2.b(f2, c0118b2.d, c0118b.b, c0118b2.b, f) / 2.0f;
        float f3 = A() ? f + b2 : f - b2;
        return A() ? f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f3 > ((float) v());
    }

    public final boolean C(float f, d dVar) {
        b.C0118b c0118b = dVar.a;
        float f2 = c0118b.d;
        b.C0118b c0118b2 = dVar.b;
        float p = p(f, rq2.b(f2, c0118b2.d, c0118b.b, c0118b2.b, f) / 2.0f);
        return A() ? p > ((float) v()) : p < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final b D(RecyclerView.v vVar, float f, int i) {
        View f2 = vVar.f(i);
        measureChildWithMargins(f2, 0, 0);
        float p = p(f, this.h.a / 2.0f);
        d z = z(this.h.b, p, false);
        return new b(f2, p, s(f2, p, z), z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x05c6, code lost:
    
        if (r6 == r9) goto L196;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0573 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(RecyclerView.v vVar) {
        float f;
        int i;
        int[] iArr;
        com.google.android.material.carousel.b d2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        boolean z;
        int size;
        int size2;
        int height;
        List<b.C0118b> list;
        int i10;
        b.C0118b c0118b;
        b.C0118b c0118b2;
        int i11;
        int i12;
        View f3 = vVar.f(0);
        measureChildWithMargins(f3, 0, 0);
        c440 c440Var = this.f;
        c440Var.getClass();
        float height2 = getHeight();
        if (isHorizontal()) {
            height2 = getWidth();
        }
        float f4 = height2;
        RecyclerView.p pVar = (RecyclerView.p) f3.getLayoutParams();
        float f5 = ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        float measuredHeight = f3.getMeasuredHeight();
        if (isHorizontal()) {
            f5 = ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
            measuredHeight = f3.getMeasuredWidth();
        }
        float f6 = f5;
        float f7 = c440Var.a + f6;
        float max = Math.max(c440Var.b + f6, f7);
        float min = Math.min(measuredHeight + f6, f4);
        float a2 = xwk.a((measuredHeight / 3.0f) + f6, f7 + f6, max + f6);
        float f8 = (min + a2) / 2.0f;
        int[] iArr2 = f4 < f7 * 2.0f ? new int[]{0} : c440.d;
        int i13 = this.o;
        int[] iArr3 = c440.e;
        if (i13 == 1) {
            int length = iArr2.length;
            f = 2.0f;
            int[] iArr4 = new int[length];
            i = 1;
            for (int i14 = 0; i14 < length; i14++) {
                iArr4[i14] = iArr2[i14] * 2;
            }
            int[] iArr5 = new int[2];
            for (int i15 = 0; i15 < 2; i15++) {
                iArr5[i15] = iArr3[i15] * 2;
            }
            iArr = iArr5;
            iArr2 = iArr4;
        } else {
            f = 2.0f;
            i = 1;
            iArr = iArr3;
        }
        int i16 = Integer.MIN_VALUE;
        for (int i17 : iArr) {
            if (i17 > i16) {
                i16 = i17;
            }
        }
        float f9 = f4 - (i16 * f8);
        int length2 = iArr2.length;
        int i18 = Integer.MIN_VALUE;
        int i19 = 0;
        while (i19 < length2) {
            View view = f3;
            int i20 = iArr2[i19];
            if (i20 > i18) {
                i18 = i20;
            }
            i19++;
            f3 = view;
        }
        View view2 = f3;
        int max2 = (int) Math.max(1.0d, Math.floor(yq.a(max, i18, f9, min)));
        int ceil = (int) Math.ceil(f4 / min);
        int i21 = (ceil - max2) + 1;
        int[] iArr6 = new int[i21];
        for (int i22 = 0; i22 < i21; i22++) {
            iArr6[i22] = ceil - i22;
        }
        ek3 a3 = ek3.a(f4, a2, f7, max, iArr2, f8, iArr, min, iArr6);
        int i23 = a3.c;
        int i24 = a3.g;
        c440Var.c = i23 + a3.d + i24;
        int itemCount = getItemCount();
        int i25 = a3.c;
        int i26 = a3.d;
        int i27 = ((i25 + i26) + i24) - itemCount;
        boolean z2 = i27 > 0 && (i25 > 0 || i26 > i);
        while (i27 > 0) {
            int i28 = a3.c;
            if (i28 > 0) {
                a3.c = i28 - 1;
            } else {
                int i29 = a3.d;
                if (i29 > 1) {
                    a3.d = i29 - 1;
                }
            }
            i27--;
        }
        if (z2) {
            a3 = ek3.a(f4, a2, f7, max, new int[]{a3.c}, f8, new int[]{a3.d}, min, new int[]{i24});
        }
        Context context = view2.getContext();
        if (this.o == 1) {
            float min2 = Math.min(context.getResources().getDimension(R$dimen.m3_carousel_gone_size) + f6, a3.f);
            float f10 = min2 / f;
            float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f10;
            float b2 = com.google.android.material.carousel.a.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a3.b, a3.c);
            float c2 = com.google.android.material.carousel.a.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.google.android.material.carousel.a.a(b2, a3.b, (int) Math.floor(a3.c / f)), a3.b, a3.c);
            float b3 = com.google.android.material.carousel.a.b(c2, a3.e, a3.d);
            float c3 = com.google.android.material.carousel.a.c(c2, com.google.android.material.carousel.a.a(b3, a3.e, (int) Math.floor(a3.d / f)), a3.e, a3.d);
            float f12 = a3.f;
            int i30 = a3.g;
            float b4 = com.google.android.material.carousel.a.b(c3, f12, i30);
            float c4 = com.google.android.material.carousel.a.c(c3, com.google.android.material.carousel.a.a(b4, a3.f, i30), a3.f, i30);
            float b5 = com.google.android.material.carousel.a.b(c4, a3.e, a3.d);
            float b6 = com.google.android.material.carousel.a.b(com.google.android.material.carousel.a.c(c4, com.google.android.material.carousel.a.a(b5, a3.e, (int) Math.ceil(a3.d / f)), a3.e, a3.d), a3.b, a3.c);
            float f13 = f10 + f4;
            float a4 = lv9.a(min2, a3.f, f6);
            float a5 = lv9.a(a3.b, a3.f, f6);
            float a6 = lv9.a(a3.e, a3.f, f6);
            b.a aVar = new b.a(a3.f, f4);
            aVar.a(f11, a4, min2, false, true);
            if (a3.c > 0) {
                aVar.c(b2, a5, a3.b, (int) Math.floor(r5 / f), false);
            }
            if (a3.d > 0) {
                aVar.c(b3, a6, a3.e, (int) Math.floor(r5 / f), false);
            }
            aVar.c(b4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a3.f, a3.g, true);
            if (a3.d > 0) {
                aVar.c(b5, a6, a3.e, (int) Math.ceil(r5 / f), false);
            }
            if (a3.c > 0) {
                aVar.c(b6, a5, a3.b, (int) Math.ceil(r4 / f), false);
            }
            aVar.a(f13, a4, min2, false, true);
            d2 = aVar.d();
        } else {
            float min3 = Math.min(context.getResources().getDimension(R$dimen.m3_carousel_gone_size) + f6, a3.f);
            float f14 = min3 / f;
            float f15 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f14;
            float f16 = a3.f;
            int i31 = a3.g;
            float b7 = com.google.android.material.carousel.a.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f16, i31);
            float c5 = com.google.android.material.carousel.a.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.google.android.material.carousel.a.a(b7, a3.f, i31), a3.f, i31);
            float b8 = com.google.android.material.carousel.a.b(c5, a3.e, a3.d);
            float b9 = com.google.android.material.carousel.a.b(com.google.android.material.carousel.a.c(c5, b8, a3.e, a3.d), a3.b, a3.c);
            float f17 = f14 + f4;
            float a7 = lv9.a(min3, a3.f, f6);
            float a8 = lv9.a(a3.b, a3.f, f6);
            float a9 = lv9.a(a3.e, a3.f, f6);
            b.a aVar2 = new b.a(a3.f, f4);
            aVar2.a(f15, a7, min3, false, true);
            aVar2.c(b7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a3.f, a3.g, true);
            if (a3.d > 0) {
                aVar2.a(b8, a9, a3.e, false, false);
            }
            int i32 = a3.c;
            if (i32 > 0) {
                aVar2.c(b9, a8, a3.b, i32, false);
            }
            aVar2.a(f17, a7, min3, false, true);
            d2 = aVar2.d();
        }
        if (A()) {
            float v = v();
            b.a aVar3 = new b.a(d2.a, v);
            float f18 = (v - d2.d().b) - (d2.d().d / f);
            List<b.C0118b> list2 = d2.b;
            int size3 = list2.size() - 1;
            while (size3 >= 0) {
                b.C0118b c0118b3 = list2.get(size3);
                float f19 = c0118b3.d;
                aVar3.a((f19 / f) + f18, c0118b3.c, f19, size3 >= d2.c && size3 <= d2.d, c0118b3.e);
                f18 += c0118b3.d;
                size3--;
            }
            d2 = aVar3.d();
        }
        com.google.android.material.carousel.b bVar = d2;
        List<b.C0118b> list3 = bVar.b;
        if (getChildCount() > 0) {
            RecyclerView.p pVar2 = (RecyclerView.p) getChildAt(0).getLayoutParams();
            if (this.k.a == 0) {
                i11 = ((ViewGroup.MarginLayoutParams) pVar2).leftMargin;
                i12 = ((ViewGroup.MarginLayoutParams) pVar2).rightMargin;
            } else {
                i11 = ((ViewGroup.MarginLayoutParams) pVar2).topMargin;
                i12 = ((ViewGroup.MarginLayoutParams) pVar2).bottomMargin;
            }
            i2 = i12 + i11;
        } else {
            i2 = 0;
        }
        float f20 = i2;
        if (getClipToPadding()) {
            i3 = 0;
        } else {
            this.f.getClass();
            i3 = this.k.a == 1 ? getPaddingTop() : getPaddingLeft();
        }
        float f21 = i3;
        if (getClipToPadding()) {
            i4 = 0;
        } else {
            this.f.getClass();
            i4 = this.k.a == 1 ? getPaddingBottom() : getPaddingRight();
        }
        float f22 = i4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        int i33 = 0;
        while (true) {
            i5 = bVar.d;
            i6 = bVar.c;
            if (i33 >= list3.size()) {
                i33 = -1;
                break;
            } else if (!list3.get(i33).e) {
                break;
            } else {
                i33++;
            }
        }
        float width = isHorizontal() ? getWidth() : getHeight();
        if (bVar.a().b - (bVar.a().d / f) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            b.C0118b a10 = bVar.a();
            f2 = 0.0f;
            int i34 = 0;
            while (true) {
                if (i34 >= list3.size()) {
                    c0118b2 = null;
                    break;
                }
                c0118b2 = list3.get(i34);
                if (!c0118b2.e) {
                    break;
                } else {
                    i34++;
                }
            }
            if (a10 == c0118b2) {
                if (f21 > f2) {
                    arrayList.add(com.google.android.material.carousel.c.f(bVar, f21, width, true, f20));
                }
                i7 = i6;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                size2 = list3.size() - 1;
                while (true) {
                    if (size2 < 0) {
                        size2 = -1;
                        break;
                    } else if (!list3.get(size2).e) {
                        break;
                    } else {
                        size2--;
                    }
                }
                float width2 = isHorizontal() ? getWidth() : getHeight();
                height = getHeight();
                if (isHorizontal()) {
                    height = getWidth();
                }
                if ((bVar.c().d / f) + bVar.c().b <= height) {
                    b.C0118b c6 = bVar.c();
                    int size4 = list3.size() - 1;
                    while (true) {
                        if (size4 < 0) {
                            c0118b = null;
                            break;
                        }
                        c0118b = list3.get(size4);
                        if (!c0118b.e) {
                            break;
                        } else {
                            size4--;
                        }
                    }
                }
                if (size2 != -1) {
                    int i35 = size2 - i5;
                    float f23 = bVar.b().b - (bVar.b().d / f);
                    if (i35 > 0 || bVar.c().f <= f2) {
                        float f24 = width2;
                        float f25 = f2;
                        int i36 = 0;
                        while (i36 < i35) {
                            com.google.android.material.carousel.b bVar2 = (com.google.android.material.carousel.b) xy9.b(1, arrayList2);
                            int i37 = size2 - i36;
                            int i38 = i35;
                            f25 += list3.get(i37).f;
                            int i39 = i37 + 1;
                            if (i39 < list3.size()) {
                                float f26 = list3.get(i39).c;
                                int i40 = bVar2.c - 1;
                                while (true) {
                                    if (i40 < 0) {
                                        list = list3;
                                        i40 = 0;
                                        break;
                                    } else {
                                        list = list3;
                                        if (f26 == bVar2.b.get(i40).c) {
                                            break;
                                        }
                                        i40--;
                                        list3 = list;
                                    }
                                }
                                i10 = i40 + 1;
                            } else {
                                list = list3;
                                i10 = 0;
                            }
                            int i41 = size2;
                            com.google.android.material.carousel.b e = com.google.android.material.carousel.c.e(bVar2, i41, i10, f23 - f25, i7 + i36 + 1, i5 + i36 + 1, f24);
                            float f27 = f24;
                            if (i36 == i38 - 1 && f22 > f2) {
                                e = com.google.android.material.carousel.c.f(e, f22, f27, false, f20);
                            }
                            arrayList2.add(e);
                            i36++;
                            i35 = i38;
                            f24 = f27;
                            size2 = i41;
                            list3 = list;
                        }
                    } else {
                        arrayList2.add(com.google.android.material.carousel.c.e(bVar, 0, 0, f23 - bVar.c().f, bVar.c, bVar.d, width2));
                    }
                    this.g = new com.google.android.material.carousel.c(bVar, arrayList, arrayList2);
                }
                if (f22 > f2) {
                    arrayList2.add(com.google.android.material.carousel.c.f(bVar, f22, width2, false, f20));
                }
                this.g = new com.google.android.material.carousel.c(bVar, arrayList, arrayList2);
            }
        } else {
            f2 = 0.0f;
        }
        if (i33 != -1) {
            int i42 = i6 - i33;
            float f28 = bVar.b().b - (bVar.b().d / f);
            if (i42 > 0 || bVar.a().f <= f2) {
                i7 = i6;
                float f29 = width;
                float f30 = f2;
                int i43 = 0;
                while (i43 < i42) {
                    com.google.android.material.carousel.b bVar3 = (com.google.android.material.carousel.b) xy9.b(1, arrayList);
                    int i44 = i33 + i43;
                    int size5 = list3.size() - 1;
                    f30 += list3.get(i44).f;
                    int i45 = i44 - 1;
                    if (i45 >= 0) {
                        float f31 = list3.get(i45).c;
                        int i46 = bVar3.d;
                        List<b.C0118b> list4 = bVar3.b;
                        i8 = i33;
                        i9 = i42;
                        int i47 = i46;
                        while (true) {
                            if (i47 >= list4.size()) {
                                z = true;
                                size = list4.size() - 1;
                                break;
                            } else {
                                if (f31 == list4.get(i47).c) {
                                    size = i47;
                                    z = true;
                                    break;
                                }
                                i47++;
                            }
                        }
                        size5 = size - 1;
                    } else {
                        i8 = i33;
                        i9 = i42;
                        z = true;
                    }
                    int i48 = i8;
                    com.google.android.material.carousel.b e2 = com.google.android.material.carousel.c.e(bVar3, i48, size5, f28 + f30, (i7 - i43) - 1, (i5 - i43) - 1, f29);
                    float f32 = f29;
                    if (i43 == i9 - 1 && f21 > f2) {
                        e2 = com.google.android.material.carousel.c.f(e2, f21, f32, z, f20);
                    }
                    arrayList.add(e2);
                    i43++;
                    f29 = f32;
                    i33 = i48;
                    i42 = i9;
                }
            } else {
                i7 = i6;
                arrayList.add(com.google.android.material.carousel.c.e(bVar, 0, 0, f28 + bVar.a().f, bVar.c, bVar.d, width));
            }
            ArrayList arrayList22 = new ArrayList();
            arrayList22.add(bVar);
            size2 = list3.size() - 1;
            while (true) {
                if (size2 < 0) {
                }
                size2--;
            }
            float width22 = isHorizontal() ? getWidth() : getHeight();
            height = getHeight();
            if (isHorizontal()) {
            }
            if ((bVar.c().d / f) + bVar.c().b <= height) {
            }
            if (size2 != -1) {
            }
            if (f22 > f2) {
            }
            this.g = new com.google.android.material.carousel.c(bVar, arrayList, arrayList22);
        }
        if (f21 > f2) {
        }
        i7 = i6;
        ArrayList arrayList222 = new ArrayList();
        arrayList222.add(bVar);
        size2 = list3.size() - 1;
        while (true) {
            if (size2 < 0) {
            }
            size2--;
        }
        float width222 = isHorizontal() ? getWidth() : getHeight();
        height = getHeight();
        if (isHorizontal()) {
        }
        if ((bVar.c().d / f) + bVar.c().b <= height) {
        }
        if (size2 != -1) {
        }
        if (f22 > f2) {
        }
        this.g = new com.google.android.material.carousel.c(bVar, arrayList, arrayList222);
    }

    public final void F() {
        this.g = null;
        requestLayout();
    }

    public final int G(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        if (this.g == null) {
            E(vVar);
        }
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = i2 + i;
        if (i5 < i3) {
            i = i3 - i2;
        } else if (i5 > i4) {
            i = i4 - i2;
        }
        this.b = i2 + i;
        I(this.g);
        float f = this.h.a / 2.0f;
        float t = t(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        float f2 = A() ? this.h.c().b : this.h.a().b;
        float f3 = Float.MAX_VALUE;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            float p = p(t, f);
            d z = z(this.h.b, p, false);
            float s = s(childAt, p, z);
            super.getDecoratedBoundsWithMargins(childAt, rect);
            H(childAt, p, z);
            this.k.l(childAt, rect, f, s);
            float abs = Math.abs(f2 - s);
            if (abs < f3) {
                this.n = getPosition(childAt);
                f3 = abs;
            }
            t = p(t, this.h.a);
        }
        u(vVar, a0Var);
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(View view, float f, d dVar) {
        if (view instanceof ug10) {
            b.C0118b c0118b = dVar.a;
            float f2 = c0118b.c;
            b.C0118b c0118b2 = dVar.b;
            float b2 = rq2.b(f2, c0118b2.c, c0118b.a, c0118b2.a, f);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF c2 = this.k.c(height, width, rq2.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, height / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, b2), rq2.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, b2));
            float s = s(view, f, dVar);
            RectF rectF = new RectF(s - (c2.width() / 2.0f), s - (c2.height() / 2.0f), (c2.width() / 2.0f) + s, (c2.height() / 2.0f) + s);
            RectF rectF2 = new RectF(this.k.f(), this.k.i(), this.k.g(), this.k.d());
            this.f.getClass();
            this.k.a(c2, rectF, rectF2);
            this.k.k(c2, rectF, rectF2);
            ((ug10) view).a();
        }
    }

    public final void I(@NonNull com.google.android.material.carousel.c cVar) {
        int i = this.d;
        int i2 = this.c;
        if (i <= i2) {
            this.h = A() ? cVar.a() : cVar.c();
        } else {
            this.h = cVar.b(this.b, i2, i);
        }
        List<b.C0118b> list = this.h.b;
        c cVar2 = this.e;
        cVar2.getClass();
        cVar2.c = Collections.unmodifiableList(list);
    }

    public final void J() {
        int itemCount = getItemCount();
        int i = this.m;
        if (itemCount == i || this.g == null) {
            return;
        }
        c440 c440Var = this.f;
        if ((i < c440Var.c && getItemCount() >= c440Var.c) || (i >= c440Var.c && getItemCount() < c440Var.c)) {
            F();
        }
        this.m = itemCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollHorizontally() {
        return isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollVertically() {
        return !isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollExtent(@NonNull RecyclerView.a0 a0Var) {
        if (getChildCount() == 0 || this.g == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getWidth() * (this.g.a.a / computeHorizontalScrollRange(a0Var)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollOffset(@NonNull RecyclerView.a0 a0Var) {
        return this.b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollRange(@NonNull RecyclerView.a0 a0Var) {
        return this.d - this.c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    @Nullable
    public final PointF computeScrollVectorForPosition(int i) {
        if (this.g == null) {
            return null;
        }
        int x = x(i, w(i)) - this.b;
        return isHorizontal() ? new PointF(x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollExtent(@NonNull RecyclerView.a0 a0Var) {
        if (getChildCount() == 0 || this.g == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getHeight() * (this.g.a.a / computeVerticalScrollRange(a0Var)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollOffset(@NonNull RecyclerView.a0 a0Var) {
        return this.b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollRange(@NonNull RecyclerView.a0 a0Var) {
        return this.d - this.c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateDefaultLayoutParams() {
        return new RecyclerView.p(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float centerY = rect.centerY();
        if (isHorizontal()) {
            centerY = rect.centerX();
        }
        d z = z(this.h.b, centerY, true);
        b.C0118b c0118b = z.a;
        float f = c0118b.d;
        b.C0118b c0118b2 = z.b;
        float b2 = rq2.b(f, c0118b2.d, c0118b.b, c0118b2.b, centerY);
        boolean isHorizontal = isHorizontal();
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float width = isHorizontal ? (rect.width() - b2) / 2.0f : 0.0f;
        if (!isHorizontal()) {
            f2 = (rect.height() - b2) / 2.0f;
        }
        rect.set((int) (rect.left + width), (int) (rect.top + f2), (int) (rect.right - width), (int) (rect.bottom - f2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    public final boolean isHorizontal() {
        return this.k.a == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void measureChildWithMargins(@NonNull View view, int i, int i2) {
        if (!(view instanceof ug10)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view, rect);
        int i3 = rect.left + rect.right + i;
        int i4 = rect.top + rect.bottom + i2;
        com.google.android.material.carousel.c cVar = this.g;
        view.measure(RecyclerView.o.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i3, (int) ((cVar == null || this.k.a != 0) ? ((ViewGroup.MarginLayoutParams) pVar).width : cVar.a.a), isHorizontal()), RecyclerView.o.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i4, (int) ((cVar == null || this.k.a != 1) ? ((ViewGroup.MarginLayoutParams) pVar).height : cVar.a.a), canScrollVertically()));
    }

    public final void o(View view, int i, b bVar) {
        float f = this.h.a / 2.0f;
        addView(view, i);
        float f2 = bVar.c;
        this.k.j((int) (f2 - f), (int) (f2 + f), view);
        H(view, bVar.b, bVar.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        Context context = recyclerView.getContext();
        c440 c440Var = this.f;
        float f = c440Var.a;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = context.getResources().getDimension(R$dimen.m3_carousel_small_item_size_min);
        }
        c440Var.a = f;
        float f2 = c440Var.b;
        if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = context.getResources().getDimension(R$dimen.m3_carousel_small_item_size_max);
        }
        c440Var.b = f2;
        F();
        recyclerView.addOnLayoutChangeListener(this.l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        recyclerView.removeOnLayoutChangeListener(this.l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0027, code lost:
    
        if (r8 != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0031, code lost:
    
        if (A() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0035, code lost:
    
        if (r8 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x003e, code lost:
    
        if (A() != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(@NonNull View view, int i, @NonNull RecyclerView.v vVar, @NonNull RecyclerView.a0 a0Var) {
        char c2;
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = this.k.a;
        if (i != 1) {
            if (i != 2) {
                if (i == 17) {
                    if (i2 == 0) {
                    }
                    c2 = 0;
                } else if (i != 33) {
                    if (i != 66) {
                        if (i == 130) {
                        }
                        c2 = 0;
                    } else {
                        if (i2 == 0) {
                        }
                        c2 = 0;
                    }
                }
                if (c2 == 0) {
                    return null;
                }
                if (c2 == 65535) {
                    if (getPosition(view) == 0) {
                        return null;
                    }
                    int position = getPosition(getChildAt(0)) - 1;
                    if (position >= 0 && position < getItemCount()) {
                        b D = D(vVar, t(position), position);
                        o(D.a, 0, D);
                    }
                    return getChildAt(A() ? getChildCount() - 1 : 0);
                }
                if (getPosition(view) == getItemCount() - 1) {
                    return null;
                }
                int position2 = getPosition(getChildAt(getChildCount() - 1)) + 1;
                if (position2 >= 0 && position2 < getItemCount()) {
                    b D2 = D(vVar, t(position2), position2);
                    o(D2.a, -1, D2);
                }
                return getChildAt(A() ? 0 : getChildCount() - 1);
            }
            c2 = 1;
            if (c2 == 0) {
            }
        }
        c2 = 65535;
        if (c2 == 0) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsAdded(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        J();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsRemoved(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        J();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (a0Var.b() <= 0 || v() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            removeAndRecycleAllViews(vVar);
            this.i = 0;
            return;
        }
        boolean A = A();
        int i = 1;
        boolean z = this.g == null;
        if (z) {
            E(vVar);
        }
        com.google.android.material.carousel.c cVar = this.g;
        boolean A2 = A();
        com.google.android.material.carousel.b a2 = A2 ? cVar.a() : cVar.c();
        float f = (A2 ? a2.c() : a2.a()).a;
        float f2 = a2.a / 2.0f;
        int h = (int) (this.k.h() - (A() ? f + f2 : f - f2));
        com.google.android.material.carousel.c cVar2 = this.g;
        boolean A3 = A();
        com.google.android.material.carousel.b c2 = A3 ? cVar2.c() : cVar2.a();
        b.C0118b a3 = A3 ? c2.a() : c2.c();
        int b2 = (int) (((((a0Var.b() - 1) * c2.a) * (A3 ? -1.0f : 1.0f)) - (a3.a - this.k.h())) + (this.k.e() - a3.a) + (A3 ? -a3.g : a3.h));
        int min = A3 ? Math.min(0, b2) : Math.max(0, b2);
        this.c = A ? min : h;
        if (A) {
            min = h;
        }
        this.d = min;
        if (z) {
            this.b = h;
            com.google.android.material.carousel.c cVar3 = this.g;
            int itemCount = getItemCount();
            int i2 = this.c;
            int i3 = this.d;
            boolean A4 = A();
            List<com.google.android.material.carousel.b> list = cVar3.b;
            List<com.google.android.material.carousel.b> list2 = cVar3.c;
            float f3 = cVar3.a.a;
            HashMap hashMap = new HashMap();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i4 >= itemCount) {
                    break;
                }
                int i6 = A4 ? (itemCount - i4) - i : i4;
                int i7 = i;
                if (i6 * f3 * (A4 ? -1 : i7) > i3 - cVar3.g || i4 >= itemCount - list2.size()) {
                    hashMap.put(Integer.valueOf(i6), list2.get(xwk.b(i5, 0, list2.size() - 1)));
                    i5++;
                }
                i4++;
                i = i7;
            }
            int i8 = i;
            int i9 = 0;
            for (int i10 = itemCount - 1; i10 >= 0; i10--) {
                int i11 = A4 ? (itemCount - i10) - 1 : i10;
                if (i11 * f3 * (A4 ? -1 : i8) < i2 + cVar3.f || i10 < list.size()) {
                    hashMap.put(Integer.valueOf(i11), list.get(xwk.b(i9, 0, list.size() - 1)));
                    i9++;
                }
            }
            this.j = hashMap;
            int i12 = this.n;
            if (i12 != -1) {
                this.b = x(i12, w(i12));
            }
        }
        int i13 = this.b;
        int i14 = this.c;
        int i15 = this.d;
        this.b = (i13 < i14 ? i14 - i13 : i13 > i15 ? i15 - i13 : 0) + i13;
        this.i = xwk.b(this.i, 0, a0Var.b());
        I(this.g);
        detachAndScrapAttachedViews(vVar);
        u(vVar, a0Var);
        this.m = getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutCompleted(RecyclerView.a0 a0Var) {
        super.onLayoutCompleted(a0Var);
        if (getChildCount() == 0) {
            this.i = 0;
        } else {
            this.i = getPosition(getChildAt(0));
        }
    }

    public final float p(float f, float f2) {
        return A() ? f - f2 : f + f2;
    }

    public final void q(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        float t = t(i);
        while (i < a0Var.b()) {
            b D = D(vVar, t, i);
            d dVar = D.d;
            float f = D.c;
            if (B(f, dVar)) {
                return;
            }
            t = p(t, this.h.a);
            if (!C(f, dVar)) {
                o(D.a, -1, D);
            }
            i++;
        }
    }

    public final void r(int i, RecyclerView.v vVar) {
        float t = t(i);
        while (i >= 0) {
            b D = D(vVar, t, i);
            d dVar = D.d;
            float f = D.c;
            if (C(f, dVar)) {
                return;
            }
            float f2 = this.h.a;
            t = A() ? t + f2 : t - f2;
            if (!B(f, dVar)) {
                o(D.a, 0, D);
            }
            i--;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
        int y;
        if (this.g == null || (y = y(getPosition(view), w(getPosition(view)))) == 0) {
            return false;
        }
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = i + y;
        if (i4 < i2) {
            y = i2 - i;
        } else if (i4 > i3) {
            y = i3 - i;
        }
        int y2 = y(getPosition(view), this.g.b(i + y, i2, i3));
        if (isHorizontal()) {
            recyclerView.scrollBy(y2, 0);
            return true;
        }
        recyclerView.scrollBy(0, y2);
        return true;
    }

    public final float s(View view, float f, d dVar) {
        b.C0118b c0118b = dVar.a;
        float f2 = c0118b.b;
        b.C0118b c0118b2 = dVar.b;
        float f3 = c0118b2.b;
        float f4 = c0118b.a;
        float f5 = c0118b2.a;
        float b2 = rq2.b(f2, f3, f4, f5, f);
        if (c0118b2 != this.h.b() && c0118b != this.h.d()) {
            return b2;
        }
        return (((1.0f - c0118b2.c) + (this.k.b((RecyclerView.p) view.getLayoutParams()) / this.h.a)) * (f - f5)) + b2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int scrollHorizontallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (isHorizontal()) {
            return G(i, vVar, a0Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void scrollToPosition(int i) {
        this.n = i;
        if (this.g == null) {
            return;
        }
        this.b = x(i, w(i));
        this.i = xwk.b(i, 0, Math.max(0, getItemCount() - 1));
        I(this.g);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int scrollVerticallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (canScrollVertically()) {
            return G(i, vVar, a0Var);
        }
        return 0;
    }

    public final void setOrientation(int i) {
        av9 zu9Var;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(lhg.a(i, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        av9 av9Var = this.k;
        if (av9Var == null || i != av9Var.a) {
            if (i == 0) {
                zu9Var = new zu9(this);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                zu9Var = new yu9(this);
            }
            this.k = zu9Var;
            F();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        a aVar = new a(recyclerView.getContext());
        aVar.setTargetPosition(i);
        startSmoothScroll(aVar);
    }

    public final float t(int i) {
        return p(this.k.h() - this.b, this.h.a * i);
    }

    public final void u(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            Rect rect = new Rect();
            super.getDecoratedBoundsWithMargins(childAt, rect);
            float centerX = isHorizontal() ? rect.centerX() : rect.centerY();
            if (!C(centerX, z(this.h.b, centerX, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, vVar);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            Rect rect2 = new Rect();
            super.getDecoratedBoundsWithMargins(childAt2, rect2);
            float centerX2 = isHorizontal() ? rect2.centerX() : rect2.centerY();
            if (!B(centerX2, z(this.h.b, centerX2, true))) {
                break;
            } else {
                removeAndRecycleView(childAt2, vVar);
            }
        }
        if (getChildCount() == 0) {
            r(this.i - 1, vVar);
            q(this.i, vVar, a0Var);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            r(position - 1, vVar);
            q(position2 + 1, vVar, a0Var);
        }
    }

    public final int v() {
        return isHorizontal() ? getWidth() : getHeight();
    }

    public final com.google.android.material.carousel.b w(int i) {
        com.google.android.material.carousel.b bVar;
        HashMap hashMap = this.j;
        return (hashMap == null || (bVar = (com.google.android.material.carousel.b) hashMap.get(Integer.valueOf(xwk.b(i, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? this.g.a : bVar;
    }

    public final int x(int i, com.google.android.material.carousel.b bVar) {
        if (!A()) {
            return (int) ((bVar.a / 2.0f) + ((i * bVar.a) - bVar.a().a));
        }
        float v = v() - bVar.c().a;
        float f = bVar.a;
        return (int) ((v - (i * f)) - (f / 2.0f));
    }

    public final int y(int i, @NonNull com.google.android.material.carousel.b bVar) {
        int i2 = Integer.MAX_VALUE;
        for (b.C0118b c0118b : bVar.b.subList(bVar.c, bVar.d + 1)) {
            float f = bVar.a;
            float f2 = (f / 2.0f) + (i * f);
            int v = (A() ? (int) ((v() - c0118b.a) - f2) : (int) (f2 - c0118b.a)) - this.b;
            if (Math.abs(i2) > Math.abs(v)) {
                i2 = v;
            }
        }
        return i2;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.e = new c();
        this.i = 0;
        this.l = new xu9(this, 0);
        this.n = -1;
        this.o = 0;
        this.f = new c440();
        F();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Carousel);
            this.o = obtainStyledAttributes.getInt(R$styleable.Carousel_carousel_alignment, 0);
            F();
            setOrientation(obtainStyledAttributes.getInt(R$styleable.RecyclerView_android_orientation, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
