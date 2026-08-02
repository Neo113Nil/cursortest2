package Qg;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class a extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f9714a;

    public /* synthetic */ a(Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : th2);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f9714a;
    }

    public a(Throwable th2) {
        super("Client already closed");
        this.f9714a = th2;
    }
}
