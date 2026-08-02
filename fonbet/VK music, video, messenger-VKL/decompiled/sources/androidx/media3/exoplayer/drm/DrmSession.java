package androidx.media3.exoplayer.drm;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.drm.a;
import java.io.IOException;
import java.util.UUID;
import xsna.rjk;

/* loaded from: classes12.dex */
public interface DrmSession {

    public static class DrmSessionException extends IOException {
        public final int errorCode;

        public DrmSessionException(Throwable th, int i) {
            super(th);
            this.errorCode = i;
        }
    }

    default boolean a() {
        return false;
    }

    void b(@Nullable a.C0054a c0054a);

    UUID c();

    @Nullable
    rjk d();

    void e(@Nullable a.C0054a c0054a);

    boolean f(String str);

    @Nullable
    DrmSessionException getError();

    int getState();
}
