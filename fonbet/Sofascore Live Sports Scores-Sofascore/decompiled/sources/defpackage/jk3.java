package defpackage;

import coil.memory.MemoryCache$Key;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzht;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzpg;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jk3 extends zmb {
    public final /* synthetic */ int g = 1;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk3(zzht zzhtVar) {
        super(20);
        this.h = zzhtVar;
    }

    @Override // defpackage.zmb
    public Object a(Object obj) {
        LinkedHashMap linkedHashMap;
        switch (this.g) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return ((kk3) this.h).a.V0(str);
            case 1:
            default:
                return super.a(obj);
            case 2:
                String str2 = (String) obj;
                Preconditions.f(str2);
                zzht zzhtVar = (zzht) this.h;
                zzhtVar.R();
                Preconditions.f(str2);
                hkn hknVar = zzhtVar.c.c;
                zzpg.U(hknVar);
                sx2 Y0 = hknVar.Y0(str2);
                if (Y0 == null) {
                    return null;
                }
                zzgu zzguVar = ((zzic) zzhtVar.b).f;
                zzic.m(zzguVar);
                zzguVar.o.b(str2, "Populate EES config from database on cache miss. appId");
                zzhtVar.Y(str2, zzhtVar.Z(str2, (byte[]) Y0.a));
                jk3 jk3Var = zzhtVar.l;
                synchronized (jk3Var.c) {
                    Set entrySet = jk3Var.b.a.entrySet();
                    entrySet.getClass();
                    linkedHashMap = new LinkedHashMap(entrySet.size());
                    Set<Map.Entry> entrySet2 = jk3Var.b.a.entrySet();
                    entrySet2.getClass();
                    for (Map.Entry entry : entrySet2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return (zzc) linkedHashMap.get(str2);
        }
    }

    @Override // defpackage.zmb
    public void b(Object obj, Object obj2, Object obj3) {
        switch (this.g) {
            case 0:
                nlg nlgVar = (nlg) obj2;
                ((String) obj).getClass();
                nlgVar.getClass();
                nlgVar.close();
                break;
            case 1:
                npf npfVar = (npf) obj2;
                ((d0l) ((k1d) this.h).b).g((MemoryCache$Key) obj, npfVar.a, npfVar.b, npfVar.c);
                break;
            default:
                super.b(obj, obj2, obj3);
                break;
        }
    }

    @Override // defpackage.zmb
    public int g(Object obj, Object obj2) {
        switch (this.g) {
            case 1:
                return ((npf) obj2).c;
            default:
                return super.g(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk3(int i, k1d k1dVar) {
        super(i);
        this.h = k1dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk3(kk3 kk3Var) {
        super(25);
        this.h = kk3Var;
    }
}
