package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.presentation;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import Sc.o;
import T7.E;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.data.Timer;
import ru.ozon.app.android.checkoutorderdone.util.TimerKt;
import ru.ozon.uni.android.ds.compose.component.disclaimer.DsDisclaimerAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aA\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aY\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/presentation/DisclaimerV2VI;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Lkotlin/Function0;", "onTimerComplete", "", "staticTimerEnabled", "DisclaimerV2Composable", "(Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/presentation/DisclaimerV2VI;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLS0/k;I)V", "Landroidx/compose/ui/e;", "modifier", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "dto", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/presentation/TimerVI;", DynamicElementDTO.TIMER, "", "timerColor", "DisclaimerTimerWrapper", "(Landroidx/compose/ui/e;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/presentation/TimerVI;Lkotlin/jvm/functions/Function0;IZLS0/k;I)V", "", "timerText", "orderdone_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DisclaimerV2ComposableKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Timer.TimerPosition.values().length];
            try {
                iArr[Timer.TimerPosition.TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Timer.TimerPosition.SUBTITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void DisclaimerTimerWrapper(@NotNull e modifier, @NotNull DisclaimerDTO dto, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull TimerVI timer, @NotNull Function0<Unit> onTimerComplete, int i11, boolean z11, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        int i14;
        DisclaimerDTO copy$default;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(timer, "timer");
        Intrinsics.checkNotNullParameter(onTimerComplete, "onTimerComplete");
        C3969l u11 = interfaceC3967k.u(1147638798);
        if ((i12 & 6) == 0) {
            i13 = (u11.n(modifier) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= (i12 & 64) == 0 ? u11.n(dto) : u11.F(dto) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= u11.F(onAction) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 3072) == 0) {
            i13 |= u11.n(timer) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 24576) == 0) {
            i13 |= u11.F(onTimerComplete) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i13 |= u11.r(i11) ? 131072 : 65536;
        }
        if ((1572864 & i12) == 0) {
            i13 |= u11.p(z11) ? 1048576 : 524288;
        }
        int i15 = i13;
        if ((599187 & i15) == 599186 && u11.b()) {
            u11.j();
        } else {
            InterfaceC3978p0<String> timer2 = TimerKt.timer(timer.getDeadline(), onTimerComplete, z11, u11, ((i15 >> 12) & 896) | ((i15 >> 9) & 112));
            int i16 = WhenMappings.$EnumSwitchMapping$0[timer.getPosition().ordinal()];
            if (i16 == 1) {
                i14 = i15;
                OzonSpannableString title = dto.getTitle();
                copy$default = DisclaimerDTO.copy$default(dto, OzonSpannableStringKt.toOzonSpannableString(((Object) title) + " " + DisclaimerTimerWrapper$lambda$1(timer2)), null, null, null, null, null, null, null, null, null, false, null, null, 8190, null);
            } else {
                if (i16 != 2) {
                    throw new o();
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
                spannableStringBuilder.append((CharSequence) dto.getSubtitle());
                spannableStringBuilder.append((CharSequence) " ");
                StyleSpan styleSpan = new StyleSpan(1);
                int length = spannableStringBuilder.length();
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i11);
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) DisclaimerTimerWrapper$lambda$1(timer2));
                spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.length(), 17);
                spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
                Unit unit = Unit.f71690a;
                i14 = i15;
                copy$default = DisclaimerDTO.copy$default(dto, null, OzonSpannableStringKt.toOzonSpannableString(new SpannedString(spannableStringBuilder)), null, null, null, null, null, null, null, null, false, null, null, 8189, null);
            }
            DsDisclaimerAtomKt.DsDisclaimerAtom(copy$default, modifier, onAction, u11, DisclaimerDTO.$stable | ((i14 << 3) & 112) | (i14 & 896), 0);
            u11 = u11;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new DisclaimerV2ComposableKt$DisclaimerTimerWrapper$1(modifier, dto, onAction, timer, onTimerComplete, i11, z11, i12));
        }
    }

    private static final String DisclaimerTimerWrapper$lambda$1(InterfaceC3978p0<String> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    public static final void DisclaimerV2Composable(@NotNull DisclaimerV2VI item, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull Function0<Unit> onTimerComplete, boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function1<? super AtomAction, Unit> function1;
        Function0<Unit> function0;
        boolean z12;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(onTimerComplete, "onTimerComplete");
        C3969l u11 = interfaceC3967k.u(621529887);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onAction) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onTimerComplete) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.p(z11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            function1 = onAction;
            z12 = z11;
            function0 = onTimerComplete;
        } else {
            e.a aVar = e.f40358c0;
            e i13 = T.i(a0.u(a0.e(aVar, 1.0f), 3), item.getPaddings().getLeft().m1867getDpD9Ej5fM(), item.getPaddings().getTop().m1867getDpD9Ej5fM(), item.getPaddings().getRight().m1867getDpD9Ej5fM(), item.getPaddings().getBottom().m1867getDpD9Ej5fM());
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, i13);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            e u12 = a0.u(a0.e(aVar, 1.0f), 3);
            if (item.getTimer() == null) {
                u11.o(1960542985);
                function1 = onAction;
                DsDisclaimerAtomKt.DsDisclaimerAtom(item.getDisclaimer(), u12, function1, u11, DisclaimerDTO.$stable | 48 | ((i12 << 3) & 896), 0);
                u11.k();
                z12 = z11;
                function0 = onTimerComplete;
            } else {
                u11.o(1960732240);
                function1 = onAction;
                DisclaimerTimerWrapper(u12, item.getDisclaimer(), function1, item.getTimer(), onTimerComplete, C7811b0.i(UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getTextPrimary()), z11, u11, (DisclaimerDTO.$stable << 3) | 6 | ((i12 << 3) & 896) | ((i12 << 6) & 57344) | ((i12 << 9) & 3670016));
                function0 = onTimerComplete;
                z12 = z11;
                u11 = u11;
                u11.k();
            }
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new DisclaimerV2ComposableKt$DisclaimerV2Composable$2(item, function1, function0, z12, i11));
        }
    }
}
