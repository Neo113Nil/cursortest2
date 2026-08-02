package ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.sendButton;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Sc.s;
import WZ.l;
import WZ.t;
import Wc.a;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.widgets.feedbackForm.common.CustomSearchAnalyticsData;
import ru.ozon.app.android.search.widgets.feedbackForm.common.FeedbackAnalyticDelegate;
import ru.ozon.app.android.search.widgets.feedbackForm.common.FeedbackSharedViewModel;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.FeedbackFormV2ViewModel;
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

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010%R\u0018\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00160*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/sendButton/FeedbackSendButtonV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/sendButton/FeedbackSendButtonV2VO;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "view", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/FeedbackFormV2ViewModel;", "viewModel", "Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackSharedViewModel;", "feedbackSharedViewModel", "Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackAnalyticDelegate;", "feedbackAnalyticDelegate", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;Lru/ozon/app/android/composer/ComposerNavigator;Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/FeedbackFormV2ViewModel;Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackSharedViewModel;Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackAnalyticDelegate;LWZ/l;)V", "", "buttonHeight", "", "updateWidgetLayoutParams", "(I)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/sendButton/FeedbackSendButtonV2VO;Ll20/d;)V", "onRecycle", "()V", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/FeedbackFormV2ViewModel;", "Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackSharedViewModel;", "Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackAnalyticDelegate;", "LWZ/l;", "", "isSubmitSent", "Z", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeedbackSendButtonV2ViewHolder extends k<FeedbackSendButtonV2VO> {

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
    private final l tokenizedAnalytics;

    @NotNull
    private final ButtonV3View view;

    @NotNull
    private final FeedbackFormV2ViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int WIDGET_MARGIN = ResourceExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isActive", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.sendButton.FeedbackSendButtonV2ViewHolder$1", f = "FeedbackSendButtonV2ViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.sendButton.FeedbackSendButtonV2ViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Boolean, d<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = FeedbackSendButtonV2ViewHolder.this.new AnonymousClass1(dVar);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            boolean z11 = this.Z$0;
            ButtonV3View buttonV3View = FeedbackSendButtonV2ViewHolder.this.view;
            buttonV3View.setDisabled(!z11);
            if (z11) {
                buttonV3View.setStyle(ButtonV3DTO.StyleTypes.ACTION_PRIMARY);
            }
            return Unit.f71690a;
        }

        public final Object invoke(boolean z11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(LA00/a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.sendButton.FeedbackSendButtonV2ViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<A00.a, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(A00.a aVar) {
            invoke2(aVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(A00.a aVar) {
            if (aVar instanceof a.u.b) {
                FeedbackSendButtonV2ViewHolder.this.navigator.popBackStack();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/sendButton/FeedbackSendButtonV2ViewHolder$Companion;", "", "<init>", "()V", "WIDGET_MARGIN", "", "getWIDGET_MARGIN", "()I", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getWIDGET_MARGIN() {
            return FeedbackSendButtonV2ViewHolder.WIDGET_MARGIN;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackSendButtonV2ViewHolder(@NotNull ComposerReferences refs, @NotNull ButtonV3View view, @NotNull ComposerNavigator navigator, @NotNull FeedbackFormV2ViewModel viewModel, @NotNull FeedbackSharedViewModel feedbackSharedViewModel, @NotNull FeedbackAnalyticDelegate feedbackAnalyticDelegate, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(feedbackSharedViewModel, "feedbackSharedViewModel");
        Intrinsics.checkNotNullParameter(feedbackAnalyticDelegate, "feedbackAnalyticDelegate");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.navigator = navigator;
        this.viewModel = viewModel;
        this.feedbackSharedViewModel = feedbackSharedViewModel;
        this.feedbackAnalyticDelegate = feedbackAnalyticDelegate;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).onPreProcess(new FeedbackSendButtonV2ViewHolder$actionHandler$1(this)).customAnalyticHandler(FeedbackSendButtonV2ViewHolder$actionHandler$2.INSTANCE).buildHandler();
        C2399j.C(new C2408n0(C5427n.a(viewModel.getButtonState(), U7.d.c(refs), AbstractC5434v.b.STARTED), new AnonymousClass1(null)), K.a(refs.getContainer().g()));
        refs.getController().getEvents().observe(refs.getContainer().g(), new FeedbackSendButtonV2ViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2()));
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
        FeedbackSendButtonV2VO boundData;
        CellDTO.CenterBlock centerBlock;
        CellDTO.CellText title;
        AtomActionDTO action;
        AtomActionDTO action2;
        super.onRecycle();
        if (this.isSubmitSent || this.viewModel.isAutoDismissCell() || (boundData = getBoundData()) == null) {
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
    public void bind(@NotNull FeedbackSendButtonV2VO item, @NotNull l20.d info) {
        ButtonV3DTO.Sizes size;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ButtonV3View buttonV3View = this.view;
        ButtonV3HolderKt.bindOrGone(buttonV3View, item.getButton(), this.actionHandler);
        int i11 = 0;
        buttonV3View.setVisibility(this.viewModel.isCellSelected() && item.getButton() != null ? 0 : 8);
        ButtonV3DTO button = item.getButton();
        if (button != null && (size = button.getSize()) != null) {
            i11 = size.getHeight();
        }
        updateWidgetLayoutParams(i11);
        buttonV3View.setDisabled(this.viewModel.isCustomCellWithoutText());
    }
}
