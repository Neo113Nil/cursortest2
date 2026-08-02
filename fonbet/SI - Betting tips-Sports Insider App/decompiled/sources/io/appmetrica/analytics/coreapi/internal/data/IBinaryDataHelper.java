package io.appmetrica.analytics.coreapi.internal.data;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface IBinaryDataHelper {
    byte[] get(@NonNull String str);

    void insert(@NonNull String str, @NonNull byte[] bArr);

    void remove(@NonNull String str);
}
