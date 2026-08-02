package defpackage;

import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzacq;
import com.google.android.gms.internal.pal.zzadb;
import com.google.android.gms.internal.pal.zzadg;
import com.google.android.gms.internal.pal.zzadk;
import com.google.android.gms.internal.pal.zzaef;
import com.google.android.gms.internal.pal.zzafy;
import com.google.android.gms.internal.pal.zzafz;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c9n {
    public static final /* synthetic */ int c = 0;
    public final ncn a = new ncn(16);
    public boolean b;

    static {
        new c9n(0);
    }

    public c9n(int i) {
        a();
        a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void c(zzacq zzacqVar, Object obj) {
        boolean z;
        zzacqVar.zzb();
        Charset charset = zzadg.a;
        obj.getClass();
        zzafy[] zzafyVarArr = zzafy.b;
        zzafz zzafzVar = zzafz.INT;
        switch (r0.a) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzacqVar.zza()), zzacqVar.zzb().a, obj.getClass().getName()});
                break;
            case LONG:
                z = obj instanceof Long;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzacqVar.zza()), zzacqVar.zzb().a, obj.getClass().getName()});
                break;
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzacqVar.zza()), zzacqVar.zzb().a, obj.getClass().getName()});
                break;
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzacqVar.zza()), zzacqVar.zzb().a, obj.getClass().getName()});
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzacqVar.zza()), zzacqVar.zzb().a, obj.getClass().getName()});
                break;
            case STRING:
                z = obj instanceof String;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzacqVar.zza()), zzacqVar.zzb().a, obj.getClass().getName()});
                break;
            case BYTE_STRING:
                if ((obj instanceof zzaby) || (obj instanceof byte[])) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzacqVar.zza()), zzacqVar.zzb().a, obj.getClass().getName()});
                break;
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzadb)) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzacqVar.zza()), zzacqVar.zzb().a, obj.getClass().getName()});
                break;
            case MESSAGE:
                if ((obj instanceof zzaef) || (obj instanceof zzadk)) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzacqVar.zza()), zzacqVar.zzb().a, obj.getClass().getName()});
                break;
            default:
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzacqVar.zza()), zzacqVar.zzb().a, obj.getClass().getName()});
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        ncn ncnVar = this.a;
        if (!ncnVar.d) {
            for (int i = 0; i < ncnVar.b.size(); i++) {
                Map.Entry entry = (Map.Entry) ncnVar.b.get(i);
                if (((zzacq) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : ncnVar.c.isEmpty() ? z8e.g : ncnVar.c.entrySet()) {
                if (((zzacq) entry2.getKey()).zzc()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!ncnVar.d) {
            ncnVar.c = ncnVar.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ncnVar.c);
            ncnVar.f = ncnVar.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ncnVar.f);
            ncnVar.d = true;
        }
        this.b = true;
    }

    public final void b(zzacq zzacqVar, Object obj) {
        if (!zzacqVar.zzc()) {
            c(zzacqVar, obj);
        } else {
            if (!(obj instanceof List)) {
                a70.p("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                c(zzacqVar, arrayList.get(i));
            }
            obj = arrayList;
        }
        this.a.put(zzacqVar, obj);
    }

    public final Object clone() {
        ncn ncnVar;
        c9n c9nVar = new c9n();
        int i = 0;
        while (true) {
            ncnVar = this.a;
            if (i >= ncnVar.b.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) ncnVar.b.get(i);
            c9nVar.b((zzacq) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : ncnVar.c.isEmpty() ? z8e.g : ncnVar.c.entrySet()) {
            c9nVar.b((zzacq) entry2.getKey(), entry2.getValue());
        }
        return c9nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c9n) {
            return this.a.equals(((c9n) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public c9n() {
    }
}
