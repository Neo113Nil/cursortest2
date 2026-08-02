package ru.ozon.app.android.travel.utils.compose.container;

import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import D1.InterfaceC2801g;
import Ep.a;
import J0.C3349u1;
import J0.C3354v2;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Z1.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hd.C6915b;
import java.util.ArrayList;
import java.util.Iterator;
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

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "", "overlapPercent", "Lkotlin/Function0;", "", "content", "OverlapRow", "(Landroidx/compose/ui/e;FLkotlin/jvm/functions/Function2;LS0/k;II)V", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OverlapRowKt {
    public static final void OverlapRow(e eVar, final float f7, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(-1627438791);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.q(f7) ? 32 : 16;
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
            if (i15 != 0) {
                f7 = 0.0f;
            }
            u11.o(-115517089);
            boolean z11 = (i13 & 112) == 32;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new V() { // from class: ru.ozon.app.android.travel.utils.compose.container.OverlapRowKt$OverlapRow$1$1

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                    /* renamed from: ru.ozon.app.android.travel.utils.compose.container.OverlapRowKt$OverlapRow$1$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
                        final /* synthetic */ List<m0> $placeables;
                        final /* synthetic */ int[] $xPositions;
                        final /* synthetic */ int[] $yPositions;
                        final /* synthetic */ float[] $zPositions;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(List<? extends m0> list, int[] iArr, int[] iArr2, float[] fArr) {
                            super(1);
                            this.$placeables = list;
                            this.$xPositions = iArr;
                            this.$yPositions = iArr2;
                            this.$zPositions = fArr;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                            invoke2(aVar);
                            return Unit.f71690a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(m0.a layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            if (this.$placeables.isEmpty()) {
                                return;
                            }
                            List<m0> list = this.$placeables;
                            int[] iArr = this.$xPositions;
                            int[] iArr2 = this.$yPositions;
                            float[] fArr = this.$zPositions;
                            int size = list.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                layout.h(list.get(i11), iArr[i11], iArr2[i11], fArr[i11]);
                            }
                        }
                    }

                    @Override // B1.V
                    /* renamed from: measure-3p2s80s */
                    public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                        int i16;
                        W z02;
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        float f11 = 1 - f7;
                        List<? extends U> list = measurables;
                        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                        Iterator<T> it = list.iterator();
                        int i17 = 0;
                        while (it.hasNext()) {
                            m0 a02 = ((U) it.next()).a0(j11);
                            i17 = Math.max(i17, a02.l0());
                            arrayList.add(a02);
                        }
                        int e11 = h.e(i17, b.l(j11), b.j(j11));
                        int[] iArr = new int[arrayList.size()];
                        int[] iArr2 = new int[arrayList.size()];
                        float[] fArr = new float[arrayList.size()];
                        if (arrayList.isEmpty()) {
                            i16 = 0;
                        } else {
                            int u02 = ((m0) arrayList.get(0)).u0();
                            iArr[0] = 0;
                            iArr2[0] = C3354v2.d(e11, 2, (m0) arrayList.get(0));
                            fArr[0] = arrayList.size();
                            int size = arrayList.size();
                            int i18 = 0;
                            for (int i19 = 1; i19 < size; i19++) {
                                int c11 = C6915b.c(((m0) arrayList.get(i19 - 1)).u0() * f11);
                                if (c11 < 0) {
                                    c11 = 0;
                                }
                                int c12 = C6915b.c(((m0) arrayList.get(i19)).u0() * f11);
                                if (c12 < 0) {
                                    c12 = 0;
                                }
                                u02 += c12;
                                i18 += c11;
                                iArr[i19] = i18;
                                iArr2[i19] = C3354v2.d(e11, 2, (m0) arrayList.get(i19));
                                fArr[i19] = arrayList.size() - i19;
                            }
                            i16 = u02;
                        }
                        z02 = Layout.z0(h.e(i16, b.m(j11), b.k(j11)), e11, kotlin.collections.U.c(), new AnonymousClass1(arrayList, iArr, iArr2, fArr));
                        return z02;
                    }
                };
                u11.x(C11);
            }
            V v11 = (V) C11;
            u11.k();
            int i16 = ((i13 >> 6) & 14) | ((i13 << 3) & 112);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, eVar);
            InterfaceC2801g.f5440U.getClass();
            Function0 a11 = InterfaceC2801g.a.a();
            int i17 = ((i16 << 6) & 896) | 6;
            u11.i();
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, v11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C3349u1.e((i17 >> 6) & 14, content, u11);
        }
        e eVar2 = eVar;
        float f13 = f7;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new OverlapRowKt$OverlapRow$2(eVar2, f13, content, i11, i12));
        }
    }
}
