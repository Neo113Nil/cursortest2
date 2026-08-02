package u4;

import D1.e;
import com.google.common.collect.A;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import t4.C6441a;

/* renamed from: u4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6496b {

    /* renamed from: a, reason: collision with root package name */
    public final r4.d f66093a;

    /* renamed from: u4.b$a */
    public static final class a implements e.b {
        public a() {
        }

        @Override // D1.e.b
        public com.google.common.collect.A c() {
            return C6496b.this.d();
        }
    }

    public C6496b(r4.d props) {
        Intrinsics.checkNotNullParameter(props, "props");
        this.f66093a = props;
    }

    public final void c(A.a aVar, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            aVar.f(str, f((String) pair.component1(), pair.component2()));
        }
    }

    public final com.google.common.collect.A d() {
        A.a v10 = com.google.common.collect.A.v();
        Intrinsics.checkNotNull(v10);
        c(v10, "CMCD-Object", this.f66093a.a());
        c(v10, "CMCD-Request", this.f66093a.b());
        c(v10, "CMCD-Session", this.f66093a.c());
        c(v10, "CMCD-Status", this.f66093a.d());
        com.google.common.collect.A e10 = v10.e();
        Intrinsics.checkNotNullExpressionValue(e10, "build(...)");
        return e10;
    }

    public final D1.e e(b1.z zVar) {
        return new D1.e(UUID.randomUUID().toString(), zVar.f24654a, new a(), g(this.f66093a.e()));
    }

    public final String f(String str, Object obj) {
        if (obj instanceof String) {
            return str + "=\"" + obj + "\"";
        }
        if (obj instanceof Number) {
            return str + "=" + obj;
        }
        throw new IllegalArgumentException("Unsupported value type: " + obj.getClass());
    }

    public final int g(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 1;
        }
        C6441a.b("CMCDConfig", "Unsupported mode: " + i10 + ", fallback on MODE_REQUEST_HEADER");
        return 0;
    }

    public final e.a h() {
        return new e.a() { // from class: u4.a
            @Override // D1.e.a
            public final D1.e a(b1.z zVar) {
                D1.e e10;
                e10 = C6496b.this.e(zVar);
                return e10;
            }
        };
    }
}
