package ru.ozon.app.android.travel.utils.compose;

import Sc.o;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.compose.ItemVisibilityMode;
import v0.I;
import v0.InterfaceC10174n;
import v0.y;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\u001a5\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0014²\u0006\u0018\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\nX\u008a\u0084\u0002²\u0006\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/e;", "Lv0/I;", "listState", "Lru/ozon/app/android/travel/utils/compose/ItemVisibilityMode;", "mode", "Lkotlin/Function1;", "", "", "onItemVisible", "onLazyRowItemsBecameVisible", "(Landroidx/compose/ui/e;Lv0/I;Lru/ozon/app/android/travel/utils/compose/ItemVisibilityMode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;", "Lv0/n;", "Lv0/y;", "layoutInfo", "", "matchesVisibility", "(Lv0/n;Lv0/y;Lru/ozon/app/android/travel/utils/compose/ItemVisibilityMode;)Z", "latestCallback", "", "previousVisibleIndexes", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LazyRawItemsVisibilityObserverKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean matchesVisibility(InterfaceC10174n interfaceC10174n, y yVar, ItemVisibilityMode itemVisibilityMode) {
        int min = Math.min(interfaceC10174n.getSize() + interfaceC10174n.getOffset(), yVar.h()) - Math.max(interfaceC10174n.getOffset(), yVar.f());
        if (min < 0) {
            min = 0;
        }
        if (interfaceC10174n.getSize() > 0) {
            if (Intrinsics.d(itemVisibilityMode, ItemVisibilityMode.OnePixel.INSTANCE)) {
                if (min > 0) {
                    return true;
                }
            } else if (itemVisibilityMode instanceof ItemVisibilityMode.Percent) {
                if (min / interfaceC10174n.getSize() >= ((ItemVisibilityMode.Percent) itemVisibilityMode).getPercent() / 100.0f) {
                    return true;
                }
            } else {
                if (!Intrinsics.d(itemVisibilityMode, ItemVisibilityMode.FullyVisible.INSTANCE)) {
                    throw new o();
                }
                if (min >= interfaceC10174n.getSize()) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public static final e onLazyRowItemsBecameVisible(@NotNull e eVar, @NotNull I listState, @NotNull ItemVisibilityMode mode, @NotNull Function1<? super Integer, Unit> onItemVisible) {
        e b11;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(listState, "listState");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(onItemVisible, "onItemVisible");
        b11 = c.b(eVar, C5236c1.a(), new LazyRawItemsVisibilityObserverKt$onLazyRowItemsBecameVisible$1(onItemVisible, listState, mode));
        return b11;
    }
}
