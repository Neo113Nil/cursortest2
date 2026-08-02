package wg0;

import J0.u3;
import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.components.cell.addons.OziCellCenterScope;
import ru.ozon.uni.ozi.theme.OziTheme;

/* renamed from: wg0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10554a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static C4912a f104505a = new C4912a(false, 917501703, C2260a.f104507b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static C4912a f104506b = new C4912a(false, 1668972232, b.f104508b);

    /* renamed from: wg0.a$a, reason: collision with other inner class name */
    static final class C2260a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C2260a f104507b = new C2260a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                OziTheme oziTheme = OziTheme.INSTANCE;
                u3.b("STG ОКРУЖЕНИЕ", null, oziTheme.getColors(interfaceC3967k2, OziTheme.$stable).getTextTertiaryTransparent(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, oziTheme.getTypography().getBodyControl400(), interfaceC3967k2, 6, 0, 65530);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: wg0.a$b */
    static final class b extends AbstractC7737t implements InterfaceC6511n<OziCellCenterScope, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f104508b = new b(3);

        @Override // fd.InterfaceC6511n
        public final Unit invoke(OziCellCenterScope oziCellCenterScope, InterfaceC3967k interfaceC3967k, Integer num) {
            OziCellCenterScope OziCell = oziCellCenterScope;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(OziCell, "$this$OziCell");
            if ((intValue & 6) == 0) {
                intValue |= interfaceC3967k2.n(OziCell) ? 4 : 2;
            }
            if ((intValue & 19) == 18 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                OziCell.Custom(null, C10554a.f104505a, interfaceC3967k2, ((intValue << 6) & 896) | 48, 1);
            }
            return Unit.f71690a;
        }
    }
}
