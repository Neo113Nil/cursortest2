package qj0;

import P0.E;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: qj0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9072b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static C4912a f82209a = new C4912a(false, 1055500532, a.f82211b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static C4912a f82210b = new C4912a(false, -1978818377, C1396b.f82212b);

    /* renamed from: qj0.b$a */
    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f82211b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                E.b(M0.a.a(), null, null, 0L, interfaceC3967k2, 48, 12);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: qj0.b$b, reason: collision with other inner class name */
    static final class C1396b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1396b f82212b = new C1396b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                E.b(M0.a.a(), null, null, 0L, interfaceC3967k2, 48, 12);
            }
            return Unit.f71690a;
        }
    }
}
