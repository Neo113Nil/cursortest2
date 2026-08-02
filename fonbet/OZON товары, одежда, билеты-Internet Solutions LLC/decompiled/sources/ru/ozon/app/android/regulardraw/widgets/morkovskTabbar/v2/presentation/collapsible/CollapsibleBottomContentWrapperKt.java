package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.collapsible;

import B1.U;
import B1.V;
import B1.W;
import B1.m0;
import D1.InterfaceC2801g;
import J0.C3349u1;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import T7.E;
import Z1.b;
import a00.C4911f;
import a00.h;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.d;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e3.C6285b;
import hd.C6915b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.C7980b;
import m0.C7984d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.regulardraw.ui.ComposerRecyclerScrollEffectKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function0;", "", "content", "CollapsibleBottomContentWrapper", "(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "", "isCollapsed", "AnimatedContent", "(ZLandroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "", "heightMultiplier", "UnboundedHeightContent", "(FLandroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "DisableBottomContainerViewClipping", "(LS0/k;I)V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CollapsibleBottomContentWrapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedContent(boolean z11, e eVar, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function22;
        int i14;
        boolean z12;
        Object C11;
        float floatValue;
        Object C12;
        boolean F11;
        Object C13;
        ComponentCallbacksC5392m c11;
        e eVar3;
        View view;
        C5353y0 n11;
        d f7;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-129007637);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.p(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                function22 = function2;
                i13 |= u11.F(function22) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i13 & 147) == 146 || !u11.b()) {
                    e eVar4 = i15 != 0 ? e.f40358c0 : eVar2;
                    u11.o(-686002175);
                    i14 = 0;
                    z12 = (i13 & 14) == 4;
                    C11 = u11.C();
                    if (!z12 || C11 == InterfaceC3967k.a.a()) {
                        C11 = Float.valueOf(z11 ? 0.0f : 1.0f);
                        u11.x(C11);
                    }
                    floatValue = ((Number) C11).floatValue();
                    u11.k();
                    u11.o(-685999358);
                    C12 = u11.C();
                    if (C12 == InterfaceC3967k.a.a()) {
                        C12 = C7984d.a(floatValue);
                        u11.x(C12);
                    }
                    C7980b c7980b = (C7980b) C12;
                    u11.k();
                    Float valueOf = Float.valueOf(floatValue);
                    u11.o(-685995830);
                    F11 = u11.F(c7980b) | u11.q(floatValue);
                    C13 = u11.C();
                    if (!F11 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new CollapsibleBottomContentWrapperKt$AnimatedContent$1$1(c7980b, floatValue, null);
                        u11.x(C13);
                    }
                    u11.k();
                    Q.e(u11, valueOf, (Function2) C13);
                    c11 = ((C4911f) u11.m(f.d())).c();
                    if (c11 != null && (view = c11.getView()) != null && (n11 = Y.n(view)) != null && (f7 = n11.f(2)) != null) {
                        i14 = f7.f42129d;
                    }
                    UnboundedHeightContent(((Number) c7980b.k()).floatValue(), a.b(eVar4, 0.0f, 0.0f, 0.0f, (1.0f - ((Number) c7980b.k()).floatValue()) * i14, 0.0f, 0.0f, null, false, 131055), function22, u11, i13 & 896, 0);
                    eVar3 = eVar4;
                } else {
                    u11.j();
                    eVar3 = eVar2;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new CollapsibleBottomContentWrapperKt$AnimatedContent$2(z11, eVar3, function2, i11, i12));
                    return;
                }
                return;
            }
            function22 = function2;
            if ((i13 & 147) == 146) {
            }
            if (i15 != 0) {
            }
            u11.o(-686002175);
            i14 = 0;
            if ((i13 & 14) == 4) {
            }
            C11 = u11.C();
            if (!z12) {
            }
            C11 = Float.valueOf(z11 ? 0.0f : 1.0f);
            u11.x(C11);
            floatValue = ((Number) C11).floatValue();
            u11.k();
            u11.o(-685999358);
            C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
            }
            C7980b c7980b2 = (C7980b) C12;
            u11.k();
            Float valueOf2 = Float.valueOf(floatValue);
            u11.o(-685995830);
            F11 = u11.F(c7980b2) | u11.q(floatValue);
            C13 = u11.C();
            if (!F11) {
            }
            C13 = new CollapsibleBottomContentWrapperKt$AnimatedContent$1$1(c7980b2, floatValue, null);
            u11.x(C13);
            u11.k();
            Q.e(u11, valueOf2, (Function2) C13);
            c11 = ((C4911f) u11.m(f.d())).c();
            if (c11 != null) {
                i14 = f7.f42129d;
            }
            UnboundedHeightContent(((Number) c7980b2.k()).floatValue(), a.b(eVar4, 0.0f, 0.0f, 0.0f, (1.0f - ((Number) c7980b2.k()).floatValue()) * i14, 0.0f, 0.0f, null, false, 131055), function22, u11, i13 & 896, 0);
            eVar3 = eVar4;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        if ((i12 & 4) == 0) {
        }
        function22 = function2;
        if ((i13 & 147) == 146) {
        }
        if (i15 != 0) {
        }
        u11.o(-686002175);
        i14 = 0;
        if ((i13 & 14) == 4) {
        }
        C11 = u11.C();
        if (!z12) {
        }
        C11 = Float.valueOf(z11 ? 0.0f : 1.0f);
        u11.x(C11);
        floatValue = ((Number) C11).floatValue();
        u11.k();
        u11.o(-685999358);
        C12 = u11.C();
        if (C12 == InterfaceC3967k.a.a()) {
        }
        C7980b c7980b22 = (C7980b) C12;
        u11.k();
        Float valueOf22 = Float.valueOf(floatValue);
        u11.o(-685995830);
        F11 = u11.F(c7980b22) | u11.q(floatValue);
        C13 = u11.C();
        if (!F11) {
        }
        C13 = new CollapsibleBottomContentWrapperKt$AnimatedContent$1$1(c7980b22, floatValue, null);
        u11.x(C13);
        u11.k();
        Q.e(u11, valueOf22, (Function2) C13);
        c11 = ((C4911f) u11.m(f.d())).c();
        if (c11 != null) {
        }
        UnboundedHeightContent(((Number) c7980b22.k()).floatValue(), a.b(eVar4, 0.0f, 0.0f, 0.0f, (1.0f - ((Number) c7980b22.k()).floatValue()) * i14, 0.0f, 0.0f, null, false, 131055), function22, u11, i13 & 896, 0);
        eVar3 = eVar4;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    public static final void CollapsibleBottomContentWrapper(e eVar, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function2;
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(-516849874);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(content) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
            function2 = content;
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            e eVar2 = eVar;
            DisableBottomContainerViewClipping(u11, 0);
            CollapsibleBottomContentViewModel collapsibleBottomContentViewModel = (CollapsibleBottomContentViewModel) new z0(((h) u11.m(f.f())).a(), new z0.c() { // from class: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.collapsible.CollapsibleBottomContentWrapperKt$CollapsibleBottomContentWrapper$$inlined$viewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    return new CollapsibleBottomContentViewModel();
                }
            }).a(CollapsibleBottomContentViewModel.class);
            u11.o(2018460508);
            boolean F11 = u11.F(collapsibleBottomContentViewModel);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new CollapsibleBottomContentWrapperKt$CollapsibleBottomContentWrapper$1$1(collapsibleBottomContentViewModel);
                u11.x(C11);
            }
            u11.k();
            Function0 function0 = (Function0) ((kotlin.reflect.h) C11);
            u11.o(2018461978);
            boolean F12 = u11.F(collapsibleBottomContentViewModel);
            Object C12 = u11.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new CollapsibleBottomContentWrapperKt$CollapsibleBottomContentWrapper$2$1(collapsibleBottomContentViewModel);
                u11.x(C12);
            }
            u11.k();
            ComposerRecyclerScrollEffectKt.ComposerRecyclerScrollEffect(function0, (Function0) ((kotlin.reflect.h) C12), u11, 0);
            function2 = content;
            AnimatedContent(CollapsibleBottomContentWrapper$lambda$3(C6285b.c(collapsibleBottomContentViewModel.isCollapsed(), u11, 0)), eVar2, function2, u11, (i13 << 3) & 1008, 0);
            eVar = eVar2;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CollapsibleBottomContentWrapperKt$CollapsibleBottomContentWrapper$3(eVar, function2, i11, i12));
        }
    }

    private static final boolean CollapsibleBottomContentWrapper$lambda$3(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisableBottomContainerViewClipping(InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(-1629650506);
        if (i11 == 0 && u11.b()) {
            u11.j();
        } else {
            View view = (View) u11.m(AndroidCompositionLocals_androidKt.h());
            u11.o(2117864826);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = CollapsibleBottomContentWrapperKt$DisableBottomContainerViewClipping$composerBottomContainer$1$1.INSTANCE;
                u11.x(C11);
            }
            u11.k();
            ViewGroup findParent = ViewExtKt.findParent(view, (Function1) C11);
            LinearLayout composerBottomContainer = findParent != null ? ComposerViewExtensionKt.composerBottomContainer(findParent) : null;
            u11.o(2117868103);
            boolean F11 = u11.F(composerBottomContainer);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new CollapsibleBottomContentWrapperKt$DisableBottomContainerViewClipping$1$1(composerBottomContainer, null);
                u11.x(C12);
            }
            u11.k();
            Q.e(u11, composerBottomContainer, (Function2) C12);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CollapsibleBottomContentWrapperKt$DisableBottomContainerViewClipping$2(i11));
        }
    }

    public static final void UnboundedHeightContent(final float f7, e eVar, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(1279354019);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.q(f7) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(content) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            u11.o(483161520);
            boolean z11 = (i13 & 14) == 4;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new V() { // from class: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.collapsible.CollapsibleBottomContentWrapperKt$UnboundedHeightContent$1$1

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                    /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.collapsible.CollapsibleBottomContentWrapperKt$UnboundedHeightContent$1$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
                        final /* synthetic */ m0 $placeable;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(m0 m0Var) {
                            super(1);
                            this.$placeable = m0Var;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                            invoke2(aVar);
                            return Unit.f71690a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(m0.a layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            layout.h(this.$placeable, 0, 0, 0.0f);
                        }
                    }

                    @Override // B1.V
                    /* renamed from: measure-3p2s80s */
                    public final W mo2measure3p2s80s(B1.Y Layout, List<? extends U> measurables, long j11) {
                        W z02;
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        z02 = Layout.z0(b.k(j11), C6915b.c(r9.l0() * f7), kotlin.collections.U.c(), new AnonymousClass1(((U) C7714v.K(measurables)).a0(b.c(0, 0, 0, Integer.MAX_VALUE, 7, j11))));
                        return z02;
                    }
                };
                u11.x(C11);
            }
            V v11 = (V) C11;
            u11.k();
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, eVar);
            InterfaceC2801g.f5440U.getClass();
            Function0 a11 = InterfaceC2801g.a.a();
            int i15 = ((((i13 & 112) | ((i13 >> 6) & 14)) << 6) & 896) | 6;
            u11.i();
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, v11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C3349u1.e((i15 >> 6) & 14, content, u11);
        }
        e eVar2 = eVar;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CollapsibleBottomContentWrapperKt$UnboundedHeightContent$2(f7, eVar2, content, i11, i12));
        }
    }
}
