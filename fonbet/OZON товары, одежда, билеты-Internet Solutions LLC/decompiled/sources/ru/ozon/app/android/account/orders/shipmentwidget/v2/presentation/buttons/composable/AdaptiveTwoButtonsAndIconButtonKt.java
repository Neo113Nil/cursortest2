package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.composable;

import B1.v0;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ae\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "LZ1/h;", "horizontalSpacing", "verticalSpacing", "Lkotlin/Function1;", "", "firstButton", "secondButton", "Lkotlin/Function0;", "iconButton", "AdaptiveTwoButtonsAndIconButtonLayout-ZUYZQmM", "(Landroidx/compose/ui/e;FFLfd/n;Lfd/n;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "AdaptiveTwoButtonsAndIconButtonLayout", "cs-orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdaptiveTwoButtonsAndIconButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x005e  */
    /* renamed from: AdaptiveTwoButtonsAndIconButtonLayout-ZUYZQmM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m465AdaptiveTwoButtonsAndIconButtonLayoutZUYZQmM(e eVar, float f7, float f11, @NotNull InterfaceC6511n<? super e, ? super InterfaceC3967k, ? super Integer, Unit> firstButton, @NotNull InterfaceC6511n<? super e, ? super InterfaceC3967k, ? super Integer, Unit> secondButton, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        float f12;
        int i14;
        float f13;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function22;
        float f14;
        boolean z11;
        Object C11;
        int i15;
        float f15;
        float f16;
        float f17;
        J0 m02;
        Intrinsics.checkNotNullParameter(firstButton, "firstButton");
        Intrinsics.checkNotNullParameter(secondButton, "secondButton");
        C3969l u11 = interfaceC3967k.u(-451823815);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        int i17 = i12 & 2;
        if (i17 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            f12 = f7;
            i13 |= u11.q(f12) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                f13 = f11;
                i13 |= u11.q(f13) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i12 & 8) != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    i13 |= u11.F(firstButton) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                }
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    i13 |= u11.F(secondButton) ? 16384 : 8192;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    function22 = function2;
                    i13 |= u11.F(function22) ? 131072 : 65536;
                    if ((i13 & 74899) == 74898 || !u11.b()) {
                        e eVar3 = i16 == 0 ? e.f40358c0 : eVar2;
                        f14 = i17 == 0 ? 8 : f12;
                        if (i14 != 0) {
                            f13 = 8;
                        }
                        u11.o(-382562434);
                        z11 = ((i13 & 112) != 32) | ((i13 & 896) != 256) | ((i13 & 7168) != 2048) | ((57344 & i13) != 16384) | ((458752 & i13) == 131072);
                        C11 = u11.C();
                        if (!z11 || C11 == InterfaceC3967k.a.a()) {
                            i15 = i13;
                            f15 = f13;
                            AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1 adaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1 = new AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1(f14, f15, function22, firstButton, secondButton);
                            u11.x(adaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1);
                            C11 = adaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1;
                        } else {
                            i15 = i13;
                            f15 = f13;
                        }
                        u11.k();
                        v0.b(eVar3, (Function2) C11, u11, i15 & 14, 0);
                        f16 = f15;
                        f17 = f14;
                        eVar2 = eVar3;
                    } else {
                        u11.j();
                        f17 = f12;
                        f16 = f13;
                    }
                    m02 = u11.m0();
                    if (m02 == null) {
                        m02.G(new AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$2(eVar2, f17, f16, firstButton, secondButton, function2, i11, i12));
                        return;
                    }
                    return;
                }
                function22 = function2;
                if ((i13 & 74899) == 74898) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i14 != 0) {
                }
                u11.o(-382562434);
                z11 = ((i13 & 112) != 32) | ((i13 & 896) != 256) | ((i13 & 7168) != 2048) | ((57344 & i13) != 16384) | ((458752 & i13) == 131072);
                C11 = u11.C();
                if (z11) {
                }
                i15 = i13;
                f15 = f13;
                AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1 adaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$12 = new AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1(f14, f15, function22, firstButton, secondButton);
                u11.x(adaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$12);
                C11 = adaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$12;
                u11.k();
                v0.b(eVar3, (Function2) C11, u11, i15 & 14, 0);
                f16 = f15;
                f17 = f14;
                eVar2 = eVar3;
                m02 = u11.m0();
                if (m02 == null) {
                }
            }
            f13 = f11;
            if ((i12 & 8) != 0) {
            }
            if ((i12 & 16) != 0) {
            }
            if ((i12 & 32) != 0) {
            }
            function22 = function2;
            if ((i13 & 74899) == 74898) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i14 != 0) {
            }
            u11.o(-382562434);
            z11 = ((i13 & 112) != 32) | ((i13 & 896) != 256) | ((i13 & 7168) != 2048) | ((57344 & i13) != 16384) | ((458752 & i13) == 131072);
            C11 = u11.C();
            if (z11) {
            }
            i15 = i13;
            f15 = f13;
            AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1 adaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$122 = new AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1(f14, f15, function22, firstButton, secondButton);
            u11.x(adaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$122);
            C11 = adaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$122;
            u11.k();
            v0.b(eVar3, (Function2) C11, u11, i15 & 14, 0);
            f16 = f15;
            f17 = f14;
            eVar2 = eVar3;
            m02 = u11.m0();
            if (m02 == null) {
            }
        }
        f12 = f7;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        f13 = f11;
        if ((i12 & 8) != 0) {
        }
        if ((i12 & 16) != 0) {
        }
        if ((i12 & 32) != 0) {
        }
        function22 = function2;
        if ((i13 & 74899) == 74898) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i14 != 0) {
        }
        u11.o(-382562434);
        z11 = ((i13 & 112) != 32) | ((i13 & 896) != 256) | ((i13 & 7168) != 2048) | ((57344 & i13) != 16384) | ((458752 & i13) == 131072);
        C11 = u11.C();
        if (z11) {
        }
        i15 = i13;
        f15 = f13;
        AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1 adaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1222 = new AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1(f14, f15, function22, firstButton, secondButton);
        u11.x(adaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1222);
        C11 = adaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1222;
        u11.k();
        v0.b(eVar3, (Function2) C11, u11, i15 & 14, 0);
        f16 = f15;
        f17 = f14;
        eVar2 = eVar3;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
