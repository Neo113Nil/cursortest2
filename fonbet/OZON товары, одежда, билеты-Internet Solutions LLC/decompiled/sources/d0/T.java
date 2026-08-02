package d0;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
final class T implements S {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f60860a;

    /* renamed from: b, reason: collision with root package name */
    private final int f60861b;

    /* renamed from: c, reason: collision with root package name */
    private final ByteBuffer f60862c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.common.util.concurrent.m<Void> f60863d;

    /* renamed from: e, reason: collision with root package name */
    private final b.a<Void> f60864e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f60865f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    private long f60866g = 0;

    /* renamed from: h, reason: collision with root package name */
    private boolean f60867h = false;

    T(@NonNull MediaCodec mediaCodec, int i11) throws MediaCodec.CodecException {
        mediaCodec.getClass();
        this.f60860a = mediaCodec;
        x2.i.d(i11);
        this.f60861b = i11;
        this.f60862c = mediaCodec.getInputBuffer(i11);
        AtomicReference atomicReference = new AtomicReference();
        this.f60863d = androidx.concurrent.futures.b.a(new B90.E(atomicReference, 3));
        b.a<Void> aVar = (b.a) atomicReference.get();
        aVar.getClass();
        this.f60864e = aVar;
    }

    @Override // d0.S
    public final boolean a() {
        b.a<Void> aVar = this.f60864e;
        ByteBuffer byteBuffer = this.f60862c;
        if (this.f60865f.getAndSet(true)) {
            return false;
        }
        try {
            this.f60860a.queueInputBuffer(this.f60861b, byteBuffer.position(), byteBuffer.limit(), this.f60866g, this.f60867h ? 4 : 0);
            aVar.c(null);
            return true;
        } catch (IllegalStateException e11) {
            aVar.e(e11);
            return false;
        }
    }

    @Override // d0.S
    @NonNull
    public final com.google.common.util.concurrent.m<Void> b() {
        return I.k.i(this.f60863d);
    }

    @Override // d0.S
    public final void c(long j11) {
        if (this.f60865f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        x2.i.b(j11 >= 0);
        this.f60866g = j11;
    }

    @Override // d0.S
    public final boolean cancel() {
        b.a<Void> aVar = this.f60864e;
        if (this.f60865f.getAndSet(true)) {
            return false;
        }
        try {
            this.f60860a.queueInputBuffer(this.f60861b, 0, 0, 0L, 0);
            aVar.c(null);
        } catch (IllegalStateException e11) {
            aVar.e(e11);
        }
        return true;
    }

    @Override // d0.S
    public final void d() {
        if (this.f60865f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        this.f60867h = true;
    }

    @Override // d0.S
    @NonNull
    public final ByteBuffer u() {
        if (this.f60865f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        return this.f60862c;
    }
}
