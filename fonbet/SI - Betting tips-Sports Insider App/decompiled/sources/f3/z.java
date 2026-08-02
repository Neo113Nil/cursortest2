package f3;

import android.net.ConnectivityManager;
import androidx.appcompat.widget.c1;
import androidx.work.impl.WorkDatabase;
import e3.m0;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9438b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9439c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9440d;

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, int i5) {
        this.f9437a = i5;
        this.f9439c = obj;
        this.f9438b = obj2;
        this.f9440d = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List h10;
        int i5 = this.f9437a;
        Object obj = this.f9440d;
        Object obj2 = this.f9438b;
        Object obj3 = this.f9439c;
        switch (i5) {
            case 0:
                v vVar = (v) obj3;
                String str = (String) obj2;
                m0 m0Var = (m0) obj;
                final WorkDatabase workDatabase = vVar.f9428c;
                m3.s y5 = workDatabase.y();
                List d10 = y5.d(str);
                if (d10.size() > 1) {
                    throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
                }
                m3.n nVar = (m3.n) CollectionsKt.firstOrNull(d10);
                if (nVar == null) {
                    n3.c.a(new p(vVar, str, e3.o.f8552b, kotlin.collections.t.c(m0Var), 0));
                    Unit unit = Unit.f19194a;
                    return Unit.f19194a;
                }
                String str2 = nVar.f20328a;
                m3.o c2 = y5.c(str2);
                if (c2 == null) {
                    throw new IllegalStateException("WorkSpec with " + str2 + ", that matches a name \"" + str + "\", wasn't found");
                }
                if (!c2.c()) {
                    throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                }
                if (nVar.f20329b == e3.i0.f8529f) {
                    y5.a(str2);
                    n3.c.a(new p(vVar, str, e3.o.f8552b, kotlin.collections.t.c(m0Var), 0));
                    Unit unit2 = Unit.f19194a;
                    return Unit.f19194a;
                }
                final m3.o spec = m3.o.b(m0Var.f8546b, nVar.f20328a, null, null, null, 0, 0L, 0, 0, 0L, 0, 33554430);
                f fVar = vVar.f9431f;
                Intrinsics.checkNotNullExpressionValue(fVar, "getProcessor(...)");
                Intrinsics.checkNotNullExpressionValue(workDatabase, "getWorkDatabase(...)");
                e3.c cVar = vVar.f9427b;
                Intrinsics.checkNotNullExpressionValue(cVar, "<get-configuration>(...)");
                final List list = vVar.f9430e;
                Intrinsics.checkNotNullExpressionValue(list, "getSchedulers(...)");
                final Set set = m0Var.f8547c;
                final String str3 = spec.f20331a;
                final m3.o spec2 = workDatabase.y().c(str3);
                if (spec2 == null) {
                    throw new IllegalArgumentException(c1.n("Worker with ", str3, " doesn't exist"));
                }
                if (spec2.f20332b.a()) {
                    e3.j0[] j0VarArr = e3.j0.f8533a;
                } else {
                    if (spec2.c() ^ spec.c()) {
                        StringBuilder sb2 = new StringBuilder("Can't update ");
                        Intrinsics.checkNotNullParameter(spec2, "spec");
                        sb2.append(spec2.c() ? "Periodic" : "OneTime");
                        sb2.append(" Worker to ");
                        Intrinsics.checkNotNullParameter(spec, "spec");
                        throw new UnsupportedOperationException(d9.e.l(sb2, spec.c() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type."));
                    }
                    final boolean f6 = fVar.f(str3);
                    if (!f6) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((h) it.next()).d(str3);
                        }
                    }
                    workDatabase.q(new Runnable() { // from class: f3.a0
                        @Override // java.lang.Runnable
                        public final void run() {
                            WorkDatabase workDatabase2 = WorkDatabase.this;
                            m3.s y10 = workDatabase2.y();
                            m3.u z5 = workDatabase2.z();
                            m3.o oVar = spec2;
                            e3.i0 i0Var = oVar.f20332b;
                            int i10 = oVar.f20340k;
                            long j = oVar.f20343n;
                            int i11 = oVar.f20348t + 1;
                            int i12 = oVar.f20347s;
                            long j6 = oVar.f20349u;
                            int i13 = oVar.f20350v;
                            m3.o oVar2 = spec;
                            m3.o b10 = m3.o.b(oVar2, null, i0Var, null, null, i10, j, i12, i11, j6, i13, 29613053);
                            if (oVar2.f20350v == 1) {
                                b10.f20349u = oVar2.f20349u;
                                b10.f20350v++;
                            }
                            m3.o workSpec = n3.j.c(list, b10);
                            y10.getClass();
                            Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                            x.n0(y10.f20360a, false, true, new m3.q(y10, workSpec, 1));
                            z5.getClass();
                            String workSpecId = str3;
                            Intrinsics.checkNotNullParameter(workSpecId, "id");
                            x.n0(z5.f20365a, false, true, new a2.k(workSpecId, 26));
                            z5.a(workSpecId, set);
                            if (f6) {
                                return;
                            }
                            y10.e(-1L, workSpecId);
                            m3.m x10 = workDatabase2.x();
                            x10.getClass();
                            Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
                            x.n0(x10.f20327a, false, true, new a2.k(workSpecId, 13));
                        }
                    });
                    if (!f6) {
                        j.b(cVar, workDatabase, list);
                    }
                    e3.j0[] j0VarArr2 = e3.j0.f8533a;
                }
                return Unit.f19194a;
            case 1:
                List<Certificate> list2 = (List) obj;
                String str4 = (String) obj2;
                y4.a aVar = ((gh.h) obj3).f10196b;
                if (aVar != null && (h10 = aVar.h(str4, list2)) != null) {
                    list2 = h10;
                }
                ArrayList arrayList = new ArrayList(kotlin.collections.v.k(list2, 10));
                for (Certificate certificate : list2) {
                    Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 2:
                ConnectivityManager connectivityManager = (ConnectivityManager) obj2;
                i3.d dVar = (i3.d) obj;
                if (((Ref.BooleanRef) obj3).element) {
                    e3.x.e().a(i3.k.f10922a, "NetworkRequestConstraintController unregister callback");
                    connectivityManager.unregisterNetworkCallback(dVar);
                }
                return Unit.f19194a;
            case 3:
                k2.r rVar = (k2.r) obj3;
                io.sentry.util.network.b bVar = (io.sentry.util.network.b) obj;
                String str5 = (String) obj2;
                if (rVar.f18748b) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                s2.a c8 = ((s2.b) bVar.f17176b).c(str5);
                if (rVar.f18747a) {
                    k2.r.f(c8);
                    if (((k2.b) rVar.f18749c).f18636g == k2.t.f18775c) {
                        h8.b.l(c8, "PRAGMA synchronous = NORMAL");
                    } else {
                        h8.b.l(c8, "PRAGMA synchronous = FULL");
                    }
                    ((j1.f) rVar.f18750d).d(c8);
                } else {
                    try {
                        rVar.f18748b = true;
                        k2.r.a(rVar, c8);
                    } finally {
                        rVar.f18748b = false;
                    }
                }
                return c8;
            default:
                y4.a aVar2 = ((gh.h) obj3).f10196b;
                Intrinsics.checkNotNull(aVar2);
                return aVar2.h(((gh.a) obj).f10114h.f10332d, ((gh.u) obj2).a());
        }
    }

    public /* synthetic */ z(Object obj, Object obj2, String str, int i5) {
        this.f9437a = i5;
        this.f9439c = obj;
        this.f9440d = obj2;
        this.f9438b = str;
    }
}
