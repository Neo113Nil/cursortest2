package defpackage;

import com.blaze.blazesdk.features.videos.models.ui.VideoModel;
import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c7m implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Boolean.valueOf(((VideoModel) obj).k).compareTo(Boolean.valueOf(((VideoModel) obj2).k));
    }
}
