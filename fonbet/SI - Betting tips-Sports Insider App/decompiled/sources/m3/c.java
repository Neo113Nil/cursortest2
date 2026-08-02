package m3;

import f3.x;
import java.util.List;
import k2.w;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final w f20304a;

    /* renamed from: b, reason: collision with root package name */
    public final b f20305b;

    public c(w __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.f20304a = __db;
        this.f20305b = new b(0);
    }

    public final List a(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return (List) x.n0(this.f20304a, true, false, new a2.k(id2, 8));
    }
}
