package androidx.media3.exoplayer.drm;

import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.a;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import xsna.at;
import xsna.x1b0;

/* compiled from: DrmSessionManager.java */
/* loaded from: classes12.dex */
public interface b {
    public static final a a = new a();

    /* compiled from: DrmSessionManager.java */
    /* renamed from: androidx.media3.exoplayer.drm.b$b, reason: collision with other inner class name */
    public interface InterfaceC0056b {
        public static final at S6 = new at(17);

        void release();
    }

    int a(androidx.media3.common.a aVar);

    void b(Looper looper, x1b0 x1b0Var);

    @Nullable
    DrmSession c(@Nullable a.C0054a c0054a, androidx.media3.common.a aVar);

    default void prepare() {
    }

    default void release() {
    }

    /* compiled from: DrmSessionManager.java */
    public class a implements b {
        @Override // androidx.media3.exoplayer.drm.b
        public final int a(androidx.media3.common.a aVar) {
            return aVar.r != null ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.drm.b
        @Nullable
        public final DrmSession c(@Nullable a.C0054a c0054a, androidx.media3.common.a aVar) {
            if (aVar.r == null) {
                return null;
            }
            return new c(new DrmSession.DrmSessionException(new UnsupportedDrmException(), AuthCode.StatusCode.WAITING_CONNECT));
        }

        @Override // androidx.media3.exoplayer.drm.b
        public final void b(Looper looper, x1b0 x1b0Var) {
        }
    }
}
