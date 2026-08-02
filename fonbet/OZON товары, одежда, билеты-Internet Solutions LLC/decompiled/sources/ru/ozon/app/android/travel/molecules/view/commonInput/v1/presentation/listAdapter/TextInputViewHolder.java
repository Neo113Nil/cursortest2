package ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.listAdapter;

import Em0.c;
import WZ.l;
import WZ.t;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.extensions.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.input.v1.InputPayload;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonTextInputView;
import ru.ozon.app.android.travel.utils.DebouncedTextWatcher;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010Ju\u0010\u001f\u001a\u00020\u000b2\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011j\u0004\u0018\u0001`\u00132\"\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00152\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u00112\u000e\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R*\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011j\u0004\u0018\u0001`\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010&R2\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010'R&\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010&R\u001e\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/commonInput/v1/presentation/listAdapter/TextInputViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "Lru/ozon/app/android/travel/molecules/view/commonInput/v1/view/CommonTextInputView;", "inputView", "<init>", "(Lru/ozon/app/android/travel/molecules/view/commonInput/v1/view/CommonTextInputView;)V", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "item", "", "payloads", "", "bindWithPayloads", "(Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;Ljava/util/List;)V", "", "bind", "(Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;Ljava/util/List;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Lkotlin/Function3;", "", "", "", "onTextInputChanged", "LEm0/c;", "onSetFormatWatcher", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "setupCallbacks", "(Lkotlin/jvm/functions/Function1;Lfd/n;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "removeCallbacks", "()V", "Lru/ozon/app/android/travel/molecules/view/commonInput/v1/view/CommonTextInputView;", "boundedData", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "Lkotlin/jvm/functions/Function1;", "Lfd/n;", "LWZ/l;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextInputViewHolder extends BaseViewHolder<CommonInputVO> {
    private Function1<? super AtomAction, Unit> actionHandler;
    private CommonInputVO.TextCommonInputVO boundedData;

    @NotNull
    private final CommonTextInputView inputView;
    private Function1<? super CommonInputVO.TextCommonInputVO, ? extends c> onSetFormatWatcher;
    private InterfaceC6511n<? super Long, ? super String, ? super CharSequence, Unit> onTextInputChanged;
    private l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "hasFocus", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.listAdapter.TextInputViewHolder$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            t focusLostEvent;
            l lVar;
            t clickEvent;
            l lVar2;
            if (z11) {
                CommonInputVO.TextCommonInputVO textCommonInputVO = TextInputViewHolder.this.boundedData;
                if (textCommonInputVO == null || (clickEvent = textCommonInputVO.getClickEvent()) == null || (lVar2 = TextInputViewHolder.this.tokenizedAnalytics) == null) {
                    return;
                }
                TokenizedAnalyticsExtensionsKt.processEventsWithFilterNonView$default(lVar2, clickEvent, null, 2, null);
                return;
            }
            CommonInputVO.TextCommonInputVO textCommonInputVO2 = TextInputViewHolder.this.boundedData;
            if (textCommonInputVO2 == null || (focusLostEvent = textCommonInputVO2.getFocusLostEvent()) == null || (lVar = TextInputViewHolder.this.tokenizedAnalytics) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processEventsWithFilterNonView$default(lVar, focusLostEvent, null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputViewHolder(@NotNull CommonTextInputView inputView) {
        super(inputView);
        Intrinsics.checkNotNullParameter(inputView, "inputView");
        this.inputView = inputView;
        inputView.setTextWatcher(new DebouncedTextWatcher(0L, null, new AnonymousClass1(), 3, null));
        inputView.getBinding().commonInputTextInputMtil.addOnFocusChangeListener(new AnonymousClass3());
    }

    private final void bindWithPayloads(CommonInputVO.TextCommonInputVO item, List<?> payloads) {
        for (Object obj : payloads) {
            if (obj instanceof List) {
                bindWithPayloads(item, (List) obj);
            } else if (obj == InputPayload.CHANGE_VALUE) {
                if (item.getShouldUpdateValue()) {
                    this.inputView.updateValue(item);
                }
            } else if (obj == InputPayload.ERROR) {
                this.inputView.bindError(item);
            } else if (obj == InputPayload.CHANGE_VALUE_WITH_ERROR) {
                if (item.getShouldUpdateValue()) {
                    this.inputView.updateValue(item);
                }
                this.inputView.bindError(item);
            }
        }
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
    public /* bridge */ /* synthetic */ void bind(CommonInputVO commonInputVO, List list) {
        bind2(commonInputVO, (List<? extends Object>) list);
    }

    public final void removeCallbacks() {
        this.inputView.setFormatWatcher(null);
        this.actionHandler = null;
        this.onTextInputChanged = null;
        this.onSetFormatWatcher = null;
        this.tokenizedAnalytics = null;
    }

    public final void setupCallbacks(Function1<? super AtomAction, Unit> actionHandler, InterfaceC6511n<? super Long, ? super String, ? super CharSequence, Unit> onTextInputChanged, Function1<? super CommonInputVO.TextCommonInputVO, ? extends c> onSetFormatWatcher, l tokenizedAnalytics) {
        this.actionHandler = actionHandler;
        this.onTextInputChanged = onTextInputChanged;
        this.onSetFormatWatcher = onSetFormatWatcher;
        this.tokenizedAnalytics = tokenizedAnalytics;
        CommonInputVO.TextCommonInputVO textCommonInputVO = this.boundedData;
        if (textCommonInputVO != null) {
            this.inputView.setFormatWatcher(onSetFormatWatcher != null ? onSetFormatWatcher.invoke(textCommonInputVO) : null);
        }
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull CommonInputVO item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (item instanceof CommonInputVO.TextCommonInputVO) {
            CommonInputVO.TextCommonInputVO textCommonInputVO = (CommonInputVO.TextCommonInputVO) item;
            this.boundedData = textCommonInputVO;
            if (payloads.isEmpty()) {
                CommonTextInputView.bind$default(this.inputView, textCommonInputVO, false, 2, null);
            } else {
                bindWithPayloads(textCommonInputVO, payloads);
            }
            if (payloads.contains(InputPayload.CHANGE_VALUE)) {
                return;
            }
            this.inputView.setFocus(textCommonInputVO.getFocusOnMount(), new TextInputViewHolder$bind$1(item));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.listAdapter.TextInputViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<CharSequence, Unit> {
        AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CharSequence charSequence) {
            String c12;
            Function1 function1;
            CommonInputVO.TextCommonInputVO textCommonInputVO = TextInputViewHolder.this.boundedData;
            if (textCommonInputVO == null) {
                return;
            }
            AtomAction onChange = textCommonInputVO.getOnChange();
            if (onChange != null && (function1 = TextInputViewHolder.this.actionHandler) != null) {
                function1.invoke(onChange);
            }
            c cVar = TextInputViewHolder.this.inputView.get_formatWatcher();
            if (cVar != null && (c12 = cVar.b().c1()) != null) {
                charSequence = c12;
            }
            InterfaceC6511n interfaceC6511n = TextInputViewHolder.this.onTextInputChanged;
            if (interfaceC6511n != null) {
                interfaceC6511n.invoke(Long.valueOf(textCommonInputVO.getId()), textCommonInputVO.getValue(), charSequence);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke2(charSequence);
            return Unit.f71690a;
        }
    }
}
