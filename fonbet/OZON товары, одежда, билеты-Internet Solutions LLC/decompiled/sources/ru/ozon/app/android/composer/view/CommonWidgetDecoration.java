package ru.ozon.app.android.composer.view;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.InterfaceC8039a;
import m10.l;
import m10.o;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.compose.widget.scrollable.m;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/composer/view/CommonWidgetDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "offset", "<init>", "(I)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "I", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommonWidgetDecoration extends RecyclerView.n {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int offset;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/composer/view/CommonWidgetDecoration$Companion;", "", "<init>", "()V", "OFFSET_BETWEEN_WIDGETS", "", "shouldDrawDividerBelow", "", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean shouldDrawDividerBelow(@NotNull View view, @NotNull RecyclerView parent) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Object adapter = parent.getAdapter();
            Intrinsics.g(adapter, "null cannot be cast to non-null type ru.ozon.composer.ui.adapter.DecoratedAdapter");
            l lVar = (l) adapter;
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition >= 0 && childAdapterPosition < lVar.getItemCount() - 1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof GridLayoutManager.b)) {
                    layoutParams = null;
                }
                GridLayoutManager.b bVar = (GridLayoutManager.b) layoutParams;
                if (bVar == null) {
                    return false;
                }
                int d11 = bVar.d();
                if (lVar.a(childAdapterPosition)) {
                    int i11 = childAdapterPosition + 1;
                    if (lVar.a(i11)) {
                        c b11 = lVar.b(childAdapterPosition);
                        c b12 = lVar.b(i11);
                        if (d11 < 1200) {
                            RecyclerView.o layoutManager = parent.getLayoutManager();
                            if (layoutManager == null) {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                            }
                            GridLayoutManager.c k11 = ((GridLayoutManager) layoutManager).k();
                            while (i11 < lVar.getItemCount() && k11.getSpanIndex(i11, m.f94768d) != 0) {
                                i11++;
                            }
                            if (i11 > lVar.getItemCount() - 1 || !lVar.a(i11)) {
                                return false;
                            }
                            b12 = lVar.b(i11);
                        }
                        if ((b12 instanceof m10.m) && (b11 instanceof InterfaceC8039a)) {
                            return ((b11 instanceof o) && (b12 instanceof o) && Intrinsics.d(((o) b12).getWidgetName(), ((o) b11).getWidgetName())) ? false : true;
                        }
                    }
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    public CommonWidgetDecoration(int i11) {
        this.offset = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.o layoutManager = parent.getLayoutManager();
        if (layoutManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager.getOrientation() == 1 && !linearLayoutManager.getStackFromEnd() && (parent.getAdapter() instanceof l) && INSTANCE.shouldDrawDividerBelow(view, parent)) {
            outRect.bottom = this.offset;
        }
    }
}
