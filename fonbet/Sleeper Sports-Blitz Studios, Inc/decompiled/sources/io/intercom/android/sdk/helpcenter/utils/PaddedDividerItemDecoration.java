package io.intercom.android.sdk.helpcenter.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaddedDividerItemDecoration.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/helpcenter/utils/PaddedDividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", ViewProps.PADDING, "", "dividerDrawable", "Landroid/graphics/drawable/Drawable;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PaddedDividerItemDecoration extends RecyclerView.ItemDecoration {
    public static final int $stable = 8;
    private final Context context;
    private Drawable dividerDrawable;
    private final int padding;

    public PaddedDividerItemDecoration(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.padding = (int) TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics());
        this.dividerDrawable = ContextCompat.getDrawable(context, R.drawable.intercom_list_divider);
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int paddingLeft = parent.getPaddingLeft() + this.padding;
        int width = (parent.getWidth() - parent.getPaddingRight()) - this.padding;
        if (parent.getAdapter() != null) {
            int childCount = parent.getChildCount() - 1;
            for (int i = 0; i < childCount; i++) {
                View childAt = parent.getChildAt(i);
                if (parent.getChildAdapterPosition(childAt) == -1) {
                    return;
                }
                int bottom = childAt.getBottom();
                Drawable drawable = this.dividerDrawable;
                int intrinsicHeight = (drawable != null ? drawable.getIntrinsicHeight() : 0) + bottom;
                Drawable drawable2 = this.dividerDrawable;
                if (drawable2 != null) {
                    drawable2.setBounds(paddingLeft, bottom, width, intrinsicHeight);
                }
                Drawable drawable3 = this.dividerDrawable;
                if (drawable3 != null) {
                    drawable3.draw(canvas);
                }
            }
        }
    }
}
