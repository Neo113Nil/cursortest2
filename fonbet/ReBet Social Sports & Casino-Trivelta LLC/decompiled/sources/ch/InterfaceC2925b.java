package ch;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ch.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2925b {

    /* renamed from: ch.b$a */
    public static final class a {
        public static Object a(InterfaceC2925b interfaceC2925b, C2924a key) {
            Intrinsics.checkNotNullParameter(key, "key");
            Object f10 = interfaceC2925b.f(key);
            if (f10 != null) {
                return f10;
            }
            throw new IllegalStateException("No instance for key " + key);
        }
    }

    List a();

    void b(C2924a c2924a, Object obj);

    Object c(C2924a c2924a, Function0 function0);

    boolean d(C2924a c2924a);

    void e(C2924a c2924a);

    Object f(C2924a c2924a);

    Object g(C2924a c2924a);
}
