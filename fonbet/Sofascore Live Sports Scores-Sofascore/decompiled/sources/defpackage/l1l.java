package defpackage;

import android.webkit.SafeBrowsingResponse;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l1l {
    public final WebkitToCompatConverterBoundaryInterface a;

    public l1l(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.a = webkitToCompatConverterBoundaryInterface;
    }

    public final SafeBrowsingResponse a(InvocationHandler invocationHandler) {
        return (SafeBrowsingResponse) this.a.convertSafeBrowsingResponse(invocationHandler);
    }
}
