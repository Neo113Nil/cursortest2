package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation;

import Ae.InterfaceC2395h;
import D1.InterfaceC2801g;
import Fr.g;
import K00.b;
import O6.a;
import O6.c;
import Ra.h;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import WZ.t;
import Z1.j;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.net.Uri;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d2.InterfaceC6031H;
import e.C6231f;
import e1.InterfaceC6250b;
import e3.i;
import fd.InterfaceC6511n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7811b0;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingVI;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingViewModel;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui.ContentKt;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui.FooterKt;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui.HeaderKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9896e;
import u0.E;
import y0.b0;
import y0.c0;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aÇ\u0001\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022.\b\u0002\u0010\u000b\u001a(\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00042\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\rj\u0002`\u000e\u0012\u0004\u0012\u00020\n0\f2\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\b\u0012\u00060\rj\u0002`\u000e\u0012\u0004\u0012\u00020\n0\f2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\f2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u001a\b\u0002\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a»\u0001\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022,\u0010\u000b\u001a(\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00042\u0016\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\rj\u0002`\u000e\u0012\u0004\u0012\u00020\n0\f2\u0016\u0010\u0010\u001a\u0012\u0012\b\u0012\u00060\rj\u0002`\u000e\u0012\u0004\u0012\u00020\n0\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u000f\u0010\u001c\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001as\u0010%\u001a\u00020\n2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u00152\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u001c\u0010$\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\"\u0012\u0006\u0012\u0004\u0018\u00010#0\fH\u0003¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI;", "state", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel;", "appOnboardingViewModel", "Lkotlin/Function3;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "", "", "onSkipClick", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "processCustomViewEvents", "processBackEvents", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/Function0;", "closeFlow", "Lkotlin/Function2;", "Landroid/net/Uri;", "closeFlowWithRedirect", "AppOnboardingWidget", "(Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI;Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel;Lfd/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "Widget", "(Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI;Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel;Lfd/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;LS0/k;I)V", "SetupSystemUi", "(LS0/k;I)V", "LAe/h;", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel$Event;", "events", "onFinished", "Lkotlin/coroutines/d;", "", "scrollToPage", "HandleOnboardingStateEffect", "(LAe/h;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppOnboardingWidgetKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppOnboardingWidget(@NotNull AppOnboardingVI state, AppOnboardingViewModel appOnboardingViewModel, InterfaceC6511n<? super AtomActionDTO, ? super Map<String, TokenizedTrackingInfo>, ? super Integer, Unit> interfaceC6511n, Function1<? super t, Unit> function1, Function1<? super t, Unit> function12, Function1<? super AtomAction, Unit> function13, Function0<Unit> function0, Function2<? super Uri, ? super Uri, Unit> function2, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        AppOnboardingViewModel appOnboardingViewModel2;
        int i14;
        InterfaceC6511n<? super AtomActionDTO, ? super Map<String, TokenizedTrackingInfo>, ? super Integer, Unit> interfaceC6511n2;
        int i15;
        Function1<? super t, Unit> function14;
        int i16;
        Function1<? super t, Unit> function15;
        int i17;
        Function1<? super AtomAction, Unit> function16;
        int i18;
        Function0<Unit> function02;
        int i19;
        int i21;
        InterfaceC6511n<? super AtomActionDTO, ? super Map<String, TokenizedTrackingInfo>, ? super Integer, Unit> interfaceC6511n3;
        Function1<? super t, Unit> function17;
        Function1<? super t, Unit> function18;
        Function1<? super AtomAction, Unit> function19;
        Function0<Unit> function03;
        Function2<? super Uri, ? super Uri, Unit> function22;
        C3969l c3969l;
        Function2<? super Uri, ? super Uri, Unit> function23;
        Function0<Unit> function04;
        Function1<? super AtomAction, Unit> function110;
        Function1<? super t, Unit> function111;
        Function1<? super t, Unit> function112;
        InterfaceC6511n<? super AtomActionDTO, ? super Map<String, TokenizedTrackingInfo>, ? super Integer, Unit> interfaceC6511n4;
        J0 m02;
        Intrinsics.checkNotNullParameter(state, "state");
        C3969l u11 = interfaceC3967k.u(-409868425);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            appOnboardingViewModel2 = appOnboardingViewModel;
            i13 |= u11.F(appOnboardingViewModel2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                interfaceC6511n2 = interfaceC6511n;
                i13 |= u11.F(interfaceC6511n2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i15 = i12 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    function14 = function1;
                    i13 |= u11.F(function14) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    i16 = i12 & 16;
                    if (i16 == 0) {
                        i13 |= 24576;
                    } else if ((i11 & 24576) == 0) {
                        function15 = function12;
                        i13 |= u11.F(function15) ? 16384 : 8192;
                        i17 = i12 & 32;
                        if (i17 != 0) {
                            i13 |= 196608;
                        } else if ((196608 & i11) == 0) {
                            function16 = function13;
                            i13 |= u11.F(function16) ? 131072 : 65536;
                            i18 = i12 & 64;
                            if (i18 == 0) {
                                i13 |= 1572864;
                            } else if ((1572864 & i11) == 0) {
                                function02 = function0;
                                i13 |= u11.F(function02) ? 1048576 : 524288;
                                i19 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
                                if (i19 != 0) {
                                    i13 |= 12582912;
                                } else if ((i11 & 12582912) == 0) {
                                    i21 = i19;
                                    i13 |= u11.F(function2) ? 8388608 : 4194304;
                                    int i22 = i13;
                                    if ((i13 & 4793491) == 4793490 || !u11.b()) {
                                        if (i14 == 0) {
                                            u11.o(754385551);
                                            Object C11 = u11.C();
                                            if (C11 == InterfaceC3967k.a.a()) {
                                                C11 = AppOnboardingWidgetKt$AppOnboardingWidget$1$1.INSTANCE;
                                                u11.x(C11);
                                            }
                                            interfaceC6511n3 = (InterfaceC6511n) C11;
                                            u11.k();
                                        } else {
                                            interfaceC6511n3 = interfaceC6511n2;
                                        }
                                        if (i15 == 0) {
                                            u11.o(754387936);
                                            Object C12 = u11.C();
                                            if (C12 == InterfaceC3967k.a.a()) {
                                                C12 = AppOnboardingWidgetKt$AppOnboardingWidget$2$1.INSTANCE;
                                                u11.x(C12);
                                            }
                                            u11.k();
                                            function17 = (Function1) C12;
                                        } else {
                                            function17 = function14;
                                        }
                                        if (i16 == 0) {
                                            u11.o(754389664);
                                            Object C13 = u11.C();
                                            if (C13 == InterfaceC3967k.a.a()) {
                                                C13 = AppOnboardingWidgetKt$AppOnboardingWidget$3$1.INSTANCE;
                                                u11.x(C13);
                                            }
                                            u11.k();
                                            function18 = (Function1) C13;
                                        } else {
                                            function18 = function15;
                                        }
                                        if (i17 == 0) {
                                            u11.o(754391136);
                                            Object C14 = u11.C();
                                            if (C14 == InterfaceC3967k.a.a()) {
                                                C14 = AppOnboardingWidgetKt$AppOnboardingWidget$4$1.INSTANCE;
                                                u11.x(C14);
                                            }
                                            u11.k();
                                            function19 = (Function1) C14;
                                        } else {
                                            function19 = function16;
                                        }
                                        if (i18 == 0) {
                                            u11.o(754392160);
                                            Object C15 = u11.C();
                                            if (C15 == InterfaceC3967k.a.a()) {
                                                C15 = AppOnboardingWidgetKt$AppOnboardingWidget$5$1.INSTANCE;
                                                u11.x(C15);
                                            }
                                            u11.k();
                                            function03 = (Function0) C15;
                                        } else {
                                            function03 = function02;
                                        }
                                        if (i21 == 0) {
                                            u11.o(754393835);
                                            Object C16 = u11.C();
                                            if (C16 == InterfaceC3967k.a.a()) {
                                                C16 = AppOnboardingWidgetKt$AppOnboardingWidget$6$1.INSTANCE;
                                                u11.x(C16);
                                            }
                                            u11.k();
                                            function22 = (Function2) C16;
                                        } else {
                                            function22 = function2;
                                        }
                                        SetupSystemUi(u11, 0);
                                        AppOnboardingViewModel appOnboardingViewModel3 = appOnboardingViewModel2;
                                        InterfaceC6511n<? super AtomActionDTO, ? super Map<String, TokenizedTrackingInfo>, ? super Integer, Unit> interfaceC6511n5 = interfaceC6511n3;
                                        Widget(state, appOnboardingViewModel3, interfaceC6511n5, function17, function18, function19, function03, function22, u11, i22 & 33554430);
                                        c3969l = u11;
                                        function23 = function22;
                                        function04 = function03;
                                        function110 = function19;
                                        function111 = function18;
                                        function112 = function17;
                                        interfaceC6511n4 = interfaceC6511n5;
                                    } else {
                                        u11.j();
                                        interfaceC6511n4 = interfaceC6511n2;
                                        function112 = function14;
                                        c3969l = u11;
                                        function111 = function15;
                                        function110 = function16;
                                        function04 = function02;
                                        function23 = function2;
                                    }
                                    m02 = c3969l.m0();
                                    if (m02 == null) {
                                        m02.G(new AppOnboardingWidgetKt$AppOnboardingWidget$7(state, appOnboardingViewModel, interfaceC6511n4, function112, function111, function110, function04, function23, i11, i12));
                                        return;
                                    }
                                    return;
                                }
                                i21 = i19;
                                int i222 = i13;
                                if ((i13 & 4793491) == 4793490) {
                                }
                                if (i14 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i18 == 0) {
                                }
                                if (i21 == 0) {
                                }
                                SetupSystemUi(u11, 0);
                                AppOnboardingViewModel appOnboardingViewModel32 = appOnboardingViewModel2;
                                InterfaceC6511n<? super AtomActionDTO, ? super Map<String, TokenizedTrackingInfo>, ? super Integer, Unit> interfaceC6511n52 = interfaceC6511n3;
                                Widget(state, appOnboardingViewModel32, interfaceC6511n52, function17, function18, function19, function03, function22, u11, i222 & 33554430);
                                c3969l = u11;
                                function23 = function22;
                                function04 = function03;
                                function110 = function19;
                                function111 = function18;
                                function112 = function17;
                                interfaceC6511n4 = interfaceC6511n52;
                                m02 = c3969l.m0();
                                if (m02 == null) {
                                }
                            }
                            function02 = function0;
                            i19 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
                            if (i19 != 0) {
                            }
                            i21 = i19;
                            int i2222 = i13;
                            if ((i13 & 4793491) == 4793490) {
                            }
                            if (i14 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i21 == 0) {
                            }
                            SetupSystemUi(u11, 0);
                            AppOnboardingViewModel appOnboardingViewModel322 = appOnboardingViewModel2;
                            InterfaceC6511n<? super AtomActionDTO, ? super Map<String, TokenizedTrackingInfo>, ? super Integer, Unit> interfaceC6511n522 = interfaceC6511n3;
                            Widget(state, appOnboardingViewModel322, interfaceC6511n522, function17, function18, function19, function03, function22, u11, i2222 & 33554430);
                            c3969l = u11;
                            function23 = function22;
                            function04 = function03;
                            function110 = function19;
                            function111 = function18;
                            function112 = function17;
                            interfaceC6511n4 = interfaceC6511n522;
                            m02 = c3969l.m0();
                            if (m02 == null) {
                            }
                        }
                        function16 = function13;
                        i18 = i12 & 64;
                        if (i18 == 0) {
                        }
                        function02 = function0;
                        i19 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i19 != 0) {
                        }
                        i21 = i19;
                        int i22222 = i13;
                        if ((i13 & 4793491) == 4793490) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        SetupSystemUi(u11, 0);
                        AppOnboardingViewModel appOnboardingViewModel3222 = appOnboardingViewModel2;
                        InterfaceC6511n<? super AtomActionDTO, ? super Map<String, TokenizedTrackingInfo>, ? super Integer, Unit> interfaceC6511n5222 = interfaceC6511n3;
                        Widget(state, appOnboardingViewModel3222, interfaceC6511n5222, function17, function18, function19, function03, function22, u11, i22222 & 33554430);
                        c3969l = u11;
                        function23 = function22;
                        function04 = function03;
                        function110 = function19;
                        function111 = function18;
                        function112 = function17;
                        interfaceC6511n4 = interfaceC6511n5222;
                        m02 = c3969l.m0();
                        if (m02 == null) {
                        }
                    }
                    function15 = function12;
                    i17 = i12 & 32;
                    if (i17 != 0) {
                    }
                    function16 = function13;
                    i18 = i12 & 64;
                    if (i18 == 0) {
                    }
                    function02 = function0;
                    i19 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i19 != 0) {
                    }
                    i21 = i19;
                    int i222222 = i13;
                    if ((i13 & 4793491) == 4793490) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    SetupSystemUi(u11, 0);
                    AppOnboardingViewModel appOnboardingViewModel32222 = appOnboardingViewModel2;
                    InterfaceC6511n<? super AtomActionDTO, ? super Map<String, TokenizedTrackingInfo>, ? super Integer, Unit> interfaceC6511n52222 = interfaceC6511n3;
                    Widget(state, appOnboardingViewModel32222, interfaceC6511n52222, function17, function18, function19, function03, function22, u11, i222222 & 33554430);
                    c3969l = u11;
                    function23 = function22;
                    function04 = function03;
                    function110 = function19;
                    function111 = function18;
                    function112 = function17;
                    interfaceC6511n4 = interfaceC6511n52222;
                    m02 = c3969l.m0();
                    if (m02 == null) {
                    }
                }
                function14 = function1;
                i16 = i12 & 16;
                if (i16 == 0) {
                }
                function15 = function12;
                i17 = i12 & 32;
                if (i17 != 0) {
                }
                function16 = function13;
                i18 = i12 & 64;
                if (i18 == 0) {
                }
                function02 = function0;
                i19 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i19 != 0) {
                }
                i21 = i19;
                int i2222222 = i13;
                if ((i13 & 4793491) == 4793490) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i21 == 0) {
                }
                SetupSystemUi(u11, 0);
                AppOnboardingViewModel appOnboardingViewModel322222 = appOnboardingViewModel2;
                InterfaceC6511n<? super AtomActionDTO, ? super Map<String, TokenizedTrackingInfo>, ? super Integer, Unit> interfaceC6511n522222 = interfaceC6511n3;
                Widget(state, appOnboardingViewModel322222, interfaceC6511n522222, function17, function18, function19, function03, function22, u11, i2222222 & 33554430);
                c3969l = u11;
                function23 = function22;
                function04 = function03;
                function110 = function19;
                function111 = function18;
                function112 = function17;
                interfaceC6511n4 = interfaceC6511n522222;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            interfaceC6511n2 = interfaceC6511n;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            function14 = function1;
            i16 = i12 & 16;
            if (i16 == 0) {
            }
            function15 = function12;
            i17 = i12 & 32;
            if (i17 != 0) {
            }
            function16 = function13;
            i18 = i12 & 64;
            if (i18 == 0) {
            }
            function02 = function0;
            i19 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i19 != 0) {
            }
            i21 = i19;
            int i22222222 = i13;
            if ((i13 & 4793491) == 4793490) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i21 == 0) {
            }
            SetupSystemUi(u11, 0);
            AppOnboardingViewModel appOnboardingViewModel3222222 = appOnboardingViewModel2;
            InterfaceC6511n<? super AtomActionDTO, ? super Map<String, TokenizedTrackingInfo>, ? super Integer, Unit> interfaceC6511n5222222 = interfaceC6511n3;
            Widget(state, appOnboardingViewModel3222222, interfaceC6511n5222222, function17, function18, function19, function03, function22, u11, i22222222 & 33554430);
            c3969l = u11;
            function23 = function22;
            function04 = function03;
            function110 = function19;
            function111 = function18;
            function112 = function17;
            interfaceC6511n4 = interfaceC6511n5222222;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        appOnboardingViewModel2 = appOnboardingViewModel;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        interfaceC6511n2 = interfaceC6511n;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        function14 = function1;
        i16 = i12 & 16;
        if (i16 == 0) {
        }
        function15 = function12;
        i17 = i12 & 32;
        if (i17 != 0) {
        }
        function16 = function13;
        i18 = i12 & 64;
        if (i18 == 0) {
        }
        function02 = function0;
        i19 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i19 != 0) {
        }
        i21 = i19;
        int i222222222 = i13;
        if ((i13 & 4793491) == 4793490) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i21 == 0) {
        }
        SetupSystemUi(u11, 0);
        AppOnboardingViewModel appOnboardingViewModel32222222 = appOnboardingViewModel2;
        InterfaceC6511n<? super AtomActionDTO, ? super Map<String, TokenizedTrackingInfo>, ? super Integer, Unit> interfaceC6511n52222222 = interfaceC6511n3;
        Widget(state, appOnboardingViewModel32222222, interfaceC6511n52222222, function17, function18, function19, function03, function22, u11, i222222222 & 33554430);
        c3969l = u11;
        function23 = function22;
        function04 = function03;
        function110 = function19;
        function111 = function18;
        function112 = function17;
        interfaceC6511n4 = interfaceC6511n52222222;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HandleOnboardingStateEffect(InterfaceC2395h<? extends AppOnboardingViewModel.Event> interfaceC2395h, Function0<Unit> function0, Function2<? super Uri, ? super Uri, Unit> function2, Function0<Unit> function02, Function1<? super d<? super Unit>, ? extends Object> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function0<Unit> function03;
        Function2<? super Uri, ? super Uri, Unit> function22;
        Function0<Unit> function04;
        C3969l u11 = interfaceC3967k.u(-1233881851);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(interfaceC2395h) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            function03 = function0;
            i12 |= u11.F(function03) ? 32 : 16;
        } else {
            function03 = function0;
        }
        if ((i11 & 384) == 0) {
            function22 = function2;
            i12 |= u11.F(function22) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            function22 = function2;
        }
        if ((i11 & 3072) == 0) {
            function04 = function02;
            i12 |= u11.F(function04) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            function04 = function02;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function1) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            Unit unit = Unit.f71690a;
            u11.o(1281675728);
            boolean F11 = ((i12 & 112) == 32) | u11.F(interfaceC2395h) | ((i12 & 7168) == 2048) | ((i12 & 896) == 256) | u11.F(function1);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                AppOnboardingWidgetKt$HandleOnboardingStateEffect$1$1 appOnboardingWidgetKt$HandleOnboardingStateEffect$1$1 = new AppOnboardingWidgetKt$HandleOnboardingStateEffect$1$1(interfaceC2395h, function03, function04, function22, function1, null);
                u11.x(appOnboardingWidgetKt$HandleOnboardingStateEffect$1$1);
                C11 = appOnboardingWidgetKt$HandleOnboardingStateEffect$1$1;
            }
            u11.k();
            Q.e(u11, unit, (Function2) C11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new AppOnboardingWidgetKt$HandleOnboardingStateEffect$2(interfaceC2395h, function0, function2, function02, function1, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void SetupSystemUi(InterfaceC3967k interfaceC3967k, int i11) {
        Window window;
        C3969l u11 = interfaceC3967k.u(591705516);
        if (i11 == 0 && u11.b()) {
            u11.j();
        } else {
            Context context = ((View) u11.m(AndroidCompositionLocals_androidKt.h())).getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null || (window = activity.getWindow()) == null) {
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new AppOnboardingWidgetKt$SetupSystemUi$window$1(i11));
                    return;
                }
                return;
            }
            int i12 = c.f19997c;
            u11.B(-715745933);
            u11.B(1009281237);
            ViewParent parent = ((View) u11.m(AndroidCompositionLocals_androidKt.h())).getParent();
            InterfaceC6031H interfaceC6031H = parent instanceof InterfaceC6031H ? (InterfaceC6031H) parent : null;
            Window window2 = interfaceC6031H != null ? interfaceC6031H.getWindow() : null;
            if (window2 == null) {
                Context context2 = ((View) u11.m(AndroidCompositionLocals_androidKt.h())).getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                while (true) {
                    if (!(context2 instanceof Activity)) {
                        if (!(context2 instanceof ContextWrapper)) {
                            window2 = null;
                            break;
                        } else {
                            context2 = ((ContextWrapper) context2).getBaseContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getBaseContext(...)");
                        }
                    } else {
                        window2 = ((Activity) context2).getWindow();
                        break;
                    }
                }
            }
            u11.K();
            View view = (View) u11.m(AndroidCompositionLocals_androidKt.h());
            u11.B(-1044852491);
            boolean n11 = u11.n(view) | u11.n(window2);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new a(view, window2);
                u11.x(C11);
            }
            a aVar = (a) C11;
            u11.K();
            u11.K();
            u11.o(915142495);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = n1.f(Boolean.TRUE, D1.f25195a);
                u11.x(C12);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C12;
            u11.k();
            long layerFloor0 = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor0();
            long b11 = C7811b0.b(window.getNavigationBarColor());
            boolean booleanValue = ((Boolean) interfaceC3978p0.getValue()).booleanValue();
            u11.o(915149312);
            Object C13 = u11.C();
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = AppOnboardingWidgetKt$SetupSystemUi$1$1.INSTANCE;
                u11.x(C13);
            }
            u11.k();
            C6231f.a(booleanValue, (Function0) C13, u11, 48, 0);
            Unit unit = Unit.f71690a;
            u11.o(915150369);
            boolean n12 = u11.n(aVar) | u11.s(layerFloor0);
            Object C14 = u11.C();
            if (n12 || C14 == InterfaceC3967k.a.a()) {
                C14 = new AppOnboardingWidgetKt$SetupSystemUi$2$1(aVar, layerFloor0, null);
                u11.x(C14);
            }
            u11.k();
            Q.e(u11, unit, (Function2) C14);
            u11.o(915155484);
            boolean n13 = u11.n(aVar) | u11.s(b11);
            Object C15 = u11.C();
            if (n13 || C15 == InterfaceC3967k.a.a()) {
                C15 = new AppOnboardingWidgetKt$SetupSystemUi$3$1(aVar, b11, interfaceC3978p0);
                u11.x(C15);
            }
            u11.k();
            Q.c(unit, (Function1) C15, u11);
        }
        J0 m03 = u11.m0();
        if (m03 != null) {
            m03.G(new AppOnboardingWidgetKt$SetupSystemUi$4(i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Widget(AppOnboardingVI appOnboardingVI, AppOnboardingViewModel appOnboardingViewModel, InterfaceC6511n<? super AtomActionDTO, ? super Map<String, TokenizedTrackingInfo>, ? super Integer, Unit> interfaceC6511n, Function1<? super t, Unit> function1, Function1<? super t, Unit> function12, Function1<? super AtomAction, Unit> function13, Function0<Unit> function0, Function2<? super Uri, ? super Uri, Unit> function2, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function1<? super t, Unit> function14;
        Function0<Unit> function02;
        Function2<? super Uri, ? super Uri, Unit> function22;
        e b11;
        AppOnboardingVI appOnboardingVI2 = appOnboardingVI;
        C3969l u11 = interfaceC3967k.u(-1119220009);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(appOnboardingVI2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(appOnboardingViewModel) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(interfaceC6511n) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            function14 = function1;
            i12 |= u11.F(function14) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            function14 = function1;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function12) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(function13) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            function02 = function0;
            i12 |= u11.F(function02) ? 1048576 : 524288;
        } else {
            function02 = function0;
        }
        if ((12582912 & i11) == 0) {
            function22 = function2;
            i12 |= u11.F(function22) ? 8388608 : 4194304;
        } else {
            function22 = function2;
        }
        if ((4793491 & i12) == 4793490 && u11.b()) {
            u11.j();
        } else {
            Configuration configuration = (Configuration) u11.m(AndroidCompositionLocals_androidKt.c());
            long d11 = h.d(configuration.screenWidthDp, configuration.screenHeightDp);
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(467777622);
            boolean F11 = u11.F(appOnboardingViewModel);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new AppOnboardingWidgetKt$Widget$1$1(appOnboardingViewModel);
                u11.x(C11);
            }
            u11.k();
            i.a(aVar, null, (Function0) C11, u11, 6);
            e.a aVar2 = e.f40358c0;
            int i13 = a0.f39446j;
            b11 = androidx.compose.foundation.e.b(a0.o(aVar2, j.c(d11), j.b(d11)), UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor0(), y0.a());
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
            int I11 = u11.I();
            A0 d12 = u11.d();
            e f7 = androidx.compose.ui.c.f(u11, b11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            C9896e c9896e = C9896e.f99653a;
            u11.o(-1809836799);
            appOnboardingVI2 = appOnboardingVI;
            boolean F12 = u11.F(appOnboardingVI2);
            Object C12 = u11.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new AppOnboardingWidgetKt$Widget$2$pagerState$1$1(appOnboardingVI2);
                u11.x(C12);
            }
            u11.k();
            b0 e11 = c0.e((Function0) C12, 0, u11, 3);
            InterfaceC2395h<AppOnboardingViewModel.Event> events = appOnboardingViewModel != null ? appOnboardingViewModel.getEvents() : null;
            u11.o(-1809829139);
            boolean F13 = u11.F(appOnboardingViewModel);
            Object C13 = u11.C();
            if (F13 || C13 == InterfaceC3967k.a.a()) {
                C13 = new AppOnboardingWidgetKt$Widget$2$1$1(appOnboardingViewModel);
                u11.x(C13);
            }
            Function0 function03 = (Function0) C13;
            u11.k();
            u11.o(-1809826770);
            boolean n11 = u11.n(e11);
            Object C14 = u11.C();
            if (n11 || C14 == InterfaceC3967k.a.a()) {
                C14 = new AppOnboardingWidgetKt$Widget$2$2$1(e11, null);
                u11.x(C14);
            }
            u11.k();
            HandleOnboardingStateEffect(events, function02, function22, function03, (Function1) C14, u11, (i12 >> 15) & 1008);
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            E.a(u11, a0.f(aVar2, dsSpacings.m1850getDp24D9Ej5fM()));
            AppOnboardingVI.Header header = appOnboardingVI2.getHeader();
            u11.o(-1809815654);
            boolean n12 = u11.n(e11) | ((i12 & 896) == 256);
            Object C15 = u11.C();
            if (n12 || C15 == InterfaceC3967k.a.a()) {
                C15 = new AppOnboardingWidgetKt$Widget$2$3$1(interfaceC6511n, e11);
                u11.x(C15);
            }
            u11.k();
            HeaderKt.Header(header, (Function2) C15, u11, 0, 0);
            ContentKt.Content(c9896e, appOnboardingVI2.getContent().getPages(), appOnboardingVI2.getContent().getUnderImage(), e11, function12, function14, u11, 6 | (57344 & i12) | ((i12 << 6) & 458752), 0);
            u11 = u11;
            AppOnboardingVI.Footer footer = appOnboardingVI2.getFooter();
            int r11 = e11.r();
            u11.o(-1809799319);
            boolean z11 = (i12 & 458752) == 131072;
            Object C16 = u11.C();
            if (z11 || C16 == InterfaceC3967k.a.a()) {
                C16 = new AppOnboardingWidgetKt$Widget$2$4$1(function13);
                u11.x(C16);
            }
            u11.k();
            FooterKt.Footer(footer, r11, (Function1) C16, u11, 0);
            E.a(u11, a0.f(aVar2, dsSpacings.m1845getDp16D9Ej5fM()));
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new AppOnboardingWidgetKt$Widget$3(appOnboardingVI2, appOnboardingViewModel, interfaceC6511n, function1, function12, function13, function0, function2, i11));
        }
    }
}
