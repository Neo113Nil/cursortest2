package g6;

import android.os.Handler;
import com.facebook.GraphRequest;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class S extends OutputStream implements U {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f47000a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f47001b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public GraphRequest f47002c;

    /* renamed from: d, reason: collision with root package name */
    public V f47003d;

    /* renamed from: e, reason: collision with root package name */
    public int f47004e;

    public S(Handler handler) {
        this.f47000a = handler;
    }

    public final Map B() {
        return this.f47001b;
    }

    @Override // g6.U
    public void d(GraphRequest graphRequest) {
        this.f47002c = graphRequest;
        this.f47003d = graphRequest != null ? (V) this.f47001b.get(graphRequest) : null;
    }

    public final void k(long j10) {
        GraphRequest graphRequest = this.f47002c;
        if (graphRequest == null) {
            return;
        }
        if (this.f47003d == null) {
            V v10 = new V(this.f47000a, graphRequest);
            this.f47003d = v10;
            this.f47001b.put(graphRequest, v10);
        }
        V v11 = this.f47003d;
        if (v11 != null) {
            v11.b(j10);
        }
        this.f47004e += (int) j10;
    }

    public final int r() {
        return this.f47004e;
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        k(buffer.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        k(i11);
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        k(1L);
    }
}
