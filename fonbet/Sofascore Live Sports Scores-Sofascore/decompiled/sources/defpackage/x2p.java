package defpackage;

import com.google.android.gms.internal.consent_sdk.zzpm;
import com.google.android.gms.internal.consent_sdk.zzpv;
import com.google.android.gms.internal.consent_sdk.zzqe;
import com.google.android.gms.internal.consent_sdk.zzqm;
import com.google.android.gms.internal.consent_sdk.zzqo;
import com.google.android.gms.internal.consent_sdk.zzqs;
import com.google.android.gms.internal.consent_sdk.zzqz;
import com.google.android.gms.internal.consent_sdk.zzrq;
import com.google.android.gms.internal.consent_sdk.zzrr;
import com.google.android.gms.internal.consent_sdk.zzsz;
import com.google.android.gms.internal.consent_sdk.zzta;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x2p {
    public static final x2p d = new x2p(0);
    public final k5p a = new k5p();
    public boolean b;
    public boolean c;

    public x2p(int i) {
        e();
        e();
    }

    public static int a(zzsz zzszVar, int i, Object obj) {
        int c = zzpv.c(i << 3);
        if (zzszVar == zzsz.e) {
            c += c;
        }
        return b(zzszVar, obj) + c;
    }

    public static int b(zzsz zzszVar, Object obj) {
        int m;
        int c;
        zzsz zzszVar2 = zzsz.c;
        zzta zztaVar = zzta.a;
        switch (zzszVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = zzpv.b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = zzpv.b;
                return 4;
            case 2:
                return zzpv.d(((Long) obj).longValue());
            case 3:
                return zzpv.d(((Long) obj).longValue());
            case 4:
                return zzpv.d(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = zzpv.b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = zzpv.b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = zzpv.b;
                return 1;
            case 8:
                if (!(obj instanceof zzpm)) {
                    return zzpv.b((String) obj);
                }
                Logger logger6 = zzpv.b;
                m = ((zzpm) obj).m();
                c = zzpv.c(m);
                break;
            case 9:
                return ((zzrq) obj).zzn();
            case 10:
                if (!(obj instanceof zzqz)) {
                    Logger logger7 = zzpv.b;
                    m = ((zzrq) obj).zzn();
                    c = zzpv.c(m);
                    break;
                } else {
                    m = ((zzqz) obj).a();
                    c = zzpv.c(m);
                    break;
                }
            case 11:
                if (!(obj instanceof zzpm)) {
                    Logger logger8 = zzpv.b;
                    m = ((byte[]) obj).length;
                    c = zzpv.c(m);
                    break;
                } else {
                    Logger logger9 = zzpv.b;
                    m = ((zzpm) obj).m();
                    c = zzpv.c(m);
                    break;
                }
            case 12:
                return zzpv.c(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzqo ? zzpv.d(((zzqo) obj).zza()) : zzpv.d(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger10 = zzpv.b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger11 = zzpv.b;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zzpv.c((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zzpv.d((longValue >> 63) ^ (longValue + longValue));
            default:
                cp4.h("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return c + m;
    }

    public static int c(zzqe zzqeVar, Object obj) {
        zzsz zzb = zzqeVar.zzb();
        int zza = zzqeVar.zza();
        if (!zzqeVar.zze()) {
            return a(zzb, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zzqeVar.zzd()) {
            int i2 = 0;
            while (i < size) {
                i2 += a(zzb, zza, list.get(i));
                i++;
            }
            return i2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i3 = 0;
        while (i < size) {
            i3 += b(zzb, list.get(i));
            i++;
        }
        return zzpv.c(i3) + zzpv.c(zza << 3) + i3;
    }

    public static void g(zzpv zzpvVar, zzsz zzszVar, int i, Object obj) {
        if (zzszVar == zzsz.e) {
            zzpvVar.v(i, 3);
            ((zzrq) obj).a(zzpvVar);
            zzpvVar.v(i, 4);
            return;
        }
        zzpvVar.v(i, zzszVar.b);
        zzta zztaVar = zzta.a;
        switch (zzszVar.ordinal()) {
            case 0:
                zzpvVar.n(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzpvVar.l(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzpvVar.z(((Long) obj).longValue());
                break;
            case 3:
                zzpvVar.z(((Long) obj).longValue());
                break;
            case 4:
                zzpvVar.p(((Integer) obj).intValue());
                break;
            case 5:
                zzpvVar.n(((Long) obj).longValue());
                break;
            case 6:
                zzpvVar.l(((Integer) obj).intValue());
                break;
            case 7:
                zzpvVar.f(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzpm)) {
                    zzpvVar.u((String) obj);
                    break;
                } else {
                    zzpvVar.j((zzpm) obj);
                    break;
                }
            case 9:
                ((zzrq) obj).a(zzpvVar);
                break;
            case 10:
                zzpvVar.q((zzrq) obj);
                break;
            case 11:
                if (!(obj instanceof zzpm)) {
                    byte[] bArr = (byte[]) obj;
                    zzpvVar.h(bArr.length, bArr);
                    break;
                } else {
                    zzpvVar.j((zzpm) obj);
                    break;
                }
            case 12:
                zzpvVar.x(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzqo)) {
                    zzpvVar.p(((Integer) obj).intValue());
                    break;
                } else {
                    zzpvVar.p(((zzqo) obj).zza());
                    break;
                }
            case 14:
                zzpvVar.l(((Integer) obj).intValue());
                break;
            case 15:
                zzpvVar.n(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                zzpvVar.x((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                zzpvVar.z((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    public static boolean i(Map.Entry entry) {
        boolean z;
        zzqe zzqeVar = (zzqe) entry.getKey();
        if (zzqeVar.zzc() == zzta.i) {
            if (!zzqeVar.zze()) {
                Object value = entry.getValue();
                if (value instanceof zzrr) {
                    return ((zzrr) value).zzo();
                }
                if (value instanceof zzqz) {
                    return true;
                }
                a70.p("Wrong object type used with protocol message reflection.");
                return false;
            }
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (obj instanceof zzrr) {
                    z = ((zzrr) obj).zzo();
                } else {
                    if (!(obj instanceof zzqz)) {
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
        int c;
        int h;
        zzqe zzqeVar = (zzqe) entry.getKey();
        Object value = entry.getValue();
        if (zzqeVar.zzc() != zzta.i || zzqeVar.zze() || zzqeVar.zzd()) {
            return c(zzqeVar, value);
        }
        if (value instanceof zzqz) {
            int zza = ((zzqe) entry.getKey()).zza();
            int c2 = zzpv.c(8);
            i = c2 + c2;
            c = zzpv.c(zza) + zzpv.c(16);
            int c3 = zzpv.c(24);
            int a = ((zzqz) value).a();
            h = ceo.h(a, a, c3);
        } else {
            int zza2 = ((zzqe) entry.getKey()).zza();
            int c4 = zzpv.c(8);
            i = c4 + c4;
            c = zzpv.c(zza2) + zzpv.c(16);
            int c5 = zzpv.c(24);
            int zzn = ((zzrq) value).zzn();
            h = ceo.h(zzn, zzn, c5);
        }
        return i + c + h;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void k(zzqe zzqeVar, Object obj) {
        boolean z;
        zzsz zzb = zzqeVar.zzb();
        Charset charset = zzqs.a;
        obj.getClass();
        zzsz zzszVar = zzsz.c;
        zzta zztaVar = zzta.a;
        switch (zzb.a.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().a, obj.getClass().getName()});
                break;
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().a, obj.getClass().getName()});
                break;
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().a, obj.getClass().getName()});
                break;
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().a, obj.getClass().getName()});
                break;
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().a, obj.getClass().getName()});
                break;
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().a, obj.getClass().getName()});
                break;
            case 6:
                if ((obj instanceof zzpm) || (obj instanceof byte[])) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().a, obj.getClass().getName()});
                break;
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzqo)) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().a, obj.getClass().getName()});
                break;
            case 8:
                if ((obj instanceof zzrq) || (obj instanceof zzqz)) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().a, obj.getClass().getName()});
                break;
            default:
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().a, obj.getClass().getName()});
                break;
        }
    }

    public final Object clone() {
        x2p x2pVar = new x2p();
        k5p k5pVar = this.a;
        int i = k5pVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            m5p d2 = k5pVar.d(i2);
            x2pVar.f((zzqe) d2.a, d2.b);
        }
        for (Map.Entry entry : k5pVar.a()) {
            x2pVar.f((zzqe) entry.getKey(), entry.getValue());
        }
        x2pVar.c = this.c;
        return x2pVar;
    }

    public final Iterator d() {
        k5p k5pVar = this.a;
        return k5pVar.isEmpty() ? Collections.emptyIterator() : this.c ? new uoa(((yg0) k5pVar.entrySet()).iterator(), 9) : ((yg0) k5pVar.entrySet()).iterator();
    }

    public final void e() {
        if (this.b) {
            return;
        }
        k5p k5pVar = this.a;
        int i = k5pVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = k5pVar.d(i2).b;
            if (obj instanceof zzqm) {
                ((zzqm) obj).k();
            }
        }
        Iterator it = k5pVar.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof zzqm) {
                ((zzqm) value).k();
            }
        }
        if (!k5pVar.d) {
            for (int i3 = 0; i3 < k5pVar.b; i3++) {
                m5p d2 = k5pVar.d(i3);
                if (((zzqe) d2.a).zze()) {
                    d2.setValue(Collections.unmodifiableList((List) d2.b));
                }
            }
            for (Map.Entry entry : k5pVar.a()) {
                if (((zzqe) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!k5pVar.d) {
            k5pVar.c = k5pVar.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(k5pVar.c);
            k5pVar.f = k5pVar.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(k5pVar.f);
            k5pVar.d = true;
        }
        this.b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x2p) {
            return this.a.equals(((x2p) obj).a);
        }
        return false;
    }

    public final void f(zzqe zzqeVar, Object obj) {
        if (!zzqeVar.zze()) {
            k(zzqeVar, obj);
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
                k(zzqeVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzqz) {
            this.c = true;
        }
        this.a.put(zzqeVar, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h() {
        k5p k5pVar = this.a;
        int i = k5pVar.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                Iterator it = k5pVar.a().iterator();
                while (it.hasNext()) {
                    if (!i((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!i(k5pVar.d(i2))) {
                break;
            }
            i2++;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public x2p() {
    }
}
