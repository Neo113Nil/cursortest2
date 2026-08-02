package defpackage;

import java.security.PrivilegedAction;
import java.security.Provider;

/* loaded from: classes7.dex */
public final class j02 implements PrivilegedAction {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ l02 d;

    public j02(l02 l02Var, String str, String str2, String str3) {
        this.d = l02Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Provider.Service service;
        String str = this.a;
        String str2 = this.b;
        l02 l02Var = this.d;
        service = super/*java.security.Provider*/.getService(str, str2);
        if (service == null || service.getClassName() == null) {
            return null;
        }
        l02Var.a.put(this.c, service);
        l02Var.remove(service.getType() + "." + service.getAlgorithm());
        l02Var.putService(service);
        return service;
    }
}
