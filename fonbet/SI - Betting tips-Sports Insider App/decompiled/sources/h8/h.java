package h8;

import com.google.firebase.messaging.x;
import eg.c0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import o8.p;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h implements o8.d {

    /* renamed from: b, reason: collision with root package name */
    public static final h f10410b = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final h f10411c = new h(1);

    /* renamed from: d, reason: collision with root package name */
    public static final h f10412d = new h(2);

    /* renamed from: e, reason: collision with root package name */
    public static final h f10413e = new h(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10414a;

    public /* synthetic */ h(int i5) {
        this.f10414a = i5;
    }

    @Override // o8.d
    public final Object h(x xVar) {
        switch (this.f10414a) {
            case 0:
                Object g10 = xVar.g(new p(n8.a.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(g10, "get(...)");
                return c0.l((Executor) g10);
            case 1:
                Object g11 = xVar.g(new p(n8.c.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(g11, "get(...)");
                return c0.l((Executor) g11);
            case 2:
                Object g12 = xVar.g(new p(n8.b.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(g12, "get(...)");
                return c0.l((Executor) g12);
            default:
                Object g13 = xVar.g(new p(n8.d.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(g13, "get(...)");
                return c0.l((Executor) g13);
        }
    }
}
