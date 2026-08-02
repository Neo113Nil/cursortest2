package com.facebook.shimmer;

import android.content.res.TypedArray;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.ljg;
import defpackage.sw9;
import defpackage.vxd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b {
    public final c a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(int i) {
        this((byte) 0);
        this.b = i;
        switch (i) {
            case 1:
                this((byte) 0);
                break;
            default:
                this.a.p = true;
                break;
        }
    }

    public final c a() {
        c cVar = this.a;
        int i = cVar.f;
        int[] iArr = cVar.b;
        if (i != 1) {
            int i2 = cVar.e;
            iArr[0] = i2;
            int i3 = cVar.d;
            iArr[1] = i3;
            iArr[2] = i3;
            iArr[3] = i2;
        } else {
            int i4 = cVar.d;
            iArr[0] = i4;
            iArr[1] = i4;
            int i5 = cVar.e;
            iArr[2] = i5;
            iArr[3] = i5;
        }
        float[] fArr = cVar.a;
        if (i != 1) {
            fArr[0] = Math.max(((1.0f - cVar.k) - cVar.l) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            fArr[1] = Math.max(((1.0f - cVar.k) - 0.001f) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            fArr[2] = Math.min(((cVar.k + 1.0f) + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min(((cVar.k + 1.0f) + cVar.l) / 2.0f, 1.0f);
            return cVar;
        }
        fArr[0] = 0.0f;
        fArr[1] = Math.min(cVar.k, 1.0f);
        fArr[2] = Math.min(cVar.k + cVar.l, 1.0f);
        fArr[3] = 1.0f;
        return cVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:97:0x01b5. Please report as an issue. */
    public final b b(TypedArray typedArray) {
        boolean hasValue = typedArray.hasValue(3);
        c cVar = this.a;
        if (hasValue) {
            cVar.n = typedArray.getBoolean(3, cVar.n);
        }
        if (typedArray.hasValue(0)) {
            cVar.o = typedArray.getBoolean(0, cVar.o);
        }
        if (typedArray.hasValue(1)) {
            cVar.e = (((int) (Math.min(1.0f, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (cVar.e & 16777215);
        }
        if (typedArray.hasValue(11)) {
            cVar.d = (((int) (Math.min(1.0f, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, typedArray.getFloat(11, 1.0f))) * 255.0f)) << 24) | (16777215 & cVar.d);
        }
        if (typedArray.hasValue(7)) {
            long j = typedArray.getInt(7, (int) cVar.s);
            if (j < 0) {
                a70.p(vxd.l(j, "Given a negative duration: "));
                return null;
            }
            cVar.s = j;
        }
        if (typedArray.hasValue(14)) {
            cVar.q = typedArray.getInt(14, cVar.q);
        }
        if (typedArray.hasValue(15)) {
            long j2 = typedArray.getInt(15, (int) cVar.t);
            if (j2 < 0) {
                a70.p(vxd.l(j2, "Given a negative repeat delay: "));
                return null;
            }
            cVar.t = j2;
        }
        if (typedArray.hasValue(16)) {
            cVar.r = typedArray.getInt(16, cVar.r);
        }
        if (typedArray.hasValue(5)) {
            int i = typedArray.getInt(5, cVar.c);
            if (i == 1) {
                cVar.c = 1;
            } else if (i == 2) {
                cVar.c = 2;
            } else if (i != 3) {
                cVar.c = 0;
            } else {
                cVar.c = 3;
            }
        }
        if (typedArray.hasValue(17)) {
            if (typedArray.getInt(17, cVar.f) != 1) {
                cVar.f = 0;
            } else {
                cVar.f = 1;
            }
        }
        if (typedArray.hasValue(6)) {
            float f = typedArray.getFloat(6, cVar.l);
            if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                sw9.k("Given invalid dropoff value: ", f);
                return null;
            }
            cVar.l = f;
        }
        if (typedArray.hasValue(9)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, cVar.g);
            if (dimensionPixelSize < 0) {
                a70.p(ljg.j(dimensionPixelSize, "Given invalid width: "));
                return null;
            }
            cVar.g = dimensionPixelSize;
        }
        if (typedArray.hasValue(8)) {
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, cVar.h);
            if (dimensionPixelSize2 < 0) {
                a70.p(ljg.j(dimensionPixelSize2, "Given invalid height: "));
                return null;
            }
            cVar.h = dimensionPixelSize2;
        }
        if (typedArray.hasValue(13)) {
            float f2 = typedArray.getFloat(13, cVar.k);
            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                sw9.k("Given invalid intensity value: ", f2);
                return null;
            }
            cVar.k = f2;
        }
        if (typedArray.hasValue(19)) {
            float f3 = typedArray.getFloat(19, cVar.i);
            if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                sw9.k("Given invalid width ratio: ", f3);
                return null;
            }
            cVar.i = f3;
        }
        if (typedArray.hasValue(10)) {
            float f4 = typedArray.getFloat(10, cVar.j);
            if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                sw9.k("Given invalid height ratio: ", f4);
                return null;
            }
            cVar.j = f4;
        }
        if (typedArray.hasValue(18)) {
            cVar.m = typedArray.getFloat(18, cVar.m);
        }
        switch (this.b) {
        }
        return this;
    }

    public b(byte b) {
        this.a = new c();
    }
}
