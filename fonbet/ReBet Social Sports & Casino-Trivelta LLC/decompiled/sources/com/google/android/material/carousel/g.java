package com.google.android.material.carousel;

import android.content.Context;
import com.google.android.material.carousel.h;

/* loaded from: classes3.dex */
public abstract class g {
    public static float a(float f10, float f11, int i10) {
        return f10 + (Math.max(0, i10 - 1) * f11);
    }

    public static float b(float f10, float f11, int i10) {
        return i10 > 0 ? f10 + (f11 / 2.0f) : f10;
    }

    public static h c(Context context, float f10, int i10, a aVar) {
        float f11;
        float f12;
        float min = Math.min(f(context) + f10, aVar.f35102f);
        float f13 = min / 2.0f;
        float f14 = 0.0f - f13;
        float b10 = b(0.0f, aVar.f35098b, aVar.f35099c);
        float j10 = j(0.0f, a(b10, aVar.f35098b, (int) Math.floor(aVar.f35099c / 2.0f)), aVar.f35098b, aVar.f35099c);
        float b11 = b(j10, aVar.f35101e, aVar.f35100d);
        float j11 = j(j10, a(b11, aVar.f35101e, (int) Math.floor(aVar.f35100d / 2.0f)), aVar.f35101e, aVar.f35100d);
        float b12 = b(j11, aVar.f35102f, aVar.f35103g);
        float j12 = j(j11, a(b12, aVar.f35102f, aVar.f35103g), aVar.f35102f, aVar.f35103g);
        float b13 = b(j12, aVar.f35101e, aVar.f35100d);
        float b14 = b(j(j12, a(b13, aVar.f35101e, (int) Math.ceil(aVar.f35100d / 2.0f)), aVar.f35101e, aVar.f35100d), aVar.f35098b, aVar.f35099c);
        float f15 = i10 + f13;
        float b15 = f.b(min, aVar.f35102f, f10);
        float b16 = f.b(aVar.f35098b, aVar.f35102f, f10);
        float b17 = f.b(aVar.f35101e, aVar.f35102f, f10);
        h.b a10 = new h.b(aVar.f35102f, i10).a(f14, b15, min);
        if (aVar.f35099c > 0) {
            f11 = 2.0f;
            f12 = b15;
            a10.g(b10, b16, aVar.f35098b, (int) Math.floor(r7 / 2.0f));
        } else {
            f11 = 2.0f;
            f12 = b15;
        }
        if (aVar.f35100d > 0) {
            a10.g(b11, b17, aVar.f35101e, (int) Math.floor(r4 / f11));
        }
        a10.h(b12, 0.0f, aVar.f35102f, aVar.f35103g, true);
        if (aVar.f35100d > 0) {
            a10.g(b13, b17, aVar.f35101e, (int) Math.ceil(r4 / f11));
        }
        if (aVar.f35099c > 0) {
            a10.g(b14, b16, aVar.f35098b, (int) Math.ceil(r0 / f11));
        }
        a10.a(f15, f12, min);
        return a10.i();
    }

    public static h d(Context context, float f10, int i10, a aVar, int i11) {
        return i11 == 1 ? c(context, f10, i10, aVar) : e(context, f10, i10, aVar);
    }

    public static h e(Context context, float f10, int i10, a aVar) {
        float min = Math.min(f(context) + f10, aVar.f35102f);
        float f11 = min / 2.0f;
        float f12 = 0.0f - f11;
        float b10 = b(0.0f, aVar.f35102f, aVar.f35103g);
        float j10 = j(0.0f, a(b10, aVar.f35102f, aVar.f35103g), aVar.f35102f, aVar.f35103g);
        float b11 = b(j10, aVar.f35101e, aVar.f35100d);
        float b12 = b(j(j10, b11, aVar.f35101e, aVar.f35100d), aVar.f35098b, aVar.f35099c);
        float f13 = i10 + f11;
        float b13 = f.b(min, aVar.f35102f, f10);
        float b14 = f.b(aVar.f35098b, aVar.f35102f, f10);
        float b15 = f.b(aVar.f35101e, aVar.f35102f, f10);
        h.b h10 = new h.b(aVar.f35102f, i10).a(f12, b13, min).h(b10, 0.0f, aVar.f35102f, aVar.f35103g, true);
        if (aVar.f35100d > 0) {
            h10.b(b11, b15, aVar.f35101e);
        }
        int i11 = aVar.f35099c;
        if (i11 > 0) {
            h10.g(b12, b14, aVar.f35098b, i11);
        }
        h10.a(f13, b13, min);
        return h10.i();
    }

    public static float f(Context context) {
        return context.getResources().getDimension(ia.e.f48291B);
    }

    public static float g(Context context) {
        return context.getResources().getDimension(ia.e.f48293C);
    }

    public static float h(Context context) {
        return context.getResources().getDimension(ia.e.f48295D);
    }

    public static int i(int[] iArr) {
        int i10 = Integer.MIN_VALUE;
        for (int i11 : iArr) {
            if (i11 > i10) {
                i10 = i11;
            }
        }
        return i10;
    }

    public static float j(float f10, float f11, float f12, int i10) {
        return i10 > 0 ? f11 + (f12 / 2.0f) : f10;
    }
}
