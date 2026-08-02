package defpackage;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class cla implements ComponentCallbacks {
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        List list = dla.a;
        dla.e = null;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
