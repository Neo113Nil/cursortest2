package ru.ozon.app.android.pikazon.placeholdertracker;

import Lm0.a;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderVisibilityChecker;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderVisibilityChecker;", "", "Landroid/view/View;", "rootView", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderAreaVisibilityChecker;", "areaVisibilityChecker", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderInfoPool;", "placeholderInfoPool", "<init>", "(Landroid/view/View;Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderAreaVisibilityChecker;Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderInfoPool;)V", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderInfo;", "placeholderInfo", "", "getMaxPlaceholderVisibilityDuration", "(Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderInfo;)J", "getLastPlaceholderVisibilityDuration", "", "checkPlaceholdersVisibility", "()V", "view", "checkPlaceholderVisibility", "(Landroid/view/View;Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderInfo;)V", "", "minVisiblePercentageViewed", "", "addView", "(Landroid/view/View;Ljava/lang/Float;)Z", "removeView", "(Landroid/view/View;)V", "mediaLoadingFinished", "(Landroid/view/View;)J", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderAreaVisibilityChecker;", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderInfoPool;", "", "trackedViews", "Ljava/util/Map;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "onScrollChangedListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Companion", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlaceholderVisibilityChecker {

    @NotNull
    private final PlaceholderAreaVisibilityChecker areaVisibilityChecker;

    @NotNull
    private final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;

    @NotNull
    private final PlaceholderInfoPool placeholderInfoPool;

    @NotNull
    private final Map<View, PlaceholderInfo> trackedViews;

    public PlaceholderVisibilityChecker(@NotNull View rootView, @NotNull PlaceholderAreaVisibilityChecker areaVisibilityChecker, @NotNull PlaceholderInfoPool placeholderInfoPool) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(areaVisibilityChecker, "areaVisibilityChecker");
        Intrinsics.checkNotNullParameter(placeholderInfoPool, "placeholderInfoPool");
        this.areaVisibilityChecker = areaVisibilityChecker;
        this.placeholderInfoPool = placeholderInfoPool;
        this.trackedViews = new WeakHashMap();
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: xF.a
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                PlaceholderVisibilityChecker.this.checkPlaceholdersVisibility();
            }
        };
        this.onScrollChangedListener = onScrollChangedListener;
        ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
        Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "getViewTreeObserver(...)");
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
        } else {
            a.f17149a.d("Placeholder visibility tracker was unable to track views because the root view tree observer was not alive", new Object[0]);
        }
    }

    public static /* synthetic */ boolean addView$default(PlaceholderVisibilityChecker placeholderVisibilityChecker, View view, Float f7, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f7 = Float.valueOf(0.15f);
        }
        return placeholderVisibilityChecker.addView(view, f7);
    }

    private final void checkPlaceholderVisibility(View view, PlaceholderInfo placeholderInfo) {
        if (this.areaVisibilityChecker.isVisible(view, placeholderInfo)) {
            if (placeholderInfo.getViewStartVisibleTime() <= 0) {
                placeholderInfo.setViewStartVisibleTime(SystemClock.elapsedRealtime());
            }
        } else if (placeholderInfo.getViewStartVisibleTime() > 0) {
            long lastPlaceholderVisibilityDuration = getLastPlaceholderVisibilityDuration(placeholderInfo);
            if (lastPlaceholderVisibilityDuration > placeholderInfo.getMaxPlaceholderVisibilityDuration()) {
                placeholderInfo.setMaxPlaceholderVisibilityDuration(lastPlaceholderVisibilityDuration);
            }
            placeholderInfo.setViewStartVisibleTime(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkPlaceholdersVisibility() {
        for (Map.Entry<View, PlaceholderInfo> entry : this.trackedViews.entrySet()) {
            checkPlaceholderVisibility(entry.getKey(), entry.getValue());
        }
    }

    private final long getLastPlaceholderVisibilityDuration(PlaceholderInfo placeholderInfo) {
        if (placeholderInfo.getViewStartVisibleTime() > 0) {
            return SystemClock.elapsedRealtime() - placeholderInfo.getViewStartVisibleTime();
        }
        return 0L;
    }

    private final long getMaxPlaceholderVisibilityDuration(PlaceholderInfo placeholderInfo) {
        return Math.max(getLastPlaceholderVisibilityDuration(placeholderInfo), placeholderInfo.getMaxPlaceholderVisibilityDuration());
    }

    public final boolean addView(@NotNull View view, Float minVisiblePercentageViewed) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.trackedViews.size() >= 100) {
            a.f17149a.d("Tracked views limit is exceeded (max = 100). Remove unnecessary previous views before adding new.", new Object[0]);
            return false;
        }
        if (minVisiblePercentageViewed != null && (minVisiblePercentageViewed.floatValue() <= 0.0f || minVisiblePercentageViewed.floatValue() > 1.0f)) {
            throw new IllegalArgumentException("Min visible percentage viewed must be in range (0; 1]");
        }
        Map<View, PlaceholderInfo> map = this.trackedViews;
        PlaceholderInfo placeholderInfo = map.get(view);
        if (placeholderInfo == null) {
            placeholderInfo = this.placeholderInfoPool.get();
            if (placeholderInfo == null) {
                placeholderInfo = new PlaceholderInfo();
            }
            map.put(view, placeholderInfo);
        }
        PlaceholderInfo placeholderInfo2 = placeholderInfo;
        placeholderInfo2.clear();
        placeholderInfo2.setMinVisiblePercentageViewed(minVisiblePercentageViewed);
        checkPlaceholderVisibility(view, placeholderInfo2);
        return true;
    }

    public final long mediaLoadingFinished(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        PlaceholderInfo placeholderInfo = this.trackedViews.get(view);
        if (placeholderInfo == null) {
            return 0L;
        }
        long maxPlaceholderVisibilityDuration = getMaxPlaceholderVisibilityDuration(placeholderInfo);
        removeView(view);
        return maxPlaceholderVisibilityDuration;
    }

    public final void removeView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        PlaceholderInfo remove = this.trackedViews.remove(view);
        if (remove != null) {
            this.placeholderInfoPool.put(remove);
        }
    }
}
