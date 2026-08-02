package androidx.media3.transformer;

import androidx.media3.muxer.MuxerException;
import androidx.media3.transformer.w;
import java.nio.ByteBuffer;
import xsna.dj50;
import xsna.dm8;
import xsna.fi20;
import xsna.lgs;

/* compiled from: DefaultMuxer.java */
/* loaded from: classes12.dex */
public final class l implements dj50 {
    public static final String c = lgs.b;
    public final w b;

    /* compiled from: DefaultMuxer.java */
    public static final class a implements dj50.a {
        public final w.a a = new w.a();

        @Override // xsna.dj50.a
        public final dj50 a(String str) throws MuxerException {
            return new l(this.a.a(str));
        }

        @Override // xsna.dj50.a
        public final com.google.common.collect.g b(int i) {
            return this.a.b(i);
        }
    }

    public l(w wVar) {
        this.b = wVar;
    }

    @Override // xsna.dj50
    public final int N0(androidx.media3.common.a aVar) throws MuxerException {
        return this.b.N0(aVar);
    }

    @Override // xsna.dj50
    public final void X1(fi20.a aVar) {
        this.b.X1(aVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws MuxerException {
        this.b.close();
    }

    @Override // xsna.dj50
    public final void f(int i, ByteBuffer byteBuffer, dm8 dm8Var) throws MuxerException {
        this.b.f(i, byteBuffer, dm8Var);
    }
}
