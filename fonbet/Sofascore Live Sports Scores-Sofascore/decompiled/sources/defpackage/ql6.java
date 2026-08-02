package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface ql6 {
    default ll6[] c(Uri uri, Map map) {
        return createExtractors();
    }

    ll6[] createExtractors();
}
