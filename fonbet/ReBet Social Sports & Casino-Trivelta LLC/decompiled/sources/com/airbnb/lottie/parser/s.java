package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.c;
import java.util.ArrayList;
import java.util.List;
import lb.C5444x;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29076a = c.a.a(C5444x.f55808b, "y");

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token;

        static {
            int[] iArr = new int[c.b.values().length];
            $SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token = iArr;
            try {
                iArr[c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token[c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token[c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static PointF a(com.airbnb.lottie.parser.moshi.c cVar, float f10) {
        cVar.p();
        float nextDouble = (float) cVar.nextDouble();
        float nextDouble2 = (float) cVar.nextDouble();
        while (cVar.B() != c.b.END_ARRAY) {
            cVar.C();
        }
        cVar.n();
        return new PointF(nextDouble * f10, nextDouble2 * f10);
    }

    public static PointF b(com.airbnb.lottie.parser.moshi.c cVar, float f10) {
        float nextDouble = (float) cVar.nextDouble();
        float nextDouble2 = (float) cVar.nextDouble();
        while (cVar.hasNext()) {
            cVar.C();
        }
        return new PointF(nextDouble * f10, nextDouble2 * f10);
    }

    public static PointF c(com.airbnb.lottie.parser.moshi.c cVar, float f10) {
        cVar.m();
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (cVar.hasNext()) {
            int U10 = cVar.U(f29076a);
            if (U10 == 0) {
                f11 = g(cVar);
            } else if (U10 != 1) {
                cVar.w0();
                cVar.C();
            } else {
                f12 = g(cVar);
            }
        }
        cVar.t();
        return new PointF(f11 * f10, f12 * f10);
    }

    public static int d(com.airbnb.lottie.parser.moshi.c cVar) {
        cVar.p();
        int nextDouble = (int) (cVar.nextDouble() * 255.0d);
        int nextDouble2 = (int) (cVar.nextDouble() * 255.0d);
        int nextDouble3 = (int) (cVar.nextDouble() * 255.0d);
        while (cVar.hasNext()) {
            cVar.C();
        }
        cVar.n();
        return Color.argb(255, nextDouble, nextDouble2, nextDouble3);
    }

    public static PointF e(com.airbnb.lottie.parser.moshi.c cVar, float f10) {
        int i10 = a.$SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token[cVar.B().ordinal()];
        if (i10 == 1) {
            return b(cVar, f10);
        }
        if (i10 == 2) {
            return a(cVar, f10);
        }
        if (i10 == 3) {
            return c(cVar, f10);
        }
        throw new IllegalArgumentException("Unknown point starts with " + cVar.B());
    }

    public static List f(com.airbnb.lottie.parser.moshi.c cVar, float f10) {
        ArrayList arrayList = new ArrayList();
        cVar.p();
        while (cVar.B() == c.b.BEGIN_ARRAY) {
            cVar.p();
            arrayList.add(e(cVar, f10));
            cVar.n();
        }
        cVar.n();
        return arrayList;
    }

    public static float g(com.airbnb.lottie.parser.moshi.c cVar) {
        c.b B10 = cVar.B();
        int i10 = a.$SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token[B10.ordinal()];
        if (i10 == 1) {
            return (float) cVar.nextDouble();
        }
        if (i10 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + B10);
        }
        cVar.p();
        float nextDouble = (float) cVar.nextDouble();
        while (cVar.hasNext()) {
            cVar.C();
        }
        cVar.n();
        return nextDouble;
    }
}
