package defpackage;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class gfb {
    public abstract String a();

    public abstract ffb b(f6a f6aVar);

    public abstract j3d c(Map map);

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.e(a(), "policy");
        I.f(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, String.valueOf(5));
        I.d("available", true);
        return I.toString();
    }
}
