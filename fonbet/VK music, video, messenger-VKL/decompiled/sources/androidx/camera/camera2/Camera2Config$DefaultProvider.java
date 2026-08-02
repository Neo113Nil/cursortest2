package androidx.camera.camera2;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.a;
import androidx.camera.core.impl.n;
import androidx.camera.core.impl.o;
import xsna.ef9;
import xsna.ff9;
import xsna.gf9;
import xsna.wo9;

/* loaded from: classes11.dex */
public final class Camera2Config$DefaultProvider implements wo9.b {
    @Override // xsna.wo9.b
    @NonNull
    public wo9 getCameraXConfig() {
        ef9 ef9Var = new ef9();
        ff9 ff9Var = new ff9();
        gf9 gf9Var = new gf9();
        wo9.a aVar = new wo9.a();
        a aVar2 = wo9.t;
        n nVar = aVar.a;
        nVar.C(aVar2, ef9Var);
        nVar.C(wo9.u, ff9Var);
        nVar.C(wo9.v, gf9Var);
        return new wo9(o.y(nVar));
    }
}
