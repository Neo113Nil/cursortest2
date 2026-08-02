package ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.presentation;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.presentation.BloggerPersonalDataFormVI;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u0010\u001a\u00020\b*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$Overlay;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "BloggerPersonalDataFormBottomOverlay", "(Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$Overlay;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Landroidx/compose/ui/e;", "LZ1/h;", "strokeWidth", "cornerRadius", "Ll1/Z;", "color", "topRoundedBorderOutside-B2jEHPA", "(Landroidx/compose/ui/e;FFJ)Landroidx/compose/ui/e;", "topRoundedBorderOutside", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BloggerPersonalDataFormOverlayKt {
    public static final void BloggerPersonalDataFormBottomOverlay(@NotNull BloggerPersonalDataFormVI.Overlay state, @NotNull Function1<? super AtomAction, Unit> onAction, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Function1<? super AtomAction, Unit> function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        C3969l u11 = interfaceC3967k.u(1200857385);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onAction) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            function1 = onAction;
        } else {
            e.a aVar = e.f40358c0;
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i13 = UniTheme.$stable;
            b11 = androidx.compose.foundation.e.b(aVar, uniTheme.getColors(u11, i13).getLayerFloor1(), y0.a());
            e e11 = a0.e(m808topRoundedBorderOutsideB2jEHPA(b11, 1, 24, uniTheme.getColors(u11, i13).getGraphicStrokeSticky()), 1.0f);
            float f7 = 8;
            e i14 = T.i(e11, f7, f7, f7, 4);
            V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, i14);
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
            function1 = onAction;
            DsButtonAtomKt.DsButtonAtom(state.getSubmitButton(), GZ.e.c(u11, f12, aVar, 1.0f), false, function1, u11, ((i12 << 6) & 7168) | 48, 4);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new BloggerPersonalDataFormOverlayKt$BloggerPersonalDataFormBottomOverlay$2(state, function1, i11));
        }
    }

    /* renamed from: topRoundedBorderOutside-B2jEHPA, reason: not valid java name */
    private static final e m808topRoundedBorderOutsideB2jEHPA(e eVar, float f7, float f11, long j11) {
        return androidx.compose.ui.draw.c.c(eVar, new BloggerPersonalDataFormOverlayKt$topRoundedBorderOutside$1(f7, f11, j11));
    }
}
