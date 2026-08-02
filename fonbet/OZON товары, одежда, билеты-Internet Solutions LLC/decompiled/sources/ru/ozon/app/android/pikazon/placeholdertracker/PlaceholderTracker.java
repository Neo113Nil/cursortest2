package ru.ozon.app.android.pikazon.placeholdertracker;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderTracker;", "", "mediaLoadingFinished", "", "view", "Landroid/view/View;", "(Landroid/view/View;)Ljava/lang/Long;", "storePlaceholderTrackingInfo", "", "uuid", "", "trackingInfo", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderTrackingInfo;", "placeholderTrackingInfo", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PlaceholderTracker {
    Long mediaLoadingFinished(@NotNull View view);

    PlaceholderTrackingInfo placeholderTrackingInfo(@NotNull String uuid);

    void storePlaceholderTrackingInfo(@NotNull String uuid, @NotNull PlaceholderTrackingInfo trackingInfo);
}
