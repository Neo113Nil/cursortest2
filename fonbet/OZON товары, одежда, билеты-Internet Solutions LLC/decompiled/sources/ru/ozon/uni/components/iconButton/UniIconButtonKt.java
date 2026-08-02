package ru.ozon.uni.components.iconButton;

import A0.g;
import A0.h;
import B1.InterfaceC2547p;
import B1.V;
import D1.InterfaceC2801g;
import I1.i;
import P9.a;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import T7.E;
import androidx.compose.foundation.layout.C5185h;
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
import l1.K0;
import n0.C8385f;
import n0.C8391l;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.components.iconButton.UniIconButtonStyle;
import ru.ozon.uni.components.loader.UniLoaderKt;
import ru.ozon.uni.core.compose.tokens.UniPainter;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.foundation.components.icon.ScaledClipKt;
import ru.ozon.uni.utils.DeferredBrush;
import ru.ozon.uni.utils.DeferredColor;
import ru.ozon.uni.utils.UniTestTagsKt;
import ru.ozon.uni.utils.VisualEffectsKt;
import t0.p;
import t0.q;
import t0.u;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u008f\u0001\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019²\u0006\f\u0010\u0018\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lq1/b;", "icon", "Lru/ozon/uni/components/iconButton/UniIconButtonStyle;", "style", "Lru/ozon/uni/components/iconButton/UniIconButtonSize;", "size", "Landroidx/compose/ui/e;", "modifier", "Lru/ozon/uni/components/iconButton/UniIconButtonResizing;", "resizing", "Ln0/l;", "border", "", "isLoading", "isEnabled", "isRounded", "isHoverEnabled", "Lkotlin/Function0;", "", "onClick", "Lt0/q;", "interactionSource", "UniIconButton", "(Lq1/b;Lru/ozon/uni/components/iconButton/UniIconButtonStyle;Lru/ozon/uni/components/iconButton/UniIconButtonSize;Landroidx/compose/ui/e;Lru/ozon/uni/components/iconButton/UniIconButtonResizing;Ln0/l;ZZZZLkotlin/jvm/functions/Function0;Lt0/q;LS0/k;III)V", "isPressed", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniIconButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0301 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x027e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UniIconButton(@NotNull AbstractC8972b icon, UniIconButtonStyle uniIconButtonStyle, UniIconButtonSize uniIconButtonSize, e eVar, UniIconButtonResizing uniIconButtonResizing, C8391l c8391l, boolean z11, boolean z12, boolean z13, boolean z14, Function0<Unit> function0, q qVar, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        UniIconButtonStyle uniIconButtonStyle2;
        int i15;
        UniIconButtonSize uniIconButtonSize2;
        int i16;
        e eVar2;
        int i17;
        UniIconButtonResizing uniIconButtonResizing2;
        int i18;
        C8391l c8391l2;
        int i19;
        boolean z15;
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
        UniIconButtonStyle uniIconButtonStyle3;
        boolean z16;
        boolean z17;
        q qVar2;
        UniIconButtonSize uniIconButtonSize3;
        UniPainter uniPainter;
        AbstractC7799Q abstractC7799Q;
        float f7;
        float f11;
        boolean z18;
        q qVar3;
        g gVar;
        Function0<Unit> function02;
        boolean z19;
        Object C11;
        int I11;
        boolean q11;
        Object C12;
        C8391l c8391l3;
        Function0<Unit> function03;
        boolean z21;
        boolean z22;
        boolean z23;
        e eVar3;
        q qVar4;
        boolean z24;
        e hoverEffect$default;
        e.a aVar;
        e d11;
        J0 m02;
        Intrinsics.checkNotNullParameter(icon, "icon");
        C3969l u11 = interfaceC3967k.u(-1679503809);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (u11.n(icon) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        int i33 = i13 & 2;
        if (i33 != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            uniIconButtonStyle2 = uniIconButtonStyle;
            i14 |= u11.n(uniIconButtonStyle2) ? 32 : 16;
            i15 = i13 & 4;
            if (i15 == 0) {
                i14 |= 384;
            } else if ((i11 & 384) == 0) {
                uniIconButtonSize2 = uniIconButtonSize;
                i14 |= u11.n(uniIconButtonSize2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i16 = i13 & 8;
                if (i16 != 0) {
                    i14 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    eVar2 = eVar;
                    i14 |= u11.n(eVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    i17 = i13 & 16;
                    if (i17 == 0) {
                        i14 |= 24576;
                    } else if ((i11 & 24576) == 0) {
                        uniIconButtonResizing2 = uniIconButtonResizing;
                        i14 |= u11.n(uniIconButtonResizing2) ? 16384 : 8192;
                        i18 = i13 & 32;
                        if (i18 != 0) {
                            i14 |= 196608;
                            c8391l2 = c8391l;
                        } else {
                            c8391l2 = c8391l;
                            if ((i11 & 196608) == 0) {
                                i14 |= u11.n(c8391l2) ? 131072 : 65536;
                            }
                        }
                        i19 = i13 & 64;
                        if (i19 != 0) {
                            i14 |= 1572864;
                            z15 = z11;
                        } else {
                            z15 = z11;
                            if ((i11 & 1572864) == 0) {
                                i14 |= u11.p(z15) ? 1048576 : 524288;
                            }
                        }
                        i21 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i21 != 0) {
                            i14 |= 12582912;
                        } else if ((i11 & 12582912) == 0) {
                            i22 = i14 | (u11.p(z12) ? 8388608 : 4194304);
                            i23 = i13 & 256;
                            if (i23 == 0) {
                                i22 |= 100663296;
                            } else if ((i11 & 100663296) == 0) {
                                i24 = i23;
                                i22 |= u11.p(z13) ? 67108864 : 33554432;
                                i25 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                                if (i25 != 0) {
                                    i22 |= 805306368;
                                } else if ((i11 & 805306368) == 0) {
                                    i26 = i25;
                                    i22 |= u11.p(z14) ? 536870912 : 268435456;
                                    i27 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                                    if (i27 == 0) {
                                        i29 = i12 | 6;
                                        i28 = i27;
                                    } else if ((i12 & 6) == 0) {
                                        i28 = i27;
                                        i29 = i12 | (u11.F(function0) ? 4 : 2);
                                    } else {
                                        i28 = i27;
                                        i29 = i12;
                                    }
                                    i31 = i13 & 2048;
                                    if (i31 == 0) {
                                        i29 |= 48;
                                    } else if ((i12 & 48) == 0) {
                                        i32 = i31;
                                        i29 |= u11.n(qVar) ? 32 : 16;
                                        if ((i22 & 306783379) != 306783378 && (i29 & 19) == 18 && u11.b()) {
                                            u11.j();
                                            z22 = z14;
                                            qVar4 = qVar;
                                            c8391l3 = c8391l2;
                                            z23 = z15;
                                            uniIconButtonStyle3 = uniIconButtonStyle2;
                                            uniIconButtonSize3 = uniIconButtonSize2;
                                            eVar3 = eVar2;
                                            z21 = z12;
                                            z24 = z13;
                                            function03 = function0;
                                        } else {
                                            uniIconButtonStyle3 = i33 != 0 ? UniIconButtonStyle.ActionPrimary.INSTANCE : uniIconButtonStyle2;
                                            UniIconButtonSize uniIconButtonSize4 = i15 != 0 ? UniIconButtonSize.SIZE_400 : uniIconButtonSize2;
                                            e eVar4 = i16 != 0 ? e.f40358c0 : eVar2;
                                            if (i17 != 0) {
                                                uniIconButtonResizing2 = UniIconButtonResizing.HUG;
                                            }
                                            if (i18 != 0) {
                                                c8391l2 = null;
                                            }
                                            if (i19 != 0) {
                                                z15 = false;
                                            }
                                            z16 = i21 != 0 ? true : z12;
                                            boolean z25 = i24 != 0 ? false : z13;
                                            z17 = i26 != 0 ? false : z14;
                                            Function0<Unit> function04 = i28 != 0 ? null : function0;
                                            if (i32 != 0) {
                                                u11.o(-1357128896);
                                                Object C13 = u11.C();
                                                if (C13 == InterfaceC3967k.a.a()) {
                                                    C13 = p.a();
                                                    u11.x(C13);
                                                }
                                                qVar2 = (q) C13;
                                                u11.k();
                                            } else {
                                                qVar2 = qVar;
                                            }
                                            InterfaceC3978p0 a11 = u.a(qVar2, u11, (i29 >> 3) & 14);
                                            g e11 = z25 ? h.e() : h.b(uniIconButtonSize4.getCornerRadius());
                                            uniIconButtonSize3 = uniIconButtonSize4;
                                            e e12 = uniIconButtonResizing2 == UniIconButtonResizing.FILL ? a0.e(a0.f(eVar4, uniIconButtonSize3.getSize()), 1.0f) : a0.n(eVar4, uniIconButtonSize3.getSize());
                                            UniIconButtonColors enabled = z16 ? uniIconButtonStyle3.getEnabled() : uniIconButtonStyle3.getDisabled();
                                            UniIconButtonResizing uniIconButtonResizing3 = uniIconButtonResizing2;
                                            AbstractC7799Q value = DeferredBrush.getValue(enabled.getBackgroundColor(), u11, 0);
                                            e eVar5 = eVar4;
                                            AbstractC7799Q value2 = DeferredBrush.getValue(enabled.getIconColor(), u11, 0);
                                            long value3 = DeferredColor.getValue(enabled.getLoaderColor(), u11, 0);
                                            uniPainter = icon instanceof UniPainter ? (UniPainter) icon : null;
                                            if (uniPainter == null && uniPainter.getIsMulticolor()) {
                                                abstractC7799Q = null;
                                                if (!z16) {
                                                    f11 = 0.4f;
                                                } else if (z15) {
                                                    f11 = 0.0f;
                                                } else {
                                                    f7 = 1.0f;
                                                    u11.o(-1357069483);
                                                    if (c8391l2 == null) {
                                                        if (z16) {
                                                            z18 = z15;
                                                            qVar3 = qVar2;
                                                            gVar = e11;
                                                            d11 = C8385f.d(e12, c8391l2.c(), c8391l2.b(), gVar);
                                                        } else {
                                                            z18 = z15;
                                                            qVar3 = qVar2;
                                                            long graphicTertiary = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicTertiary();
                                                            C8391l a12 = C8391l.a(c8391l2, new K0(C7807Z.o(C7807Z.q(graphicTertiary) * f7, graphicTertiary)));
                                                            gVar = e11;
                                                            d11 = C8385f.d(e12, a12.c(), a12.b(), gVar);
                                                        }
                                                        e12 = d11;
                                                    } else {
                                                        z18 = z15;
                                                        qVar3 = qVar2;
                                                        gVar = e11;
                                                    }
                                                    C8391l c8391l4 = c8391l2;
                                                    e a13 = androidx.compose.foundation.e.a(c8391l2 == null ? ScaledClipKt.m2996scaledClipwH6b6FI(e12, gVar, (float) 0.2d) : C6988h.a(e12, gVar), value, null, 6);
                                                    function02 = function04;
                                                    boolean z26 = (z16 || function02 == null) ? false : true;
                                                    i a14 = i.a(0);
                                                    u11.o(-1357074578);
                                                    z19 = (i29 & 14) != 4;
                                                    C11 = u11.C();
                                                    if (!z19 || C11 == InterfaceC3967k.a.a()) {
                                                        C11 = new UniIconButtonKt$UniIconButton$4$1(function02);
                                                        u11.x(C11);
                                                    }
                                                    u11.k();
                                                    e b11 = androidx.compose.foundation.i.b(a13, qVar3, null, z26, null, a14, (Function0) C11, 8);
                                                    q qVar5 = qVar3;
                                                    e uniTestTag = UniTestTagsKt.uniTestTag(b11, UniIconButtonTestTags.Container, null, u11, 48, 2);
                                                    a.b(uniTestTag, "container");
                                                    if (z17) {
                                                        e.a aVar2 = e.f40358c0;
                                                        if (uniIconButtonStyle3 instanceof UniIconButtonStyle.Custom) {
                                                            u11.o(-772763809);
                                                            C7807Z customHoverColor = uniIconButtonStyle3.getEnabled().getCustomHoverColor();
                                                            if (customHoverColor == null) {
                                                                aVar = aVar2;
                                                                hoverEffect$default = null;
                                                            } else {
                                                                long w11 = customHoverColor.w();
                                                                u11.o(1264623332);
                                                                boolean n11 = u11.n(a11);
                                                                Object C14 = u11.C();
                                                                if (n11 || C14 == InterfaceC3967k.a.a()) {
                                                                    C14 = new UniIconButtonKt$UniIconButton$5$1$1$1(a11);
                                                                    u11.x(C14);
                                                                }
                                                                u11.k();
                                                                hoverEffect$default = VisualEffectsKt.m3269hoverEffect8wvRk98$default(aVar2, (Function0) C14, true, C7807Z.m(w11), 0.0f, 8, null);
                                                                aVar = aVar2;
                                                            }
                                                            if (hoverEffect$default == null) {
                                                                hoverEffect$default = aVar;
                                                            }
                                                            u11.k();
                                                        } else {
                                                            u11.o(-772527682);
                                                            u11.o(-163466235);
                                                            boolean n12 = u11.n(a11);
                                                            Object C15 = u11.C();
                                                            if (n12 || C15 == InterfaceC3967k.a.a()) {
                                                                C15 = new UniIconButtonKt$UniIconButton$5$2$1(a11);
                                                                u11.x(C15);
                                                            }
                                                            u11.k();
                                                            hoverEffect$default = VisualEffectsKt.hoverEffect$default(aVar2, (Function0) C15, true, DeferredBrush.getValue(uniIconButtonStyle3.getEnabled().getIconColor(), u11, 0), 0.0f, 8, null);
                                                            u11.k();
                                                        }
                                                        uniTestTag = uniTestTag.l0(hoverEffect$default);
                                                    }
                                                    u11.k();
                                                    V f12 = C5185h.f(InterfaceC6250b.a.e(), false);
                                                    I11 = u11.I();
                                                    A0 d12 = u11.d();
                                                    e f13 = c.f(u11, uniTestTag);
                                                    Function0 a15 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                                                    if (u11.t()) {
                                                        u11.e();
                                                    } else {
                                                        u11.H(a15);
                                                    }
                                                    Function2 f14 = E.f(u11, f12, u11, d12);
                                                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                                        Ep.a.d(I11, u11, I11, f14);
                                                    }
                                                    U7.i.b(u11, f13, -163460683);
                                                    if (z18) {
                                                        UniLoaderKt.m1924UniLoader3IgeMak(null, value3, uniIconButtonSize3.getLoaderSize(), u11, 0, 1);
                                                    }
                                                    u11.k();
                                                    e.a aVar3 = e.f40358c0;
                                                    e j11 = a0.j(aVar3, uniIconButtonSize3.getIconSize());
                                                    u11.o(-163453875);
                                                    q11 = u11.q(f7);
                                                    C12 = u11.C();
                                                    if (!q11 || C12 == InterfaceC3967k.a.a()) {
                                                        C12 = new UniIconButtonKt$UniIconButton$6$1$1(f7);
                                                        u11.x(C12);
                                                    }
                                                    u11.k();
                                                    e a16 = androidx.compose.ui.graphics.a.a(j11, (Function1) C12);
                                                    if (abstractC7799Q != null) {
                                                        u11.o(1264643822);
                                                        Object C16 = u11.C();
                                                        if (C16 == InterfaceC3967k.a.a()) {
                                                            C16 = UniIconButtonKt$UniIconButton$6$2$1$1.INSTANCE;
                                                            u11.x(C16);
                                                        }
                                                        u11.k();
                                                        e a17 = androidx.compose.ui.graphics.a.a(a16, (Function1) C16);
                                                        u11.o(1264647032);
                                                        boolean n13 = u11.n(abstractC7799Q);
                                                        Object C17 = u11.C();
                                                        if (n13 || C17 == InterfaceC3967k.a.a()) {
                                                            C17 = new UniIconButtonKt$UniIconButton$6$2$2$1(abstractC7799Q);
                                                            u11.x(C17);
                                                        }
                                                        u11.k();
                                                        a16 = androidx.compose.ui.draw.c.c(a17, (Function1) C17);
                                                    }
                                                    if (!z18) {
                                                        a16 = a16.l0(androidx.compose.ui.draw.e.a(aVar3, icon, null, InterfaceC2547p.a.d(), 0.0f, null, 52));
                                                    }
                                                    e uniTestTag2 = UniTestTagsKt.uniTestTag(a16, UniIconButtonTestTags.Icon, null, u11, 48, 2);
                                                    a.b(uniTestTag2, "icon");
                                                    C5185h.a(uniTestTag2, u11, 0);
                                                    u11.f();
                                                    c8391l3 = c8391l4;
                                                    function03 = function02;
                                                    z21 = z16;
                                                    z22 = z17;
                                                    z23 = z18;
                                                    uniIconButtonResizing2 = uniIconButtonResizing3;
                                                    eVar3 = eVar5;
                                                    qVar4 = qVar5;
                                                    z24 = z25;
                                                }
                                                f7 = f11;
                                                u11.o(-1357069483);
                                                if (c8391l2 == null) {
                                                }
                                                C8391l c8391l42 = c8391l2;
                                                e a132 = androidx.compose.foundation.e.a(c8391l2 == null ? ScaledClipKt.m2996scaledClipwH6b6FI(e12, gVar, (float) 0.2d) : C6988h.a(e12, gVar), value, null, 6);
                                                function02 = function04;
                                                if (z16) {
                                                }
                                                i a142 = i.a(0);
                                                u11.o(-1357074578);
                                                if ((i29 & 14) != 4) {
                                                }
                                                C11 = u11.C();
                                                if (!z19) {
                                                }
                                                C11 = new UniIconButtonKt$UniIconButton$4$1(function02);
                                                u11.x(C11);
                                                u11.k();
                                                e b112 = androidx.compose.foundation.i.b(a132, qVar3, null, z26, null, a142, (Function0) C11, 8);
                                                q qVar52 = qVar3;
                                                e uniTestTag3 = UniTestTagsKt.uniTestTag(b112, UniIconButtonTestTags.Container, null, u11, 48, 2);
                                                a.b(uniTestTag3, "container");
                                                if (z17) {
                                                }
                                                u11.k();
                                                V f122 = C5185h.f(InterfaceC6250b.a.e(), false);
                                                I11 = u11.I();
                                                A0 d122 = u11.d();
                                                e f132 = c.f(u11, uniTestTag3);
                                                Function0 a152 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                                                if (u11.t()) {
                                                }
                                                Function2 f142 = E.f(u11, f122, u11, d122);
                                                if (!u11.t()) {
                                                }
                                                Ep.a.d(I11, u11, I11, f142);
                                                U7.i.b(u11, f132, -163460683);
                                                if (z18) {
                                                }
                                                u11.k();
                                                e.a aVar32 = e.f40358c0;
                                                e j112 = a0.j(aVar32, uniIconButtonSize3.getIconSize());
                                                u11.o(-163453875);
                                                q11 = u11.q(f7);
                                                C12 = u11.C();
                                                if (!q11) {
                                                }
                                                C12 = new UniIconButtonKt$UniIconButton$6$1$1(f7);
                                                u11.x(C12);
                                                u11.k();
                                                e a162 = androidx.compose.ui.graphics.a.a(j112, (Function1) C12);
                                                if (abstractC7799Q != null) {
                                                }
                                                if (!z18) {
                                                }
                                                e uniTestTag22 = UniTestTagsKt.uniTestTag(a162, UniIconButtonTestTags.Icon, null, u11, 48, 2);
                                                a.b(uniTestTag22, "icon");
                                                C5185h.a(uniTestTag22, u11, 0);
                                                u11.f();
                                                c8391l3 = c8391l42;
                                                function03 = function02;
                                                z21 = z16;
                                                z22 = z17;
                                                z23 = z18;
                                                uniIconButtonResizing2 = uniIconButtonResizing3;
                                                eVar3 = eVar5;
                                                qVar4 = qVar52;
                                                z24 = z25;
                                            }
                                            abstractC7799Q = value2;
                                            if (!z16) {
                                            }
                                            f7 = f11;
                                            u11.o(-1357069483);
                                            if (c8391l2 == null) {
                                            }
                                            C8391l c8391l422 = c8391l2;
                                            e a1322 = androidx.compose.foundation.e.a(c8391l2 == null ? ScaledClipKt.m2996scaledClipwH6b6FI(e12, gVar, (float) 0.2d) : C6988h.a(e12, gVar), value, null, 6);
                                            function02 = function04;
                                            if (z16) {
                                            }
                                            i a1422 = i.a(0);
                                            u11.o(-1357074578);
                                            if ((i29 & 14) != 4) {
                                            }
                                            C11 = u11.C();
                                            if (!z19) {
                                            }
                                            C11 = new UniIconButtonKt$UniIconButton$4$1(function02);
                                            u11.x(C11);
                                            u11.k();
                                            e b1122 = androidx.compose.foundation.i.b(a1322, qVar3, null, z26, null, a1422, (Function0) C11, 8);
                                            q qVar522 = qVar3;
                                            e uniTestTag32 = UniTestTagsKt.uniTestTag(b1122, UniIconButtonTestTags.Container, null, u11, 48, 2);
                                            a.b(uniTestTag32, "container");
                                            if (z17) {
                                            }
                                            u11.k();
                                            V f1222 = C5185h.f(InterfaceC6250b.a.e(), false);
                                            I11 = u11.I();
                                            A0 d1222 = u11.d();
                                            e f1322 = c.f(u11, uniTestTag32);
                                            Function0 a1522 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                                            if (u11.t()) {
                                            }
                                            Function2 f1422 = E.f(u11, f1222, u11, d1222);
                                            if (!u11.t()) {
                                            }
                                            Ep.a.d(I11, u11, I11, f1422);
                                            U7.i.b(u11, f1322, -163460683);
                                            if (z18) {
                                            }
                                            u11.k();
                                            e.a aVar322 = e.f40358c0;
                                            e j1122 = a0.j(aVar322, uniIconButtonSize3.getIconSize());
                                            u11.o(-163453875);
                                            q11 = u11.q(f7);
                                            C12 = u11.C();
                                            if (!q11) {
                                            }
                                            C12 = new UniIconButtonKt$UniIconButton$6$1$1(f7);
                                            u11.x(C12);
                                            u11.k();
                                            e a1622 = androidx.compose.ui.graphics.a.a(j1122, (Function1) C12);
                                            if (abstractC7799Q != null) {
                                            }
                                            if (!z18) {
                                            }
                                            e uniTestTag222 = UniTestTagsKt.uniTestTag(a1622, UniIconButtonTestTags.Icon, null, u11, 48, 2);
                                            a.b(uniTestTag222, "icon");
                                            C5185h.a(uniTestTag222, u11, 0);
                                            u11.f();
                                            c8391l3 = c8391l422;
                                            function03 = function02;
                                            z21 = z16;
                                            z22 = z17;
                                            z23 = z18;
                                            uniIconButtonResizing2 = uniIconButtonResizing3;
                                            eVar3 = eVar5;
                                            qVar4 = qVar522;
                                            z24 = z25;
                                        }
                                        m02 = u11.m0();
                                        if (m02 == null) {
                                            m02.G(new UniIconButtonKt$UniIconButton$7(icon, uniIconButtonStyle3, uniIconButtonSize3, eVar3, uniIconButtonResizing2, c8391l3, z23, z21, z24, z22, function03, qVar4, i11, i12, i13));
                                            return;
                                        }
                                        return;
                                    }
                                    i32 = i31;
                                    if ((i22 & 306783379) != 306783378) {
                                    }
                                    if (i33 != 0) {
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
                                    if (i21 != 0) {
                                    }
                                    if (i24 != 0) {
                                    }
                                    if (i26 != 0) {
                                    }
                                    if (i28 != 0) {
                                    }
                                    if (i32 != 0) {
                                    }
                                    InterfaceC3978p0 a112 = u.a(qVar2, u11, (i29 >> 3) & 14);
                                    g e112 = z25 ? h.e() : h.b(uniIconButtonSize4.getCornerRadius());
                                    uniIconButtonSize3 = uniIconButtonSize4;
                                    if (uniIconButtonResizing2 == UniIconButtonResizing.FILL) {
                                    }
                                    if (z16) {
                                    }
                                    UniIconButtonResizing uniIconButtonResizing32 = uniIconButtonResizing2;
                                    AbstractC7799Q value4 = DeferredBrush.getValue(enabled.getBackgroundColor(), u11, 0);
                                    e eVar52 = eVar4;
                                    AbstractC7799Q value22 = DeferredBrush.getValue(enabled.getIconColor(), u11, 0);
                                    long value32 = DeferredColor.getValue(enabled.getLoaderColor(), u11, 0);
                                    if (icon instanceof UniPainter) {
                                    }
                                    if (uniPainter == null) {
                                        abstractC7799Q = null;
                                        if (!z16) {
                                        }
                                        f7 = f11;
                                        u11.o(-1357069483);
                                        if (c8391l2 == null) {
                                        }
                                        C8391l c8391l4222 = c8391l2;
                                        e a13222 = androidx.compose.foundation.e.a(c8391l2 == null ? ScaledClipKt.m2996scaledClipwH6b6FI(e12, gVar, (float) 0.2d) : C6988h.a(e12, gVar), value4, null, 6);
                                        function02 = function04;
                                        if (z16) {
                                        }
                                        i a14222 = i.a(0);
                                        u11.o(-1357074578);
                                        if ((i29 & 14) != 4) {
                                        }
                                        C11 = u11.C();
                                        if (!z19) {
                                        }
                                        C11 = new UniIconButtonKt$UniIconButton$4$1(function02);
                                        u11.x(C11);
                                        u11.k();
                                        e b11222 = androidx.compose.foundation.i.b(a13222, qVar3, null, z26, null, a14222, (Function0) C11, 8);
                                        q qVar5222 = qVar3;
                                        e uniTestTag322 = UniTestTagsKt.uniTestTag(b11222, UniIconButtonTestTags.Container, null, u11, 48, 2);
                                        a.b(uniTestTag322, "container");
                                        if (z17) {
                                        }
                                        u11.k();
                                        V f12222 = C5185h.f(InterfaceC6250b.a.e(), false);
                                        I11 = u11.I();
                                        A0 d12222 = u11.d();
                                        e f13222 = c.f(u11, uniTestTag322);
                                        Function0 a15222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                                        if (u11.t()) {
                                        }
                                        Function2 f14222 = E.f(u11, f12222, u11, d12222);
                                        if (!u11.t()) {
                                        }
                                        Ep.a.d(I11, u11, I11, f14222);
                                        U7.i.b(u11, f13222, -163460683);
                                        if (z18) {
                                        }
                                        u11.k();
                                        e.a aVar3222 = e.f40358c0;
                                        e j11222 = a0.j(aVar3222, uniIconButtonSize3.getIconSize());
                                        u11.o(-163453875);
                                        q11 = u11.q(f7);
                                        C12 = u11.C();
                                        if (!q11) {
                                        }
                                        C12 = new UniIconButtonKt$UniIconButton$6$1$1(f7);
                                        u11.x(C12);
                                        u11.k();
                                        e a16222 = androidx.compose.ui.graphics.a.a(j11222, (Function1) C12);
                                        if (abstractC7799Q != null) {
                                        }
                                        if (!z18) {
                                        }
                                        e uniTestTag2222 = UniTestTagsKt.uniTestTag(a16222, UniIconButtonTestTags.Icon, null, u11, 48, 2);
                                        a.b(uniTestTag2222, "icon");
                                        C5185h.a(uniTestTag2222, u11, 0);
                                        u11.f();
                                        c8391l3 = c8391l4222;
                                        function03 = function02;
                                        z21 = z16;
                                        z22 = z17;
                                        z23 = z18;
                                        uniIconButtonResizing2 = uniIconButtonResizing32;
                                        eVar3 = eVar52;
                                        qVar4 = qVar5222;
                                        z24 = z25;
                                        m02 = u11.m0();
                                        if (m02 == null) {
                                        }
                                    }
                                    abstractC7799Q = value22;
                                    if (!z16) {
                                    }
                                    f7 = f11;
                                    u11.o(-1357069483);
                                    if (c8391l2 == null) {
                                    }
                                    C8391l c8391l42222 = c8391l2;
                                    e a132222 = androidx.compose.foundation.e.a(c8391l2 == null ? ScaledClipKt.m2996scaledClipwH6b6FI(e12, gVar, (float) 0.2d) : C6988h.a(e12, gVar), value4, null, 6);
                                    function02 = function04;
                                    if (z16) {
                                    }
                                    i a142222 = i.a(0);
                                    u11.o(-1357074578);
                                    if ((i29 & 14) != 4) {
                                    }
                                    C11 = u11.C();
                                    if (!z19) {
                                    }
                                    C11 = new UniIconButtonKt$UniIconButton$4$1(function02);
                                    u11.x(C11);
                                    u11.k();
                                    e b112222 = androidx.compose.foundation.i.b(a132222, qVar3, null, z26, null, a142222, (Function0) C11, 8);
                                    q qVar52222 = qVar3;
                                    e uniTestTag3222 = UniTestTagsKt.uniTestTag(b112222, UniIconButtonTestTags.Container, null, u11, 48, 2);
                                    a.b(uniTestTag3222, "container");
                                    if (z17) {
                                    }
                                    u11.k();
                                    V f122222 = C5185h.f(InterfaceC6250b.a.e(), false);
                                    I11 = u11.I();
                                    A0 d122222 = u11.d();
                                    e f132222 = c.f(u11, uniTestTag3222);
                                    Function0 a152222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                                    if (u11.t()) {
                                    }
                                    Function2 f142222 = E.f(u11, f122222, u11, d122222);
                                    if (!u11.t()) {
                                    }
                                    Ep.a.d(I11, u11, I11, f142222);
                                    U7.i.b(u11, f132222, -163460683);
                                    if (z18) {
                                    }
                                    u11.k();
                                    e.a aVar32222 = e.f40358c0;
                                    e j112222 = a0.j(aVar32222, uniIconButtonSize3.getIconSize());
                                    u11.o(-163453875);
                                    q11 = u11.q(f7);
                                    C12 = u11.C();
                                    if (!q11) {
                                    }
                                    C12 = new UniIconButtonKt$UniIconButton$6$1$1(f7);
                                    u11.x(C12);
                                    u11.k();
                                    e a162222 = androidx.compose.ui.graphics.a.a(j112222, (Function1) C12);
                                    if (abstractC7799Q != null) {
                                    }
                                    if (!z18) {
                                    }
                                    e uniTestTag22222 = UniTestTagsKt.uniTestTag(a162222, UniIconButtonTestTags.Icon, null, u11, 48, 2);
                                    a.b(uniTestTag22222, "icon");
                                    C5185h.a(uniTestTag22222, u11, 0);
                                    u11.f();
                                    c8391l3 = c8391l42222;
                                    function03 = function02;
                                    z21 = z16;
                                    z22 = z17;
                                    z23 = z18;
                                    uniIconButtonResizing2 = uniIconButtonResizing32;
                                    eVar3 = eVar52;
                                    qVar4 = qVar52222;
                                    z24 = z25;
                                    m02 = u11.m0();
                                    if (m02 == null) {
                                    }
                                }
                                i26 = i25;
                                i27 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                                if (i27 == 0) {
                                }
                                i31 = i13 & 2048;
                                if (i31 == 0) {
                                }
                                i32 = i31;
                                if ((i22 & 306783379) != 306783378) {
                                }
                                if (i33 != 0) {
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
                                if (i21 != 0) {
                                }
                                if (i24 != 0) {
                                }
                                if (i26 != 0) {
                                }
                                if (i28 != 0) {
                                }
                                if (i32 != 0) {
                                }
                                InterfaceC3978p0 a1122 = u.a(qVar2, u11, (i29 >> 3) & 14);
                                g e1122 = z25 ? h.e() : h.b(uniIconButtonSize4.getCornerRadius());
                                uniIconButtonSize3 = uniIconButtonSize4;
                                if (uniIconButtonResizing2 == UniIconButtonResizing.FILL) {
                                }
                                if (z16) {
                                }
                                UniIconButtonResizing uniIconButtonResizing322 = uniIconButtonResizing2;
                                AbstractC7799Q value42 = DeferredBrush.getValue(enabled.getBackgroundColor(), u11, 0);
                                e eVar522 = eVar4;
                                AbstractC7799Q value222 = DeferredBrush.getValue(enabled.getIconColor(), u11, 0);
                                long value322 = DeferredColor.getValue(enabled.getLoaderColor(), u11, 0);
                                if (icon instanceof UniPainter) {
                                }
                                if (uniPainter == null) {
                                }
                                abstractC7799Q = value222;
                                if (!z16) {
                                }
                                f7 = f11;
                                u11.o(-1357069483);
                                if (c8391l2 == null) {
                                }
                                C8391l c8391l422222 = c8391l2;
                                e a1322222 = androidx.compose.foundation.e.a(c8391l2 == null ? ScaledClipKt.m2996scaledClipwH6b6FI(e12, gVar, (float) 0.2d) : C6988h.a(e12, gVar), value42, null, 6);
                                function02 = function04;
                                if (z16) {
                                }
                                i a1422222 = i.a(0);
                                u11.o(-1357074578);
                                if ((i29 & 14) != 4) {
                                }
                                C11 = u11.C();
                                if (!z19) {
                                }
                                C11 = new UniIconButtonKt$UniIconButton$4$1(function02);
                                u11.x(C11);
                                u11.k();
                                e b1122222 = androidx.compose.foundation.i.b(a1322222, qVar3, null, z26, null, a1422222, (Function0) C11, 8);
                                q qVar522222 = qVar3;
                                e uniTestTag32222 = UniTestTagsKt.uniTestTag(b1122222, UniIconButtonTestTags.Container, null, u11, 48, 2);
                                a.b(uniTestTag32222, "container");
                                if (z17) {
                                }
                                u11.k();
                                V f1222222 = C5185h.f(InterfaceC6250b.a.e(), false);
                                I11 = u11.I();
                                A0 d1222222 = u11.d();
                                e f1322222 = c.f(u11, uniTestTag32222);
                                Function0 a1522222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                                if (u11.t()) {
                                }
                                Function2 f1422222 = E.f(u11, f1222222, u11, d1222222);
                                if (!u11.t()) {
                                }
                                Ep.a.d(I11, u11, I11, f1422222);
                                U7.i.b(u11, f1322222, -163460683);
                                if (z18) {
                                }
                                u11.k();
                                e.a aVar322222 = e.f40358c0;
                                e j1122222 = a0.j(aVar322222, uniIconButtonSize3.getIconSize());
                                u11.o(-163453875);
                                q11 = u11.q(f7);
                                C12 = u11.C();
                                if (!q11) {
                                }
                                C12 = new UniIconButtonKt$UniIconButton$6$1$1(f7);
                                u11.x(C12);
                                u11.k();
                                e a1622222 = androidx.compose.ui.graphics.a.a(j1122222, (Function1) C12);
                                if (abstractC7799Q != null) {
                                }
                                if (!z18) {
                                }
                                e uniTestTag222222 = UniTestTagsKt.uniTestTag(a1622222, UniIconButtonTestTags.Icon, null, u11, 48, 2);
                                a.b(uniTestTag222222, "icon");
                                C5185h.a(uniTestTag222222, u11, 0);
                                u11.f();
                                c8391l3 = c8391l422222;
                                function03 = function02;
                                z21 = z16;
                                z22 = z17;
                                z23 = z18;
                                uniIconButtonResizing2 = uniIconButtonResizing322;
                                eVar3 = eVar522;
                                qVar4 = qVar522222;
                                z24 = z25;
                                m02 = u11.m0();
                                if (m02 == null) {
                                }
                            }
                            i24 = i23;
                            i25 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                            if (i25 != 0) {
                            }
                            i26 = i25;
                            i27 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                            if (i27 == 0) {
                            }
                            i31 = i13 & 2048;
                            if (i31 == 0) {
                            }
                            i32 = i31;
                            if ((i22 & 306783379) != 306783378) {
                            }
                            if (i33 != 0) {
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
                            if (i21 != 0) {
                            }
                            if (i24 != 0) {
                            }
                            if (i26 != 0) {
                            }
                            if (i28 != 0) {
                            }
                            if (i32 != 0) {
                            }
                            InterfaceC3978p0 a11222 = u.a(qVar2, u11, (i29 >> 3) & 14);
                            g e11222 = z25 ? h.e() : h.b(uniIconButtonSize4.getCornerRadius());
                            uniIconButtonSize3 = uniIconButtonSize4;
                            if (uniIconButtonResizing2 == UniIconButtonResizing.FILL) {
                            }
                            if (z16) {
                            }
                            UniIconButtonResizing uniIconButtonResizing3222 = uniIconButtonResizing2;
                            AbstractC7799Q value422 = DeferredBrush.getValue(enabled.getBackgroundColor(), u11, 0);
                            e eVar5222 = eVar4;
                            AbstractC7799Q value2222 = DeferredBrush.getValue(enabled.getIconColor(), u11, 0);
                            long value3222 = DeferredColor.getValue(enabled.getLoaderColor(), u11, 0);
                            if (icon instanceof UniPainter) {
                            }
                            if (uniPainter == null) {
                            }
                            abstractC7799Q = value2222;
                            if (!z16) {
                            }
                            f7 = f11;
                            u11.o(-1357069483);
                            if (c8391l2 == null) {
                            }
                            C8391l c8391l4222222 = c8391l2;
                            e a13222222 = androidx.compose.foundation.e.a(c8391l2 == null ? ScaledClipKt.m2996scaledClipwH6b6FI(e12, gVar, (float) 0.2d) : C6988h.a(e12, gVar), value422, null, 6);
                            function02 = function04;
                            if (z16) {
                            }
                            i a14222222 = i.a(0);
                            u11.o(-1357074578);
                            if ((i29 & 14) != 4) {
                            }
                            C11 = u11.C();
                            if (!z19) {
                            }
                            C11 = new UniIconButtonKt$UniIconButton$4$1(function02);
                            u11.x(C11);
                            u11.k();
                            e b11222222 = androidx.compose.foundation.i.b(a13222222, qVar3, null, z26, null, a14222222, (Function0) C11, 8);
                            q qVar5222222 = qVar3;
                            e uniTestTag322222 = UniTestTagsKt.uniTestTag(b11222222, UniIconButtonTestTags.Container, null, u11, 48, 2);
                            a.b(uniTestTag322222, "container");
                            if (z17) {
                            }
                            u11.k();
                            V f12222222 = C5185h.f(InterfaceC6250b.a.e(), false);
                            I11 = u11.I();
                            A0 d12222222 = u11.d();
                            e f13222222 = c.f(u11, uniTestTag322222);
                            Function0 a15222222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                            if (u11.t()) {
                            }
                            Function2 f14222222 = E.f(u11, f12222222, u11, d12222222);
                            if (!u11.t()) {
                            }
                            Ep.a.d(I11, u11, I11, f14222222);
                            U7.i.b(u11, f13222222, -163460683);
                            if (z18) {
                            }
                            u11.k();
                            e.a aVar3222222 = e.f40358c0;
                            e j11222222 = a0.j(aVar3222222, uniIconButtonSize3.getIconSize());
                            u11.o(-163453875);
                            q11 = u11.q(f7);
                            C12 = u11.C();
                            if (!q11) {
                            }
                            C12 = new UniIconButtonKt$UniIconButton$6$1$1(f7);
                            u11.x(C12);
                            u11.k();
                            e a16222222 = androidx.compose.ui.graphics.a.a(j11222222, (Function1) C12);
                            if (abstractC7799Q != null) {
                            }
                            if (!z18) {
                            }
                            e uniTestTag2222222 = UniTestTagsKt.uniTestTag(a16222222, UniIconButtonTestTags.Icon, null, u11, 48, 2);
                            a.b(uniTestTag2222222, "icon");
                            C5185h.a(uniTestTag2222222, u11, 0);
                            u11.f();
                            c8391l3 = c8391l4222222;
                            function03 = function02;
                            z21 = z16;
                            z22 = z17;
                            z23 = z18;
                            uniIconButtonResizing2 = uniIconButtonResizing3222;
                            eVar3 = eVar5222;
                            qVar4 = qVar5222222;
                            z24 = z25;
                            m02 = u11.m0();
                            if (m02 == null) {
                            }
                        }
                        i22 = i14;
                        i23 = i13 & 256;
                        if (i23 == 0) {
                        }
                        i24 = i23;
                        i25 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                        if (i25 != 0) {
                        }
                        i26 = i25;
                        i27 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                        if (i27 == 0) {
                        }
                        i31 = i13 & 2048;
                        if (i31 == 0) {
                        }
                        i32 = i31;
                        if ((i22 & 306783379) != 306783378) {
                        }
                        if (i33 != 0) {
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
                        if (i21 != 0) {
                        }
                        if (i24 != 0) {
                        }
                        if (i26 != 0) {
                        }
                        if (i28 != 0) {
                        }
                        if (i32 != 0) {
                        }
                        InterfaceC3978p0 a112222 = u.a(qVar2, u11, (i29 >> 3) & 14);
                        g e112222 = z25 ? h.e() : h.b(uniIconButtonSize4.getCornerRadius());
                        uniIconButtonSize3 = uniIconButtonSize4;
                        if (uniIconButtonResizing2 == UniIconButtonResizing.FILL) {
                        }
                        if (z16) {
                        }
                        UniIconButtonResizing uniIconButtonResizing32222 = uniIconButtonResizing2;
                        AbstractC7799Q value4222 = DeferredBrush.getValue(enabled.getBackgroundColor(), u11, 0);
                        e eVar52222 = eVar4;
                        AbstractC7799Q value22222 = DeferredBrush.getValue(enabled.getIconColor(), u11, 0);
                        long value32222 = DeferredColor.getValue(enabled.getLoaderColor(), u11, 0);
                        if (icon instanceof UniPainter) {
                        }
                        if (uniPainter == null) {
                        }
                        abstractC7799Q = value22222;
                        if (!z16) {
                        }
                        f7 = f11;
                        u11.o(-1357069483);
                        if (c8391l2 == null) {
                        }
                        C8391l c8391l42222222 = c8391l2;
                        e a132222222 = androidx.compose.foundation.e.a(c8391l2 == null ? ScaledClipKt.m2996scaledClipwH6b6FI(e12, gVar, (float) 0.2d) : C6988h.a(e12, gVar), value4222, null, 6);
                        function02 = function04;
                        if (z16) {
                        }
                        i a142222222 = i.a(0);
                        u11.o(-1357074578);
                        if ((i29 & 14) != 4) {
                        }
                        C11 = u11.C();
                        if (!z19) {
                        }
                        C11 = new UniIconButtonKt$UniIconButton$4$1(function02);
                        u11.x(C11);
                        u11.k();
                        e b112222222 = androidx.compose.foundation.i.b(a132222222, qVar3, null, z26, null, a142222222, (Function0) C11, 8);
                        q qVar52222222 = qVar3;
                        e uniTestTag3222222 = UniTestTagsKt.uniTestTag(b112222222, UniIconButtonTestTags.Container, null, u11, 48, 2);
                        a.b(uniTestTag3222222, "container");
                        if (z17) {
                        }
                        u11.k();
                        V f122222222 = C5185h.f(InterfaceC6250b.a.e(), false);
                        I11 = u11.I();
                        A0 d122222222 = u11.d();
                        e f132222222 = c.f(u11, uniTestTag3222222);
                        Function0 a152222222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                        }
                        Function2 f142222222 = E.f(u11, f122222222, u11, d122222222);
                        if (!u11.t()) {
                        }
                        Ep.a.d(I11, u11, I11, f142222222);
                        U7.i.b(u11, f132222222, -163460683);
                        if (z18) {
                        }
                        u11.k();
                        e.a aVar32222222 = e.f40358c0;
                        e j112222222 = a0.j(aVar32222222, uniIconButtonSize3.getIconSize());
                        u11.o(-163453875);
                        q11 = u11.q(f7);
                        C12 = u11.C();
                        if (!q11) {
                        }
                        C12 = new UniIconButtonKt$UniIconButton$6$1$1(f7);
                        u11.x(C12);
                        u11.k();
                        e a162222222 = androidx.compose.ui.graphics.a.a(j112222222, (Function1) C12);
                        if (abstractC7799Q != null) {
                        }
                        if (!z18) {
                        }
                        e uniTestTag22222222 = UniTestTagsKt.uniTestTag(a162222222, UniIconButtonTestTags.Icon, null, u11, 48, 2);
                        a.b(uniTestTag22222222, "icon");
                        C5185h.a(uniTestTag22222222, u11, 0);
                        u11.f();
                        c8391l3 = c8391l42222222;
                        function03 = function02;
                        z21 = z16;
                        z22 = z17;
                        z23 = z18;
                        uniIconButtonResizing2 = uniIconButtonResizing32222;
                        eVar3 = eVar52222;
                        qVar4 = qVar52222222;
                        z24 = z25;
                        m02 = u11.m0();
                        if (m02 == null) {
                        }
                    }
                    uniIconButtonResizing2 = uniIconButtonResizing;
                    i18 = i13 & 32;
                    if (i18 != 0) {
                    }
                    i19 = i13 & 64;
                    if (i19 != 0) {
                    }
                    i21 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i21 != 0) {
                    }
                    i22 = i14;
                    i23 = i13 & 256;
                    if (i23 == 0) {
                    }
                    i24 = i23;
                    i25 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                    if (i25 != 0) {
                    }
                    i26 = i25;
                    i27 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                    if (i27 == 0) {
                    }
                    i31 = i13 & 2048;
                    if (i31 == 0) {
                    }
                    i32 = i31;
                    if ((i22 & 306783379) != 306783378) {
                    }
                    if (i33 != 0) {
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
                    if (i21 != 0) {
                    }
                    if (i24 != 0) {
                    }
                    if (i26 != 0) {
                    }
                    if (i28 != 0) {
                    }
                    if (i32 != 0) {
                    }
                    InterfaceC3978p0 a1122222 = u.a(qVar2, u11, (i29 >> 3) & 14);
                    g e1122222 = z25 ? h.e() : h.b(uniIconButtonSize4.getCornerRadius());
                    uniIconButtonSize3 = uniIconButtonSize4;
                    if (uniIconButtonResizing2 == UniIconButtonResizing.FILL) {
                    }
                    if (z16) {
                    }
                    UniIconButtonResizing uniIconButtonResizing322222 = uniIconButtonResizing2;
                    AbstractC7799Q value42222 = DeferredBrush.getValue(enabled.getBackgroundColor(), u11, 0);
                    e eVar522222 = eVar4;
                    AbstractC7799Q value222222 = DeferredBrush.getValue(enabled.getIconColor(), u11, 0);
                    long value322222 = DeferredColor.getValue(enabled.getLoaderColor(), u11, 0);
                    if (icon instanceof UniPainter) {
                    }
                    if (uniPainter == null) {
                    }
                    abstractC7799Q = value222222;
                    if (!z16) {
                    }
                    f7 = f11;
                    u11.o(-1357069483);
                    if (c8391l2 == null) {
                    }
                    C8391l c8391l422222222 = c8391l2;
                    e a1322222222 = androidx.compose.foundation.e.a(c8391l2 == null ? ScaledClipKt.m2996scaledClipwH6b6FI(e12, gVar, (float) 0.2d) : C6988h.a(e12, gVar), value42222, null, 6);
                    function02 = function04;
                    if (z16) {
                    }
                    i a1422222222 = i.a(0);
                    u11.o(-1357074578);
                    if ((i29 & 14) != 4) {
                    }
                    C11 = u11.C();
                    if (!z19) {
                    }
                    C11 = new UniIconButtonKt$UniIconButton$4$1(function02);
                    u11.x(C11);
                    u11.k();
                    e b1122222222 = androidx.compose.foundation.i.b(a1322222222, qVar3, null, z26, null, a1422222222, (Function0) C11, 8);
                    q qVar522222222 = qVar3;
                    e uniTestTag32222222 = UniTestTagsKt.uniTestTag(b1122222222, UniIconButtonTestTags.Container, null, u11, 48, 2);
                    a.b(uniTestTag32222222, "container");
                    if (z17) {
                    }
                    u11.k();
                    V f1222222222 = C5185h.f(InterfaceC6250b.a.e(), false);
                    I11 = u11.I();
                    A0 d1222222222 = u11.d();
                    e f1322222222 = c.f(u11, uniTestTag32222222);
                    Function0 a1522222222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 f1422222222 = E.f(u11, f1222222222, u11, d1222222222);
                    if (!u11.t()) {
                    }
                    Ep.a.d(I11, u11, I11, f1422222222);
                    U7.i.b(u11, f1322222222, -163460683);
                    if (z18) {
                    }
                    u11.k();
                    e.a aVar322222222 = e.f40358c0;
                    e j1122222222 = a0.j(aVar322222222, uniIconButtonSize3.getIconSize());
                    u11.o(-163453875);
                    q11 = u11.q(f7);
                    C12 = u11.C();
                    if (!q11) {
                    }
                    C12 = new UniIconButtonKt$UniIconButton$6$1$1(f7);
                    u11.x(C12);
                    u11.k();
                    e a1622222222 = androidx.compose.ui.graphics.a.a(j1122222222, (Function1) C12);
                    if (abstractC7799Q != null) {
                    }
                    if (!z18) {
                    }
                    e uniTestTag222222222 = UniTestTagsKt.uniTestTag(a1622222222, UniIconButtonTestTags.Icon, null, u11, 48, 2);
                    a.b(uniTestTag222222222, "icon");
                    C5185h.a(uniTestTag222222222, u11, 0);
                    u11.f();
                    c8391l3 = c8391l422222222;
                    function03 = function02;
                    z21 = z16;
                    z22 = z17;
                    z23 = z18;
                    uniIconButtonResizing2 = uniIconButtonResizing322222;
                    eVar3 = eVar522222;
                    qVar4 = qVar522222222;
                    z24 = z25;
                    m02 = u11.m0();
                    if (m02 == null) {
                    }
                }
                eVar2 = eVar;
                i17 = i13 & 16;
                if (i17 == 0) {
                }
                uniIconButtonResizing2 = uniIconButtonResizing;
                i18 = i13 & 32;
                if (i18 != 0) {
                }
                i19 = i13 & 64;
                if (i19 != 0) {
                }
                i21 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i21 != 0) {
                }
                i22 = i14;
                i23 = i13 & 256;
                if (i23 == 0) {
                }
                i24 = i23;
                i25 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i25 != 0) {
                }
                i26 = i25;
                i27 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i27 == 0) {
                }
                i31 = i13 & 2048;
                if (i31 == 0) {
                }
                i32 = i31;
                if ((i22 & 306783379) != 306783378) {
                }
                if (i33 != 0) {
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
                if (i21 != 0) {
                }
                if (i24 != 0) {
                }
                if (i26 != 0) {
                }
                if (i28 != 0) {
                }
                if (i32 != 0) {
                }
                InterfaceC3978p0 a11222222 = u.a(qVar2, u11, (i29 >> 3) & 14);
                g e11222222 = z25 ? h.e() : h.b(uniIconButtonSize4.getCornerRadius());
                uniIconButtonSize3 = uniIconButtonSize4;
                if (uniIconButtonResizing2 == UniIconButtonResizing.FILL) {
                }
                if (z16) {
                }
                UniIconButtonResizing uniIconButtonResizing3222222 = uniIconButtonResizing2;
                AbstractC7799Q value422222 = DeferredBrush.getValue(enabled.getBackgroundColor(), u11, 0);
                e eVar5222222 = eVar4;
                AbstractC7799Q value2222222 = DeferredBrush.getValue(enabled.getIconColor(), u11, 0);
                long value3222222 = DeferredColor.getValue(enabled.getLoaderColor(), u11, 0);
                if (icon instanceof UniPainter) {
                }
                if (uniPainter == null) {
                }
                abstractC7799Q = value2222222;
                if (!z16) {
                }
                f7 = f11;
                u11.o(-1357069483);
                if (c8391l2 == null) {
                }
                C8391l c8391l4222222222 = c8391l2;
                e a13222222222 = androidx.compose.foundation.e.a(c8391l2 == null ? ScaledClipKt.m2996scaledClipwH6b6FI(e12, gVar, (float) 0.2d) : C6988h.a(e12, gVar), value422222, null, 6);
                function02 = function04;
                if (z16) {
                }
                i a14222222222 = i.a(0);
                u11.o(-1357074578);
                if ((i29 & 14) != 4) {
                }
                C11 = u11.C();
                if (!z19) {
                }
                C11 = new UniIconButtonKt$UniIconButton$4$1(function02);
                u11.x(C11);
                u11.k();
                e b11222222222 = androidx.compose.foundation.i.b(a13222222222, qVar3, null, z26, null, a14222222222, (Function0) C11, 8);
                q qVar5222222222 = qVar3;
                e uniTestTag322222222 = UniTestTagsKt.uniTestTag(b11222222222, UniIconButtonTestTags.Container, null, u11, 48, 2);
                a.b(uniTestTag322222222, "container");
                if (z17) {
                }
                u11.k();
                V f12222222222 = C5185h.f(InterfaceC6250b.a.e(), false);
                I11 = u11.I();
                A0 d12222222222 = u11.d();
                e f13222222222 = c.f(u11, uniTestTag322222222);
                Function0 a15222222222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 f14222222222 = E.f(u11, f12222222222, u11, d12222222222);
                if (!u11.t()) {
                }
                Ep.a.d(I11, u11, I11, f14222222222);
                U7.i.b(u11, f13222222222, -163460683);
                if (z18) {
                }
                u11.k();
                e.a aVar3222222222 = e.f40358c0;
                e j11222222222 = a0.j(aVar3222222222, uniIconButtonSize3.getIconSize());
                u11.o(-163453875);
                q11 = u11.q(f7);
                C12 = u11.C();
                if (!q11) {
                }
                C12 = new UniIconButtonKt$UniIconButton$6$1$1(f7);
                u11.x(C12);
                u11.k();
                e a16222222222 = androidx.compose.ui.graphics.a.a(j11222222222, (Function1) C12);
                if (abstractC7799Q != null) {
                }
                if (!z18) {
                }
                e uniTestTag2222222222 = UniTestTagsKt.uniTestTag(a16222222222, UniIconButtonTestTags.Icon, null, u11, 48, 2);
                a.b(uniTestTag2222222222, "icon");
                C5185h.a(uniTestTag2222222222, u11, 0);
                u11.f();
                c8391l3 = c8391l4222222222;
                function03 = function02;
                z21 = z16;
                z22 = z17;
                z23 = z18;
                uniIconButtonResizing2 = uniIconButtonResizing3222222;
                eVar3 = eVar5222222;
                qVar4 = qVar5222222222;
                z24 = z25;
                m02 = u11.m0();
                if (m02 == null) {
                }
            }
            uniIconButtonSize2 = uniIconButtonSize;
            i16 = i13 & 8;
            if (i16 != 0) {
            }
            eVar2 = eVar;
            i17 = i13 & 16;
            if (i17 == 0) {
            }
            uniIconButtonResizing2 = uniIconButtonResizing;
            i18 = i13 & 32;
            if (i18 != 0) {
            }
            i19 = i13 & 64;
            if (i19 != 0) {
            }
            i21 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i21 != 0) {
            }
            i22 = i14;
            i23 = i13 & 256;
            if (i23 == 0) {
            }
            i24 = i23;
            i25 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i25 != 0) {
            }
            i26 = i25;
            i27 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i27 == 0) {
            }
            i31 = i13 & 2048;
            if (i31 == 0) {
            }
            i32 = i31;
            if ((i22 & 306783379) != 306783378) {
            }
            if (i33 != 0) {
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
            if (i21 != 0) {
            }
            if (i24 != 0) {
            }
            if (i26 != 0) {
            }
            if (i28 != 0) {
            }
            if (i32 != 0) {
            }
            InterfaceC3978p0 a112222222 = u.a(qVar2, u11, (i29 >> 3) & 14);
            g e112222222 = z25 ? h.e() : h.b(uniIconButtonSize4.getCornerRadius());
            uniIconButtonSize3 = uniIconButtonSize4;
            if (uniIconButtonResizing2 == UniIconButtonResizing.FILL) {
            }
            if (z16) {
            }
            UniIconButtonResizing uniIconButtonResizing32222222 = uniIconButtonResizing2;
            AbstractC7799Q value4222222 = DeferredBrush.getValue(enabled.getBackgroundColor(), u11, 0);
            e eVar52222222 = eVar4;
            AbstractC7799Q value22222222 = DeferredBrush.getValue(enabled.getIconColor(), u11, 0);
            long value32222222 = DeferredColor.getValue(enabled.getLoaderColor(), u11, 0);
            if (icon instanceof UniPainter) {
            }
            if (uniPainter == null) {
            }
            abstractC7799Q = value22222222;
            if (!z16) {
            }
            f7 = f11;
            u11.o(-1357069483);
            if (c8391l2 == null) {
            }
            C8391l c8391l42222222222 = c8391l2;
            e a132222222222 = androidx.compose.foundation.e.a(c8391l2 == null ? ScaledClipKt.m2996scaledClipwH6b6FI(e12, gVar, (float) 0.2d) : C6988h.a(e12, gVar), value4222222, null, 6);
            function02 = function04;
            if (z16) {
            }
            i a142222222222 = i.a(0);
            u11.o(-1357074578);
            if ((i29 & 14) != 4) {
            }
            C11 = u11.C();
            if (!z19) {
            }
            C11 = new UniIconButtonKt$UniIconButton$4$1(function02);
            u11.x(C11);
            u11.k();
            e b112222222222 = androidx.compose.foundation.i.b(a132222222222, qVar3, null, z26, null, a142222222222, (Function0) C11, 8);
            q qVar52222222222 = qVar3;
            e uniTestTag3222222222 = UniTestTagsKt.uniTestTag(b112222222222, UniIconButtonTestTags.Container, null, u11, 48, 2);
            a.b(uniTestTag3222222222, "container");
            if (z17) {
            }
            u11.k();
            V f122222222222 = C5185h.f(InterfaceC6250b.a.e(), false);
            I11 = u11.I();
            A0 d122222222222 = u11.d();
            e f132222222222 = c.f(u11, uniTestTag3222222222);
            Function0 a152222222222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f142222222222 = E.f(u11, f122222222222, u11, d122222222222);
            if (!u11.t()) {
            }
            Ep.a.d(I11, u11, I11, f142222222222);
            U7.i.b(u11, f132222222222, -163460683);
            if (z18) {
            }
            u11.k();
            e.a aVar32222222222 = e.f40358c0;
            e j112222222222 = a0.j(aVar32222222222, uniIconButtonSize3.getIconSize());
            u11.o(-163453875);
            q11 = u11.q(f7);
            C12 = u11.C();
            if (!q11) {
            }
            C12 = new UniIconButtonKt$UniIconButton$6$1$1(f7);
            u11.x(C12);
            u11.k();
            e a162222222222 = androidx.compose.ui.graphics.a.a(j112222222222, (Function1) C12);
            if (abstractC7799Q != null) {
            }
            if (!z18) {
            }
            e uniTestTag22222222222 = UniTestTagsKt.uniTestTag(a162222222222, UniIconButtonTestTags.Icon, null, u11, 48, 2);
            a.b(uniTestTag22222222222, "icon");
            C5185h.a(uniTestTag22222222222, u11, 0);
            u11.f();
            c8391l3 = c8391l42222222222;
            function03 = function02;
            z21 = z16;
            z22 = z17;
            z23 = z18;
            uniIconButtonResizing2 = uniIconButtonResizing32222222;
            eVar3 = eVar52222222;
            qVar4 = qVar52222222222;
            z24 = z25;
            m02 = u11.m0();
            if (m02 == null) {
            }
        }
        uniIconButtonStyle2 = uniIconButtonStyle;
        i15 = i13 & 4;
        if (i15 == 0) {
        }
        uniIconButtonSize2 = uniIconButtonSize;
        i16 = i13 & 8;
        if (i16 != 0) {
        }
        eVar2 = eVar;
        i17 = i13 & 16;
        if (i17 == 0) {
        }
        uniIconButtonResizing2 = uniIconButtonResizing;
        i18 = i13 & 32;
        if (i18 != 0) {
        }
        i19 = i13 & 64;
        if (i19 != 0) {
        }
        i21 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i21 != 0) {
        }
        i22 = i14;
        i23 = i13 & 256;
        if (i23 == 0) {
        }
        i24 = i23;
        i25 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i25 != 0) {
        }
        i26 = i25;
        i27 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i27 == 0) {
        }
        i31 = i13 & 2048;
        if (i31 == 0) {
        }
        i32 = i31;
        if ((i22 & 306783379) != 306783378) {
        }
        if (i33 != 0) {
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
        if (i21 != 0) {
        }
        if (i24 != 0) {
        }
        if (i26 != 0) {
        }
        if (i28 != 0) {
        }
        if (i32 != 0) {
        }
        InterfaceC3978p0 a1122222222 = u.a(qVar2, u11, (i29 >> 3) & 14);
        g e1122222222 = z25 ? h.e() : h.b(uniIconButtonSize4.getCornerRadius());
        uniIconButtonSize3 = uniIconButtonSize4;
        if (uniIconButtonResizing2 == UniIconButtonResizing.FILL) {
        }
        if (z16) {
        }
        UniIconButtonResizing uniIconButtonResizing322222222 = uniIconButtonResizing2;
        AbstractC7799Q value42222222 = DeferredBrush.getValue(enabled.getBackgroundColor(), u11, 0);
        e eVar522222222 = eVar4;
        AbstractC7799Q value222222222 = DeferredBrush.getValue(enabled.getIconColor(), u11, 0);
        long value322222222 = DeferredColor.getValue(enabled.getLoaderColor(), u11, 0);
        if (icon instanceof UniPainter) {
        }
        if (uniPainter == null) {
        }
        abstractC7799Q = value222222222;
        if (!z16) {
        }
        f7 = f11;
        u11.o(-1357069483);
        if (c8391l2 == null) {
        }
        C8391l c8391l422222222222 = c8391l2;
        e a1322222222222 = androidx.compose.foundation.e.a(c8391l2 == null ? ScaledClipKt.m2996scaledClipwH6b6FI(e12, gVar, (float) 0.2d) : C6988h.a(e12, gVar), value42222222, null, 6);
        function02 = function04;
        if (z16) {
        }
        i a1422222222222 = i.a(0);
        u11.o(-1357074578);
        if ((i29 & 14) != 4) {
        }
        C11 = u11.C();
        if (!z19) {
        }
        C11 = new UniIconButtonKt$UniIconButton$4$1(function02);
        u11.x(C11);
        u11.k();
        e b1122222222222 = androidx.compose.foundation.i.b(a1322222222222, qVar3, null, z26, null, a1422222222222, (Function0) C11, 8);
        q qVar522222222222 = qVar3;
        e uniTestTag32222222222 = UniTestTagsKt.uniTestTag(b1122222222222, UniIconButtonTestTags.Container, null, u11, 48, 2);
        a.b(uniTestTag32222222222, "container");
        if (z17) {
        }
        u11.k();
        V f1222222222222 = C5185h.f(InterfaceC6250b.a.e(), false);
        I11 = u11.I();
        A0 d1222222222222 = u11.d();
        e f1322222222222 = c.f(u11, uniTestTag32222222222);
        Function0 a1522222222222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f1422222222222 = E.f(u11, f1222222222222, u11, d1222222222222);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, f1422222222222);
        U7.i.b(u11, f1322222222222, -163460683);
        if (z18) {
        }
        u11.k();
        e.a aVar322222222222 = e.f40358c0;
        e j1122222222222 = a0.j(aVar322222222222, uniIconButtonSize3.getIconSize());
        u11.o(-163453875);
        q11 = u11.q(f7);
        C12 = u11.C();
        if (!q11) {
        }
        C12 = new UniIconButtonKt$UniIconButton$6$1$1(f7);
        u11.x(C12);
        u11.k();
        e a1622222222222 = androidx.compose.ui.graphics.a.a(j1122222222222, (Function1) C12);
        if (abstractC7799Q != null) {
        }
        if (!z18) {
        }
        e uniTestTag222222222222 = UniTestTagsKt.uniTestTag(a1622222222222, UniIconButtonTestTags.Icon, null, u11, 48, 2);
        a.b(uniTestTag222222222222, "icon");
        C5185h.a(uniTestTag222222222222, u11, 0);
        u11.f();
        c8391l3 = c8391l422222222222;
        function03 = function02;
        z21 = z16;
        z22 = z17;
        z23 = z18;
        uniIconButtonResizing2 = uniIconButtonResizing322222222;
        eVar3 = eVar522222222;
        qVar4 = qVar522222222222;
        z24 = z25;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UniIconButton$lambda$1(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }
}
