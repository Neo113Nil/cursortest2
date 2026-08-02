package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import com.google.android.material.R$styleable;
import com.unity3d.services.UnityAdsConstants;
import xsna.bdl;
import xsna.mc;
import xsna.ryo;
import xsna.upk;
import xsna.uuj;
import xsna.wog0;
import xsna.wuj;
import xsna.xsf0;

/* compiled from: ShapeAppearanceModel.java */
/* loaded from: classes.dex */
public class a {
    public static final xsf0 m = new xsf0(0.5f);
    public wuj a = new wog0();
    public wuj b = new wog0();
    public wuj c = new wog0();
    public wuj d = new wog0();
    public uuj e = new mc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public uuj f = new mc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public uuj g = new mc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public uuj h = new mc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public ryo i = new ryo();
    public ryo j = new ryo();
    public ryo k = new ryo();
    public ryo l = new ryo();

    /* compiled from: ShapeAppearanceModel.java */
    /* loaded from: classes13.dex */
    public interface b {
        @NonNull
        uuj a(@NonNull uuj uujVar);
    }

    @NonNull
    public static C0123a a(int i, int i2, Context context) {
        return b(context, i, i2, new mc(0));
    }

    @NonNull
    public static C0123a b(Context context, int i, int i2, @NonNull uuj uujVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(R$styleable.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyBottomLeft, i3);
            uuj d = d(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSize, uujVar);
            uuj d2 = d(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeTopLeft, d);
            uuj d3 = d(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeTopRight, d);
            uuj d4 = d(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeBottomRight, d);
            uuj d5 = d(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeBottomLeft, d);
            C0123a c0123a = new C0123a();
            c0123a.m(i4, d2);
            c0123a.p(i5, d3);
            c0123a.i(i6, d4);
            c0123a.e(i7, d5);
            return c0123a;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static C0123a c(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        mc mcVar = new mc(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, mcVar);
    }

    @NonNull
    public static uuj d(TypedArray typedArray, int i, @NonNull uuj uujVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new mc(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new xsf0(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return uujVar;
    }

    public final boolean e(@NonNull RectF rectF) {
        boolean z = this.l.getClass().equals(ryo.class) && this.j.getClass().equals(ryo.class) && this.i.getClass().equals(ryo.class) && this.k.getClass().equals(ryo.class);
        float a = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a ? 1 : (this.f.a(rectF) == a ? 0 : -1)) == 0 && (this.h.a(rectF) > a ? 1 : (this.h.a(rectF) == a ? 0 : -1)) == 0 && (this.g.a(rectF) > a ? 1 : (this.g.a(rectF) == a ? 0 : -1)) == 0) && ((this.b instanceof wog0) && (this.a instanceof wog0) && (this.c instanceof wog0) && (this.d instanceof wog0));
    }

    @NonNull
    public final a f(float f) {
        C0123a c0123a = new C0123a(this);
        c0123a.c(f);
        return c0123a.a();
    }

    @NonNull
    public final a g(@NonNull b bVar) {
        C0123a c0123a = new C0123a(this);
        c0123a.o(bVar.a(this.e));
        c0123a.r(bVar.a(this.f));
        c0123a.h(bVar.a(this.h));
        c0123a.l(bVar.a(this.g));
        return c0123a.a();
    }

    /* compiled from: ShapeAppearanceModel.java */
    /* renamed from: com.google.android.material.shape.a$a, reason: collision with other inner class name */
    /* loaded from: classes13.dex */
    public static final class C0123a {

        @NonNull
        public wuj a;

        @NonNull
        public wuj b;

        @NonNull
        public wuj c;

        @NonNull
        public wuj d;

        @NonNull
        public uuj e;

        @NonNull
        public uuj f;

        @NonNull
        public uuj g;

        @NonNull
        public uuj h;

        @NonNull
        public ryo i;

        @NonNull
        public ryo j;

        @NonNull
        public ryo k;

        @NonNull
        public ryo l;

        public C0123a() {
            this.a = new wog0();
            this.b = new wog0();
            this.c = new wog0();
            this.d = new wog0();
            this.e = new mc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f = new mc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.g = new mc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.h = new mc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.i = new ryo();
            this.j = new ryo();
            this.k = new ryo();
            this.l = new ryo();
        }

        public static float b(wuj wujVar) {
            if (wujVar instanceof wog0) {
                return ((wog0) wujVar).b;
            }
            if (wujVar instanceof upk) {
                return ((upk) wujVar).b;
            }
            return -1.0f;
        }

        @NonNull
        public final a a() {
            a aVar = new a();
            aVar.a = this.a;
            aVar.b = this.b;
            aVar.c = this.c;
            aVar.d = this.d;
            aVar.e = this.e;
            aVar.f = this.f;
            aVar.g = this.g;
            aVar.h = this.h;
            aVar.i = this.i;
            aVar.j = this.j;
            aVar.k = this.k;
            aVar.l = this.l;
            return aVar;
        }

        @NonNull
        public final void c(float f) {
            n(f);
            q(f);
            k(f);
            g(f);
        }

        @NonNull
        public final void d(@NonNull uuj uujVar) {
            this.e = uujVar;
            this.f = uujVar;
            this.g = uujVar;
            this.h = uujVar;
        }

        @NonNull
        public final void e(int i, @NonNull uuj uujVar) {
            f(bdl.a(i));
            this.h = uujVar;
        }

        @NonNull
        public final void f(@NonNull wuj wujVar) {
            this.d = wujVar;
            float b = b(wujVar);
            if (b != -1.0f) {
                g(b);
            }
        }

        @NonNull
        public final void g(float f) {
            this.h = new mc(f);
        }

        @NonNull
        public final void h(@NonNull uuj uujVar) {
            this.h = uujVar;
        }

        @NonNull
        public final void i(int i, @NonNull uuj uujVar) {
            j(bdl.a(i));
            this.g = uujVar;
        }

        @NonNull
        public final void j(@NonNull wuj wujVar) {
            this.c = wujVar;
            float b = b(wujVar);
            if (b != -1.0f) {
                k(b);
            }
        }

        @NonNull
        public final void k(float f) {
            this.g = new mc(f);
        }

        @NonNull
        public final void l(@NonNull uuj uujVar) {
            this.g = uujVar;
        }

        @NonNull
        public final void m(int i, @NonNull uuj uujVar) {
            wuj a = bdl.a(i);
            this.a = a;
            float b = b(a);
            if (b != -1.0f) {
                n(b);
            }
            this.e = uujVar;
        }

        @NonNull
        public final void n(float f) {
            this.e = new mc(f);
        }

        @NonNull
        public final void o(@NonNull uuj uujVar) {
            this.e = uujVar;
        }

        @NonNull
        public final void p(int i, @NonNull uuj uujVar) {
            wuj a = bdl.a(i);
            this.b = a;
            float b = b(a);
            if (b != -1.0f) {
                q(b);
            }
            this.f = uujVar;
        }

        @NonNull
        public final void q(float f) {
            this.f = new mc(f);
        }

        @NonNull
        public final void r(@NonNull uuj uujVar) {
            this.f = uujVar;
        }

        public C0123a(@NonNull a aVar) {
            this.a = new wog0();
            this.b = new wog0();
            this.c = new wog0();
            this.d = new wog0();
            this.e = new mc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f = new mc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.g = new mc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.h = new mc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.i = new ryo();
            this.j = new ryo();
            this.k = new ryo();
            this.l = new ryo();
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = aVar.h;
            this.i = aVar.i;
            this.j = aVar.j;
            this.k = aVar.k;
            this.l = aVar.l;
        }
    }
}
