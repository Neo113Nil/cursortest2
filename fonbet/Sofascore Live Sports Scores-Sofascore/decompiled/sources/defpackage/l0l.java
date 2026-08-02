package defpackage;

import android.webkit.WebResourceError;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l0l extends k0l {
    public WebResourceError a;
    public WebResourceErrorBoundaryInterface b;

    @Override // defpackage.k0l
    public final CharSequence a() {
        y0l.a.getClass();
        WebResourceError webResourceError = this.a;
        if (webResourceError == null) {
            l1l l1lVar = z0l.a;
            webResourceError = (WebResourceError) l1lVar.a.convertWebResourceError(Proxy.getInvocationHandler(this.b));
            this.a = webResourceError;
        }
        return webResourceError.getDescription();
    }

    @Override // defpackage.k0l
    public final int b() {
        y0l.b.getClass();
        WebResourceError webResourceError = this.a;
        if (webResourceError == null) {
            l1l l1lVar = z0l.a;
            webResourceError = (WebResourceError) l1lVar.a.convertWebResourceError(Proxy.getInvocationHandler(this.b));
            this.a = webResourceError;
        }
        return webResourceError.getErrorCode();
    }
}
