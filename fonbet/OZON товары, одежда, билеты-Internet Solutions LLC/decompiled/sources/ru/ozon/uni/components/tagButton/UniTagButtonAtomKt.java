package ru.ozon.uni.components.tagButton;

import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import Sc.o;
import a1.C4912a;
import a1.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.K0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.util.FoundationMapperKt$toOnClickLambda$1$1;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.Rounds;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.components.tagButton.UniTagButtonStyle;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.utils.DeferredBrush;
import ru.ozon.uni.utils.DeferredColor;
import ru.ozon.uni.utils.UniTestInfoTestTagKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010²\u0006\u000e\u0010\u000f\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "", "loading", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "UniTagButtonAtom", "(Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;LS0/k;II)V", "Lru/ozon/uni/components/tagButton/UniTagButtonStyle;", "toVO", "(Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;LS0/k;I)Lru/ozon/uni/components/tagButton/UniTagButtonStyle;", "isSelected", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniTagButtonAtomKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TagButtonDTO.Size.values().length];
            try {
                iArr[TagButtonDTO.Size.SIZE_500.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TagButtonDTO.Size.SIZE_600.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UniTagButtonAtom(@NotNull TagButtonDTO dto, e eVar, boolean z11, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        boolean z12;
        int i15;
        Function1<? super AtomAction, Unit> function12;
        Function1<? super AtomAction, Unit> function13;
        boolean n11;
        Object C11;
        InterfaceC3978p0 interfaceC3978p0;
        FoundationMapperKt$toOnClickLambda$1$1 foundationMapperKt$toOnClickLambda$1$1;
        TestInfo testInfo;
        String text;
        boolean n12;
        Object C12;
        Function0 foundationMapperKt$toOnClickLambda$1$12;
        TagButtonDTO.Size size;
        int i16;
        UniTagButtonSize uniTagButtonSize;
        C3969l c3969l;
        e eVar3;
        boolean z13;
        Function1<? super AtomAction, Unit> function14;
        AtomAction atomAction;
        AtomAction atomAction2;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(1495162542);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i17 = i12 & 2;
        if (i17 != 0) {
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
                        e eVar4 = i17 == 0 ? e.f40358c0 : eVar2;
                        boolean z14 = i14 == 0 ? false : z12;
                        if (i15 == 0) {
                            u11.o(60403410);
                            Object C13 = u11.C();
                            if (C13 == InterfaceC3967k.a.a()) {
                                C13 = UniTagButtonAtomKt$UniTagButtonAtom$1$1.INSTANCE;
                                u11.x(C13);
                            }
                            function13 = (Function1) C13;
                            u11.k();
                        } else {
                            function13 = function12;
                        }
                        Object isSelected = dto.isSelected();
                        u11.o(60404436);
                        n11 = u11.n(isSelected);
                        C11 = u11.C();
                        if (!n11 || C11 == InterfaceC3967k.a.a()) {
                            Boolean isSelected2 = dto.isSelected();
                            C11 = n1.f(Boolean.valueOf(isSelected2 == null ? isSelected2.booleanValue() : false), D1.f25195a);
                            u11.x(C11);
                        }
                        interfaceC3978p0 = (InterfaceC3978p0) C11;
                        u11.k();
                        CommonControlSettings common = dto.getCommon();
                        foundationMapperKt$toOnClickLambda$1$1 = (common != null || (atomAction2 = common.toAtomAction()) == null) ? null : new FoundationMapperKt$toOnClickLambda$1$1(function13, atomAction2);
                        u11.o(60411806);
                        e viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
                        testInfo = dto.getTestInfo();
                        if (testInfo != null) {
                            viewAnalytics = UniTestInfoTestTagKt.uniTestTag(viewAnalytics, testInfo, u11, 0);
                        }
                        u11.k();
                        text = dto.getText();
                        if (text == null) {
                            text = "";
                        }
                        u11.o(60415109);
                        int i18 = i13 & 14;
                        n12 = (i18 != 4) | u11.n(foundationMapperKt$toOnClickLambda$1$1) | u11.n(interfaceC3978p0);
                        C12 = u11.C();
                        if (!n12 || C12 == InterfaceC3967k.a.a()) {
                            C12 = new UniTagButtonAtomKt$UniTagButtonAtom$3$1(foundationMapperKt$toOnClickLambda$1$1, dto, interfaceC3978p0);
                            u11.x(C12);
                        }
                        Function0 function0 = (Function0) C12;
                        u11.k();
                        CommonControlSettings closeControlSettings = dto.getCloseControlSettings();
                        foundationMapperKt$toOnClickLambda$1$12 = (closeControlSettings != null || (atomAction = closeControlSettings.toAtomAction()) == null) ? null : new FoundationMapperKt$toOnClickLambda$1$1(function13, atomAction);
                        u11.o(60419593);
                        if (foundationMapperKt$toOnClickLambda$1$12 == null) {
                            u11.o(60421298);
                            Object C14 = u11.C();
                            if (C14 == InterfaceC3967k.a.a()) {
                                C14 = UniTagButtonAtomKt$UniTagButtonAtom$4$1.INSTANCE;
                                u11.x(C14);
                            }
                            foundationMapperKt$toOnClickLambda$1$12 = (Function0) C14;
                            u11.k();
                        }
                        u11.k();
                        String icon = dto.getIcon();
                        u11.o(60422237);
                        AbstractC8972b abstractC8972b = icon != null ? null : TokenParserKt.tokenToIcon(icon, u11, 0);
                        u11.k();
                        dto.getImage();
                        u11.o(60428936);
                        C4912a c11 = dto.getIndicator() == null ? c.c(-2059966216, new UniTagButtonAtomKt$UniTagButtonAtom$5(dto), u11) : null;
                        u11.k();
                        Boolean isDisabled = dto.isDisabled();
                        Boolean bool = Boolean.TRUE;
                        UniTagButtonState uniTagButtonState = !Intrinsics.d(isDisabled, bool) ? UniTagButtonState.Disabled : (UniTagButtonAtom$lambda$2(interfaceC3978p0) && z14) ? UniTagButtonState.LoadingSelected : UniTagButtonAtom$lambda$2(interfaceC3978p0) ? UniTagButtonState.Selected : z14 ? UniTagButtonState.Loading : UniTagButtonState.Default;
                        UniTagButtonStyle vo = toVO(dto, u11, i18);
                        size = dto.getSize();
                        if (size == null) {
                            size = TagButtonDTO.INSTANCE.getDefaultSize();
                        }
                        i16 = WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
                        if (i16 != 1) {
                            uniTagButtonSize = UniTagButtonSize.Size500;
                        } else {
                            if (i16 != 2) {
                                throw new o();
                            }
                            uniTagButtonSize = UniTagButtonSize.Size600;
                        }
                        UniTagButtonSize uniTagButtonSize2 = uniTagButtonSize;
                        boolean d11 = Intrinsics.d(dto.isClosable(), bool);
                        Rounds round = dto.getRound();
                        c3969l = u11;
                        UniTagButtonKt.UniTagButton(viewAnalytics, text, function0, foundationMapperKt$toOnClickLambda$1$12, abstractC8972b, null, c11, uniTagButtonState, vo, uniTagButtonSize2, d11, round == null && round.getRoundCorners(), null, null, c3969l, 0, 0, 12288);
                        eVar3 = eVar4;
                        z13 = z14;
                        function14 = function13;
                    } else {
                        u11.j();
                        c3969l = u11;
                        eVar3 = eVar2;
                        z13 = z12;
                        function14 = function12;
                    }
                    m02 = c3969l.m0();
                    if (m02 == null) {
                        m02.G(new UniTagButtonAtomKt$UniTagButtonAtom$6(dto, eVar3, z13, function14, i11, i12));
                        return;
                    }
                    return;
                }
                function12 = function1;
                if ((i13 & 1171) == 1170) {
                }
                if (i17 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                Object isSelected3 = dto.isSelected();
                u11.o(60404436);
                n11 = u11.n(isSelected3);
                C11 = u11.C();
                if (!n11) {
                }
                Boolean isSelected22 = dto.isSelected();
                C11 = n1.f(Boolean.valueOf(isSelected22 == null ? isSelected22.booleanValue() : false), D1.f25195a);
                u11.x(C11);
                interfaceC3978p0 = (InterfaceC3978p0) C11;
                u11.k();
                CommonControlSettings common2 = dto.getCommon();
                if (common2 != null) {
                }
                u11.o(60411806);
                e viewAnalytics2 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
                testInfo = dto.getTestInfo();
                if (testInfo != null) {
                }
                u11.k();
                text = dto.getText();
                if (text == null) {
                }
                u11.o(60415109);
                int i182 = i13 & 14;
                n12 = (i182 != 4) | u11.n(foundationMapperKt$toOnClickLambda$1$1) | u11.n(interfaceC3978p0);
                C12 = u11.C();
                if (!n12) {
                }
                C12 = new UniTagButtonAtomKt$UniTagButtonAtom$3$1(foundationMapperKt$toOnClickLambda$1$1, dto, interfaceC3978p0);
                u11.x(C12);
                Function0 function02 = (Function0) C12;
                u11.k();
                CommonControlSettings closeControlSettings2 = dto.getCloseControlSettings();
                if (closeControlSettings2 != null) {
                }
                u11.o(60419593);
                if (foundationMapperKt$toOnClickLambda$1$12 == null) {
                }
                u11.k();
                String icon2 = dto.getIcon();
                u11.o(60422237);
                if (icon2 != null) {
                }
                u11.k();
                dto.getImage();
                u11.o(60428936);
                if (dto.getIndicator() == null) {
                }
                u11.k();
                Boolean isDisabled2 = dto.isDisabled();
                Boolean bool2 = Boolean.TRUE;
                if (!Intrinsics.d(isDisabled2, bool2)) {
                }
                UniTagButtonStyle vo2 = toVO(dto, u11, i182);
                size = dto.getSize();
                if (size == null) {
                }
                i16 = WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
                if (i16 != 1) {
                }
                UniTagButtonSize uniTagButtonSize22 = uniTagButtonSize;
                boolean d112 = Intrinsics.d(dto.isClosable(), bool2);
                Rounds round2 = dto.getRound();
                c3969l = u11;
                UniTagButtonKt.UniTagButton(viewAnalytics2, text, function02, foundationMapperKt$toOnClickLambda$1$12, abstractC8972b, null, c11, uniTagButtonState, vo2, uniTagButtonSize22, d112, round2 == null && round2.getRoundCorners(), null, null, c3969l, 0, 0, 12288);
                eVar3 = eVar4;
                z13 = z14;
                function14 = function13;
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
            if (i17 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            Object isSelected32 = dto.isSelected();
            u11.o(60404436);
            n11 = u11.n(isSelected32);
            C11 = u11.C();
            if (!n11) {
            }
            Boolean isSelected222 = dto.isSelected();
            C11 = n1.f(Boolean.valueOf(isSelected222 == null ? isSelected222.booleanValue() : false), D1.f25195a);
            u11.x(C11);
            interfaceC3978p0 = (InterfaceC3978p0) C11;
            u11.k();
            CommonControlSettings common22 = dto.getCommon();
            if (common22 != null) {
            }
            u11.o(60411806);
            e viewAnalytics22 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
            testInfo = dto.getTestInfo();
            if (testInfo != null) {
            }
            u11.k();
            text = dto.getText();
            if (text == null) {
            }
            u11.o(60415109);
            int i1822 = i13 & 14;
            n12 = (i1822 != 4) | u11.n(foundationMapperKt$toOnClickLambda$1$1) | u11.n(interfaceC3978p0);
            C12 = u11.C();
            if (!n12) {
            }
            C12 = new UniTagButtonAtomKt$UniTagButtonAtom$3$1(foundationMapperKt$toOnClickLambda$1$1, dto, interfaceC3978p0);
            u11.x(C12);
            Function0 function022 = (Function0) C12;
            u11.k();
            CommonControlSettings closeControlSettings22 = dto.getCloseControlSettings();
            if (closeControlSettings22 != null) {
            }
            u11.o(60419593);
            if (foundationMapperKt$toOnClickLambda$1$12 == null) {
            }
            u11.k();
            String icon22 = dto.getIcon();
            u11.o(60422237);
            if (icon22 != null) {
            }
            u11.k();
            dto.getImage();
            u11.o(60428936);
            if (dto.getIndicator() == null) {
            }
            u11.k();
            Boolean isDisabled22 = dto.isDisabled();
            Boolean bool22 = Boolean.TRUE;
            if (!Intrinsics.d(isDisabled22, bool22)) {
            }
            UniTagButtonStyle vo22 = toVO(dto, u11, i1822);
            size = dto.getSize();
            if (size == null) {
            }
            i16 = WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
            if (i16 != 1) {
            }
            UniTagButtonSize uniTagButtonSize222 = uniTagButtonSize;
            boolean d1122 = Intrinsics.d(dto.isClosable(), bool22);
            Rounds round22 = dto.getRound();
            c3969l = u11;
            UniTagButtonKt.UniTagButton(viewAnalytics22, text, function022, foundationMapperKt$toOnClickLambda$1$12, abstractC8972b, null, c11, uniTagButtonState, vo22, uniTagButtonSize222, d1122, round22 == null && round22.getRoundCorners(), null, null, c3969l, 0, 0, 12288);
            eVar3 = eVar4;
            z13 = z14;
            function14 = function13;
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
        if (i17 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        Object isSelected322 = dto.isSelected();
        u11.o(60404436);
        n11 = u11.n(isSelected322);
        C11 = u11.C();
        if (!n11) {
        }
        Boolean isSelected2222 = dto.isSelected();
        C11 = n1.f(Boolean.valueOf(isSelected2222 == null ? isSelected2222.booleanValue() : false), D1.f25195a);
        u11.x(C11);
        interfaceC3978p0 = (InterfaceC3978p0) C11;
        u11.k();
        CommonControlSettings common222 = dto.getCommon();
        if (common222 != null) {
        }
        u11.o(60411806);
        e viewAnalytics222 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
        testInfo = dto.getTestInfo();
        if (testInfo != null) {
        }
        u11.k();
        text = dto.getText();
        if (text == null) {
        }
        u11.o(60415109);
        int i18222 = i13 & 14;
        n12 = (i18222 != 4) | u11.n(foundationMapperKt$toOnClickLambda$1$1) | u11.n(interfaceC3978p0);
        C12 = u11.C();
        if (!n12) {
        }
        C12 = new UniTagButtonAtomKt$UniTagButtonAtom$3$1(foundationMapperKt$toOnClickLambda$1$1, dto, interfaceC3978p0);
        u11.x(C12);
        Function0 function0222 = (Function0) C12;
        u11.k();
        CommonControlSettings closeControlSettings222 = dto.getCloseControlSettings();
        if (closeControlSettings222 != null) {
        }
        u11.o(60419593);
        if (foundationMapperKt$toOnClickLambda$1$12 == null) {
        }
        u11.k();
        String icon222 = dto.getIcon();
        u11.o(60422237);
        if (icon222 != null) {
        }
        u11.k();
        dto.getImage();
        u11.o(60428936);
        if (dto.getIndicator() == null) {
        }
        u11.k();
        Boolean isDisabled222 = dto.isDisabled();
        Boolean bool222 = Boolean.TRUE;
        if (!Intrinsics.d(isDisabled222, bool222)) {
        }
        UniTagButtonStyle vo222 = toVO(dto, u11, i18222);
        size = dto.getSize();
        if (size == null) {
        }
        i16 = WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
        if (i16 != 1) {
        }
        UniTagButtonSize uniTagButtonSize2222 = uniTagButtonSize;
        boolean d11222 = Intrinsics.d(dto.isClosable(), bool222);
        Rounds round222 = dto.getRound();
        c3969l = u11;
        UniTagButtonKt.UniTagButton(viewAnalytics222, text, function0222, foundationMapperKt$toOnClickLambda$1$12, abstractC8972b, null, c11, uniTagButtonState, vo222, uniTagButtonSize2222, d11222, round222 == null && round222.getRoundCorners(), null, null, c3969l, 0, 0, 12288);
        eVar3 = eVar4;
        z13 = z14;
        function14 = function13;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UniTagButtonAtom$lambda$2(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UniTagButtonAtom$lambda$3(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    private static final UniTagButtonStyle toVO(TagButtonDTO tagButtonDTO, InterfaceC3967k interfaceC3967k, int i11) {
        AbstractC7799Q abstractC7799Q;
        interfaceC3967k.o(-793255808);
        UniTagButtonStyle uniTagButtonStyle = UniTagButtonStyle.Default.INSTANCE;
        TagButtonDTO.StyleType styleType = tagButtonDTO.getStyleType();
        if (styleType == null) {
            styleType = TagButtonDTO.INSTANCE.getDefaultStyleType();
        }
        if (styleType != TagButtonDTO.StyleType.DEFAULT) {
            if (styleType != TagButtonDTO.StyleType.CUSTOM) {
                throw new o();
            }
            TagButtonDTO.CustomTagButtonStyle customDefaultStyle = tagButtonDTO.getCustomDefaultStyle();
            AbstractC7799Q abstractC7799Q2 = null;
            String textColor = customDefaultStyle != null ? customDefaultStyle.getTextColor() : null;
            interfaceC3967k.o(-1972894107);
            C7807Z c7807z = textColor == null ? null : TokenParserKt.tokenToColor(textColor, interfaceC3967k, 0);
            interfaceC3967k.k();
            interfaceC3967k.o(-1972895034);
            long value = c7807z == null ? DeferredColor.getValue(uniTagButtonStyle.getColors().getTextColor(), interfaceC3967k, 0) : c7807z.w();
            interfaceC3967k.k();
            TagButtonDTO.CustomTagButtonStyle customDefaultStyle2 = tagButtonDTO.getCustomDefaultStyle();
            String iconColor = customDefaultStyle2 != null ? customDefaultStyle2.getIconColor() : null;
            interfaceC3967k.o(-1972890619);
            C7807Z c7807z2 = iconColor == null ? null : TokenParserKt.tokenToColor(iconColor, interfaceC3967k, 0);
            interfaceC3967k.k();
            interfaceC3967k.o(-1972891546);
            long value2 = c7807z2 == null ? DeferredColor.getValue(uniTagButtonStyle.getColors().getIconColor(), interfaceC3967k, 0) : c7807z2.w();
            interfaceC3967k.k();
            TagButtonDTO.CustomTagButtonStyle customDefaultStyle3 = tagButtonDTO.getCustomDefaultStyle();
            String closeIconColor = customDefaultStyle3 != null ? customDefaultStyle3.getCloseIconColor() : null;
            interfaceC3967k.o(-1972886811);
            C7807Z c7807z3 = closeIconColor == null ? null : TokenParserKt.tokenToColor(closeIconColor, interfaceC3967k, 0);
            interfaceC3967k.k();
            interfaceC3967k.o(-1972887888);
            long value3 = c7807z3 == null ? DeferredColor.getValue(uniTagButtonStyle.getColors().getCloseIconColor(), interfaceC3967k, 0) : c7807z3.w();
            interfaceC3967k.k();
            TagButtonDTO.CustomTagButtonStyle customDefaultStyle4 = tagButtonDTO.getCustomDefaultStyle();
            String loaderColor = customDefaultStyle4 != null ? customDefaultStyle4.getLoaderColor() : null;
            interfaceC3967k.o(-1972883035);
            C7807Z c7807z4 = loaderColor == null ? null : TokenParserKt.tokenToColor(loaderColor, interfaceC3967k, 0);
            interfaceC3967k.k();
            interfaceC3967k.o(-1972884022);
            long value4 = c7807z4 == null ? DeferredColor.getValue(uniTagButtonStyle.getColors().getLoaderColor(), interfaceC3967k, 0) : c7807z4.w();
            interfaceC3967k.k();
            TagButtonDTO.CustomTagButtonStyle customDefaultStyle5 = tagButtonDTO.getCustomDefaultStyle();
            String backgroundColor = customDefaultStyle5 != null ? customDefaultStyle5.getBackgroundColor() : null;
            interfaceC3967k.o(-1972879051);
            if (backgroundColor == null) {
                abstractC7799Q = null;
            } else {
                abstractC7799Q = TokenParserKt.tokenToGradient(backgroundColor, interfaceC3967k, 0);
                interfaceC3967k.o(-1972878867);
                if (abstractC7799Q == null) {
                    C7807Z c7807z5 = TokenParserKt.tokenToColor(backgroundColor, interfaceC3967k, 0);
                    abstractC7799Q = c7807z5 != null ? new K0(c7807z5.w()) : null;
                }
                interfaceC3967k.k();
            }
            interfaceC3967k.k();
            interfaceC3967k.o(-1972880138);
            if (abstractC7799Q == null) {
                abstractC7799Q = DeferredBrush.getValue(uniTagButtonStyle.getColors().getBackgroundColor(), interfaceC3967k, 0);
            }
            interfaceC3967k.k();
            UniTagButtonColors uniTagButtonColors = new UniTagButtonColors(value, value2, value3, value4, abstractC7799Q, (DefaultConstructorMarker) null);
            TagButtonDTO.CustomTagButtonStyle customSelectedStyle = tagButtonDTO.getCustomSelectedStyle();
            String textColor2 = customSelectedStyle != null ? customSelectedStyle.getTextColor() : null;
            interfaceC3967k.o(-1972871163);
            C7807Z c7807z6 = textColor2 == null ? null : TokenParserKt.tokenToColor(textColor2, interfaceC3967k, 0);
            interfaceC3967k.k();
            interfaceC3967k.o(-1972872113);
            long value5 = c7807z6 == null ? DeferredColor.getValue(uniTagButtonStyle.getSelectedColors().getTextColor(), interfaceC3967k, 0) : c7807z6.w();
            interfaceC3967k.k();
            TagButtonDTO.CustomTagButtonStyle customSelectedStyle2 = tagButtonDTO.getCustomSelectedStyle();
            String iconColor2 = customSelectedStyle2 != null ? customSelectedStyle2.getIconColor() : null;
            interfaceC3967k.o(-1972867387);
            C7807Z c7807z7 = iconColor2 == null ? null : TokenParserKt.tokenToColor(iconColor2, interfaceC3967k, 0);
            interfaceC3967k.k();
            interfaceC3967k.o(-1972868337);
            long value6 = c7807z7 == null ? DeferredColor.getValue(uniTagButtonStyle.getSelectedColors().getIconColor(), interfaceC3967k, 0) : c7807z7.w();
            interfaceC3967k.k();
            TagButtonDTO.CustomTagButtonStyle customSelectedStyle3 = tagButtonDTO.getCustomSelectedStyle();
            String closeIconColor2 = customSelectedStyle3 != null ? customSelectedStyle3.getCloseIconColor() : null;
            interfaceC3967k.o(-1972863291);
            C7807Z c7807z8 = closeIconColor2 == null ? null : TokenParserKt.tokenToColor(closeIconColor2, interfaceC3967k, 0);
            interfaceC3967k.k();
            interfaceC3967k.o(-1972864391);
            long value7 = c7807z8 == null ? DeferredColor.getValue(uniTagButtonStyle.getSelectedColors().getCloseIconColor(), interfaceC3967k, 0) : c7807z8.w();
            interfaceC3967k.k();
            TagButtonDTO.CustomTagButtonStyle customSelectedStyle4 = tagButtonDTO.getCustomSelectedStyle();
            String loaderColor2 = customSelectedStyle4 != null ? customSelectedStyle4.getLoaderColor() : null;
            interfaceC3967k.o(-1972859227);
            C7807Z c7807z9 = loaderColor2 == null ? null : TokenParserKt.tokenToColor(loaderColor2, interfaceC3967k, 0);
            interfaceC3967k.k();
            interfaceC3967k.o(-1972860237);
            long value8 = c7807z9 == null ? DeferredColor.getValue(uniTagButtonStyle.getSelectedColors().getLoaderColor(), interfaceC3967k, 0) : c7807z9.w();
            interfaceC3967k.k();
            TagButtonDTO.CustomTagButtonStyle customSelectedStyle5 = tagButtonDTO.getCustomSelectedStyle();
            String backgroundColor2 = customSelectedStyle5 != null ? customSelectedStyle5.getBackgroundColor() : null;
            interfaceC3967k.o(-1972854955);
            if (backgroundColor2 != null) {
                AbstractC7799Q abstractC7799Q3 = TokenParserKt.tokenToGradient(backgroundColor2, interfaceC3967k, 0);
                interfaceC3967k.o(-1972854771);
                if (abstractC7799Q3 == null) {
                    C7807Z c7807z10 = TokenParserKt.tokenToColor(backgroundColor2, interfaceC3967k, 0);
                    if (c7807z10 != null) {
                        abstractC7799Q3 = new K0(c7807z10.w());
                    }
                    interfaceC3967k.k();
                }
                abstractC7799Q2 = abstractC7799Q3;
                interfaceC3967k.k();
            }
            interfaceC3967k.k();
            if (abstractC7799Q2 == null) {
                abstractC7799Q2 = DeferredBrush.getValue(uniTagButtonStyle.getSelectedColors().getBackgroundColor(), interfaceC3967k, 0);
            }
            uniTagButtonStyle = new UniTagButtonStyle.CustomStyle(uniTagButtonColors, new UniTagButtonColors(value5, value6, value7, value8, abstractC7799Q2, (DefaultConstructorMarker) null));
        }
        interfaceC3967k.k();
        return uniTagButtonStyle;
    }
}
