package ru.ozon.app.android.pikazon.extensions;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderAttachStateChangeListener;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"trackPlaceholderVisibility", "", "Landroid/view/View;", "lib_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewExtKt {
    public static final void trackPlaceholderVisibility(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Pikazon companion = Pikazon.INSTANCE.getInstance();
        if (companion.getConfig().getPerformanceAvailabilityChecker().isImagePlaceholderAnalyticsEnabled()) {
            companion.getPlaceholderTracker$lib_release().addView(view);
            PlaceholderAttachStateChangeListener placeholderAttachStateChangeListener = PlaceholderAttachStateChangeListener.INSTANCE;
            view.removeOnAttachStateChangeListener(placeholderAttachStateChangeListener);
            view.addOnAttachStateChangeListener(placeholderAttachStateChangeListener);
        }
    }
}
