package gg;

import eg.c0;
import eg.f2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c implements f2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f10053a = j.f10088p;

    /* renamed from: b, reason: collision with root package name */
    public eg.l f10054b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f10055c;

    public c(h hVar) {
        this.f10055c = hVar;
    }

    public final Object a(hg.i frame) {
        p pVar;
        p pVar2;
        Object obj = this.f10053a;
        boolean z5 = true;
        if (obj == j.f10088p || obj == j.f10084l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.f10069g;
            h hVar = this.f10055c;
            p pVar3 = (p) atomicReferenceFieldUpdater.get(hVar);
            while (!hVar.w()) {
                long andIncrement = h.f10065c.getAndIncrement(hVar);
                long j = j.f10075b;
                long j6 = andIncrement / j;
                int i5 = (int) (andIncrement % j);
                if (pVar3.f18527c != j6) {
                    p p10 = hVar.p(j6, pVar3);
                    if (p10 == null) {
                        continue;
                    } else {
                        pVar = p10;
                    }
                } else {
                    pVar = pVar3;
                }
                Object H = hVar.H(pVar, i5, andIncrement, null);
                com.android.billingclient.api.a aVar = j.f10085m;
                if (H == aVar) {
                    throw new IllegalStateException("unreachable");
                }
                com.android.billingclient.api.a aVar2 = j.f10087o;
                if (H != aVar2) {
                    if (H != j.f10086n) {
                        pVar.b();
                        this.f10053a = H;
                        return Boolean.valueOf(z5);
                    }
                    eg.l p11 = c0.p(lf.d.b(frame));
                    try {
                        this.f10054b = p11;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        Object H2 = hVar.H(pVar, i5, andIncrement, this);
                        if (H2 == aVar) {
                            b(pVar, i5);
                        } else {
                            if (H2 == aVar2) {
                                if (andIncrement < hVar.t()) {
                                    pVar.b();
                                }
                                p pVar4 = (p) h.f10069g.get(hVar);
                                while (true) {
                                    if (hVar.w()) {
                                        eg.l lVar = this.f10054b;
                                        Intrinsics.checkNotNull(lVar);
                                        this.f10054b = null;
                                        this.f10053a = j.f10084l;
                                        Throwable q = hVar.q();
                                        if (q == null) {
                                            gf.o oVar = gf.q.f10031a;
                                            lVar.resumeWith(Boolean.FALSE);
                                        } else {
                                            gf.o oVar2 = gf.q.f10031a;
                                            lVar.resumeWith(h8.b.h(q));
                                        }
                                    } else {
                                        long andIncrement2 = h.f10065c.getAndIncrement(hVar);
                                        long j10 = j.f10075b;
                                        long j11 = andIncrement2 / j10;
                                        int i10 = (int) (andIncrement2 % j10);
                                        if (pVar4.f18527c != j11) {
                                            pVar2 = hVar.p(j11, pVar4);
                                            if (pVar2 == null) {
                                            }
                                        } else {
                                            pVar2 = pVar4;
                                        }
                                        Object H3 = hVar.H(pVar2, i10, andIncrement2, this);
                                        if (H3 == j.f10085m) {
                                            b(pVar2, i10);
                                            break;
                                        }
                                        if (H3 == j.f10087o) {
                                            if (andIncrement2 < hVar.t()) {
                                                pVar2.b();
                                            }
                                            pVar4 = pVar2;
                                        } else {
                                            if (H3 == j.f10086n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            pVar2.b();
                                            this.f10053a = H3;
                                            this.f10054b = null;
                                        }
                                    }
                                }
                            } else {
                                pVar.b();
                                this.f10053a = H2;
                                this.f10054b = null;
                            }
                            p11.a(Boolean.TRUE, null);
                        }
                        Object r5 = p11.r();
                        if (r5 == lf.a.f20034a) {
                            Intrinsics.checkNotNullParameter(frame, "frame");
                        }
                        return r5;
                    } catch (Throwable th3) {
                        th = th3;
                        Throwable th4 = th;
                        p11.A();
                        throw th4;
                    }
                }
                if (andIncrement < hVar.t()) {
                    pVar.b();
                }
                pVar3 = pVar;
            }
            this.f10053a = j.f10084l;
            Throwable q3 = hVar.q();
            if (q3 != null) {
                int i11 = jg.v.f18528a;
                throw q3;
            }
            z5 = false;
        }
        return Boolean.valueOf(z5);
    }

    @Override // eg.f2
    public final void b(jg.u uVar, int i5) {
        eg.l lVar = this.f10054b;
        if (lVar != null) {
            lVar.b(uVar, i5);
        }
    }
}
