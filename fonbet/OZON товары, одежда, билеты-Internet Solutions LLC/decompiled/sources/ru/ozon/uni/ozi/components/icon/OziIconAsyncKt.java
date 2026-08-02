package ru.ozon.uni.ozi.components.icon;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import T7.E;
import U7.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6981a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.core.compose.tokens.UniPaddings;
import ru.ozon.uni.core.compose.tokens.UniRadii;
import ru.ozon.uni.core.compose.tokens.UniResourceIcons;
import ru.ozon.uni.foundation.components.image.FoundationImageKt;
import ru.ozon.uni.ozi.components.icon.presets.IconContent;
import ru.ozon.uni.ozi.components.icon.presets.OziIconBorder;
import ru.ozon.uni.ozi.components.icon.presets.OziIconShape;
import ru.ozon.uni.ozi.components.icon.presets.OziIconSize;
import ru.ozon.uni.ozi.theme.OziTheme;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001ay\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/ozi/components/icon/OziIconState;", "state", "Lq1/b;", "graphic", "Landroidx/compose/ui/e;", "modifier", "backgroundImage", "Lru/ozon/uni/ozi/components/icon/presets/OziIconShape;", "shape", "Lru/ozon/uni/ozi/components/icon/presets/OziIconBorder;", "border", "", "hasParanja", "Ll1/Z;", "graphicColor", "backgroundColor", "Lru/ozon/uni/ozi/components/icon/presets/OziIconSize;", "size", "", "OziIconAsync-Z1i1KaA", "(Lru/ozon/uni/ozi/components/icon/OziIconState;Lq1/b;Landroidx/compose/ui/e;Lq1/b;Lru/ozon/uni/ozi/components/icon/presets/OziIconShape;Lru/ozon/uni/ozi/components/icon/presets/OziIconBorder;ZLl1/Z;Ll1/Z;Lru/ozon/uni/ozi/components/icon/presets/OziIconSize;LS0/k;II)V", "OziIconAsync", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziIconAsyncKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OziIconState.values().length];
            try {
                iArr[OziIconState.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OziIconState.Empty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OziIconState.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018d  */
    /* renamed from: OziIconAsync-Z1i1KaA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3083OziIconAsyncZ1i1KaA(@NotNull OziIconState state, AbstractC8972b abstractC8972b, e eVar, AbstractC8972b abstractC8972b2, OziIconShape oziIconShape, OziIconBorder oziIconBorder, boolean z11, C7807Z c7807z, C7807Z c7807z2, OziIconSize oziIconSize, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        AbstractC8972b abstractC8972b3;
        int i15;
        OziIconShape oziIconShape2;
        int i16;
        OziIconBorder oziIconBorder2;
        int i17;
        int i18;
        int i19;
        int i21;
        e eVar3;
        C7807Z c7807z3;
        C7807Z c7807z4;
        OziIconShape oziIconShape3;
        int i22;
        OziIconSize oziIconSize2;
        boolean z12;
        AbstractC8972b abstractC8972b4;
        C7807Z c7807z5;
        OziIconBorder oziIconBorder3;
        boolean z13;
        int I11;
        C3969l c3969l;
        e a11;
        int i23;
        OziIconShape oziIconShape4;
        OziIconSize oziIconSize3;
        C3969l c3969l2;
        C7807Z c7807z6;
        OziIconShape oziIconShape5;
        OziIconBorder oziIconBorder4;
        boolean z14;
        OziIconSize oziIconSize4;
        AbstractC8972b abstractC8972b5;
        C7807Z c7807z7;
        J0 m02;
        int i24;
        int i25;
        Intrinsics.checkNotNullParameter(state, "state");
        C3969l u11 = interfaceC3967k.u(640729432);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(abstractC8972b) ? 32 : 16;
        }
        int i26 = i12 & 4;
        if (i26 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                abstractC8972b3 = abstractC8972b2;
                i13 |= u11.n(abstractC8972b3) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                i15 = i12 & 16;
                if (i15 != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    oziIconShape2 = oziIconShape;
                    i13 |= u11.n(oziIconShape2) ? 16384 : 8192;
                    i16 = i12 & 32;
                    if (i16 == 0) {
                        i13 |= 196608;
                    } else if ((196608 & i11) == 0) {
                        oziIconBorder2 = oziIconBorder;
                        i13 |= u11.n(oziIconBorder2) ? 131072 : 65536;
                        i17 = i12 & 64;
                        if (i17 != 0) {
                            i13 |= 1572864;
                        } else if ((i11 & 1572864) == 0) {
                            i13 |= u11.p(z11) ? 1048576 : 524288;
                        }
                        if ((i11 & 12582912) == 0) {
                            int i27 = i13;
                            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 && u11.n(c7807z)) {
                                i25 = 8388608;
                                i18 = i27 | i25;
                            }
                            i25 = 4194304;
                            i18 = i27 | i25;
                        } else {
                            i18 = i13;
                        }
                        if ((i11 & 100663296) == 0) {
                            if ((i12 & 256) == 0 && u11.n(c7807z2)) {
                                i24 = 67108864;
                                i18 |= i24;
                            }
                            i24 = 33554432;
                            i18 |= i24;
                        }
                        i19 = i12 & UserVerificationMethods.USER_VERIFY_NONE;
                        if (i19 != 0) {
                            i18 |= 805306368;
                        } else if ((i11 & 805306368) == 0) {
                            i21 = i19;
                            i18 |= u11.n(oziIconSize) ? 536870912 : 268435456;
                            if ((i18 & 306783379) == 306783378 || !u11.b()) {
                                u11.Q0();
                                DefaultConstructorMarker defaultConstructorMarker = null;
                                if ((i11 & 1) != 0 || u11.w0()) {
                                    eVar3 = i26 == 0 ? e.f40358c0 : eVar2;
                                    if (i14 != 0) {
                                        abstractC8972b3 = null;
                                    }
                                    OziIconShape oziIconShape6 = i15 == 0 ? OziIconShape.Squircle : oziIconShape2;
                                    if (i16 != 0) {
                                        oziIconBorder2 = null;
                                    }
                                    boolean z15 = i17 == 0 ? false : z11;
                                    if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                                        c7807z3 = C7807Z.m(OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getGraphicPrimary());
                                        i18 &= -29360129;
                                    } else {
                                        c7807z3 = c7807z;
                                    }
                                    if ((i12 & 256) == 0) {
                                        c7807z4 = C7807Z.m(OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getBgSecondaryTransparent());
                                        i18 &= -234881025;
                                    } else {
                                        c7807z4 = c7807z2;
                                    }
                                    if (i21 == 0) {
                                        int i28 = i18;
                                        oziIconShape3 = oziIconShape6;
                                        i22 = i28;
                                        z12 = z15;
                                        abstractC8972b4 = abstractC8972b3;
                                        c7807z5 = c7807z4;
                                        oziIconSize2 = OziIconSize.Size500;
                                    } else {
                                        int i29 = i18;
                                        oziIconShape3 = oziIconShape6;
                                        i22 = i29;
                                        oziIconSize2 = oziIconSize;
                                        z12 = z15;
                                        abstractC8972b4 = abstractC8972b3;
                                        c7807z5 = c7807z4;
                                    }
                                    oziIconBorder3 = oziIconBorder2;
                                    z13 = false;
                                } else {
                                    u11.j();
                                    if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                        i18 &= -29360129;
                                    }
                                    if ((i12 & 256) != 0) {
                                        i18 &= -234881025;
                                    }
                                    z12 = z11;
                                    c7807z3 = c7807z;
                                    c7807z5 = c7807z2;
                                    oziIconSize2 = oziIconSize;
                                    eVar3 = eVar2;
                                    abstractC8972b4 = abstractC8972b3;
                                    oziIconBorder3 = oziIconBorder2;
                                    i22 = i18;
                                    z13 = false;
                                    oziIconShape3 = oziIconShape2;
                                }
                                u11.j0();
                                int i31 = i22 >> 6;
                                V f7 = C5185h.f(InterfaceC6250b.a.o(), z13);
                                I11 = u11.I();
                                A0 d11 = u11.d();
                                e f11 = c.f(u11, eVar3);
                                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                                if (u11.t()) {
                                    u11.e();
                                } else {
                                    u11.H(a12);
                                }
                                Function2 f12 = E.f(u11, f7, u11, d11);
                                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                    a.d(I11, u11, I11, f12);
                                }
                                i.b(u11, f11, -2129553861);
                                e.a aVar = e.f40358c0;
                                u11.o(-2129553313);
                                if (state != OziIconState.Default) {
                                    a11 = OziTestTagsKt.oziTestTag(aVar, OziIconTestTags.Container, null, u11, 48, 2);
                                    c3969l = u11;
                                } else {
                                    c3969l = u11;
                                    a11 = C6981a.a(aVar, 0.0f);
                                }
                                e eVar4 = a11;
                                c3969l.k();
                                c3969l.k();
                                int i32 = i22 >> 3;
                                int i33 = i32 & 7168;
                                int i34 = 57344 & i32;
                                int i35 = i32 & 458752;
                                int i36 = (i32 & 524160) | (i31 & 3670016);
                                int i37 = i31 & 29360128;
                                OziIconKt.m3085OziIconImplPIknLig(eVar4, new IconContent.Graphic(abstractC8972b, c7807z3 == null ? c7807z3.w() : C7807Z.f72259m, defaultConstructorMarker), abstractC8972b4, oziIconShape3, oziIconBorder3, z12, c7807z5, oziIconSize2, c3969l, i36 | i37);
                                AbstractC8972b abstractC8972b6 = abstractC8972b4;
                                OziIconShape oziIconShape7 = oziIconShape3;
                                C7807Z c7807z8 = c7807z5;
                                OziIconSize oziIconSize5 = oziIconSize2;
                                C3969l c3969l3 = c3969l;
                                i23 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                                if (i23 != 1) {
                                    oziIconShape4 = oziIconShape7;
                                    oziIconSize3 = oziIconSize5;
                                    c3969l3.o(-2129538132);
                                    c3969l3.k();
                                } else if (i23 == 2) {
                                    c3969l3.o(-2129536480);
                                    e oziTestTag = OziTestTagsKt.oziTestTag(aVar, OziIconTestTags.EmptyIcon, null, c3969l3, 54, 2);
                                    oziIconSize3 = oziIconSize5;
                                    OziTheme oziTheme = OziTheme.INSTANCE;
                                    oziTheme.getIcons();
                                    c3969l3.B(1418995443);
                                    AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_gallery_filled, "ic_m_gallery_filled", c3969l3, 48);
                                    c3969l3.K();
                                    int i38 = UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable;
                                    oziIconShape4 = oziIconShape7;
                                    OziIconKt.m3085OziIconImplPIknLig(oziTestTag, new IconContent.Graphic(uniPainterResource, oziTheme.getColors(c3969l3, i38).getGraphicQuaternaryTransparent(), null), null, oziIconShape4, oziIconBorder3, z12, C7807Z.m(oziTheme.getColors(c3969l3, i38).getBgSecondaryTransparent()), oziIconSize3, c3969l3, i33 | 384 | i34 | i35 | i37);
                                    c3969l3.k();
                                } else {
                                    if (i23 != 3) {
                                        c3969l3.o(-2129538657);
                                        c3969l3.k();
                                        throw new o();
                                    }
                                    c3969l3.o(-2129519412);
                                    FoundationImageKt.m3000FoundationLoadingImageWqkqGGM(a0.n(OziTestTagsKt.oziTestTag(aVar, OziIconTestTags.Shimmer, null, c3969l3, 54, 2), oziIconSize5.getShapeSize()), 1.0f, OziTheme.INSTANCE.getColors(c3969l3, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getLayerSurfaceTransparent(), oziIconSize5.m3092getCornerRadiusu2uoSUM$uni_release(oziIconShape7), oziIconSize5.getShapeSize() / 2, c3969l3, 48);
                                    c3969l3.k();
                                    oziIconShape4 = oziIconShape7;
                                    oziIconSize3 = oziIconSize5;
                                }
                                c3969l3.f();
                                c3969l2 = c3969l3;
                                c7807z6 = c7807z3;
                                oziIconShape5 = oziIconShape4;
                                oziIconBorder4 = oziIconBorder3;
                                z14 = z12;
                                oziIconSize4 = oziIconSize3;
                                abstractC8972b5 = abstractC8972b6;
                                c7807z7 = c7807z8;
                            } else {
                                u11.j();
                                z14 = z11;
                                c7807z7 = c7807z2;
                                c3969l2 = u11;
                                eVar3 = eVar2;
                                abstractC8972b5 = abstractC8972b3;
                                oziIconShape5 = oziIconShape2;
                                oziIconBorder4 = oziIconBorder2;
                                c7807z6 = c7807z;
                                oziIconSize4 = oziIconSize;
                            }
                            m02 = c3969l2.m0();
                            if (m02 == null) {
                                m02.G(new OziIconAsyncKt$OziIconAsync$2(state, abstractC8972b, eVar3, abstractC8972b5, oziIconShape5, oziIconBorder4, z14, c7807z6, c7807z7, oziIconSize4, i11, i12));
                                return;
                            }
                            return;
                        }
                        i21 = i19;
                        if ((i18 & 306783379) == 306783378) {
                        }
                        u11.Q0();
                        DefaultConstructorMarker defaultConstructorMarker2 = null;
                        if ((i11 & 1) != 0) {
                        }
                        if (i26 == 0) {
                        }
                        if (i14 != 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i17 == 0) {
                        }
                        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                        }
                        if ((i12 & 256) == 0) {
                        }
                        if (i21 == 0) {
                        }
                        oziIconBorder3 = oziIconBorder2;
                        z13 = false;
                        u11.j0();
                        int i312 = i22 >> 6;
                        V f72 = C5185h.f(InterfaceC6250b.a.o(), z13);
                        I11 = u11.I();
                        A0 d112 = u11.d();
                        e f112 = c.f(u11, eVar3);
                        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                        }
                        Function2 f122 = E.f(u11, f72, u11, d112);
                        if (!u11.t()) {
                        }
                        a.d(I11, u11, I11, f122);
                        i.b(u11, f112, -2129553861);
                        e.a aVar2 = e.f40358c0;
                        u11.o(-2129553313);
                        if (state != OziIconState.Default) {
                        }
                        e eVar42 = a11;
                        c3969l.k();
                        c3969l.k();
                        int i322 = i22 >> 3;
                        int i332 = i322 & 7168;
                        int i342 = 57344 & i322;
                        int i352 = i322 & 458752;
                        int i362 = (i322 & 524160) | (i312 & 3670016);
                        int i372 = i312 & 29360128;
                        OziIconKt.m3085OziIconImplPIknLig(eVar42, new IconContent.Graphic(abstractC8972b, c7807z3 == null ? c7807z3.w() : C7807Z.f72259m, defaultConstructorMarker2), abstractC8972b4, oziIconShape3, oziIconBorder3, z12, c7807z5, oziIconSize2, c3969l, i362 | i372);
                        AbstractC8972b abstractC8972b62 = abstractC8972b4;
                        OziIconShape oziIconShape72 = oziIconShape3;
                        C7807Z c7807z82 = c7807z5;
                        OziIconSize oziIconSize52 = oziIconSize2;
                        C3969l c3969l32 = c3969l;
                        i23 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                        if (i23 != 1) {
                        }
                        c3969l32.f();
                        c3969l2 = c3969l32;
                        c7807z6 = c7807z3;
                        oziIconShape5 = oziIconShape4;
                        oziIconBorder4 = oziIconBorder3;
                        z14 = z12;
                        oziIconSize4 = oziIconSize3;
                        abstractC8972b5 = abstractC8972b62;
                        c7807z7 = c7807z82;
                        m02 = c3969l2.m0();
                        if (m02 == null) {
                        }
                    }
                    oziIconBorder2 = oziIconBorder;
                    i17 = i12 & 64;
                    if (i17 != 0) {
                    }
                    if ((i11 & 12582912) == 0) {
                    }
                    if ((i11 & 100663296) == 0) {
                    }
                    i19 = i12 & UserVerificationMethods.USER_VERIFY_NONE;
                    if (i19 != 0) {
                    }
                    i21 = i19;
                    if ((i18 & 306783379) == 306783378) {
                    }
                    u11.Q0();
                    DefaultConstructorMarker defaultConstructorMarker22 = null;
                    if ((i11 & 1) != 0) {
                    }
                    if (i26 == 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 == 0) {
                    }
                    if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                    }
                    if ((i12 & 256) == 0) {
                    }
                    if (i21 == 0) {
                    }
                    oziIconBorder3 = oziIconBorder2;
                    z13 = false;
                    u11.j0();
                    int i3122 = i22 >> 6;
                    V f722 = C5185h.f(InterfaceC6250b.a.o(), z13);
                    I11 = u11.I();
                    A0 d1122 = u11.d();
                    e f1122 = c.f(u11, eVar3);
                    Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 f1222 = E.f(u11, f722, u11, d1122);
                    if (!u11.t()) {
                    }
                    a.d(I11, u11, I11, f1222);
                    i.b(u11, f1122, -2129553861);
                    e.a aVar22 = e.f40358c0;
                    u11.o(-2129553313);
                    if (state != OziIconState.Default) {
                    }
                    e eVar422 = a11;
                    c3969l.k();
                    c3969l.k();
                    int i3222 = i22 >> 3;
                    int i3322 = i3222 & 7168;
                    int i3422 = 57344 & i3222;
                    int i3522 = i3222 & 458752;
                    int i3622 = (i3222 & 524160) | (i3122 & 3670016);
                    int i3722 = i3122 & 29360128;
                    OziIconKt.m3085OziIconImplPIknLig(eVar422, new IconContent.Graphic(abstractC8972b, c7807z3 == null ? c7807z3.w() : C7807Z.f72259m, defaultConstructorMarker22), abstractC8972b4, oziIconShape3, oziIconBorder3, z12, c7807z5, oziIconSize2, c3969l, i3622 | i3722);
                    AbstractC8972b abstractC8972b622 = abstractC8972b4;
                    OziIconShape oziIconShape722 = oziIconShape3;
                    C7807Z c7807z822 = c7807z5;
                    OziIconSize oziIconSize522 = oziIconSize2;
                    C3969l c3969l322 = c3969l;
                    i23 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                    if (i23 != 1) {
                    }
                    c3969l322.f();
                    c3969l2 = c3969l322;
                    c7807z6 = c7807z3;
                    oziIconShape5 = oziIconShape4;
                    oziIconBorder4 = oziIconBorder3;
                    z14 = z12;
                    oziIconSize4 = oziIconSize3;
                    abstractC8972b5 = abstractC8972b622;
                    c7807z7 = c7807z822;
                    m02 = c3969l2.m0();
                    if (m02 == null) {
                    }
                }
                oziIconShape2 = oziIconShape;
                i16 = i12 & 32;
                if (i16 == 0) {
                }
                oziIconBorder2 = oziIconBorder;
                i17 = i12 & 64;
                if (i17 != 0) {
                }
                if ((i11 & 12582912) == 0) {
                }
                if ((i11 & 100663296) == 0) {
                }
                i19 = i12 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i19 != 0) {
                }
                i21 = i19;
                if ((i18 & 306783379) == 306783378) {
                }
                u11.Q0();
                DefaultConstructorMarker defaultConstructorMarker222 = null;
                if ((i11 & 1) != 0) {
                }
                if (i26 == 0) {
                }
                if (i14 != 0) {
                }
                if (i15 == 0) {
                }
                if (i16 != 0) {
                }
                if (i17 == 0) {
                }
                if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                }
                if ((i12 & 256) == 0) {
                }
                if (i21 == 0) {
                }
                oziIconBorder3 = oziIconBorder2;
                z13 = false;
                u11.j0();
                int i31222 = i22 >> 6;
                V f7222 = C5185h.f(InterfaceC6250b.a.o(), z13);
                I11 = u11.I();
                A0 d11222 = u11.d();
                e f11222 = c.f(u11, eVar3);
                Function0 a12222 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 f12222 = E.f(u11, f7222, u11, d11222);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, f12222);
                i.b(u11, f11222, -2129553861);
                e.a aVar222 = e.f40358c0;
                u11.o(-2129553313);
                if (state != OziIconState.Default) {
                }
                e eVar4222 = a11;
                c3969l.k();
                c3969l.k();
                int i32222 = i22 >> 3;
                int i33222 = i32222 & 7168;
                int i34222 = 57344 & i32222;
                int i35222 = i32222 & 458752;
                int i36222 = (i32222 & 524160) | (i31222 & 3670016);
                int i37222 = i31222 & 29360128;
                OziIconKt.m3085OziIconImplPIknLig(eVar4222, new IconContent.Graphic(abstractC8972b, c7807z3 == null ? c7807z3.w() : C7807Z.f72259m, defaultConstructorMarker222), abstractC8972b4, oziIconShape3, oziIconBorder3, z12, c7807z5, oziIconSize2, c3969l, i36222 | i37222);
                AbstractC8972b abstractC8972b6222 = abstractC8972b4;
                OziIconShape oziIconShape7222 = oziIconShape3;
                C7807Z c7807z8222 = c7807z5;
                OziIconSize oziIconSize5222 = oziIconSize2;
                C3969l c3969l3222 = c3969l;
                i23 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i23 != 1) {
                }
                c3969l3222.f();
                c3969l2 = c3969l3222;
                c7807z6 = c7807z3;
                oziIconShape5 = oziIconShape4;
                oziIconBorder4 = oziIconBorder3;
                z14 = z12;
                oziIconSize4 = oziIconSize3;
                abstractC8972b5 = abstractC8972b6222;
                c7807z7 = c7807z8222;
                m02 = c3969l2.m0();
                if (m02 == null) {
                }
            }
            abstractC8972b3 = abstractC8972b2;
            i15 = i12 & 16;
            if (i15 != 0) {
            }
            oziIconShape2 = oziIconShape;
            i16 = i12 & 32;
            if (i16 == 0) {
            }
            oziIconBorder2 = oziIconBorder;
            i17 = i12 & 64;
            if (i17 != 0) {
            }
            if ((i11 & 12582912) == 0) {
            }
            if ((i11 & 100663296) == 0) {
            }
            i19 = i12 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i19 != 0) {
            }
            i21 = i19;
            if ((i18 & 306783379) == 306783378) {
            }
            u11.Q0();
            DefaultConstructorMarker defaultConstructorMarker2222 = null;
            if ((i11 & 1) != 0) {
            }
            if (i26 == 0) {
            }
            if (i14 != 0) {
            }
            if (i15 == 0) {
            }
            if (i16 != 0) {
            }
            if (i17 == 0) {
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
            }
            if ((i12 & 256) == 0) {
            }
            if (i21 == 0) {
            }
            oziIconBorder3 = oziIconBorder2;
            z13 = false;
            u11.j0();
            int i312222 = i22 >> 6;
            V f72222 = C5185h.f(InterfaceC6250b.a.o(), z13);
            I11 = u11.I();
            A0 d112222 = u11.d();
            e f112222 = c.f(u11, eVar3);
            Function0 a122222 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f122222 = E.f(u11, f72222, u11, d112222);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f122222);
            i.b(u11, f112222, -2129553861);
            e.a aVar2222 = e.f40358c0;
            u11.o(-2129553313);
            if (state != OziIconState.Default) {
            }
            e eVar42222 = a11;
            c3969l.k();
            c3969l.k();
            int i322222 = i22 >> 3;
            int i332222 = i322222 & 7168;
            int i342222 = 57344 & i322222;
            int i352222 = i322222 & 458752;
            int i362222 = (i322222 & 524160) | (i312222 & 3670016);
            int i372222 = i312222 & 29360128;
            OziIconKt.m3085OziIconImplPIknLig(eVar42222, new IconContent.Graphic(abstractC8972b, c7807z3 == null ? c7807z3.w() : C7807Z.f72259m, defaultConstructorMarker2222), abstractC8972b4, oziIconShape3, oziIconBorder3, z12, c7807z5, oziIconSize2, c3969l, i362222 | i372222);
            AbstractC8972b abstractC8972b62222 = abstractC8972b4;
            OziIconShape oziIconShape72222 = oziIconShape3;
            C7807Z c7807z82222 = c7807z5;
            OziIconSize oziIconSize52222 = oziIconSize2;
            C3969l c3969l32222 = c3969l;
            i23 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i23 != 1) {
            }
            c3969l32222.f();
            c3969l2 = c3969l32222;
            c7807z6 = c7807z3;
            oziIconShape5 = oziIconShape4;
            oziIconBorder4 = oziIconBorder3;
            z14 = z12;
            oziIconSize4 = oziIconSize3;
            abstractC8972b5 = abstractC8972b62222;
            c7807z7 = c7807z82222;
            m02 = c3969l2.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        abstractC8972b3 = abstractC8972b2;
        i15 = i12 & 16;
        if (i15 != 0) {
        }
        oziIconShape2 = oziIconShape;
        i16 = i12 & 32;
        if (i16 == 0) {
        }
        oziIconBorder2 = oziIconBorder;
        i17 = i12 & 64;
        if (i17 != 0) {
        }
        if ((i11 & 12582912) == 0) {
        }
        if ((i11 & 100663296) == 0) {
        }
        i19 = i12 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i19 != 0) {
        }
        i21 = i19;
        if ((i18 & 306783379) == 306783378) {
        }
        u11.Q0();
        DefaultConstructorMarker defaultConstructorMarker22222 = null;
        if ((i11 & 1) != 0) {
        }
        if (i26 == 0) {
        }
        if (i14 != 0) {
        }
        if (i15 == 0) {
        }
        if (i16 != 0) {
        }
        if (i17 == 0) {
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
        }
        if ((i12 & 256) == 0) {
        }
        if (i21 == 0) {
        }
        oziIconBorder3 = oziIconBorder2;
        z13 = false;
        u11.j0();
        int i3122222 = i22 >> 6;
        V f722222 = C5185h.f(InterfaceC6250b.a.o(), z13);
        I11 = u11.I();
        A0 d1122222 = u11.d();
        e f1122222 = c.f(u11, eVar3);
        Function0 a1222222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f1222222 = E.f(u11, f722222, u11, d1122222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f1222222);
        i.b(u11, f1122222, -2129553861);
        e.a aVar22222 = e.f40358c0;
        u11.o(-2129553313);
        if (state != OziIconState.Default) {
        }
        e eVar422222 = a11;
        c3969l.k();
        c3969l.k();
        int i3222222 = i22 >> 3;
        int i3322222 = i3222222 & 7168;
        int i3422222 = 57344 & i3222222;
        int i3522222 = i3222222 & 458752;
        int i3622222 = (i3222222 & 524160) | (i3122222 & 3670016);
        int i3722222 = i3122222 & 29360128;
        OziIconKt.m3085OziIconImplPIknLig(eVar422222, new IconContent.Graphic(abstractC8972b, c7807z3 == null ? c7807z3.w() : C7807Z.f72259m, defaultConstructorMarker22222), abstractC8972b4, oziIconShape3, oziIconBorder3, z12, c7807z5, oziIconSize2, c3969l, i3622222 | i3722222);
        AbstractC8972b abstractC8972b622222 = abstractC8972b4;
        OziIconShape oziIconShape722222 = oziIconShape3;
        C7807Z c7807z822222 = c7807z5;
        OziIconSize oziIconSize522222 = oziIconSize2;
        C3969l c3969l322222 = c3969l;
        i23 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i23 != 1) {
        }
        c3969l322222.f();
        c3969l2 = c3969l322222;
        c7807z6 = c7807z3;
        oziIconShape5 = oziIconShape4;
        oziIconBorder4 = oziIconBorder3;
        z14 = z12;
        oziIconSize4 = oziIconSize3;
        abstractC8972b5 = abstractC8972b622222;
        c7807z7 = c7807z822222;
        m02 = c3969l2.m0();
        if (m02 == null) {
        }
    }
}
