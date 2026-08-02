package androidx.media3.exoplayer.upstream;

import androidx.annotation.Nullable;
import java.io.IOException;
import xsna.fxc0;

/* compiled from: LoadErrorHandlingPolicy.java */
/* loaded from: classes12.dex */
public interface b {

    /* compiled from: LoadErrorHandlingPolicy.java */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public final boolean a(int i) {
            if (i == 1) {
                if (this.a - this.b <= 1) {
                    return false;
                }
            } else if (this.c - this.d <= 1) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: LoadErrorHandlingPolicy.java */
    /* renamed from: androidx.media3.exoplayer.upstream.b$b, reason: collision with other inner class name */
    public static final class C0065b {
        public final int a;
        public final long b;

        public C0065b(int i, long j) {
            fxc0.p(j >= 0);
            this.a = i;
            this.b = j;
        }
    }

    /* compiled from: LoadErrorHandlingPolicy.java */
    public static final class c {
        public final IOException a;
        public final int b;

        public c(IOException iOException, int i) {
            this.a = iOException;
            this.b = i;
        }
    }

    @Nullable
    C0065b a(a aVar, c cVar);

    long b(c cVar);

    int c(int i);
}
