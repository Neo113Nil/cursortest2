package ru.ozon.app.android.cart.cartSplitV2.v2.util.extensions;

import UZ.a;
import WZ.d;
import WZ.e;
import WZ.g;
import WZ.l;
import WZ.t;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.extensions.SwipeAnalyticsExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a7\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\n\u0010\t\u001a7\u0010\u000b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\t\u001aI\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u0003*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u00032\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LWZ/l;", "LWZ/t;", "event", "", "", "", "params", "", "processEventsSwipeView", "(LWZ/l;LWZ/t;Ljava/util/Map;)Lkotlin/Unit;", "processEventsSwipePreRemove", "processEventsSwipeRemove", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "swipeTracking", "", "isFavorite", "replaceToSwipeFavoriteClickTracking", "(Ljava/util/Map;Ljava/util/Map;Z)Ljava/util/Map;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SwipeAnalyticsExtKt {
    public static final Unit processEventsSwipePreRemove(@NotNull l lVar, t tVar, final Map<String, Integer> map) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (tVar == null) {
            return null;
        }
        lVar.f(tVar, new d(SwipeAnalyticsExtKt$processEventsSwipePreRemove$1$1.INSTANCE), new e() { // from class: sn.c
            @Override // WZ.e
            public final g modifyParams(UZ.a aVar, g gVar) {
                g processEventsSwipePreRemove$lambda$3$lambda$2;
                processEventsSwipePreRemove$lambda$3$lambda$2 = SwipeAnalyticsExtKt.processEventsSwipePreRemove$lambda$3$lambda$2(map, (UZ.d) aVar, gVar);
                return processEventsSwipePreRemove$lambda$3$lambda$2;
            }
        });
        return Unit.f71690a;
    }

    public static /* synthetic */ Unit processEventsSwipePreRemove$default(l lVar, t tVar, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        return processEventsSwipePreRemove(lVar, tVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g processEventsSwipePreRemove$lambda$3$lambda$2(Map map, a aVar, g customParams) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(customParams, "customParams");
        return g.a(customParams, map, null, 2);
    }

    public static final Unit processEventsSwipeRemove(@NotNull l lVar, t tVar, final Map<String, Integer> map) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (tVar == null) {
            return null;
        }
        lVar.f(tVar, new d(SwipeAnalyticsExtKt$processEventsSwipeRemove$1$1.INSTANCE), new e() { // from class: sn.a
            @Override // WZ.e
            public final g modifyParams(UZ.a aVar, g gVar) {
                g processEventsSwipeRemove$lambda$5$lambda$4;
                processEventsSwipeRemove$lambda$5$lambda$4 = SwipeAnalyticsExtKt.processEventsSwipeRemove$lambda$5$lambda$4(map, (UZ.d) aVar, gVar);
                return processEventsSwipeRemove$lambda$5$lambda$4;
            }
        });
        return Unit.f71690a;
    }

    public static /* synthetic */ Unit processEventsSwipeRemove$default(l lVar, t tVar, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        return processEventsSwipeRemove(lVar, tVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g processEventsSwipeRemove$lambda$5$lambda$4(Map map, a aVar, g customParams) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(customParams, "customParams");
        return g.a(customParams, map, null, 2);
    }

    public static final Unit processEventsSwipeView(@NotNull l lVar, t tVar, final Map<String, Integer> map) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (tVar == null) {
            return null;
        }
        lVar.f(tVar, new d(SwipeAnalyticsExtKt$processEventsSwipeView$1$1.INSTANCE), new e() { // from class: sn.b
            @Override // WZ.e
            public final g modifyParams(UZ.a aVar, g gVar) {
                g processEventsSwipeView$lambda$1$lambda$0;
                processEventsSwipeView$lambda$1$lambda$0 = SwipeAnalyticsExtKt.processEventsSwipeView$lambda$1$lambda$0(map, (UZ.d) aVar, gVar);
                return processEventsSwipeView$lambda$1$lambda$0;
            }
        });
        return Unit.f71690a;
    }

    public static /* synthetic */ Unit processEventsSwipeView$default(l lVar, t tVar, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        return processEventsSwipeView(lVar, tVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g processEventsSwipeView$lambda$1$lambda$0(Map map, a aVar, g customParams) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(customParams, "customParams");
        return g.a(customParams, map, null, 2);
    }

    @NotNull
    public static final Map<String, TokenizedTrackingInfo> replaceToSwipeFavoriteClickTracking(@NotNull Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, boolean z11) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        TokenizedTrackingInfo tokenizedTrackingInfo = map2 != null ? map2.get(z11 ? "swipe_favorite" : "swipe_unfavorite") : null;
        if (tokenizedTrackingInfo == null || !map.containsKey("click")) {
            return map;
        }
        LinkedHashMap u11 = U.u(map);
        u11.put("click", tokenizedTrackingInfo);
        return u11;
    }
}
