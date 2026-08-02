package defpackage;

import com.google.android.gms.internal.cast.zzaan;
import com.google.android.gms.internal.cast.zzaao;
import com.google.android.gms.internal.cast.zzpm;
import com.google.android.gms.internal.cast.zzxk;
import com.google.android.gms.internal.cast.zzxp;
import com.google.android.gms.internal.cast.zzxv;
import com.google.android.gms.internal.cast.zzyd;
import com.google.android.gms.internal.cast.zzym;
import com.google.android.gms.internal.cast.zzys;
import com.google.android.gms.internal.cast.zzzi;
import com.google.android.gms.internal.cast.zzzj;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tcp {
    public static final tcp d = new tcp(0);
    public final ggp a = new ggp();
    public boolean b;
    public boolean c;

    public tcp(int i) {
        a();
        a();
    }

    public static int e(zzxv zzxvVar, Object obj) {
        zzxvVar.zzb();
        int zza = zzxvVar.zza();
        if (!zzxvVar.zzd()) {
            zzxp.s(zza << 3);
            zzaan[] zzaanVarArr = zzaan.b;
            zzaao zzaaoVar = zzaao.a;
            throw null;
        }
        List list = (List) obj;
        int size = list.size();
        if (zzxvVar.zze()) {
            if (!list.isEmpty()) {
                if (size <= 0) {
                    return zzxp.s(0) + zzxp.s(zza << 3);
                }
                list.get(0);
                zzaan[] zzaanVarArr2 = zzaan.b;
                zzaao zzaaoVar2 = zzaao.a;
                throw null;
            }
        } else if (size > 0) {
            list.get(0);
            zzxp.s(zza << 3);
            zzaan[] zzaanVarArr3 = zzaan.b;
            zzaao zzaaoVar3 = zzaao.a;
            throw null;
        }
        return 0;
    }

    public static boolean f(Map.Entry entry) {
        boolean z;
        zzxv zzxvVar = (zzxv) entry.getKey();
        if (zzxvVar.zzc() == zzaao.i) {
            if (!zzxvVar.zzd()) {
                Object value = entry.getValue();
                if (value instanceof zzzj) {
                    return ((zzzj) value).zzr();
                }
                if (value instanceof zzys) {
                    return true;
                }
                a70.p("Wrong object type used with protocol message reflection.");
                return false;
            }
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (obj instanceof zzzj) {
                    z = ((zzzj) obj).zzr();
                } else {
                    if (!(obj instanceof zzys)) {
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
        int i;
        int s;
        int j;
        zzxv zzxvVar = (zzxv) entry.getKey();
        Object value = entry.getValue();
        if (zzxvVar.zzc() != zzaao.i || zzxvVar.zzd() || zzxvVar.zze()) {
            return e(zzxvVar, value);
        }
        if (value instanceof zzys) {
            int zza = ((zzxv) entry.getKey()).zza();
            int s2 = zzxp.s(8);
            i = s2 + s2;
            s = zzxp.s(zza) + zzxp.s(16);
            int s3 = zzxp.s(24);
            int a = ((zzys) value).a();
            j = ceo.j(a, a, s3);
        } else {
            int zza2 = ((zzxv) entry.getKey()).zza();
            int s4 = zzxp.s(8);
            i = s4 + s4;
            s = zzxp.s(zza2) + zzxp.s(16);
            int s5 = zzxp.s(24);
            int zzE = ((zzzi) value).zzE();
            j = ceo.j(zzE, zzE, s5);
        }
        return i + s + j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void h(zzxv zzxvVar, Object obj) {
        boolean z;
        zzaan zzb = zzxvVar.zzb();
        Charset charset = zzym.a;
        obj.getClass();
        zzaan[] zzaanVarArr = zzaan.b;
        zzaao zzaaoVar = zzaao.a;
        switch (zzb.a.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzxvVar.zza()), zzxvVar.zzb().a, obj.getClass().getName()});
                break;
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzxvVar.zza()), zzxvVar.zzb().a, obj.getClass().getName()});
                break;
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzxvVar.zza()), zzxvVar.zzb().a, obj.getClass().getName()});
                break;
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzxvVar.zza()), zzxvVar.zzb().a, obj.getClass().getName()});
                break;
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzxvVar.zza()), zzxvVar.zzb().a, obj.getClass().getName()});
                break;
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzxvVar.zza()), zzxvVar.zzb().a, obj.getClass().getName()});
                break;
            case 6:
                if ((obj instanceof zzxk) || (obj instanceof byte[])) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzxvVar.zza()), zzxvVar.zzb().a, obj.getClass().getName()});
                break;
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzpm)) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzxvVar.zza()), zzxvVar.zzb().a, obj.getClass().getName()});
                break;
            case 8:
                if ((obj instanceof zzzi) || (obj instanceof zzys)) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzxvVar.zza()), zzxvVar.zzb().a, obj.getClass().getName()});
                break;
            default:
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzxvVar.zza()), zzxvVar.zzb().a, obj.getClass().getName()});
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        ggp ggpVar = this.a;
        int i = ggpVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ggpVar.a(i2).b;
            if (obj instanceof zzyd) {
                ((zzyd) obj).c();
            }
        }
        Iterator it = ggpVar.c().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof zzyd) {
                ((zzyd) value).c();
            }
        }
        if (!ggpVar.d) {
            for (int i3 = 0; i3 < ggpVar.b; i3++) {
                igp a = ggpVar.a(i3);
                if (((zzxv) a.a).zzd()) {
                    a.setValue(Collections.unmodifiableList((List) a.b));
                }
            }
            for (Map.Entry entry : ggpVar.c()) {
                if (((zzxv) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!ggpVar.d) {
            ggpVar.c = ggpVar.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ggpVar.c);
            ggpVar.f = ggpVar.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ggpVar.f);
            ggpVar.d = true;
        }
        this.b = true;
    }

    public final Iterator b() {
        ggp ggpVar = this.a;
        return ggpVar.isEmpty() ? Collections.emptyIterator() : this.c ? new uoa(((yg0) ggpVar.entrySet()).iterator(), 10) : ((yg0) ggpVar.entrySet()).iterator();
    }

    public final void c(zzxv zzxvVar, Object obj) {
        if (!zzxvVar.zzd()) {
            h(zzxvVar, obj);
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
                h(zzxvVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzys) {
            this.c = true;
        }
        this.a.put(zzxvVar, obj);
    }

    public final Object clone() {
        tcp tcpVar = new tcp();
        ggp ggpVar = this.a;
        int i = ggpVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            igp a = ggpVar.a(i2);
            tcpVar.c((zzxv) a.a, a.b);
        }
        for (Map.Entry entry : ggpVar.c()) {
            tcpVar.c((zzxv) entry.getKey(), entry.getValue());
        }
        tcpVar.c = this.c;
        return tcpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        ggp ggpVar = this.a;
        int i = ggpVar.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                Iterator it = ggpVar.c().iterator();
                while (it.hasNext()) {
                    if (!f((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!f(ggpVar.a(i2))) {
                break;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tcp) {
            return this.a.equals(((tcp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public tcp() {
    }
}
