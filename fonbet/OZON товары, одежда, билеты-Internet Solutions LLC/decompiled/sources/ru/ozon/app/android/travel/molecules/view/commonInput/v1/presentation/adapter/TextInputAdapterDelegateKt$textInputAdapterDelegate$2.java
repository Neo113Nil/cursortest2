package ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.adapter;

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
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.molecules.extensions.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.input.v1.InputPayload;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonTextInputView;
import ru.ozon.app.android.travel.utils.DebouncedTextWatcher;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/molecules/view/commonInput/v1/view/CommonTextInputView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TextInputAdapterDelegateKt$textInputAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<CommonInputVO.TextCommonInputVO, TypedViewBinding<CommonTextInputView>>, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ Function1<CommonInputVO.TextCommonInputVO, c> $onSetFormatWatcher;
    final /* synthetic */ InterfaceC6511n<Long, String, CharSequence, Unit> $onTextInputChanged;
    final /* synthetic */ l $tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "hasFocus", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.adapter.TextInputAdapterDelegateKt$textInputAdapterDelegate$2$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<Boolean, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<CommonInputVO.TextCommonInputVO, TypedViewBinding<CommonTextInputView>> $this_adapterDelegateViewBinding;
        final /* synthetic */ l $tokenizedAnalytics;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(AdapterDelegateViewBindingViewHolder<CommonInputVO.TextCommonInputVO, TypedViewBinding<CommonTextInputView>> adapterDelegateViewBindingViewHolder, l lVar) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$tokenizedAnalytics = lVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            l lVar;
            l lVar2;
            if (z11) {
                t clickEvent = this.$this_adapterDelegateViewBinding.getItem().getClickEvent();
                if (clickEvent == null || (lVar2 = this.$tokenizedAnalytics) == null) {
                    return;
                }
                TokenizedAnalyticsExtensionsKt.processEventsWithFilterNonView$default(lVar2, clickEvent, null, 2, null);
                return;
            }
            t focusLostEvent = this.$this_adapterDelegateViewBinding.getItem().getFocusLostEvent();
            if (focusLostEvent == null || (lVar = this.$tokenizedAnalytics) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processEventsWithFilterNonView$default(lVar, focusLostEvent, null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "payload", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.adapter.TextInputAdapterDelegateKt$textInputAdapterDelegate$2$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function1<CommonInputVO.TextCommonInputVO, c> $onSetFormatWatcher;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<CommonInputVO.TextCommonInputVO, TypedViewBinding<CommonTextInputView>> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(AdapterDelegateViewBindingViewHolder<CommonInputVO.TextCommonInputVO, TypedViewBinding<CommonTextInputView>> adapterDelegateViewBindingViewHolder, Function1<? super CommonInputVO.TextCommonInputVO, ? extends c> function1) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$onSetFormatWatcher = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            CommonTextInputView constraintLayout = this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout();
            Function1<CommonInputVO.TextCommonInputVO, c> function1 = this.$onSetFormatWatcher;
            AdapterDelegateViewBindingViewHolder<CommonInputVO.TextCommonInputVO, TypedViewBinding<CommonTextInputView>> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            CommonTextInputView commonTextInputView = constraintLayout;
            if (payload.contains(InputPayload.CHANGE_VALUE)) {
                commonTextInputView.setFormatWatcher(function1 != null ? function1.invoke(adapterDelegateViewBindingViewHolder.getItem()) : null);
                commonTextInputView.updateValue(adapterDelegateViewBindingViewHolder.getItem());
                return;
            }
            if (payload.contains(InputPayload.ERROR)) {
                commonTextInputView.bindError(adapterDelegateViewBindingViewHolder.getItem());
                return;
            }
            if (payload.contains(InputPayload.CHANGE_VALUE_WITH_ERROR)) {
                commonTextInputView.setFormatWatcher(function1 != null ? function1.invoke(adapterDelegateViewBindingViewHolder.getItem()) : null);
                commonTextInputView.updateValue(adapterDelegateViewBindingViewHolder.getItem());
                commonTextInputView.bindError(adapterDelegateViewBindingViewHolder.getItem());
            } else {
                commonTextInputView.setFormatWatcher(function1 != null ? function1.invoke(adapterDelegateViewBindingViewHolder.getItem()) : null);
                CommonTextInputView.bind$default(commonTextInputView, adapterDelegateViewBindingViewHolder.getItem(), false, 2, null);
                commonTextInputView.setFocus(adapterDelegateViewBindingViewHolder.getItem().getFocusOnMount(), new TextInputAdapterDelegateKt$textInputAdapterDelegate$2$4$1$1(adapterDelegateViewBindingViewHolder));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TextInputAdapterDelegateKt$textInputAdapterDelegate$2(InterfaceC6511n<? super Long, ? super String, ? super CharSequence, Unit> interfaceC6511n, Function1<? super AtomAction, Unit> function1, l lVar, Function1<? super CommonInputVO.TextCommonInputVO, ? extends c> function12) {
        super(1);
        this.$onTextInputChanged = interfaceC6511n;
        this.$actionHandler = function1;
        this.$tokenizedAnalytics = lVar;
        this.$onSetFormatWatcher = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<CommonInputVO.TextCommonInputVO, TypedViewBinding<CommonTextInputView>> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<CommonInputVO.TextCommonInputVO, TypedViewBinding<CommonTextInputView>> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.getBinding().getConstraintLayout().setTextWatcher(new DebouncedTextWatcher(0L, null, new AnonymousClass1(adapterDelegateViewBinding, this.$onTextInputChanged, this.$actionHandler), 3, null));
        adapterDelegateViewBinding.getBinding().getConstraintLayout().getBinding().commonInputTextInputMtil.addOnFocusChangeListener(new AnonymousClass3(adapterDelegateViewBinding, this.$tokenizedAnalytics));
        adapterDelegateViewBinding.bind(new AnonymousClass4(adapterDelegateViewBinding, this.$onSetFormatWatcher));
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.adapter.TextInputAdapterDelegateKt$textInputAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<CharSequence, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
        final /* synthetic */ InterfaceC6511n<Long, String, CharSequence, Unit> $onTextInputChanged;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<CommonInputVO.TextCommonInputVO, TypedViewBinding<CommonTextInputView>> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<CommonInputVO.TextCommonInputVO, TypedViewBinding<CommonTextInputView>> adapterDelegateViewBindingViewHolder, InterfaceC6511n<? super Long, ? super String, ? super CharSequence, Unit> interfaceC6511n, Function1<? super AtomAction, Unit> function1) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$onTextInputChanged = interfaceC6511n;
            this.$actionHandler = function1;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CharSequence charSequence) {
            String c12;
            Function1<AtomAction, Unit> function1;
            AtomAction onChange = this.$this_adapterDelegateViewBinding.getItem().getOnChange();
            if (onChange != null && (function1 = this.$actionHandler) != null) {
                function1.invoke(onChange);
            }
            c cVar = this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout().get_formatWatcher();
            if (cVar != null && (c12 = cVar.b().c1()) != null) {
                charSequence = c12;
            }
            InterfaceC6511n<Long, String, CharSequence, Unit> interfaceC6511n = this.$onTextInputChanged;
            if (interfaceC6511n != null) {
                interfaceC6511n.invoke(Long.valueOf(this.$this_adapterDelegateViewBinding.getItem().getId()), this.$this_adapterDelegateViewBinding.getItem().getValue(), charSequence);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke2(charSequence);
            return Unit.f71690a;
        }
    }
}
