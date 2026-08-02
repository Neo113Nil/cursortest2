package cf;

import Sc.C4001c;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class n extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private IOException f57150a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final IOException f57151b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@NotNull IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.f57151b = firstConnectException;
        this.f57150a = firstConnectException;
    }

    public final void a(@NotNull IOException e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        C4001c.a(this.f57151b, e11);
        this.f57150a = e11;
    }

    @NotNull
    public final IOException b() {
        return this.f57151b;
    }

    @NotNull
    public final IOException d() {
        return this.f57150a;
    }
}
