package ru.ozon.uni.android.ds.compose.component.tagbutton;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import a1.c;
import android.content.Context;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.ds.compose.component.image.ImageVO;
import ru.ozon.uni.android.ds.compose.component.image.ImageVoKt;
import ru.ozon.uni.android.ds.compose.component.indicator.DsIndicatorAtomKt;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.android.ds.compose.util.FoundationMapperKt$toOnClickLambda$1$1;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Rounds;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000e\u001a\u00020\b*\u00020\f2\u0006\u0010\u0001\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0013\u001a\u00020\u0010*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "", "loading", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "DsTagButtonAtom", "(Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;LS0/k;II)V", "Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonScope;", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "IndicatorAtom", "(Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonScope;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Landroidx/compose/ui/e;LS0/k;II)V", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$IndicatorSize;", "getRestrictedSize", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$IndicatorSize;)Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$IndicatorSize;", "restrictedSize", "LZ1/h;", "getIndicatorEndPadding", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$IndicatorSize;)F", "indicatorEndPadding", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsTagButtonAtomKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndicatorDTO.IndicatorSize.values().length];
            try {
                iArr[IndicatorDTO.IndicatorSize.SIZE_400.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndicatorDTO.IndicatorSize.SIZE_500.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsTagButtonAtom(@NotNull TagButtonDTO dto, e eVar, boolean z11, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        boolean z12;
        int i15;
        Function1<? super AtomAction, Unit> function12;
        Function1<? super AtomAction, Unit> function13;
        IndicatorDTO indicator;
        TagButtonDTO.Size size;
        Rounds round;
        boolean z13;
        Function0 foundationMapperKt$toOnClickLambda$1$1;
        Function0 foundationMapperKt$toOnClickLambda$1$12;
        C3969l c3969l;
        boolean z14;
        Function1<? super AtomAction, Unit> function14;
        e eVar3;
        AtomAction atomAction;
        AtomAction atomAction2;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(939944341);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                z12 = z11;
                i13 |= u11.p(z12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i15 = i12 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    function12 = function1;
                    i13 |= u11.F(function12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    if ((i13 & 1171) == 1170 || !u11.b()) {
                        e eVar4 = i16 == 0 ? e.f40358c0 : eVar2;
                        boolean z15 = i14 == 0 ? false : z12;
                        if (i15 == 0) {
                            u11.o(1948227480);
                            Object C11 = u11.C();
                            if (C11 == InterfaceC3967k.a.a()) {
                                C11 = DsTagButtonAtomKt$DsTagButtonAtom$1$1.INSTANCE;
                                u11.x(C11);
                            }
                            function13 = (Function1) C11;
                            u11.k();
                        } else {
                            function13 = function12;
                        }
                        e viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
                        DsTagButtonLocator dsTagButtonLocator = new DsTagButtonLocator(dto.getTestInfo(), null, 2, null);
                        indicator = dto.getIndicator();
                        if (indicator == null) {
                            IndicatorDTO.IndicatorSize size2 = indicator.getSize();
                            int i17 = size2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[size2.ordinal()];
                            if (i17 != 1 && i17 != 2) {
                                indicator = IndicatorDTO.copy$default(indicator, null, null, IndicatorDTO.IndicatorSize.SIZE_500, null, null, null, null, null, null, null, null, 2043, null);
                            }
                        } else {
                            indicator = null;
                        }
                        String icon = dto.getIcon();
                        UniIconToken byId = icon == null ? UniTheme.INSTANCE.getIconTokens().getById(icon) : null;
                        size = dto.getSize();
                        if (size == null) {
                            size = TagButtonDTO.INSTANCE.getDefaultSize();
                        }
                        DsTagButtonSize sizeVo = DsTagButtonMappersKt.getSizeVo(size);
                        String text = dto.getText();
                        e.a aVar = e.f40358c0;
                        e testTag = AtomLocatorKt.testTag(aVar, dsTagButtonLocator.getText().invoke());
                        u11.o(1948248250);
                        AbstractC8972b icon2 = byId != null ? null : TokensExtKt.getIcon(byId, u11, UniIconToken.$stable);
                        u11.k();
                        int i18 = i13;
                        e testTag2 = AtomLocatorKt.testTag(aVar, dsTagButtonLocator.getIcon().invoke());
                        ImageDTO image = dto.getImage();
                        e eVar5 = eVar4;
                        u11.o(1948251132);
                        ImageVO vo = image != null ? null : ImageVoKt.toVO(image, u11, 0);
                        u11.k();
                        e testTag3 = AtomLocatorKt.testTag(aVar, dsTagButtonLocator.getImage().invoke());
                        ImageVO imageVO = vo;
                        u11.o(1948254560);
                        C4912a c11 = indicator != null ? null : c.c(1082876070, new DsTagButtonAtomKt$DsTagButtonAtom$2$1(indicator, dsTagButtonLocator), u11);
                        u11.k();
                        boolean d11 = Intrinsics.d(dto.isClosable(), Boolean.TRUE);
                        e testTag4 = AtomLocatorKt.testTag(aVar, dsTagButtonLocator.getCloseIcon().invoke());
                        DsTagButtonState stateVo = DsTagButtonMappersKt.stateVo(dto, z15);
                        DsTagButtonStyle styleVo = DsTagButtonMappersKt.styleVo(dto, byId, u11, (i18 & 14) | (UniIconToken.$stable << 3));
                        u11.o(1948269514);
                        round = dto.getRound();
                        if ((round == null ? Boolean.valueOf(round.getRoundCorners()) : null) == null) {
                            z13 = dto.getRound().getRoundCorners();
                        } else {
                            u11.o(1948273094);
                            boolean roundCornersFlag = UniGlobalConfigKt.getRoundCornersFlag((Context) u11.m(AndroidCompositionLocals_androidKt.d()));
                            u11.k();
                            z13 = roundCornersFlag || sizeVo == DsTagButtonSize.Size600;
                        }
                        u11.k();
                        float cornerRadius = DsTagButtonKt.cornerRadius(sizeVo, z13, u11, 0, 0);
                        CommonControlSettings common = dto.getCommon();
                        foundationMapperKt$toOnClickLambda$1$1 = (common != null || (atomAction2 = common.toAtomAction()) == null) ? null : new FoundationMapperKt$toOnClickLambda$1$1(function13, atomAction2);
                        u11.o(1948277121);
                        if (foundationMapperKt$toOnClickLambda$1$1 == null) {
                            u11.o(1948278392);
                            Object C12 = u11.C();
                            if (C12 == InterfaceC3967k.a.a()) {
                                C12 = DsTagButtonAtomKt$DsTagButtonAtom$3$1.INSTANCE;
                                u11.x(C12);
                            }
                            foundationMapperKt$toOnClickLambda$1$1 = (Function0) C12;
                            u11.k();
                        }
                        Function0 function0 = foundationMapperKt$toOnClickLambda$1$1;
                        u11.k();
                        CommonControlSettings closeControlSettings = dto.getCloseControlSettings();
                        foundationMapperKt$toOnClickLambda$1$12 = (closeControlSettings != null || (atomAction = closeControlSettings.toAtomAction()) == null) ? null : new FoundationMapperKt$toOnClickLambda$1$1(function13, atomAction);
                        u11.o(1948279311);
                        if (foundationMapperKt$toOnClickLambda$1$12 == null) {
                            u11.o(1948281016);
                            Object C13 = u11.C();
                            if (C13 == InterfaceC3967k.a.a()) {
                                C13 = DsTagButtonAtomKt$DsTagButtonAtom$4$1.INSTANCE;
                                u11.x(C13);
                            }
                            foundationMapperKt$toOnClickLambda$1$12 = (Function0) C13;
                            u11.k();
                        }
                        u11.k();
                        c3969l = u11;
                        DsTagButtonKt.m1810DsTagButtonDRvdSBo(viewAnalytics, text, testTag, icon2, testTag2, imageVO, testTag3, c11, d11, testTag4, stateVo, styleVo, sizeVo, cornerRadius, function0, foundationMapperKt$toOnClickLambda$1$12, null, null, c3969l, 0, 0, 196608);
                        z14 = z15;
                        function14 = function13;
                        eVar3 = eVar5;
                    } else {
                        u11.j();
                        c3969l = u11;
                        eVar3 = eVar2;
                        z14 = z12;
                        function14 = function12;
                    }
                    m02 = c3969l.m0();
                    if (m02 == null) {
                        m02.G(new DsTagButtonAtomKt$DsTagButtonAtom$5(dto, eVar3, z14, function14, i11, i12));
                        return;
                    }
                    return;
                }
                function12 = function1;
                if ((i13 & 1171) == 1170) {
                }
                if (i16 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                e viewAnalytics2 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
                DsTagButtonLocator dsTagButtonLocator2 = new DsTagButtonLocator(dto.getTestInfo(), null, 2, null);
                indicator = dto.getIndicator();
                if (indicator == null) {
                }
                String icon3 = dto.getIcon();
                if (icon3 == null) {
                }
                size = dto.getSize();
                if (size == null) {
                }
                DsTagButtonSize sizeVo2 = DsTagButtonMappersKt.getSizeVo(size);
                String text2 = dto.getText();
                e.a aVar2 = e.f40358c0;
                e testTag5 = AtomLocatorKt.testTag(aVar2, dsTagButtonLocator2.getText().invoke());
                u11.o(1948248250);
                if (byId != null) {
                }
                u11.k();
                int i182 = i13;
                e testTag22 = AtomLocatorKt.testTag(aVar2, dsTagButtonLocator2.getIcon().invoke());
                ImageDTO image2 = dto.getImage();
                e eVar52 = eVar4;
                u11.o(1948251132);
                if (image2 != null) {
                }
                u11.k();
                e testTag32 = AtomLocatorKt.testTag(aVar2, dsTagButtonLocator2.getImage().invoke());
                ImageVO imageVO2 = vo;
                u11.o(1948254560);
                if (indicator != null) {
                }
                u11.k();
                boolean d112 = Intrinsics.d(dto.isClosable(), Boolean.TRUE);
                e testTag42 = AtomLocatorKt.testTag(aVar2, dsTagButtonLocator2.getCloseIcon().invoke());
                DsTagButtonState stateVo2 = DsTagButtonMappersKt.stateVo(dto, z15);
                DsTagButtonStyle styleVo2 = DsTagButtonMappersKt.styleVo(dto, byId, u11, (i182 & 14) | (UniIconToken.$stable << 3));
                u11.o(1948269514);
                round = dto.getRound();
                if ((round == null ? Boolean.valueOf(round.getRoundCorners()) : null) == null) {
                }
                u11.k();
                float cornerRadius2 = DsTagButtonKt.cornerRadius(sizeVo2, z13, u11, 0, 0);
                CommonControlSettings common2 = dto.getCommon();
                if (common2 != null) {
                }
                u11.o(1948277121);
                if (foundationMapperKt$toOnClickLambda$1$1 == null) {
                }
                Function0 function02 = foundationMapperKt$toOnClickLambda$1$1;
                u11.k();
                CommonControlSettings closeControlSettings2 = dto.getCloseControlSettings();
                if (closeControlSettings2 != null) {
                }
                u11.o(1948279311);
                if (foundationMapperKt$toOnClickLambda$1$12 == null) {
                }
                u11.k();
                c3969l = u11;
                DsTagButtonKt.m1810DsTagButtonDRvdSBo(viewAnalytics2, text2, testTag5, icon2, testTag22, imageVO2, testTag32, c11, d112, testTag42, stateVo2, styleVo2, sizeVo2, cornerRadius2, function02, foundationMapperKt$toOnClickLambda$1$12, null, null, c3969l, 0, 0, 196608);
                z14 = z15;
                function14 = function13;
                eVar3 = eVar52;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            z12 = z11;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            function12 = function1;
            if ((i13 & 1171) == 1170) {
            }
            if (i16 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            e viewAnalytics22 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
            DsTagButtonLocator dsTagButtonLocator22 = new DsTagButtonLocator(dto.getTestInfo(), null, 2, null);
            indicator = dto.getIndicator();
            if (indicator == null) {
            }
            String icon32 = dto.getIcon();
            if (icon32 == null) {
            }
            size = dto.getSize();
            if (size == null) {
            }
            DsTagButtonSize sizeVo22 = DsTagButtonMappersKt.getSizeVo(size);
            String text22 = dto.getText();
            e.a aVar22 = e.f40358c0;
            e testTag52 = AtomLocatorKt.testTag(aVar22, dsTagButtonLocator22.getText().invoke());
            u11.o(1948248250);
            if (byId != null) {
            }
            u11.k();
            int i1822 = i13;
            e testTag222 = AtomLocatorKt.testTag(aVar22, dsTagButtonLocator22.getIcon().invoke());
            ImageDTO image22 = dto.getImage();
            e eVar522 = eVar4;
            u11.o(1948251132);
            if (image22 != null) {
            }
            u11.k();
            e testTag322 = AtomLocatorKt.testTag(aVar22, dsTagButtonLocator22.getImage().invoke());
            ImageVO imageVO22 = vo;
            u11.o(1948254560);
            if (indicator != null) {
            }
            u11.k();
            boolean d1122 = Intrinsics.d(dto.isClosable(), Boolean.TRUE);
            e testTag422 = AtomLocatorKt.testTag(aVar22, dsTagButtonLocator22.getCloseIcon().invoke());
            DsTagButtonState stateVo22 = DsTagButtonMappersKt.stateVo(dto, z15);
            DsTagButtonStyle styleVo22 = DsTagButtonMappersKt.styleVo(dto, byId, u11, (i1822 & 14) | (UniIconToken.$stable << 3));
            u11.o(1948269514);
            round = dto.getRound();
            if ((round == null ? Boolean.valueOf(round.getRoundCorners()) : null) == null) {
            }
            u11.k();
            float cornerRadius22 = DsTagButtonKt.cornerRadius(sizeVo22, z13, u11, 0, 0);
            CommonControlSettings common22 = dto.getCommon();
            if (common22 != null) {
            }
            u11.o(1948277121);
            if (foundationMapperKt$toOnClickLambda$1$1 == null) {
            }
            Function0 function022 = foundationMapperKt$toOnClickLambda$1$1;
            u11.k();
            CommonControlSettings closeControlSettings22 = dto.getCloseControlSettings();
            if (closeControlSettings22 != null) {
            }
            u11.o(1948279311);
            if (foundationMapperKt$toOnClickLambda$1$12 == null) {
            }
            u11.k();
            c3969l = u11;
            DsTagButtonKt.m1810DsTagButtonDRvdSBo(viewAnalytics22, text22, testTag52, icon2, testTag222, imageVO22, testTag322, c11, d1122, testTag422, stateVo22, styleVo22, sizeVo22, cornerRadius22, function022, foundationMapperKt$toOnClickLambda$1$12, null, null, c3969l, 0, 0, 196608);
            z14 = z15;
            function14 = function13;
            eVar3 = eVar522;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        z12 = z11;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        function12 = function1;
        if ((i13 & 1171) == 1170) {
        }
        if (i16 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        e viewAnalytics222 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
        DsTagButtonLocator dsTagButtonLocator222 = new DsTagButtonLocator(dto.getTestInfo(), null, 2, null);
        indicator = dto.getIndicator();
        if (indicator == null) {
        }
        String icon322 = dto.getIcon();
        if (icon322 == null) {
        }
        size = dto.getSize();
        if (size == null) {
        }
        DsTagButtonSize sizeVo222 = DsTagButtonMappersKt.getSizeVo(size);
        String text222 = dto.getText();
        e.a aVar222 = e.f40358c0;
        e testTag522 = AtomLocatorKt.testTag(aVar222, dsTagButtonLocator222.getText().invoke());
        u11.o(1948248250);
        if (byId != null) {
        }
        u11.k();
        int i18222 = i13;
        e testTag2222 = AtomLocatorKt.testTag(aVar222, dsTagButtonLocator222.getIcon().invoke());
        ImageDTO image222 = dto.getImage();
        e eVar5222 = eVar4;
        u11.o(1948251132);
        if (image222 != null) {
        }
        u11.k();
        e testTag3222 = AtomLocatorKt.testTag(aVar222, dsTagButtonLocator222.getImage().invoke());
        ImageVO imageVO222 = vo;
        u11.o(1948254560);
        if (indicator != null) {
        }
        u11.k();
        boolean d11222 = Intrinsics.d(dto.isClosable(), Boolean.TRUE);
        e testTag4222 = AtomLocatorKt.testTag(aVar222, dsTagButtonLocator222.getCloseIcon().invoke());
        DsTagButtonState stateVo222 = DsTagButtonMappersKt.stateVo(dto, z15);
        DsTagButtonStyle styleVo222 = DsTagButtonMappersKt.styleVo(dto, byId, u11, (i18222 & 14) | (UniIconToken.$stable << 3));
        u11.o(1948269514);
        round = dto.getRound();
        if ((round == null ? Boolean.valueOf(round.getRoundCorners()) : null) == null) {
        }
        u11.k();
        float cornerRadius222 = DsTagButtonKt.cornerRadius(sizeVo222, z13, u11, 0, 0);
        CommonControlSettings common222 = dto.getCommon();
        if (common222 != null) {
        }
        u11.o(1948277121);
        if (foundationMapperKt$toOnClickLambda$1$1 == null) {
        }
        Function0 function0222 = foundationMapperKt$toOnClickLambda$1$1;
        u11.k();
        CommonControlSettings closeControlSettings222 = dto.getCloseControlSettings();
        if (closeControlSettings222 != null) {
        }
        u11.o(1948279311);
        if (foundationMapperKt$toOnClickLambda$1$12 == null) {
        }
        u11.k();
        c3969l = u11;
        DsTagButtonKt.m1810DsTagButtonDRvdSBo(viewAnalytics222, text222, testTag522, icon2, testTag2222, imageVO222, testTag3222, c11, d11222, testTag4222, stateVo222, styleVo222, sizeVo222, cornerRadius222, function0222, foundationMapperKt$toOnClickLambda$1$12, null, null, c3969l, 0, 0, 196608);
        z14 = z15;
        function14 = function13;
        eVar3 = eVar5222;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IndicatorAtom(DsTagButtonScope dsTagButtonScope, IndicatorDTO indicatorDTO, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        IndicatorDTO indicatorDTO2;
        int i13;
        e eVar2;
        IndicatorDTO.IndicatorSize size;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-1988196602);
        if ((i12 & 1) != 0) {
            i13 = i11 | 48;
            indicatorDTO2 = indicatorDTO;
        } else {
            indicatorDTO2 = indicatorDTO;
            if ((i11 & 48) == 0) {
                i13 = (u11.n(indicatorDTO2) ? 32 : 16) | i11;
            } else {
                i13 = i11;
            }
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i13 & 145) == 144 || !u11.b()) {
                e eVar3 = i14 == 0 ? e.f40358c0 : eVar2;
                size = indicatorDTO2.getSize();
                if (size == null) {
                    size = IndicatorDTO.INSTANCE.getDefaultSize();
                }
                IndicatorDTO.IndicatorSize restrictedSize = getRestrictedSize(size);
                eVar2 = eVar3;
                DsIndicatorAtomKt.DsIndicatorAtom(IndicatorDTO.copy$default(indicatorDTO2, null, null, restrictedSize, null, null, null, null, null, null, null, null, 2043, null), T.j(eVar2, 0.0f, 0.0f, getIndicatorEndPadding(restrictedSize), 0.0f, 11), u11, 0, 0);
            } else {
                u11.j();
            }
            e eVar4 = eVar2;
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new DsTagButtonAtomKt$IndicatorAtom$1(dsTagButtonScope, indicatorDTO, eVar4, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 145) == 144) {
        }
        if (i14 == 0) {
        }
        size = indicatorDTO2.getSize();
        if (size == null) {
        }
        IndicatorDTO.IndicatorSize restrictedSize2 = getRestrictedSize(size);
        eVar2 = eVar3;
        DsIndicatorAtomKt.DsIndicatorAtom(IndicatorDTO.copy$default(indicatorDTO2, null, null, restrictedSize2, null, null, null, null, null, null, null, null, 2043, null), T.j(eVar2, 0.0f, 0.0f, getIndicatorEndPadding(restrictedSize2), 0.0f, 11), u11, 0, 0);
        e eVar42 = eVar2;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    private static final float getIndicatorEndPadding(IndicatorDTO.IndicatorSize indicatorSize) {
        return WhenMappings.$EnumSwitchMapping$0[indicatorSize.ordinal()] == 2 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : DsSpacings.INSTANCE.m1854getDp4D9Ej5fM();
    }

    private static final IndicatorDTO.IndicatorSize getRestrictedSize(IndicatorDTO.IndicatorSize indicatorSize) {
        IndicatorDTO.IndicatorSize indicatorSize2;
        return (indicatorSize == IndicatorDTO.IndicatorSize.SIZE_400 || indicatorSize == (indicatorSize2 = IndicatorDTO.IndicatorSize.SIZE_500)) ? indicatorSize : indicatorSize2;
    }
}
