package ru.ozon.uni.components.productMedia;

import A0.g;
import A0.h;
import B0.C2510t;
import B1.InterfaceC2547p;
import B1.V;
import D1.InterfaceC2801g;
import K00.b;
import K1.T;
import P0.E;
import P9.a;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Z1.d;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5182e;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.InterfaceC7813c0;
import l1.K0;
import n0.C8385f;
import n0.C8391l;
import q1.AbstractC8972b;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.utils.PainterUtilsKt;
import ru.ozon.uni.utils.UniTestTagsKt;
import t0.q;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0005\u001aÿ\u0001\u0010(\u001a\u00020\"2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u00122\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0004\b&\u0010'\u001a'\u0010+\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0019H\u0003¢\u0006\u0004\b)\u0010*\u001a9\u00102\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u00122\b\b\u0002\u0010/\u001a\u00020.H\u0003¢\u0006\u0004\b0\u00101\u001a+\u00107\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00104\u001a\u000203H\u0003¢\u0006\u0004\b5\u00106¨\u00068"}, d2 = {"Lq1/b;", "image", "Landroidx/compose/ui/e;", "modifier", "Lru/ozon/uni/components/productMedia/UniProductMediaSize;", "size", "", "ratio", "Ll1/Q;", "background", "", "hasParanja", "Ln0/l;", "border", "Lru/ozon/uni/components/productMedia/UniProductMediaBorderStyle;", "borderStyle", "hasOverlay", "graphic", "Ll1/Z;", "graphicColor", "", "label", "labelColor", "LK1/T;", "textStyle", "LZ1/h;", "radius", "LB1/p;", "fitType", "smallGraphic", "smallLabel", "smallGraphicColor", "smallLabelColor", "Lkotlin/Function0;", "", "onClick", "Lt0/q;", "interactionSource", "UniProductMedia-wzanWIw", "(Lq1/b;Landroidx/compose/ui/e;Lru/ozon/uni/components/productMedia/UniProductMediaSize;FLl1/Q;ZLn0/l;Lru/ozon/uni/components/productMedia/UniProductMediaBorderStyle;ZLq1/b;JLjava/lang/String;JLK1/T;FLB1/p;Lq1/b;Ljava/lang/String;JJLkotlin/jvm/functions/Function0;Lt0/q;LS0/k;IIII)V", "UniProductMedia", "Icon-RFCenO8", "(Lq1/b;JFLS0/k;I)V", "Icon", "horizontalPadding", "color", "", "maxLines", "Label-LyZNIlQ", "(Ljava/lang/String;FLK1/T;JILS0/k;II)V", "Label", "", "intervals", "dashedBorder-d8LSEHM", "(Landroidx/compose/ui/e;Ln0/l;F[F)Landroidx/compose/ui/e;", "dashedBorder", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniProductMediaKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Icon-RFCenO8, reason: not valid java name */
    public static final void m1929IconRFCenO8(AbstractC8972b abstractC8972b, long j11, float f7, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        AbstractC8972b abstractC8972b2;
        C3969l u11 = interfaceC3967k.u(-663018608);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(abstractC8972b) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.s(j11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.q(f7) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            abstractC8972b2 = abstractC8972b;
        } else {
            e uniTestTag = UniTestTagsKt.uniTestTag(a0.n(e.f40358c0, f7), UniProductMediaTestTags.Graphic, null, u11, 48, 2);
            Intrinsics.checkNotNullParameter(uniTestTag, "<this>");
            Intrinsics.checkNotNullParameter("icon", "id");
            abstractC8972b2 = abstractC8972b;
            E.a(abstractC8972b2, null, uniTestTag, PainterUtilsKt.m3266takeIfNotMulticolorIconDxMtmZc(j11, abstractC8972b), u11, (i12 & 14) | 48);
            u11 = u11;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new UniProductMediaKt$Icon$1(abstractC8972b2, j11, f7, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0069  */
    /* renamed from: Label-LyZNIlQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1930LabelLyZNIlQ(String str, float f7, T t2, final long j11, int i11, InterfaceC3967k interfaceC3967k, int i12, int i13) {
        String str2;
        int i14;
        T t11;
        int i15;
        int i16;
        boolean z11;
        Object C11;
        int i17;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(2087619696);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
            str2 = str;
        } else if ((i12 & 6) == 0) {
            str2 = str;
            i14 = (u11.n(str2) ? 4 : 2) | i12;
        } else {
            str2 = str;
            i14 = i12;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i12 & 48) == 0) {
            i14 |= u11.q(f7) ? 32 : 16;
        }
        if ((i13 & 4) != 0) {
            i14 |= 384;
        } else if ((i12 & 384) == 0) {
            t11 = t2;
            i14 |= u11.n(t11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i13 & 8) == 0) {
                i14 |= 3072;
            } else if ((i12 & 3072) == 0) {
                i14 |= u11.s(j11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            i15 = i13 & 16;
            if (i15 == 0) {
                i14 |= 24576;
            } else if ((i12 & 24576) == 0) {
                i16 = i11;
                i14 |= u11.r(i16) ? 16384 : 8192;
                if ((i14 & 9363) == 9362 || !u11.b()) {
                    int i18 = i15 != 0 ? 1 : i16;
                    e uniTestTag = UniTestTagsKt.uniTestTag(androidx.compose.foundation.layout.T.h(e.f40358c0, f7, 0.0f, 2), UniProductMediaTestTags.Label, null, u11, 48, 2);
                    a.b(uniTestTag, "text");
                    u11.o(495539795);
                    z11 = (i14 & 7168) == 2048;
                    C11 = u11.C();
                    if (!z11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new InterfaceC7813c0() { // from class: ru.ozon.uni.components.productMedia.UniProductMediaKt$Label$1$1
                            @Override // l1.InterfaceC7813c0
                            /* renamed from: invoke-0d7_KjU */
                            public final long mo7invoke0d7_KjU() {
                                return j11;
                            }
                        };
                        u11.x(C11);
                    }
                    u11.k();
                    int i19 = i18;
                    C2510t.b(str2, uniTestTag, t11, null, 2, false, i19, 0, (InterfaceC7813c0) C11, u11, (i14 & 14) | 24576 | (i14 & 896) | ((i14 << 6) & 3670016), 168);
                    u11 = u11;
                    i17 = i19;
                } else {
                    u11.j();
                    i17 = i16;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new UniProductMediaKt$Label$2(str, f7, t2, j11, i17, i12, i13));
                    return;
                }
                return;
            }
            i16 = i11;
            if ((i14 & 9363) == 9362) {
            }
            if (i15 != 0) {
            }
            e uniTestTag2 = UniTestTagsKt.uniTestTag(androidx.compose.foundation.layout.T.h(e.f40358c0, f7, 0.0f, 2), UniProductMediaTestTags.Label, null, u11, 48, 2);
            a.b(uniTestTag2, "text");
            u11.o(495539795);
            if ((i14 & 7168) == 2048) {
            }
            C11 = u11.C();
            if (!z11) {
            }
            C11 = new InterfaceC7813c0() { // from class: ru.ozon.uni.components.productMedia.UniProductMediaKt$Label$1$1
                @Override // l1.InterfaceC7813c0
                /* renamed from: invoke-0d7_KjU */
                public final long mo7invoke0d7_KjU() {
                    return j11;
                }
            };
            u11.x(C11);
            u11.k();
            int i192 = i18;
            C2510t.b(str2, uniTestTag2, t11, null, 2, false, i192, 0, (InterfaceC7813c0) C11, u11, (i14 & 14) | 24576 | (i14 & 896) | ((i14 << 6) & 3670016), 168);
            u11 = u11;
            i17 = i192;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        t11 = t2;
        if ((i13 & 8) == 0) {
        }
        i15 = i13 & 16;
        if (i15 == 0) {
        }
        i16 = i11;
        if ((i14 & 9363) == 9362) {
        }
        if (i15 != 0) {
        }
        e uniTestTag22 = UniTestTagsKt.uniTestTag(androidx.compose.foundation.layout.T.h(e.f40358c0, f7, 0.0f, 2), UniProductMediaTestTags.Label, null, u11, 48, 2);
        a.b(uniTestTag22, "text");
        u11.o(495539795);
        if ((i14 & 7168) == 2048) {
        }
        C11 = u11.C();
        if (!z11) {
        }
        C11 = new InterfaceC7813c0() { // from class: ru.ozon.uni.components.productMedia.UniProductMediaKt$Label$1$1
            @Override // l1.InterfaceC7813c0
            /* renamed from: invoke-0d7_KjU */
            public final long mo7invoke0d7_KjU() {
                return j11;
            }
        };
        u11.x(C11);
        u11.k();
        int i1922 = i18;
        C2510t.b(str2, uniTestTag22, t11, null, 2, false, i1922, 0, (InterfaceC7813c0) C11, u11, (i14 & 14) | 24576 | (i14 & 896) | ((i14 << 6) & 3670016), 168);
        u11 = u11;
        i17 = i1922;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x04de, code lost:
    
        if (r4 == S0.InterfaceC3967k.a.a()) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ab, code lost:
    
        if (r4.n(r58) == false) goto L150;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x058a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0688 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b5  */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* renamed from: UniProductMedia-wzanWIw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1931UniProductMediawzanWIw(AbstractC8972b abstractC8972b, e eVar, UniProductMediaSize uniProductMediaSize, float f7, AbstractC7799Q abstractC7799Q, boolean z11, C8391l c8391l, UniProductMediaBorderStyle uniProductMediaBorderStyle, boolean z12, AbstractC8972b abstractC8972b2, long j11, String str, long j12, T t2, float f11, InterfaceC2547p interfaceC2547p, AbstractC8972b abstractC8972b3, String str2, long j13, long j14, Function0<Unit> function0, q qVar, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13, int i14) {
        int i15;
        e eVar2;
        int i16;
        UniProductMediaSize uniProductMediaSize2;
        int i17;
        float f12;
        AbstractC7799Q abstractC7799Q2;
        int i18;
        boolean z13;
        int i19;
        C8391l c8391l2;
        int i21;
        UniProductMediaBorderStyle uniProductMediaBorderStyle2;
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
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        boolean z14;
        boolean z15;
        long j15;
        String str3;
        UniProductMediaBorderStyle uniProductMediaBorderStyle3;
        long j16;
        T t11;
        InterfaceC2547p d11;
        AbstractC8972b abstractC8972b4;
        String str4;
        long j17;
        long j18;
        Function0<Unit> function02;
        int i41;
        q qVar2;
        int i42;
        float f13;
        AbstractC8972b abstractC8972b5;
        boolean z16;
        g b11;
        AbstractC8972b abstractC8972b6;
        T t12;
        boolean z17;
        e d12;
        q qVar3;
        int I11;
        T t13;
        AbstractC8972b abstractC8972b7;
        int I12;
        q qVar4;
        q qVar5;
        T t14;
        float f14;
        C3969l c3969l;
        UniProductMediaSize uniProductMediaSize3;
        AbstractC8972b abstractC8972b8;
        Function0<Unit> function03;
        e eVar3;
        boolean z18;
        long j19;
        C8391l c8391l3;
        InterfaceC2547p interfaceC2547p2;
        long j21;
        float f15;
        UniProductMediaBorderStyle uniProductMediaBorderStyle4;
        AbstractC7799Q abstractC7799Q3;
        boolean z19;
        String str5;
        long j22;
        long j23;
        AbstractC8972b abstractC8972b9;
        AbstractC8972b abstractC8972b10;
        Object obj;
        J0 m02;
        int i43;
        int i44;
        int i45;
        C3969l u11 = interfaceC3967k.u(1101320614);
        if ((i14 & 1) != 0) {
            i15 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i15 = (u11.n(abstractC8972b) ? 4 : 2) | i11;
        } else {
            i15 = i11;
        }
        int i46 = i14 & 2;
        if (i46 != 0) {
            i15 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i15 |= u11.n(eVar2) ? 32 : 16;
            i16 = i14 & 4;
            if (i16 == 0) {
                i15 |= 384;
            } else if ((i11 & 384) == 0) {
                uniProductMediaSize2 = uniProductMediaSize;
                i15 |= u11.n(uniProductMediaSize2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i17 = i14 & 8;
                int i47 = 2048;
                if (i17 != 0) {
                    i15 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    f12 = f7;
                    i15 |= u11.q(f12) ? 2048 : 1024;
                    if ((i11 & 24576) != 0) {
                        if ((i14 & 16) == 0) {
                            abstractC7799Q2 = abstractC7799Q;
                            if (u11.n(abstractC7799Q2)) {
                                i45 = 16384;
                                i15 |= i45;
                            }
                        } else {
                            abstractC7799Q2 = abstractC7799Q;
                        }
                        i45 = 8192;
                        i15 |= i45;
                    } else {
                        abstractC7799Q2 = abstractC7799Q;
                    }
                    i18 = i14 & 32;
                    if (i18 == 0) {
                        i15 |= 196608;
                        z13 = z11;
                    } else {
                        z13 = z11;
                        if ((i11 & 196608) == 0) {
                            i15 |= u11.p(z13) ? 131072 : 65536;
                        }
                    }
                    i19 = i14 & 64;
                    if (i19 == 0) {
                        i15 |= 1572864;
                        c8391l2 = c8391l;
                    } else {
                        c8391l2 = c8391l;
                        if ((i11 & 1572864) == 0) {
                            i15 |= u11.n(c8391l2) ? 1048576 : 524288;
                        }
                    }
                    i21 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i21 == 0) {
                        i15 |= 12582912;
                        uniProductMediaBorderStyle2 = uniProductMediaBorderStyle;
                    } else {
                        uniProductMediaBorderStyle2 = uniProductMediaBorderStyle;
                        if ((i11 & 12582912) == 0) {
                            i15 |= u11.n(uniProductMediaBorderStyle2) ? 8388608 : 4194304;
                        }
                    }
                    i22 = i14 & 256;
                    if (i22 == 0) {
                        i15 |= 100663296;
                    } else if ((i11 & 100663296) == 0) {
                        i23 = i22;
                        i15 |= u11.p(z12) ? 67108864 : 33554432;
                        i24 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
                        if (i24 != 0) {
                            i15 |= 805306368;
                        } else if ((i11 & 805306368) == 0) {
                            i25 = i24;
                            i15 |= u11.n(abstractC8972b2) ? 536870912 : 268435456;
                            if ((i12 & 6) != 0) {
                                if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) == 0 && u11.s(j11)) {
                                    i44 = 4;
                                    i26 = i12 | i44;
                                }
                                i44 = 2;
                                i26 = i12 | i44;
                            } else {
                                i26 = i12;
                            }
                            i27 = i14 & 2048;
                            if (i27 == 0) {
                                i26 |= 48;
                            } else if ((i12 & 48) == 0) {
                                i26 |= u11.n(str) ? 32 : 16;
                                if ((i12 & 384) == 0) {
                                    if ((i14 & 4096) == 0 && u11.s(j12)) {
                                        i43 = 256;
                                        i26 |= i43;
                                    }
                                    i43 = UserVerificationMethods.USER_VERIFY_PATTERN;
                                    i26 |= i43;
                                }
                                if ((i12 & 3072) == 0) {
                                    if ((i14 & 8192) != 0) {
                                    }
                                    i47 = 1024;
                                    i26 |= i47;
                                }
                                int i48 = i26;
                                i28 = i14 & 16384;
                                if (i28 != 0) {
                                    i48 |= 24576;
                                    i29 = i28;
                                } else {
                                    i29 = i28;
                                    if ((i12 & 24576) == 0) {
                                        i48 |= u11.q(f11) ? 16384 : 8192;
                                        i31 = i14 & 32768;
                                        if (i31 == 0) {
                                            i48 |= 196608;
                                        } else if ((i12 & 196608) == 0) {
                                            i48 |= u11.n(interfaceC2547p) ? 131072 : 65536;
                                        }
                                        i32 = i14 & 65536;
                                        if (i32 == 0) {
                                            i48 |= 1572864;
                                        } else if ((i12 & 1572864) == 0) {
                                            i48 |= u11.n(abstractC8972b3) ? 1048576 : 524288;
                                        }
                                        i33 = i14 & 131072;
                                        if (i33 == 0) {
                                            i48 |= 12582912;
                                        } else if ((i12 & 12582912) == 0) {
                                            i48 |= u11.n(str2) ? 8388608 : 4194304;
                                        }
                                        i34 = i14 & 262144;
                                        if (i34 == 0) {
                                            i48 |= 100663296;
                                        } else if ((i12 & 100663296) == 0) {
                                            i35 = i48 | (u11.s(j13) ? 67108864 : 33554432);
                                            i36 = i14 & 524288;
                                            if (i36 != 0) {
                                                i35 |= 805306368;
                                            } else if ((i12 & 805306368) == 0) {
                                                i35 |= u11.s(j14) ? 536870912 : 268435456;
                                            }
                                            i37 = i14 & 1048576;
                                            if (i37 != 0) {
                                                i38 = i13 | 6;
                                            } else if ((i13 & 6) == 0) {
                                                i38 = i13 | (u11.F(function0) ? 4 : 2);
                                            } else {
                                                i38 = i13;
                                            }
                                            i39 = 2097152 & i14;
                                            if (i39 != 0) {
                                                i38 |= 48;
                                            } else if ((i13 & 48) == 0) {
                                                i38 |= u11.n(qVar) ? 32 : 16;
                                            }
                                            if ((i15 & 306783379) != 306783378 && (i35 & 306783379) == 306783378 && (i38 & 19) == 18 && u11.b()) {
                                                u11.j();
                                                t14 = t2;
                                                f15 = f11;
                                                interfaceC2547p2 = interfaceC2547p;
                                                abstractC8972b8 = abstractC8972b3;
                                                str4 = str2;
                                                j22 = j13;
                                                j23 = j14;
                                                function03 = function0;
                                                qVar5 = qVar;
                                                c3969l = u11;
                                                uniProductMediaBorderStyle4 = uniProductMediaBorderStyle2;
                                                f14 = f12;
                                                abstractC7799Q3 = abstractC7799Q2;
                                                eVar3 = eVar2;
                                                z19 = z13;
                                                c8391l3 = c8391l2;
                                                uniProductMediaSize3 = uniProductMediaSize2;
                                                z18 = z12;
                                                abstractC8972b9 = abstractC8972b2;
                                                j19 = j11;
                                                str5 = str;
                                                j21 = j12;
                                            } else {
                                                u11.Q0();
                                                if ((i11 & 1) != 0 || u11.w0()) {
                                                    if (i46 != 0) {
                                                        eVar2 = e.f40358c0;
                                                    }
                                                    if (i16 != 0) {
                                                        uniProductMediaSize2 = UniProductMediaSize.Size500;
                                                    }
                                                    if (i17 != 0) {
                                                        f12 = 1.0f;
                                                    }
                                                    if ((i14 & 16) != 0) {
                                                        z14 = false;
                                                        i15 &= -57345;
                                                        abstractC7799Q2 = new K0(UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgPrimary());
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    if (i18 != 0) {
                                                        z13 = z14 ? 1 : 0;
                                                    }
                                                    if (i19 != 0) {
                                                        c8391l2 = null;
                                                    }
                                                    UniProductMediaBorderStyle uniProductMediaBorderStyle5 = i21 != 0 ? UniProductMediaBorderStyle.SOLID : uniProductMediaBorderStyle2;
                                                    z15 = i23 != 0 ? z14 ? 1 : 0 : z12;
                                                    AbstractC8972b abstractC8972b11 = i25 != 0 ? null : abstractC8972b2;
                                                    if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                                        j15 = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicTertiary();
                                                        i35 &= -15;
                                                    } else {
                                                        j15 = j11;
                                                    }
                                                    int i49 = i35;
                                                    str3 = i27 != 0 ? null : str;
                                                    if ((i14 & 4096) != 0) {
                                                        uniProductMediaBorderStyle3 = uniProductMediaBorderStyle5;
                                                        j16 = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getTextTertiary();
                                                        i49 &= -897;
                                                    } else {
                                                        uniProductMediaBorderStyle3 = uniProductMediaBorderStyle5;
                                                        j16 = j12;
                                                    }
                                                    if ((i14 & 8192) != 0) {
                                                        t11 = uniProductMediaSize2.getLabelTextStyle();
                                                        i49 &= -7169;
                                                    } else {
                                                        t11 = t2;
                                                    }
                                                    int i51 = i49;
                                                    float f16 = i29 != 0 ? 8 : f11;
                                                    d11 = i31 != 0 ? InterfaceC2547p.a.d() : interfaceC2547p;
                                                    abstractC8972b4 = i32 != 0 ? null : abstractC8972b3;
                                                    str4 = i33 != 0 ? null : str2;
                                                    j17 = i34 != 0 ? C7807Z.f72259m : j13;
                                                    j18 = i36 != 0 ? C7807Z.f72259m : j14;
                                                    function02 = i37 != 0 ? null : function0;
                                                    i41 = i51;
                                                    if (i39 != 0) {
                                                        i42 = i15;
                                                        qVar2 = null;
                                                    } else {
                                                        qVar2 = qVar;
                                                        i42 = i15;
                                                    }
                                                    f13 = f16;
                                                    abstractC8972b5 = abstractC8972b11;
                                                    uniProductMediaBorderStyle2 = uniProductMediaBorderStyle3;
                                                    z16 = z14;
                                                } else {
                                                    u11.j();
                                                    if ((i14 & 16) != 0) {
                                                        i15 &= -57345;
                                                    }
                                                    if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                                        i35 &= -15;
                                                    }
                                                    int i52 = i35;
                                                    if ((i14 & 4096) != 0) {
                                                        i52 &= -897;
                                                    }
                                                    if ((i14 & 8192) != 0) {
                                                        i52 &= -7169;
                                                    }
                                                    z15 = z12;
                                                    j15 = j11;
                                                    str3 = str;
                                                    j16 = j12;
                                                    t11 = t2;
                                                    d11 = interfaceC2547p;
                                                    abstractC8972b4 = abstractC8972b3;
                                                    str4 = str2;
                                                    j17 = j13;
                                                    j18 = j14;
                                                    function02 = function0;
                                                    qVar2 = qVar;
                                                    i41 = i52;
                                                    i42 = i15;
                                                    z16 = 0;
                                                    abstractC8972b5 = abstractC8972b2;
                                                    f13 = f11;
                                                }
                                                u11.j0();
                                                b11 = h.b(f13);
                                                e eVar4 = eVar2;
                                                abstractC8972b6 = abstractC8972b5;
                                                e a11 = androidx.compose.foundation.e.a(C6988h.a(C5182e.a(a0.r(UniTestTagsKt.uniTestTag(eVar4, UniProductMediaTestTags.Container, null, u11, ((i42 >> 3) & 14) | 48, 2), uniProductMediaSize2.getSize()), f12, false), b11), abstractC7799Q2, b11, 4);
                                                if (abstractC8972b != null) {
                                                    a11 = androidx.compose.ui.draw.e.a(a11, abstractC8972b, null, d11, 0.0f, null, 52);
                                                }
                                                if (z13) {
                                                    t12 = t11;
                                                    z17 = z15;
                                                    a11 = a11.l0(androidx.compose.foundation.e.b(e.f40358c0, UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerOverlayParanja(), b11));
                                                } else {
                                                    t12 = t11;
                                                    z17 = z15;
                                                }
                                                if (z17) {
                                                    a11 = a11.l0(androidx.compose.foundation.e.b(e.f40358c0, UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicTertiaryOnLight(), b11));
                                                }
                                                if (c8391l2 == null && uniProductMediaBorderStyle2 == UniProductMediaBorderStyle.DASH) {
                                                    float v12 = ((d) u11.m(androidx.compose.ui.platform.K0.e())).v1(4);
                                                    e.a aVar = e.f40358c0;
                                                    u11.o(-2077542966);
                                                    boolean q11 = u11.q(v12);
                                                    Object C11 = u11.C();
                                                    if (!q11) {
                                                        obj = C11;
                                                    }
                                                    float[] fArr = new float[2];
                                                    fArr[z16] = v12;
                                                    fArr[1] = v12;
                                                    u11.x(fArr);
                                                    obj = fArr;
                                                    u11.k();
                                                    d12 = m1934dashedBorderd8LSEHM(aVar, c8391l2, f13, (float[]) obj);
                                                } else {
                                                    d12 = c8391l2 != null ? C8385f.d(e.f40358c0, c8391l2.c(), c8391l2.b(), b11) : e.f40358c0;
                                                }
                                                e l02 = a11.l0(d12);
                                                if (function02 != null) {
                                                    q qVar6 = qVar2;
                                                    l02 = i.b(l02, qVar6, null, false, null, I1.i.a(5), function02, 12);
                                                    qVar3 = qVar6;
                                                } else {
                                                    qVar3 = qVar2;
                                                }
                                                Intrinsics.checkNotNullParameter(l02, "<this>");
                                                Intrinsics.checkNotNullParameter("container", "id");
                                                V f17 = C5185h.f(InterfaceC6250b.a.e(), z16);
                                                I11 = u11.I();
                                                A0 d13 = u11.d();
                                                e f18 = c.f(u11, l02);
                                                Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                                                if (u11.t()) {
                                                    u11.H(a12);
                                                } else {
                                                    u11.e();
                                                }
                                                Function2 f19 = T7.E.f(u11, f17, u11, d13);
                                                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                                    Ep.a.d(I11, u11, I11, f19);
                                                }
                                                F1.b(u11, f18, InterfaceC2801g.a.f());
                                                if (abstractC8972b4 == null || str4 != null) {
                                                    t13 = t12;
                                                    u11.o(1107158454);
                                                    C5179b.i n11 = C5179b.n(2);
                                                    d.a g10 = InterfaceC6250b.a.g();
                                                    e.a aVar2 = e.f40358c0;
                                                    abstractC8972b7 = abstractC8972b6;
                                                    C5194q a13 = C5193p.a(n11, g10, u11, 54);
                                                    I12 = u11.I();
                                                    A0 d14 = u11.d();
                                                    e f21 = c.f(u11, aVar2);
                                                    qVar4 = qVar3;
                                                    Function0 a14 = InterfaceC2801g.a.a();
                                                    u11.i();
                                                    if (u11.t()) {
                                                        u11.H(a14);
                                                    } else {
                                                        u11.e();
                                                    }
                                                    Function2 g11 = b.g(u11, a13, u11, d14);
                                                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                                                        Ep.a.d(I12, u11, I12, g11);
                                                    }
                                                    U7.i.b(u11, f21, 749003777);
                                                    if (abstractC8972b4 != null) {
                                                        m1929IconRFCenO8(abstractC8972b4, j17, uniProductMediaSize2.getSmallGraphicSize(), u11, ((i41 >> 18) & 14) | ((i41 >> 21) & 112));
                                                    }
                                                    u11.k();
                                                    u11.o(749007167);
                                                    if (uniProductMediaSize2.getSmallLabelTextStyle() != null && str4 != null) {
                                                        m1930LabelLyZNIlQ(str4, 8, uniProductMediaSize2.getSmallLabelTextStyle(), j18, 2, u11, ((i41 >> 21) & 14) | 24624 | ((i41 >> 18) & 7168), 0);
                                                    }
                                                    u11.k();
                                                    u11.f();
                                                    u11.k();
                                                } else {
                                                    if (abstractC8972b6 != null) {
                                                        u11.o(1107617905);
                                                        m1929IconRFCenO8(abstractC8972b6, j15, uniProductMediaSize2.getGraphicSize(), u11, ((i42 >> 27) & 14) | ((i41 << 3) & 112));
                                                        abstractC8972b10 = abstractC8972b6;
                                                        u11.k();
                                                        t13 = t12;
                                                    } else {
                                                        abstractC8972b10 = abstractC8972b6;
                                                        if (str3 != null) {
                                                            u11.o(1107711401);
                                                            T t15 = t12;
                                                            m1930LabelLyZNIlQ(str3, uniProductMediaSize2.getTextPadding(), t15, j16, 0, u11, ((i41 >> 3) & 910) | ((i41 << 3) & 7168), 16);
                                                            t13 = t15;
                                                            u11.k();
                                                        } else {
                                                            t13 = t12;
                                                            u11.o(1107785398);
                                                            u11.k();
                                                        }
                                                    }
                                                    abstractC8972b7 = abstractC8972b10;
                                                    qVar4 = qVar3;
                                                }
                                                u11.f();
                                                qVar5 = qVar4;
                                                t14 = t13;
                                                f14 = f12;
                                                c3969l = u11;
                                                uniProductMediaSize3 = uniProductMediaSize2;
                                                abstractC8972b8 = abstractC8972b4;
                                                function03 = function02;
                                                eVar3 = eVar4;
                                                z18 = z17;
                                                j19 = j15;
                                                c8391l3 = c8391l2;
                                                interfaceC2547p2 = d11;
                                                j21 = j16;
                                                f15 = f13;
                                                uniProductMediaBorderStyle4 = uniProductMediaBorderStyle2;
                                                abstractC7799Q3 = abstractC7799Q2;
                                                z19 = z13;
                                                str5 = str3;
                                                j22 = j17;
                                                j23 = j18;
                                                abstractC8972b9 = abstractC8972b7;
                                            }
                                            m02 = c3969l.m0();
                                            if (m02 != null) {
                                                m02.G(new UniProductMediaKt$UniProductMedia$7(abstractC8972b, eVar3, uniProductMediaSize3, f14, abstractC7799Q3, z19, c8391l3, uniProductMediaBorderStyle4, z18, abstractC8972b9, j19, str5, j21, t14, f15, interfaceC2547p2, abstractC8972b8, str4, j22, j23, function03, qVar5, i11, i12, i13, i14));
                                                return;
                                            }
                                            return;
                                        }
                                        i35 = i48;
                                        i36 = i14 & 524288;
                                        if (i36 != 0) {
                                        }
                                        i37 = i14 & 1048576;
                                        if (i37 != 0) {
                                        }
                                        i39 = 2097152 & i14;
                                        if (i39 != 0) {
                                        }
                                        if ((i15 & 306783379) != 306783378) {
                                        }
                                        u11.Q0();
                                        if ((i11 & 1) != 0) {
                                        }
                                        if (i46 != 0) {
                                        }
                                        if (i16 != 0) {
                                        }
                                        if (i17 != 0) {
                                        }
                                        if ((i14 & 16) != 0) {
                                        }
                                        if (i18 != 0) {
                                        }
                                        if (i19 != 0) {
                                        }
                                        if (i21 != 0) {
                                        }
                                        if (i23 != 0) {
                                        }
                                        if (i25 != 0) {
                                        }
                                        if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                        }
                                        int i492 = i35;
                                        if (i27 != 0) {
                                        }
                                        if ((i14 & 4096) != 0) {
                                        }
                                        if ((i14 & 8192) != 0) {
                                        }
                                        int i512 = i492;
                                        if (i29 != 0) {
                                        }
                                        if (i31 != 0) {
                                        }
                                        if (i32 != 0) {
                                        }
                                        if (i33 != 0) {
                                        }
                                        if (i34 != 0) {
                                        }
                                        if (i36 != 0) {
                                        }
                                        if (i37 != 0) {
                                        }
                                        i41 = i512;
                                        if (i39 != 0) {
                                        }
                                        f13 = f16;
                                        abstractC8972b5 = abstractC8972b11;
                                        uniProductMediaBorderStyle2 = uniProductMediaBorderStyle3;
                                        z16 = z14;
                                        u11.j0();
                                        b11 = h.b(f13);
                                        e eVar42 = eVar2;
                                        abstractC8972b6 = abstractC8972b5;
                                        e a112 = androidx.compose.foundation.e.a(C6988h.a(C5182e.a(a0.r(UniTestTagsKt.uniTestTag(eVar42, UniProductMediaTestTags.Container, null, u11, ((i42 >> 3) & 14) | 48, 2), uniProductMediaSize2.getSize()), f12, false), b11), abstractC7799Q2, b11, 4);
                                        if (abstractC8972b != null) {
                                        }
                                        if (z13) {
                                        }
                                        if (z17) {
                                        }
                                        if (c8391l2 == null) {
                                        }
                                        if (c8391l2 != null) {
                                        }
                                        e l022 = a112.l0(d12);
                                        if (function02 != null) {
                                        }
                                        Intrinsics.checkNotNullParameter(l022, "<this>");
                                        Intrinsics.checkNotNullParameter("container", "id");
                                        V f172 = C5185h.f(InterfaceC6250b.a.e(), z16);
                                        I11 = u11.I();
                                        A0 d132 = u11.d();
                                        e f182 = c.f(u11, l022);
                                        Function0 a122 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                                        if (u11.t()) {
                                        }
                                        Function2 f192 = T7.E.f(u11, f172, u11, d132);
                                        if (!u11.t()) {
                                        }
                                        Ep.a.d(I11, u11, I11, f192);
                                        F1.b(u11, f182, InterfaceC2801g.a.f());
                                        if (abstractC8972b4 == null) {
                                        }
                                        t13 = t12;
                                        u11.o(1107158454);
                                        C5179b.i n112 = C5179b.n(2);
                                        d.a g102 = InterfaceC6250b.a.g();
                                        e.a aVar22 = e.f40358c0;
                                        abstractC8972b7 = abstractC8972b6;
                                        C5194q a132 = C5193p.a(n112, g102, u11, 54);
                                        I12 = u11.I();
                                        A0 d142 = u11.d();
                                        e f212 = c.f(u11, aVar22);
                                        qVar4 = qVar3;
                                        Function0 a142 = InterfaceC2801g.a.a();
                                        u11.i();
                                        if (u11.t()) {
                                        }
                                        Function2 g112 = b.g(u11, a132, u11, d142);
                                        if (!u11.t()) {
                                        }
                                        Ep.a.d(I12, u11, I12, g112);
                                        U7.i.b(u11, f212, 749003777);
                                        if (abstractC8972b4 != null) {
                                        }
                                        u11.k();
                                        u11.o(749007167);
                                        if (uniProductMediaSize2.getSmallLabelTextStyle() != null) {
                                            m1930LabelLyZNIlQ(str4, 8, uniProductMediaSize2.getSmallLabelTextStyle(), j18, 2, u11, ((i41 >> 21) & 14) | 24624 | ((i41 >> 18) & 7168), 0);
                                        }
                                        u11.k();
                                        u11.f();
                                        u11.k();
                                        u11.f();
                                        qVar5 = qVar4;
                                        t14 = t13;
                                        f14 = f12;
                                        c3969l = u11;
                                        uniProductMediaSize3 = uniProductMediaSize2;
                                        abstractC8972b8 = abstractC8972b4;
                                        function03 = function02;
                                        eVar3 = eVar42;
                                        z18 = z17;
                                        j19 = j15;
                                        c8391l3 = c8391l2;
                                        interfaceC2547p2 = d11;
                                        j21 = j16;
                                        f15 = f13;
                                        uniProductMediaBorderStyle4 = uniProductMediaBorderStyle2;
                                        abstractC7799Q3 = abstractC7799Q2;
                                        z19 = z13;
                                        str5 = str3;
                                        j22 = j17;
                                        j23 = j18;
                                        abstractC8972b9 = abstractC8972b7;
                                        m02 = c3969l.m0();
                                        if (m02 != null) {
                                        }
                                    }
                                }
                                i31 = i14 & 32768;
                                if (i31 == 0) {
                                }
                                i32 = i14 & 65536;
                                if (i32 == 0) {
                                }
                                i33 = i14 & 131072;
                                if (i33 == 0) {
                                }
                                i34 = i14 & 262144;
                                if (i34 == 0) {
                                }
                                i35 = i48;
                                i36 = i14 & 524288;
                                if (i36 != 0) {
                                }
                                i37 = i14 & 1048576;
                                if (i37 != 0) {
                                }
                                i39 = 2097152 & i14;
                                if (i39 != 0) {
                                }
                                if ((i15 & 306783379) != 306783378) {
                                }
                                u11.Q0();
                                if ((i11 & 1) != 0) {
                                }
                                if (i46 != 0) {
                                }
                                if (i16 != 0) {
                                }
                                if (i17 != 0) {
                                }
                                if ((i14 & 16) != 0) {
                                }
                                if (i18 != 0) {
                                }
                                if (i19 != 0) {
                                }
                                if (i21 != 0) {
                                }
                                if (i23 != 0) {
                                }
                                if (i25 != 0) {
                                }
                                if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                }
                                int i4922 = i35;
                                if (i27 != 0) {
                                }
                                if ((i14 & 4096) != 0) {
                                }
                                if ((i14 & 8192) != 0) {
                                }
                                int i5122 = i4922;
                                if (i29 != 0) {
                                }
                                if (i31 != 0) {
                                }
                                if (i32 != 0) {
                                }
                                if (i33 != 0) {
                                }
                                if (i34 != 0) {
                                }
                                if (i36 != 0) {
                                }
                                if (i37 != 0) {
                                }
                                i41 = i5122;
                                if (i39 != 0) {
                                }
                                f13 = f16;
                                abstractC8972b5 = abstractC8972b11;
                                uniProductMediaBorderStyle2 = uniProductMediaBorderStyle3;
                                z16 = z14;
                                u11.j0();
                                b11 = h.b(f13);
                                e eVar422 = eVar2;
                                abstractC8972b6 = abstractC8972b5;
                                e a1122 = androidx.compose.foundation.e.a(C6988h.a(C5182e.a(a0.r(UniTestTagsKt.uniTestTag(eVar422, UniProductMediaTestTags.Container, null, u11, ((i42 >> 3) & 14) | 48, 2), uniProductMediaSize2.getSize()), f12, false), b11), abstractC7799Q2, b11, 4);
                                if (abstractC8972b != null) {
                                }
                                if (z13) {
                                }
                                if (z17) {
                                }
                                if (c8391l2 == null) {
                                }
                                if (c8391l2 != null) {
                                }
                                e l0222 = a1122.l0(d12);
                                if (function02 != null) {
                                }
                                Intrinsics.checkNotNullParameter(l0222, "<this>");
                                Intrinsics.checkNotNullParameter("container", "id");
                                V f1722 = C5185h.f(InterfaceC6250b.a.e(), z16);
                                I11 = u11.I();
                                A0 d1322 = u11.d();
                                e f1822 = c.f(u11, l0222);
                                Function0 a1222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                                if (u11.t()) {
                                }
                                Function2 f1922 = T7.E.f(u11, f1722, u11, d1322);
                                if (!u11.t()) {
                                }
                                Ep.a.d(I11, u11, I11, f1922);
                                F1.b(u11, f1822, InterfaceC2801g.a.f());
                                if (abstractC8972b4 == null) {
                                }
                                t13 = t12;
                                u11.o(1107158454);
                                C5179b.i n1122 = C5179b.n(2);
                                d.a g1022 = InterfaceC6250b.a.g();
                                e.a aVar222 = e.f40358c0;
                                abstractC8972b7 = abstractC8972b6;
                                C5194q a1322 = C5193p.a(n1122, g1022, u11, 54);
                                I12 = u11.I();
                                A0 d1422 = u11.d();
                                e f2122 = c.f(u11, aVar222);
                                qVar4 = qVar3;
                                Function0 a1422 = InterfaceC2801g.a.a();
                                u11.i();
                                if (u11.t()) {
                                }
                                Function2 g1122 = b.g(u11, a1322, u11, d1422);
                                if (!u11.t()) {
                                }
                                Ep.a.d(I12, u11, I12, g1122);
                                U7.i.b(u11, f2122, 749003777);
                                if (abstractC8972b4 != null) {
                                }
                                u11.k();
                                u11.o(749007167);
                                if (uniProductMediaSize2.getSmallLabelTextStyle() != null) {
                                }
                                u11.k();
                                u11.f();
                                u11.k();
                                u11.f();
                                qVar5 = qVar4;
                                t14 = t13;
                                f14 = f12;
                                c3969l = u11;
                                uniProductMediaSize3 = uniProductMediaSize2;
                                abstractC8972b8 = abstractC8972b4;
                                function03 = function02;
                                eVar3 = eVar422;
                                z18 = z17;
                                j19 = j15;
                                c8391l3 = c8391l2;
                                interfaceC2547p2 = d11;
                                j21 = j16;
                                f15 = f13;
                                uniProductMediaBorderStyle4 = uniProductMediaBorderStyle2;
                                abstractC7799Q3 = abstractC7799Q2;
                                z19 = z13;
                                str5 = str3;
                                j22 = j17;
                                j23 = j18;
                                abstractC8972b9 = abstractC8972b7;
                                m02 = c3969l.m0();
                                if (m02 != null) {
                                }
                            }
                            if ((i12 & 384) == 0) {
                            }
                            if ((i12 & 3072) == 0) {
                            }
                            int i482 = i26;
                            i28 = i14 & 16384;
                            if (i28 != 0) {
                            }
                            i31 = i14 & 32768;
                            if (i31 == 0) {
                            }
                            i32 = i14 & 65536;
                            if (i32 == 0) {
                            }
                            i33 = i14 & 131072;
                            if (i33 == 0) {
                            }
                            i34 = i14 & 262144;
                            if (i34 == 0) {
                            }
                            i35 = i482;
                            i36 = i14 & 524288;
                            if (i36 != 0) {
                            }
                            i37 = i14 & 1048576;
                            if (i37 != 0) {
                            }
                            i39 = 2097152 & i14;
                            if (i39 != 0) {
                            }
                            if ((i15 & 306783379) != 306783378) {
                            }
                            u11.Q0();
                            if ((i11 & 1) != 0) {
                            }
                            if (i46 != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i17 != 0) {
                            }
                            if ((i14 & 16) != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i19 != 0) {
                            }
                            if (i21 != 0) {
                            }
                            if (i23 != 0) {
                            }
                            if (i25 != 0) {
                            }
                            if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                            }
                            int i49222 = i35;
                            if (i27 != 0) {
                            }
                            if ((i14 & 4096) != 0) {
                            }
                            if ((i14 & 8192) != 0) {
                            }
                            int i51222 = i49222;
                            if (i29 != 0) {
                            }
                            if (i31 != 0) {
                            }
                            if (i32 != 0) {
                            }
                            if (i33 != 0) {
                            }
                            if (i34 != 0) {
                            }
                            if (i36 != 0) {
                            }
                            if (i37 != 0) {
                            }
                            i41 = i51222;
                            if (i39 != 0) {
                            }
                            f13 = f16;
                            abstractC8972b5 = abstractC8972b11;
                            uniProductMediaBorderStyle2 = uniProductMediaBorderStyle3;
                            z16 = z14;
                            u11.j0();
                            b11 = h.b(f13);
                            e eVar4222 = eVar2;
                            abstractC8972b6 = abstractC8972b5;
                            e a11222 = androidx.compose.foundation.e.a(C6988h.a(C5182e.a(a0.r(UniTestTagsKt.uniTestTag(eVar4222, UniProductMediaTestTags.Container, null, u11, ((i42 >> 3) & 14) | 48, 2), uniProductMediaSize2.getSize()), f12, false), b11), abstractC7799Q2, b11, 4);
                            if (abstractC8972b != null) {
                            }
                            if (z13) {
                            }
                            if (z17) {
                            }
                            if (c8391l2 == null) {
                            }
                            if (c8391l2 != null) {
                            }
                            e l02222 = a11222.l0(d12);
                            if (function02 != null) {
                            }
                            Intrinsics.checkNotNullParameter(l02222, "<this>");
                            Intrinsics.checkNotNullParameter("container", "id");
                            V f17222 = C5185h.f(InterfaceC6250b.a.e(), z16);
                            I11 = u11.I();
                            A0 d13222 = u11.d();
                            e f18222 = c.f(u11, l02222);
                            Function0 a12222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                            if (u11.t()) {
                            }
                            Function2 f19222 = T7.E.f(u11, f17222, u11, d13222);
                            if (!u11.t()) {
                            }
                            Ep.a.d(I11, u11, I11, f19222);
                            F1.b(u11, f18222, InterfaceC2801g.a.f());
                            if (abstractC8972b4 == null) {
                            }
                            t13 = t12;
                            u11.o(1107158454);
                            C5179b.i n11222 = C5179b.n(2);
                            d.a g10222 = InterfaceC6250b.a.g();
                            e.a aVar2222 = e.f40358c0;
                            abstractC8972b7 = abstractC8972b6;
                            C5194q a13222 = C5193p.a(n11222, g10222, u11, 54);
                            I12 = u11.I();
                            A0 d14222 = u11.d();
                            e f21222 = c.f(u11, aVar2222);
                            qVar4 = qVar3;
                            Function0 a14222 = InterfaceC2801g.a.a();
                            u11.i();
                            if (u11.t()) {
                            }
                            Function2 g11222 = b.g(u11, a13222, u11, d14222);
                            if (!u11.t()) {
                            }
                            Ep.a.d(I12, u11, I12, g11222);
                            U7.i.b(u11, f21222, 749003777);
                            if (abstractC8972b4 != null) {
                            }
                            u11.k();
                            u11.o(749007167);
                            if (uniProductMediaSize2.getSmallLabelTextStyle() != null) {
                            }
                            u11.k();
                            u11.f();
                            u11.k();
                            u11.f();
                            qVar5 = qVar4;
                            t14 = t13;
                            f14 = f12;
                            c3969l = u11;
                            uniProductMediaSize3 = uniProductMediaSize2;
                            abstractC8972b8 = abstractC8972b4;
                            function03 = function02;
                            eVar3 = eVar4222;
                            z18 = z17;
                            j19 = j15;
                            c8391l3 = c8391l2;
                            interfaceC2547p2 = d11;
                            j21 = j16;
                            f15 = f13;
                            uniProductMediaBorderStyle4 = uniProductMediaBorderStyle2;
                            abstractC7799Q3 = abstractC7799Q2;
                            z19 = z13;
                            str5 = str3;
                            j22 = j17;
                            j23 = j18;
                            abstractC8972b9 = abstractC8972b7;
                            m02 = c3969l.m0();
                            if (m02 != null) {
                            }
                        }
                        i25 = i24;
                        if ((i12 & 6) != 0) {
                        }
                        i27 = i14 & 2048;
                        if (i27 == 0) {
                        }
                        if ((i12 & 384) == 0) {
                        }
                        if ((i12 & 3072) == 0) {
                        }
                        int i4822 = i26;
                        i28 = i14 & 16384;
                        if (i28 != 0) {
                        }
                        i31 = i14 & 32768;
                        if (i31 == 0) {
                        }
                        i32 = i14 & 65536;
                        if (i32 == 0) {
                        }
                        i33 = i14 & 131072;
                        if (i33 == 0) {
                        }
                        i34 = i14 & 262144;
                        if (i34 == 0) {
                        }
                        i35 = i4822;
                        i36 = i14 & 524288;
                        if (i36 != 0) {
                        }
                        i37 = i14 & 1048576;
                        if (i37 != 0) {
                        }
                        i39 = 2097152 & i14;
                        if (i39 != 0) {
                        }
                        if ((i15 & 306783379) != 306783378) {
                        }
                        u11.Q0();
                        if ((i11 & 1) != 0) {
                        }
                        if (i46 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if ((i14 & 16) != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        if (i21 != 0) {
                        }
                        if (i23 != 0) {
                        }
                        if (i25 != 0) {
                        }
                        if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                        }
                        int i492222 = i35;
                        if (i27 != 0) {
                        }
                        if ((i14 & 4096) != 0) {
                        }
                        if ((i14 & 8192) != 0) {
                        }
                        int i512222 = i492222;
                        if (i29 != 0) {
                        }
                        if (i31 != 0) {
                        }
                        if (i32 != 0) {
                        }
                        if (i33 != 0) {
                        }
                        if (i34 != 0) {
                        }
                        if (i36 != 0) {
                        }
                        if (i37 != 0) {
                        }
                        i41 = i512222;
                        if (i39 != 0) {
                        }
                        f13 = f16;
                        abstractC8972b5 = abstractC8972b11;
                        uniProductMediaBorderStyle2 = uniProductMediaBorderStyle3;
                        z16 = z14;
                        u11.j0();
                        b11 = h.b(f13);
                        e eVar42222 = eVar2;
                        abstractC8972b6 = abstractC8972b5;
                        e a112222 = androidx.compose.foundation.e.a(C6988h.a(C5182e.a(a0.r(UniTestTagsKt.uniTestTag(eVar42222, UniProductMediaTestTags.Container, null, u11, ((i42 >> 3) & 14) | 48, 2), uniProductMediaSize2.getSize()), f12, false), b11), abstractC7799Q2, b11, 4);
                        if (abstractC8972b != null) {
                        }
                        if (z13) {
                        }
                        if (z17) {
                        }
                        if (c8391l2 == null) {
                        }
                        if (c8391l2 != null) {
                        }
                        e l022222 = a112222.l0(d12);
                        if (function02 != null) {
                        }
                        Intrinsics.checkNotNullParameter(l022222, "<this>");
                        Intrinsics.checkNotNullParameter("container", "id");
                        V f172222 = C5185h.f(InterfaceC6250b.a.e(), z16);
                        I11 = u11.I();
                        A0 d132222 = u11.d();
                        e f182222 = c.f(u11, l022222);
                        Function0 a122222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                        }
                        Function2 f192222 = T7.E.f(u11, f172222, u11, d132222);
                        if (!u11.t()) {
                        }
                        Ep.a.d(I11, u11, I11, f192222);
                        F1.b(u11, f182222, InterfaceC2801g.a.f());
                        if (abstractC8972b4 == null) {
                        }
                        t13 = t12;
                        u11.o(1107158454);
                        C5179b.i n112222 = C5179b.n(2);
                        d.a g102222 = InterfaceC6250b.a.g();
                        e.a aVar22222 = e.f40358c0;
                        abstractC8972b7 = abstractC8972b6;
                        C5194q a132222 = C5193p.a(n112222, g102222, u11, 54);
                        I12 = u11.I();
                        A0 d142222 = u11.d();
                        e f212222 = c.f(u11, aVar22222);
                        qVar4 = qVar3;
                        Function0 a142222 = InterfaceC2801g.a.a();
                        u11.i();
                        if (u11.t()) {
                        }
                        Function2 g112222 = b.g(u11, a132222, u11, d142222);
                        if (!u11.t()) {
                        }
                        Ep.a.d(I12, u11, I12, g112222);
                        U7.i.b(u11, f212222, 749003777);
                        if (abstractC8972b4 != null) {
                        }
                        u11.k();
                        u11.o(749007167);
                        if (uniProductMediaSize2.getSmallLabelTextStyle() != null) {
                        }
                        u11.k();
                        u11.f();
                        u11.k();
                        u11.f();
                        qVar5 = qVar4;
                        t14 = t13;
                        f14 = f12;
                        c3969l = u11;
                        uniProductMediaSize3 = uniProductMediaSize2;
                        abstractC8972b8 = abstractC8972b4;
                        function03 = function02;
                        eVar3 = eVar42222;
                        z18 = z17;
                        j19 = j15;
                        c8391l3 = c8391l2;
                        interfaceC2547p2 = d11;
                        j21 = j16;
                        f15 = f13;
                        uniProductMediaBorderStyle4 = uniProductMediaBorderStyle2;
                        abstractC7799Q3 = abstractC7799Q2;
                        z19 = z13;
                        str5 = str3;
                        j22 = j17;
                        j23 = j18;
                        abstractC8972b9 = abstractC8972b7;
                        m02 = c3969l.m0();
                        if (m02 != null) {
                        }
                    }
                    i23 = i22;
                    i24 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
                    if (i24 != 0) {
                    }
                    i25 = i24;
                    if ((i12 & 6) != 0) {
                    }
                    i27 = i14 & 2048;
                    if (i27 == 0) {
                    }
                    if ((i12 & 384) == 0) {
                    }
                    if ((i12 & 3072) == 0) {
                    }
                    int i48222 = i26;
                    i28 = i14 & 16384;
                    if (i28 != 0) {
                    }
                    i31 = i14 & 32768;
                    if (i31 == 0) {
                    }
                    i32 = i14 & 65536;
                    if (i32 == 0) {
                    }
                    i33 = i14 & 131072;
                    if (i33 == 0) {
                    }
                    i34 = i14 & 262144;
                    if (i34 == 0) {
                    }
                    i35 = i48222;
                    i36 = i14 & 524288;
                    if (i36 != 0) {
                    }
                    i37 = i14 & 1048576;
                    if (i37 != 0) {
                    }
                    i39 = 2097152 & i14;
                    if (i39 != 0) {
                    }
                    if ((i15 & 306783379) != 306783378) {
                    }
                    u11.Q0();
                    if ((i11 & 1) != 0) {
                    }
                    if (i46 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if ((i14 & 16) != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i23 != 0) {
                    }
                    if (i25 != 0) {
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                    }
                    int i4922222 = i35;
                    if (i27 != 0) {
                    }
                    if ((i14 & 4096) != 0) {
                    }
                    if ((i14 & 8192) != 0) {
                    }
                    int i5122222 = i4922222;
                    if (i29 != 0) {
                    }
                    if (i31 != 0) {
                    }
                    if (i32 != 0) {
                    }
                    if (i33 != 0) {
                    }
                    if (i34 != 0) {
                    }
                    if (i36 != 0) {
                    }
                    if (i37 != 0) {
                    }
                    i41 = i5122222;
                    if (i39 != 0) {
                    }
                    f13 = f16;
                    abstractC8972b5 = abstractC8972b11;
                    uniProductMediaBorderStyle2 = uniProductMediaBorderStyle3;
                    z16 = z14;
                    u11.j0();
                    b11 = h.b(f13);
                    e eVar422222 = eVar2;
                    abstractC8972b6 = abstractC8972b5;
                    e a1122222 = androidx.compose.foundation.e.a(C6988h.a(C5182e.a(a0.r(UniTestTagsKt.uniTestTag(eVar422222, UniProductMediaTestTags.Container, null, u11, ((i42 >> 3) & 14) | 48, 2), uniProductMediaSize2.getSize()), f12, false), b11), abstractC7799Q2, b11, 4);
                    if (abstractC8972b != null) {
                    }
                    if (z13) {
                    }
                    if (z17) {
                    }
                    if (c8391l2 == null) {
                    }
                    if (c8391l2 != null) {
                    }
                    e l0222222 = a1122222.l0(d12);
                    if (function02 != null) {
                    }
                    Intrinsics.checkNotNullParameter(l0222222, "<this>");
                    Intrinsics.checkNotNullParameter("container", "id");
                    V f1722222 = C5185h.f(InterfaceC6250b.a.e(), z16);
                    I11 = u11.I();
                    A0 d1322222 = u11.d();
                    e f1822222 = c.f(u11, l0222222);
                    Function0 a1222222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 f1922222 = T7.E.f(u11, f1722222, u11, d1322222);
                    if (!u11.t()) {
                    }
                    Ep.a.d(I11, u11, I11, f1922222);
                    F1.b(u11, f1822222, InterfaceC2801g.a.f());
                    if (abstractC8972b4 == null) {
                    }
                    t13 = t12;
                    u11.o(1107158454);
                    C5179b.i n1122222 = C5179b.n(2);
                    d.a g1022222 = InterfaceC6250b.a.g();
                    e.a aVar222222 = e.f40358c0;
                    abstractC8972b7 = abstractC8972b6;
                    C5194q a1322222 = C5193p.a(n1122222, g1022222, u11, 54);
                    I12 = u11.I();
                    A0 d1422222 = u11.d();
                    e f2122222 = c.f(u11, aVar222222);
                    qVar4 = qVar3;
                    Function0 a1422222 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                    }
                    Function2 g1122222 = b.g(u11, a1322222, u11, d1422222);
                    if (!u11.t()) {
                    }
                    Ep.a.d(I12, u11, I12, g1122222);
                    U7.i.b(u11, f2122222, 749003777);
                    if (abstractC8972b4 != null) {
                    }
                    u11.k();
                    u11.o(749007167);
                    if (uniProductMediaSize2.getSmallLabelTextStyle() != null) {
                    }
                    u11.k();
                    u11.f();
                    u11.k();
                    u11.f();
                    qVar5 = qVar4;
                    t14 = t13;
                    f14 = f12;
                    c3969l = u11;
                    uniProductMediaSize3 = uniProductMediaSize2;
                    abstractC8972b8 = abstractC8972b4;
                    function03 = function02;
                    eVar3 = eVar422222;
                    z18 = z17;
                    j19 = j15;
                    c8391l3 = c8391l2;
                    interfaceC2547p2 = d11;
                    j21 = j16;
                    f15 = f13;
                    uniProductMediaBorderStyle4 = uniProductMediaBorderStyle2;
                    abstractC7799Q3 = abstractC7799Q2;
                    z19 = z13;
                    str5 = str3;
                    j22 = j17;
                    j23 = j18;
                    abstractC8972b9 = abstractC8972b7;
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                f12 = f7;
                if ((i11 & 24576) != 0) {
                }
                i18 = i14 & 32;
                if (i18 == 0) {
                }
                i19 = i14 & 64;
                if (i19 == 0) {
                }
                i21 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i21 == 0) {
                }
                i22 = i14 & 256;
                if (i22 == 0) {
                }
                i23 = i22;
                i24 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i24 != 0) {
                }
                i25 = i24;
                if ((i12 & 6) != 0) {
                }
                i27 = i14 & 2048;
                if (i27 == 0) {
                }
                if ((i12 & 384) == 0) {
                }
                if ((i12 & 3072) == 0) {
                }
                int i482222 = i26;
                i28 = i14 & 16384;
                if (i28 != 0) {
                }
                i31 = i14 & 32768;
                if (i31 == 0) {
                }
                i32 = i14 & 65536;
                if (i32 == 0) {
                }
                i33 = i14 & 131072;
                if (i33 == 0) {
                }
                i34 = i14 & 262144;
                if (i34 == 0) {
                }
                i35 = i482222;
                i36 = i14 & 524288;
                if (i36 != 0) {
                }
                i37 = i14 & 1048576;
                if (i37 != 0) {
                }
                i39 = 2097152 & i14;
                if (i39 != 0) {
                }
                if ((i15 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i11 & 1) != 0) {
                }
                if (i46 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if ((i14 & 16) != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i21 != 0) {
                }
                if (i23 != 0) {
                }
                if (i25 != 0) {
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                }
                int i49222222 = i35;
                if (i27 != 0) {
                }
                if ((i14 & 4096) != 0) {
                }
                if ((i14 & 8192) != 0) {
                }
                int i51222222 = i49222222;
                if (i29 != 0) {
                }
                if (i31 != 0) {
                }
                if (i32 != 0) {
                }
                if (i33 != 0) {
                }
                if (i34 != 0) {
                }
                if (i36 != 0) {
                }
                if (i37 != 0) {
                }
                i41 = i51222222;
                if (i39 != 0) {
                }
                f13 = f16;
                abstractC8972b5 = abstractC8972b11;
                uniProductMediaBorderStyle2 = uniProductMediaBorderStyle3;
                z16 = z14;
                u11.j0();
                b11 = h.b(f13);
                e eVar4222222 = eVar2;
                abstractC8972b6 = abstractC8972b5;
                e a11222222 = androidx.compose.foundation.e.a(C6988h.a(C5182e.a(a0.r(UniTestTagsKt.uniTestTag(eVar4222222, UniProductMediaTestTags.Container, null, u11, ((i42 >> 3) & 14) | 48, 2), uniProductMediaSize2.getSize()), f12, false), b11), abstractC7799Q2, b11, 4);
                if (abstractC8972b != null) {
                }
                if (z13) {
                }
                if (z17) {
                }
                if (c8391l2 == null) {
                }
                if (c8391l2 != null) {
                }
                e l02222222 = a11222222.l0(d12);
                if (function02 != null) {
                }
                Intrinsics.checkNotNullParameter(l02222222, "<this>");
                Intrinsics.checkNotNullParameter("container", "id");
                V f17222222 = C5185h.f(InterfaceC6250b.a.e(), z16);
                I11 = u11.I();
                A0 d13222222 = u11.d();
                e f18222222 = c.f(u11, l02222222);
                Function0 a12222222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 f19222222 = T7.E.f(u11, f17222222, u11, d13222222);
                if (!u11.t()) {
                }
                Ep.a.d(I11, u11, I11, f19222222);
                F1.b(u11, f18222222, InterfaceC2801g.a.f());
                if (abstractC8972b4 == null) {
                }
                t13 = t12;
                u11.o(1107158454);
                C5179b.i n11222222 = C5179b.n(2);
                d.a g10222222 = InterfaceC6250b.a.g();
                e.a aVar2222222 = e.f40358c0;
                abstractC8972b7 = abstractC8972b6;
                C5194q a13222222 = C5193p.a(n11222222, g10222222, u11, 54);
                I12 = u11.I();
                A0 d14222222 = u11.d();
                e f21222222 = c.f(u11, aVar2222222);
                qVar4 = qVar3;
                Function0 a14222222 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                }
                Function2 g11222222 = b.g(u11, a13222222, u11, d14222222);
                if (!u11.t()) {
                }
                Ep.a.d(I12, u11, I12, g11222222);
                U7.i.b(u11, f21222222, 749003777);
                if (abstractC8972b4 != null) {
                }
                u11.k();
                u11.o(749007167);
                if (uniProductMediaSize2.getSmallLabelTextStyle() != null) {
                }
                u11.k();
                u11.f();
                u11.k();
                u11.f();
                qVar5 = qVar4;
                t14 = t13;
                f14 = f12;
                c3969l = u11;
                uniProductMediaSize3 = uniProductMediaSize2;
                abstractC8972b8 = abstractC8972b4;
                function03 = function02;
                eVar3 = eVar4222222;
                z18 = z17;
                j19 = j15;
                c8391l3 = c8391l2;
                interfaceC2547p2 = d11;
                j21 = j16;
                f15 = f13;
                uniProductMediaBorderStyle4 = uniProductMediaBorderStyle2;
                abstractC7799Q3 = abstractC7799Q2;
                z19 = z13;
                str5 = str3;
                j22 = j17;
                j23 = j18;
                abstractC8972b9 = abstractC8972b7;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            uniProductMediaSize2 = uniProductMediaSize;
            i17 = i14 & 8;
            int i472 = 2048;
            if (i17 != 0) {
            }
            f12 = f7;
            if ((i11 & 24576) != 0) {
            }
            i18 = i14 & 32;
            if (i18 == 0) {
            }
            i19 = i14 & 64;
            if (i19 == 0) {
            }
            i21 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i21 == 0) {
            }
            i22 = i14 & 256;
            if (i22 == 0) {
            }
            i23 = i22;
            i24 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i24 != 0) {
            }
            i25 = i24;
            if ((i12 & 6) != 0) {
            }
            i27 = i14 & 2048;
            if (i27 == 0) {
            }
            if ((i12 & 384) == 0) {
            }
            if ((i12 & 3072) == 0) {
            }
            int i4822222 = i26;
            i28 = i14 & 16384;
            if (i28 != 0) {
            }
            i31 = i14 & 32768;
            if (i31 == 0) {
            }
            i32 = i14 & 65536;
            if (i32 == 0) {
            }
            i33 = i14 & 131072;
            if (i33 == 0) {
            }
            i34 = i14 & 262144;
            if (i34 == 0) {
            }
            i35 = i4822222;
            i36 = i14 & 524288;
            if (i36 != 0) {
            }
            i37 = i14 & 1048576;
            if (i37 != 0) {
            }
            i39 = 2097152 & i14;
            if (i39 != 0) {
            }
            if ((i15 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i46 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if ((i14 & 16) != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i21 != 0) {
            }
            if (i23 != 0) {
            }
            if (i25 != 0) {
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            }
            int i492222222 = i35;
            if (i27 != 0) {
            }
            if ((i14 & 4096) != 0) {
            }
            if ((i14 & 8192) != 0) {
            }
            int i512222222 = i492222222;
            if (i29 != 0) {
            }
            if (i31 != 0) {
            }
            if (i32 != 0) {
            }
            if (i33 != 0) {
            }
            if (i34 != 0) {
            }
            if (i36 != 0) {
            }
            if (i37 != 0) {
            }
            i41 = i512222222;
            if (i39 != 0) {
            }
            f13 = f16;
            abstractC8972b5 = abstractC8972b11;
            uniProductMediaBorderStyle2 = uniProductMediaBorderStyle3;
            z16 = z14;
            u11.j0();
            b11 = h.b(f13);
            e eVar42222222 = eVar2;
            abstractC8972b6 = abstractC8972b5;
            e a112222222 = androidx.compose.foundation.e.a(C6988h.a(C5182e.a(a0.r(UniTestTagsKt.uniTestTag(eVar42222222, UniProductMediaTestTags.Container, null, u11, ((i42 >> 3) & 14) | 48, 2), uniProductMediaSize2.getSize()), f12, false), b11), abstractC7799Q2, b11, 4);
            if (abstractC8972b != null) {
            }
            if (z13) {
            }
            if (z17) {
            }
            if (c8391l2 == null) {
            }
            if (c8391l2 != null) {
            }
            e l022222222 = a112222222.l0(d12);
            if (function02 != null) {
            }
            Intrinsics.checkNotNullParameter(l022222222, "<this>");
            Intrinsics.checkNotNullParameter("container", "id");
            V f172222222 = C5185h.f(InterfaceC6250b.a.e(), z16);
            I11 = u11.I();
            A0 d132222222 = u11.d();
            e f182222222 = c.f(u11, l022222222);
            Function0 a122222222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f192222222 = T7.E.f(u11, f172222222, u11, d132222222);
            if (!u11.t()) {
            }
            Ep.a.d(I11, u11, I11, f192222222);
            F1.b(u11, f182222222, InterfaceC2801g.a.f());
            if (abstractC8972b4 == null) {
            }
            t13 = t12;
            u11.o(1107158454);
            C5179b.i n112222222 = C5179b.n(2);
            d.a g102222222 = InterfaceC6250b.a.g();
            e.a aVar22222222 = e.f40358c0;
            abstractC8972b7 = abstractC8972b6;
            C5194q a132222222 = C5193p.a(n112222222, g102222222, u11, 54);
            I12 = u11.I();
            A0 d142222222 = u11.d();
            e f212222222 = c.f(u11, aVar22222222);
            qVar4 = qVar3;
            Function0 a142222222 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
            }
            Function2 g112222222 = b.g(u11, a132222222, u11, d142222222);
            if (!u11.t()) {
            }
            Ep.a.d(I12, u11, I12, g112222222);
            U7.i.b(u11, f212222222, 749003777);
            if (abstractC8972b4 != null) {
            }
            u11.k();
            u11.o(749007167);
            if (uniProductMediaSize2.getSmallLabelTextStyle() != null) {
            }
            u11.k();
            u11.f();
            u11.k();
            u11.f();
            qVar5 = qVar4;
            t14 = t13;
            f14 = f12;
            c3969l = u11;
            uniProductMediaSize3 = uniProductMediaSize2;
            abstractC8972b8 = abstractC8972b4;
            function03 = function02;
            eVar3 = eVar42222222;
            z18 = z17;
            j19 = j15;
            c8391l3 = c8391l2;
            interfaceC2547p2 = d11;
            j21 = j16;
            f15 = f13;
            uniProductMediaBorderStyle4 = uniProductMediaBorderStyle2;
            abstractC7799Q3 = abstractC7799Q2;
            z19 = z13;
            str5 = str3;
            j22 = j17;
            j23 = j18;
            abstractC8972b9 = abstractC8972b7;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        i16 = i14 & 4;
        if (i16 == 0) {
        }
        uniProductMediaSize2 = uniProductMediaSize;
        i17 = i14 & 8;
        int i4722 = 2048;
        if (i17 != 0) {
        }
        f12 = f7;
        if ((i11 & 24576) != 0) {
        }
        i18 = i14 & 32;
        if (i18 == 0) {
        }
        i19 = i14 & 64;
        if (i19 == 0) {
        }
        i21 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i21 == 0) {
        }
        i22 = i14 & 256;
        if (i22 == 0) {
        }
        i23 = i22;
        i24 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i24 != 0) {
        }
        i25 = i24;
        if ((i12 & 6) != 0) {
        }
        i27 = i14 & 2048;
        if (i27 == 0) {
        }
        if ((i12 & 384) == 0) {
        }
        if ((i12 & 3072) == 0) {
        }
        int i48222222 = i26;
        i28 = i14 & 16384;
        if (i28 != 0) {
        }
        i31 = i14 & 32768;
        if (i31 == 0) {
        }
        i32 = i14 & 65536;
        if (i32 == 0) {
        }
        i33 = i14 & 131072;
        if (i33 == 0) {
        }
        i34 = i14 & 262144;
        if (i34 == 0) {
        }
        i35 = i48222222;
        i36 = i14 & 524288;
        if (i36 != 0) {
        }
        i37 = i14 & 1048576;
        if (i37 != 0) {
        }
        i39 = 2097152 & i14;
        if (i39 != 0) {
        }
        if ((i15 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i46 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if ((i14 & 16) != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i21 != 0) {
        }
        if (i23 != 0) {
        }
        if (i25 != 0) {
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
        }
        int i4922222222 = i35;
        if (i27 != 0) {
        }
        if ((i14 & 4096) != 0) {
        }
        if ((i14 & 8192) != 0) {
        }
        int i5122222222 = i4922222222;
        if (i29 != 0) {
        }
        if (i31 != 0) {
        }
        if (i32 != 0) {
        }
        if (i33 != 0) {
        }
        if (i34 != 0) {
        }
        if (i36 != 0) {
        }
        if (i37 != 0) {
        }
        i41 = i5122222222;
        if (i39 != 0) {
        }
        f13 = f16;
        abstractC8972b5 = abstractC8972b11;
        uniProductMediaBorderStyle2 = uniProductMediaBorderStyle3;
        z16 = z14;
        u11.j0();
        b11 = h.b(f13);
        e eVar422222222 = eVar2;
        abstractC8972b6 = abstractC8972b5;
        e a1122222222 = androidx.compose.foundation.e.a(C6988h.a(C5182e.a(a0.r(UniTestTagsKt.uniTestTag(eVar422222222, UniProductMediaTestTags.Container, null, u11, ((i42 >> 3) & 14) | 48, 2), uniProductMediaSize2.getSize()), f12, false), b11), abstractC7799Q2, b11, 4);
        if (abstractC8972b != null) {
        }
        if (z13) {
        }
        if (z17) {
        }
        if (c8391l2 == null) {
        }
        if (c8391l2 != null) {
        }
        e l0222222222 = a1122222222.l0(d12);
        if (function02 != null) {
        }
        Intrinsics.checkNotNullParameter(l0222222222, "<this>");
        Intrinsics.checkNotNullParameter("container", "id");
        V f1722222222 = C5185h.f(InterfaceC6250b.a.e(), z16);
        I11 = u11.I();
        A0 d1322222222 = u11.d();
        e f1822222222 = c.f(u11, l0222222222);
        Function0 a1222222222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f1922222222 = T7.E.f(u11, f1722222222, u11, d1322222222);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, f1922222222);
        F1.b(u11, f1822222222, InterfaceC2801g.a.f());
        if (abstractC8972b4 == null) {
        }
        t13 = t12;
        u11.o(1107158454);
        C5179b.i n1122222222 = C5179b.n(2);
        d.a g1022222222 = InterfaceC6250b.a.g();
        e.a aVar222222222 = e.f40358c0;
        abstractC8972b7 = abstractC8972b6;
        C5194q a1322222222 = C5193p.a(n1122222222, g1022222222, u11, 54);
        I12 = u11.I();
        A0 d1422222222 = u11.d();
        e f2122222222 = c.f(u11, aVar222222222);
        qVar4 = qVar3;
        Function0 a1422222222 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 g1122222222 = b.g(u11, a1322222222, u11, d1422222222);
        if (!u11.t()) {
        }
        Ep.a.d(I12, u11, I12, g1122222222);
        U7.i.b(u11, f2122222222, 749003777);
        if (abstractC8972b4 != null) {
        }
        u11.k();
        u11.o(749007167);
        if (uniProductMediaSize2.getSmallLabelTextStyle() != null) {
        }
        u11.k();
        u11.f();
        u11.k();
        u11.f();
        qVar5 = qVar4;
        t14 = t13;
        f14 = f12;
        c3969l = u11;
        uniProductMediaSize3 = uniProductMediaSize2;
        abstractC8972b8 = abstractC8972b4;
        function03 = function02;
        eVar3 = eVar422222222;
        z18 = z17;
        j19 = j15;
        c8391l3 = c8391l2;
        interfaceC2547p2 = d11;
        j21 = j16;
        f15 = f13;
        uniProductMediaBorderStyle4 = uniProductMediaBorderStyle2;
        abstractC7799Q3 = abstractC7799Q2;
        z19 = z13;
        str5 = str3;
        j22 = j17;
        j23 = j18;
        abstractC8972b9 = abstractC8972b7;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    /* renamed from: dashedBorder-d8LSEHM, reason: not valid java name */
    private static final e m1934dashedBorderd8LSEHM(e eVar, C8391l c8391l, float f7, float[] fArr) {
        return androidx.compose.ui.draw.c.b(eVar, new UniProductMediaKt$dashedBorder$1(c8391l, f7, fArr));
    }
}
