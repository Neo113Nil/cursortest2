package androidx.media3.transformer;

import android.media.metrics.LogSessionId;
import android.view.Surface;
import androidx.annotation.Nullable;

/* compiled from: Codec.java */
/* loaded from: classes12.dex */
public interface e {

    /* compiled from: Codec.java */
    public interface a {
        i a(androidx.media3.common.a aVar, @Nullable LogSessionId logSessionId) throws ExportException;

        i b(androidx.media3.common.a aVar, Surface surface, boolean z, @Nullable LogSessionId logSessionId) throws ExportException;
    }

    /* compiled from: Codec.java */
    public interface b {
        default boolean a() {
            return false;
        }

        i b(androidx.media3.common.a aVar, @Nullable LogSessionId logSessionId) throws ExportException;

        default boolean c() {
            return false;
        }

        i d(androidx.media3.common.a aVar, @Nullable LogSessionId logSessionId) throws ExportException;
    }
}
