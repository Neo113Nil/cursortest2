package defpackage;

import com.blaze.blazesdk.features.moments.models.ui.MomentModel;
import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xbm implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Boolean.valueOf(((MomentModel) obj).k).compareTo(Boolean.valueOf(((MomentModel) obj2).k));
    }
}
