package ru.ozon.app.android.cml.delivery.widgets.input.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.o;
import Sc.s;
import Vg.d;
import WZ.l;
import WZ.t;
import Wc.a;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.H;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cml.delivery.common.ext.CommonControlSettingsExtKt;
import ru.ozon.app.android.cml.delivery.common.ext.OzonTextInputLayoutExtKt;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.watcher.MoneyInputTextWatcher;
import ru.ozon.app.android.cml.delivery.widgets.input.presentation.InputWidgetVO;
import ru.ozon.app.android.cml.delivery.widgets.input.presentation.InputWidgetViewHolder;
import ru.ozon.app.android.cml.delivery.widgets.input.presentation.keyboard.KeyboardKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.cell.text.TextFieldCellApi;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 82\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00018B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u0010*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\u0010*\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u0012J\u000f\u0010\u001e\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010\u001f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001f\u0010\u0012J\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010\u0012J\u000f\u0010%\u001a\u00020\u0010H\u0016¢\u0006\u0004\b%\u0010\u0012J3\u0010,\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010(\u001a\u00060&j\u0002`'2\u000e\u0010+\u001a\n\u0018\u00010)j\u0004\u0018\u0001`*H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R \u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0010018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00069"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputContainerView;", "containerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputContainerView;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;)V", "", "listenKeyboardVisibility", "()V", "item", "bindInput", "(Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO;)V", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO$InputConfig;", "config", "bindEditText", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO$InputConfig;)V", "bindLabel", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO;)V", "sendInputValue", "setupWidget", "cleanupWidget", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO;Ll20/d;)V", "onAttach", "onDetach", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputContainerView;", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getInput", "()Lru/ozon/uni/android/cell/text/TextFieldCellView;", "input", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InputWidgetViewHolder extends k<InputWidgetVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final InputContainerView containerView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetViewHolder$Companion;", "", "<init>", "()V", "ACCEPTED_MONEY_LETTERS", "", "KEY_INPUT", "INPUT_LABEL_LOCATOR", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputWidgetViewHolder(@NotNull InputContainerView containerView, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new InputWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    private final void bindEditText(TextFieldCellView textFieldCellView, InputWidgetVO.InputConfig inputConfig) {
        Integer maxLength = inputConfig.getMaxLength();
        OzonTextInputLayoutExtKt.getEditText(textFieldCellView.getMainView()).setFilters(maxLength != null ? new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(maxLength.intValue())} : new InputFilter[0]);
        if (inputConfig instanceof InputWidgetVO.InputConfig.Money) {
            if (!(textFieldCellView.getMainView().getTextWatcher() instanceof MoneyInputTextWatcher)) {
                textFieldCellView.getMainView().setTextWatcher(new MoneyInputTextWatcher());
            }
            OzonTextInputLayoutExtKt.getEditText(textFieldCellView.getMainView()).setKeyListener(DigitsKeyListener.getInstance("0123456789\u2009"));
        } else {
            if (!(inputConfig instanceof InputWidgetVO.InputConfig.RawText)) {
                throw new o();
            }
            textFieldCellView.getMainView().setTextWatcher(null);
            OzonTextInputLayoutExtKt.getEditText(textFieldCellView.getMainView()).setInputType(16385);
        }
    }

    private final void bindInput(InputWidgetVO item) {
        TextFieldCellView input = getInput();
        String value = item.getValue();
        if (value == null) {
            value = "";
        }
        input.setInputText(value);
        String placeholder = item.getPlaceholder();
        input.setInputLabelText(placeholder != null ? placeholder : "");
        input.setInputState(item.getState());
        input.setInputStatus(item.getStatus());
        input.setInputKeyboardType(item.getConfig().getKeyboardType());
        input.inputHasInfo(item.getTooltipAction() != null, new InputWidgetViewHolder$bindInput$1$1(item, this));
        input.inputCanReset(item.getTooltipAction() != null);
        bindLabel(input, item);
        bindEditText(input, item.getConfig());
    }

    private final void bindLabel(TextFieldCellView textFieldCellView, InputWidgetVO inputWidgetVO) {
        String message = inputWidgetVO.getMessage();
        if (message == null || message.length() == 0) {
            textFieldCellView.getAddonView().setContentDescription("");
            textFieldCellView.setLabelText(null);
            textFieldCellView.getAddonView().setVisibility(8);
        } else {
            Context context = textFieldCellView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextFieldCellApi.DefaultImpls.setLabelColor$default(textFieldCellView, ResourceExtKt.color(context, inputWidgetVO.getMessageColor().getResId()), 0.0f, 2, null);
            textFieldCellView.getAddonView().setContentDescription("inputLabel");
            textFieldCellView.setLabelText(inputWidgetVO.getMessage());
            textFieldCellView.getAddonView().setVisibility(0);
        }
    }

    private final void cleanupWidget() {
        OzonTextInputLayout mainView = getInput().getMainView();
        mainView.setTextWatcher(null);
        OzonTextInputLayoutExtKt.getEditText(mainView).setOnFocusChangeListener(null);
        OzonTextInputLayoutExtKt.getEditText(mainView).setOnEditorActionListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextFieldCellView getInput() {
        return this.containerView.getInput();
    }

    private final void listenKeyboardVisibility() {
        final InterfaceC2395h o11 = C2399j.o(C5427n.a(KeyboardKt.keyboardVisibilityChanges(this.refs.getContainer().a()), getLifecycle(), AbstractC5434v.b.STARTED));
        C2399j.C(new C2408n0(new InterfaceC2395h<Boolean>() { // from class: ru.ozon.app.android.cml.delivery.widgets.input.presentation.InputWidgetViewHolder$listenKeyboardVisibility$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.cml.delivery.widgets.input.presentation.InputWidgetViewHolder$listenKeyboardVisibility$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.cml.delivery.widgets.input.presentation.InputWidgetViewHolder$listenKeyboardVisibility$$inlined$filter$1$2", f = "InputWidgetViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.cml.delivery.widgets.input.presentation.InputWidgetViewHolder$listenKeyboardVisibility$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (!((Boolean) obj).booleanValue()) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super Boolean> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new InputWidgetViewHolder$listenKeyboardVisibility$2(this, null)), H.a(getLifecycle()));
    }

    private final void sendInputValue() {
        CommonControlSettings common;
        InputWidgetVO boundData = getBoundData();
        AtomAction atomAction$default = (boundData == null || (common = boundData.getCommon()) == null) ? null : CommonControlSettingsExtKt.atomAction$default(common, null, 1, null);
        if (atomAction$default instanceof AtomAction.ComposerAction) {
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) atomAction$default;
            Map<String, String> params = composerAction.getParams();
            if (params == null) {
                params = U.c();
            }
            LinkedHashMap u11 = U.u(params);
            Editable inputText = getInput().getInputText();
            String obj = inputText != null ? inputText.toString() : null;
            String str = "";
            if (obj == null) {
                obj = "";
            }
            InputWidgetVO boundData2 = getBoundData();
            InputWidgetVO.InputConfig config = boundData2 != null ? boundData2.getConfig() : null;
            if (config instanceof InputWidgetVO.InputConfig.Money) {
                StringBuilder sb2 = new StringBuilder();
                int length = obj.length();
                for (int i11 = 0; i11 < length; i11++) {
                    char charAt = obj.charAt(i11);
                    if (Character.isDigit(charAt)) {
                        sb2.append(charAt);
                    }
                }
                str = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
            } else if (config instanceof InputWidgetVO.InputConfig.RawText) {
                str = obj;
            }
            u11.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str);
            atomAction$default = AtomAction.ComposerAction.copy$default(composerAction, null, null, u11, null, null, 27, null);
        }
        if (atomAction$default != null) {
            this.actionHandler.invoke(atomAction$default);
        }
    }

    private final void setupWidget() {
        final View.OnFocusChangeListener onFocusChangeListener = OzonTextInputLayoutExtKt.getEditText(getInput().getMainView()).getOnFocusChangeListener();
        OzonTextInputLayoutExtKt.getEditText(getInput().getMainView()).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: Qp.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                InputWidgetViewHolder.setupWidget$lambda$4(onFocusChangeListener, this, view, z11);
            }
        });
        OzonTextInputLayoutExtKt.getEditText(getInput().getMainView()).setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: Qp.b
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean z11;
                z11 = InputWidgetViewHolder.setupWidget$lambda$5(InputWidgetViewHolder.this, textView, i11, keyEvent);
                return z11;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupWidget$lambda$4(View.OnFocusChangeListener onFocusChangeListener, InputWidgetViewHolder inputWidgetViewHolder, View view, boolean z11) {
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z11);
        }
        if (z11) {
            return;
        }
        inputWidgetViewHolder.sendInputValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupWidget$lambda$5(InputWidgetViewHolder inputWidgetViewHolder, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 6) {
            return false;
        }
        KeyboardUtilsKt.hideKeyboard(OzonTextInputLayoutExtKt.getEditText(inputWidgetViewHolder.getInput().getMainView()));
        return false;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        listenKeyboardVisibility();
        setupWidget();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        cleanupWidget();
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull InputWidgetVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.bind(item);
        bindInput(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull InputWidgetVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((InputWidgetViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = CommonControlSettingsExtKt.getTokenizedEvent(item.getCommon(), Long.valueOf(item.getId()));
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
