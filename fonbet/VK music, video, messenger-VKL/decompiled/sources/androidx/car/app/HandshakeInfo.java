package androidx.car.app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class HandshakeInfo {
    private final int mHostCarAppApiLevel;

    @Nullable
    private final String mHostPackageName;

    public HandshakeInfo(@NonNull String str, int i) {
        this.mHostPackageName = str;
        this.mHostCarAppApiLevel = i;
    }

    public int getHostCarAppApiLevel() {
        return this.mHostCarAppApiLevel;
    }

    @NonNull
    public String getHostPackageName() {
        String str = this.mHostPackageName;
        Objects.requireNonNull(str);
        return str;
    }

    private HandshakeInfo() {
        this.mHostPackageName = null;
        this.mHostCarAppApiLevel = 0;
    }
}
