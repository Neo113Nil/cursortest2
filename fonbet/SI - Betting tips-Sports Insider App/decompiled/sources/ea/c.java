package ea;

import gh.i0;
import gh.o0;
import gh.z;
import kotlin.jvm.internal.Intrinsics;
import lh.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements z {
    @Override // gh.z
    public final o0 a(h chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        c4.d b10 = chain.f20093e.b();
        b10.i("Content-Type", "application/json");
        b10.i("Accept", "application/json");
        b10.i("connection", "close");
        b10.i("FLAVOR", "googleProduction");
        b10.i("BUILD_TYPE", "release");
        return chain.b(new i0(b10));
    }
}
