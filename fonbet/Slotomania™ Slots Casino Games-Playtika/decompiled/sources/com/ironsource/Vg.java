package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public interface Vg {

    public static final class a {
        public static final C0187a a = new C0187a(null);

        /* renamed from: com.ironsource.Vg$a$a, reason: collision with other inner class name */
        public static final class C0187a {
            public /* synthetic */ C0187a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Vg a(boolean z, Og waterfallOperations) {
                Intrinsics.checkNotNullParameter(waterfallOperations, "waterfallOperations");
                return z ? new Tg(waterfallOperations) : new Sg(waterfallOperations);
            }

            private C0187a() {
            }
        }
    }

    void a();

    void a(B b);

    Nd b();

    default B c() {
        return null;
    }
}
