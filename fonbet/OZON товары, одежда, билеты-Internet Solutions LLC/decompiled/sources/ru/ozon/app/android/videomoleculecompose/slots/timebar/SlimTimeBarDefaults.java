package ru.ozon.app.android.videomoleculecompose.slots.timebar;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJq\u0010 \u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001a0\u001dH\u0007¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarDefaults;", "", "<init>", "()V", "Ll1/Z;", "played", "buffered", "unplayed", "scrubber", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarColors;", "colors-ro_MJ88", "(JJJJLS0/k;II)Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarColors;", "colors", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarStyle;", "fullStyle", "(Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarColors;LS0/k;II)Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarStyle;", "compactStyle", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarState;", "state", "Landroidx/compose/ui/e;", "modifier", "style", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarBehavior;", "behavior", "Lkotlin/Function1;", "", "", "onScrubStart", "onScrubMove", "Lkotlin/Function2;", "", "onScrubEnd", "TimeBarSlot", "(Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarState;Landroidx/compose/ui/e;Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarStyle;Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarBehavior;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;LS0/k;I)V", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SlimTimeBarDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final SlimTimeBarDefaults INSTANCE = new SlimTimeBarDefaults();

    private SlimTimeBarDefaults() {
    }

    public final void TimeBarSlot(@NotNull SlimTimeBarState state, @NotNull e modifier, @NotNull SlimTimeBarStyle style, @NotNull SlimTimeBarBehavior behavior, @NotNull Function1<? super Long, Unit> onScrubStart, @NotNull Function1<? super Long, Unit> onScrubMove, @NotNull Function2<? super Long, ? super Boolean, Unit> onScrubEnd, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(onScrubStart, "onScrubStart");
        Intrinsics.checkNotNullParameter(onScrubMove, "onScrubMove");
        Intrinsics.checkNotNullParameter(onScrubEnd, "onScrubEnd");
        C3969l u11 = interfaceC3967k.u(758288737);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(modifier) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(style) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(behavior) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(onScrubStart) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(onScrubMove) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.F(onScrubEnd) ? 1048576 : 524288;
        }
        if ((599187 & i12) == 599186 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            c3969l = u11;
            SlimTimeBarKt.SlimTimeBar(state, modifier, style, behavior, onScrubStart, onScrubMove, onScrubEnd, c3969l, i12 & 4194302, 0);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new SlimTimeBarDefaults$TimeBarSlot$1(this, state, modifier, style, behavior, onScrubStart, onScrubMove, onScrubEnd, i11));
        }
    }

    @NotNull
    /* renamed from: colors-ro_MJ88, reason: not valid java name */
    public final SlimTimeBarColors m1563colorsro_MJ88(long j11, long j12, long j13, long j14, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        interfaceC3967k.o(397493790);
        if ((i12 & 1) != 0) {
            C7807Z c7807z = TokenParserKt.tokenToColor(UniColors.TEXT_LIGHT_KEY.getToken(), interfaceC3967k, 0);
            j15 = c7807z != null ? c7807z.w() : C7807Z.f72251e;
        } else {
            j15 = j11;
        }
        if ((i12 & 2) != 0) {
            j19 = C7807Z.f72258l;
            j16 = j19;
        } else {
            j16 = j12;
        }
        if ((i12 & 4) != 0) {
            C7807Z c7807z2 = TokenParserKt.tokenToColor(UniColors.CLEAR_LIGHT_KEY_600.getToken(), interfaceC3967k, 0);
            j17 = c7807z2 != null ? c7807z2.w() : C7807Z.f72259m;
        } else {
            j17 = j13;
        }
        if ((i12 & 8) != 0) {
            C7807Z c7807z3 = TokenParserKt.tokenToColor(UniColors.TEXT_LIGHT_KEY.getToken(), interfaceC3967k, 0);
            j18 = c7807z3 != null ? c7807z3.w() : C7807Z.f72259m;
        } else {
            j18 = j14;
        }
        SlimTimeBarColors slimTimeBarColors = new SlimTimeBarColors(j15, j16, j17, j18, null);
        interfaceC3967k.k();
        return slimTimeBarColors;
    }

    @NotNull
    public final SlimTimeBarStyle compactStyle(SlimTimeBarColors slimTimeBarColors, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        interfaceC3967k.o(633023816);
        if ((i12 & 1) != 0) {
            slimTimeBarColors = m1563colorsro_MJ88(0L, 0L, 0L, 0L, interfaceC3967k, (i11 << 9) & 57344, 15);
        }
        float f7 = 0;
        SlimTimeBarStyle slimTimeBarStyle = new SlimTimeBarStyle(slimTimeBarColors, 2, 4, 24, f7, f7, 28, SlimTimeBarGravity.Center, null);
        interfaceC3967k.k();
        return slimTimeBarStyle;
    }

    @NotNull
    public final SlimTimeBarStyle fullStyle(SlimTimeBarColors slimTimeBarColors, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        interfaceC3967k.o(-1816158976);
        if ((i12 & 1) != 0) {
            slimTimeBarColors = m1563colorsro_MJ88(0L, 0L, 0L, 0L, interfaceC3967k, (i11 << 9) & 57344, 15);
        }
        float f7 = 4;
        SlimTimeBarStyle slimTimeBarStyle = new SlimTimeBarStyle(slimTimeBarColors, 2, f7, 26, f7, 8, 66, SlimTimeBarGravity.Bottom, null);
        interfaceC3967k.k();
        return slimTimeBarStyle;
    }
}
