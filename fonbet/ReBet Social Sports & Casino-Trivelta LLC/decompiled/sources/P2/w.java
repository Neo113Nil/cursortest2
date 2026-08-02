package P2;

import O2.f;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import wi.AbstractC6757a;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final WebViewProviderBoundaryInterface f8799a;

    public w(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f8799a = webViewProviderBoundaryInterface;
    }

    public void a(String str, String[] strArr, f.a aVar) {
        this.f8799a.addWebMessageListener(str, strArr, AbstractC6757a.c(new q(aVar)));
    }
}
