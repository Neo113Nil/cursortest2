package androidx.compose.runtime;

/* compiled from: Composer.kt */
/* loaded from: classes11.dex */
public final class ComposeRuntimeError extends IllegalStateException {
    private final String message;

    public ComposeRuntimeError(String str) {
        this.message = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
