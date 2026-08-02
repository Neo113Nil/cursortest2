package ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.imagetitle;

import CG.c;
import Ck.a;
import WZ.t;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.v3.flashsale.StockBarHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.databinding.WidgetBlackFridayStatusImageTitleBinding;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.TimerBinder;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.model.ImageVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.uikit.view.atoms.flashsale.StockBarView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010!\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c2\u000e\u0010 \u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/imagetitle/BlackFridayStatusImageTitleViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/imagetitle/ImageTitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/storage/startupArgs/StartupArgsService;)V", "item", "", "bindLeftImage", "(Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/imagetitle/ImageTitleVO;)V", "configureLeftImage", "()V", "configureTitleImage", "", "isSmallScreen", "()Z", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/imagetitle/ImageTitleVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/imagetitle/ImageTitleVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/util/Size;", "smallLeftImageSize", "Landroid/util/Size;", "smallTitleImageSize", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/TimerBinder;", "timerBinder", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/TimerBinder;", "Lru/ozon/app/android/marketing/databinding/WidgetBlackFridayStatusImageTitleBinding;", "binding", "Lru/ozon/app/android/marketing/databinding/WidgetBlackFridayStatusImageTitleBinding;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BlackFridayStatusImageTitleViewHolder extends k<ImageTitleVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetBlackFridayStatusImageTitleBinding binding;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final Size smallLeftImageSize;

    @NotNull
    private final Size smallTitleImageSize;

    @NotNull
    private final StartupArgsService startupArgsService;

    @NotNull
    private final TimerBinder timerBinder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackFridayStatusImageTitleViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull StartupArgsService startupArgsService) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(startupArgsService, "startupArgsService");
        this.refs = refs;
        this.startupArgsService = startupArgsService;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.smallLeftImageSize = new Size(ResourceExtKt.toPx(48, getContext()), ResourceExtKt.toPx(48, getContext()));
        this.smallTitleImageSize = new Size(ResourceExtKt.toPx(84, getContext()), ResourceExtKt.toPx(16, getContext()));
        this.timerBinder = new TimerBinder(this, startupArgsService, null, 4, null);
        WidgetBlackFridayStatusImageTitleBinding bind = WidgetBlackFridayStatusImageTitleBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        configureLeftImage();
        configureTitleImage();
    }

    private final void bindLeftImage(ImageTitleVO item) {
        AppCompatImageView appCompatImageView = this.binding.leftIv;
        Intrinsics.f(appCompatImageView);
        ViewExtKt.showOrGone(appCompatImageView, Boolean.valueOf(item.getLeftImageDynamicSize() || !isSmallScreen()));
        if (ViewExtKt.isVisible(appCompatImageView)) {
            ImageViewExtKt.load$default(appCompatImageView, item.getLeftImage().getLink(), null, null, null, null, false, null, 126, null);
        }
    }

    private final void configureLeftImage() {
        AppCompatImageView appCompatImageView = this.binding.leftIv;
        appCompatImageView.setOnClickListener(new a(this, 13));
        if (isSmallScreen()) {
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = this.smallLeftImageSize.getWidth();
            layoutParams.height = this.smallLeftImageSize.getHeight();
            appCompatImageView.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureLeftImage$lambda$4$lambda$2(BlackFridayStatusImageTitleViewHolder blackFridayStatusImageTitleViewHolder, View view) {
        ImageVO leftImage;
        AtomAction action;
        ImageTitleVO boundedData = blackFridayStatusImageTitleViewHolder.getBoundedData();
        if (boundedData == null || (leftImage = boundedData.getLeftImage()) == null || (action = leftImage.getAction()) == null) {
            return;
        }
        blackFridayStatusImageTitleViewHolder.actionHandler.invoke(action);
    }

    private final void configureTitleImage() {
        AppCompatImageView appCompatImageView = this.binding.titleIv;
        appCompatImageView.setOnClickListener(new c(this, 14));
        if (isSmallScreen()) {
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = this.smallTitleImageSize.getWidth();
            layoutParams.height = this.smallTitleImageSize.getHeight();
            appCompatImageView.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureTitleImage$lambda$7$lambda$5(BlackFridayStatusImageTitleViewHolder blackFridayStatusImageTitleViewHolder, View view) {
        ImageVO titleImage;
        AtomAction action;
        ImageTitleVO boundedData = blackFridayStatusImageTitleViewHolder.getBoundedData();
        if (boundedData == null || (titleImage = boundedData.getTitleImage()) == null || (action = titleImage.getAction()) == null) {
            return;
        }
        blackFridayStatusImageTitleViewHolder.actionHandler.invoke(action);
    }

    private final boolean isSmallScreen() {
        return getContext().getResources().getConfiguration().smallestScreenWidthDp < 375;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ImageTitleVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetBlackFridayStatusImageTitleBinding widgetBlackFridayStatusImageTitleBinding = this.binding;
        bindLeftImage(item);
        AppCompatImageView titleIv = widgetBlackFridayStatusImageTitleBinding.titleIv;
        Intrinsics.checkNotNullExpressionValue(titleIv, "titleIv");
        ImageViewExtKt.load$default(titleIv, item.getTitleImage().getLink(), null, null, null, null, false, null, 126, null);
        this.timerBinder.bind(item.getTimer());
        StockBarView stockBarV = widgetBlackFridayStatusImageTitleBinding.stockBarV;
        Intrinsics.checkNotNullExpressionValue(stockBarV, "stockBarV");
        StockBarHolderKt.bindOrGone(stockBarV, item.getStockBar(), this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ImageTitleVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
