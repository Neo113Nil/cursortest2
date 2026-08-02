package androidx.media3.transformer;

import androidx.media3.muxer.MuxerException;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.dj50;
import xsna.dm8;
import xsna.fi20;
import xsna.hj50;
import xsna.io20;
import xsna.o9r;
import xsna.wf30;
import xsna.xf30;

/* compiled from: InAppMp4Muxer.java */
/* loaded from: classes12.dex */
public final class w implements dj50 {
    public final wf30 b;
    public final LinkedHashSet c = new LinkedHashSet();

    /* compiled from: InAppMp4Muxer.java */
    public static final class a implements dj50.a {
        @Override // xsna.dj50.a
        public final com.google.common.collect.g b(int i) {
            if (i == 2) {
                return wf30.h;
            }
            if (i == 1) {
                return wf30.i;
            }
            ImmutableList.b bVar = ImmutableList.c;
            return com.google.common.collect.g.f;
        }

        @Override // xsna.dj50.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final w a(String str) throws MuxerException {
            try {
                return new w(new wf30(new o9r(new FileOutputStream(str))));
            } catch (FileNotFoundException e) {
                throw new MuxerException("Error creating file output stream", e);
            }
        }
    }

    public w(wf30 wf30Var) {
        this.b = wf30Var;
    }

    @Override // xsna.dj50
    public final int N0(androidx.media3.common.a aVar) throws MuxerException {
        wf30 wf30Var = this.b;
        int N0 = wf30Var.N0(aVar);
        if (io20.p(aVar.n)) {
            wf30Var.X1(new xf30(aVar.z));
        }
        return N0;
    }

    @Override // xsna.dj50
    public final void X1(fi20.a aVar) {
        if (hj50.a(aVar)) {
            this.c.add(aVar);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws MuxerException {
        Iterator it = this.c.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            wf30 wf30Var = this.b;
            if (!hasNext) {
                wf30Var.close();
                return;
            }
            wf30Var.X1((fi20.a) it.next());
        }
    }

    @Override // xsna.dj50
    public final void f(int i, ByteBuffer byteBuffer, dm8 dm8Var) throws MuxerException {
        this.b.f(i, byteBuffer, dm8Var);
    }
}
