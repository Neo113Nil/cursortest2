package io.appmetrica.analytics.coreapi.internal.data;

import androidx.annotation.NonNull;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface StateSerializer<T> {
    @NonNull
    T defaultValue();

    @NonNull
    byte[] toByteArray(@NonNull T t3);

    @NonNull
    T toState(@NonNull byte[] bArr) throws IOException;
}
