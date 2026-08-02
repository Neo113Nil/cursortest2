package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.presentation.viewHolder;

import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.presentation.Grid3VO$Grid3ItemVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.presentation.view.Grid3TextInsideItemView;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/presentation/viewHolder/Grid3TextInsideItemViewHolder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/presentation/viewHolder/Grid3BaseItemViewHolder;", "containerView", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/presentation/view/Grid3TextInsideItemView;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "adultHandler", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultDelegate", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/presentation/Grid3VO$Grid3ItemVO;", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/presentation/view/Grid3TextInsideItemView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/account/adult/presenter/AdultDelegate;)V", "bindAdultContent", "", "item", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Grid3TextInsideItemViewHolder extends Grid3BaseItemViewHolder {

    @NotNull
    private final Grid3TextInsideItemView containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Grid3TextInsideItemViewHolder(@NotNull Grid3TextInsideItemView containerView, @NotNull ComposerReferences refs, @NotNull AdultHandler adultHandler, @NotNull AdultDelegate<Grid3VO$Grid3ItemVO> adultDelegate) {
        super(containerView, refs, adultHandler, adultDelegate);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(adultDelegate, "adultDelegate");
        this.containerView = containerView;
    }

    @Override // ru.ozon.app.android.product.common.AdultWidgetViewHolder
    public void bindAdultContent(@NotNull Grid3VO$Grid3ItemVO item) {
        Paint paint;
        Intrinsics.checkNotNullParameter(item, "item");
        int backgroundColorOrDefault = getBackgroundColorOrDefault(getContext(), item.getBackgroundColor());
        ShapeDrawable shape = item.getShape();
        if (shape != null && (paint = shape.getPaint()) != null) {
            paint.setColor(backgroundColorOrDefault);
        }
        this.containerView.setBackgroundShape(item.getShape(), backgroundColorOrDefault);
        this.containerView.bind(item, getActionHandler());
        this.containerView.setClickListener(getOnClickListener());
    }
}
