package ru.ozon.app.android.checkoutcomposer.addressPartsInput.presentation;

import Sc.o;
import Vg.d;
import android.text.Editable;
import android.text.InputFilter;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.checkout.databinding.WidgetPostAddressChangerBinding;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.presentation.AddressPartsInputViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001&\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00100\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputVO;", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/checkout/databinding/WidgetPostAddressChangerBinding;", "binding", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/checkout/databinding/WidgetPostAddressChangerBinding;Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel;LVg/d;)V", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel$WidgetState;", "state", "", "handleWidgetState", "(Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel$WidgetState;)V", "", "isLoading", "toggleLoading", "(Z)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "getRef", "()Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/checkout/databinding/WidgetPostAddressChangerBinding;", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel;", "LVg/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "ru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputVH$textWatcher$1", "textWatcher", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputVH$textWatcher$1;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressPartsInputVH extends k<AddressPartsInputVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetPostAddressChangerBinding binding;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final AddressPartsInputVH$textWatcher$1 textWatcher;

    @NotNull
    private final AddressPartsInputViewModel viewModel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.addressPartsInput.presentation.AddressPartsInputVH$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<AddressPartsInputViewModel.WidgetState, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, AddressPartsInputVH.class, "handleWidgetState", "handleWidgetState(Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel$WidgetState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AddressPartsInputViewModel.WidgetState widgetState) {
            invoke2(widgetState);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AddressPartsInputViewModel.WidgetState p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((AddressPartsInputVH) this.receiver).handleWidgetState(p02);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r4v4, types: [ru.ozon.app.android.checkoutcomposer.addressPartsInput.presentation.AddressPartsInputVH$textWatcher$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddressPartsInputVH(@NotNull ComposerReferences ref, @NotNull WidgetPostAddressChangerBinding binding, @NotNull AddressPartsInputViewModel viewModel, @NotNull d customActionHandlersStoreFactory) {
        super(r0);
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.ref = ref;
        this.binding = binding;
        this.viewModel = viewModel;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.actionHandler = new ActionHandler.Builder(ref, this).customActionHandlers(new AddressPartsInputVH$actionHandler$1(this)).buildHandler();
        this.textWatcher = new SimpleTextWatcher() { // from class: ru.ozon.app.android.checkoutcomposer.addressPartsInput.presentation.AddressPartsInputVH$textWatcher$1
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                WidgetPostAddressChangerBinding widgetPostAddressChangerBinding;
                AddressPartsInputViewModel addressPartsInputViewModel;
                Intrinsics.checkNotNullParameter(editable, "editable");
                widgetPostAddressChangerBinding = AddressPartsInputVH.this.binding;
                widgetPostAddressChangerBinding.submitLBV.setEnabled(editable.length() > 0);
                addressPartsInputViewModel = AddressPartsInputVH.this.viewModel;
                addressPartsInputViewModel.setInput(editable.toString());
            }
        };
        viewModel.getWidgetState().observe(ref.getContainer().g(), new AddressPartsInputVH$sam$androidx_lifecycle_Observer$0(new AnonymousClass1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWidgetState(AddressPartsInputViewModel.WidgetState state) {
        if (state instanceof AddressPartsInputViewModel.WidgetState.Dismiss) {
            this.ref.getNavigator().popBackStack();
        } else {
            if (!(state instanceof AddressPartsInputViewModel.WidgetState.Loading)) {
                throw new o();
            }
            toggleLoading(((AddressPartsInputViewModel.WidgetState.Loading) state).getIsLoading());
        }
    }

    private final void toggleLoading(boolean isLoading) {
        InterfaceC7851b controller = this.ref.getController();
        if (isLoading) {
            controller.e(new l.a.C1079a(0L, null, 3));
        } else {
            controller.hideLoader();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddressPartsInputVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetPostAddressChangerBinding widgetPostAddressChangerBinding = this.binding;
        this.viewModel.setFieldName(item.getInputField().getName());
        TextAtomView titleTav = widgetPostAddressChangerBinding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextAtomHolderKt.bindOrGone$default(titleTav, item.getTitle(), null, 2, null);
        TextAtomView subtitleTav = widgetPostAddressChangerBinding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        TextAtomHolderKt.bindOrGone$default(subtitleTav, item.getSubtitle(), null, 2, null);
        TextInputEditText textInputEditText = widgetPostAddressChangerBinding.postIndexTiet;
        textInputEditText.removeTextChangedListener(this.textWatcher);
        textInputEditText.setText(item.getInputField().getValue());
        Integer maxLength = item.getInputField().getMaxLength();
        if (maxLength != null) {
            textInputEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(maxLength.intValue())});
        }
        textInputEditText.addTextChangedListener(this.textWatcher);
        widgetPostAddressChangerBinding.postIndexTil.d0(item.getInputField().getHint());
        LargeButtonView largeButtonView = widgetPostAddressChangerBinding.submitLBV;
        Intrinsics.f(largeButtonView);
        LargeButtonHolderKt.bindOrGone(largeButtonView, item.getSubmitButton(), this.actionHandler);
        String value = item.getInputField().getValue();
        largeButtonView.setEnabled(!(value == null || value.length() == 0));
    }
}
