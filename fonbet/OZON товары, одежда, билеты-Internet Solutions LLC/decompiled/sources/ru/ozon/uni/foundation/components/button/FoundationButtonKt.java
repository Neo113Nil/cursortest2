package ru.ozon.uni.foundation.components.button;

import B1.U;
import B1.V;
import B1.W;
import B1.m0;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.C3354v2;
import J0.T0;
import J0.u3;
import K00.b;
import K1.T;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S0.S;
import S0.m1;
import T7.E;
import U7.i;
import a1.C4912a;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6981a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aÓ\u0001\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0001¢\u0006\u0004\b \u0010!\u001aß\u0001\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00192\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010%H\u0001¢\u0006\u0004\b&\u0010'\u001a»\u0001\u0010,\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010%2\b\u0010\u0010\u001a\u0004\u0018\u00010%2\b\u0010\u0011\u001a\u0004\u0018\u00010%2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b*\u0010+\u001a;\u0010/\u001a\u00020\u001e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010%2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b-\u0010.¨\u00060"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "iconModifier", "titleModifier", "subtitleModifier", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lq1/b;", "icon", "", "canShowSubtitle", "isLoading", "LS0/A1;", "", "titleAlpha", "subtitleAlpha", "iconAlpha", "LK1/T;", "titleTextStyle", "subtitleTextStyle", "Ll1/Z;", "titleColor", "subtitleColor", "iconColor", "LZ1/h;", "iconSize", "labelHorizontalPadding", "labelIconGap", "Lkotlin/Function0;", "", "loader", "FoundationButton-9jbtD_0", "(Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Lq1/b;ZZLS0/A1;LS0/A1;LS0/A1;LK1/T;LK1/T;JJJFFFLkotlin/jvm/functions/Function2;LS0/k;III)V", "FoundationButton", "gap", "companion", "LS0/S;", "FoundationButton-fOU4Dw4", "(Ljava/lang/String;Ljava/lang/String;Lq1/b;ZLK1/T;LK1/T;JJJFFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;LS0/S;LS0/S;LS0/S;LS0/k;IIII)V", "Le1/b$b;", "horizontalAlignment", "ButtonContent-3Qfi9_U", "(Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Le1/b$b;Ljava/lang/String;Ljava/lang/String;Lq1/b;ZLS0/S;LS0/S;LS0/S;LK1/T;LK1/T;JJJFFFLandroidx/compose/ui/e;LS0/k;III)V", "ButtonContent", "TitleText-yrwZFoE", "(Landroidx/compose/ui/e;Ljava/lang/String;LS0/S;LK1/T;JLS0/k;II)V", "TitleText", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FoundationButtonKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0404 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f8  */
    /* renamed from: ButtonContent-3Qfi9_U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2978ButtonContent3Qfi9_U(e eVar, e eVar2, e eVar3, InterfaceC6250b.InterfaceC0966b interfaceC0966b, String str, String str2, AbstractC8972b abstractC8972b, boolean z11, S s11, S s12, S s13, T t2, T t11, long j11, long j12, long j13, float f7, float f11, float f12, e eVar4, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        float f13;
        float f14;
        int i22;
        int i23;
        int i24;
        int I11;
        C3969l c3969l;
        float f15;
        int i25;
        C3969l c3969l2;
        e eVar5;
        e h11;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-1954605877);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = i11 | (u11.n(eVar) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            i14 |= u11.n(eVar2) ? 32 : 16;
        }
        int i26 = i14;
        if ((i13 & 4) != 0) {
            i15 = i26 | 384;
        } else if ((i11 & 384) == 0) {
            i15 = i26 | (u11.n(eVar3) ? 256 : 128);
        } else {
            i15 = i26;
        }
        int i27 = i13 & 8;
        int i28 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i27 != 0) {
            i16 = i15 | 3072;
        } else {
            int i29 = i15;
            if ((i11 & 3072) == 0) {
                i16 = i29 | (u11.n(interfaceC0966b) ? 2048 : 1024);
            } else {
                i16 = i29;
            }
        }
        if ((i13 & 16) != 0) {
            i17 = i16 | 24576;
        } else {
            i17 = i16;
            if ((i11 & 24576) == 0) {
                i17 |= u11.n(str) ? 16384 : 8192;
                if ((i13 & 32) == 0) {
                    i17 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    i17 |= u11.n(str2) ? 131072 : 65536;
                }
                if ((i13 & 64) == 0) {
                    i17 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    i17 |= u11.n(abstractC8972b) ? 1048576 : 524288;
                }
                if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                    i17 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    i17 |= u11.p(z11) ? 8388608 : 4194304;
                }
                if ((i13 & 256) == 0) {
                    i17 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    i17 |= u11.n(s11) ? 67108864 : 33554432;
                    if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                        i17 |= 805306368;
                    } else if ((i11 & 805306368) == 0) {
                        i17 |= u11.n(s12) ? 536870912 : 268435456;
                    }
                    i18 = i17;
                    if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                        i19 = i12 | 6;
                    } else if ((i12 & 6) == 0) {
                        i19 = i12 | (u11.n(s13) ? 4 : 2);
                    } else {
                        i19 = i12;
                    }
                    int i31 = i19;
                    if ((i13 & 2048) != 0) {
                        i21 = i31 | 48;
                    } else {
                        if ((i12 & 48) == 0) {
                            i31 |= u11.n(t2) ? 32 : 16;
                        }
                        i21 = i31;
                    }
                    if ((i13 & 4096) != 0) {
                        i21 |= 384;
                    } else if ((i12 & 384) == 0) {
                        i21 |= u11.n(t11) ? 256 : 128;
                        if ((i13 & 8192) == 0) {
                            i21 |= 3072;
                        } else if ((i12 & 3072) == 0) {
                            if (u11.s(j11)) {
                                i28 = 2048;
                            }
                            i21 |= i28;
                        }
                        if ((i13 & 16384) == 0) {
                            i21 |= 24576;
                        } else if ((i12 & 24576) == 0) {
                            i21 |= u11.s(j12) ? 16384 : 8192;
                        }
                        if ((32768 & i13) == 0) {
                            i21 |= 196608;
                        } else if ((i12 & 196608) == 0) {
                            i21 |= u11.s(j13) ? 131072 : 65536;
                        }
                        if ((i13 & 65536) == 0) {
                            i21 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            f13 = f7;
                            i21 |= u11.q(f13) ? 1048576 : 524288;
                            if ((i13 & 131072) != 0) {
                                i21 |= 12582912;
                            } else if ((i12 & 12582912) == 0) {
                                f14 = f11;
                                i21 |= u11.q(f14) ? 8388608 : 4194304;
                                if ((i13 & 262144) == 0) {
                                    i21 |= 100663296;
                                } else if ((i12 & 100663296) == 0) {
                                    i22 = i21 | (u11.q(f12) ? 67108864 : 33554432);
                                    i23 = i13 & 524288;
                                    if (i23 != 0) {
                                        i22 |= 805306368;
                                    } else if ((i12 & 805306368) == 0) {
                                        i22 |= u11.n(eVar4) ? 536870912 : 268435456;
                                    }
                                    i24 = i22;
                                    if ((i18 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && u11.b()) {
                                        u11.j();
                                        eVar5 = eVar4;
                                        c3969l2 = u11;
                                    } else {
                                        e eVar6 = i23 != 0 ? e.f40358c0 : eVar4;
                                        C5194q a11 = C5193p.a(C5179b.g(), interfaceC0966b, u11, ((((i24 >> 27) & 14) | ((i18 >> 3) & 896)) >> 3) & 112);
                                        I11 = u11.I();
                                        A0 d11 = u11.d();
                                        e f16 = c.f(u11, eVar6);
                                        e eVar7 = eVar6;
                                        Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                                        if (u11.t()) {
                                            u11.H(a12);
                                        } else {
                                            u11.e();
                                        }
                                        Function2 g10 = b.g(u11, a11, u11, d11);
                                        if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                            a.d(I11, u11, I11, g10);
                                        }
                                        F1.b(u11, f16, InterfaceC2801g.a.f());
                                        if (abstractC8972b != null) {
                                            u11.o(-1684566385);
                                            e.a aVar = e.f40358c0;
                                            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
                                            int I12 = u11.I();
                                            A0 d12 = u11.d();
                                            e f17 = c.f(u11, aVar);
                                            Function0 a13 = InterfaceC2801g.a.a();
                                            u11.i();
                                            if (u11.t()) {
                                                u11.H(a13);
                                            } else {
                                                u11.e();
                                            }
                                            Function2 h12 = Cm.e.h(u11, b11, u11, d12);
                                            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                                                a.d(I12, u11, I12, h12);
                                            }
                                            F1.b(u11, f17, InterfaceC2801g.a.f());
                                            int i32 = i18 >> 18;
                                            T0.a(abstractC8972b, null, a0.n(eVar, f13).l0(new VerticalAlignElement(InterfaceC6250b.a.i())), s13 != null ? C7807Z.o(s13.getFloatValue(), j13) : j13, u11, (i32 & 14) | 48);
                                            f15 = f11;
                                            int i33 = (i32 & 896) | ((i18 >> 9) & 112) | ((i24 << 6) & 7168) | ((i24 << 3) & 57344);
                                            i25 = 2;
                                            m2981TitleTextyrwZFoE(androidx.compose.foundation.layout.T.j(eVar2.l0(new VerticalAlignElement(InterfaceC6250b.a.i())), f12, 0.0f, f11, 0.0f, 10), str, s11, t2, j11, u11, i33, 0);
                                            c3969l = u11;
                                            c3969l.f();
                                            c3969l.k();
                                        } else {
                                            c3969l = u11;
                                            f15 = f14;
                                            i25 = 2;
                                            c3969l.o(-1683575625);
                                            m2981TitleTextyrwZFoE(androidx.compose.foundation.layout.T.h(eVar2, f15, 0.0f, 2), str, s11, t2, j11, c3969l, ((i18 >> 9) & 112) | ((i18 >> 18) & 896) | ((i24 << 6) & 7168) | ((i24 << 3) & 57344), 0);
                                            c3969l.k();
                                        }
                                        c3969l.o(-1993959143);
                                        if (abstractC8972b == null || str2 == null || !z11) {
                                            c3969l2 = c3969l;
                                        } else {
                                            c3969l.o(-1993956139);
                                            if (s12 != null) {
                                                e h13 = androidx.compose.foundation.layout.T.h(eVar3, f15, 0.0f, i25);
                                                c3969l.o(-1993949214);
                                                boolean z12 = (i18 & 1879048192) == 536870912;
                                                Object C11 = c3969l.C();
                                                if (z12 || C11 == InterfaceC3967k.a.a()) {
                                                    C11 = new FoundationButtonKt$ButtonContent$1$2$1(s12);
                                                    c3969l.x(C11);
                                                }
                                                c3969l.k();
                                                h11 = androidx.compose.ui.graphics.a.a(h13, (Function1) C11);
                                            } else {
                                                h11 = androidx.compose.foundation.layout.T.h(eVar3, f15, 0.0f, i25);
                                            }
                                            e eVar8 = h11;
                                            c3969l.k();
                                            C3969l c3969l3 = c3969l;
                                            u3.b(str2, eVar8, j12, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, t11, c3969l3, ((i18 >> 15) & 14) | ((i24 >> 6) & 896), ((i24 << 12) & 3670016) | 3120, 55288);
                                            c3969l2 = c3969l3;
                                        }
                                        c3969l2.k();
                                        c3969l2.f();
                                        eVar5 = eVar7;
                                    }
                                    m02 = c3969l2.m0();
                                    if (m02 != null) {
                                        m02.G(new FoundationButtonKt$ButtonContent$2(eVar, eVar2, eVar3, interfaceC0966b, str, str2, abstractC8972b, z11, s11, s12, s13, t2, t11, j11, j12, j13, f7, f11, f12, eVar5, i11, i12, i13));
                                        return;
                                    }
                                    return;
                                }
                                i22 = i21;
                                i23 = i13 & 524288;
                                if (i23 != 0) {
                                }
                                i24 = i22;
                                if ((i18 & 306783379) != 306783378) {
                                }
                                if (i23 != 0) {
                                }
                                C5194q a112 = C5193p.a(C5179b.g(), interfaceC0966b, u11, ((((i24 >> 27) & 14) | ((i18 >> 3) & 896)) >> 3) & 112);
                                I11 = u11.I();
                                A0 d112 = u11.d();
                                e f162 = c.f(u11, eVar6);
                                e eVar72 = eVar6;
                                Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
                                if (u11.t()) {
                                }
                                Function2 g102 = b.g(u11, a112, u11, d112);
                                if (!u11.t()) {
                                }
                                a.d(I11, u11, I11, g102);
                                F1.b(u11, f162, InterfaceC2801g.a.f());
                                if (abstractC8972b != null) {
                                }
                                c3969l.o(-1993959143);
                                if (abstractC8972b == null) {
                                }
                                c3969l2 = c3969l;
                                c3969l2.k();
                                c3969l2.f();
                                eVar5 = eVar72;
                                m02 = c3969l2.m0();
                                if (m02 != null) {
                                }
                            }
                            f14 = f11;
                            if ((i13 & 262144) == 0) {
                            }
                            i22 = i21;
                            i23 = i13 & 524288;
                            if (i23 != 0) {
                            }
                            i24 = i22;
                            if ((i18 & 306783379) != 306783378) {
                            }
                            if (i23 != 0) {
                            }
                            C5194q a1122 = C5193p.a(C5179b.g(), interfaceC0966b, u11, ((((i24 >> 27) & 14) | ((i18 >> 3) & 896)) >> 3) & 112);
                            I11 = u11.I();
                            A0 d1122 = u11.d();
                            e f1622 = c.f(u11, eVar6);
                            e eVar722 = eVar6;
                            Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
                            if (u11.t()) {
                            }
                            Function2 g1022 = b.g(u11, a1122, u11, d1122);
                            if (!u11.t()) {
                            }
                            a.d(I11, u11, I11, g1022);
                            F1.b(u11, f1622, InterfaceC2801g.a.f());
                            if (abstractC8972b != null) {
                            }
                            c3969l.o(-1993959143);
                            if (abstractC8972b == null) {
                            }
                            c3969l2 = c3969l;
                            c3969l2.k();
                            c3969l2.f();
                            eVar5 = eVar722;
                            m02 = c3969l2.m0();
                            if (m02 != null) {
                            }
                        }
                        f13 = f7;
                        if ((i13 & 131072) != 0) {
                        }
                        f14 = f11;
                        if ((i13 & 262144) == 0) {
                        }
                        i22 = i21;
                        i23 = i13 & 524288;
                        if (i23 != 0) {
                        }
                        i24 = i22;
                        if ((i18 & 306783379) != 306783378) {
                        }
                        if (i23 != 0) {
                        }
                        C5194q a11222 = C5193p.a(C5179b.g(), interfaceC0966b, u11, ((((i24 >> 27) & 14) | ((i18 >> 3) & 896)) >> 3) & 112);
                        I11 = u11.I();
                        A0 d11222 = u11.d();
                        e f16222 = c.f(u11, eVar6);
                        e eVar7222 = eVar6;
                        Function0 a12222 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                        }
                        Function2 g10222 = b.g(u11, a11222, u11, d11222);
                        if (!u11.t()) {
                        }
                        a.d(I11, u11, I11, g10222);
                        F1.b(u11, f16222, InterfaceC2801g.a.f());
                        if (abstractC8972b != null) {
                        }
                        c3969l.o(-1993959143);
                        if (abstractC8972b == null) {
                        }
                        c3969l2 = c3969l;
                        c3969l2.k();
                        c3969l2.f();
                        eVar5 = eVar7222;
                        m02 = c3969l2.m0();
                        if (m02 != null) {
                        }
                    }
                    if ((i13 & 8192) == 0) {
                    }
                    if ((i13 & 16384) == 0) {
                    }
                    if ((32768 & i13) == 0) {
                    }
                    if ((i13 & 65536) == 0) {
                    }
                    f13 = f7;
                    if ((i13 & 131072) != 0) {
                    }
                    f14 = f11;
                    if ((i13 & 262144) == 0) {
                    }
                    i22 = i21;
                    i23 = i13 & 524288;
                    if (i23 != 0) {
                    }
                    i24 = i22;
                    if ((i18 & 306783379) != 306783378) {
                    }
                    if (i23 != 0) {
                    }
                    C5194q a112222 = C5193p.a(C5179b.g(), interfaceC0966b, u11, ((((i24 >> 27) & 14) | ((i18 >> 3) & 896)) >> 3) & 112);
                    I11 = u11.I();
                    A0 d112222 = u11.d();
                    e f162222 = c.f(u11, eVar6);
                    e eVar72222 = eVar6;
                    Function0 a122222 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 g102222 = b.g(u11, a112222, u11, d112222);
                    if (!u11.t()) {
                    }
                    a.d(I11, u11, I11, g102222);
                    F1.b(u11, f162222, InterfaceC2801g.a.f());
                    if (abstractC8972b != null) {
                    }
                    c3969l.o(-1993959143);
                    if (abstractC8972b == null) {
                    }
                    c3969l2 = c3969l;
                    c3969l2.k();
                    c3969l2.f();
                    eVar5 = eVar72222;
                    m02 = c3969l2.m0();
                    if (m02 != null) {
                    }
                }
                if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                }
                i18 = i17;
                if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                }
                int i312 = i19;
                if ((i13 & 2048) != 0) {
                }
                if ((i13 & 4096) != 0) {
                }
                if ((i13 & 8192) == 0) {
                }
                if ((i13 & 16384) == 0) {
                }
                if ((32768 & i13) == 0) {
                }
                if ((i13 & 65536) == 0) {
                }
                f13 = f7;
                if ((i13 & 131072) != 0) {
                }
                f14 = f11;
                if ((i13 & 262144) == 0) {
                }
                i22 = i21;
                i23 = i13 & 524288;
                if (i23 != 0) {
                }
                i24 = i22;
                if ((i18 & 306783379) != 306783378) {
                }
                if (i23 != 0) {
                }
                C5194q a1122222 = C5193p.a(C5179b.g(), interfaceC0966b, u11, ((((i24 >> 27) & 14) | ((i18 >> 3) & 896)) >> 3) & 112);
                I11 = u11.I();
                A0 d1122222 = u11.d();
                e f1622222 = c.f(u11, eVar6);
                e eVar722222 = eVar6;
                Function0 a1222222 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 g1022222 = b.g(u11, a1122222, u11, d1122222);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, g1022222);
                F1.b(u11, f1622222, InterfaceC2801g.a.f());
                if (abstractC8972b != null) {
                }
                c3969l.o(-1993959143);
                if (abstractC8972b == null) {
                }
                c3969l2 = c3969l;
                c3969l2.k();
                c3969l2.f();
                eVar5 = eVar722222;
                m02 = c3969l2.m0();
                if (m02 != null) {
                }
            }
        }
        if ((i13 & 32) == 0) {
        }
        if ((i13 & 64) == 0) {
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
        }
        if ((i13 & 256) == 0) {
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
        }
        i18 = i17;
        if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
        }
        int i3122 = i19;
        if ((i13 & 2048) != 0) {
        }
        if ((i13 & 4096) != 0) {
        }
        if ((i13 & 8192) == 0) {
        }
        if ((i13 & 16384) == 0) {
        }
        if ((32768 & i13) == 0) {
        }
        if ((i13 & 65536) == 0) {
        }
        f13 = f7;
        if ((i13 & 131072) != 0) {
        }
        f14 = f11;
        if ((i13 & 262144) == 0) {
        }
        i22 = i21;
        i23 = i13 & 524288;
        if (i23 != 0) {
        }
        i24 = i22;
        if ((i18 & 306783379) != 306783378) {
        }
        if (i23 != 0) {
        }
        C5194q a11222222 = C5193p.a(C5179b.g(), interfaceC0966b, u11, ((((i24 >> 27) & 14) | ((i18 >> 3) & 896)) >> 3) & 112);
        I11 = u11.I();
        A0 d11222222 = u11.d();
        e f16222222 = c.f(u11, eVar6);
        e eVar7222222 = eVar6;
        Function0 a12222222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g10222222 = b.g(u11, a11222222, u11, d11222222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g10222222);
        F1.b(u11, f16222222, InterfaceC2801g.a.f());
        if (abstractC8972b != null) {
        }
        c3969l.o(-1993959143);
        if (abstractC8972b == null) {
        }
        c3969l2 = c3969l;
        c3969l2.k();
        c3969l2.f();
        eVar5 = eVar7222222;
        m02 = c3969l2.m0();
        if (m02 != null) {
        }
    }

    /* renamed from: FoundationButton-9jbtD_0, reason: not valid java name */
    public static final void m2979FoundationButton9jbtD_0(@NotNull e modifier, @NotNull e iconModifier, @NotNull e titleModifier, @NotNull e subtitleModifier, @NotNull String title, String str, AbstractC8972b abstractC8972b, boolean z11, boolean z12, @NotNull A1<Float> titleAlpha, @NotNull A1<Float> subtitleAlpha, @NotNull A1<Float> iconAlpha, @NotNull T titleTextStyle, @NotNull T subtitleTextStyle, long j11, long j12, long j13, float f7, float f11, float f12, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> loader, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        int i15;
        String str2;
        int i16;
        int i17;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(iconModifier, "iconModifier");
        Intrinsics.checkNotNullParameter(titleModifier, "titleModifier");
        Intrinsics.checkNotNullParameter(subtitleModifier, "subtitleModifier");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleAlpha, "titleAlpha");
        Intrinsics.checkNotNullParameter(subtitleAlpha, "subtitleAlpha");
        Intrinsics.checkNotNullParameter(iconAlpha, "iconAlpha");
        Intrinsics.checkNotNullParameter(titleTextStyle, "titleTextStyle");
        Intrinsics.checkNotNullParameter(subtitleTextStyle, "subtitleTextStyle");
        Intrinsics.checkNotNullParameter(loader, "loader");
        C3969l u11 = interfaceC3967k.u(-610536382);
        if ((i11 & 6) == 0) {
            i14 = i11 | (u11.n(modifier) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= u11.n(iconModifier) ? 32 : 16;
        }
        int i18 = i11 & 384;
        int i19 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i18 == 0) {
            i14 |= u11.n(titleModifier) ? 256 : 128;
        }
        int i21 = i11 & 3072;
        int i22 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i21 == 0) {
            i14 |= u11.n(subtitleModifier) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i14 |= u11.n(title) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i15 = 196608;
            str2 = str;
            i14 |= u11.n(str2) ? 131072 : 65536;
        } else {
            i15 = 196608;
            str2 = str;
        }
        if ((i11 & 1572864) == 0) {
            i14 |= u11.n(abstractC8972b) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i14 |= u11.p(z11) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i14 |= u11.p(z12) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i14 |= u11.n(titleAlpha) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i16 = i12 | (u11.n(subtitleAlpha) ? 4 : 2);
        } else {
            i16 = i12;
        }
        if ((i12 & 48) == 0) {
            i16 |= u11.n(iconAlpha) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            if (u11.n(titleTextStyle)) {
                i19 = 256;
            }
            i16 |= i19;
        }
        if ((i12 & 3072) == 0) {
            if (u11.n(subtitleTextStyle)) {
                i22 = 2048;
            }
            i16 |= i22;
        }
        if ((i12 & 24576) == 0) {
            i16 |= u11.s(j11) ? 16384 : 8192;
        }
        if ((i12 & i15) == 0) {
            i16 |= u11.s(j12) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i16 |= u11.s(j13) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i16 |= u11.q(f7) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i16 |= u11.q(f11) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i16 |= u11.q(f12) ? 536870912 : 268435456;
        }
        if ((i13 & 6) == 0) {
            i17 = i13 | (u11.F(loader) ? 4 : 2);
        } else {
            i17 = i13;
        }
        if ((i14 & 306783379) == 306783378 && (i16 & 306783379) == 306783378 && (i17 & 3) == 2 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            S a11 = m1.a(titleAlpha);
            S a12 = m1.a(subtitleAlpha);
            S a13 = m1.a(iconAlpha);
            u11.o(373260418);
            C4912a c11 = z12 ? a1.c.c(1848574409, new FoundationButtonKt$FoundationButton$1(loader), u11) : null;
            u11.k();
            int i23 = i16 << 6;
            int i24 = i16 >> 24;
            C4912a c4912a = c11;
            int i25 = (i24 & 14) | 3072 | (i24 & 112);
            int i26 = i14 << 12;
            c3969l = u11;
            m2980FoundationButtonfOU4Dw4(title, str2, abstractC8972b, z11, titleTextStyle, subtitleTextStyle, j11, j12, j13, f7, f11, f12, c4912a, null, modifier, iconModifier, titleModifier, subtitleModifier, a11, a12, a13, c3969l, ((i14 >> 12) & 8190) | (i23 & 57344) | (i23 & 458752) | (i23 & 3670016) | (i23 & 29360128) | (i23 & 234881024) | (i23 & 1879048192), i25 | (i26 & 57344) | (i26 & 458752) | (i26 & 3670016) | (i26 & 29360128), 0, 0);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new FoundationButtonKt$FoundationButton$2(modifier, iconModifier, titleModifier, subtitleModifier, title, str, abstractC8972b, z11, z12, titleAlpha, subtitleAlpha, iconAlpha, titleTextStyle, subtitleTextStyle, j11, j12, j13, f7, f11, f12, loader, i11, i12, i13));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ef  */
    /* renamed from: FoundationButton-fOU4Dw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2980FoundationButtonfOU4Dw4(@NotNull String title, String str, AbstractC8972b abstractC8972b, boolean z11, @NotNull T titleTextStyle, @NotNull T subtitleTextStyle, long j11, long j12, long j13, float f7, float f11, final float f12, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, e eVar, e eVar2, e eVar3, e eVar4, S s11, S s12, S s13, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13, int i14) {
        int i15;
        AbstractC8972b abstractC8972b2;
        boolean z12;
        long j14;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        e eVar5;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int I11;
        e eVar6;
        S s14;
        S s15;
        S s16;
        e eVar7;
        C3969l c3969l;
        e eVar8;
        e eVar9;
        e eVar10;
        e eVar11;
        e eVar12;
        S s17;
        S s18;
        C3969l c3969l2;
        e eVar13;
        S s19;
        J0 m02;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleTextStyle, "titleTextStyle");
        Intrinsics.checkNotNullParameter(subtitleTextStyle, "subtitleTextStyle");
        C3969l u11 = interfaceC3967k.u(-461886187);
        if ((i14 & 1) != 0) {
            i15 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i15 = i11 | (u11.n(title) ? 4 : 2);
        } else {
            i15 = i11;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i11 & 48) == 0) {
            i15 |= u11.n(str) ? 32 : 16;
        }
        int i31 = i15;
        if ((i14 & 4) != 0) {
            i31 |= 384;
        } else if ((i11 & 384) == 0) {
            abstractC8972b2 = abstractC8972b;
            i31 |= u11.n(abstractC8972b2) ? 256 : 128;
            if ((i14 & 8) == 0) {
                i31 |= 3072;
            } else if ((i11 & 3072) == 0) {
                z12 = z11;
                i31 |= u11.p(z12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                if ((i14 & 16) != 0) {
                    i31 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    i31 |= u11.n(titleTextStyle) ? 16384 : 8192;
                }
                if ((i14 & 32) != 0) {
                    i31 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    i31 |= u11.n(subtitleTextStyle) ? 131072 : 65536;
                }
                if ((i14 & 64) != 0) {
                    i31 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    j14 = j11;
                    i16 = i31 | (u11.s(j14) ? 1048576 : 524288);
                    if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                        i17 = i16 | 12582912;
                    } else {
                        i17 = i16;
                        if ((i11 & 12582912) == 0) {
                            i17 |= u11.s(j12) ? 8388608 : 4194304;
                        }
                    }
                    if ((i14 & 256) == 0) {
                        i17 |= 100663296;
                    } else if ((i11 & 100663296) == 0) {
                        i17 |= u11.s(j13) ? 67108864 : 33554432;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                        i17 |= 805306368;
                    } else if ((i11 & 805306368) == 0) {
                        i17 |= u11.q(f7) ? 536870912 : 268435456;
                        if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                            i18 = i12 | 6;
                        } else if ((i12 & 6) == 0) {
                            i18 = i12 | (u11.q(f11) ? 4 : 2);
                        } else {
                            i18 = i12;
                        }
                        if ((i14 & 2048) != 0) {
                            i18 |= 48;
                        } else if ((i12 & 48) == 0) {
                            i18 |= u11.q(f12) ? 32 : 16;
                        }
                        int i32 = i18;
                        if ((i14 & 4096) != 0) {
                            i21 = i32 | 384;
                            i19 = i12;
                        } else {
                            i19 = i12;
                            if ((i19 & 384) == 0) {
                                i21 = i32 | (u11.F(function2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN);
                            } else {
                                i21 = i32;
                            }
                        }
                        if ((i14 & 8192) != 0) {
                            i21 |= 3072;
                        } else if ((i19 & 3072) == 0) {
                            i21 |= u11.F(function22) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                        }
                        i22 = i14 & 16384;
                        if (i22 != 0) {
                            i21 |= 24576;
                        } else if ((i19 & 24576) == 0) {
                            eVar5 = eVar;
                            i21 |= u11.n(eVar5) ? 16384 : 8192;
                            i23 = 32768 & i14;
                            if (i23 == 0) {
                                i21 |= 196608;
                            } else if ((i19 & 196608) == 0) {
                                i21 |= u11.n(eVar2) ? 131072 : 65536;
                            }
                            i24 = i14 & 65536;
                            if (i24 == 0) {
                                i21 |= 1572864;
                            } else if ((i19 & 1572864) == 0) {
                                i21 |= u11.n(eVar3) ? 1048576 : 524288;
                            }
                            i25 = i14 & 131072;
                            if (i25 == 0) {
                                i21 |= 12582912;
                            } else if ((i19 & 12582912) == 0) {
                                i21 |= u11.n(eVar4) ? 8388608 : 4194304;
                            }
                            i26 = i14 & 262144;
                            if (i26 == 0) {
                                i21 |= 100663296;
                            } else if ((i19 & 100663296) == 0) {
                                i21 |= u11.n(s11) ? 67108864 : 33554432;
                            }
                            i27 = i14 & 524288;
                            if (i27 == 0) {
                                i21 |= 805306368;
                            } else if ((i19 & 805306368) == 0) {
                                i21 |= u11.n(s12) ? 536870912 : 268435456;
                            }
                            int i33 = i21;
                            i28 = i14 & 1048576;
                            if (i28 == 0) {
                                i29 = i13 | 6;
                            } else if ((i13 & 6) == 0) {
                                i29 = i13 | (u11.n(s13) ? 4 : 2);
                            } else {
                                i29 = i13;
                            }
                            if ((i17 & 306783379) != 306783378 && (i33 & 306783379) == 306783378 && (i29 & 3) == 2 && u11.b()) {
                                u11.j();
                                eVar10 = eVar2;
                                eVar11 = eVar3;
                                eVar12 = eVar4;
                                s17 = s11;
                                s19 = s12;
                                s18 = s13;
                                eVar13 = eVar5;
                                c3969l2 = u11;
                            } else {
                                e eVar14 = i22 == 0 ? e.f40358c0 : eVar5;
                                e eVar15 = i23 == 0 ? e.f40358c0 : eVar2;
                                e eVar16 = i24 == 0 ? e.f40358c0 : eVar3;
                                e eVar17 = i25 == 0 ? e.f40358c0 : eVar4;
                                S s21 = i26 == 0 ? null : s11;
                                S s22 = i27 == 0 ? null : s12;
                                S s23 = i28 == 0 ? s13 : null;
                                e eVar18 = eVar15;
                                V f13 = C5185h.f(InterfaceC6250b.a.e(), false);
                                I11 = u11.I();
                                e eVar19 = eVar16;
                                A0 d11 = u11.d();
                                e f14 = c.f(u11, eVar14);
                                e eVar20 = eVar14;
                                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                                if (u11.t()) {
                                    u11.e();
                                } else {
                                    u11.H(a11);
                                }
                                Function2 f15 = E.f(u11, f13, u11, d11);
                                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                    a.d(I11, u11, I11, f15);
                                }
                                i.b(u11, f14, -1860442668);
                                if (function2 != null) {
                                    function2.invoke(u11, Integer.valueOf((i33 >> 6) & 14));
                                    Unit unit = Unit.f71690a;
                                }
                                u11.k();
                                e.a aVar = e.f40358c0;
                                e a12 = C6981a.a(aVar, function2 == null ? 0.0f : 1.0f);
                                if (function22 == null) {
                                    u11.o(-1838946482);
                                    u11.o(-1860399757);
                                    boolean z13 = (i33 & 112) == 32;
                                    Object C11 = u11.C();
                                    if (z13 || C11 == InterfaceC3967k.a.a()) {
                                        C11 = new V() { // from class: ru.ozon.uni.foundation.components.button.FoundationButtonKt$FoundationButton$3$2$1

                                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                                            /* renamed from: ru.ozon.uni.foundation.components.button.FoundationButtonKt$FoundationButton$3$2$1$1, reason: invalid class name */
                                            static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
                                                final /* synthetic */ m0 $companionPlaceable;
                                                final /* synthetic */ m0 $contentPlaceable;
                                                final /* synthetic */ float $gap;
                                                final /* synthetic */ int $height;
                                                final /* synthetic */ B1.Y $this_Layout;
                                                final /* synthetic */ int $width;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                AnonymousClass1(m0 m0Var, int i11, m0 m0Var2, int i12, B1.Y y11, float f7) {
                                                    super(1);
                                                    this.$contentPlaceable = m0Var;
                                                    this.$height = i11;
                                                    this.$companionPlaceable = m0Var2;
                                                    this.$width = i12;
                                                    this.$this_Layout = y11;
                                                    this.$gap = f7;
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
                                                    m0 m0Var2 = this.$companionPlaceable;
                                                    int u02 = this.$width - m0Var2.u0();
                                                    int Y02 = this.$this_Layout.Y0(this.$gap) + this.$contentPlaceable.u0();
                                                    if (u02 < Y02) {
                                                        u02 = Y02;
                                                    }
                                                    layout.d(m0Var2, u02, C3354v2.d(this.$height, 2, this.$companionPlaceable), 0.0f);
                                                }
                                            }

                                            @Override // B1.V
                                            /* renamed from: measure-3p2s80s */
                                            public final W mo2measure3p2s80s(B1.Y Layout, List<? extends U> measurables, long j15) {
                                                int Y02;
                                                W z02;
                                                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                                                Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                int i34 = 0;
                                                U u12 = measurables.get(0);
                                                U u13 = measurables.get(1);
                                                m0 a02 = u12.a0(Z1.b.c(0, 0, 0, 0, 10, j15));
                                                if (Z1.b.g(j15)) {
                                                    int k11 = (Z1.b.k(j15) - a02.u0()) - Layout.Y0(f12);
                                                    if (k11 >= 0) {
                                                        i34 = k11;
                                                    }
                                                } else {
                                                    i34 = Z1.b.k(j15);
                                                }
                                                m0 a03 = u13.a0(Z1.b.c(0, i34, 0, 0, 8, j15));
                                                if (Z1.b.g(j15)) {
                                                    Y02 = Z1.b.k(j15);
                                                } else {
                                                    Y02 = Layout.Y0(f12) + a03.u0() + a02.u0();
                                                }
                                                int i35 = Y02;
                                                int max = Math.max(a02.l0(), a03.l0());
                                                z02 = Layout.z0(i35, max, kotlin.collections.U.c(), new AnonymousClass1(a02, max, a03, i35, Layout, f12));
                                                return z02;
                                            }
                                        };
                                        u11.x(C11);
                                    }
                                    V v11 = (V) C11;
                                    u11.k();
                                    int I12 = u11.I();
                                    A0 d12 = u11.d();
                                    e f16 = c.f(u11, aVar);
                                    Function0 a13 = InterfaceC2801g.a.a();
                                    u11.i();
                                    if (u11.t()) {
                                        u11.H(a13);
                                    } else {
                                        u11.e();
                                    }
                                    Function2 f17 = E.f(u11, v11, u11, d12);
                                    if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                                        a.d(I12, u11, I12, f17);
                                    }
                                    F1.b(u11, f16, InterfaceC2801g.a.f());
                                    int i34 = i33 >> 15;
                                    int i35 = i17 << 12;
                                    int i36 = (i34 & 896) | (i34 & 14) | 3072 | (i34 & 112) | (i35 & 57344) | (i35 & 458752) | (i35 & 3670016) | (i35 & 29360128) | (i33 & 234881024) | (i33 & 1879048192);
                                    int i37 = i17 >> 9;
                                    int i38 = (i29 & 14) | (i37 & 112) | (i37 & 896) | (i37 & 7168) | (i37 & 57344) | (i37 & 458752) | (i37 & 3670016);
                                    int i39 = i33 << 21;
                                    int i41 = i38 | (i39 & 29360128) | (i39 & 234881024);
                                    eVar6 = eVar19;
                                    e eVar21 = eVar17;
                                    c3969l = u11;
                                    s16 = s21;
                                    eVar7 = eVar20;
                                    long j15 = j14;
                                    s14 = s23;
                                    s15 = s22;
                                    m2978ButtonContent3Qfi9_U(eVar18, eVar6, eVar21, InterfaceC6250b.a.k(), title, str, abstractC8972b2, z12, s16, s15, s14, titleTextStyle, subtitleTextStyle, j15, j12, j13, f7, f11, f12, null, c3969l, i36, i41, 524288);
                                    function22.invoke(c3969l, Integer.valueOf((i33 >> 9) & 14));
                                    c3969l.f();
                                    c3969l.k();
                                    eVar8 = eVar18;
                                    eVar9 = eVar21;
                                } else {
                                    eVar6 = eVar19;
                                    s14 = s23;
                                    s15 = s22;
                                    s16 = s21;
                                    eVar7 = eVar20;
                                    u11.o(-1836289379);
                                    int i42 = i33 >> 15;
                                    int i43 = i17 << 12;
                                    int i44 = (i42 & 896) | (i42 & 14) | 3072 | (i42 & 112) | (i43 & 57344) | (i43 & 458752) | (i43 & 3670016) | (i43 & 29360128) | (i33 & 234881024) | (i33 & 1879048192);
                                    int i45 = i17 >> 9;
                                    int i46 = (i29 & 14) | (i45 & 112) | (i45 & 896) | (i45 & 7168) | (i45 & 57344) | (i45 & 458752) | (i45 & 3670016);
                                    int i47 = i33 << 21;
                                    c3969l = u11;
                                    eVar8 = eVar18;
                                    eVar9 = eVar17;
                                    m2978ButtonContent3Qfi9_U(eVar8, eVar6, eVar9, InterfaceC6250b.a.g(), title, str, abstractC8972b, z11, s16, s15, s14, titleTextStyle, subtitleTextStyle, j11, j12, j13, f7, f11, f12, a12, c3969l, i44, i46 | (i47 & 29360128) | (i47 & 234881024), 0);
                                    c3969l.k();
                                }
                                c3969l.f();
                                eVar10 = eVar8;
                                eVar11 = eVar6;
                                eVar12 = eVar9;
                                s17 = s16;
                                s18 = s14;
                                c3969l2 = c3969l;
                                eVar13 = eVar7;
                                s19 = s15;
                            }
                            m02 = c3969l2.m0();
                            if (m02 == null) {
                                m02.G(new FoundationButtonKt$FoundationButton$4(title, str, abstractC8972b, z11, titleTextStyle, subtitleTextStyle, j11, j12, j13, f7, f11, f12, function2, function22, eVar13, eVar10, eVar11, eVar12, s17, s19, s18, i11, i12, i13, i14));
                                return;
                            }
                            return;
                        }
                        eVar5 = eVar;
                        i23 = 32768 & i14;
                        if (i23 == 0) {
                        }
                        i24 = i14 & 65536;
                        if (i24 == 0) {
                        }
                        i25 = i14 & 131072;
                        if (i25 == 0) {
                        }
                        i26 = i14 & 262144;
                        if (i26 == 0) {
                        }
                        i27 = i14 & 524288;
                        if (i27 == 0) {
                        }
                        int i332 = i21;
                        i28 = i14 & 1048576;
                        if (i28 == 0) {
                        }
                        if ((i17 & 306783379) != 306783378) {
                        }
                        if (i22 == 0) {
                        }
                        if (i23 == 0) {
                        }
                        if (i24 == 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (i26 == 0) {
                        }
                        if (i27 == 0) {
                        }
                        if (i28 == 0) {
                        }
                        e eVar182 = eVar15;
                        V f132 = C5185h.f(InterfaceC6250b.a.e(), false);
                        I11 = u11.I();
                        e eVar192 = eVar16;
                        A0 d112 = u11.d();
                        e f142 = c.f(u11, eVar14);
                        e eVar202 = eVar14;
                        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                        }
                        Function2 f152 = E.f(u11, f132, u11, d112);
                        if (!u11.t()) {
                        }
                        a.d(I11, u11, I11, f152);
                        i.b(u11, f142, -1860442668);
                        if (function2 != null) {
                        }
                        u11.k();
                        e.a aVar2 = e.f40358c0;
                        e a122 = C6981a.a(aVar2, function2 == null ? 0.0f : 1.0f);
                        if (function22 == null) {
                        }
                        c3969l.f();
                        eVar10 = eVar8;
                        eVar11 = eVar6;
                        eVar12 = eVar9;
                        s17 = s16;
                        s18 = s14;
                        c3969l2 = c3969l;
                        eVar13 = eVar7;
                        s19 = s15;
                        m02 = c3969l2.m0();
                        if (m02 == null) {
                        }
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                    }
                    if ((i14 & 2048) != 0) {
                    }
                    int i322 = i18;
                    if ((i14 & 4096) != 0) {
                    }
                    if ((i14 & 8192) != 0) {
                    }
                    i22 = i14 & 16384;
                    if (i22 != 0) {
                    }
                    eVar5 = eVar;
                    i23 = 32768 & i14;
                    if (i23 == 0) {
                    }
                    i24 = i14 & 65536;
                    if (i24 == 0) {
                    }
                    i25 = i14 & 131072;
                    if (i25 == 0) {
                    }
                    i26 = i14 & 262144;
                    if (i26 == 0) {
                    }
                    i27 = i14 & 524288;
                    if (i27 == 0) {
                    }
                    int i3322 = i21;
                    i28 = i14 & 1048576;
                    if (i28 == 0) {
                    }
                    if ((i17 & 306783379) != 306783378) {
                    }
                    if (i22 == 0) {
                    }
                    if (i23 == 0) {
                    }
                    if (i24 == 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (i26 == 0) {
                    }
                    if (i27 == 0) {
                    }
                    if (i28 == 0) {
                    }
                    e eVar1822 = eVar15;
                    V f1322 = C5185h.f(InterfaceC6250b.a.e(), false);
                    I11 = u11.I();
                    e eVar1922 = eVar16;
                    A0 d1122 = u11.d();
                    e f1422 = c.f(u11, eVar14);
                    e eVar2022 = eVar14;
                    Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 f1522 = E.f(u11, f1322, u11, d1122);
                    if (!u11.t()) {
                    }
                    a.d(I11, u11, I11, f1522);
                    i.b(u11, f1422, -1860442668);
                    if (function2 != null) {
                    }
                    u11.k();
                    e.a aVar22 = e.f40358c0;
                    e a1222 = C6981a.a(aVar22, function2 == null ? 0.0f : 1.0f);
                    if (function22 == null) {
                    }
                    c3969l.f();
                    eVar10 = eVar8;
                    eVar11 = eVar6;
                    eVar12 = eVar9;
                    s17 = s16;
                    s18 = s14;
                    c3969l2 = c3969l;
                    eVar13 = eVar7;
                    s19 = s15;
                    m02 = c3969l2.m0();
                    if (m02 == null) {
                    }
                }
                i16 = i31;
                j14 = j11;
                if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                }
                if ((i14 & 256) == 0) {
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                }
                if ((i14 & 2048) != 0) {
                }
                int i3222 = i18;
                if ((i14 & 4096) != 0) {
                }
                if ((i14 & 8192) != 0) {
                }
                i22 = i14 & 16384;
                if (i22 != 0) {
                }
                eVar5 = eVar;
                i23 = 32768 & i14;
                if (i23 == 0) {
                }
                i24 = i14 & 65536;
                if (i24 == 0) {
                }
                i25 = i14 & 131072;
                if (i25 == 0) {
                }
                i26 = i14 & 262144;
                if (i26 == 0) {
                }
                i27 = i14 & 524288;
                if (i27 == 0) {
                }
                int i33222 = i21;
                i28 = i14 & 1048576;
                if (i28 == 0) {
                }
                if ((i17 & 306783379) != 306783378) {
                }
                if (i22 == 0) {
                }
                if (i23 == 0) {
                }
                if (i24 == 0) {
                }
                if (i25 == 0) {
                }
                if (i26 == 0) {
                }
                if (i27 == 0) {
                }
                if (i28 == 0) {
                }
                e eVar18222 = eVar15;
                V f13222 = C5185h.f(InterfaceC6250b.a.e(), false);
                I11 = u11.I();
                e eVar19222 = eVar16;
                A0 d11222 = u11.d();
                e f14222 = c.f(u11, eVar14);
                e eVar20222 = eVar14;
                Function0 a11222 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 f15222 = E.f(u11, f13222, u11, d11222);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, f15222);
                i.b(u11, f14222, -1860442668);
                if (function2 != null) {
                }
                u11.k();
                e.a aVar222 = e.f40358c0;
                e a12222 = C6981a.a(aVar222, function2 == null ? 0.0f : 1.0f);
                if (function22 == null) {
                }
                c3969l.f();
                eVar10 = eVar8;
                eVar11 = eVar6;
                eVar12 = eVar9;
                s17 = s16;
                s18 = s14;
                c3969l2 = c3969l;
                eVar13 = eVar7;
                s19 = s15;
                m02 = c3969l2.m0();
                if (m02 == null) {
                }
            }
            z12 = z11;
            if ((i14 & 16) != 0) {
            }
            if ((i14 & 32) != 0) {
            }
            if ((i14 & 64) != 0) {
            }
            i16 = i31;
            j14 = j11;
            if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
            }
            if ((i14 & 256) == 0) {
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            }
            if ((i14 & 2048) != 0) {
            }
            int i32222 = i18;
            if ((i14 & 4096) != 0) {
            }
            if ((i14 & 8192) != 0) {
            }
            i22 = i14 & 16384;
            if (i22 != 0) {
            }
            eVar5 = eVar;
            i23 = 32768 & i14;
            if (i23 == 0) {
            }
            i24 = i14 & 65536;
            if (i24 == 0) {
            }
            i25 = i14 & 131072;
            if (i25 == 0) {
            }
            i26 = i14 & 262144;
            if (i26 == 0) {
            }
            i27 = i14 & 524288;
            if (i27 == 0) {
            }
            int i332222 = i21;
            i28 = i14 & 1048576;
            if (i28 == 0) {
            }
            if ((i17 & 306783379) != 306783378) {
            }
            if (i22 == 0) {
            }
            if (i23 == 0) {
            }
            if (i24 == 0) {
            }
            if (i25 == 0) {
            }
            if (i26 == 0) {
            }
            if (i27 == 0) {
            }
            if (i28 == 0) {
            }
            e eVar182222 = eVar15;
            V f132222 = C5185h.f(InterfaceC6250b.a.e(), false);
            I11 = u11.I();
            e eVar192222 = eVar16;
            A0 d112222 = u11.d();
            e f142222 = c.f(u11, eVar14);
            e eVar202222 = eVar14;
            Function0 a112222 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f152222 = E.f(u11, f132222, u11, d112222);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f152222);
            i.b(u11, f142222, -1860442668);
            if (function2 != null) {
            }
            u11.k();
            e.a aVar2222 = e.f40358c0;
            e a122222 = C6981a.a(aVar2222, function2 == null ? 0.0f : 1.0f);
            if (function22 == null) {
            }
            c3969l.f();
            eVar10 = eVar8;
            eVar11 = eVar6;
            eVar12 = eVar9;
            s17 = s16;
            s18 = s14;
            c3969l2 = c3969l;
            eVar13 = eVar7;
            s19 = s15;
            m02 = c3969l2.m0();
            if (m02 == null) {
            }
        }
        abstractC8972b2 = abstractC8972b;
        if ((i14 & 8) == 0) {
        }
        z12 = z11;
        if ((i14 & 16) != 0) {
        }
        if ((i14 & 32) != 0) {
        }
        if ((i14 & 64) != 0) {
        }
        i16 = i31;
        j14 = j11;
        if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
        }
        if ((i14 & 256) == 0) {
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
        }
        if ((i14 & 2048) != 0) {
        }
        int i322222 = i18;
        if ((i14 & 4096) != 0) {
        }
        if ((i14 & 8192) != 0) {
        }
        i22 = i14 & 16384;
        if (i22 != 0) {
        }
        eVar5 = eVar;
        i23 = 32768 & i14;
        if (i23 == 0) {
        }
        i24 = i14 & 65536;
        if (i24 == 0) {
        }
        i25 = i14 & 131072;
        if (i25 == 0) {
        }
        i26 = i14 & 262144;
        if (i26 == 0) {
        }
        i27 = i14 & 524288;
        if (i27 == 0) {
        }
        int i3322222 = i21;
        i28 = i14 & 1048576;
        if (i28 == 0) {
        }
        if ((i17 & 306783379) != 306783378) {
        }
        if (i22 == 0) {
        }
        if (i23 == 0) {
        }
        if (i24 == 0) {
        }
        if (i25 == 0) {
        }
        if (i26 == 0) {
        }
        if (i27 == 0) {
        }
        if (i28 == 0) {
        }
        e eVar1822222 = eVar15;
        V f1322222 = C5185h.f(InterfaceC6250b.a.e(), false);
        I11 = u11.I();
        e eVar1922222 = eVar16;
        A0 d1122222 = u11.d();
        e f1422222 = c.f(u11, eVar14);
        e eVar2022222 = eVar14;
        Function0 a1122222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f1522222 = E.f(u11, f1322222, u11, d1122222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f1522222);
        i.b(u11, f1422222, -1860442668);
        if (function2 != null) {
        }
        u11.k();
        e.a aVar22222 = e.f40358c0;
        e a1222222 = C6981a.a(aVar22222, function2 == null ? 0.0f : 1.0f);
        if (function22 == null) {
        }
        c3969l.f();
        eVar10 = eVar8;
        eVar11 = eVar6;
        eVar12 = eVar9;
        s17 = s16;
        s18 = s14;
        c3969l2 = c3969l;
        eVar13 = eVar7;
        s19 = s15;
        m02 = c3969l2.m0();
        if (m02 == null) {
        }
    }

    /* renamed from: TitleText-yrwZFoE, reason: not valid java name */
    private static final void m2981TitleTextyrwZFoE(e eVar, String str, S s11, T t2, long j11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        interfaceC3967k.o(774424716);
        boolean z11 = true;
        e eVar2 = (i12 & 1) != 0 ? e.f40358c0 : eVar;
        interfaceC3967k.o(1513912267);
        if (s11 != null) {
            interfaceC3967k.o(1513914110);
            if ((((i11 & 896) ^ 384) <= 256 || !interfaceC3967k.n(s11)) && (i11 & 384) != 256) {
                z11 = false;
            }
            Object C11 = interfaceC3967k.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new FoundationButtonKt$TitleText$1$1(s11);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            eVar2 = androidx.compose.ui.graphics.a.a(eVar2, (Function1) C11);
        }
        interfaceC3967k.k();
        u3.b(str, eVar2, j11, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, t2, interfaceC3967k, ((i11 >> 3) & 14) | ((i11 >> 6) & 896), ((i11 << 9) & 3670016) | 3120, 55288);
        interfaceC3967k.k();
    }
}
