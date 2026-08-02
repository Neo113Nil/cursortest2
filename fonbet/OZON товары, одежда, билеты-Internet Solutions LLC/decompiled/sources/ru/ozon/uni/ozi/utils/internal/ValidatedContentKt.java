package ru.ozon.uni.ozi.utils.internal;

import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import D1.InterfaceC2801g;
import Fr.g;
import J0.C3349u1;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.ozi.config.OziConfigKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\r\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "requiredLayoutId", "Lkotlin/ranges/IntRange;", FormPageDTO.Field.FIELD_TYPE_RANGE, "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function0;", "", "content", "ValidateContent", "(Ljava/lang/Object;Lkotlin/ranges/IntRange;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "", "zeroNodesAllowed", "ValidatedContent", "(Ljava/lang/Object;Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function2;LS0/k;II)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ValidatedContentKt {
    public static final void ValidateContent(@NotNull final Object requiredLayoutId, @NotNull final IntRange range, e eVar, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(requiredLayoutId, "requiredLayoutId");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(991875717);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(requiredLayoutId) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(range) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(content) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            u11.o(-927509886);
            boolean F11 = u11.F(range) | u11.F(requiredLayoutId);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new V() { // from class: ru.ozon.uni.ozi.utils.internal.ValidatedContentKt$ValidateContent$1$1

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                    /* renamed from: ru.ozon.uni.ozi.utils.internal.ValidatedContentKt$ValidateContent$1$1$2, reason: invalid class name */
                    static final class AnonymousClass2 extends AbstractC7737t implements Function1<m0.a, Unit> {
                        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

                        AnonymousClass2() {
                            super(1);
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(m0.a layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                            invoke2(aVar);
                            return Unit.f71690a;
                        }
                    }

                    @Override // B1.V
                    /* renamed from: measure-3p2s80s */
                    public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                        W z02;
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        int size = measurables.size();
                        if (OziConfigKt.getGlobalOziConfig().getEnableStrictMode()) {
                            int f71842a = IntRange.this.getF71842a();
                            if (size > IntRange.this.getF71843b() || f71842a > size) {
                                throw new IllegalStateException(("Количество LayoutNodes (" + size + ") не соответствует требуемому диапазону " + IntRange.this).toString());
                            }
                        }
                        Object obj = requiredLayoutId;
                        int size2 = measurables.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            Object a11 = a.a(measurables.get(i15));
                            if (OziConfigKt.getGlobalOziConfig().getEnableStrictMode() && !Intrinsics.d(a11, obj)) {
                                throw new IllegalStateException(h.F0("Переданный аддон не является функцией из соответствующего scope. Вызывайте только их.\n                           |Expected layoutId: " + obj + ", Actual layoutId " + a11 + "\n                        ").toString());
                            }
                        }
                        z02 = Layout.z0(0, 0, kotlin.collections.U.c(), AnonymousClass2.INSTANCE);
                        return z02;
                    }
                };
                u11.x(C11);
            }
            V v11 = (V) C11;
            u11.k();
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, eVar);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
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
            C3349u1.e((i13 >> 9) & 14, content, u11);
        }
        e eVar2 = eVar;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ValidatedContentKt$ValidateContent$3(requiredLayoutId, range, eVar2, content, i11, i12));
        }
    }

    public static final void ValidatedContent(@NotNull final Object requiredLayoutId, e eVar, final boolean z11, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(requiredLayoutId, "requiredLayoutId");
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(1782899013);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(requiredLayoutId) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(content) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            if (i15 != 0) {
                z11 = true;
            }
            u11.o(-1821219252);
            boolean F11 = ((i13 & 896) == 256) | u11.F(requiredLayoutId);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new V() { // from class: ru.ozon.uni.ozi.utils.internal.ValidatedContentKt$ValidatedContent$1$1

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                    /* renamed from: ru.ozon.uni.ozi.utils.internal.ValidatedContentKt$ValidatedContent$1$1$1, reason: invalid class name */
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
                            layout.d(this.$placeable, 0, 0, 0.0f);
                        }
                    }

                    @Override // B1.V
                    /* renamed from: measure-3p2s80s */
                    public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                        W z02;
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        int size = measurables.size();
                        if (OziConfigKt.getGlobalOziConfig().getEnableStrictMode() && (size > 1 || (size == 0 && !z11))) {
                            throw new IllegalStateException(("Количество LayoutNodes (" + size + ") не соответствует требуемому диапазону " + (z11 ? "[0..1]" : "[1..1]")).toString());
                        }
                        Object obj = requiredLayoutId;
                        if (measurables.size() <= 0) {
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        U u12 = measurables.get(0);
                        Object a11 = a.a(u12);
                        if (!OziConfigKt.getGlobalOziConfig().getEnableStrictMode() || Intrinsics.d(a11, obj)) {
                            m0 a02 = u12.a0(j11);
                            z02 = Layout.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new AnonymousClass1(a02));
                            return z02;
                        }
                        throw new IllegalStateException(h.F0("Переданный аддон не является функцией из соответствующего scope. Вызывайте только их.\n                           |Expected layoutId: " + obj + ", Actual layoutId " + a11 + "\n                        ").toString());
                    }
                };
                u11.x(C11);
            }
            V v11 = (V) C11;
            u11.k();
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, eVar);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
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
            C3349u1.e((i13 >> 9) & 14, content, u11);
        }
        e eVar2 = eVar;
        boolean z12 = z11;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ValidatedContentKt$ValidatedContent$3(requiredLayoutId, eVar2, z12, content, i11, i12));
        }
    }
}
