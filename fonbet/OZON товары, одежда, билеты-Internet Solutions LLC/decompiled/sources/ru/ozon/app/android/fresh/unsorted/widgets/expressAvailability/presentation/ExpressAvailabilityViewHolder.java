package ru.ozon.app.android.fresh.unsorted.widgets.expressAvailability.presentation;

import W10.c;
import WZ.t;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.unsorted.R$dimen;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetExpressAvailabilityBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 42\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00014B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010!\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00022\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0014¢\u0006\u0004\b!\u0010\"J3\u0010)\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00022\n\u0010%\u001a\u00060#j\u0002`$2\u000e\u0010(\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\n008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/expressAvailability/presentation/ExpressAvailabilityViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/unsorted/widgets/expressAvailability/presentation/ExpressAvailabilityVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "setHeightSpecificData", "()V", "Landroid/util/DisplayMetrics;", "displayMetrics", "setContainerHeight", "(Landroid/util/DisplayMetrics;)V", "", "getContainerHeight", "(Landroid/util/DisplayMetrics;)I", "getDesignHeight", "()I", "getSearchBarHeight", "", "getBottomNavigationHeight", "()F", "screenWidth", "getTextStyle", "(F)I", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/expressAvailability/presentation/ExpressAvailabilityVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/unsorted/widgets/expressAvailability/presentation/ExpressAvailabilityVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetExpressAvailabilityBinding;", "binding", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetExpressAvailabilityBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExpressAvailabilityViewHolder extends k<ExpressAvailabilityVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetExpressAvailabilityBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final ComposerReferences refs;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpressAvailabilityViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.containerView = containerView;
        this.refs = refs;
        WidgetExpressAvailabilityBinding bind = WidgetExpressAvailabilityBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
    }

    private final float getBottomNavigationHeight() {
        return getContext().getResources().getDimension(R$dimen.bottom_navigation_height);
    }

    private final int getContainerHeight(DisplayMetrics displayMetrics) {
        return (int) ((((displayMetrics.heightPixels - getBottomNavigationHeight()) - getDesignHeight()) - getSearchBarHeight()) - ResourceExtKt.getStatusBarHeight(getContext()));
    }

    private final int getDesignHeight() {
        return ResourceExtKt.toPx(getContext(), 60.0f);
    }

    private final int getSearchBarHeight() {
        return ResourceExtKt.toPx(getContext(), 48.0f);
    }

    private final int getTextStyle(float screenWidth) {
        return screenWidth < 360.0f ? R$style.TextStyle_Body_M_Bold : R$style.TextStyle_Body_L_Bold;
    }

    private final void setContainerHeight(DisplayMetrics displayMetrics) {
        int containerHeight = getContainerHeight(displayMetrics);
        ViewGroup.LayoutParams layoutParams = this.containerView.getLayoutParams();
        layoutParams.height = containerHeight;
        this.containerView.setLayoutParams(layoutParams);
    }

    private final void setHeightSpecificData() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        float f7 = displayMetrics.widthPixels / displayMetrics.density;
        setContainerHeight(displayMetrics);
        this.binding.tvDescription.setTextAppearance(getTextStyle(f7));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ExpressAvailabilityVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        setHeightSpecificData();
        ImageView ivImage = this.binding.ivImage;
        Intrinsics.checkNotNullExpressionValue(ivImage, "ivImage");
        ImageViewExtKt.load$default(ivImage, item.getImage(), null, null, null, null, false, null, 126, null);
        this.binding.tvDescription.setText(item.getDescription());
        LargeButtonView btnChangeAddress = this.binding.btnChangeAddress;
        Intrinsics.checkNotNullExpressionValue(btnChangeAddress, "btnChangeAddress");
        LargeButtonHolderKt.bind(btnChangeAddress, item.getChangeAddressButton(), this.actionHandler);
        LargeButtonView btnChangeCategory = this.binding.btnChangeCategory;
        Intrinsics.checkNotNullExpressionValue(btnChangeCategory, "btnChangeCategory");
        LargeButtonHolderKt.bindOrGone(btnChangeCategory, item.getChangeCategoryButton(), this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ExpressAvailabilityVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
