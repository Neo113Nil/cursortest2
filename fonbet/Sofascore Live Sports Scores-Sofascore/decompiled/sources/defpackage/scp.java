package defpackage;

import com.google.android.gms.internal.measurement.zzabe;
import com.google.android.gms.internal.measurement.zzyl;
import com.google.android.gms.internal.measurement.zzzc;
import com.ironsource.U3;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class scp extends zzyl {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ scp(String str, Class cls, boolean z, boolean z2, int i) {
        super(str, cls, z, z2);
        this.f = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzyl
    public void a(Iterator it, zzzc zzzcVar) {
        switch (this.f) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean hasNext = it.hasNext();
                    String str = this.a;
                    if (!hasNext) {
                        zzzcVar.a(next, str);
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder(U3.j.d);
                        sb.append(next);
                        do {
                            sb.append(',');
                            sb.append(it.next());
                        } while (it.hasNext());
                        sb.append(']');
                        zzzcVar.a(sb.toString(), str);
                        break;
                    }
                }
                break;
            default:
                super.a(it, zzzcVar);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzyl
    public void b(Object obj, zzzc zzzcVar) {
        switch (this.f) {
            case 1:
                zzabe zzabeVar = (zzabe) obj;
                if (zzabeVar != null) {
                    p6n p6nVar = (p6n) zzabeVar.a.f;
                    p6nVar.getClass();
                    int i = 0;
                    while (true) {
                        if (!(i < p6nVar.d() - p6nVar.c())) {
                            break;
                        } else if (i >= p6nVar.d() - p6nVar.c()) {
                            yhk.d();
                            break;
                        } else {
                            s6n s6nVar = p6nVar.b;
                            int c = p6nVar.c() + i;
                            i++;
                            Map.Entry entry = (Map.Entry) s6nVar.b[c];
                            if (((Set) entry.getValue()).isEmpty()) {
                                zzzcVar.a(null, (String) entry.getKey());
                            } else {
                                Iterator it = ((Set) entry.getValue()).iterator();
                                while (it.hasNext()) {
                                    zzzcVar.a(it.next(), (String) entry.getKey());
                                }
                            }
                        }
                    }
                }
                break;
            default:
                super.b(obj, zzzcVar);
                break;
        }
    }
}
