package ru.ozon.app.android.regulardraw.widgets.lotteryResult.presentation;

import G1.h;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Tg.b;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.compose.time.StableDateTime;
import ru.ozon.app.android.pdp.ui.compose.time.StablePeriod;
import ru.ozon.app.android.pdp.ui.compose.time.TimersKt;
import ru.ozon.app.android.regulardraw.R$string;
import ru.ozon.app.android.regulardraw.ui.CustomBadgeAtomKt;
import ru.ozon.app.android.regulardraw.ui.FormattingKt;
import ru.ozon.app.android.regulardraw.widgets.lotteryResult.presentation.LotteryResultVI;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import u0.C9915y;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI$DrawStatus;", "status", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "LotteryDrawStatusBadge", "(Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI$DrawStatus;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Lru/ozon/app/android/pdp/ui/compose/time/StablePeriod;", "period", "", "formatRemainingPeriod", "(Lru/ozon/app/android/pdp/ui/compose/time/StablePeriod;LS0/k;I)Ljava/lang/String;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LotteryDrawStatusBadgeKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LotteryDrawStatusBadge(@NotNull LotteryResultVI.DrawStatus status, e eVar, Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        Function1<? super b, Unit> function12;
        Function1<? super b, Unit> function13;
        BadgeDTO badge;
        Function1<? super b, Unit> function14;
        J0 m02;
        Intrinsics.checkNotNullParameter(status, "status");
        C3969l u11 = interfaceC3967k.u(714165014);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(status) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                function12 = function1;
                i13 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i13 & 147) == 146 || !u11.b()) {
                    e eVar3 = i15 != 0 ? e.f40358c0 : eVar2;
                    if (i14 != 0) {
                        u11.o(826130784);
                        Object C11 = u11.C();
                        if (C11 == InterfaceC3967k.a.a()) {
                            C11 = LotteryDrawStatusBadgeKt$LotteryDrawStatusBadge$1$1.INSTANCE;
                            u11.x(C11);
                        }
                        u11.k();
                        function13 = (Function1) C11;
                    } else {
                        function13 = function12;
                    }
                    u11.o(826132635);
                    if (status.getBroadcastDate() != null) {
                        u11.G(826134405, status.getBadge());
                        StableDateTime broadcastDate = status.getBroadcastDate();
                        u11.o(826138965);
                        Object C12 = u11.C();
                        if (C12 == InterfaceC3967k.a.a()) {
                            C12 = LotteryDrawStatusBadgeKt$LotteryDrawStatusBadge$period$1$1.INSTANCE;
                            u11.x(C12);
                        }
                        Function1 function15 = (Function1) C12;
                        u11.k();
                        u11.o(826140820);
                        boolean z11 = ((i13 & 14) == 4) | ((i13 & 896) == 256);
                        Object C13 = u11.C();
                        if (z11 || C13 == InterfaceC3967k.a.a()) {
                            C13 = new LotteryDrawStatusBadgeKt$LotteryDrawStatusBadge$period$2$1(status, function13);
                            u11.x(C13);
                        }
                        u11.k();
                        StablePeriod rememberRemainingPeriod = TimersKt.rememberRemainingPeriod(broadcastDate, function15, null, (Function0) C13, u11, 48, 4);
                        u11.J();
                        badge = BadgeDTO.copy$default(status.getBadge(), formatRemainingPeriod(rememberRemainingPeriod, u11, 0), null, null, null, null, null, null, null, null, null, null, null, 4094, null);
                    } else {
                        badge = status.getBadge();
                    }
                    BadgeDTO badgeDTO = badge;
                    u11.k();
                    float f7 = 2;
                    Function1<? super b, Unit> function16 = function13;
                    eVar2 = eVar3;
                    CustomBadgeAtomKt.m909CustomBadgeAtomPfoAEA0(badgeDTO, eVar2, status.getBadgeBorderColor(), null, new C9915y(f7, (float) 1.5d, f7, (float) 0.5d), 0.0f, function16, u11, ((i13 << 12) & 3670016) | (i13 & 112), 40);
                    function14 = function16;
                } else {
                    u11.j();
                    function14 = function12;
                }
                e eVar4 = eVar2;
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new LotteryDrawStatusBadgeKt$LotteryDrawStatusBadge$2(status, eVar4, function14, i11, i12));
                    return;
                }
                return;
            }
            function12 = function1;
            if ((i13 & 147) == 146) {
            }
            if (i15 != 0) {
            }
            if (i14 != 0) {
            }
            u11.o(826132635);
            if (status.getBroadcastDate() != null) {
            }
            BadgeDTO badgeDTO2 = badge;
            u11.k();
            float f72 = 2;
            Function1<? super b, Unit> function162 = function13;
            eVar2 = eVar3;
            CustomBadgeAtomKt.m909CustomBadgeAtomPfoAEA0(badgeDTO2, eVar2, status.getBadgeBorderColor(), null, new C9915y(f72, (float) 1.5d, f72, (float) 0.5d), 0.0f, function162, u11, ((i13 << 12) & 3670016) | (i13 & 112), 40);
            function14 = function162;
            e eVar42 = eVar2;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        function12 = function1;
        if ((i13 & 147) == 146) {
        }
        if (i15 != 0) {
        }
        if (i14 != 0) {
        }
        u11.o(826132635);
        if (status.getBroadcastDate() != null) {
        }
        BadgeDTO badgeDTO22 = badge;
        u11.k();
        float f722 = 2;
        Function1<? super b, Unit> function1622 = function13;
        eVar2 = eVar3;
        CustomBadgeAtomKt.m909CustomBadgeAtomPfoAEA0(badgeDTO22, eVar2, status.getBadgeBorderColor(), null, new C9915y(f722, (float) 1.5d, f722, (float) 0.5d), 0.0f, function1622, u11, ((i13 << 12) & 3670016) | (i13 & 112), 40);
        function14 = function1622;
        e eVar422 = eVar2;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    private static final String formatRemainingPeriod(StablePeriod stablePeriod, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(1267939125);
        String upperCase = h.a(interfaceC3967k).getString(R$string.regular_draw_lottery_result_remaining_period_template, Arrays.copyOf(new Object[]{FormattingKt.rememberHumanReadableFormattedPeriod(stablePeriod, false, null, interfaceC3967k, i11 & 14, 6)}, 1)).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        interfaceC3967k.k();
        return upperCase;
    }
}
