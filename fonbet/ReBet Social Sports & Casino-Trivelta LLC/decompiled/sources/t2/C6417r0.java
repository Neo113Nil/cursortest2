package t2;

import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import e1.AbstractC4134a;
import java.nio.ByteBuffer;
import t2.InterfaceC6383a;
import t2.InterfaceC6399i;

/* renamed from: t2.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6417r0 extends AbstractC6419s0 {

    /* renamed from: D, reason: collision with root package name */
    public final InterfaceC6399i.a f65505D;

    /* renamed from: E, reason: collision with root package name */
    public final LogSessionId f65506E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f65507F;

    public C6417r0(InterfaceC6399i.a aVar, j1 j1Var, InterfaceC6383a.c cVar, LogSessionId logSessionId) {
        super(1, j1Var, cVar);
        this.f65505D = aVar;
        this.f65506E = logSessionId;
    }

    @Override // t2.AbstractC6419s0
    public boolean C0(k1.f fVar) {
        if (fVar.i()) {
            return false;
        }
        long j10 = fVar.f54110f - this.f65534r;
        fVar.f54110f = j10;
        if (this.f65536t == null || j10 >= 0) {
            return false;
        }
        fVar.f();
        return true;
    }

    @Override // androidx.media3.exoplayer.p, androidx.media3.exoplayer.q
    public String getName() {
        return "ExoAssetLoaderAudioRenderer";
    }

    @Override // t2.AbstractC6419s0
    public boolean s0() {
        k1.f f10 = this.f65535s.f();
        if (f10 == null) {
            return false;
        }
        if (!this.f65507F) {
            if (this.f65536t.b()) {
                ((ByteBuffer) AbstractC4134a.e(f10.f54108d)).limit(0);
                f10.e(4);
                this.f65537u = this.f65535s.a();
                return false;
            }
            ByteBuffer j10 = this.f65536t.j();
            if (j10 == null) {
                return false;
            }
            f10.p(j10.limit());
            f10.f54108d.put(j10).flip();
            MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) AbstractC4134a.e(this.f65536t.h());
            f10.f54110f = bufferInfo.presentationTimeUs;
            f10.n(bufferInfo.flags);
            this.f65536t.i(false);
            this.f65507F = true;
        }
        if (!this.f65535s.a()) {
            return false;
        }
        this.f65507F = false;
        return true;
    }

    @Override // t2.AbstractC6419s0
    public void v0(androidx.media3.common.a aVar) {
        this.f65536t = this.f65505D.a(aVar, this.f65506E);
    }
}
