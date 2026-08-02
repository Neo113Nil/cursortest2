package d0;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: d0.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5998i implements InterfaceC5997h {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f60912a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaCodec.BufferInfo f60913b;

    /* renamed from: c, reason: collision with root package name */
    private final int f60914c;

    /* renamed from: d, reason: collision with root package name */
    private final ByteBuffer f60915d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.common.util.concurrent.m<Void> f60916e;

    /* renamed from: f, reason: collision with root package name */
    private final b.a<Void> f60917f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f60918g = new AtomicBoolean(false);

    C5998i(@NonNull MediaCodec mediaCodec, int i11, @NonNull MediaCodec.BufferInfo bufferInfo) throws MediaCodec.CodecException {
        mediaCodec.getClass();
        this.f60912a = mediaCodec;
        this.f60914c = i11;
        this.f60915d = mediaCodec.getOutputBuffer(i11);
        this.f60913b = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        this.f60916e = androidx.concurrent.futures.b.a(new B90.S(atomicReference));
        b.a<Void> aVar = (b.a) atomicReference.get();
        aVar.getClass();
        this.f60917f = aVar;
    }

    @Override // d0.InterfaceC5997h
    @NonNull
    public final MediaCodec.BufferInfo H() {
        return this.f60913b;
    }

    @Override // d0.InterfaceC5997h
    public final boolean K() {
        return (this.f60913b.flags & 1) != 0;
    }

    @Override // d0.InterfaceC5997h
    public final long T() {
        return this.f60913b.presentationTimeUs;
    }

    @NonNull
    public final com.google.common.util.concurrent.m<Void> c() {
        return I.k.i(this.f60916e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b.a<Void> aVar = this.f60917f;
        if (this.f60918g.getAndSet(true)) {
            return;
        }
        try {
            this.f60912a.releaseOutputBuffer(this.f60914c, false);
            aVar.c(null);
        } catch (IllegalStateException e11) {
            aVar.e(e11);
        }
    }

    @Override // d0.InterfaceC5997h
    public final long size() {
        return this.f60913b.size;
    }

    @Override // d0.InterfaceC5997h
    @NonNull
    public final ByteBuffer u() {
        if (this.f60918g.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
        MediaCodec.BufferInfo bufferInfo = this.f60913b;
        int i11 = bufferInfo.offset;
        ByteBuffer byteBuffer = this.f60915d;
        byteBuffer.position(i11);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return byteBuffer;
    }
}
