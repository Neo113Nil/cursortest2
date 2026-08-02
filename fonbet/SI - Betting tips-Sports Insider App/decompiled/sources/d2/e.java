package d2;

import e.d0;
import e.y;
import hg.d1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public c f8088a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8089b;

    public final void a() {
        c cVar = this.f8088a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.f8089b) {
            cVar.d(this, null);
        }
        Intrinsics.checkNotNullParameter(this, "input");
        f fVar = cVar.f8083b;
        androidx.credentials.playservices.controllers.CreateRestoreCredential.a aVar = cVar.f8082a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(this, "input");
        if (Intrinsics.areEqual(this, fVar.f8097h) && -1 == fVar.f8096g) {
            y yVar = fVar.f8095f;
            if (yVar == null) {
                yVar = fVar.c(-1);
            }
            fVar.f8095f = null;
            fVar.f8096g = 0;
            fVar.f8097h = null;
            if (yVar == null) {
                ((d0) aVar.f1514b).f8403a.run();
            } else {
                yVar.f8452f.b();
            }
            d1 d1Var = fVar.f8090a;
            d1Var.getClass();
            d1Var.k(null, g.f8103c);
        }
        this.f8089b = false;
    }

    public void b(boolean z5) {
    }
}
