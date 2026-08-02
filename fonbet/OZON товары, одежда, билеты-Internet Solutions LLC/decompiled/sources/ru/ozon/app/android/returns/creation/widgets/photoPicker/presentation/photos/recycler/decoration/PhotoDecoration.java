package ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/decoration/PhotoDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/GridLayoutManager;", "layoutManager", "", "calculatePosition", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroidx/recyclerview/widget/GridLayoutManager;)Ljava/lang/Integer;", "Landroid/graphics/Rect;", "outRect", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhotoDecoration extends RecyclerView.n {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int VERTICAL_MARGIN = ResourceExtKt.toPx(16);
    private static final int BETWEEN_MARGIN = ResourceExtKt.toPx(8);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/decoration/PhotoDecoration$Companion;", "", "<init>", "()V", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final Integer calculatePosition(RecyclerView recyclerView, View view, GridLayoutManager gridLayoutManager) {
        RecyclerView.g adapter = recyclerView.getAdapter();
        Integer num = null;
        if (adapter == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf(recyclerView.getChildAdapterPosition(view));
        int intValue = valueOf.intValue();
        if (intValue < 0 || intValue >= adapter.getCardsCount()) {
            valueOf = null;
        }
        Integer valueOf2 = Integer.valueOf(gridLayoutManager.getPosition(view));
        int intValue2 = valueOf2.intValue();
        if (intValue2 >= 0 && intValue2 < adapter.getCardsCount()) {
            num = valueOf2;
        }
        return valueOf == null ? num : valueOf;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.o layoutManager = parent.getLayoutManager();
        if (layoutManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        Integer calculatePosition = calculatePosition(parent, view, gridLayoutManager);
        if (calculatePosition != null) {
            outRect.top = calculatePosition.intValue() < gridLayoutManager.g() ? VERTICAL_MARGIN : BETWEEN_MARGIN;
            int i11 = BETWEEN_MARGIN;
            outRect.left = i11 / 2;
            outRect.right = i11 / 2;
            outRect.bottom = 0;
        }
    }
}
