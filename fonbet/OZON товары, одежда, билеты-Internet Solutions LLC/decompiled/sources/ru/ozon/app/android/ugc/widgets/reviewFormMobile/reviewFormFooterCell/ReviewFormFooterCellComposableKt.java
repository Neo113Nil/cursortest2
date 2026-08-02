package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormFooterCell;

import A0.h;
import B1.B;
import D1.InterfaceC2801g;
import E0.C2942q;
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
import Tg.b;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.i2;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.tooltip.ActiveTooltip;
import ru.ozon.app.android.pdp.ui.configurators.tooltip.AnimatedTooltipKt;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.J;
import u0.M;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0089\u0001\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001ay\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019²\u0006\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00118\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormFooterCell/ReviewFormFooterCellVO;", "item", "", "tooltipClosed", "isTooltipVisible", "Lkotlin/Function1;", "LTg/b;", "", "onClick", "", "shouldShowTooltip", "Lkotlin/Function0;", "onTooltipActivated", "onTooltipClosed", "onTooltipShown", "ReviewFormFooterCellComposable", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormFooterCell/ReviewFormFooterCellVO;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "LB1/B;", "anchorCoordinates", "TooltipSyncEffect", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormFooterCell/ReviewFormFooterCellVO;ZZLB1/B;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "LZ1/h;", "DEFAULT_PADDING", "F", "tooltipAnchorCoordinates", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormFooterCellComposableKt {
    private static final float DEFAULT_PADDING = Paddings.PADDING_300.m1867getDpD9Ej5fM();

    /* JADX WARN: Removed duplicated region for block: B:104:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReviewFormFooterCellComposable(@NotNull ReviewFormFooterCellVO item, boolean z11, boolean z12, Function1<? super b, Unit> function1, @NotNull Function1<? super String, Boolean> shouldShowTooltip, @NotNull Function0<Unit> onTooltipActivated, @NotNull Function0<Unit> onTooltipClosed, @NotNull Function1<? super String, Unit> onTooltipShown, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        Function1<? super b, Unit> function12;
        int i16;
        Object C11;
        boolean n11;
        Object C12;
        int i17;
        ActiveTooltip activeTooltip;
        C3969l c3969l;
        CornerRadius cornerRadius;
        int I11;
        boolean z15;
        Function1<? super b, Unit> function13;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(shouldShowTooltip, "shouldShowTooltip");
        Intrinsics.checkNotNullParameter(onTooltipActivated, "onTooltipActivated");
        Intrinsics.checkNotNullParameter(onTooltipClosed, "onTooltipClosed");
        Intrinsics.checkNotNullParameter(onTooltipShown, "onTooltipShown");
        C3969l u11 = interfaceC3967k.u(-839198329);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? u11.n(item) : u11.F(item) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i18 = i12 & 2;
        if (i18 != 0) {
            i13 |= 48;
            z13 = z11;
        } else {
            z13 = z11;
            if ((i11 & 48) == 0) {
                i13 |= u11.p(z13) ? 32 : 16;
                i14 = 4 & i12;
                if (i14 == 0) {
                    i13 |= 384;
                } else if ((i11 & 384) == 0) {
                    z14 = z12;
                    i13 |= u11.p(z14) ? 256 : 128;
                    i15 = i12 & 8;
                    if (i15 != 0) {
                        i13 |= 3072;
                    } else if ((i11 & 3072) == 0) {
                        function12 = function1;
                        i13 |= u11.F(function12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                        if ((i12 & 16) == 0) {
                            i13 |= 24576;
                        } else if ((i11 & 24576) == 0) {
                            i13 |= u11.F(shouldShowTooltip) ? 16384 : 8192;
                        }
                        if ((i12 & 32) == 0) {
                            i13 |= 196608;
                        } else if ((i11 & 196608) == 0) {
                            i13 |= u11.F(onTooltipActivated) ? 131072 : 65536;
                        }
                        if ((i12 & 64) == 0) {
                            i13 |= 1572864;
                        } else if ((i11 & 1572864) == 0) {
                            i13 |= u11.F(onTooltipClosed) ? 1048576 : 524288;
                        }
                        if ((128 & i12) == 0) {
                            i13 |= 12582912;
                        } else if ((i11 & 12582912) == 0) {
                            i13 |= u11.F(onTooltipShown) ? 8388608 : 4194304;
                        }
                        i16 = i13;
                        if ((4793491 & i16) == 4793490 || !u11.b()) {
                            if (i18 != 0) {
                                z13 = true;
                            }
                            if (i14 != 0) {
                                z14 = false;
                            }
                            if (i15 != 0) {
                                u11.o(-1055034642);
                                Object C13 = u11.C();
                                if (C13 == InterfaceC3967k.a.a()) {
                                    C13 = ReviewFormFooterCellComposableKt$ReviewFormFooterCellComposable$1$1.INSTANCE;
                                    u11.x(C13);
                                }
                                u11.k();
                                function12 = (Function1) C13;
                            }
                            u11.o(-1055028287);
                            C11 = u11.C();
                            if (C11 == InterfaceC3967k.a.a()) {
                                C11 = n1.f(null, D1.f25195a);
                                u11.x(C11);
                            }
                            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
                            u11.k();
                            B ReviewFormFooterCellComposable$lambda$2 = ReviewFormFooterCellComposable$lambda$2(interfaceC3978p0);
                            u11.o(-1055025481);
                            int i19 = i16 & 896;
                            n11 = u11.n(ReviewFormFooterCellComposable$lambda$2) | (i19 != 256);
                            C12 = u11.C();
                            if (!n11 || C12 == InterfaceC3967k.a.a()) {
                                if (z14 || ReviewFormFooterCellComposable$lambda$2(interfaceC3978p0) == null || item.getTooltip() == null) {
                                    i17 = i16;
                                    activeTooltip = null;
                                } else {
                                    i17 = i16;
                                    activeTooltip = new ActiveTooltip(item.getTooltipKey(), item.getTooltip(), ReviewFormFooterCellComposable$lambda$2(interfaceC3978p0));
                                }
                                u11.x(activeTooltip);
                                C12 = activeTooltip;
                            } else {
                                i17 = i16;
                            }
                            ActiveTooltip activeTooltip2 = (ActiveTooltip) C12;
                            u11.k();
                            B ReviewFormFooterCellComposable$lambda$22 = ReviewFormFooterCellComposable$lambda$2(interfaceC3978p0);
                            int i21 = CellDTO.$stable;
                            int i22 = i17 >> 3;
                            c3969l = u11;
                            boolean z16 = z13;
                            boolean z17 = z14;
                            int i23 = i17;
                            TooltipSyncEffect(item, z16, z17, ReviewFormFooterCellComposable$lambda$22, shouldShowTooltip, onTooltipActivated, onTooltipShown, onTooltipClosed, c3969l, ((i17 << 3) & 29360128) | TooltipDTO.$stable | i21 | (i17 & 14) | (i17 & 112) | i19 | (i17 & 57344) | (i17 & 458752) | (3670016 & i22));
                            e eVar = e.f40358c0;
                            e e11 = a0.e(eVar, 1.0f);
                            C7807Z parseColorToken = TokenParserKt.parseColorToken(item.getBackgroundColor(), c3969l, 0);
                            c3969l.o(-1054998640);
                            long bgSecondary = parseColorToken != null ? UniTheme.INSTANCE.getColors(c3969l, UniTheme.$stable).getBgSecondary() : parseColorToken.w();
                            c3969l.k();
                            cornerRadius = item.getCornerRadius();
                            if (cornerRadius == null) {
                                cornerRadius = CornerRadius.RADIUS_500;
                            }
                            e h11 = T.h(androidx.compose.foundation.e.b(e11, bgSecondary, h.b(cornerRadius.m1866getDpD9Ej5fM())), DEFAULT_PADDING, 0.0f, 2);
                            Y b11 = X.b(C5179b.d(), InterfaceC6250b.a.i(), c3969l, 54);
                            I11 = c3969l.I();
                            A0 d11 = c3969l.d();
                            e f7 = c.f(c3969l, h11);
                            Function0 a11 = g.a(InterfaceC2801g.f5440U, c3969l);
                            if (c3969l.t()) {
                                c3969l.e();
                            } else {
                                c3969l.H(a11);
                            }
                            Function2 h12 = Cm.e.h(c3969l, b11, c3969l, d11);
                            if (!c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I11))) {
                                a.d(I11, c3969l, I11, h12);
                            }
                            F1.b(c3969l, f7, InterfaceC2801g.a.f());
                            if (1.0f > 0.0d) {
                                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
                            }
                            Function1<? super b, Unit> function14 = function12;
                            int i24 = i22 & 896;
                            DsCellAtomKt.DsCellAtom(item.getCell(), new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), function14, c3969l, i21 | i24, 0);
                            BadgeDTO badge = item.getBadge();
                            c3969l.o(427429988);
                            if (badge != null) {
                                c3969l.o(427431978);
                                if (item.getTooltip() != null) {
                                    c3969l.o(-1177129650);
                                    Object C14 = c3969l.C();
                                    if (C14 == InterfaceC3967k.a.a()) {
                                        C14 = new ReviewFormFooterCellComposableKt$ReviewFormFooterCellComposable$2$1$1$1$1(interfaceC3978p0);
                                        c3969l.x(C14);
                                    }
                                    c3969l.k();
                                    eVar = androidx.compose.ui.layout.c.a(eVar, (Function1) C14);
                                }
                                c3969l.k();
                                DsBadgeAtomKt.DsBadgeAtom(badge, eVar, function14, c3969l, i24, 0);
                                Unit unit = Unit.f71690a;
                            }
                            c3969l.k();
                            c3969l.f();
                            AnimatedTooltipKt.AnimatedTooltip(activeTooltip2, onTooltipClosed, false, false, c3969l, ActiveTooltip.$stable | ((i23 >> 15) & 112), 12);
                            z13 = z16;
                            z15 = z17;
                            function13 = function14;
                        } else {
                            u11.j();
                            z15 = z14;
                            function13 = function12;
                            c3969l = u11;
                        }
                        J0 m02 = c3969l.m0();
                        if (m02 != null) {
                            m02.G(new ReviewFormFooterCellComposableKt$ReviewFormFooterCellComposable$3(item, z13, z15, function13, shouldShowTooltip, onTooltipActivated, onTooltipClosed, onTooltipShown, i11, i12));
                            return;
                        }
                        return;
                    }
                    function12 = function1;
                    if ((i12 & 16) == 0) {
                    }
                    if ((i12 & 32) == 0) {
                    }
                    if ((i12 & 64) == 0) {
                    }
                    if ((128 & i12) == 0) {
                    }
                    i16 = i13;
                    if ((4793491 & i16) == 4793490) {
                    }
                    if (i18 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    u11.o(-1055028287);
                    C11 = u11.C();
                    if (C11 == InterfaceC3967k.a.a()) {
                    }
                    InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C11;
                    u11.k();
                    B ReviewFormFooterCellComposable$lambda$23 = ReviewFormFooterCellComposable$lambda$2(interfaceC3978p02);
                    u11.o(-1055025481);
                    int i192 = i16 & 896;
                    n11 = u11.n(ReviewFormFooterCellComposable$lambda$23) | (i192 != 256);
                    C12 = u11.C();
                    if (n11) {
                    }
                    if (z14) {
                    }
                    i17 = i16;
                    activeTooltip = null;
                    u11.x(activeTooltip);
                    C12 = activeTooltip;
                    ActiveTooltip activeTooltip22 = (ActiveTooltip) C12;
                    u11.k();
                    B ReviewFormFooterCellComposable$lambda$222 = ReviewFormFooterCellComposable$lambda$2(interfaceC3978p02);
                    int i212 = CellDTO.$stable;
                    int i222 = i17 >> 3;
                    c3969l = u11;
                    boolean z162 = z13;
                    boolean z172 = z14;
                    int i232 = i17;
                    TooltipSyncEffect(item, z162, z172, ReviewFormFooterCellComposable$lambda$222, shouldShowTooltip, onTooltipActivated, onTooltipShown, onTooltipClosed, c3969l, ((i17 << 3) & 29360128) | TooltipDTO.$stable | i212 | (i17 & 14) | (i17 & 112) | i192 | (i17 & 57344) | (i17 & 458752) | (3670016 & i222));
                    e eVar2 = e.f40358c0;
                    e e112 = a0.e(eVar2, 1.0f);
                    C7807Z parseColorToken2 = TokenParserKt.parseColorToken(item.getBackgroundColor(), c3969l, 0);
                    c3969l.o(-1054998640);
                    if (parseColorToken2 != null) {
                    }
                    c3969l.k();
                    cornerRadius = item.getCornerRadius();
                    if (cornerRadius == null) {
                    }
                    e h112 = T.h(androidx.compose.foundation.e.b(e112, bgSecondary, h.b(cornerRadius.m1866getDpD9Ej5fM())), DEFAULT_PADDING, 0.0f, 2);
                    Y b112 = X.b(C5179b.d(), InterfaceC6250b.a.i(), c3969l, 54);
                    I11 = c3969l.I();
                    A0 d112 = c3969l.d();
                    e f72 = c.f(c3969l, h112);
                    Function0 a112 = g.a(InterfaceC2801g.f5440U, c3969l);
                    if (c3969l.t()) {
                    }
                    Function2 h122 = Cm.e.h(c3969l, b112, c3969l, d112);
                    if (!c3969l.t()) {
                    }
                    a.d(I11, c3969l, I11, h122);
                    F1.b(c3969l, f72, InterfaceC2801g.a.f());
                    if (1.0f > 0.0d) {
                    }
                }
                z14 = z12;
                i15 = i12 & 8;
                if (i15 != 0) {
                }
                function12 = function1;
                if ((i12 & 16) == 0) {
                }
                if ((i12 & 32) == 0) {
                }
                if ((i12 & 64) == 0) {
                }
                if ((128 & i12) == 0) {
                }
                i16 = i13;
                if ((4793491 & i16) == 4793490) {
                }
                if (i18 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                u11.o(-1055028287);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                }
                InterfaceC3978p0 interfaceC3978p022 = (InterfaceC3978p0) C11;
                u11.k();
                B ReviewFormFooterCellComposable$lambda$232 = ReviewFormFooterCellComposable$lambda$2(interfaceC3978p022);
                u11.o(-1055025481);
                int i1922 = i16 & 896;
                n11 = u11.n(ReviewFormFooterCellComposable$lambda$232) | (i1922 != 256);
                C12 = u11.C();
                if (n11) {
                }
                if (z14) {
                }
                i17 = i16;
                activeTooltip = null;
                u11.x(activeTooltip);
                C12 = activeTooltip;
                ActiveTooltip activeTooltip222 = (ActiveTooltip) C12;
                u11.k();
                B ReviewFormFooterCellComposable$lambda$2222 = ReviewFormFooterCellComposable$lambda$2(interfaceC3978p022);
                int i2122 = CellDTO.$stable;
                int i2222 = i17 >> 3;
                c3969l = u11;
                boolean z1622 = z13;
                boolean z1722 = z14;
                int i2322 = i17;
                TooltipSyncEffect(item, z1622, z1722, ReviewFormFooterCellComposable$lambda$2222, shouldShowTooltip, onTooltipActivated, onTooltipShown, onTooltipClosed, c3969l, ((i17 << 3) & 29360128) | TooltipDTO.$stable | i2122 | (i17 & 14) | (i17 & 112) | i1922 | (i17 & 57344) | (i17 & 458752) | (3670016 & i2222));
                e eVar22 = e.f40358c0;
                e e1122 = a0.e(eVar22, 1.0f);
                C7807Z parseColorToken22 = TokenParserKt.parseColorToken(item.getBackgroundColor(), c3969l, 0);
                c3969l.o(-1054998640);
                if (parseColorToken22 != null) {
                }
                c3969l.k();
                cornerRadius = item.getCornerRadius();
                if (cornerRadius == null) {
                }
                e h1122 = T.h(androidx.compose.foundation.e.b(e1122, bgSecondary, h.b(cornerRadius.m1866getDpD9Ej5fM())), DEFAULT_PADDING, 0.0f, 2);
                Y b1122 = X.b(C5179b.d(), InterfaceC6250b.a.i(), c3969l, 54);
                I11 = c3969l.I();
                A0 d1122 = c3969l.d();
                e f722 = c.f(c3969l, h1122);
                Function0 a1122 = g.a(InterfaceC2801g.f5440U, c3969l);
                if (c3969l.t()) {
                }
                Function2 h1222 = Cm.e.h(c3969l, b1122, c3969l, d1122);
                if (!c3969l.t()) {
                }
                a.d(I11, c3969l, I11, h1222);
                F1.b(c3969l, f722, InterfaceC2801g.a.f());
                if (1.0f > 0.0d) {
                }
            }
        }
        i14 = 4 & i12;
        if (i14 == 0) {
        }
        z14 = z12;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        function12 = function1;
        if ((i12 & 16) == 0) {
        }
        if ((i12 & 32) == 0) {
        }
        if ((i12 & 64) == 0) {
        }
        if ((128 & i12) == 0) {
        }
        i16 = i13;
        if ((4793491 & i16) == 4793490) {
        }
        if (i18 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        u11.o(-1055028287);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p0222 = (InterfaceC3978p0) C11;
        u11.k();
        B ReviewFormFooterCellComposable$lambda$2322 = ReviewFormFooterCellComposable$lambda$2(interfaceC3978p0222);
        u11.o(-1055025481);
        int i19222 = i16 & 896;
        n11 = u11.n(ReviewFormFooterCellComposable$lambda$2322) | (i19222 != 256);
        C12 = u11.C();
        if (n11) {
        }
        if (z14) {
        }
        i17 = i16;
        activeTooltip = null;
        u11.x(activeTooltip);
        C12 = activeTooltip;
        ActiveTooltip activeTooltip2222 = (ActiveTooltip) C12;
        u11.k();
        B ReviewFormFooterCellComposable$lambda$22222 = ReviewFormFooterCellComposable$lambda$2(interfaceC3978p0222);
        int i21222 = CellDTO.$stable;
        int i22222 = i17 >> 3;
        c3969l = u11;
        boolean z16222 = z13;
        boolean z17222 = z14;
        int i23222 = i17;
        TooltipSyncEffect(item, z16222, z17222, ReviewFormFooterCellComposable$lambda$22222, shouldShowTooltip, onTooltipActivated, onTooltipShown, onTooltipClosed, c3969l, ((i17 << 3) & 29360128) | TooltipDTO.$stable | i21222 | (i17 & 14) | (i17 & 112) | i19222 | (i17 & 57344) | (i17 & 458752) | (3670016 & i22222));
        e eVar222 = e.f40358c0;
        e e11222 = a0.e(eVar222, 1.0f);
        C7807Z parseColorToken222 = TokenParserKt.parseColorToken(item.getBackgroundColor(), c3969l, 0);
        c3969l.o(-1054998640);
        if (parseColorToken222 != null) {
        }
        c3969l.k();
        cornerRadius = item.getCornerRadius();
        if (cornerRadius == null) {
        }
        e h11222 = T.h(androidx.compose.foundation.e.b(e11222, bgSecondary, h.b(cornerRadius.m1866getDpD9Ej5fM())), DEFAULT_PADDING, 0.0f, 2);
        Y b11222 = X.b(C5179b.d(), InterfaceC6250b.a.i(), c3969l, 54);
        I11 = c3969l.I();
        A0 d11222 = c3969l.d();
        e f7222 = c.f(c3969l, h11222);
        Function0 a11222 = g.a(InterfaceC2801g.f5440U, c3969l);
        if (c3969l.t()) {
        }
        Function2 h12222 = Cm.e.h(c3969l, b11222, c3969l, d11222);
        if (!c3969l.t()) {
        }
        a.d(I11, c3969l, I11, h12222);
        F1.b(c3969l, f7222, InterfaceC2801g.a.f());
        if (1.0f > 0.0d) {
        }
    }

    private static final B ReviewFormFooterCellComposable$lambda$2(InterfaceC3978p0<B> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TooltipSyncEffect(ReviewFormFooterCellVO reviewFormFooterCellVO, boolean z11, boolean z12, B b11, Function1<? super String, Boolean> function1, Function0<Unit> function0, Function1<? super String, Unit> function12, Function0<Unit> function02, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function1<? super String, Boolean> function13;
        Function0<Unit> function03;
        Function1<? super String, Unit> function14;
        Object reviewFormFooterCellComposableKt$TooltipSyncEffect$1$1;
        Boolean bool;
        int i13;
        boolean z13;
        boolean z14 = z12;
        C3969l u11 = interfaceC3967k.u(-1031995822);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(reviewFormFooterCellVO) : u11.F(reviewFormFooterCellVO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.p(z14) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(b11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            function13 = function1;
            i12 |= u11.F(function13) ? 16384 : 8192;
        } else {
            function13 = function1;
        }
        if ((196608 & i11) == 0) {
            function03 = function0;
            i12 |= u11.F(function03) ? 131072 : 65536;
        } else {
            function03 = function0;
        }
        if ((1572864 & i11) == 0) {
            function14 = function12;
            i12 |= u11.F(function14) ? 1048576 : 524288;
        } else {
            function14 = function12;
        }
        if ((i11 & 12582912) == 0) {
            i12 |= u11.F(function02) ? 8388608 : 4194304;
        }
        if ((i12 & 4793491) == 4793490 && u11.b()) {
            u11.j();
        } else {
            i2 i2Var = (i2) u11.m(K0.s());
            boolean z15 = (z11 || b11 == null) ? false : true;
            int i14 = J.f99608a;
            int i15 = M.f99615y;
            boolean f7 = M.a.c(u11).d().f();
            Boolean valueOf = Boolean.valueOf(z15);
            u11.o(-857402791);
            boolean p11 = u11.p(z15);
            boolean z16 = z15;
            int i16 = i12 & 896;
            int i17 = i12;
            boolean z17 = (i16 == 256) | p11 | ((i17 & 57344) == 16384) | ((i17 & 14) == 4 || ((i17 & 8) != 0 && u11.F(reviewFormFooterCellVO))) | ((i17 & 458752) == 131072) | ((i17 & 3670016) == 1048576);
            Object C11 = u11.C();
            if (z17 || C11 == InterfaceC3967k.a.a()) {
                Function1<? super String, Unit> function15 = function14;
                bool = valueOf;
                i13 = i16;
                z13 = f7;
                reviewFormFooterCellComposableKt$TooltipSyncEffect$1$1 = new ReviewFormFooterCellComposableKt$TooltipSyncEffect$1$1(z16, z14, function13, reviewFormFooterCellVO, function03, function15, null);
                u11.x(reviewFormFooterCellComposableKt$TooltipSyncEffect$1$1);
            } else {
                bool = valueOf;
                i13 = i16;
                reviewFormFooterCellComposableKt$TooltipSyncEffect$1$1 = C11;
                z13 = f7;
            }
            u11.k();
            Q.g(bool, b11, (Function2) reviewFormFooterCellComposableKt$TooltipSyncEffect$1$1, u11);
            Boolean valueOf2 = Boolean.valueOf(i2Var.a());
            Boolean valueOf3 = Boolean.valueOf(z13);
            u11.o(-857391250);
            int i18 = i17 & 29360128;
            boolean n11 = u11.n(i2Var) | u11.p(z13) | (i13 == 256) | (i18 == 8388608);
            Object C12 = u11.C();
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                z14 = z12;
                ReviewFormFooterCellComposableKt$TooltipSyncEffect$2$1 reviewFormFooterCellComposableKt$TooltipSyncEffect$2$1 = new ReviewFormFooterCellComposableKt$TooltipSyncEffect$2$1(i2Var, z13, z14, function02, null);
                u11.x(reviewFormFooterCellComposableKt$TooltipSyncEffect$2$1);
                C12 = reviewFormFooterCellComposableKt$TooltipSyncEffect$2$1;
            } else {
                z14 = z12;
            }
            u11.k();
            Q.g(valueOf2, valueOf3, (Function2) C12, u11);
            Integer tooltipShowDuration = reviewFormFooterCellVO.getTooltipShowDuration();
            if (tooltipShowDuration != null) {
                int intValue = tooltipShowDuration.intValue();
                Boolean valueOf4 = Boolean.valueOf(z14);
                u11.o(-361874577);
                boolean r11 = (i13 == 256) | u11.r(intValue) | (i18 == 8388608);
                Object C13 = u11.C();
                if (r11 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new ReviewFormFooterCellComposableKt$TooltipSyncEffect$3$1$1(z14, intValue, function02, null);
                    u11.x(C13);
                }
                u11.k();
                Q.e(u11, valueOf4, (Function2) C13);
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ReviewFormFooterCellComposableKt$TooltipSyncEffect$4(reviewFormFooterCellVO, z11, z14, b11, function1, function0, function12, function02, i11));
        }
    }
}
