package androidx.media3.exoplayer.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import xsna.bpz;
import xsna.bvk;
import xsna.evk;
import xsna.vyk0;
import xsna.y2r0;

/* compiled from: ParsingLoadable.java */
/* loaded from: classes12.dex */
public final class c<T> implements Loader.d {
    public final long a;
    public final evk b;
    public final int c;
    public final vyk0 d;
    public final a<? extends T> e;

    @Nullable
    public volatile T f;

    /* compiled from: ParsingLoadable.java */
    /* loaded from: classes.dex */
    public interface a<T> {
        Object a(Uri uri, bvk bvkVar) throws IOException;
    }

    public c() {
        throw null;
    }

    public c(androidx.media3.datasource.a aVar, evk evkVar, int i, a<? extends T> aVar2) {
        this.d = new vyk0(aVar);
        this.b = evkVar;
        this.c = i;
        this.e = aVar2;
        this.a = bpz.g.getAndIncrement();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void load() throws IOException {
        this.d.b = 0L;
        bvk bvkVar = new bvk(this.d, this.b);
        try {
            bvkVar.b.open(bvkVar.c);
            bvkVar.e = true;
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = (T) this.e.a(uri, bvkVar);
        } finally {
            y2r0.h(bvkVar);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void cancelLoad() {
    }
}
