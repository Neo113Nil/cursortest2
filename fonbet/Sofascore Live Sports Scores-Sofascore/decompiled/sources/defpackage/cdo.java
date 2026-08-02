package defpackage;

import com.google.android.gms.internal.play_billing.zzfp;
import com.google.android.gms.internal.play_billing.zzfx;
import com.google.android.gms.internal.play_billing.zzgg;
import com.google.android.gms.internal.play_billing.zzgp;
import com.google.android.gms.internal.play_billing.zzgr;
import com.google.android.gms.internal.play_billing.zzhr;
import com.google.android.gms.internal.play_billing.zzhs;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzjh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class cdo {
    public static final cdo d = new cdo(0);
    public final apo a = new apo();
    public boolean b;
    public boolean c;

    public cdo(int i) {
        e();
        e();
    }

    public static int a(zzjg zzjgVar, int i, Object obj) {
        int c = zzfx.c(i << 3);
        if (zzjgVar == zzjg.d) {
            c += c;
        }
        return b(zzjgVar, obj) + c;
    }

    public static int b(zzjg zzjgVar, Object obj) {
        int P;
        int c;
        zzjg zzjgVar2 = zzjg.c;
        zzjh zzjhVar = zzjh.a;
        switch (zzjgVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return zzfx.d(((Long) obj).longValue());
            case 3:
                return zzfx.d(((Long) obj).longValue());
            case 4:
                return zzfx.d(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                if (!(obj instanceof zzfp)) {
                    int i = aso.a;
                    P = i9a.P((String) obj);
                    c = zzfx.c(P);
                    break;
                } else {
                    P = ((zzfp) obj).m();
                    c = zzfx.c(P);
                    break;
                }
            case 9:
                return ((zzhr) obj).zzn();
            case 10:
                if (!(obj instanceof fjo)) {
                    P = ((zzhr) obj).zzn();
                    c = zzfx.c(P);
                    break;
                } else {
                    fjo fjoVar = (fjo) obj;
                    P = fjoVar.c != null ? fjoVar.c.m() : fjoVar.d.zzn();
                    c = zzfx.c(P);
                    break;
                }
            case 11:
                if (!(obj instanceof zzfp)) {
                    P = ((byte[]) obj).length;
                    c = zzfx.c(P);
                    break;
                } else {
                    P = ((zzfp) obj).m();
                    c = zzfx.c(P);
                    break;
                }
            case 12:
                return zzfx.c(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzgr ? zzfx.d(((zzgr) obj).zza()) : zzfx.d(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zzfx.c((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zzfx.d((longValue >> 63) ^ (longValue + longValue));
            default:
                cp4.h("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return c + P;
    }

    public static int c(zzgg zzggVar, Object obj) {
        zzjg zzb = zzggVar.zzb();
        int zza = zzggVar.zza();
        if (!zzggVar.zze()) {
            return a(zzb, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zzggVar.zzd()) {
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
        return zzfx.c(i3) + zzfx.c(zza << 3) + i3;
    }

    public static void g(eao eaoVar, zzjg zzjgVar, int i, Object obj) {
        if (zzjgVar == zzjg.d) {
            eaoVar.s(i, 3);
            ((zzhr) obj).a(eaoVar);
            eaoVar.s(i, 4);
            return;
        }
        eaoVar.s(i, zzjgVar.b);
        zzjh zzjhVar = zzjh.a;
        switch (zzjgVar.ordinal()) {
            case 0:
                eaoVar.m(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                eaoVar.k(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                eaoVar.w(((Long) obj).longValue());
                break;
            case 3:
                eaoVar.w(((Long) obj).longValue());
                break;
            case 4:
                eaoVar.o(((Integer) obj).intValue());
                break;
            case 5:
                eaoVar.m(((Long) obj).longValue());
                break;
            case 6:
                eaoVar.k(((Integer) obj).intValue());
                break;
            case 7:
                eaoVar.e(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzfp)) {
                    eaoVar.r((String) obj);
                    break;
                } else {
                    eaoVar.i((zzfp) obj);
                    break;
                }
            case 9:
                ((zzhr) obj).a(eaoVar);
                break;
            case 10:
                eaoVar.p((zzhr) obj);
                break;
            case 11:
                if (!(obj instanceof zzfp)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    eaoVar.u(length);
                    eaoVar.f(0, length, bArr);
                    break;
                } else {
                    eaoVar.i((zzfp) obj);
                    break;
                }
            case 12:
                eaoVar.u(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzgr)) {
                    eaoVar.o(((Integer) obj).intValue());
                    break;
                } else {
                    eaoVar.o(((zzgr) obj).zza());
                    break;
                }
            case 14:
                eaoVar.k(((Integer) obj).intValue());
                break;
            case 15:
                eaoVar.m(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                eaoVar.u((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                eaoVar.w((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    public static boolean i(Map.Entry entry) {
        boolean z;
        zzgg zzggVar = (zzgg) entry.getKey();
        if (zzggVar.zzc() == zzjh.i) {
            if (!zzggVar.zze()) {
                Object value = entry.getValue();
                if (value instanceof zzhs) {
                    return ((zzhs) value).zzo();
                }
                if (value instanceof fjo) {
                    return true;
                }
                a70.p("Wrong object type used with protocol message reflection.");
                return false;
            }
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (obj instanceof zzhs) {
                    z = ((zzhs) obj).zzo();
                } else {
                    if (!(obj instanceof fjo)) {
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
        int C;
        zzgg zzggVar = (zzgg) entry.getKey();
        Object value = entry.getValue();
        if (zzggVar.zzc() != zzjh.i || zzggVar.zze() || zzggVar.zzd()) {
            return c(zzggVar, value);
        }
        if (value instanceof fjo) {
            fjo fjoVar = (fjo) value;
            int zza = ((zzgg) entry.getKey()).zza();
            int c2 = zzfx.c(8);
            i = c2 + c2;
            c = zzfx.c(zza) + zzfx.c(16);
            int c3 = zzfx.c(24);
            int m = fjoVar.c != null ? fjoVar.c.m() : fjoVar.d.zzn();
            C = x5n.C(m, m, c3);
        } else {
            int zza2 = ((zzgg) entry.getKey()).zza();
            int c4 = zzfx.c(8);
            i = c4 + c4;
            c = zzfx.c(zza2) + zzfx.c(16);
            int c5 = zzfx.c(24);
            int zzn = ((zzhr) value).zzn();
            C = x5n.C(zzn, zzn, c5);
        }
        return i + c + C;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void k(zzgg zzggVar, Object obj) {
        boolean z;
        zzjg zzb = zzggVar.zzb();
        obj.getClass();
        zzjg zzjgVar = zzjg.c;
        zzjh zzjhVar = zzjh.a;
        switch (zzb.a.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzggVar.zza()), zzggVar.zzb().a, obj.getClass().getName()});
                break;
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzggVar.zza()), zzggVar.zzb().a, obj.getClass().getName()});
                break;
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzggVar.zza()), zzggVar.zzb().a, obj.getClass().getName()});
                break;
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzggVar.zza()), zzggVar.zzb().a, obj.getClass().getName()});
                break;
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzggVar.zza()), zzggVar.zzb().a, obj.getClass().getName()});
                break;
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzggVar.zza()), zzggVar.zzb().a, obj.getClass().getName()});
                break;
            case 6:
                if ((obj instanceof zzfp) || (obj instanceof byte[])) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzggVar.zza()), zzggVar.zzb().a, obj.getClass().getName()});
                break;
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzgr)) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzggVar.zza()), zzggVar.zzb().a, obj.getClass().getName()});
                break;
            case 8:
                if ((obj instanceof zzhr) || (obj instanceof fjo)) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzggVar.zza()), zzggVar.zzb().a, obj.getClass().getName()});
                break;
            default:
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzggVar.zza()), zzggVar.zzb().a, obj.getClass().getName()});
                break;
        }
    }

    public final Object clone() {
        cdo cdoVar = new cdo();
        apo apoVar = this.a;
        int i = apoVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            fpo d2 = apoVar.d(i2);
            cdoVar.f(d2.a, d2.b);
        }
        for (Map.Entry entry : apoVar.a()) {
            cdoVar.f((zzgg) entry.getKey(), entry.getValue());
        }
        cdoVar.c = this.c;
        return cdoVar;
    }

    public final Iterator d() {
        apo apoVar = this.a;
        return apoVar.isEmpty() ? Collections.emptyIterator() : this.c ? new uoa(((yg0) apoVar.entrySet()).iterator(), 6) : ((yg0) apoVar.entrySet()).iterator();
    }

    public final void e() {
        if (this.b) {
            return;
        }
        apo apoVar = this.a;
        int i = apoVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = apoVar.d(i2).b;
            if (obj instanceof zzgp) {
                ((zzgp) obj).o();
            }
        }
        Iterator it = apoVar.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof zzgp) {
                ((zzgp) value).o();
            }
        }
        if (!apoVar.d) {
            for (int i3 = 0; i3 < apoVar.b; i3++) {
                fpo d2 = apoVar.d(i3);
                if (d2.a.zze()) {
                    d2.setValue(Collections.unmodifiableList((List) d2.b));
                }
            }
            for (Map.Entry entry : apoVar.a()) {
                if (((zzgg) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!apoVar.d) {
            apoVar.c = apoVar.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(apoVar.c);
            apoVar.f = apoVar.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(apoVar.f);
            apoVar.d = true;
        }
        this.b = true;
    }

    public final boolean equals(Object obj) {
        Object value;
        Object obj2;
        if (this != obj) {
            if (obj instanceof cdo) {
                apo apoVar = ((cdo) obj).a;
                apo apoVar2 = this.a;
                if (apoVar2.size() == apoVar.size() && apoVar2.keySet().equals(apoVar.keySet())) {
                    Iterator it = ((yg0) apoVar2.entrySet()).iterator();
                    do {
                        bmh bmhVar = (bmh) it;
                        if (bmhVar.hasNext()) {
                            Map.Entry entry = (Map.Entry) bmhVar.next();
                            Object key = entry.getKey();
                            value = entry.getValue();
                            obj2 = apoVar.get(key);
                        }
                    } while (value == obj2 ? true : (value == null || obj2 == null) ? false : value instanceof fjo ? value.equals(obj2) : obj2 instanceof fjo ? obj2.equals(value) : value.equals(obj2));
                }
            }
            return false;
        }
        return true;
    }

    public final void f(zzgg zzggVar, Object obj) {
        if (!zzggVar.zze()) {
            k(zzggVar, obj);
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
                k(zzggVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof fjo) {
            this.c = true;
        }
        this.a.put(zzggVar, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h() {
        apo apoVar = this.a;
        int i = apoVar.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                Iterator it = apoVar.a().iterator();
                while (it.hasNext()) {
                    if (!i((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!i(apoVar.d(i2))) {
                break;
            }
            i2++;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public cdo() {
    }
}
