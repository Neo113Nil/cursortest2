package f00;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p00.InterfaceC8826b;

/* renamed from: f00.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC6396b extends InterfaceC6395a {

    /* renamed from: f00.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private static final C0986a f62426a = new C0986a();

        /* renamed from: f00.b$a$a, reason: collision with other inner class name */
        public static final class C0986a implements InterfaceC6396b {
            @Override // f00.InterfaceC6396b
            public final boolean C() {
                return true;
            }

            @Override // f00.InterfaceC6396b
            public final boolean E(InterfaceC8826b.a flag) {
                Intrinsics.checkNotNullParameter(flag, "flag");
                return false;
            }

            @Override // f00.InterfaceC6396b
            public final boolean k() {
                return false;
            }

            @Override // Ld0.e
            public final void onInstantPluginsCreated() {
            }
        }

        @NotNull
        public static C0986a a() {
            return f62426a;
        }
    }

    boolean C();

    boolean E(@NotNull InterfaceC8826b.a aVar);

    boolean k();
}
