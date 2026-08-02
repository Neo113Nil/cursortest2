package p1;

import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: b, reason: collision with root package name */
    public final long f21413b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21414c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List cubics, long j, long j6, boolean z5) {
        super(cubics);
        Intrinsics.checkNotNullParameter(cubics, "cubics");
        this.f21413b = j;
        this.f21414c = j6;
        this.f21415d = z5;
    }

    @Override // p1.g
    public final g a(io.sentry.util.network.b f6) {
        Intrinsics.checkNotNullParameter(f6, "f");
        hf.e b10 = t.b();
        List list = this.f21416a;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            b10.add(((c) list.get(i5)).e(f6));
        }
        return new e(t.a(b10), ci.c.c0(this.f21413b, f6), ci.c.c0(this.f21414c, f6), this.f21415d);
    }

    public final String toString() {
        return "Corner: vertex=" + ((Object) s.g.b(this.f21413b)) + ", center=" + ((Object) s.g.b(this.f21414c)) + ", convex=" + this.f21415d;
    }
}
