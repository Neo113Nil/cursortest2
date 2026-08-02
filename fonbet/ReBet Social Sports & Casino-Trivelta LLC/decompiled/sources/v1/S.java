package v1;

import android.media.MediaCodec;
import android.os.Bundle;

/* loaded from: classes.dex */
public class S implements r {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f66918a;

    public S(MediaCodec mediaCodec) {
        this.f66918a = mediaCodec;
    }

    @Override // v1.r
    public void a(int i10, int i11, k1.c cVar, long j10, int i12) {
        this.f66918a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // v1.r
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        this.f66918a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // v1.r
    public void setParameters(Bundle bundle) {
        this.f66918a.setParameters(bundle);
    }

    @Override // v1.r
    public void b() {
    }

    @Override // v1.r
    public void flush() {
    }

    @Override // v1.r
    public void shutdown() {
    }

    @Override // v1.r
    public void start() {
    }
}
