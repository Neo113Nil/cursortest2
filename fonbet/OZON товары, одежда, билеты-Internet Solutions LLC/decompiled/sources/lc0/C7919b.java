package lc0;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: lc0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7919b extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AppCompatTextView f73174a;

    public C7919b(@NotNull AppCompatTextView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f73174a = view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(parent.getWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(parent.getHeight(), 0);
        int paddingRight = parent.getPaddingRight() + parent.getPaddingLeft();
        AppCompatTextView appCompatTextView = this.f73174a;
        appCompatTextView.measure(ViewGroup.getChildMeasureSpec(makeMeasureSpec, paddingRight, appCompatTextView.getLayoutParams().width), ViewGroup.getChildMeasureSpec(makeMeasureSpec2, parent.getPaddingBottom() + parent.getPaddingTop(), appCompatTextView.getLayoutParams().height));
        appCompatTextView.layout(0, 0, appCompatTextView.getMeasuredWidth(), appCompatTextView.getMeasuredHeight());
        appCompatTextView.draw(c11);
    }
}
