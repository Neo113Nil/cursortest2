package com.vk.id.onetap.compose.button.auth;

import A0.h;
import B0.C2510t;
import B1.InterfaceC2547p;
import B1.V;
import Bl0.C2652m;
import D1.InterfaceC2801g;
import Fr.g;
import K1.T;
import L60.b;
import P1.F;
import Pk0.f;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.D;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import Sc.s;
import T7.E;
import Wc.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vk.id.VKIDUser;
import com.vk.id.onetap.common.auth.style.InternalVKIDButtonStyle;
import com.vk.id.onetap.compose.button.CommonKt;
import com.vk.id.onetap.compose.button.OnFetchingProgress;
import com.vk.id.onetap.compose.button.auth.VKIDButtonKt;
import com.vk.id.onetap.compose.button.auth.VKIDButtonState;
import com.vk.id.onetap.compose.button.auth.style.VKIDButtonBackgroundStyleKt;
import com.vk.id.onetap.compose.button.auth.style.VKIDButtonBorderStyleKt;
import com.vk.id.onetap.compose.button.auth.style.VKIDButtonTextStyleKt;
import com.vk.id.onetap.compose.icon.VKIconKt;
import com.vk.id.onetap.compose.onetap.OneTapTitleScenario;
import com.vk.id.onetap.compose.onetap.style.OneTapButtonCornersStyleKt;
import com.vk.id.onetap.compose.onetap.style.OneTapButtonElevationStyleKt;
import com.vk.id.onetap.compose.onetap.style.OneTapButtonSizeStyleKt;
import com.vk.id.onetap.compose.progress.CircleProgressKt;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7825i0;
import m0.C7990g;
import m5.C8085h;
import oa.C8678a;
import org.jetbrains.annotations.NotNull;
import u0.C9891D;
import xe.M;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0004\u001aw\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001aE\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00062\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a2\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u0082@¢\u0006\u0004\b\u001e\u0010\u001f\u001a(\u0010 \u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b \u0010!\u001a\u0017\u0010\"\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\"\u0010#\u001a'\u0010$\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b$\u0010%\u001a'\u0010&\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b&\u0010'¨\u0006,²\u0006\f\u0010)\u001a\u00020(8\nX\u008a\u0084\u0002²\u0006\f\u0010*\u001a\u00020(8\nX\u008a\u0084\u0002²\u0006\f\u0010+\u001a\u00020(8\nX\u008a\u0084\u0002²\u0006\f\u0010+\u001a\u00020(8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle;", "style", "Lcom/vk/id/onetap/compose/button/auth/VKIDButtonState;", "state", "Lcom/vk/id/onetap/compose/button/auth/VKIDButtonTextProvider;", "textProvider", "Lkotlin/Function0;", "", "onClick", "Lkotlin/Function1;", "Lcom/vk/id/VKIDUser;", "onUserFetched", "", "fastAuthEnabled", "largeText", "Lcom/vk/id/onetap/compose/onetap/OneTapTitleScenario;", "scenario", "VKIDButton", "(Landroidx/compose/ui/e;Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle;Lcom/vk/id/onetap/compose/button/auth/VKIDButtonState;Lcom/vk/id/onetap/compose/button/auth/VKIDButtonTextProvider;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZZLcom/vk/id/onetap/compose/onetap/OneTapTitleScenario;LS0/k;II)V", "Lxe/M;", "coroutineScope", "buttonTextProvider", "FetchUserDataWithAnimation", "(Lxe/M;Lcom/vk/id/onetap/compose/button/auth/VKIDButtonState;Lcom/vk/id/onetap/compose/button/auth/VKIDButtonTextProvider;Lkotlin/jvm/functions/Function1;Lcom/vk/id/onetap/compose/onetap/OneTapTitleScenario;LS0/k;I)V", "", "newText", "newShortText", "newIconUrl", "animateFetchedUserIfNeeded", "(Lcom/vk/id/onetap/compose/button/auth/VKIDButtonState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "animateFailedUser", "(Lcom/vk/id/onetap/compose/button/auth/VKIDButtonState;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LeftIconBox", "(Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle;LS0/k;I)V", "TextBox", "(ZLcom/vk/id/onetap/compose/button/auth/VKIDButtonState;Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle;LS0/k;I)V", "RightIconBox", "(Lcom/vk/id/onetap/compose/button/auth/VKIDButtonState;Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle;Landroidx/compose/ui/e;LS0/k;I)V", "", "animatedSpaceWeight", "animatedRightIconWidthCompensation", "animatedAlpha", "onetap-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VKIDButtonKt {
    private static final void FetchUserDataWithAnimation(final M m11, final VKIDButtonState vKIDButtonState, final VKIDButtonTextProvider vKIDButtonTextProvider, final Function1<? super VKIDUser, Unit> function1, final OneTapTitleScenario oneTapTitleScenario, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-2086987740);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(m11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(vKIDButtonState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? u11.n(vKIDButtonTextProvider) : u11.F(vKIDButtonTextProvider) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function1) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.n(oneTapTitleScenario) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            CommonKt.FetchUserData(m11, new OnFetchingProgress() { // from class: com.vk.id.onetap.compose.button.auth.VKIDButtonKt$FetchUserDataWithAnimation$1
                @Override // com.vk.id.onetap.compose.button.OnFetchingProgress
                public void onDispose() {
                    VKIDButtonState.this.setInProgress$onetap_compose_release(false);
                }

                @Override // com.vk.id.onetap.compose.button.OnFetchingProgress
                public Object onFetched(VKIDUser vKIDUser, d<? super Unit> dVar) {
                    Object animateFailedUser;
                    Object animateFetchedUserIfNeeded;
                    function1.invoke(vKIDUser);
                    if (vKIDUser != null) {
                        animateFetchedUserIfNeeded = VKIDButtonKt.animateFetchedUserIfNeeded(VKIDButtonState.this, vKIDButtonTextProvider.userFoundText(vKIDUser, oneTapTitleScenario), vKIDButtonTextProvider.userFoundShortText(vKIDUser, oneTapTitleScenario), vKIDUser.getPhoto200(), dVar);
                        return animateFetchedUserIfNeeded == a.COROUTINE_SUSPENDED ? animateFetchedUserIfNeeded : Unit.f71690a;
                    }
                    animateFailedUser = VKIDButtonKt.animateFailedUser(VKIDButtonState.this, vKIDButtonTextProvider.noUserText(oneTapTitleScenario), vKIDButtonTextProvider.noUserShortText(oneTapTitleScenario), dVar);
                    return animateFailedUser == a.COROUTINE_SUSPENDED ? animateFailedUser : Unit.f71690a;
                }

                @Override // com.vk.id.onetap.compose.button.OnFetchingProgress
                public Object onPreFetch(d<? super Unit> dVar) {
                    if (VKIDButtonState.this.getUserIconUrl$onetap_compose_release() == null) {
                        VKIDButtonState.this.setRightIconVisible$onetap_compose_release(true);
                        VKIDButtonState.this.setInProgress$onetap_compose_release(true);
                    }
                    return Unit.f71690a;
                }
            }, oneTapTitleScenario, u11, ((i12 >> 6) & 896) | (i12 & 14));
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: xa.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FetchUserDataWithAnimation$lambda$9;
                    int intValue = ((Integer) obj2).intValue();
                    OneTapTitleScenario oneTapTitleScenario2 = oneTapTitleScenario;
                    int i13 = i11;
                    FetchUserDataWithAnimation$lambda$9 = VKIDButtonKt.FetchUserDataWithAnimation$lambda$9(M.this, vKIDButtonState, vKIDButtonTextProvider, function1, oneTapTitleScenario2, i13, (InterfaceC3967k) obj, intValue);
                    return FetchUserDataWithAnimation$lambda$9;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FetchUserDataWithAnimation$lambda$9(M m11, VKIDButtonState vKIDButtonState, VKIDButtonTextProvider vKIDButtonTextProvider, Function1 function1, OneTapTitleScenario oneTapTitleScenario, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        FetchUserDataWithAnimation(m11, vKIDButtonState, vKIDButtonTextProvider, function1, oneTapTitleScenario, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    private static final void LeftIconBox(final InternalVKIDButtonStyle internalVKIDButtonStyle, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(554197547);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(internalVKIDButtonStyle) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            e iconPadding = OneTapButtonSizeStyleKt.iconPadding(e.f40358c0, internalVKIDButtonStyle.getSizeStyle());
            V f7 = C5185h.f(InterfaceC6250b.a.h(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, iconPadding);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            VKIconKt.VKIcon(null, internalVKIDButtonStyle.getIconStyle(), u11, 0, 1);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: xa.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LeftIconBox$lambda$11;
                    int intValue = ((Integer) obj2).intValue();
                    LeftIconBox$lambda$11 = VKIDButtonKt.LeftIconBox$lambda$11(InternalVKIDButtonStyle.this, i11, (InterfaceC3967k) obj, intValue);
                    return LeftIconBox$lambda$11;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LeftIconBox$lambda$11(InternalVKIDButtonStyle internalVKIDButtonStyle, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        LeftIconBox(internalVKIDButtonStyle, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    private static final void RightIconBox(final VKIDButtonState vKIDButtonState, final InternalVKIDButtonStyle internalVKIDButtonStyle, final e eVar, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(627990944);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(vKIDButtonState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(internalVKIDButtonStyle) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            A1 b11 = C7990g.b(vKIDButtonState.getRightIconVisible$onetap_compose_release() ? 1.0f : 0.0f, CommonKt.getEaseInOutAnimation(), "rightIconAlpha", u11, 3072, 20);
            e iconPadding = OneTapButtonSizeStyleKt.iconPadding(eVar, internalVKIDButtonStyle.getSizeStyle());
            u11.o(1931239908);
            boolean n11 = u11.n(b11);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new D90.g(b11, 2);
                u11.x(C11);
            }
            u11.k();
            e a11 = androidx.compose.ui.graphics.a.a(iconPadding, (Function1) C11);
            V f7 = C5185h.f(InterfaceC6250b.a.f(), false);
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
                Ep.a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            if (vKIDButtonState.getInProgress$onetap_compose_release()) {
                u11.o(-708543902);
                CircleProgressKt.CircleProgress(internalVKIDButtonStyle.getProgressStyle(), u11, 0);
                u11.k();
            } else if (vKIDButtonState.getUserIconUrl$onetap_compose_release() != null) {
                u11.o(-708442873);
                C8085h.a(vKIDButtonState.getUserIconUrl$onetap_compose_release(), C6988h.a(e.f40358c0, h.e()), InterfaceC2547p.a.c(), u11, 1572912);
                u11.k();
            } else {
                u11.o(-708198562);
                u0.E.a(u11, a0.n(e.f40358c0, 24));
                u11.k();
            }
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: xa.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit RightIconBox$lambda$21;
                    int intValue = ((Integer) obj2).intValue();
                    androidx.compose.ui.e eVar2 = eVar;
                    int i13 = i11;
                    RightIconBox$lambda$21 = VKIDButtonKt.RightIconBox$lambda$21(VKIDButtonState.this, internalVKIDButtonStyle, eVar2, i13, (InterfaceC3967k) obj, intValue);
                    return RightIconBox$lambda$21;
                }
            });
        }
    }

    private static final float RightIconBox$lambda$17(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RightIconBox$lambda$19$lambda$18(A1 a12, InterfaceC7825i0 graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(RightIconBox$lambda$17(a12));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RightIconBox$lambda$21(VKIDButtonState vKIDButtonState, InternalVKIDButtonStyle internalVKIDButtonStyle, e eVar, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        RightIconBox(vKIDButtonState, internalVKIDButtonStyle, eVar, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    private static final void TextBox(final boolean z11, final VKIDButtonState vKIDButtonState, final InternalVKIDButtonStyle internalVKIDButtonStyle, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        F f7;
        C3969l u11 = interfaceC3967k.u(-72415207);
        if ((i11 & 6) == 0) {
            i12 = (u11.p(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(vKIDButtonState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(internalVKIDButtonStyle) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            A1 b11 = C7990g.b(vKIDButtonState.getTextVisible$onetap_compose_release() ? 1.0f : 0.0f, CommonKt.getEaseInOutAnimation(), "textAlpha", u11, 3072, 20);
            e c11 = a0.c(e.f40358c0);
            u11.o(-1549816084);
            boolean n11 = u11.n(b11);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new b(b11, 3);
                u11.x(C11);
            }
            u11.k();
            e a11 = androidx.compose.ui.graphics.a.a(c11, (Function1) C11);
            V f11 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, a11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f13 = E.f(u11, f11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f13);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            String text$onetap_compose_release = z11 ? vKIDButtonState.getText$onetap_compose_release() : vKIDButtonState.getShortText$onetap_compose_release();
            long asColorResource = VKIDButtonTextStyleKt.asColorResource(internalVKIDButtonStyle.getTextStyle(), u11, 0);
            long asFontSize = OneTapButtonSizeStyleKt.asFontSize(internalVKIDButtonStyle.getSizeStyle());
            long asLineHeight = OneTapButtonSizeStyleKt.asLineHeight(internalVKIDButtonStyle.getSizeStyle());
            f7 = F.f21510h;
            C2510t.b(text$onetap_compose_release, null, new T(asColorResource, asFontSize, f7, null, 0L, 3, asLineHeight, null, 0, 16613368), null, 0, false, 0, 0, null, u11, 0, 506);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: xa.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextBox$lambda$16;
                    int intValue = ((Integer) obj2).intValue();
                    InternalVKIDButtonStyle internalVKIDButtonStyle2 = internalVKIDButtonStyle;
                    int i13 = i11;
                    TextBox$lambda$16 = VKIDButtonKt.TextBox$lambda$16(z11, vKIDButtonState, internalVKIDButtonStyle2, i13, (InterfaceC3967k) obj, intValue);
                    return TextBox$lambda$16;
                }
            });
        }
    }

    private static final float TextBox$lambda$12(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextBox$lambda$14$lambda$13(A1 a12, InterfaceC7825i0 graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(TextBox$lambda$12(a12));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextBox$lambda$16(boolean z11, VKIDButtonState vKIDButtonState, InternalVKIDButtonStyle internalVKIDButtonStyle, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        TextBox(z11, vKIDButtonState, internalVKIDButtonStyle, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0265  */
    @SuppressLint({"RememberReturnType"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VKIDButton(e eVar, InternalVKIDButtonStyle internalVKIDButtonStyle, @NotNull final VKIDButtonState state, VKIDButtonTextProvider vKIDButtonTextProvider, @NotNull final Function0<Unit> onClick, Function1<? super VKIDUser, Unit> function1, final boolean z11, boolean z12, @NotNull final OneTapTitleScenario scenario, InterfaceC3967k interfaceC3967k, final int i11, final int i12) {
        e eVar2;
        int i13;
        InternalVKIDButtonStyle internalVKIDButtonStyle2;
        Function1<? super VKIDUser, Unit> function12;
        int i14;
        Function1<? super VKIDUser, Unit> function13;
        boolean z13;
        e eVar3;
        VKIDButtonTextProvider vKIDButtonTextProvider2;
        int i15;
        Function1<? super VKIDUser, Unit> function14;
        InternalVKIDButtonStyle internalVKIDButtonStyle3;
        VKIDButtonTextProvider vKIDButtonTextProvider3;
        boolean z14;
        Object C11;
        boolean z15;
        int I11;
        int I12;
        final boolean z16;
        final InternalVKIDButtonStyle internalVKIDButtonStyle4;
        final VKIDButtonTextProvider vKIDButtonTextProvider4;
        final Function1<? super VKIDUser, Unit> function15;
        J0 m02;
        int i16;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        C3969l u11 = interfaceC3967k.u(1258393006);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i12 & 2) == 0) {
                internalVKIDButtonStyle2 = internalVKIDButtonStyle;
                if (u11.n(internalVKIDButtonStyle2)) {
                    i16 = 32;
                    i13 |= i16;
                }
            } else {
                internalVKIDButtonStyle2 = internalVKIDButtonStyle;
            }
            i16 = 16;
            i13 |= i16;
        } else {
            internalVKIDButtonStyle2 = internalVKIDButtonStyle;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(state) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i18 = i12 & 8;
        if (i18 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= (i11 & 4096) == 0 ? u11.n(vKIDButtonTextProvider) : u11.F(vKIDButtonTextProvider) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i13 |= u11.F(onClick) ? 16384 : 8192;
        }
        int i19 = i12 & 32;
        if (i19 != 0) {
            i13 |= 196608;
        } else if ((196608 & i11) == 0) {
            function12 = function1;
            i13 |= u11.F(function12) ? 131072 : 65536;
            if ((i12 & 64) == 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                i13 |= u11.p(z11) ? 1048576 : 524288;
            }
            i14 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i14 == 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                i13 |= u11.p(z12) ? 8388608 : 4194304;
            }
            if ((i12 & 256) == 0) {
                i13 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                i13 |= u11.n(scenario) ? 67108864 : 33554432;
            }
            if ((i13 & 38347923) == 38347922 || !u11.b()) {
                u11.Q0();
                if ((i11 & 1) != 0 || u11.w0()) {
                    e eVar4 = i17 == 0 ? e.f40358c0 : eVar2;
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                        internalVKIDButtonStyle2 = new InternalVKIDButtonStyle.Light(null, null, null, 7, null);
                    }
                    VKIDButtonTextProvider vKIDButtonTextProvider5 = i18 == 0 ? null : vKIDButtonTextProvider;
                    if (i19 == 0) {
                        u11.o(1782920084);
                        Object C12 = u11.C();
                        if (C12 == InterfaceC3967k.a.a()) {
                            C12 = new C8678a(2);
                            u11.x(C12);
                        }
                        function13 = (Function1) C12;
                        u11.k();
                    } else {
                        function13 = function12;
                    }
                    if (i14 == 0) {
                        eVar3 = eVar4;
                        vKIDButtonTextProvider2 = vKIDButtonTextProvider5;
                        i15 = i13;
                        function14 = function13;
                        z13 = true;
                    } else {
                        z13 = z12;
                        eVar3 = eVar4;
                        vKIDButtonTextProvider2 = vKIDButtonTextProvider5;
                        i15 = i13;
                        function14 = function13;
                    }
                    internalVKIDButtonStyle3 = internalVKIDButtonStyle2;
                } else {
                    u11.j();
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                    }
                    vKIDButtonTextProvider2 = vKIDButtonTextProvider;
                    z13 = z12;
                    eVar3 = eVar2;
                    i15 = i13;
                    internalVKIDButtonStyle3 = internalVKIDButtonStyle2;
                    function14 = function12;
                }
                u11.j0();
                Resources resources = ((Context) u11.m(AndroidCompositionLocals_androidKt.d())).getResources();
                u11.o(1782925933);
                if (vKIDButtonTextProvider2 != null) {
                    u11.o(1782926429);
                    Object C13 = u11.C();
                    if (C13 == InterfaceC3967k.a.a()) {
                        Intrinsics.f(resources);
                        C13 = new DefaultTextProvider(resources);
                        u11.x(C13);
                    }
                    vKIDButtonTextProvider3 = (DefaultTextProvider) C13;
                    u11.k();
                } else {
                    vKIDButtonTextProvider3 = vKIDButtonTextProvider2;
                }
                u11.k();
                u11.o(1782929354);
                z14 = (i15 & 234881024) != 67108864;
                Object C14 = u11.C();
                if (!z14 || C14 == InterfaceC3967k.a.a()) {
                    state.setText$onetap_compose_release(vKIDButtonTextProvider3.noUserText(scenario));
                    state.setShortText$onetap_compose_release(vKIDButtonTextProvider3.noUserShortText(scenario));
                    u11.x(Unit.f71690a);
                }
                u11.k();
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = f.b(Q.j(kotlin.coroutines.g.f71771a, u11), u11);
                }
                M a11 = ((D) C11).a();
                u11.o(1782935954);
                if (z11) {
                    z15 = true;
                } else {
                    z15 = true;
                    FetchUserDataWithAnimation(a11, state, vKIDButtonTextProvider3, function14, scenario, u11, ((i15 >> 12) & 57344) | ((i15 >> 6) & 7168) | ((i15 >> 3) & 112));
                }
                u11.k();
                e clickable = CommonKt.clickable(VKIDButtonBackgroundStyleKt.background(C6988h.b(OneTapButtonCornersStyleKt.clip(VKIDButtonBorderStyleKt.border(OneTapButtonSizeStyleKt.height(OneTapButtonElevationStyleKt.shadow(eVar3, internalVKIDButtonStyle3), internalVKIDButtonStyle3.getSizeStyle()), internalVKIDButtonStyle3.getBorderStyle(), internalVKIDButtonStyle3.getCornersStyle()), internalVKIDButtonStyle3.getCornersStyle())), internalVKIDButtonStyle3.getBackgroundStyle()), onClick);
                V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f11 = c.f(u11, clickable);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 f12 = E.f(u11, f7, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    Ep.a.d(I11, u11, I11, f12);
                }
                F1.b(u11, f11, InterfaceC2801g.a.f());
                boolean z17 = z13;
                InternalVKIDButtonStyle internalVKIDButtonStyle5 = internalVKIDButtonStyle3;
                A1 b11 = C7990g.b(!state.getUserLoadFailed$onetap_compose_release() ? 0.001f : 0.999f, CommonKt.getEaseInOutAnimation(), "iconWeight", u11, 3072, 20);
                float f13 = 2;
                float iconPadding = (OneTapButtonSizeStyleKt.iconPadding(internalVKIDButtonStyle5.getSizeStyle()) * f13) + 28.0f;
                if (state.getUserLoadFailed$onetap_compose_release()) {
                    iconPadding /= f13;
                }
                A1 b12 = C7990g.b(iconPadding, CommonKt.getEaseInOutAnimation(), "rightIconCompensation", u11, 3072, 20);
                e.a aVar = e.f40358c0;
                e d12 = a0.d(aVar);
                Y b13 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
                I12 = u11.I();
                A0 d13 = u11.d();
                e f14 = c.f(u11, d12);
                Function1<? super VKIDUser, Unit> function16 = function14;
                Function0 a13 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a13);
                }
                Function2 h11 = Cm.e.h(u11, b13, u11, d13);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    Ep.a.d(I12, u11, I12, h11);
                }
                F1.b(u11, f14, InterfaceC2801g.a.f());
                C9891D c9891d = C9891D.f99599a;
                u0.E.a(u11, c9891d.a(aVar, 1.0f - VKIDButton$lambda$7$lambda$4(b11), true));
                u0.E.a(u11, a0.r(aVar, (1 - VKIDButton$lambda$7$lambda$4(b11)) * VKIDButton$lambda$7$lambda$5(b12)));
                int i21 = i15 >> 3;
                LeftIconBox(internalVKIDButtonStyle5, u11, i21 & 14);
                u0.E.a(u11, c9891d.a(aVar, VKIDButton$lambda$7$lambda$4(b11), true));
                TextBox(z17, state, internalVKIDButtonStyle5, u11, (i21 & 112) | ((i15 >> 21) & 14) | ((i15 << 3) & 896));
                u0.E.a(u11, c9891d.a(aVar, VKIDButton$lambda$7$lambda$4(b11), true));
                u0.E.a(u11, c9891d.a(aVar, 1.0f - VKIDButton$lambda$7$lambda$4(b11), true));
                RightIconBox(state, internalVKIDButtonStyle5, aVar, u11, ((i15 >> 6) & 14) | 384 | (i15 & 112));
                u11.f();
                u11.f();
                z16 = z17;
                internalVKIDButtonStyle4 = internalVKIDButtonStyle5;
                vKIDButtonTextProvider4 = vKIDButtonTextProvider2;
                function15 = function16;
            } else {
                u11.j();
                vKIDButtonTextProvider4 = vKIDButtonTextProvider;
                z16 = z12;
                eVar3 = eVar2;
                internalVKIDButtonStyle4 = internalVKIDButtonStyle2;
                function15 = function12;
            }
            m02 = u11.m0();
            if (m02 == null) {
                final e eVar5 = eVar3;
                m02.G(new Function2() { // from class: xa.a
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit VKIDButton$lambda$8;
                        int intValue = ((Integer) obj2).intValue();
                        int i22 = i11;
                        int i23 = i12;
                        VKIDButton$lambda$8 = VKIDButtonKt.VKIDButton$lambda$8(androidx.compose.ui.e.this, internalVKIDButtonStyle4, state, vKIDButtonTextProvider4, onClick, function15, z11, z16, scenario, i22, i23, (InterfaceC3967k) obj, intValue);
                        return VKIDButton$lambda$8;
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        if ((i12 & 64) == 0) {
        }
        i14 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i14 == 0) {
        }
        if ((i12 & 256) == 0) {
        }
        if ((i13 & 38347923) == 38347922) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i17 == 0) {
        }
        if ((i12 & 2) != 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if (i14 == 0) {
        }
        internalVKIDButtonStyle3 = internalVKIDButtonStyle2;
        u11.j0();
        Resources resources2 = ((Context) u11.m(AndroidCompositionLocals_androidKt.d())).getResources();
        u11.o(1782925933);
        if (vKIDButtonTextProvider2 != null) {
        }
        u11.k();
        u11.o(1782929354);
        if ((i15 & 234881024) != 67108864) {
        }
        Object C142 = u11.C();
        if (!z14) {
        }
        state.setText$onetap_compose_release(vKIDButtonTextProvider3.noUserText(scenario));
        state.setShortText$onetap_compose_release(vKIDButtonTextProvider3.noUserShortText(scenario));
        u11.x(Unit.f71690a);
        u11.k();
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        M a112 = ((D) C11).a();
        u11.o(1782935954);
        if (z11) {
        }
        u11.k();
        e clickable2 = CommonKt.clickable(VKIDButtonBackgroundStyleKt.background(C6988h.b(OneTapButtonCornersStyleKt.clip(VKIDButtonBorderStyleKt.border(OneTapButtonSizeStyleKt.height(OneTapButtonElevationStyleKt.shadow(eVar3, internalVKIDButtonStyle3), internalVKIDButtonStyle3.getSizeStyle()), internalVKIDButtonStyle3.getBorderStyle(), internalVKIDButtonStyle3.getCornersStyle()), internalVKIDButtonStyle3.getCornersStyle())), internalVKIDButtonStyle3.getBackgroundStyle()), onClick);
        V f72 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f112 = c.f(u11, clickable2);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f122 = E.f(u11, f72, u11, d112);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, f122);
        F1.b(u11, f112, InterfaceC2801g.a.f());
        boolean z172 = z13;
        InternalVKIDButtonStyle internalVKIDButtonStyle52 = internalVKIDButtonStyle3;
        A1 b112 = C7990g.b(!state.getUserLoadFailed$onetap_compose_release() ? 0.001f : 0.999f, CommonKt.getEaseInOutAnimation(), "iconWeight", u11, 3072, 20);
        float f132 = 2;
        float iconPadding2 = (OneTapButtonSizeStyleKt.iconPadding(internalVKIDButtonStyle52.getSizeStyle()) * f132) + 28.0f;
        if (state.getUserLoadFailed$onetap_compose_release()) {
        }
        A1 b122 = C7990g.b(iconPadding2, CommonKt.getEaseInOutAnimation(), "rightIconCompensation", u11, 3072, 20);
        e.a aVar2 = e.f40358c0;
        e d122 = a0.d(aVar2);
        Y b132 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
        I12 = u11.I();
        A0 d132 = u11.d();
        e f142 = c.f(u11, d122);
        Function1<? super VKIDUser, Unit> function162 = function14;
        Function0 a132 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 h112 = Cm.e.h(u11, b132, u11, d132);
        if (!u11.t()) {
        }
        Ep.a.d(I12, u11, I12, h112);
        F1.b(u11, f142, InterfaceC2801g.a.f());
        C9891D c9891d2 = C9891D.f99599a;
        u0.E.a(u11, c9891d2.a(aVar2, 1.0f - VKIDButton$lambda$7$lambda$4(b112), true));
        u0.E.a(u11, a0.r(aVar2, (1 - VKIDButton$lambda$7$lambda$4(b112)) * VKIDButton$lambda$7$lambda$5(b122)));
        int i212 = i15 >> 3;
        LeftIconBox(internalVKIDButtonStyle52, u11, i212 & 14);
        u0.E.a(u11, c9891d2.a(aVar2, VKIDButton$lambda$7$lambda$4(b112), true));
        TextBox(z172, state, internalVKIDButtonStyle52, u11, (i212 & 112) | ((i15 >> 21) & 14) | ((i15 << 3) & 896));
        u0.E.a(u11, c9891d2.a(aVar2, VKIDButton$lambda$7$lambda$4(b112), true));
        u0.E.a(u11, c9891d2.a(aVar2, 1.0f - VKIDButton$lambda$7$lambda$4(b112), true));
        RightIconBox(state, internalVKIDButtonStyle52, aVar2, u11, ((i15 >> 6) & 14) | 384 | (i15 & 112));
        u11.f();
        u11.f();
        z16 = z172;
        internalVKIDButtonStyle4 = internalVKIDButtonStyle52;
        vKIDButtonTextProvider4 = vKIDButtonTextProvider2;
        function15 = function162;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VKIDButton$lambda$1$lambda$0(VKIDUser vKIDUser) {
        return Unit.f71690a;
    }

    private static final float VKIDButton$lambda$7$lambda$4(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    private static final float VKIDButton$lambda$7$lambda$5(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VKIDButton$lambda$8(e eVar, InternalVKIDButtonStyle internalVKIDButtonStyle, VKIDButtonState vKIDButtonState, VKIDButtonTextProvider vKIDButtonTextProvider, Function0 function0, Function1 function1, boolean z11, boolean z12, OneTapTitleScenario oneTapTitleScenario, int i11, int i12, InterfaceC3967k interfaceC3967k, int i13) {
        VKIDButton(eVar, internalVKIDButtonStyle, vKIDButtonState, vKIDButtonTextProvider, function0, function1, z11, z12, oneTapTitleScenario, interfaceC3967k, C2652m.e(i11 | 1), i12);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (xe.Y.b(100, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (xe.Y.b(300, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animateFailedUser(VKIDButtonState vKIDButtonState, String str, String str2, d<? super Unit> dVar) {
        VKIDButtonKt$animateFailedUser$1 vKIDButtonKt$animateFailedUser$1;
        int i11;
        if (dVar instanceof VKIDButtonKt$animateFailedUser$1) {
            vKIDButtonKt$animateFailedUser$1 = (VKIDButtonKt$animateFailedUser$1) dVar;
            int i12 = vKIDButtonKt$animateFailedUser$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                vKIDButtonKt$animateFailedUser$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = vKIDButtonKt$animateFailedUser$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = vKIDButtonKt$animateFailedUser$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    vKIDButtonState.setText$onetap_compose_release(str);
                    vKIDButtonState.setShortText$onetap_compose_release(str2);
                    vKIDButtonState.setRightIconVisible$onetap_compose_release(false);
                    vKIDButtonKt$animateFailedUser$1.L$0 = vKIDButtonState;
                    vKIDButtonKt$animateFailedUser$1.label = 1;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        vKIDButtonState = (VKIDButtonState) vKIDButtonKt$animateFailedUser$1.L$0;
                        s.b(obj);
                        vKIDButtonState.setInProgress$onetap_compose_release(false);
                        vKIDButtonState.setUserLoadFailed$onetap_compose_release(true);
                        return Unit.f71690a;
                    }
                    vKIDButtonState = (VKIDButtonState) vKIDButtonKt$animateFailedUser$1.L$0;
                    s.b(obj);
                }
                vKIDButtonKt$animateFailedUser$1.L$0 = vKIDButtonState;
                vKIDButtonKt$animateFailedUser$1.label = 2;
            }
        }
        vKIDButtonKt$animateFailedUser$1 = new VKIDButtonKt$animateFailedUser$1(dVar);
        Object obj2 = vKIDButtonKt$animateFailedUser$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = vKIDButtonKt$animateFailedUser$1.label;
        if (i11 != 0) {
        }
        vKIDButtonKt$animateFailedUser$1.L$0 = vKIDButtonState;
        vKIDButtonKt$animateFailedUser$1.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (xe.Y.b(300, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animateFetchedUserIfNeeded(VKIDButtonState vKIDButtonState, String str, String str2, String str3, d<? super Unit> dVar) {
        VKIDButtonKt$animateFetchedUserIfNeeded$1 vKIDButtonKt$animateFetchedUserIfNeeded$1;
        a aVar;
        int i11;
        VKIDButtonState vKIDButtonState2;
        String str4;
        if (dVar instanceof VKIDButtonKt$animateFetchedUserIfNeeded$1) {
            vKIDButtonKt$animateFetchedUserIfNeeded$1 = (VKIDButtonKt$animateFetchedUserIfNeeded$1) dVar;
            int i12 = vKIDButtonKt$animateFetchedUserIfNeeded$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                vKIDButtonKt$animateFetchedUserIfNeeded$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = vKIDButtonKt$animateFetchedUserIfNeeded$1.result;
                aVar = a.COROUTINE_SUSPENDED;
                i11 = vKIDButtonKt$animateFetchedUserIfNeeded$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    if (!Intrinsics.d(vKIDButtonState.getText$onetap_compose_release(), str) || !Intrinsics.d(vKIDButtonState.getShortText$onetap_compose_release(), str2) || !Intrinsics.d(vKIDButtonState.getUserIconUrl$onetap_compose_release(), str3)) {
                        vKIDButtonState.setTextVisible$onetap_compose_release(false);
                        vKIDButtonState.setRightIconVisible$onetap_compose_release(false);
                        vKIDButtonKt$animateFetchedUserIfNeeded$1.L$0 = vKIDButtonState;
                        vKIDButtonKt$animateFetchedUserIfNeeded$1.L$1 = str;
                        vKIDButtonKt$animateFetchedUserIfNeeded$1.L$2 = str2;
                        vKIDButtonKt$animateFetchedUserIfNeeded$1.L$3 = str3;
                        vKIDButtonKt$animateFetchedUserIfNeeded$1.label = 1;
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str4 = (String) vKIDButtonKt$animateFetchedUserIfNeeded$1.L$2;
                    str = (String) vKIDButtonKt$animateFetchedUserIfNeeded$1.L$1;
                    vKIDButtonState2 = (VKIDButtonState) vKIDButtonKt$animateFetchedUserIfNeeded$1.L$0;
                    s.b(obj);
                    vKIDButtonState2.setText$onetap_compose_release(str);
                    vKIDButtonState2.setShortText$onetap_compose_release(str4);
                    vKIDButtonState2.setUserLoadFailed$onetap_compose_release(false);
                    vKIDButtonState2.setTextVisible$onetap_compose_release(true);
                    vKIDButtonState2.setRightIconVisible$onetap_compose_release(true);
                    return Unit.f71690a;
                }
                str3 = (String) vKIDButtonKt$animateFetchedUserIfNeeded$1.L$3;
                str2 = (String) vKIDButtonKt$animateFetchedUserIfNeeded$1.L$2;
                str = (String) vKIDButtonKt$animateFetchedUserIfNeeded$1.L$1;
                vKIDButtonState = (VKIDButtonState) vKIDButtonKt$animateFetchedUserIfNeeded$1.L$0;
                s.b(obj);
                vKIDButtonState.setInProgress$onetap_compose_release(false);
                vKIDButtonState.setUserIconUrl$onetap_compose_release(str3);
                vKIDButtonKt$animateFetchedUserIfNeeded$1.L$0 = vKIDButtonState;
                vKIDButtonKt$animateFetchedUserIfNeeded$1.L$1 = str;
                vKIDButtonKt$animateFetchedUserIfNeeded$1.L$2 = str2;
                vKIDButtonKt$animateFetchedUserIfNeeded$1.L$3 = null;
                vKIDButtonKt$animateFetchedUserIfNeeded$1.label = 2;
                if (xe.Y.b(100L, vKIDButtonKt$animateFetchedUserIfNeeded$1) != aVar) {
                    String str5 = str2;
                    vKIDButtonState2 = vKIDButtonState;
                    str4 = str5;
                    vKIDButtonState2.setText$onetap_compose_release(str);
                    vKIDButtonState2.setShortText$onetap_compose_release(str4);
                    vKIDButtonState2.setUserLoadFailed$onetap_compose_release(false);
                    vKIDButtonState2.setTextVisible$onetap_compose_release(true);
                    vKIDButtonState2.setRightIconVisible$onetap_compose_release(true);
                    return Unit.f71690a;
                }
                return aVar;
            }
        }
        vKIDButtonKt$animateFetchedUserIfNeeded$1 = new VKIDButtonKt$animateFetchedUserIfNeeded$1(dVar);
        Object obj2 = vKIDButtonKt$animateFetchedUserIfNeeded$1.result;
        aVar = a.COROUTINE_SUSPENDED;
        i11 = vKIDButtonKt$animateFetchedUserIfNeeded$1.label;
        if (i11 != 0) {
        }
        vKIDButtonState.setInProgress$onetap_compose_release(false);
        vKIDButtonState.setUserIconUrl$onetap_compose_release(str3);
        vKIDButtonKt$animateFetchedUserIfNeeded$1.L$0 = vKIDButtonState;
        vKIDButtonKt$animateFetchedUserIfNeeded$1.L$1 = str;
        vKIDButtonKt$animateFetchedUserIfNeeded$1.L$2 = str2;
        vKIDButtonKt$animateFetchedUserIfNeeded$1.L$3 = null;
        vKIDButtonKt$animateFetchedUserIfNeeded$1.label = 2;
        if (xe.Y.b(100L, vKIDButtonKt$animateFetchedUserIfNeeded$1) != aVar) {
        }
        return aVar;
    }
}
