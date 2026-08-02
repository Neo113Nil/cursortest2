package b3;

import java.security.PrivilegedAction;
import java.security.Security;

/* renamed from: b3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2383b implements PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f24979a = "org.bouncyseoncastle.asn1.allow_unsafe_integer";

    @Override // java.security.PrivilegedAction
    public final Object run() {
        return Security.getProperty(this.f24979a);
    }
}
