package Aj;

import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* loaded from: classes5.dex */
public abstract class g {

    public static class a implements PrivilegedAction {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f484a;

        public a(String str) {
            this.f484a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            String property = System.getProperty(this.f484a);
            if (property == null) {
                return null;
            }
            return h.g(property);
        }
    }

    public static boolean a(String str) {
        try {
            return "true".equals(AccessController.doPrivileged(new a(str)));
        } catch (AccessControlException unused) {
            return false;
        }
    }
}
