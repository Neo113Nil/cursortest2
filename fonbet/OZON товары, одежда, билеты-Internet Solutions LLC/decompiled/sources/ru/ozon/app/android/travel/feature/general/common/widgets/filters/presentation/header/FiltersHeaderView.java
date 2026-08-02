package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.header;

import Hj.C3143a;
import Lc.a;
import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionVO;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00150\u0019J\b\u0010\u001b\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/header/FiltersHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp16", "dp24f", "", "backgroundColor", "leftButtonBV", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "rightButtonBV", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "progressBarView", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/header/FiltersProgressBarView;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/header/FiltersHeaderVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "setConstraints", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiltersHeaderView extends ConstraintLayout {
    private final int backgroundColor;
    private final int dp16;
    private final float dp24f;
    private final int dp8;

    @NotNull
    private final ButtonV3View leftButtonBV;

    @NotNull
    private final FiltersProgressBarView progressBarView;

    @NotNull
    private final IconButtonV3View rightButtonBV;

    @NotNull
    private final TextAtomV2View titleTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiltersHeaderView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dp24f = ResourceExtKt.toPxF(24, context);
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.backgroundColor = themeColor;
        q qVar = q.f64554a;
        ButtonV3View buttonV3View = (ButtonV3View) qVar.i(N.b(ButtonV3View.class), context);
        if (buttonV3View == null) {
            context2 = context;
            buttonV3View = new ButtonV3View(context2, null, 0, 0, 14, null);
        } else {
            context2 = context;
        }
        buttonV3View.setId(7861);
        buttonV3View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(buttonV3View);
        this.leftButtonBV = buttonV3View;
        View g10 = qVar.g(N.b(TextAtomV2View.class), context2);
        TextAtomV2View textAtomV2View = (TextAtomV2View) g10;
        a.d(textAtomV2View, 7863, -2, -2, false);
        addView(g10);
        this.titleTAV = textAtomV2View;
        IconButtonV3View iconButtonV3View = (IconButtonV3View) qVar.i(N.b(IconButtonV3View.class), context2);
        Context context3 = context2;
        iconButtonV3View = iconButtonV3View == null ? new IconButtonV3View(context3, null, 0, 0, 14, null) : iconButtonV3View;
        iconButtonV3View.setId(7865);
        iconButtonV3View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(iconButtonV3View);
        this.rightButtonBV = iconButtonV3View;
        FiltersProgressBarView filtersProgressBarView = new FiltersProgressBarView(context3);
        filtersProgressBarView.setId(View.generateViewId());
        filtersProgressBarView.setLayoutParams(new ConstraintLayout.b(0, -2));
        addView(filtersProgressBarView);
        this.progressBarView = filtersProgressBarView;
        setBackgroundColor(themeColor);
        setConstraints();
        setClipToPadding(false);
        setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.header.FiltersHeaderView.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, C3143a.f(view, "view", outline, "outline"), view.getHeight(), FiltersHeaderView.this.dp24f);
            }
        });
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new FiltersHeaderView$setConstraints$1(this));
    }

    public final void bind(@NotNull FiltersHeaderVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        AsyncActionVO asyncAction = item.getAsyncAction();
        if ((asyncAction != null ? asyncAction.getType() : null) != AsyncActionVO.AsyncBehaviorType.FETCH_STATE) {
            AsyncActionVO asyncAction2 = item.getAsyncAction();
            if ((asyncAction2 != null ? asyncAction2.getType() : null) != AsyncActionVO.AsyncBehaviorType.ACTION_STATE) {
                ViewExtKt.gone(this.progressBarView);
                ButtonV3HolderKt.bindOrGone(this.leftButtonBV, item.getLeftButton(), actionHandler);
                TextHolderKt.bindOrGone$default(this.titleTAV, item.getTitle(), null, 2, null);
                IconButtonV3HolderKt.bindOrGone(this.rightButtonBV, item.getRightButton(), actionHandler);
                setClipToOutline(item.getHasBottomSeparator());
            }
        }
        ViewExtKt.show(this.progressBarView);
        ButtonV3HolderKt.bindOrGone(this.leftButtonBV, item.getLeftButton(), actionHandler);
        TextHolderKt.bindOrGone$default(this.titleTAV, item.getTitle(), null, 2, null);
        IconButtonV3HolderKt.bindOrGone(this.rightButtonBV, item.getRightButton(), actionHandler);
        setClipToOutline(item.getHasBottomSeparator());
    }
}
