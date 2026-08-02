package androidx.lifecycle;

import java.io.Closeable;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public abstract class Q {

    @Nullable
    private final Y0.f impl = new Y0.f();

    public final void addCloseable(@NotNull String key, @NotNull AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        Y0.f fVar = this.impl;
        if (fVar != null) {
            fVar.e(key, closeable);
        }
    }

    public final void clear$lifecycle_viewmodel_release() {
        Y0.f fVar = this.impl;
        if (fVar != null) {
            fVar.f();
        }
        onCleared();
    }

    @Nullable
    public final <T extends AutoCloseable> T getCloseable(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Y0.f fVar = this.impl;
        if (fVar != null) {
            return (T) fVar.h(key);
        }
        return null;
    }

    public void onCleared() {
    }

    public void addCloseable(@NotNull AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        Y0.f fVar = this.impl;
        if (fVar != null) {
            fVar.d(closeable);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by `AutoCloseable` overload.")
    public /* synthetic */ void addCloseable(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        Y0.f fVar = this.impl;
        if (fVar != null) {
            fVar.d(closeable);
        }
    }
}
