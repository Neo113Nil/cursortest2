package ru.ozon.uni.components.button;

import A0.h;
import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import D1.InterfaceC2801g;
import Fr.g;
import I1.o;
import J0.C3354v2;
import K1.T;
import P0.p2;
import P9.a;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import T7.E;
import Z1.b;
import a1.C4912a;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6981a;
import i1.C6988h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.components.button.UniButtonStyleType;
import ru.ozon.uni.components.loader.UniLoaderKt;
import ru.ozon.uni.components.loader.UniLoaderSize;
import ru.ozon.uni.utils.DeferredBrush;
import ru.ozon.uni.utils.DeferredColor;
import ru.ozon.uni.utils.UniTestTagsKt;
import ru.ozon.uni.utils.VisualEffectsKt;
import t0.p;
import t0.q;
import t0.u;
import u0.C9915y;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000d\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a³\u0001\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001aÃ\u0002\u0010<\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010\"2\u0006\u0010)\u001a\u00020 2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020*2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020.2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020.2\u0006\u00105\u001a\u00020.2\u0006\u00106\u001a\u00020.2\u0006\u00107\u001a\u00020.2\b\u00108\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0003¢\u0006\u0004\b:\u0010;\u001a/\u0010@\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020*2\u0006\u0010?\u001a\u00020\"H\u0003¢\u0006\u0004\b@\u0010A\u001a\u001f\u0010F\u001a\u00020\n2\u0006\u0010B\u001a\u00020\u00132\u0006\u0010C\u001a\u00020 H\u0003¢\u0006\u0004\bD\u0010E¨\u0006H²\u0006\f\u0010G\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"", SelectionItemFormDTO.TITLE_FIELD_NAME, "Landroidx/compose/ui/e;", "modifier", "subtitle", "data", "Lq1/b;", "icon", "contentDescription", "Lkotlin/Function0;", "", "onClick", "", "rounded", "isDisabled", "isHoverDisabled", "isLoading", "Lru/ozon/uni/components/button/UniButtonStyleType;", "styleType", "Lru/ozon/uni/components/button/UniButtonSize;", "sizeType", "canShowSubtitle", "Lt0/q;", "interactionSource", "UniButton", "(Ljava/lang/String;Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Lq1/b;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZZZZLru/ozon/uni/components/button/UniButtonStyleType;Lru/ozon/uni/components/button/UniButtonSize;ZLt0/q;LS0/k;III)V", "titleModifier", "subtitleModifier", "titleContent", "subtitleContent", "dataContent", "isCustomHoverColorEnabled", "Ll1/Z;", "customHoverColor", "Ll1/Q;", "titleTextColor", "subtitleTextColor", "dataTextColor", "backgroundColor", "iconColor", "iconGradientColor", "dataBackgroundColor", "LK1/T;", "titleTextStyle", "subtitleTextStyle", "dataTextStyle", "LZ1/h;", "height", "cornerRadius", "dataCornerRadius", "Lu0/x;", "paddings", "dataVerticalPadding", "dataHorizontalPadding", "dataPaddingOffset", "iconTitleGap", "accessibilityContentDescription", "loader", "BasicButton-Ci1iAhw", "(Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq1/b;ZZZZLl1/Z;ZLl1/Q;Ll1/Q;Ll1/Q;Ll1/Q;JLl1/Q;JLK1/T;LK1/T;LK1/T;FFFLu0/x;FFFFLjava/lang/String;Lt0/q;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;LS0/k;IIII)V", "BasicButton", "text", "textStyle", "textColor", "TextContent", "(Landroidx/compose/ui/e;Ljava/lang/String;LK1/T;Ll1/Q;LS0/k;I)V", "sizes", "color", "Loader-RPmYEkk", "(Lru/ozon/uni/components/button/UniButtonSize;JLS0/k;I)V", "Loader", "isPressed", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniButtonKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UniButtonSize.values().length];
            try {
                iArr[UniButtonSize.SIZE_400.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* renamed from: BasicButton-Ci1iAhw, reason: not valid java name */
    public static final void m1884BasicButtonCi1iAhw(e eVar, e eVar2, e eVar3, String str, String str2, String str3, AbstractC8972b abstractC8972b, boolean z11, boolean z12, boolean z13, boolean z14, C7807Z c7807z, boolean z15, AbstractC7799Q abstractC7799Q, AbstractC7799Q abstractC7799Q2, AbstractC7799Q abstractC7799Q3, AbstractC7799Q abstractC7799Q4, long j11, AbstractC7799Q abstractC7799Q5, long j12, T t2, T t11, T t12, float f7, float f11, float f12, InterfaceC9914x interfaceC9914x, float f13, float f14, final float f15, float f16, String str4, q qVar, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        q qVar2;
        float f17;
        InterfaceC3978p0 interfaceC3978p0;
        int i19;
        ?? r02;
        T t13;
        int i21;
        C3969l c3969l;
        e b11;
        C3969l u11 = interfaceC3967k.u(305666005);
        if ((i11 & 6) == 0) {
            i15 = i11 | (u11.n(eVar) ? 4 : 2);
        } else {
            i15 = i11;
        }
        if ((i11 & 48) == 0) {
            i15 |= u11.n(eVar2) ? 32 : 16;
        }
        int i22 = i11 & 384;
        int i23 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i22 == 0) {
            i15 |= u11.n(eVar3) ? 256 : 128;
        }
        int i24 = i11 & 3072;
        int i25 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i24 == 0) {
            i15 |= u11.n(str) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i15 |= u11.n(str2) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i15 |= u11.n(str3) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i15 |= u11.n(abstractC8972b) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i15 |= u11.p(z11) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i15 |= u11.p(z12) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i15 |= u11.p(z13) ? 536870912 : 268435456;
        }
        int i26 = i15;
        if ((i12 & 6) == 0) {
            i16 = i12 | (u11.p(z14) ? 4 : 2);
        } else {
            i16 = i12;
        }
        if ((i12 & 48) == 0) {
            i16 |= u11.n(c7807z) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i16 |= u11.p(z15) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i16 |= u11.n(abstractC7799Q) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i16 |= u11.n(abstractC7799Q2) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i16 |= u11.n(abstractC7799Q3) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i16 |= u11.n(abstractC7799Q4) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i16 |= u11.s(j11) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i16 |= u11.n(abstractC7799Q5) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i16 |= u11.s(j12) ? 536870912 : 268435456;
        }
        int i27 = i16;
        if ((i13 & 6) == 0) {
            i17 = i13 | (u11.n(t2) ? 4 : 2);
        } else {
            i17 = i13;
        }
        if ((i13 & 48) == 0) {
            i17 |= u11.n(t11) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i17 |= u11.n(t12) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i17 |= u11.q(f7) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i17 |= u11.q(f11) ? 16384 : 8192;
        }
        if ((i13 & 196608) == 0) {
            i17 |= u11.q(f12) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i17 |= u11.n(interfaceC9914x) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i17 |= u11.q(f13) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i17 |= u11.q(f14) ? 67108864 : 33554432;
        }
        if ((i13 & 805306368) == 0) {
            i17 |= u11.q(f15) ? 536870912 : 268435456;
        }
        int i28 = i17;
        if ((i14 & 6) == 0) {
            i18 = i14 | (u11.q(f16) ? 4 : 2);
        } else {
            i18 = i14;
        }
        if ((i14 & 48) == 0) {
            i18 |= u11.n(str4) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            qVar2 = qVar;
            if (u11.n(qVar2)) {
                i23 = 256;
            }
            i18 |= i23;
        } else {
            qVar2 = qVar;
        }
        if ((i14 & 3072) == 0) {
            if (u11.F(function2)) {
                i25 = 2048;
            }
            i18 |= i25;
        }
        if ((i14 & 24576) == 0) {
            i18 |= u11.F(function0) ? 16384 : 8192;
        }
        int i29 = i18;
        if ((i26 & 306783379) == 306783378 && (i27 & 306783379) == 306783378 && (i28 & 306783379) == 306783378 && (i29 & 9363) == 9362 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            InterfaceC3978p0 a11 = u.a(qVar2, u11, (i29 >> 6) & 14);
            u11.o(-923802852);
            boolean z16 = ((i29 & 112) == 32) | ((i26 & 7168) == 2048) | ((29360128 & i26) == 8388608) | ((458752 & i26) == 131072) | ((57344 & i26) == 16384);
            Object C11 = u11.C();
            if (z16 || C11 == InterfaceC3967k.a.a()) {
                f17 = f7;
                interfaceC3978p0 = a11;
                i19 = i26;
                r02 = 0;
                t13 = t12;
                Object uniButtonKt$BasicButton$1$1 = new UniButtonKt$BasicButton$1$1(str4, str, z11, str3, str2);
                u11.x(uniButtonKt$BasicButton$1$1);
                C11 = uniButtonKt$BasicButton$1$1;
            } else {
                f17 = f7;
                interfaceC3978p0 = a11;
                i19 = i26;
                r02 = 0;
                t13 = t12;
            }
            u11.k();
            e l02 = o.c(eVar, r02, (Function1) C11).l0(eVar);
            a.b(l02, "container");
            e a12 = androidx.compose.foundation.e.a(C6988h.a(l02, h.b(f11)), abstractC7799Q4, null, 6);
            u11.o(-923778254);
            InterfaceC3978p0 interfaceC3978p02 = interfaceC3978p0;
            boolean n11 = u11.n(interfaceC3978p02);
            Object C12 = u11.C();
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new UniButtonKt$BasicButton$2$1(interfaceC3978p02);
                u11.x(C12);
            }
            Function0 function02 = (Function0) C12;
            u11.k();
            e m3269hoverEffect8wvRk98$default = VisualEffectsKt.m3269hoverEffect8wvRk98$default(a12, function02, (z13 || !z14) ? r02 : true, c7807z, 0.0f, 8, null);
            if (function0 != null) {
                e.a aVar = e.f40358c0;
                Intrinsics.f(function0);
                i21 = 1;
                m3269hoverEffect8wvRk98$default = m3269hoverEffect8wvRk98$default.l0(i.b(aVar, qVar2, null, !z12, null, I1.i.a(r02), function0, 8));
            } else {
                i21 = 1;
            }
            e f18 = a0.f(m3269hoverEffect8wvRk98$default, f17);
            V f19 = C5185h.f(InterfaceC6250b.a.e(), r02);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f21 = c.f(u11, f18);
            Function0 a13 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 f22 = E.f(u11, f19, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f22);
            }
            U7.i.b(u11, f21, -136160020);
            if (function2 != null) {
                function2.invoke(u11, Integer.valueOf((i29 >> 9) & 14));
                Unit unit = Unit.f71690a;
            }
            u11.k();
            e.a aVar2 = e.f40358c0;
            e e11 = androidx.compose.foundation.layout.T.e(C6981a.a(aVar2, z15 ? 0.0f : 1.0f), interfaceC9914x);
            V f23 = C5185h.f(InterfaceC6250b.a.o(), r02);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f24 = c.f(u11, e11);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 f25 = E.f(u11, f23, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, f25);
            }
            F1.b(u11, f24, InterfaceC2801g.a.f());
            if (str3 != null) {
                u11.o(1636314224);
                u11.o(329919028);
                int i31 = (i28 & 1879048192) == 536870912 ? i21 : 0;
                Object C13 = u11.C();
                if (i31 != 0 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new V() { // from class: ru.ozon.uni.components.button.UniButtonKt$BasicButton$4$1$1$1

                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                        /* renamed from: ru.ozon.uni.components.button.UniButtonKt$BasicButton$4$1$1$1$1, reason: invalid class name */
                        static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
                            final /* synthetic */ m0 $contentPlaceable;
                            final /* synthetic */ float $dataPaddingOffset;
                            final /* synthetic */ m0 $dataPlaceable;
                            final /* synthetic */ int $height;
                            final /* synthetic */ Y $this_Layout;
                            final /* synthetic */ int $width;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(m0 m0Var, int i11, m0 m0Var2, int i12, Y y11, float f7) {
                                super(1);
                                this.$contentPlaceable = m0Var;
                                this.$height = i11;
                                this.$dataPlaceable = m0Var2;
                                this.$width = i12;
                                this.$this_Layout = y11;
                                this.$dataPaddingOffset = f7;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                                invoke2(aVar);
                                return Unit.f71690a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(m0.a layout) {
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                m0 m0Var = this.$contentPlaceable;
                                layout.d(m0Var, 0, C3354v2.d(this.$height, 2, m0Var), 0.0f);
                                m0 m0Var2 = this.$dataPlaceable;
                                int u02 = this.$width - m0Var2.u0();
                                int Y02 = this.$this_Layout.Y0(this.$dataPaddingOffset) + this.$contentPlaceable.u0();
                                if (u02 < Y02) {
                                    u02 = Y02;
                                }
                                layout.d(m0Var2, u02, C3354v2.d(this.$height, 2, this.$dataPlaceable), 0.0f);
                            }
                        }

                        @Override // B1.V
                        /* renamed from: measure-3p2s80s */
                        public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j13) {
                            int Y02;
                            W z02;
                            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            int i32 = 0;
                            U u12 = measurables.get(0);
                            U u13 = measurables.get(1);
                            m0 a02 = u12.a0(b.c(0, 0, 0, 0, 10, j13));
                            if (b.g(j13)) {
                                int k11 = (b.k(j13) - a02.u0()) - Layout.Y0(f15);
                                if (k11 >= 0) {
                                    i32 = k11;
                                }
                            } else {
                                i32 = b.k(j13);
                            }
                            m0 a03 = u13.a0(b.c(0, i32, 0, 0, 8, j13));
                            if (b.g(j13)) {
                                Y02 = b.k(j13);
                            } else {
                                Y02 = Layout.Y0(f15) + a03.u0() + a02.u0();
                            }
                            int i33 = Y02;
                            int max = Math.max(a02.l0(), a03.l0());
                            z02 = Layout.z0(i33, max, kotlin.collections.U.c(), new AnonymousClass1(a02, max, a03, i33, Layout, f15));
                            return z02;
                        }
                    };
                    u11.x(C13);
                }
                V v11 = (V) C13;
                u11.k();
                int I13 = u11.I();
                A0 d13 = u11.d();
                e f26 = c.f(u11, eVar);
                Function0 a15 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a15);
                } else {
                    u11.e();
                }
                Function2 f27 = E.f(u11, v11, u11, d13);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                    Ep.a.d(I13, u11, I13, f27);
                }
                F1.b(u11, f26, InterfaceC2801g.a.f());
                TextContent(eVar2, str, t2, abstractC7799Q, u11, ((i19 >> 3) & 14) | ((i19 >> 6) & 112) | ((i28 << 6) & 896) | (i27 & 7168));
                a.b(aVar2, "dataText");
                e uniTestTag = UniTestTagsKt.uniTestTag(aVar2, UniButtonTestTags.DataText, null, u11, 54, 2);
                u11.o(-222567100);
                Object C14 = u11.C();
                if (C14 == InterfaceC3967k.a.a()) {
                    C14 = UniButtonKt$BasicButton$4$1$2$1$1.INSTANCE;
                    u11.x(C14);
                }
                u11.k();
                b11 = androidx.compose.foundation.e.b(C6988h.a(o.a(uniTestTag, (Function1) C14), h.b(f12)), j12, y0.a());
                p2.b(str3, androidx.compose.foundation.layout.T.g(b11, f14, f13), 0L, 0L, 0L, null, 0L, 2, false, 1, 0, T.b(t13, abstractC7799Q3), u11, (i19 >> 15) & 14, 3120, 55292);
                c3969l = u11;
                c3969l.f();
                c3969l.k();
            } else {
                c3969l = u11;
                if (str2 != null && z11) {
                    c3969l.o(1639371289);
                    e h11 = a0.h(aVar2, 0.0f, 38, i21);
                    C5194q a16 = C5193p.a(C5179b.b(), InterfaceC6250b.a.g(), c3969l, 54);
                    int I14 = c3969l.I();
                    A0 d14 = c3969l.d();
                    e f28 = c.f(c3969l, h11);
                    Function0 a17 = InterfaceC2801g.a.a();
                    c3969l.i();
                    if (c3969l.t()) {
                        c3969l.H(a17);
                    } else {
                        c3969l.e();
                    }
                    Function2 g10 = K00.b.g(c3969l, a16, c3969l, d14);
                    if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I14))) {
                        Ep.a.d(I14, c3969l, I14, g10);
                    }
                    F1.b(c3969l, f28, InterfaceC2801g.a.f());
                    int i32 = i19 >> 6;
                    TextContent(eVar2, str, t2, abstractC7799Q, c3969l, ((i19 >> 3) & 14) | (i32 & 112) | ((i28 << 6) & 896) | (i27 & 7168));
                    TextContent(eVar3, str2, t11, abstractC7799Q2, c3969l, (i32 & 14) | ((i19 >> 9) & 112) | ((i28 << 3) & 896) | ((i27 >> 3) & 7168));
                    c3969l.f();
                    c3969l.k();
                } else if (abstractC8972b != null) {
                    c3969l.o(1640284797);
                    androidx.compose.foundation.layout.Y b12 = X.b(C5179b.n(f16), InterfaceC6250b.a.l(), c3969l, 0);
                    int I15 = c3969l.I();
                    A0 d15 = c3969l.d();
                    e f29 = c.f(c3969l, aVar2);
                    Function0 a18 = InterfaceC2801g.a.a();
                    c3969l.i();
                    if (c3969l.t()) {
                        c3969l.H(a18);
                    } else {
                        c3969l.e();
                    }
                    Function2 h12 = Cm.e.h(c3969l, b12, c3969l, d15);
                    if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I15))) {
                        Ep.a.d(I15, c3969l, I15, h12);
                    }
                    F1.b(c3969l, f29, InterfaceC2801g.a.f());
                    c3969l.o(-222448029);
                    a.b(aVar2, "startGraphic");
                    int i33 = i19;
                    e l03 = UniTestTagsKt.uniTestTag(aVar2, UniButtonTestTags.IconName, null, c3969l, 54, 2).l0(new VerticalAlignElement(InterfaceC6250b.a.i()));
                    if (abstractC7799Q5 != null) {
                        c3969l.o(-1460633960);
                        Object C15 = c3969l.C();
                        if (C15 == InterfaceC3967k.a.a()) {
                            C15 = UniButtonKt$BasicButton$4$1$4$1$1$1.INSTANCE;
                            c3969l.x(C15);
                        }
                        c3969l.k();
                        e a19 = androidx.compose.ui.graphics.a.a(aVar2, (Function1) C15);
                        c3969l.o(-1460630183);
                        int i34 = (234881024 & i27) == 67108864 ? i21 : 0;
                        Object C16 = c3969l.C();
                        if (i34 != 0 || C16 == InterfaceC3967k.a.a()) {
                            C16 = new UniButtonKt$BasicButton$4$1$4$1$2$1(abstractC7799Q5);
                            c3969l.x(C16);
                        }
                        c3969l.k();
                        l03 = l03.l0(androidx.compose.ui.draw.c.d(a19, (Function1) C16));
                    }
                    c3969l.k();
                    P0.E.a(abstractC8972b, null, l03, j11, c3969l, ((i33 >> 18) & 14) | 48 | ((i27 >> 12) & 7168));
                    TextContent(eVar2.l0(new VerticalAlignElement(InterfaceC6250b.a.i())), str, t2, abstractC7799Q, c3969l, ((i33 >> 6) & 112) | ((i28 << 6) & 896) | (i27 & 7168));
                    c3969l = c3969l;
                    c3969l.f();
                    c3969l.k();
                } else {
                    int i35 = i19;
                    c3969l.o(1641674062);
                    TextContent(eVar2, str, t2, abstractC7799Q, c3969l, ((i35 >> 3) & 14) | ((i35 >> 6) & 112) | ((i28 << 6) & 896) | (i27 & 7168));
                    c3969l.k();
                }
            }
            c3969l.f();
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new UniButtonKt$BasicButton$5(eVar, eVar2, eVar3, str, str2, str3, abstractC8972b, z11, z12, z13, z14, c7807z, z15, abstractC7799Q, abstractC7799Q2, abstractC7799Q3, abstractC7799Q4, j11, abstractC7799Q5, j12, t2, t11, t12, f7, f11, f12, interfaceC9914x, f13, f14, f15, f16, str4, qVar, function2, function0, i11, i12, i13, i14));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BasicButton_Ci1iAhw$lambda$1(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Loader-RPmYEkk, reason: not valid java name */
    public static final void m1885LoaderRPmYEkk(UniButtonSize uniButtonSize, long j11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        long j12;
        C3969l u11 = interfaceC3967k.u(-933018124);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(uniButtonSize) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.s(j11) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            j12 = j11;
        } else {
            j12 = j11;
            UniLoaderKt.m1924UniLoader3IgeMak(null, j12, WhenMappings.$EnumSwitchMapping$0[uniButtonSize.ordinal()] == 1 ? UniLoaderSize.Size200 : UniLoaderSize.Size300, u11, i12 & 112, 1);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new UniButtonKt$Loader$1(uniButtonSize, j12, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextContent(e eVar, String str, T t2, AbstractC7799Q abstractC7799Q, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        T t11;
        AbstractC7799Q abstractC7799Q2;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(2048976997);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            t11 = t2;
            i12 |= u11.n(t11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            t11 = t2;
        }
        if ((i11 & 3072) == 0) {
            abstractC7799Q2 = abstractC7799Q;
            i12 |= u11.n(abstractC7799Q2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            abstractC7799Q2 = abstractC7799Q;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            u11.o(1534564947);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = UniButtonKt$TextContent$1$1.INSTANCE;
                u11.x(C11);
            }
            u11.k();
            c3969l = u11;
            p2.b(str, o.a(eVar, (Function1) C11), 0L, 0L, 0L, null, 0L, 2, false, 1, 0, T.b(t2, abstractC7799Q), c3969l, (i12 >> 3) & 14, 3120, 55292);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new UniButtonKt$TextContent$2(eVar, str, t11, abstractC7799Q2, i11));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01bf, code lost:
    
        if (r5.p(r60) == false) goto L151;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0369  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UniButton(@NotNull String title, e eVar, String str, String str2, AbstractC8972b abstractC8972b, String str3, Function0<Unit> function0, boolean z11, boolean z12, boolean z13, boolean z14, UniButtonStyleType uniButtonStyleType, UniButtonSize uniButtonSize, boolean z15, q qVar, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        e eVar2;
        int i15;
        String str4;
        int i16;
        String str5;
        int i17;
        AbstractC8972b abstractC8972b2;
        int i18;
        String str6;
        int i19;
        Function0<Unit> function02;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        boolean z16;
        boolean z17;
        boolean z18;
        q qVar2;
        UniButtonSize uniButtonSize2;
        boolean z19;
        boolean z21;
        boolean z22;
        String str7;
        Function0<Unit> function03;
        UniButtonStyleType uniButtonStyleType2;
        boolean z23;
        int i36;
        AbstractC8972b abstractC8972b3;
        int i37;
        boolean z24;
        AbstractC8972b abstractC8972b4;
        C9915y a11;
        long j11;
        boolean z25;
        boolean z26;
        UniButtonStyleType uniButtonStyleType3;
        C4912a c4912a;
        C3969l c3969l;
        String str8;
        String str9;
        AbstractC8972b abstractC8972b5;
        boolean z27;
        boolean z28;
        boolean z29;
        String str10;
        q qVar3;
        Function0<Unit> function04;
        e eVar3;
        UniButtonSize uniButtonSize3;
        UniButtonStyleType uniButtonStyleType4;
        boolean z31;
        boolean z32;
        J0 m02;
        Intrinsics.checkNotNullParameter(title, "title");
        C3969l u11 = interfaceC3967k.u(-341944800);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (u11.n(title) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        int i38 = i13 & 2;
        if (i38 != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i14 |= u11.n(eVar2) ? 32 : 16;
            i15 = i13 & 4;
            if (i15 == 0) {
                i14 |= 384;
            } else if ((i11 & 384) == 0) {
                str4 = str;
                i14 |= u11.n(str4) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i16 = i13 & 8;
                int i39 = 2048;
                if (i16 != 0) {
                    i14 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    str5 = str2;
                    i14 |= u11.n(str5) ? 2048 : 1024;
                    i17 = i13 & 16;
                    if (i17 == 0) {
                        i14 |= 24576;
                    } else if ((i11 & 24576) == 0) {
                        abstractC8972b2 = abstractC8972b;
                        i14 |= u11.n(abstractC8972b2) ? 16384 : 8192;
                        i18 = i13 & 32;
                        if (i18 != 0) {
                            i14 |= 196608;
                            str6 = str3;
                        } else {
                            str6 = str3;
                            if ((i11 & 196608) == 0) {
                                i14 |= u11.n(str6) ? 131072 : 65536;
                            }
                        }
                        i19 = i13 & 64;
                        if (i19 != 0) {
                            i14 |= 1572864;
                            function02 = function0;
                        } else {
                            function02 = function0;
                            if ((i11 & 1572864) == 0) {
                                i14 |= u11.F(function02) ? 1048576 : 524288;
                            }
                        }
                        i21 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i21 != 0) {
                            i14 |= 12582912;
                        } else if ((i11 & 12582912) == 0) {
                            i14 |= u11.p(z11) ? 8388608 : 4194304;
                        }
                        i22 = i13 & 256;
                        if (i22 != 0) {
                            i14 |= 100663296;
                        } else if ((i11 & 100663296) == 0) {
                            i23 = i22;
                            i14 |= u11.p(z12) ? 67108864 : 33554432;
                            i24 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                            if (i24 == 0) {
                                i14 |= 805306368;
                            } else if ((i11 & 805306368) == 0) {
                                i25 = i24;
                                i14 |= u11.p(z13) ? 536870912 : 268435456;
                                i26 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                                if (i26 != 0) {
                                    i28 = i12 | 6;
                                    i27 = i26;
                                } else if ((i12 & 6) == 0) {
                                    i27 = i26;
                                    i28 = i12 | (u11.p(z14) ? 4 : 2);
                                } else {
                                    i27 = i26;
                                    i28 = i12;
                                }
                                i29 = i13 & 2048;
                                if (i29 != 0) {
                                    i28 |= 48;
                                    i31 = i29;
                                } else if ((i12 & 48) == 0) {
                                    i31 = i29;
                                    i28 |= u11.n(uniButtonStyleType) ? 32 : 16;
                                } else {
                                    i31 = i29;
                                }
                                int i41 = i28;
                                i32 = i13 & 4096;
                                if (i32 != 0) {
                                    i33 = i41 | 384;
                                } else {
                                    i33 = i41;
                                    if ((i12 & 384) == 0) {
                                        i33 |= u11.n(uniButtonSize) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                                        if ((i12 & 3072) == 0) {
                                            if ((i13 & 8192) != 0) {
                                            }
                                            i39 = 1024;
                                            i33 |= i39;
                                        }
                                        int i42 = i33;
                                        i34 = i13 & 16384;
                                        if (i34 == 0) {
                                            i35 = i42 | 24576;
                                        } else {
                                            int i43 = i42;
                                            if ((i12 & 24576) == 0) {
                                                i43 |= u11.n(qVar) ? 16384 : 8192;
                                            }
                                            i35 = i43;
                                        }
                                        if ((i14 & 306783379) != 306783378 && (i35 & 9363) == 9362 && u11.b()) {
                                            u11.j();
                                            z32 = z11;
                                            z31 = z12;
                                            uniButtonSize3 = uniButtonSize;
                                            c3969l = u11;
                                            str8 = str4;
                                            str9 = str5;
                                            abstractC8972b5 = abstractC8972b2;
                                            eVar3 = eVar2;
                                            str10 = str6;
                                            function04 = function02;
                                            z28 = z13;
                                            z29 = z14;
                                            uniButtonStyleType4 = uniButtonStyleType;
                                            z27 = z15;
                                            qVar3 = qVar;
                                        } else {
                                            u11.Q0();
                                            if ((i11 & 1) != 0 || u11.w0()) {
                                                e eVar4 = i38 == 0 ? e.f40358c0 : eVar2;
                                                if (i15 != 0) {
                                                    str4 = null;
                                                }
                                                if (i16 != 0) {
                                                    str5 = null;
                                                }
                                                if (i17 != 0) {
                                                    abstractC8972b2 = null;
                                                }
                                                if (i18 != 0) {
                                                    str6 = null;
                                                }
                                                if (i19 != 0) {
                                                    function02 = null;
                                                }
                                                boolean z33 = i21 == 0 ? false : z11;
                                                boolean z34 = i23 == 0 ? false : z12;
                                                boolean z35 = i25 == 0 ? false : z13;
                                                z16 = i27 == 0 ? false : z14;
                                                UniButtonStyleType uniButtonStyleType5 = i31 == 0 ? UniButtonStyleType.ActionPrimary.INSTANCE : uniButtonStyleType;
                                                UniButtonSize uniButtonSize4 = i32 == 0 ? UniButtonSize.SIZE_500 : uniButtonSize;
                                                e eVar5 = eVar4;
                                                if ((i13 & 8192) == 0) {
                                                    z17 = (str4 != null && uniButtonSize4 == UniButtonSize.SIZE_600) || uniButtonSize4 == UniButtonSize.SIZE_700;
                                                    i35 &= -7169;
                                                } else {
                                                    z17 = z15;
                                                }
                                                int i44 = i35;
                                                if (i34 == 0) {
                                                    u11.o(1060768558);
                                                    Object C11 = u11.C();
                                                    z18 = z17;
                                                    if (C11 == InterfaceC3967k.a.a()) {
                                                        C11 = p.a();
                                                        u11.x(C11);
                                                    }
                                                    u11.k();
                                                    qVar2 = (q) C11;
                                                } else {
                                                    z18 = z17;
                                                    qVar2 = qVar;
                                                }
                                                uniButtonSize2 = uniButtonSize4;
                                                z19 = z33;
                                                z21 = z34;
                                                z22 = z35;
                                                str7 = str6;
                                                function03 = function02;
                                                uniButtonStyleType2 = uniButtonStyleType5;
                                                eVar2 = eVar5;
                                                z23 = z18;
                                                i36 = i14;
                                                abstractC8972b3 = abstractC8972b2;
                                                i37 = i44;
                                            } else {
                                                u11.j();
                                                if ((i13 & 8192) != 0) {
                                                    i35 &= -7169;
                                                }
                                                z19 = z11;
                                                z21 = z12;
                                                z22 = z13;
                                                z16 = z14;
                                                uniButtonSize2 = uniButtonSize;
                                                z23 = z15;
                                                qVar2 = qVar;
                                                str7 = str6;
                                                function03 = function02;
                                                i36 = i14;
                                                abstractC8972b3 = abstractC8972b2;
                                                i37 = i35;
                                                uniButtonStyleType2 = uniButtonStyleType;
                                            }
                                            u11.j0();
                                            if (str5 == null) {
                                                z24 = z23;
                                                abstractC8972b4 = abstractC8972b3;
                                                a11 = androidx.compose.foundation.layout.T.b(uniButtonSize2.getDefaultPadding(), 0.0f, uniButtonSize2.getDataEndPadding(), 0.0f, 10);
                                            } else {
                                                z24 = z23;
                                                abstractC8972b4 = abstractC8972b3;
                                                a11 = str4 != null ? androidx.compose.foundation.layout.T.a(uniButtonSize2.getDefaultPadding(), 2, 0.0f) : abstractC8972b4 != null ? androidx.compose.foundation.layout.T.b(uniButtonSize2.getIconStartPadding(), 0.0f, uniButtonSize2.getDefaultPadding(), 0.0f, 10) : androidx.compose.foundation.layout.T.a(uniButtonSize2.getDefaultPadding(), 2, 0.0f);
                                            }
                                            C9915y c9915y = a11;
                                            u11.o(1060783976);
                                            if (uniButtonSize2 != UniButtonSize.SIZE_400 || uniButtonSize2 == UniButtonSize.SIZE_500) {
                                                j11 = C7807Z.f72258l;
                                            } else {
                                                if (uniButtonSize2 != UniButtonSize.SIZE_600 && uniButtonSize2 != UniButtonSize.SIZE_700) {
                                                    throw new Sc.o();
                                                }
                                                j11 = DeferredColor.getValue(uniButtonStyleType2.getDataBackgroundColor(), u11, 0);
                                            }
                                            long j12 = j11;
                                            u11.k();
                                            float cornerRadius = !z19 ? 99 : uniButtonSize2.getCornerRadius();
                                            e eVar6 = eVar2;
                                            e uniTestTag = UniTestTagsKt.uniTestTag(eVar6, UniButtonTestTags.Container, null, u11, ((i36 >> 3) & 14) | 48, 2);
                                            e.a aVar = e.f40358c0;
                                            e uniTestTag2 = UniTestTagsKt.uniTestTag(aVar, UniButtonTestTags.Title, null, u11, 54, 2);
                                            a.b(uniTestTag2, SelectionItemFormDTO.TITLE_FIELD_NAME);
                                            e uniTestTag3 = UniTestTagsKt.uniTestTag(aVar, UniButtonTestTags.Subtitle, null, u11, 54, 2);
                                            a.b(uniTestTag3, "subtitle");
                                            u11.o(1060813055);
                                            z25 = uniButtonStyleType2 instanceof UniButtonStyleType.Custom;
                                            if (z25) {
                                                Object backgroundColorActive = uniButtonStyleType2.getBackgroundColorActive();
                                                if ((backgroundColorActive == null ? null : C7807Z.m(DeferredColor.getValue(backgroundColorActive, u11, 0))) != null) {
                                                    z26 = true;
                                                    u11.k();
                                                    boolean z36 = (z26 && z25) ? false : true;
                                                    Object backgroundColorActive2 = uniButtonStyleType2.getBackgroundColorActive();
                                                    u11.o(1060819564);
                                                    C7807Z m11 = backgroundColorActive2 == null ? null : C7807Z.m(DeferredColor.getValue(backgroundColorActive2, u11, 0));
                                                    u11.k();
                                                    u11.o(1060821467);
                                                    if (z16) {
                                                        uniButtonStyleType3 = uniButtonStyleType2;
                                                        c4912a = a1.c.c(-307768653, new UniButtonKt$UniButton$2(uniButtonSize2, uniButtonStyleType2), u11);
                                                    } else {
                                                        uniButtonStyleType3 = uniButtonStyleType2;
                                                        c4912a = null;
                                                    }
                                                    u11.k();
                                                    AbstractC7799Q value = DeferredBrush.getValue(uniButtonStyleType3.getTitleTextColor(), u11, 0);
                                                    AbstractC7799Q value2 = DeferredBrush.getValue(uniButtonStyleType3.getSubtitleTextColor(), u11, 0);
                                                    AbstractC7799Q value3 = DeferredBrush.getValue(uniButtonStyleType3.getDataTextColor(), u11, 0);
                                                    AbstractC7799Q value4 = DeferredBrush.getValue(uniButtonStyleType3.getBackgroundColor(), u11, 0);
                                                    long value5 = DeferredColor.getValue(uniButtonStyleType3.getIconColor(), u11, 0);
                                                    Object gradientIconColor = uniButtonStyleType3.getGradientIconColor();
                                                    u11.o(1060836940);
                                                    AbstractC7799Q value6 = gradientIconColor != null ? DeferredBrush.getValue(gradientIconColor, u11, 0) : null;
                                                    u11.k();
                                                    int i45 = i36 << 6;
                                                    int i46 = ((i36 << 9) & 7168) | (i45 & 57344) | (i45 & 458752) | (i45 & 3670016) | ((i37 << 12) & 29360128) | (234881024 & i36) | (1879048192 & i36);
                                                    int i47 = (i37 << 6) & 896;
                                                    int i48 = ((i37 >> 6) & 896) | ((i36 >> 12) & 112) | ((i36 >> 6) & 57344);
                                                    c3969l = u11;
                                                    String str11 = str4;
                                                    String str12 = str5;
                                                    C7807Z c7807z = m11;
                                                    boolean z37 = z16;
                                                    boolean z38 = z24;
                                                    boolean z39 = z36;
                                                    AbstractC8972b abstractC8972b6 = abstractC8972b4;
                                                    m1884BasicButtonCi1iAhw(uniTestTag, uniTestTag2, uniTestTag3, title, str11, str12, abstractC8972b6, z38, z21, z22, z39, c7807z, z37, value, value2, value3, value4, value5, value6, j12, uniButtonSize2.getTitleTextStyle(), uniButtonSize2.getSubtitleTextStyle(), uniButtonSize2.getDataTextStyle(), uniButtonSize2.getHeight(), cornerRadius, uniButtonSize2.getDataCornerRadius(), c9915y, uniButtonSize2.getDataVerticalPadding(), uniButtonSize2.getDataHorizontalPadding(), uniButtonSize2.getDataStartOffset(), uniButtonSize2.getIconTitleGap(), str7, qVar2, c4912a, function03, c3969l, i46, i47, 0, i48);
                                                    str8 = str11;
                                                    str9 = str12;
                                                    abstractC8972b5 = abstractC8972b6;
                                                    z27 = z38;
                                                    z28 = z22;
                                                    z29 = z37;
                                                    str10 = str7;
                                                    qVar3 = qVar2;
                                                    function04 = function03;
                                                    eVar3 = eVar6;
                                                    uniButtonSize3 = uniButtonSize2;
                                                    uniButtonStyleType4 = uniButtonStyleType3;
                                                    z31 = z21;
                                                    z32 = z19;
                                                }
                                            }
                                            z26 = false;
                                            u11.k();
                                            if (z26) {
                                            }
                                            Object backgroundColorActive22 = uniButtonStyleType2.getBackgroundColorActive();
                                            u11.o(1060819564);
                                            if (backgroundColorActive22 == null) {
                                            }
                                            u11.k();
                                            u11.o(1060821467);
                                            if (z16) {
                                            }
                                            u11.k();
                                            AbstractC7799Q value7 = DeferredBrush.getValue(uniButtonStyleType3.getTitleTextColor(), u11, 0);
                                            AbstractC7799Q value22 = DeferredBrush.getValue(uniButtonStyleType3.getSubtitleTextColor(), u11, 0);
                                            AbstractC7799Q value32 = DeferredBrush.getValue(uniButtonStyleType3.getDataTextColor(), u11, 0);
                                            AbstractC7799Q value42 = DeferredBrush.getValue(uniButtonStyleType3.getBackgroundColor(), u11, 0);
                                            long value52 = DeferredColor.getValue(uniButtonStyleType3.getIconColor(), u11, 0);
                                            Object gradientIconColor2 = uniButtonStyleType3.getGradientIconColor();
                                            u11.o(1060836940);
                                            AbstractC7799Q value62 = gradientIconColor2 != null ? DeferredBrush.getValue(gradientIconColor2, u11, 0) : null;
                                            u11.k();
                                            int i452 = i36 << 6;
                                            int i462 = ((i36 << 9) & 7168) | (i452 & 57344) | (i452 & 458752) | (i452 & 3670016) | ((i37 << 12) & 29360128) | (234881024 & i36) | (1879048192 & i36);
                                            int i472 = (i37 << 6) & 896;
                                            int i482 = ((i37 >> 6) & 896) | ((i36 >> 12) & 112) | ((i36 >> 6) & 57344);
                                            c3969l = u11;
                                            String str112 = str4;
                                            String str122 = str5;
                                            C7807Z c7807z2 = m11;
                                            boolean z372 = z16;
                                            boolean z382 = z24;
                                            boolean z392 = z36;
                                            AbstractC8972b abstractC8972b62 = abstractC8972b4;
                                            m1884BasicButtonCi1iAhw(uniTestTag, uniTestTag2, uniTestTag3, title, str112, str122, abstractC8972b62, z382, z21, z22, z392, c7807z2, z372, value7, value22, value32, value42, value52, value62, j12, uniButtonSize2.getTitleTextStyle(), uniButtonSize2.getSubtitleTextStyle(), uniButtonSize2.getDataTextStyle(), uniButtonSize2.getHeight(), cornerRadius, uniButtonSize2.getDataCornerRadius(), c9915y, uniButtonSize2.getDataVerticalPadding(), uniButtonSize2.getDataHorizontalPadding(), uniButtonSize2.getDataStartOffset(), uniButtonSize2.getIconTitleGap(), str7, qVar2, c4912a, function03, c3969l, i462, i472, 0, i482);
                                            str8 = str112;
                                            str9 = str122;
                                            abstractC8972b5 = abstractC8972b62;
                                            z27 = z382;
                                            z28 = z22;
                                            z29 = z372;
                                            str10 = str7;
                                            qVar3 = qVar2;
                                            function04 = function03;
                                            eVar3 = eVar6;
                                            uniButtonSize3 = uniButtonSize2;
                                            uniButtonStyleType4 = uniButtonStyleType3;
                                            z31 = z21;
                                            z32 = z19;
                                        }
                                        m02 = c3969l.m0();
                                        if (m02 == null) {
                                            m02.G(new UniButtonKt$UniButton$3(title, eVar3, str8, str9, abstractC8972b5, str10, function04, z32, z31, z28, z29, uniButtonStyleType4, uniButtonSize3, z27, qVar3, i11, i12, i13));
                                            return;
                                        }
                                        return;
                                    }
                                }
                                if ((i12 & 3072) == 0) {
                                }
                                int i422 = i33;
                                i34 = i13 & 16384;
                                if (i34 == 0) {
                                }
                                if ((i14 & 306783379) != 306783378) {
                                }
                                u11.Q0();
                                if ((i11 & 1) != 0) {
                                }
                                if (i38 == 0) {
                                }
                                if (i15 != 0) {
                                }
                                if (i16 != 0) {
                                }
                                if (i17 != 0) {
                                }
                                if (i18 != 0) {
                                }
                                if (i19 != 0) {
                                }
                                if (i21 == 0) {
                                }
                                if (i23 == 0) {
                                }
                                if (i25 == 0) {
                                }
                                if (i27 == 0) {
                                }
                                if (i31 == 0) {
                                }
                                if (i32 == 0) {
                                }
                                e eVar52 = eVar4;
                                if ((i13 & 8192) == 0) {
                                }
                                int i442 = i35;
                                if (i34 == 0) {
                                }
                                uniButtonSize2 = uniButtonSize4;
                                z19 = z33;
                                z21 = z34;
                                z22 = z35;
                                str7 = str6;
                                function03 = function02;
                                uniButtonStyleType2 = uniButtonStyleType5;
                                eVar2 = eVar52;
                                z23 = z18;
                                i36 = i14;
                                abstractC8972b3 = abstractC8972b2;
                                i37 = i442;
                                u11.j0();
                                if (str5 == null) {
                                }
                                C9915y c9915y2 = a11;
                                u11.o(1060783976);
                                if (uniButtonSize2 != UniButtonSize.SIZE_400) {
                                }
                                j11 = C7807Z.f72258l;
                                long j122 = j11;
                                u11.k();
                                float cornerRadius2 = !z19 ? 99 : uniButtonSize2.getCornerRadius();
                                e eVar62 = eVar2;
                                e uniTestTag4 = UniTestTagsKt.uniTestTag(eVar62, UniButtonTestTags.Container, null, u11, ((i36 >> 3) & 14) | 48, 2);
                                e.a aVar2 = e.f40358c0;
                                e uniTestTag22 = UniTestTagsKt.uniTestTag(aVar2, UniButtonTestTags.Title, null, u11, 54, 2);
                                a.b(uniTestTag22, SelectionItemFormDTO.TITLE_FIELD_NAME);
                                e uniTestTag32 = UniTestTagsKt.uniTestTag(aVar2, UniButtonTestTags.Subtitle, null, u11, 54, 2);
                                a.b(uniTestTag32, "subtitle");
                                u11.o(1060813055);
                                z25 = uniButtonStyleType2 instanceof UniButtonStyleType.Custom;
                                if (z25) {
                                }
                                z26 = false;
                                u11.k();
                                if (z26) {
                                }
                                Object backgroundColorActive222 = uniButtonStyleType2.getBackgroundColorActive();
                                u11.o(1060819564);
                                if (backgroundColorActive222 == null) {
                                }
                                u11.k();
                                u11.o(1060821467);
                                if (z16) {
                                }
                                u11.k();
                                AbstractC7799Q value72 = DeferredBrush.getValue(uniButtonStyleType3.getTitleTextColor(), u11, 0);
                                AbstractC7799Q value222 = DeferredBrush.getValue(uniButtonStyleType3.getSubtitleTextColor(), u11, 0);
                                AbstractC7799Q value322 = DeferredBrush.getValue(uniButtonStyleType3.getDataTextColor(), u11, 0);
                                AbstractC7799Q value422 = DeferredBrush.getValue(uniButtonStyleType3.getBackgroundColor(), u11, 0);
                                long value522 = DeferredColor.getValue(uniButtonStyleType3.getIconColor(), u11, 0);
                                Object gradientIconColor22 = uniButtonStyleType3.getGradientIconColor();
                                u11.o(1060836940);
                                AbstractC7799Q value622 = gradientIconColor22 != null ? DeferredBrush.getValue(gradientIconColor22, u11, 0) : null;
                                u11.k();
                                int i4522 = i36 << 6;
                                int i4622 = ((i36 << 9) & 7168) | (i4522 & 57344) | (i4522 & 458752) | (i4522 & 3670016) | ((i37 << 12) & 29360128) | (234881024 & i36) | (1879048192 & i36);
                                int i4722 = (i37 << 6) & 896;
                                int i4822 = ((i37 >> 6) & 896) | ((i36 >> 12) & 112) | ((i36 >> 6) & 57344);
                                c3969l = u11;
                                String str1122 = str4;
                                String str1222 = str5;
                                C7807Z c7807z22 = m11;
                                boolean z3722 = z16;
                                boolean z3822 = z24;
                                boolean z3922 = z36;
                                AbstractC8972b abstractC8972b622 = abstractC8972b4;
                                m1884BasicButtonCi1iAhw(uniTestTag4, uniTestTag22, uniTestTag32, title, str1122, str1222, abstractC8972b622, z3822, z21, z22, z3922, c7807z22, z3722, value72, value222, value322, value422, value522, value622, j122, uniButtonSize2.getTitleTextStyle(), uniButtonSize2.getSubtitleTextStyle(), uniButtonSize2.getDataTextStyle(), uniButtonSize2.getHeight(), cornerRadius2, uniButtonSize2.getDataCornerRadius(), c9915y2, uniButtonSize2.getDataVerticalPadding(), uniButtonSize2.getDataHorizontalPadding(), uniButtonSize2.getDataStartOffset(), uniButtonSize2.getIconTitleGap(), str7, qVar2, c4912a, function03, c3969l, i4622, i4722, 0, i4822);
                                str8 = str1122;
                                str9 = str1222;
                                abstractC8972b5 = abstractC8972b622;
                                z27 = z3822;
                                z28 = z22;
                                z29 = z3722;
                                str10 = str7;
                                qVar3 = qVar2;
                                function04 = function03;
                                eVar3 = eVar62;
                                uniButtonSize3 = uniButtonSize2;
                                uniButtonStyleType4 = uniButtonStyleType3;
                                z31 = z21;
                                z32 = z19;
                                m02 = c3969l.m0();
                                if (m02 == null) {
                                }
                            }
                            i25 = i24;
                            i26 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                            if (i26 != 0) {
                            }
                            i29 = i13 & 2048;
                            if (i29 != 0) {
                            }
                            int i412 = i28;
                            i32 = i13 & 4096;
                            if (i32 != 0) {
                            }
                            if ((i12 & 3072) == 0) {
                            }
                            int i4222 = i33;
                            i34 = i13 & 16384;
                            if (i34 == 0) {
                            }
                            if ((i14 & 306783379) != 306783378) {
                            }
                            u11.Q0();
                            if ((i11 & 1) != 0) {
                            }
                            if (i38 == 0) {
                            }
                            if (i15 != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i17 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i19 != 0) {
                            }
                            if (i21 == 0) {
                            }
                            if (i23 == 0) {
                            }
                            if (i25 == 0) {
                            }
                            if (i27 == 0) {
                            }
                            if (i31 == 0) {
                            }
                            if (i32 == 0) {
                            }
                            e eVar522 = eVar4;
                            if ((i13 & 8192) == 0) {
                            }
                            int i4422 = i35;
                            if (i34 == 0) {
                            }
                            uniButtonSize2 = uniButtonSize4;
                            z19 = z33;
                            z21 = z34;
                            z22 = z35;
                            str7 = str6;
                            function03 = function02;
                            uniButtonStyleType2 = uniButtonStyleType5;
                            eVar2 = eVar522;
                            z23 = z18;
                            i36 = i14;
                            abstractC8972b3 = abstractC8972b2;
                            i37 = i4422;
                            u11.j0();
                            if (str5 == null) {
                            }
                            C9915y c9915y22 = a11;
                            u11.o(1060783976);
                            if (uniButtonSize2 != UniButtonSize.SIZE_400) {
                            }
                            j11 = C7807Z.f72258l;
                            long j1222 = j11;
                            u11.k();
                            float cornerRadius22 = !z19 ? 99 : uniButtonSize2.getCornerRadius();
                            e eVar622 = eVar2;
                            e uniTestTag42 = UniTestTagsKt.uniTestTag(eVar622, UniButtonTestTags.Container, null, u11, ((i36 >> 3) & 14) | 48, 2);
                            e.a aVar22 = e.f40358c0;
                            e uniTestTag222 = UniTestTagsKt.uniTestTag(aVar22, UniButtonTestTags.Title, null, u11, 54, 2);
                            a.b(uniTestTag222, SelectionItemFormDTO.TITLE_FIELD_NAME);
                            e uniTestTag322 = UniTestTagsKt.uniTestTag(aVar22, UniButtonTestTags.Subtitle, null, u11, 54, 2);
                            a.b(uniTestTag322, "subtitle");
                            u11.o(1060813055);
                            z25 = uniButtonStyleType2 instanceof UniButtonStyleType.Custom;
                            if (z25) {
                            }
                            z26 = false;
                            u11.k();
                            if (z26) {
                            }
                            Object backgroundColorActive2222 = uniButtonStyleType2.getBackgroundColorActive();
                            u11.o(1060819564);
                            if (backgroundColorActive2222 == null) {
                            }
                            u11.k();
                            u11.o(1060821467);
                            if (z16) {
                            }
                            u11.k();
                            AbstractC7799Q value722 = DeferredBrush.getValue(uniButtonStyleType3.getTitleTextColor(), u11, 0);
                            AbstractC7799Q value2222 = DeferredBrush.getValue(uniButtonStyleType3.getSubtitleTextColor(), u11, 0);
                            AbstractC7799Q value3222 = DeferredBrush.getValue(uniButtonStyleType3.getDataTextColor(), u11, 0);
                            AbstractC7799Q value4222 = DeferredBrush.getValue(uniButtonStyleType3.getBackgroundColor(), u11, 0);
                            long value5222 = DeferredColor.getValue(uniButtonStyleType3.getIconColor(), u11, 0);
                            Object gradientIconColor222 = uniButtonStyleType3.getGradientIconColor();
                            u11.o(1060836940);
                            AbstractC7799Q value6222 = gradientIconColor222 != null ? DeferredBrush.getValue(gradientIconColor222, u11, 0) : null;
                            u11.k();
                            int i45222 = i36 << 6;
                            int i46222 = ((i36 << 9) & 7168) | (i45222 & 57344) | (i45222 & 458752) | (i45222 & 3670016) | ((i37 << 12) & 29360128) | (234881024 & i36) | (1879048192 & i36);
                            int i47222 = (i37 << 6) & 896;
                            int i48222 = ((i37 >> 6) & 896) | ((i36 >> 12) & 112) | ((i36 >> 6) & 57344);
                            c3969l = u11;
                            String str11222 = str4;
                            String str12222 = str5;
                            C7807Z c7807z222 = m11;
                            boolean z37222 = z16;
                            boolean z38222 = z24;
                            boolean z39222 = z36;
                            AbstractC8972b abstractC8972b6222 = abstractC8972b4;
                            m1884BasicButtonCi1iAhw(uniTestTag42, uniTestTag222, uniTestTag322, title, str11222, str12222, abstractC8972b6222, z38222, z21, z22, z39222, c7807z222, z37222, value722, value2222, value3222, value4222, value5222, value6222, j1222, uniButtonSize2.getTitleTextStyle(), uniButtonSize2.getSubtitleTextStyle(), uniButtonSize2.getDataTextStyle(), uniButtonSize2.getHeight(), cornerRadius22, uniButtonSize2.getDataCornerRadius(), c9915y22, uniButtonSize2.getDataVerticalPadding(), uniButtonSize2.getDataHorizontalPadding(), uniButtonSize2.getDataStartOffset(), uniButtonSize2.getIconTitleGap(), str7, qVar2, c4912a, function03, c3969l, i46222, i47222, 0, i48222);
                            str8 = str11222;
                            str9 = str12222;
                            abstractC8972b5 = abstractC8972b6222;
                            z27 = z38222;
                            z28 = z22;
                            z29 = z37222;
                            str10 = str7;
                            qVar3 = qVar2;
                            function04 = function03;
                            eVar3 = eVar622;
                            uniButtonSize3 = uniButtonSize2;
                            uniButtonStyleType4 = uniButtonStyleType3;
                            z31 = z21;
                            z32 = z19;
                            m02 = c3969l.m0();
                            if (m02 == null) {
                            }
                        }
                        i23 = i22;
                        i24 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                        if (i24 == 0) {
                        }
                        i25 = i24;
                        i26 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                        if (i26 != 0) {
                        }
                        i29 = i13 & 2048;
                        if (i29 != 0) {
                        }
                        int i4122 = i28;
                        i32 = i13 & 4096;
                        if (i32 != 0) {
                        }
                        if ((i12 & 3072) == 0) {
                        }
                        int i42222 = i33;
                        i34 = i13 & 16384;
                        if (i34 == 0) {
                        }
                        if ((i14 & 306783379) != 306783378) {
                        }
                        u11.Q0();
                        if ((i11 & 1) != 0) {
                        }
                        if (i38 == 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        if (i21 == 0) {
                        }
                        if (i23 == 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (i27 == 0) {
                        }
                        if (i31 == 0) {
                        }
                        if (i32 == 0) {
                        }
                        e eVar5222 = eVar4;
                        if ((i13 & 8192) == 0) {
                        }
                        int i44222 = i35;
                        if (i34 == 0) {
                        }
                        uniButtonSize2 = uniButtonSize4;
                        z19 = z33;
                        z21 = z34;
                        z22 = z35;
                        str7 = str6;
                        function03 = function02;
                        uniButtonStyleType2 = uniButtonStyleType5;
                        eVar2 = eVar5222;
                        z23 = z18;
                        i36 = i14;
                        abstractC8972b3 = abstractC8972b2;
                        i37 = i44222;
                        u11.j0();
                        if (str5 == null) {
                        }
                        C9915y c9915y222 = a11;
                        u11.o(1060783976);
                        if (uniButtonSize2 != UniButtonSize.SIZE_400) {
                        }
                        j11 = C7807Z.f72258l;
                        long j12222 = j11;
                        u11.k();
                        float cornerRadius222 = !z19 ? 99 : uniButtonSize2.getCornerRadius();
                        e eVar6222 = eVar2;
                        e uniTestTag422 = UniTestTagsKt.uniTestTag(eVar6222, UniButtonTestTags.Container, null, u11, ((i36 >> 3) & 14) | 48, 2);
                        e.a aVar222 = e.f40358c0;
                        e uniTestTag2222 = UniTestTagsKt.uniTestTag(aVar222, UniButtonTestTags.Title, null, u11, 54, 2);
                        a.b(uniTestTag2222, SelectionItemFormDTO.TITLE_FIELD_NAME);
                        e uniTestTag3222 = UniTestTagsKt.uniTestTag(aVar222, UniButtonTestTags.Subtitle, null, u11, 54, 2);
                        a.b(uniTestTag3222, "subtitle");
                        u11.o(1060813055);
                        z25 = uniButtonStyleType2 instanceof UniButtonStyleType.Custom;
                        if (z25) {
                        }
                        z26 = false;
                        u11.k();
                        if (z26) {
                        }
                        Object backgroundColorActive22222 = uniButtonStyleType2.getBackgroundColorActive();
                        u11.o(1060819564);
                        if (backgroundColorActive22222 == null) {
                        }
                        u11.k();
                        u11.o(1060821467);
                        if (z16) {
                        }
                        u11.k();
                        AbstractC7799Q value7222 = DeferredBrush.getValue(uniButtonStyleType3.getTitleTextColor(), u11, 0);
                        AbstractC7799Q value22222 = DeferredBrush.getValue(uniButtonStyleType3.getSubtitleTextColor(), u11, 0);
                        AbstractC7799Q value32222 = DeferredBrush.getValue(uniButtonStyleType3.getDataTextColor(), u11, 0);
                        AbstractC7799Q value42222 = DeferredBrush.getValue(uniButtonStyleType3.getBackgroundColor(), u11, 0);
                        long value52222 = DeferredColor.getValue(uniButtonStyleType3.getIconColor(), u11, 0);
                        Object gradientIconColor2222 = uniButtonStyleType3.getGradientIconColor();
                        u11.o(1060836940);
                        AbstractC7799Q value62222 = gradientIconColor2222 != null ? DeferredBrush.getValue(gradientIconColor2222, u11, 0) : null;
                        u11.k();
                        int i452222 = i36 << 6;
                        int i462222 = ((i36 << 9) & 7168) | (i452222 & 57344) | (i452222 & 458752) | (i452222 & 3670016) | ((i37 << 12) & 29360128) | (234881024 & i36) | (1879048192 & i36);
                        int i472222 = (i37 << 6) & 896;
                        int i482222 = ((i37 >> 6) & 896) | ((i36 >> 12) & 112) | ((i36 >> 6) & 57344);
                        c3969l = u11;
                        String str112222 = str4;
                        String str122222 = str5;
                        C7807Z c7807z2222 = m11;
                        boolean z372222 = z16;
                        boolean z382222 = z24;
                        boolean z392222 = z36;
                        AbstractC8972b abstractC8972b62222 = abstractC8972b4;
                        m1884BasicButtonCi1iAhw(uniTestTag422, uniTestTag2222, uniTestTag3222, title, str112222, str122222, abstractC8972b62222, z382222, z21, z22, z392222, c7807z2222, z372222, value7222, value22222, value32222, value42222, value52222, value62222, j12222, uniButtonSize2.getTitleTextStyle(), uniButtonSize2.getSubtitleTextStyle(), uniButtonSize2.getDataTextStyle(), uniButtonSize2.getHeight(), cornerRadius222, uniButtonSize2.getDataCornerRadius(), c9915y222, uniButtonSize2.getDataVerticalPadding(), uniButtonSize2.getDataHorizontalPadding(), uniButtonSize2.getDataStartOffset(), uniButtonSize2.getIconTitleGap(), str7, qVar2, c4912a, function03, c3969l, i462222, i472222, 0, i482222);
                        str8 = str112222;
                        str9 = str122222;
                        abstractC8972b5 = abstractC8972b62222;
                        z27 = z382222;
                        z28 = z22;
                        z29 = z372222;
                        str10 = str7;
                        qVar3 = qVar2;
                        function04 = function03;
                        eVar3 = eVar6222;
                        uniButtonSize3 = uniButtonSize2;
                        uniButtonStyleType4 = uniButtonStyleType3;
                        z31 = z21;
                        z32 = z19;
                        m02 = c3969l.m0();
                        if (m02 == null) {
                        }
                    }
                    abstractC8972b2 = abstractC8972b;
                    i18 = i13 & 32;
                    if (i18 != 0) {
                    }
                    i19 = i13 & 64;
                    if (i19 != 0) {
                    }
                    i21 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i21 != 0) {
                    }
                    i22 = i13 & 256;
                    if (i22 != 0) {
                    }
                    i23 = i22;
                    i24 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                    if (i24 == 0) {
                    }
                    i25 = i24;
                    i26 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                    if (i26 != 0) {
                    }
                    i29 = i13 & 2048;
                    if (i29 != 0) {
                    }
                    int i41222 = i28;
                    i32 = i13 & 4096;
                    if (i32 != 0) {
                    }
                    if ((i12 & 3072) == 0) {
                    }
                    int i422222 = i33;
                    i34 = i13 & 16384;
                    if (i34 == 0) {
                    }
                    if ((i14 & 306783379) != 306783378) {
                    }
                    u11.Q0();
                    if ((i11 & 1) != 0) {
                    }
                    if (i38 == 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (i23 == 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (i27 == 0) {
                    }
                    if (i31 == 0) {
                    }
                    if (i32 == 0) {
                    }
                    e eVar52222 = eVar4;
                    if ((i13 & 8192) == 0) {
                    }
                    int i442222 = i35;
                    if (i34 == 0) {
                    }
                    uniButtonSize2 = uniButtonSize4;
                    z19 = z33;
                    z21 = z34;
                    z22 = z35;
                    str7 = str6;
                    function03 = function02;
                    uniButtonStyleType2 = uniButtonStyleType5;
                    eVar2 = eVar52222;
                    z23 = z18;
                    i36 = i14;
                    abstractC8972b3 = abstractC8972b2;
                    i37 = i442222;
                    u11.j0();
                    if (str5 == null) {
                    }
                    C9915y c9915y2222 = a11;
                    u11.o(1060783976);
                    if (uniButtonSize2 != UniButtonSize.SIZE_400) {
                    }
                    j11 = C7807Z.f72258l;
                    long j122222 = j11;
                    u11.k();
                    float cornerRadius2222 = !z19 ? 99 : uniButtonSize2.getCornerRadius();
                    e eVar62222 = eVar2;
                    e uniTestTag4222 = UniTestTagsKt.uniTestTag(eVar62222, UniButtonTestTags.Container, null, u11, ((i36 >> 3) & 14) | 48, 2);
                    e.a aVar2222 = e.f40358c0;
                    e uniTestTag22222 = UniTestTagsKt.uniTestTag(aVar2222, UniButtonTestTags.Title, null, u11, 54, 2);
                    a.b(uniTestTag22222, SelectionItemFormDTO.TITLE_FIELD_NAME);
                    e uniTestTag32222 = UniTestTagsKt.uniTestTag(aVar2222, UniButtonTestTags.Subtitle, null, u11, 54, 2);
                    a.b(uniTestTag32222, "subtitle");
                    u11.o(1060813055);
                    z25 = uniButtonStyleType2 instanceof UniButtonStyleType.Custom;
                    if (z25) {
                    }
                    z26 = false;
                    u11.k();
                    if (z26) {
                    }
                    Object backgroundColorActive222222 = uniButtonStyleType2.getBackgroundColorActive();
                    u11.o(1060819564);
                    if (backgroundColorActive222222 == null) {
                    }
                    u11.k();
                    u11.o(1060821467);
                    if (z16) {
                    }
                    u11.k();
                    AbstractC7799Q value72222 = DeferredBrush.getValue(uniButtonStyleType3.getTitleTextColor(), u11, 0);
                    AbstractC7799Q value222222 = DeferredBrush.getValue(uniButtonStyleType3.getSubtitleTextColor(), u11, 0);
                    AbstractC7799Q value322222 = DeferredBrush.getValue(uniButtonStyleType3.getDataTextColor(), u11, 0);
                    AbstractC7799Q value422222 = DeferredBrush.getValue(uniButtonStyleType3.getBackgroundColor(), u11, 0);
                    long value522222 = DeferredColor.getValue(uniButtonStyleType3.getIconColor(), u11, 0);
                    Object gradientIconColor22222 = uniButtonStyleType3.getGradientIconColor();
                    u11.o(1060836940);
                    AbstractC7799Q value622222 = gradientIconColor22222 != null ? DeferredBrush.getValue(gradientIconColor22222, u11, 0) : null;
                    u11.k();
                    int i4522222 = i36 << 6;
                    int i4622222 = ((i36 << 9) & 7168) | (i4522222 & 57344) | (i4522222 & 458752) | (i4522222 & 3670016) | ((i37 << 12) & 29360128) | (234881024 & i36) | (1879048192 & i36);
                    int i4722222 = (i37 << 6) & 896;
                    int i4822222 = ((i37 >> 6) & 896) | ((i36 >> 12) & 112) | ((i36 >> 6) & 57344);
                    c3969l = u11;
                    String str1122222 = str4;
                    String str1222222 = str5;
                    C7807Z c7807z22222 = m11;
                    boolean z3722222 = z16;
                    boolean z3822222 = z24;
                    boolean z3922222 = z36;
                    AbstractC8972b abstractC8972b622222 = abstractC8972b4;
                    m1884BasicButtonCi1iAhw(uniTestTag4222, uniTestTag22222, uniTestTag32222, title, str1122222, str1222222, abstractC8972b622222, z3822222, z21, z22, z3922222, c7807z22222, z3722222, value72222, value222222, value322222, value422222, value522222, value622222, j122222, uniButtonSize2.getTitleTextStyle(), uniButtonSize2.getSubtitleTextStyle(), uniButtonSize2.getDataTextStyle(), uniButtonSize2.getHeight(), cornerRadius2222, uniButtonSize2.getDataCornerRadius(), c9915y2222, uniButtonSize2.getDataVerticalPadding(), uniButtonSize2.getDataHorizontalPadding(), uniButtonSize2.getDataStartOffset(), uniButtonSize2.getIconTitleGap(), str7, qVar2, c4912a, function03, c3969l, i4622222, i4722222, 0, i4822222);
                    str8 = str1122222;
                    str9 = str1222222;
                    abstractC8972b5 = abstractC8972b622222;
                    z27 = z3822222;
                    z28 = z22;
                    z29 = z3722222;
                    str10 = str7;
                    qVar3 = qVar2;
                    function04 = function03;
                    eVar3 = eVar62222;
                    uniButtonSize3 = uniButtonSize2;
                    uniButtonStyleType4 = uniButtonStyleType3;
                    z31 = z21;
                    z32 = z19;
                    m02 = c3969l.m0();
                    if (m02 == null) {
                    }
                }
                str5 = str2;
                i17 = i13 & 16;
                if (i17 == 0) {
                }
                abstractC8972b2 = abstractC8972b;
                i18 = i13 & 32;
                if (i18 != 0) {
                }
                i19 = i13 & 64;
                if (i19 != 0) {
                }
                i21 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i21 != 0) {
                }
                i22 = i13 & 256;
                if (i22 != 0) {
                }
                i23 = i22;
                i24 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i24 == 0) {
                }
                i25 = i24;
                i26 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i26 != 0) {
                }
                i29 = i13 & 2048;
                if (i29 != 0) {
                }
                int i412222 = i28;
                i32 = i13 & 4096;
                if (i32 != 0) {
                }
                if ((i12 & 3072) == 0) {
                }
                int i4222222 = i33;
                i34 = i13 & 16384;
                if (i34 == 0) {
                }
                if ((i14 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i11 & 1) != 0) {
                }
                if (i38 == 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i21 == 0) {
                }
                if (i23 == 0) {
                }
                if (i25 == 0) {
                }
                if (i27 == 0) {
                }
                if (i31 == 0) {
                }
                if (i32 == 0) {
                }
                e eVar522222 = eVar4;
                if ((i13 & 8192) == 0) {
                }
                int i4422222 = i35;
                if (i34 == 0) {
                }
                uniButtonSize2 = uniButtonSize4;
                z19 = z33;
                z21 = z34;
                z22 = z35;
                str7 = str6;
                function03 = function02;
                uniButtonStyleType2 = uniButtonStyleType5;
                eVar2 = eVar522222;
                z23 = z18;
                i36 = i14;
                abstractC8972b3 = abstractC8972b2;
                i37 = i4422222;
                u11.j0();
                if (str5 == null) {
                }
                C9915y c9915y22222 = a11;
                u11.o(1060783976);
                if (uniButtonSize2 != UniButtonSize.SIZE_400) {
                }
                j11 = C7807Z.f72258l;
                long j1222222 = j11;
                u11.k();
                float cornerRadius22222 = !z19 ? 99 : uniButtonSize2.getCornerRadius();
                e eVar622222 = eVar2;
                e uniTestTag42222 = UniTestTagsKt.uniTestTag(eVar622222, UniButtonTestTags.Container, null, u11, ((i36 >> 3) & 14) | 48, 2);
                e.a aVar22222 = e.f40358c0;
                e uniTestTag222222 = UniTestTagsKt.uniTestTag(aVar22222, UniButtonTestTags.Title, null, u11, 54, 2);
                a.b(uniTestTag222222, SelectionItemFormDTO.TITLE_FIELD_NAME);
                e uniTestTag322222 = UniTestTagsKt.uniTestTag(aVar22222, UniButtonTestTags.Subtitle, null, u11, 54, 2);
                a.b(uniTestTag322222, "subtitle");
                u11.o(1060813055);
                z25 = uniButtonStyleType2 instanceof UniButtonStyleType.Custom;
                if (z25) {
                }
                z26 = false;
                u11.k();
                if (z26) {
                }
                Object backgroundColorActive2222222 = uniButtonStyleType2.getBackgroundColorActive();
                u11.o(1060819564);
                if (backgroundColorActive2222222 == null) {
                }
                u11.k();
                u11.o(1060821467);
                if (z16) {
                }
                u11.k();
                AbstractC7799Q value722222 = DeferredBrush.getValue(uniButtonStyleType3.getTitleTextColor(), u11, 0);
                AbstractC7799Q value2222222 = DeferredBrush.getValue(uniButtonStyleType3.getSubtitleTextColor(), u11, 0);
                AbstractC7799Q value3222222 = DeferredBrush.getValue(uniButtonStyleType3.getDataTextColor(), u11, 0);
                AbstractC7799Q value4222222 = DeferredBrush.getValue(uniButtonStyleType3.getBackgroundColor(), u11, 0);
                long value5222222 = DeferredColor.getValue(uniButtonStyleType3.getIconColor(), u11, 0);
                Object gradientIconColor222222 = uniButtonStyleType3.getGradientIconColor();
                u11.o(1060836940);
                AbstractC7799Q value6222222 = gradientIconColor222222 != null ? DeferredBrush.getValue(gradientIconColor222222, u11, 0) : null;
                u11.k();
                int i45222222 = i36 << 6;
                int i46222222 = ((i36 << 9) & 7168) | (i45222222 & 57344) | (i45222222 & 458752) | (i45222222 & 3670016) | ((i37 << 12) & 29360128) | (234881024 & i36) | (1879048192 & i36);
                int i47222222 = (i37 << 6) & 896;
                int i48222222 = ((i37 >> 6) & 896) | ((i36 >> 12) & 112) | ((i36 >> 6) & 57344);
                c3969l = u11;
                String str11222222 = str4;
                String str12222222 = str5;
                C7807Z c7807z222222 = m11;
                boolean z37222222 = z16;
                boolean z38222222 = z24;
                boolean z39222222 = z36;
                AbstractC8972b abstractC8972b6222222 = abstractC8972b4;
                m1884BasicButtonCi1iAhw(uniTestTag42222, uniTestTag222222, uniTestTag322222, title, str11222222, str12222222, abstractC8972b6222222, z38222222, z21, z22, z39222222, c7807z222222, z37222222, value722222, value2222222, value3222222, value4222222, value5222222, value6222222, j1222222, uniButtonSize2.getTitleTextStyle(), uniButtonSize2.getSubtitleTextStyle(), uniButtonSize2.getDataTextStyle(), uniButtonSize2.getHeight(), cornerRadius22222, uniButtonSize2.getDataCornerRadius(), c9915y22222, uniButtonSize2.getDataVerticalPadding(), uniButtonSize2.getDataHorizontalPadding(), uniButtonSize2.getDataStartOffset(), uniButtonSize2.getIconTitleGap(), str7, qVar2, c4912a, function03, c3969l, i46222222, i47222222, 0, i48222222);
                str8 = str11222222;
                str9 = str12222222;
                abstractC8972b5 = abstractC8972b6222222;
                z27 = z38222222;
                z28 = z22;
                z29 = z37222222;
                str10 = str7;
                qVar3 = qVar2;
                function04 = function03;
                eVar3 = eVar622222;
                uniButtonSize3 = uniButtonSize2;
                uniButtonStyleType4 = uniButtonStyleType3;
                z31 = z21;
                z32 = z19;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            str4 = str;
            i16 = i13 & 8;
            int i392 = 2048;
            if (i16 != 0) {
            }
            str5 = str2;
            i17 = i13 & 16;
            if (i17 == 0) {
            }
            abstractC8972b2 = abstractC8972b;
            i18 = i13 & 32;
            if (i18 != 0) {
            }
            i19 = i13 & 64;
            if (i19 != 0) {
            }
            i21 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i21 != 0) {
            }
            i22 = i13 & 256;
            if (i22 != 0) {
            }
            i23 = i22;
            i24 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i24 == 0) {
            }
            i25 = i24;
            i26 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i26 != 0) {
            }
            i29 = i13 & 2048;
            if (i29 != 0) {
            }
            int i4122222 = i28;
            i32 = i13 & 4096;
            if (i32 != 0) {
            }
            if ((i12 & 3072) == 0) {
            }
            int i42222222 = i33;
            i34 = i13 & 16384;
            if (i34 == 0) {
            }
            if ((i14 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i38 == 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i21 == 0) {
            }
            if (i23 == 0) {
            }
            if (i25 == 0) {
            }
            if (i27 == 0) {
            }
            if (i31 == 0) {
            }
            if (i32 == 0) {
            }
            e eVar5222222 = eVar4;
            if ((i13 & 8192) == 0) {
            }
            int i44222222 = i35;
            if (i34 == 0) {
            }
            uniButtonSize2 = uniButtonSize4;
            z19 = z33;
            z21 = z34;
            z22 = z35;
            str7 = str6;
            function03 = function02;
            uniButtonStyleType2 = uniButtonStyleType5;
            eVar2 = eVar5222222;
            z23 = z18;
            i36 = i14;
            abstractC8972b3 = abstractC8972b2;
            i37 = i44222222;
            u11.j0();
            if (str5 == null) {
            }
            C9915y c9915y222222 = a11;
            u11.o(1060783976);
            if (uniButtonSize2 != UniButtonSize.SIZE_400) {
            }
            j11 = C7807Z.f72258l;
            long j12222222 = j11;
            u11.k();
            float cornerRadius222222 = !z19 ? 99 : uniButtonSize2.getCornerRadius();
            e eVar6222222 = eVar2;
            e uniTestTag422222 = UniTestTagsKt.uniTestTag(eVar6222222, UniButtonTestTags.Container, null, u11, ((i36 >> 3) & 14) | 48, 2);
            e.a aVar222222 = e.f40358c0;
            e uniTestTag2222222 = UniTestTagsKt.uniTestTag(aVar222222, UniButtonTestTags.Title, null, u11, 54, 2);
            a.b(uniTestTag2222222, SelectionItemFormDTO.TITLE_FIELD_NAME);
            e uniTestTag3222222 = UniTestTagsKt.uniTestTag(aVar222222, UniButtonTestTags.Subtitle, null, u11, 54, 2);
            a.b(uniTestTag3222222, "subtitle");
            u11.o(1060813055);
            z25 = uniButtonStyleType2 instanceof UniButtonStyleType.Custom;
            if (z25) {
            }
            z26 = false;
            u11.k();
            if (z26) {
            }
            Object backgroundColorActive22222222 = uniButtonStyleType2.getBackgroundColorActive();
            u11.o(1060819564);
            if (backgroundColorActive22222222 == null) {
            }
            u11.k();
            u11.o(1060821467);
            if (z16) {
            }
            u11.k();
            AbstractC7799Q value7222222 = DeferredBrush.getValue(uniButtonStyleType3.getTitleTextColor(), u11, 0);
            AbstractC7799Q value22222222 = DeferredBrush.getValue(uniButtonStyleType3.getSubtitleTextColor(), u11, 0);
            AbstractC7799Q value32222222 = DeferredBrush.getValue(uniButtonStyleType3.getDataTextColor(), u11, 0);
            AbstractC7799Q value42222222 = DeferredBrush.getValue(uniButtonStyleType3.getBackgroundColor(), u11, 0);
            long value52222222 = DeferredColor.getValue(uniButtonStyleType3.getIconColor(), u11, 0);
            Object gradientIconColor2222222 = uniButtonStyleType3.getGradientIconColor();
            u11.o(1060836940);
            AbstractC7799Q value62222222 = gradientIconColor2222222 != null ? DeferredBrush.getValue(gradientIconColor2222222, u11, 0) : null;
            u11.k();
            int i452222222 = i36 << 6;
            int i462222222 = ((i36 << 9) & 7168) | (i452222222 & 57344) | (i452222222 & 458752) | (i452222222 & 3670016) | ((i37 << 12) & 29360128) | (234881024 & i36) | (1879048192 & i36);
            int i472222222 = (i37 << 6) & 896;
            int i482222222 = ((i37 >> 6) & 896) | ((i36 >> 12) & 112) | ((i36 >> 6) & 57344);
            c3969l = u11;
            String str112222222 = str4;
            String str122222222 = str5;
            C7807Z c7807z2222222 = m11;
            boolean z372222222 = z16;
            boolean z382222222 = z24;
            boolean z392222222 = z36;
            AbstractC8972b abstractC8972b62222222 = abstractC8972b4;
            m1884BasicButtonCi1iAhw(uniTestTag422222, uniTestTag2222222, uniTestTag3222222, title, str112222222, str122222222, abstractC8972b62222222, z382222222, z21, z22, z392222222, c7807z2222222, z372222222, value7222222, value22222222, value32222222, value42222222, value52222222, value62222222, j12222222, uniButtonSize2.getTitleTextStyle(), uniButtonSize2.getSubtitleTextStyle(), uniButtonSize2.getDataTextStyle(), uniButtonSize2.getHeight(), cornerRadius222222, uniButtonSize2.getDataCornerRadius(), c9915y222222, uniButtonSize2.getDataVerticalPadding(), uniButtonSize2.getDataHorizontalPadding(), uniButtonSize2.getDataStartOffset(), uniButtonSize2.getIconTitleGap(), str7, qVar2, c4912a, function03, c3969l, i462222222, i472222222, 0, i482222222);
            str8 = str112222222;
            str9 = str122222222;
            abstractC8972b5 = abstractC8972b62222222;
            z27 = z382222222;
            z28 = z22;
            z29 = z372222222;
            str10 = str7;
            qVar3 = qVar2;
            function04 = function03;
            eVar3 = eVar6222222;
            uniButtonSize3 = uniButtonSize2;
            uniButtonStyleType4 = uniButtonStyleType3;
            z31 = z21;
            z32 = z19;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        i15 = i13 & 4;
        if (i15 == 0) {
        }
        str4 = str;
        i16 = i13 & 8;
        int i3922 = 2048;
        if (i16 != 0) {
        }
        str5 = str2;
        i17 = i13 & 16;
        if (i17 == 0) {
        }
        abstractC8972b2 = abstractC8972b;
        i18 = i13 & 32;
        if (i18 != 0) {
        }
        i19 = i13 & 64;
        if (i19 != 0) {
        }
        i21 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i21 != 0) {
        }
        i22 = i13 & 256;
        if (i22 != 0) {
        }
        i23 = i22;
        i24 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i24 == 0) {
        }
        i25 = i24;
        i26 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i26 != 0) {
        }
        i29 = i13 & 2048;
        if (i29 != 0) {
        }
        int i41222222 = i28;
        i32 = i13 & 4096;
        if (i32 != 0) {
        }
        if ((i12 & 3072) == 0) {
        }
        int i422222222 = i33;
        i34 = i13 & 16384;
        if (i34 == 0) {
        }
        if ((i14 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i38 == 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i21 == 0) {
        }
        if (i23 == 0) {
        }
        if (i25 == 0) {
        }
        if (i27 == 0) {
        }
        if (i31 == 0) {
        }
        if (i32 == 0) {
        }
        e eVar52222222 = eVar4;
        if ((i13 & 8192) == 0) {
        }
        int i442222222 = i35;
        if (i34 == 0) {
        }
        uniButtonSize2 = uniButtonSize4;
        z19 = z33;
        z21 = z34;
        z22 = z35;
        str7 = str6;
        function03 = function02;
        uniButtonStyleType2 = uniButtonStyleType5;
        eVar2 = eVar52222222;
        z23 = z18;
        i36 = i14;
        abstractC8972b3 = abstractC8972b2;
        i37 = i442222222;
        u11.j0();
        if (str5 == null) {
        }
        C9915y c9915y2222222 = a11;
        u11.o(1060783976);
        if (uniButtonSize2 != UniButtonSize.SIZE_400) {
        }
        j11 = C7807Z.f72258l;
        long j122222222 = j11;
        u11.k();
        float cornerRadius2222222 = !z19 ? 99 : uniButtonSize2.getCornerRadius();
        e eVar62222222 = eVar2;
        e uniTestTag4222222 = UniTestTagsKt.uniTestTag(eVar62222222, UniButtonTestTags.Container, null, u11, ((i36 >> 3) & 14) | 48, 2);
        e.a aVar2222222 = e.f40358c0;
        e uniTestTag22222222 = UniTestTagsKt.uniTestTag(aVar2222222, UniButtonTestTags.Title, null, u11, 54, 2);
        a.b(uniTestTag22222222, SelectionItemFormDTO.TITLE_FIELD_NAME);
        e uniTestTag32222222 = UniTestTagsKt.uniTestTag(aVar2222222, UniButtonTestTags.Subtitle, null, u11, 54, 2);
        a.b(uniTestTag32222222, "subtitle");
        u11.o(1060813055);
        z25 = uniButtonStyleType2 instanceof UniButtonStyleType.Custom;
        if (z25) {
        }
        z26 = false;
        u11.k();
        if (z26) {
        }
        Object backgroundColorActive222222222 = uniButtonStyleType2.getBackgroundColorActive();
        u11.o(1060819564);
        if (backgroundColorActive222222222 == null) {
        }
        u11.k();
        u11.o(1060821467);
        if (z16) {
        }
        u11.k();
        AbstractC7799Q value72222222 = DeferredBrush.getValue(uniButtonStyleType3.getTitleTextColor(), u11, 0);
        AbstractC7799Q value222222222 = DeferredBrush.getValue(uniButtonStyleType3.getSubtitleTextColor(), u11, 0);
        AbstractC7799Q value322222222 = DeferredBrush.getValue(uniButtonStyleType3.getDataTextColor(), u11, 0);
        AbstractC7799Q value422222222 = DeferredBrush.getValue(uniButtonStyleType3.getBackgroundColor(), u11, 0);
        long value522222222 = DeferredColor.getValue(uniButtonStyleType3.getIconColor(), u11, 0);
        Object gradientIconColor22222222 = uniButtonStyleType3.getGradientIconColor();
        u11.o(1060836940);
        AbstractC7799Q value622222222 = gradientIconColor22222222 != null ? DeferredBrush.getValue(gradientIconColor22222222, u11, 0) : null;
        u11.k();
        int i4522222222 = i36 << 6;
        int i4622222222 = ((i36 << 9) & 7168) | (i4522222222 & 57344) | (i4522222222 & 458752) | (i4522222222 & 3670016) | ((i37 << 12) & 29360128) | (234881024 & i36) | (1879048192 & i36);
        int i4722222222 = (i37 << 6) & 896;
        int i4822222222 = ((i37 >> 6) & 896) | ((i36 >> 12) & 112) | ((i36 >> 6) & 57344);
        c3969l = u11;
        String str1122222222 = str4;
        String str1222222222 = str5;
        C7807Z c7807z22222222 = m11;
        boolean z3722222222 = z16;
        boolean z3822222222 = z24;
        boolean z3922222222 = z36;
        AbstractC8972b abstractC8972b622222222 = abstractC8972b4;
        m1884BasicButtonCi1iAhw(uniTestTag4222222, uniTestTag22222222, uniTestTag32222222, title, str1122222222, str1222222222, abstractC8972b622222222, z3822222222, z21, z22, z3922222222, c7807z22222222, z3722222222, value72222222, value222222222, value322222222, value422222222, value522222222, value622222222, j122222222, uniButtonSize2.getTitleTextStyle(), uniButtonSize2.getSubtitleTextStyle(), uniButtonSize2.getDataTextStyle(), uniButtonSize2.getHeight(), cornerRadius2222222, uniButtonSize2.getDataCornerRadius(), c9915y2222222, uniButtonSize2.getDataVerticalPadding(), uniButtonSize2.getDataHorizontalPadding(), uniButtonSize2.getDataStartOffset(), uniButtonSize2.getIconTitleGap(), str7, qVar2, c4912a, function03, c3969l, i4622222222, i4722222222, 0, i4822222222);
        str8 = str1122222222;
        str9 = str1222222222;
        abstractC8972b5 = abstractC8972b622222222;
        z27 = z3822222222;
        z28 = z22;
        z29 = z3722222222;
        str10 = str7;
        qVar3 = qVar2;
        function04 = function03;
        eVar3 = eVar62222222;
        uniButtonSize3 = uniButtonSize2;
        uniButtonStyleType4 = uniButtonStyleType3;
        z31 = z21;
        z32 = z19;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }
}
