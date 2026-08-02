package ru.ozon.uni.ozi.components.notificationBar;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import l1.C7807Z;
import q1.AbstractC8972b;
import ru.ozon.uni.core.compose.tokens.UniPaddings;
import ru.ozon.uni.core.compose.tokens.UniRadii;
import ru.ozon.uni.core.compose.tokens.UniResourceIcons;
import ru.ozon.uni.ozi.components.icon.OziIconAsyncKt;
import ru.ozon.uni.ozi.components.icon.OziIconKt;
import ru.ozon.uni.ozi.components.icon.OziIconState;
import ru.ozon.uni.ozi.components.icon.presets.OziIconBorder;
import ru.ozon.uni.ozi.components.icon.presets.OziIconShape;
import ru.ozon.uni.ozi.components.icon.presets.OziIconSize;
import ru.ozon.uni.ozi.theme.OziTheme;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u007f\u0010\u001a\u001a\u00020\u00172\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/uni/ozi/components/notificationBar/OziNotificationBarIconScope;", "", "", "iconBackgroundImage", "<init>", "(I)V", "Lq1/b;", "graphic", "Landroidx/compose/ui/e;", "modifier", "Lru/ozon/uni/ozi/components/icon/OziIconState;", "state", "backgroundImage", "Lru/ozon/uni/ozi/components/icon/presets/OziIconShape;", "shape", "Lru/ozon/uni/ozi/components/icon/presets/OziIconBorder;", "border", "", "showBackgroundImage", "hasParanja", "Ll1/Z;", "graphicColor", "backgroundColor", "", "OziNotificationBarIcon-R_BKmV8", "(Lq1/b;Landroidx/compose/ui/e;Lru/ozon/uni/ozi/components/icon/OziIconState;Lq1/b;Lru/ozon/uni/ozi/components/icon/presets/OziIconShape;Lru/ozon/uni/ozi/components/icon/presets/OziIconBorder;ZZLl1/Z;Ll1/Z;LS0/k;III)V", "OziNotificationBarIcon", "I", "getIconBackgroundImage$uni_release", "()I", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziNotificationBarIconScope {
    private final int iconBackgroundImage;

    public OziNotificationBarIconScope(int i11) {
        this.iconBackgroundImage = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ce  */
    /* renamed from: OziNotificationBarIcon-R_BKmV8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3122OziNotificationBarIconR_BKmV8(AbstractC8972b abstractC8972b, e eVar, OziIconState oziIconState, AbstractC8972b abstractC8972b2, OziIconShape oziIconShape, OziIconBorder oziIconBorder, boolean z11, boolean z12, C7807Z c7807z, C7807Z c7807z2, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        e eVar2;
        int i15;
        OziIconState oziIconState2;
        int i16;
        AbstractC8972b abstractC8972b3;
        int i17;
        OziIconShape oziIconShape2;
        int i18;
        int i19;
        boolean z13;
        int i21;
        int i22;
        int i23;
        OziIconShape oziIconShape3;
        C7807Z c7807z3;
        e eVar3;
        OziIconBorder oziIconBorder2;
        OziIconState oziIconState3;
        C7807Z c7807z4;
        int i24;
        AbstractC8972b abstractC8972b4;
        C7807Z c7807z5;
        boolean z14;
        OziIconState oziIconState4;
        boolean z15;
        C7807Z c7807z6;
        C7807Z c7807z7;
        C3969l c3969l;
        OziIconShape oziIconShape4;
        boolean z16;
        OziIconState oziIconState5;
        AbstractC8972b abstractC8972b5;
        e eVar4;
        OziIconShape oziIconShape5;
        OziIconBorder oziIconBorder3;
        boolean z17;
        C7807Z c7807z8;
        C7807Z c7807z9;
        J0 m02;
        int i25;
        int i26;
        C3969l u11 = interfaceC3967k.u(-595932494);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (u11.n(abstractC8972b) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        int i27 = i13 & 2;
        if (i27 != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i14 |= u11.n(eVar2) ? 32 : 16;
            i15 = i13 & 4;
            if (i15 == 0) {
                i14 |= 384;
            } else if ((i11 & 384) == 0) {
                oziIconState2 = oziIconState;
                i14 |= u11.n(oziIconState2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i16 = i13 & 8;
                if (i16 != 0) {
                    i14 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    abstractC8972b3 = abstractC8972b2;
                    i14 |= u11.n(abstractC8972b3) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    i17 = i13 & 16;
                    if (i17 == 0) {
                        i14 |= 24576;
                    } else if ((i11 & 24576) == 0) {
                        oziIconShape2 = oziIconShape;
                        i14 |= u11.n(oziIconShape2) ? 16384 : 8192;
                        i18 = i13 & 32;
                        if (i18 != 0) {
                            i14 |= 196608;
                        } else if ((i11 & 196608) == 0) {
                            i14 |= u11.n(oziIconBorder) ? 131072 : 65536;
                        }
                        i19 = i13 & 64;
                        if (i19 != 0) {
                            i14 |= 1572864;
                            z13 = z11;
                        } else {
                            z13 = z11;
                            if ((i11 & 1572864) == 0) {
                                i14 |= u11.p(z13) ? 1048576 : 524288;
                            }
                        }
                        i21 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i21 != 0) {
                            i14 |= 12582912;
                        } else if ((i11 & 12582912) == 0) {
                            i22 = i21;
                            i14 |= u11.p(z12) ? 8388608 : 4194304;
                            if ((i11 & 100663296) == 0) {
                                if ((i13 & 256) == 0 && u11.n(c7807z)) {
                                    i26 = 67108864;
                                    i14 |= i26;
                                }
                                i26 = 33554432;
                                i14 |= i26;
                            }
                            if ((i11 & 805306368) == 0) {
                                if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0 && u11.n(c7807z2)) {
                                    i25 = 536870912;
                                    i14 |= i25;
                                }
                                i25 = 268435456;
                                i14 |= i25;
                            }
                            if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                                i23 = i12 | 6;
                            } else if ((i12 & 6) == 0) {
                                i23 = i12 | (u11.n(this) ? 4 : 2);
                            } else {
                                i23 = i12;
                            }
                            int i28 = i23;
                            if ((i14 & 306783379) != 306783378 && (i28 & 3) == 2 && u11.b()) {
                                u11.j();
                                c7807z8 = c7807z;
                                c3969l = u11;
                                z16 = z13;
                                eVar4 = eVar2;
                                oziIconState5 = oziIconState2;
                                abstractC8972b5 = abstractC8972b3;
                                oziIconShape5 = oziIconShape2;
                                oziIconBorder3 = oziIconBorder;
                                z17 = z12;
                                c7807z9 = c7807z2;
                            } else {
                                u11.Q0();
                                if ((i11 & 1) != 0 || u11.w0()) {
                                    e eVar5 = i27 == 0 ? e.f40358c0 : eVar2;
                                    if (i15 != 0) {
                                        oziIconState2 = null;
                                    }
                                    if (i16 != 0) {
                                        abstractC8972b3 = null;
                                    }
                                    oziIconShape3 = i17 == 0 ? OziIconShape.Squircle : oziIconShape2;
                                    OziIconBorder oziIconBorder4 = i18 == 0 ? null : oziIconBorder;
                                    if (i19 != 0) {
                                        z13 = true;
                                    }
                                    boolean z18 = i22 == 0 ? false : z12;
                                    if ((i13 & 256) == 0) {
                                        c7807z3 = C7807Z.m(OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getGraphicPrimary());
                                        i14 &= -234881025;
                                    } else {
                                        c7807z3 = c7807z;
                                    }
                                    if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                                        i14 &= -1879048193;
                                        eVar3 = eVar5;
                                        oziIconBorder2 = oziIconBorder4;
                                        oziIconState3 = oziIconState2;
                                        c7807z4 = c7807z3;
                                        i24 = 805306368;
                                        abstractC8972b4 = null;
                                        z14 = z18;
                                        c7807z5 = C7807Z.m(OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getBgSecondaryTransparent());
                                    } else {
                                        eVar3 = eVar5;
                                        oziIconBorder2 = oziIconBorder4;
                                        oziIconState3 = oziIconState2;
                                        c7807z4 = c7807z3;
                                        i24 = 805306368;
                                        abstractC8972b4 = null;
                                        c7807z5 = c7807z2;
                                        z14 = z18;
                                    }
                                } else {
                                    u11.j();
                                    if ((i13 & 256) != 0) {
                                        i14 &= -234881025;
                                    }
                                    if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                                        i14 &= -1879048193;
                                    }
                                    oziIconBorder2 = oziIconBorder;
                                    c7807z4 = c7807z;
                                    eVar3 = eVar2;
                                    oziIconShape3 = oziIconShape2;
                                    i24 = 805306368;
                                    abstractC8972b4 = null;
                                    z14 = z12;
                                    c7807z5 = c7807z2;
                                    oziIconState3 = oziIconState2;
                                }
                                u11.j0();
                                u11.o(-1813757951);
                                AbstractC8972b a11 = !z13 ? abstractC8972b3 == null ? G1.e.a(this.iconBackgroundImage, u11, 0) : abstractC8972b3 : abstractC8972b4;
                                u11.k();
                                if (oziIconState3 == null) {
                                    u11.o(-391746326);
                                    int i29 = i14 << 3;
                                    int i31 = i24 | ((i14 >> 6) & 14) | (i29 & 112) | (i29 & 896) | (458752 & i14);
                                    int i32 = i14 >> 3;
                                    OziIconBorder oziIconBorder5 = oziIconBorder2;
                                    OziIconAsyncKt.m3083OziIconAsyncZ1i1KaA(oziIconState3, abstractC8972b, eVar3, a11, oziIconShape3 == null ? OziIconShape.Squircle : oziIconShape3, oziIconBorder5, z14, c7807z4, c7807z5, OziIconSize.Size500, u11, i31 | (3670016 & i32) | (29360128 & i32) | (234881024 & i32), 0);
                                    oziIconState4 = oziIconState3;
                                    oziIconBorder2 = oziIconBorder5;
                                    u11.k();
                                    c3969l = u11;
                                    oziIconShape4 = oziIconShape3;
                                    z15 = z14;
                                    c7807z6 = c7807z4;
                                    c7807z7 = c7807z5;
                                } else {
                                    oziIconState4 = oziIconState3;
                                    u11.o(-391265113);
                                    z15 = z14;
                                    c7807z6 = c7807z4;
                                    c7807z7 = c7807z5;
                                    int i33 = 100663296 | (i14 & 14) | (i14 & 112);
                                    int i34 = i14 >> 3;
                                    int i35 = i14 >> 6;
                                    c3969l = u11;
                                    e eVar6 = eVar3;
                                    AbstractC8972b abstractC8972b6 = a11;
                                    oziIconShape4 = oziIconShape3;
                                    OziIconKt.m3084OziIcon42sRYA(abstractC8972b, eVar6, abstractC8972b6, oziIconShape4, oziIconBorder2, z15, c7807z6, c7807z7, OziIconSize.Size500, c3969l, i33 | (i34 & 7168) | (i34 & 57344) | (458752 & i35) | (3670016 & i35) | (29360128 & i35), 0);
                                    eVar3 = eVar6;
                                    c3969l.k();
                                }
                                z16 = z13;
                                oziIconState5 = oziIconState4;
                                abstractC8972b5 = abstractC8972b3;
                                eVar4 = eVar3;
                                oziIconShape5 = oziIconShape4;
                                oziIconBorder3 = oziIconBorder2;
                                z17 = z15;
                                c7807z8 = c7807z6;
                                c7807z9 = c7807z7;
                            }
                            m02 = c3969l.m0();
                            if (m02 == null) {
                                m02.G(new OziNotificationBarIconScope$OziNotificationBarIcon$1(this, abstractC8972b, eVar4, oziIconState5, abstractC8972b5, oziIconShape5, oziIconBorder3, z16, z17, c7807z8, c7807z9, i11, i12, i13));
                                return;
                            }
                            return;
                        }
                        i22 = i21;
                        if ((i11 & 100663296) == 0) {
                        }
                        if ((i11 & 805306368) == 0) {
                        }
                        if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                        }
                        int i282 = i23;
                        if ((i14 & 306783379) != 306783378) {
                        }
                        u11.Q0();
                        if ((i11 & 1) != 0) {
                        }
                        if (i27 == 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 != 0) {
                        }
                        if (i22 == 0) {
                        }
                        if ((i13 & 256) == 0) {
                        }
                        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                        }
                        u11.j0();
                        u11.o(-1813757951);
                        if (!z13) {
                        }
                        u11.k();
                        if (oziIconState3 == null) {
                        }
                        z16 = z13;
                        oziIconState5 = oziIconState4;
                        abstractC8972b5 = abstractC8972b3;
                        eVar4 = eVar3;
                        oziIconShape5 = oziIconShape4;
                        oziIconBorder3 = oziIconBorder2;
                        z17 = z15;
                        c7807z8 = c7807z6;
                        c7807z9 = c7807z7;
                        m02 = c3969l.m0();
                        if (m02 == null) {
                        }
                    }
                    oziIconShape2 = oziIconShape;
                    i18 = i13 & 32;
                    if (i18 != 0) {
                    }
                    i19 = i13 & 64;
                    if (i19 != 0) {
                    }
                    i21 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i21 != 0) {
                    }
                    i22 = i21;
                    if ((i11 & 100663296) == 0) {
                    }
                    if ((i11 & 805306368) == 0) {
                    }
                    if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                    }
                    int i2822 = i23;
                    if ((i14 & 306783379) != 306783378) {
                    }
                    u11.Q0();
                    if ((i11 & 1) != 0) {
                    }
                    if (i27 == 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i22 == 0) {
                    }
                    if ((i13 & 256) == 0) {
                    }
                    if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                    }
                    u11.j0();
                    u11.o(-1813757951);
                    if (!z13) {
                    }
                    u11.k();
                    if (oziIconState3 == null) {
                    }
                    z16 = z13;
                    oziIconState5 = oziIconState4;
                    abstractC8972b5 = abstractC8972b3;
                    eVar4 = eVar3;
                    oziIconShape5 = oziIconShape4;
                    oziIconBorder3 = oziIconBorder2;
                    z17 = z15;
                    c7807z8 = c7807z6;
                    c7807z9 = c7807z7;
                    m02 = c3969l.m0();
                    if (m02 == null) {
                    }
                }
                abstractC8972b3 = abstractC8972b2;
                i17 = i13 & 16;
                if (i17 == 0) {
                }
                oziIconShape2 = oziIconShape;
                i18 = i13 & 32;
                if (i18 != 0) {
                }
                i19 = i13 & 64;
                if (i19 != 0) {
                }
                i21 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i21 != 0) {
                }
                i22 = i21;
                if ((i11 & 100663296) == 0) {
                }
                if ((i11 & 805306368) == 0) {
                }
                if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                }
                int i28222 = i23;
                if ((i14 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i11 & 1) != 0) {
                }
                if (i27 == 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 != 0) {
                }
                if (i22 == 0) {
                }
                if ((i13 & 256) == 0) {
                }
                if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                }
                u11.j0();
                u11.o(-1813757951);
                if (!z13) {
                }
                u11.k();
                if (oziIconState3 == null) {
                }
                z16 = z13;
                oziIconState5 = oziIconState4;
                abstractC8972b5 = abstractC8972b3;
                eVar4 = eVar3;
                oziIconShape5 = oziIconShape4;
                oziIconBorder3 = oziIconBorder2;
                z17 = z15;
                c7807z8 = c7807z6;
                c7807z9 = c7807z7;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            oziIconState2 = oziIconState;
            i16 = i13 & 8;
            if (i16 != 0) {
            }
            abstractC8972b3 = abstractC8972b2;
            i17 = i13 & 16;
            if (i17 == 0) {
            }
            oziIconShape2 = oziIconShape;
            i18 = i13 & 32;
            if (i18 != 0) {
            }
            i19 = i13 & 64;
            if (i19 != 0) {
            }
            i21 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i21 != 0) {
            }
            i22 = i21;
            if ((i11 & 100663296) == 0) {
            }
            if ((i11 & 805306368) == 0) {
            }
            if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
            }
            int i282222 = i23;
            if ((i14 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i27 == 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 != 0) {
            }
            if (i22 == 0) {
            }
            if ((i13 & 256) == 0) {
            }
            if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
            }
            u11.j0();
            u11.o(-1813757951);
            if (!z13) {
            }
            u11.k();
            if (oziIconState3 == null) {
            }
            z16 = z13;
            oziIconState5 = oziIconState4;
            abstractC8972b5 = abstractC8972b3;
            eVar4 = eVar3;
            oziIconShape5 = oziIconShape4;
            oziIconBorder3 = oziIconBorder2;
            z17 = z15;
            c7807z8 = c7807z6;
            c7807z9 = c7807z7;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        i15 = i13 & 4;
        if (i15 == 0) {
        }
        oziIconState2 = oziIconState;
        i16 = i13 & 8;
        if (i16 != 0) {
        }
        abstractC8972b3 = abstractC8972b2;
        i17 = i13 & 16;
        if (i17 == 0) {
        }
        oziIconShape2 = oziIconShape;
        i18 = i13 & 32;
        if (i18 != 0) {
        }
        i19 = i13 & 64;
        if (i19 != 0) {
        }
        i21 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i21 != 0) {
        }
        i22 = i21;
        if ((i11 & 100663296) == 0) {
        }
        if ((i11 & 805306368) == 0) {
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
        }
        int i2822222 = i23;
        if ((i14 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i27 == 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 != 0) {
        }
        if (i22 == 0) {
        }
        if ((i13 & 256) == 0) {
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
        }
        u11.j0();
        u11.o(-1813757951);
        if (!z13) {
        }
        u11.k();
        if (oziIconState3 == null) {
        }
        z16 = z13;
        oziIconState5 = oziIconState4;
        abstractC8972b5 = abstractC8972b3;
        eVar4 = eVar3;
        oziIconShape5 = oziIconShape4;
        oziIconBorder3 = oziIconBorder2;
        z17 = z15;
        c7807z8 = c7807z6;
        c7807z9 = c7807z7;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }
}
