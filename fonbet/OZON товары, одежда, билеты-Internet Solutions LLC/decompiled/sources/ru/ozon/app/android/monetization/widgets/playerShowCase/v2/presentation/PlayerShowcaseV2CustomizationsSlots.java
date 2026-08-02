package ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.C3332q;
import J0.I1;
import J0.u3;
import K00.b;
import P1.F;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S0.n1;
import T7.E;
import U7.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.recyclerview.widget.m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.C7811b0;
import l1.y0;
import n0.C8385f;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.videomoleculecompose.intent.VideoMoleculeIntent;
import ru.ozon.app.android.videomoleculecompose.slots.centeraction.VideoMoleculeCenterActionState;
import ru.ozon.app.android.videomoleculecompose.slots.controlpanel.VideoMoleculeControlPanelState;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarBehavior;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarColors;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarDefaults;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarKt;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarState;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarStyle;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\fJ/\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00142\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u0015j\u0002`\u00172\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJC\u0010\u001f\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00102\u0006\u0010\u001d\u001a\u00020\u001b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u00152\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b#\u0010$J7\u0010'\u001a\u00020\b2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020!2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b'\u0010(J}\u00103\u001a\u00020\b2\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020-2\u0014\b\u0002\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u00152\u0014\b\u0002\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u00152\u001a\b\u0002\u00102\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b01H\u0007¢\u0006\u0004\b3\u00104J/\u00106\u001a\u00020\b2\u0006\u00105\u001a\u00020!2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b6\u00107¨\u00069²\u0006\f\u00108\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/monetization/widgets/playerShowCase/v2/presentation/PlayerShowcaseV2CustomizationsSlots;", "", "<init>", "()V", "", "text", "Landroidx/compose/ui/e;", "modifier", "", "CustomizationLabel", "(Ljava/lang/String;Landroidx/compose/ui/e;LS0/k;II)V", "CustomizationGradientOverlay", "(Landroidx/compose/ui/e;LS0/k;II)V", "CustomizationHostOverlay", "Lru/ozon/app/android/videomoleculecompose/slots/centeraction/VideoMoleculeCenterActionState;", "state", "Lkotlin/Function0;", "onClick", "CustomizationCenterActionOverlay", "(Lru/ozon/app/android/videomoleculecompose/slots/centeraction/VideoMoleculeCenterActionState;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function0;LS0/k;II)V", "Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/VideoMoleculeControlPanelState;", "Lkotlin/Function1;", "Lru/ozon/app/android/videomoleculecompose/intent/VideoMoleculeIntent;", "Lru/ozon/app/android/videomoleculecompose/intent/VideoMoleculeIntentHandler;", "onIntent", "CustomizationControlPanel", "(Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/VideoMoleculeControlPanelState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "", "positionMsProvider", "durationMs", "timeFormatter", "CustomizationTimeGroup", "(Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "", "isBuffering", "CustomizationBuffering", "(ZLandroidx/compose/ui/e;LS0/k;II)V", "showPlay", "enabled", "CustomizationPlayPause", "(ZZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/e;LS0/k;II)V", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarState;", "slotState", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarStyle;", "style", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarBehavior;", "behavior", "onStart", "onMove", "Lkotlin/Function2;", "onEnd", "CustomizationTimeBar", "(Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarState;Landroidx/compose/ui/e;Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarStyle;Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarBehavior;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "isFullscreen", "CustomizationModeButton", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/e;LS0/k;II)V", "currentTimeText", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PlayerShowcaseV2CustomizationsSlots {

    @NotNull
    public static final PlayerShowcaseV2CustomizationsSlots INSTANCE = new PlayerShowcaseV2CustomizationsSlots();

    private PlayerShowcaseV2CustomizationsSlots() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CustomizationLabel(String str, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        String str2;
        int i13;
        e eVar2;
        long j11;
        e b11;
        long j12;
        F f7;
        C3969l c3969l;
        e eVar3;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(1833672708);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
            str2 = str;
        } else if ((i11 & 6) == 0) {
            str2 = str;
            i13 = i11 | (u11.n(str2) ? 4 : 2);
        } else {
            str2 = str;
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i13 & 19) == 18 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                j11 = C7807Z.f72248b;
                b11 = androidx.compose.foundation.e.b(eVar4, C7807Z.o(0.75f, j11), y0.a());
                e g10 = T.g(b11, 6, 2);
                int i15 = i13;
                j12 = C7807Z.f72251e;
                f7 = F.f21512j;
                c3969l = u11;
                u3.b(str2, g10, j12, 0L, f7, 0L, null, 0L, 0, false, 0, 0, null, null, c3969l, (i15 & 14) | 196992, 0, 131032);
                eVar3 = eVar4;
            } else {
                u11.j();
                c3969l = u11;
                eVar3 = eVar2;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new PlayerShowcaseV2CustomizationsSlots$CustomizationLabel$1(this, str, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 19) == 18) {
        }
        if (i14 == 0) {
        }
        j11 = C7807Z.f72248b;
        b11 = androidx.compose.foundation.e.b(eVar4, C7807Z.o(0.75f, j11), y0.a());
        e g102 = T.g(b11, 6, 2);
        int i152 = i13;
        j12 = C7807Z.f72251e;
        f7 = F.f21512j;
        c3969l = u11;
        u3.b(str2, g102, j12, 0L, f7, 0L, null, 0L, 0, false, 0, 0, null, null, c3969l, (i152 & 14) | 196992, 0, 131032);
        eVar3 = eVar4;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    private static final String CustomizationTimeGroup$lambda$11(A1<String> a12) {
        return a12.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CustomizationBuffering(boolean z11, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        e b11;
        long j11;
        C3969l c3969l;
        long j12;
        F f7;
        C3969l u11 = interfaceC3967k.u(-1547463753);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = i11 | (u11.p(z11) ? 4 : 2);
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i13 & 19) == 18 || !u11.b()) {
                if (i14 != 0) {
                    eVar2 = e.f40358c0;
                }
                if (z11) {
                    J0 m02 = u11.m0();
                    if (m02 != null) {
                        m02.G(new PlayerShowcaseV2CustomizationsSlots$CustomizationBuffering$1(this, z11, eVar2, i11, i12));
                        return;
                    }
                    return;
                }
                e eVar3 = eVar2;
                b11 = androidx.compose.foundation.e.b(eVar3, C7811b0.c(2281760255L), y0.a());
                V f11 = C5185h.f(InterfaceC6250b.a.e(), false);
                int I11 = u11.I();
                A0 d11 = u11.d();
                e f12 = c.f(u11, b11);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.H(a11);
                } else {
                    u11.e();
                }
                Function2 f13 = E.f(u11, f11, u11, d11);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, f13);
                }
                F1.b(u11, f12, InterfaceC2801g.a.f());
                d.a g10 = InterfaceC6250b.a.g();
                e.a aVar = e.f40358c0;
                C5194q a12 = C5193p.a(C5179b.g(), g10, u11, 48);
                int I12 = u11.I();
                A0 d12 = u11.d();
                e f14 = c.f(u11, aVar);
                Function0 a13 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a13);
                } else {
                    u11.e();
                }
                Function2 g11 = b.g(u11, a12, u11, d12);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, g11);
                }
                F1.b(u11, f14, InterfaceC2801g.a.f());
                j11 = C7807Z.f72255i;
                I1.a(null, j11, 0.0f, 0L, 0, u11, 48, 29);
                c3969l = u11;
                j12 = C7807Z.f72248b;
                f7 = F.f21512j;
                u3.b("CUSTOM BUFFERING", null, j12, 0L, f7, 0L, null, 0L, 0, false, 0, 0, null, null, c3969l, 196998, 0, 131034);
                c3969l.f();
                c3969l.f();
                eVar2 = eVar3;
            } else {
                u11.j();
                c3969l = u11;
            }
            J0 m03 = c3969l.m0();
            if (m03 != null) {
                m03.G(new PlayerShowcaseV2CustomizationsSlots$CustomizationBuffering$3(this, z11, eVar2, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 19) == 18) {
        }
        if (i14 != 0) {
        }
        if (z11) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CustomizationCenterActionOverlay(@NotNull VideoMoleculeCenterActionState state, e eVar, @NotNull Function0<Unit> onClick, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int I11;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(292971483);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                i13 |= u11.F(onClick) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i13 & 147) == 146 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f11 = c.f(u11, eVar4);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a11);
                }
                Function2 f12 = E.f(u11, f7, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, f12);
                }
                F1.b(u11, f11, InterfaceC2801g.a.f());
                C3332q.a(onClick, null, false, null, null, null, null, a1.c.c(2112938449, new PlayerShowcaseV2CustomizationsSlots$CustomizationCenterActionOverlay$1$1(state), u11), u11, ((i13 >> 6) & 14) | 805306368, 510);
                u11.f();
                eVar3 = eVar4;
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new PlayerShowcaseV2CustomizationsSlots$CustomizationCenterActionOverlay$2(this, state, eVar3, onClick, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i12 & 4) == 0) {
        }
        if ((i13 & 147) == 146) {
        }
        if (i14 == 0) {
        }
        V f72 = C5185h.f(InterfaceC6250b.a.e(), false);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f112 = c.f(u11, eVar4);
        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f122 = E.f(u11, f72, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f122);
        F1.b(u11, f112, InterfaceC2801g.a.f());
        C3332q.a(onClick, null, false, null, null, null, null, a1.c.c(2112938449, new PlayerShowcaseV2CustomizationsSlots$CustomizationCenterActionOverlay$1$1(state), u11), u11, ((i13 >> 6) & 14) | 805306368, 510);
        u11.f();
        eVar3 = eVar4;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CustomizationControlPanel(@NotNull VideoMoleculeControlPanelState state, @NotNull Function1<? super VideoMoleculeIntent, Unit> onIntent, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        e b11;
        int I11;
        long j11;
        F f7;
        long j12;
        long j13;
        long j14;
        long j15;
        boolean z11;
        Object C11;
        boolean z12;
        Object C12;
        boolean z13;
        Object C13;
        int I12;
        boolean z14;
        Object C14;
        boolean z15;
        Object C15;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onIntent, "onIntent");
        C3969l u11 = interfaceC3967k.u(-740905332);
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
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i13 & 147) == 146 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                b11 = androidx.compose.foundation.e.b(a0.e(eVar4, 1.0f), C7811b0.c(3428974826L), y0.a());
                e f11 = T.f(b11, 8);
                C5194q a11 = C5193p.a(C5179b.n(4), InterfaceC6250b.a.k(), u11, 6);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f12 = c.f(u11, f11);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 g10 = b.g(u11, a11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, g10);
                }
                F1.b(u11, f12, InterfaceC2801g.a.f());
                j11 = C7807Z.f72251e;
                f7 = F.f21512j;
                int i15 = i13;
                u3.b("CUSTOM CONTROL PANEL", null, j11, 0L, f7, 0L, null, 0L, 0, false, 0, 0, null, null, u11, 196998, 0, 131034);
                SlimTimeBarState timeline = state.getTimeline();
                SlimTimeBarDefaults slimTimeBarDefaults = SlimTimeBarDefaults.INSTANCE;
                j12 = C7807Z.f72255i;
                j13 = C7807Z.f72256j;
                long o11 = C7807Z.o(0.5f, j13);
                j14 = C7807Z.f72257k;
                long o12 = C7807Z.o(0.5f, j14);
                j15 = C7807Z.f72256j;
                SlimTimeBarStyle fullStyle = slimTimeBarDefaults.fullStyle(new SlimTimeBarColors(j12, o11, o12, j15, null), u11, (SlimTimeBarDefaults.$stable << 3) | 6, 0);
                SlimTimeBarBehavior slimTimeBarBehavior = new SlimTimeBarBehavior(true, false, false, 6, null);
                u11.o(1902630659);
                int i16 = i15 & 112;
                z11 = i16 != 32;
                C11 = u11.C();
                if (!z11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new PlayerShowcaseV2CustomizationsSlots$CustomizationControlPanel$1$1$1(onIntent);
                    u11.x(C11);
                }
                Function1 function1 = (Function1) C11;
                u11.k();
                u11.o(1902633218);
                z12 = i16 != 32;
                C12 = u11.C();
                if (!z12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new PlayerShowcaseV2CustomizationsSlots$CustomizationControlPanel$1$2$1(onIntent);
                    u11.x(C12);
                }
                Function1 function12 = (Function1) C12;
                u11.k();
                u11.o(1902635791);
                z13 = i16 != 32;
                C13 = u11.C();
                if (!z13 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new PlayerShowcaseV2CustomizationsSlots$CustomizationControlPanel$1$3$1(onIntent);
                    u11.x(C13);
                }
                u11.k();
                SlimTimeBarKt.SlimTimeBar(timeline, null, fullStyle, slimTimeBarBehavior, function1, function12, (Function2) C13, u11, 3072, 2);
                u11 = u11;
                u11.o(1902640898);
                if (!state.getIsScrubbing()) {
                    PlayerShowcaseV2CustomizationsSlots playerShowcaseV2CustomizationsSlots = INSTANCE;
                    Function0<Long> positionMsProvider = state.getTimeline().getPositionMsProvider();
                    long durationMs = state.getTimeline().getDurationMs();
                    Function1<Long, String> timeFormatter = state.getTimeFormatter();
                    e.a aVar = e.f40358c0;
                    playerShowcaseV2CustomizationsSlots.CustomizationTimeGroup(positionMsProvider, durationMs, timeFormatter, new HorizontalAlignElement(InterfaceC6250b.a.g()), u11, 24576, 0);
                    u11 = u11;
                }
                u11.k();
                e e11 = a0.e(e.f40358c0, 1.0f);
                Y b12 = X.b(C5179b.d(), InterfaceC6250b.a.i(), u11, 54);
                I12 = u11.I();
                A0 d12 = u11.d();
                e f13 = c.f(u11, e11);
                Function0 a13 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a13);
                }
                Function2 h11 = Cm.e.h(u11, b12, u11, d12);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, h11);
                }
                i.b(u11, f13, -1037431813);
                int i17 = i15 & 14;
                z14 = (i17 != 4) | (i16 != 32);
                C14 = u11.C();
                if (!z14 || C14 == InterfaceC3967k.a.a()) {
                    C14 = new PlayerShowcaseV2CustomizationsSlots$CustomizationControlPanel$1$4$1$1(onIntent, state);
                    u11.x(C14);
                }
                u11.k();
                C3332q.a((Function0) C14, null, state.getPlayPause().getIsEnabled(), null, null, null, null, a1.c.c(1121560322, new PlayerShowcaseV2CustomizationsSlots$CustomizationControlPanel$1$4$2(state), u11), u11, 805306368, 506);
                u11.o(-1037413787);
                z15 = (i16 != 32) | (i17 != 4);
                C15 = u11.C();
                if (!z15 || C15 == InterfaceC3967k.a.a()) {
                    C15 = new PlayerShowcaseV2CustomizationsSlots$CustomizationControlPanel$1$4$3$1(onIntent, state);
                    u11.x(C15);
                }
                u11.k();
                C3332q.a((Function0) C15, null, false, null, null, null, null, a1.c.c(-1055965333, new PlayerShowcaseV2CustomizationsSlots$CustomizationControlPanel$1$4$4(state), u11), u11, 805306368, 510);
                u11.f();
                u11.f();
                eVar3 = eVar4;
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new PlayerShowcaseV2CustomizationsSlots$CustomizationControlPanel$2(this, state, onIntent, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 147) == 146) {
        }
        if (i14 == 0) {
        }
        b11 = androidx.compose.foundation.e.b(a0.e(eVar4, 1.0f), C7811b0.c(3428974826L), y0.a());
        e f112 = T.f(b11, 8);
        C5194q a112 = C5193p.a(C5179b.n(4), InterfaceC6250b.a.k(), u11, 6);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f122 = c.f(u11, f112);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g102 = b.g(u11, a112, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g102);
        F1.b(u11, f122, InterfaceC2801g.a.f());
        j11 = C7807Z.f72251e;
        f7 = F.f21512j;
        int i152 = i13;
        u3.b("CUSTOM CONTROL PANEL", null, j11, 0L, f7, 0L, null, 0L, 0, false, 0, 0, null, null, u11, 196998, 0, 131034);
        SlimTimeBarState timeline2 = state.getTimeline();
        SlimTimeBarDefaults slimTimeBarDefaults2 = SlimTimeBarDefaults.INSTANCE;
        j12 = C7807Z.f72255i;
        j13 = C7807Z.f72256j;
        long o112 = C7807Z.o(0.5f, j13);
        j14 = C7807Z.f72257k;
        long o122 = C7807Z.o(0.5f, j14);
        j15 = C7807Z.f72256j;
        SlimTimeBarStyle fullStyle2 = slimTimeBarDefaults2.fullStyle(new SlimTimeBarColors(j12, o112, o122, j15, null), u11, (SlimTimeBarDefaults.$stable << 3) | 6, 0);
        SlimTimeBarBehavior slimTimeBarBehavior2 = new SlimTimeBarBehavior(true, false, false, 6, null);
        u11.o(1902630659);
        int i162 = i152 & 112;
        if (i162 != 32) {
        }
        C11 = u11.C();
        if (!z11) {
        }
        C11 = new PlayerShowcaseV2CustomizationsSlots$CustomizationControlPanel$1$1$1(onIntent);
        u11.x(C11);
        Function1 function13 = (Function1) C11;
        u11.k();
        u11.o(1902633218);
        if (i162 != 32) {
        }
        C12 = u11.C();
        if (!z12) {
        }
        C12 = new PlayerShowcaseV2CustomizationsSlots$CustomizationControlPanel$1$2$1(onIntent);
        u11.x(C12);
        Function1 function122 = (Function1) C12;
        u11.k();
        u11.o(1902635791);
        if (i162 != 32) {
        }
        C13 = u11.C();
        if (!z13) {
        }
        C13 = new PlayerShowcaseV2CustomizationsSlots$CustomizationControlPanel$1$3$1(onIntent);
        u11.x(C13);
        u11.k();
        SlimTimeBarKt.SlimTimeBar(timeline2, null, fullStyle2, slimTimeBarBehavior2, function13, function122, (Function2) C13, u11, 3072, 2);
        u11 = u11;
        u11.o(1902640898);
        if (!state.getIsScrubbing()) {
        }
        u11.k();
        e e112 = a0.e(e.f40358c0, 1.0f);
        Y b122 = X.b(C5179b.d(), InterfaceC6250b.a.i(), u11, 54);
        I12 = u11.I();
        A0 d122 = u11.d();
        e f132 = c.f(u11, e112);
        Function0 a132 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 h112 = Cm.e.h(u11, b122, u11, d122);
        if (!u11.t()) {
        }
        a.d(I12, u11, I12, h112);
        i.b(u11, f132, -1037431813);
        if (i162 != 32) {
        }
        int i172 = i152 & 14;
        z14 = (i172 != 4) | (i162 != 32);
        C14 = u11.C();
        if (!z14) {
        }
        C14 = new PlayerShowcaseV2CustomizationsSlots$CustomizationControlPanel$1$4$1$1(onIntent, state);
        u11.x(C14);
        u11.k();
        C3332q.a((Function0) C14, null, state.getPlayPause().getIsEnabled(), null, null, null, null, a1.c.c(1121560322, new PlayerShowcaseV2CustomizationsSlots$CustomizationControlPanel$1$4$2(state), u11), u11, 805306368, 506);
        u11.o(-1037413787);
        z15 = (i162 != 32) | (i172 != 4);
        C15 = u11.C();
        if (!z15) {
        }
        C15 = new PlayerShowcaseV2CustomizationsSlots$CustomizationControlPanel$1$4$3$1(onIntent, state);
        u11.x(C15);
        u11.k();
        C3332q.a((Function0) C15, null, false, null, null, null, null, a1.c.c(-1055965333, new PlayerShowcaseV2CustomizationsSlots$CustomizationControlPanel$1$4$4(state), u11), u11, 805306368, 510);
        u11.f();
        u11.f();
        eVar3 = eVar4;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    public final void CustomizationGradientOverlay(e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        long j11;
        C3969l u11 = interfaceC3967k.u(1032630649);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i13 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            AbstractC7799Q.a aVar = AbstractC7799Q.Companion;
            C7807Z m11 = C7807Z.m(C7811b0.c(2868838655L));
            j11 = C7807Z.f72258l;
            e a11 = androidx.compose.foundation.e.a(eVar, AbstractC7799Q.a.g(aVar, C7714v.b0(m11, C7807Z.m(j11), C7807Z.m(C7811b0.c(2852185599L)))), null, 6);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, a11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            INSTANCE.CustomizationLabel("CUSTOM GRADIENT", C5187j.f39515a.a(e.f40358c0, InterfaceC6250b.a.o()), u11, 390, 0);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PlayerShowcaseV2CustomizationsSlots$CustomizationGradientOverlay$2(this, eVar, i11, i12));
        }
    }

    public final void CustomizationHostOverlay(e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        long j11;
        e b11;
        C3969l u11 = interfaceC3967k.u(274870657);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i13 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            j11 = C7807Z.f72252f;
            b11 = androidx.compose.foundation.e.b(eVar, C7807Z.o(0.2f, j11), y0.a());
            e c11 = C8385f.c(3, C7811b0.c(4294961979L), b11, h.b(12));
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, c11);
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
            INSTANCE.CustomizationLabel("HOST OVERLAY", C5187j.f39515a.a(e.f40358c0, InterfaceC6250b.a.n()), u11, 390, 0);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PlayerShowcaseV2CustomizationsSlots$CustomizationHostOverlay$2(this, eVar, i11, i12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CustomizationModeButton(boolean z11, @NotNull Function0<Unit> onClick, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int I11;
        long j11;
        F f7;
        C3969l c3969l;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(1741562880);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.p(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(onClick) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i13 & 147) == 146 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                e c11 = androidx.compose.foundation.i.c(androidx.compose.foundation.e.b(eVar4, C7811b0.c(4278248959L), h.b(8)), false, null, null, onClick, 7);
                V f11 = C5185h.f(InterfaceC6250b.a.e(), false);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f12 = c.f(u11, c11);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a11);
                }
                Function2 f13 = E.f(u11, f11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, f13);
                }
                F1.b(u11, f12, InterfaceC2801g.a.f());
                String str = !z11 ? "OUT" : "FULL";
                j11 = C7807Z.f72248b;
                e eVar5 = eVar4;
                f7 = F.f21512j;
                c3969l = u11;
                u3.b(str, null, j11, 0L, f7, 0L, null, 0L, 0, false, 0, 0, null, null, c3969l, 196992, 0, 131034);
                c3969l.f();
                eVar3 = eVar5;
            } else {
                u11.j();
                c3969l = u11;
                eVar3 = eVar2;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new PlayerShowcaseV2CustomizationsSlots$CustomizationModeButton$2(this, z11, onClick, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 147) == 146) {
        }
        if (i14 == 0) {
        }
        e c112 = androidx.compose.foundation.i.c(androidx.compose.foundation.e.b(eVar4, C7811b0.c(4278248959L), h.b(8)), false, null, null, onClick, 7);
        V f112 = C5185h.f(InterfaceC6250b.a.e(), false);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f122 = c.f(u11, c112);
        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f132 = E.f(u11, f112, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f132);
        F1.b(u11, f122, InterfaceC2801g.a.f());
        if (!z11) {
        }
        j11 = C7807Z.f72248b;
        e eVar52 = eVar4;
        f7 = F.f21512j;
        c3969l = u11;
        u3.b(str, null, j11, 0L, f7, 0L, null, 0L, 0, false, 0, 0, null, null, c3969l, 196992, 0, 131034);
        c3969l.f();
        eVar3 = eVar52;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CustomizationPlayPause(boolean z11, boolean z12, @NotNull Function0<Unit> onClick, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        int i14;
        e eVar2;
        int I11;
        long j11;
        F f7;
        C3969l c3969l;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(-231336481);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.p(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.p(z12) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                i13 |= u11.F(onClick) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                eVar2 = eVar;
                i13 |= u11.n(eVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                if ((i13 & 1171) == 1170 || !u11.b()) {
                    e eVar4 = i14 != 0 ? e.f40358c0 : eVar2;
                    e c11 = androidx.compose.foundation.i.c(androidx.compose.foundation.e.b(eVar4, C7811b0.c(4294961979L), h.b(8)), z12, null, null, onClick, 6);
                    V f11 = C5185h.f(InterfaceC6250b.a.e(), false);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    e f12 = c.f(u11, c11);
                    Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a11);
                    } else {
                        u11.e();
                    }
                    Function2 f13 = E.f(u11, f11, u11, d11);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, f13);
                    }
                    F1.b(u11, f12, InterfaceC2801g.a.f());
                    String str = z11 ? "PLAY" : "PAUSE";
                    j11 = C7807Z.f72248b;
                    e eVar5 = eVar4;
                    f7 = F.f21512j;
                    c3969l = u11;
                    u3.b(str, null, j11, 0L, f7, 0L, null, 0L, 0, false, 0, 0, null, null, c3969l, 196992, 0, 131034);
                    c3969l.f();
                    eVar3 = eVar5;
                } else {
                    u11.j();
                    c3969l = u11;
                    eVar3 = eVar2;
                }
                m02 = c3969l.m0();
                if (m02 != null) {
                    m02.G(new PlayerShowcaseV2CustomizationsSlots$CustomizationPlayPause$2(this, z11, z12, onClick, eVar3, i11, i12));
                    return;
                }
                return;
            }
            eVar2 = eVar;
            if ((i13 & 1171) == 1170) {
            }
            if (i14 != 0) {
            }
            e c112 = androidx.compose.foundation.i.c(androidx.compose.foundation.e.b(eVar4, C7811b0.c(4294961979L), h.b(8)), z12, null, null, onClick, 6);
            V f112 = C5185h.f(InterfaceC6250b.a.e(), false);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f122 = c.f(u11, c112);
            Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f132 = E.f(u11, f112, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f132);
            F1.b(u11, f122, InterfaceC2801g.a.f());
            if (z11) {
            }
            j11 = C7807Z.f72248b;
            e eVar52 = eVar4;
            f7 = F.f21512j;
            c3969l = u11;
            u3.b(str, null, j11, 0L, f7, 0L, null, 0L, 0, false, 0, 0, null, null, c3969l, 196992, 0, 131034);
            c3969l.f();
            eVar3 = eVar52;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        if ((i12 & 4) == 0) {
        }
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        eVar2 = eVar;
        if ((i13 & 1171) == 1170) {
        }
        if (i14 != 0) {
        }
        e c1122 = androidx.compose.foundation.i.c(androidx.compose.foundation.e.b(eVar4, C7811b0.c(4294961979L), h.b(8)), z12, null, null, onClick, 6);
        V f1122 = C5185h.f(InterfaceC6250b.a.e(), false);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f1222 = c.f(u11, c1122);
        Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f1322 = E.f(u11, f1122, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f1322);
        F1.b(u11, f1222, InterfaceC2801g.a.f());
        if (z11) {
        }
        j11 = C7807Z.f72248b;
        e eVar522 = eVar4;
        f7 = F.f21512j;
        c3969l = u11;
        u3.b(str, null, j11, 0L, f7, 0L, null, 0L, 0, false, 0, 0, null, null, c3969l, 196992, 0, 131034);
        c3969l.f();
        eVar3 = eVar522;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CustomizationTimeBar(@NotNull SlimTimeBarState slotState, e eVar, SlimTimeBarStyle slimTimeBarStyle, SlimTimeBarBehavior slimTimeBarBehavior, Function1<? super Long, Unit> function1, Function1<? super Long, Unit> function12, Function2<? super Long, ? super Boolean, Unit> function2, InterfaceC3967k interfaceC3967k, int i11, int i12) {
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
        e eVar3;
        int i18;
        Function2<? super Long, ? super Boolean, Unit> function23;
        Function1<? super Long, Unit> function15;
        e eVar4;
        Function2<? super Long, ? super Boolean, Unit> function24;
        C3969l c3969l;
        Function1<? super Long, Unit> function16;
        Function1<? super Long, Unit> function17;
        SlimTimeBarStyle slimTimeBarStyle3;
        SlimTimeBarBehavior slimTimeBarBehavior3;
        int i19;
        Intrinsics.checkNotNullParameter(slotState, "slotState");
        C3969l u11 = interfaceC3967k.u(103843558);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(slotState) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i21 = i12 & 2;
        if (i21 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i11 & 384) != 0) {
                if ((i12 & 4) == 0) {
                    slimTimeBarStyle2 = slimTimeBarStyle;
                    if (u11.n(slimTimeBarStyle2)) {
                        i19 = 256;
                        i13 |= i19;
                    }
                } else {
                    slimTimeBarStyle2 = slimTimeBarStyle;
                }
                i19 = UserVerificationMethods.USER_VERIFY_PATTERN;
                i13 |= i19;
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
                        } else if ((1572864 & i11) == 0) {
                            function22 = function2;
                            i13 |= u11.F(function22) ? 1048576 : 524288;
                            if ((i13 & 599187) == 599186 || !u11.b()) {
                                u11.Q0();
                                if ((i11 & 1) != 0 || u11.w0()) {
                                    e eVar5 = i21 == 0 ? e.f40358c0 : eVar2;
                                    if ((i12 & 4) != 0) {
                                        i13 &= -897;
                                        slimTimeBarStyle2 = SlimTimeBarDefaults.INSTANCE.fullStyle(null, u11, SlimTimeBarDefaults.$stable << 3, 1);
                                    }
                                    if (i14 != 0) {
                                        slimTimeBarBehavior2 = new SlimTimeBarBehavior(false, false, false, 7, null);
                                    }
                                    if (i15 != 0) {
                                        u11.o(-458090949);
                                        Object C11 = u11.C();
                                        if (C11 == InterfaceC3967k.a.a()) {
                                            C11 = PlayerShowcaseV2CustomizationsSlots$CustomizationTimeBar$1$1.INSTANCE;
                                            u11.x(C11);
                                        }
                                        u11.k();
                                        function13 = (Function1) C11;
                                    }
                                    if (i16 != 0) {
                                        u11.o(-458089765);
                                        Object C12 = u11.C();
                                        if (C12 == InterfaceC3967k.a.a()) {
                                            C12 = PlayerShowcaseV2CustomizationsSlots$CustomizationTimeBar$2$1.INSTANCE;
                                            u11.x(C12);
                                        }
                                        u11.k();
                                        function14 = (Function1) C12;
                                    }
                                    if (i17 == 0) {
                                        u11.o(-458087612);
                                        Object C13 = u11.C();
                                        if (C13 == InterfaceC3967k.a.a()) {
                                            C13 = PlayerShowcaseV2CustomizationsSlots$CustomizationTimeBar$3$1.INSTANCE;
                                            u11.x(C13);
                                        }
                                        u11.k();
                                        int i22 = i13;
                                        eVar3 = eVar5;
                                        i18 = i22;
                                        function23 = (Function2) C13;
                                        function15 = function13;
                                        SlimTimeBarStyle slimTimeBarStyle4 = slimTimeBarStyle2;
                                        Function1<? super Long, Unit> function18 = function14;
                                        u11.j0();
                                        SlimTimeBarBehavior slimTimeBarBehavior4 = slimTimeBarBehavior2;
                                        SlimTimeBarKt.SlimTimeBar(slotState, eVar3, SlimTimeBarStyle.m1568copyB6KfgwU$default(slimTimeBarStyle4, new SlimTimeBarColors(C7811b0.c(4294961979L), C7811b0.b(1714683801), C7811b0.b(1727987967), C7811b0.c(4278248959L), null), 5, 9, 0.0f, 10, 16, 0.0f, null, m.e.DEFAULT_DRAG_ANIMATION_DURATION, null), SlimTimeBarBehavior.copy$default(slimTimeBarBehavior4, true, false, false, 4, null), function15, function18, function23, u11, 4186238 & i18, 0);
                                        eVar4 = eVar3;
                                        function24 = function23;
                                        c3969l = u11;
                                        function16 = function15;
                                        function17 = function18;
                                        slimTimeBarStyle3 = slimTimeBarStyle4;
                                        slimTimeBarBehavior3 = slimTimeBarBehavior4;
                                    } else {
                                        int i23 = i13;
                                        eVar3 = eVar5;
                                        i18 = i23;
                                    }
                                } else {
                                    u11.j();
                                    if ((i12 & 4) != 0) {
                                        i13 &= -897;
                                    }
                                    i18 = i13;
                                    eVar3 = eVar2;
                                }
                                function15 = function13;
                                function23 = function22;
                                SlimTimeBarStyle slimTimeBarStyle42 = slimTimeBarStyle2;
                                Function1<? super Long, Unit> function182 = function14;
                                u11.j0();
                                SlimTimeBarBehavior slimTimeBarBehavior42 = slimTimeBarBehavior2;
                                SlimTimeBarKt.SlimTimeBar(slotState, eVar3, SlimTimeBarStyle.m1568copyB6KfgwU$default(slimTimeBarStyle42, new SlimTimeBarColors(C7811b0.c(4294961979L), C7811b0.b(1714683801), C7811b0.b(1727987967), C7811b0.c(4278248959L), null), 5, 9, 0.0f, 10, 16, 0.0f, null, m.e.DEFAULT_DRAG_ANIMATION_DURATION, null), SlimTimeBarBehavior.copy$default(slimTimeBarBehavior42, true, false, false, 4, null), function15, function182, function23, u11, 4186238 & i18, 0);
                                eVar4 = eVar3;
                                function24 = function23;
                                c3969l = u11;
                                function16 = function15;
                                function17 = function182;
                                slimTimeBarStyle3 = slimTimeBarStyle42;
                                slimTimeBarBehavior3 = slimTimeBarBehavior42;
                            } else {
                                u11.j();
                                eVar4 = eVar2;
                                slimTimeBarStyle3 = slimTimeBarStyle2;
                                c3969l = u11;
                                slimTimeBarBehavior3 = slimTimeBarBehavior2;
                                function16 = function13;
                                function17 = function14;
                                function24 = function22;
                            }
                            J0 m02 = c3969l.m0();
                            if (m02 != null) {
                                m02.G(new PlayerShowcaseV2CustomizationsSlots$CustomizationTimeBar$4(this, slotState, eVar4, slimTimeBarStyle3, slimTimeBarBehavior3, function16, function17, function24, i11, i12));
                                return;
                            }
                            return;
                        }
                        function22 = function2;
                        if ((i13 & 599187) == 599186) {
                        }
                        u11.Q0();
                        if ((i11 & 1) != 0) {
                        }
                        if (i21 == 0) {
                        }
                        if ((i12 & 4) != 0) {
                        }
                        if (i14 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i17 == 0) {
                        }
                    }
                    function14 = function12;
                    i17 = i12 & 64;
                    if (i17 != 0) {
                    }
                    function22 = function2;
                    if ((i13 & 599187) == 599186) {
                    }
                    u11.Q0();
                    if ((i11 & 1) != 0) {
                    }
                    if (i21 == 0) {
                    }
                    if ((i12 & 4) != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 == 0) {
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
                function22 = function2;
                if ((i13 & 599187) == 599186) {
                }
                u11.Q0();
                if ((i11 & 1) != 0) {
                }
                if (i21 == 0) {
                }
                if ((i12 & 4) != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 == 0) {
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
            function22 = function2;
            if ((i13 & 599187) == 599186) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i21 == 0) {
            }
            if ((i12 & 4) != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 == 0) {
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
        function22 = function2;
        if ((i13 & 599187) == 599186) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i21 == 0) {
        }
        if ((i12 & 4) != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CustomizationTimeGroup(@NotNull Function0<Long> positionMsProvider, long j11, @NotNull Function1<? super Long, String> timeFormatter, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        boolean z11;
        Object C11;
        boolean z12;
        String C12;
        long j12;
        F f7;
        C3969l c3969l;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(positionMsProvider, "positionMsProvider");
        Intrinsics.checkNotNullParameter(timeFormatter, "timeFormatter");
        C3969l u11 = interfaceC3967k.u(-1260928206);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(positionMsProvider) ? 4 : 2) | i11;
        } else {
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
            i13 |= u11.F(timeFormatter) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i14 = i12 & 8;
        if (i14 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            if ((i13 & 1171) == 1170 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                u11.o(-1768012718);
                int i15 = i13 & 112;
                int i16 = i13 & 896;
                z11 = ((i13 & 14) != 4) | (i15 != 32) | (i16 != 256);
                C11 = u11.C();
                if (!z11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = n1.e(new PlayerShowcaseV2CustomizationsSlots$CustomizationTimeGroup$currentTimeText$2$1(timeFormatter, positionMsProvider, j11));
                    u11.x(C11);
                }
                A1 a12 = (A1) C11;
                u11.k();
                u11.o(-1768005382);
                z12 = (i15 != 32) | (i16 == 256);
                C12 = u11.C();
                if (!z12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = timeFormatter.invoke(Long.valueOf(j11));
                    u11.x(C12);
                }
                u11.k();
                String c11 = G.g.c(CustomizationTimeGroup$lambda$11(a12), " · ", (String) C12);
                j12 = C7807Z.f72251e;
                f7 = F.f21512j;
                c3969l = u11;
                e eVar5 = eVar4;
                u3.b(c11, eVar5, j12, 0L, f7, 0L, null, 0L, 0, false, 0, 0, null, null, c3969l, ((i13 >> 6) & 112) | 196992, 0, 131032);
                eVar3 = eVar5;
            } else {
                u11.j();
                c3969l = u11;
                eVar3 = eVar2;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new PlayerShowcaseV2CustomizationsSlots$CustomizationTimeGroup$1(this, positionMsProvider, j11, timeFormatter, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 1171) == 1170) {
        }
        if (i14 == 0) {
        }
        u11.o(-1768012718);
        int i152 = i13 & 112;
        int i162 = i13 & 896;
        z11 = ((i13 & 14) != 4) | (i152 != 32) | (i162 != 256);
        C11 = u11.C();
        if (!z11) {
        }
        C11 = n1.e(new PlayerShowcaseV2CustomizationsSlots$CustomizationTimeGroup$currentTimeText$2$1(timeFormatter, positionMsProvider, j11));
        u11.x(C11);
        A1 a122 = (A1) C11;
        u11.k();
        u11.o(-1768005382);
        z12 = (i152 != 32) | (i162 == 256);
        C12 = u11.C();
        if (!z12) {
        }
        C12 = timeFormatter.invoke(Long.valueOf(j11));
        u11.x(C12);
        u11.k();
        String c112 = G.g.c(CustomizationTimeGroup$lambda$11(a122), " · ", (String) C12);
        j12 = C7807Z.f72251e;
        f7 = F.f21512j;
        c3969l = u11;
        e eVar52 = eVar4;
        u3.b(c112, eVar52, j12, 0L, f7, 0L, null, 0L, 0, false, 0, 0, null, null, c3969l, ((i13 >> 6) & 112) | 196992, 0, 131032);
        eVar3 = eVar52;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }
}
