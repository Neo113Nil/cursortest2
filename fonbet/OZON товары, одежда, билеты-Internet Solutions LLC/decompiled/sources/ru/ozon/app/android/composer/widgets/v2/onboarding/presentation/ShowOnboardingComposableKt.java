package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation;

import B1.B;
import B1.C;
import Pk0.h;
import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import Sc.InterfaceC4008j;
import a00.C4911f;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.G;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d20.AbstractC6065b;
import e3.r;
import fd.InterfaceC6512o;
import k1.C7460f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingDialogCutConfig;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\u000e\u001a\u00020\t2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u001a\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aO\u0010\u0012\u001a\u00020\t2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001f²\u0006\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onBoardingDto", "", "widgetKey", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "viewModel", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;", "cutConfig", "Lkotlin/Function0;", "", "onCropAreaClick", "Lkotlin/Function2;", "Landroidx/compose/ui/e;", "content", "WidgetWithOnboarding", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/String;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;Lkotlin/jvm/functions/Function0;Lfd/o;LS0/k;II)V", "LB1/B;", "targetCoordinates", "ShowOnboardingIfNeeded", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/String;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;LB1/B;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;Lkotlin/jvm/functions/Function0;LS0/k;II)V", "", "statusBarHeight", "onBoardingCutConfig", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialogCutConfig;", "createOnboardingValues", "(LB1/B;ILru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;)Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialogCutConfig;", "coordinates", "", "isVisible", "Landroidx/recyclerview/widget/RecyclerView;", "composerRv", "composer_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShowOnboardingComposableKt {
    /* JADX WARN: Removed duplicated region for block: B:112:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShowOnboardingIfNeeded(OnBoardingDTO onBoardingDTO, @NotNull String widgetKey, @NotNull BaseOnBoardingViewModel viewModel, B b11, OnBoardingCutConfig onBoardingCutConfig, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        OnBoardingCutConfig onBoardingCutConfig2;
        Function0<Unit> function02;
        OnBoardingCutConfig onBoardingCutConfig3;
        Function0<Unit> function03;
        OnBoardingCutConfig onBoardingCutConfig4;
        Function0<Unit> function04;
        int i14;
        B b12 = b11;
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        C3969l u11 = interfaceC3967k.u(-310127245);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(onBoardingDTO) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(widgetKey) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(viewModel) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(b12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                onBoardingCutConfig2 = onBoardingCutConfig;
                if (u11.n(onBoardingCutConfig2)) {
                    i14 = 16384;
                    i13 |= i14;
                }
            } else {
                onBoardingCutConfig2 = onBoardingCutConfig;
            }
            i14 = 8192;
            i13 |= i14;
        } else {
            onBoardingCutConfig2 = onBoardingCutConfig;
        }
        int i15 = i12 & 32;
        if (i15 != 0) {
            i13 |= 196608;
        } else if ((196608 & i11) == 0) {
            function02 = function0;
            i13 |= u11.F(function02) ? 131072 : 65536;
            if ((74899 & i13) == 74898 || !u11.b()) {
                u11.Q0();
                if ((i11 & 1) != 0 || u11.w0()) {
                    if ((i12 & 16) == 0) {
                        onBoardingCutConfig3 = new OnBoardingCutConfig(null, null, null, null, null, null, null, false, 255, null);
                        i13 &= -57345;
                    } else {
                        onBoardingCutConfig3 = onBoardingCutConfig2;
                    }
                    if (i15 != 0) {
                        function03 = null;
                        u11.j0();
                        if (onBoardingDTO == null) {
                            J0 m02 = u11.m0();
                            if (m02 != null) {
                                m02.G(new ShowOnboardingComposableKt$ShowOnboardingIfNeeded$1(onBoardingDTO, widgetKey, viewModel, b12, onBoardingCutConfig3, function03, i11, i12));
                                return;
                            }
                            return;
                        }
                        OnBoardingCutConfig onBoardingCutConfig5 = onBoardingCutConfig3;
                        C4911f c4911f = (C4911f) u11.m(f.d());
                        J j11 = (J) u11.m(r.a());
                        Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
                        View view = (View) u11.m(AndroidCompositionLocals_androidKt.h());
                        u11.o(816905121);
                        boolean n11 = u11.n(context);
                        Object C11 = u11.C();
                        if (n11 || C11 == InterfaceC3967k.a.a()) {
                            androidx.fragment.app.r rVar = context instanceof androidx.fragment.app.r ? (androidx.fragment.app.r) context : null;
                            C11 = rVar != null ? rVar.getSupportFragmentManager() : null;
                            u11.x(C11);
                        }
                        G g10 = (G) C11;
                        u11.k();
                        u11.o(816908184);
                        boolean n12 = u11.n(context);
                        Object C12 = u11.C();
                        if (n12 || C12 == InterfaceC3967k.a.a()) {
                            androidx.fragment.app.r rVar2 = context instanceof androidx.fragment.app.r ? (androidx.fragment.app.r) context : null;
                            C12 = rVar2 != null ? ContextExtKt.getRootView(rVar2) : null;
                            u11.x(C12);
                        }
                        ViewGroup viewGroup = (ViewGroup) C12;
                        u11.k();
                        u11.o(816911385);
                        boolean F11 = u11.F(viewGroup);
                        Object C13 = u11.C();
                        if (F11 || C13 == InterfaceC3967k.a.a()) {
                            C13 = new ShowOnboardingComposableKt$ShowOnboardingIfNeeded$composerRv$2$1(viewGroup);
                            u11.x(C13);
                        }
                        u11.k();
                        InterfaceC4008j unsafeLazy = LazyUtilsKt.unsafeLazy((Function0) C13);
                        u11.o(816913415);
                        boolean n13 = u11.n(context);
                        Object C14 = u11.C();
                        if (n13 || C14 == InterfaceC3967k.a.a()) {
                            C14 = Integer.valueOf(ResourceExtKt.getStatusBarHeight(context));
                            u11.x(C14);
                        }
                        int intValue = ((Number) C14).intValue();
                        u11.k();
                        u11.o(816917368);
                        boolean F12 = ((i13 & 112) == 32) | u11.F(b12) | u11.F(g10) | u11.F(c4911f) | u11.F(viewModel) | u11.r(intValue) | ((((57344 & i13) ^ 24576) > 16384 && u11.n(onBoardingCutConfig5)) || (i13 & 24576) == 16384) | u11.F(unsafeLazy) | u11.F(view) | u11.F(j11) | ((458752 & i13) == 131072) | ((i13 & 14) == 4);
                        Object C15 = u11.C();
                        if (F12 || C15 == InterfaceC3967k.a.a()) {
                            ShowOnboardingComposableKt$ShowOnboardingIfNeeded$2$1 showOnboardingComposableKt$ShowOnboardingIfNeeded$2$1 = new ShowOnboardingComposableKt$ShowOnboardingIfNeeded$2$1(b12, g10, c4911f, viewModel, widgetKey, intValue, onBoardingCutConfig5, view, j11, function03, onBoardingDTO, unsafeLazy, null);
                            b12 = b12;
                            u11.x(showOnboardingComposableKt$ShowOnboardingIfNeeded$2$1);
                            C15 = showOnboardingComposableKt$ShowOnboardingIfNeeded$2$1;
                        }
                        u11.k();
                        Q.e(u11, b12, (Function2) C15);
                        onBoardingCutConfig4 = onBoardingCutConfig5;
                        function04 = function03;
                    }
                } else {
                    u11.j();
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                    }
                    onBoardingCutConfig3 = onBoardingCutConfig2;
                }
                function03 = function02;
                u11.j0();
                if (onBoardingDTO == null) {
                }
            } else {
                u11.j();
                onBoardingCutConfig4 = onBoardingCutConfig2;
                function04 = function02;
            }
            J0 m03 = u11.m0();
            if (m03 != null) {
                m03.G(new ShowOnboardingComposableKt$ShowOnboardingIfNeeded$3(onBoardingDTO, widgetKey, viewModel, b12, onBoardingCutConfig4, function04, i11, i12));
                return;
            }
            return;
        }
        function02 = function0;
        if ((74899 & i13) == 74898) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if ((i12 & 16) == 0) {
        }
        if (i15 != 0) {
        }
        function03 = function02;
        u11.j0();
        if (onBoardingDTO == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView ShowOnboardingIfNeeded$lambda$14(InterfaceC4008j<? extends RecyclerView> interfaceC4008j) {
        return interfaceC4008j.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WidgetWithOnboarding(OnBoardingDTO onBoardingDTO, @NotNull String widgetKey, @NotNull BaseOnBoardingViewModel viewModel, OnBoardingCutConfig onBoardingCutConfig, Function0<Unit> function0, @NotNull InterfaceC6512o<? super String, ? super e, ? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        OnBoardingCutConfig onBoardingCutConfig2;
        Function0<Unit> function02;
        OnBoardingCutConfig onBoardingCutConfig3;
        Function0<Unit> function03;
        Object C11;
        Object C12;
        Object b11;
        InterfaceC3978p0 interfaceC3978p0;
        e eVar;
        Object C13;
        J0 m02;
        int i14;
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(-245757676);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(onBoardingDTO) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(widgetKey) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(viewModel) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                onBoardingCutConfig2 = onBoardingCutConfig;
                if (u11.n(onBoardingCutConfig2)) {
                    i14 = 2048;
                    i13 |= i14;
                }
            } else {
                onBoardingCutConfig2 = onBoardingCutConfig;
            }
            i14 = UserVerificationMethods.USER_VERIFY_ALL;
            i13 |= i14;
        } else {
            onBoardingCutConfig2 = onBoardingCutConfig;
        }
        int i15 = i12 & 16;
        if (i15 != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            function02 = function0;
            i13 |= u11.F(function02) ? 16384 : 8192;
            if ((i12 & 32) == 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                i13 |= u11.F(content) ? 131072 : 65536;
            }
            if ((74899 & i13) == 74898 || !u11.b()) {
                u11.Q0();
                if ((i11 & 1) != 0 || u11.w0()) {
                    if ((i12 & 8) == 0) {
                        onBoardingCutConfig3 = new OnBoardingCutConfig(null, null, null, null, null, null, null, false, 255, null);
                        i13 &= -7169;
                    } else {
                        onBoardingCutConfig3 = onBoardingCutConfig2;
                    }
                    function03 = i15 == 0 ? null : function02;
                    onBoardingCutConfig2 = onBoardingCutConfig3;
                } else {
                    u11.j();
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                    }
                    function03 = function02;
                }
                u11.j0();
                J j11 = (J) u11.m(r.a());
                u11.o(1884139685);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = Boolean.valueOf(j11 instanceof AbstractC6065b);
                    u11.x(C11);
                }
                Boolean bool = (Boolean) C11;
                boolean booleanValue = bool.booleanValue();
                u11.k();
                u11.o(1884142801);
                C12 = u11.C();
                if (C12 == InterfaceC3967k.a.a()) {
                    C12 = n1.f(null, D1.f25195a);
                    u11.x(C12);
                }
                InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C12;
                b11 = h.b(u11, 1884144572);
                if (b11 == InterfaceC3967k.a.a()) {
                    b11 = n1.f(bool, D1.f25195a);
                    u11.x(b11);
                }
                interfaceC3978p0 = (InterfaceC3978p0) b11;
                u11.k();
                String onboardingKey = onBoardingDTO != null ? onBoardingDTO.getOnboardingKey() : null;
                u11.o(1884155695);
                u11.o(1884148796);
                eVar = e.f40358c0;
                if (onBoardingDTO != null && !booleanValue && !WidgetWithOnboarding$lambda$5(interfaceC3978p0)) {
                    u11.o(693607233);
                    C13 = u11.C();
                    if (C13 == InterfaceC3967k.a.a()) {
                        C13 = new ShowOnboardingComposableKt$WidgetWithOnboarding$1$1$1(interfaceC3978p0);
                        u11.x(C13);
                    }
                    u11.k();
                    eVar = ru.ozon.composer.compose.widget.scrollable.f.b(eVar, (Function1) C13);
                }
                u11.k();
                if (WidgetWithOnboarding$lambda$5(interfaceC3978p0)) {
                    u11.o(693612551);
                    Object C14 = u11.C();
                    if (C14 == InterfaceC3967k.a.a()) {
                        C14 = new ShowOnboardingComposableKt$WidgetWithOnboarding$2$1$1(interfaceC3978p02);
                        u11.x(C14);
                    }
                    u11.k();
                    eVar = c.a(eVar, (Function1) C14);
                }
                u11.k();
                content.invoke(onboardingKey, eVar, u11, Integer.valueOf((i13 >> 9) & 896));
                if (onBoardingDTO != null) {
                    int i16 = i13 & 1022;
                    int i17 = i13 << 3;
                    ShowOnboardingIfNeeded(onBoardingDTO, widgetKey, viewModel, WidgetWithOnboarding$lambda$2(interfaceC3978p02), onBoardingCutConfig2, function03, u11, (i17 & 458752) | i16 | (57344 & i17), 0);
                }
            } else {
                u11.j();
                function03 = function02;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new ShowOnboardingComposableKt$WidgetWithOnboarding$3(onBoardingDTO, widgetKey, viewModel, onBoardingCutConfig2, function03, content, i11, i12));
                return;
            }
            return;
        }
        function02 = function0;
        if ((i12 & 32) == 0) {
        }
        if ((74899 & i13) == 74898) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if ((i12 & 8) == 0) {
        }
        if (i15 == 0) {
        }
        onBoardingCutConfig2 = onBoardingCutConfig3;
        u11.j0();
        J j112 = (J) u11.m(r.a());
        u11.o(1884139685);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        Boolean bool2 = (Boolean) C11;
        boolean booleanValue2 = bool2.booleanValue();
        u11.k();
        u11.o(1884142801);
        C12 = u11.C();
        if (C12 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p022 = (InterfaceC3978p0) C12;
        b11 = h.b(u11, 1884144572);
        if (b11 == InterfaceC3967k.a.a()) {
        }
        interfaceC3978p0 = (InterfaceC3978p0) b11;
        u11.k();
        if (onBoardingDTO != null) {
        }
        u11.o(1884155695);
        u11.o(1884148796);
        eVar = e.f40358c0;
        if (onBoardingDTO != null) {
            u11.o(693607233);
            C13 = u11.C();
            if (C13 == InterfaceC3967k.a.a()) {
            }
            u11.k();
            eVar = ru.ozon.composer.compose.widget.scrollable.f.b(eVar, (Function1) C13);
        }
        u11.k();
        if (WidgetWithOnboarding$lambda$5(interfaceC3978p0)) {
        }
        u11.k();
        content.invoke(onboardingKey, eVar, u11, Integer.valueOf((i13 >> 9) & 896));
        if (onBoardingDTO != null) {
        }
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    private static final B WidgetWithOnboarding$lambda$2(InterfaceC3978p0<B> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    private static final boolean WidgetWithOnboarding$lambda$5(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WidgetWithOnboarding$lambda$6(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    public static final OnBoardingDialogCutConfig createOnboardingValues(@NotNull B b11, int i11, OnBoardingCutConfig onBoardingCutConfig) {
        Intrinsics.checkNotNullParameter(b11, "<this>");
        if (onBoardingCutConfig == null) {
            return null;
        }
        C7460f b12 = C.b(b11);
        int n11 = (int) b12.n();
        Integer marginHorizontal = onBoardingCutConfig.getMarginHorizontal();
        int intValue = n11 + ((marginHorizontal == null && (marginHorizontal = onBoardingCutConfig.getMarginLeft()) == null) ? 0 : marginHorizontal.intValue());
        int q11 = ((int) b12.q()) - i11;
        Integer marginVertical = onBoardingCutConfig.getMarginVertical();
        int intValue2 = q11 + ((marginVertical == null && (marginVertical = onBoardingCutConfig.getMarginTop()) == null) ? 0 : marginVertical.intValue());
        int o11 = (int) b12.o();
        Integer marginHorizontal2 = onBoardingCutConfig.getMarginHorizontal();
        int intValue3 = o11 - ((marginHorizontal2 == null && (marginHorizontal2 = onBoardingCutConfig.getMarginRight()) == null) ? 0 : marginHorizontal2.intValue());
        int h11 = ((int) b12.h()) - i11;
        Integer marginVertical2 = onBoardingCutConfig.getMarginVertical();
        return new OnBoardingDialogCutConfig(intValue, intValue2, intValue3, h11 - ((marginVertical2 == null && (marginVertical2 = onBoardingCutConfig.getMarginBottom()) == null) ? 0 : marginVertical2.intValue()), onBoardingCutConfig.getCornerRadius(), onBoardingCutConfig.getIsBannerTopPosition());
    }
}
