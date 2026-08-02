package ru.ozon.uni.android.notificationbar;

import android.R;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/ViewGroup;", "", "bottomAnchorId", "Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;", "asNotificationLayoutManager", "(Landroid/view/ViewGroup;Ljava/lang/Integer;)Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoordinatorLayoutManagerKt {
    public static final NotificationLayoutManager asNotificationLayoutManager(@NotNull ViewGroup viewGroup, Integer num) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getRootView().findViewById(R.id.content);
        if (viewGroup2 == null) {
            return null;
        }
        if (viewGroup2 instanceof ConstraintLayout) {
            return new ConstraintLayoutManager(viewGroup2);
        }
        if (viewGroup2 instanceof FrameLayout) {
            return new FrameLayoutManager(viewGroup2, 48);
        }
        return null;
    }

    public static /* synthetic */ NotificationLayoutManager asNotificationLayoutManager$default(ViewGroup viewGroup, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        return asNotificationLayoutManager(viewGroup, num);
    }
}
