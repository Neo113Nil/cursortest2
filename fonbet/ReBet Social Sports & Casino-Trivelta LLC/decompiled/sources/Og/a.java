package Og;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public final String f8632a;

    public a(b call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f8632a = "Response already received: " + call;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f8632a;
    }
}
