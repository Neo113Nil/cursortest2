package ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.presentation;

import A0.h;
import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S0.n1;
import S1.p;
import Sc.o;
import Z1.b;
import Z1.c;
import Z1.l;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.a;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.G;
import l1.AbstractC7799Q;
import l1.C7807Z;
import m0.C8004n;
import m0.T0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.data.CommonPromoBannerDTO;
import ru.ozon.uni.core.UniGradient;
import ru.ozon.uni.core.compose.graphics.DirectionalLinearGradientKt;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.GradientDirection;
import ru.ozon.uni.core.models.UniGradientDirection;
import ru.ozon.uni.core.models.UniRadiusToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001c²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/presentation/CommonPromoBannerVO;", "item", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "CommonPromoBanner", "(Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/presentation/CommonPromoBannerVO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Lru/ozon/uni/core/UniGradient;", "Ll1/Q;", "toBrushGradient", "(Lru/ozon/uni/core/UniGradient;LS0/k;I)Ll1/Q;", "Lru/ozon/uni/core/models/GradientDirection;", "Lru/ozon/uni/core/models/UniGradientDirection;", "toDsGradientDirection", "(Lru/ozon/uni/core/models/GradientDirection;)Lru/ozon/uni/core/models/UniGradientDirection;", "LZ1/h;", "SpaceForCroppedImage", "F", "CroppedImageOffset", "LB1/V;", "WholeImageMeasurePolicy", "LB1/V;", "CroppedImageMeasurePolicy", "", "showBanner", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CommonPromoBannerKt {
    private static final float SpaceForCroppedImage = 140;
    private static final float CroppedImageOffset = 42;

    @NotNull
    private static final V WholeImageMeasurePolicy = new V() { // from class: ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.presentation.CommonPromoBannerKt$WholeImageMeasurePolicy$1

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.presentation.CommonPromoBannerKt$WholeImageMeasurePolicy$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
            final /* synthetic */ m0 $contentPlaceable;
            final /* synthetic */ int $height;
            final /* synthetic */ m0 $imagePlaceable;
            final /* synthetic */ Y $this_MeasurePolicy;
            final /* synthetic */ int $width;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(m0 m0Var, m0 m0Var2, int i11, Y y11, int i12) {
                super(1);
                this.$contentPlaceable = m0Var;
                this.$imagePlaceable = m0Var2;
                this.$width = i11;
                this.$this_MeasurePolicy = y11;
                this.$height = i12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                invoke2(aVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(m0.a layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                layout.d(this.$contentPlaceable, 0, 0, 0.0f);
                int a11 = InterfaceC6250b.a.g().a(this.$imagePlaceable.u0(), this.$width / 2, this.$this_MeasurePolicy.getLayoutDirection());
                layout.d(this.$imagePlaceable, (this.$width / 2) + a11, InterfaceC6250b.a.i().a(this.$imagePlaceable.l0(), this.$height), 0.0f);
            }
        }

        @Override // B1.V
        /* renamed from: measure-3p2s80s */
        public final W mo2measure3p2s80s(Y MeasurePolicy, List<? extends U> measurables, long j11) {
            W z02;
            Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            int k11 = b.k(j11);
            List<? extends U> list = measurables;
            for (U u11 : list) {
                if (Intrinsics.d(a.a(u11), "content")) {
                    int i11 = k11 / 2;
                    m0 a02 = u11.a0(b.c(0, i11, 0, 0, 13, j11));
                    int l02 = a02.l0();
                    for (U u12 : list) {
                        if (Intrinsics.d(a.a(u12), "image")) {
                            int min = Math.min(b.k(b.c(0, i11, 0, 0, 13, j11)), l02);
                            if (min >= 0 && min >= 0) {
                                int i12 = l02;
                                z02 = MeasurePolicy.z0(k11, i12, kotlin.collections.U.c(), new AnonymousClass1(a02, u12.a0(c.i(min, min, min, min)), k11, MeasurePolicy, i12));
                                return z02;
                            }
                            l.a("width(" + min + ") and height(" + min + ") must be >= 0");
                            throw null;
                        }
                        i11 = i11;
                        a02 = a02;
                        l02 = l02;
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    };

    @NotNull
    private static final V CroppedImageMeasurePolicy = new V() { // from class: ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.presentation.CommonPromoBannerKt$CroppedImageMeasurePolicy$1

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.presentation.CommonPromoBannerKt$CroppedImageMeasurePolicy$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
            final /* synthetic */ m0 $contentPlaceable;
            final /* synthetic */ int $height;
            final /* synthetic */ m0 $imagePlaceable;
            final /* synthetic */ Y $this_MeasurePolicy;
            final /* synthetic */ int $width;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(m0 m0Var, Y y11, int i11, m0 m0Var2, int i12) {
                super(1);
                this.$contentPlaceable = m0Var;
                this.$this_MeasurePolicy = y11;
                this.$width = i11;
                this.$imagePlaceable = m0Var2;
                this.$height = i12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                invoke2(aVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(m0.a layout) {
                float f7;
                float f11;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                layout.d(this.$contentPlaceable, 0, 0, 0.0f);
                Y y11 = this.$this_MeasurePolicy;
                f7 = CommonPromoBannerKt.SpaceForCroppedImage;
                f11 = CommonPromoBannerKt.CroppedImageOffset;
                int Y02 = y11.Y0(f7 - f11);
                int i11 = this.$width - Y02;
                int a11 = InterfaceC6250b.a.g().a(this.$imagePlaceable.u0(), Y02, this.$this_MeasurePolicy.getLayoutDirection());
                layout.d(this.$imagePlaceable, i11 + a11, InterfaceC6250b.a.i().a(this.$imagePlaceable.l0(), this.$height), 0.0f);
            }
        }

        @Override // B1.V
        /* renamed from: measure-3p2s80s */
        public final W mo2measure3p2s80s(Y MeasurePolicy, List<? extends U> measurables, long j11) {
            float f7;
            float f11;
            float f12;
            W z02;
            Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            int k11 = b.k(j11);
            List<? extends U> list = measurables;
            for (U u11 : list) {
                if (Intrinsics.d(a.a(u11), "content")) {
                    f7 = CommonPromoBannerKt.SpaceForCroppedImage;
                    f11 = CommonPromoBannerKt.CroppedImageOffset;
                    m0 a02 = u11.a0(b.c(0, k11 - MeasurePolicy.Y0(f7 - f11), 0, 0, 13, j11));
                    int l02 = a02.l0();
                    for (U u12 : list) {
                        if (Intrinsics.d(a.a(u12), "image")) {
                            f12 = CommonPromoBannerKt.SpaceForCroppedImage;
                            int min = Math.min(b.k(b.c(0, MeasurePolicy.Y0(f12), 0, 0, 13, j11)), l02);
                            if (min >= 0 && min >= 0) {
                                z02 = MeasurePolicy.z0(k11, l02, kotlin.collections.U.c(), new AnonymousClass1(a02, MeasurePolicy, k11, u12.a0(c.i(min, min, min, min)), l02));
                                return z02;
                            }
                            l.a("width(" + min + ") and height(" + min + ") must be >= 0");
                            throw null;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    };

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GradientDirection.values().length];
            try {
                iArr[GradientDirection.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GradientDirection.TR_BL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GradientDirection.RIGHT_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GradientDirection.BR_TL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GradientDirection.BOTTOM_TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GradientDirection.BL_TR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GradientDirection.LEFT_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GradientDirection.TL_BR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void CommonPromoBanner(@NotNull CommonPromoBannerVO item, e eVar, Function1<? super Tg.b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(item, "item");
        C3969l u11 = interfaceC3967k.u(1586970111);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(item) ? 4 : 2) | i11;
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
            i13 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            CommonPromoBannerDTO banner = item.getBanner();
            u11.o(798519257);
            boolean F11 = u11.F(item);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new CommonPromoBannerKt$CommonPromoBanner$1$showBanner$2$1(item);
                u11.x(C11);
            }
            u11.k();
            A1 e11 = n1.e((Function0) C11);
            T0 d11 = C8004n.d(300, 0, null, 6);
            if (banner.getTheme() != CommonPromoBannerDTO.ThemeType.THEME_TYPE_INVALID) {
                WZ.l lVar = (WZ.l) u11.m(f.e());
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(798527228);
                boolean F12 = u11.F(item) | u11.F(lVar);
                Object C12 = u11.C();
                if (F12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new CommonPromoBannerKt$CommonPromoBanner$1$1$1(item, lVar);
                    u11.x(C12);
                }
                u11.k();
                i.a(aVar, null, (Function0) C12, u11, 6);
                UniRadiusToken cornerRadius = banner.getCornerRadius();
                G.c(CommonPromoBanner$lambda$3$lambda$1(e11), null, androidx.compose.animation.b.h(d11, 2).c(androidx.compose.animation.b.g(InterfaceC6250b.a.l(), 13)), androidx.compose.animation.b.i(d11, 2).c(androidx.compose.animation.b.n(InterfaceC6250b.a.l(), 13)), null, a1.c.c(-472393992, new CommonPromoBannerKt$CommonPromoBanner$1$2(eVar, banner, h.b(cornerRadius != null ? TokensExtKt.getDp(cornerRadius) : UniTheme.INSTANCE.getRadii().getRadius500()), function1), u11), u11, 200064, 18);
            }
        }
        e eVar2 = eVar;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CommonPromoBannerKt$CommonPromoBanner$2(item, eVar2, function1, i11, i12));
        }
    }

    private static final boolean CommonPromoBanner$lambda$3$lambda$1(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC7799Q toBrushGradient(UniGradient uniGradient, InterfaceC3967k interfaceC3967k, int i11) {
        List<String> lightColorTokens;
        UniGradientDirection uniGradientDirection;
        interfaceC3967k.o(526615781);
        if (!p.a(interfaceC3967k) || (lightColorTokens = uniGradient.getDarkColorTokens()) == null) {
            lightColorTokens = uniGradient.getLightColorTokens();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = lightColorTokens.iterator();
        while (it.hasNext()) {
            C7807Z c7807z = TokenParserKt.tokenToColor((String) it.next(), interfaceC3967k, 0);
            if (c7807z != null) {
                arrayList.add(c7807z);
            }
        }
        AbstractC7799Q.a aVar = AbstractC7799Q.Companion;
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList2.add(new Pair(uniGradient.getPositions().get(i12), C7807Z.m(((C7807Z) next).w())));
            i12 = i13;
        }
        Pair[] pairArr = (Pair[]) arrayList2.toArray(new Pair[0]);
        Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, pairArr.length);
        GradientDirection gradientDirection = uniGradient.getGradientDirection();
        if (gradientDirection == null || (uniGradientDirection = toDsGradientDirection(gradientDirection)) == null) {
            uniGradientDirection = UniGradientDirection.TopBottom;
        }
        AbstractC7799Q m1957directionalLinearGradientesKoAe4 = DirectionalLinearGradientKt.m1957directionalLinearGradientesKoAe4(aVar, pairArr2, 0, uniGradientDirection);
        interfaceC3967k.k();
        return m1957directionalLinearGradientesKoAe4;
    }

    private static final UniGradientDirection toDsGradientDirection(GradientDirection gradientDirection) {
        switch (WhenMappings.$EnumSwitchMapping$0[gradientDirection.ordinal()]) {
            case 1:
                return UniGradientDirection.TopBottom;
            case 2:
                return UniGradientDirection.TopRightBottomLeft;
            case 3:
                return UniGradientDirection.RightLeft;
            case 4:
                return UniGradientDirection.BottomRightTopLeft;
            case 5:
                return UniGradientDirection.BottomTop;
            case 6:
                return UniGradientDirection.BottomLeftTopRight;
            case 7:
                return UniGradientDirection.LeftRight;
            case 8:
                return UniGradientDirection.TopLeftBottomRight;
            default:
                throw new o();
        }
    }
}
