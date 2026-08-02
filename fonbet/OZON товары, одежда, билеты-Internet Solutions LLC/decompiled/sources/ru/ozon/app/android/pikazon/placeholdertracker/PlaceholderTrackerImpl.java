package ru.ozon.app.android.pikazon.placeholdertracker;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0011\u0010\u001f\u001a\u0004\u0018\u00010\n*\u0004\u0018\u00010 H\u0082\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderTrackerImpl;", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderTracker;", "placeholderAreaVisibilityChecker", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderAreaVisibilityChecker;", "placeholderInfoPool", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderInfoPool;", "<init>", "(Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderAreaVisibilityChecker;Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderInfoPool;)V", "checkers", "Ljava/util/WeakHashMap;", "Landroid/app/Activity;", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderVisibilityChecker;", "trackingInfoById", "Ljava/util/HashMap;", "", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderTrackingInfo;", "Lkotlin/collections/HashMap;", "mediaLoadingFinished", "", "view", "Landroid/view/View;", "(Landroid/view/View;)Ljava/lang/Long;", "storePlaceholderTrackingInfo", "", "uuid", "trackingInfo", "placeholderTrackingInfo", "addView", "", "removeView", "getPlaceholderVisibilityChecker", "getActivity", "Landroid/content/Context;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlaceholderTrackerImpl implements PlaceholderTracker {

    @NotNull
    private final WeakHashMap<Activity, PlaceholderVisibilityChecker> checkers;

    @NotNull
    private final PlaceholderAreaVisibilityChecker placeholderAreaVisibilityChecker;

    @NotNull
    private final PlaceholderInfoPool placeholderInfoPool;

    @NotNull
    private final HashMap<String, PlaceholderTrackingInfo> trackingInfoById;

    public PlaceholderTrackerImpl(@NotNull PlaceholderAreaVisibilityChecker placeholderAreaVisibilityChecker, @NotNull PlaceholderInfoPool placeholderInfoPool) {
        Intrinsics.checkNotNullParameter(placeholderAreaVisibilityChecker, "placeholderAreaVisibilityChecker");
        Intrinsics.checkNotNullParameter(placeholderInfoPool, "placeholderInfoPool");
        this.placeholderAreaVisibilityChecker = placeholderAreaVisibilityChecker;
        this.placeholderInfoPool = placeholderInfoPool;
        this.checkers = new WeakHashMap<>();
        this.trackingInfoById = new HashMap<>();
    }

    private final Activity getActivity(Context context) {
        do {
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                return activity;
            }
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper == null) {
                break;
            }
            context = contextWrapper.getBaseContext();
        } while (context != null);
        return null;
    }

    private final PlaceholderVisibilityChecker getPlaceholderVisibilityChecker(View view) {
        Activity activity = getActivity(view.getContext());
        if (activity == null) {
            return null;
        }
        return this.checkers.get(activity);
    }

    public final boolean addView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Activity activity = getActivity(view.getContext());
        if (activity == null) {
            return false;
        }
        View rootView = activity.getWindow().getDecorView().getRootView();
        WeakHashMap<Activity, PlaceholderVisibilityChecker> weakHashMap = this.checkers;
        PlaceholderVisibilityChecker placeholderVisibilityChecker = weakHashMap.get(activity);
        if (placeholderVisibilityChecker == null) {
            Intrinsics.f(rootView);
            placeholderVisibilityChecker = new PlaceholderVisibilityChecker(rootView, this.placeholderAreaVisibilityChecker, this.placeholderInfoPool);
            weakHashMap.put(activity, placeholderVisibilityChecker);
        }
        return PlaceholderVisibilityChecker.addView$default(placeholderVisibilityChecker, view, null, 2, null);
    }

    @Override // ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderTracker
    public Long mediaLoadingFinished(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        PlaceholderVisibilityChecker placeholderVisibilityChecker = getPlaceholderVisibilityChecker(view);
        if (placeholderVisibilityChecker != null) {
            return Long.valueOf(placeholderVisibilityChecker.mediaLoadingFinished(view));
        }
        return null;
    }

    @Override // ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderTracker
    public PlaceholderTrackingInfo placeholderTrackingInfo(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return this.trackingInfoById.remove(uuid);
    }

    public final void removeView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        PlaceholderVisibilityChecker placeholderVisibilityChecker = getPlaceholderVisibilityChecker(view);
        if (placeholderVisibilityChecker != null) {
            placeholderVisibilityChecker.removeView(view);
        }
    }

    @Override // ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderTracker
    public void storePlaceholderTrackingInfo(@NotNull String uuid, @NotNull PlaceholderTrackingInfo trackingInfo) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        if (this.trackingInfoById.containsKey(uuid)) {
            return;
        }
        this.trackingInfoById.put(uuid, trackingInfo);
    }
}
