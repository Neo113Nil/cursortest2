package com.google.android.gms.internal.auth;

import defpackage.a70;
import defpackage.nko;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class d {
    public static final Class a;
    public static final nko b;
    public static final nko c;

    static {
        Class<?> cls;
        Class<?> cls2;
        nko nkoVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                nkoVar = (nko) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = nkoVar;
        c = new nko();
    }

    public static void a(nko nkoVar, Object obj, Object obj2) {
        nkoVar.getClass();
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        zzha zzhaVar2 = ((zzev) obj2).zzc;
        zzha zzhaVar3 = zzha.e;
        if (!zzhaVar3.equals(zzhaVar2)) {
            if (zzhaVar3.equals(zzhaVar)) {
                int i = zzhaVar.a + zzhaVar2.a;
                int[] copyOf = Arrays.copyOf(zzhaVar.b, i);
                System.arraycopy(zzhaVar2.b, 0, copyOf, zzhaVar.a, zzhaVar2.a);
                Object[] copyOf2 = Arrays.copyOf(zzhaVar.c, i);
                System.arraycopy(zzhaVar2.c, 0, copyOf2, zzhaVar.a, zzhaVar2.a);
                zzhaVar = new zzha(i, copyOf, copyOf2, true);
            } else {
                zzhaVar.getClass();
                if (!zzhaVar2.equals(zzhaVar3)) {
                    if (!zzhaVar.d) {
                        a70.i();
                        return;
                    }
                    int i2 = zzhaVar.a + zzhaVar2.a;
                    zzhaVar.c(i2);
                    System.arraycopy(zzhaVar2.b, 0, zzhaVar.b, zzhaVar.a, zzhaVar2.a);
                    System.arraycopy(zzhaVar2.c, 0, zzhaVar.c, zzhaVar.a, zzhaVar2.a);
                    zzhaVar.a = i2;
                }
            }
        }
        zzevVar.zzc = zzhaVar;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
