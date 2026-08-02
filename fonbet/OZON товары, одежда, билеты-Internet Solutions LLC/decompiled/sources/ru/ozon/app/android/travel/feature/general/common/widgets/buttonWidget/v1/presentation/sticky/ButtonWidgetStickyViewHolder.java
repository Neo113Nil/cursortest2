package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v1.presentation.sticky;

import Vg.d;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v1.presentation.ButtonWidgetVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v1/presentation/sticky/ButtonWidgetStickyViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v1/presentation/ButtonWidgetVO;", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;LVg/d;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v1/presentation/ButtonWidgetVO;)V", "Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/view/View;", "getParentView", "()Landroid/view/View;", "parentView", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "getLargeButtonView", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "largeButtonView", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonWidgetStickyViewHolder extends AbstractC6064a<ButtonWidgetVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private GradientDrawable gradientDrawable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWidgetStickyViewHolder(@NotNull i container, @NotNull d customActionHandlersStoreFactory, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.gradientDrawable = new GradientDrawable();
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new ButtonWidgetStickyViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    private final LargeButtonView getLargeButtonView() {
        View view = getView();
        if (view instanceof LargeButtonView) {
            return (LargeButtonView) view;
        }
        return null;
    }

    private final View getParentView() {
        return (View) getView().getParent();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ButtonWidgetVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        View parentView = getParentView();
        if (parentView != null) {
            GradientDrawable gradientDrawable = this.gradientDrawable;
            gradientDrawable.setCornerRadii(new float[]{item.getTopRadius(), item.getTopRadius(), item.getTopRadius(), item.getTopRadius(), 0.0f, 0.0f, 0.0f, 0.0f});
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = parentView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
            gradientDrawable.setColor(parseColor != null ? parseColor.intValue() : 0);
            parentView.setBackground(gradientDrawable);
            parentView.setPadding(item.getButtonHorizontalMargin(), item.getButtonTopMargin(), item.getButtonHorizontalMargin(), item.getButtonBottomMargin());
        }
        LargeButtonView largeButtonView = getLargeButtonView();
        if (largeButtonView != null) {
            LargeButtonHolderKt.bind(largeButtonView, item.getButton(), this.actionHandler);
        }
    }
}
