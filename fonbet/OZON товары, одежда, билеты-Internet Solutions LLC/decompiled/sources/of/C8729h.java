package of;

import com.google.android.gms.wallet.WalletConstants;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: of.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8729h extends AbstractC8722a {

    /* renamed from: b, reason: collision with root package name */
    private static final C8723b f78310b;

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f78311c;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedBlockingQueue f78312a = new LinkedBlockingQueue();

    static {
        C8723b c8723b = new C8723b();
        c8723b.s();
        f78310b = c8723b;
        f78311c = Logger.getLogger(C8729h.class.getName());
    }

    @Override // of.AbstractC8722a
    @NotNull
    public final C8723b a() {
        C8723b c8723b = (C8723b) this.f78312a.peek();
        if (c8723b == null) {
            c8723b = null;
        }
        return c8723b != null ? c8723b : super.a();
    }

    @NotNull
    public final C8723b b(@NotNull C8730i request) throws InterruptedException {
        Intrinsics.checkNotNullParameter(request, "request");
        String c11 = request.c();
        if (Intrinsics.d(c11, "GET /favicon.ico HTTP/1.1")) {
            f78311c.info(Nk.a.b("served ", c11));
            C8723b c8723b = new C8723b();
            c8723b.q(WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
            return c8723b;
        }
        LinkedBlockingQueue linkedBlockingQueue = this.f78312a;
        C8723b result = (C8723b) linkedBlockingQueue.take();
        C8723b c8723b2 = f78310b;
        if (Intrinsics.d(result, c8723b2)) {
            linkedBlockingQueue.add(c8723b2);
        }
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public final void c(@NotNull C8723b response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f78312a.add(response);
    }

    public final void d() {
        this.f78312a.add(f78310b);
    }
}
