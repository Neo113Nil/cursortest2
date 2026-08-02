package Sg;

import java.net.ConnectException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends ConnectException {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f10758a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String message, Throwable th2) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f10758a = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f10758a;
    }
}
