package androidx.media3.transformer;

import android.media.metrics.LogSessionId;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.transformer.e;

/* compiled from: CapturingDecoderFactory.java */
/* loaded from: classes12.dex */
public final class c implements e.a {
    public final e.a a;

    @Nullable
    public String b;

    @Nullable
    public String c;

    public c(e.a aVar) {
        this.a = aVar;
    }

    @Override // androidx.media3.transformer.e.a
    public final i a(androidx.media3.common.a aVar, @Nullable LogSessionId logSessionId) throws ExportException {
        i a = this.a.a(aVar, logSessionId);
        this.b = a.c();
        return a;
    }

    @Override // androidx.media3.transformer.e.a
    public final i b(androidx.media3.common.a aVar, Surface surface, boolean z, @Nullable LogSessionId logSessionId) throws ExportException {
        i b = this.a.b(aVar, surface, z, logSessionId);
        this.c = b.c();
        return b;
    }
}
