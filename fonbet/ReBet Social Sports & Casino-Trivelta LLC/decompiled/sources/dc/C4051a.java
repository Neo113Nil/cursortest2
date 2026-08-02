package dc;

import java.security.GeneralSecurityException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: dc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4051a extends GeneralSecurityException {

    /* renamed from: a, reason: collision with root package name */
    public static final C0655a f45168a = new C0655a(null);

    /* renamed from: dc.a$a, reason: collision with other inner class name */
    public static final class C0655a {
        public /* synthetic */ C0655a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Throwable th2) {
            if (th2 == null) {
                return;
            }
            if (th2 instanceof C4051a) {
                throw ((C4051a) th2);
            }
            throw new C4051a("Wrapped error: " + th2.getMessage(), th2);
        }

        public C0655a() {
        }
    }

    public C4051a(String str) {
        super(str);
    }

    public C4051a(String str, Throwable th2) {
        super(str, th2);
    }
}
