package ru.ozon.uni.ozi.components.heading;

import D1.InterfaceC2801g;
import E0.C2942q;
import Fr.g;
import J0.u3;
import K00.b;
import P9.a;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import androidx.compose.foundation.layout.B;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b1.C5503f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.core.compose.tokens.UniPaddings;
import ru.ozon.uni.core.compose.tokens.UniRadii;
import ru.ozon.uni.core.compose.tokens.UniResourceIcons;
import ru.ozon.uni.ozi.components.heading.OziHeadingScope;
import ru.ozon.uni.ozi.components.heading.OziHeadingStatus;
import ru.ozon.uni.ozi.components.text.OziExpandableTextKt;
import ru.ozon.uni.ozi.components.text.presets.OziTextPreset;
import ru.ozon.uni.ozi.theme.OziTheme;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;
import ru.ozon.uni.ozi.utils.internal.ValidatedContentKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u008f\u0001\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aA\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006 ²\u0006\u000e\u0010\u001f\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lkotlin/Function1;", "Lru/ozon/uni/ozi/components/heading/OziHeadingTopScope;", "", "topContent", "Lru/ozon/uni/ozi/components/heading/OziHeadingEndScope;", "endContent", "", "titleLineLimit", "", "titleExpandable", "subtitle", "subtitleLineLimit", "subtitleExpandable", "Lru/ozon/uni/ozi/components/heading/OziHeadingStatus;", "status", "OziHeading", "(Landroidx/compose/ui/e;Ljava/lang/String;Lfd/n;Lfd/n;IZLjava/lang/String;IZLru/ozon/uni/ozi/components/heading/OziHeadingStatus;LS0/k;II)V", "text", "expandable", "maxLines", "Lru/ozon/uni/ozi/components/text/presets/OziTextPreset;", "preset", "Ll1/Z;", "color", "TextBlock-V-9fs2A", "(Landroidx/compose/ui/e;Ljava/lang/String;ZILru/ozon/uni/ozi/components/text/presets/OziTextPreset;JLS0/k;II)V", "TextBlock", "isExpanded", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziHeadingKt {
    /* JADX WARN: Removed duplicated region for block: B:108:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OziHeading(e eVar, @NotNull String title, InterfaceC6511n<? super OziHeadingTopScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, InterfaceC6511n<? super OziHeadingEndScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2, int i11, boolean z11, String str, int i12, boolean z12, OziHeadingStatus oziHeadingStatus, InterfaceC3967k interfaceC3967k, int i13, int i14) {
        e eVar2;
        int i15;
        InterfaceC6511n<? super OziHeadingTopScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n3;
        int i16;
        InterfaceC6511n<? super OziHeadingEndScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n4;
        int i17;
        int i18;
        int i19;
        boolean z13;
        int i21;
        String str2;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        InterfaceC6511n<? super OziHeadingTopScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n5;
        int I11;
        e eVar3;
        OziHeadingStatus oziHeadingStatus2;
        boolean z14;
        InterfaceC6511n<? super OziHeadingTopScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n6;
        int i29;
        boolean z15;
        int i31;
        C3969l c3969l;
        InterfaceC6511n<? super OziHeadingEndScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n7;
        int i32;
        boolean z16;
        int i33;
        boolean z17;
        C3969l c3969l2;
        boolean z18;
        e eVar4;
        InterfaceC6511n<? super OziHeadingTopScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n8;
        OziHeadingStatus oziHeadingStatus3;
        int i34;
        InterfaceC6511n<? super OziHeadingEndScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n9;
        e.a aVar;
        J0 m02;
        Intrinsics.checkNotNullParameter(title, "title");
        C3969l u11 = interfaceC3967k.u(192645896);
        int i35 = i14 & 1;
        if (i35 != 0) {
            i15 = i13 | 6;
            eVar2 = eVar;
        } else if ((i13 & 6) == 0) {
            eVar2 = eVar;
            i15 = (u11.n(eVar2) ? 4 : 2) | i13;
        } else {
            eVar2 = eVar;
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= u11.n(title) ? 32 : 16;
        }
        int i36 = i14 & 4;
        if (i36 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            interfaceC6511n3 = interfaceC6511n;
            i15 |= u11.F(interfaceC6511n3) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i16 = i14 & 8;
            if (i16 == 0) {
                i15 |= 3072;
            } else if ((i13 & 3072) == 0) {
                interfaceC6511n4 = interfaceC6511n2;
                i15 |= u11.F(interfaceC6511n4) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                i17 = i14 & 16;
                if (i17 != 0) {
                    i15 |= 24576;
                } else if ((i13 & 24576) == 0) {
                    i18 = i11;
                    i15 |= u11.r(i18) ? 16384 : 8192;
                    i19 = i14 & 32;
                    if (i19 == 0) {
                        i15 |= 196608;
                        z13 = z11;
                    } else {
                        z13 = z11;
                        if ((i13 & 196608) == 0) {
                            i15 |= u11.p(z13) ? 131072 : 65536;
                        }
                    }
                    i21 = i14 & 64;
                    if (i21 == 0) {
                        i15 |= 1572864;
                        str2 = str;
                    } else {
                        str2 = str;
                        if ((i13 & 1572864) == 0) {
                            i15 |= u11.n(str2) ? 1048576 : 524288;
                        }
                    }
                    i22 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i22 == 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        i23 = i35;
                        i15 |= u11.r(i12) ? 8388608 : 4194304;
                        i24 = i14 & 256;
                        if (i24 != 0) {
                            i15 |= 100663296;
                        } else if ((i13 & 100663296) == 0) {
                            i25 = i24;
                            i15 |= u11.p(z12) ? 67108864 : 33554432;
                            i26 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
                            if (i26 == 0) {
                                i27 = i26;
                                i28 = i15 | 805306368;
                            } else {
                                if ((i13 & 805306368) == 0) {
                                    i27 = i26;
                                    i15 |= u11.n(oziHeadingStatus) ? 536870912 : 268435456;
                                } else {
                                    i27 = i26;
                                }
                                i28 = i15;
                            }
                            if ((i28 & 306783379) == 306783378 || !u11.b()) {
                                e eVar5 = i23 == 0 ? e.f40358c0 : eVar2;
                                interfaceC6511n5 = i36 == 0 ? null : interfaceC6511n3;
                                InterfaceC6511n<? super OziHeadingEndScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n10 = i16 == 0 ? null : interfaceC6511n4;
                                int i37 = i17 == 0 ? 2 : i18;
                                if (i19 != 0) {
                                    z13 = false;
                                }
                                String str3 = i21 == 0 ? null : str2;
                                int i38 = i22 == 0 ? 3 : i12;
                                boolean z19 = i25 == 0 ? false : z12;
                                OziHeadingStatus oziHeadingStatus4 = i27 == 0 ? OziHeadingStatus.Default.INSTANCE : oziHeadingStatus;
                                e e11 = a0.e(eVar5, 1.0f);
                                a.b(e11, "heading container");
                                e oziTestTag = OziTestTagsKt.oziTestTag(e11, OziHeadingTestTags.Container, null, u11, 48, 2);
                                C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                                I11 = u11.I();
                                A0 d11 = u11.d();
                                e f7 = c.f(u11, oziTestTag);
                                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                                if (u11.t()) {
                                    u11.e();
                                } else {
                                    u11.H(a12);
                                }
                                Function2 g10 = b.g(u11, a11, u11, d11);
                                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                    Ep.a.d(I11, u11, I11, g10);
                                }
                                F1.b(u11, f7, InterfaceC2801g.a.f());
                                if (interfaceC6511n5 == null) {
                                    u11.o(-1281382279);
                                    ValidatedContentKt.ValidateContent(OziHeadingScope.AddonMarker.Top, new IntRange(1, Integer.MAX_VALUE, 1), null, a1.c.c(317601550, new OziHeadingKt$OziHeading$1$1(interfaceC6511n5), u11), u11, 3078, 4);
                                    C5179b.i n11 = C5179b.n(16);
                                    e.a aVar2 = e.f40358c0;
                                    Y b11 = X.b(n11, InterfaceC6250b.a.l(), u11, 6);
                                    int I12 = u11.I();
                                    A0 d12 = u11.d();
                                    e f11 = c.f(u11, aVar2);
                                    e eVar6 = eVar5;
                                    Function0 a13 = InterfaceC2801g.a.a();
                                    u11.i();
                                    if (u11.t()) {
                                        u11.H(a13);
                                    } else {
                                        u11.e();
                                    }
                                    Function2 h11 = Cm.e.h(u11, b11, u11, d12);
                                    if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                                        Ep.a.d(I12, u11, I12, h11);
                                    }
                                    F1.b(u11, f11, InterfaceC2801g.a.f());
                                    e j11 = T.j(aVar2, 0.0f, 4, 0.0f, 12, 5);
                                    if (1.0f <= 0.0d) {
                                        throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
                                    }
                                    e l02 = j11.l0(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                                    a.b(l02, "heading badges");
                                    e oziTestTag2 = OziTestTagsKt.oziTestTag(l02, OziHeadingTestTags.Badges, null, u11, 48, 2);
                                    float f12 = 6;
                                    B.a(oziTestTag2, C5179b.n(f12), C5179b.n(f12), 0, 0, null, a1.c.c(-1042513758, new OziHeadingKt$OziHeading$1$2$1(interfaceC6511n5), u11), u11, 1573296, 56);
                                    u11.o(1746013644);
                                    if (interfaceC6511n10 != null) {
                                        a.b(aVar2, "heading end");
                                        e oziTestTag3 = OziTestTagsKt.oziTestTag(aVar2, OziHeadingTestTags.End, null, u11, 54, 2);
                                        aVar = aVar2;
                                        ValidatedContentKt.ValidatedContent(OziHeadingScope.AddonMarker.End, oziTestTag3, false, a1.c.c(-1631525645, new OziHeadingKt$OziHeading$1$2$2(interfaceC6511n10), u11), u11, 3078, 4);
                                    } else {
                                        aVar = aVar2;
                                    }
                                    u11.k();
                                    u11.f();
                                    a.b(aVar, "heading title");
                                    oziHeadingStatus2 = oziHeadingStatus4;
                                    z14 = z13;
                                    i29 = i37;
                                    eVar3 = eVar6;
                                    interfaceC6511n6 = interfaceC6511n5;
                                    m3081TextBlockV9fs2A(OziTestTagsKt.oziTestTag(aVar, OziHeadingTestTags.Title, null, u11, 54, 2), title, z14, i29, OziTextPreset.UiH2Compact.INSTANCE, OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getTextPrimary(), u11, (i28 & 112) | 24576 | ((i28 >> 9) & 896) | ((i28 >> 3) & 7168), 0);
                                    c3969l = u11;
                                    c3969l.k();
                                } else {
                                    eVar3 = eVar5;
                                    oziHeadingStatus2 = oziHeadingStatus4;
                                    z14 = z13;
                                    interfaceC6511n6 = interfaceC6511n5;
                                    i29 = i37;
                                    if (interfaceC6511n10 != null) {
                                        u11.o(-1279810765);
                                        C5179b.i n12 = C5179b.n(8);
                                        e.a aVar3 = e.f40358c0;
                                        Y b12 = X.b(n12, InterfaceC6250b.a.l(), u11, 6);
                                        int I13 = u11.I();
                                        A0 d13 = u11.d();
                                        e f13 = c.f(u11, aVar3);
                                        Function0 a14 = InterfaceC2801g.a.a();
                                        u11.i();
                                        if (u11.t()) {
                                            u11.H(a14);
                                        } else {
                                            u11.e();
                                        }
                                        Function2 h12 = Cm.e.h(u11, b12, u11, d13);
                                        if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                                            Ep.a.d(I13, u11, I13, h12);
                                        }
                                        F1.b(u11, f13, InterfaceC2801g.a.f());
                                        if (1.0f <= 0.0d) {
                                            throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
                                        }
                                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                                        a.b(layoutWeightElement, "heading title");
                                        m3081TextBlockV9fs2A(OziTestTagsKt.oziTestTag(layoutWeightElement, OziHeadingTestTags.Title, null, u11, 48, 2), title, z14, i29, OziTextPreset.UiH2Compact.INSTANCE, OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getTextPrimary(), u11, (i28 & 112) | 24576 | ((i28 >> 9) & 896) | ((i28 >> 3) & 7168), 0);
                                        c3969l = u11;
                                        a.b(aVar3, "heading end");
                                        ValidatedContentKt.ValidatedContent(OziHeadingScope.AddonMarker.End, OziTestTagsKt.oziTestTag(aVar3, OziHeadingTestTags.End, null, c3969l, 54, 2), false, a1.c.c(1475252673, new OziHeadingKt$OziHeading$1$3$1(interfaceC6511n10), c3969l), c3969l, 3078, 4);
                                        c3969l.f();
                                        c3969l.k();
                                    } else {
                                        u11.o(-1278979283);
                                        e.a aVar4 = e.f40358c0;
                                        a.b(aVar4, "heading title");
                                        m3081TextBlockV9fs2A(OziTestTagsKt.oziTestTag(aVar4, OziHeadingTestTags.Title, null, u11, 54, 2), title, z14, i29, OziTextPreset.UiH2Compact.INSTANCE, OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getTextPrimary(), u11, (i28 & 112) | 24576 | ((i28 >> 9) & 896) | ((i28 >> 3) & 7168), 0);
                                        z15 = z14;
                                        i31 = i29;
                                        c3969l = u11;
                                        c3969l.k();
                                        if (oziHeadingStatus2 instanceof OziHeadingStatus.Error) {
                                            c3969l.o(-1278565061);
                                            e.a aVar5 = e.f40358c0;
                                            a.b(aVar5, "heading subtitle");
                                            OziHeadingStatus.Error error = (OziHeadingStatus.Error) oziHeadingStatus2;
                                            interfaceC6511n7 = interfaceC6511n10;
                                            m3081TextBlockV9fs2A(OziTestTagsKt.oziTestTag(aVar5, OziHeadingTestTags.Subtitle, null, c3969l, 54, 2), error.getMessage(), false, error.getErrorLineLimit(), OziTextPreset.ParagraphCompact.INSTANCE, OziTheme.INSTANCE.getColors(c3969l, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getTextNegative(), c3969l, 24960, 0);
                                            c3969l.k();
                                            str2 = str3;
                                            i32 = i38;
                                            z16 = z19;
                                        } else {
                                            interfaceC6511n7 = interfaceC6511n10;
                                            if (str3 != null) {
                                                c3969l.o(-1278148948);
                                                e.a aVar6 = e.f40358c0;
                                                a.b(aVar6, "heading subtitle");
                                                str2 = str3;
                                                i32 = i38;
                                                z16 = z19;
                                                m3081TextBlockV9fs2A(OziTestTagsKt.oziTestTag(aVar6, OziHeadingTestTags.Subtitle, null, c3969l, 54, 2), str2, z16, i32, OziTextPreset.ParagraphCompact.INSTANCE, OziTheme.INSTANCE.getColors(c3969l, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getTextSecondaryTransparent(), c3969l, ((i28 >> 15) & 112) | 24576 | ((i28 >> 18) & 896) | ((i28 >> 12) & 7168), 0);
                                                c3969l.k();
                                            } else {
                                                str2 = str3;
                                                i32 = i38;
                                                z16 = z19;
                                                c3969l.o(-1277758782);
                                                c3969l.k();
                                            }
                                        }
                                        c3969l.f();
                                        i33 = i31;
                                        z17 = z16;
                                        c3969l2 = c3969l;
                                        z18 = z15;
                                        eVar4 = eVar3;
                                        interfaceC6511n8 = interfaceC6511n6;
                                        oziHeadingStatus3 = oziHeadingStatus2;
                                        i34 = i32;
                                        interfaceC6511n9 = interfaceC6511n7;
                                    }
                                }
                                z15 = z14;
                                i31 = i29;
                                if (oziHeadingStatus2 instanceof OziHeadingStatus.Error) {
                                }
                                c3969l.f();
                                i33 = i31;
                                z17 = z16;
                                c3969l2 = c3969l;
                                z18 = z15;
                                eVar4 = eVar3;
                                interfaceC6511n8 = interfaceC6511n6;
                                oziHeadingStatus3 = oziHeadingStatus2;
                                i34 = i32;
                                interfaceC6511n9 = interfaceC6511n7;
                            } else {
                                u11.j();
                                i34 = i12;
                                oziHeadingStatus3 = oziHeadingStatus;
                                z18 = z13;
                                eVar4 = eVar2;
                                c3969l2 = u11;
                                interfaceC6511n8 = interfaceC6511n3;
                                interfaceC6511n9 = interfaceC6511n4;
                                i33 = i18;
                                z17 = z12;
                            }
                            String str4 = str2;
                            m02 = c3969l2.m0();
                            if (m02 == null) {
                                m02.G(new OziHeadingKt$OziHeading$2(eVar4, title, interfaceC6511n8, interfaceC6511n9, i33, z18, str4, i34, z17, oziHeadingStatus3, i13, i14));
                                return;
                            }
                            return;
                        }
                        i25 = i24;
                        i26 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
                        if (i26 == 0) {
                        }
                        if ((i28 & 306783379) == 306783378) {
                        }
                        if (i23 == 0) {
                        }
                        if (i36 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i19 != 0) {
                        }
                        if (i21 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (i27 == 0) {
                        }
                        e e112 = a0.e(eVar5, 1.0f);
                        a.b(e112, "heading container");
                        e oziTestTag4 = OziTestTagsKt.oziTestTag(e112, OziHeadingTestTags.Container, null, u11, 48, 2);
                        C5194q a112 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                        I11 = u11.I();
                        A0 d112 = u11.d();
                        e f72 = c.f(u11, oziTestTag4);
                        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                        }
                        Function2 g102 = b.g(u11, a112, u11, d112);
                        if (!u11.t()) {
                        }
                        Ep.a.d(I11, u11, I11, g102);
                        F1.b(u11, f72, InterfaceC2801g.a.f());
                        if (interfaceC6511n5 == null) {
                        }
                        z15 = z14;
                        i31 = i29;
                        if (oziHeadingStatus2 instanceof OziHeadingStatus.Error) {
                        }
                        c3969l.f();
                        i33 = i31;
                        z17 = z16;
                        c3969l2 = c3969l;
                        z18 = z15;
                        eVar4 = eVar3;
                        interfaceC6511n8 = interfaceC6511n6;
                        oziHeadingStatus3 = oziHeadingStatus2;
                        i34 = i32;
                        interfaceC6511n9 = interfaceC6511n7;
                        String str42 = str2;
                        m02 = c3969l2.m0();
                        if (m02 == null) {
                        }
                    }
                    i23 = i35;
                    i24 = i14 & 256;
                    if (i24 != 0) {
                    }
                    i25 = i24;
                    i26 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
                    if (i26 == 0) {
                    }
                    if ((i28 & 306783379) == 306783378) {
                    }
                    if (i23 == 0) {
                    }
                    if (i36 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (i27 == 0) {
                    }
                    e e1122 = a0.e(eVar5, 1.0f);
                    a.b(e1122, "heading container");
                    e oziTestTag42 = OziTestTagsKt.oziTestTag(e1122, OziHeadingTestTags.Container, null, u11, 48, 2);
                    C5194q a1122 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                    I11 = u11.I();
                    A0 d1122 = u11.d();
                    e f722 = c.f(u11, oziTestTag42);
                    Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 g1022 = b.g(u11, a1122, u11, d1122);
                    if (!u11.t()) {
                    }
                    Ep.a.d(I11, u11, I11, g1022);
                    F1.b(u11, f722, InterfaceC2801g.a.f());
                    if (interfaceC6511n5 == null) {
                    }
                    z15 = z14;
                    i31 = i29;
                    if (oziHeadingStatus2 instanceof OziHeadingStatus.Error) {
                    }
                    c3969l.f();
                    i33 = i31;
                    z17 = z16;
                    c3969l2 = c3969l;
                    z18 = z15;
                    eVar4 = eVar3;
                    interfaceC6511n8 = interfaceC6511n6;
                    oziHeadingStatus3 = oziHeadingStatus2;
                    i34 = i32;
                    interfaceC6511n9 = interfaceC6511n7;
                    String str422 = str2;
                    m02 = c3969l2.m0();
                    if (m02 == null) {
                    }
                }
                i18 = i11;
                i19 = i14 & 32;
                if (i19 == 0) {
                }
                i21 = i14 & 64;
                if (i21 == 0) {
                }
                i22 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i22 == 0) {
                }
                i23 = i35;
                i24 = i14 & 256;
                if (i24 != 0) {
                }
                i25 = i24;
                i26 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i26 == 0) {
                }
                if ((i28 & 306783379) == 306783378) {
                }
                if (i23 == 0) {
                }
                if (i36 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i19 != 0) {
                }
                if (i21 == 0) {
                }
                if (i22 == 0) {
                }
                if (i25 == 0) {
                }
                if (i27 == 0) {
                }
                e e11222 = a0.e(eVar5, 1.0f);
                a.b(e11222, "heading container");
                e oziTestTag422 = OziTestTagsKt.oziTestTag(e11222, OziHeadingTestTags.Container, null, u11, 48, 2);
                C5194q a11222 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                I11 = u11.I();
                A0 d11222 = u11.d();
                e f7222 = c.f(u11, oziTestTag422);
                Function0 a12222 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 g10222 = b.g(u11, a11222, u11, d11222);
                if (!u11.t()) {
                }
                Ep.a.d(I11, u11, I11, g10222);
                F1.b(u11, f7222, InterfaceC2801g.a.f());
                if (interfaceC6511n5 == null) {
                }
                z15 = z14;
                i31 = i29;
                if (oziHeadingStatus2 instanceof OziHeadingStatus.Error) {
                }
                c3969l.f();
                i33 = i31;
                z17 = z16;
                c3969l2 = c3969l;
                z18 = z15;
                eVar4 = eVar3;
                interfaceC6511n8 = interfaceC6511n6;
                oziHeadingStatus3 = oziHeadingStatus2;
                i34 = i32;
                interfaceC6511n9 = interfaceC6511n7;
                String str4222 = str2;
                m02 = c3969l2.m0();
                if (m02 == null) {
                }
            }
            interfaceC6511n4 = interfaceC6511n2;
            i17 = i14 & 16;
            if (i17 != 0) {
            }
            i18 = i11;
            i19 = i14 & 32;
            if (i19 == 0) {
            }
            i21 = i14 & 64;
            if (i21 == 0) {
            }
            i22 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i22 == 0) {
            }
            i23 = i35;
            i24 = i14 & 256;
            if (i24 != 0) {
            }
            i25 = i24;
            i26 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i26 == 0) {
            }
            if ((i28 & 306783379) == 306783378) {
            }
            if (i23 == 0) {
            }
            if (i36 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i19 != 0) {
            }
            if (i21 == 0) {
            }
            if (i22 == 0) {
            }
            if (i25 == 0) {
            }
            if (i27 == 0) {
            }
            e e112222 = a0.e(eVar5, 1.0f);
            a.b(e112222, "heading container");
            e oziTestTag4222 = OziTestTagsKt.oziTestTag(e112222, OziHeadingTestTags.Container, null, u11, 48, 2);
            C5194q a112222 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            I11 = u11.I();
            A0 d112222 = u11.d();
            e f72222 = c.f(u11, oziTestTag4222);
            Function0 a122222 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 g102222 = b.g(u11, a112222, u11, d112222);
            if (!u11.t()) {
            }
            Ep.a.d(I11, u11, I11, g102222);
            F1.b(u11, f72222, InterfaceC2801g.a.f());
            if (interfaceC6511n5 == null) {
            }
            z15 = z14;
            i31 = i29;
            if (oziHeadingStatus2 instanceof OziHeadingStatus.Error) {
            }
            c3969l.f();
            i33 = i31;
            z17 = z16;
            c3969l2 = c3969l;
            z18 = z15;
            eVar4 = eVar3;
            interfaceC6511n8 = interfaceC6511n6;
            oziHeadingStatus3 = oziHeadingStatus2;
            i34 = i32;
            interfaceC6511n9 = interfaceC6511n7;
            String str42222 = str2;
            m02 = c3969l2.m0();
            if (m02 == null) {
            }
        }
        interfaceC6511n3 = interfaceC6511n;
        i16 = i14 & 8;
        if (i16 == 0) {
        }
        interfaceC6511n4 = interfaceC6511n2;
        i17 = i14 & 16;
        if (i17 != 0) {
        }
        i18 = i11;
        i19 = i14 & 32;
        if (i19 == 0) {
        }
        i21 = i14 & 64;
        if (i21 == 0) {
        }
        i22 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i22 == 0) {
        }
        i23 = i35;
        i24 = i14 & 256;
        if (i24 != 0) {
        }
        i25 = i24;
        i26 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i26 == 0) {
        }
        if ((i28 & 306783379) == 306783378) {
        }
        if (i23 == 0) {
        }
        if (i36 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i19 != 0) {
        }
        if (i21 == 0) {
        }
        if (i22 == 0) {
        }
        if (i25 == 0) {
        }
        if (i27 == 0) {
        }
        e e1122222 = a0.e(eVar5, 1.0f);
        a.b(e1122222, "heading container");
        e oziTestTag42222 = OziTestTagsKt.oziTestTag(e1122222, OziHeadingTestTags.Container, null, u11, 48, 2);
        C5194q a1122222 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I11 = u11.I();
        A0 d1122222 = u11.d();
        e f722222 = c.f(u11, oziTestTag42222);
        Function0 a1222222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g1022222 = b.g(u11, a1122222, u11, d1122222);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, g1022222);
        F1.b(u11, f722222, InterfaceC2801g.a.f());
        if (interfaceC6511n5 == null) {
        }
        z15 = z14;
        i31 = i29;
        if (oziHeadingStatus2 instanceof OziHeadingStatus.Error) {
        }
        c3969l.f();
        i33 = i31;
        z17 = z16;
        c3969l2 = c3969l;
        z18 = z15;
        eVar4 = eVar3;
        interfaceC6511n8 = interfaceC6511n6;
        oziHeadingStatus3 = oziHeadingStatus2;
        i34 = i32;
        interfaceC6511n9 = interfaceC6511n7;
        String str422222 = str2;
        m02 = c3969l2.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004d  */
    /* renamed from: TextBlock-V-9fs2A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3081TextBlockV9fs2A(e eVar, String str, boolean z11, int i11, OziTextPreset oziTextPreset, long j11, InterfaceC3967k interfaceC3967k, int i12, int i13) {
        e eVar2;
        int i14;
        String str2;
        int i15;
        OziTextPreset oziTextPreset2;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-266789191);
        int i16 = i13 & 1;
        if (i16 != 0) {
            i14 = i12 | 6;
            eVar2 = eVar;
        } else if ((i12 & 6) == 0) {
            eVar2 = eVar;
            i14 = (u11.n(eVar2) ? 4 : 2) | i12;
        } else {
            eVar2 = eVar;
            i14 = i12;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i12 & 48) == 0) {
            str2 = str;
            i14 |= u11.n(str2) ? 32 : 16;
            if ((i13 & 4) == 0) {
                i14 |= 384;
            } else if ((i12 & 384) == 0) {
                i14 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i13 & 8) == 0) {
                i14 |= 3072;
            } else if ((i12 & 3072) == 0) {
                i15 = i11;
                i14 |= u11.r(i15) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                if ((i13 & 16) != 0) {
                    i14 |= 24576;
                } else if ((i12 & 24576) == 0) {
                    oziTextPreset2 = oziTextPreset;
                    i14 |= u11.n(oziTextPreset2) ? 16384 : 8192;
                    if ((i13 & 32) == 0) {
                        i14 |= 196608;
                    } else if ((i12 & 196608) == 0) {
                        i14 |= u11.s(j11) ? 131072 : 65536;
                    }
                    if ((74899 & i14) == 74898 || !u11.b()) {
                        e eVar3 = i16 == 0 ? e.f40358c0 : eVar2;
                        if (z11) {
                            u11.o(14865176);
                            u3.b(str, T.e(eVar3, oziTextPreset.getPaddingValues()), j11, 0L, null, 0L, null, 0L, 2, false, i11, 0, null, oziTextPreset.getTextStyle(), u11, ((i14 >> 3) & 14) | ((i14 >> 9) & 896), (i14 & 7168) | 48, 55288);
                            u11 = u11;
                            u11.k();
                        } else {
                            u11.o(14512799);
                            Object[] objArr = new Object[0];
                            u11.o(277563932);
                            Object C11 = u11.C();
                            if (C11 == InterfaceC3967k.a.a()) {
                                C11 = OziHeadingKt$TextBlock$isExpanded$2$1.INSTANCE;
                                u11.x(C11);
                            }
                            u11.k();
                            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C5503f.c(objArr, null, (Function0) C11, u11, 3072, 6);
                            boolean TextBlock_V_9fs2A$lambda$4 = TextBlock_V_9fs2A$lambda$4(interfaceC3978p0);
                            u11.o(277568888);
                            boolean n11 = u11.n(interfaceC3978p0);
                            Object C12 = u11.C();
                            if (n11 || C12 == InterfaceC3967k.a.a()) {
                                C12 = new OziHeadingKt$TextBlock$1$1(interfaceC3978p0);
                                u11.x(C12);
                            }
                            u11.k();
                            int i17 = i14 >> 3;
                            OziExpandableTextKt.m3131OziExpandableTextBlockItemwq0Bh8(str2, eVar3, TextBlock_V_9fs2A$lambda$4, null, (Function0) C12, j11, 0L, 0L, null, 0, false, i15, null, oziTextPreset2, u11, (i17 & 14) | ((i14 << 3) & 112) | (458752 & i14), ((i14 >> 6) & 112) | (i17 & 7168), 6088);
                            u11 = u11;
                            u11.k();
                        }
                        eVar2 = eVar3;
                    } else {
                        u11.j();
                    }
                    m02 = u11.m0();
                    if (m02 == null) {
                        m02.G(new OziHeadingKt$TextBlock$2(eVar2, str, z11, i11, oziTextPreset, j11, i12, i13));
                        return;
                    }
                    return;
                }
                oziTextPreset2 = oziTextPreset;
                if ((i13 & 32) == 0) {
                }
                if ((74899 & i14) == 74898) {
                }
                if (i16 == 0) {
                }
                if (z11) {
                }
                eVar2 = eVar3;
                m02 = u11.m0();
                if (m02 == null) {
                }
            }
            i15 = i11;
            if ((i13 & 16) != 0) {
            }
            oziTextPreset2 = oziTextPreset;
            if ((i13 & 32) == 0) {
            }
            if ((74899 & i14) == 74898) {
            }
            if (i16 == 0) {
            }
            if (z11) {
            }
            eVar2 = eVar3;
            m02 = u11.m0();
            if (m02 == null) {
            }
        }
        str2 = str;
        if ((i13 & 4) == 0) {
        }
        if ((i13 & 8) == 0) {
        }
        i15 = i11;
        if ((i13 & 16) != 0) {
        }
        oziTextPreset2 = oziTextPreset;
        if ((i13 & 32) == 0) {
        }
        if ((74899 & i14) == 74898) {
        }
        if (i16 == 0) {
        }
        if (z11) {
        }
        eVar2 = eVar3;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    private static final boolean TextBlock_V_9fs2A$lambda$4(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextBlock_V_9fs2A$lambda$5(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }
}
