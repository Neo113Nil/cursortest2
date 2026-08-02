package ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.button;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.a;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u0004\u0018\u00010\tJ8\u0010\u000f\u001a\u00020\u000b2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b0\u0011j\u0002`\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\rJ\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/button/FilterButtonHolder;", "", "<init>", "()V", DynamicElementDTO.LARGE_BUTTON, "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "shadowView", "Landroid/view/View;", "buttonContainer", "Landroid/widget/FrameLayout;", "appendButton", "", "container", "Landroid/view/ViewGroup;", "getButtonContainer", "bindOrGone", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "buttonAtom", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "isEnabled", "", "isSelect", ProductAction.ACTION_REMOVE, "bottomContainer", "createButton", "context", "Landroid/content/Context;", "createButtonContainer", "createShadowView", "getCorrectAlpha", "", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterButtonHolder {
    private static final int dp16 = ResourceExtKt.toPx(16);
    private static final int dp24 = ResourceExtKt.toPx(24);
    private FrameLayout buttonContainer;
    private LargeButtonView largeButton;
    private View shadowView;

    private final LargeButtonView createButton(Context context) {
        LargeButtonView largeButtonView = new LargeButtonView(context, null, 0, 0, 14, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int i11 = dp16;
        marginLayoutParams.setMargins(i11, i11, i11, dp24);
        largeButtonView.setLayoutParams(marginLayoutParams);
        ViewExtKt.gone(largeButtonView);
        return largeButtonView;
    }

    private final FrameLayout createButtonContainer(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setBackgroundColor(a.getColor(context, R$color.layer_floor_1));
        frameLayout.addView(this.largeButton);
        return frameLayout;
    }

    private final View createShadowView(Context context) {
        int color = a.getColor(context, R$color.graphic_neutral);
        View view = new View(context);
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, color}));
        view.setAlpha(getCorrectAlpha(context));
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, ResourceExtKt.toPx(12)));
        return view;
    }

    private final float getCorrectAlpha(Context context) {
        return ThemeExtKt.isDarkThemeActive(context) ? 0.12f : 0.6f;
    }

    public final void appendButton(@NotNull ViewGroup container) {
        this.largeButton = createButton(Nk.a.a(container, "container", "getContext(...)"));
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.buttonContainer = createButtonContainer(context);
        Context context2 = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (!ThemeExtKt.isDarkThemeActive(context2)) {
            Context context3 = container.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            View createShadowView = createShadowView(context3);
            this.shadowView = createShadowView;
            container.addView(createShadowView);
        }
        container.addView(this.buttonContainer);
        container.setBackgroundColor(a.getColor(container.getContext(), R$color.transparent));
    }

    public final void bindOrGone(@NotNull Function1<? super AtomAction, Unit> actionHandler, ButtonV3Atom.LargeButton buttonAtom, boolean isEnabled, boolean isSelect) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (isSelect && !isEnabled) {
            buttonAtom = null;
        }
        LargeButtonView largeButtonView = this.largeButton;
        if (largeButtonView != null) {
            LargeButtonHolderKt.bindOrGone(largeButtonView, buttonAtom, actionHandler);
        }
    }

    public final FrameLayout getButtonContainer() {
        return this.buttonContainer;
    }

    public final void remove(@NotNull ViewGroup bottomContainer) {
        Intrinsics.checkNotNullParameter(bottomContainer, "bottomContainer");
        bottomContainer.removeView(this.buttonContainer);
        bottomContainer.removeView(this.shadowView);
        FrameLayout frameLayout = this.buttonContainer;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.buttonContainer = null;
        this.largeButton = null;
        this.shadowView = null;
    }
}
