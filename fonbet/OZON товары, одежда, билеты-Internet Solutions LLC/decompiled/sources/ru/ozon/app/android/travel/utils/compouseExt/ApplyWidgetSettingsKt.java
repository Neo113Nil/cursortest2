package ru.ozon.app.android.travel.utils.compouseExt;

import A0.g;
import A0.h;
import S0.InterfaceC3967k;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ag\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/e;", "", "backgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "topRadius", "bottomRadius", "Lru/ozon/uni/atoms/data/common/Paddings;", "leftPadding", "rightPadding", "topPadding", "bottomPadding", "applySettings", "(Landroidx/compose/ui/e;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;LS0/k;II)Landroidx/compose/ui/e;", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ApplyWidgetSettingsKt {
    @NotNull
    public static final e applySettings(@NotNull e eVar, String str, CornerRadius cornerRadius, CornerRadius cornerRadius2, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        interfaceC3967k.o(-1433986541);
        if ((i12 & 1) != 0) {
            str = null;
        }
        if ((i12 & 2) != 0) {
            cornerRadius = null;
        }
        if ((i12 & 4) != 0) {
            cornerRadius2 = null;
        }
        if ((i12 & 8) != 0) {
            paddings = null;
        }
        if ((i12 & 16) != 0) {
            paddings2 = null;
        }
        if ((i12 & 32) != 0) {
            paddings3 = null;
        }
        if ((i12 & 64) != 0) {
            paddings4 = null;
        }
        Context context = (Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d());
        int i13 = ((Configuration) interfaceC3967k.m(AndroidCompositionLocals_androidKt.c())).uiMode;
        interfaceC3967k.o(873752687);
        boolean z11 = true;
        boolean r11 = interfaceC3967k.r(i13) | ((((i11 & 112) ^ 48) > 32 && interfaceC3967k.n(str)) || (i11 & 48) == 32);
        Object C11 = interfaceC3967k.C();
        if (r11 || C11 == InterfaceC3967k.a.a()) {
            C11 = C7807Z.m(C7811b0.b(StyleParser.INSTANCE.parseColor(context, str, UniColors.CLEAR_LIGHT_KEY_0.getResId())));
            interfaceC3967k.x(C11);
        }
        long w11 = ((C7807Z) C11).w();
        interfaceC3967k.k();
        interfaceC3967k.o(873761408);
        boolean z12 = (((i11 & 896) ^ 384) > 256 && interfaceC3967k.n(cornerRadius)) || (i11 & 384) == 256;
        if ((((i11 & 7168) ^ 3072) <= 2048 || !interfaceC3967k.n(cornerRadius2)) && (i11 & 3072) != 2048) {
            z11 = false;
        }
        boolean z13 = z12 | z11;
        Object C12 = interfaceC3967k.C();
        if (z13 || C12 == InterfaceC3967k.a.a()) {
            C12 = h.c(cornerRadius != null ? cornerRadius.m1866getDpD9Ej5fM() : 0, cornerRadius != null ? cornerRadius.m1866getDpD9Ej5fM() : 0, cornerRadius2 != null ? cornerRadius2.m1866getDpD9Ej5fM() : 0, cornerRadius2 != null ? cornerRadius2.m1866getDpD9Ej5fM() : 0);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        e i14 = T.i(androidx.compose.foundation.e.b(eVar, w11, (g) C12), paddings != null ? paddings.m1867getDpD9Ej5fM() : 0, paddings3 != null ? paddings3.m1867getDpD9Ej5fM() : 0, paddings2 != null ? paddings2.m1867getDpD9Ej5fM() : 0, paddings4 != null ? paddings4.m1867getDpD9Ej5fM() : 0);
        interfaceC3967k.k();
        return i14;
    }
}
