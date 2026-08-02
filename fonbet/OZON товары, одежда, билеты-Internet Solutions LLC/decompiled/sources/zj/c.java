package zj;

import Sd0.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class c extends g {

    /* renamed from: a, reason: collision with root package name */
    private final a f109300a = new a();

    public static final class a extends Td0.a {

        /* renamed from: a, reason: collision with root package name */
        private final C2357a f109301a = new C2357a();

        /* renamed from: zj.c$a$a, reason: collision with other inner class name */
        public static final class C2357a extends Td0.b {
            @Override // Td0.b
            public final Td0.d a(Rd0.a debugMenuEnvironment) {
                Intrinsics.checkNotNullParameter(debugMenuEnvironment, "debugMenuEnvironment");
                return new b(debugMenuEnvironment);
            }
        }

        a() {
        }

        @Override // Td0.a
        public final Td0.b a() {
            return this.f109301a;
        }
    }

    c() {
    }

    @Override // Sd0.g
    public final Td0.a getDebugHandler() {
        return this.f109300a;
    }
}
