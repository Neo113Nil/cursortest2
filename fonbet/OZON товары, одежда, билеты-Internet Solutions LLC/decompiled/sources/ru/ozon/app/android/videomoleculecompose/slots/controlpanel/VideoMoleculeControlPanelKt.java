package ru.ozon.app.android.videomoleculecompose.slots.controlpanel;

import B0.C2510t;
import B1.V;
import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import K00.b;
import K1.M;
import K1.N;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.C3996z;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import T7.E;
import U7.i;
import Z1.d;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.K0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import fd.p;
import fd.t;
import java.util.NoSuchElementException;
import kd.C7665d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.app.android.videomoleculecompose.intent.VideoMoleculeIntent;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarBehavior;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarDefaults;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarGravity;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarState;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarStyle;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\u001aù\u0001\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072*\b\u0002\u0010\r\u001a$\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0004\u0012\u00020\u00040\tj\u0002`\f2f\b\u0002\u0010\u0016\u001a`\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u0013\u0012\u0004\u0012\u00020\u00040\u000ej\u0002`\u00152*\b\u0002\u0010\u0018\u001a$\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0004\u0012\u00020\u00040\tj\u0002`\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u009d\u0001\u0010 \u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072d\u0010\u0016\u001a`\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u0013\u0012\u0004\u0012\u00020\u00040\u000ej\u0002`\u00152\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b \u0010!\u001a\u009d\u0002\u0010'\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\n2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020#0\u00022\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00072(\u0010\r\u001a$\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0004\u0012\u00020\u00040\tj\u0002`\f2d\u0010\u0016\u001a`\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u0013\u0012\u0004\u0012\u00020\u00040\u000ej\u0002`\u00152(\u0010\u0018\u001a$\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0004\u0012\u00020\u00040\tj\u0002`\u00172\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b'\u0010(\u001a\u009d\u0002\u0010)\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\n2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020#0\u00022\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00072(\u0010\r\u001a$\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0004\u0012\u00020\u00040\tj\u0002`\f2d\u0010\u0016\u001a`\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u0013\u0012\u0004\u0012\u00020\u00040\u000ej\u0002`\u00152(\u0010\u0018\u001a$\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0004\u0012\u00020\u00040\tj\u0002`\u00172\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b)\u0010(\u001a%\u0010,\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00142\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0003¢\u0006\u0004\b,\u0010-\u001aM\u00101\u001a\u00020\u00042\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010/\u001a\u00020\u00122\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020#0\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u00100\u001a\u00020\u0014H\u0003¢\u0006\u0004\b1\u00102\u001a?\u00104\u001a\b\u0012\u0004\u0012\u00020#032\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010/\u001a\u00020\u00122\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020#0\u0002H\u0003¢\u0006\u0004\b4\u00105\u001a+\u00107\u001a\u0002062\u0006\u0010/\u001a\u00020\u00122\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020#0\u0002H\u0003¢\u0006\u0004\b7\u00108\u001a'\u0010<\u001a\u0002092\u0006\u0010/\u001a\u00020\u00122\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u000209H\u0002¢\u0006\u0004\b<\u0010=\u001a7\u0010?\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0003¢\u0006\u0004\b?\u0010@\"\u0014\u0010A\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B\"\u0014\u0010C\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010B\"\u0014\u0010D\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010B\"\u0014\u0010E\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010B\"\u0014\u0010F\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010B¨\u0006J²\u0006\f\u0010G\u001a\u00020\u00148\nX\u008a\u0084\u0002²\u0006\f\u0010H\u001a\u00020\u00148\nX\u008a\u0084\u0002²\u0006\u001c\u0010I\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/VideoMoleculeControlPanelState;", "state", "Lkotlin/Function1;", "Lru/ozon/app/android/videomoleculecompose/intent/VideoMoleculeIntent;", "", "Lru/ozon/app/android/videomoleculecompose/intent/VideoMoleculeIntentHandler;", "onIntent", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function3;", "Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/VideoMoleculePlayPauseState;", "Lkotlin/Function0;", "Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/VideoMoleculePlayPauseSlot;", "playPause", "Lkotlin/Function7;", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarState;", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarStyle;", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarBehavior;", "", "Lkotlin/Function2;", "", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/VideoMoleculeTimeBarSlot;", "timeBar", "Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/VideoMoleculeModeButtonSlot;", "modeButton", "VideoMoleculeControlPanel", "(Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/VideoMoleculeControlPanelState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Lfd/p;Lfd/t;Lfd/p;LS0/k;II)V", "timeline", "style", "behavior", "Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/ControlPanelActions;", "actions", "CompactControlPanel", "(Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarState;Landroidx/compose/ui/e;Lfd/t;Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarStyle;Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarBehavior;Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/ControlPanelActions;LS0/k;I)V", "playPauseState", "", "timeFormatter", "isFullscreen", "isScrubbing", "PortraitControlPanel", "(Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarState;Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/VideoMoleculePlayPauseState;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/ui/e;Lfd/p;Lfd/t;Lfd/p;Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarStyle;Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarBehavior;Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/ControlPanelActions;LS0/k;II)V", "LandscapeControlPanel", "visible", "content", "ControlButtonSlotContainer", "(ZLkotlin/jvm/functions/Function2;LS0/k;I)V", "positionMsProvider", "durationMs", FormPageDTO.Field.FIELD_TYPE_HIDDEN, "TimeGroup", "(Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;ZLS0/k;II)V", "LS0/A1;", "rememberThrottledTimeText", "(Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function1;LS0/k;I)LS0/A1;", "LZ1/h;", "rememberTimeGroupWidth", "(JLkotlin/jvm/functions/Function1;LS0/k;I)F", "", "digitWidth", "colonWidth", "defaultNumericTimeUpperBoundWidth", "(JII)I", "isFinished", "rememberControlPanelActions", "(ZZLkotlin/jvm/functions/Function1;LS0/k;I)Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/ControlPanelActions;", "PortraitHorizontalPadding", "F", "LandscapeHorizontalPadding", "LandscapeBottomPadding", "TimeGroupStartPadding", "TimeGroupEndPadding", "currentIsFinished", "currentIsFullscreen", "currentOnIntent", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeControlPanelKt {
    private static final float PortraitHorizontalPadding = 14;
    private static final float LandscapeHorizontalPadding = 60;
    private static final float LandscapeBottomPadding = 36;
    private static final float TimeGroupStartPadding = 8;
    private static final float TimeGroupEndPadding = 16;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CompactControlPanel(SlimTimeBarState slimTimeBarState, e eVar, t<? super SlimTimeBarState, ? super e, ? super SlimTimeBarStyle, ? super SlimTimeBarBehavior, ? super Function1<? super Long, Unit>, ? super Function1<? super Long, Unit>, ? super Function2<? super Long, ? super Boolean, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> tVar, SlimTimeBarStyle slimTimeBarStyle, SlimTimeBarBehavior slimTimeBarBehavior, ControlPanelActions controlPanelActions, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(795981518);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(slimTimeBarState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(tVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(slimTimeBarStyle) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.n(slimTimeBarBehavior) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.n(controlPanelActions) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            int i13 = i12 >> 3;
            c3969l = u11;
            tVar.invoke(slimTimeBarState, T.h(a0.e(eVar, 1.0f), 16, 0.0f, 2), slimTimeBarStyle, slimTimeBarBehavior, controlPanelActions.getOnScrubStart(), controlPanelActions.getOnScrubMove(), controlPanelActions.getOnScrubEnd(), c3969l, Integer.valueOf(((i12 << 15) & 29360128) | (i12 & 14) | (i13 & 896) | (i13 & 7168)));
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new VideoMoleculeControlPanelKt$CompactControlPanel$1(slimTimeBarState, eVar, tVar, slimTimeBarStyle, slimTimeBarBehavior, controlPanelActions, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ControlButtonSlotContainer(boolean z11, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-2098032731);
        if ((i11 & 6) == 0) {
            i12 = (u11.p(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function2) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            e n11 = a0.n(e.f40358c0, VideoMoleculeControlPanelDefaultsKt.getControlButtonSize());
            V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, n11);
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
            i.b(u11, f11, 1446737719);
            if (z11) {
                function2.invoke(u11, Integer.valueOf((i12 >> 3) & 14));
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new VideoMoleculeControlPanelKt$ControlButtonSlotContainer$2(z11, function2, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LandscapeControlPanel(SlimTimeBarState slimTimeBarState, VideoMoleculePlayPauseState videoMoleculePlayPauseState, Function1<? super Long, String> function1, boolean z11, boolean z12, e eVar, p<? super VideoMoleculePlayPauseState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar, t<? super SlimTimeBarState, ? super e, ? super SlimTimeBarStyle, ? super SlimTimeBarBehavior, ? super Function1<? super Long, Unit>, ? super Function1<? super Long, Unit>, ? super Function2<? super Long, ? super Boolean, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> tVar, p<? super Boolean, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar2, SlimTimeBarStyle slimTimeBarStyle, SlimTimeBarBehavior slimTimeBarBehavior, ControlPanelActions controlPanelActions, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super Long, String> function12;
        int i14;
        C3969l u11 = interfaceC3967k.u(1765430529);
        if ((i11 & 6) == 0) {
            i13 = (u11.n(slimTimeBarState) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.n(videoMoleculePlayPauseState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            function12 = function1;
            i13 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            function12 = function1;
        }
        if ((i11 & 3072) == 0) {
            i13 |= u11.p(z11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i13 |= u11.p(z12) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= u11.n(eVar) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i13 |= u11.F(pVar) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i13 |= u11.F(tVar) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= u11.F(pVar2) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= u11.n(slimTimeBarStyle) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (u11.n(slimTimeBarBehavior) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= u11.n(controlPanelActions) ? 32 : 16;
        }
        if ((i13 & 306783379) == 306783378 && (i14 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            e j11 = T.j(T.h(a0.e(eVar, 1.0f), LandscapeHorizontalPadding, 0.0f, 2), 0.0f, 0.0f, 0.0f, LandscapeBottomPadding, 7);
            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, j11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            boolean z13 = !z12;
            ControlButtonSlotContainer(z13, a1.c.c(-914825113, new VideoMoleculeControlPanelKt$LandscapeControlPanel$1$1(pVar, videoMoleculePlayPauseState, controlPanelActions), u11), u11, 48);
            e.a aVar = e.f40358c0;
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            tVar.invoke(slimTimeBarState, T.h(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 6, 0.0f, 2), slimTimeBarStyle, slimTimeBarBehavior, controlPanelActions.getOnScrubStart(), controlPanelActions.getOnScrubMove(), controlPanelActions.getOnScrubEnd(), u11, Integer.valueOf((i13 & 14) | ((i13 >> 21) & 896) | ((i14 << 9) & 7168) | (29360128 & i13)));
            TimeGroup(slimTimeBarState.getPositionMsProvider(), slimTimeBarState.getDurationMs(), function12, T.j(aVar, TimeGroupStartPadding, 0.0f, TimeGroupEndPadding, 0.0f, 10), z12, u11, (i13 & 896) | 3072 | (i13 & 57344), 0);
            ControlButtonSlotContainer(z13, a1.c.c(836325854, new VideoMoleculeControlPanelKt$LandscapeControlPanel$1$2(pVar2, z11, controlPanelActions), u11), u11, 48);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new VideoMoleculeControlPanelKt$LandscapeControlPanel$2(slimTimeBarState, videoMoleculePlayPauseState, function1, z11, z12, eVar, pVar, tVar, pVar2, slimTimeBarStyle, slimTimeBarBehavior, controlPanelActions, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PortraitControlPanel(SlimTimeBarState slimTimeBarState, VideoMoleculePlayPauseState videoMoleculePlayPauseState, Function1<? super Long, String> function1, boolean z11, boolean z12, e eVar, p<? super VideoMoleculePlayPauseState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar, t<? super SlimTimeBarState, ? super e, ? super SlimTimeBarStyle, ? super SlimTimeBarBehavior, ? super Function1<? super Long, Unit>, ? super Function1<? super Long, Unit>, ? super Function2<? super Long, ? super Boolean, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> tVar, p<? super Boolean, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar2, SlimTimeBarStyle slimTimeBarStyle, SlimTimeBarBehavior slimTimeBarBehavior, ControlPanelActions controlPanelActions, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super Long, String> function12;
        int i14;
        C3969l u11 = interfaceC3967k.u(1943410045);
        if ((i11 & 6) == 0) {
            i13 = (u11.n(slimTimeBarState) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.n(videoMoleculePlayPauseState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            function12 = function1;
            i13 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            function12 = function1;
        }
        if ((i11 & 3072) == 0) {
            i13 |= u11.p(z11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i13 |= u11.p(z12) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= u11.n(eVar) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i13 |= u11.F(pVar) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i13 |= u11.F(tVar) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= u11.F(pVar2) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= u11.n(slimTimeBarStyle) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (u11.n(slimTimeBarBehavior) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= u11.n(controlPanelActions) ? 32 : 16;
        }
        if ((i13 & 306783379) == 306783378 && (i14 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            e h11 = T.h(a0.e(eVar, 1.0f), PortraitHorizontalPadding, 0.0f, 2);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, h11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            e.a aVar = e.f40358c0;
            tVar.invoke(slimTimeBarState, T.j(a0.e(aVar, 1.0f), 0.0f, 0.0f, 0.0f, 6, 7), slimTimeBarStyle, slimTimeBarBehavior, controlPanelActions.getOnScrubStart(), controlPanelActions.getOnScrubMove(), controlPanelActions.getOnScrubEnd(), u11, Integer.valueOf((i13 & 14) | 48 | ((i13 >> 21) & 896) | ((i14 << 9) & 7168) | (29360128 & i13)));
            e e11 = a0.e(aVar, 1.0f);
            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f11 = c.f(u11, e11);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, h12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            boolean z13 = !z12;
            ControlButtonSlotContainer(z13, a1.c.c(-1069243103, new VideoMoleculeControlPanelKt$PortraitControlPanel$1$1$1(pVar, videoMoleculePlayPauseState, controlPanelActions), u11), u11, 48);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
            V f12 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I13 = u11.I();
            A0 d13 = u11.d();
            e f13 = c.f(u11, layoutWeightElement);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 f14 = E.f(u11, f12, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                a.d(I13, u11, I13, f14);
            }
            i.b(u11, f13, -1740490070);
            if (!z12) {
                TimeGroup(slimTimeBarState.getPositionMsProvider(), slimTimeBarState.getDurationMs(), function12, null, false, u11, i13 & 896, 24);
            }
            u11.k();
            u11.f();
            ControlButtonSlotContainer(z13, a1.c.c(666392138, new VideoMoleculeControlPanelKt$PortraitControlPanel$1$1$3(pVar2, z11, controlPanelActions), u11), u11, 48);
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new VideoMoleculeControlPanelKt$PortraitControlPanel$2(slimTimeBarState, videoMoleculePlayPauseState, function1, z11, z12, eVar, pVar, tVar, pVar2, slimTimeBarStyle, slimTimeBarBehavior, controlPanelActions, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimeGroup(Function0<Long> function0, long j11, Function1<? super Long, String> function1, e eVar, boolean z11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Function0<Long> function02;
        int i13;
        e eVar2;
        int i14;
        boolean z12;
        int i15;
        boolean z13;
        boolean z14;
        String C11;
        e eVar3;
        C3969l c3969l;
        boolean z15;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-566191896);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
            function02 = function0;
        } else if ((i11 & 6) == 0) {
            function02 = function0;
            i13 = (u11.F(function02) ? 4 : 2) | i11;
        } else {
            function02 = function0;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.s(j11) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i16 = i12 & 8;
        if (i16 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            i14 = i12 & 16;
            if (i14 == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                z12 = z11;
                i13 |= u11.p(z12) ? 16384 : 8192;
                i15 = i13;
                if ((i15 & 9363) == 9362 || !u11.b()) {
                    e eVar4 = i16 != 0 ? e.f40358c0 : eVar2;
                    z13 = i14 != 0 ? false : z12;
                    int i17 = i15 & 112;
                    int i18 = i15 & 896;
                    A1<String> rememberThrottledTimeText = rememberThrottledTimeText(function02, j11, function1, u11, i15 & 1022);
                    u11.o(986799657);
                    z14 = (i18 == 256) | (i17 == 32);
                    C11 = u11.C();
                    if (!z14 || C11 == InterfaceC3967k.a.a()) {
                        C11 = function1.invoke(Long.valueOf(j11));
                        u11.x(C11);
                    }
                    String str = (String) C11;
                    u11.k();
                    float rememberTimeGroupWidth = rememberTimeGroupWidth(j11, function1, u11, (i15 >> 3) & 126);
                    if (z13) {
                        u11.o(526238149);
                        u0.E.a(u11, a0.r(eVar4, rememberTimeGroupWidth));
                        u11.k();
                        c3969l = u11;
                        eVar3 = eVar4;
                    } else {
                        u11.o(526341255);
                        K1.T bodyControl300XSmall = UniTheme.INSTANCE.getTypography().getBodyControl300XSmall();
                        e r11 = a0.r(eVar4, rememberTimeGroupWidth);
                        Y b11 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
                        int I11 = u11.I();
                        A0 d11 = u11.d();
                        e f7 = c.f(u11, r11);
                        Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                            u11.H(a11);
                        } else {
                            u11.e();
                        }
                        Function2 h11 = Cm.e.h(u11, b11, u11, d11);
                        if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                            a.d(I11, u11, I11, h11);
                        }
                        F1.b(u11, f7, InterfaceC2801g.a.f());
                        String value = rememberThrottledTimeText.getValue();
                        C7807Z c7807z = TokenParserKt.tokenToColor(UniColors.TEXT_LIGHT_KEY.getToken(), u11, 0);
                        eVar3 = eVar4;
                        C2510t.b(value, null, K1.T.c(bodyControl300XSmall, c7807z != null ? c7807z.w() : C7807Z.f72259m, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), null, 0, false, 1, 0, null, u11, 1572864, 442);
                        e h12 = T.h(e.f40358c0, 2, 0.0f, 2);
                        UniColors uniColors = UniColors.GRAPHIC_SECONDARY_ON_DARK;
                        C7807Z c7807z2 = TokenParserKt.tokenToColor(uniColors.getToken(), u11, 0);
                        C2510t.b("/", h12, K1.T.c(bodyControl300XSmall, c7807z2 != null ? c7807z2.w() : C7807Z.f72259m, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), null, 0, false, 1, 0, null, u11, 1572918, 440);
                        C7807Z c7807z3 = TokenParserKt.tokenToColor(uniColors.getToken(), u11, 0);
                        c3969l = u11;
                        C2510t.b(str, null, K1.T.c(bodyControl300XSmall, c7807z3 != null ? c7807z3.w() : C7807Z.f72259m, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), null, 0, false, 1, 0, null, c3969l, 1572864, 442);
                        c3969l.f();
                        c3969l.k();
                    }
                    z15 = z13;
                } else {
                    u11.j();
                    c3969l = u11;
                    eVar3 = eVar2;
                    z15 = z12;
                }
                m02 = c3969l.m0();
                if (m02 != null) {
                    m02.G(new VideoMoleculeControlPanelKt$TimeGroup$2(function0, j11, function1, eVar3, z15, i11, i12));
                    return;
                }
                return;
            }
            z12 = z11;
            i15 = i13;
            if ((i15 & 9363) == 9362) {
            }
            if (i16 != 0) {
            }
            if (i14 != 0) {
            }
            int i172 = i15 & 112;
            int i182 = i15 & 896;
            A1<String> rememberThrottledTimeText2 = rememberThrottledTimeText(function02, j11, function1, u11, i15 & 1022);
            u11.o(986799657);
            z14 = (i182 == 256) | (i172 == 32);
            C11 = u11.C();
            if (!z14) {
            }
            C11 = function1.invoke(Long.valueOf(j11));
            u11.x(C11);
            String str2 = (String) C11;
            u11.k();
            float rememberTimeGroupWidth2 = rememberTimeGroupWidth(j11, function1, u11, (i15 >> 3) & 126);
            if (z13) {
            }
            z15 = z13;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 16;
        if (i14 == 0) {
        }
        z12 = z11;
        i15 = i13;
        if ((i15 & 9363) == 9362) {
        }
        if (i16 != 0) {
        }
        if (i14 != 0) {
        }
        int i1722 = i15 & 112;
        int i1822 = i15 & 896;
        A1<String> rememberThrottledTimeText22 = rememberThrottledTimeText(function02, j11, function1, u11, i15 & 1022);
        u11.o(986799657);
        z14 = (i1822 == 256) | (i1722 == 32);
        C11 = u11.C();
        if (!z14) {
        }
        C11 = function1.invoke(Long.valueOf(j11));
        u11.x(C11);
        String str22 = (String) C11;
        u11.k();
        float rememberTimeGroupWidth22 = rememberTimeGroupWidth(j11, function1, u11, (i15 >> 3) & 126);
        if (z13) {
        }
        z15 = z13;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VideoMoleculeControlPanel(@NotNull VideoMoleculeControlPanelState state, @NotNull Function1<? super VideoMoleculeIntent, Unit> onIntent, e eVar, p<? super VideoMoleculePlayPauseState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar, t<? super SlimTimeBarState, ? super e, ? super SlimTimeBarStyle, ? super SlimTimeBarBehavior, ? super Function1<? super Long, Unit>, ? super Function1<? super Long, Unit>, ? super Function2<? super Long, ? super Boolean, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> tVar, p<? super Boolean, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar2, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        p<? super VideoMoleculePlayPauseState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar3;
        int i15;
        t<? super SlimTimeBarState, ? super e, ? super SlimTimeBarStyle, ? super SlimTimeBarBehavior, ? super Function1<? super Long, Unit>, ? super Function1<? super Long, Unit>, ? super Function2<? super Long, ? super Boolean, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> tVar2;
        int i16;
        p<? super Boolean, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar4;
        SlimTimeBarStyle fullStyle;
        boolean p11;
        Object C11;
        t<? super SlimTimeBarState, ? super e, ? super SlimTimeBarStyle, ? super SlimTimeBarBehavior, ? super Function1<? super Long, Unit>, ? super Function1<? super Long, Unit>, ? super Function2<? super Long, ? super Boolean, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> tVar3;
        p<? super VideoMoleculePlayPauseState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar5;
        p<? super Boolean, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar6;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onIntent, "onIntent");
        C3969l u11 = interfaceC3967k.u(-2134470307);
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
            i13 |= u11.F(onIntent) ? 32 : 16;
        }
        int i17 = i12 & 4;
        if (i17 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                pVar3 = pVar;
                i13 |= u11.F(pVar3) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                i15 = i12 & 16;
                if (i15 != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    tVar2 = tVar;
                    i13 |= u11.F(tVar2) ? 16384 : 8192;
                    i16 = i12 & 32;
                    if (i16 == 0) {
                        i13 |= 196608;
                    } else if ((196608 & i11) == 0) {
                        pVar4 = pVar2;
                        i13 |= u11.F(pVar4) ? 131072 : 65536;
                        if ((74899 & i13) == 74898 || !u11.b()) {
                            e eVar4 = i17 != 0 ? e.f40358c0 : eVar2;
                            p<? super VideoMoleculePlayPauseState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> m1550getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease = i14 != 0 ? ComposableSingletons$VideoMoleculeControlPanelKt.INSTANCE.m1550getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease() : pVar3;
                            if (i15 != 0) {
                                tVar2 = ComposableSingletons$VideoMoleculeControlPanelKt.INSTANCE.m1551getLambda2$videomoleculecompose_prodGoogleAllVendorsRelease();
                            }
                            p<? super Boolean, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> m1552getLambda3$videomoleculecompose_prodGoogleAllVendorsRelease = i16 != 0 ? ComposableSingletons$VideoMoleculeControlPanelKt.INSTANCE.m1552getLambda3$videomoleculecompose_prodGoogleAllVendorsRelease() : pVar4;
                            boolean z11 = ((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).orientation == 2;
                            if (state.getIsCompact()) {
                                u11.o(1961378880);
                                fullStyle = SlimTimeBarDefaults.INSTANCE.compactStyle(null, u11, 48, 1);
                                u11.k();
                            } else if (z11) {
                                u11.o(1961381170);
                                fullStyle = SlimTimeBarStyle.m1568copyB6KfgwU$default(SlimTimeBarDefaults.INSTANCE.fullStyle(null, u11, 48, 1), null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, SlimTimeBarGravity.Center, 127, null);
                                u11.k();
                            } else {
                                u11.o(1961384381);
                                fullStyle = SlimTimeBarDefaults.INSTANCE.fullStyle(null, u11, 48, 1);
                                u11.k();
                            }
                            boolean isCompact = state.getIsCompact();
                            u11.o(1961385858);
                            p11 = u11.p(isCompact);
                            C11 = u11.C();
                            if (!p11 || C11 == InterfaceC3967k.a.a()) {
                                C11 = state.getIsCompact() ? new SlimTimeBarBehavior(false, true, false, 4, null) : new SlimTimeBarBehavior(true, false, false, 6, null);
                                u11.x(C11);
                            }
                            u11.k();
                            p<? super VideoMoleculePlayPauseState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar7 = m1550getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease;
                            SlimTimeBarStyle slimTimeBarStyle = fullStyle;
                            e eVar5 = eVar4;
                            t<? super SlimTimeBarState, ? super e, ? super SlimTimeBarStyle, ? super SlimTimeBarBehavior, ? super Function1<? super Long, Unit>, ? super Function1<? super Long, Unit>, ? super Function2<? super Long, ? super Boolean, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> tVar4 = tVar2;
                            C3996z.a(VideoMoleculeControlPanelDefaultsKt.getLocalControlPanelLandscape().c(Boolean.valueOf(z11)), a1.c.c(-323521379, new VideoMoleculeControlPanelKt$VideoMoleculeControlPanel$1(state, eVar5, tVar4, slimTimeBarStyle, (SlimTimeBarBehavior) C11, rememberControlPanelActions(state.getIsFinished(), state.getIsFullscreen(), onIntent, u11, (i13 << 3) & 896), z11, pVar7, m1552getLambda3$videomoleculecompose_prodGoogleAllVendorsRelease), u11), u11, 56);
                            tVar3 = tVar4;
                            pVar5 = pVar7;
                            pVar6 = m1552getLambda3$videomoleculecompose_prodGoogleAllVendorsRelease;
                            eVar3 = eVar5;
                        } else {
                            u11.j();
                            eVar3 = eVar2;
                            pVar5 = pVar3;
                            tVar3 = tVar2;
                            pVar6 = pVar4;
                        }
                        m02 = u11.m0();
                        if (m02 != null) {
                            m02.G(new VideoMoleculeControlPanelKt$VideoMoleculeControlPanel$2(state, onIntent, eVar3, pVar5, tVar3, pVar6, i11, i12));
                            return;
                        }
                        return;
                    }
                    pVar4 = pVar2;
                    if ((74899 & i13) == 74898) {
                    }
                    if (i17 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).orientation == 2) {
                    }
                    if (state.getIsCompact()) {
                    }
                    boolean isCompact2 = state.getIsCompact();
                    u11.o(1961385858);
                    p11 = u11.p(isCompact2);
                    C11 = u11.C();
                    if (!p11) {
                    }
                    if (state.getIsCompact()) {
                    }
                    u11.x(C11);
                    u11.k();
                    p<? super VideoMoleculePlayPauseState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar72 = m1550getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease;
                    SlimTimeBarStyle slimTimeBarStyle2 = fullStyle;
                    e eVar52 = eVar4;
                    t<? super SlimTimeBarState, ? super e, ? super SlimTimeBarStyle, ? super SlimTimeBarBehavior, ? super Function1<? super Long, Unit>, ? super Function1<? super Long, Unit>, ? super Function2<? super Long, ? super Boolean, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> tVar42 = tVar2;
                    C3996z.a(VideoMoleculeControlPanelDefaultsKt.getLocalControlPanelLandscape().c(Boolean.valueOf(z11)), a1.c.c(-323521379, new VideoMoleculeControlPanelKt$VideoMoleculeControlPanel$1(state, eVar52, tVar42, slimTimeBarStyle2, (SlimTimeBarBehavior) C11, rememberControlPanelActions(state.getIsFinished(), state.getIsFullscreen(), onIntent, u11, (i13 << 3) & 896), z11, pVar72, m1552getLambda3$videomoleculecompose_prodGoogleAllVendorsRelease), u11), u11, 56);
                    tVar3 = tVar42;
                    pVar5 = pVar72;
                    pVar6 = m1552getLambda3$videomoleculecompose_prodGoogleAllVendorsRelease;
                    eVar3 = eVar52;
                    m02 = u11.m0();
                    if (m02 != null) {
                    }
                }
                tVar2 = tVar;
                i16 = i12 & 32;
                if (i16 == 0) {
                }
                pVar4 = pVar2;
                if ((74899 & i13) == 74898) {
                }
                if (i17 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).orientation == 2) {
                }
                if (state.getIsCompact()) {
                }
                boolean isCompact22 = state.getIsCompact();
                u11.o(1961385858);
                p11 = u11.p(isCompact22);
                C11 = u11.C();
                if (!p11) {
                }
                if (state.getIsCompact()) {
                }
                u11.x(C11);
                u11.k();
                p<? super VideoMoleculePlayPauseState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar722 = m1550getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease;
                SlimTimeBarStyle slimTimeBarStyle22 = fullStyle;
                e eVar522 = eVar4;
                t<? super SlimTimeBarState, ? super e, ? super SlimTimeBarStyle, ? super SlimTimeBarBehavior, ? super Function1<? super Long, Unit>, ? super Function1<? super Long, Unit>, ? super Function2<? super Long, ? super Boolean, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> tVar422 = tVar2;
                C3996z.a(VideoMoleculeControlPanelDefaultsKt.getLocalControlPanelLandscape().c(Boolean.valueOf(z11)), a1.c.c(-323521379, new VideoMoleculeControlPanelKt$VideoMoleculeControlPanel$1(state, eVar522, tVar422, slimTimeBarStyle22, (SlimTimeBarBehavior) C11, rememberControlPanelActions(state.getIsFinished(), state.getIsFullscreen(), onIntent, u11, (i13 << 3) & 896), z11, pVar722, m1552getLambda3$videomoleculecompose_prodGoogleAllVendorsRelease), u11), u11, 56);
                tVar3 = tVar422;
                pVar5 = pVar722;
                pVar6 = m1552getLambda3$videomoleculecompose_prodGoogleAllVendorsRelease;
                eVar3 = eVar522;
                m02 = u11.m0();
                if (m02 != null) {
                }
            }
            pVar3 = pVar;
            i15 = i12 & 16;
            if (i15 != 0) {
            }
            tVar2 = tVar;
            i16 = i12 & 32;
            if (i16 == 0) {
            }
            pVar4 = pVar2;
            if ((74899 & i13) == 74898) {
            }
            if (i17 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).orientation == 2) {
            }
            if (state.getIsCompact()) {
            }
            boolean isCompact222 = state.getIsCompact();
            u11.o(1961385858);
            p11 = u11.p(isCompact222);
            C11 = u11.C();
            if (!p11) {
            }
            if (state.getIsCompact()) {
            }
            u11.x(C11);
            u11.k();
            p<? super VideoMoleculePlayPauseState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar7222 = m1550getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease;
            SlimTimeBarStyle slimTimeBarStyle222 = fullStyle;
            e eVar5222 = eVar4;
            t<? super SlimTimeBarState, ? super e, ? super SlimTimeBarStyle, ? super SlimTimeBarBehavior, ? super Function1<? super Long, Unit>, ? super Function1<? super Long, Unit>, ? super Function2<? super Long, ? super Boolean, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> tVar4222 = tVar2;
            C3996z.a(VideoMoleculeControlPanelDefaultsKt.getLocalControlPanelLandscape().c(Boolean.valueOf(z11)), a1.c.c(-323521379, new VideoMoleculeControlPanelKt$VideoMoleculeControlPanel$1(state, eVar5222, tVar4222, slimTimeBarStyle222, (SlimTimeBarBehavior) C11, rememberControlPanelActions(state.getIsFinished(), state.getIsFullscreen(), onIntent, u11, (i13 << 3) & 896), z11, pVar7222, m1552getLambda3$videomoleculecompose_prodGoogleAllVendorsRelease), u11), u11, 56);
            tVar3 = tVar4222;
            pVar5 = pVar7222;
            pVar6 = m1552getLambda3$videomoleculecompose_prodGoogleAllVendorsRelease;
            eVar3 = eVar5222;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        pVar3 = pVar;
        i15 = i12 & 16;
        if (i15 != 0) {
        }
        tVar2 = tVar;
        i16 = i12 & 32;
        if (i16 == 0) {
        }
        pVar4 = pVar2;
        if ((74899 & i13) == 74898) {
        }
        if (i17 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).orientation == 2) {
        }
        if (state.getIsCompact()) {
        }
        boolean isCompact2222 = state.getIsCompact();
        u11.o(1961385858);
        p11 = u11.p(isCompact2222);
        C11 = u11.C();
        if (!p11) {
        }
        if (state.getIsCompact()) {
        }
        u11.x(C11);
        u11.k();
        p<? super VideoMoleculePlayPauseState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar72222 = m1550getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease;
        SlimTimeBarStyle slimTimeBarStyle2222 = fullStyle;
        e eVar52222 = eVar4;
        t<? super SlimTimeBarState, ? super e, ? super SlimTimeBarStyle, ? super SlimTimeBarBehavior, ? super Function1<? super Long, Unit>, ? super Function1<? super Long, Unit>, ? super Function2<? super Long, ? super Boolean, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> tVar42222 = tVar2;
        C3996z.a(VideoMoleculeControlPanelDefaultsKt.getLocalControlPanelLandscape().c(Boolean.valueOf(z11)), a1.c.c(-323521379, new VideoMoleculeControlPanelKt$VideoMoleculeControlPanel$1(state, eVar52222, tVar42222, slimTimeBarStyle2222, (SlimTimeBarBehavior) C11, rememberControlPanelActions(state.getIsFinished(), state.getIsFullscreen(), onIntent, u11, (i13 << 3) & 896), z11, pVar72222, m1552getLambda3$videomoleculecompose_prodGoogleAllVendorsRelease), u11), u11, 56);
        tVar3 = tVar42222;
        pVar5 = pVar72222;
        pVar6 = m1552getLambda3$videomoleculecompose_prodGoogleAllVendorsRelease;
        eVar3 = eVar52222;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    private static final int defaultNumericTimeUpperBoundWidth(long j11, int i11, int i12) {
        if (j11 < 0) {
            j11 = 0;
        }
        long j12 = j11 / 1000;
        if (j12 < 3600) {
            return (i11 * 4) + i12;
        }
        return (i12 * 2) + ((String.valueOf(j12 / 3600).length() + 4) * i11);
    }

    private static final ControlPanelActions rememberControlPanelActions(boolean z11, boolean z12, Function1<? super VideoMoleculeIntent, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(-568432726);
        InterfaceC3978p0 l11 = n1.l(Boolean.valueOf(z11), interfaceC3967k);
        InterfaceC3978p0 l12 = n1.l(Boolean.valueOf(z12), interfaceC3967k);
        InterfaceC3978p0 l13 = n1.l(function1, interfaceC3967k);
        interfaceC3967k.o(1290926423);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            ControlPanelActions controlPanelActions = new ControlPanelActions(new VideoMoleculeControlPanelKt$rememberControlPanelActions$1$1(l13, l11), new VideoMoleculeControlPanelKt$rememberControlPanelActions$1$2(l13, l12), new VideoMoleculeControlPanelKt$rememberControlPanelActions$1$3(l13), new VideoMoleculeControlPanelKt$rememberControlPanelActions$1$4(l13), new VideoMoleculeControlPanelKt$rememberControlPanelActions$1$5(l13));
            interfaceC3967k.x(controlPanelActions);
            C11 = controlPanelActions;
        }
        ControlPanelActions controlPanelActions2 = (ControlPanelActions) C11;
        interfaceC3967k.k();
        interfaceC3967k.k();
        return controlPanelActions2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberControlPanelActions$lambda$13(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberControlPanelActions$lambda$14(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<VideoMoleculeIntent, Unit> rememberControlPanelActions$lambda$15(A1<? extends Function1<? super VideoMoleculeIntent, Unit>> a12) {
        return (Function1) a12.getValue();
    }

    private static final A1<String> rememberThrottledTimeText(Function0<Long> function0, long j11, Function1<? super Long, String> function1, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(-1639618771);
        interfaceC3967k.o(1273240296);
        boolean z11 = ((((i11 & 14) ^ 6) > 4 && interfaceC3967k.n(function0)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && interfaceC3967k.s(j11)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && interfaceC3967k.n(function1)) || (i11 & 384) == 256);
        Object C11 = interfaceC3967k.C();
        if (z11 || C11 == InterfaceC3967k.a.a()) {
            C11 = n1.e(new VideoMoleculeControlPanelKt$rememberThrottledTimeText$1$1(function1, function0, j11));
            interfaceC3967k.x(C11);
        }
        A1<String> a12 = (A1) C11;
        interfaceC3967k.k();
        interfaceC3967k.k();
        return a12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        if (r11 == S0.InterfaceC3967k.a.a()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final float rememberTimeGroupWidth(long j11, Function1<? super Long, String> function1, InterfaceC3967k interfaceC3967k, int i11) {
        boolean z11;
        long j12;
        long j13;
        Object obj;
        interfaceC3967k.o(-598720116);
        M a11 = N.a(interfaceC3967k);
        d dVar = (d) interfaceC3967k.m(K0.e());
        K1.T bodyControl300XSmall = UniTheme.INSTANCE.getTypography().getBodyControl300XSmall();
        interfaceC3967k.o(2074843868);
        boolean n11 = ((((i11 & 14) ^ 6) > 4 && interfaceC3967k.s(j11)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && interfaceC3967k.n(function1)) || (i11 & 48) == 32) | interfaceC3967k.n(dVar) | interfaceC3967k.n(a11) | interfaceC3967k.n(bodyControl300XSmall);
        Object C11 = interfaceC3967k.C();
        if (!n11) {
            obj = C11;
        }
        if (j11 < 0) {
            z11 = 32;
            j12 = 0;
            j13 = 0;
        } else {
            z11 = 32;
            j12 = 0;
            j13 = j11;
        }
        String invoke = function1.invoke(Long.valueOf(j11));
        C7665d it = new IntRange(0, 9, 1).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        d dVar2 = null;
        boolean z12 = z11;
        int A11 = (int) (M.a(a11, String.valueOf(it.b()), bodyControl300XSmall, null, 1020).A() >> (z12 ? 1L : 0L));
        while (it.hasNext()) {
            int A12 = (int) (M.a(a11, String.valueOf(it.b()), bodyControl300XSmall, dVar2, 1020).A() >> (z12 ? 1L : 0L));
            if (A11 < A12) {
                A11 = A12;
            }
            dVar2 = null;
        }
        Object valueOf = Integer.valueOf(dVar.Y0(4) + Math.max(defaultNumericTimeUpperBoundWidth(j13, A11, (int) (M.a(a11, ProductContainerDTO.RATIO_DELIMITER, bodyControl300XSmall, null, 1020).A() >> (z12 ? 1L : 0L))), Math.max((int) (M.a(a11, function1.invoke(Long.valueOf(j12)), bodyControl300XSmall, null, 1020).A() >> (z12 ? 1L : 0L)), (int) (M.a(a11, function1.invoke(Long.valueOf(j13)), bodyControl300XSmall, null, 1020).A() >> (z12 ? 1L : 0L)))) + ((int) (M.a(a11, invoke, bodyControl300XSmall, null, 1020).A() >> (z12 ? 1L : 0L))) + ((int) (M.a(a11, "/", bodyControl300XSmall, null, 1020).A() >> (z12 ? 1L : 0L))));
        interfaceC3967k.x(valueOf);
        obj = valueOf;
        int intValue = ((Number) obj).intValue();
        interfaceC3967k.k();
        float B11 = dVar.B(intValue);
        interfaceC3967k.k();
        return B11;
    }
}
