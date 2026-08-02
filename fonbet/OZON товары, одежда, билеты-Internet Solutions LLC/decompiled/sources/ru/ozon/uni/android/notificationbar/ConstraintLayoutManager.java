package ru.ozon.uni.android.notificationbar;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/notificationbar/ConstraintLayoutManager;", "Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;", "parent", "Landroid/view/ViewGroup;", "<init>", "(Landroid/view/ViewGroup;)V", "getParent", "()Landroid/view/ViewGroup;", "layout", "", "view", "Landroid/view/View;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ConstraintLayoutManager extends NotificationLayoutManager {

    @NotNull
    private final ViewGroup parent;

    public ConstraintLayoutManager(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
    }

    @Override // ru.ozon.uni.android.notificationbar.NotificationLayoutManager
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // ru.ozon.uni.android.notificationbar.NotificationLayoutManager
    public void layout(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.b)) {
            layoutParams = null;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        if (bVar != null) {
            ((ViewGroup.MarginLayoutParams) bVar).width = 0;
            ((ViewGroup.MarginLayoutParams) bVar).height = -2;
            bVar.f41636i = 0;
            bVar.f41656t = 0;
            bVar.f41658v = 0;
            getParent().addView(view, bVar);
        }
    }
}
