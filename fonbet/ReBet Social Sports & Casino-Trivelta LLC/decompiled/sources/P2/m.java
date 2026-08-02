package P2;

import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import wi.AbstractC6757a;

/* loaded from: classes.dex */
public class m extends O2.a {

    /* renamed from: a, reason: collision with root package name */
    public final JsReplyProxyBoundaryInterface f8716a;

    public m(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f8716a = jsReplyProxyBoundaryInterface;
    }

    public static /* synthetic */ Object a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        return new m(jsReplyProxyBoundaryInterface);
    }

    public static m b(InvocationHandler invocationHandler) {
        final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) AbstractC6757a.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (m) jsReplyProxyBoundaryInterface.getOrCreatePeer(new Callable() { // from class: P2.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m.a(JsReplyProxyBoundaryInterface.this);
            }
        });
    }
}
