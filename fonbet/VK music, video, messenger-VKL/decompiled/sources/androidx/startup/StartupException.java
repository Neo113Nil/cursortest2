package androidx.startup;

import androidx.annotation.NonNull;

/* loaded from: classes12.dex */
public final class StartupException extends RuntimeException {
    public StartupException() {
        super("Context cannot be null");
    }

    public StartupException(@NonNull Throwable th) {
        super(th);
    }
}
