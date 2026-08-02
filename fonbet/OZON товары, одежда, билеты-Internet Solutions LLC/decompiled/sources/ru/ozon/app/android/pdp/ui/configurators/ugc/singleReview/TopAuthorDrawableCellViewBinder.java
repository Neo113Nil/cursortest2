package ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.cell.CellView;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/TopAuthorDrawableCellViewBinder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/uni/android/cell/CellView;", "cellView", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroid/graphics/Canvas;", "canvas", "", "applyDrawable", "(Lru/ozon/uni/android/cell/CellView;Landroidx/recyclerview/widget/RecyclerView;Landroid/graphics/Canvas;)V", "Landroid/graphics/Rect;", "rect$delegate", "LSc/j;", "getRect", "()Landroid/graphics/Rect;", "rect", "Landroid/graphics/drawable/Drawable;", "topAuthorDrawable$delegate", "getTopAuthorDrawable", "()Landroid/graphics/drawable/Drawable;", "topAuthorDrawable", "", "isDrawableBoundsInitialized", "Z", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TopAuthorDrawableCellViewBinder {
    private boolean isDrawableBoundsInitialized;

    /* renamed from: rect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rect;

    /* renamed from: topAuthorDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j topAuthorDrawable;

    public TopAuthorDrawableCellViewBinder(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.rect = LazyUtilsKt.unsafeLazy(TopAuthorDrawableCellViewBinder$rect$2.INSTANCE);
        this.topAuthorDrawable = LazyUtilsKt.unsafeLazy(new TopAuthorDrawableCellViewBinder$topAuthorDrawable$2(context));
    }

    private final Rect getRect() {
        return (Rect) this.rect.getValue();
    }

    private final Drawable getTopAuthorDrawable() {
        return (Drawable) this.topAuthorDrawable.getValue();
    }

    public final void applyDrawable(@NotNull CellView cellView, @NotNull RecyclerView parent, @NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(cellView, "cellView");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Drawable topAuthorDrawable = getTopAuthorDrawable();
        if (topAuthorDrawable != null) {
            IconView iconView = cellView.getLeftBlock().getIconView();
            if (!this.isDrawableBoundsInitialized) {
                int dp_1 = Dimens.INSTANCE.getDP_1() + iconView.getHeight();
                topAuthorDrawable.setBounds(0, 0, (topAuthorDrawable.getIntrinsicWidth() * dp_1) / topAuthorDrawable.getIntrinsicHeight(), dp_1);
                this.isDrawableBoundsInitialized = true;
            }
            getRect().set(0, 0, iconView.getWidth(), iconView.getHeight());
            parent.offsetDescendantRectToMyCoords(iconView, getRect());
            int save = canvas.save();
            canvas.translate(getRect().centerX() - (topAuthorDrawable.getBounds().width() / 2.0f), getRect().centerY() - (topAuthorDrawable.getBounds().height() / 2.0f));
            try {
                topAuthorDrawable.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }
}
