package androidx.media3.exoplayer.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.offline.d;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import xsna.bsg0;
import xsna.dy8;
import xsna.e8;
import xsna.evk;
import xsna.fxc0;
import xsna.kr10;
import xsna.y2r0;

/* compiled from: ProgressiveDownloader.java */
/* loaded from: classes12.dex */
public final class e implements d {
    public final Executor a;
    public final evk b;
    public final androidx.media3.datasource.cache.a c;
    public final dy8 d;

    @Nullable
    public final PriorityTaskManager e;

    @Nullable
    public d.a f;
    public volatile a g;
    public volatile boolean h;

    /* compiled from: ProgressiveDownloader.java */
    public class a extends bsg0<Void, IOException> {
        public a() {
        }

        @Override // xsna.bsg0
        public final void b() {
            e.this.d.j = true;
        }

        @Override // xsna.bsg0
        public final Void c() throws Exception {
            e.this.d.a();
            return null;
        }
    }

    public e(kr10 kr10Var, a.b bVar, Executor executor, long j, long j2) {
        executor.getClass();
        this.a = executor;
        kr10.f fVar = kr10Var.b;
        fVar.getClass();
        Map map = Collections.EMPTY_MAP;
        Uri uri = fVar.a;
        String str = fVar.d;
        fxc0.t(uri, "The uri must be set.");
        evk evkVar = new evk(uri, 0L, 1, null, map, j, j2, str, 4, null);
        this.b = evkVar;
        androidx.media3.datasource.cache.a b = bVar.b();
        this.c = b;
        this.d = new dy8(b, evkVar, null, new e8(this, 29));
        this.e = bVar.f;
    }

    @Override // androidx.media3.exoplayer.offline.d
    public final void a(@Nullable d.a aVar) throws IOException, InterruptedException {
        this.f = aVar;
        PriorityTaskManager priorityTaskManager = this.e;
        if (priorityTaskManager != null) {
            priorityTaskManager.a(-4000);
        }
        boolean z = false;
        while (!z) {
            try {
                if (this.h) {
                    break;
                }
                this.g = new a();
                PriorityTaskManager priorityTaskManager2 = this.e;
                if (priorityTaskManager2 != null) {
                    priorityTaskManager2.b();
                }
                this.a.execute(this.g);
                try {
                    this.g.get();
                    z = true;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    if (!(cause instanceof PriorityTaskManager.PriorityTooLowException)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        String str = y2r0.a;
                        throw cause;
                    }
                }
            } catch (Throwable th) {
                a aVar2 = this.g;
                aVar2.getClass();
                aVar2.a();
                PriorityTaskManager priorityTaskManager3 = this.e;
                if (priorityTaskManager3 != null) {
                    priorityTaskManager3.d(-4000);
                }
                throw th;
            }
        }
        a aVar3 = this.g;
        aVar3.getClass();
        aVar3.a();
        PriorityTaskManager priorityTaskManager4 = this.e;
        if (priorityTaskManager4 != null) {
            priorityTaskManager4.d(-4000);
        }
    }

    @Override // androidx.media3.exoplayer.offline.d
    public final void cancel() {
        this.h = true;
        a aVar = this.g;
        if (aVar != null) {
            aVar.cancel(true);
        }
    }

    @Override // androidx.media3.exoplayer.offline.d
    public final void remove() {
        androidx.media3.datasource.cache.a aVar = this.c;
        aVar.a.c(aVar.e.k(this.b));
    }
}
