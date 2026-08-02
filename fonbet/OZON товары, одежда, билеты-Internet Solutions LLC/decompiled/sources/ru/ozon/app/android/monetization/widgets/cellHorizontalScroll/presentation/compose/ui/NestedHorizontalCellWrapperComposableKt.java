package ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.compose.ui;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.C8385f;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.repository.UniTheme;
import u0.EnumC9909s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a=\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellDTO", "", "useFullWidth", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "NestedHorizontalCellWrapperComposable", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;ZLandroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NestedHorizontalCellWrapperComposableKt {
    public static final void NestedHorizontalCellWrapperComposable(@NotNull CellDTO cellDTO, boolean z11, e eVar, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        CornerRadius cornerRadius;
        Intrinsics.checkNotNullParameter(cellDTO, "cellDTO");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-1759789327);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? u11.n(cellDTO) : u11.F(cellDTO) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.p(z11) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(actionHandler) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
            eVar2 = eVar;
        } else {
            e eVar3 = i14 != 0 ? e.f40358c0 : eVar;
            e.a aVar = e.f40358c0;
            e l02 = a0.u(eVar3, 3).l0(!z11 ? a0.r(aVar, 288) : a0.x(aVar, null, 3));
            float f7 = 1;
            long layerSurface = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerSurface();
            CellDTO.Settings settings = cellDTO.getSettings();
            e c11 = C8385f.c(f7, layerSurface, l02, h.b((settings == null || (cornerRadius = settings.getCornerRadius()) == null) ? 0 : cornerRadius.m1866getDpD9Ej5fM()));
            V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, c11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f13 = E.f(u11, f11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f13);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            DsCellAtomKt.DsCellAtom(cellDTO, M.c(e.f40358c0, EnumC9909s.Max), actionHandler, u11, ((i13 >> 3) & 896) | CellDTO.$stable | 48 | (i13 & 14), 0);
            u11.f();
            eVar2 = eVar3;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new NestedHorizontalCellWrapperComposableKt$NestedHorizontalCellWrapperComposable$2(cellDTO, z11, eVar2, actionHandler, i11, i12));
        }
    }
}
