package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.titlesubtitle;

import Il.a;
import WZ.e;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.Y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.search.databinding.ItemSuggestionsTitleSubtitleCellBinding;
import ru.ozon.app.android.search.widgets.suggestions.ui.common.SuggestionsActionHandlerFactory;
import ru.ozon.app.android.search.widgets.suggestions.ui.common.SuggestionsCommonVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.controls.button.IconButtonView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.v3.holders.controls.button.IconButtonHolderKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 '2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001'B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J#\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000e0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/titlesubtitle/SuggestionsTitleSubtitleViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/titlesubtitle/SuggestionsTitleSubtitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/search/databinding/ItemSuggestionsTitleSubtitleCellBinding;", "binding", "LWZ/l;", "tokenizedAnalytics", "LWZ/e;", "pageIdModifier", "Lru/ozon/app/android/search/widgets/suggestions/ui/common/SuggestionsActionHandlerFactory;", "suggestionsActionHandlerFactory", "<init>", "(Lru/ozon/app/android/search/databinding/ItemSuggestionsTitleSubtitleCellBinding;LWZ/l;LWZ/e;Lru/ozon/app/android/search/widgets/suggestions/ui/common/SuggestionsActionHandlerFactory;)V", "", "setBackgroundColor", "()V", "Landroidx/appcompat/widget/AppCompatTextView;", "updateMargins", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "action", "LWZ/t;", "getTokenizedEvent", "(Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;)LWZ/t;", "onViewInVisibleBounds", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/titlesubtitle/SuggestionsTitleSubtitleVO;Ll20/d;)V", "Lru/ozon/app/android/search/databinding/ItemSuggestionsTitleSubtitleCellBinding;", "LWZ/l;", "LWZ/e;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionsTitleSubtitleViewHolder extends k<SuggestionsTitleSubtitleVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemSuggestionsTitleSubtitleCellBinding binding;

    @NotNull
    private final e pageIdModifier;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int TEXT_MULTILINE_MARGIN = UiExtKt.toPx(11);
    private static final int TEXT_ONE_LINE_MARGIN = UiExtKt.toPx(14);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/titlesubtitle/SuggestionsTitleSubtitleViewHolder$Companion;", "", "<init>", "()V", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SuggestionsTitleSubtitleViewHolder(@NotNull ItemSuggestionsTitleSubtitleCellBinding binding, @NotNull l tokenizedAnalytics, @NotNull e pageIdModifier, @NotNull SuggestionsActionHandlerFactory suggestionsActionHandlerFactory) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(pageIdModifier, "pageIdModifier");
        Intrinsics.checkNotNullParameter(suggestionsActionHandlerFactory, "suggestionsActionHandlerFactory");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.pageIdModifier = pageIdModifier;
        this.actionHandler = suggestionsActionHandlerFactory.createActionHandler(this, pageIdModifier, new SuggestionsTitleSubtitleViewHolder$actionHandler$1(this));
        this.itemView.setOnClickListener(new a(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(SuggestionsTitleSubtitleViewHolder suggestionsTitleSubtitleViewHolder, View view) {
        SuggestionsCommonVO common;
        AtomAction action;
        SuggestionsTitleSubtitleVO boundData = suggestionsTitleSubtitleViewHolder.getBoundData();
        if (boundData == null || (common = boundData.getCommon()) == null || (action = common.getAction()) == null) {
            return;
        }
        suggestionsTitleSubtitleViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t getTokenizedEvent(AtomAction.SendAnalytics action) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        SuggestionsTitleSubtitleVO boundedData = getBoundedData();
        if (boundedData == null || (trackingInfo = action.getTrackingInfo()) == null) {
            return null;
        }
        return TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(boundedData.getId()), null, 2, null);
    }

    private final void setBackgroundColor() {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        SuggestionsTitleSubtitleVO boundData = getBoundData();
        Integer parseColor = styleParser.parseColor(context, boundData != null ? boundData.getBackgroundColor() : null);
        if (parseColor != null) {
            this.binding.getConstraintLayout().setBackgroundColor(parseColor.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003a, code lost:
    
        if (r0 != r4) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r0 != r4) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateMargins(AppCompatTextView appCompatTextView) {
        int i11;
        boolean z11 = false;
        if (appCompatTextView.getLineCount() == 1) {
            ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i12 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
            i11 = TEXT_ONE_LINE_MARGIN;
        }
        if (appCompatTextView.getLineCount() > 1) {
            ViewGroup.LayoutParams layoutParams2 = appCompatTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i13 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
            i11 = TEXT_MULTILINE_MARGIN;
        }
        i11 = TEXT_ONE_LINE_MARGIN;
        if (z11) {
            ViewGroup.LayoutParams layoutParams3 = appCompatTextView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, i11, marginLayoutParams3.rightMargin, i11);
            appCompatTextView.setLayoutParams(marginLayoutParams3);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        SuggestionsCommonVO common;
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        SuggestionsTitleSubtitleVO boundedData = getBoundedData();
        if (boundedData == null || (common = boundedData.getCommon()) == null || (tokenizedEvent = common.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents(this.tokenizedAnalytics, tokenizedEvent, this.pageIdModifier);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SuggestionsTitleSubtitleVO item, @NotNull d info) {
        TestInfo testInfo;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        View view = this.itemView;
        SuggestionsCommonVO common = item.getCommon();
        view.setContentDescription((common == null || (testInfo = common.getTestInfo()) == null) ? null : testInfo.getAutomatizationId());
        setBackgroundColor();
        final AppCompatTextView appCompatTextView = this.binding.suggestionTitle;
        appCompatTextView.setText(item.getTitle().getText());
        TestInfo testInfo2 = item.getTitle().getTestInfo();
        appCompatTextView.setContentDescription(testInfo2 != null ? testInfo2.getAutomatizationId() : null);
        int i11 = Y.f42258g;
        if (!appCompatTextView.isLaidOut() || appCompatTextView.isLayoutRequested()) {
            appCompatTextView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.titlesubtitle.SuggestionsTitleSubtitleViewHolder$bind$lambda$5$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    SuggestionsTitleSubtitleViewHolder suggestionsTitleSubtitleViewHolder = SuggestionsTitleSubtitleViewHolder.this;
                    Intrinsics.f(appCompatTextView);
                    suggestionsTitleSubtitleViewHolder.updateMargins(appCompatTextView);
                }
            });
        } else {
            updateMargins(appCompatTextView);
        }
        IconButtonView suggestionRemoveButton = this.binding.suggestionRemoveButton;
        Intrinsics.checkNotNullExpressionValue(suggestionRemoveButton, "suggestionRemoveButton");
        IconButtonHolderKt.bindOrGone(suggestionRemoveButton, item.getRemoveButton(), this.actionHandler);
        View suggestionTitleSeparator = this.binding.suggestionTitleSeparator;
        Intrinsics.checkNotNullExpressionValue(suggestionTitleSeparator, "suggestionTitleSeparator");
        ViewExtKt.showOrGone(suggestionTitleSeparator, Boolean.valueOf(item.getLayoutModel().getHasSeparator()));
        ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.updatePadding$default(constraintLayout, 0, item.getLayoutModel().getPaddingTop(), 0, item.getLayoutModel().getPaddingBottom(), 5, null);
    }
}
