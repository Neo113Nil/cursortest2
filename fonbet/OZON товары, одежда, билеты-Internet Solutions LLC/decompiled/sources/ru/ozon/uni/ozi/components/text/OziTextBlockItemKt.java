package ru.ozon.uni.ozi.components.text;

import J0.u3;
import K1.C3422b;
import K1.C3424d;
import K1.C3440u;
import K1.K;
import K1.T;
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
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.components.text.presets.OziTextPreset;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001ak\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001ag\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d²\u0006\u000e\u0010\u001c\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "", "", "paragraphs", "Ll1/Z;", "color", "LV1/h;", "textAlign", "LV1/r;", "overflow", "", "softWrap", "", "maxLines", "Lkotlin/Function1;", "LK1/K;", "", "onTextLayout", "Lru/ozon/uni/ozi/components/text/presets/OziTextPreset;", "preset", "MaxLinesParagraphTextBlock-jVGSiAQ", "(Landroidx/compose/ui/e;Ljava/util/List;JLV1/h;IZILkotlin/jvm/functions/Function1;Lru/ozon/uni/ozi/components/text/presets/OziTextPreset;LS0/k;I)V", "MaxLinesParagraphTextBlock", "text", "OziTextBlockItemImpl-jVGSiAQ", "(Landroidx/compose/ui/e;Ljava/lang/String;JLV1/h;IZILkotlin/jvm/functions/Function1;Lru/ozon/uni/ozi/components/text/presets/OziTextPreset;LS0/k;I)V", "OziTextBlockItemImpl", "linesForParagraph", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziTextBlockItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MaxLinesParagraphTextBlock-jVGSiAQ, reason: not valid java name */
    public static final void m3132MaxLinesParagraphTextBlockjVGSiAQ(e eVar, List<String> list, long j11, h hVar, int i11, boolean z11, int i12, Function1<? super K, Unit> function1, OziTextPreset oziTextPreset, InterfaceC3967k interfaceC3967k, int i13) {
        int i14;
        int i15;
        Function1<? super K, Unit> function12;
        C3969l c3969l;
        List<String> list2 = list;
        C3969l u11 = interfaceC3967k.u(175972321);
        if ((i13 & 6) == 0) {
            i14 = (u11.n(eVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= u11.n(list2) ? 32 : 16;
        }
        long j12 = j11;
        if ((i13 & 384) == 0) {
            i14 |= u11.s(j12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= u11.n(hVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 24576) == 0) {
            i14 |= u11.r(i11) ? 16384 : 8192;
        }
        if ((i13 & 196608) == 0) {
            i14 |= u11.p(z11) ? 131072 : 65536;
        }
        if ((1572864 & i13) == 0) {
            i15 = i12;
            i14 |= u11.r(i15) ? 1048576 : 524288;
        } else {
            i15 = i12;
        }
        if ((12582912 & i13) == 0) {
            function12 = function1;
            i14 |= u11.F(function12) ? 8388608 : 4194304;
        } else {
            function12 = function1;
        }
        if ((100663296 & i13) == 0) {
            i14 |= u11.n(oziTextPreset) ? 67108864 : 33554432;
        }
        if ((38347923 & i14) == 38347922 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            u11.o(779019391);
            C3422b.a aVar = new C3422b.a();
            u11.o(779023322);
            int size = list2.size();
            int i16 = i15;
            int i17 = i16;
            int i18 = 0;
            while (i18 < size) {
                String str = list2.get(i18);
                u11.o(-2058948920);
                Object C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = C3956f1.a(Integer.MAX_VALUE);
                    u11.x(C11);
                }
                InterfaceC3972m0 interfaceC3972m0 = (InterfaceC3972m0) C11;
                u11.k();
                e.a aVar2 = e.f40358c0;
                e a11 = C6981a.a(aVar2, 0.0f);
                if (interfaceC3972m0.getIntValue() < Integer.MAX_VALUE) {
                    a11 = a11.l0(a0.n(aVar2, 0));
                }
                T textStyle = oziTextPreset.getTextStyle();
                u11.o(-2058934147);
                Object C12 = u11.C();
                if (C12 == InterfaceC3967k.a.a()) {
                    C12 = new OziTextBlockItemKt$MaxLinesParagraphTextBlock$annotatedText$1$1$2$1(interfaceC3972m0);
                    u11.x(C12);
                }
                u11.k();
                int i19 = i14 >> 9;
                int i21 = (i19 & 896) | (i19 & 112) | 196608 | (i19 & 7168);
                C3422b.a aVar3 = aVar;
                C3969l c3969l2 = u11;
                int i22 = size;
                u3.b(str, a11, j12, 0L, null, 0L, hVar, 0L, i11, z11, i15, 0, (Function1) C12, textStyle, c3969l2, (i14 & 896) | ((i14 << 18) & 1879048192), i21, 17912);
                aVar3.e(str);
                if (interfaceC3972m0.getIntValue() < Integer.MAX_VALUE) {
                    i17 -= interfaceC3972m0.getIntValue();
                }
                if (i18 < C7714v.P(list) && i17 >= 0) {
                    int g10 = aVar3.g(new C3440u(0, 0, oziTextPreset.getParagraphSpacing(), null, 507));
                    try {
                        Unit unit = Unit.f71690a;
                        if (i17 > 0) {
                            i16++;
                        }
                    } finally {
                        aVar3.f(g10);
                    }
                }
                i18++;
                j12 = j11;
                i15 = i12;
                size = i22;
                aVar = aVar3;
                u11 = c3969l2;
                list2 = list;
            }
            c3969l = u11;
            c3969l.k();
            C3422b i23 = aVar.i();
            c3969l.k();
            if (Intrinsics.d(oziTextPreset, OziTextPreset.H4.INSTANCE)) {
                i23 = C3424d.g(i23);
            }
            BasicTextKt.m3124BasicTextRqaf3u4(i23, eVar, j11, hVar, i11, z11, i16, function12, oziTextPreset.getTextStyle(), oziTextPreset.getPaddingValues(), c3969l, ((i14 << 3) & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (29360128 & i14), 0);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new OziTextBlockItemKt$MaxLinesParagraphTextBlock$1(eVar, list, j11, hVar, i11, z11, i12, function1, oziTextPreset, i13));
        }
    }

    /* renamed from: OziTextBlockItemImpl-jVGSiAQ, reason: not valid java name */
    public static final void m3133OziTextBlockItemImpljVGSiAQ(@NotNull e modifier, @NotNull String text, long j11, h hVar, int i11, boolean z11, int i12, @NotNull Function1<? super K, Unit> onTextLayout, @NotNull OziTextPreset preset, InterfaceC3967k interfaceC3967k, int i13) {
        h hVar2;
        int i14;
        Object obj;
        String str;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onTextLayout, "onTextLayout");
        Intrinsics.checkNotNullParameter(preset, "preset");
        C3969l u11 = interfaceC3967k.u(1455224806);
        int i15 = (i13 & 6) == 0 ? (u11.n(modifier) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i15 |= u11.n(text) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= u11.s(j11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 3072) == 0) {
            hVar2 = hVar;
            i15 |= u11.n(hVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            hVar2 = hVar;
        }
        if ((i13 & 24576) == 0) {
            i14 = i11;
            i15 |= u11.r(i14) ? 16384 : 8192;
        } else {
            i14 = i11;
        }
        if ((196608 & i13) == 0) {
            i15 |= u11.p(z11) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= u11.r(i12) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i15 |= u11.F(onTextLayout) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i15 |= u11.n(preset) ? 67108864 : 33554432;
        }
        if ((i15 & 38347923) == 38347922 && u11.b()) {
            u11.j();
        } else {
            long paragraphSpacing = preset.getParagraphSpacing();
            u11.o(-806499594);
            boolean s11 = ((i15 & 112) == 32) | u11.s(paragraphSpacing);
            Object C11 = u11.C();
            if (s11 || C11 == InterfaceC3967k.a.a()) {
                long paragraphSpacing2 = preset.getParagraphSpacing();
                long d11 = Hj0.T.d(0);
                Hj0.T.a(paragraphSpacing2, d11);
                if (Float.compare(u.e(paragraphSpacing2), u.e(d11)) > 0) {
                    List m11 = kotlin.text.h.m(text, new String[]{"\n"}, 0, 6);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : m11) {
                        if (((String) obj2).length() > 0) {
                            arrayList.add(obj2);
                        }
                    }
                    obj = arrayList;
                } else {
                    obj = null;
                }
                u11.x(obj);
            } else {
                obj = C11;
            }
            List list = (List) obj;
            u11.k();
            if (list == null || list.size() <= 1) {
                u11.o(769987047);
                if (preset.equals(OziTextPreset.H4.INSTANCE)) {
                    str = text.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
                } else {
                    str = text;
                }
                BasicTextKt.m3125BasicTextRqaf3u4(str, modifier, j11, hVar, i11, z11, i12, onTextLayout, preset.getTextStyle(), preset.getPaddingValues(), u11, ((i15 << 3) & 112) | (i15 & 896) | (i15 & 7168) | (i15 & 57344) | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128), 0);
                u11.k();
            } else {
                u11.o(768613468);
                if (i12 == Integer.MAX_VALUE) {
                    u11.o(768640035);
                    C3422b.a aVar = new C3422b.a();
                    int size = list.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        aVar.e((String) list.get(i16));
                        if (i16 < C7714v.P(list)) {
                            int g10 = aVar.g(new C3440u(0, 0, preset.getParagraphSpacing(), null, 507));
                            try {
                                Unit unit = Unit.f71690a;
                            } finally {
                                aVar.f(g10);
                            }
                        }
                    }
                    C3422b i17 = aVar.i();
                    if (preset.equals(OziTextPreset.H4.INSTANCE)) {
                        i17 = C3424d.g(i17);
                    }
                    BasicTextKt.m3124BasicTextRqaf3u4(i17, modifier, j11, hVar2, i14, z11, i12, onTextLayout, preset.getTextStyle(), preset.getPaddingValues(), u11, ((i15 << 3) & 112) | (i15 & 896) | (i15 & 7168) | (i15 & 57344) | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128), 0);
                    u11.k();
                } else {
                    u11.o(769575243);
                    m3132MaxLinesParagraphTextBlockjVGSiAQ(modifier, list, j11, hVar, i11, z11, i12, onTextLayout, preset, u11, 268435342 & i15);
                    u11 = u11;
                    u11.k();
                }
                u11.k();
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new OziTextBlockItemKt$OziTextBlockItemImpl$1(modifier, text, j11, hVar, i11, z11, i12, onTextLayout, preset, i13));
        }
    }
}
