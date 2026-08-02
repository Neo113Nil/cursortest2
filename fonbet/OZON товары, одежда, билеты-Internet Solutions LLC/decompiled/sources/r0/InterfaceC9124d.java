package r0;

import m0.C8004n;
import m0.C8011q0;
import m0.InterfaceC8002m;
import org.jetbrains.annotations.NotNull;

/* renamed from: r0.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC9124d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f82557a = a.f82558a;

    /* renamed from: r0.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f82558a = new a();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final C8011q0 f82559b = C8004n.c(0.0f, null, 7);

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private static final C1405a f82560c = new C1405a();

        /* renamed from: r0.d$a$a, reason: collision with other inner class name */
        public static final class C1405a implements InterfaceC9124d {
        }

        @NotNull
        public static C1405a a() {
            return f82560c;
        }

        @NotNull
        public static C8011q0 b() {
            return f82559b;
        }
    }

    @NotNull
    default InterfaceC8002m<Float> a() {
        f82557a.getClass();
        return a.b();
    }

    default float b(float f7, float f11, float f12) {
        f82557a.getClass();
        float f13 = f11 + f7;
        if ((f7 >= 0.0f && f13 <= f12) || (f7 < 0.0f && f13 > f12)) {
            return 0.0f;
        }
        float f14 = f13 - f12;
        return Math.abs(f7) < Math.abs(f14) ? f7 : f14;
    }
}
