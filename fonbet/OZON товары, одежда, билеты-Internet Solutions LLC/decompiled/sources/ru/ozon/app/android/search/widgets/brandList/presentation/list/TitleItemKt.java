package ru.ozon.app.android.search.widgets.brandList.presentation.list;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.brandList.presentation.models.TitleCell;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/search/widgets/brandList/presentation/models/TitleCell;", "item", "", "TitleItem", "(Lru/ozon/app/android/search/widgets/brandList/presentation/models/TitleCell;LS0/k;I)V", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TitleItemKt {
    public static final void TitleItem(@NotNull TitleCell item, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(item, "item");
        C3969l u11 = interfaceC3967k.u(-443266935);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            TextDTO title = item.getTitle();
            if (title != null) {
                DsTextAtomKt.DsTextAtom(title, a0.e(e.f40358c0, 1.0f), u11, 48, 0);
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TitleItemKt$TitleItem$2(item, i11));
        }
    }
}
