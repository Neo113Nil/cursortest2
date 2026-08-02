package I0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x extends D {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f5301b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Throwable readException, int i10) {
        super(i10, null);
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.f5301b = readException;
    }

    public final Throwable b() {
        return this.f5301b;
    }
}
