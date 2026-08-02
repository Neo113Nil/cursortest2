package ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation;

import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import WZ.l;
import WZ.t;
import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.unsorted.R$string;
import ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation.SwapButtonViewModel;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ag\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u001b\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f²\u0006\f\u0010\u001e\u001a\u00020\u001d8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "composerController", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LZ1/h;", "buttonPadding", "SwapButtonWidgetHolder-egy_3UM", "(Landroidx/compose/ui/e;Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonVO;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel;Lru/ozon/app/android/composer/ComposerNavigator;Ll10/b;LWZ/l;FLS0/k;II)V", "SwapButtonWidgetHolder", "", "isSubscribed", "La00/f;", "container", "showNotification", "(Ljava/lang/Boolean;La00/f;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel$UiState;", "state", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SwapButtonWidgetHolderKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011b  */
    /* renamed from: SwapButtonWidgetHolder-egy_3UM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m774SwapButtonWidgetHolderegy_3UM(e eVar, @NotNull SwapButtonVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull SwapButtonViewModel viewModel, @NotNull ComposerNavigator composerNavigator, @NotNull InterfaceC7851b composerController, @NotNull l tokenizedAnalytics, float f7, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        float f11;
        InterfaceC3978p0 b11;
        t tVar;
        Unit unit;
        int i14;
        boolean F11;
        t tVar2;
        Object swapButtonWidgetHolderKt$SwapButtonWidgetHolder$2$1;
        Unit unit2;
        int i15;
        boolean F12;
        Object C11;
        boolean n11;
        Object C12;
        C3969l c3969l;
        float f12;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(composerNavigator, "composerNavigator");
        Intrinsics.checkNotNullParameter(composerController, "composerController");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        C3969l u11 = interfaceC3967k.u(-143751378);
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
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(item) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(viewModel) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i13 |= u11.F(composerNavigator) ? 16384 : 8192;
        }
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i11 & 196608) == 0) {
            i13 |= u11.F(composerController) ? 131072 : 65536;
        }
        if ((i12 & 64) != 0) {
            i13 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            i13 |= u11.F(tokenizedAnalytics) ? 1048576 : 524288;
        }
        int i17 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i17 != 0) {
            i13 |= 12582912;
        } else if ((12582912 & i11) == 0) {
            f11 = f7;
            i13 |= u11.q(f11) ? 8388608 : 4194304;
            if ((4793491 & i13) == 4793490 || !u11.b()) {
                e eVar3 = i16 == 0 ? e.f40358c0 : eVar2;
                if (i17 != 0) {
                    f11 = 8;
                }
                b11 = n1.b(viewModel.getState(), u11);
                Pair pair = (SwapButtonWidgetHolder_egy_3UM$lambda$0(b11).getIsSwapped() || item.getSecondButton() == null) ? new Pair(item.getFirstButton(), item.getFirstButtonClickEvent()) : new Pair(item.getSecondButton(), item.getSecondButtonClickEvent());
                ButtonV3DTO buttonV3DTO = (ButtonV3DTO) pair.a();
                tVar = (t) pair.b();
                C4911f c4911f = (C4911f) u11.m(f.d());
                unit = Unit.f71690a;
                u11.o(-1632423445);
                i14 = i13 & 896;
                F11 = (i14 != 256) | u11.F(viewModel) | u11.F(composerController) | u11.F(c4911f) | u11.F(composerNavigator);
                Object C13 = u11.C();
                if (!F11 || C13 == InterfaceC3967k.a.a()) {
                    tVar2 = tVar;
                    unit2 = unit;
                    i15 = i14;
                    swapButtonWidgetHolderKt$SwapButtonWidgetHolder$2$1 = new SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$2$1(viewModel, composerController, c4911f, actionHandler, composerNavigator, null);
                    u11.x(swapButtonWidgetHolderKt$SwapButtonWidgetHolder$2$1);
                } else {
                    tVar2 = tVar;
                    i15 = i14;
                    swapButtonWidgetHolderKt$SwapButtonWidgetHolder$2$1 = C13;
                    unit2 = unit;
                }
                u11.k();
                Q.e(u11, unit2, (Function2) swapButtonWidgetHolderKt$SwapButtonWidgetHolder$2$1);
                u11.o(-1632395911);
                F12 = u11.F(viewModel);
                C11 = u11.C();
                if (!F12 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$3$1(viewModel);
                    u11.x(C11);
                }
                u11.k();
                Q.c(unit2, (Function1) C11, u11);
                ButtonV3DTO copy$default = ButtonV3DTO.copy$default(buttonV3DTO, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
                e f13 = T.f(a0.e(eVar3, 1.0f), f11);
                u11.o(-1632387881);
                n11 = u11.n(b11) | u11.F(tVar2) | u11.F(tokenizedAnalytics) | u11.F(viewModel) | (i15 == 256);
                C12 = u11.C();
                if (!n11 || C12 == InterfaceC3967k.a.a()) {
                    SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$4$1 swapButtonWidgetHolderKt$SwapButtonWidgetHolder$4$1 = new SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$4$1(tVar2, viewModel, actionHandler, b11, tokenizedAnalytics);
                    u11.x(swapButtonWidgetHolderKt$SwapButtonWidgetHolder$4$1);
                    C12 = swapButtonWidgetHolderKt$SwapButtonWidgetHolder$4$1;
                }
                u11.k();
                c3969l = u11;
                eVar2 = eVar3;
                DsButtonAtomKt.DsButtonAtom(copy$default, f13, false, (Function1) C12, c3969l, 0, 4);
                f12 = f11;
            } else {
                u11.j();
                c3969l = u11;
                f12 = f11;
            }
            e eVar4 = eVar2;
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$5(eVar4, item, actionHandler, viewModel, composerNavigator, composerController, tokenizedAnalytics, f12, i11, i12));
                return;
            }
            return;
        }
        f11 = f7;
        if ((4793491 & i13) == 4793490) {
        }
        if (i16 == 0) {
        }
        if (i17 != 0) {
        }
        b11 = n1.b(viewModel.getState(), u11);
        if (SwapButtonWidgetHolder_egy_3UM$lambda$0(b11).getIsSwapped()) {
        }
        ButtonV3DTO buttonV3DTO2 = (ButtonV3DTO) pair.a();
        tVar = (t) pair.b();
        C4911f c4911f2 = (C4911f) u11.m(f.d());
        unit = Unit.f71690a;
        u11.o(-1632423445);
        i14 = i13 & 896;
        F11 = (i14 != 256) | u11.F(viewModel) | u11.F(composerController) | u11.F(c4911f2) | u11.F(composerNavigator);
        Object C132 = u11.C();
        if (F11) {
        }
        tVar2 = tVar;
        unit2 = unit;
        i15 = i14;
        swapButtonWidgetHolderKt$SwapButtonWidgetHolder$2$1 = new SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$2$1(viewModel, composerController, c4911f2, actionHandler, composerNavigator, null);
        u11.x(swapButtonWidgetHolderKt$SwapButtonWidgetHolder$2$1);
        u11.k();
        Q.e(u11, unit2, (Function2) swapButtonWidgetHolderKt$SwapButtonWidgetHolder$2$1);
        u11.o(-1632395911);
        F12 = u11.F(viewModel);
        C11 = u11.C();
        if (!F12) {
        }
        C11 = new SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$3$1(viewModel);
        u11.x(C11);
        u11.k();
        Q.c(unit2, (Function1) C11, u11);
        ButtonV3DTO copy$default2 = ButtonV3DTO.copy$default(buttonV3DTO2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        e f132 = T.f(a0.e(eVar3, 1.0f), f11);
        u11.o(-1632387881);
        n11 = u11.n(b11) | u11.F(tVar2) | u11.F(tokenizedAnalytics) | u11.F(viewModel) | (i15 == 256);
        C12 = u11.C();
        if (!n11) {
        }
        SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$4$1 swapButtonWidgetHolderKt$SwapButtonWidgetHolder$4$12 = new SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$4$1(tVar2, viewModel, actionHandler, b11, tokenizedAnalytics);
        u11.x(swapButtonWidgetHolderKt$SwapButtonWidgetHolder$4$12);
        C12 = swapButtonWidgetHolderKt$SwapButtonWidgetHolder$4$12;
        u11.k();
        c3969l = u11;
        eVar2 = eVar3;
        DsButtonAtomKt.DsButtonAtom(copy$default2, f132, false, (Function1) C12, c3969l, 0, 4);
        f12 = f11;
        e eVar42 = eVar2;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwapButtonViewModel.UiState SwapButtonWidgetHolder_egy_3UM$lambda$0(A1<SwapButtonViewModel.UiState> a12) {
        return a12.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showNotification(Boolean bool, C4911f c4911f, Function1<? super AtomAction, Unit> function1) {
        int i11;
        ViewGroup rootView;
        if (Intrinsics.d(bool, Boolean.TRUE)) {
            i11 = R$string.subscribe_to_product_notification_android;
        } else if (bool != null) {
            return;
        } else {
            i11 = ru.ozon.app.android.platform.R$string.common_universal_network_error;
        }
        String string = StringProvider.getString(i11);
        NotificationDTO.Preset preset = bool == null ? NotificationDTO.Preset.WARNING : NotificationDTO.Preset.SUCCESS;
        ComponentCallbacksC5392m c11 = c4911f.c();
        Pair pair = new Pair((c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) ? null : ComposerViewExtensionKt.composerContainer(rootView), c4911f.g());
        ViewGroup viewGroup = (ViewGroup) pair.a();
        J j11 = (J) pair.b();
        NotificationDTO notificationDTO = new NotificationDTO(string, null, null, null, null, null, null, null, null, preset, 478, null);
        if (viewGroup != null) {
            View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(viewGroup, NotificationBarKt.isAboveBottomWidgets(notificationDTO));
            NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(viewGroup, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
            if (asNotificationLayoutManager == null) {
                return;
            }
            NotificationBar.INSTANCE.make(asNotificationLayoutManager, notificationDTO, j11, function1).show();
        }
    }
}
