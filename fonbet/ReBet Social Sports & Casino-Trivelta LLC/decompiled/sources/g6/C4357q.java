package g6;

import T7.C1678s;
import java.util.Random;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: g6.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4357q extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public static final a f47108a = new a(null);
    public static final long serialVersionUID = 1;

    /* renamed from: g6.q$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C4357q() {
    }

    public static final void b(String str, boolean z10) {
        if (z10) {
            try {
                Z7.e.g(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public C4357q(final String str) {
        super(str);
        Random random = new Random();
        if (str == null || !C4331C.G() || random.nextInt(100) <= 50) {
            return;
        }
        C1678s c1678s = C1678s.f11164a;
        C1678s.a(C1678s.b.ErrorReport, new C1678s.a() { // from class: g6.p
            @Override // T7.C1678s.a
            public final void a(boolean z10) {
                C4357q.b(str, z10);
            }
        });
    }

    public C4357q(String str, Throwable th2) {
        super(str, th2);
    }

    public C4357q(Throwable th2) {
        super(th2);
    }
}
