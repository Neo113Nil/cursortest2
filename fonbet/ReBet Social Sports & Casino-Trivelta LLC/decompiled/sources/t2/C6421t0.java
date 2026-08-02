package t2;

import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import android.view.Surface;
import b1.C2357k;
import e1.AbstractC4134a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import t2.InterfaceC6383a;
import t2.InterfaceC6399i;

/* renamed from: t2.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6421t0 extends AbstractC6419s0 {

    /* renamed from: D, reason: collision with root package name */
    public final boolean f65543D;

    /* renamed from: E, reason: collision with root package name */
    public final InterfaceC6399i.a f65544E;

    /* renamed from: F, reason: collision with root package name */
    public final int f65545F;

    /* renamed from: G, reason: collision with root package name */
    public final List f65546G;

    /* renamed from: H, reason: collision with root package name */
    public final LogSessionId f65547H;

    /* renamed from: I, reason: collision with root package name */
    public N0 f65548I;

    /* renamed from: J, reason: collision with root package name */
    public int f65549J;

    public C6421t0(boolean z10, InterfaceC6399i.a aVar, int i10, j1 j1Var, InterfaceC6383a.c cVar, LogSessionId logSessionId) {
        super(2, j1Var, cVar);
        this.f65543D = z10;
        this.f65544E = aVar;
        this.f65545F = i10;
        this.f65547H = logSessionId;
        this.f65546G = new ArrayList();
        this.f65549J = -1;
    }

    @Override // androidx.media3.exoplayer.p
    public long B(long j10, long j11) {
        if (getState() == 1) {
            return 1000000L;
        }
        int i10 = this.f65549J;
        if (i10 == -1) {
            return 10000L;
        }
        return i10 * 2000;
    }

    @Override // t2.AbstractC6419s0
    public boolean C0(k1.f fVar) {
        if (fVar.i()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC4134a.e(fVar.f54108d);
        if (this.f65548I != null) {
            long a02 = a0();
            if (this.f65548I.a(byteBuffer, fVar.f54110f - a02)) {
                byteBuffer.clear();
                return true;
            }
            fVar.f54110f = a02 + this.f65548I.e();
        }
        if (this.f65536t == null) {
            fVar.f54110f -= this.f65534r;
        }
        return false;
    }

    public final boolean D0(long j10) {
        int size = this.f65546G.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((Long) this.f65546G.get(i10)).longValue() == j10) {
                this.f65546G.remove(i10);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.p, androidx.media3.exoplayer.q
    public String getName() {
        return "ExoAssetLoaderVideoRenderer";
    }

    @Override // t2.AbstractC6419s0
    public boolean s0() {
        if (this.f65536t.b()) {
            this.f65535s.g();
            this.f65537u = true;
            return false;
        }
        MediaCodec.BufferInfo h10 = this.f65536t.h();
        if (h10 == null) {
            return false;
        }
        long j10 = h10.presentationTimeUs;
        long j11 = j10 - this.f65534r;
        if (j11 < 0 || D0(j10)) {
            this.f65536t.i(false);
            return true;
        }
        if (this.f65535s.e() == this.f65549J || !this.f65535s.h(j11)) {
            return false;
        }
        this.f65536t.g(j11);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r4.f65545F == 1) goto L8;
     */
    @Override // t2.AbstractC6419s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v0(androidx.media3.common.a aVar) {
        AbstractC4134a.i(this.f65535s);
        boolean z10 = C2357k.i(aVar.f20516D);
        InterfaceC6399i b10 = this.f65544E.b(aVar, (Surface) AbstractC4134a.e(this.f65535s.d()), z10, this.f65547H);
        this.f65536t = b10;
        this.f65549J = b10.k();
    }

    @Override // t2.AbstractC6419s0
    public void w0(k1.f fVar) {
        if (fVar.f54110f < X()) {
            this.f65546G.add(Long.valueOf(fVar.f54110f));
        }
    }

    @Override // t2.AbstractC6419s0
    public void x0(androidx.media3.common.a aVar) {
        if (this.f65543D) {
            this.f65548I = new N0(aVar);
        }
    }

    @Override // t2.AbstractC6419s0
    public androidx.media3.common.a y0(androidx.media3.common.a aVar) {
        return (this.f65545F == 3 && C2357k.i(aVar.f20516D)) ? aVar.b().V(C2357k.f24596g).P() : aVar;
    }

    @Override // t2.AbstractC6419s0
    public androidx.media3.common.a z0(androidx.media3.common.a aVar) {
        return aVar.b().V(k1.c(k1.h(aVar.f20516D), this.f65545F == 1)).P();
    }
}
