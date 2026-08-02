package ru.ozon.app.android.cart.familyGroup.presentation.compose.iconStack;

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
import Z1.h;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.P;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import e1.InterfaceC6250b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.familyGroup.presentation.FamilyGroupVO;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.indicator.DsIndicatorAtomKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lru/ozon/app/android/cart/familyGroup/presentation/FamilyGroupVO$RightBlock;", "item", "", "FamilyGroupIconStackComposable", "(Landroidx/compose/ui/e;Lru/ozon/app/android/cart/familyGroup/presentation/FamilyGroupVO$RightBlock;LS0/k;II)V", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FamilyGroupIconStackComposableKt {
    public static final void FamilyGroupIconStackComposable(e eVar, @NotNull FamilyGroupVO.RightBlock item, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(item, "item");
        C3969l u11 = interfaceC3967k.u(2111499625);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(item) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            List<IconDTO> icons = item.getIcons();
            if (icons.isEmpty()) {
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new FamilyGroupIconStackComposableKt$FamilyGroupIconStackComposable$1(eVar, item, i11, i12));
                    return;
                }
                return;
            }
            int size = icons.size();
            u11.o(949801538);
            boolean r11 = u11.r(size);
            Object C11 = u11.C();
            if (r11 || C11 == InterfaceC3967k.a.a()) {
                FamilyGroupIconStackConstants familyGroupIconStackConstants = FamilyGroupIconStackConstants.INSTANCE;
                float m550getImageSizeD9Ej5fM = familyGroupIconStackConstants.m550getImageSizeD9Ej5fM();
                float m549getImageOffsetD9Ej5fM = familyGroupIconStackConstants.m549getImageOffsetD9Ej5fM();
                int size2 = item.getIcons().size() - 1;
                if (size2 < 0) {
                    size2 = 0;
                }
                C11 = h.a((m549getImageOffsetD9Ej5fM * size2) + m550getImageSizeD9Ej5fM);
                u11.x(C11);
            }
            float d11 = ((h) C11).d();
            u11.k();
            e r12 = a0.r(eVar, d11);
            FamilyGroupIconStackConstants familyGroupIconStackConstants2 = FamilyGroupIconStackConstants.INSTANCE;
            e a11 = Q1.a(a0.f(r12, familyGroupIconStackConstants2.m550getImageSizeD9Ej5fM()), "familyGroupIconStackContainer");
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d12 = u11.d();
            e f11 = c.f(u11, a11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C5187j c5187j = C5187j.f39515a;
            if (item.getIcons().size() == 1) {
                u11.o(118012370);
                DsIconAtomKt.DsIconAtom((IconDTO) C7714v.K(item.getIcons()), a0.n(e.f40358c0, familyGroupIconStackConstants2.m550getImageSizeD9Ej5fM()), u11, IconDTO.$stable | 48, 0);
                u11.k();
            } else {
                u11.o(118241584);
                int i15 = 0;
                for (Object obj : item.getIcons()) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    e.a aVar = e.f40358c0;
                    FamilyGroupIconStackConstants familyGroupIconStackConstants3 = FamilyGroupIconStackConstants.INSTANCE;
                    DsIconAtomKt.DsIconAtom((IconDTO) obj, a0.n(P.c(aVar, familyGroupIconStackConstants3.m549getImageOffsetD9Ej5fM() * i15, 0.0f, 2), familyGroupIconStackConstants3.m550getImageSizeD9Ej5fM()), u11, IconDTO.$stable, 0);
                    i15 = i16;
                }
                u11.k();
            }
            IndicatorDTO indicator = item.getIndicator();
            u11.o(1527846760);
            if (indicator != null) {
                DsIndicatorAtomKt.DsIndicatorAtom(indicator, c5187j.a(e.f40358c0, InterfaceC6250b.a.n()), u11, 0, 0);
            }
            u11.k();
            u11.f();
        }
        J0 m03 = u11.m0();
        if (m03 != null) {
            m03.G(new FamilyGroupIconStackComposableKt$FamilyGroupIconStackComposable$3(eVar, item, i11, i12));
        }
    }
}
