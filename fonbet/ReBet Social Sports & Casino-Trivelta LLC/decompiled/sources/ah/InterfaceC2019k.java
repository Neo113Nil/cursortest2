package ah;

import ch.x;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ah.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2019k extends ch.x {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16060a = a.f16061a;

    /* renamed from: ah.k$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f16061a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final InterfaceC2019k f16062b = C2013e.f16048c;

        public final InterfaceC2019k a() {
            return f16062b;
        }
    }

    /* renamed from: ah.k$b */
    public static final class b {
        public static void a(InterfaceC2019k interfaceC2019k, Function2 body) {
            Intrinsics.checkNotNullParameter(body, "body");
            x.a.a(interfaceC2019k, body);
        }

        public static String b(InterfaceC2019k interfaceC2019k, String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return x.a.b(interfaceC2019k, name);
        }
    }
}
