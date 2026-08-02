package e6;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.g4;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c0 extends v {

    /* renamed from: b, reason: collision with root package name */
    public final w7.g f8684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8685c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8686d;

    public c0(int i5, w7.g gVar) {
        super(i5);
        this.f8684b = gVar;
    }

    @Override // e6.e0
    public final void a(Status status) {
        this.f8684b.c(new d6.e(status));
    }

    @Override // e6.e0
    public final void b(Exception exc) {
        this.f8684b.c(exc);
    }

    @Override // e6.e0
    public final /* bridge */ /* synthetic */ void c(x5.h hVar, boolean z5) {
        int i5 = this.f8685c;
    }

    @Override // e6.e0
    public final void d(p pVar) {
        try {
            k(pVar);
        } catch (DeadObjectException e7) {
            a(e0.e(e7));
            throw e7;
        } catch (RemoteException e9) {
            a(e0.e(e9));
        } catch (RuntimeException e10) {
            this.f8684b.c(e10);
        }
    }

    @Override // e6.v
    public final Feature[] f(p pVar) {
        switch (this.f8685c) {
            case 0:
                break;
            default:
                break;
        }
        return null;
    }

    @Override // e6.v
    public final boolean g(p pVar) {
        switch (this.f8685c) {
            case 0:
                return ((x) this.f8686d).f8763a.f8765a;
            default:
                x xVar = (x) pVar.j.get((i) this.f8686d);
                return xVar != null && xVar.f8763a.f8765a;
        }
    }

    @Override // e6.v
    public final int h(p pVar) {
        switch (this.f8685c) {
            case 0:
                return ((x) this.f8686d).f8763a.f8766b;
            default:
                x xVar = (x) pVar.j.get((i) this.f8686d);
                if (xVar != null) {
                    return xVar.f8763a.f8766b;
                }
                return -1;
        }
    }

    public final void k(p pVar) {
        switch (this.f8685c) {
            case 0:
                x xVar = (x) this.f8686d;
                y yVar = xVar.f8763a;
                ((io.sentry.internal.debugmeta.c) ((b6.p) yVar.f8768d).f3079b).accept(pVar.f8736f, this.f8684b);
                i iVar = (i) ((j) yVar.f8767c).f8719b;
                if (iVar != null) {
                    pVar.j.put(iVar, xVar);
                    break;
                }
                break;
            default:
                x xVar2 = (x) pVar.j.remove((i) this.f8686d);
                if (xVar2 == null) {
                    this.f8684b.d(Boolean.FALSE);
                    break;
                } else {
                    ((g4) ((b6.p) xVar2.f8764b.f10430b).f3080c).accept(pVar.f8736f, this.f8684b);
                    ((j) xVar2.f8763a.f8767c).f8719b = null;
                    break;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c0(i iVar, w7.g gVar) {
        this(4, gVar);
        this.f8685c = 1;
        this.f8686d = iVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c0(x xVar, w7.g gVar) {
        this(3, gVar);
        this.f8685c = 0;
        this.f8686d = xVar;
    }

    private final /* bridge */ /* synthetic */ void i(x5.h hVar, boolean z5) {
    }

    private final /* bridge */ /* synthetic */ void j(x5.h hVar, boolean z5) {
    }
}
