package ru.ozon.uni.ozi.components.text;

import B1.C2533b;
import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import D1.InterfaceC2801g;
import Fr.g;
import J0.u3;
import K1.K;
import K1.T;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import T7.E;
import V1.h;
import Z1.b;
import Z1.d;
import Z1.l;
import androidx.compose.animation.a;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5239d1;
import androidx.compose.ui.platform.K0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.components.text.presets.OziTextPreset;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;
import t0.p;
import t0.q;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000z\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0093\u0001\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001aI\u0010,\u001a\u00020)*\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010&\u001a\u00020%2\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160'H\u0002¢\u0006\u0004\b*\u0010+\u001a)\u0010/\u001a\u00020)*\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b-\u0010.\u001a3\u00101\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160'H\u0002¢\u0006\u0004\b1\u00102¨\u00063"}, d2 = {"", "text", "Landroidx/compose/ui/e;", "modifier", "", "isExpanded", "expandText", "Lkotlin/Function0;", "", "onExpand", "Ll1/Z;", "color", "expandBackgroundColor", "expandTextColor", "LV1/h;", "textAlign", "LV1/r;", "overflow", "softWrap", "", "maxLines", "Lkotlin/Function1;", "LK1/K;", "onTextLayout", "Lru/ozon/uni/ozi/components/text/presets/OziTextPreset;", "preset", "OziExpandableTextBlockItemImpl-ffHtLjE", "(Ljava/lang/String;Landroidx/compose/ui/e;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;JJJLV1/h;IZILkotlin/jvm/functions/Function1;Lru/ozon/uni/ozi/components/text/presets/OziTextPreset;LS0/k;II)V", "OziExpandableTextBlockItemImpl", "LB1/Y;", "Lu0/x;", "paddingValues", "LZ1/d;", "density", "", "LB1/U;", "measurables", "LZ1/b;", "constraints", "LS0/A1;", "textLayoutResult", "LB1/W;", "measureWithExpand-MJue9go", "(LB1/Y;Lu0/x;LZ1/d;Ljava/util/List;JLS0/A1;)LB1/W;", "measureWithExpand", "measureOnlyText-3p2s80s", "(LB1/Y;Ljava/util/List;J)LB1/W;", "measureOnlyText", "layoutResult", "drawDebugLines", "(Landroidx/compose/ui/e;Lu0/x;LZ1/d;LS0/A1;)Landroidx/compose/ui/e;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziExpandableTextBlockItemImplKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OziExpandableTextBlockItemImpl-ffHtLjE, reason: not valid java name */
    public static final void m3126OziExpandableTextBlockItemImplffHtLjE(@NotNull String text, @NotNull e modifier, final boolean z11, @NotNull String expandText, @NotNull Function0<Unit> onExpand, long j11, long j12, long j13, h hVar, int i11, boolean z12, int i12, @NotNull Function1<? super K, Unit> onTextLayout, @NotNull OziTextPreset preset, InterfaceC3967k interfaceC3967k, int i13, int i14) {
        int i15;
        int i16;
        InterfaceC3978p0 interfaceC3978p0;
        long j14;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(expandText, "expandText");
        Intrinsics.checkNotNullParameter(onExpand, "onExpand");
        Intrinsics.checkNotNullParameter(onTextLayout, "onTextLayout");
        Intrinsics.checkNotNullParameter(preset, "preset");
        C3969l u11 = interfaceC3967k.u(2096839481);
        if ((i13 & 6) == 0) {
            i15 = (u11.n(text) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= u11.n(modifier) ? 32 : 16;
        }
        int i17 = i13 & 384;
        int i18 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i17 == 0) {
            i15 |= u11.p(z11) ? 256 : 128;
        }
        int i19 = i13 & 3072;
        int i21 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i19 == 0) {
            i15 |= u11.n(expandText) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= u11.F(onExpand) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i15 |= u11.s(j11) ? 131072 : 65536;
        }
        if ((1572864 & i13) == 0) {
            i15 |= u11.s(j12) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i15 |= u11.s(j13) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i15 |= u11.n(hVar) ? 67108864 : 33554432;
        }
        if ((i13 & 805306368) == 0) {
            i15 |= u11.r(i11) ? 536870912 : 268435456;
        }
        if ((i14 & 6) == 0) {
            i16 = i14 | (u11.p(z12) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= u11.r(i12) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            if (u11.F(onTextLayout)) {
                i18 = 256;
            }
            i16 |= i18;
        }
        if ((i14 & 3072) == 0) {
            if (u11.n(preset)) {
                i21 = 2048;
            }
            i16 |= i21;
        }
        int i22 = i16;
        if ((i15 & 306783379) == 306783378 && (i22 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            d dVar = (d) u11.m(K0.e());
            u11.o(1841935045);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(null, D1.f25195a);
                u11.x(C11);
            }
            final InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C11;
            u11.k();
            final InterfaceC9914x paddingValues = preset.getPaddingValues();
            T expandTextStyle = preset.getExpandTextStyle();
            int i23 = i15 >> 3;
            int i24 = i15 >> 6;
            int i25 = (i23 & 7168) | (i23 & 14) | 100663296 | (i15 & 896) | (i24 & 57344) | (i24 & 458752) | ((i15 << 9) & 3670016);
            u11.o(-412383272);
            final d dVar2 = (d) u11.m(K0.e());
            int i26 = i15;
            e oziTestTag = OziTestTagsKt.oziTestTag(modifier, OziExpandableTextTestTags.Container, null, u11, (i25 & 14) | 48, 2);
            u11.o(1267001931);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = p.a();
                u11.x(C12);
            }
            u11.k();
            e a11 = a.a(i.b(oziTestTag, (q) C12, null, false, null, null, new OziExpandableTextBlockItemImplKt$ExpandableTextBlockItemWrapper$2(z11, onExpand), 28), null, 3);
            u11.o(1267069863);
            boolean n11 = ((((i25 & 896) ^ 384) > 256 && u11.p(z11)) || (i25 & 384) == 256) | u11.n(paddingValues) | u11.n(dVar2);
            Object C13 = u11.C();
            if (n11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new V() { // from class: ru.ozon.uni.ozi.components.text.OziExpandableTextBlockItemImplKt$ExpandableTextBlockItemWrapper$3$1
                    @Override // B1.V
                    /* renamed from: measure-3p2s80s */
                    public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j15) {
                        W m3130measureWithExpandMJue9go;
                        W m3129measureOnlyText3p2s80s;
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        if (z11) {
                            m3129measureOnlyText3p2s80s = OziExpandableTextBlockItemImplKt.m3129measureOnlyText3p2s80s(Layout, measurables, j15);
                            return m3129measureOnlyText3p2s80s;
                        }
                        m3130measureWithExpandMJue9go = OziExpandableTextBlockItemImplKt.m3130measureWithExpandMJue9go(Layout, paddingValues, dVar2, measurables, j15, interfaceC3978p02);
                        return m3130measureWithExpandMJue9go;
                    }
                };
                u11.x(C13);
            }
            V v11 = (V) C13;
            u11.k();
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, a11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f11 = E.f(u11, v11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            e.a aVar = e.f40358c0;
            e e11 = a0.e(androidx.compose.ui.layout.a.b(OziTestTagsKt.oziTestTag(aVar, OziExpandableTextTestTags.TextContainer, null, u11, 54, 2), "text"), 1.0f);
            V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f13 = c.f(u11, e11);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 f14 = E.f(u11, f12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, f14);
            }
            e drawDebugLines = drawDebugLines(OziTestTagsKt.oziTestTag(GZ.e.c(u11, f13, aVar, 1.0f), OziExpandableTextTestTags.Text, null, u11, 54, 2), preset.getPaddingValues(), dVar, interfaceC3978p02);
            int i27 = z11 ? i11 : 2;
            int i28 = z11 ? Integer.MAX_VALUE : i12;
            u11.o(-730848024);
            boolean z13 = (i22 & 896) == 256;
            Object C14 = u11.C();
            if (z13 || C14 == InterfaceC3967k.a.a()) {
                C14 = new OziExpandableTextBlockItemImplKt$OziExpandableTextBlockItemImpl$3$1$1(interfaceC3978p02, onTextLayout);
                u11.x(C14);
            }
            u11.k();
            int i29 = i22 << 15;
            OziTextBlockItemKt.m3133OziTextBlockItemImpljVGSiAQ(drawDebugLines, text, j11, hVar, i27, z12, i28, (Function1) C14, preset, u11, (i29 & 234881024) | ((i26 << 3) & 112) | ((i26 >> 9) & 896) | ((i26 >> 15) & 7168) | (i29 & 458752));
            u11 = u11;
            u11.f();
            K k11 = (K) interfaceC3978p02.getValue();
            boolean z14 = k11 != null && k11.h();
            boolean booleanValue = ((Boolean) u11.m(C5239d1.a())).booleanValue();
            u11.o(1628077595);
            if (!z11 && (booleanValue || z14)) {
                e e12 = a0.e(androidx.compose.ui.layout.a.b(aVar, "expandBox"), 1.0f);
                if (booleanValue) {
                    u11.o(504550154);
                    Object C15 = u11.C();
                    if (C15 == InterfaceC3967k.a.a()) {
                        interfaceC3978p0 = interfaceC3978p02;
                        C15 = new OziExpandableTextBlockItemImplKt$ExpandableTextBlockItemWrapper$4$2$1$1(interfaceC3978p0);
                        u11.x(C15);
                    } else {
                        interfaceC3978p0 = interfaceC3978p02;
                    }
                    u11.k();
                    e12 = e12.l0(androidx.compose.ui.draw.c.d(aVar, (Function1) C15));
                } else {
                    interfaceC3978p0 = interfaceC3978p02;
                }
                AbstractC7799Q.a aVar2 = AbstractC7799Q.Companion;
                Float valueOf = Float.valueOf(0.0f);
                j14 = C7807Z.f72258l;
                C5185h.a(androidx.compose.foundation.e.a(e12, AbstractC7799Q.a.b(aVar2, new Pair[]{new Pair(valueOf, C7807Z.m(j14)), new Pair(Float.valueOf(0.4f), C7807Z.m(j12))}), null, 6), u11, 0);
                u11.o(1628109126);
                e oziTestTag2 = OziTestTagsKt.oziTestTag(aVar, OziExpandableTextTestTags.ExpandText, null, u11, 54, 2);
                u11 = u11;
                e j15 = androidx.compose.foundation.layout.T.j(androidx.compose.ui.layout.a.b(oziTestTag2, "expand"), 40, 0.0f, 0.0f, 0.0f, 14);
                if (booleanValue) {
                    u11.o(504575626);
                    Object C16 = u11.C();
                    if (C16 == InterfaceC3967k.a.a()) {
                        C16 = new OziExpandableTextBlockItemImplKt$ExpandableTextBlockItemWrapper$4$4$1$1(interfaceC3978p0);
                        u11.x(C16);
                    }
                    u11.k();
                    j15 = j15.l0(androidx.compose.ui.draw.c.d(aVar, (Function1) C16));
                }
                u11.k();
                u3.b(expandText, j15, j13, 0L, null, 0L, null, 0L, 1, true, 1, 0, null, expandTextStyle, u11, ((i25 >> 18) & 14) | ((i25 >> 9) & 896), 3504, 51192);
            }
            u11.k();
            u11.f();
            u11.k();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new OziExpandableTextBlockItemImplKt$OziExpandableTextBlockItemImpl$4(text, modifier, z11, expandText, onExpand, j11, j12, j13, hVar, i11, z12, i12, onTextLayout, preset, i13, i14));
        }
    }

    private static final e drawDebugLines(e eVar, InterfaceC9914x interfaceC9914x, d dVar, A1<K> a12) {
        return androidx.compose.ui.draw.c.d(eVar, new OziExpandableTextBlockItemImplKt$drawDebugLines$1(dVar, a12, interfaceC9914x));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: measureOnlyText-3p2s80s, reason: not valid java name */
    public static final W m3129measureOnlyText3p2s80s(Y y11, List<? extends U> list, long j11) {
        W z02;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            U u11 = list.get(i11);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u11), "text")) {
                m0 a02 = u11.a0(j11);
                z02 = y11.z0(b.k(j11), a02.l0(), kotlin.collections.U.c(), new OziExpandableTextBlockItemImplKt$measureOnlyText$1(a02));
                return z02;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: measureWithExpand-MJue9go, reason: not valid java name */
    public static final W m3130measureWithExpandMJue9go(Y y11, InterfaceC9914x interfaceC9914x, d dVar, List<? extends U> list, long j11, A1<K> a12) {
        m0 m0Var;
        U u11;
        int i11;
        U u12;
        W z02;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            U u13 = list.get(i12);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u13), "text")) {
                m0 a02 = u13.a0(j11);
                int size2 = list.size();
                int i13 = 0;
                while (true) {
                    m0Var = null;
                    if (i13 >= size2) {
                        u11 = null;
                        break;
                    }
                    u11 = list.get(i13);
                    if (Intrinsics.d(androidx.compose.ui.layout.a.a(u11), "expand")) {
                        break;
                    }
                    i13++;
                }
                U u14 = u11;
                m0 a03 = u14 != null ? u14.a0(b.c(0, 0, 0, 0, 10, j11)) : null;
                K value = a12.getValue();
                if (value == null || (i11 = (int) (value.l(value.m() - 1) - value.u(value.m() - 1))) < 0) {
                    i11 = 0;
                }
                int size3 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size3) {
                        u12 = null;
                        break;
                    }
                    u12 = list.get(i14);
                    if (Intrinsics.d(androidx.compose.ui.layout.a.a(u12), "expandBox")) {
                        break;
                    }
                    i14++;
                }
                U u15 = u12;
                if (u15 != null) {
                    int u02 = a03 != null ? a03.u0() : 0;
                    if (u02 < 0 || i11 < 0) {
                        l.a("width(" + u02 + ") and height(" + i11 + ") must be >= 0");
                        throw null;
                    }
                    m0Var = u15.a0(Z1.c.i(u02, u02, i11, i11));
                }
                z02 = y11.z0(b.k(j11), a02.l0(), kotlin.collections.U.c(), new OziExpandableTextBlockItemImplKt$measureWithExpand$1(a02, m0Var, dVar, a03, a02.E(C2533b.b()) - (a03 != null ? a03.E(C2533b.b()) : 0), interfaceC9914x));
                return z02;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
