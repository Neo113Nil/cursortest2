package io.appmetrica.analytics.coreapi.internal.io;

import androidx.annotation.NonNull;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface Compressor {
    byte[] compress(@NonNull byte[] bArr) throws IOException;

    byte[] uncompress(@NonNull byte[] bArr) throws IOException;
}
