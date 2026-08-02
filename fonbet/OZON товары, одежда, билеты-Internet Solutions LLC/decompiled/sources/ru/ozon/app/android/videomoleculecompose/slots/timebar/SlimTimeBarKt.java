package ru.ozon.app.android.videomoleculecompose.slots.timebar;

import S0.A1;
import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import Sc.o;
import Wc.a;
import Z1.d;
import androidx.compose.foundation.gestures.C5177u;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import k1.C7456b;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.M;
import kotlin.ranges.h;
import n0.C8392m;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import r0.C9115P;
import ru.ozon.app.android.videomoleculecompose.util.TimeBucketKt;
import x1.F;
import x1.L;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a}\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a3\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00162\u0006\u0010\u0012\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0006\u0010\u0015\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u0019\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a0\u0010\u001f\u001a\u00020\n*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0082@¢\u0006\u0004\b\u001f\u0010 \u001aX\u0010!\u001a\u00020\n*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\bH\u0082@¢\u0006\u0004\b!\u0010\"\u001aS\u0010-\u001a\u00020\n*\u00020#2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u000eH\u0002¢\u0006\u0004\b-\u0010.\u001aK\u0010<\u001a\u00020\n*\u00020#2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002012\u0006\u00107\u001a\u0002012\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;\u001a\u0017\u0010=\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b=\u0010>\u001a\u001f\u0010@\u001a\u00020\t2\u0006\u0010?\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b@\u0010A\u001a/\u0010D\u001a\u0002012\u0006\u0010?\u001a\u00020\t2\u0006\u0010B\u001a\u0002012\u0006\u0010C\u001a\u0002012\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\bD\u0010E\u001a/\u0010G\u001a\u00020\t2\u0006\u0010F\u001a\u0002012\u0006\u0010B\u001a\u0002012\u0006\u0010C\u001a\u0002012\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\bG\u0010H\u001a7\u0010K\u001a\u00020/2\u0006\u0010I\u001a\u0002012\u0006\u00103\u001a\u0002012\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010J\u001a\u00020\u000eH\u0000¢\u0006\u0004\bK\u0010L\u001a\u001b\u0010O\u001a\u00020&*\u00020\u00042\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010P\u001a\u001f\u0010S\u001a\u0002012\u0006\u0010Q\u001a\u0002012\u0006\u0010R\u001a\u000201H\u0002¢\u0006\u0004\bS\u0010T\"\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006\\²\u0006\u0018\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\nX\u008a\u0084\u0002²\u0006\u0018\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\nX\u008a\u0084\u0002²\u0006\u001e\u0010Z\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r8\nX\u008a\u0084\u0002²\u0006\u0010\u0010[\u001a\u0004\u0018\u00010\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarState;", "state", "Landroidx/compose/ui/e;", "modifier", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarStyle;", "style", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarBehavior;", "behavior", "Lkotlin/Function1;", "", "", "onScrubStart", "onScrubMove", "Lkotlin/Function2;", "", "onScrubEnd", "SlimTimeBar", "(Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarState;Landroidx/compose/ui/e;Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarStyle;Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarBehavior;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "durationMs", "Lkotlin/Function0;", "positionMsProvider", "throttle", "LS0/A1;", "rememberIdleProgressState", "(JLkotlin/jvm/functions/Function0;ZLS0/k;I)LS0/A1;", "readIdleProgress", "(Lkotlin/jvm/functions/Function0;JZ)J", "Lx1/F;", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarInputConfig;", "config", "onTapSeek", "detectSlimTimeBarTapGestures", "(Lx1/F;Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarInputConfig;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "detectSlimTimeBarScrubGestures", "(Lx1/F;Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarInputConfig;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ln1/e;", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarColors;", "colors", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarDimensionsPx;", "dimensions", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarGravity;", "gravity", "displayedPositionMs", "bufferedPositionMs", "isScrubbing", "drawSlimTimeBar", "(Ln1/e;JLru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarColors;Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarBehavior;Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarDimensionsPx;Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarGravity;JJZ)V", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarMetrics;", "bar", "", "top", "height", "Lk1/a;", "radius", "startX", "endX", "Ll1/Z;", "color", "drawSlimTimeBarSegment-T5rlL0E", "(Ln1/e;Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarMetrics;FFJFFJ)V", "drawSlimTimeBarSegment", "isValidDuration", "(J)Z", "positionMs", "coercePosition", "(JJ)J", "barLeft", "barRight", "xFromPosition", "(JFFJ)F", "x", "positionFromX", "(FFFJ)J", "width", "showScrubber", "calculateBarMetrics", "(FFLru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarDimensionsPx;Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarGravity;Z)Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarMetrics;", "LZ1/d;", "density", "toPx", "(Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarStyle;LZ1/d;)Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarDimensionsPx;", "left", "right", "barWidth", "(FF)F", "LZ1/h;", "FINE_SCRUB_Y_THRESHOLD", "F", "currentOnScrubStart", "currentOnScrubMove", "currentOnScrubEnd", "activeScrubPositionMs", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SlimTimeBarKt {
    private static final float FINE_SCRUB_Y_THRESHOLD = -50;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SlimTimeBarGravity.values().length];
            try {
                iArr[SlimTimeBarGravity.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SlimTimeBarGravity.Bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0400  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SlimTimeBar(@NotNull SlimTimeBarState state, e eVar, SlimTimeBarStyle slimTimeBarStyle, SlimTimeBarBehavior slimTimeBarBehavior, Function1<? super Long, Unit> function1, Function1<? super Long, Unit> function12, Function2<? super Long, ? super Boolean, Unit> function2, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        SlimTimeBarStyle slimTimeBarStyle2;
        int i14;
        SlimTimeBarBehavior slimTimeBarBehavior2;
        int i15;
        Function1<? super Long, Unit> function13;
        int i16;
        Function1<? super Long, Unit> function14;
        int i17;
        Function2<? super Long, ? super Boolean, Unit> function22;
        SlimTimeBarStyle slimTimeBarStyle3;
        int i18;
        Function2<? super Long, ? super Boolean, Unit> function23;
        e eVar3;
        SlimTimeBarStyle slimTimeBarStyle4;
        Function1<? super Long, Unit> function15;
        InterfaceC3978p0 l11;
        InterfaceC3978p0 l12;
        Object C11;
        InterfaceC3978p0 interfaceC3978p0;
        A1<Long> rememberIdleProgressState;
        A1<Long> rememberIdleProgressState2;
        C3969l c3969l;
        int i19;
        boolean p11;
        Object C12;
        InterfaceC3978p0 interfaceC3978p02;
        InterfaceC3978p0 interfaceC3978p03;
        int i21;
        boolean n11;
        Object C13;
        SlimTimeBarDimensionsPx slimTimeBarDimensionsPx;
        int i22;
        InterfaceC3978p0 interfaceC3978p04;
        boolean n12;
        Object C14;
        SlimTimeBarDimensionsPx slimTimeBarDimensionsPx2;
        boolean n13;
        Object C15;
        InterfaceC3978p0 interfaceC3978p05;
        InterfaceC3978p0 interfaceC3978p06;
        boolean n14;
        Object C16;
        A1<Long> a12;
        A1<Long> a13;
        e eVar4;
        Function1<? super Long, Unit> function16;
        int i23;
        int i24;
        int i25;
        boolean n15;
        Object C17;
        SlimTimeBarStyle slimTimeBarStyle5;
        e eVar5;
        Function1<? super Long, Unit> function17;
        Function2<? super Long, ? super Boolean, Unit> function24;
        SlimTimeBarBehavior slimTimeBarBehavior3;
        Function1<? super Long, Unit> function18;
        J0 m02;
        int i26;
        Intrinsics.checkNotNullParameter(state, "state");
        C3969l u11 = interfaceC3967k.u(1299833381);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i27 = i12 & 2;
        if (i27 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i11 & 384) != 0) {
                if ((i12 & 4) == 0) {
                    slimTimeBarStyle2 = slimTimeBarStyle;
                    if (u11.n(slimTimeBarStyle2)) {
                        i26 = 256;
                        i13 |= i26;
                    }
                } else {
                    slimTimeBarStyle2 = slimTimeBarStyle;
                }
                i26 = UserVerificationMethods.USER_VERIFY_PATTERN;
                i13 |= i26;
            } else {
                slimTimeBarStyle2 = slimTimeBarStyle;
            }
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                slimTimeBarBehavior2 = slimTimeBarBehavior;
                i13 |= u11.n(slimTimeBarBehavior2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                i15 = i12 & 16;
                if (i15 != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    function13 = function1;
                    i13 |= u11.F(function13) ? 16384 : 8192;
                    i16 = i12 & 32;
                    if (i16 == 0) {
                        i13 |= 196608;
                    } else if ((196608 & i11) == 0) {
                        function14 = function12;
                        i13 |= u11.F(function14) ? 131072 : 65536;
                        i17 = i12 & 64;
                        if (i17 != 0) {
                            i13 |= 1572864;
                            function22 = function2;
                        } else {
                            function22 = function2;
                            if ((i11 & 1572864) == 0) {
                                i13 |= u11.F(function22) ? 1048576 : 524288;
                            }
                        }
                        if ((i13 & 599187) == 599186 || !u11.b()) {
                            u11.Q0();
                            if ((i11 & 1) != 0 || u11.w0()) {
                                e eVar6 = i27 != 0 ? e.f40358c0 : eVar2;
                                if ((i12 & 4) != 0) {
                                    slimTimeBarStyle3 = SlimTimeBarDefaults.INSTANCE.fullStyle(null, u11, 48, 1);
                                    i13 &= -897;
                                } else {
                                    slimTimeBarStyle3 = slimTimeBarStyle2;
                                }
                                if (i14 != 0) {
                                    slimTimeBarBehavior2 = new SlimTimeBarBehavior(false, false, false, 7, null);
                                }
                                if (i15 != 0) {
                                    u11.o(-1596419310);
                                    Object C18 = u11.C();
                                    if (C18 == InterfaceC3967k.a.a()) {
                                        C18 = SlimTimeBarKt$SlimTimeBar$1$1.INSTANCE;
                                        u11.x(C18);
                                    }
                                    u11.k();
                                    function13 = (Function1) C18;
                                }
                                if (i16 != 0) {
                                    u11.o(-1596418094);
                                    Object C19 = u11.C();
                                    if (C19 == InterfaceC3967k.a.a()) {
                                        C19 = SlimTimeBarKt$SlimTimeBar$2$1.INSTANCE;
                                        u11.x(C19);
                                    }
                                    u11.k();
                                    function14 = (Function1) C19;
                                }
                                if (i17 != 0) {
                                    u11.o(-1596415909);
                                    Object C21 = u11.C();
                                    if (C21 == InterfaceC3967k.a.a()) {
                                        C21 = SlimTimeBarKt$SlimTimeBar$3$1.INSTANCE;
                                        u11.x(C21);
                                    }
                                    u11.k();
                                    eVar3 = eVar6;
                                    slimTimeBarStyle4 = slimTimeBarStyle3;
                                    function15 = function13;
                                    i18 = i13;
                                    function23 = (Function2) C21;
                                } else {
                                    e eVar7 = eVar6;
                                    i18 = i13;
                                    function23 = function22;
                                    eVar3 = eVar7;
                                    slimTimeBarStyle4 = slimTimeBarStyle3;
                                    function15 = function13;
                                }
                            } else {
                                u11.j();
                                if ((i12 & 4) != 0) {
                                    i13 &= -897;
                                }
                                i18 = i13;
                                slimTimeBarStyle4 = slimTimeBarStyle2;
                                function23 = function22;
                                function15 = function13;
                                eVar3 = eVar2;
                            }
                            SlimTimeBarBehavior slimTimeBarBehavior4 = slimTimeBarBehavior2;
                            u11.j0();
                            d dVar = (d) u11.m(K0.e());
                            l11 = n1.l(function15, u11);
                            InterfaceC3978p0 l13 = n1.l(function14, u11);
                            l12 = n1.l(function23, u11);
                            boolean isValidDuration = isValidDuration(state.getDurationMs());
                            u11.o(-1596404968);
                            C11 = u11.C();
                            if (C11 == InterfaceC3967k.a.a()) {
                                C11 = n1.f(null, D1.f25195a);
                                u11.x(C11);
                            }
                            interfaceC3978p0 = (InterfaceC3978p0) C11;
                            u11.k();
                            rememberIdleProgressState = rememberIdleProgressState(state.getDurationMs(), state.getPositionMsProvider(), true, u11, 384);
                            rememberIdleProgressState2 = rememberIdleProgressState(state.getDurationMs(), state.getBufferedPositionMsProvider(), true, u11, 384);
                            c3969l = u11;
                            Boolean valueOf = Boolean.valueOf(state.getEnabled());
                            Boolean valueOf2 = Boolean.valueOf(isValidDuration);
                            Function2<? super Long, ? super Boolean, Unit> function25 = function23;
                            c3969l.o(-1596389747);
                            i19 = i18 & 14;
                            p11 = (i19 == 4) | c3969l.p(isValidDuration) | c3969l.n(l12);
                            C12 = c3969l.C();
                            if (!p11 || C12 == InterfaceC3967k.a.a()) {
                                C12 = new SlimTimeBarKt$SlimTimeBar$4$1(state, isValidDuration, interfaceC3978p0, l12, null);
                                interfaceC3978p02 = interfaceC3978p0;
                                interfaceC3978p03 = l12;
                                c3969l.x(C12);
                            } else {
                                interfaceC3978p02 = interfaceC3978p0;
                                interfaceC3978p03 = l12;
                            }
                            c3969l.k();
                            Q.g(valueOf, valueOf2, (Function2) C12, c3969l);
                            c3969l.o(-1596379060);
                            i21 = (i18 & 896) ^ 384;
                            n11 = ((i21 <= 256 && c3969l.n(slimTimeBarStyle4)) || (i18 & 384) == 256) | c3969l.n(dVar);
                            C13 = c3969l.C();
                            if (!n11 || C13 == InterfaceC3967k.a.a()) {
                                C13 = toPx(slimTimeBarStyle4, dVar);
                                c3969l.x(C13);
                            }
                            slimTimeBarDimensionsPx = (SlimTimeBarDimensionsPx) C13;
                            c3969l.k();
                            boolean enabled = state.getEnabled();
                            i22 = i18;
                            long durationMs = state.getDurationMs();
                            SlimTimeBarGravity gravity = slimTimeBarStyle4.getGravity();
                            interfaceC3978p04 = interfaceC3978p02;
                            boolean showScrubber = slimTimeBarBehavior4.getShowScrubber();
                            boolean fineScrubEnabled = slimTimeBarBehavior4.getFineScrubEnabled();
                            Function1<? super Long, Unit> function19 = function15;
                            c3969l.o(-1596375975);
                            n12 = c3969l.n(gravity) | c3969l.p(enabled) | c3969l.s(durationMs) | c3969l.n(slimTimeBarDimensionsPx) | c3969l.p(showScrubber) | c3969l.p(fineScrubEnabled);
                            C14 = c3969l.C();
                            if (!n12 || C14 == InterfaceC3967k.a.a()) {
                                C14 = new SlimTimeBarInputConfig(state.getEnabled(), state.getDurationMs(), slimTimeBarDimensionsPx, slimTimeBarStyle4.getGravity(), slimTimeBarBehavior4.getShowScrubber(), slimTimeBarBehavior4.getFineScrubEnabled());
                                slimTimeBarDimensionsPx2 = slimTimeBarDimensionsPx;
                                c3969l.x(C14);
                            } else {
                                slimTimeBarDimensionsPx2 = slimTimeBarDimensionsPx;
                            }
                            SlimTimeBarInputConfig slimTimeBarInputConfig = (SlimTimeBarInputConfig) C14;
                            c3969l.k();
                            e f7 = a0.f(a0.e(eVar3, 1.0f), slimTimeBarStyle4.getTouchTargetHeight());
                            c3969l.o(-1596355467);
                            n13 = c3969l.n(slimTimeBarInputConfig) | c3969l.n(l11) | c3969l.n(interfaceC3978p03);
                            C15 = c3969l.C();
                            if (!n13 || C15 == InterfaceC3967k.a.a()) {
                                C15 = new SlimTimeBarKt$SlimTimeBar$5$1(slimTimeBarInputConfig, interfaceC3978p04, l11, interfaceC3978p03, null);
                                interfaceC3978p05 = interfaceC3978p04;
                                interfaceC3978p06 = l11;
                                c3969l.x(C15);
                            } else {
                                interfaceC3978p05 = interfaceC3978p04;
                                interfaceC3978p06 = l11;
                            }
                            c3969l.k();
                            e b11 = L.b(f7, slimTimeBarInputConfig, (Function2) C15);
                            c3969l.o(-1596340152);
                            n14 = c3969l.n(slimTimeBarInputConfig) | c3969l.n(interfaceC3978p06) | c3969l.n(l13) | (i19 == 4) | c3969l.n(interfaceC3978p03);
                            C16 = c3969l.C();
                            if (!n14 || C16 == InterfaceC3967k.a.a()) {
                                InterfaceC3978p0 interfaceC3978p07 = interfaceC3978p05;
                                a12 = rememberIdleProgressState;
                                a13 = rememberIdleProgressState2;
                                eVar4 = eVar3;
                                function16 = function14;
                                i23 = i21;
                                i24 = i19;
                                InterfaceC3978p0 interfaceC3978p08 = interfaceC3978p03;
                                i25 = i22;
                                SlimTimeBarKt$SlimTimeBar$6$1 slimTimeBarKt$SlimTimeBar$6$1 = new SlimTimeBarKt$SlimTimeBar$6$1(slimTimeBarInputConfig, interfaceC3978p07, interfaceC3978p06, l13, state, interfaceC3978p08, null);
                                interfaceC3978p05 = interfaceC3978p07;
                                c3969l.x(slimTimeBarKt$SlimTimeBar$6$1);
                                C16 = slimTimeBarKt$SlimTimeBar$6$1;
                            } else {
                                a12 = rememberIdleProgressState;
                                a13 = rememberIdleProgressState2;
                                i25 = i22;
                                eVar4 = eVar3;
                                function16 = function14;
                                i23 = i21;
                                i24 = i19;
                            }
                            c3969l.k();
                            e b12 = L.b(b11, slimTimeBarInputConfig, (Function2) C16);
                            c3969l.o(-1596308803);
                            A1<Long> a14 = a13;
                            n15 = (i24 == 4) | c3969l.n(a12) | ((i23 <= 256 && c3969l.n(slimTimeBarStyle4)) || (i25 & 384) == 256) | ((i25 & 7168) == 2048) | c3969l.n(slimTimeBarDimensionsPx2) | c3969l.n(a14);
                            C17 = c3969l.C();
                            if (!n15 || C17 == InterfaceC3967k.a.a()) {
                                slimTimeBarStyle5 = slimTimeBarStyle4;
                                SlimTimeBarKt$SlimTimeBar$7$1 slimTimeBarKt$SlimTimeBar$7$1 = new SlimTimeBarKt$SlimTimeBar$7$1(a12, state, slimTimeBarStyle5, slimTimeBarBehavior4, slimTimeBarDimensionsPx2, a14, interfaceC3978p05);
                                c3969l.x(slimTimeBarKt$SlimTimeBar$7$1);
                                C17 = slimTimeBarKt$SlimTimeBar$7$1;
                            } else {
                                slimTimeBarStyle5 = slimTimeBarStyle4;
                            }
                            c3969l.k();
                            C8392m.a(b12, (Function1) C17, c3969l, 0);
                            eVar5 = eVar4;
                            function17 = function16;
                            function24 = function25;
                            slimTimeBarBehavior3 = slimTimeBarBehavior4;
                            function18 = function19;
                        } else {
                            u11.j();
                            c3969l = u11;
                            eVar5 = eVar2;
                            slimTimeBarStyle5 = slimTimeBarStyle2;
                            slimTimeBarBehavior3 = slimTimeBarBehavior2;
                            function24 = function22;
                            function18 = function13;
                            function17 = function14;
                        }
                        m02 = c3969l.m0();
                        if (m02 != null) {
                            m02.G(new SlimTimeBarKt$SlimTimeBar$8(state, eVar5, slimTimeBarStyle5, slimTimeBarBehavior3, function18, function17, function24, i11, i12));
                            return;
                        }
                        return;
                    }
                    function14 = function12;
                    i17 = i12 & 64;
                    if (i17 != 0) {
                    }
                    if ((i13 & 599187) == 599186) {
                    }
                    u11.Q0();
                    if ((i11 & 1) != 0) {
                    }
                    if (i27 != 0) {
                    }
                    if ((i12 & 4) != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    SlimTimeBarBehavior slimTimeBarBehavior42 = slimTimeBarBehavior2;
                    u11.j0();
                    d dVar2 = (d) u11.m(K0.e());
                    l11 = n1.l(function15, u11);
                    InterfaceC3978p0 l132 = n1.l(function14, u11);
                    l12 = n1.l(function23, u11);
                    boolean isValidDuration2 = isValidDuration(state.getDurationMs());
                    u11.o(-1596404968);
                    C11 = u11.C();
                    if (C11 == InterfaceC3967k.a.a()) {
                    }
                    interfaceC3978p0 = (InterfaceC3978p0) C11;
                    u11.k();
                    rememberIdleProgressState = rememberIdleProgressState(state.getDurationMs(), state.getPositionMsProvider(), true, u11, 384);
                    rememberIdleProgressState2 = rememberIdleProgressState(state.getDurationMs(), state.getBufferedPositionMsProvider(), true, u11, 384);
                    c3969l = u11;
                    Boolean valueOf3 = Boolean.valueOf(state.getEnabled());
                    Boolean valueOf22 = Boolean.valueOf(isValidDuration2);
                    Function2<? super Long, ? super Boolean, Unit> function252 = function23;
                    c3969l.o(-1596389747);
                    i19 = i18 & 14;
                    p11 = (i19 == 4) | c3969l.p(isValidDuration2) | c3969l.n(l12);
                    C12 = c3969l.C();
                    if (p11) {
                    }
                    C12 = new SlimTimeBarKt$SlimTimeBar$4$1(state, isValidDuration2, interfaceC3978p0, l12, null);
                    interfaceC3978p02 = interfaceC3978p0;
                    interfaceC3978p03 = l12;
                    c3969l.x(C12);
                    c3969l.k();
                    Q.g(valueOf3, valueOf22, (Function2) C12, c3969l);
                    c3969l.o(-1596379060);
                    i21 = (i18 & 896) ^ 384;
                    n11 = ((i21 <= 256 && c3969l.n(slimTimeBarStyle4)) || (i18 & 384) == 256) | c3969l.n(dVar2);
                    C13 = c3969l.C();
                    if (!n11) {
                    }
                    C13 = toPx(slimTimeBarStyle4, dVar2);
                    c3969l.x(C13);
                    slimTimeBarDimensionsPx = (SlimTimeBarDimensionsPx) C13;
                    c3969l.k();
                    boolean enabled2 = state.getEnabled();
                    i22 = i18;
                    long durationMs2 = state.getDurationMs();
                    SlimTimeBarGravity gravity2 = slimTimeBarStyle4.getGravity();
                    interfaceC3978p04 = interfaceC3978p02;
                    boolean showScrubber2 = slimTimeBarBehavior42.getShowScrubber();
                    boolean fineScrubEnabled2 = slimTimeBarBehavior42.getFineScrubEnabled();
                    Function1<? super Long, Unit> function192 = function15;
                    c3969l.o(-1596375975);
                    n12 = c3969l.n(gravity2) | c3969l.p(enabled2) | c3969l.s(durationMs2) | c3969l.n(slimTimeBarDimensionsPx) | c3969l.p(showScrubber2) | c3969l.p(fineScrubEnabled2);
                    C14 = c3969l.C();
                    if (n12) {
                    }
                    C14 = new SlimTimeBarInputConfig(state.getEnabled(), state.getDurationMs(), slimTimeBarDimensionsPx, slimTimeBarStyle4.getGravity(), slimTimeBarBehavior42.getShowScrubber(), slimTimeBarBehavior42.getFineScrubEnabled());
                    slimTimeBarDimensionsPx2 = slimTimeBarDimensionsPx;
                    c3969l.x(C14);
                    SlimTimeBarInputConfig slimTimeBarInputConfig2 = (SlimTimeBarInputConfig) C14;
                    c3969l.k();
                    e f72 = a0.f(a0.e(eVar3, 1.0f), slimTimeBarStyle4.getTouchTargetHeight());
                    c3969l.o(-1596355467);
                    n13 = c3969l.n(slimTimeBarInputConfig2) | c3969l.n(l11) | c3969l.n(interfaceC3978p03);
                    C15 = c3969l.C();
                    if (n13) {
                    }
                    C15 = new SlimTimeBarKt$SlimTimeBar$5$1(slimTimeBarInputConfig2, interfaceC3978p04, l11, interfaceC3978p03, null);
                    interfaceC3978p05 = interfaceC3978p04;
                    interfaceC3978p06 = l11;
                    c3969l.x(C15);
                    c3969l.k();
                    e b112 = L.b(f72, slimTimeBarInputConfig2, (Function2) C15);
                    c3969l.o(-1596340152);
                    n14 = c3969l.n(slimTimeBarInputConfig2) | c3969l.n(interfaceC3978p06) | c3969l.n(l132) | (i19 == 4) | c3969l.n(interfaceC3978p03);
                    C16 = c3969l.C();
                    if (n14) {
                    }
                    InterfaceC3978p0 interfaceC3978p072 = interfaceC3978p05;
                    a12 = rememberIdleProgressState;
                    a13 = rememberIdleProgressState2;
                    eVar4 = eVar3;
                    function16 = function14;
                    i23 = i21;
                    i24 = i19;
                    InterfaceC3978p0 interfaceC3978p082 = interfaceC3978p03;
                    i25 = i22;
                    SlimTimeBarKt$SlimTimeBar$6$1 slimTimeBarKt$SlimTimeBar$6$12 = new SlimTimeBarKt$SlimTimeBar$6$1(slimTimeBarInputConfig2, interfaceC3978p072, interfaceC3978p06, l132, state, interfaceC3978p082, null);
                    interfaceC3978p05 = interfaceC3978p072;
                    c3969l.x(slimTimeBarKt$SlimTimeBar$6$12);
                    C16 = slimTimeBarKt$SlimTimeBar$6$12;
                    c3969l.k();
                    e b122 = L.b(b112, slimTimeBarInputConfig2, (Function2) C16);
                    c3969l.o(-1596308803);
                    A1<Long> a142 = a13;
                    n15 = (i24 == 4) | c3969l.n(a12) | ((i23 <= 256 && c3969l.n(slimTimeBarStyle4)) || (i25 & 384) == 256) | ((i25 & 7168) == 2048) | c3969l.n(slimTimeBarDimensionsPx2) | c3969l.n(a142);
                    C17 = c3969l.C();
                    if (n15) {
                    }
                    slimTimeBarStyle5 = slimTimeBarStyle4;
                    SlimTimeBarKt$SlimTimeBar$7$1 slimTimeBarKt$SlimTimeBar$7$12 = new SlimTimeBarKt$SlimTimeBar$7$1(a12, state, slimTimeBarStyle5, slimTimeBarBehavior42, slimTimeBarDimensionsPx2, a142, interfaceC3978p05);
                    c3969l.x(slimTimeBarKt$SlimTimeBar$7$12);
                    C17 = slimTimeBarKt$SlimTimeBar$7$12;
                    c3969l.k();
                    C8392m.a(b122, (Function1) C17, c3969l, 0);
                    eVar5 = eVar4;
                    function17 = function16;
                    function24 = function252;
                    slimTimeBarBehavior3 = slimTimeBarBehavior42;
                    function18 = function192;
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                function13 = function1;
                i16 = i12 & 32;
                if (i16 == 0) {
                }
                function14 = function12;
                i17 = i12 & 64;
                if (i17 != 0) {
                }
                if ((i13 & 599187) == 599186) {
                }
                u11.Q0();
                if ((i11 & 1) != 0) {
                }
                if (i27 != 0) {
                }
                if ((i12 & 4) != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                SlimTimeBarBehavior slimTimeBarBehavior422 = slimTimeBarBehavior2;
                u11.j0();
                d dVar22 = (d) u11.m(K0.e());
                l11 = n1.l(function15, u11);
                InterfaceC3978p0 l1322 = n1.l(function14, u11);
                l12 = n1.l(function23, u11);
                boolean isValidDuration22 = isValidDuration(state.getDurationMs());
                u11.o(-1596404968);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                }
                interfaceC3978p0 = (InterfaceC3978p0) C11;
                u11.k();
                rememberIdleProgressState = rememberIdleProgressState(state.getDurationMs(), state.getPositionMsProvider(), true, u11, 384);
                rememberIdleProgressState2 = rememberIdleProgressState(state.getDurationMs(), state.getBufferedPositionMsProvider(), true, u11, 384);
                c3969l = u11;
                Boolean valueOf32 = Boolean.valueOf(state.getEnabled());
                Boolean valueOf222 = Boolean.valueOf(isValidDuration22);
                Function2<? super Long, ? super Boolean, Unit> function2522 = function23;
                c3969l.o(-1596389747);
                i19 = i18 & 14;
                p11 = (i19 == 4) | c3969l.p(isValidDuration22) | c3969l.n(l12);
                C12 = c3969l.C();
                if (p11) {
                }
                C12 = new SlimTimeBarKt$SlimTimeBar$4$1(state, isValidDuration22, interfaceC3978p0, l12, null);
                interfaceC3978p02 = interfaceC3978p0;
                interfaceC3978p03 = l12;
                c3969l.x(C12);
                c3969l.k();
                Q.g(valueOf32, valueOf222, (Function2) C12, c3969l);
                c3969l.o(-1596379060);
                i21 = (i18 & 896) ^ 384;
                n11 = ((i21 <= 256 && c3969l.n(slimTimeBarStyle4)) || (i18 & 384) == 256) | c3969l.n(dVar22);
                C13 = c3969l.C();
                if (!n11) {
                }
                C13 = toPx(slimTimeBarStyle4, dVar22);
                c3969l.x(C13);
                slimTimeBarDimensionsPx = (SlimTimeBarDimensionsPx) C13;
                c3969l.k();
                boolean enabled22 = state.getEnabled();
                i22 = i18;
                long durationMs22 = state.getDurationMs();
                SlimTimeBarGravity gravity22 = slimTimeBarStyle4.getGravity();
                interfaceC3978p04 = interfaceC3978p02;
                boolean showScrubber22 = slimTimeBarBehavior422.getShowScrubber();
                boolean fineScrubEnabled22 = slimTimeBarBehavior422.getFineScrubEnabled();
                Function1<? super Long, Unit> function1922 = function15;
                c3969l.o(-1596375975);
                n12 = c3969l.n(gravity22) | c3969l.p(enabled22) | c3969l.s(durationMs22) | c3969l.n(slimTimeBarDimensionsPx) | c3969l.p(showScrubber22) | c3969l.p(fineScrubEnabled22);
                C14 = c3969l.C();
                if (n12) {
                }
                C14 = new SlimTimeBarInputConfig(state.getEnabled(), state.getDurationMs(), slimTimeBarDimensionsPx, slimTimeBarStyle4.getGravity(), slimTimeBarBehavior422.getShowScrubber(), slimTimeBarBehavior422.getFineScrubEnabled());
                slimTimeBarDimensionsPx2 = slimTimeBarDimensionsPx;
                c3969l.x(C14);
                SlimTimeBarInputConfig slimTimeBarInputConfig22 = (SlimTimeBarInputConfig) C14;
                c3969l.k();
                e f722 = a0.f(a0.e(eVar3, 1.0f), slimTimeBarStyle4.getTouchTargetHeight());
                c3969l.o(-1596355467);
                n13 = c3969l.n(slimTimeBarInputConfig22) | c3969l.n(l11) | c3969l.n(interfaceC3978p03);
                C15 = c3969l.C();
                if (n13) {
                }
                C15 = new SlimTimeBarKt$SlimTimeBar$5$1(slimTimeBarInputConfig22, interfaceC3978p04, l11, interfaceC3978p03, null);
                interfaceC3978p05 = interfaceC3978p04;
                interfaceC3978p06 = l11;
                c3969l.x(C15);
                c3969l.k();
                e b1122 = L.b(f722, slimTimeBarInputConfig22, (Function2) C15);
                c3969l.o(-1596340152);
                n14 = c3969l.n(slimTimeBarInputConfig22) | c3969l.n(interfaceC3978p06) | c3969l.n(l1322) | (i19 == 4) | c3969l.n(interfaceC3978p03);
                C16 = c3969l.C();
                if (n14) {
                }
                InterfaceC3978p0 interfaceC3978p0722 = interfaceC3978p05;
                a12 = rememberIdleProgressState;
                a13 = rememberIdleProgressState2;
                eVar4 = eVar3;
                function16 = function14;
                i23 = i21;
                i24 = i19;
                InterfaceC3978p0 interfaceC3978p0822 = interfaceC3978p03;
                i25 = i22;
                SlimTimeBarKt$SlimTimeBar$6$1 slimTimeBarKt$SlimTimeBar$6$122 = new SlimTimeBarKt$SlimTimeBar$6$1(slimTimeBarInputConfig22, interfaceC3978p0722, interfaceC3978p06, l1322, state, interfaceC3978p0822, null);
                interfaceC3978p05 = interfaceC3978p0722;
                c3969l.x(slimTimeBarKt$SlimTimeBar$6$122);
                C16 = slimTimeBarKt$SlimTimeBar$6$122;
                c3969l.k();
                e b1222 = L.b(b1122, slimTimeBarInputConfig22, (Function2) C16);
                c3969l.o(-1596308803);
                A1<Long> a1422 = a13;
                n15 = (i24 == 4) | c3969l.n(a12) | ((i23 <= 256 && c3969l.n(slimTimeBarStyle4)) || (i25 & 384) == 256) | ((i25 & 7168) == 2048) | c3969l.n(slimTimeBarDimensionsPx2) | c3969l.n(a1422);
                C17 = c3969l.C();
                if (n15) {
                }
                slimTimeBarStyle5 = slimTimeBarStyle4;
                SlimTimeBarKt$SlimTimeBar$7$1 slimTimeBarKt$SlimTimeBar$7$122 = new SlimTimeBarKt$SlimTimeBar$7$1(a12, state, slimTimeBarStyle5, slimTimeBarBehavior422, slimTimeBarDimensionsPx2, a1422, interfaceC3978p05);
                c3969l.x(slimTimeBarKt$SlimTimeBar$7$122);
                C17 = slimTimeBarKt$SlimTimeBar$7$122;
                c3969l.k();
                C8392m.a(b1222, (Function1) C17, c3969l, 0);
                eVar5 = eVar4;
                function17 = function16;
                function24 = function2522;
                slimTimeBarBehavior3 = slimTimeBarBehavior422;
                function18 = function1922;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            slimTimeBarBehavior2 = slimTimeBarBehavior;
            i15 = i12 & 16;
            if (i15 != 0) {
            }
            function13 = function1;
            i16 = i12 & 32;
            if (i16 == 0) {
            }
            function14 = function12;
            i17 = i12 & 64;
            if (i17 != 0) {
            }
            if ((i13 & 599187) == 599186) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i27 != 0) {
            }
            if ((i12 & 4) != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            SlimTimeBarBehavior slimTimeBarBehavior4222 = slimTimeBarBehavior2;
            u11.j0();
            d dVar222 = (d) u11.m(K0.e());
            l11 = n1.l(function15, u11);
            InterfaceC3978p0 l13222 = n1.l(function14, u11);
            l12 = n1.l(function23, u11);
            boolean isValidDuration222 = isValidDuration(state.getDurationMs());
            u11.o(-1596404968);
            C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
            }
            interfaceC3978p0 = (InterfaceC3978p0) C11;
            u11.k();
            rememberIdleProgressState = rememberIdleProgressState(state.getDurationMs(), state.getPositionMsProvider(), true, u11, 384);
            rememberIdleProgressState2 = rememberIdleProgressState(state.getDurationMs(), state.getBufferedPositionMsProvider(), true, u11, 384);
            c3969l = u11;
            Boolean valueOf322 = Boolean.valueOf(state.getEnabled());
            Boolean valueOf2222 = Boolean.valueOf(isValidDuration222);
            Function2<? super Long, ? super Boolean, Unit> function25222 = function23;
            c3969l.o(-1596389747);
            i19 = i18 & 14;
            p11 = (i19 == 4) | c3969l.p(isValidDuration222) | c3969l.n(l12);
            C12 = c3969l.C();
            if (p11) {
            }
            C12 = new SlimTimeBarKt$SlimTimeBar$4$1(state, isValidDuration222, interfaceC3978p0, l12, null);
            interfaceC3978p02 = interfaceC3978p0;
            interfaceC3978p03 = l12;
            c3969l.x(C12);
            c3969l.k();
            Q.g(valueOf322, valueOf2222, (Function2) C12, c3969l);
            c3969l.o(-1596379060);
            i21 = (i18 & 896) ^ 384;
            n11 = ((i21 <= 256 && c3969l.n(slimTimeBarStyle4)) || (i18 & 384) == 256) | c3969l.n(dVar222);
            C13 = c3969l.C();
            if (!n11) {
            }
            C13 = toPx(slimTimeBarStyle4, dVar222);
            c3969l.x(C13);
            slimTimeBarDimensionsPx = (SlimTimeBarDimensionsPx) C13;
            c3969l.k();
            boolean enabled222 = state.getEnabled();
            i22 = i18;
            long durationMs222 = state.getDurationMs();
            SlimTimeBarGravity gravity222 = slimTimeBarStyle4.getGravity();
            interfaceC3978p04 = interfaceC3978p02;
            boolean showScrubber222 = slimTimeBarBehavior4222.getShowScrubber();
            boolean fineScrubEnabled222 = slimTimeBarBehavior4222.getFineScrubEnabled();
            Function1<? super Long, Unit> function19222 = function15;
            c3969l.o(-1596375975);
            n12 = c3969l.n(gravity222) | c3969l.p(enabled222) | c3969l.s(durationMs222) | c3969l.n(slimTimeBarDimensionsPx) | c3969l.p(showScrubber222) | c3969l.p(fineScrubEnabled222);
            C14 = c3969l.C();
            if (n12) {
            }
            C14 = new SlimTimeBarInputConfig(state.getEnabled(), state.getDurationMs(), slimTimeBarDimensionsPx, slimTimeBarStyle4.getGravity(), slimTimeBarBehavior4222.getShowScrubber(), slimTimeBarBehavior4222.getFineScrubEnabled());
            slimTimeBarDimensionsPx2 = slimTimeBarDimensionsPx;
            c3969l.x(C14);
            SlimTimeBarInputConfig slimTimeBarInputConfig222 = (SlimTimeBarInputConfig) C14;
            c3969l.k();
            e f7222 = a0.f(a0.e(eVar3, 1.0f), slimTimeBarStyle4.getTouchTargetHeight());
            c3969l.o(-1596355467);
            n13 = c3969l.n(slimTimeBarInputConfig222) | c3969l.n(l11) | c3969l.n(interfaceC3978p03);
            C15 = c3969l.C();
            if (n13) {
            }
            C15 = new SlimTimeBarKt$SlimTimeBar$5$1(slimTimeBarInputConfig222, interfaceC3978p04, l11, interfaceC3978p03, null);
            interfaceC3978p05 = interfaceC3978p04;
            interfaceC3978p06 = l11;
            c3969l.x(C15);
            c3969l.k();
            e b11222 = L.b(f7222, slimTimeBarInputConfig222, (Function2) C15);
            c3969l.o(-1596340152);
            n14 = c3969l.n(slimTimeBarInputConfig222) | c3969l.n(interfaceC3978p06) | c3969l.n(l13222) | (i19 == 4) | c3969l.n(interfaceC3978p03);
            C16 = c3969l.C();
            if (n14) {
            }
            InterfaceC3978p0 interfaceC3978p07222 = interfaceC3978p05;
            a12 = rememberIdleProgressState;
            a13 = rememberIdleProgressState2;
            eVar4 = eVar3;
            function16 = function14;
            i23 = i21;
            i24 = i19;
            InterfaceC3978p0 interfaceC3978p08222 = interfaceC3978p03;
            i25 = i22;
            SlimTimeBarKt$SlimTimeBar$6$1 slimTimeBarKt$SlimTimeBar$6$1222 = new SlimTimeBarKt$SlimTimeBar$6$1(slimTimeBarInputConfig222, interfaceC3978p07222, interfaceC3978p06, l13222, state, interfaceC3978p08222, null);
            interfaceC3978p05 = interfaceC3978p07222;
            c3969l.x(slimTimeBarKt$SlimTimeBar$6$1222);
            C16 = slimTimeBarKt$SlimTimeBar$6$1222;
            c3969l.k();
            e b12222 = L.b(b11222, slimTimeBarInputConfig222, (Function2) C16);
            c3969l.o(-1596308803);
            A1<Long> a14222 = a13;
            n15 = (i24 == 4) | c3969l.n(a12) | ((i23 <= 256 && c3969l.n(slimTimeBarStyle4)) || (i25 & 384) == 256) | ((i25 & 7168) == 2048) | c3969l.n(slimTimeBarDimensionsPx2) | c3969l.n(a14222);
            C17 = c3969l.C();
            if (n15) {
            }
            slimTimeBarStyle5 = slimTimeBarStyle4;
            SlimTimeBarKt$SlimTimeBar$7$1 slimTimeBarKt$SlimTimeBar$7$1222 = new SlimTimeBarKt$SlimTimeBar$7$1(a12, state, slimTimeBarStyle5, slimTimeBarBehavior4222, slimTimeBarDimensionsPx2, a14222, interfaceC3978p05);
            c3969l.x(slimTimeBarKt$SlimTimeBar$7$1222);
            C17 = slimTimeBarKt$SlimTimeBar$7$1222;
            c3969l.k();
            C8392m.a(b12222, (Function1) C17, c3969l, 0);
            eVar5 = eVar4;
            function17 = function16;
            function24 = function25222;
            slimTimeBarBehavior3 = slimTimeBarBehavior4222;
            function18 = function19222;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        if ((i11 & 384) != 0) {
        }
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        slimTimeBarBehavior2 = slimTimeBarBehavior;
        i15 = i12 & 16;
        if (i15 != 0) {
        }
        function13 = function1;
        i16 = i12 & 32;
        if (i16 == 0) {
        }
        function14 = function12;
        i17 = i12 & 64;
        if (i17 != 0) {
        }
        if ((i13 & 599187) == 599186) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i27 != 0) {
        }
        if ((i12 & 4) != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        SlimTimeBarBehavior slimTimeBarBehavior42222 = slimTimeBarBehavior2;
        u11.j0();
        d dVar2222 = (d) u11.m(K0.e());
        l11 = n1.l(function15, u11);
        InterfaceC3978p0 l132222 = n1.l(function14, u11);
        l12 = n1.l(function23, u11);
        boolean isValidDuration2222 = isValidDuration(state.getDurationMs());
        u11.o(-1596404968);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        interfaceC3978p0 = (InterfaceC3978p0) C11;
        u11.k();
        rememberIdleProgressState = rememberIdleProgressState(state.getDurationMs(), state.getPositionMsProvider(), true, u11, 384);
        rememberIdleProgressState2 = rememberIdleProgressState(state.getDurationMs(), state.getBufferedPositionMsProvider(), true, u11, 384);
        c3969l = u11;
        Boolean valueOf3222 = Boolean.valueOf(state.getEnabled());
        Boolean valueOf22222 = Boolean.valueOf(isValidDuration2222);
        Function2<? super Long, ? super Boolean, Unit> function252222 = function23;
        c3969l.o(-1596389747);
        i19 = i18 & 14;
        p11 = (i19 == 4) | c3969l.p(isValidDuration2222) | c3969l.n(l12);
        C12 = c3969l.C();
        if (p11) {
        }
        C12 = new SlimTimeBarKt$SlimTimeBar$4$1(state, isValidDuration2222, interfaceC3978p0, l12, null);
        interfaceC3978p02 = interfaceC3978p0;
        interfaceC3978p03 = l12;
        c3969l.x(C12);
        c3969l.k();
        Q.g(valueOf3222, valueOf22222, (Function2) C12, c3969l);
        c3969l.o(-1596379060);
        i21 = (i18 & 896) ^ 384;
        n11 = ((i21 <= 256 && c3969l.n(slimTimeBarStyle4)) || (i18 & 384) == 256) | c3969l.n(dVar2222);
        C13 = c3969l.C();
        if (!n11) {
        }
        C13 = toPx(slimTimeBarStyle4, dVar2222);
        c3969l.x(C13);
        slimTimeBarDimensionsPx = (SlimTimeBarDimensionsPx) C13;
        c3969l.k();
        boolean enabled2222 = state.getEnabled();
        i22 = i18;
        long durationMs2222 = state.getDurationMs();
        SlimTimeBarGravity gravity2222 = slimTimeBarStyle4.getGravity();
        interfaceC3978p04 = interfaceC3978p02;
        boolean showScrubber2222 = slimTimeBarBehavior42222.getShowScrubber();
        boolean fineScrubEnabled2222 = slimTimeBarBehavior42222.getFineScrubEnabled();
        Function1<? super Long, Unit> function192222 = function15;
        c3969l.o(-1596375975);
        n12 = c3969l.n(gravity2222) | c3969l.p(enabled2222) | c3969l.s(durationMs2222) | c3969l.n(slimTimeBarDimensionsPx) | c3969l.p(showScrubber2222) | c3969l.p(fineScrubEnabled2222);
        C14 = c3969l.C();
        if (n12) {
        }
        C14 = new SlimTimeBarInputConfig(state.getEnabled(), state.getDurationMs(), slimTimeBarDimensionsPx, slimTimeBarStyle4.getGravity(), slimTimeBarBehavior42222.getShowScrubber(), slimTimeBarBehavior42222.getFineScrubEnabled());
        slimTimeBarDimensionsPx2 = slimTimeBarDimensionsPx;
        c3969l.x(C14);
        SlimTimeBarInputConfig slimTimeBarInputConfig2222 = (SlimTimeBarInputConfig) C14;
        c3969l.k();
        e f72222 = a0.f(a0.e(eVar3, 1.0f), slimTimeBarStyle4.getTouchTargetHeight());
        c3969l.o(-1596355467);
        n13 = c3969l.n(slimTimeBarInputConfig2222) | c3969l.n(l11) | c3969l.n(interfaceC3978p03);
        C15 = c3969l.C();
        if (n13) {
        }
        C15 = new SlimTimeBarKt$SlimTimeBar$5$1(slimTimeBarInputConfig2222, interfaceC3978p04, l11, interfaceC3978p03, null);
        interfaceC3978p05 = interfaceC3978p04;
        interfaceC3978p06 = l11;
        c3969l.x(C15);
        c3969l.k();
        e b112222 = L.b(f72222, slimTimeBarInputConfig2222, (Function2) C15);
        c3969l.o(-1596340152);
        n14 = c3969l.n(slimTimeBarInputConfig2222) | c3969l.n(interfaceC3978p06) | c3969l.n(l132222) | (i19 == 4) | c3969l.n(interfaceC3978p03);
        C16 = c3969l.C();
        if (n14) {
        }
        InterfaceC3978p0 interfaceC3978p072222 = interfaceC3978p05;
        a12 = rememberIdleProgressState;
        a13 = rememberIdleProgressState2;
        eVar4 = eVar3;
        function16 = function14;
        i23 = i21;
        i24 = i19;
        InterfaceC3978p0 interfaceC3978p082222 = interfaceC3978p03;
        i25 = i22;
        SlimTimeBarKt$SlimTimeBar$6$1 slimTimeBarKt$SlimTimeBar$6$12222 = new SlimTimeBarKt$SlimTimeBar$6$1(slimTimeBarInputConfig2222, interfaceC3978p072222, interfaceC3978p06, l132222, state, interfaceC3978p082222, null);
        interfaceC3978p05 = interfaceC3978p072222;
        c3969l.x(slimTimeBarKt$SlimTimeBar$6$12222);
        C16 = slimTimeBarKt$SlimTimeBar$6$12222;
        c3969l.k();
        e b122222 = L.b(b112222, slimTimeBarInputConfig2222, (Function2) C16);
        c3969l.o(-1596308803);
        A1<Long> a142222 = a13;
        n15 = (i24 == 4) | c3969l.n(a12) | ((i23 <= 256 && c3969l.n(slimTimeBarStyle4)) || (i25 & 384) == 256) | ((i25 & 7168) == 2048) | c3969l.n(slimTimeBarDimensionsPx2) | c3969l.n(a142222);
        C17 = c3969l.C();
        if (n15) {
        }
        slimTimeBarStyle5 = slimTimeBarStyle4;
        SlimTimeBarKt$SlimTimeBar$7$1 slimTimeBarKt$SlimTimeBar$7$12222 = new SlimTimeBarKt$SlimTimeBar$7$1(a12, state, slimTimeBarStyle5, slimTimeBarBehavior42222, slimTimeBarDimensionsPx2, a142222, interfaceC3978p05);
        c3969l.x(slimTimeBarKt$SlimTimeBar$7$12222);
        C17 = slimTimeBarKt$SlimTimeBar$7$12222;
        c3969l.k();
        C8392m.a(b122222, (Function1) C17, c3969l, 0);
        eVar5 = eVar4;
        function17 = function16;
        function24 = function252222;
        slimTimeBarBehavior3 = slimTimeBarBehavior42222;
        function18 = function192222;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Long, Unit> SlimTimeBar$lambda$3(A1<? extends Function1<? super Long, Unit>> a12) {
        return (Function1) a12.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Long, Unit> SlimTimeBar$lambda$4(A1<? extends Function1<? super Long, Unit>> a12) {
        return (Function1) a12.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<Long, Boolean, Unit> SlimTimeBar$lambda$5(A1<? extends Function2<? super Long, ? super Boolean, Unit>> a12) {
        return (Function2) a12.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long SlimTimeBar$lambda$7(InterfaceC3978p0<Long> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    private static final float barWidth(float f7, float f11) {
        return Math.max(0.0f, f11 - f7);
    }

    @NotNull
    public static final SlimTimeBarMetrics calculateBarMetrics(float f7, float f11, @NotNull SlimTimeBarDimensionsPx dimensions, @NotNull SlimTimeBarGravity gravity, boolean z11) {
        float barHeightPx;
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        float scrubberPaddingPx = z11 ? dimensions.getScrubberPaddingPx() : 0.0f;
        float max = Math.max(scrubberPaddingPx, f7 - scrubberPaddingPx);
        int i11 = WhenMappings.$EnumSwitchMapping$0[gravity.ordinal()];
        if (i11 == 1) {
            barHeightPx = (f11 - dimensions.getBarHeightPx()) / 2.0f;
        } else {
            if (i11 != 2) {
                throw new o();
            }
            barHeightPx = (f11 - dimensions.getBarHeightPx()) - Math.max(scrubberPaddingPx - (dimensions.getBarHeightPx() / 2.0f), 0.0f);
        }
        return new SlimTimeBarMetrics(scrubberPaddingPx, max, (dimensions.getBarHeightPx() / 2.0f) + barHeightPx);
    }

    public static final long coercePosition(long j11, long j12) {
        if (isValidDuration(j12)) {
            return h.g(j11, 0L, j12);
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectSlimTimeBarScrubGestures(F f7, SlimTimeBarInputConfig slimTimeBarInputConfig, Function1<? super Long, Unit> function1, Function1<? super Long, Unit> function12, Function1<? super Boolean, Unit> function13, kotlin.coroutines.d<? super Unit> dVar) {
        M m11 = new M();
        M m12 = new M();
        J j11 = new J();
        I i11 = new I();
        Object f11 = C5177u.f(f7, new SlimTimeBarKt$detectSlimTimeBarScrubGestures$2(slimTimeBarInputConfig, f7, m11, j11, m12), new SlimTimeBarKt$detectSlimTimeBarScrubGestures$3(m11, m12, i11, function13), new SlimTimeBarKt$detectSlimTimeBarScrubGestures$4(m11, m12, i11, function13), new SlimTimeBarKt$detectSlimTimeBarScrubGestures$5(m11, m12, slimTimeBarInputConfig, j11, i11, function1, function12), dVar);
        return f11 == a.COROUTINE_SUSPENDED ? f11 : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectSlimTimeBarTapGestures(F f7, SlimTimeBarInputConfig slimTimeBarInputConfig, Function1<? super Long, Unit> function1, kotlin.coroutines.d<? super Unit> dVar) {
        Object f11;
        f11 = C9115P.f(C9115P.f82441a, dVar, null, (r12 & 2) != 0 ? null : null, (r12 & 8) != 0 ? null : new SlimTimeBarKt$detectSlimTimeBarTapGestures$2(slimTimeBarInputConfig, f7, function1), f7);
        return f11 == a.COROUTINE_SUSPENDED ? f11 : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void drawSlimTimeBar(InterfaceC8412e interfaceC8412e, long j11, SlimTimeBarColors slimTimeBarColors, SlimTimeBarBehavior slimTimeBarBehavior, SlimTimeBarDimensionsPx slimTimeBarDimensionsPx, SlimTimeBarGravity slimTimeBarGravity, long j12, long j13, boolean z11) {
        SlimTimeBarMetrics calculateBarMetrics = calculateBarMetrics(C7464j.f(interfaceC8412e.i()), C7464j.d(interfaceC8412e.i()), slimTimeBarDimensionsPx, slimTimeBarGravity, slimTimeBarBehavior.getShowScrubber());
        float scrubbedBarHeightPx = z11 ? slimTimeBarDimensionsPx.getScrubbedBarHeightPx() : slimTimeBarDimensionsPx.getBarHeightPx();
        float d11 = slimTimeBarBehavior.getClipToOuterCorners() ? C7464j.d(interfaceC8412e.i()) - scrubbedBarHeightPx : calculateBarMetrics.getCenterY() - (scrubbedBarHeightPx / 2.0f);
        long a11 = C7456b.a(slimTimeBarDimensionsPx.getTrackCornerRadiusPx(), slimTimeBarDimensionsPx.getTrackCornerRadiusPx());
        if (!isValidDuration(j11)) {
            m1564drawSlimTimeBarSegmentT5rlL0E(interfaceC8412e, calculateBarMetrics, d11, scrubbedBarHeightPx, a11, calculateBarMetrics.getLeft(), calculateBarMetrics.getRight(), slimTimeBarColors.getUnplayed());
            return;
        }
        float xFromPosition = xFromPosition(j12, calculateBarMetrics.getLeft(), calculateBarMetrics.getRight(), j11);
        float xFromPosition2 = xFromPosition(j13, calculateBarMetrics.getLeft(), calculateBarMetrics.getRight(), j11);
        m1564drawSlimTimeBarSegmentT5rlL0E(interfaceC8412e, calculateBarMetrics, d11, scrubbedBarHeightPx, a11, xFromPosition, calculateBarMetrics.getRight(), slimTimeBarColors.getUnplayed());
        if (xFromPosition2 > xFromPosition) {
            m1564drawSlimTimeBarSegmentT5rlL0E(interfaceC8412e, calculateBarMetrics, d11, scrubbedBarHeightPx, a11, xFromPosition, xFromPosition2, slimTimeBarColors.getBuffered());
        }
        m1564drawSlimTimeBarSegmentT5rlL0E(interfaceC8412e, calculateBarMetrics, d11, scrubbedBarHeightPx, a11, calculateBarMetrics.getLeft(), xFromPosition, slimTimeBarColors.getPlayed());
        if (slimTimeBarBehavior.getShowScrubber()) {
            float scrubberDraggedSizePx = z11 ? slimTimeBarDimensionsPx.getScrubberDraggedSizePx() : slimTimeBarDimensionsPx.getScrubberEnabledSizePx();
            if (scrubberDraggedSizePx > 0.0f) {
                InterfaceC8412e.m1(interfaceC8412e, slimTimeBarColors.getScrubber(), scrubberDraggedSizePx / 2.0f, P9.a.a(xFromPosition, calculateBarMetrics.getCenterY()), 120);
            }
        }
    }

    /* renamed from: drawSlimTimeBarSegment-T5rlL0E, reason: not valid java name */
    private static final void m1564drawSlimTimeBarSegmentT5rlL0E(InterfaceC8412e interfaceC8412e, SlimTimeBarMetrics slimTimeBarMetrics, float f7, float f11, long j11, float f12, float f13, long j12) {
        float d11 = h.d(Math.min(f12, f13), slimTimeBarMetrics.getLeft(), slimTimeBarMetrics.getRight());
        float d12 = h.d(Math.max(f12, f13), slimTimeBarMetrics.getLeft(), slimTimeBarMetrics.getRight());
        if (d12 > d11) {
            InterfaceC8412e.p0(interfaceC8412e, j12, P9.a.a(d11, f7), C7465k.a(d12 - d11, f11), j11, null, 240);
        }
    }

    public static final boolean isValidDuration(long j11) {
        return j11 > 0;
    }

    public static final long positionFromX(float f7, float f11, float f12, long j11) {
        float barWidth = barWidth(f11, f12);
        if (barWidth <= 0.0f || !isValidDuration(j11)) {
            return 0L;
        }
        return h.g((long) (h.d((f7 - f11) / barWidth, 0.0f, 1.0f) * j11), 0L, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long readIdleProgress(Function0<Long> function0, long j11, boolean z11) {
        long coercePosition = coercePosition(function0.invoke().longValue(), j11);
        return z11 ? TimeBucketKt.roundDownToTimeBucket(coercePosition, 500L, j11) : coercePosition;
    }

    private static final A1<Long> rememberIdleProgressState(long j11, Function0<Long> function0, boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(2043687606);
        interfaceC3967k.o(-124741194);
        boolean z12 = ((((i11 & 14) ^ 6) > 4 && interfaceC3967k.s(j11)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && interfaceC3967k.n(function0)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && interfaceC3967k.p(z11)) || (i11 & 384) == 256);
        Object C11 = interfaceC3967k.C();
        if (z12 || C11 == InterfaceC3967k.a.a()) {
            C11 = n1.e(new SlimTimeBarKt$rememberIdleProgressState$1$1(function0, j11, z11));
            interfaceC3967k.x(C11);
        }
        A1<Long> a12 = (A1) C11;
        interfaceC3967k.k();
        interfaceC3967k.k();
        return a12;
    }

    private static final SlimTimeBarDimensionsPx toPx(SlimTimeBarStyle slimTimeBarStyle, d dVar) {
        return new SlimTimeBarDimensionsPx(dVar.v1(slimTimeBarStyle.getBarHeight()), dVar.v1(slimTimeBarStyle.getScrubbedBarHeight()), dVar.v1(slimTimeBarStyle.getScrubberEnabledSize()), dVar.v1(slimTimeBarStyle.getScrubberDraggedSize()), dVar.v1(slimTimeBarStyle.getTrackCornerRadius()), dVar.v1(FINE_SCRUB_Y_THRESHOLD));
    }

    public static final float xFromPosition(long j11, float f7, float f11, long j12) {
        float barWidth = barWidth(f7, f11);
        return (barWidth <= 0.0f || !isValidDuration(j12)) ? f7 : ((coercePosition(j11, j12) / j12) * barWidth) + f7;
    }
}
