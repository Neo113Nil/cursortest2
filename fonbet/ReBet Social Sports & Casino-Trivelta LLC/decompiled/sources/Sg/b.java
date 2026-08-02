package Sg;

import java.net.SocketTimeoutException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b extends SocketTimeoutException {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f10759a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String message, Throwable th2) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f10759a = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f10759a;
    }
}
