package defpackage;

import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzada;
import com.google.android.gms.internal.measurement.zzadj;
import com.google.android.gms.internal.measurement.zzadu;
import com.google.android.gms.internal.measurement.zzady;
import com.google.android.gms.internal.measurement.zzael;
import com.google.android.gms.internal.measurement.zzafc;
import com.google.android.gms.internal.measurement.zzafd;
import com.google.android.gms.internal.measurement.zzagm;
import com.google.android.gms.internal.measurement.zzagn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gan {
    public static final gan d = new gan(0);
    public final rdn a = new rdn();
    public boolean b;
    public boolean c;

    public gan(int i) {
        a();
        a();
    }

    public static void e(zzada zzadaVar, zzagm zzagmVar, int i, Object obj) {
        if (zzagmVar == zzagm.d) {
            zzadaVar.f(i, 3);
            ((zzafc) obj).f(zzadaVar);
            zzadaVar.f(i, 4);
            return;
        }
        zzadaVar.f(i, zzagmVar.b);
        zzagn zzagnVar = zzagn.a;
        switch (zzagmVar.ordinal()) {
            case 0:
                zzadaVar.y(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzadaVar.w(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzadaVar.x(((Long) obj).longValue());
                break;
            case 3:
                zzadaVar.x(((Long) obj).longValue());
                break;
            case 4:
                zzadaVar.u(((Integer) obj).intValue());
                break;
            case 5:
                zzadaVar.y(((Long) obj).longValue());
                break;
            case 6:
                zzadaVar.w(((Integer) obj).intValue());
                break;
            case 7:
                zzadaVar.t(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzacr)) {
                    zzadaVar.z((String) obj);
                    break;
                } else {
                    zzadaVar.o((zzacr) obj);
                    break;
                }
            case 9:
                ((zzafc) obj).f(zzadaVar);
                break;
            case 10:
                zzadaVar.s((zzafc) obj);
                break;
            case 11:
                if (!(obj instanceof zzacr)) {
                    byte[] bArr = (byte[]) obj;
                    zzadaVar.p(bArr.length, bArr);
                    break;
                } else {
                    zzadaVar.o((zzacr) obj);
                    break;
                }
            case 12:
                zzadaVar.v(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzady)) {
                    zzadaVar.u(((Integer) obj).intValue());
                    break;
                } else {
                    zzadaVar.u(((zzady) obj).zza());
                    break;
                }
            case 14:
                zzadaVar.w(((Integer) obj).intValue());
                break;
            case 15:
                zzadaVar.y(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                zzadaVar.v((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                zzadaVar.x((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    public static int f(zzagm zzagmVar, int i, Object obj) {
        int b = zzada.b(i << 3);
        if (zzagmVar == zzagm.d) {
            b += b;
        }
        return g(zzagmVar, obj) + b;
    }

    public static int g(zzagm zzagmVar, Object obj) {
        int b;
        int b2;
        zzagm zzagmVar2 = zzagm.c;
        zzagn zzagnVar = zzagn.a;
        switch (zzagmVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                boolean z = zzada.b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                boolean z2 = zzada.b;
                return 4;
            case 2:
                return zzada.c(((Long) obj).longValue());
            case 3:
                return zzada.c(((Long) obj).longValue());
            case 4:
                return zzada.c(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                boolean z3 = zzada.b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                boolean z4 = zzada.b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                boolean z5 = zzada.b;
                return 1;
            case 8:
                if (!(obj instanceof zzacr)) {
                    boolean z6 = zzada.b;
                    b = ten.b((String) obj);
                    b2 = zzada.b(b);
                    break;
                } else {
                    boolean z7 = zzada.b;
                    b = ((zzacr) obj).d();
                    b2 = zzada.b(b);
                    break;
                }
            case 9:
                return ((zzafc) obj).e();
            case 10:
                if (!(obj instanceof zzael)) {
                    return zzada.d((zzafc) obj);
                }
                b = ((zzael) obj).a();
                b2 = zzada.b(b);
                break;
            case 11:
                if (!(obj instanceof zzacr)) {
                    boolean z8 = zzada.b;
                    b = ((byte[]) obj).length;
                    b2 = zzada.b(b);
                    break;
                } else {
                    boolean z9 = zzada.b;
                    b = ((zzacr) obj).d();
                    b2 = zzada.b(b);
                    break;
                }
            case 12:
                return zzada.b(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzady ? zzada.c(((zzady) obj).zza()) : zzada.c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                boolean z10 = zzada.b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                boolean z11 = zzada.b;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zzada.b((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zzada.c((longValue >> 63) ^ (longValue + longValue));
            default:
                cp4.h("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return b2 + b;
    }

    public static int h(zzadj zzadjVar, Object obj) {
        zzagm zzb = zzadjVar.zzb();
        int zza = zzadjVar.zza();
        if (!zzadjVar.zzd()) {
            return f(zzb, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zzadjVar.zze()) {
            int i2 = 0;
            while (i < size) {
                i2 += f(zzb, zza, list.get(i));
                i++;
            }
            return i2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i3 = 0;
        while (i < size) {
            i3 += g(zzb, list.get(i));
            i++;
        }
        return zzada.b(i3) + zzada.b(zza << 3) + i3;
    }

    public static boolean i(Map.Entry entry) {
        boolean z;
        zzadj zzadjVar = (zzadj) entry.getKey();
        if (zzadjVar.zzc() == zzagn.i) {
            if (!zzadjVar.zzd()) {
                Object value = entry.getValue();
                if (value instanceof zzafd) {
                    return ((zzafd) value).c();
                }
                if (value instanceof zzael) {
                    return true;
                }
                a70.p("Wrong object type used with protocol message reflection.");
                return false;
            }
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (obj instanceof zzafd) {
                    z = ((zzafd) obj).c();
                } else {
                    if (!(obj instanceof zzael)) {
                        a70.p("Wrong object type used with protocol message reflection.");
                        return false;
                    }
                    z = true;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final int j(Map.Entry entry) {
        int i;
        int b;
        int d2;
        zzadj zzadjVar = (zzadj) entry.getKey();
        Object value = entry.getValue();
        if (zzadjVar.zzc() != zzagn.i || zzadjVar.zzd() || zzadjVar.zze()) {
            return h(zzadjVar, value);
        }
        if (value instanceof zzael) {
            int zza = ((zzadj) entry.getKey()).zza();
            int b2 = zzada.b(8);
            i = b2 + b2;
            b = zzada.b(zza) + zzada.b(16);
            int b3 = zzada.b(24);
            int a = ((zzael) value).a();
            d2 = x5n.c(a, a, b3);
        } else {
            int zza2 = ((zzadj) entry.getKey()).zza();
            int b4 = zzada.b(8);
            i = b4 + b4;
            b = zzada.b(zza2) + zzada.b(16);
            d2 = zzada.d((zzafc) value) + zzada.b(24);
        }
        return i + b + d2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void k(zzadj zzadjVar, Object obj) {
        boolean z;
        zzagm zzb = zzadjVar.zzb();
        obj.getClass();
        zzagm zzagmVar = zzagm.c;
        zzagn zzagnVar = zzagn.a;
        switch (zzb.a.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().a, obj.getClass().getName()});
                break;
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().a, obj.getClass().getName()});
                break;
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().a, obj.getClass().getName()});
                break;
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().a, obj.getClass().getName()});
                break;
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().a, obj.getClass().getName()});
                break;
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().a, obj.getClass().getName()});
                break;
            case 6:
                if ((obj instanceof zzacr) || (obj instanceof byte[])) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().a, obj.getClass().getName()});
                break;
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzady)) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().a, obj.getClass().getName()});
                break;
            case 8:
                if ((obj instanceof zzafc) || (obj instanceof zzael)) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().a, obj.getClass().getName()});
                break;
            default:
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().a, obj.getClass().getName()});
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        rdn rdnVar = this.a;
        int i = rdnVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = rdnVar.a(i2).b;
            if (obj instanceof zzadu) {
                ((zzadu) obj).o();
            }
        }
        Iterator it = rdnVar.c().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof zzadu) {
                ((zzadu) value).o();
            }
        }
        if (!rdnVar.d) {
            for (int i3 = 0; i3 < rdnVar.b; i3++) {
                tdn a = rdnVar.a(i3);
                if (((zzadj) a.a).zzd()) {
                    a.setValue(Collections.unmodifiableList((List) a.b));
                }
            }
            for (Map.Entry entry : rdnVar.c()) {
                if (((zzadj) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!rdnVar.d) {
            rdnVar.c = rdnVar.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(rdnVar.c);
            rdnVar.f = rdnVar.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(rdnVar.f);
            rdnVar.d = true;
        }
        this.b = true;
    }

    public final Iterator b() {
        rdn rdnVar = this.a;
        return rdnVar.isEmpty() ? Collections.emptyIterator() : this.c ? new uoa(((yg0) rdnVar.entrySet()).iterator(), 2) : ((yg0) rdnVar.entrySet()).iterator();
    }

    public final void c(zzadj zzadjVar, Object obj) {
        if (!zzadjVar.zzd()) {
            k(zzadjVar, obj);
        } else {
            if (!(obj instanceof List)) {
                a70.p("Wrong object type used with protocol message reflection.");
                return;
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                k(zzadjVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzael) {
            this.c = true;
        }
        this.a.put(zzadjVar, obj);
    }

    public final Object clone() {
        gan ganVar = new gan();
        rdn rdnVar = this.a;
        int i = rdnVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            tdn a = rdnVar.a(i2);
            ganVar.c((zzadj) a.a, a.b);
        }
        for (Map.Entry entry : rdnVar.c()) {
            ganVar.c((zzadj) entry.getKey(), entry.getValue());
        }
        ganVar.c = this.c;
        return ganVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        rdn rdnVar = this.a;
        int i = rdnVar.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                Iterator it = rdnVar.c().iterator();
                while (it.hasNext()) {
                    if (!i((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!i(rdnVar.a(i2))) {
                break;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gan) {
            return this.a.equals(((gan) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public gan() {
    }
}
