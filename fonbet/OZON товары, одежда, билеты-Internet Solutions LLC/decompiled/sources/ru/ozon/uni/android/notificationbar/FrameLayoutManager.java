package ru.ozon.uni.android.notificationbar;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/uni/android/notificationbar/FrameLayoutManager;", "Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;", "Landroid/view/ViewGroup;", "parent", "", "position", "<init>", "(Landroid/view/ViewGroup;I)V", "Landroid/view/View;", "view", "", "layout", "(Landroid/view/View;)V", "Landroid/view/ViewGroup;", "getParent", "()Landroid/view/ViewGroup;", "I", "getPosition", "()I", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FrameLayoutManager extends NotificationLayoutManager {

    @NotNull
    private final ViewGroup parent;
    private final int position;

    public FrameLayoutManager(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.position = i11;
    }

    @Override // ru.ozon.uni.android.notificationbar.NotificationLayoutManager
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // ru.ozon.uni.android.notificationbar.NotificationLayoutManager
    public void layout(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = this.position;
        getParent().addView(view, layoutParams);
    }
}
