package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzqj;
import com.google.android.gms.internal.consent_sdk.zzqm;
import defpackage.a70;
import defpackage.d6p;
import defpackage.g5p;
import defpackage.ljg;
import defpackage.muo;
import defpackage.sw9;
import defpackage.vp2;
import defpackage.w4p;
import defpackage.yhk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzqm<MessageType extends zzqm<MessageType, BuilderType>, BuilderType extends zzqj<MessageType, BuilderType>> extends zzpa<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzsq zzc = zzsq.e;

    public static final boolean g(zzqm zzqmVar, boolean z) {
        byte byteValue = ((Byte) zzqmVar.f(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b = w4p.c.a(zzqmVar.getClass()).b(zzqmVar);
        if (z) {
            zzqmVar.f(2);
        }
        return b;
    }

    public static zzqm i(Class cls) {
        Map map = zzb;
        zzqm zzqmVar = (zzqm) map.get(cls);
        if (zzqmVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzqmVar = (zzqm) map.get(cls);
            } catch (ClassNotFoundException e) {
                sw9.m("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzqmVar != null) {
            return zzqmVar;
        }
        try {
            zzqm zzqmVar2 = (zzqm) ((zzqm) d6p.a.allocateInstance(cls)).f(6);
            if (zzqmVar2 != null) {
                map.put(cls, zzqmVar2);
                return zzqmVar2;
            }
            defpackage.zzl.s();
            return null;
        } catch (InstantiationException e2) {
            yhk.q(e2);
            return null;
        }
    }

    public static Object j(Method method, zzqm zzqmVar, Object... objArr) {
        try {
            return method.invoke(zzqmVar, objArr);
        } catch (IllegalAccessException e) {
            vp2.e("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            vp2.e("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static void m(Class cls, zzqm zzqmVar) {
        zzqmVar.l();
        zzb.put(cls, zzqmVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    public final void a(zzpv zzpvVar) {
        g5p a = w4p.c.a(getClass());
        muo muoVar = zzpvVar.a;
        if (muoVar == null) {
            muoVar = new muo(zzpvVar);
        }
        a.e(this, muoVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpa
    public final int c(g5p g5pVar) {
        if (e()) {
            int f = g5pVar.f(this);
            if (f >= 0) {
                return f;
            }
            a70.r(ljg.j(f, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int f2 = g5pVar.f(this);
        if (f2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | f2;
            return f2;
        }
        a70.r(ljg.j(f2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final void d() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean e() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return w4p.c.a(getClass()).g(this, (zzqm) obj);
    }

    public abstract Object f(int i);

    public final zzqj h() {
        return (zzqj) f(5);
    }

    public final int hashCode() {
        if (e()) {
            return w4p.c.a(getClass()).d(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int d = w4p.c.a(getClass()).d(this);
        this.zza = d;
        return d;
    }

    public final void k() {
        w4p.c.a(getClass()).c(this);
        l();
    }

    public final void l() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = c.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        c.c(this, sb, 0);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrr
    public final /* synthetic */ zzqm zzl() {
        return (zzqm) f(6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    public final int zzn() {
        if (e()) {
            int f = w4p.c.a(getClass()).f(this);
            if (f >= 0) {
                return f;
            }
            a70.r(ljg.j(f, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int f2 = w4p.c.a(getClass()).f(this);
        if (f2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | f2;
            return f2;
        }
        a70.r(ljg.j(f2, "serialized size must be non-negative, was "));
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrr
    public final boolean zzo() {
        return g(this, true);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    public final /* synthetic */ zzqj zzu() {
        return (zzqj) f(5);
    }
}
