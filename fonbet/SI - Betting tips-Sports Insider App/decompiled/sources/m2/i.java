package m2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import s7.f1;
import s7.n0;
import s7.r3;
import s7.z0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends s.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20232g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f20233h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(z0 z0Var) {
        super(20);
        this.f20233h = z0Var;
    }

    @Override // s.l
    public final Object a(Object obj) {
        LinkedHashMap linkedHashMap;
        switch (this.f20232g) {
            case 0:
                String key = (String) obj;
                Intrinsics.checkNotNullParameter(key, "key");
                return ((j) this.f20233h).f20234a.r0(key);
            default:
                String str = (String) obj;
                g6.v.e(str);
                z0 z0Var = (z0) this.f20233h;
                z0Var.k();
                g6.v.e(str);
                s7.j jVar = z0Var.f22859b.f22989c;
                r3.U(jVar);
                kh.g p02 = jVar.p0(str);
                if (p02 == null) {
                    return null;
                }
                n0 n0Var = ((f1) z0Var.f3328a).f22745f;
                f1.m(n0Var);
                n0Var.f22910n.b(str, "Populate EES config from database on cache miss. appId");
                z0Var.r(str, z0Var.s(str, (byte[]) p02.f19115b));
                i iVar = z0Var.j;
                synchronized (iVar.f22569c) {
                    Set entrySet = iVar.f22568b.f8523a.entrySet();
                    Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
                    linkedHashMap = new LinkedHashMap(entrySet.size());
                    Set<Map.Entry> entrySet2 = iVar.f22568b.f8523a.entrySet();
                    Intrinsics.checkNotNullExpressionValue(entrySet2, "<get-entries>(...)");
                    for (Map.Entry entry : entrySet2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return (com.google.android.gms.internal.measurement.e0) linkedHashMap.get(str);
        }
    }

    @Override // s.l
    public void b(boolean z5, Object obj, Object obj2, Object obj3) {
        switch (this.f20232g) {
            case 0:
                Object key = (String) obj;
                s2.c oldValue = (s2.c) obj2;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(oldValue, "oldValue");
                oldValue.close();
                super.b(z5, key, oldValue, (s2.c) obj3);
                break;
            default:
                super.b(z5, obj, obj2, obj3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar) {
        super(25);
        this.f20233h = jVar;
    }
}
