package io.appmetrica.analytics.gpllibrary.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface IGplLibraryWrapper {
    void startLocationUpdates(@NonNull GplLibraryWrapper.Priority priority) throws Throwable;

    void stopLocationUpdates() throws Throwable;

    void updateLastKnownLocation() throws Throwable;
}
