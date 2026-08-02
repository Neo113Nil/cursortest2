package g6;

import com.facebook.GraphRequest;
import g6.C4338J;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class T extends FilterOutputStream implements U {

    /* renamed from: a, reason: collision with root package name */
    public final C4338J f47005a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f47006b;

    /* renamed from: c, reason: collision with root package name */
    public final long f47007c;

    /* renamed from: d, reason: collision with root package name */
    public final long f47008d;

    /* renamed from: e, reason: collision with root package name */
    public long f47009e;

    /* renamed from: f, reason: collision with root package name */
    public long f47010f;

    /* renamed from: g, reason: collision with root package name */
    public V f47011g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(OutputStream out, C4338J requests, Map progressMap, long j10) {
        super(out);
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(progressMap, "progressMap");
        this.f47005a = requests;
        this.f47006b = progressMap;
        this.f47007c = j10;
        this.f47008d = C4331C.A();
    }

    private final void k(long j10) {
        V v10 = this.f47011g;
        if (v10 != null) {
            v10.a(j10);
        }
        long j11 = this.f47009e + j10;
        this.f47009e = j11;
        if (j11 >= this.f47010f + this.f47008d || j11 >= this.f47007c) {
            r();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        Iterator it = this.f47006b.values().iterator();
        while (it.hasNext()) {
            ((V) it.next()).c();
        }
        r();
    }

    @Override // g6.U
    public void d(GraphRequest graphRequest) {
        this.f47011g = graphRequest != null ? (V) this.f47006b.get(graphRequest) : null;
    }

    public final void r() {
        if (this.f47009e > this.f47010f) {
            for (C4338J.a aVar : this.f47005a.m()) {
            }
            this.f47010f = this.f47009e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer);
        k(buffer.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer, i10, i11);
        k(i11);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) {
        ((FilterOutputStream) this).out.write(i10);
        k(1L);
    }
}
