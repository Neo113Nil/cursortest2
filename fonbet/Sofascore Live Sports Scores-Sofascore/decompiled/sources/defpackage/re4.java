package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface re4 extends ge4 {
    long b(xe4 xe4Var);

    void close();

    void f(tn4 tn4Var);

    default Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    Uri getUri();
}
