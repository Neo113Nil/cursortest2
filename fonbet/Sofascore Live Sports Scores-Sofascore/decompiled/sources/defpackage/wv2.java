package defpackage;

import java.security.PrivilegedAction;
import java.security.Security;

/* loaded from: classes7.dex */
public final class wv2 implements PrivilegedAction {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ wv2(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                try {
                    return ClassLoader.getSystemClassLoader().loadClass(str);
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                return Security.getProperty(str);
            default:
                return System.getProperty(str);
        }
    }
}
