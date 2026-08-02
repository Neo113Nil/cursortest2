package ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.texttitle;

import FK.a;
import W10.c;
import WZ.t;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.data.button.SwitchingButton;
import ru.ozon.app.android.atoms.v3.flashsale.StockBarHolderKt;
import ru.ozon.app.android.atoms.v3.holders.switchingButton.SwitchingButtonView;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.databinding.WidgetBlackFridayStatusTextTitleBinding;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.data.ButtonWithTitle;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.TimerBinder;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.model.ImageVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate.BaseSwitchingButtonDelegate;
import ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate.SwitchingButtonDelegate;
import ru.ozon.app.android.uikit.view.atoms.flashsale.StockBarView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\u000e\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000e0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/texttitle/BlackFridayStatusTextTitleViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/texttitle/TextTitleLayoutVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/ui/switchingbutton/switchingbuttondelegate/SwitchingButtonDelegate;", "switchingButtonDelegate", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ui/switchingbutton/switchingbuttondelegate/SwitchingButtonDelegate;Lru/ozon/app/android/storage/startupArgs/StartupArgsService;)V", "", "configureLeftImage", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/texttitle/TextTitleLayoutVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/texttitle/TextTitleLayoutVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onAttach", "onDetach", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ui/switchingbutton/switchingbuttondelegate/SwitchingButtonDelegate;", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "", "IMAGE_SIZE", "I", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/marketing/databinding/WidgetBlackFridayStatusTextTitleBinding;", "binding", "Lru/ozon/app/android/marketing/databinding/WidgetBlackFridayStatusTextTitleBinding;", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/TimerBinder;", "timerBinder", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/TimerBinder;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BlackFridayStatusTextTitleViewHolder extends k<TextTitleLayoutVO> {
    private final int IMAGE_SIZE;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetBlackFridayStatusTextTitleBinding binding;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final StartupArgsService startupArgsService;

    @NotNull
    private final SwitchingButtonDelegate switchingButtonDelegate;

    @NotNull
    private final TimerBinder timerBinder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackFridayStatusTextTitleViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull SwitchingButtonDelegate switchingButtonDelegate, @NotNull StartupArgsService startupArgsService) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(switchingButtonDelegate, "switchingButtonDelegate");
        Intrinsics.checkNotNullParameter(startupArgsService, "startupArgsService");
        this.refs = refs;
        this.switchingButtonDelegate = switchingButtonDelegate;
        this.startupArgsService = startupArgsService;
        this.IMAGE_SIZE = ResourceExtKt.toPx(100);
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        WidgetBlackFridayStatusTextTitleBinding bind = WidgetBlackFridayStatusTextTitleBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.timerBinder = new TimerBinder(this, startupArgsService, new BlackFridayStatusTextTitleViewHolder$timerBinder$1(this));
        configureLeftImage();
        switchingButtonDelegate.init(refs, this);
    }

    private final void configureLeftImage() {
        AppCompatImageView appCompatImageView = this.binding.leftIv;
        appCompatImageView.setOnClickListener(new a(this, 18));
        ViewExtKt.showOrGone(appCompatImageView, Boolean.valueOf(appCompatImageView.getContext().getResources().getConfiguration().smallestScreenWidthDp >= 375));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureLeftImage$lambda$2$lambda$1(BlackFridayStatusTextTitleViewHolder blackFridayStatusTextTitleViewHolder, View view) {
        ImageVO leftImage;
        AtomAction action;
        TextTitleLayoutVO boundedData = blackFridayStatusTextTitleViewHolder.getBoundedData();
        if (boundedData == null || (leftImage = boundedData.getLeftImage()) == null || (action = leftImage.getAction()) == null) {
            return;
        }
        blackFridayStatusTextTitleViewHolder.actionHandler.invoke(action);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        SwitchingButtonDelegate switchingButtonDelegate = this.switchingButtonDelegate;
        SwitchingButtonView switchingBtn = this.binding.switchingBtn;
        Intrinsics.checkNotNullExpressionValue(switchingBtn, "switchingBtn");
        switchingButtonDelegate.attach(switchingBtn);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.switchingButtonDelegate.detach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TextTitleLayoutVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetBlackFridayStatusTextTitleBinding widgetBlackFridayStatusTextTitleBinding = this.binding;
        AppCompatImageView leftIv = widgetBlackFridayStatusTextTitleBinding.leftIv;
        Intrinsics.checkNotNullExpressionValue(leftIv, "leftIv");
        if (ViewExtKt.isVisible(leftIv)) {
            AppCompatImageView leftIv2 = widgetBlackFridayStatusTextTitleBinding.leftIv;
            Intrinsics.checkNotNullExpressionValue(leftIv2, "leftIv");
            String link = item.getLeftImage().getLink();
            int i11 = this.IMAGE_SIZE;
            ImageViewExtKt.load$default(leftIv2, link, null, null, null, new ImageSize(i11, i11), false, null, 110, null);
        }
        TextAtomView titleTav = widgetBlackFridayStatusTextTitleBinding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextAtomHolderKt.bind$default(titleTav, item.getTitle(), null, 2, null);
        TextAtomView subtitleTav = widgetBlackFridayStatusTextTitleBinding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        TextAtomHolderKt.bindOrGone$default(subtitleTav, item.getSubtitle(), null, 2, null);
        StockBarView stockBarV = widgetBlackFridayStatusTextTitleBinding.stockBarV;
        Intrinsics.checkNotNullExpressionValue(stockBarV, "stockBarV");
        StockBarHolderKt.bindOrGone$default(stockBarV, item.getStockBar(), null, 2, null);
        TextAtomView btnSubtitleTav = widgetBlackFridayStatusTextTitleBinding.btnSubtitleTav;
        Intrinsics.checkNotNullExpressionValue(btnSubtitleTav, "btnSubtitleTav");
        ButtonWithTitle button = item.getButton();
        TextAtomHolderKt.bindOrGone$default(btnSubtitleTav, button != null ? button.getTitle() : null, null, 2, null);
        SwitchingButtonDelegate switchingButtonDelegate = this.switchingButtonDelegate;
        ButtonWithTitle button2 = item.getButton();
        SwitchingButton button3 = button2 != null ? button2.getButton() : null;
        SwitchingButtonView switchingBtn = widgetBlackFridayStatusTextTitleBinding.switchingBtn;
        Intrinsics.checkNotNullExpressionValue(switchingBtn, "switchingBtn");
        BaseSwitchingButtonDelegate.bind$default(switchingButtonDelegate, button3, switchingBtn, false, 4, null);
        this.timerBinder.bind(item.getTimer());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TextTitleLayoutVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
