package ru.ozon.app.android.returns.ui.presentation.flexImages;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.presentation.flexImages.ImageVI;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/returns/ui/presentation/flexImages/FlexImagesDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "topAdditionalMargin", "I", "getTopAdditionalMargin", "()I", "setTopAdditionalMargin", "(I)V", "margin", "getMargin", "setMargin", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FlexImagesDecoration extends RecyclerView.n {
    private int margin;
    private int topAdditionalMargin;

    public FlexImagesDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.margin = UiExtKt.toPx(8, context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        int childLayoutPosition;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.o layoutManager = parent.getLayoutManager();
        FlexboxLayoutManager flexboxLayoutManager = layoutManager instanceof FlexboxLayoutManager ? (FlexboxLayoutManager) layoutManager : null;
        if (flexboxLayoutManager == null) {
            return;
        }
        RecyclerView.g adapter = parent.getAdapter();
        FlexImagesAdapter flexImagesAdapter = adapter instanceof FlexImagesAdapter ? (FlexImagesAdapter) adapter : null;
        if (flexImagesAdapter == null || (childLayoutPosition = parent.getChildLayoutPosition(view)) == -1) {
            return;
        }
        ImageVI viewItemOrNull = flexImagesAdapter.getViewItemOrNull(childLayoutPosition);
        ImageVI viewItemOrNull2 = flexImagesAdapter.getViewItemOrNull(childLayoutPosition + 1);
        List<c> flexLines = flexboxLayoutManager.getFlexLines();
        Intrinsics.f(flexLines);
        int i11 = 0;
        int i12 = 0;
        for (c cVar : flexLines) {
            if (childLayoutPosition >= cVar.a()) {
                i11 = cVar.a();
                childLayoutPosition -= cVar.a();
                i12++;
            }
        }
        boolean z11 = viewItemOrNull instanceof ImageVI.Deletable;
        boolean z12 = viewItemOrNull2 instanceof ImageVI.Deletable;
        boolean z13 = i11 > 0 && childLayoutPosition % i11 == 0;
        int i13 = z11 ? 0 : this.topAdditionalMargin;
        int i14 = z11 ? 0 : this.margin;
        if (i12 > 0) {
            i13 = i14;
        }
        outRect.top = i13;
        outRect.right = z11 ? 0 : z12 ? this.margin / 2 : this.margin;
        if (z13 && z11) {
            outRect.left = -this.topAdditionalMargin;
        }
    }

    public final void setMargin(int i11) {
        this.margin = i11;
    }

    public final void setTopAdditionalMargin(int i11) {
        this.topAdditionalMargin = i11;
    }
}
