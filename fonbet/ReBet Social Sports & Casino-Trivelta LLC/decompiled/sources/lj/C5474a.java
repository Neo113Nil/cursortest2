package lj;

import java.security.Provider;
import java.security.Security;

/* renamed from: lj.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5474a extends AbstractC5476c {

    /* renamed from: b, reason: collision with root package name */
    public static volatile Provider f55872b;

    public C5474a() {
        super(a());
    }

    public static Provider a() {
        if (Security.getProvider("SC") != null) {
            return Security.getProvider("SC");
        }
        if (f55872b != null) {
            return f55872b;
        }
        f55872b = new org.spongycastle.jce.provider.a();
        return f55872b;
    }
}
