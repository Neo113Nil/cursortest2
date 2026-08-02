package di;

import java.io.PrintStream;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c extends io.sentry.config.a {

    /* renamed from: i, reason: collision with root package name */
    public final PrintStream f8387i;

    public c() {
        b level = b.f8385e;
        Intrinsics.checkNotNullParameter(level, "level");
        this.f8387i = level.compareTo(b.f8383c) >= 0 ? System.err : System.out;
    }

    @Override // io.sentry.config.a
    public final void i(b level, String msg) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.f8387i.println("[" + level + "] [Koin] " + msg);
    }
}
