package androidx.media3.exoplayer.offline;

import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: Downloader.java */
/* loaded from: classes12.dex */
public interface d {

    /* compiled from: Downloader.java */
    public interface a {
        void b(long j, long j2, float f);
    }

    void a(@Nullable a aVar) throws IOException, InterruptedException;

    void cancel();

    void remove();
}
