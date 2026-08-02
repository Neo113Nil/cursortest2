package ru.ozon.app.android.regulardraw.ui;

import J0.u3;
import K1.C3422b;
import K1.T;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import V1.h;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.html.SpannedAnnotateConvertorKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/atoms/data/text/TextDTO;", "dto", "LK1/T;", "textStyle", "Landroidx/compose/ui/e;", "modifier", "", "CustomTextAtom", "(Lru/ozon/uni/atoms/data/text/TextDTO;LK1/T;Landroidx/compose/ui/e;LS0/k;II)V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CustomTextAtomKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextDTO.TextAlignment.values().length];
            try {
                iArr[TextDTO.TextAlignment.LEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextDTO.TextAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextDTO.TextAlignment.TRAILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CustomTextAtom(@NotNull TextDTO dto, @NotNull T textStyle, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        h hVar;
        C3969l c3969l;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        C3969l u11 = interfaceC3967k.u(1388169336);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(textStyle) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i13 & 147) == 146 || !u11.b()) {
                e eVar4 = i15 == 0 ? e.f40358c0 : eVar2;
                C3422b m1836toAnnotateStringiJQMabo = SpannedAnnotateConvertorKt.m1836toAnnotateStringiJQMabo(dto.getText(), 0L, u11, OzonSpannableString.$stable, 1);
                C7807Z c7807z = TokenParserKt.tokenToColor(dto.getTextColor(), u11, 0);
                long w11 = c7807z == null ? c7807z.w() : C7807Z.f72259m;
                Integer maxLines = dto.getMaxLines();
                int intValue = maxLines == null ? maxLines.intValue() : Integer.MAX_VALUE;
                TextDTO.TextAlignment textAlignment = dto.getTextAlignment();
                i14 = textAlignment != null ? -1 : WhenMappings.$EnumSwitchMapping$0[textAlignment.ordinal()];
                if (i14 != -1) {
                    hVar = null;
                } else if (i14 == 1) {
                    hVar = h.a(5);
                } else if (i14 == 2) {
                    hVar = h.a(3);
                } else {
                    if (i14 != 3) {
                        throw new o();
                    }
                    hVar = h.a(6);
                }
                int i16 = (i13 >> 3) & 112;
                int i17 = ((i13 << 18) & 29360128) | 48;
                c3969l = u11;
                eVar3 = eVar4;
                u3.c(m1836toAnnotateStringiJQMabo, eVar3, w11, 0L, 0L, hVar, 0L, 2, false, intValue, 0, null, null, textStyle, c3969l, i16, i17, 120312);
            } else {
                u11.j();
                eVar3 = eVar2;
                c3969l = u11;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new CustomTextAtomKt$CustomTextAtom$1(dto, textStyle, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 147) == 146) {
        }
        if (i15 == 0) {
        }
        C3422b m1836toAnnotateStringiJQMabo2 = SpannedAnnotateConvertorKt.m1836toAnnotateStringiJQMabo(dto.getText(), 0L, u11, OzonSpannableString.$stable, 1);
        C7807Z c7807z2 = TokenParserKt.tokenToColor(dto.getTextColor(), u11, 0);
        if (c7807z2 == null) {
        }
        Integer maxLines2 = dto.getMaxLines();
        int intValue2 = maxLines2 == null ? maxLines2.intValue() : Integer.MAX_VALUE;
        TextDTO.TextAlignment textAlignment2 = dto.getTextAlignment();
        if (textAlignment2 != null) {
        }
        if (i14 != -1) {
        }
        int i162 = (i13 >> 3) & 112;
        int i172 = ((i13 << 18) & 29360128) | 48;
        c3969l = u11;
        eVar3 = eVar4;
        u3.c(m1836toAnnotateStringiJQMabo2, eVar3, w11, 0L, 0L, hVar, 0L, 2, false, intValue2, 0, null, null, textStyle, c3969l, i162, i172, 120312);
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }
}
