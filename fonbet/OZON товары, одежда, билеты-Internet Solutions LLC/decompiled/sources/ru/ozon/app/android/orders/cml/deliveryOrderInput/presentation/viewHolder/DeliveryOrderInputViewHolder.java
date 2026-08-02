package ru.ozon.app.android.orders.cml.deliveryOrderInput.presentation.viewHolder;

import Bk0.a;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.View;
import fd.InterfaceC6512o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.orders.cml.deliveryOrderInput.presentation.viewItem.DeliveryOrderInputVO;
import ru.ozon.app.android.orders.cml.deliveryOrderInput.presentation.viewItem.InputFieldVO;
import ru.ozon.app.android.orders.cml.deliveryOrderInput.presentation.views.DeliveryOrderInputView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0012*\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0012*\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010#\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00120(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderInput/presentation/viewHolder/DeliveryOrderInputViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orders/cml/deliveryOrderInput/presentation/viewItem/DeliveryOrderInputVO;", "Lru/ozon/app/android/orders/cml/deliveryOrderInput/presentation/views/DeliveryOrderInputView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "<init>", "(Lru/ozon/app/android/orders/cml/deliveryOrderInput/presentation/views/DeliveryOrderInputView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;LVg/d;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "", "handleSubmitButtonClick", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "handleAtomAction", "Lru/ozon/uni/android/textArea/TextAreaView;", "setErrorState", "(Lru/ozon/uni/android/textArea/TextAreaView;)V", "setNeutralState", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/orders/cml/deliveryOrderInput/presentation/viewItem/DeliveryOrderInputVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/orders/cml/deliveryOrderInput/presentation/viewItem/DeliveryOrderInputVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/orders/cml/deliveryOrderInput/presentation/views/DeliveryOrderInputView;", "LWZ/l;", "LVg/d;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryOrderInputViewHolder extends k<DeliveryOrderInputVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final DeliveryOrderInputView view;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<unused var>", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.orders.cml.deliveryOrderInput.presentation.viewHolder.DeliveryOrderInputViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<CharSequence, Integer, Integer, Integer, Unit> {
        AnonymousClass1() {
            super(4);
        }

        @Override // fd.InterfaceC6512o
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return Unit.f71690a;
        }

        public final void invoke(CharSequence charSequence, int i11, int i12, int i13) {
            DeliveryOrderInputViewHolder deliveryOrderInputViewHolder = DeliveryOrderInputViewHolder.this;
            deliveryOrderInputViewHolder.setNeutralState(deliveryOrderInputViewHolder.view.getInputTextView());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryOrderInputViewHolder(@NotNull DeliveryOrderInputView view, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory, @NotNull HandlersInhibitor inhibitor) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.actionHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(inhibitor).customActionHandlers(new DeliveryOrderInputViewHolder$actionHandler$1(this)).buildHandler();
        view.doOnTextChanged(new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$0(DeliveryOrderInputVO deliveryOrderInputVO, DeliveryOrderInputViewHolder deliveryOrderInputViewHolder, View view) {
        AtomActionDTO action;
        AtomAction atomAction;
        CommonControlSettings common = deliveryOrderInputVO.getSubmitButton().getCommon();
        if (common == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, common.getTrackingInfo())) == null) {
            return;
        }
        deliveryOrderInputViewHolder.handleSubmitButtonClick(atomAction);
    }

    private final void handleAtomAction(AtomAction atomAction) {
        Map map = null;
        AtomAction.ComposerAction composerAction = atomAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) atomAction : null;
        if (composerAction != null) {
            Map<String, String> params = composerAction.getParams();
            if (params != null) {
                String inputText = this.view.getInputTextView().getInputText();
                if (inputText == null) {
                    inputText = "";
                }
                map = U.n(params, new Pair("comment", inputText));
            }
            this.actionHandler.invoke(AtomAction.ComposerAction.copy$default(composerAction, null, null, map, null, null, 27, null));
        }
    }

    private final void handleSubmitButtonClick(AtomAction atomAction) {
        InputFieldVO inputField;
        Integer minCount;
        DeliveryOrderInputVO boundData = getBoundData();
        if (boundData == null || (inputField = boundData.getInputField()) == null) {
            return;
        }
        String inputText = this.view.getInputTextView().getInputText();
        if (inputField.getMinCount() == null || ((minCount = inputField.getMinCount()) != null && minCount.intValue() == 0)) {
            handleAtomAction(atomAction);
        } else if (inputText == null || inputText.length() == 0 || inputText.length() < inputField.getMinCount().intValue()) {
            setErrorState(this.view.getInputTextView());
        } else {
            handleAtomAction(atomAction);
        }
    }

    private final void setErrorState(TextAreaView textAreaView) {
        InputFieldVO inputField;
        textAreaView.setStatus(TextAreaView.Status.ERROR);
        DeliveryOrderInputVO boundData = getBoundData();
        textAreaView.setCaption((boundData == null || (inputField = boundData.getInputField()) == null) ? null : inputField.getCountError());
        Context context = textAreaView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textAreaView.setCaptionColor(Integer.valueOf(ResourceExtKt.color(context, UniColors.TEXT_NEGATIVE.getResId())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNeutralState(TextAreaView textAreaView) {
        TextAreaView.Status status = textAreaView.getStatus();
        TextAreaView.Status status2 = TextAreaView.Status.NEUTRAL;
        if (status != status2) {
            textAreaView.setStatus(status2);
            textAreaView.setCaption(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeliveryOrderInputVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        DeliveryOrderInputView deliveryOrderInputView = this.view;
        ButtonV3HolderKt.bind$default(deliveryOrderInputView.getSubmitButton(), item.getSubmitButton(), null, 2, null);
        deliveryOrderInputView.getSubmitButton().setOnClickListener(new a(1, item, this));
        TextAreaView inputTextView = deliveryOrderInputView.getInputTextView();
        inputTextView.setMaxLength(item.getInputField().getMaxCount());
        inputTextView.setLabel(item.getInputField().getInputTitle());
        if (item.getInputField().getValue() != null) {
            inputTextView.setInputText(item.getInputField().getValue());
        }
        inputTextView.setHasInfoIcon(false);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull DeliveryOrderInputVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((DeliveryOrderInputViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
