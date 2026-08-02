package d0;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: d0.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5995f implements InterfaceC5997h {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f60908a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaCodec.BufferInfo f60909b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.m<Void> f60910c;

    /* renamed from: d, reason: collision with root package name */
    private final b.a<Void> f60911d;

    public C5995f(@NonNull InterfaceC5997h interfaceC5997h) {
        MediaCodec.BufferInfo H11 = interfaceC5997h.H();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, H11.size, H11.presentationTimeUs, H11.flags);
        this.f60909b = bufferInfo;
        ByteBuffer u11 = interfaceC5997h.u();
        MediaCodec.BufferInfo H12 = interfaceC5997h.H();
        u11.position(H12.offset);
        u11.limit(H12.offset + H12.size);
        ByteBuffer allocate = ByteBuffer.allocate(H12.size);
        allocate.order(u11.order());
        allocate.put(u11);
        allocate.flip();
        this.f60908a = allocate;
        AtomicReference atomicReference = new AtomicReference();
        this.f60910c = androidx.concurrent.futures.b.a(new B90.Q(atomicReference, 3));
        b.a<Void> aVar = (b.a) atomicReference.get();
        aVar.getClass();
        this.f60911d = aVar;
    }

    @Override // d0.InterfaceC5997h
    @NonNull
    public final MediaCodec.BufferInfo H() {
        return this.f60909b;
    }

    @Override // d0.InterfaceC5997h
    public final boolean K() {
        return (this.f60909b.flags & 1) != 0;
    }

    @Override // d0.InterfaceC5997h
    public final long T() {
        return this.f60909b.presentationTimeUs;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f60911d.c(null);
    }

    @Override // d0.InterfaceC5997h
    public final long size() {
        return this.f60909b.size;
    }

    @Override // d0.InterfaceC5997h
    @NonNull
    public final ByteBuffer u() {
        return this.f60908a;
    }
}
