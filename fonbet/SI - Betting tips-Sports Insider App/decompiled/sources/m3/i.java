package m3;

import f3.x;
import k2.w;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final w f20319a;

    /* renamed from: b, reason: collision with root package name */
    public final b f20320b;

    public i(w __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.f20319a = __db;
        this.f20320b = new b(2);
    }

    public final g a(j id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        String workSpecId = id2.f20321a;
        int i5 = id2.f20322b;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        return (g) x.n0(this.f20319a, true, false, new h(workSpecId, i5, 0));
    }
}
