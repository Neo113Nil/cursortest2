package ru.ozon.app.android.cart.common.dynamicElement;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementOnItemTouchListener;", "Landroidx/recyclerview/widget/RecyclerView$s;", "Landroid/view/View;", "viewReceiver", "<init>", "(Landroid/view/View;)V", "Landroidx/recyclerview/widget/RecyclerView;", "rv", "Landroid/view/MotionEvent;", "e", "", "onInterceptTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z", "", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", "disallowIntercept", "onRequestDisallowInterceptTouchEvent", "(Z)V", "Landroid/view/View;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DynamicElementOnItemTouchListener implements RecyclerView.s {

    @NotNull
    private final View viewReceiver;

    public DynamicElementOnItemTouchListener(@NotNull View viewReceiver) {
        Intrinsics.checkNotNullParameter(viewReceiver, "viewReceiver");
        this.viewReceiver = viewReceiver;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean onInterceptTouchEvent(@NotNull RecyclerView rv, @NotNull MotionEvent e11) {
        RecyclerView.C findContainingViewHolder;
        Intrinsics.checkNotNullParameter(rv, "rv");
        Intrinsics.checkNotNullParameter(e11, "e");
        View findChildViewUnder = rv.findChildViewUnder(e11.getX(), e11.getY());
        if (findChildViewUnder != null && (findContainingViewHolder = rv.findContainingViewHolder(findChildViewUnder)) != null) {
            Integer valueOf = Integer.valueOf(findContainingViewHolder.getAdapterPosition());
            if (valueOf.intValue() == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                RecyclerView.g adapter = rv.getAdapter();
                t tVar = adapter instanceof t ? (t) adapter : null;
                if (tVar == null) {
                    return true;
                }
                List currentList = tVar.getCurrentList();
                Object obj = currentList != null ? currentList.get(intValue) : null;
                return !((obj instanceof DynamicElementVO ? (DynamicElementVO) obj : null) != null ? DynamicElementVOKt.getHasAction(r3) : false);
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void onTouchEvent(@NotNull RecyclerView rv, @NotNull MotionEvent e11) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        Intrinsics.checkNotNullParameter(e11, "e");
        this.viewReceiver.onTouchEvent(e11);
    }
}
