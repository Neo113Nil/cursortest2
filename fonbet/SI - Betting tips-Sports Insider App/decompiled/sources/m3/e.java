package m3;

import f3.x;
import k2.w;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final w f20308a;

    /* renamed from: b, reason: collision with root package name */
    public final b f20309b;

    public e(w __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.f20308a = __db;
        this.f20309b = new b(1);
    }

    public final Long a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (Long) x.n0(this.f20308a, true, false, new a2.k(key, 10));
    }

    public final void b(d preference) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        x.n0(this.f20308a, false, true, new fg.d(6, this, preference));
    }
}
