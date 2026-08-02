package ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation;

import Ae.M0;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.C6285b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.feature.notifications.utils.ViewIntent;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.data.PromoPushEnableCellDTO;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013²\u0006\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "LAe/M0;", "Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/presentation/PromoPushEnableVI;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/storefront/feature/notifications/utils/ViewIntent;", "onIntent", "PromoPushEnable", "(Landroidx/compose/ui/e;LAe/M0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/data/PromoPushEnableCellDTO;", "model", "Lkotlin/Function0;", "onClick", "Cell", "(Landroidx/compose/ui/e;Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/data/PromoPushEnableCellDTO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LS0/k;II)V", "notifications_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PromoPushEnableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void Cell(e eVar, PromoPushEnableCellDTO promoPushEnableCellDTO, Function1<? super AtomAction, Unit> function1, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        C3969l u11 = interfaceC3967k.u(-1992244835);
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
            i13 |= u11.F(promoPushEnableCellDTO) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(function0) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
            eVar2 = eVar;
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            CellDTO cell = promoPushEnableCellDTO.getCell();
            u11.o(-1691427967);
            boolean z11 = (i13 & 7168) == 2048;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new PromoPushEnableKt$Cell$1$1(function0);
                u11.x(C11);
            }
            u11.k();
            e eVar3 = eVar;
            DsCellAtomKt.DsCellAtom(cell, eVar3, (Function1) C11, u11, CellDTO.$stable | ((i13 << 3) & 112), 0);
            Unit unit = Unit.f71690a;
            u11.o(-1691420822);
            boolean F11 = u11.F(promoPushEnableCellDTO) | ((i13 & 896) == 256);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new PromoPushEnableKt$Cell$2$1(function1, promoPushEnableCellDTO, null);
                u11.x(C12);
            }
            u11.k();
            Q.e(u11, unit, (Function2) C12);
            eVar2 = eVar3;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PromoPushEnableKt$Cell$3(eVar2, promoPushEnableCellDTO, function1, function0, i11, i12));
        }
    }

    public static final void PromoPushEnable(e eVar, @NotNull M0<PromoPushEnableVI> state, @NotNull Function1<? super AtomAction, Unit> function1, @NotNull Function1<? super ViewIntent, Unit> onIntent, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        e eVar3;
        Function1<? super AtomAction, Unit> actionHandler = function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onIntent, "onIntent");
        C3969l u11 = interfaceC3967k.u(-1537436810);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(state) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(onIntent) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i15 = i13;
        if ((i15 & 1171) == 1170 && u11.b()) {
            u11.j();
            eVar3 = eVar2;
        } else {
            eVar3 = i14 != 0 ? e.f40358c0 : eVar2;
            InterfaceC3978p0 c11 = C6285b.c(state, u11, (i15 >> 3) & 14);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, eVar3);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            PromoPushEnableVI PromoPushEnable$lambda$0 = PromoPushEnable$lambda$0(c11);
            List<PromoPushEnableCellDTO> cells = PromoPushEnable$lambda$0 != null ? PromoPushEnable$lambda$0.getCells() : null;
            u11.o(-1376972449);
            if (cells != null) {
                for (PromoPushEnableCellDTO promoPushEnableCellDTO : cells) {
                    e j11 = T.j(e.f40358c0, 0.0f, 0.0f, 0.0f, DsSpacings.INSTANCE.m1854getDp4D9Ej5fM(), 7);
                    u11.o(668340477);
                    boolean F11 = ((i15 & 7168) == 2048) | u11.F(promoPushEnableCellDTO);
                    Object C11 = u11.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new PromoPushEnableKt$PromoPushEnable$1$1$1$1(onIntent, promoPushEnableCellDTO);
                        u11.x(C11);
                    }
                    u11.k();
                    Cell(j11, promoPushEnableCellDTO, actionHandler, (Function0) C11, u11, i15 & 896, 0);
                    actionHandler = function1;
                }
            }
            u11.k();
            PromoPushEnableVI PromoPushEnable$lambda$02 = PromoPushEnable$lambda$0(c11);
            ButtonV3DTO button = PromoPushEnable$lambda$02 != null ? PromoPushEnable$lambda$02.getButton() : null;
            u11.o(-1376963214);
            if (button != null) {
                DsButtonAtomKt.DsButtonAtom(button, T.j(a0.e(e.f40358c0, 1.0f), 0.0f, DsSpacings.INSTANCE.m1848getDp20D9Ej5fM(), 0.0f, 0.0f, 13), false, function1, u11, (i15 << 3) & 7168, 4);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PromoPushEnableKt$PromoPushEnable$2(eVar3, state, function1, onIntent, i11, i12));
        }
    }

    private static final PromoPushEnableVI PromoPushEnable$lambda$0(A1<PromoPushEnableVI> a12) {
        return a12.getValue();
    }
}
