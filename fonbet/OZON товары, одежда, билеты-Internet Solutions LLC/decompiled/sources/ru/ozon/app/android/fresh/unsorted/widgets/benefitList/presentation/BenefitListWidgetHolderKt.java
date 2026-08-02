package ru.ozon.app.android.fresh.unsorted.widgets.benefitList.presentation;

import I1.o;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Tg.b;
import WZ.l;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import e3.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.benefitList.presentation.BenefitListVO;
import u0.C9915y;
import v0.C10164d;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001aQ\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/presentation/BenefitListVO;", "item", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "LWZ/l;", "tokenizedAnalytics", "LZ1/h;", "badgesHeight", "", "locator", "BenefitListWidgetHolder-WH-ejsw", "(Landroidx/compose/ui/e;Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/presentation/BenefitListVO;Lkotlin/jvm/functions/Function1;LWZ/l;FLjava/lang/String;LS0/k;II)V", "BenefitListWidgetHolder", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BenefitListWidgetHolderKt {
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00aa  */
    /* renamed from: BenefitListWidgetHolder-WH-ejsw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m765BenefitListWidgetHolderWHejsw(e eVar, @NotNull BenefitListVO item, @NotNull Function1<? super b, Unit> actionHandler, @NotNull l tokenizedAnalytics, float f7, String str, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        float f11;
        int i14;
        String str2;
        float f12;
        String str3;
        boolean F11;
        Object C11;
        boolean z11;
        Object C12;
        boolean F12;
        Object C13;
        String str4;
        C3969l c3969l;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        C3969l u11 = interfaceC3967k.u(-500369345);
        int i15 = i12 & 1;
        if (i15 != 0) {
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
            i13 |= u11.F(item) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(tokenizedAnalytics) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i16 = i12 & 16;
        if (i16 != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            f11 = f7;
            i13 |= u11.q(f11) ? 16384 : 8192;
            i14 = i12 & 32;
            if (i14 == 0) {
                i13 |= 196608;
            } else if ((196608 & i11) == 0) {
                str2 = str;
                i13 |= u11.n(str2) ? 131072 : 65536;
                if ((74899 & i13) == 74898 || !u11.b()) {
                    e eVar4 = i15 != 0 ? e.f40358c0 : eVar2;
                    f12 = i16 != 0 ? 20 : f11;
                    str3 = i14 != 0 ? "benefitList" : str2;
                    AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                    u11.o(278642537);
                    F11 = u11.F(item) | u11.F(tokenizedAnalytics);
                    C11 = u11.C();
                    if (!F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new BenefitListWidgetHolderKt$BenefitListWidgetHolder$1$1(item, tokenizedAnalytics);
                        u11.x(C11);
                    }
                    u11.k();
                    i.a(aVar, null, (Function0) C11, u11, 6);
                    List<BenefitListVO.Badge> badges = item.getBadges();
                    BenefitListVO.Spacers spacers = item.getSpacers();
                    e u12 = a0.u(a0.e(eVar4, 1.0f), 3);
                    u11.o(278651064);
                    z11 = (458752 & i13) == 131072;
                    C12 = u11.C();
                    if (!z11 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new BenefitListWidgetHolderKt$BenefitListWidgetHolder$2$1(str3);
                        u11.x(C12);
                    }
                    u11.k();
                    e c11 = o.c(u12, false, (Function1) C12);
                    String str5 = str3;
                    d.b i17 = InterfaceC6250b.a.i();
                    e eVar5 = eVar4;
                    C9915y c9915y = new C9915y(spacers.getLeft(), spacers.getTop(), spacers.getRight(), spacers.getBottom());
                    u11.o(278661458);
                    F12 = u11.F(badges) | ((57344 & i13) == 16384) | ((i13 & 896) == 256) | u11.F(tokenizedAnalytics);
                    C13 = u11.C();
                    if (!F12 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new BenefitListWidgetHolderKt$BenefitListWidgetHolder$3$1(badges, f12, actionHandler, tokenizedAnalytics);
                        u11.x(C13);
                    }
                    u11.k();
                    str4 = str5;
                    c3969l = u11;
                    C10164d.b(c11, null, c9915y, null, i17, null, false, (Function1) C13, c3969l, 196608, 218);
                    eVar3 = eVar5;
                } else {
                    u11.j();
                    c3969l = u11;
                    eVar3 = eVar2;
                    f12 = f11;
                    str4 = str2;
                }
                m02 = c3969l.m0();
                if (m02 != null) {
                    m02.G(new BenefitListWidgetHolderKt$BenefitListWidgetHolder$4(eVar3, item, actionHandler, tokenizedAnalytics, f12, str4, i11, i12));
                    return;
                }
                return;
            }
            str2 = str;
            if ((74899 & i13) == 74898) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i14 != 0) {
            }
            AbstractC5434v.a aVar2 = AbstractC5434v.a.ON_RESUME;
            u11.o(278642537);
            F11 = u11.F(item) | u11.F(tokenizedAnalytics);
            C11 = u11.C();
            if (!F11) {
            }
            C11 = new BenefitListWidgetHolderKt$BenefitListWidgetHolder$1$1(item, tokenizedAnalytics);
            u11.x(C11);
            u11.k();
            i.a(aVar2, null, (Function0) C11, u11, 6);
            List<BenefitListVO.Badge> badges2 = item.getBadges();
            BenefitListVO.Spacers spacers2 = item.getSpacers();
            e u122 = a0.u(a0.e(eVar4, 1.0f), 3);
            u11.o(278651064);
            if ((458752 & i13) == 131072) {
            }
            C12 = u11.C();
            if (!z11) {
            }
            C12 = new BenefitListWidgetHolderKt$BenefitListWidgetHolder$2$1(str3);
            u11.x(C12);
            u11.k();
            e c112 = o.c(u122, false, (Function1) C12);
            String str52 = str3;
            d.b i172 = InterfaceC6250b.a.i();
            e eVar52 = eVar4;
            C9915y c9915y2 = new C9915y(spacers2.getLeft(), spacers2.getTop(), spacers2.getRight(), spacers2.getBottom());
            u11.o(278661458);
            F12 = u11.F(badges2) | ((57344 & i13) == 16384) | ((i13 & 896) == 256) | u11.F(tokenizedAnalytics);
            C13 = u11.C();
            if (!F12) {
            }
            C13 = new BenefitListWidgetHolderKt$BenefitListWidgetHolder$3$1(badges2, f12, actionHandler, tokenizedAnalytics);
            u11.x(C13);
            u11.k();
            str4 = str52;
            c3969l = u11;
            C10164d.b(c112, null, c9915y2, null, i172, null, false, (Function1) C13, c3969l, 196608, 218);
            eVar3 = eVar52;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        f11 = f7;
        i14 = i12 & 32;
        if (i14 == 0) {
        }
        str2 = str;
        if ((74899 & i13) == 74898) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i14 != 0) {
        }
        AbstractC5434v.a aVar22 = AbstractC5434v.a.ON_RESUME;
        u11.o(278642537);
        F11 = u11.F(item) | u11.F(tokenizedAnalytics);
        C11 = u11.C();
        if (!F11) {
        }
        C11 = new BenefitListWidgetHolderKt$BenefitListWidgetHolder$1$1(item, tokenizedAnalytics);
        u11.x(C11);
        u11.k();
        i.a(aVar22, null, (Function0) C11, u11, 6);
        List<BenefitListVO.Badge> badges22 = item.getBadges();
        BenefitListVO.Spacers spacers22 = item.getSpacers();
        e u1222 = a0.u(a0.e(eVar4, 1.0f), 3);
        u11.o(278651064);
        if ((458752 & i13) == 131072) {
        }
        C12 = u11.C();
        if (!z11) {
        }
        C12 = new BenefitListWidgetHolderKt$BenefitListWidgetHolder$2$1(str3);
        u11.x(C12);
        u11.k();
        e c1122 = o.c(u1222, false, (Function1) C12);
        String str522 = str3;
        d.b i1722 = InterfaceC6250b.a.i();
        e eVar522 = eVar4;
        C9915y c9915y22 = new C9915y(spacers22.getLeft(), spacers22.getTop(), spacers22.getRight(), spacers22.getBottom());
        u11.o(278661458);
        F12 = u11.F(badges22) | ((57344 & i13) == 16384) | ((i13 & 896) == 256) | u11.F(tokenizedAnalytics);
        C13 = u11.C();
        if (!F12) {
        }
        C13 = new BenefitListWidgetHolderKt$BenefitListWidgetHolder$3$1(badges22, f12, actionHandler, tokenizedAnalytics);
        u11.x(C13);
        u11.k();
        str4 = str522;
        c3969l = u11;
        C10164d.b(c1122, null, c9915y22, null, i1722, null, false, (Function1) C13, c3969l, 196608, 218);
        eVar3 = eVar522;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }
}
