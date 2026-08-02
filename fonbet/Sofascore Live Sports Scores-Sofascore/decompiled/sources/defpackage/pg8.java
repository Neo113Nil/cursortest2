package defpackage;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class pg8 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile zwh b = new zwh(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.d(Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, new qg8(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.d(130, new qg8(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.d(150, new qg8(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.d(180, new qg8(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.d(200, new qg8(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            Unit unit = Unit.a;
        }
        if ((b.c(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        t3a.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static og8 a(float f) {
        float c2;
        og8 og8Var;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        zwh zwhVar = b;
        int i = (int) (f * 100.0f);
        zwhVar.getClass();
        og8 og8Var2 = (og8) gz8.C(zwhVar, i);
        if (og8Var2 != null) {
            return og8Var2;
        }
        zwh zwhVar2 = b;
        if (zwhVar2.a) {
            gz8.H(zwhVar2);
        }
        int h = kik.h(zwhVar2.d, i, zwhVar2.b);
        if (h >= 0) {
            return (og8) b.f(h);
        }
        int i2 = -(h + 1);
        int i3 = i2 - 1;
        if (i2 >= b.e()) {
            qg8 qg8Var = new qg8(new float[]{1.0f}, new float[]{f});
            b(f, qg8Var);
            return qg8Var;
        }
        if (i3 < 0) {
            og8Var = new qg8(fArr, fArr);
            c2 = 1.0f;
        } else {
            c2 = b.c(i3) / 100.0f;
            og8Var = (og8) b.f(i3);
        }
        float c3 = b.c(i2) / 100.0f;
        float max = (Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(1.0f, c2 == c3 ? 0.0f : (f - c2) / (c3 - c2))) * 1.0f) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        og8 og8Var3 = (og8) b.f(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float b2 = og8Var.b(f2);
            fArr2[i4] = ((og8Var3.b(f2) - b2) * max) + b2;
        }
        qg8 qg8Var2 = new qg8(fArr, fArr2);
        b(f, qg8Var2);
        return qg8Var2;
    }

    public static void b(float f, qg8 qg8Var) {
        synchronized (c) {
            zwh clone = b.clone();
            clone.d((int) (f * 100.0f), qg8Var);
            b = clone;
            Unit unit = Unit.a;
        }
    }
}
