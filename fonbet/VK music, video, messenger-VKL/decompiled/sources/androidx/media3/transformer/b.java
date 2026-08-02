package androidx.media3.transformer;

import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.media3.common.a;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.transformer.e;
import androidx.media3.transformer.z;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.Objects;
import xsna.a7l;
import xsna.ahn;
import xsna.ar4;
import xsna.fxc0;
import xsna.hdu;
import xsna.io20;
import xsna.lp4;
import xsna.mp4;

/* compiled from: AudioSampleExporter.java */
/* loaded from: classes12.dex */
public final class b extends x {
    public final e e;
    public final AudioProcessor.a f;
    public final DecoderInputBuffer g;
    public final DecoderInputBuffer h;
    public final lp4 i;
    public final mp4 j;
    public final androidx.media3.common.a k;
    public boolean l;
    public long m;

    @Nullable
    public DecoderInputBuffer n;

    public b(androidx.media3.common.a aVar, androidx.media3.common.a aVar2, z zVar, m mVar, ImmutableList<AudioProcessor> immutableList, ar4 ar4Var, e.b bVar, MuxerWrapper muxerWrapper, u uVar, @Nullable LogSessionId logSessionId) throws ExportException {
        super(aVar, muxerWrapper);
        mp4 mp4Var;
        androidx.media3.common.audio.e eVar = new androidx.media3.common.audio.e(false);
        ImmutableList.a aVar3 = new ImmutableList.a();
        aVar3.e(immutableList);
        aVar3.c(eVar);
        lp4 lp4Var = new lp4(ar4Var, aVar3.g());
        this.i = lp4Var;
        this.k = aVar2;
        mp4 c = lp4Var.c(mVar, aVar2);
        androidx.media3.common.audio.b bVar2 = lp4Var.c;
        AudioProcessor.a aVar4 = bVar2.d;
        boolean equals = aVar4.equals(AudioProcessor.a.e);
        int i = aVar4.a;
        fxc0.z(!equals);
        a.C0043a c0043a = new a.C0043a();
        z zVar2 = zVar;
        String str = zVar2.b;
        if (str == null) {
            str = aVar.n;
            str.getClass();
        }
        c0043a.m = io20.q(str);
        c0043a.F = i;
        c0043a.E = aVar4.b;
        c0043a.G = aVar4.c;
        c0043a.j = aVar2.k;
        androidx.media3.common.a aVar5 = new androidx.media3.common.a(c0043a);
        a.C0043a a = aVar5.a();
        a.m = io20.q(x.c(aVar5, muxerWrapper.b.b(1)));
        i d = bVar.d(new androidx.media3.common.a(a), logSessionId);
        androidx.media3.common.a aVar6 = d.c;
        this.e = d;
        try {
            int i2 = new AudioProcessor.a(i.a(d.d.getInputFormat(), d.g, aVar6.l)).a;
            if (i2 != i) {
                lp4Var.d();
                fxc0.p(i2 == -1 || i2 > 0);
                eVar.c = i2;
                mp4Var = lp4Var.c(mVar, aVar2);
                aVar4 = bVar2.d;
            } else {
                mp4Var = c;
            }
            this.j = mp4Var;
            this.f = aVar4;
            this.g = new DecoderInputBuffer(0);
            this.h = new DecoderInputBuffer(0);
            if (!Objects.equals(aVar5.n, aVar6.n)) {
                z.a a2 = zVar2.a();
                String q = io20.q(aVar6.n);
                fxc0.o(q, "Not an audio MIME type: %s", q == null || io20.l(q));
                a2.b = q;
                zVar2 = a2.a();
            }
            uVar.a(zVar2);
        } catch (RuntimeException e) {
            ahn.l(e);
            throw d.b(e);
        }
    }

    @Override // androidx.media3.transformer.x
    public final hdu j(m mVar, androidx.media3.common.a aVar, int i) throws ExportException {
        if (this.l) {
            return this.i.c(mVar, aVar);
        }
        this.l = true;
        fxc0.z(aVar.equals(this.k));
        return this.j;
    }

