package ru.ozon.app.android.fresh.unsorted.widgets.islandSeparator.presentation;

import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.databinding.IslandSeparatorBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.islandSeparator.presentation.SquircleShape;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000bJ'\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/islandSeparator/presentation/IslandSeparatorViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/unsorted/widgets/islandSeparator/presentation/IslandSeparatorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "item", "", "setSeparatorColor", "(Lru/ozon/app/android/fresh/unsorted/widgets/islandSeparator/presentation/IslandSeparatorVO;)V", "setSeparatorHeight", "setIslandViewsBgTintColor", "view", "Lru/ozon/app/android/fresh/unsorted/widgets/islandSeparator/presentation/SquircleShape$SquircleRoundedCorners;", "corners", "setIslandBg", "(Lru/ozon/app/android/fresh/unsorted/widgets/islandSeparator/presentation/IslandSeparatorVO;Landroid/view/View;Lru/ozon/app/android/fresh/unsorted/widgets/islandSeparator/presentation/SquircleShape$SquircleRoundedCorners;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/islandSeparator/presentation/IslandSeparatorVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/unsorted/databinding/IslandSeparatorBinding;", "binding", "Lru/ozon/app/android/fresh/unsorted/databinding/IslandSeparatorBinding;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IslandSeparatorViewHolder extends k<IslandSeparatorVO> {

    @NotNull
    private final IslandSeparatorBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IslandSeparatorViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        IslandSeparatorBinding bind = IslandSeparatorBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    private final void setIslandBg(IslandSeparatorVO item, View view, SquircleShape.SquircleRoundedCorners corners) {
        ShapeDrawable shapeDrawable$default = SquircleShape.getShapeDrawable$default(SquircleShape.INSTANCE, view, corners, 0.0f, 0.0f, 0.0f, 28, null);
        Paint paint = shapeDrawable$default.getPaint();
        paint.setAntiAlias(true);
        Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), item.getIslandsColor());
        if (parseColor != null) {
            paint.setColor(parseColor.intValue());
        }
        view.setBackground(shapeDrawable$default);
    }

    private final void setIslandViewsBgTintColor(IslandSeparatorVO item) {
        View topIslandView = this.binding.topIslandView;
        Intrinsics.checkNotNullExpressionValue(topIslandView, "topIslandView");
        setIslandBg(item, topIslandView, SquircleShape.SquircleRoundedCorners.BOTTOM);
        View bottomIslandView = this.binding.bottomIslandView;
        Intrinsics.checkNotNullExpressionValue(bottomIslandView, "bottomIslandView");
        setIslandBg(item, bottomIslandView, SquircleShape.SquircleRoundedCorners.TOP);
    }

    private final void setSeparatorColor(IslandSeparatorVO item) {
        Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), item.getSeparatorColor());
        if (parseColor != null) {
            this.binding.islandSeparatorContainer.setBackgroundColor(parseColor.intValue());
        }
    }

    private final void setSeparatorHeight(IslandSeparatorVO item) {
        View separatorView = this.binding.separatorView;
        Intrinsics.checkNotNullExpressionValue(separatorView, "separatorView");
        ViewGroup.LayoutParams layoutParams = separatorView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.height = item.getSeparatorHeight();
        separatorView.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull IslandSeparatorVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        setIslandViewsBgTintColor(item);
        setSeparatorColor(item);
        setSeparatorHeight(item);
    }
}
