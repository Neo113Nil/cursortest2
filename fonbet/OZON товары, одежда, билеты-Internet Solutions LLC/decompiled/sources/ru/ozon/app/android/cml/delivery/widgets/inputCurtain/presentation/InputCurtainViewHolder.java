package ru.ozon.app.android.cml.delivery.widgets.inputCurtain.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Hv.a;
import Sc.o;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.view.View;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cml.delivery.common.ext.WidgetExtKt;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.InputMoleculeVO;
import ru.ozon.app.android.cml.delivery.widgets.inputCurtain.presentation.view.InputCurtainView;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 B2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001BB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001bH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001bH\u0016¢\u0006\u0004\b(\u0010'J)\u0010-\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001b068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R$\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001b06j\u0002`98\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R&\u0010<\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001b0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/InputCurtainViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/InputCurtainVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/view/InputCurtainView;", "containerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/InputCurtainViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/view/InputCurtainView;LWZ/l;Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/InputCurtainViewModel;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "addInputValue", "(Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;)Lru/ozon/uni/atoms/af/AtomAction;", "price", "addDeclaredPrice", "item", "", "validateInputValue", "(Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/InputCurtainVO;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "", "isValidateDeclaredPrice", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Z", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onAttach", "()V", "onDetach", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/InputCurtainVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/InputCurtainVO;Ll20/d;)V", "Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/view/InputCurtainView;", "LWZ/l;", "Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/InputCurtainViewModel;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/action/BuildedActionHandler;", "buttonActionHandler", "Lkotlin/Function2;", "validateDeclaredPriceActionHandler", "Lkotlin/jvm/functions/Function2;", "inputValue", "Ljava/lang/String;", "isEditMode", "Z", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InputCurtainViewHolder extends k<InputCurtainVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function1<AtomAction, Unit> buttonActionHandler;

    @NotNull
    private final InputCurtainView containerView;
    private String inputValue;
    private boolean isEditMode;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final Function2<String, AtomAction, Unit> validateDeclaredPriceActionHandler;

    @NotNull
    private final InputCurtainViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/InputCurtainViewHolder$Companion;", "", "<init>", "()V", "KEY_INPUT", "", "KEY_DECLARED_PRICE", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputCurtainViewHolder(@NotNull InputCurtainView containerView, @NotNull l tokenizedAnalytics, @NotNull InputCurtainViewModel viewModel, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new InputCurtainViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.buttonActionHandler = new InputCurtainViewHolder$buttonActionHandler$1(this);
        this.validateDeclaredPriceActionHandler = new InputCurtainViewHolder$validateDeclaredPriceActionHandler$1(this);
        OzonTextInputLayout mainView = containerView.getInputView().getInput().getMainView();
        mainView.setOnClickListener(new a(2, mainView, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AtomAction addDeclaredPrice(AtomAction action, String price) {
        if (!(action instanceof AtomAction.ComposerAction)) {
            return action;
        }
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
        if (!isValidateDeclaredPrice(composerAction)) {
            return action;
        }
        Tc.d builder = new Tc.d();
        Map<String, String> params = composerAction.getParams();
        if (params == null) {
            params = U.c();
        }
        builder.putAll(params);
        builder.put("declaredPrice", price);
        Unit unit = Unit.f71690a;
        Intrinsics.checkNotNullParameter(builder, "builder");
        return AtomAction.ComposerAction.copy$default(composerAction, null, null, builder.u(), null, null, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AtomAction addInputValue(AtomAction action, String value) {
        InputCurtainVO boundData = getBoundData();
        if (!(action instanceof AtomAction.ComposerAction)) {
            return action;
        }
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
        Map<String, String> params = composerAction.getParams();
        if (params == null) {
            params = U.c();
        }
        LinkedHashMap u11 = U.u(params);
        boolean z11 = this.isEditMode;
        String str = AppMeasurementSdk.ConditionalUserProperty.VALUE;
        if (z11 && boundData != null) {
            InputMoleculeVO.InputConfig config = boundData.getInput().getConfig();
            if (config instanceof InputMoleculeVO.InputConfig.Money) {
                str = "declaredValue";
            } else if (config instanceof InputMoleculeVO.InputConfig.RawText) {
                str = "parcelDescription";
            } else if (!(config instanceof InputMoleculeVO.InputConfig.Digital)) {
                throw new o();
            }
        }
        if (value == null) {
            value = "";
        }
        u11.put(str, value);
        return AtomAction.ComposerAction.copy$default(composerAction, null, null, u11, null, null, 27, null);
    }

    private final boolean isValidateDeclaredPrice(AtomAction.ComposerAction composerAction) {
        return Intrinsics.d(composerAction.getId(), "validateDeclaredPrice") || Intrinsics.d(composerAction.getId(), "validateOrderDeclaredPrice");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$lambda$0(OzonTextInputLayout ozonTextInputLayout, InputCurtainViewHolder inputCurtainViewHolder, View view) {
        t inputTokenizedEvent;
        ozonTextInputLayout.getInputViewGroup().getInputView().requestFocus();
        InputCurtainVO boundData = inputCurtainViewHolder.getBoundData();
        if (boundData == null || (inputTokenizedEvent = boundData.getInputTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(inputCurtainViewHolder.tokenizedAnalytics, inputTokenizedEvent, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttachViewModel$bindUpdate(InputCurtainView inputCurtainView, InputCurtainUpdate inputCurtainUpdate, kotlin.coroutines.d dVar) {
        inputCurtainView.bindUpdate(inputCurtainUpdate);
        return Unit.f71690a;
    }

    private final void validateInputValue(InputCurtainVO item) {
        AtomAction action;
        String str = this.inputValue;
        if (str == null || (action = item.getInput().getAction()) == null) {
            return;
        }
        this.validateDeclaredPriceActionHandler.invoke(str, action);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        InputCurtainView inputCurtainView = this.containerView;
        inputCurtainView.onAttach();
        inputCurtainView.getInputView().setOnTextChanged(new InputCurtainViewHolder$onAttach$1$1(this));
        inputCurtainView.getInputView().setOnDelayedAction(new InputCurtainViewHolder$onAttach$1$2(this));
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        C2399j.C(new C2408n0(this.viewModel.getInputCurtainUpdate(), new InputCurtainViewHolder$onAttachViewModel$1(this.containerView)), K.a(lifecycle));
        C2399j.C(new C2408n0(this.viewModel.getExecutingAction(), new InputCurtainViewHolder$onAttachViewModel$2(this, null)), K.a(lifecycle));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.containerView.onDetach();
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull InputCurtainVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.isEditMode = WidgetExtKt.isEditMode(info);
        String str = this.inputValue;
        if (str == null) {
            str = item.getInput().getValue();
        }
        this.inputValue = str;
        this.containerView.bind(item, str, this.buttonActionHandler);
        validateInputValue(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull InputCurtainVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((InputCurtainViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
        t inputTokenizedEvent = item.getInputTokenizedEvent();
        if (inputTokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, inputTokenizedEvent, null);
        }
    }
}
