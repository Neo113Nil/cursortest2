package ru.ozon.app.android.pdp.ui.compose.time;

import S0.A1;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import S0.n1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.PeriodType;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aG\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010²\u0006\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\nX\u008a\u0084\u0002²\u0006\u0016\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\u00030\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;", "targetDate", "Lkotlin/Function1;", "Lorg/joda/time/Duration;", "", "timerEnabled", "timerTick", "Lkotlin/Function0;", "", "onExpired", "Lru/ozon/app/android/pdp/ui/compose/time/StablePeriod;", "rememberRemainingPeriod", "(Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;Lkotlin/jvm/functions/Function1;Lorg/joda/time/Duration;Lkotlin/jvm/functions/Function0;LS0/k;II)Lru/ozon/app/android/pdp/ui/compose/time/StablePeriod;", "currentOnExpired", "kotlin.jvm.PlatformType", "remainingDuration", "compose-time_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TimersKt {
    @NotNull
    public static final StablePeriod rememberRemainingPeriod(@NotNull StableDateTime targetDate, Function1<? super Duration, Boolean> function1, Duration duration, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Intrinsics.checkNotNullParameter(targetDate, "targetDate");
        interfaceC3967k.o(-1221417437);
        if ((i12 & 2) != 0) {
            interfaceC3967k.o(-1772950384);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = TimersKt$rememberRemainingPeriod$1$1.INSTANCE;
                interfaceC3967k.x(C11);
            }
            function1 = (Function1) C11;
            interfaceC3967k.k();
        }
        if ((i12 & 4) != 0) {
            duration = Duration.a(1000L);
        }
        if ((i12 & 8) != 0) {
            interfaceC3967k.o(-1772947574);
            Object C12 = interfaceC3967k.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = TimersKt$rememberRemainingPeriod$2$1.INSTANCE;
                interfaceC3967k.x(C12);
            }
            function0 = (Function0) C12;
            interfaceC3967k.k();
        }
        InterfaceC3978p0 l11 = n1.l(function0, interfaceC3967k);
        interfaceC3967k.o(-1772943906);
        boolean z11 = (((i11 & 14) ^ 6) > 4 && interfaceC3967k.n(targetDate)) || (i11 & 6) == 4;
        Object C13 = interfaceC3967k.C();
        if (z11 || C13 == InterfaceC3967k.a.a()) {
            Duration duration2 = new Duration(new DateTime(), targetDate);
            Duration ZERO = Duration.f79006a;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            C13 = n1.f(h.b(duration2, ZERO), D1.f25195a);
            interfaceC3967k.x(C13);
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C13;
        interfaceC3967k.k();
        interfaceC3967k.o(-1772939776);
        Duration rememberRemainingPeriod$lambda$4 = rememberRemainingPeriod$lambda$4(interfaceC3978p0);
        Intrinsics.checkNotNullExpressionValue(rememberRemainingPeriod$lambda$4, "rememberRemainingPeriod$lambda$4(...)");
        if (function1.invoke(rememberRemainingPeriod$lambda$4).booleanValue()) {
            interfaceC3967k.o(-1772937488);
            boolean n11 = interfaceC3967k.n(interfaceC3978p0) | interfaceC3967k.F(duration) | interfaceC3967k.n(l11);
            Object C14 = interfaceC3967k.C();
            if (n11 || C14 == InterfaceC3967k.a.a()) {
                C14 = new TimersKt$rememberRemainingPeriod$3$1(duration, interfaceC3978p0, l11, null);
                interfaceC3967k.x(C14);
            }
            interfaceC3967k.k();
            Q.e(interfaceC3967k, targetDate, (Function2) C14);
        }
        interfaceC3967k.k();
        Object rememberRemainingPeriod$lambda$42 = rememberRemainingPeriod$lambda$4(interfaceC3978p0);
        interfaceC3967k.o(-1772929621);
        boolean n12 = interfaceC3967k.n(rememberRemainingPeriod$lambda$42);
        Object C15 = interfaceC3967k.C();
        if (n12 || C15 == InterfaceC3967k.a.a()) {
            Period E11 = new Period(rememberRemainingPeriod$lambda$4(interfaceC3978p0)).E(PeriodType.j());
            Intrinsics.checkNotNullExpressionValue(E11, "normalizedStandard(...)");
            C15 = StableTimeWrappersKt.stable(E11);
            interfaceC3967k.x(C15);
        }
        StablePeriod stablePeriod = (StablePeriod) C15;
        interfaceC3967k.k();
        interfaceC3967k.k();
        return stablePeriod;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> rememberRemainingPeriod$lambda$2(A1<? extends Function0<Unit>> a12) {
        return a12.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Duration rememberRemainingPeriod$lambda$4(InterfaceC3978p0<Duration> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }
}
