package com.vk.id.onetap.compose.button;

import Bl0.C2652m;
import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.N;
import S0.Q;
import S0.n1;
import androidx.compose.foundation.i;
import androidx.compose.material3.d;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5236c1;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vk.id.AccessToken;
import com.vk.id.VKIDAuthFail;
import com.vk.id.auth.AuthCodeData;
import com.vk.id.auth.VKIDAuthParams;
import com.vk.id.auth.VKIDAuthUiParams;
import com.vk.id.onetap.common.auth.style.InternalVKIDButtonRippleStyle;
import com.vk.id.onetap.compose.button.CommonKt;
import com.vk.id.onetap.compose.button.auth.style.VKIDButtonRippleStyleKt;
import com.vk.id.onetap.compose.onetap.OneTapTitleScenario;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.C8004n;
import m0.C8025y;
import m0.InterfaceC8002m;
import org.jetbrains.annotations.NotNull;
import t0.p;
import t0.q;
import xe.B0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0085\u0001\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00112 \b\u0002\u0010\u0016\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a)\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\" \u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroidx/compose/ui/e;", "Lkotlin/Function0;", "", "onClick", "clickable", "(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/e;", "Lxe/M;", "coroutineScope", "Lkotlin/Function1;", "Lcom/vk/id/AccessToken;", "onAuth", "Lkotlin/Function2;", "Lcom/vk/id/auth/AuthCodeData;", "", "onAuthCode", "Lcom/vk/id/VKIDAuthFail;", "onFail", "Lcom/vk/id/auth/VKIDAuthParams$Builder;", "params", "Lkotlin/coroutines/d;", "Lcom/vk/id/auth/VKIDAuthUiParams;", "", "onGetParams", "startAuth", "(Lxe/M;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lcom/vk/id/auth/VKIDAuthParams$Builder;Lkotlin/jvm/functions/Function1;)V", "Lcom/vk/id/onetap/compose/button/OnFetchingProgress;", "onFetchingProgress", "Lcom/vk/id/onetap/compose/onetap/OneTapTitleScenario;", "scenario", "FetchUserData", "(Lxe/M;Lcom/vk/id/onetap/compose/button/OnFetchingProgress;Lcom/vk/id/onetap/compose/onetap/OneTapTitleScenario;LS0/k;I)V", "Lm0/m;", "", "easeInOutAnimation", "Lm0/m;", "getEaseInOutAnimation", "()Lm0/m;", "onetap-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CommonKt {

    @NotNull
    private static final InterfaceC8002m<Float> easeInOutAnimation = C8004n.d(300, 0, new C8025y(0.42f, 0.0f, 0.58f, 1.0f), 2);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC5434v.a.values().length];
            try {
                iArr[AbstractC5434v.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void FetchUserData(@NotNull final M coroutineScope, @NotNull final OnFetchingProgress onFetchingProgress, final OneTapTitleScenario oneTapTitleScenario, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(onFetchingProgress, "onFetchingProgress");
        C3969l u11 = interfaceC3967k.u(306954865);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(coroutineScope) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(onFetchingProgress) : u11.F(onFetchingProgress) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(oneTapTitleScenario) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            final InterfaceC3978p0 l11 = n1.l(u11.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), u11);
            T value = l11.getValue();
            u11.o(-1069368707);
            boolean n11 = ((i12 & 112) == 32 || ((i12 & 64) != 0 && u11.F(onFetchingProgress))) | u11.n(l11) | u11.F(coroutineScope);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new Function1() { // from class: va.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        S0.M FetchUserData$lambda$3$lambda$2;
                        FetchUserData$lambda$3$lambda$2 = CommonKt.FetchUserData$lambda$3$lambda$2(InterfaceC3978p0.this, coroutineScope, onFetchingProgress, (N) obj);
                        return FetchUserData$lambda$3$lambda$2;
                    }
                };
                u11.x(C11);
            }
            u11.k();
            Q.b(value, oneTapTitleScenario, (Function1) C11, u11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: va.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FetchUserData$lambda$4;
                    int intValue = ((Integer) obj2).intValue();
                    OneTapTitleScenario oneTapTitleScenario2 = oneTapTitleScenario;
                    int i13 = i11;
                    FetchUserData$lambda$4 = CommonKt.FetchUserData$lambda$4(M.this, onFetchingProgress, oneTapTitleScenario2, i13, (InterfaceC3967k) obj, intValue);
                    return FetchUserData$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S0.M FetchUserData$lambda$3$lambda$2(A1 a12, final M m11, final OnFetchingProgress onFetchingProgress, N DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
        final AbstractC5434v lifecycle = ((J) a12.getValue()).getLifecycle();
        final G g10 = new G() { // from class: va.c
            @Override // androidx.lifecycle.G
            public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
                CommonKt.FetchUserData$lambda$3$lambda$2$lambda$0(kotlin.jvm.internal.M.this, m11, onFetchingProgress, j11, aVar);
            }
        };
        lifecycle.a(g10);
        return new S0.M() { // from class: com.vk.id.onetap.compose.button.CommonKt$FetchUserData$lambda$3$lambda$2$$inlined$onDispose$1
            @Override // S0.M
            public void dispose() {
                AbstractC5434v.this.e(g10);
                B0 b02 = (B0) m12.f71787a;
                if (b02 != null) {
                    b02.j(null);
                }
                onFetchingProgress.onDispose();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, xe.B0] */
    public static final void FetchUserData$lambda$3$lambda$2$lambda$0(kotlin.jvm.internal.M m11, M m12, OnFetchingProgress onFetchingProgress, J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (WhenMappings.$EnumSwitchMapping$0[event.ordinal()] == 1) {
            m11.f71787a = C10727i.c(m12, null, null, new CommonKt$FetchUserData$1$1$observer$1$1(onFetchingProgress, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FetchUserData$lambda$4(M m11, OnFetchingProgress onFetchingProgress, OneTapTitleScenario oneTapTitleScenario, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        FetchUserData(m11, onFetchingProgress, oneTapTitleScenario, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    @NotNull
    public static final e clickable(@NotNull e eVar, @NotNull final Function0<Unit> onClick) {
        e b11;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        b11 = c.b(eVar, C5236c1.a(), new InterfaceC6511n<e, InterfaceC3967k, Integer, e>() { // from class: com.vk.id.onetap.compose.button.CommonKt$clickable$1
            @Override // fd.InterfaceC6511n
            public /* bridge */ /* synthetic */ e invoke(e eVar2, InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(eVar2, interfaceC3967k, num.intValue());
            }

            public final e invoke(e composed, InterfaceC3967k interfaceC3967k, int i11) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                interfaceC3967k.o(1158531603);
                interfaceC3967k.o(-1824871726);
                Object C11 = interfaceC3967k.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = p.a();
                    interfaceC3967k.x(C11);
                }
                interfaceC3967k.k();
                e b12 = i.b(composed, (q) C11, d.c(VKIDButtonRippleStyleKt.asColor(InternalVKIDButtonRippleStyle.DARK)), false, null, I1.i.a(0), onClick, 12);
                interfaceC3967k.k();
                return b12;
            }
        });
        return b11;
    }

    @NotNull
    public static final InterfaceC8002m<Float> getEaseInOutAnimation() {
        return easeInOutAnimation;
    }

    public static final void startAuth(@NotNull M coroutineScope, @NotNull Function1<? super AccessToken, Unit> onAuth, @NotNull Function2<? super AuthCodeData, ? super Boolean, Unit> onAuthCode, @NotNull Function1<? super VKIDAuthFail, Unit> onFail, @NotNull VKIDAuthParams.Builder params, @NotNull Function1<? super kotlin.coroutines.d<? super VKIDAuthUiParams>, ? extends Object> onGetParams) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(onAuth, "onAuth");
        Intrinsics.checkNotNullParameter(onAuthCode, "onAuthCode");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(onGetParams, "onGetParams");
        C10727i.c(coroutineScope, null, null, new CommonKt$startAuth$2(onGetParams, params, onAuth, onAuthCode, onFail, null), 3);
    }

    public static /* synthetic */ void startAuth$default(M m11, Function1 function1, Function2 function2, Function1 function12, VKIDAuthParams.Builder builder, Function1 function13, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            builder = new VKIDAuthParams.Builder();
        }
        VKIDAuthParams.Builder builder2 = builder;
        if ((i11 & 32) != 0) {
            function13 = new CommonKt$startAuth$1(null);
        }
        startAuth(m11, function1, function2, function12, builder2, function13);
    }
}
