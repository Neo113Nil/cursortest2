package u2;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final f f24024a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f24025b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f callbackName, Throwable cause) {
        super(cause);
        Intrinsics.checkNotNullParameter(callbackName, "callbackName");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f24024a = callbackName;
        this.f24025b = cause;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f24025b;
    }
}
