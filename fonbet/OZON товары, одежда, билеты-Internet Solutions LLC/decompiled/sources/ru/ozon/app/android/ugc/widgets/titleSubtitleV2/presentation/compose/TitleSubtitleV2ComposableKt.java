package ru.ozon.app.android.ugc.widgets.titleSubtitleV2.presentation.compose;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.c;
import androidx.compose.foundation.layout.B;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.titleSubtitleV2.presentation.TitleSubtitleVO;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/presentation/TitleSubtitleVO;", "item", "", "TitleSubtitleComposable", "(Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/presentation/TitleSubtitleVO;LS0/k;I)V", "LZ1/h;", "horizontalMargin", "F", "titleSubtitleMargin", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TitleSubtitleV2ComposableKt {
    private static final float horizontalMargin;
    private static final float titleSubtitleMargin;

    static {
        UniTheme uniTheme = UniTheme.INSTANCE;
        horizontalMargin = uniTheme.getPaddings().getPadding300();
        titleSubtitleMargin = uniTheme.getPaddings().getPadding200();
    }

    public static final void TitleSubtitleComposable(@NotNull TitleSubtitleVO item, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(item, "item");
        C3969l u11 = interfaceC3967k.u(792030196);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            e h11 = T.h(a0.e(e.f40358c0, 1.0f), horizontalMargin, 0.0f, 2);
            int i13 = C5179b.f39454h;
            B.a(h11, C5179b.o(titleSubtitleMargin, item.getComposeAlignment()), C5179b.b(), 2, 0, null, c.c(-1488183143, new TitleSubtitleV2ComposableKt$TitleSubtitleComposable$1(item), u11), u11, 1576326, 48);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TitleSubtitleV2ComposableKt$TitleSubtitleComposable$2(item, i11));
        }
    }
}
