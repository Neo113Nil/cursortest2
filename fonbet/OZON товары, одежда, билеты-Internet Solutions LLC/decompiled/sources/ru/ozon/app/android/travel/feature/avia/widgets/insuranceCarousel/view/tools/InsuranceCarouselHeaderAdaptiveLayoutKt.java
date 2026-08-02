package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view.tools;

import B1.I;
import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.c0;
import B1.d0;
import B1.m0;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.C3354v2;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Z1.b;
import a1.C4912a;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aS\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "", "inlineIconGapPx", "stackedIconBottomGapPx", "Lkotlin/Function0;", "", "icon", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "InsuranceCarouselHeaderAdaptiveLayout", "(Landroidx/compose/ui/e;IILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InsuranceCarouselHeaderAdaptiveLayoutKt {
    public static final void InsuranceCarouselHeaderAdaptiveLayout(e eVar, final int i11, final int i12, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> icon, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> title, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> subtitle, InterfaceC3967k interfaceC3967k, int i13, int i14) {
        e eVar2;
        int i15;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        C3969l u11 = interfaceC3967k.u(-1145503171);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            eVar2 = eVar;
        } else if ((i13 & 6) == 0) {
            eVar2 = eVar;
            i15 = (u11.n(eVar2) ? 4 : 2) | i13;
        } else {
            eVar2 = eVar;
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= u11.r(i11) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= u11.r(i12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= u11.F(icon) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i14 & 16) != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            i15 |= u11.F(title) ? 16384 : 8192;
        }
        if ((i14 & 32) != 0) {
            i15 |= 196608;
        } else if ((i13 & 196608) == 0) {
            i15 |= u11.F(subtitle) ? 131072 : 65536;
        }
        if ((74899 & i15) == 74898 && u11.b()) {
            u11.j();
        } else {
            if (i16 != 0) {
                eVar2 = e.f40358c0;
            }
            List b02 = C7714v.b0(icon, title, subtitle);
            u11.o(1319678523);
            boolean z11 = ((i15 & 112) == 32) | ((i15 & 896) == 256);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new c0() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view.tools.InsuranceCarouselHeaderAdaptiveLayoutKt$InsuranceCarouselHeaderAdaptiveLayout$1$1

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view.tools.InsuranceCarouselHeaderAdaptiveLayoutKt$InsuranceCarouselHeaderAdaptiveLayout$1$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
                        final /* synthetic */ m0 $iconPlaceable;
                        final /* synthetic */ int $inlineIconGapPx;
                        final /* synthetic */ boolean $isInline;
                        final /* synthetic */ int $stackedIconBottomGapPx;
                        final /* synthetic */ m0 $subtitlePlaceable;
                        final /* synthetic */ m0 $titlePlaceable;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(m0 m0Var, m0 m0Var2, m0 m0Var3, boolean z11, int i11, int i12) {
                            super(1);
                            this.$iconPlaceable = m0Var;
                            this.$titlePlaceable = m0Var2;
                            this.$subtitlePlaceable = m0Var3;
                            this.$isInline = z11;
                            this.$inlineIconGapPx = i11;
                            this.$stackedIconBottomGapPx = i12;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                            invoke2(aVar);
                            return Unit.f71690a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(m0.a layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            m0 m0Var = this.$iconPlaceable;
                            if (m0Var == null) {
                                layout.h(this.$titlePlaceable, 0, 0, 0.0f);
                                int l02 = this.$titlePlaceable.l0();
                                m0 m0Var2 = this.$subtitlePlaceable;
                                if (m0Var2 != null) {
                                    layout.h(m0Var2, 0, l02, 0.0f);
                                    return;
                                }
                                return;
                            }
                            if (this.$isInline) {
                                int max = Math.max(this.$titlePlaceable.l0(), this.$iconPlaceable.l0());
                                m0 m0Var3 = this.$titlePlaceable;
                                layout.h(m0Var3, 0, C3354v2.d(max, 2, m0Var3), 0.0f);
                                layout.h(this.$iconPlaceable, this.$titlePlaceable.u0() + this.$inlineIconGapPx, C3354v2.d(max, 2, this.$iconPlaceable), 0.0f);
                                m0 m0Var4 = this.$subtitlePlaceable;
                                if (m0Var4 != null) {
                                    layout.h(m0Var4, 0, max, 0.0f);
                                    return;
                                }
                                return;
                            }
                            layout.h(m0Var, 0, 0, 0.0f);
                            int l03 = this.$iconPlaceable.l0() + this.$stackedIconBottomGapPx;
                            layout.h(this.$titlePlaceable, 0, l03, 0.0f);
                            int l04 = this.$titlePlaceable.l0() + l03;
                            m0 m0Var5 = this.$subtitlePlaceable;
                            if (m0Var5 != null) {
                                layout.h(m0Var5, 0, l04, 0.0f);
                            }
                        }
                    }

                    @Override // B1.c0
                    /* renamed from: measure-3p2s80s */
                    public final W mo3measure3p2s80s(Y Layout, List<? extends List<? extends U>> list, long j11) {
                        boolean z12;
                        int l02;
                        int max;
                        W z02;
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(list, "<destruct>");
                        List<? extends U> list2 = list.get(0);
                        List<? extends U> list3 = list.get(1);
                        List<? extends U> list4 = list.get(2);
                        long c11 = b.c(0, 0, 0, 0, 10, j11);
                        U u12 = (U) C7714v.Q(0, list2);
                        m0 a02 = u12 != null ? u12.a0(c11) : null;
                        m0 a03 = list3.get(0).a0(c11);
                        U u13 = (U) C7714v.Q(0, list4);
                        m0 a04 = u13 != null ? u13.a0(c11) : null;
                        if (a02 != null) {
                            int k11 = (b.k(j11) - a02.u0()) - i11;
                            if (k11 < 0) {
                                k11 = 0;
                            }
                            z12 = a03.u0() <= k11;
                        } else {
                            z12 = false;
                        }
                        if (a02 == null) {
                            max = a03.l0();
                            if (a04 != null) {
                                r3 = a04.l0();
                            }
                        } else {
                            if (!z12) {
                                l02 = a03.l0() + a02.l0() + i12 + (a04 != null ? a04.l0() : 0);
                                z02 = Layout.z0(b.k(j11), h.e(l02, b.l(j11), b.j(j11)), kotlin.collections.U.c(), new AnonymousClass1(a02, a03, a04, z12, i11, i12));
                                return z02;
                            }
                            max = Math.max(a03.l0(), a02.l0());
                            if (a04 != null) {
                                r3 = a04.l0();
                            }
                        }
                        l02 = max + r3;
                        z02 = Layout.z0(b.k(j11), h.e(l02, b.l(j11), b.j(j11)), kotlin.collections.U.c(), new AnonymousClass1(a02, a03, a04, z12, i11, i12));
                        return z02;
                    }
                };
                u11.x(C11);
            }
            c0 c0Var = (c0) C11;
            u11.k();
            C4912a b11 = I.b(b02);
            boolean n11 = u11.n(c0Var);
            Object C12 = u11.C();
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new d0(c0Var);
                u11.x(C12);
            }
            V v11 = (V) C12;
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, eVar2);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f11 = E.f(u11, v11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            b11.invoke(u11, 0);
            u11.f();
        }
        e eVar3 = eVar2;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new InsuranceCarouselHeaderAdaptiveLayoutKt$InsuranceCarouselHeaderAdaptiveLayout$2(eVar3, i11, i12, icon, title, subtitle, i13, i14));
        }
    }
}
