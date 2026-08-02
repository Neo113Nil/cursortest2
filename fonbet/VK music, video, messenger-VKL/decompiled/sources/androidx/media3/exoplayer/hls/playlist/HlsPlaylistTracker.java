package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.upstream.b;
import java.io.IOException;
import xsna.j9v;
import xsna.p9v;
import xsna.qfl;

/* loaded from: classes12.dex */
public interface HlsPlaylistTracker {

    public static final class PlaylistResetException extends IOException {
        public final Uri url;

        public PlaylistResetException(Uri uri) {
            this.url = uri;
        }
    }

    public static final class PlaylistStuckException extends IOException {
        public final Uri url;

        public PlaylistStuckException(Uri uri) {
            this.url = uri;
        }
    }

    public interface a {
        HlsPlaylistTracker a(qfl qflVar, androidx.media3.exoplayer.upstream.b bVar, p9v p9vVar);
    }

    public interface b {
        void b();

        boolean d(Uri uri, b.c cVar, boolean z);
    }

    void A() throws IOException;

    @Nullable
    androidx.media3.exoplayer.hls.playlist.b B(Uri uri, boolean z);

    long C();

    boolean D(long j, Uri uri);

    void E(j9v j9vVar);

    void F(Uri uri) throws IOException;

    void G(Uri uri);

    boolean H(Uri uri);

    void stop();

    boolean v();

    void w(Uri uri, j.a aVar, HlsMediaSource hlsMediaSource);

    void x(j9v j9vVar);

    @Nullable
    c z();

    default void y(Uri uri) {
    }
}
