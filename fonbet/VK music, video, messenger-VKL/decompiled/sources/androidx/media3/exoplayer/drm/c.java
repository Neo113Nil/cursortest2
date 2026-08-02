package androidx.media3.exoplayer.drm;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.a;
import java.util.UUID;
import xsna.rjk;
import xsna.tu8;

/* compiled from: ErrorStateDrmSession.java */
/* loaded from: classes12.dex */
public final class c implements DrmSession {
    public final DrmSession.DrmSessionException a;

    public c(DrmSession.DrmSessionException drmSessionException) {
        this.a = drmSessionException;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean a() {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID c() {
        return tu8.a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    @Nullable
    public final rjk d() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean f(String str) {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    @Nullable
    public final DrmSession.DrmSessionException getError() {
        return this.a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void b(@Nullable a.C0054a c0054a) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void e(@Nullable a.C0054a c0054a) {
    }
}
