package com.vk.id.onetap.compose.button.auth;

import A0.h;
import B1.InterfaceC2547p;
import B1.V;
import B90.h0;
import Bl0.C2652m;
import C90.d;
import Ca.p;
import Ca.q;
import Ca.r;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import Pk0.f;
import S0.A0;
import S0.C3969l;
import S0.D;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import T7.E;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import coil.compose.AsyncImagePainter;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vk.id.VKIDUser;
import com.vk.id.onetap.common.auth.style.InternalVKIDButtonStyle;
import com.vk.id.onetap.compose.button.CommonKt;
import com.vk.id.onetap.compose.button.OnFetchingProgress;
import com.vk.id.onetap.compose.button.auth.VKIDButtonSmallKt;
import com.vk.id.onetap.compose.button.auth.VKIDSmallButtonState;
import com.vk.id.onetap.compose.button.auth.style.VKIDButtonBackgroundStyleKt;
import com.vk.id.onetap.compose.button.auth.style.VKIDButtonBorderStyleKt;
import com.vk.id.onetap.compose.icon.VKIconKt;
import com.vk.id.onetap.compose.onetap.style.OneTapButtonCornersStyleKt;
import com.vk.id.onetap.compose.onetap.style.OneTapButtonElevationStyleKt;
import com.vk.id.onetap.compose.onetap.style.OneTapButtonSizeStyleKt;
import com.vk.id.onetap.compose.progress.CircleProgressKt;
import e1.InterfaceC6250b;
import e1.d;
import ka.C7623a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7825i0;
import m0.C7980b;
import m0.C7984d;
import m0.C8008p;
import m5.C8085h;
import n5.EnumC8444d;
import org.jetbrains.annotations.NotNull;
import xe.M;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aQ\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001aG\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001aG\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/vk/id/onetap/compose/button/auth/VKIDSmallButtonState;", "state", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle;", "style", "Lkotlin/Function0;", "", "onClick", "Lkotlin/Function1;", "Lcom/vk/id/VKIDUser;", "onUserFetched", "", "fastAuthEnabled", "VKIDButtonSmall", "(Lcom/vk/id/onetap/compose/button/auth/VKIDSmallButtonState;Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZLS0/k;II)V", "Lm0/b;", "", "Lm0/p;", "animatedOffsetXVkIcon", "animatedOffsetXUserIcon", "LZ1/q;", "size", "SmallButtonAnimation-J5j9r9c", "(Lcom/vk/id/onetap/compose/button/auth/VKIDSmallButtonState;Lm0/b;Lm0/b;JLS0/k;I)V", "SmallButtonAnimation", "SmallButtonContent", "(Lcom/vk/id/onetap/compose/button/auth/VKIDSmallButtonState;Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle;Lm0/b;Lm0/b;LS0/k;I)V", "onetap-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VKIDButtonSmallKt {
    /* renamed from: SmallButtonAnimation-J5j9r9c, reason: not valid java name */
    private static final void m53SmallButtonAnimationJ5j9r9c(final VKIDSmallButtonState vKIDSmallButtonState, final C7980b<Float, C8008p> c7980b, final C7980b<Float, C8008p> c7980b2, final long j11, InterfaceC3967k interfaceC3967k, final int i11) {
        VKIDSmallButtonState vKIDSmallButtonState2;
        int i12;
        C3969l u11 = interfaceC3967k.u(1609671536);
        if ((i11 & 6) == 0) {
            vKIDSmallButtonState2 = vKIDSmallButtonState;
            i12 = (u11.n(vKIDSmallButtonState2) ? 4 : 2) | i11;
        } else {
            vKIDSmallButtonState2 = vKIDSmallButtonState;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(c7980b) : u11.F(c7980b) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? u11.n(c7980b2) : u11.F(c7980b2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.s(j11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            Boolean valueOf = Boolean.valueOf(vKIDSmallButtonState2.getUserIconLoaded$onetap_compose_release());
            Boolean valueOf2 = Boolean.valueOf(vKIDSmallButtonState2.getUserIconLoading$onetap_compose_release());
            u11.o(1750804376);
            boolean z11 = ((i12 & 14) == 4) | ((i12 & 896) == 256 || ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 && u11.F(c7980b2))) | ((i12 & 112) == 32 || ((i12 & 64) != 0 && u11.F(c7980b))) | ((i12 & 7168) == 2048);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                VKIDButtonSmallKt$SmallButtonAnimation$1$1 vKIDButtonSmallKt$SmallButtonAnimation$1$1 = new VKIDButtonSmallKt$SmallButtonAnimation$1$1(vKIDSmallButtonState, c7980b2, j11, c7980b, null);
                u11.x(vKIDButtonSmallKt$SmallButtonAnimation$1$1);
                C11 = vKIDButtonSmallKt$SmallButtonAnimation$1$1;
            }
            u11.k();
            Q.g(valueOf, valueOf2, (Function2) C11, u11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: xa.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SmallButtonAnimation_J5j9r9c$lambda$13;
                    int intValue = ((Integer) obj2).intValue();
                    long j12 = j11;
                    int i13 = i11;
                    SmallButtonAnimation_J5j9r9c$lambda$13 = VKIDButtonSmallKt.SmallButtonAnimation_J5j9r9c$lambda$13(VKIDSmallButtonState.this, c7980b, c7980b2, j12, i13, (InterfaceC3967k) obj, intValue);
                    return SmallButtonAnimation_J5j9r9c$lambda$13;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SmallButtonAnimation_J5j9r9c$lambda$13(VKIDSmallButtonState vKIDSmallButtonState, C7980b c7980b, C7980b c7980b2, long j11, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        m53SmallButtonAnimationJ5j9r9c(vKIDSmallButtonState, c7980b, c7980b2, j11, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    private static final void SmallButtonContent(VKIDSmallButtonState vKIDSmallButtonState, InternalVKIDButtonStyle internalVKIDButtonStyle, C7980b<Float, C8008p> c7980b, C7980b<Float, C8008p> c7980b2, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-2086317859);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(vKIDSmallButtonState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(internalVKIDButtonStyle) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? u11.n(c7980b) : u11.F(c7980b) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= (i11 & 4096) == 0 ? u11.n(c7980b2) : u11.F(c7980b2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            e f7 = T.f(aVar, 8);
            V f11 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, f7);
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
            if (vKIDSmallButtonState.getInProgress$onetap_compose_release()) {
                u11.o(1401440024);
                CircleProgressKt.CircleProgress(internalVKIDButtonStyle.getProgressStyle(), u11, 0);
                u11.k();
            } else {
                u11.o(1401534078);
                e n11 = a0.n(aVar, 28);
                u11.o(-647522814);
                boolean z11 = (i12 & 896) == 256 || ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 && u11.F(c7980b));
                Object C11 = u11.C();
                if (z11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new p(c7980b, 2);
                    u11.x(C11);
                }
                u11.k();
                VKIconKt.VKIcon(androidx.compose.ui.graphics.a.a(n11, (Function1) C11), internalVKIDButtonStyle.getIconStyle(), u11, 0, 0);
                String userIconUrl$onetap_compose_release = vKIDSmallButtonState.getUserIconUrl$onetap_compose_release();
                u11.o(-647513445);
                boolean z12 = (i12 & 7168) == 2048 || ((i12 & 4096) != 0 && u11.F(c7980b2));
                Object C12 = u11.C();
                if (z12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new q(c7980b2, 2);
                    u11.x(C12);
                }
                u11.k();
                e a12 = androidx.compose.ui.graphics.a.a(aVar, (Function1) C12);
                InterfaceC2547p.a.b b11 = InterfaceC2547p.a.b();
                u11.o(-647505293);
                int i13 = i12 & 14;
                boolean z13 = i13 == 4;
                Object C13 = u11.C();
                if (z13 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new r(vKIDSmallButtonState, 3);
                    u11.x(C13);
                }
                Function1 function1 = (Function1) C13;
                u11.k();
                u11.o(-647502007);
                boolean z14 = i13 == 4;
                Object C14 = u11.C();
                if (z14 || C14 == InterfaceC3967k.a.a()) {
                    C14 = new d(vKIDSmallButtonState, 5);
                    u11.x(C14);
                }
                u11.k();
                C8085h.b(userIconUrl$onetap_compose_release, a12, function1, (Function1) C14, b11, u11, 48);
                u11.k();
            }
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C7623a(vKIDSmallButtonState, internalVKIDButtonStyle, c7980b, c7980b2, i11, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SmallButtonContent$lambda$22$lambda$15$lambda$14(C7980b c7980b, InterfaceC7825i0 graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.n(((Number) c7980b.k()).floatValue());
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SmallButtonContent$lambda$22$lambda$17$lambda$16(C7980b c7980b, InterfaceC7825i0 graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.n(((Number) c7980b.k()).floatValue());
        graphicsLayer.x(true);
        graphicsLayer.setShape(h.e());
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SmallButtonContent$lambda$22$lambda$19$lambda$18(VKIDSmallButtonState vKIDSmallButtonState, AsyncImagePainter.State.Loading it) {
        Intrinsics.checkNotNullParameter(it, "it");
        vKIDSmallButtonState.setUserIconLoading$onetap_compose_release(true);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SmallButtonContent$lambda$22$lambda$21$lambda$20(VKIDSmallButtonState vKIDSmallButtonState, AsyncImagePainter.State.Success it) {
        Intrinsics.checkNotNullParameter(it, "it");
        vKIDSmallButtonState.setUserIconLoading$onetap_compose_release(false);
        if (it.getF57229a().c() != EnumC8444d.MEMORY_CACHE) {
            vKIDSmallButtonState.setUserIconLoaded$onetap_compose_release(true);
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SmallButtonContent$lambda$23(VKIDSmallButtonState vKIDSmallButtonState, InternalVKIDButtonStyle internalVKIDButtonStyle, C7980b c7980b, C7980b c7980b2, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        SmallButtonContent(vKIDSmallButtonState, internalVKIDButtonStyle, c7980b, c7980b2, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VKIDButtonSmall(VKIDSmallButtonState vKIDSmallButtonState, InternalVKIDButtonStyle internalVKIDButtonStyle, @NotNull final Function0<Unit> onClick, Function1<? super VKIDUser, Unit> function1, final boolean z11, InterfaceC3967k interfaceC3967k, final int i11, final int i12) {
        VKIDSmallButtonState vKIDSmallButtonState2;
        int i13;
        InternalVKIDButtonStyle internalVKIDButtonStyle2;
        Function1<? super VKIDUser, Unit> function12;
        final Function1<? super VKIDUser, Unit> function13;
        final VKIDSmallButtonState vKIDSmallButtonState3;
        int i14;
        InternalVKIDButtonStyle internalVKIDButtonStyle3;
        Object C11;
        Object b11;
        Object C12;
        int I11;
        Object C13;
        Object b12;
        final Function1<? super VKIDUser, Unit> function14;
        final VKIDSmallButtonState vKIDSmallButtonState4;
        final InternalVKIDButtonStyle internalVKIDButtonStyle4;
        J0 m02;
        int i15;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(2005962761);
        int i16 = 1;
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
            vKIDSmallButtonState2 = vKIDSmallButtonState;
        } else if ((i11 & 6) == 0) {
            vKIDSmallButtonState2 = vKIDSmallButtonState;
            i13 = (u11.n(vKIDSmallButtonState2) ? 4 : 2) | i11;
        } else {
            vKIDSmallButtonState2 = vKIDSmallButtonState;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i12 & 2) == 0) {
                internalVKIDButtonStyle2 = internalVKIDButtonStyle;
                if (u11.n(internalVKIDButtonStyle2)) {
                    i15 = 32;
                    i13 |= i15;
                }
            } else {
                internalVKIDButtonStyle2 = internalVKIDButtonStyle;
            }
            i15 = 16;
            i13 |= i15;
        } else {
            internalVKIDButtonStyle2 = internalVKIDButtonStyle;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(onClick) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i18 = i12 & 8;
        if (i18 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            function12 = function1;
            i13 |= u11.F(function12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            if ((i12 & 16) == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i13 |= u11.p(z11) ? 16384 : 8192;
            }
            if ((i13 & 9363) == 9362 || !u11.b()) {
                u11.Q0();
                if ((i11 & 1) != 0 || u11.w0()) {
                    if (i17 != 0) {
                        u11.o(-1251652350);
                        Object C14 = u11.C();
                        if (C14 == InterfaceC3967k.a.a()) {
                            C14 = new VKIDSmallButtonState(false, false);
                            u11.x(C14);
                        }
                        u11.k();
                        vKIDSmallButtonState2 = (VKIDSmallButtonState) C14;
                    }
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                        internalVKIDButtonStyle2 = new InternalVKIDButtonStyle.Light(null, null, null, 7, null);
                    }
                    if (i18 != 0) {
                        u11.o(-1251645545);
                        Object C15 = u11.C();
                        if (C15 == InterfaceC3967k.a.a()) {
                            C15 = new k30.h(i16);
                            u11.x(C15);
                        }
                        u11.k();
                        function13 = (Function1) C15;
                        vKIDSmallButtonState3 = vKIDSmallButtonState2;
                        i14 = i13;
                        internalVKIDButtonStyle3 = internalVKIDButtonStyle2;
                        u11.j0();
                        C11 = u11.C();
                        if (C11 == InterfaceC3967k.a.a()) {
                            C11 = f.b(Q.j(kotlin.coroutines.g.f71771a, u11), u11);
                        }
                        M a11 = ((D) C11).a();
                        u11.o(-1251641861);
                        if (z11) {
                            CommonKt.FetchUserData(a11, new OnFetchingProgress() { // from class: com.vk.id.onetap.compose.button.auth.VKIDButtonSmallKt$VKIDButtonSmall$3
                                @Override // com.vk.id.onetap.compose.button.OnFetchingProgress
                                public void onDispose() {
                                }

                                @Override // com.vk.id.onetap.compose.button.OnFetchingProgress
                                public Object onFetched(VKIDUser vKIDUser, kotlin.coroutines.d<? super Unit> dVar) {
                                    function13.invoke(vKIDUser);
                                    String photo200 = vKIDUser != null ? vKIDUser.getPhoto200() : null;
                                    if (photo200 != null) {
                                        vKIDSmallButtonState3.setUserIconUrl$onetap_compose_release(photo200);
                                    } else {
                                        vKIDSmallButtonState3.setUserIconLoaded$onetap_compose_release(false);
                                    }
                                    return Unit.f71690a;
                                }

                                @Override // com.vk.id.onetap.compose.button.OnFetchingProgress
                                public Object onPreFetch(kotlin.coroutines.d<? super Unit> dVar) {
                                    return Unit.f71690a;
                                }
                            }, null, u11, 384);
                        }
                        b11 = Pk0.h.b(u11, -1251618274);
                        if (b11 == InterfaceC3967k.a.a()) {
                            b11 = n1.f(Z1.q.a(0L), D1.f25195a);
                            u11.x(b11);
                        }
                        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) b11;
                        u11.k();
                        int i19 = C5179b.f39454h;
                        C5179b.i o11 = C5179b.o(0, InterfaceC6250b.a.g());
                        d.b i21 = InterfaceC6250b.a.i();
                        e clickable = CommonKt.clickable(VKIDButtonBackgroundStyleKt.background(OneTapButtonCornersStyleKt.clip(VKIDButtonBorderStyleKt.border(OneTapButtonSizeStyleKt.height(a0.r(OneTapButtonElevationStyleKt.shadow(Q1.a(e.f40358c0, "vkid_button"), internalVKIDButtonStyle3), OneTapButtonSizeStyleKt.heightDp(internalVKIDButtonStyle3.getSizeStyle())), internalVKIDButtonStyle3.getSizeStyle()), internalVKIDButtonStyle3.getBorderStyle(), internalVKIDButtonStyle3.getCornersStyle()), internalVKIDButtonStyle3.getCornersStyle()), internalVKIDButtonStyle3.getBackgroundStyle()), onClick);
                        u11.o(-1251599778);
                        C12 = u11.C();
                        if (C12 == InterfaceC3967k.a.a()) {
                            C12 = new h0(interfaceC3978p0, 3);
                            u11.x(C12);
                        }
                        u11.k();
                        e a12 = androidx.compose.ui.layout.g.a(clickable, (Function1) C12);
                        Y b13 = X.b(o11, i21, u11, 54);
                        I11 = u11.I();
                        A0 d11 = u11.d();
                        e f7 = c.f(u11, a12);
                        Function0 a13 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                            u11.H(a13);
                        } else {
                            u11.e();
                        }
                        Function2 h11 = Cm.e.h(u11, b13, u11, d11);
                        if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                            a.d(I11, u11, I11, h11);
                        }
                        F1.b(u11, f7, InterfaceC2801g.a.f());
                        u11.o(-93159505);
                        C13 = u11.C();
                        if (C13 == InterfaceC3967k.a.a()) {
                            C13 = C7984d.a(0.0f);
                            u11.x(C13);
                        }
                        C7980b c7980b = (C7980b) C13;
                        b12 = Pk0.h.b(u11, -93157393);
                        if (b12 == InterfaceC3967k.a.a()) {
                            b12 = C7984d.a(0.0f);
                            u11.x(b12);
                        }
                        C7980b c7980b2 = (C7980b) b12;
                        u11.k();
                        m53SmallButtonAnimationJ5j9r9c(vKIDSmallButtonState3, c7980b, c7980b2, VKIDButtonSmall$lambda$4(interfaceC3978p0), u11, (i14 & 14) | 576);
                        u11 = u11;
                        InternalVKIDButtonStyle internalVKIDButtonStyle5 = internalVKIDButtonStyle3;
                        SmallButtonContent(vKIDSmallButtonState3, internalVKIDButtonStyle5, c7980b, c7980b2, u11, (i14 & 126) | 4608);
                        u11.f();
                        function14 = function13;
                        vKIDSmallButtonState4 = vKIDSmallButtonState3;
                        internalVKIDButtonStyle4 = internalVKIDButtonStyle5;
                    }
                } else {
                    u11.j();
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                    }
                }
                vKIDSmallButtonState3 = vKIDSmallButtonState2;
                i14 = i13;
                internalVKIDButtonStyle3 = internalVKIDButtonStyle2;
                function13 = function12;
                u11.j0();
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                }
                M a112 = ((D) C11).a();
                u11.o(-1251641861);
                if (z11) {
                }
                b11 = Pk0.h.b(u11, -1251618274);
                if (b11 == InterfaceC3967k.a.a()) {
                }
                InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) b11;
                u11.k();
                int i192 = C5179b.f39454h;
                C5179b.i o112 = C5179b.o(0, InterfaceC6250b.a.g());
                d.b i212 = InterfaceC6250b.a.i();
                e clickable2 = CommonKt.clickable(VKIDButtonBackgroundStyleKt.background(OneTapButtonCornersStyleKt.clip(VKIDButtonBorderStyleKt.border(OneTapButtonSizeStyleKt.height(a0.r(OneTapButtonElevationStyleKt.shadow(Q1.a(e.f40358c0, "vkid_button"), internalVKIDButtonStyle3), OneTapButtonSizeStyleKt.heightDp(internalVKIDButtonStyle3.getSizeStyle())), internalVKIDButtonStyle3.getSizeStyle()), internalVKIDButtonStyle3.getBorderStyle(), internalVKIDButtonStyle3.getCornersStyle()), internalVKIDButtonStyle3.getCornersStyle()), internalVKIDButtonStyle3.getBackgroundStyle()), onClick);
                u11.o(-1251599778);
                C12 = u11.C();
                if (C12 == InterfaceC3967k.a.a()) {
                }
                u11.k();
                e a122 = androidx.compose.ui.layout.g.a(clickable2, (Function1) C12);
                Y b132 = X.b(o112, i212, u11, 54);
                I11 = u11.I();
                A0 d112 = u11.d();
                e f72 = c.f(u11, a122);
                Function0 a132 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 h112 = Cm.e.h(u11, b132, u11, d112);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, h112);
                F1.b(u11, f72, InterfaceC2801g.a.f());
                u11.o(-93159505);
                C13 = u11.C();
                if (C13 == InterfaceC3967k.a.a()) {
                }
                C7980b c7980b3 = (C7980b) C13;
                b12 = Pk0.h.b(u11, -93157393);
                if (b12 == InterfaceC3967k.a.a()) {
                }
                C7980b c7980b22 = (C7980b) b12;
                u11.k();
                m53SmallButtonAnimationJ5j9r9c(vKIDSmallButtonState3, c7980b3, c7980b22, VKIDButtonSmall$lambda$4(interfaceC3978p02), u11, (i14 & 14) | 576);
                u11 = u11;
                InternalVKIDButtonStyle internalVKIDButtonStyle52 = internalVKIDButtonStyle3;
                SmallButtonContent(vKIDSmallButtonState3, internalVKIDButtonStyle52, c7980b3, c7980b22, u11, (i14 & 126) | 4608);
                u11.f();
                function14 = function13;
                vKIDSmallButtonState4 = vKIDSmallButtonState3;
                internalVKIDButtonStyle4 = internalVKIDButtonStyle52;
            } else {
                u11.j();
                vKIDSmallButtonState4 = vKIDSmallButtonState2;
                internalVKIDButtonStyle4 = internalVKIDButtonStyle2;
                function14 = function12;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new Function2() { // from class: xa.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit VKIDButtonSmall$lambda$11;
                        int intValue = ((Integer) obj2).intValue();
                        int i22 = i11;
                        int i23 = i12;
                        VKIDButtonSmall$lambda$11 = VKIDButtonSmallKt.VKIDButtonSmall$lambda$11(VKIDSmallButtonState.this, internalVKIDButtonStyle4, onClick, function14, z11, i22, i23, (InterfaceC3967k) obj, intValue);
                        return VKIDButtonSmall$lambda$11;
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        if ((i12 & 16) == 0) {
        }
        if ((i13 & 9363) == 9362) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i17 != 0) {
        }
        if ((i12 & 2) != 0) {
        }
        if (i18 != 0) {
        }
        vKIDSmallButtonState3 = vKIDSmallButtonState2;
        i14 = i13;
        internalVKIDButtonStyle3 = internalVKIDButtonStyle2;
        function13 = function12;
        u11.j0();
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        M a1122 = ((D) C11).a();
        u11.o(-1251641861);
        if (z11) {
        }
        b11 = Pk0.h.b(u11, -1251618274);
        if (b11 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p022 = (InterfaceC3978p0) b11;
        u11.k();
        int i1922 = C5179b.f39454h;
        C5179b.i o1122 = C5179b.o(0, InterfaceC6250b.a.g());
        d.b i2122 = InterfaceC6250b.a.i();
        e clickable22 = CommonKt.clickable(VKIDButtonBackgroundStyleKt.background(OneTapButtonCornersStyleKt.clip(VKIDButtonBorderStyleKt.border(OneTapButtonSizeStyleKt.height(a0.r(OneTapButtonElevationStyleKt.shadow(Q1.a(e.f40358c0, "vkid_button"), internalVKIDButtonStyle3), OneTapButtonSizeStyleKt.heightDp(internalVKIDButtonStyle3.getSizeStyle())), internalVKIDButtonStyle3.getSizeStyle()), internalVKIDButtonStyle3.getBorderStyle(), internalVKIDButtonStyle3.getCornersStyle()), internalVKIDButtonStyle3.getCornersStyle()), internalVKIDButtonStyle3.getBackgroundStyle()), onClick);
        u11.o(-1251599778);
        C12 = u11.C();
        if (C12 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        e a1222 = androidx.compose.ui.layout.g.a(clickable22, (Function1) C12);
        Y b1322 = X.b(o1122, i2122, u11, 54);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f722 = c.f(u11, a1222);
        Function0 a1322 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h1122 = Cm.e.h(u11, b1322, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, h1122);
        F1.b(u11, f722, InterfaceC2801g.a.f());
        u11.o(-93159505);
        C13 = u11.C();
        if (C13 == InterfaceC3967k.a.a()) {
        }
        C7980b c7980b32 = (C7980b) C13;
        b12 = Pk0.h.b(u11, -93157393);
        if (b12 == InterfaceC3967k.a.a()) {
        }
        C7980b c7980b222 = (C7980b) b12;
        u11.k();
        m53SmallButtonAnimationJ5j9r9c(vKIDSmallButtonState3, c7980b32, c7980b222, VKIDButtonSmall$lambda$4(interfaceC3978p022), u11, (i14 & 14) | 576);
        u11 = u11;
        InternalVKIDButtonStyle internalVKIDButtonStyle522 = internalVKIDButtonStyle3;
        SmallButtonContent(vKIDSmallButtonState3, internalVKIDButtonStyle522, c7980b32, c7980b222, u11, (i14 & 126) | 4608);
        u11.f();
        function14 = function13;
        vKIDSmallButtonState4 = vKIDSmallButtonState3;
        internalVKIDButtonStyle4 = internalVKIDButtonStyle522;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VKIDButtonSmall$lambda$11(VKIDSmallButtonState vKIDSmallButtonState, InternalVKIDButtonStyle internalVKIDButtonStyle, Function0 function0, Function1 function1, boolean z11, int i11, int i12, InterfaceC3967k interfaceC3967k, int i13) {
        VKIDButtonSmall(vKIDSmallButtonState, internalVKIDButtonStyle, function0, function1, z11, interfaceC3967k, C2652m.e(i11 | 1), i12);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VKIDButtonSmall$lambda$2$lambda$1(VKIDUser vKIDUser) {
        return Unit.f71690a;
    }

    private static final long VKIDButtonSmall$lambda$4(InterfaceC3978p0<Z1.q> interfaceC3978p0) {
        return interfaceC3978p0.getValue().e();
    }

    private static final void VKIDButtonSmall$lambda$5(InterfaceC3978p0<Z1.q> interfaceC3978p0, long j11) {
        interfaceC3978p0.setValue(Z1.q.a(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VKIDButtonSmall$lambda$7$lambda$6(InterfaceC3978p0 interfaceC3978p0, Z1.q qVar) {
        VKIDButtonSmall$lambda$5(interfaceC3978p0, qVar.e());
        return Unit.f71690a;
    }
}
