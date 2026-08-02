package ru.ozon.uni.ozi.components.navBar.addons;

import D1.InterfaceC2801g;
import J0.P;
import J0.u3;
import K1.T;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import V1.h;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.uni.core.compose.tokens.UniPaddings;
import ru.ozon.uni.core.compose.tokens.UniRadii;
import ru.ozon.uni.core.compose.tokens.UniResourceIcons;
import ru.ozon.uni.ozi.components.navBar.OziNavBarTestTags;
import ru.ozon.uni.ozi.components.navBar.presets.OziNavBarTextAlignment;
import ru.ozon.uni.ozi.theme.OziTheme;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OziNavBarTopCenterScope$TitleSubtitle$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ OziNavBarTextAlignment $alignment;
    final /* synthetic */ e $modifier;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ int $subtitleLinesLimit;
    final /* synthetic */ String $title;
    final /* synthetic */ int $titleLinesLimit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziNavBarTopCenterScope$TitleSubtitle$1(e eVar, OziNavBarTextAlignment oziNavBarTextAlignment, String str, int i11, String str2, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$alignment = oziNavBarTextAlignment;
        this.$title = str;
        this.$titleLinesLimit = i11;
        this.$subtitle = str2;
        this.$subtitleLinesLimit = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        e eVar = this.$modifier;
        InterfaceC6250b.InterfaceC0966b contentAlignment$uni_release = this.$alignment.contentAlignment$uni_release();
        OziNavBarTextAlignment oziNavBarTextAlignment = this.$alignment;
        String str = this.$title;
        int i12 = this.$titleLinesLimit;
        String str2 = this.$subtitle;
        int i13 = this.$subtitleLinesLimit;
        C5194q a11 = C5193p.a(C5179b.g(), contentAlignment$uni_release, interfaceC3967k, 0);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f7 = c.f(interfaceC3967k, eVar);
        InterfaceC2801g.f5440U.getClass();
        Function0 a12 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a12);
        } else {
            interfaceC3967k.e();
        }
        Function2 c11 = P.c(interfaceC3967k, a11, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            a.d(c11, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f7, InterfaceC2801g.a.f());
        e.a aVar = e.f40358c0;
        e oziTestTag = OziTestTagsKt.oziTestTag(aVar, OziNavBarTestTags.TopTitle, null, interfaceC3967k, 54, 2);
        OziTheme oziTheme = OziTheme.INSTANCE;
        T compactControl500 = oziTheme.getTypography().getCompactControl500();
        int i14 = UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable;
        u3.b(str, oziTestTag, oziTheme.getColors(interfaceC3967k, i14).getTextPrimary(), 0L, null, 0L, h.a(oziNavBarTextAlignment.m3119textAlignmente0LSkKk$uni_release()), 0L, 2, false, i12, 0, null, compactControl500, interfaceC3967k, 0, 48, 54776);
        interfaceC3967k.o(1688905564);
        if (str2 != null) {
            u3.b(str2, OziTestTagsKt.oziTestTag(aVar, OziNavBarTestTags.TopSubtitle, null, interfaceC3967k, 54, 2), oziTheme.getColors(interfaceC3967k, i14).getTextTertiaryTransparent(), 0L, null, 0L, h.a(oziNavBarTextAlignment.m3119textAlignmente0LSkKk$uni_release()), 0L, 2, false, i13, 0, null, oziTheme.getTypography().getCompact400(), interfaceC3967k, 0, 48, 54776);
        }
        interfaceC3967k.k();
        interfaceC3967k.f();
    }
}
