package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.tab;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import Tg.b;
import WZ.l;
import a1.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5239d1;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.ui.FontScaleKt;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.MorkovskTabbarVI;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab;", "state", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/tab/MorkovskTabbarTabController;", "controller", "Lkotlin/Function1;", "LTg/b;", "", "onAtomAction", "Landroidx/compose/ui/e;", "modifier", "MorkovskTabbarTab", "(Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab;Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/tab/MorkovskTabbarTabController;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskTabbarTabKt {
    /* JADX WARN: Removed duplicated region for block: B:21:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MorkovskTabbarTab(@NotNull MorkovskTabbarVI.Tab state, MorkovskTabbarTabController morkovskTabbarTabController, @NotNull Function1<? super b, Unit> onAtomAction, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        l lVar;
        boolean F11;
        Object C11;
        boolean z11;
        Object C12;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAtomAction, "onAtomAction");
        C3969l u11 = interfaceC3967k.u(148910043);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(morkovskTabbarTabController) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(onAtomAction) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i14 = i12 & 8;
        if (i14 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            if ((i13 & 1171) == 1170 || !u11.b()) {
                if (i14 != 0) {
                    eVar2 = e.f40358c0;
                }
                u11.o(1583556296);
                lVar = !((Boolean) u11.m(C5239d1.a())).booleanValue() ? null : (l) u11.m(f.e());
                u11.k();
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(1583560405);
                int i15 = i13 & 14;
                F11 = (i15 != 4) | u11.F(lVar);
                C11 = u11.C();
                if (!F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new MorkovskTabbarTabKt$MorkovskTabbarTab$1$1(state, lVar);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
                u11.o(1583564043);
                z11 = ((i13 & 112) != 32) | (i15 != 4);
                C12 = u11.C();
                if (!z11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new MorkovskTabbarTabKt$MorkovskTabbarTab$2$1(morkovskTabbarTabController, state, null);
                    u11.x(C12);
                }
                u11.k();
                Q.e(u11, state, (Function2) C12);
                e eVar4 = eVar2;
                FontScaleKt.FixedFontScale(0.0f, c.c(795671302, new MorkovskTabbarTabKt$MorkovskTabbarTab$3(eVar4, state, lVar, onAtomAction, morkovskTabbarTabController), u11), u11, 48, 1);
                eVar3 = eVar4;
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new MorkovskTabbarTabKt$MorkovskTabbarTab$4(state, morkovskTabbarTabController, onAtomAction, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 1171) == 1170) {
        }
        if (i14 != 0) {
        }
        u11.o(1583556296);
        if (!((Boolean) u11.m(C5239d1.a())).booleanValue()) {
        }
        u11.k();
        AbstractC5434v.a aVar2 = AbstractC5434v.a.ON_RESUME;
        u11.o(1583560405);
        int i152 = i13 & 14;
        F11 = (i152 != 4) | u11.F(lVar);
        C11 = u11.C();
        if (!F11) {
        }
        C11 = new MorkovskTabbarTabKt$MorkovskTabbarTab$1$1(state, lVar);
        u11.x(C11);
        u11.k();
        i.a(aVar2, null, (Function0) C11, u11, 6);
        u11.o(1583564043);
        z11 = ((i13 & 112) != 32) | (i152 != 4);
        C12 = u11.C();
        if (!z11) {
        }
        C12 = new MorkovskTabbarTabKt$MorkovskTabbarTab$2$1(morkovskTabbarTabController, state, null);
        u11.x(C12);
        u11.k();
        Q.e(u11, state, (Function2) C12);
        e eVar42 = eVar2;
        FontScaleKt.FixedFontScale(0.0f, c.c(795671302, new MorkovskTabbarTabKt$MorkovskTabbarTab$3(eVar42, state, lVar, onAtomAction, morkovskTabbarTabController), u11), u11, 48, 1);
        eVar3 = eVar42;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
