package ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.sticky;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyHelper;", "", "parent", "Landroid/view/ViewGroup;", "<init>", "(Landroid/view/ViewGroup;)V", "viewBounds", "Landroid/graphics/Rect;", "sellerSortSwitcherTextViewCache", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "checkTextViewInSight", "", "sellerSortSwitcherView", "getTextView", "computeTextViewInRecycler", "", "textView", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerSortSwitcherStickyHelper {

    @NotNull
    private final ViewGroup parent;

    @NotNull
    private WeakReference<View> sellerSortSwitcherTextViewCache;

    @NotNull
    private final Rect viewBounds;

    public SellerSortSwitcherStickyHelper(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.viewBounds = new Rect();
        this.sellerSortSwitcherTextViewCache = new WeakReference<>(null);
    }

    private final int computeTextViewInRecycler(View textView, ViewGroup sellerSortSwitcherView) {
        textView.getDrawingRect(this.viewBounds);
        sellerSortSwitcherView.offsetDescendantRectToMyCoords(textView, this.viewBounds);
        this.parent.offsetDescendantRectToMyCoords(sellerSortSwitcherView, this.viewBounds);
        return this.viewBounds.top;
    }

    private final View getTextView(View sellerSortSwitcherView) {
        View view = this.sellerSortSwitcherTextViewCache.get();
        return view == null ? sellerSortSwitcherView.findViewById(R$id.productTitleTv) : view;
    }

    public final boolean checkTextViewInSight(@NotNull ViewGroup sellerSortSwitcherView) {
        Intrinsics.checkNotNullParameter(sellerSortSwitcherView, "sellerSortSwitcherView");
        View textView = getTextView(sellerSortSwitcherView);
        if (textView == null) {
            return false;
        }
        int computeTextViewInRecycler = computeTextViewInRecycler(textView, sellerSortSwitcherView) + (textView.getHeight() / 2);
        return (computeTextViewInRecycler > 0) && (computeTextViewInRecycler < this.parent.getHeight());
    }
}
