package ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.presentation;

import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.C5353y0;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.presentation.OrderToursChangeFormWidgetViewHolder;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonTextInputView;
import ru.ozon.app.android.travel.utils.DebouncedTextWatcher;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010$\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010 \u001a\u00060\u001ej\u0002`\u001f2\u000e\u0010#\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010'R\u0016\u0010(\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u0004\u0018\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u0004\u0018\u00010-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u0004\u0018\u00010-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0016\u00102\u001a\u0004\u0018\u0001018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/presentation/OrderToursChangeFormWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/presentation/OrderToursChangeFormVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/presentation/OrderToursChangeFormViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/presentation/OrderToursChangeFormViewModel;LWZ/l;)V", "", "count", "length", "", "setTextCounter", "(II)Ljava/lang/String;", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/presentation/OrderToursChangeFormVO;Ll20/d;)V", "onAttach", "()V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/presentation/OrderToursChangeFormVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/presentation/OrderToursChangeFormViewModel;", "LWZ/l;", "maxTextLength", "I", "Landroid/view/ViewGroup;", "parent", "Landroid/view/ViewGroup;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "subtitle", "Lru/ozon/app/android/travel/molecules/view/commonInput/v1/view/CommonTextInputView;", "input", "Lru/ozon/app/android/travel/molecules/view/commonInput/v1/view/CommonTextInputView;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderToursChangeFormWidgetViewHolder extends k<OrderToursChangeFormVO> {
    private final CommonTextInputView input;
    private int maxTextLength;
    private final ViewGroup parent;
    private final TextAtomView subtitle;
    private final TextAtomView title;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final OrderToursChangeFormViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderToursChangeFormWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull OrderToursChangeFormViewModel viewModel, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Window window;
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        ViewGroup viewGroup = containerView instanceof ViewGroup ? (ViewGroup) containerView : null;
        this.parent = viewGroup;
        View view = viewGroup != null ? ViewGroupExtKt.get(viewGroup, 0) : null;
        this.title = view instanceof TextAtomView ? (TextAtomView) view : null;
        View view2 = viewGroup != null ? ViewGroupExtKt.get(viewGroup, 1) : null;
        this.subtitle = view2 instanceof TextAtomView ? (TextAtomView) view2 : null;
        KeyEvent.Callback callback = viewGroup != null ? ViewGroupExtKt.get(viewGroup, 2) : null;
        CommonTextInputView commonTextInputView = callback instanceof CommonTextInputView ? (CommonTextInputView) callback : null;
        this.input = commonTextInputView;
        r a11 = references.getContainer().a();
        if (a11 != null && (window = a11.getWindow()) != null) {
            window.getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: zT.b
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view3, WindowInsets windowInsets) {
                    WindowInsets lambda$1$lambda$0;
                    lambda$1$lambda$0 = OrderToursChangeFormWidgetViewHolder.lambda$1$lambda$0(OrderToursChangeFormWidgetViewHolder.this, view3, windowInsets);
                    return lambda$1$lambda$0;
                }
            });
        }
        if (commonTextInputView != null) {
            commonTextInputView.setTextWatcher(new DebouncedTextWatcher(250L, null, new OrderToursChangeFormWidgetViewHolder$2$1(this, commonTextInputView), 2, null));
            AppCompatTextView appCompatTextView = commonTextInputView.getBinding().commonInputTextInputErrorTv;
            appCompatTextView.setTextAppearance(R$style.TextStyle_Body_M);
            Context context = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            appCompatTextView.setTextColor(ThemeExtKt.themeColor(context, R$attr.textOriginalpriceAvailable));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets lambda$1$lambda$0(OrderToursChangeFormWidgetViewHolder orderToursChangeFormWidgetViewHolder, View view, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        C5353y0 u11 = C5353y0.u(view, insets);
        Intrinsics.checkNotNullExpressionValue(u11, "toWindowInsetsCompat(...)");
        orderToursChangeFormWidgetViewHolder.viewModel.updateKeyBoardVisibleFlag(u11.p(8));
        return view.onApplyWindowInsets(insets);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String setTextCounter(int count, int length) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(count);
        sb2.append('/');
        sb2.append(length);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.viewModel.setTextLiveData().observe(this, new OrderToursChangeFormWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new OrderToursChangeFormWidgetViewHolder$onAttach$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderToursChangeFormVO item, @NotNull d info) {
        Integer maxLength;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView textAtomView = this.title;
        if (textAtomView != null) {
            TextAtomHolderKt.bind$default(textAtomView, item.getTitle(), null, 2, null);
        }
        TextAtomView textAtomView2 = this.subtitle;
        if (textAtomView2 != null) {
            TextAtomHolderKt.bind$default(textAtomView2, item.getInfo(), null, 2, null);
        }
        CommonTextInputView commonTextInputView = this.input;
        if (commonTextInputView != null && (maxLength = item.getInput().getMaxLength()) != null) {
            int intValue = maxLength.intValue();
            this.maxTextLength = intValue;
            AppCompatTextView commonInputTextInputErrorTv = commonTextInputView.getBinding().commonInputTextInputErrorTv;
            Intrinsics.checkNotNullExpressionValue(commonInputTextInputErrorTv, "commonInputTextInputErrorTv");
            commonInputTextInputErrorTv.setVisibility(0);
            commonTextInputView.getBinding().commonInputTextInputErrorTv.setText(setTextCounter(commonTextInputView.getValue().length(), intValue));
        }
        this.viewModel.init(item.getInput().getName(), item.getInput().getValue());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull OrderToursChangeFormVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((OrderToursChangeFormWidgetViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
