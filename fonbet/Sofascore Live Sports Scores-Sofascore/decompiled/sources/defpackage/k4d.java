package defpackage;

import java.io.File;
import java.security.PrivilegedAction;

/* loaded from: classes7.dex */
public final class k4d implements PrivilegedAction {
    public final /* synthetic */ int a;
    public final /* synthetic */ File b;

    public /* synthetic */ k4d(int i, File file) {
        this.a = i;
        this.b = file;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        int i = this.a;
        File file = this.b;
        switch (i) {
            case 0:
                System.load(file.getAbsolutePath());
                break;
            default:
                System.load(file.getAbsolutePath());
                break;
        }
        return new Object();
    }
}
