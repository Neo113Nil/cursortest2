package p1;

import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List cubics) {
        super(cubics);
        Intrinsics.checkNotNullParameter(cubics, "cubics");
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
        return new f(t.a(b10));
    }

    public final String toString() {
        return "Edge";
    }
}
