package ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.sendButton;

import A00.a;
import WZ.l;
import WZ.t;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.widgets.feedbackForm.common.CustomSearchAnalyticsData;
import ru.ozon.app.android.search.widgets.feedbackForm.common.FeedbackAnalyticDelegate;
import ru.ozon.app.android.search.widgets.feedbackForm.common.FeedbackSharedViewModel;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.FeedbackFormViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 22\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00012BC\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0018\u0010\u0012\u001a\u00060\u0010j\u0002`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R \u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00170.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/sendButton/FeedbackSendButtonViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/sendButton/FeedbackSendButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "view", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/FeedbackFormViewModel;", "viewModel", "Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackSharedViewModel;", "feedbackSharedViewModel", "Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackAnalyticDelegate;", "feedbackAnalyticDelegate", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;Lru/ozon/app/android/composer/ComposerNavigator;Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/FeedbackFormViewModel;Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackSharedViewModel;Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackAnalyticDelegate;LWZ/l;)V", "", "buttonHeight", "", "updateWidgetLayoutParams", "(I)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/sendButton/FeedbackSendButtonVO;Ll20/d;)V", "onRecycle", "()V", "Lru/ozon/app/android/composer/ComposerReferences;", "getRefs", "()Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/FeedbackFormViewModel;", "Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackSharedViewModel;", "Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackAnalyticDelegate;", "LWZ/l;", "", "isSubmitSent", "Z", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeedbackSendButtonViewHolder extends k<FeedbackSendButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final FeedbackAnalyticDelegate feedbackAnalyticDelegate;

    @NotNull
    private final FeedbackSharedViewModel feedbackSharedViewModel;
    private boolean isSubmitSent;

    @NotNull
    private final ComposerNavigator navigator;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ButtonV3View view;

    @NotNull
    private final FeedbackFormViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int WIDGET_MARGIN = ResourceExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isActive", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.sendButton.FeedbackSendButtonViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            ButtonV3View buttonV3View = FeedbackSendButtonViewHolder.this.view;
            buttonV3View.setDisabled(!bool.booleanValue());
            if (bool.booleanValue()) {
                buttonV3View.setStyle(ButtonV3DTO.StyleTypes.ACTION_PRIMARY);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(LA00/a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.sendButton.FeedbackSendButtonViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<a, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(a aVar) {
            invoke2(aVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(a aVar) {
            if (aVar instanceof a.u.b) {
                FeedbackSendButtonViewHolder.this.navigator.popBackStack();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/sendButton/FeedbackSendButtonViewHolder$Companion;", "", "<init>", "()V", "WIDGET_MARGIN", "", "getWIDGET_MARGIN", "()I", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getWIDGET_MARGIN() {
            return FeedbackSendButtonViewHolder.WIDGET_MARGIN;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackSendButtonViewHolder(@NotNull ComposerReferences refs, @NotNull ButtonV3View view, @NotNull ComposerNavigator navigator, @NotNull FeedbackFormViewModel viewModel, @NotNull FeedbackSharedViewModel feedbackSharedViewModel, @NotNull FeedbackAnalyticDelegate feedbackAnalyticDelegate, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(feedbackSharedViewModel, "feedbackSharedViewModel");
        Intrinsics.checkNotNullParameter(feedbackAnalyticDelegate, "feedbackAnalyticDelegate");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.refs = refs;
        this.view = view;
        this.navigator = navigator;
        this.viewModel = viewModel;
        this.feedbackSharedViewModel = feedbackSharedViewModel;
        this.feedbackAnalyticDelegate = feedbackAnalyticDelegate;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).onPreProcess(new FeedbackSendButtonViewHolder$actionHandler$1(this)).customAnalyticHandler(FeedbackSendButtonViewHolder$actionHandler$2.INSTANCE).buildHandler();
        viewModel.getButtonState().observe(refs.getContainer().g(), new FeedbackSendButtonViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
        refs.getController().getEvents().observe(refs.getContainer().g(), new FeedbackSendButtonViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2()));
    }

    private final void updateWidgetLayoutParams(int buttonHeight) {
        ButtonV3View buttonV3View = this.view;
        if (buttonV3View.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams = buttonV3View.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i11 = WIDGET_MARGIN;
            buttonV3View.setMaxHeight(buttonHeight + i11 + i11);
            marginLayoutParams.topMargin = i11;
            marginLayoutParams.bottomMargin = i11;
            buttonV3View.setLayoutParams(marginLayoutParams);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = buttonV3View.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        buttonV3View.setMaxHeight(0);
        int i12 = WIDGET_MARGIN;
        marginLayoutParams2.topMargin = -i12;
        marginLayoutParams2.bottomMargin = -i12;
        buttonV3View.setLayoutParams(marginLayoutParams2);
    }

    @Override // jk0.j
    public void onRecycle() {
        FeedbackSendButtonVO boundData;
        CellDTO.CenterBlock centerBlock;
        CellDTO.CellText title;
        AtomActionDTO action;
        AtomActionDTO action2;
        super.onRecycle();
        if (this.isSubmitSent || (boundData = getBoundData()) == null) {
            return;
        }
        this.feedbackSharedViewModel.hideFeedbackTile();
        FeedbackAnalyticDelegate feedbackAnalyticDelegate = this.feedbackAnalyticDelegate;
        l lVar = this.tokenizedAnalytics;
        t skipTokenizedEvent = boundData.getSkipTokenizedEvent();
        CommonControlSettings customAnalytics = boundData.getCustomAnalytics();
        OzonSpannableString ozonSpannableString = null;
        String link = (customAnalytics == null || (action2 = customAnalytics.getAction()) == null) ? null : action2.getLink();
        CommonControlSettings customAnalytics2 = boundData.getCustomAnalytics();
        Map<String, String> params = (customAnalytics2 == null || (action = customAnalytics2.getAction()) == null) ? null : action.getParams();
        CellDTO selectCell = this.viewModel.getSelectCell();
        if (selectCell != null && (centerBlock = selectCell.getCenterBlock()) != null && (title = centerBlock.getTitle()) != null) {
            ozonSpannableString = title.getText();
        }
        feedbackAnalyticDelegate.sendSkipAnalytics(lVar, skipTokenizedEvent, new CustomSearchAnalyticsData(link, ozonSpannableString, this.viewModel.getOptionText(), params));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FeedbackSendButtonVO item, @NotNull d info) {
        String optionText;
        ButtonV3DTO.Sizes size;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ButtonV3View buttonV3View = this.view;
        ButtonV3HolderKt.bindOrGone(buttonV3View, item.getButton(), this.actionHandler);
        boolean z11 = false;
        buttonV3View.setVisibility(this.viewModel.isCellSelected() ? 0 : 8);
        ButtonV3DTO button = item.getButton();
        updateWidgetLayoutParams((button == null || (size = button.getSize()) == null) ? 0 : size.getHeight());
        if (this.viewModel.isCustomCell() && ((optionText = this.viewModel.getOptionText()) == null || optionText.length() == 0)) {
            z11 = true;
        }
        buttonV3View.setDisabled(z11);
    }
}
