package ru.ozon.app.android.account.orders.emptyscreen.internalteeth;

import android.content.Context;
import j10.h;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorVO;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.app.android.cscore.extendBackground.presentation.ExtendBackgroundVO;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\t\u001a\u00020\b*\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lj10/h$a;", "Lru/ozon/composer/ui/widget/l;", "", "hasNavbar", "(Lj10/h$a;)Z", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorVO;", "item", "", "bind", "(Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorVO;)V", "cs-orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InternalTeethViewHolderKt {
    public static final void bind(@NotNull IslandSeparatorView islandSeparatorView, IslandSeparatorVO islandSeparatorVO) {
        Intrinsics.checkNotNullParameter(islandSeparatorView, "<this>");
        if (islandSeparatorVO == null) {
            islandSeparatorView.setVisibility(8);
            return;
        }
        islandSeparatorView.setVisibility(0);
        int physicalPartHeight = islandSeparatorVO.getPhysicalPartHeight();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = islandSeparatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        islandSeparatorView.setViewState(new IslandSeparatorView.ViewState(islandSeparatorVO.getHasTopCorners(), islandSeparatorVO.getHasBottomCorners(), physicalPartHeight, styleParser.parseColor(context, islandSeparatorVO.getBackgroundColor(), UniColors.BG_PRIMARY.getResId())));
    }

    public static final boolean hasNavbar(@NotNull h.a<l> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        List<l> c11 = aVar.c();
        Object obj = null;
        if (c11 != null) {
            Iterator<T> it = c11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!(((l) next).i().c() instanceof ExtendBackgroundVO)) {
                    obj = next;
                    break;
                }
            }
            obj = (l) obj;
        }
        return obj != null;
    }
}
