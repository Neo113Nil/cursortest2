package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.scroll;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogTabsScrollState;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/scroll/CatalogueTabsScrollController;", "", "<init>", "()V", "", "isSticky", "Ljava/lang/ref/WeakReference;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/scroll/CatalogTabsScrollEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "registerTabsScrollListener", "(ZLjava/lang/ref/WeakReference;)V", "", "position", "offset", "forceScrollToPosition", "(II)V", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsScrollState;", "scrollState", "sendScrollState", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsScrollState;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "", "listeners", "Ljava/util/Map;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogueTabsScrollController {

    @NotNull
    public static final CatalogueTabsScrollController INSTANCE = new CatalogueTabsScrollController();

    @NotNull
    private static final Map<String, WeakReference<CatalogTabsScrollEventListener>> listeners = new LinkedHashMap();

    private CatalogueTabsScrollController() {
    }

    public void forceScrollToPosition(int position, int offset) {
        CatalogTabsScrollEventListener catalogTabsScrollEventListener;
        WeakReference<CatalogTabsScrollEventListener> weakReference = listeners.get("sticky_listener");
        if (weakReference == null || (catalogTabsScrollEventListener = weakReference.get()) == null) {
            return;
        }
        catalogTabsScrollEventListener.immediateScrollToPositionWithOffset(position, offset);
    }

    public void registerTabsScrollListener(boolean isSticky, @NotNull WeakReference<CatalogTabsScrollEventListener> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.put(isSticky ? "sticky_listener" : "non_sticky_listener", listener);
    }

    public Object sendScrollState(@NotNull CatalogTabsScrollState catalogTabsScrollState, @NotNull d<? super Unit> dVar) {
        WeakReference<CatalogTabsScrollEventListener> weakReference;
        CatalogTabsScrollEventListener catalogTabsScrollEventListener;
        CatalogTabsScrollEventListener catalogTabsScrollEventListener2;
        CatalogTabsScrollEventListener catalogTabsScrollEventListener3;
        if (catalogTabsScrollState instanceof CatalogTabsScrollState.TransformScrolling) {
            Map<String, WeakReference<CatalogTabsScrollEventListener>> map = listeners;
            WeakReference<CatalogTabsScrollEventListener> weakReference2 = map.get("sticky_listener");
            if (weakReference2 != null && (catalogTabsScrollEventListener3 = weakReference2.get()) != null) {
                catalogTabsScrollEventListener3.immediateScrollToPositionWithOffset(catalogTabsScrollState.getFinalTab(), ((CatalogTabsScrollState.TransformScrolling) catalogTabsScrollState).getOffset());
            }
            WeakReference<CatalogTabsScrollEventListener> weakReference3 = map.get("non_sticky_listener");
            if (weakReference3 != null && (catalogTabsScrollEventListener2 = weakReference3.get()) != null) {
                catalogTabsScrollEventListener2.immediateScrollToPositionWithOffset(catalogTabsScrollState.getFinalTab(), ((CatalogTabsScrollState.TransformScrolling) catalogTabsScrollState).getOffset());
            }
        } else if ((catalogTabsScrollState instanceof CatalogTabsScrollState.OrdinaryScrolling) && (weakReference = listeners.get("sticky_listener")) != null && (catalogTabsScrollEventListener = weakReference.get()) != null) {
            catalogTabsScrollEventListener.smoothScrollToPositionWithOffset(catalogTabsScrollState.getFinalTab(), ((CatalogTabsScrollState.OrdinaryScrolling) catalogTabsScrollState).getOffset(), new CatalogueTabsScrollController$sendScrollState$2(catalogTabsScrollState));
        }
        return Unit.f71690a;
    }
}
