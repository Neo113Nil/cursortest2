package ru.ozon.uni.android.flashbar.callback;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.flashbar.view.DismissEvent;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/flashbar/callback/OnDismissListener;", "", "onDismissing", "", "isSwiped", "", "onDismissProgress", "progress", "", "onDismissed", "event", "Lru/ozon/uni/android/flashbar/view/DismissEvent;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OnDismissListener {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onDismissProgress(@NotNull OnDismissListener onDismissListener, float f7) {
        }

        public static void onDismissing(@NotNull OnDismissListener onDismissListener, boolean z11) {
        }
    }

    void onDismissProgress(float progress);

    void onDismissed(@NotNull DismissEvent event);

    void onDismissing(boolean isSwiped);
}
