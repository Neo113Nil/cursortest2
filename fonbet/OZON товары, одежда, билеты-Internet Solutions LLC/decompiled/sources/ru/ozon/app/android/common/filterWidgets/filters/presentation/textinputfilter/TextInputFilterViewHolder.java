package ru.ozon.app.android.common.filterWidgets.filters.presentation.textinputfilter;

import Ar.c;
import Ar.d;
import Rq.a;
import WZ.t;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.TextInputFilterRefreshHandler;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.textinputfilter.TextInputFilterVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetFiltersTextInputFilterBinding;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J#\u0010!\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00022\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010\u0016J\u000f\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010\u0016J3\u0010+\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00022\n\u0010'\u001a\u00060%j\u0002`&2\u000e\u0010*\u001a\n\u0018\u00010(j\u0004\u0018\u0001`)H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R \u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u000e008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/textinputfilter/TextInputFilterViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/textinputfilter/TextInputFilterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersTextInputFilterBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/TextInputFilterRefreshHandler;", "customRefreshHandler", "<init>", "(Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersTextInputFilterBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/common/filterWidgets/filters/presentation/TextInputFilterRefreshHandler;)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "bindTitle", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "bindIcon", "(Lru/ozon/uni/atoms/data/button/Icon;)V", "onTitleClick", "()V", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/textinputfilter/TextInputFilterVO$Input;", "input", "bindInput", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/textinputfilter/TextInputFilterVO$Input;)Lkotlin/Unit;", "text", "onInputTextChange", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/textinputfilter/TextInputFilterVO;Ll20/d;)V", "onAttach", "onDetach", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/textinputfilter/TextInputFilterVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersTextInputFilterBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/TextInputFilterRefreshHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/textinputfilter/DebouncedTextWatcher;", "inputTextListener", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/textinputfilter/DebouncedTextWatcher;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextInputFilterViewHolder extends k<TextInputFilterVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetFiltersTextInputFilterBinding binding;

    @NotNull
    private final TextInputFilterRefreshHandler customRefreshHandler;

    @NotNull
    private final DebouncedTextWatcher inputTextListener;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextInputFilterViewHolder(@NotNull WidgetFiltersTextInputFilterBinding binding, @NotNull ComposerReferences refs, @NotNull TextInputFilterRefreshHandler customRefreshHandler) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customRefreshHandler, "customRefreshHandler");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.customRefreshHandler = customRefreshHandler;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.inputTextListener = new DebouncedTextWatcher(0L, new TextInputFilterViewHolder$inputTextListener$1(this), 1, null);
        int i11 = 4;
        binding.titleTv.setOnClickListener(new c(this, i11));
        binding.iconIv.setOnClickListener(new d(this, i11));
        binding.inputEt.setOnEditorActionListener(new a());
    }

    private final void bindIcon(Icon icon) {
        ImageView imageView = this.binding.iconIv;
        Intrinsics.f(imageView);
        ImageViewExtKt.loadImageOrGone(imageView, icon != null ? icon.getImage() : null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(imageView, styleParser.parseColor(context, icon != null ? icon.getTintColor() : null));
    }

    private final Unit bindInput(TextInputFilterVO.Input input) {
        WidgetFiltersTextInputFilterBinding widgetFiltersTextInputFilterBinding = this.binding;
        AppCompatTextView prefixTv = widgetFiltersTextInputFilterBinding.prefixTv;
        Intrinsics.checkNotNullExpressionValue(prefixTv, "prefixTv");
        TextViewExtKt.setTextOrGone(prefixTv, input.getPrefix());
        widgetFiltersTextInputFilterBinding.inputEt.setHint(input.getPlaceholder());
        widgetFiltersTextInputFilterBinding.inputEt.setText(input.getValue());
        String value = input.getValue();
        if (value == null) {
            return null;
        }
        widgetFiltersTextInputFilterBinding.inputEt.setSelection(value.length());
        return Unit.f71690a;
    }

    private final void bindTitle(String title) {
        WidgetFiltersTextInputFilterBinding widgetFiltersTextInputFilterBinding = this.binding;
        AppCompatTextView titleTv = widgetFiltersTextInputFilterBinding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextViewExtKt.setTextOrGone(titleTv, title);
        View titleAnchor = widgetFiltersTextInputFilterBinding.titleAnchor;
        Intrinsics.checkNotNullExpressionValue(titleAnchor, "titleAnchor");
        ViewExtKt.showOrGoneByPresence(titleAnchor, title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$3$lambda$2(TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 6) {
            return false;
        }
        Intrinsics.f(textView);
        KeyboardUtilsKt.hideKeyboard(textView);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInputTextChange(String text) {
        TextInputFilterVO.Input input;
        AtomActionDTO action;
        AtomAction atomAction;
        TextInputFilterVO boundedData = getBoundedData();
        if (boundedData == null || (input = boundedData.getInput()) == null || Intrinsics.d(text, input.getValue()) || (action = input.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, input.getTrackingInfo())) == null) {
            return;
        }
        this.customRefreshHandler.invoke2(atomAction, text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTitleClick() {
        AtomAction atomAction;
        TextInputFilterVO boundedData = getBoundedData();
        if (boundedData != null) {
            AtomActionDTO action = boundedData.getAction();
            if (action != null && (atomAction = AtomActionMapperKt.toAtomAction(action, boundedData.getTrackingInfo())) != null) {
                this.actionHandler.invoke(atomAction);
            }
            t tokenizedEvent = boundedData.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
            }
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.binding.inputEt.addTextChangedListener(this.inputTextListener);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.binding.inputEt.removeTextChangedListener(this.inputTextListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TextInputFilterVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.customRefreshHandler.bind(item.getOriginalUrl(), Long.valueOf(item.getId()), this.actionHandler);
        bindTitle(item.getTitle());
        bindIcon(item.getIcon());
        bindInput(item.getInput());
        View separator = this.binding.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        ViewExtKt.showOrGone(separator, Boolean.valueOf(item.getShowSeparator()));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TextInputFilterVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((TextInputFilterViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
