package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.decorator;

import E0.C2942q;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2BannerVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2BannerSeparatedButtonVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2CartButtonVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2ReserveButtonVO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/decorator/TileGrid2MarginsDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "", "index", "getLeftMargin", "(I)I", "getRightMargin", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2MarginsDecoration extends RecyclerView.n {

    @NotNull
    public static final TileGrid2MarginsDecoration INSTANCE = new TileGrid2MarginsDecoration();

    private TileGrid2MarginsDecoration() {
    }

    private final int getLeftMargin(int index) {
        if (index % 2 == 0) {
            return 0;
        }
        return TileGrid2Constants.INSTANCE.getContainerHorizontalMargin();
    }

    private final int getRightMargin(int index) {
        if (index % 2 == 0) {
            return TileGrid2Constants.INSTANCE.getContainerHorizontalMargin();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        c b11;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Object a11 = C2942q.a(parent, "parent", state, "state");
        l lVar = a11 instanceof l ? (l) a11 : null;
        if (lVar == null || (b11 = lVar.b(parent.getChildAdapterPosition(view))) == null) {
            return;
        }
        if (b11 instanceof TileGrid2VO) {
            TileGrid2VO tileGrid2VO = (TileGrid2VO) b11;
            outRect.top = tileGrid2VO.getTopMargin();
            outRect.left = getLeftMargin(tileGrid2VO.getIndex());
            outRect.right = getRightMargin(tileGrid2VO.getIndex());
            return;
        }
        if (b11 instanceof TileGrid2BannerVO) {
            TileGrid2BannerVO tileGrid2BannerVO = (TileGrid2BannerVO) b11;
            outRect.top = tileGrid2BannerVO.getTopMargin();
            outRect.left = getLeftMargin(tileGrid2BannerVO.getIndex());
            outRect.right = getRightMargin(tileGrid2BannerVO.getIndex());
            return;
        }
        if (b11 instanceof TileGrid2CartButtonVO.TileGrid2CartButtonSingleVO) {
            TileGrid2CartButtonVO.TileGrid2CartButtonSingleVO tileGrid2CartButtonSingleVO = (TileGrid2CartButtonVO.TileGrid2CartButtonSingleVO) b11;
            outRect.left = getLeftMargin(tileGrid2CartButtonSingleVO.getIndex());
            outRect.right = getRightMargin(tileGrid2CartButtonSingleVO.getIndex());
            return;
        }
        if (b11 instanceof TileGrid2CartButtonVO.TileGrid2SingleCartContainerVO) {
            TileGrid2CartButtonVO.TileGrid2SingleCartContainerVO tileGrid2SingleCartContainerVO = (TileGrid2CartButtonVO.TileGrid2SingleCartContainerVO) b11;
            outRect.left = getLeftMargin(tileGrid2SingleCartContainerVO.getIndex());
            outRect.right = getRightMargin(tileGrid2SingleCartContainerVO.getIndex());
            return;
        }
        if (b11 instanceof TileGrid2CartButtonVO.TileGrid2DoubleCartButtonVO) {
            TileGrid2CartButtonVO.TileGrid2DoubleCartButtonVO tileGrid2DoubleCartButtonVO = (TileGrid2CartButtonVO.TileGrid2DoubleCartButtonVO) b11;
            outRect.left = getLeftMargin(tileGrid2DoubleCartButtonVO.getIndex());
            outRect.right = getRightMargin(tileGrid2DoubleCartButtonVO.getIndex());
        } else if (b11 instanceof TileGrid2ReserveButtonVO) {
            TileGrid2ReserveButtonVO tileGrid2ReserveButtonVO = (TileGrid2ReserveButtonVO) b11;
            outRect.left = getLeftMargin(tileGrid2ReserveButtonVO.getIndex());
            outRect.right = getRightMargin(tileGrid2ReserveButtonVO.getIndex());
        } else if (b11 instanceof TileGrid2BannerSeparatedButtonVO) {
            TileGrid2BannerSeparatedButtonVO tileGrid2BannerSeparatedButtonVO = (TileGrid2BannerSeparatedButtonVO) b11;
            int leftMargin = getLeftMargin(tileGrid2BannerSeparatedButtonVO.getIndex());
            TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
            outRect.left = tileGrid2Constants.getBannerContentHorizontalMargin() + leftMargin;
            outRect.right = tileGrid2Constants.getBannerContentHorizontalMargin() + getRightMargin(tileGrid2BannerSeparatedButtonVO.getIndex());
            outRect.top = -tileGrid2BannerSeparatedButtonVO.getTopOffsetPx();
            outRect.bottom = tileGrid2Constants.getBannerRootBottomPadding();
        }
    }
}
