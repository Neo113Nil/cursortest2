package b3;

import java.security.PrivilegedAction;

/* renamed from: b3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2384c implements PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f24980a = "org.bouncyseoncastle.asn1.allow_unsafe_integer";

    @Override // java.security.PrivilegedAction
    public final Object run() {
        return System.getProperty(this.f24980a);
    }
}
