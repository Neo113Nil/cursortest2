package ru.ozon.uni.components.text;

import K1.C3422b;
import K1.C3424d;
import K1.C3440u;
import K1.K;
import K1.T;
import P0.p2;
import P9.a;
import S0.C3956f1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3972m0;
import S0.J0;
import V1.h;
import Z1.u;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import i1.C6981a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.K0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.components.text.UniTextPreset;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.ozi.utils.internal.TextUtilsKt;
import ru.ozon.uni.utils.StringExtensionsKt;
import ru.ozon.uni.utils.UniTestTagsKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0006\u001a\u0091\u0001\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0093\u0001\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u001c2\b\b\u0003\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001ae\u0010$\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010!\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\"\u0010#\u001aa\u0010)\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00000%2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010!\u001a\u00020\u0004H\u0003¢\u0006\u0004\b'\u0010(¨\u0006+²\u0006\u000e\u0010*\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, d2 = {"LK1/b;", "text", "Landroidx/compose/ui/e;", "modifier", "Lru/ozon/uni/components/text/UniTextPreset;", "textPreset", "LV1/h;", "textAlign", "Lru/ozon/uni/components/text/UniTextResizing;", "resizing", "LZ1/h;", "leftPadding", "rightPadding", "LV1/r;", "truncatingMode", "Ll1/Z;", "textColor", "", "maxLines", "", "softWrap", "Lkotlin/Function1;", "LK1/K;", "", "onTextLayout", "UniText-6P7A1Ok", "(LK1/b;Landroidx/compose/ui/e;Lru/ozon/uni/components/text/UniTextPreset;ILru/ozon/uni/components/text/UniTextResizing;FFIJIZLkotlin/jvm/functions/Function1;LS0/k;III)V", "UniText", "Ll1/Q;", "UniText-28lkidg", "(LK1/b;Landroidx/compose/ui/e;Lru/ozon/uni/components/text/UniTextPreset;ILru/ozon/uni/components/text/UniTextResizing;FFILl1/Q;IZLkotlin/jvm/functions/Function1;LS0/k;III)V", "color", "overflow", "preset", "UniTextBlockItemImpl-Iu0eelc", "(LK1/b;Landroidx/compose/ui/e;Ll1/Q;IIZILkotlin/jvm/functions/Function1;Lru/ozon/uni/components/text/UniTextPreset;LS0/k;I)V", "UniTextBlockItemImpl", "", "paragraphs", "MaxLinesParagraphTextBlockAnnotated-8fRtlAg", "(Landroidx/compose/ui/e;Ljava/util/List;IIZILkotlin/jvm/functions/Function1;Lru/ozon/uni/components/text/UniTextPreset;LS0/k;I)V", "MaxLinesParagraphTextBlockAnnotated", "linesForParagraph", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniTextKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MaxLinesParagraphTextBlockAnnotated-8fRtlAg, reason: not valid java name */
    public static final void m1947MaxLinesParagraphTextBlockAnnotated8fRtlAg(e eVar, List<C3422b> list, int i11, int i12, boolean z11, int i13, Function1<? super K, Unit> function1, UniTextPreset uniTextPreset, InterfaceC3967k interfaceC3967k, int i14) {
        int i15;
        int i16;
        int i17;
        boolean z12;
        int i18;
        C3969l c3969l;
        List<C3422b> list2 = list;
        C3969l u11 = interfaceC3967k.u(-907585180);
        if ((i14 & 6) == 0) {
            i15 = (u11.n(eVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= u11.n(list2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 = i11;
            i15 |= u11.r(i16) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            i16 = i11;
        }
        if ((i14 & 3072) == 0) {
            i17 = i12;
            i15 |= u11.r(i17) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            i17 = i12;
        }
        if ((i14 & 24576) == 0) {
            z12 = z11;
            i15 |= u11.p(z12) ? 16384 : 8192;
        } else {
            z12 = z11;
        }
        if ((196608 & i14) == 0) {
            i18 = i13;
            i15 |= u11.r(i18) ? 131072 : 65536;
        } else {
            i18 = i13;
        }
        if ((i14 & 1572864) == 0) {
            i15 |= u11.F(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= (16777216 & i14) == 0 ? u11.n(uniTextPreset) : u11.F(uniTextPreset) ? 8388608 : 4194304;
        }
        if ((4793491 & i15) == 4793490 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            u11.o(-985579410);
            C3422b.a aVar = new C3422b.a();
            u11.o(-985575479);
            int size = list2.size();
            int i19 = i18;
            int i21 = i19;
            int i22 = 0;
            while (i22 < size) {
                C3422b c3422b = list2.get(i22);
                u11.o(1059184854);
                Object C11 = u11.C();
                C3422b.a aVar2 = aVar;
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = C3956f1.a(Integer.MAX_VALUE);
                    u11.x(C11);
                }
                InterfaceC3972m0 interfaceC3972m0 = (InterfaceC3972m0) C11;
                u11.k();
                e.a aVar3 = e.f40358c0;
                e a11 = C6981a.a(aVar3, 0.0f);
                if (interfaceC3972m0.getIntValue() < Integer.MAX_VALUE) {
                    a11 = a11.l0(a0.n(aVar3, 0));
                }
                T textStyle = uniTextPreset.getTextStyle();
                h a12 = h.a(i16);
                u11.o(1059198635);
                Object C12 = u11.C();
                if (C12 == InterfaceC3967k.a.a()) {
                    C12 = new UniTextKt$MaxLinesParagraphTextBlockAnnotated$annotatedText$1$1$2$1(interfaceC3972m0);
                    u11.x(C12);
                }
                u11.k();
                int i23 = i15 >> 6;
                int i24 = (i23 & 896) | (i23 & 112) | 1572864 | (i23 & 7168);
                int i25 = size;
                int i26 = i22;
                C3969l c3969l2 = u11;
                p2.c(c3422b, a11, 0L, 0L, 0L, a12, 0L, i17, z12, i13, 0, null, (Function1) C12, textStyle, c3969l2, (i15 << 21) & 1879048192, i24, 50684);
                aVar2.d(c3422b);
                if (interfaceC3972m0.getIntValue() < Integer.MAX_VALUE) {
                    i21 -= interfaceC3972m0.getIntValue();
                }
                if (i26 < C7714v.P(list) && i21 >= 0) {
                    int g10 = aVar2.g(new C3440u(0, 0, uniTextPreset.getParagraphSpacing(), null, 507));
                    try {
                        Unit unit = Unit.f71690a;
                        if (i21 > 0) {
                            i19++;
                        }
                    } finally {
                        aVar2.f(g10);
                    }
                }
                i22 = i26 + 1;
                list2 = list;
                i17 = i12;
                z12 = z11;
                size = i25;
                aVar = aVar2;
                u11 = c3969l2;
            }
            c3969l = u11;
            c3969l.k();
            C3422b i27 = aVar.i();
            c3969l.k();
            p2.c(i27, eVar, 0L, 0L, 0L, h.a(i16), 0L, i12, z11, i19, 0, null, function1, uniTextPreset.getTextStyle(), c3969l, ((i15 << 3) & 112) | ((i15 << 21) & 1879048192), ((i15 >> 6) & 1008) | (3670016 & i15), 50684);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new UniTextKt$MaxLinesParagraphTextBlockAnnotated$1(eVar, list, i16, i12, z11, i13, function1, uniTextPreset, i14));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ff  */
    /* renamed from: UniText-28lkidg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1948UniText28lkidg(@NotNull C3422b text, e eVar, UniTextPreset uniTextPreset, int i11, UniTextResizing uniTextResizing, float f7, float f11, int i12, AbstractC7799Q abstractC7799Q, int i13, boolean z11, Function1<? super K, Unit> function1, InterfaceC3967k interfaceC3967k, int i14, int i15, int i16) {
        int i17;
        e eVar2;
        int i18;
        int i19;
        int i21;
        int i22;
        float f12;
        int i23;
        float f13;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        e eVar3;
        UniTextPreset uniTextPreset2;
        int i35;
        UniTextResizing uniTextResizing2;
        int i36;
        AbstractC7799Q abstractC7799Q2;
        int i37;
        boolean z12;
        Function1<? super K, Unit> function12;
        int i38;
        C3969l c3969l;
        AbstractC7799Q abstractC7799Q3;
        C3969l c3969l2;
        UniTextPreset uniTextPreset3;
        float f14;
        int i39;
        UniTextResizing uniTextResizing3;
        int i41;
        boolean z13;
        int i42;
        e eVar4;
        Function1<? super K, Unit> function13;
        J0 m02;
        int i43;
        Intrinsics.checkNotNullParameter(text, "text");
        C3969l u11 = interfaceC3967k.u(-924351037);
        if ((i16 & 1) != 0) {
            i17 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i17 = (u11.n(text) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        int i44 = i16 & 2;
        if (i44 != 0) {
            i17 |= 48;
        } else if ((i14 & 48) == 0) {
            eVar2 = eVar;
            i17 |= u11.n(eVar2) ? 32 : 16;
            i18 = i16 & 4;
            if (i18 == 0) {
                i17 |= 384;
            } else if ((i14 & 384) == 0) {
                i17 |= (i14 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? u11.n(uniTextPreset) : u11.F(uniTextPreset) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i14 & 3072) != 0) {
                if ((i16 & 8) == 0) {
                    i19 = i11;
                    if (u11.r(i19)) {
                        i43 = 2048;
                        i17 |= i43;
                    }
                } else {
                    i19 = i11;
                }
                i43 = UserVerificationMethods.USER_VERIFY_ALL;
                i17 |= i43;
            } else {
                i19 = i11;
            }
            i21 = i16 & 16;
            if (i21 == 0) {
                i17 |= 24576;
            } else if ((i14 & 24576) == 0) {
                i17 |= u11.n(uniTextResizing) ? 16384 : 8192;
                i22 = i16 & 32;
                if (i22 != 0) {
                    i17 |= 196608;
                    f12 = f7;
                } else {
                    f12 = f7;
                    if ((i14 & 196608) == 0) {
                        i17 |= u11.q(f12) ? 131072 : 65536;
                    }
                }
                i23 = i16 & 64;
                if (i23 != 0) {
                    i17 |= 1572864;
                    f13 = f11;
                } else {
                    f13 = f11;
                    if ((i14 & 1572864) == 0) {
                        i17 |= u11.q(f13) ? 1048576 : 524288;
                    }
                }
                i24 = i16 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i24 != 0) {
                    i17 |= 12582912;
                } else if ((i14 & 12582912) == 0) {
                    i17 |= u11.r(i12) ? 8388608 : 4194304;
                }
                i25 = i16 & 256;
                if (i25 != 0) {
                    i17 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    i26 = i25;
                    i17 |= u11.n(abstractC7799Q) ? 67108864 : 33554432;
                    i27 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
                    if (i27 == 0) {
                        i17 |= 805306368;
                    } else if ((i14 & 805306368) == 0) {
                        i28 = i27;
                        i17 |= u11.r(i13) ? 536870912 : 268435456;
                        i29 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
                        if (i29 != 0) {
                            i32 = i15 | 6;
                            i31 = i29;
                        } else if ((i15 & 6) == 0) {
                            i31 = i29;
                            i32 = i15 | (u11.p(z11) ? 4 : 2);
                        } else {
                            i31 = i29;
                            i32 = i15;
                        }
                        i33 = i16 & 2048;
                        if (i33 != 0) {
                            i32 |= 48;
                        } else if ((i15 & 48) == 0) {
                            i34 = i33;
                            i32 |= u11.F(function1) ? 32 : 16;
                            if ((i17 & 306783379) != 306783378 && (i32 & 19) == 18 && u11.b()) {
                                u11.j();
                                uniTextResizing3 = uniTextResizing;
                                abstractC7799Q2 = abstractC7799Q;
                                z13 = z11;
                                c3969l2 = u11;
                                f14 = f13;
                                eVar4 = eVar2;
                                i39 = i19;
                                uniTextPreset3 = uniTextPreset;
                                i42 = i12;
                                i41 = i13;
                                function13 = function1;
                            } else {
                                u11.Q0();
                                if ((i14 & 1) != 0 || u11.w0()) {
                                    eVar3 = i44 == 0 ? e.f40358c0 : eVar2;
                                    uniTextPreset2 = i18 == 0 ? UniTextPreset.Paragraph.INSTANCE : uniTextPreset;
                                    if ((i16 & 8) == 0) {
                                        i17 &= -7169;
                                        i35 = 5;
                                    } else {
                                        i35 = i19;
                                    }
                                    uniTextResizing2 = i21 == 0 ? UniTextResizing.Fill : uniTextResizing;
                                    if (i22 != 0) {
                                        f12 = 0;
                                    }
                                    if (i23 != 0) {
                                        f13 = 0;
                                    }
                                    i36 = i24 == 0 ? 2 : i12;
                                    abstractC7799Q2 = i26 == 0 ? null : abstractC7799Q;
                                    i37 = i28 == 0 ? 1 : i13;
                                    z12 = i31 == 0 ? true : z11;
                                    if (i34 == 0) {
                                        u11.o(885167071);
                                        Object C11 = u11.C();
                                        if (C11 == InterfaceC3967k.a.a()) {
                                            C11 = UniTextKt$UniText$4$1.INSTANCE;
                                            u11.x(C11);
                                        }
                                        function12 = (Function1) C11;
                                        u11.k();
                                    } else {
                                        function12 = function1;
                                    }
                                } else {
                                    u11.j();
                                    if ((i16 & 8) != 0) {
                                        i17 &= -7169;
                                    }
                                    uniTextPreset2 = uniTextPreset;
                                    uniTextResizing2 = uniTextResizing;
                                    i36 = i12;
                                    abstractC7799Q2 = abstractC7799Q;
                                    z12 = z11;
                                    function12 = function1;
                                    eVar3 = eVar2;
                                    i35 = i19;
                                    i37 = i13;
                                }
                                u11.j0();
                                int i45 = i37 != 0 ? Integer.MAX_VALUE : i37;
                                C3422b g10 = !uniTextPreset2.getAllCaps() ? C3424d.g(text) : text;
                                e eVar5 = eVar3;
                                e uniTestTag = UniTestTagsKt.uniTestTag(eVar5, UniTextTestTags.Text, null, u11, ((i17 >> 3) & 14) | 48, 2);
                                Function1<? super K, Unit> function14 = function12;
                                if (uniTextResizing2 != UniTextResizing.Fill) {
                                    i38 = i45;
                                } else {
                                    i38 = i45;
                                    uniTestTag = uniTestTag.l0(a0.e(e.f40358c0, 1.0f));
                                }
                                e i46 = androidx.compose.foundation.layout.T.i(uniTestTag, f12, uniTextPreset2.getPaddingTop(), f13, uniTextPreset2.getPaddingBottom());
                                a.b(i46, "text");
                                u11.o(885183793);
                                if (abstractC7799Q2 != null) {
                                    c3969l = u11;
                                    abstractC7799Q3 = new K0(UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getTextPrimary());
                                } else {
                                    c3969l = u11;
                                    abstractC7799Q3 = abstractC7799Q2;
                                }
                                c3969l.k();
                                C3969l c3969l3 = c3969l;
                                C3422b c3422b = g10;
                                m1950UniTextBlockItemImplIu0eelc(c3422b, i46, abstractC7799Q3, i35, i36, z12, i38, function14, uniTextPreset2, c3969l3, (i17 & 7168) | ((i17 >> 9) & 57344) | ((i32 << 15) & 458752) | (29360128 & (i32 << 18)) | (234881024 & (i17 << 18)));
                                c3969l2 = c3969l3;
                                uniTextPreset3 = uniTextPreset2;
                                f14 = f13;
                                i39 = i35;
                                uniTextResizing3 = uniTextResizing2;
                                i41 = i37;
                                z13 = z12;
                                i42 = i36;
                                eVar4 = eVar5;
                                function13 = function14;
                            }
                            m02 = c3969l2.m0();
                            if (m02 == null) {
                                m02.G(new UniTextKt$UniText$5(text, eVar4, uniTextPreset3, i39, uniTextResizing3, f12, f14, i42, abstractC7799Q2, i41, z13, function13, i14, i15, i16));
                                return;
                            }
                            return;
                        }
                        i34 = i33;
                        if ((i17 & 306783379) != 306783378) {
                        }
                        u11.Q0();
                        if ((i14 & 1) != 0) {
                        }
                        if (i44 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if ((i16 & 8) == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if (i22 != 0) {
                        }
                        if (i23 != 0) {
                        }
                        if (i24 == 0) {
                        }
                        if (i26 == 0) {
                        }
                        if (i28 == 0) {
                        }
                        if (i31 == 0) {
                        }
                        if (i34 == 0) {
                        }
                        u11.j0();
                        if (i37 != 0) {
                        }
                        if (!uniTextPreset2.getAllCaps()) {
                        }
                        e eVar52 = eVar3;
                        e uniTestTag2 = UniTestTagsKt.uniTestTag(eVar52, UniTextTestTags.Text, null, u11, ((i17 >> 3) & 14) | 48, 2);
                        Function1<? super K, Unit> function142 = function12;
                        if (uniTextResizing2 != UniTextResizing.Fill) {
                        }
                        e i462 = androidx.compose.foundation.layout.T.i(uniTestTag2, f12, uniTextPreset2.getPaddingTop(), f13, uniTextPreset2.getPaddingBottom());
                        a.b(i462, "text");
                        u11.o(885183793);
                        if (abstractC7799Q2 != null) {
                        }
                        c3969l.k();
                        C3969l c3969l32 = c3969l;
                        C3422b c3422b2 = g10;
                        m1950UniTextBlockItemImplIu0eelc(c3422b2, i462, abstractC7799Q3, i35, i36, z12, i38, function142, uniTextPreset2, c3969l32, (i17 & 7168) | ((i17 >> 9) & 57344) | ((i32 << 15) & 458752) | (29360128 & (i32 << 18)) | (234881024 & (i17 << 18)));
                        c3969l2 = c3969l32;
                        uniTextPreset3 = uniTextPreset2;
                        f14 = f13;
                        i39 = i35;
                        uniTextResizing3 = uniTextResizing2;
                        i41 = i37;
                        z13 = z12;
                        i42 = i36;
                        eVar4 = eVar52;
                        function13 = function142;
                        m02 = c3969l2.m0();
                        if (m02 == null) {
                        }
                    }
                    i28 = i27;
                    i29 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
                    if (i29 != 0) {
                    }
                    i33 = i16 & 2048;
                    if (i33 != 0) {
                    }
                    i34 = i33;
                    if ((i17 & 306783379) != 306783378) {
                    }
                    u11.Q0();
                    if ((i14 & 1) != 0) {
                    }
                    if (i44 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if ((i16 & 8) == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i23 != 0) {
                    }
                    if (i24 == 0) {
                    }
                    if (i26 == 0) {
                    }
                    if (i28 == 0) {
                    }
                    if (i31 == 0) {
                    }
                    if (i34 == 0) {
                    }
                    u11.j0();
                    if (i37 != 0) {
                    }
                    if (!uniTextPreset2.getAllCaps()) {
                    }
                    e eVar522 = eVar3;
                    e uniTestTag22 = UniTestTagsKt.uniTestTag(eVar522, UniTextTestTags.Text, null, u11, ((i17 >> 3) & 14) | 48, 2);
                    Function1<? super K, Unit> function1422 = function12;
                    if (uniTextResizing2 != UniTextResizing.Fill) {
                    }
                    e i4622 = androidx.compose.foundation.layout.T.i(uniTestTag22, f12, uniTextPreset2.getPaddingTop(), f13, uniTextPreset2.getPaddingBottom());
                    a.b(i4622, "text");
                    u11.o(885183793);
                    if (abstractC7799Q2 != null) {
                    }
                    c3969l.k();
                    C3969l c3969l322 = c3969l;
                    C3422b c3422b22 = g10;
                    m1950UniTextBlockItemImplIu0eelc(c3422b22, i4622, abstractC7799Q3, i35, i36, z12, i38, function1422, uniTextPreset2, c3969l322, (i17 & 7168) | ((i17 >> 9) & 57344) | ((i32 << 15) & 458752) | (29360128 & (i32 << 18)) | (234881024 & (i17 << 18)));
                    c3969l2 = c3969l322;
                    uniTextPreset3 = uniTextPreset2;
                    f14 = f13;
                    i39 = i35;
                    uniTextResizing3 = uniTextResizing2;
                    i41 = i37;
                    z13 = z12;
                    i42 = i36;
                    eVar4 = eVar522;
                    function13 = function1422;
                    m02 = c3969l2.m0();
                    if (m02 == null) {
                    }
                }
                i26 = i25;
                i27 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i27 == 0) {
                }
                i28 = i27;
                i29 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i29 != 0) {
                }
                i33 = i16 & 2048;
                if (i33 != 0) {
                }
                i34 = i33;
                if ((i17 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i14 & 1) != 0) {
                }
                if (i44 == 0) {
                }
                if (i18 == 0) {
                }
                if ((i16 & 8) == 0) {
                }
                if (i21 == 0) {
                }
                if (i22 != 0) {
                }
                if (i23 != 0) {
                }
                if (i24 == 0) {
                }
                if (i26 == 0) {
                }
                if (i28 == 0) {
                }
                if (i31 == 0) {
                }
                if (i34 == 0) {
                }
                u11.j0();
                if (i37 != 0) {
                }
                if (!uniTextPreset2.getAllCaps()) {
                }
                e eVar5222 = eVar3;
                e uniTestTag222 = UniTestTagsKt.uniTestTag(eVar5222, UniTextTestTags.Text, null, u11, ((i17 >> 3) & 14) | 48, 2);
                Function1<? super K, Unit> function14222 = function12;
                if (uniTextResizing2 != UniTextResizing.Fill) {
                }
                e i46222 = androidx.compose.foundation.layout.T.i(uniTestTag222, f12, uniTextPreset2.getPaddingTop(), f13, uniTextPreset2.getPaddingBottom());
                a.b(i46222, "text");
                u11.o(885183793);
                if (abstractC7799Q2 != null) {
                }
                c3969l.k();
                C3969l c3969l3222 = c3969l;
                C3422b c3422b222 = g10;
                m1950UniTextBlockItemImplIu0eelc(c3422b222, i46222, abstractC7799Q3, i35, i36, z12, i38, function14222, uniTextPreset2, c3969l3222, (i17 & 7168) | ((i17 >> 9) & 57344) | ((i32 << 15) & 458752) | (29360128 & (i32 << 18)) | (234881024 & (i17 << 18)));
                c3969l2 = c3969l3222;
                uniTextPreset3 = uniTextPreset2;
                f14 = f13;
                i39 = i35;
                uniTextResizing3 = uniTextResizing2;
                i41 = i37;
                z13 = z12;
                i42 = i36;
                eVar4 = eVar5222;
                function13 = function14222;
                m02 = c3969l2.m0();
                if (m02 == null) {
                }
            }
            i22 = i16 & 32;
            if (i22 != 0) {
            }
            i23 = i16 & 64;
            if (i23 != 0) {
            }
            i24 = i16 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i24 != 0) {
            }
            i25 = i16 & 256;
            if (i25 != 0) {
            }
            i26 = i25;
            i27 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i27 == 0) {
            }
            i28 = i27;
            i29 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i29 != 0) {
            }
            i33 = i16 & 2048;
            if (i33 != 0) {
            }
            i34 = i33;
            if ((i17 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i14 & 1) != 0) {
            }
            if (i44 == 0) {
            }
            if (i18 == 0) {
            }
            if ((i16 & 8) == 0) {
            }
            if (i21 == 0) {
            }
            if (i22 != 0) {
            }
            if (i23 != 0) {
            }
            if (i24 == 0) {
            }
            if (i26 == 0) {
            }
            if (i28 == 0) {
            }
            if (i31 == 0) {
            }
            if (i34 == 0) {
            }
            u11.j0();
            if (i37 != 0) {
            }
            if (!uniTextPreset2.getAllCaps()) {
            }
            e eVar52222 = eVar3;
            e uniTestTag2222 = UniTestTagsKt.uniTestTag(eVar52222, UniTextTestTags.Text, null, u11, ((i17 >> 3) & 14) | 48, 2);
            Function1<? super K, Unit> function142222 = function12;
            if (uniTextResizing2 != UniTextResizing.Fill) {
            }
            e i462222 = androidx.compose.foundation.layout.T.i(uniTestTag2222, f12, uniTextPreset2.getPaddingTop(), f13, uniTextPreset2.getPaddingBottom());
            a.b(i462222, "text");
            u11.o(885183793);
            if (abstractC7799Q2 != null) {
            }
            c3969l.k();
            C3969l c3969l32222 = c3969l;
            C3422b c3422b2222 = g10;
            m1950UniTextBlockItemImplIu0eelc(c3422b2222, i462222, abstractC7799Q3, i35, i36, z12, i38, function142222, uniTextPreset2, c3969l32222, (i17 & 7168) | ((i17 >> 9) & 57344) | ((i32 << 15) & 458752) | (29360128 & (i32 << 18)) | (234881024 & (i17 << 18)));
            c3969l2 = c3969l32222;
            uniTextPreset3 = uniTextPreset2;
            f14 = f13;
            i39 = i35;
            uniTextResizing3 = uniTextResizing2;
            i41 = i37;
            z13 = z12;
            i42 = i36;
            eVar4 = eVar52222;
            function13 = function142222;
            m02 = c3969l2.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        i18 = i16 & 4;
        if (i18 == 0) {
        }
        if ((i14 & 3072) != 0) {
        }
        i21 = i16 & 16;
        if (i21 == 0) {
        }
        i22 = i16 & 32;
        if (i22 != 0) {
        }
        i23 = i16 & 64;
        if (i23 != 0) {
        }
        i24 = i16 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i24 != 0) {
        }
        i25 = i16 & 256;
        if (i25 != 0) {
        }
        i26 = i25;
        i27 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i27 == 0) {
        }
        i28 = i27;
        i29 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i29 != 0) {
        }
        i33 = i16 & 2048;
        if (i33 != 0) {
        }
        i34 = i33;
        if ((i17 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i14 & 1) != 0) {
        }
        if (i44 == 0) {
        }
        if (i18 == 0) {
        }
        if ((i16 & 8) == 0) {
        }
        if (i21 == 0) {
        }
        if (i22 != 0) {
        }
        if (i23 != 0) {
        }
        if (i24 == 0) {
        }
        if (i26 == 0) {
        }
        if (i28 == 0) {
        }
        if (i31 == 0) {
        }
        if (i34 == 0) {
        }
        u11.j0();
        if (i37 != 0) {
        }
        if (!uniTextPreset2.getAllCaps()) {
        }
        e eVar522222 = eVar3;
        e uniTestTag22222 = UniTestTagsKt.uniTestTag(eVar522222, UniTextTestTags.Text, null, u11, ((i17 >> 3) & 14) | 48, 2);
        Function1<? super K, Unit> function1422222 = function12;
        if (uniTextResizing2 != UniTextResizing.Fill) {
        }
        e i4622222 = androidx.compose.foundation.layout.T.i(uniTestTag22222, f12, uniTextPreset2.getPaddingTop(), f13, uniTextPreset2.getPaddingBottom());
        a.b(i4622222, "text");
        u11.o(885183793);
        if (abstractC7799Q2 != null) {
        }
        c3969l.k();
        C3969l c3969l322222 = c3969l;
        C3422b c3422b22222 = g10;
        m1950UniTextBlockItemImplIu0eelc(c3422b22222, i4622222, abstractC7799Q3, i35, i36, z12, i38, function1422222, uniTextPreset2, c3969l322222, (i17 & 7168) | ((i17 >> 9) & 57344) | ((i32 << 15) & 458752) | (29360128 & (i32 << 18)) | (234881024 & (i17 << 18)));
        c3969l2 = c3969l322222;
        uniTextPreset3 = uniTextPreset2;
        f14 = f13;
        i39 = i35;
        uniTextResizing3 = uniTextResizing2;
        i41 = i37;
        z13 = z12;
        i42 = i36;
        eVar4 = eVar522222;
        function13 = function1422222;
        m02 = c3969l2.m0();
        if (m02 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0208  */
    /* renamed from: UniText-6P7A1Ok, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1949UniText6P7A1Ok(@NotNull C3422b text, e eVar, UniTextPreset uniTextPreset, int i11, UniTextResizing uniTextResizing, float f7, float f11, int i12, long j11, int i13, boolean z11, Function1<? super K, Unit> function1, InterfaceC3967k interfaceC3967k, int i14, int i15, int i16) {
        int i17;
        e eVar2;
        int i18;
        int i19;
        int i21;
        UniTextResizing uniTextResizing2;
        int i22;
        float f12;
        int i23;
        float f13;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        long j12;
        UniTextPreset uniTextPreset2;
        int i34;
        int i35;
        int i36;
        Function1<? super K, Unit> function12;
        boolean z12;
        e eVar3;
        int i37;
        UniTextResizing uniTextResizing3;
        int i38;
        Function1<? super K, Unit> function13;
        C3969l c3969l;
        int i39;
        float f14;
        boolean z13;
        long j13;
        float f15;
        UniTextResizing uniTextResizing4;
        int i41;
        UniTextPreset uniTextPreset3;
        e eVar4;
        J0 m02;
        int i42;
        int i43;
        Intrinsics.checkNotNullParameter(text, "text");
        C3969l u11 = interfaceC3967k.u(1107440122);
        if ((i16 & 1) != 0) {
            i17 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i17 = (u11.n(text) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        int i44 = i16 & 2;
        if (i44 != 0) {
            i17 |= 48;
        } else if ((i14 & 48) == 0) {
            eVar2 = eVar;
            i17 |= u11.n(eVar2) ? 32 : 16;
            i18 = i16 & 4;
            if (i18 == 0) {
                i17 |= 384;
            } else if ((i14 & 384) == 0) {
                i17 |= (i14 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? u11.n(uniTextPreset) : u11.F(uniTextPreset) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i14 & 3072) != 0) {
                if ((i16 & 8) == 0) {
                    i19 = i11;
                    if (u11.r(i19)) {
                        i43 = 2048;
                        i17 |= i43;
                    }
                } else {
                    i19 = i11;
                }
                i43 = UserVerificationMethods.USER_VERIFY_ALL;
                i17 |= i43;
            } else {
                i19 = i11;
            }
            i21 = i16 & 16;
            if (i21 == 0) {
                i17 |= 24576;
            } else if ((i14 & 24576) == 0) {
                uniTextResizing2 = uniTextResizing;
                i17 |= u11.n(uniTextResizing2) ? 16384 : 8192;
                i22 = i16 & 32;
                if (i22 != 0) {
                    i17 |= 196608;
                    f12 = f7;
                } else {
                    f12 = f7;
                    if ((i14 & 196608) == 0) {
                        i17 |= u11.q(f12) ? 131072 : 65536;
                    }
                }
                i23 = i16 & 64;
                if (i23 != 0) {
                    i17 |= 1572864;
                    f13 = f11;
                } else {
                    f13 = f11;
                    if ((i14 & 1572864) == 0) {
                        i17 |= u11.q(f13) ? 1048576 : 524288;
                    }
                }
                i24 = i16 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i24 != 0) {
                    i17 |= 12582912;
                    i25 = i12;
                } else {
                    i25 = i12;
                    if ((i14 & 12582912) == 0) {
                        i17 |= u11.r(i25) ? 8388608 : 4194304;
                    }
                }
                if ((i14 & 100663296) == 0) {
                    if ((i16 & 256) == 0 && u11.s(j11)) {
                        i42 = 67108864;
                        i17 |= i42;
                    }
                    i42 = 33554432;
                    i17 |= i42;
                }
                i26 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i26 != 0) {
                    i17 |= 805306368;
                } else if ((805306368 & i14) == 0) {
                    i17 |= u11.r(i13) ? 536870912 : 268435456;
                    i27 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
                    if (i27 == 0) {
                        i29 = i15 | 6;
                        i28 = i27;
                    } else if ((i15 & 6) == 0) {
                        i28 = i27;
                        i29 = i15 | (u11.p(z11) ? 4 : 2);
                    } else {
                        i28 = i27;
                        i29 = i15;
                    }
                    i31 = i16 & 2048;
                    if (i31 == 0) {
                        i29 |= 48;
                    } else if ((i15 & 48) == 0) {
                        i32 = i31;
                        i29 |= u11.F(function1) ? 32 : 16;
                        if ((i17 & 306783379) != 306783378 && (i29 & 19) == 18 && u11.b()) {
                            u11.j();
                            uniTextPreset3 = uniTextPreset;
                            i39 = i13;
                            f14 = f13;
                            i38 = i25;
                            eVar4 = eVar2;
                            c3969l = u11;
                            i41 = i19;
                            j13 = j11;
                            z13 = z11;
                            function13 = function1;
                            f15 = f12;
                            uniTextResizing4 = uniTextResizing2;
                        } else {
                            u11.Q0();
                            if ((i14 & 1) != 0 || u11.w0()) {
                                e eVar5 = i44 != 0 ? e.f40358c0 : eVar2;
                                UniTextPreset uniTextPreset4 = i18 != 0 ? UniTextPreset.Paragraph.INSTANCE : uniTextPreset;
                                if ((i16 & 8) != 0) {
                                    i17 &= -7169;
                                    i33 = 5;
                                } else {
                                    i33 = i19;
                                }
                                if (i21 != 0) {
                                    uniTextResizing2 = UniTextResizing.Fill;
                                }
                                if (i22 != 0) {
                                    f12 = 0;
                                }
                                if (i23 != 0) {
                                    f13 = 0;
                                }
                                int i45 = i24 != 0 ? 2 : i25;
                                if ((i16 & 256) != 0) {
                                    j12 = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getTextPrimary();
                                    i17 = (-234881025) & i17;
                                } else {
                                    j12 = j11;
                                }
                                int i46 = i26 != 0 ? 1 : i13;
                                boolean z14 = i28 == 0 ? z11 : true;
                                if (i32 != 0) {
                                    u11.o(885103519);
                                    Object C11 = u11.C();
                                    if (C11 == InterfaceC3967k.a.a()) {
                                        C11 = UniTextKt$UniText$2$1.INSTANCE;
                                        u11.x(C11);
                                    }
                                    u11.k();
                                    uniTextPreset2 = uniTextPreset4;
                                    i34 = i33;
                                    i35 = i46;
                                    function12 = (Function1) C11;
                                    i36 = i45;
                                } else {
                                    uniTextPreset2 = uniTextPreset4;
                                    i34 = i33;
                                    i35 = i46;
                                    i36 = i45;
                                    function12 = function1;
                                }
                                z12 = z14;
                                eVar3 = eVar5;
                                i37 = i17;
                                uniTextResizing3 = uniTextResizing2;
                            } else {
                                u11.j();
                                if ((i16 & 8) != 0) {
                                    i17 &= -7169;
                                }
                                if ((i16 & 256) != 0) {
                                    i17 &= -234881025;
                                }
                                uniTextPreset2 = uniTextPreset;
                                i35 = i13;
                                function12 = function1;
                                i37 = i17;
                                i36 = i25;
                                eVar3 = eVar2;
                                i34 = i19;
                                uniTextResizing3 = uniTextResizing2;
                                j12 = j11;
                                z12 = z11;
                            }
                            u11.j0();
                            long j14 = j12;
                            m1948UniText28lkidg(text, eVar3, uniTextPreset2, i34, uniTextResizing3, f12, f13, i36, new K0(j12), i35 == 0 ? Integer.MAX_VALUE : i35, z12, function12, u11, i37 & 33554430, i29 & 126, 0);
                            i38 = i36;
                            function13 = function12;
                            c3969l = u11;
                            i39 = i35;
                            f14 = f13;
                            z13 = z12;
                            j13 = j14;
                            f15 = f12;
                            uniTextResizing4 = uniTextResizing3;
                            i41 = i34;
                            uniTextPreset3 = uniTextPreset2;
                            eVar4 = eVar3;
                        }
                        m02 = c3969l.m0();
                        if (m02 != null) {
                            m02.G(new UniTextKt$UniText$3(text, eVar4, uniTextPreset3, i41, uniTextResizing4, f15, f14, i38, j13, i39, z13, function13, i14, i15, i16));
                            return;
                        }
                        return;
                    }
                    i32 = i31;
                    if ((i17 & 306783379) != 306783378) {
                    }
                    u11.Q0();
                    if ((i14 & 1) != 0) {
                    }
                    if (i44 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if ((i16 & 8) != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i23 != 0) {
                    }
                    if (i24 != 0) {
                    }
                    if ((i16 & 256) != 0) {
                    }
                    if (i26 != 0) {
                    }
                    if (i28 == 0) {
                    }
                    if (i32 != 0) {
                    }
                    z12 = z14;
                    eVar3 = eVar5;
                    i37 = i17;
                    uniTextResizing3 = uniTextResizing2;
                    u11.j0();
                    long j142 = j12;
                    m1948UniText28lkidg(text, eVar3, uniTextPreset2, i34, uniTextResizing3, f12, f13, i36, new K0(j12), i35 == 0 ? Integer.MAX_VALUE : i35, z12, function12, u11, i37 & 33554430, i29 & 126, 0);
                    i38 = i36;
                    function13 = function12;
                    c3969l = u11;
                    i39 = i35;
                    f14 = f13;
                    z13 = z12;
                    j13 = j142;
                    f15 = f12;
                    uniTextResizing4 = uniTextResizing3;
                    i41 = i34;
                    uniTextPreset3 = uniTextPreset2;
                    eVar4 = eVar3;
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                i27 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i27 == 0) {
                }
                i31 = i16 & 2048;
                if (i31 == 0) {
                }
                i32 = i31;
                if ((i17 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i14 & 1) != 0) {
                }
                if (i44 != 0) {
                }
                if (i18 != 0) {
                }
                if ((i16 & 8) != 0) {
                }
                if (i21 != 0) {
                }
                if (i22 != 0) {
                }
                if (i23 != 0) {
                }
                if (i24 != 0) {
                }
                if ((i16 & 256) != 0) {
                }
                if (i26 != 0) {
                }
                if (i28 == 0) {
                }
                if (i32 != 0) {
                }
                z12 = z14;
                eVar3 = eVar5;
                i37 = i17;
                uniTextResizing3 = uniTextResizing2;
                u11.j0();
                long j1422 = j12;
                m1948UniText28lkidg(text, eVar3, uniTextPreset2, i34, uniTextResizing3, f12, f13, i36, new K0(j12), i35 == 0 ? Integer.MAX_VALUE : i35, z12, function12, u11, i37 & 33554430, i29 & 126, 0);
                i38 = i36;
                function13 = function12;
                c3969l = u11;
                i39 = i35;
                f14 = f13;
                z13 = z12;
                j13 = j1422;
                f15 = f12;
                uniTextResizing4 = uniTextResizing3;
                i41 = i34;
                uniTextPreset3 = uniTextPreset2;
                eVar4 = eVar3;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            uniTextResizing2 = uniTextResizing;
            i22 = i16 & 32;
            if (i22 != 0) {
            }
            i23 = i16 & 64;
            if (i23 != 0) {
            }
            i24 = i16 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i24 != 0) {
            }
            if ((i14 & 100663296) == 0) {
            }
            i26 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i26 != 0) {
            }
            i27 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i27 == 0) {
            }
            i31 = i16 & 2048;
            if (i31 == 0) {
            }
            i32 = i31;
            if ((i17 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i14 & 1) != 0) {
            }
            if (i44 != 0) {
            }
            if (i18 != 0) {
            }
            if ((i16 & 8) != 0) {
            }
            if (i21 != 0) {
            }
            if (i22 != 0) {
            }
            if (i23 != 0) {
            }
            if (i24 != 0) {
            }
            if ((i16 & 256) != 0) {
            }
            if (i26 != 0) {
            }
            if (i28 == 0) {
            }
            if (i32 != 0) {
            }
            z12 = z14;
            eVar3 = eVar5;
            i37 = i17;
            uniTextResizing3 = uniTextResizing2;
            u11.j0();
            long j14222 = j12;
            m1948UniText28lkidg(text, eVar3, uniTextPreset2, i34, uniTextResizing3, f12, f13, i36, new K0(j12), i35 == 0 ? Integer.MAX_VALUE : i35, z12, function12, u11, i37 & 33554430, i29 & 126, 0);
            i38 = i36;
            function13 = function12;
            c3969l = u11;
            i39 = i35;
            f14 = f13;
            z13 = z12;
            j13 = j14222;
            f15 = f12;
            uniTextResizing4 = uniTextResizing3;
            i41 = i34;
            uniTextPreset3 = uniTextPreset2;
            eVar4 = eVar3;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        i18 = i16 & 4;
        if (i18 == 0) {
        }
        if ((i14 & 3072) != 0) {
        }
        i21 = i16 & 16;
        if (i21 == 0) {
        }
        uniTextResizing2 = uniTextResizing;
        i22 = i16 & 32;
        if (i22 != 0) {
        }
        i23 = i16 & 64;
        if (i23 != 0) {
        }
        i24 = i16 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i24 != 0) {
        }
        if ((i14 & 100663296) == 0) {
        }
        i26 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i26 != 0) {
        }
        i27 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i27 == 0) {
        }
        i31 = i16 & 2048;
        if (i31 == 0) {
        }
        i32 = i31;
        if ((i17 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i14 & 1) != 0) {
        }
        if (i44 != 0) {
        }
        if (i18 != 0) {
        }
        if ((i16 & 8) != 0) {
        }
        if (i21 != 0) {
        }
        if (i22 != 0) {
        }
        if (i23 != 0) {
        }
        if (i24 != 0) {
        }
        if ((i16 & 256) != 0) {
        }
        if (i26 != 0) {
        }
        if (i28 == 0) {
        }
        if (i32 != 0) {
        }
        z12 = z14;
        eVar3 = eVar5;
        i37 = i17;
        uniTextResizing3 = uniTextResizing2;
        u11.j0();
        long j142222 = j12;
        m1948UniText28lkidg(text, eVar3, uniTextPreset2, i34, uniTextResizing3, f12, f13, i36, new K0(j12), i35 == 0 ? Integer.MAX_VALUE : i35, z12, function12, u11, i37 & 33554430, i29 & 126, 0);
        i38 = i36;
        function13 = function12;
        c3969l = u11;
        i39 = i35;
        f14 = f13;
        z13 = z12;
        j13 = j142222;
        f15 = f12;
        uniTextResizing4 = uniTextResizing3;
        i41 = i34;
        uniTextPreset3 = uniTextPreset2;
        eVar4 = eVar3;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0114, code lost:
    
        if (r6 == S0.InterfaceC3967k.a.a()) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* renamed from: UniTextBlockItemImpl-Iu0eelc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1950UniTextBlockItemImplIu0eelc(@NotNull C3422b text, @NotNull e modifier, @NotNull AbstractC7799Q color, int i11, int i12, boolean z11, int i13, @NotNull Function1<? super K, Unit> onTextLayout, @NotNull UniTextPreset preset, InterfaceC3967k interfaceC3967k, int i14) {
        int i15;
        ArrayList arrayList;
        Object obj;
        C3969l c3969l;
        C3969l c3969l2;
        J0 m02;
        C3969l c3969l3;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(onTextLayout, "onTextLayout");
        Intrinsics.checkNotNullParameter(preset, "preset");
        C3969l u11 = interfaceC3967k.u(1817549787);
        int i16 = (i14 & 6) == 0 ? (u11.n(text) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i16 |= u11.n(modifier) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= u11.n(color) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 3072) == 0) {
            i15 = i11;
            i16 |= u11.r(i15) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            i15 = i11;
        }
        if ((i14 & 24576) == 0) {
            i16 |= u11.r(i12) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= u11.p(z11) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i16 |= u11.r(i13) ? 1048576 : 524288;
        }
        if ((12582912 & i14) == 0) {
            i16 |= u11.F(onTextLayout) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i16 |= (134217728 & i14) == 0 ? u11.n(preset) : u11.F(preset) ? 67108864 : 33554432;
        }
        if ((38347923 & i16) == 38347922 && u11.b()) {
            u11.j();
            c3969l3 = u11;
        } else {
            int i17 = i16;
            long paragraphSpacing = preset.getParagraphSpacing();
            u11.o(474927341);
            int i18 = i17 & 14;
            boolean s11 = u11.s(paragraphSpacing) | (i18 == 4);
            Object C11 = u11.C();
            if (!s11) {
                obj = C11;
            }
            long paragraphSpacing2 = preset.getParagraphSpacing();
            long d11 = Hj0.T.d(0);
            Hj0.T.a(paragraphSpacing2, d11);
            if (Float.compare(u.e(paragraphSpacing2), u.e(d11)) > 0) {
                List<C3422b> split = TextUtilsKt.split(text, "\n");
                arrayList = new ArrayList();
                for (Object obj2 : split) {
                    if (((C3422b) obj2).length() > 0) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = null;
            }
            u11.x(arrayList);
            obj = arrayList;
            List list = (List) obj;
            u11.k();
            if (list == null || list.size() <= 1) {
                u11.o(1839344597);
                int i19 = i17 >> 3;
                c3969l = u11;
                p2.c(StringExtensionsKt.applyGradient(text, color, u11, (i19 & 112) | i18), modifier, 0L, 0L, 0L, h.a(i11), 0L, i12, z11, i13, 0, null, onTextLayout, preset.getTextStyle(), c3969l, (i17 & 112) | ((i17 << 18) & 1879048192), ((i17 >> 9) & 8176) | (i19 & 3670016), 50684);
                c3969l.k();
                m02 = c3969l.m0();
                if (m02 == null) {
                    m02.G(new UniTextKt$UniTextBlockItemImpl$1(text, modifier, color, i11, i12, z11, i13, onTextLayout, preset, i14));
                    return;
                }
                return;
            }
            u11.o(1838130978);
            if (i13 == Integer.MAX_VALUE) {
                u11.o(1838158227);
                u11.o(474938122);
                C3422b.a aVar = new C3422b.a();
                u11.o(474939658);
                int size = list.size();
                for (int i21 = 0; i21 < size; i21++) {
                    StringExtensionsKt.applyGradient((C3422b) list.get(i21), color, u11, (i17 >> 3) & 112);
                    if (i21 < C7714v.P(list)) {
                        int g10 = aVar.g(new C3440u(0, 0, preset.getParagraphSpacing(), null, 507));
                        try {
                            Unit unit = Unit.f71690a;
                        } finally {
                            aVar.f(g10);
                        }
                    }
                }
                u11.k();
                C3422b i22 = aVar.i();
                u11.k();
                p2.c(i22, modifier, 0L, 0L, 0L, h.a(i15), 0L, i12, z11, i13, 0, null, onTextLayout, preset.getTextStyle(), u11, (i17 & 112) | (1879048192 & (i17 << 18)), ((i17 >> 9) & 8176) | ((i17 >> 3) & 3670016), 50684);
                C3969l c3969l4 = u11;
                c3969l4.k();
                c3969l2 = c3969l4;
            } else {
                u11.o(1838956291);
                m1947MaxLinesParagraphTextBlockAnnotated8fRtlAg(modifier, list, i11, i12, z11, i13, onTextLayout, preset, u11, (i17 >> 3) & 33554318);
                u11.k();
                c3969l2 = u11;
            }
            c3969l2.k();
            c3969l3 = c3969l2;
        }
        c3969l = c3969l3;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }
}
