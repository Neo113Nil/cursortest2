package ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.view;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0015\u001a\u00020\t2\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\t0\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001cJ!\u0010 \u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010&\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R.\u0010\u0014\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/view/FixedPlaceholderViewGroup;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "settings", "", "bindSettings", "(Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;)V", "", "width", "height", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Lkotlin/Function2;", "onPlaceholderSizeChanged", "setOnSizeChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "Ll10/i;", "container", "setupNestedWidgetManager", "(Ll10/i;)V", "onWidgetCreated", "()V", "onWidgetDestroyed", "Lru/ozon/composer/ui/widget/l;", "viewItem", "bind", "(Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;Lru/ozon/composer/ui/widget/l;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/view/PlaceholderViewImpl;", "leftPlaceholder", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/view/PlaceholderViewImpl;", "centerPlaceholder", "rightPlaceholder", "Lkotlin/jvm/functions/Function2;", "Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable$delegate", "LSc/j;", "getGradientDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FixedPlaceholderViewGroup extends LinearLayout {

    @NotNull
    private final PlaceholderViewImpl centerPlaceholder;

    /* renamed from: gradientDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j gradientDrawable;

    @NotNull
    private final PlaceholderViewImpl leftPlaceholder;
    private Function2<? super Integer, ? super Integer, Unit> onPlaceholderSizeChanged;

    @NotNull
    private final PlaceholderViewImpl rightPlaceholder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedPlaceholderViewGroup(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        PlaceholderViewImpl placeholderViewImpl = new PlaceholderViewImpl(context, "topLeftPlaceholder");
        this.leftPlaceholder = placeholderViewImpl;
        PlaceholderViewImpl placeholderViewImpl2 = new PlaceholderViewImpl(context, "topMiddlePlaceholder");
        this.centerPlaceholder = placeholderViewImpl2;
        PlaceholderViewImpl placeholderViewImpl3 = new PlaceholderViewImpl(context, "topRightPlaceholder");
        this.rightPlaceholder = placeholderViewImpl3;
        this.gradientDrawable = LazyUtilsKt.unsafeLazy(FixedPlaceholderViewGroup$gradientDrawable$2.INSTANCE);
        setOrientation(0);
        setGravity(16);
        LinearLayout placeholderView = placeholderViewImpl.getPlaceholderView();
        placeholderView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        placeholderView.setGravity(16);
        addView(placeholderView);
        LinearLayout placeholderView2 = placeholderViewImpl2.getPlaceholderView();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        placeholderView2.setLayoutParams(layoutParams);
        placeholderView2.setGravity(16);
        addView(placeholderView2);
        LinearLayout placeholderView3 = placeholderViewImpl3.getPlaceholderView();
        placeholderView3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        placeholderView3.setGravity(16);
        addView(placeholderView3);
    }

    private final void bindSettings(TravelWidgetSettingsVO settings) {
        setPadding(settings.getPaddings().getLeftPadding(), settings.getPaddings().getTopPadding(), settings.getPaddings().getRightPadding(), settings.getPaddings().getBottomPadding());
        GradientDrawable gradientDrawable = getGradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{settings.getCorners().getTopRadius(), settings.getCorners().getTopRadius(), settings.getCorners().getTopRadius(), settings.getCorners().getTopRadius(), settings.getCorners().getBottomRadius(), settings.getCorners().getBottomRadius(), settings.getCorners().getBottomRadius(), settings.getCorners().getBottomRadius()});
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, settings.getBackgroundColor());
        gradientDrawable.setColor(parseColor != null ? parseColor.intValue() : 0);
        setBackground(gradientDrawable);
    }

    private final GradientDrawable getGradientDrawable() {
        return (GradientDrawable) this.gradientDrawable.getValue();
    }

    public final void bind(TravelWidgetSettingsVO settings, l viewItem) {
        if (settings != null) {
            bindSettings(settings);
        }
        this.leftPlaceholder.bind(viewItem);
        this.centerPlaceholder.bind(viewItem);
        this.rightPlaceholder.bind(viewItem);
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        Function2<? super Integer, ? super Integer, Unit> function2 = this.onPlaceholderSizeChanged;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(height), null);
        }
        super.onSizeChanged(width, height, oldw, oldh);
    }

    public final void onWidgetCreated() {
        this.leftPlaceholder.onWidgetCreated();
        this.centerPlaceholder.onWidgetCreated();
        this.rightPlaceholder.onWidgetCreated();
    }

    public final void onWidgetDestroyed() {
        this.leftPlaceholder.onWidgetDestroyed();
        this.centerPlaceholder.onWidgetDestroyed();
        this.rightPlaceholder.onWidgetDestroyed();
    }

    public void setOnSizeChangeListener(@NotNull Function2<? super Integer, ? super Integer, Unit> onPlaceholderSizeChanged) {
        Intrinsics.checkNotNullParameter(onPlaceholderSizeChanged, "onPlaceholderSizeChanged");
        this.onPlaceholderSizeChanged = onPlaceholderSizeChanged;
    }

    public final void setupNestedWidgetManager(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.leftPlaceholder.setupNestedWidgetManager(container);
        this.centerPlaceholder.setupNestedWidgetManager(container);
        this.rightPlaceholder.setupNestedWidgetManager(container);
    }
}
