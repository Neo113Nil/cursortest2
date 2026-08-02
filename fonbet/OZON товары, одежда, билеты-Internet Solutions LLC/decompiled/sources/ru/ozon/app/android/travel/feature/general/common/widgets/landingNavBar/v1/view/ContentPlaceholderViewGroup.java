package ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.view;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0015\u001a\u00020\t2\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\t0\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001cJ!\u0010!\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R.\u0010\u0014\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/view/ContentPlaceholderViewGroup;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "settings", "", "bindIslandSettings", "(Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;)V", "", "width", "height", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Lkotlin/Function2;", "onPlaceholderSizeChanged", "setOnSizeChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "Ll10/i;", "container", "setupNestedWidgetManager", "(Ll10/i;)V", "onWidgetCreated", "()V", "onWidgetDestroyed", "islandSettings", "Lru/ozon/composer/ui/widget/l;", "viewItem", "bind", "(Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;Lru/ozon/composer/ui/widget/l;)V", "", "alpha", "updateAlpha", "(F)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/view/PlaceholderViewImpl;", "contentPlaceholder", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/view/PlaceholderViewImpl;", "Landroid/view/View;", "islandView", "Landroid/view/View;", "", "isIslandViewVisible", "Z", "topIslandRadius", "F", "bottomIslandRadius", "Lkotlin/jvm/functions/Function2;", "Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable$delegate", "LSc/j;", "getGradientDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContentPlaceholderViewGroup extends LinearLayout {
    private float bottomIslandRadius;

    @NotNull
    private final PlaceholderViewImpl contentPlaceholder;

    /* renamed from: gradientDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j gradientDrawable;
    private boolean isIslandViewVisible;

    @NotNull
    private final View islandView;
    private Function2<? super Integer, ? super Integer, Unit> onPlaceholderSizeChanged;
    private float topIslandRadius;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentPlaceholderViewGroup(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        PlaceholderViewImpl placeholderViewImpl = new PlaceholderViewImpl(context, "contentPlaceholder");
        this.contentPlaceholder = placeholderViewImpl;
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        view.setVisibility(8);
        this.islandView = view;
        this.gradientDrawable = LazyUtilsKt.unsafeLazy(ContentPlaceholderViewGroup$gradientDrawable$2.INSTANCE);
        setOrientation(1);
        LinearLayout placeholderView = placeholderViewImpl.getPlaceholderView();
        placeholderView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(placeholderView);
        addView(view);
    }

    private final void bindIslandSettings(TravelWidgetSettingsVO settings) {
        View view = this.islandView;
        this.topIslandRadius = settings.getCorners().getTopRadius();
        this.bottomIslandRadius = settings.getCorners().getBottomRadius();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i11 = (int) (this.topIslandRadius + this.bottomIslandRadius);
        if (layoutParams.height != i11) {
            layoutParams.height = i11;
        }
        view.setLayoutParams(layoutParams);
        view.setPadding(settings.getPaddings().getLeftPadding(), settings.getPaddings().getTopPadding(), settings.getPaddings().getRightPadding(), settings.getPaddings().getBottomPadding());
        GradientDrawable gradientDrawable = getGradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{settings.getCorners().getTopRadius(), settings.getCorners().getTopRadius(), settings.getCorners().getTopRadius(), settings.getCorners().getTopRadius(), settings.getCorners().getBottomRadius(), settings.getCorners().getBottomRadius(), settings.getCorners().getBottomRadius(), settings.getCorners().getBottomRadius()});
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, settings.getBackgroundColor());
        gradientDrawable.setColor(parseColor != null ? parseColor.intValue() : 0);
        view.setBackground(gradientDrawable);
    }

    private final GradientDrawable getGradientDrawable() {
        return (GradientDrawable) this.gradientDrawable.getValue();
    }

    public final void bind(TravelWidgetSettingsVO islandSettings, l viewItem) {
        this.contentPlaceholder.bind(viewItem);
        boolean z11 = islandSettings != null;
        this.isIslandViewVisible = z11;
        this.islandView.setVisibility(z11 ? 0 : 8);
        if (islandSettings != null) {
            bindIslandSettings(islandSettings);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        Function2<? super Integer, ? super Integer, Unit> function2 = this.onPlaceholderSizeChanged;
        if (function2 != null) {
            function2.invoke(null, Integer.valueOf(height));
        }
        super.onSizeChanged(width, height, oldw, oldh);
    }

    public final void onWidgetCreated() {
        this.contentPlaceholder.onWidgetCreated();
    }

    public final void onWidgetDestroyed() {
        this.contentPlaceholder.onWidgetDestroyed();
    }

    public void setOnSizeChangeListener(@NotNull Function2<? super Integer, ? super Integer, Unit> onPlaceholderSizeChanged) {
        Intrinsics.checkNotNullParameter(onPlaceholderSizeChanged, "onPlaceholderSizeChanged");
        this.onPlaceholderSizeChanged = onPlaceholderSizeChanged;
    }

    public final void setupNestedWidgetManager(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.contentPlaceholder.setupNestedWidgetManager(container);
    }

    public final void updateAlpha(float alpha) {
        this.contentPlaceholder.getPlaceholderView().setAlpha(alpha);
        if (this.isIslandViewVisible) {
            float d11 = h.d(1 - (alpha * 7.0f), 0.0f, 1.0f);
            this.islandView.setTranslationY(r1.getHeight() * d11);
            float f7 = this.topIslandRadius;
            if (f7 == 0.0f && this.bottomIslandRadius == 0.0f) {
                return;
            }
            float f11 = f7 - (f7 * d11);
            float f12 = this.bottomIslandRadius;
            float f13 = f12 - (d11 * f12);
            getGradientDrawable().setCornerRadii(new float[]{f11, f11, f11, f11, f13, f13, f13, f13});
        }
    }
}
