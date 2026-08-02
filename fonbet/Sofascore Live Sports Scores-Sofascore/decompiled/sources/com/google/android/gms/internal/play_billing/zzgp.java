package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzgl;
import com.google.android.gms.internal.play_billing.zzgp;
import defpackage.a70;
import defpackage.d1l;
import defpackage.eao;
import defpackage.ljg;
import defpackage.nro;
import defpackage.o7o;
import defpackage.qoo;
import defpackage.sw9;
import defpackage.tg0;
import defpackage.vp2;
import defpackage.yhk;
import defpackage.zno;
import defpackage.zzl;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzgp<MessageType extends zzgp<MessageType, BuilderType>, BuilderType extends zzgl<MessageType, BuilderType>> extends zzfa<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzir zzc = zzir.f;

    public static void e(Class cls, zzgp zzgpVar) {
        zzgpVar.d();
        zzb.put(cls, zzgpVar);
    }

    public static final boolean h(zzgp zzgpVar, boolean z) {
        byte byteValue = ((Byte) zzgpVar.i(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c = zno.b.a(zzgpVar.getClass()).c(zzgpVar);
        if (z) {
            zzgpVar.i(2);
        }
        return c;
    }

    public static zzgp l(Class cls) {
        Map map = zzb;
        zzgp zzgpVar = (zzgp) map.get(cls);
        if (zzgpVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgpVar = (zzgp) map.get(cls);
            } catch (ClassNotFoundException e) {
                sw9.m("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzgpVar != null) {
            return zzgpVar;
        }
        try {
            zzgp zzgpVar2 = (zzgp) ((zzgp) nro.a.allocateInstance(cls)).i(6);
            if (zzgpVar2 != null) {
                map.put(cls, zzgpVar2);
                return zzgpVar2;
            }
            zzl.s();
            return null;
        } catch (InstantiationException e2) {
            yhk.q(e2);
            return null;
        }
    }

    public static zzgp m(zzgp zzgpVar, byte[] bArr) {
        int length = bArr.length;
        zzgc zzgcVar = zzgc.b;
        int i = o7o.a;
        zzgc zzgcVar2 = zzgc.b;
        if (length != 0) {
            zzgp zzgpVar2 = (zzgp) zzgpVar.i(4);
            try {
                qoo a = zno.b.a(zzgpVar2.getClass());
                a.e(zzgpVar2, bArr, 0, length, new tg0(zzgcVar2));
                a.a(zzgpVar2);
                zzgpVar = zzgpVar2;
            } catch (zzhb e) {
                throw e;
            } catch (zzip e2) {
                zzl.v(e2.getMessage());
                return null;
            } catch (IOException e3) {
                if (e3.getCause() instanceof zzhb) {
                    throw ((zzhb) e3.getCause());
                }
                throw new zzhb(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                zzl.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
        }
        if (zzgpVar == null || h(zzgpVar, true)) {
            return zzgpVar;
        }
        zzl.v(new zzip().getMessage());
        return null;
    }

    public static Object n(Method method, zzgp zzgpVar, Object... objArr) {
        try {
            return method.invoke(zzgpVar, objArr);
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

    @Override // com.google.android.gms.internal.play_billing.zzhr
    public final void a(eao eaoVar) {
        qoo a = zno.b.a(getClass());
        d1l d1lVar = eaoVar.a;
        if (d1lVar == null) {
            d1lVar = new d1l(eaoVar);
        }
        a.g(this, d1lVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfa
    public final int c(qoo qooVar) {
        if (g()) {
            int f = qooVar.f(this);
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
        int f2 = qooVar.f(this);
        if (f2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | f2;
            return f2;
        }
        a70.r(ljg.j(f2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final void d() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zno.b.a(getClass()).d(this, (zzgp) obj);
    }

    public final void f() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean g() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (g()) {
            return zno.b.a(getClass()).h(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int h = zno.b.a(getClass()).h(this);
        this.zza = h;
        return h;
    }

    public abstract Object i(int i);

    public final zzgl j() {
        return (zzgl) i(5);
    }

    public final zzgl k() {
        zzgl zzglVar = (zzgl) i(5);
        zzgp zzgpVar = zzglVar.a;
        if (!zzgpVar.getClass().isInstance(this)) {
            a70.p("mergeFrom(MessageLite) can only merge messages of the same type.");
            return null;
        }
        if (!zzgpVar.equals(this)) {
            if (!zzglVar.b.g()) {
                zzglVar.f();
            }
            zzgp zzgpVar2 = zzglVar.b;
            zno.b.a(zzgpVar2.getClass()).b(zzgpVar2, this);
        }
        return zzglVar;
    }

    public final void o() {
        zno.b.a(getClass()).a(this);
        d();
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

    @Override // com.google.android.gms.internal.play_billing.zzhs
    public final /* synthetic */ zzgp zzl() {
        return (zzgp) i(6);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhr
    public final int zzn() {
        if (g()) {
            int f = zno.b.a(getClass()).f(this);
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
        int f2 = zno.b.a(getClass()).f(this);
        if (f2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | f2;
            return f2;
        }
        a70.r(ljg.j(f2, "serialized size must be non-negative, was "));
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhs
    public final boolean zzo() {
        return h(this, true);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhr
    public final /* synthetic */ zzgl zzw() {
        return (zzgl) i(5);
    }
}
