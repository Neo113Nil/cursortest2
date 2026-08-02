package Ya;

import com.google.crypto.tink.proto.J;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14102a = new a().d();

    /* renamed from: b, reason: collision with root package name */
    public static final J f14103b = J.P();

    /* renamed from: c, reason: collision with root package name */
    public static final J f14104c = J.P();

    static {
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        c.e();
        if (Wa.a.a()) {
            return;
        }
        a.m(true);
    }
}
