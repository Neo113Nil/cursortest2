package ru.ozon.uni.android.ds.compose.component.tooltip;

import B1.B;
import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Z1.d;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d2.C6041S;
import d2.InterfaceC6040Q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniPaddingToken;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aY\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\r\u001ac\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\u0013\u001a]\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a%\u0010\u0019\u001a\u00020\u0002*\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/uni/atoms/data/common/TooltipDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "LB1/B;", "anchorLayoutCoordinates", "Ld2/S;", "properties", "Lkotlin/Function0;", "", "onDismissRequest", "onCloseClick", "DsTooltipAtom", "(Lru/ozon/uni/atoms/data/common/TooltipDTO;Landroidx/compose/ui/e;LB1/B;Ld2/S;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LS0/k;II)V", "Ld2/Q;", "popupPositionProvider", "LS0/A1;", "", "beakOffset", "(Lru/ozon/uni/atoms/data/common/TooltipDTO;Landroidx/compose/ui/e;Ld2/Q;LS0/A1;Ld2/S;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LS0/k;II)V", "DsTooltipAtomWithPopupProvider", "(Lru/ozon/uni/atoms/data/common/TooltipDTO;Landroidx/compose/ui/e;Ld2/Q;LS0/A1;Ld2/S;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "Lru/ozon/uni/atoms/data/common/TooltipDTO$SizeType;", "sizeType", "minWidth", "sizeModifier", "(Landroidx/compose/ui/e;Lru/ozon/uni/atoms/data/common/TooltipDTO$SizeType;I)Landroidx/compose/ui/e;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsTooltipAtomKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsTooltipAtom(@NotNull TooltipDTO dto, e eVar, B b11, C6041S c6041s, Function0<Unit> function0, Function0<Unit> function02, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        B b12;
        int i15;
        C6041S c6041s2;
        int i16;
        Function0<Unit> function03;
        int i17;
        Function0<Unit> function04;
        Function0<Unit> function05;
        UniPaddingToken leftMargin;
        UniPaddingToken rightMargin;
        TooltipDTO.StyleType styleType;
        TooltipDTO.BeakPosition beakPosition;
        C3969l c3969l;
        e eVar3;
        B b13;
        C6041S c6041s3;
        Function0<Unit> function06;
        Function0<Unit> function07;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(82000842);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? u11.n(dto) : u11.F(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i18 = i12 & 2;
        if (i18 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                b12 = b11;
                i13 |= u11.F(b12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i15 = i12 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    c6041s2 = c6041s;
                    i13 |= u11.n(c6041s2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    i16 = i12 & 16;
                    if (i16 == 0) {
                        i13 |= 24576;
                    } else if ((i11 & 24576) == 0) {
                        function03 = function0;
                        i13 |= u11.F(function03) ? 16384 : 8192;
                        i17 = i12 & 32;
                        if (i17 != 0) {
                            i13 |= 196608;
                        } else if ((196608 & i11) == 0) {
                            function04 = function02;
                            i13 |= u11.F(function04) ? 131072 : 65536;
                            if ((74899 & i13) == 74898 || !u11.b()) {
                                e eVar4 = i18 == 0 ? e.f40358c0 : eVar2;
                                B b14 = i14 == 0 ? null : b12;
                                C6041S c6041s4 = i15 == 0 ? new C6041S(15, false, false) : c6041s2;
                                Function0<Unit> function08 = i16 == 0 ? null : function03;
                                if (i17 == 0) {
                                    u11.o(-1576285530);
                                    Object C11 = u11.C();
                                    if (C11 == InterfaceC3967k.a.a()) {
                                        C11 = DsTooltipAtomKt$DsTooltipAtom$1$1.INSTANCE;
                                        u11.x(C11);
                                    }
                                    u11.k();
                                    function05 = (Function0) C11;
                                } else {
                                    function05 = function04;
                                }
                                e viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
                                DsTooltipAtomLocator dsTooltipAtomLocator = new DsTooltipAtomLocator(dto.getTestInfo(), null, 2, null);
                                leftMargin = dto.getLeftMargin();
                                if (leftMargin == null) {
                                    leftMargin = TooltipDTO.INSTANCE.getDefaultRightMargin();
                                }
                                float dp = TokensExtKt.getDp(leftMargin);
                                rightMargin = dto.getRightMargin();
                                if (rightMargin == null) {
                                    rightMargin = TooltipDTO.INSTANCE.getDefaultRightMargin();
                                }
                                float dp2 = TokensExtKt.getDp(rightMargin);
                                float f7 = 0;
                                e testTag = AtomLocatorKt.testTag(sizeModifier(T.i(viewAnalytics, dp, f7, dp2, f7), dto.getSizeType(), dto.getMinWidth()), dsTooltipAtomLocator);
                                d dVar = (d) u11.m(K0.e());
                                int Y02 = dVar.Y0(dp);
                                int Y03 = dVar.Y0(dp2);
                                String title = dto.getTitle();
                                String subtitle = dto.getSubtitle();
                                e.a aVar = e.f40358c0;
                                e testTag2 = AtomLocatorKt.testTag(aVar, dsTooltipAtomLocator.getTitle().invoke());
                                e testTag3 = AtomLocatorKt.testTag(aVar, dsTooltipAtomLocator.getSubtitle().invoke());
                                styleType = dto.getStyleType();
                                if (styleType == null) {
                                    styleType = TooltipDTO.INSTANCE.getDefaultStyleType();
                                }
                                DsTooltipStyle style = DsTooltipMappersKt.toStyle(styleType, u11, 0);
                                Boolean hasCloseIcon = dto.getHasCloseIcon();
                                boolean booleanValue = hasCloseIcon != null ? hasCloseIcon.booleanValue() : false;
                                beakPosition = dto.getBeakPosition();
                                if (beakPosition == null) {
                                    beakPosition = TooltipDTO.INSTANCE.getDefaultBeakPosition();
                                }
                                c3969l = u11;
                                DsTooltipKt.DsTooltip(title, testTag, testTag2, testTag3, subtitle, style, booleanValue, DsTooltipMappersKt.toBeakPosition(beakPosition, Y02, Y03), b14, c6041s4, function08, function05, c3969l, (i13 << 18) & 2113929216, (i13 >> 12) & 126, 0);
                                eVar3 = eVar4;
                                b13 = b14;
                                c6041s3 = c6041s4;
                                function06 = function08;
                                function07 = function05;
                            } else {
                                u11.j();
                                c3969l = u11;
                                eVar3 = eVar2;
                                b13 = b12;
                                c6041s3 = c6041s2;
                                function06 = function03;
                                function07 = function04;
                            }
                            m02 = c3969l.m0();
                            if (m02 == null) {
                                m02.G(new DsTooltipAtomKt$DsTooltipAtom$3(dto, eVar3, b13, c6041s3, function06, function07, i11, i12));
                                return;
                            }
                            return;
                        }
                        function04 = function02;
                        if ((74899 & i13) == 74898) {
                        }
                        if (i18 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        e viewAnalytics2 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
                        DsTooltipAtomLocator dsTooltipAtomLocator2 = new DsTooltipAtomLocator(dto.getTestInfo(), null, 2, null);
                        leftMargin = dto.getLeftMargin();
                        if (leftMargin == null) {
                        }
                        float dp3 = TokensExtKt.getDp(leftMargin);
                        rightMargin = dto.getRightMargin();
                        if (rightMargin == null) {
                        }
                        float dp22 = TokensExtKt.getDp(rightMargin);
                        float f72 = 0;
                        e testTag4 = AtomLocatorKt.testTag(sizeModifier(T.i(viewAnalytics2, dp3, f72, dp22, f72), dto.getSizeType(), dto.getMinWidth()), dsTooltipAtomLocator2);
                        d dVar2 = (d) u11.m(K0.e());
                        int Y022 = dVar2.Y0(dp3);
                        int Y032 = dVar2.Y0(dp22);
                        String title2 = dto.getTitle();
                        String subtitle2 = dto.getSubtitle();
                        e.a aVar2 = e.f40358c0;
                        e testTag22 = AtomLocatorKt.testTag(aVar2, dsTooltipAtomLocator2.getTitle().invoke());
                        e testTag32 = AtomLocatorKt.testTag(aVar2, dsTooltipAtomLocator2.getSubtitle().invoke());
                        styleType = dto.getStyleType();
                        if (styleType == null) {
                        }
                        DsTooltipStyle style2 = DsTooltipMappersKt.toStyle(styleType, u11, 0);
                        Boolean hasCloseIcon2 = dto.getHasCloseIcon();
                        boolean booleanValue2 = hasCloseIcon2 != null ? hasCloseIcon2.booleanValue() : false;
                        beakPosition = dto.getBeakPosition();
                        if (beakPosition == null) {
                        }
                        c3969l = u11;
                        DsTooltipKt.DsTooltip(title2, testTag4, testTag22, testTag32, subtitle2, style2, booleanValue2, DsTooltipMappersKt.toBeakPosition(beakPosition, Y022, Y032), b14, c6041s4, function08, function05, c3969l, (i13 << 18) & 2113929216, (i13 >> 12) & 126, 0);
                        eVar3 = eVar4;
                        b13 = b14;
                        c6041s3 = c6041s4;
                        function06 = function08;
                        function07 = function05;
                        m02 = c3969l.m0();
                        if (m02 == null) {
                        }
                    }
                    function03 = function0;
                    i17 = i12 & 32;
                    if (i17 != 0) {
                    }
                    function04 = function02;
                    if ((74899 & i13) == 74898) {
                    }
                    if (i18 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    e viewAnalytics22 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
                    DsTooltipAtomLocator dsTooltipAtomLocator22 = new DsTooltipAtomLocator(dto.getTestInfo(), null, 2, null);
                    leftMargin = dto.getLeftMargin();
                    if (leftMargin == null) {
                    }
                    float dp32 = TokensExtKt.getDp(leftMargin);
                    rightMargin = dto.getRightMargin();
                    if (rightMargin == null) {
                    }
                    float dp222 = TokensExtKt.getDp(rightMargin);
                    float f722 = 0;
                    e testTag42 = AtomLocatorKt.testTag(sizeModifier(T.i(viewAnalytics22, dp32, f722, dp222, f722), dto.getSizeType(), dto.getMinWidth()), dsTooltipAtomLocator22);
                    d dVar22 = (d) u11.m(K0.e());
                    int Y0222 = dVar22.Y0(dp32);
                    int Y0322 = dVar22.Y0(dp222);
                    String title22 = dto.getTitle();
                    String subtitle22 = dto.getSubtitle();
                    e.a aVar22 = e.f40358c0;
                    e testTag222 = AtomLocatorKt.testTag(aVar22, dsTooltipAtomLocator22.getTitle().invoke());
                    e testTag322 = AtomLocatorKt.testTag(aVar22, dsTooltipAtomLocator22.getSubtitle().invoke());
                    styleType = dto.getStyleType();
                    if (styleType == null) {
                    }
                    DsTooltipStyle style22 = DsTooltipMappersKt.toStyle(styleType, u11, 0);
                    Boolean hasCloseIcon22 = dto.getHasCloseIcon();
                    boolean booleanValue22 = hasCloseIcon22 != null ? hasCloseIcon22.booleanValue() : false;
                    beakPosition = dto.getBeakPosition();
                    if (beakPosition == null) {
                    }
                    c3969l = u11;
                    DsTooltipKt.DsTooltip(title22, testTag42, testTag222, testTag322, subtitle22, style22, booleanValue22, DsTooltipMappersKt.toBeakPosition(beakPosition, Y0222, Y0322), b14, c6041s4, function08, function05, c3969l, (i13 << 18) & 2113929216, (i13 >> 12) & 126, 0);
                    eVar3 = eVar4;
                    b13 = b14;
                    c6041s3 = c6041s4;
                    function06 = function08;
                    function07 = function05;
                    m02 = c3969l.m0();
                    if (m02 == null) {
                    }
                }
                c6041s2 = c6041s;
                i16 = i12 & 16;
                if (i16 == 0) {
                }
                function03 = function0;
                i17 = i12 & 32;
                if (i17 != 0) {
                }
                function04 = function02;
                if ((74899 & i13) == 74898) {
                }
                if (i18 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                e viewAnalytics222 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
                DsTooltipAtomLocator dsTooltipAtomLocator222 = new DsTooltipAtomLocator(dto.getTestInfo(), null, 2, null);
                leftMargin = dto.getLeftMargin();
                if (leftMargin == null) {
                }
                float dp322 = TokensExtKt.getDp(leftMargin);
                rightMargin = dto.getRightMargin();
                if (rightMargin == null) {
                }
                float dp2222 = TokensExtKt.getDp(rightMargin);
                float f7222 = 0;
                e testTag422 = AtomLocatorKt.testTag(sizeModifier(T.i(viewAnalytics222, dp322, f7222, dp2222, f7222), dto.getSizeType(), dto.getMinWidth()), dsTooltipAtomLocator222);
                d dVar222 = (d) u11.m(K0.e());
                int Y02222 = dVar222.Y0(dp322);
                int Y03222 = dVar222.Y0(dp2222);
                String title222 = dto.getTitle();
                String subtitle222 = dto.getSubtitle();
                e.a aVar222 = e.f40358c0;
                e testTag2222 = AtomLocatorKt.testTag(aVar222, dsTooltipAtomLocator222.getTitle().invoke());
                e testTag3222 = AtomLocatorKt.testTag(aVar222, dsTooltipAtomLocator222.getSubtitle().invoke());
                styleType = dto.getStyleType();
                if (styleType == null) {
                }
                DsTooltipStyle style222 = DsTooltipMappersKt.toStyle(styleType, u11, 0);
                Boolean hasCloseIcon222 = dto.getHasCloseIcon();
                boolean booleanValue222 = hasCloseIcon222 != null ? hasCloseIcon222.booleanValue() : false;
                beakPosition = dto.getBeakPosition();
                if (beakPosition == null) {
                }
                c3969l = u11;
                DsTooltipKt.DsTooltip(title222, testTag422, testTag2222, testTag3222, subtitle222, style222, booleanValue222, DsTooltipMappersKt.toBeakPosition(beakPosition, Y02222, Y03222), b14, c6041s4, function08, function05, c3969l, (i13 << 18) & 2113929216, (i13 >> 12) & 126, 0);
                eVar3 = eVar4;
                b13 = b14;
                c6041s3 = c6041s4;
                function06 = function08;
                function07 = function05;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            b12 = b11;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            c6041s2 = c6041s;
            i16 = i12 & 16;
            if (i16 == 0) {
            }
            function03 = function0;
            i17 = i12 & 32;
            if (i17 != 0) {
            }
            function04 = function02;
            if ((74899 & i13) == 74898) {
            }
            if (i18 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            e viewAnalytics2222 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
            DsTooltipAtomLocator dsTooltipAtomLocator2222 = new DsTooltipAtomLocator(dto.getTestInfo(), null, 2, null);
            leftMargin = dto.getLeftMargin();
            if (leftMargin == null) {
            }
            float dp3222 = TokensExtKt.getDp(leftMargin);
            rightMargin = dto.getRightMargin();
            if (rightMargin == null) {
            }
            float dp22222 = TokensExtKt.getDp(rightMargin);
            float f72222 = 0;
            e testTag4222 = AtomLocatorKt.testTag(sizeModifier(T.i(viewAnalytics2222, dp3222, f72222, dp22222, f72222), dto.getSizeType(), dto.getMinWidth()), dsTooltipAtomLocator2222);
            d dVar2222 = (d) u11.m(K0.e());
            int Y022222 = dVar2222.Y0(dp3222);
            int Y032222 = dVar2222.Y0(dp22222);
            String title2222 = dto.getTitle();
            String subtitle2222 = dto.getSubtitle();
            e.a aVar2222 = e.f40358c0;
            e testTag22222 = AtomLocatorKt.testTag(aVar2222, dsTooltipAtomLocator2222.getTitle().invoke());
            e testTag32222 = AtomLocatorKt.testTag(aVar2222, dsTooltipAtomLocator2222.getSubtitle().invoke());
            styleType = dto.getStyleType();
            if (styleType == null) {
            }
            DsTooltipStyle style2222 = DsTooltipMappersKt.toStyle(styleType, u11, 0);
            Boolean hasCloseIcon2222 = dto.getHasCloseIcon();
            boolean booleanValue2222 = hasCloseIcon2222 != null ? hasCloseIcon2222.booleanValue() : false;
            beakPosition = dto.getBeakPosition();
            if (beakPosition == null) {
            }
            c3969l = u11;
            DsTooltipKt.DsTooltip(title2222, testTag4222, testTag22222, testTag32222, subtitle2222, style2222, booleanValue2222, DsTooltipMappersKt.toBeakPosition(beakPosition, Y022222, Y032222), b14, c6041s4, function08, function05, c3969l, (i13 << 18) & 2113929216, (i13 >> 12) & 126, 0);
            eVar3 = eVar4;
            b13 = b14;
            c6041s3 = c6041s4;
            function06 = function08;
            function07 = function05;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        b12 = b11;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        c6041s2 = c6041s;
        i16 = i12 & 16;
        if (i16 == 0) {
        }
        function03 = function0;
        i17 = i12 & 32;
        if (i17 != 0) {
        }
        function04 = function02;
        if ((74899 & i13) == 74898) {
        }
        if (i18 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        e viewAnalytics22222 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
        DsTooltipAtomLocator dsTooltipAtomLocator22222 = new DsTooltipAtomLocator(dto.getTestInfo(), null, 2, null);
        leftMargin = dto.getLeftMargin();
        if (leftMargin == null) {
        }
        float dp32222 = TokensExtKt.getDp(leftMargin);
        rightMargin = dto.getRightMargin();
        if (rightMargin == null) {
        }
        float dp222222 = TokensExtKt.getDp(rightMargin);
        float f722222 = 0;
        e testTag42222 = AtomLocatorKt.testTag(sizeModifier(T.i(viewAnalytics22222, dp32222, f722222, dp222222, f722222), dto.getSizeType(), dto.getMinWidth()), dsTooltipAtomLocator22222);
        d dVar22222 = (d) u11.m(K0.e());
        int Y0222222 = dVar22222.Y0(dp32222);
        int Y0322222 = dVar22222.Y0(dp222222);
        String title22222 = dto.getTitle();
        String subtitle22222 = dto.getSubtitle();
        e.a aVar22222 = e.f40358c0;
        e testTag222222 = AtomLocatorKt.testTag(aVar22222, dsTooltipAtomLocator22222.getTitle().invoke());
        e testTag322222 = AtomLocatorKt.testTag(aVar22222, dsTooltipAtomLocator22222.getSubtitle().invoke());
        styleType = dto.getStyleType();
        if (styleType == null) {
        }
        DsTooltipStyle style22222 = DsTooltipMappersKt.toStyle(styleType, u11, 0);
        Boolean hasCloseIcon22222 = dto.getHasCloseIcon();
        boolean booleanValue22222 = hasCloseIcon22222 != null ? hasCloseIcon22222.booleanValue() : false;
        beakPosition = dto.getBeakPosition();
        if (beakPosition == null) {
        }
        c3969l = u11;
        DsTooltipKt.DsTooltip(title22222, testTag42222, testTag222222, testTag322222, subtitle22222, style22222, booleanValue22222, DsTooltipMappersKt.toBeakPosition(beakPosition, Y0222222, Y0322222), b14, c6041s4, function08, function05, c3969l, (i13 << 18) & 2113929216, (i13 >> 12) & 126, 0);
        eVar3 = eVar4;
        b13 = b14;
        c6041s3 = c6041s4;
        function06 = function08;
        function07 = function05;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DsTooltipAtomWithPopupProvider(TooltipDTO tooltipDTO, e eVar, InterfaceC6040Q interfaceC6040Q, A1<Integer> a12, C6041S c6041s, Function0<Unit> function0, Function0<Unit> function02, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-1571320819);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(tooltipDTO) : u11.F(tooltipDTO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(interfaceC6040Q) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(a12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.n(c6041s) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(function0) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.F(function02) ? 1048576 : 524288;
        }
        if ((599187 & i12) == 599186 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar, tooltipDTO);
            DsTooltipAtomLocator dsTooltipAtomLocator = new DsTooltipAtomLocator(tooltipDTO.getTestInfo(), null, 2, null);
            UniPaddingToken leftMargin = tooltipDTO.getLeftMargin();
            if (leftMargin == null) {
                leftMargin = TooltipDTO.INSTANCE.getDefaultRightMargin();
            }
            float dp = TokensExtKt.getDp(leftMargin);
            UniPaddingToken rightMargin = tooltipDTO.getRightMargin();
            if (rightMargin == null) {
                rightMargin = TooltipDTO.INSTANCE.getDefaultRightMargin();
            }
            float dp2 = TokensExtKt.getDp(rightMargin);
            d dVar = (d) u11.m(K0.e());
            int Y02 = dVar.Y0(dp);
            int Y03 = dVar.Y0(dp2);
            float f7 = 0;
            e testTag = AtomLocatorKt.testTag(sizeModifier(T.i(viewAnalytics, dp, f7, dp2, f7), tooltipDTO.getSizeType(), tooltipDTO.getMinWidth()), dsTooltipAtomLocator);
            TooltipDTO.StyleType styleType = tooltipDTO.getStyleType();
            if (styleType == null) {
                styleType = TooltipDTO.INSTANCE.getDefaultStyleType();
            }
            DsTooltipStyle style = DsTooltipMappersKt.toStyle(styleType, u11, 0);
            TooltipDTO.BeakPosition beakPosition = tooltipDTO.getBeakPosition();
            if (beakPosition == null) {
                beakPosition = TooltipDTO.INSTANCE.getDefaultBeakPosition();
            }
            DsTooltipBeakPosition beakPosition2 = DsTooltipMappersKt.toBeakPosition(beakPosition, Y02, Y03);
            Boolean hasCloseIcon = tooltipDTO.getHasCloseIcon();
            boolean booleanValue = hasCloseIcon != null ? hasCloseIcon.booleanValue() : false;
            if (a12 != null) {
                u11.o(1422412701);
                c3969l = u11;
                String title = tooltipDTO.getTitle();
                String subtitle = tooltipDTO.getSubtitle();
                e.a aVar = e.f40358c0;
                DsTooltipKt.DsTooltip(title, testTag, AtomLocatorKt.testTag(aVar, dsTooltipAtomLocator.getTitle().invoke()), AtomLocatorKt.testTag(aVar, dsTooltipAtomLocator.getSubtitle().invoke()), subtitle, style, booleanValue, beakPosition2, a12, interfaceC6040Q, c6041s, function0, function02, c3969l, ((i12 << 15) & 234881024) | ((i12 << 21) & 1879048192), (i12 >> 12) & 1022, 0);
                c3969l.k();
            } else {
                u11.o(1423038498);
                int i13 = i12;
                String title2 = tooltipDTO.getTitle();
                String subtitle2 = tooltipDTO.getSubtitle();
                e.a aVar2 = e.f40358c0;
                DsTooltipKt.DsTooltip(title2, testTag, AtomLocatorKt.testTag(aVar2, dsTooltipAtomLocator.getTitle().invoke()), AtomLocatorKt.testTag(aVar2, dsTooltipAtomLocator.getSubtitle().invoke()), subtitle2, style, booleanValue, beakPosition2, null, interfaceC6040Q, c6041s, function0, function02, u11, (i13 << 21) & 1879048192, (i13 >> 12) & 1022, 256);
                c3969l = u11;
                c3969l.k();
            }
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new DsTooltipAtomKt$DsTooltipAtomWithPopupProvider$2(tooltipDTO, eVar, interfaceC6040Q, a12, c6041s, function0, function02, i11));
        }
    }

    private static final e sizeModifier(e eVar, TooltipDTO.SizeType sizeType, int i11) {
        Integer valueOf = Integer.valueOf(i11);
        if (i11 < 100) {
            valueOf = null;
        }
        float intValue = valueOf != null ? valueOf.intValue() : 100;
        return sizeType == TooltipDTO.SizeType.FILLED ? a0.e(e.f40358c0, 1.0f) : a0.s(eVar, intValue, sizeType == TooltipDTO.SizeType.FIXED ? intValue : Float.NaN);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsTooltipAtom(@NotNull TooltipDTO dto, e eVar, @NotNull InterfaceC6040Q popupPositionProvider, @NotNull A1<Integer> beakOffset, C6041S c6041s, Function0<Unit> function0, Function0<Unit> function02, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        C6041S c6041s2;
        int i15;
        Function0<Unit> function03;
        int i16;
        Function0<Unit> function04;
        Function0<Unit> function05;
        e eVar3;
        C3969l c3969l;
        Function0<Unit> function06;
        Function0<Unit> function07;
        C6041S c6041s3;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(popupPositionProvider, "popupPositionProvider");
        Intrinsics.checkNotNullParameter(beakOffset, "beakOffset");
        C3969l u11 = interfaceC3967k.u(-56182748);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? u11.n(dto) : u11.F(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i17 = i12 & 2;
        if (i17 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                i13 |= u11.n(popupPositionProvider) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i12 & 8) == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                i13 |= u11.n(beakOffset) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            i14 = i12 & 16;
            if (i14 == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                c6041s2 = c6041s;
                i13 |= u11.n(c6041s2) ? 16384 : 8192;
                i15 = i12 & 32;
                if (i15 != 0) {
                    i13 |= 196608;
                } else if ((196608 & i11) == 0) {
                    function03 = function0;
                    i13 |= u11.F(function03) ? 131072 : 65536;
                    i16 = i12 & 64;
                    if (i16 == 0) {
                        i13 |= 1572864;
                    } else if ((1572864 & i11) == 0) {
                        function04 = function02;
                        i13 |= u11.F(function04) ? 1048576 : 524288;
                        if ((599187 & i13) != 599186 && u11.b()) {
                            u11.j();
                            eVar3 = eVar2;
                            c3969l = u11;
                            c6041s3 = c6041s2;
                            function07 = function03;
                            function06 = function04;
                        } else {
                            e eVar4 = i17 != 0 ? e.f40358c0 : eVar2;
                            if (i14 != 0) {
                                c6041s2 = new C6041S(15, false, false);
                            }
                            Function0<Unit> function08 = i15 != 0 ? null : function03;
                            if (i16 != 0) {
                                u11.o(-1576174650);
                                Object C11 = u11.C();
                                if (C11 == InterfaceC3967k.a.a()) {
                                    C11 = DsTooltipAtomKt$DsTooltipAtom$6$1.INSTANCE;
                                    u11.x(C11);
                                }
                                function05 = (Function0) C11;
                                u11.k();
                            } else {
                                function05 = function04;
                            }
                            int i18 = i13 & 4194302;
                            C6041S c6041s4 = c6041s2;
                            e eVar5 = eVar4;
                            DsTooltipAtomWithPopupProvider(dto, eVar5, popupPositionProvider, beakOffset, c6041s4, function08, function05, u11, i18);
                            eVar3 = eVar5;
                            c3969l = u11;
                            function06 = function05;
                            function07 = function08;
                            c6041s3 = c6041s4;
                        }
                        m02 = c3969l.m0();
                        if (m02 != null) {
                            m02.G(new DsTooltipAtomKt$DsTooltipAtom$7(dto, eVar3, popupPositionProvider, beakOffset, c6041s3, function07, function06, i11, i12));
                            return;
                        }
                        return;
                    }
                    function04 = function02;
                    if ((599187 & i13) != 599186) {
                    }
                    if (i17 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    int i182 = i13 & 4194302;
                    C6041S c6041s42 = c6041s2;
                    e eVar52 = eVar4;
                    DsTooltipAtomWithPopupProvider(dto, eVar52, popupPositionProvider, beakOffset, c6041s42, function08, function05, u11, i182);
                    eVar3 = eVar52;
                    c3969l = u11;
                    function06 = function05;
                    function07 = function08;
                    c6041s3 = c6041s42;
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                function03 = function0;
                i16 = i12 & 64;
                if (i16 == 0) {
                }
                function04 = function02;
                if ((599187 & i13) != 599186) {
                }
                if (i17 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                int i1822 = i13 & 4194302;
                C6041S c6041s422 = c6041s2;
                e eVar522 = eVar4;
                DsTooltipAtomWithPopupProvider(dto, eVar522, popupPositionProvider, beakOffset, c6041s422, function08, function05, u11, i1822);
                eVar3 = eVar522;
                c3969l = u11;
                function06 = function05;
                function07 = function08;
                c6041s3 = c6041s422;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            c6041s2 = c6041s;
            i15 = i12 & 32;
            if (i15 != 0) {
            }
            function03 = function0;
            i16 = i12 & 64;
            if (i16 == 0) {
            }
            function04 = function02;
            if ((599187 & i13) != 599186) {
            }
            if (i17 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            int i18222 = i13 & 4194302;
            C6041S c6041s4222 = c6041s2;
            e eVar5222 = eVar4;
            DsTooltipAtomWithPopupProvider(dto, eVar5222, popupPositionProvider, beakOffset, c6041s4222, function08, function05, u11, i18222);
            eVar3 = eVar5222;
            c3969l = u11;
            function06 = function05;
            function07 = function08;
            c6041s3 = c6041s4222;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        if ((i12 & 4) == 0) {
        }
        if ((i12 & 8) == 0) {
        }
        i14 = i12 & 16;
        if (i14 == 0) {
        }
        c6041s2 = c6041s;
        i15 = i12 & 32;
        if (i15 != 0) {
        }
        function03 = function0;
        i16 = i12 & 64;
        if (i16 == 0) {
        }
        function04 = function02;
        if ((599187 & i13) != 599186) {
        }
        if (i17 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        int i182222 = i13 & 4194302;
        C6041S c6041s42222 = c6041s2;
        e eVar52222 = eVar4;
        DsTooltipAtomWithPopupProvider(dto, eVar52222, popupPositionProvider, beakOffset, c6041s42222, function08, function05, u11, i182222);
        eVar3 = eVar52222;
        c3969l = u11;
        function06 = function05;
        function07 = function08;
        c6041s3 = c6041s42222;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }
}
