package ru.ozon.uni.ozi.components.text;

import G1.i;
import K1.K;
import R1.c;
import R1.d;
import S0.InterfaceC3967k;
import V1.h;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$string;
import ru.ozon.uni.core.compose.tokens.UniPaddings;
import ru.ozon.uni.core.compose.tokens.UniRadii;
import ru.ozon.uni.core.compose.tokens.UniResourceIcons;
import ru.ozon.uni.ozi.components.text.presets.OziTextPreset;
import ru.ozon.uni.ozi.theme.OziTheme;

@Metadata(d1 = {"\u0000L\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u00ad\u0001\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0003\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"", "text", "Landroidx/compose/ui/e;", "modifier", "", "isExpanded", "expandText", "Lkotlin/Function0;", "", "onExpand", "Ll1/Z;", "color", "expandBackgroundColor", "expandTextColor", "LV1/h;", "textAlign", "LV1/r;", "overflow", "softWrap", "", "maxLines", "Lkotlin/Function1;", "LK1/K;", "onTextLayout", "Lru/ozon/uni/ozi/components/text/presets/OziTextPreset;", "preset", "OziExpandableTextBlockItem-wq0B-h8", "(Ljava/lang/String;Landroidx/compose/ui/e;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;JJJLV1/h;IZILkotlin/jvm/functions/Function1;Lru/ozon/uni/ozi/components/text/presets/OziTextPreset;LS0/k;III)V", "OziExpandableTextBlockItem", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziExpandableTextKt {
    /* renamed from: OziExpandableTextBlockItem-wq0B-h8, reason: not valid java name */
    public static final void m3131OziExpandableTextBlockItemwq0Bh8(@NotNull String str, e eVar, boolean z11, String str2, Function0<Unit> function0, long j11, long j12, long j13, h hVar, int i11, boolean z12, int i12, Function1<? super K, Unit> function1, OziTextPreset oziTextPreset, InterfaceC3967k interfaceC3967k, int i13, int i14, int i15) {
        Function0<Unit> function02;
        e eVar2;
        Function1<? super K, Unit> function12;
        String text = str;
        Intrinsics.checkNotNullParameter(text, "text");
        interfaceC3967k.o(-411912939);
        e eVar3 = (i15 & 2) != 0 ? e.f40358c0 : eVar;
        boolean z13 = (i15 & 4) != 0 ? false : z11;
        String a11 = (i15 & 8) != 0 ? i.a(interfaceC3967k, R$string.ds_more) : str2;
        if ((i15 & 16) != 0) {
            interfaceC3967k.o(-1708035596);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = OziExpandableTextKt$OziExpandableTextBlockItem$1$1.INSTANCE;
                interfaceC3967k.x(C11);
            }
            function02 = (Function0) C11;
            interfaceC3967k.k();
        } else {
            function02 = function0;
        }
        long j14 = (i15 & 32) != 0 ? C7807Z.f72259m : j11;
        long layerFloor1 = (i15 & 64) != 0 ? OziTheme.INSTANCE.getColors(interfaceC3967k, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getLayerFloor1() : j12;
        long textTertiaryTransparent = (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? OziTheme.INSTANCE.getColors(interfaceC3967k, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getTextTertiaryTransparent() : j13;
        h hVar2 = (i15 & 256) != 0 ? null : hVar;
        int i16 = (i15 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? i11 : 2;
        boolean z14 = (i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? true : z12;
        int i17 = i16;
        int i18 = (i15 & 2048) != 0 ? 3 : i12;
        if ((i15 & 4096) != 0) {
            interfaceC3967k.o(-1708023341);
            Object C12 = interfaceC3967k.C();
            eVar2 = eVar3;
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = OziExpandableTextKt$OziExpandableTextBlockItem$2$1.INSTANCE;
                interfaceC3967k.x(C12);
            }
            function12 = (Function1) C12;
            interfaceC3967k.k();
        } else {
            eVar2 = eVar3;
            function12 = function1;
        }
        OziTextPreset oziTextPreset2 = (i15 & 8192) != 0 ? OziTextPreset.Paragraph.INSTANCE : oziTextPreset;
        if (Intrinsics.d(oziTextPreset2, OziTextPreset.H4.INSTANCE)) {
            int i19 = c.f24234d;
            c a12 = d.a().a();
            text = text.toUpperCase((a12.isEmpty() ? d.a().a().c() : a12.c()).a());
            Intrinsics.checkNotNullExpressionValue(text, "this as java.lang.String).toUpperCase(locale)");
        }
        boolean z15 = z14;
        Function1<? super K, Unit> function13 = function12;
        OziExpandableTextBlockItemImplKt.m3126OziExpandableTextBlockItemImplffHtLjE(text, eVar2, z13, a11, function02, j14, layerFloor1, textTertiaryTransparent, hVar2, i17, z15, i18, function13, oziTextPreset2, interfaceC3967k, i13 & 2147483632, i14 & 8190);
        interfaceC3967k.k();
    }
}
