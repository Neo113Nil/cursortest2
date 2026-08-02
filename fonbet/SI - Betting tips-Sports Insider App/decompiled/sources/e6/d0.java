package e6;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d0 extends v {

    /* renamed from: b, reason: collision with root package name */
    public final y f8687b;

    /* renamed from: c, reason: collision with root package name */
    public final w7.g f8688c;

    /* renamed from: d, reason: collision with root package name */
    public final m3.f f8689d;

    public d0(int i5, y yVar, w7.g gVar, m3.f fVar) {
        super(i5);
        this.f8688c = gVar;
        this.f8687b = yVar;
        this.f8689d = fVar;
        if (i5 == 2 && yVar.f8765a) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // e6.e0
    public final void a(Status status) {
        this.f8689d.getClass();
        this.f8688c.c(g6.v.l(status));
    }

    @Override // e6.e0
    public final void b(Exception exc) {
        this.f8688c.c(exc);
    }

    @Override // e6.e0
    public final void c(x5.h hVar, boolean z5) {
        Boolean valueOf = Boolean.valueOf(z5);
        Map map = (Map) hVar.f25410b;
        w7.g gVar = this.f8688c;
        map.put(gVar, valueOf);
        gVar.f24979a.addOnCompleteListener(new d7.e(hVar, gVar));
    }

    @Override // e6.e0
    public final void d(p pVar) {
        w7.g gVar = this.f8688c;
        try {
            y yVar = this.f8687b;
            ((m) yVar.f8768d).f8722a.accept(pVar.f8736f, gVar);
        } catch (DeadObjectException e7) {
            throw e7;
        } catch (RemoteException e9) {
            a(e0.e(e9));
        } catch (RuntimeException e10) {
            gVar.c(e10);
        }
    }

    @Override // e6.v
    public final Feature[] f(p pVar) {
        return (Feature[]) this.f8687b.f8767c;
    }

    @Override // e6.v
    public final boolean g(p pVar) {
        return this.f8687b.f8765a;
    }

    @Override // e6.v
    public final int h(p pVar) {
        return this.f8687b.f8766b;
    }
}
