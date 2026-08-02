package ru.ozon.uni.foundation.components.icon;

import B1.InterfaceC2547p;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.T0;
import J0.u3;
import K1.T;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import T7.E;
import V1.h;
import V1.r;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.J0;
import n0.C8366G;
import n0.C8385f;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\u001aí\u0001\u0010'\u001a\u00020$2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\b\b\u0002\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&\u001aá\u0001\u0010*\u001a\u00020$2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\b\b\u0002\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b(\u0010)\u001aÑ\u0001\u0010-\u001a\u00020$2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\b\b\u0002\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b+\u0010,\u001ai\u00101\u001a\u00020$2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010.\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001dH\u0003¢\u0006\u0004\b/\u00100¨\u00062"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "", "isLabel", "Lq1/b;", "icon", "Ll1/Z;", "color", "Ll1/Q;", "gradientBrush", "", "text", "LK1/T;", "style", "LV1/r;", "textOverflow", "backgroundImageModifier", "paranjaModifier", "graphicModifier", "labelModifier", "backgroundImage", "Ll1/J0;", "backgroundShape", "hasParanja", "paranjaColor", "hasBorder", "backgroundColor", "backgroundBrush", "borderBrush", "LZ1/h;", "shapeSize", "contentSize", "textPadding", "borderWidth", "LB1/p;", "contentScale", "", "FoundationIcon-om_xur8", "(Landroidx/compose/ui/e;ZLq1/b;Ll1/Z;Ll1/Q;Ljava/lang/String;LK1/T;LV1/r;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Lq1/b;Ll1/J0;ZJZJLl1/Q;Ll1/Q;FFFFLB1/p;LS0/k;IIII)V", "FoundationIcon", "BorderedShapedIcon-QjgT9Vk", "(Landroidx/compose/ui/e;Ll1/Q;ZLq1/b;Ll1/Z;Ll1/Q;Ljava/lang/String;LK1/T;LV1/r;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Lq1/b;Ll1/J0;ZJJLl1/Q;FFFFLB1/p;LS0/k;IIII)V", "BorderedShapedIcon", "ShapedIcon-6hRS9go", "(Landroidx/compose/ui/e;ZLq1/b;Ll1/Z;Ll1/Q;Ljava/lang/String;LK1/T;LV1/r;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Lq1/b;Ll1/J0;ZJJLl1/Q;FFFLB1/p;LS0/k;IIII)V", "ShapedIcon", "brush", "UnshapedIcon-dE3IV7s", "(Landroidx/compose/ui/e;ZLq1/b;Ll1/Z;Ll1/Q;Ljava/lang/String;LK1/T;Landroidx/compose/ui/e;Landroidx/compose/ui/e;FLS0/k;I)V", "UnshapedIcon", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FoundationIconKt {
    /* renamed from: BorderedShapedIcon-QjgT9Vk, reason: not valid java name */
    private static final void m2990BorderedShapedIconQjgT9Vk(e eVar, AbstractC7799Q abstractC7799Q, boolean z11, AbstractC8972b abstractC8972b, C7807Z c7807z, AbstractC7799Q abstractC7799Q2, String str, T t2, r rVar, e eVar2, e eVar3, e eVar4, e eVar5, AbstractC8972b abstractC8972b2, J0 j02, boolean z12, long j11, long j12, AbstractC7799Q abstractC7799Q3, float f7, float f11, float f12, float f13, InterfaceC2547p interfaceC2547p, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13, int i14) {
        InterfaceC2547p interfaceC2547p2;
        e eVar6;
        AbstractC7799Q abstractC7799Q4;
        interfaceC3967k.o(1969731078);
        if ((i14 & 8388608) != 0) {
            interfaceC2547p2 = InterfaceC2547p.a.a();
            abstractC7799Q4 = abstractC7799Q;
            eVar6 = eVar;
        } else {
            interfaceC2547p2 = interfaceC2547p;
            eVar6 = eVar;
            abstractC7799Q4 = abstractC7799Q;
        }
        e d11 = C8385f.d(eVar6, f13, abstractC7799Q4, j02);
        float f14 = (float) 0.2d;
        if (f14 > f13) {
            f14 = f13;
        }
        m2992ShapedIcon6hRS9go(ScaledClipKt.m2996scaledClipwH6b6FI(d11, j02, f14), z11, abstractC8972b, c7807z, abstractC7799Q2, str, t2, rVar, eVar2, eVar3, eVar4, eVar5, abstractC8972b2, j02, z12, j11, j12, abstractC7799Q3, f7, f11, f12, interfaceC2547p2, interfaceC3967k, ((i11 >> 3) & 268435440) | ((i12 << 27) & 1879048192), ((i12 >> 3) & 268435454) | ((i13 << 27) & 1879048192), ((i13 >> 3) & 14) | ((i13 >> 6) & 112), 0);
        interfaceC3967k.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* renamed from: FoundationIcon-om_xur8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2991FoundationIconom_xur8(e eVar, boolean z11, AbstractC8972b abstractC8972b, C7807Z c7807z, AbstractC7799Q abstractC7799Q, String str, T t2, r rVar, @NotNull e backgroundImageModifier, @NotNull e paranjaModifier, @NotNull e graphicModifier, @NotNull e labelModifier, AbstractC8972b abstractC8972b2, J0 j02, boolean z12, long j11, boolean z13, long j12, AbstractC7799Q abstractC7799Q2, @NotNull AbstractC7799Q borderBrush, float f7, float f11, float f12, float f13, InterfaceC2547p interfaceC2547p, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13, int i14) {
        e eVar2;
        int i15;
        boolean z14;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z15;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        C3969l c3969l;
        e eVar3;
        e eVar4;
        InterfaceC2547p interfaceC2547p2;
        e eVar5;
        S0.J0 m02;
        Intrinsics.checkNotNullParameter(backgroundImageModifier, "backgroundImageModifier");
        Intrinsics.checkNotNullParameter(paranjaModifier, "paranjaModifier");
        Intrinsics.checkNotNullParameter(graphicModifier, "graphicModifier");
        Intrinsics.checkNotNullParameter(labelModifier, "labelModifier");
        Intrinsics.checkNotNullParameter(borderBrush, "borderBrush");
        C3969l u11 = interfaceC3967k.u(1475640029);
        int i27 = i14 & 1;
        if (i27 != 0) {
            i15 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i15 = i11 | (u11.n(eVar2) ? 4 : 2);
        } else {
            eVar2 = eVar;
            i15 = i11;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
            z14 = z11;
        } else {
            z14 = z11;
            if ((i11 & 48) == 0) {
                i15 |= u11.p(z14) ? 32 : 16;
            }
        }
        int i28 = i15;
        int i29 = i14 & 4;
        int i31 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i29 != 0) {
            i28 |= 384;
            i16 = i27;
        } else {
            i16 = i27;
            if ((i11 & 384) == 0) {
                i28 |= u11.n(abstractC8972b) ? 256 : 128;
                i17 = i14 & 8;
                int i32 = UserVerificationMethods.USER_VERIFY_ALL;
                if (i17 == 0) {
                    i28 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    i28 |= u11.n(c7807z) ? 2048 : 1024;
                    if ((i14 & 16) != 0) {
                        i28 |= 24576;
                    } else if ((i11 & 24576) == 0) {
                        i28 |= u11.n(abstractC7799Q) ? 16384 : 8192;
                        if ((i14 & 32) == 0) {
                            i28 |= 196608;
                        } else if ((i11 & 196608) == 0) {
                            i28 |= u11.n(str) ? 131072 : 65536;
                        }
                        if ((i14 & 64) == 0) {
                            i28 |= 1572864;
                        } else if ((i11 & 1572864) == 0) {
                            i28 |= u11.n(t2) ? 1048576 : 524288;
                        }
                        if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                            i28 |= 12582912;
                        } else if ((i11 & 12582912) == 0) {
                            i28 |= u11.n(rVar) ? 8388608 : 4194304;
                            if ((i14 & 256) != 0) {
                                i28 |= 100663296;
                            } else if ((i11 & 100663296) == 0) {
                                i28 |= u11.n(backgroundImageModifier) ? 67108864 : 33554432;
                            }
                            if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                                i28 |= 805306368;
                            } else if ((i11 & 805306368) == 0) {
                                i28 |= u11.n(paranjaModifier) ? 536870912 : 268435456;
                            }
                            if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                i18 = i12 | 6;
                            } else if ((i12 & 6) == 0) {
                                i18 = (u11.n(graphicModifier) ? 4 : 2) | i12;
                            } else {
                                i18 = i12;
                            }
                            int i33 = i18;
                            if ((i14 & 2048) != 0) {
                                i19 = i33 | 48;
                            } else if ((i12 & 48) == 0) {
                                i19 = i33 | (u11.n(labelModifier) ? 32 : 16);
                            } else {
                                i19 = i33;
                            }
                            if ((i14 & 4096) != 0) {
                                i19 |= 384;
                            } else if ((i12 & 384) == 0) {
                                i19 |= u11.n(abstractC8972b2) ? 256 : 128;
                                if ((i14 & 8192) == 0) {
                                    i19 |= 3072;
                                } else if ((i12 & 3072) == 0) {
                                    i19 |= u11.n(j02) ? 2048 : 1024;
                                }
                                if ((i14 & 16384) == 0) {
                                    i19 |= 24576;
                                } else if ((i12 & 24576) == 0) {
                                    z15 = z12;
                                    i19 |= u11.p(z15) ? 16384 : 8192;
                                    if ((i14 & 32768) != 0) {
                                        i19 |= 196608;
                                    } else if ((i12 & 196608) == 0) {
                                        i21 = i19 | (u11.s(j11) ? 131072 : 65536);
                                        if ((i14 & 65536) == 0) {
                                            i21 |= 1572864;
                                        } else if ((i12 & 1572864) == 0) {
                                            i21 |= u11.p(z13) ? 1048576 : 524288;
                                        }
                                        if ((i14 & 131072) == 0) {
                                            i21 |= 12582912;
                                        } else if ((i12 & 12582912) == 0) {
                                            i21 |= u11.s(j12) ? 8388608 : 4194304;
                                        }
                                        if ((i14 & 262144) == 0) {
                                            i21 |= 100663296;
                                        } else if ((i12 & 100663296) == 0) {
                                            i21 |= u11.n(abstractC7799Q2) ? 67108864 : 33554432;
                                        }
                                        if ((i14 & 524288) == 0) {
                                            i21 |= 805306368;
                                        } else if ((i12 & 805306368) == 0) {
                                            i21 |= u11.n(borderBrush) ? 536870912 : 268435456;
                                        }
                                        if ((i14 & 1048576) == 0) {
                                            i22 = i13 | 6;
                                        } else if ((i13 & 6) == 0) {
                                            i22 = i13 | (u11.q(f7) ? 4 : 2);
                                        } else {
                                            i22 = i13;
                                        }
                                        if ((i14 & 2097152) == 0) {
                                            i22 |= 48;
                                        } else if ((i13 & 48) == 0) {
                                            i22 |= u11.q(f11) ? 32 : 16;
                                        }
                                        int i34 = i22;
                                        if ((i14 & 4194304) == 0) {
                                            i23 = i34 | 384;
                                        } else {
                                            int i35 = i34;
                                            if ((i13 & 384) == 0) {
                                                if (u11.q(f12)) {
                                                    i31 = 256;
                                                }
                                                i35 |= i31;
                                            }
                                            i23 = i35;
                                        }
                                        if ((i14 & 8388608) == 0) {
                                            i24 = i23 | 3072;
                                        } else {
                                            int i36 = i23;
                                            if ((i13 & 3072) == 0) {
                                                if (u11.q(f13)) {
                                                    i32 = 2048;
                                                }
                                                i36 |= i32;
                                            }
                                            i24 = i36;
                                        }
                                        i25 = i14 & 16777216;
                                        if (i25 == 0) {
                                            i26 = i24 | 24576;
                                        } else {
                                            int i37 = i24;
                                            if ((i13 & 24576) == 0) {
                                                i37 |= u11.n(interfaceC2547p) ? 16384 : 8192;
                                            }
                                            i26 = i37;
                                        }
                                        if ((i28 & 306783379) != 306783378 && (i21 & 306783379) == 306783378 && (i26 & 9363) == 9362 && u11.b()) {
                                            u11.j();
                                            interfaceC2547p2 = interfaceC2547p;
                                            c3969l = u11;
                                            eVar4 = eVar2;
                                        } else {
                                            e eVar6 = i16 == 0 ? e.f40358c0 : eVar2;
                                            InterfaceC2547p a11 = i25 == 0 ? InterfaceC2547p.a.a() : interfaceC2547p;
                                            if (j02 == null) {
                                                u11.o(-1972290256);
                                                if (z13) {
                                                    u11.o(-1972297882);
                                                    int i38 = i28 << 3;
                                                    int i39 = (i28 & 14) | ((i21 >> 24) & 112) | (i38 & 896) | (i38 & 7168) | (57344 & i38) | (458752 & i38) | (i38 & 3670016) | (i38 & 29360128) | (i38 & 234881024) | (i38 & 1879048192);
                                                    int i41 = i21 << 3;
                                                    int i42 = ((i28 >> 27) & 14) | (i41 & 112) | (i41 & 896) | (i41 & 7168) | (57344 & i41) | (458752 & i41) | (i41 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | ((i26 << 27) & 1879048192);
                                                    int i43 = (i26 >> 3) & 8190;
                                                    e eVar7 = eVar6;
                                                    InterfaceC2547p interfaceC2547p3 = a11;
                                                    m2990BorderedShapedIconQjgT9Vk(eVar7, borderBrush, z14, abstractC8972b, c7807z, abstractC7799Q, str, t2, rVar, backgroundImageModifier, paranjaModifier, graphicModifier, labelModifier, abstractC8972b2, j02, z15, j11, j12, abstractC7799Q2, f7, f11, f12, f13, interfaceC2547p3, u11, i39, i42, i43, 0);
                                                    eVar5 = eVar7;
                                                    a11 = interfaceC2547p3;
                                                    c3969l = u11;
                                                    c3969l.k();
                                                } else {
                                                    u11.o(-1971200668);
                                                    int i44 = i21 >> 3;
                                                    int i45 = (i21 & 524286) | (i44 & 3670016) | (i44 & 29360128);
                                                    int i46 = i26 << 24;
                                                    int i47 = ((i26 >> 6) & 14) | ((i26 >> 9) & 112);
                                                    e eVar8 = eVar6;
                                                    m2992ShapedIcon6hRS9go(eVar8, z11, abstractC8972b, c7807z, abstractC7799Q, str, t2, rVar, backgroundImageModifier, paranjaModifier, graphicModifier, labelModifier, abstractC8972b2, j02, z12, j11, j12, abstractC7799Q2, f7, f11, f12, a11, u11, i28 & 2147483646, i45 | (i46 & 234881024) | (i46 & 1879048192), i47, 0);
                                                    eVar5 = eVar8;
                                                    c3969l = u11;
                                                    c3969l.k();
                                                }
                                                c3969l.k();
                                                eVar3 = eVar5;
                                            } else {
                                                c3969l = u11;
                                                c3969l.o(-1970207614);
                                                int i48 = i21 << 21;
                                                int i49 = (4194302 & i28) | (i48 & 29360128) | (i48 & 234881024) | ((i26 << 24) & 1879048192);
                                                eVar3 = eVar6;
                                                m2993UnshapedIcondE3IV7s(eVar3, z11, abstractC8972b, c7807z, abstractC7799Q, str, t2, graphicModifier, labelModifier, f11, c3969l, i49);
                                                c3969l.k();
                                            }
                                            eVar4 = eVar3;
                                            interfaceC2547p2 = a11;
                                        }
                                        m02 = c3969l.m0();
                                        if (m02 == null) {
                                            m02.G(new FoundationIconKt$FoundationIcon$1(eVar4, z11, abstractC8972b, c7807z, abstractC7799Q, str, t2, rVar, backgroundImageModifier, paranjaModifier, graphicModifier, labelModifier, abstractC8972b2, j02, z12, j11, z13, j12, abstractC7799Q2, borderBrush, f7, f11, f12, f13, interfaceC2547p2, i11, i12, i13, i14));
                                            return;
                                        }
                                        return;
                                    }
                                    i21 = i19;
                                    if ((i14 & 65536) == 0) {
                                    }
                                    if ((i14 & 131072) == 0) {
                                    }
                                    if ((i14 & 262144) == 0) {
                                    }
                                    if ((i14 & 524288) == 0) {
                                    }
                                    if ((i14 & 1048576) == 0) {
                                    }
                                    if ((i14 & 2097152) == 0) {
                                    }
                                    int i342 = i22;
                                    if ((i14 & 4194304) == 0) {
                                    }
                                    if ((i14 & 8388608) == 0) {
                                    }
                                    i25 = i14 & 16777216;
                                    if (i25 == 0) {
                                    }
                                    if ((i28 & 306783379) != 306783378) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    if (i25 == 0) {
                                    }
                                    if (j02 == null) {
                                    }
                                    eVar4 = eVar3;
                                    interfaceC2547p2 = a11;
                                    m02 = c3969l.m0();
                                    if (m02 == null) {
                                    }
                                }
                                z15 = z12;
                                if ((i14 & 32768) != 0) {
                                }
                                i21 = i19;
                                if ((i14 & 65536) == 0) {
                                }
                                if ((i14 & 131072) == 0) {
                                }
                                if ((i14 & 262144) == 0) {
                                }
                                if ((i14 & 524288) == 0) {
                                }
                                if ((i14 & 1048576) == 0) {
                                }
                                if ((i14 & 2097152) == 0) {
                                }
                                int i3422 = i22;
                                if ((i14 & 4194304) == 0) {
                                }
                                if ((i14 & 8388608) == 0) {
                                }
                                i25 = i14 & 16777216;
                                if (i25 == 0) {
                                }
                                if ((i28 & 306783379) != 306783378) {
                                }
                                if (i16 == 0) {
                                }
                                if (i25 == 0) {
                                }
                                if (j02 == null) {
                                }
                                eVar4 = eVar3;
                                interfaceC2547p2 = a11;
                                m02 = c3969l.m0();
                                if (m02 == null) {
                                }
                            }
                            if ((i14 & 8192) == 0) {
                            }
                            if ((i14 & 16384) == 0) {
                            }
                            z15 = z12;
                            if ((i14 & 32768) != 0) {
                            }
                            i21 = i19;
                            if ((i14 & 65536) == 0) {
                            }
                            if ((i14 & 131072) == 0) {
                            }
                            if ((i14 & 262144) == 0) {
                            }
                            if ((i14 & 524288) == 0) {
                            }
                            if ((i14 & 1048576) == 0) {
                            }
                            if ((i14 & 2097152) == 0) {
                            }
                            int i34222 = i22;
                            if ((i14 & 4194304) == 0) {
                            }
                            if ((i14 & 8388608) == 0) {
                            }
                            i25 = i14 & 16777216;
                            if (i25 == 0) {
                            }
                            if ((i28 & 306783379) != 306783378) {
                            }
                            if (i16 == 0) {
                            }
                            if (i25 == 0) {
                            }
                            if (j02 == null) {
                            }
                            eVar4 = eVar3;
                            interfaceC2547p2 = a11;
                            m02 = c3969l.m0();
                            if (m02 == null) {
                            }
                        }
                        if ((i14 & 256) != 0) {
                        }
                        if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                        }
                        if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                        }
                        int i332 = i18;
                        if ((i14 & 2048) != 0) {
                        }
                        if ((i14 & 4096) != 0) {
                        }
                        if ((i14 & 8192) == 0) {
                        }
                        if ((i14 & 16384) == 0) {
                        }
                        z15 = z12;
                        if ((i14 & 32768) != 0) {
                        }
                        i21 = i19;
                        if ((i14 & 65536) == 0) {
                        }
                        if ((i14 & 131072) == 0) {
                        }
                        if ((i14 & 262144) == 0) {
                        }
                        if ((i14 & 524288) == 0) {
                        }
                        if ((i14 & 1048576) == 0) {
                        }
                        if ((i14 & 2097152) == 0) {
                        }
                        int i342222 = i22;
                        if ((i14 & 4194304) == 0) {
                        }
                        if ((i14 & 8388608) == 0) {
                        }
                        i25 = i14 & 16777216;
                        if (i25 == 0) {
                        }
                        if ((i28 & 306783379) != 306783378) {
                        }
                        if (i16 == 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (j02 == null) {
                        }
                        eVar4 = eVar3;
                        interfaceC2547p2 = a11;
                        m02 = c3969l.m0();
                        if (m02 == null) {
                        }
                    }
                    if ((i14 & 32) == 0) {
                    }
                    if ((i14 & 64) == 0) {
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                    }
                    if ((i14 & 256) != 0) {
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                    }
                    int i3322 = i18;
                    if ((i14 & 2048) != 0) {
                    }
                    if ((i14 & 4096) != 0) {
                    }
                    if ((i14 & 8192) == 0) {
                    }
                    if ((i14 & 16384) == 0) {
                    }
                    z15 = z12;
                    if ((i14 & 32768) != 0) {
                    }
                    i21 = i19;
                    if ((i14 & 65536) == 0) {
                    }
                    if ((i14 & 131072) == 0) {
                    }
                    if ((i14 & 262144) == 0) {
                    }
                    if ((i14 & 524288) == 0) {
                    }
                    if ((i14 & 1048576) == 0) {
                    }
                    if ((i14 & 2097152) == 0) {
                    }
                    int i3422222 = i22;
                    if ((i14 & 4194304) == 0) {
                    }
                    if ((i14 & 8388608) == 0) {
                    }
                    i25 = i14 & 16777216;
                    if (i25 == 0) {
                    }
                    if ((i28 & 306783379) != 306783378) {
                    }
                    if (i16 == 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (j02 == null) {
                    }
                    eVar4 = eVar3;
                    interfaceC2547p2 = a11;
                    m02 = c3969l.m0();
                    if (m02 == null) {
                    }
                }
                if ((i14 & 16) != 0) {
                }
                if ((i14 & 32) == 0) {
                }
                if ((i14 & 64) == 0) {
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                }
                if ((i14 & 256) != 0) {
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                }
                int i33222 = i18;
                if ((i14 & 2048) != 0) {
                }
                if ((i14 & 4096) != 0) {
                }
                if ((i14 & 8192) == 0) {
                }
                if ((i14 & 16384) == 0) {
                }
                z15 = z12;
                if ((i14 & 32768) != 0) {
                }
                i21 = i19;
                if ((i14 & 65536) == 0) {
                }
                if ((i14 & 131072) == 0) {
                }
                if ((i14 & 262144) == 0) {
                }
                if ((i14 & 524288) == 0) {
                }
                if ((i14 & 1048576) == 0) {
                }
                if ((i14 & 2097152) == 0) {
                }
                int i34222222 = i22;
                if ((i14 & 4194304) == 0) {
                }
                if ((i14 & 8388608) == 0) {
                }
                i25 = i14 & 16777216;
                if (i25 == 0) {
                }
                if ((i28 & 306783379) != 306783378) {
                }
                if (i16 == 0) {
                }
                if (i25 == 0) {
                }
                if (j02 == null) {
                }
                eVar4 = eVar3;
                interfaceC2547p2 = a11;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
        }
        i17 = i14 & 8;
        int i322 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i17 == 0) {
        }
        if ((i14 & 16) != 0) {
        }
        if ((i14 & 32) == 0) {
        }
        if ((i14 & 64) == 0) {
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
        }
        if ((i14 & 256) != 0) {
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
        }
        int i332222 = i18;
        if ((i14 & 2048) != 0) {
        }
        if ((i14 & 4096) != 0) {
        }
        if ((i14 & 8192) == 0) {
        }
        if ((i14 & 16384) == 0) {
        }
        z15 = z12;
        if ((i14 & 32768) != 0) {
        }
        i21 = i19;
        if ((i14 & 65536) == 0) {
        }
        if ((i14 & 131072) == 0) {
        }
        if ((i14 & 262144) == 0) {
        }
        if ((i14 & 524288) == 0) {
        }
        if ((i14 & 1048576) == 0) {
        }
        if ((i14 & 2097152) == 0) {
        }
        int i342222222 = i22;
        if ((i14 & 4194304) == 0) {
        }
        if ((i14 & 8388608) == 0) {
        }
        i25 = i14 & 16777216;
        if (i25 == 0) {
        }
        if ((i28 & 306783379) != 306783378) {
        }
        if (i16 == 0) {
        }
        if (i25 == 0) {
        }
        if (j02 == null) {
        }
        eVar4 = eVar3;
        interfaceC2547p2 = a11;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cd  */
    /* renamed from: ShapedIcon-6hRS9go, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2992ShapedIcon6hRS9go(e eVar, boolean z11, AbstractC8972b abstractC8972b, C7807Z c7807z, AbstractC7799Q abstractC7799Q, String str, T t2, r rVar, e eVar2, e eVar3, e eVar4, e eVar5, AbstractC8972b abstractC8972b2, J0 j02, boolean z12, long j11, long j12, AbstractC7799Q abstractC7799Q2, float f7, float f11, float f12, InterfaceC2547p interfaceC2547p, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        long j13;
        AbstractC7799Q abstractC7799Q3;
        float f13;
        float f14;
        int i19;
        float f15;
        int i21;
        int i22;
        int I11;
        InterfaceC2547p interfaceC2547p2;
        int i23;
        long j14;
        C3969l c3969l;
        long w11;
        InterfaceC2547p interfaceC2547p3;
        S0.J0 m02;
        C3969l u11 = interfaceC3967k.u(-1045074099);
        if ((i14 & 1) != 0) {
            i15 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i15 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i15 = i11;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i11 & 48) == 0) {
            i15 |= u11.p(z11) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i11 & 384) == 0) {
            i15 |= u11.n(abstractC8972b) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i15 |= u11.n(c7807z) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            if ((i14 & 16) == 0) {
                i15 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i15 |= u11.n(abstractC7799Q) ? 16384 : 8192;
            }
            if ((i14 & 32) == 0) {
                i15 |= 196608;
            } else if ((i11 & 196608) == 0) {
                i15 |= u11.n(str) ? 131072 : 65536;
                if ((i14 & 64) != 0) {
                    i15 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    i15 |= u11.n(t2) ? 1048576 : 524288;
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    i15 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    i15 |= u11.n(rVar) ? 8388608 : 4194304;
                }
                if ((i14 & 256) != 0) {
                    i15 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    i15 |= u11.n(eVar2) ? 67108864 : 33554432;
                    if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                        i15 |= 805306368;
                    } else if ((i11 & 805306368) == 0) {
                        i15 |= u11.n(eVar3) ? 536870912 : 268435456;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                        i17 = i12 | 6;
                    } else if ((i12 & 6) == 0) {
                        i17 = (u11.n(eVar4) ? 4 : 2) | i12;
                    } else {
                        i16 = i12;
                        if ((i14 & 2048) != 0) {
                            i18 = i16 | 48;
                        } else if ((i12 & 48) == 0) {
                            i18 = i16 | (u11.n(eVar5) ? 32 : 16);
                        } else {
                            i18 = i16;
                        }
                        if ((i14 & 4096) != 0) {
                            i18 |= 384;
                        } else if ((i12 & 384) == 0) {
                            i18 |= u11.n(abstractC8972b2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                        }
                        if ((i14 & 8192) != 0) {
                            i18 |= 3072;
                        } else if ((i12 & 3072) == 0) {
                            i18 |= u11.n(j02) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                        }
                        if ((i14 & 16384) != 0) {
                            i18 |= 24576;
                        } else if ((i12 & 24576) == 0) {
                            i18 |= u11.p(z12) ? 16384 : 8192;
                        }
                        if ((32768 & i14) != 0) {
                            i18 |= 196608;
                        } else if ((i12 & 196608) == 0) {
                            i18 |= u11.s(j11) ? 131072 : 65536;
                        }
                        if ((i14 & 65536) != 0) {
                            i18 |= 1572864;
                            j13 = j12;
                        } else {
                            j13 = j12;
                            if ((i12 & 1572864) == 0) {
                                i18 |= u11.s(j13) ? 1048576 : 524288;
                            }
                        }
                        if ((i14 & 131072) != 0) {
                            i18 |= 12582912;
                        } else if ((i12 & 12582912) == 0) {
                            abstractC7799Q3 = abstractC7799Q2;
                            i18 |= u11.n(abstractC7799Q3) ? 8388608 : 4194304;
                            if ((262144 & i14) == 0) {
                                i18 |= 100663296;
                            } else if ((i12 & 100663296) == 0) {
                                f13 = f7;
                                i18 |= u11.q(f13) ? 67108864 : 33554432;
                                if ((i14 & 524288) != 0) {
                                    i18 |= 805306368;
                                    f14 = f11;
                                } else {
                                    f14 = f11;
                                    if ((i12 & 805306368) == 0) {
                                        i18 |= u11.q(f14) ? 536870912 : 268435456;
                                    }
                                }
                                if ((i14 & 1048576) != 0) {
                                    i21 = i13 | 6;
                                    i19 = i18;
                                    f15 = f12;
                                } else if ((i13 & 6) == 0) {
                                    i19 = i18;
                                    f15 = f12;
                                    i21 = i13 | (u11.q(f15) ? 4 : 2);
                                } else {
                                    i19 = i18;
                                    f15 = f12;
                                    i21 = i13;
                                }
                                i22 = i14 & 2097152;
                                if (i22 != 0) {
                                    i21 |= 48;
                                } else if ((i13 & 48) == 0) {
                                    i21 |= u11.n(interfaceC2547p) ? 32 : 16;
                                }
                                if ((i15 & 306783379) != 306783378 && (i19 & 306783379) == 306783378 && (i21 & 19) == 18 && u11.b()) {
                                    u11.j();
                                    interfaceC2547p3 = interfaceC2547p;
                                    c3969l = u11;
                                } else {
                                    InterfaceC2547p a11 = i22 != 0 ? InterfaceC2547p.a.a() : interfaceC2547p;
                                    e n11 = a0.n(abstractC7799Q3 != null ? androidx.compose.foundation.e.a(eVar, abstractC7799Q3, j02, 4) : androidx.compose.foundation.e.b(eVar, j13, j02), f13);
                                    V f16 = C5185h.f(InterfaceC6250b.a.o(), false);
                                    I11 = u11.I();
                                    A0 d11 = u11.d();
                                    e f17 = c.f(u11, n11);
                                    Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                                    if (u11.t()) {
                                        u11.H(a12);
                                    } else {
                                        u11.e();
                                    }
                                    Function2 f18 = E.f(u11, f16, u11, d11);
                                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                        a.d(I11, u11, I11, f18);
                                    }
                                    F1.b(u11, f17, InterfaceC2801g.a.f());
                                    C5187j c5187j = C5187j.f39515a;
                                    u11.o(-640291403);
                                    if (abstractC8972b2 == null) {
                                        interfaceC2547p2 = a11;
                                        c3969l = u11;
                                        i23 = 0;
                                        j14 = j11;
                                    } else {
                                        e.a aVar = e.f40358c0;
                                        int i24 = ((i19 >> 6) & 14) | 48 | ((i21 << 9) & 57344);
                                        interfaceC2547p2 = a11;
                                        i23 = 0;
                                        j14 = j11;
                                        C8366G.a(abstractC8972b2, null, C6988h.a(a0.d(eVar2), j02), null, interfaceC2547p2, 0.0f, null, u11, i24, 104);
                                        c3969l = u11;
                                        Unit unit = Unit.f71690a;
                                    }
                                    c3969l.k();
                                    c3969l.o(-640280184);
                                    if (z12) {
                                        e.a aVar2 = e.f40358c0;
                                        C5185h.a(androidx.compose.foundation.e.b(a0.d(eVar3), j14, j02), c3969l, i23);
                                    }
                                    c3969l.k();
                                    if (z11) {
                                        c3969l.o(1626413658);
                                        e.a aVar3 = e.f40358c0;
                                        e h11 = androidx.compose.foundation.layout.T.h(c5187j.a(eVar5, InterfaceC6250b.a.e()), f15, 0.0f, 2);
                                        Intrinsics.f(str);
                                        Intrinsics.f(t2);
                                        Intrinsics.f(c7807z);
                                        u3.b(str, h11, c7807z.w(), 0L, null, 0L, h.a(3), 0L, rVar != null ? 1 : 2, false, 1, 0, null, t2, c3969l, 0, 3072, 54776);
                                        c3969l.k();
                                        Unit unit2 = Unit.f71690a;
                                    } else {
                                        c3969l.o(1626892143);
                                        if (abstractC8972b != null) {
                                            c3969l.o(-640248663);
                                            e.a aVar4 = e.f40358c0;
                                            e a13 = c5187j.a(a0.n(eVar4, f14), InterfaceC6250b.a.e());
                                            if (abstractC7799Q != null) {
                                                c3969l.o(-909882671);
                                                Object C11 = c3969l.C();
                                                if (C11 == InterfaceC3967k.a.a()) {
                                                    C11 = FoundationIconKt$ShapedIcon$2$2$1$1$1.INSTANCE;
                                                    c3969l.x(C11);
                                                }
                                                c3969l.k();
                                                e a14 = androidx.compose.ui.graphics.a.a(aVar4, (Function1) C11);
                                                c3969l.o(-909879150);
                                                if ((57344 & i15) == 16384) {
                                                    i23 = 1;
                                                }
                                                Object C12 = c3969l.C();
                                                if (i23 != 0 || C12 == InterfaceC3967k.a.a()) {
                                                    C12 = new FoundationIconKt$ShapedIcon$2$2$1$2$1(abstractC7799Q);
                                                    c3969l.x(C12);
                                                }
                                                c3969l.k();
                                                a13 = a13.l0(androidx.compose.ui.draw.c.c(a14, (Function1) C12));
                                            }
                                            e eVar6 = a13;
                                            c3969l.k();
                                            if (abstractC7799Q != null) {
                                                w11 = C7807Z.f72259m;
                                            } else {
                                                Intrinsics.f(c7807z);
                                                w11 = c7807z.w();
                                            }
                                            T0.a(abstractC8972b, null, eVar6, w11, c3969l, ((i15 >> 6) & 14) | 48);
                                            Unit unit3 = Unit.f71690a;
                                        }
                                        c3969l.k();
                                    }
                                    c3969l.f();
                                    interfaceC2547p3 = interfaceC2547p2;
                                }
                                m02 = c3969l.m0();
                                if (m02 != null) {
                                    m02.G(new FoundationIconKt$ShapedIcon$3(eVar, z11, abstractC8972b, c7807z, abstractC7799Q, str, t2, rVar, eVar2, eVar3, eVar4, eVar5, abstractC8972b2, j02, z12, j11, j12, abstractC7799Q2, f7, f14, f12, interfaceC2547p3, i11, i12, i13, i14));
                                    return;
                                }
                                return;
                            }
                            f13 = f7;
                            if ((i14 & 524288) != 0) {
                            }
                            if ((i14 & 1048576) != 0) {
                            }
                            i22 = i14 & 2097152;
                            if (i22 != 0) {
                            }
                            if ((i15 & 306783379) != 306783378) {
                            }
                            if (i22 != 0) {
                            }
                            e n112 = a0.n(abstractC7799Q3 != null ? androidx.compose.foundation.e.a(eVar, abstractC7799Q3, j02, 4) : androidx.compose.foundation.e.b(eVar, j13, j02), f13);
                            V f162 = C5185h.f(InterfaceC6250b.a.o(), false);
                            I11 = u11.I();
                            A0 d112 = u11.d();
                            e f172 = c.f(u11, n112);
                            Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
                            if (u11.t()) {
                            }
                            Function2 f182 = E.f(u11, f162, u11, d112);
                            if (!u11.t()) {
                            }
                            a.d(I11, u11, I11, f182);
                            F1.b(u11, f172, InterfaceC2801g.a.f());
                            C5187j c5187j2 = C5187j.f39515a;
                            u11.o(-640291403);
                            if (abstractC8972b2 == null) {
                            }
                            c3969l.k();
                            c3969l.o(-640280184);
                            if (z12) {
                            }
                            c3969l.k();
                            if (z11) {
                            }
                            c3969l.f();
                            interfaceC2547p3 = interfaceC2547p2;
                            m02 = c3969l.m0();
                            if (m02 != null) {
                            }
                        }
                        abstractC7799Q3 = abstractC7799Q2;
                        if ((262144 & i14) == 0) {
                        }
                        f13 = f7;
                        if ((i14 & 524288) != 0) {
                        }
                        if ((i14 & 1048576) != 0) {
                        }
                        i22 = i14 & 2097152;
                        if (i22 != 0) {
                        }
                        if ((i15 & 306783379) != 306783378) {
                        }
                        if (i22 != 0) {
                        }
                        e n1122 = a0.n(abstractC7799Q3 != null ? androidx.compose.foundation.e.a(eVar, abstractC7799Q3, j02, 4) : androidx.compose.foundation.e.b(eVar, j13, j02), f13);
                        V f1622 = C5185h.f(InterfaceC6250b.a.o(), false);
                        I11 = u11.I();
                        A0 d1122 = u11.d();
                        e f1722 = c.f(u11, n1122);
                        Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                        }
                        Function2 f1822 = E.f(u11, f1622, u11, d1122);
                        if (!u11.t()) {
                        }
                        a.d(I11, u11, I11, f1822);
                        F1.b(u11, f1722, InterfaceC2801g.a.f());
                        C5187j c5187j22 = C5187j.f39515a;
                        u11.o(-640291403);
                        if (abstractC8972b2 == null) {
                        }
                        c3969l.k();
                        c3969l.o(-640280184);
                        if (z12) {
                        }
                        c3969l.k();
                        if (z11) {
                        }
                        c3969l.f();
                        interfaceC2547p3 = interfaceC2547p2;
                        m02 = c3969l.m0();
                        if (m02 != null) {
                        }
                    }
                    i16 = i17;
                    if ((i14 & 2048) != 0) {
                    }
                    if ((i14 & 4096) != 0) {
                    }
                    if ((i14 & 8192) != 0) {
                    }
                    if ((i14 & 16384) != 0) {
                    }
                    if ((32768 & i14) != 0) {
                    }
                    if ((i14 & 65536) != 0) {
                    }
                    if ((i14 & 131072) != 0) {
                    }
                    abstractC7799Q3 = abstractC7799Q2;
                    if ((262144 & i14) == 0) {
                    }
                    f13 = f7;
                    if ((i14 & 524288) != 0) {
                    }
                    if ((i14 & 1048576) != 0) {
                    }
                    i22 = i14 & 2097152;
                    if (i22 != 0) {
                    }
                    if ((i15 & 306783379) != 306783378) {
                    }
                    if (i22 != 0) {
                    }
                    e n11222 = a0.n(abstractC7799Q3 != null ? androidx.compose.foundation.e.a(eVar, abstractC7799Q3, j02, 4) : androidx.compose.foundation.e.b(eVar, j13, j02), f13);
                    V f16222 = C5185h.f(InterfaceC6250b.a.o(), false);
                    I11 = u11.I();
                    A0 d11222 = u11.d();
                    e f17222 = c.f(u11, n11222);
                    Function0 a12222 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 f18222 = E.f(u11, f16222, u11, d11222);
                    if (!u11.t()) {
                    }
                    a.d(I11, u11, I11, f18222);
                    F1.b(u11, f17222, InterfaceC2801g.a.f());
                    C5187j c5187j222 = C5187j.f39515a;
                    u11.o(-640291403);
                    if (abstractC8972b2 == null) {
                    }
                    c3969l.k();
                    c3969l.o(-640280184);
                    if (z12) {
                    }
                    c3969l.k();
                    if (z11) {
                    }
                    c3969l.f();
                    interfaceC2547p3 = interfaceC2547p2;
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                }
                i16 = i17;
                if ((i14 & 2048) != 0) {
                }
                if ((i14 & 4096) != 0) {
                }
                if ((i14 & 8192) != 0) {
                }
                if ((i14 & 16384) != 0) {
                }
                if ((32768 & i14) != 0) {
                }
                if ((i14 & 65536) != 0) {
                }
                if ((i14 & 131072) != 0) {
                }
                abstractC7799Q3 = abstractC7799Q2;
                if ((262144 & i14) == 0) {
                }
                f13 = f7;
                if ((i14 & 524288) != 0) {
                }
                if ((i14 & 1048576) != 0) {
                }
                i22 = i14 & 2097152;
                if (i22 != 0) {
                }
                if ((i15 & 306783379) != 306783378) {
                }
                if (i22 != 0) {
                }
                e n112222 = a0.n(abstractC7799Q3 != null ? androidx.compose.foundation.e.a(eVar, abstractC7799Q3, j02, 4) : androidx.compose.foundation.e.b(eVar, j13, j02), f13);
                V f162222 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d112222 = u11.d();
                e f172222 = c.f(u11, n112222);
                Function0 a122222 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 f182222 = E.f(u11, f162222, u11, d112222);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, f182222);
                F1.b(u11, f172222, InterfaceC2801g.a.f());
                C5187j c5187j2222 = C5187j.f39515a;
                u11.o(-640291403);
                if (abstractC8972b2 == null) {
                }
                c3969l.k();
                c3969l.o(-640280184);
                if (z12) {
                }
                c3969l.k();
                if (z11) {
                }
                c3969l.f();
                interfaceC2547p3 = interfaceC2547p2;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            if ((i14 & 64) != 0) {
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            }
            if ((i14 & 256) != 0) {
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
            }
            i16 = i17;
            if ((i14 & 2048) != 0) {
            }
            if ((i14 & 4096) != 0) {
            }
            if ((i14 & 8192) != 0) {
            }
            if ((i14 & 16384) != 0) {
            }
            if ((32768 & i14) != 0) {
            }
            if ((i14 & 65536) != 0) {
            }
            if ((i14 & 131072) != 0) {
            }
            abstractC7799Q3 = abstractC7799Q2;
            if ((262144 & i14) == 0) {
            }
            f13 = f7;
            if ((i14 & 524288) != 0) {
            }
            if ((i14 & 1048576) != 0) {
            }
            i22 = i14 & 2097152;
            if (i22 != 0) {
            }
            if ((i15 & 306783379) != 306783378) {
            }
            if (i22 != 0) {
            }
            e n1122222 = a0.n(abstractC7799Q3 != null ? androidx.compose.foundation.e.a(eVar, abstractC7799Q3, j02, 4) : androidx.compose.foundation.e.b(eVar, j13, j02), f13);
            V f1622222 = C5185h.f(InterfaceC6250b.a.o(), false);
            I11 = u11.I();
            A0 d1122222 = u11.d();
            e f1722222 = c.f(u11, n1122222);
            Function0 a1222222 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f1822222 = E.f(u11, f1622222, u11, d1122222);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f1822222);
            F1.b(u11, f1722222, InterfaceC2801g.a.f());
            C5187j c5187j22222 = C5187j.f39515a;
            u11.o(-640291403);
            if (abstractC8972b2 == null) {
            }
            c3969l.k();
            c3969l.o(-640280184);
            if (z12) {
            }
            c3969l.k();
            if (z11) {
            }
            c3969l.f();
            interfaceC2547p3 = interfaceC2547p2;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        if ((i14 & 16) == 0) {
        }
        if ((i14 & 32) == 0) {
        }
        if ((i14 & 64) != 0) {
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
        }
        if ((i14 & 256) != 0) {
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
        }
        i16 = i17;
        if ((i14 & 2048) != 0) {
        }
        if ((i14 & 4096) != 0) {
        }
        if ((i14 & 8192) != 0) {
        }
        if ((i14 & 16384) != 0) {
        }
        if ((32768 & i14) != 0) {
        }
        if ((i14 & 65536) != 0) {
        }
        if ((i14 & 131072) != 0) {
        }
        abstractC7799Q3 = abstractC7799Q2;
        if ((262144 & i14) == 0) {
        }
        f13 = f7;
        if ((i14 & 524288) != 0) {
        }
        if ((i14 & 1048576) != 0) {
        }
        i22 = i14 & 2097152;
        if (i22 != 0) {
        }
        if ((i15 & 306783379) != 306783378) {
        }
        if (i22 != 0) {
        }
        e n11222222 = a0.n(abstractC7799Q3 != null ? androidx.compose.foundation.e.a(eVar, abstractC7799Q3, j02, 4) : androidx.compose.foundation.e.b(eVar, j13, j02), f13);
        V f16222222 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d11222222 = u11.d();
        e f17222222 = c.f(u11, n11222222);
        Function0 a12222222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f18222222 = E.f(u11, f16222222, u11, d11222222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f18222222);
        F1.b(u11, f17222222, InterfaceC2801g.a.f());
        C5187j c5187j222222 = C5187j.f39515a;
        u11.o(-640291403);
        if (abstractC8972b2 == null) {
        }
        c3969l.k();
        c3969l.o(-640280184);
        if (z12) {
        }
        c3969l.k();
        if (z11) {
        }
        c3969l.f();
        interfaceC2547p3 = interfaceC2547p2;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UnshapedIcon-dE3IV7s, reason: not valid java name */
    public static final void m2993UnshapedIcondE3IV7s(e eVar, boolean z11, AbstractC8972b abstractC8972b, C7807Z c7807z, AbstractC7799Q abstractC7799Q, String str, T t2, e eVar2, e eVar3, float f7, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C7807Z c7807z2;
        String str2;
        T t11;
        long w11;
        C3969l u11 = interfaceC3967k.u(-1143875878);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(abstractC8972b) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            c7807z2 = c7807z;
            i12 |= u11.n(c7807z2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            c7807z2 = c7807z;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.n(abstractC7799Q) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            str2 = str;
            i12 |= u11.n(str2) ? 131072 : 65536;
        } else {
            str2 = str;
        }
        if ((1572864 & i11) == 0) {
            t11 = t2;
            i12 |= u11.n(t11) ? 1048576 : 524288;
        } else {
            t11 = t2;
        }
        if ((12582912 & i11) == 0) {
            i12 |= u11.n(eVar2) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= u11.n(eVar3) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i12 |= u11.q(f7) ? 536870912 : 268435456;
        }
        if ((306783379 & i12) == 306783378 && u11.b()) {
            u11.j();
        } else {
            V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, eVar);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f13 = E.f(u11, f11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f13);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            if (z11) {
                u11.o(687020462);
                e.a aVar = e.f40358c0;
                e n11 = a0.n(eVar3, f7);
                Intrinsics.f(str2);
                Intrinsics.f(t11);
                Intrinsics.f(c7807z2);
                u3.b(str2, n11, c7807z2.w(), 0L, null, 0L, h.a(3), 0L, 2, false, 1, 0, null, t11, u11, 0, 3120, 54776);
                u11.k();
            } else {
                u11.o(687422687);
                if (abstractC8972b != null) {
                    u11.o(1823296338);
                    e.a aVar2 = e.f40358c0;
                    e n12 = a0.n(eVar2, f7);
                    if (abstractC7799Q != null) {
                        u11.o(1970849162);
                        Object C11 = u11.C();
                        if (C11 == InterfaceC3967k.a.a()) {
                            C11 = FoundationIconKt$UnshapedIcon$1$1$1$1$1.INSTANCE;
                            u11.x(C11);
                        }
                        u11.k();
                        e a12 = androidx.compose.ui.graphics.a.a(aVar2, (Function1) C11);
                        u11.o(1970852675);
                        boolean z12 = (57344 & i12) == 16384;
                        Object C12 = u11.C();
                        if (z12 || C12 == InterfaceC3967k.a.a()) {
                            C12 = new FoundationIconKt$UnshapedIcon$1$1$1$2$1(abstractC7799Q);
                            u11.x(C12);
                        }
                        u11.k();
                        n12 = n12.l0(androidx.compose.ui.draw.c.c(a12, (Function1) C12));
                    }
                    u11.k();
                    if (abstractC7799Q != null) {
                        w11 = C7807Z.f72259m;
                    } else {
                        Intrinsics.f(c7807z2);
                        w11 = c7807z2.w();
                    }
                    T0.a(abstractC8972b, null, n12, w11, u11, ((i12 >> 6) & 14) | 48);
                    Unit unit = Unit.f71690a;
                }
                u11.k();
            }
            u11.f();
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new FoundationIconKt$UnshapedIcon$2(eVar, z11, abstractC8972b, c7807z, abstractC7799Q, str, t2, eVar2, eVar3, f7, i11));
        }
    }
}
