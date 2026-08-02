package androidx.media3.transformer;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableMap;
import xsna.g0h0;
import xsna.i2e0;

/* compiled from: AssetLoader.java */
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: AssetLoader.java */
    /* renamed from: androidx.media3.transformer.a$a, reason: collision with other inner class name */
    public static class C0070a {
        public final int a;
        public final boolean b;

        public C0070a(int i, boolean z) {
            this.a = i;
            this.b = z;
        }
    }

    /* compiled from: AssetLoader.java */
    public interface b {
        a a(m mVar, Looper looper, c cVar, C0070a c0070a);
    }

    /* compiled from: AssetLoader.java */
    public interface c {
        void a(ExportException exportException);

        @Nullable
        g0h0 b(androidx.media3.common.a aVar) throws ExportException;

        boolean d(int i, androidx.media3.common.a aVar);

        void e(int i);

        void f(long j);
    }

    int c(i2e0 i2e0Var);

    ImmutableMap<Integer, String> g();

    void release();

    void start();
}
