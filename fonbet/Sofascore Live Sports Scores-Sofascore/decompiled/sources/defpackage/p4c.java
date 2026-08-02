package defpackage;

import android.media.MediaDescription;
import android.net.Uri;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class p4c {
    @Nullable
    public static Uri a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    public static void b(MediaDescription.Builder builder, @Nullable Uri uri) {
        builder.setMediaUri(uri);
    }
}
