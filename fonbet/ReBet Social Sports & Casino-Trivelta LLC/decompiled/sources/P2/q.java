package P2;

import O2.f;
import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import wi.AbstractC6757a;

/* loaded from: classes.dex */
public class q implements WebMessageListenerBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    public final f.a f8720a;

    public q(f.a aVar) {
        this.f8720a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        O2.b b10 = p.b((WebMessageBoundaryInterface) AbstractC6757a.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (b10 != null) {
            this.f8720a.a(webView, b10, uri, z10, m.b(invocationHandler2));
        }
    }
}
