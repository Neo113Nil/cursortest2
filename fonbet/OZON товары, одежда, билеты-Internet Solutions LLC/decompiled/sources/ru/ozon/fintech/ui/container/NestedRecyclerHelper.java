package ru.ozon.fintech.ui.container;

import C.D;
import Ec0.b;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\nH\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/fintech/ui/container/NestedRecyclerHelper;", "", "recycler", "Landroidx/recyclerview/widget/RecyclerView;", "horizontalSlope", "", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;F)V", "initX", "onDispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "handleNestedAccepted", "getParentRecycler", "view", "Landroid/view/View;", "shotActionUp", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NestedRecyclerHelper {
    private final float horizontalSlope;
    private float initX;

    @NotNull
    private final RecyclerView recycler;

    public NestedRecyclerHelper(@NotNull RecyclerView recycler, float f7) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        this.recycler = recycler;
        this.horizontalSlope = f7;
    }

    private final RecyclerView getParentRecycler(View view) {
        if (view.getParent() instanceof RecyclerView) {
            ViewParent parent = view.getParent();
            Intrinsics.g(parent, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            return (RecyclerView) parent;
        }
        Object parent2 = view.getParent();
        View view2 = parent2 instanceof View ? (View) parent2 : null;
        if (view2 != null) {
            return getParentRecycler(view2);
        }
        return null;
    }

    private final void handleNestedAccepted() {
        this.recycler.post(new b(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleNestedAccepted$lambda$1(NestedRecyclerHelper nestedRecyclerHelper) {
        RecyclerView parentRecycler = nestedRecyclerHelper.getParentRecycler(nestedRecyclerHelper.recycler);
        if (parentRecycler != null) {
            nestedRecyclerHelper.shotActionUp(parentRecycler);
        }
    }

    private final void shotActionUp(View view) {
        view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis() + 100, 1, 0.0f, 0.0f, 0));
    }

    public final void onDispatchTouchEvent(MotionEvent ev) {
        Integer valueOf = ev != null ? Integer.valueOf(ev.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.initX = ev.getX();
            return;
        }
        if (valueOf != null && valueOf.intValue() == 2) {
            if (Math.abs(ev.getX() - this.initX) > this.horizontalSlope) {
                this.recycler.getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (valueOf != null && valueOf.intValue() == 1) {
            this.recycler.getParent().requestDisallowInterceptTouchEvent(false);
            this.initX = 0.0f;
            handleNestedAccepted();
        } else if (valueOf != null && valueOf.intValue() == 3) {
            this.initX = 0.0f;
            this.recycler.getParent().requestDisallowInterceptTouchEvent(false);
        }
    }

    public /* synthetic */ NestedRecyclerHelper(RecyclerView recyclerView, float f7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(recyclerView, (i11 & 2) != 0 ? D.c(2.5f) : f7);
    }
}
