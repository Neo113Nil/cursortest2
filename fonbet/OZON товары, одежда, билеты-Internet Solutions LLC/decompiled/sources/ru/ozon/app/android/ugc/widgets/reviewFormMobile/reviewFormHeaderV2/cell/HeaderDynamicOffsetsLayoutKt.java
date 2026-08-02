package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2.cell;

import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import D1.InterfaceC2801g;
import J0.C3349u1;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Z1.b;
import Z1.c;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.a;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function0;", "", "content", "HeaderDynamicOffsetsLayout", "(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HeaderDynamicOffsetsLayoutKt {
    public static final void HeaderDynamicOffsetsLayout(e eVar, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(1681951750);
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
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            u11.o(-1807666349);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new V() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2.cell.HeaderDynamicOffsetsLayoutKt$HeaderDynamicOffsetsLayout$1$1

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2.cell.HeaderDynamicOffsetsLayoutKt$HeaderDynamicOffsetsLayout$1$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
                        final /* synthetic */ m0 $containerPlaceable;
                        final /* synthetic */ int $containerTopY;
                        final /* synthetic */ int $horizontalSpacer;
                        final /* synthetic */ m0 $imagePlaceable;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(m0 m0Var, m0 m0Var2, int i11, int i12) {
                            super(1);
                            this.$imagePlaceable = m0Var;
                            this.$containerPlaceable = m0Var2;
                            this.$horizontalSpacer = i11;
                            this.$containerTopY = i12;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                            invoke2(aVar);
                            return Unit.f71690a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(m0.a layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            layout.h(this.$imagePlaceable, 0, 0, 0.0f);
                            layout.h(this.$containerPlaceable, this.$imagePlaceable.u0() + this.$horizontalSpacer, this.$containerTopY, 0.0f);
                        }
                    }

                    @Override // B1.V
                    /* renamed from: measure-3p2s80s */
                    public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                        W z02;
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        int Y02 = Layout.Y0(6);
                        int Y03 = Layout.Y0(2);
                        int Y04 = Layout.Y0(8);
                        List<? extends U> list = measurables;
                        for (U u12 : list) {
                            if (Intrinsics.d(a.a(u12), "ImageId")) {
                                for (U u13 : list) {
                                    if (Intrinsics.d(a.a(u13), "ContainerId")) {
                                        m0 a02 = u12.a0(b.c(0, 0, 0, 0, 10, j11));
                                        int k11 = b.k(j11) - a02.u0();
                                        if (k11 < 0) {
                                            k11 = 0;
                                        }
                                        m0 a03 = u13.a0(c.b(k11, 0, 13));
                                        if (a03.l0() <= a02.l0()) {
                                            Y03 = Math.max(Y02, (a02.l0() - a03.l0()) / 2);
                                        }
                                        z02 = Layout.z0(b.k(j11), Math.max(a02.l0(), a03.l0() + Y03), kotlin.collections.U.c(), new AnonymousClass1(a02, a03, Y04, Y03));
                                        return z02;
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                u11.x(C11);
            }
            V v11 = (V) C11;
            u11.k();
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = androidx.compose.ui.c.f(u11, eVar);
            InterfaceC2801g.f5440U.getClass();
            Function0 a11 = InterfaceC2801g.a.a();
            int i15 = (((((i13 << 3) & 112) | (((i13 >> 3) & 14) | 384)) << 6) & 896) | 6;
            u11.i();
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f11 = E.f(u11, v11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            C3349u1.e((i15 >> 6) & 14, content, u11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new HeaderDynamicOffsetsLayoutKt$HeaderDynamicOffsetsLayout$2(eVar, content, i11, i12));
        }
    }
}
