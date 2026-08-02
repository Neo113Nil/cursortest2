package pd;

import androidx.lifecycle.k1;
import androidx.lifecycle.p0;
import com.sports.insider.R;
import eg.t1;
import hg.d1;
import hg.u0;
import ic.i0;
import java.util.HashMap;
import kotlin.Pair;
import le.o0;
import le.r1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f21792b;

    /* renamed from: c, reason: collision with root package name */
    public final uc.c f21793c = new uc.c();

    /* renamed from: d, reason: collision with root package name */
    public final p0 f21794d;

    /* renamed from: e, reason: collision with root package name */
    public final p0 f21795e;

    /* renamed from: f, reason: collision with root package name */
    public final d1 f21796f;

    /* renamed from: g, reason: collision with root package name */
    public t1 f21797g;

    /* renamed from: h, reason: collision with root package name */
    public t1 f21798h;

    /* renamed from: i, reason: collision with root package name */
    public final gf.t f21799i;
    public final d1 j;

    /* renamed from: k, reason: collision with root package name */
    public int f21800k;

    public t() {
        p0 p0Var = new p0(null);
        this.f21794d = p0Var;
        this.f21795e = p0Var;
        Boolean bool = Boolean.FALSE;
        this.f21796f = u0.b(bool);
        this.f21799i = gf.k.b(new id.a(27));
        this.j = u0.b(new Pair(0, bool));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(t tVar, int i5, int i10) {
        da.h hVar;
        y1.c0 c0Var;
        tVar.getClass();
        if (i10 == 2) {
            da.h hVar2 = new da.h();
            Integer valueOf = Integer.valueOf(i5);
            HashMap hashMap = hVar2.f8333a;
            hashMap.put("id", valueOf);
            hashMap.put("announcementId", -1);
            hVar = hVar2;
        } else {
            if (i10 != 3) {
                c0Var = null;
                tVar.e(c0Var);
            }
            da.g gVar = new da.g();
            Integer valueOf2 = Integer.valueOf(i5);
            HashMap hashMap2 = gVar.f8332a;
            hashMap2.put("id", valueOf2);
            hashMap2.put("announcementId", -1);
            hVar = gVar;
        }
        c0Var = hVar;
        tVar.e(c0Var);
    }

    @Override // androidx.lifecycle.k1
    public final void d() {
        t1 t1Var = this.f21798h;
        if (t1Var != null) {
            t1Var.k(null);
        }
        this.f21798h = null;
    }

    public final void e(y1.c0 c0Var) {
        if (c0Var == null) {
            return;
        }
        this.f21794d.h(new i0(new ic.f(c0Var)));
    }

    public final void f() {
        if (this.f21800k != R.id.allPredictionsFragment) {
            e(com.google.android.play.core.appupdate.b.b());
        }
    }

    public final boolean g(boolean z5) {
        if (!da.r.e()) {
            if (this.f21800k == R.id.livePayFragment) {
                return false;
            }
            e(new da.f());
            return true;
        }
        if (this.f21800k == R.id.liveFragment) {
            return false;
        }
        if (z5) {
            e(new y1.a(R.id.action_global_liveFragment_2));
            return true;
        }
        e(new y1.a(R.id.action_global_liveFragment));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(int i5, int i10, boolean z5) {
        da.j jVar = null;
        da.i iVar = null;
        da.j jVar2 = null;
        da.j jVar3 = null;
        pe.n nVar = null;
        pe.d dVar = null;
        if (z5) {
            if (i10 == 1) {
                da.i iVar2 = new da.i();
                iVar2.f8334a.put("id", Integer.valueOf(i5));
                iVar = iVar2;
            } else if (i10 == 2) {
                da.k kVar = new da.k();
                kVar.f8336a.put("id", Integer.valueOf(i5));
                iVar = kVar;
            } else if (i10 == 3) {
                da.b bVar = new da.b();
                bVar.f8327a.put("id", Integer.valueOf(i5));
                iVar = bVar;
            }
            e(iVar);
            return;
        }
        int i11 = this.f21800k;
        if (i11 == R.id.payPremiumFragment) {
            if (i10 == 1) {
                da.j jVar4 = new da.j();
                jVar4.f8335a.put("id", Integer.valueOf(i5));
                jVar2 = jVar4;
            } else if (i10 == 2) {
                r1 r1Var = new r1();
                r1Var.f19927a.put("id", Integer.valueOf(i5));
                jVar2 = r1Var;
            } else if (i10 == 3) {
                da.c cVar = new da.c();
                cVar.f8328a.put("id", Integer.valueOf(i5));
                jVar2 = cVar;
            }
            e(jVar2);
            return;
        }
        if (i11 == R.id.payExpressFragment) {
            if (i10 == 1) {
                da.j jVar5 = new da.j();
                jVar5.f8335a.put("id", Integer.valueOf(i5));
                jVar3 = jVar5;
            } else if (i10 == 2) {
                da.l lVar = new da.l();
                lVar.f8337a.put("id", Integer.valueOf(i5));
                jVar3 = lVar;
            } else if (i10 == 3) {
                o0 o0Var = new o0();
                o0Var.f19896a.put("id", Integer.valueOf(i5));
                jVar3 = o0Var;
            }
            e(jVar3);
            return;
        }
        if (i11 == R.id.allPredictionsFragment) {
            if (i10 == 1) {
                pe.n nVar2 = new pe.n();
                nVar2.f21850a.put("id", Integer.valueOf(i5));
                nVar = nVar2;
            } else if (i10 == 2) {
                pe.o oVar = new pe.o();
                oVar.f21851a.put("id", Integer.valueOf(i5));
                nVar = oVar;
            } else if (i10 == 3) {
                pe.l lVar2 = new pe.l();
                lVar2.f21848a.put("id", Integer.valueOf(i5));
                nVar = lVar2;
            }
            e(nVar);
            return;
        }
        if (i11 == R.id.savedPredictionsFragment) {
            if (i10 == 1) {
                pe.d dVar2 = new pe.d();
                dVar2.f21831a.put("id", Integer.valueOf(i5));
                dVar = dVar2;
            } else if (i10 == 2) {
                pe.e eVar = new pe.e();
                eVar.f21832a.put("id", Integer.valueOf(i5));
                dVar = eVar;
            } else if (i10 == 3) {
                pe.b bVar2 = new pe.b();
                bVar2.f21829a.put("id", Integer.valueOf(i5));
                dVar = bVar2;
            }
            e(dVar);
            return;
        }
        if (i10 == 1) {
            da.j jVar6 = new da.j();
            jVar6.f8335a.put("id", Integer.valueOf(i5));
            jVar = jVar6;
        } else if (i10 == 2) {
            da.l lVar3 = new da.l();
            lVar3.f8337a.put("id", Integer.valueOf(i5));
            jVar = lVar3;
        } else if (i10 == 3) {
            da.c cVar2 = new da.c();
            cVar2.f8328a.put("id", Integer.valueOf(i5));
            jVar = cVar2;
        }
        e(jVar);
    }
}
