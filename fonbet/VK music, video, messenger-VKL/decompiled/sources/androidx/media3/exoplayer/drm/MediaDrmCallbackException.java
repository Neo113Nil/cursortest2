package androidx.media3.exoplayer.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import xsna.evk;

/* loaded from: classes12.dex */
public final class MediaDrmCallbackException extends IOException {
    public final long bytesLoaded;
    public final evk dataSpec;
    public final Map<String, List<String>> responseHeaders;
    public final Uri uriAfterRedirects;
}
