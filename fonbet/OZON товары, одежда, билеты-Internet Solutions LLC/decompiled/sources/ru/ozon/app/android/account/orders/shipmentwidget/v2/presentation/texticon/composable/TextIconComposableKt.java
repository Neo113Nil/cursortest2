package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.texticon.composable;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import T7.E;
import WZ.l;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.texticon.viewItem.TextIconVO;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a=\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\f*\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u000e\u001a+\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016²\u0006\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00148\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/texticon/viewItem/TextIconVO;", "item", "Landroidx/compose/ui/e;", "modifier", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "TextIconComposable", "(Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/texticon/viewItem/TextIconVO;Landroidx/compose/ui/e;Lru/ozon/app/android/storage/startupArgs/StartupArgsService;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "LZ1/h;", "getLeftPadding", "(Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/texticon/viewItem/TextIconVO;)F", "getRightPadding", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "clickAction", "(Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lkotlin/jvm/functions/Function1;)V", "", "tick", "cs-orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextIconComposableKt {
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0234, code lost:
    
        if (r8 == null) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x039e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextIconComposable(@NotNull TextIconVO item, e eVar, @NotNull StartupArgsService startupArgsService, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        e eVar3;
        boolean n11;
        Object C11;
        InterfaceC3978p0 interfaceC3978p0;
        boolean F11;
        Object C12;
        boolean F12;
        Object C13;
        Object C14;
        boolean F13;
        Object C15;
        int I11;
        String TextIconComposable$lambda$1;
        OzonSpannableString text;
        Object C16;
        boolean n12;
        Unit unit;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(startupArgsService, "startupArgsService");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(94072950);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                i13 |= u11.F(startupArgsService) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i12 & 8) == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                i13 |= u11.F(actionHandler) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            i14 = i13;
            if ((i14 & 1171) == 1170 || !u11.b()) {
                eVar3 = i15 == 0 ? e.f40358c0 : eVar2;
                l lVar = (l) u11.m(f.e());
                InterfaceC7851b interfaceC7851b = (InterfaceC7851b) u11.m(f.c());
                Object timeLeft = item.getTimeLeft();
                u11.o(-6577452);
                n11 = u11.n(timeLeft);
                C11 = u11.C();
                if (!n11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = n1.f(null, D1.f25195a);
                    u11.x(C11);
                }
                interfaceC3978p0 = (InterfaceC3978p0) C11;
                u11.k();
                boolean argValue = startupArgsService.getArgValue("STATIC_TIMERS");
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(-6570966);
                F11 = u11.F(item) | u11.F(lVar);
                C12 = u11.C();
                if (!F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new TextIconComposableKt$TextIconComposable$1$1(item, lVar);
                    u11.x(C12);
                }
                u11.k();
                i.a(aVar, null, (Function0) C12, u11, 6);
                DateTime timeLeft2 = item.getTimeLeft();
                u11.o(-6566771);
                F12 = u11.F(item) | u11.n(interfaceC3978p0) | u11.F(interfaceC7851b) | u11.p(argValue);
                C13 = u11.C();
                if (!F12 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new TextIconComposableKt$TextIconComposable$2$1(item, argValue, interfaceC3978p0, interfaceC7851b);
                    u11.x(C13);
                }
                u11.k();
                Q.c(timeLeft2, (Function1) C13, u11);
                e j11 = T.j(a0.e(eVar3, 1.0f), getLeftPadding(item), 0.0f, getRightPadding(item), 0.0f, 10);
                u11.o(-6540990);
                C14 = u11.C();
                if (C14 == InterfaceC3967k.a.a()) {
                    C14 = p.a();
                    u11.x(C14);
                }
                q qVar = (q) C14;
                u11.k();
                u11.o(-6538730);
                F13 = u11.F(item) | ((i14 & 7168) != 2048);
                C15 = u11.C();
                if (!F13 || C15 == InterfaceC3967k.a.a()) {
                    C15 = new TextIconComposableKt$TextIconComposable$4$1(item, actionHandler);
                    u11.x(C15);
                }
                u11.k();
                e b11 = androidx.compose.foundation.i.b(j11, qVar, null, false, null, null, (Function0) C15, 28);
                Y b12 = X.b(C5179b.d(), InterfaceC6250b.a.l(), u11, 54);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = c.f(u11, b11);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a11);
                }
                Function2 h11 = Cm.e.h(u11, b12, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, h11);
                }
                F1.b(u11, f7, InterfaceC2801g.a.f());
                TextDTO text2 = item.getText();
                TextIconComposable$lambda$1 = TextIconComposable$lambda$1(interfaceC3978p0);
                if (TextIconComposable$lambda$1 != null) {
                    text = OzonSpannableStringKt.toOzonSpannableString(((Object) item.getText().getText()) + " " + TextIconComposable$lambda$1);
                }
                text = item.getText().getText();
                TextDTO copy$default = TextDTO.copy$default(text2, text, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
                u11.o(-1239848863);
                C16 = u11.C();
                if (C16 == InterfaceC3967k.a.a()) {
                    C16 = p.a();
                    u11.x(C16);
                }
                q qVar2 = (q) C16;
                u11.k();
                Object common = item.getCommon();
                u11.o(-1239846193);
                n12 = u11.n(common);
                Object C17 = u11.C();
                if (!n12 || C17 == InterfaceC3967k.a.a()) {
                    if (1.0f > 0.0d) {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                    }
                    C17 = androidx.compose.foundation.i.b(eVar3.l0(new LayoutWeightElement(1.0f, false)), qVar2, null, false, null, null, new TextIconComposableKt$TextIconComposable$5$textIconModifier$1$1(item, actionHandler), 28);
                    u11.x(C17);
                }
                e eVar4 = (e) C17;
                u11.k();
                String icon = copy$default.getIcon();
                u11.o(-1239831657);
                if (icon == null) {
                    unit = null;
                } else {
                    TextWithTrailingIconKt.TextWithTrailingIcon(copy$default, icon, TextIconComposable$lambda$1(interfaceC3978p0) != null, eVar4, u11, 0, 0);
                    unit = Unit.f71690a;
                }
                u11.k();
                u11.o(-1239831958);
                if (unit == null) {
                    DsTextAtomKt.DsTextAtom(copy$default, eVar4, u11, 0, 0);
                    Unit unit2 = Unit.f71690a;
                }
                u11.k();
                BadgeDTO badge = item.getBadge();
                u11.o(-1239819549);
                if (badge != null) {
                    e.a aVar2 = e.f40358c0;
                    e j12 = T.j(aVar2, 6, 0.0f, 0.0f, 0.0f, 14);
                    V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
                    int I12 = u11.I();
                    A0 d12 = u11.d();
                    e f12 = c.f(u11, j12);
                    Function0 a12 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                        u11.H(a12);
                    } else {
                        u11.e();
                    }
                    Function2 f13 = E.f(u11, f11, u11, d12);
                    if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                        a.d(I12, u11, I12, f13);
                    }
                    F1.b(u11, f12, InterfaceC2801g.a.f());
                    DsBadgeAtomKt.DsBadgeAtom(badge, aVar2, actionHandler, u11, ((i14 >> 3) & 896) | 48, 0);
                    u11.f();
                    Unit unit3 = Unit.f71690a;
                }
                u11.k();
                u11.f();
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            J0 m02 = u11.m0();
            if (m02 != null) {
                m02.G(new TextIconComposableKt$TextIconComposable$6(item, eVar3, startupArgsService, actionHandler, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i12 & 4) == 0) {
        }
        if ((i12 & 8) == 0) {
        }
        i14 = i13;
        if ((i14 & 1171) == 1170) {
        }
        if (i15 == 0) {
        }
        l lVar2 = (l) u11.m(f.e());
        InterfaceC7851b interfaceC7851b2 = (InterfaceC7851b) u11.m(f.c());
        Object timeLeft3 = item.getTimeLeft();
        u11.o(-6577452);
        n11 = u11.n(timeLeft3);
        C11 = u11.C();
        if (!n11) {
        }
        C11 = n1.f(null, D1.f25195a);
        u11.x(C11);
        interfaceC3978p0 = (InterfaceC3978p0) C11;
        u11.k();
        boolean argValue2 = startupArgsService.getArgValue("STATIC_TIMERS");
        AbstractC5434v.a aVar3 = AbstractC5434v.a.ON_RESUME;
        u11.o(-6570966);
        F11 = u11.F(item) | u11.F(lVar2);
        C12 = u11.C();
        if (!F11) {
        }
        C12 = new TextIconComposableKt$TextIconComposable$1$1(item, lVar2);
        u11.x(C12);
        u11.k();
        i.a(aVar3, null, (Function0) C12, u11, 6);
        DateTime timeLeft22 = item.getTimeLeft();
        u11.o(-6566771);
        F12 = u11.F(item) | u11.n(interfaceC3978p0) | u11.F(interfaceC7851b2) | u11.p(argValue2);
        C13 = u11.C();
        if (!F12) {
        }
        C13 = new TextIconComposableKt$TextIconComposable$2$1(item, argValue2, interfaceC3978p0, interfaceC7851b2);
        u11.x(C13);
        u11.k();
        Q.c(timeLeft22, (Function1) C13, u11);
        e j112 = T.j(a0.e(eVar3, 1.0f), getLeftPadding(item), 0.0f, getRightPadding(item), 0.0f, 10);
        u11.o(-6540990);
        C14 = u11.C();
        if (C14 == InterfaceC3967k.a.a()) {
        }
        q qVar3 = (q) C14;
        u11.k();
        u11.o(-6538730);
        F13 = u11.F(item) | ((i14 & 7168) != 2048);
        C15 = u11.C();
        if (!F13) {
        }
        C15 = new TextIconComposableKt$TextIconComposable$4$1(item, actionHandler);
        u11.x(C15);
        u11.k();
        e b112 = androidx.compose.foundation.i.b(j112, qVar3, null, false, null, null, (Function0) C15, 28);
        Y b122 = X.b(C5179b.d(), InterfaceC6250b.a.l(), u11, 54);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f72 = c.f(u11, b112);
        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h112 = Cm.e.h(u11, b122, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, h112);
        F1.b(u11, f72, InterfaceC2801g.a.f());
        TextDTO text22 = item.getText();
        TextIconComposable$lambda$1 = TextIconComposable$lambda$1(interfaceC3978p0);
        if (TextIconComposable$lambda$1 != null) {
        }
        text = item.getText().getText();
        TextDTO copy$default2 = TextDTO.copy$default(text22, text, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
        u11.o(-1239848863);
        C16 = u11.C();
        if (C16 == InterfaceC3967k.a.a()) {
        }
        q qVar22 = (q) C16;
        u11.k();
        Object common2 = item.getCommon();
        u11.o(-1239846193);
        n12 = u11.n(common2);
        Object C172 = u11.C();
        if (!n12) {
        }
        if (1.0f > 0.0d) {
        }
    }

    private static final String TextIconComposable$lambda$1(InterfaceC3978p0<String> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickAction(CommonControlSettings commonControlSettings, Function1<? super AtomAction, Unit> function1) {
        AtomAction atomAction;
        AtomActionDTO action = commonControlSettings.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, commonControlSettings.getTrackingInfo())) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private static final float getLeftPadding(TextIconVO textIconVO) {
        return textIconVO.getShipmentHorizontalPadding().getLeft().m1867getDpD9Ej5fM() + textIconVO.getHorizontalPadding().getLeft().m1867getDpD9Ej5fM();
    }

    private static final float getRightPadding(TextIconVO textIconVO) {
        return textIconVO.getShipmentHorizontalPadding().getRight().m1867getDpD9Ej5fM() + textIconVO.getHorizontalPadding().getRight().m1867getDpD9Ej5fM();
    }
}
