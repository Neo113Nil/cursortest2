package u3;

import F3.C3013s;
import F3.C3016v;
import F3.InterfaceC3018x;
import android.util.SparseArray;
import j3.AbstractC7252H;
import j3.C7271m;
import j3.C7275q;
import j3.Q;
import j3.y;
import java.io.IOException;
import java.util.Objects;
import t3.C9737c;

/* renamed from: u3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC9928b {

    /* renamed from: u3.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f99804a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC7252H f99805b;

        /* renamed from: c, reason: collision with root package name */
        public final int f99806c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC3018x.b f99807d;

        /* renamed from: e, reason: collision with root package name */
        public final long f99808e;

        /* renamed from: f, reason: collision with root package name */
        public final AbstractC7252H f99809f;

        /* renamed from: g, reason: collision with root package name */
        public final int f99810g;

        /* renamed from: h, reason: collision with root package name */
        public final InterfaceC3018x.b f99811h;

        /* renamed from: i, reason: collision with root package name */
        public final long f99812i;

        /* renamed from: j, reason: collision with root package name */
        public final long f99813j;

        public a(long j11, AbstractC7252H abstractC7252H, int i11, InterfaceC3018x.b bVar, long j12, AbstractC7252H abstractC7252H2, int i12, InterfaceC3018x.b bVar2, long j13, long j14) {
            this.f99804a = j11;
            this.f99805b = abstractC7252H;
            this.f99806c = i11;
            this.f99807d = bVar;
            this.f99808e = j12;
            this.f99809f = abstractC7252H2;
            this.f99810g = i12;
            this.f99811h = bVar2;
            this.f99812i = j13;
            this.f99813j = j14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f99804a == aVar.f99804a && this.f99806c == aVar.f99806c && this.f99808e == aVar.f99808e && this.f99810g == aVar.f99810g && this.f99812i == aVar.f99812i && this.f99813j == aVar.f99813j && Objects.equals(this.f99805b, aVar.f99805b) && Objects.equals(this.f99807d, aVar.f99807d) && Objects.equals(this.f99809f, aVar.f99809f) && Objects.equals(this.f99811h, aVar.f99811h)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.f99804a), this.f99805b, Integer.valueOf(this.f99806c), this.f99807d, Long.valueOf(this.f99808e), this.f99809f, Integer.valueOf(this.f99810g), this.f99811h, Long.valueOf(this.f99812i), Long.valueOf(this.f99813j));
        }
    }

    /* renamed from: u3.b$b, reason: collision with other inner class name */
    public static final class C2198b {

        /* renamed from: a, reason: collision with root package name */
        private final C7271m f99814a;

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<a> f99815b;

        public C2198b(C7271m c7271m, SparseArray<a> sparseArray) {
            this.f99814a = c7271m;
            SparseArray<a> sparseArray2 = new SparseArray<>(c7271m.d());
            for (int i11 = 0; i11 < c7271m.d(); i11++) {
                int c11 = c7271m.c(i11);
                a aVar = sparseArray.get(c11);
                aVar.getClass();
                sparseArray2.append(c11, aVar);
            }
            this.f99815b = sparseArray2;
        }

        public final boolean a(int i11) {
            return this.f99814a.a(i11);
        }

        public final int b(int i11) {
            return this.f99814a.c(i11);
        }

        public final a c(int i11) {
            a aVar = this.f99815b.get(i11);
            aVar.getClass();
            return aVar;
        }

        public final int d() {
            return this.f99814a.d();
        }
    }

    default void a(C9737c c9737c) {
    }

    default void onAudioCodecError(a aVar, Exception exc) {
    }

    default void onAudioSinkError(a aVar, Exception exc) {
    }

    default void onBandwidthEstimate(a aVar, int i11, long j11, long j12) {
    }

    default void onDownstreamFormatChanged(a aVar, C3016v c3016v) {
    }

    default void onDrmSessionManagerError(a aVar, Exception exc) {
    }

    default void onDroppedVideoFrames(a aVar, int i11, long j11) {
    }

    default void onEvents(j3.y yVar, C2198b c2198b) {
    }

    default void onIsPlayingChanged(a aVar, boolean z11) {
    }

    default void onLoadCanceled(a aVar, C3013s c3013s, C3016v c3016v) {
    }

    default void onLoadError(a aVar, C3013s c3013s, C3016v c3016v, IOException iOException, boolean z11) {
    }

    @Deprecated
    default void onLoadStarted(a aVar, C3013s c3013s, C3016v c3016v) {
    }

    default void onMediaItemTransition(a aVar, C7275q c7275q, int i11) {
    }

    default void onPlayWhenReadyChanged(a aVar, boolean z11, int i11) {
    }

    default void onPlaybackStateChanged(a aVar, int i11) {
    }

    default void onPlayerError(a aVar, j3.w wVar) {
    }

    default void onPlayerReleased(a aVar) {
    }

    default void onPositionDiscontinuity(a aVar, y.d dVar, y.d dVar2, int i11) {
    }

    default void onVideoCodecError(a aVar, Exception exc) {
    }

    default void onVideoSizeChanged(a aVar, Q q11) {
    }

    default void onVolumeChanged(a aVar, float f7) {
    }
}
