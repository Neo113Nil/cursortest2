package ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.element.viewHolder;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/element/viewHolder/ImagesLayoutManager;", "Lcom/google/android/flexbox/FlexboxLayoutManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/ViewGroup$LayoutParams;", "lp", "Landroidx/recyclerview/widget/RecyclerView$p;", "generateLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/RecyclerView$p;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ImagesLayoutManager extends FlexboxLayoutManager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagesLayoutManager(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setFlexDirection(0);
        setJustifyContent(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @NotNull
    public RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams lp) {
        return new FlexboxLayoutManager.b(lp);
    }
}
