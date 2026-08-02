package defpackage;

import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zzier;
import com.google.android.gms.internal.ads.zzifa;
import com.google.android.gms.internal.ads.zzifm;
import com.google.android.gms.internal.ads.zzifq;
import com.google.android.gms.internal.ads.zzigw;
import com.google.android.gms.internal.ads.zzigx;
import com.google.android.gms.internal.ads.zziin;
import com.google.android.gms.internal.ads.zziio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vpo {
    public static final vpo d = new vpo(0);
    public final oqo a = new oqo();
    public boolean b;
    public boolean c;

    public vpo(int i) {
        a();
        a();
    }

    public static void e(zzier zzierVar, zziin zziinVar, int i, Object obj) {
        if (zziinVar == zziin.d) {
            zzierVar.e(i, 3);
            ((zzigw) obj).c(zzierVar);
            zzierVar.e(i, 4);
            return;
        }
        zzierVar.e(i, zziinVar.b);
        zziio zziioVar = zziio.a;
        switch (zziinVar.ordinal()) {
            case 0:
                zzierVar.x(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzierVar.v(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzierVar.w(((Long) obj).longValue());
                break;
            case 3:
                zzierVar.w(((Long) obj).longValue());
                break;
            case 4:
                zzierVar.t(((Integer) obj).intValue());
                break;
            case 5:
                zzierVar.x(((Long) obj).longValue());
                break;
            case 6:
                zzierVar.v(((Integer) obj).intValue());
                break;
            case 7:
                zzierVar.s(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zziei)) {
                    zzierVar.y((String) obj);
                    break;
                } else {
                    zzierVar.n((zziei) obj);
                    break;
                }
            case 9:
                ((zzigw) obj).c(zzierVar);
                break;
            case 10:
                zzierVar.r((zzigw) obj);
                break;
            case 11:
                if (!(obj instanceof zziei)) {
                    byte[] bArr = (byte[]) obj;
                    zzierVar.o(bArr.length, bArr);
                    break;
                } else {
                    zzierVar.n((zziei) obj);
                    break;
                }
            case 12:
                zzierVar.u(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzifq)) {
                    zzierVar.t(((Integer) obj).intValue());
                    break;
                } else {
                    zzierVar.t(((zzifq) obj).zza());
                    break;
                }
            case 14:
                zzierVar.v(((Integer) obj).intValue());
                break;
            case 15:
                zzierVar.x(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                zzierVar.u((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                zzierVar.w((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    public static int f(zziin zziinVar, int i, Object obj) {
        int b = zzier.b(i << 3);
        if (zziinVar == zziin.d) {
            b += b;
        }
        return g(zziinVar, obj) + b;
    }

    public static int g(zziin zziinVar, Object obj) {
        int F;
        int b;
        zziin zziinVar2 = zziin.c;
        zziio zziioVar = zziio.a;
        switch (zziinVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return zzier.c(((Long) obj).longValue());
            case 3:
                return zzier.c(((Long) obj).longValue());
            case 4:
                return zzier.c(((Integer) obj).intValue());
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
                if (!(obj instanceof zziei)) {
                    int i = tqo.a;
                    F = g7a.F((String) obj);
                    b = zzier.b(F);
                    break;
                } else {
                    F = ((zziei) obj).o();
                    b = zzier.b(F);
                    break;
                }
            case 9:
                return ((zzigw) obj).f();
            case 10:
                if (!(obj instanceof zpo)) {
                    F = ((zzigw) obj).f();
                    b = zzier.b(F);
                    break;
                } else {
                    zpo zpoVar = (zpo) obj;
                    F = zpoVar.b != null ? zpoVar.b.o() : zpoVar.c.f();
                    b = zzier.b(F);
                    break;
                }
            case 11:
                if (!(obj instanceof zziei)) {
                    F = ((byte[]) obj).length;
                    b = zzier.b(F);
                    break;
                } else {
                    F = ((zziei) obj).o();
                    b = zzier.b(F);
                    break;
                }
            case 12:
                return zzier.b(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzifq ? zzier.c(((zzifq) obj).zza()) : zzier.c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zzier.b((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zzier.c((longValue >> 63) ^ (longValue + longValue));
            default:
                cp4.h("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return b + F;
    }

    public static int h(zzifa zzifaVar, Object obj) {
        zziin zzb = zzifaVar.zzb();
        int zza = zzifaVar.zza();
        if (!zzifaVar.zzd()) {
            return f(zzb, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zzifaVar.zze()) {
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
        return zzier.b(i3) + zzier.b(zza << 3) + i3;
    }

    public static boolean i(Map.Entry entry) {
        boolean z;
        zzifa zzifaVar = (zzifa) entry.getKey();
        if (zzifaVar.zzc() == zziio.i) {
            if (!zzifaVar.zzd()) {
                Object value = entry.getValue();
                if (value instanceof zzigx) {
                    return ((zzigx) value).a();
                }
                if (value instanceof zpo) {
                    return true;
                }
                a70.p("Wrong object type used with protocol message reflection.");
                return false;
            }
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (obj instanceof zzigx) {
                    z = ((zzigx) obj).a();
                } else {
                    if (!(obj instanceof zpo)) {
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
        int b2;
        zzifa zzifaVar = (zzifa) entry.getKey();
        Object value = entry.getValue();
        if (zzifaVar.zzc() != zziio.i || zzifaVar.zzd() || zzifaVar.zze()) {
            return h(zzifaVar, value);
        }
        if (value instanceof zpo) {
            zpo zpoVar = (zpo) value;
            int zza = ((zzifa) entry.getKey()).zza();
            int b3 = zzier.b(8);
            i = b3 + b3;
            b = zzier.b(zza) + zzier.b(16);
            int b4 = zzier.b(24);
            int o = zpoVar.b != null ? zpoVar.b.o() : zpoVar.c.f();
            b2 = ceo.b(o, o, b4);
        } else {
            int zza2 = ((zzifa) entry.getKey()).zza();
            int b5 = zzier.b(8);
            i = b5 + b5;
            b = zzier.b(zza2) + zzier.b(16);
            int b6 = zzier.b(24);
            int f = ((zzigw) value).f();
            b2 = ceo.b(f, f, b6);
        }
        return i + b + b2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void k(zzifa zzifaVar, Object obj) {
        boolean z;
        zziin zzb = zzifaVar.zzb();
        obj.getClass();
        zziin zziinVar = zziin.c;
        zziio zziioVar = zziio.a;
        switch (zzb.a.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzifaVar.zza()), zzifaVar.zzb().a, obj.getClass().getName()});
                break;
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzifaVar.zza()), zzifaVar.zzb().a, obj.getClass().getName()});
                break;
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzifaVar.zza()), zzifaVar.zzb().a, obj.getClass().getName()});
                break;
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzifaVar.zza()), zzifaVar.zzb().a, obj.getClass().getName()});
                break;
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzifaVar.zza()), zzifaVar.zzb().a, obj.getClass().getName()});
                break;
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzifaVar.zza()), zzifaVar.zzb().a, obj.getClass().getName()});
                break;
            case 6:
                if ((obj instanceof zziei) || (obj instanceof byte[])) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzifaVar.zza()), zzifaVar.zzb().a, obj.getClass().getName()});
                break;
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzifq)) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzifaVar.zza()), zzifaVar.zzb().a, obj.getClass().getName()});
                break;
            case 8:
                if ((obj instanceof zzigw) || (obj instanceof zpo)) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzifaVar.zza()), zzifaVar.zzb().a, obj.getClass().getName()});
                break;
            default:
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzifaVar.zza()), zzifaVar.zzb().a, obj.getClass().getName()});
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        oqo oqoVar = this.a;
        int i = oqoVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = oqoVar.a(i2).b;
            if (obj instanceof zzifm) {
                ((zzifm) obj).u();
            }
        }
        Iterator it = oqoVar.c().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof zzifm) {
                ((zzifm) value).u();
            }
        }
        if (!oqoVar.d) {
            for (int i3 = 0; i3 < oqoVar.b; i3++) {
                pqo a = oqoVar.a(i3);
                if (a.a.zzd()) {
                    a.setValue(Collections.unmodifiableList((List) a.b));
                }
            }
            for (Map.Entry entry : oqoVar.c()) {
                if (((zzifa) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!oqoVar.d) {
            oqoVar.c = oqoVar.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(oqoVar.c);
            oqoVar.f = oqoVar.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(oqoVar.f);
            oqoVar.d = true;
        }
        this.b = true;
    }

    public final Iterator b() {
        oqo oqoVar = this.a;
        return oqoVar.isEmpty() ? Collections.emptyIterator() : this.c ? new uoa(((yg0) oqoVar.entrySet()).iterator(), 8) : ((yg0) oqoVar.entrySet()).iterator();
    }

    public final void c(zzifa zzifaVar, Object obj) {
        if (!zzifaVar.zzd()) {
            k(zzifaVar, obj);
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
                k(zzifaVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zpo) {
            this.c = true;
        }
        this.a.put(zzifaVar, obj);
    }

    public final Object clone() {
        vpo vpoVar = new vpo();
        oqo oqoVar = this.a;
        int i = oqoVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            pqo a = oqoVar.a(i2);
            vpoVar.c(a.a, a.b);
        }
        for (Map.Entry entry : oqoVar.c()) {
            vpoVar.c((zzifa) entry.getKey(), entry.getValue());
        }
        vpoVar.c = this.c;
        return vpoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        oqo oqoVar = this.a;
        int i = oqoVar.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                Iterator it = oqoVar.c().iterator();
                while (it.hasNext()) {
                    if (!i((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!i(oqoVar.a(i2))) {
                break;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vpo) {
            return this.a.equals(((vpo) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public vpo() {
    }
}
