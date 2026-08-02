package u00;

import J0.u3;
import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u0.InterfaceC9890C;

/* renamed from: u00.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9916a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static C4912a f99691a = new C4912a(false, 675589264, C2194a.f99692b);

    /* renamed from: u00.a$a, reason: collision with other inner class name */
    static final class C2194a extends AbstractC7737t implements InterfaceC6511n<InterfaceC9890C, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C2194a f99692b = new C2194a(3);

        @Override // fd.InterfaceC6511n
        public final Unit invoke(InterfaceC9890C interfaceC9890C, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC9890C Button = interfaceC9890C;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                u3.b("Перезапустить приложение", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 6, 0, 131070);
            }
            return Unit.f71690a;
        }
    }
}
