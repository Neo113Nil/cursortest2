package ff0;

import S0.B1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import mf0.InterfaceC8142d;
import org.jetbrains.annotations.NotNull;

/* renamed from: ff0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6554a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final B1 f63393a = new B1(C1020a.f63394b);

    /* renamed from: ff0.a$a, reason: collision with other inner class name */
    static final class C1020a extends AbstractC7737t implements Function0<InterfaceC8142d> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1020a f63394b = new C1020a(0);

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC8142d invoke() {
            throw new IllegalStateException("LocalRouter not present");
        }
    }

    @NotNull
    public static final B1 a() {
        return f63393a;
    }
}
