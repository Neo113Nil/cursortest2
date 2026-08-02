package defpackage;

import com.google.android.gms.internal.auth.zzef;
import com.google.android.gms.internal.auth.zzep;
import com.google.android.gms.internal.auth.zzev;
import com.google.android.gms.internal.auth.zzex;
import com.google.android.gms.internal.auth.zzfa;
import com.google.android.gms.internal.auth.zzfc;
import com.google.android.gms.internal.auth.zzfx;
import com.google.android.gms.internal.auth.zzho;
import com.google.android.gms.internal.auth.zzhp;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o5o {
    public static final /* synthetic */ int c = 0;
    public final deo a = new deo(16);
    public boolean b;

    static {
        new o5o(0);
    }

    public o5o(int i) {
        a();
        a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void c(zzep zzepVar, Object obj) {
        boolean z;
        zzepVar.zzb();
        Charset charset = zzfa.a;
        obj.getClass();
        zzho[] zzhoVarArr = zzho.b;
        zzhp zzhpVar = zzhp.INT;
        switch (r0.a) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a, obj.getClass().getName()});
                break;
            case LONG:
                z = obj instanceof Long;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a, obj.getClass().getName()});
                break;
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a, obj.getClass().getName()});
                break;
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a, obj.getClass().getName()});
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a, obj.getClass().getName()});
                break;
            case STRING:
                z = obj instanceof String;
                if (z) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a, obj.getClass().getName()});
                break;
            case BYTE_STRING:
                if ((obj instanceof zzef) || (obj instanceof byte[])) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a, obj.getClass().getName()});
                break;
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzex)) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a, obj.getClass().getName()});
                break;
            case MESSAGE:
                if ((obj instanceof zzfx) || (obj instanceof zzfc)) {
                }
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a, obj.getClass().getName()});
                break;
            default:
                sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a, obj.getClass().getName()});
                break;
        }
    }

    public final void a() {
        deo deoVar;
        if (this.b) {
            return;
        }
        int i = 0;
        while (true) {
            deoVar = this.a;
            if (i >= deoVar.b.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) deoVar.b.get(i);
            if (entry.getValue() instanceof zzev) {
                zzev zzevVar = (zzev) entry.getValue();
                zzevVar.getClass();
                nco.c.a(zzevVar.getClass()).a(zzevVar);
                zzevVar.c();
            }
            i++;
        }
        if (!deoVar.d) {
            for (int i2 = 0; i2 < deoVar.b.size(); i2++) {
                Map.Entry entry2 = (Map.Entry) deoVar.b.get(i2);
                if (((zzep) entry2.getKey()).zzc()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
            for (Map.Entry entry3 : deoVar.c.isEmpty() ? u6h.g : deoVar.c.entrySet()) {
                if (((zzep) entry3.getKey()).zzc()) {
                    entry3.setValue(Collections.unmodifiableList((List) entry3.getValue()));
                }
            }
        }
        if (!deoVar.d) {
            deoVar.c = deoVar.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(deoVar.c);
            deoVar.f = deoVar.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(deoVar.f);
            deoVar.d = true;
        }
        this.b = true;
    }

    public final void b(zzep zzepVar, Object obj) {
        if (!zzepVar.zzc()) {
            c(zzepVar, obj);
        } else {
            if (!(obj instanceof List)) {
                a70.p("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                c(zzepVar, arrayList.get(i));
            }
            obj = arrayList;
        }
        this.a.put(zzepVar, obj);
    }

    public final Object clone() {
        deo deoVar;
        o5o o5oVar = new o5o();
        int i = 0;
        while (true) {
            deoVar = this.a;
            if (i >= deoVar.b.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) deoVar.b.get(i);
            o5oVar.b((zzep) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : deoVar.c.isEmpty() ? u6h.g : deoVar.c.entrySet()) {
            o5oVar.b((zzep) entry2.getKey(), entry2.getValue());
        }
        return o5oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o5o) {
            return this.a.equals(((o5o) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public o5o() {
    }
}
