package defpackage;

import com.google.android.gms.internal.wearable.zzcg;
import com.google.android.gms.internal.wearable.zzcn;
import com.google.android.gms.internal.wearable.zzcw;
import com.google.android.gms.internal.wearable.zzdg;
import com.google.android.gms.internal.wearable.zzdk;
import com.google.android.gms.internal.wearable.zzel;
import com.google.android.gms.internal.wearable.zzem;
import com.google.android.gms.internal.wearable.zzfv;
import com.google.android.gms.internal.wearable.zzfw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hxn {
    public static final hxn d = new hxn(0);
    public final i7o a = new i7o();
    public boolean b;
    public boolean c;

    public hxn(int i) {
        a();
        a();
    }

    public static int e(zzcw zzcwVar, Object obj) {
        zzcwVar.zzb();
        int zza = zzcwVar.zza();
        if (!zzcwVar.zzd()) {
            zzcn.r(zza << 3);
            zzfv[] zzfvVarArr = zzfv.b;
            zzfw zzfwVar = zzfw.a;
            throw null;
        }
        List list = (List) obj;
        int size = list.size();
        if (zzcwVar.zze()) {
            if (!list.isEmpty()) {
                if (size <= 0) {
                    return zzcn.r(0) + zzcn.r(zza << 3);
                }
                list.get(0);
                zzfv[] zzfvVarArr2 = zzfv.b;
                zzfw zzfwVar2 = zzfw.a;
                throw null;
            }
        } else if (size > 0) {
            list.get(0);
            zzcn.r(zza << 3);
            zzfv[] zzfvVarArr3 = zzfv.b;
            zzfw zzfwVar3 = zzfw.a;
            throw null;
        }
        return 0;
    }

    public static boolean f(Map.Entry entry) {
        boolean z;
        zzcw zzcwVar = (zzcw) entry.getKey();
        if (zzcwVar.zzc() == zzfw.i) {
            if (!zzcwVar.zzd()) {
                Object value = entry.getValue();
                if (value instanceof zzem) {
                    return ((zzem) value).c();
                }
                if (value instanceof n0o) {
                    return true;
                }
                a70.p("Wrong object type used with protocol message reflection.");
                return false;
            }
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (obj instanceof zzem) {
                    z = ((zzem) obj).c();
                } else {
                    if (!(obj instanceof n0o)) {
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

    public static final int g(Map.Entry entry) {
        zzcw zzcwVar = (zzcw) entry.getKey();
        Object value = entry.getValue();
        if (zzcwVar.zzc() != zzfw.i || zzcwVar.zzd() || zzcwVar.zze()) {
            return e(zzcwVar, value);
        }
        if (!(value instanceof n0o)) {
            int zza = ((zzcw) entry.getKey()).zza();
            int r = zzcn.r(8);
            int r2 = zzcn.r(zza) + zzcn.r(16);
            int r3 = zzcn.r(24);
            int zzT = ((zzel) value).zzT();
            return r + r + r2 + x5n.B(zzT, zzT, r3);
        }
        n0o n0oVar = (n0o) value;
        int zza2 = ((zzcw) entry.getKey()).zza();
        int r4 = zzcn.r(8);
        int i = r4 + r4;
        int r5 = zzcn.r(zza2) + zzcn.r(16);
        int r6 = zzcn.r(24);
        int d2 = n0oVar.c != null ? n0oVar.c.d() : n0oVar.d.zzT();
        return x5n.A(d2, d2, r6, i + r5);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void h(zzcw zzcwVar, Object obj) {
        boolean z;
        zzfv zzb = zzcwVar.zzb();
        obj.getClass();
        zzfv[] zzfvVarArr = zzfv.b;
        zzfw zzfwVar = zzfw.a;
        switch (zzb.a.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzcwVar.zza()), zzcwVar.zzb().a, obj.getClass().getName()});
                break;
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzcwVar.zza()), zzcwVar.zzb().a, obj.getClass().getName()});
                break;
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzcwVar.zza()), zzcwVar.zzb().a, obj.getClass().getName()});
                break;
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzcwVar.zza()), zzcwVar.zzb().a, obj.getClass().getName()});
                break;
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzcwVar.zza()), zzcwVar.zzb().a, obj.getClass().getName()});
                break;
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzcwVar.zza()), zzcwVar.zzb().a, obj.getClass().getName()});
                break;
            case 6:
                if ((obj instanceof zzcg) || (obj instanceof byte[])) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzcwVar.zza()), zzcwVar.zzb().a, obj.getClass().getName()});
                break;
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzdk)) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzcwVar.zza()), zzcwVar.zzb().a, obj.getClass().getName()});
                break;
            case 8:
                if ((obj instanceof zzel) || (obj instanceof n0o)) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzcwVar.zza()), zzcwVar.zzb().a, obj.getClass().getName()});
                break;
            default:
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzcwVar.zza()), zzcwVar.zzb().a, obj.getClass().getName()});
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        i7o i7oVar = this.a;
        int i = i7oVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = i7oVar.a(i2).b;
            if (obj instanceof zzdg) {
                zzdg zzdgVar = (zzdg) obj;
                d6o.c.a(zzdgVar.getClass()).c(zzdgVar);
                zzdgVar.h();
            }
        }
        Iterator it = i7oVar.c().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof zzdg) {
                zzdg zzdgVar2 = (zzdg) value;
                d6o.c.a(zzdgVar2.getClass()).c(zzdgVar2);
                zzdgVar2.h();
            }
        }
        if (!i7oVar.d) {
            for (int i3 = 0; i3 < i7oVar.b; i3++) {
                l7o a = i7oVar.a(i3);
                if (((zzcw) a.a).zzd()) {
                    a.setValue(Collections.unmodifiableList((List) a.b));
                }
            }
            for (Map.Entry entry : i7oVar.c()) {
                if (((zzcw) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!i7oVar.d) {
            i7oVar.c = i7oVar.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(i7oVar.c);
            i7oVar.f = i7oVar.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(i7oVar.f);
            i7oVar.d = true;
        }
        this.b = true;
    }

    public final Iterator b() {
        i7o i7oVar = this.a;
        return i7oVar.isEmpty() ? Collections.emptyIterator() : this.c ? new uoa(((yg0) i7oVar.entrySet()).iterator(), 5) : ((yg0) i7oVar.entrySet()).iterator();
    }

    public final void c(zzcw zzcwVar, Object obj) {
        if (!zzcwVar.zzd()) {
            h(zzcwVar, obj);
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
                h(zzcwVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof n0o) {
            this.c = true;
        }
        this.a.put(zzcwVar, obj);
    }

    public final Object clone() {
        hxn hxnVar = new hxn();
        i7o i7oVar = this.a;
        int i = i7oVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            l7o a = i7oVar.a(i2);
            hxnVar.c((zzcw) a.a, a.b);
        }
        for (Map.Entry entry : i7oVar.c()) {
            hxnVar.c((zzcw) entry.getKey(), entry.getValue());
        }
        hxnVar.c = this.c;
        return hxnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        i7o i7oVar = this.a;
        int i = i7oVar.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                Iterator it = i7oVar.c().iterator();
                while (it.hasNext()) {
                    if (!f((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!f(i7oVar.a(i2))) {
                break;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hxn) {
            return this.a.equals(((hxn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public hxn() {
    }
}
