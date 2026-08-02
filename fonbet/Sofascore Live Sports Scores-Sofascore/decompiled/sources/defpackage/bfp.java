package defpackage;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class bfp extends wep {
    public static final HashMap e;
    public final Constructor b;
    public final Object[] c;
    public final HashMap d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        e = hashMap;
    }

    public bfp(Class cls, zep zepVar, boolean z) {
        super(zepVar);
        this.d = new HashMap();
        vha vhaVar = f6n.a;
        Constructor R = vhaVar.R(cls);
        this.b = R;
        if (z) {
            cfp.b(null, R);
        } else {
            f6n.a(R);
        }
        String[] Q = vhaVar.Q(cls);
        for (int i = 0; i < Q.length; i++) {
            this.d.put(Q[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.b.getParameterTypes();
        this.c = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.c[i2] = e.get(parameterTypes[i2]);
        }
    }

    @Override // defpackage.wep
    public final /* bridge */ /* synthetic */ Object a() {
        return (Object[]) this.c.clone();
    }

    @Override // defpackage.wep
    public final void b(Object obj, e7n e7nVar, sep sepVar) {
        String str = sepVar.c;
        Object[] objArr = (Object[]) obj;
        Integer num = (Integer) this.d.get(str);
        if (num == null) {
            String d = f6n.d(this.b);
            int length = d.length();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + length + 68 + Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE);
            bf3.v(sb, "Could not find the index in the constructor '", d, "' for field with name '", str);
            zzl.m(sb, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
            return;
        }
        int intValue = num.intValue();
        Object read = sepVar.g.read(e7nVar);
        if (read == null && sepVar.h) {
            String I0 = e7nVar.I0();
            throw new fb3(fc6.o(new StringBuilder(fn0.c(80, str) + I0.length()), "null is not allowed as value for record component '", str, "' of primitive type; at path ", I0), 16);
        }
        objArr[intValue] = read;
    }

    @Override // defpackage.wep
    public final Object c(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e2) {
            vha vhaVar = f6n.a;
            vp2.e("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
            return null;
        } catch (IllegalArgumentException e3) {
            e = e3;
            String d = f6n.d(constructor);
            String arrays = Arrays.toString(objArr);
            vp2.e(fc6.o(new StringBuilder(d.length() + 42 + String.valueOf(arrays).length()), "Failed to invoke constructor '", d, "' with args ", arrays), e);
            return null;
        } catch (InstantiationException e4) {
            e = e4;
            String d2 = f6n.d(constructor);
            String arrays2 = Arrays.toString(objArr);
            vp2.e(fc6.o(new StringBuilder(d2.length() + 42 + String.valueOf(arrays2).length()), "Failed to invoke constructor '", d2, "' with args ", arrays2), e);
            return null;
        } catch (InvocationTargetException e5) {
            String d3 = f6n.d(constructor);
            String arrays3 = Arrays.toString(objArr);
            vp2.e(fc6.o(new StringBuilder(d3.length() + 42 + String.valueOf(arrays3).length()), "Failed to invoke constructor '", d3, "' with args ", arrays3), e5.getCause());
            return null;
        }
    }
}
