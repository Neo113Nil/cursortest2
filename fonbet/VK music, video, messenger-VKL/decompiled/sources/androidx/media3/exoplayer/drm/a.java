package androidx.media3.exoplayer.drm;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.source.i;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: DrmSessionEventListener.java */
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: DrmSessionEventListener.java */
    /* renamed from: androidx.media3.exoplayer.drm.a$a, reason: collision with other inner class name */
    public static class C0054a {
        public final int a;

        @Nullable
        public final i.b b;
        public final CopyOnWriteArrayList<C0055a> c;

        /* compiled from: DrmSessionEventListener.java */
        /* renamed from: androidx.media3.exoplayer.drm.a$a$a, reason: collision with other inner class name */
        public static final class C0055a {
            public Object a;
        }

        public C0054a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public C0054a(CopyOnWriteArrayList<C0055a> copyOnWriteArrayList, int i, @Nullable i.b bVar) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = bVar;
        }
    }
}
