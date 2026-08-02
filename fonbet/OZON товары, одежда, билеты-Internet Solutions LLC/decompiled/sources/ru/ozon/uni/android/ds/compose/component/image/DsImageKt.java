package ru.ozon.uni.android.ds.compose.component.image;

import B1.InterfaceC2547p;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.foundation.components.image.FoundationImageKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a{\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lq1/b;", "painter", "Landroidx/compose/ui/e;", "modifier", "", "hasParanja", "", "aspectRatio", "Ll1/Z;", "backgroundColor", "LB1/p;", "contentScale", "LZ1/h;", "cornerRadius", "startPadding", "topPadding", "endPadding", "bottomPadding", "", "DsImage-A8mMYrQ", "(Lq1/b;Landroidx/compose/ui/e;ZFJLB1/p;FFFFFLS0/k;III)V", "DsImage", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsImageKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c5  */
    /* renamed from: DsImage-A8mMYrQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1720DsImageA8mMYrQ(@NotNull AbstractC8972b painter, e eVar, boolean z11, float f7, long j11, InterfaceC2547p interfaceC2547p, float f11, float f12, float f13, float f14, float f15, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        e eVar2;
        int i15;
        boolean z12;
        int i16;
        float f16;
        long j12;
        int i17;
        InterfaceC2547p interfaceC2547p2;
        int i18;
        float f17;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        e eVar3;
        long j13;
        InterfaceC2547p interfaceC2547p3;
        int i29;
        float f18;
        float f19;
        float f21;
        float f22;
        float f23;
        float f24;
        boolean z13;
        float f25;
        boolean z14;
        e eVar4;
        long j14;
        float f26;
        float f27;
        float f28;
        float f29;
        float f31;
        J0 m02;
        int i31;
        Intrinsics.checkNotNullParameter(painter, "painter");
        C3969l u11 = interfaceC3967k.u(-1737301259);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (u11.n(painter) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        int i32 = i13 & 2;
        if (i32 != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i14 |= u11.n(eVar2) ? 32 : 16;
            i15 = i13 & 4;
            if (i15 == 0) {
                i14 |= 384;
            } else if ((i11 & 384) == 0) {
                z12 = z11;
                i14 |= u11.p(z12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i16 = i13 & 8;
                if (i16 != 0) {
                    i14 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    f16 = f7;
                    i14 |= u11.q(f16) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    if ((i11 & 24576) != 0) {
                        if ((i13 & 16) == 0) {
                            j12 = j11;
                            if (u11.s(j12)) {
                                i31 = 16384;
                                i14 |= i31;
                            }
                        } else {
                            j12 = j11;
                        }
                        i31 = 8192;
                        i14 |= i31;
                    } else {
                        j12 = j11;
                    }
                    i17 = i13 & 32;
                    if (i17 == 0) {
                        i14 |= 196608;
                        interfaceC2547p2 = interfaceC2547p;
                    } else {
                        interfaceC2547p2 = interfaceC2547p;
                        if ((i11 & 196608) == 0) {
                            i14 |= u11.n(interfaceC2547p2) ? 131072 : 65536;
                        }
                    }
                    i18 = i13 & 64;
                    if (i18 == 0) {
                        i14 |= 1572864;
                        f17 = f11;
                    } else {
                        f17 = f11;
                        if ((i11 & 1572864) == 0) {
                            i14 |= u11.q(f17) ? 1048576 : 524288;
                        }
                    }
                    i19 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i19 == 0) {
                        i14 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        i21 = i19;
                        i14 |= u11.q(f12) ? 8388608 : 4194304;
                        i22 = i13 & 256;
                        if (i22 != 0) {
                            i14 |= 100663296;
                        } else if ((i11 & 100663296) == 0) {
                            i23 = i22;
                            i14 |= u11.q(f13) ? 67108864 : 33554432;
                            i24 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                            if (i24 == 0) {
                                i14 |= 805306368;
                            } else if ((i11 & 805306368) == 0) {
                                i25 = i24;
                                i14 |= u11.q(f14) ? 536870912 : 268435456;
                                i26 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                                if (i26 != 0) {
                                    i28 = i12 | 6;
                                    i27 = i26;
                                } else if ((i12 & 6) == 0) {
                                    i27 = i26;
                                    i28 = i12 | (u11.q(f15) ? 4 : 2);
                                } else {
                                    i27 = i26;
                                    i28 = i12;
                                }
                                if ((i14 & 306783379) != 306783378 && (i28 & 3) == 2 && u11.b()) {
                                    u11.j();
                                    f29 = f13;
                                    f26 = f17;
                                    eVar4 = eVar2;
                                    z14 = z12;
                                    j14 = j12;
                                    f27 = f12;
                                    f31 = f15;
                                    interfaceC2547p3 = interfaceC2547p2;
                                    f25 = f16;
                                    f28 = f14;
                                } else {
                                    u11.Q0();
                                    if ((i11 & 1) != 0 || u11.w0()) {
                                        eVar3 = i32 != 0 ? e.f40358c0 : eVar2;
                                        boolean z15 = i15 != 0 ? false : z12;
                                        float f32 = i16 != 0 ? 1.0f : f16;
                                        if ((i13 & 16) != 0) {
                                            j13 = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerSurface();
                                            i14 &= -57345;
                                        } else {
                                            j13 = j12;
                                        }
                                        InterfaceC2547p a11 = i17 != 0 ? InterfaceC2547p.a.a() : interfaceC2547p2;
                                        float m1838getDp0D9Ej5fM = i18 != 0 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : f17;
                                        float m1838getDp0D9Ej5fM2 = i21 != 0 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : f12;
                                        float m1838getDp0D9Ej5fM3 = i23 != 0 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : f13;
                                        float m1838getDp0D9Ej5fM4 = i25 != 0 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : f14;
                                        if (i27 != 0) {
                                            float f33 = f32;
                                            interfaceC2547p3 = a11;
                                            i29 = i14;
                                            f18 = f33;
                                            f21 = m1838getDp0D9Ej5fM3;
                                            f19 = DsSpacings.INSTANCE.m1838getDp0D9Ej5fM();
                                            f23 = m1838getDp0D9Ej5fM;
                                            z13 = z15;
                                            f22 = m1838getDp0D9Ej5fM4;
                                            f24 = m1838getDp0D9Ej5fM2;
                                        } else {
                                            float f34 = f32;
                                            interfaceC2547p3 = a11;
                                            i29 = i14;
                                            f18 = f34;
                                            f19 = f15;
                                            f21 = m1838getDp0D9Ej5fM3;
                                            f22 = m1838getDp0D9Ej5fM4;
                                            f23 = m1838getDp0D9Ej5fM;
                                            f24 = m1838getDp0D9Ej5fM2;
                                            z13 = z15;
                                        }
                                    } else {
                                        u11.j();
                                        if ((i13 & 16) != 0) {
                                            i14 &= -57345;
                                        }
                                        f19 = f15;
                                        i29 = i14;
                                        f23 = f17;
                                        eVar3 = eVar2;
                                        f18 = f16;
                                        f24 = f12;
                                        interfaceC2547p3 = interfaceC2547p2;
                                        z13 = z12;
                                        j13 = j12;
                                        f21 = f13;
                                        f22 = f14;
                                    }
                                    u11.j0();
                                    u11.o(-1267826355);
                                    long layerOverlayParanja = z13 ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerOverlayParanja() : C7807Z.f72258l;
                                    u11.k();
                                    e eVar5 = eVar3;
                                    int i33 = i29 << 3;
                                    int i34 = i29 << 6;
                                    FoundationImageKt.m2999FoundationImagejfyh3yM(eVar5, painter, "image", f18, z13, layerOverlayParanja, interfaceC2547p3, j13, f23, f24, f22, f21, f19, u11, ((i29 >> 3) & 14) | 384 | (i33 & 112) | (i29 & 7168) | (i34 & 57344) | (i33 & 3670016) | ((i29 << 9) & 29360128) | (i34 & 234881024) | (i34 & 1879048192), ((i29 >> 27) & 14) | ((i29 >> 21) & 112) | ((i28 << 6) & 896), 0);
                                    boolean z16 = z13;
                                    f25 = f18;
                                    z14 = z16;
                                    eVar4 = eVar5;
                                    j14 = j13;
                                    f26 = f23;
                                    f27 = f24;
                                    f28 = f22;
                                    f29 = f21;
                                    f31 = f19;
                                }
                                m02 = u11.m0();
                                if (m02 != null) {
                                    m02.G(new DsImageKt$DsImage$1(painter, eVar4, z14, f25, j14, interfaceC2547p3, f26, f27, f29, f28, f31, i11, i12, i13));
                                    return;
                                }
                                return;
                            }
                            i25 = i24;
                            i26 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                            if (i26 != 0) {
                            }
                            if ((i14 & 306783379) != 306783378) {
                            }
                            u11.Q0();
                            if ((i11 & 1) != 0) {
                            }
                            if (i32 != 0) {
                            }
                            if (i15 != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if ((i13 & 16) != 0) {
                            }
                            if (i17 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i21 != 0) {
                            }
                            if (i23 != 0) {
                            }
                            if (i25 != 0) {
                            }
                            if (i27 != 0) {
                            }
                            u11.j0();
                            u11.o(-1267826355);
                            if (z13) {
                            }
                            u11.k();
                            e eVar52 = eVar3;
                            int i332 = i29 << 3;
                            int i342 = i29 << 6;
                            FoundationImageKt.m2999FoundationImagejfyh3yM(eVar52, painter, "image", f18, z13, layerOverlayParanja, interfaceC2547p3, j13, f23, f24, f22, f21, f19, u11, ((i29 >> 3) & 14) | 384 | (i332 & 112) | (i29 & 7168) | (i342 & 57344) | (i332 & 3670016) | ((i29 << 9) & 29360128) | (i342 & 234881024) | (i342 & 1879048192), ((i29 >> 27) & 14) | ((i29 >> 21) & 112) | ((i28 << 6) & 896), 0);
                            boolean z162 = z13;
                            f25 = f18;
                            z14 = z162;
                            eVar4 = eVar52;
                            j14 = j13;
                            f26 = f23;
                            f27 = f24;
                            f28 = f22;
                            f29 = f21;
                            f31 = f19;
                            m02 = u11.m0();
                            if (m02 != null) {
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
                        if ((i14 & 306783379) != 306783378) {
                        }
                        u11.Q0();
                        if ((i11 & 1) != 0) {
                        }
                        if (i32 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if ((i13 & 16) != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i21 != 0) {
                        }
                        if (i23 != 0) {
                        }
                        if (i25 != 0) {
                        }
                        if (i27 != 0) {
                        }
                        u11.j0();
                        u11.o(-1267826355);
                        if (z13) {
                        }
                        u11.k();
                        e eVar522 = eVar3;
                        int i3322 = i29 << 3;
                        int i3422 = i29 << 6;
                        FoundationImageKt.m2999FoundationImagejfyh3yM(eVar522, painter, "image", f18, z13, layerOverlayParanja, interfaceC2547p3, j13, f23, f24, f22, f21, f19, u11, ((i29 >> 3) & 14) | 384 | (i3322 & 112) | (i29 & 7168) | (i3422 & 57344) | (i3322 & 3670016) | ((i29 << 9) & 29360128) | (i3422 & 234881024) | (i3422 & 1879048192), ((i29 >> 27) & 14) | ((i29 >> 21) & 112) | ((i28 << 6) & 896), 0);
                        boolean z1622 = z13;
                        f25 = f18;
                        z14 = z1622;
                        eVar4 = eVar522;
                        j14 = j13;
                        f26 = f23;
                        f27 = f24;
                        f28 = f22;
                        f29 = f21;
                        f31 = f19;
                        m02 = u11.m0();
                        if (m02 != null) {
                        }
                    }
                    i21 = i19;
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
                    if ((i14 & 306783379) != 306783378) {
                    }
                    u11.Q0();
                    if ((i11 & 1) != 0) {
                    }
                    if (i32 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if ((i13 & 16) != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i23 != 0) {
                    }
                    if (i25 != 0) {
                    }
                    if (i27 != 0) {
                    }
                    u11.j0();
                    u11.o(-1267826355);
                    if (z13) {
                    }
                    u11.k();
                    e eVar5222 = eVar3;
                    int i33222 = i29 << 3;
                    int i34222 = i29 << 6;
                    FoundationImageKt.m2999FoundationImagejfyh3yM(eVar5222, painter, "image", f18, z13, layerOverlayParanja, interfaceC2547p3, j13, f23, f24, f22, f21, f19, u11, ((i29 >> 3) & 14) | 384 | (i33222 & 112) | (i29 & 7168) | (i34222 & 57344) | (i33222 & 3670016) | ((i29 << 9) & 29360128) | (i34222 & 234881024) | (i34222 & 1879048192), ((i29 >> 27) & 14) | ((i29 >> 21) & 112) | ((i28 << 6) & 896), 0);
                    boolean z16222 = z13;
                    f25 = f18;
                    z14 = z16222;
                    eVar4 = eVar5222;
                    j14 = j13;
                    f26 = f23;
                    f27 = f24;
                    f28 = f22;
                    f29 = f21;
                    f31 = f19;
                    m02 = u11.m0();
                    if (m02 != null) {
                    }
                }
                f16 = f7;
                if ((i11 & 24576) != 0) {
                }
                i17 = i13 & 32;
                if (i17 == 0) {
                }
                i18 = i13 & 64;
                if (i18 == 0) {
                }
                i19 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i19 == 0) {
                }
                i21 = i19;
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
                if ((i14 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i11 & 1) != 0) {
                }
                if (i32 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if ((i13 & 16) != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i21 != 0) {
                }
                if (i23 != 0) {
                }
                if (i25 != 0) {
                }
                if (i27 != 0) {
                }
                u11.j0();
                u11.o(-1267826355);
                if (z13) {
                }
                u11.k();
                e eVar52222 = eVar3;
                int i332222 = i29 << 3;
                int i342222 = i29 << 6;
                FoundationImageKt.m2999FoundationImagejfyh3yM(eVar52222, painter, "image", f18, z13, layerOverlayParanja, interfaceC2547p3, j13, f23, f24, f22, f21, f19, u11, ((i29 >> 3) & 14) | 384 | (i332222 & 112) | (i29 & 7168) | (i342222 & 57344) | (i332222 & 3670016) | ((i29 << 9) & 29360128) | (i342222 & 234881024) | (i342222 & 1879048192), ((i29 >> 27) & 14) | ((i29 >> 21) & 112) | ((i28 << 6) & 896), 0);
                boolean z162222 = z13;
                f25 = f18;
                z14 = z162222;
                eVar4 = eVar52222;
                j14 = j13;
                f26 = f23;
                f27 = f24;
                f28 = f22;
                f29 = f21;
                f31 = f19;
                m02 = u11.m0();
                if (m02 != null) {
                }
            }
            z12 = z11;
            i16 = i13 & 8;
            if (i16 != 0) {
            }
            f16 = f7;
            if ((i11 & 24576) != 0) {
            }
            i17 = i13 & 32;
            if (i17 == 0) {
            }
            i18 = i13 & 64;
            if (i18 == 0) {
            }
            i19 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i19 == 0) {
            }
            i21 = i19;
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
            if ((i14 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i32 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if ((i13 & 16) != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i21 != 0) {
            }
            if (i23 != 0) {
            }
            if (i25 != 0) {
            }
            if (i27 != 0) {
            }
            u11.j0();
            u11.o(-1267826355);
            if (z13) {
            }
            u11.k();
            e eVar522222 = eVar3;
            int i3322222 = i29 << 3;
            int i3422222 = i29 << 6;
            FoundationImageKt.m2999FoundationImagejfyh3yM(eVar522222, painter, "image", f18, z13, layerOverlayParanja, interfaceC2547p3, j13, f23, f24, f22, f21, f19, u11, ((i29 >> 3) & 14) | 384 | (i3322222 & 112) | (i29 & 7168) | (i3422222 & 57344) | (i3322222 & 3670016) | ((i29 << 9) & 29360128) | (i3422222 & 234881024) | (i3422222 & 1879048192), ((i29 >> 27) & 14) | ((i29 >> 21) & 112) | ((i28 << 6) & 896), 0);
            boolean z1622222 = z13;
            f25 = f18;
            z14 = z1622222;
            eVar4 = eVar522222;
            j14 = j13;
            f26 = f23;
            f27 = f24;
            f28 = f22;
            f29 = f21;
            f31 = f19;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        i15 = i13 & 4;
        if (i15 == 0) {
        }
        z12 = z11;
        i16 = i13 & 8;
        if (i16 != 0) {
        }
        f16 = f7;
        if ((i11 & 24576) != 0) {
        }
        i17 = i13 & 32;
        if (i17 == 0) {
        }
        i18 = i13 & 64;
        if (i18 == 0) {
        }
        i19 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i19 == 0) {
        }
        i21 = i19;
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
        if ((i14 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i32 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if ((i13 & 16) != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i21 != 0) {
        }
        if (i23 != 0) {
        }
        if (i25 != 0) {
        }
        if (i27 != 0) {
        }
        u11.j0();
        u11.o(-1267826355);
        if (z13) {
        }
        u11.k();
        e eVar5222222 = eVar3;
        int i33222222 = i29 << 3;
        int i34222222 = i29 << 6;
        FoundationImageKt.m2999FoundationImagejfyh3yM(eVar5222222, painter, "image", f18, z13, layerOverlayParanja, interfaceC2547p3, j13, f23, f24, f22, f21, f19, u11, ((i29 >> 3) & 14) | 384 | (i33222222 & 112) | (i29 & 7168) | (i34222222 & 57344) | (i33222222 & 3670016) | ((i29 << 9) & 29360128) | (i34222222 & 234881024) | (i34222222 & 1879048192), ((i29 >> 27) & 14) | ((i29 >> 21) & 112) | ((i28 << 6) & 896), 0);
        boolean z16222222 = z13;
        f25 = f18;
        z14 = z16222222;
        eVar4 = eVar5222222;
        j14 = j13;
        f26 = f23;
        f27 = f24;
        f28 = f22;
        f29 = f21;
        f31 = f19;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }
}