    @Override // androidx.media3.transformer.x
    @Nullable
    public final DecoderInputBuffer k() throws ExportException {
        i iVar = (i) this.e;
        ByteBuffer d = iVar.d();
        DecoderInputBuffer decoderInputBuffer = this.h;
        decoderInputBuffer.e = d;
        if (d == null) {
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = iVar.g(false) ? iVar.a : null;
        bufferInfo.getClass();
        decoderInputBuffer.g = bufferInfo.presentationTimeUs;
        decoderInputBuffer.b = 1;
        return decoderInputBuffer;
    }

    @Override // androidx.media3.transformer.x
    @Nullable
    public final androidx.media3.common.a l() throws ExportException {
        i iVar = (i) this.e;
        iVar.g(false);
        return iVar.j;
    }

    @Override // androidx.media3.transformer.x
    public final boolean m() {
        return ((i) this.e).e();
    }

    @Override // androidx.media3.transformer.x
    public final boolean n() throws ExportException {
        boolean z;
        DecoderInputBuffer decoderInputBuffer = this.n;
        DecoderInputBuffer decoderInputBuffer2 = this.g;
        e eVar = this.e;
        if (decoderInputBuffer == null && !((i) eVar).f(decoderInputBuffer2)) {
            return false;
        }
        lp4 lp4Var = this.i;
        androidx.media3.common.audio.b bVar = lp4Var.c;
        if (!(bVar.f() ? bVar.e() : lp4Var.b())) {
            return q();
        }
        if (this.n != null) {
            q();
        }
        a7l.a();
        if (this.n == null) {
            ByteBuffer byteBuffer = decoderInputBuffer2.e;
            byteBuffer.getClass();
            if (byteBuffer.position() == 0) {
                z = true;
                fxc0.z(z);
                long j = this.m;
                AudioProcessor.a aVar = this.f;
                decoderInputBuffer2.g = ((j / aVar.d) * 1000000) / aVar.a;
                decoderInputBuffer2.a(4);
                decoderInputBuffer2.h();
                ((i) eVar).h(decoderInputBuffer2);
                return false;
            }
        }
        z = false;
        fxc0.z(z);
        long j2 = this.m;
        AudioProcessor.a aVar2 = this.f;
        decoderInputBuffer2.g = ((j2 / aVar2.d) * 1000000) / aVar2.a;
        decoderInputBuffer2.a(4);
        decoderInputBuffer2.h();
        ((i) eVar).h(decoderInputBuffer2);
        return false;
    }

    @Override // androidx.media3.transformer.x
    public final void o() {
        this.i.d();
        ((i) this.e).i();
    }

    @Override // androidx.media3.transformer.x
    public final void p() throws ExportException {
        ((i) this.e).j();
    }

    public final boolean q() throws ExportException {
        lp4 lp4Var;
        DecoderInputBuffer decoderInputBuffer = this.n;
        if (decoderInputBuffer == null) {
            decoderInputBuffer = this.g;
        }
        ByteBuffer byteBuffer = decoderInputBuffer.e;
        byteBuffer.getClass();
        while (true) {
            lp4Var = this.i;
            androidx.media3.common.audio.b bVar = lp4Var.c;
            if ((bVar.f() ? bVar.e() : lp4Var.b()) || !lp4Var.a().hasRemaining() || byteBuffer.remaining() <= 0) {
                break;
            }
            ByteBuffer a = lp4Var.a();
            int min = Math.min(a.remaining(), byteBuffer.remaining());
            int limit = a.limit();
            a.limit(a.position() + min);
            byteBuffer.put(a);
            a.limit(limit);
        }
        if (byteBuffer.remaining() != 0) {
            androidx.media3.common.audio.b bVar2 = lp4Var.c;
            if (!(bVar2.f() ? bVar2.e() : lp4Var.b())) {
                this.n = decoderInputBuffer;
                return false;
            }
        }
        long j = this.m;
        AudioProcessor.a aVar = this.f;
        decoderInputBuffer.g = ((j / aVar.d) * 1000000) / aVar.a;
        this.m = j + byteBuffer.position();
        decoderInputBuffer.b = 0;
        decoderInputBuffer.h();
        ((i) this.e).h(decoderInputBuffer);
        this.n = null;
        return true;
    }
}
