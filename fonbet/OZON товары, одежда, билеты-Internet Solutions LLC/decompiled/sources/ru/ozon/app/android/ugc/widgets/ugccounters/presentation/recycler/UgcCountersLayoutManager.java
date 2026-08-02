package ru.ozon.app.android.ugc.widgets.ugccounters.presentation.recycler;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.recycler.UgcCountersItemDecoration;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0010\u001a\b\u0018\u00010\u000fR\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/recycler/UgcCountersLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/ViewGroup$LayoutParams;", "lp", "", "updateLayoutParamsIfNeeded", "(Landroid/view/ViewGroup$LayoutParams;)V", "Landroidx/recyclerview/widget/RecyclerView;", "view", "onAttachedToWindow", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroidx/recyclerview/widget/RecyclerView$v;", "recycler", "onDetachedFromWindow", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$v;)V", "Landroidx/recyclerview/widget/RecyclerView$p;", "", "checkLayoutParams", "(Landroidx/recyclerview/widget/RecyclerView$p;)Z", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UgcCountersLayoutManager extends LinearLayoutManager {
    private RecyclerView recyclerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcCountersLayoutManager(@NotNull Context context) {
        super(context, 0, false);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void updateLayoutParamsIfNeeded(ViewGroup.LayoutParams lp) {
        int width;
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null || (width = recyclerView.getWidth()) == 0 || getItemCount() != 2) {
            return;
        }
        RecyclerView.g adapter = recyclerView.getAdapter();
        UgcCountersRecyclerAdapter ugcCountersRecyclerAdapter = adapter instanceof UgcCountersRecyclerAdapter ? (UgcCountersRecyclerAdapter) adapter : null;
        if (ugcCountersRecyclerAdapter == null) {
            return;
        }
        UgcCountersVO.Block block = ugcCountersRecyclerAdapter.getCurrentList().get(0).getBlock();
        UgcCountersVO.Block block2 = ugcCountersRecyclerAdapter.getCurrentList().get(1).getBlock();
        if ((block instanceof UgcCountersVO.Block.Single) && (block2 instanceof UgcCountersVO.Block.Single)) {
            UgcCountersItemDecoration.Companion companion = UgcCountersItemDecoration.INSTANCE;
            lp.width = ((width - (companion.getEDGE_ITEMS_SPACING() * 2)) - companion.getCROSS_ITEMS_SPACING()) / 2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean checkLayoutParams(RecyclerView.p lp) {
        if (lp == null) {
            return super.checkLayoutParams(lp);
        }
        updateLayoutParamsIfNeeded(lp);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onAttachedToWindow(RecyclerView view) {
        super.onAttachedToWindow(view);
        this.recyclerView = view;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void onDetachedFromWindow(RecyclerView view, RecyclerView.v recycler) {
        super.onDetachedFromWindow(view, recycler);
        this.recyclerView = null;
    }
}
