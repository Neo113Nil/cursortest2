package Og;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e extends b {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8650h;

    @NotNull
    private final byte[] responseBody;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Ng.a client, Wg.b request, Xg.c response, byte[] responseBody) {
        super(client);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        this.responseBody = responseBody;
        i(new f(this, request));
        j(new g(this, responseBody, response));
        this.f8650h = true;
    }

    @Override // Og.b
    public boolean b() {
        return this.f8650h;
    }

    @Override // Og.b
    public Object g(Continuation continuation) {
        return io.ktor.utils.io.d.a(this.responseBody);
    }
}
