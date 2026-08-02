package I0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends D {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f5296b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Throwable finalException) {
        super(Integer.MAX_VALUE, null);
        Intrinsics.checkNotNullParameter(finalException, "finalException");
        this.f5296b = finalException;
    }

    public final Throwable b() {
        return this.f5296b;
    }
}
