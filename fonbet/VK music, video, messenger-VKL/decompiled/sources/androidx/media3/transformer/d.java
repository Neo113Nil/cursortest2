package androidx.media3.transformer;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.media3.transformer.e;

/* compiled from: CapturingEncoderFactory.java */
/* loaded from: classes12.dex */
public final class d implements e.b {
    public final e.b a;

    @Nullable
    public String b;

    @Nullable
    public String c;

    public d(e.b bVar) {
        this.a = bVar;
    }

    @Override // androidx.media3.transformer.e.b
    public final boolean a() {
        return this.a.a();
    }

    @Override // androidx.media3.transformer.e.b
    public final i b(androidx.media3.common.a aVar, @Nullable LogSessionId logSessionId) throws ExportException {
        i b = this.a.b(aVar, logSessionId);
        this.c = b.c();
        return b;
    }

    @Override // androidx.media3.transformer.e.b
    public final boolean c() {
        return this.a.c();
    }

    @Override // androidx.media3.transformer.e.b
    public final i d(androidx.media3.common.a aVar, @Nullable LogSessionId logSessionId) throws ExportException {
        i d = this.a.d(aVar, logSessionId);
        this.b = d.c();
        return d;
    }
}
