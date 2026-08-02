package ru.ozon.app.android.pikazon.placeholdertracker;

import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pikazon/placeholdertracker/ViewVisibilityInteractor;", "", "getViewVisiblePercent", "", "view", "Landroid/view/View;", "Default", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ViewVisibilityInteractor {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\f\u0010\n\u001a\u00020\u000b*\u00020\tH\u0002J\f\u0010\f\u001a\u00020\u000b*\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pikazon/placeholdertracker/ViewVisibilityInteractor$Default;", "Lru/ozon/app/android/pikazon/placeholdertracker/ViewVisibilityInteractor;", "<init>", "()V", "globalVisibleRect", "Landroid/graphics/Rect;", "getViewVisiblePercent", "", "view", "Landroid/view/View;", "getVisibleArea", "", "getFullArea", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Default implements ViewVisibilityInteractor {

        @NotNull
        public static final Default INSTANCE = new Default();

        @NotNull
        private static final Rect globalVisibleRect = new Rect();

        private Default() {
        }

        private final long getFullArea(View view) {
            int height;
            int width = view.getWidth();
            if (width > 0 && (height = view.getHeight()) > 0) {
                return width * height;
            }
            return 0L;
        }

        private final long getVisibleArea(View view) {
            if (view.getGlobalVisibleRect(globalVisibleRect)) {
                return r0.width() * r0.height();
            }
            return 0L;
        }

        @Override // ru.ozon.app.android.pikazon.placeholdertracker.ViewVisibilityInteractor
        public float getViewVisiblePercent(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            long visibleArea = getVisibleArea(view);
            if (visibleArea <= 0) {
                return 0.0f;
            }
            long fullArea = getFullArea(view);
            if (fullArea <= 0) {
                return 0.0f;
            }
            return visibleArea / fullArea;
        }
    }

    float getViewVisiblePercent(@NotNull View view);
}
