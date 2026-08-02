package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.K;
import androidx.lifecycle.P;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.R$string;
import ru.ozon.app.android.fresh.feature.b2b.databinding.TextInputWithErrorBinding;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetDocsDeliveryFormBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModel;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.inputlist.InputListAdapter;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.inputlist.InputListItemDecoration;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.view.B2BTextWithErrorInputLayout;
import ru.ozon.app.android.pdp.utils.views.input.PdpTextInputLayout;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import xe.C10727i;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\rJ\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetDocsDeliveryFormBinding;", "binding", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetDocsDeliveryFormBinding;Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "subscribeToActions", "()V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$TextInput;", "addressInput", "openSearchDialog", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$TextInput;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel$Action$ShowMessage;", "action", "showMessage", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel$Action$ShowMessage;)V", "onAttach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetDocsDeliveryFormBinding;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/InputListAdapter;", "inputsAdapter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/InputListAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/TextInputWithErrorBinding;", "addressBinding", "Lru/ozon/app/android/fresh/feature/b2b/databinding/TextInputWithErrorBinding;", "Landroidx/recyclerview/widget/RecyclerView$n;", "itemDecoration", "Landroidx/recyclerview/widget/RecyclerView$n;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "searchSubtitleTextAtom", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "unavailableAddressTextAtom", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DocsDeliveryFormViewHolder extends k<DocsDeliveryFormVO> {

    @NotNull
    private final TextInputWithErrorBinding addressBinding;

    @NotNull
    private final WidgetDocsDeliveryFormBinding binding;

    @NotNull
    private final InputListAdapter inputsAdapter;

    @NotNull
    private final RecyclerView.n itemDecoration;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final TextAtom searchSubtitleTextAtom;

    @NotNull
    private final TextAtom unavailableAddressTextAtom;

    @NotNull
    private final DocsDeliveryFormViewModel viewModel;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DocsDeliveryFormViewHolder(@NotNull WidgetDocsDeliveryFormBinding binding, @NotNull DocsDeliveryFormViewModel viewModel, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        NestedScrollView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.viewModel = viewModel;
        this.refs = refs;
        this.inputsAdapter = new InputListAdapter(new DocsDeliveryFormViewHolder$inputsAdapter$1(viewModel), new DocsDeliveryFormViewHolder$inputsAdapter$2(viewModel));
        TextInputWithErrorBinding bind = TextInputWithErrorBinding.bind(binding.addressTIL);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.addressBinding = bind;
        this.itemDecoration = new InputListItemDecoration();
        OzonSpannableString ozonSpannableString = new OzonSpannableString(StringProvider.getString(R$string.deliviry_form_address_modal_description));
        UniColors uniColors = UniColors.TEXT_SECONDARY;
        String token = uniColors.getToken();
        StyleParser.TextStyle textStyle = StyleParser.TextStyle.BODY_L;
        this.searchSubtitleTextAtom = new TextAtom(ozonSpannableString, textStyle.getStyleName(), token, null, null, null, null, 120, null);
        this.unavailableAddressTextAtom = new TextAtom(new OzonSpannableString(StringProvider.getString(R$string.common_search_unavailable_address_android)), textStyle.getStyleName(), uniColors.getToken(), null, null, null, null, 120, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openSearchDialog(DocsDeliveryFormVO.Input.TextInput addressInput) {
        String name = addressInput.getName();
        String string = StringProvider.getString(ru.ozon.app.android.map.R$string.checkout_form_builder_address_search_title);
        String valueOf = String.valueOf(this.addressBinding.inputET.getText());
        if (h.K(valueOf)) {
            valueOf = addressInput.getValue();
        }
        YandexSearchSheetFragment newInstance = YandexSearchSheetFragment.INSTANCE.newInstance(new YandexSearchSheetFragment.Data(name, null, string, valueOf, new FormBuilderBlockVO.Field.YandexSearchField.SearchOptions("validateCourierAddressV2?fl=1&pv=2&q={q}", addressInput.getPlaceholder(), 1, null, null, C7714v.a0(this.unavailableAddressTextAtom), C7714v.a0(this.searchSubtitleTextAtom), 16, null), null, null, null, null, null, 992, null), getTrackingData());
        newInstance.setTargetFragment(this.refs.getContainer().j(), 1000);
        newInstance.show(this.refs.getContainer().k(), YandexSearchSheetFragment.class.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMessage(DocsDeliveryFormViewModel.Action.ShowMessage action) {
        ViewGroup rootView;
        ViewGroup viewGroup;
        if (action.getDismissDialog()) {
            r a11 = this.refs.getContainer().a();
            if (a11 != null) {
                rootView = ContextExtKt.getRootView(a11);
                viewGroup = rootView;
            }
            viewGroup = null;
        } else {
            ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
            if (c11 != null) {
                rootView = ContextExtKt.getRootView(c11);
                viewGroup = rootView;
            }
            viewGroup = null;
        }
        if (viewGroup != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            String message = action.getMessage();
            if (message == null) {
                message = StringProvider.getString(R$string.error_docs_delivery_request_failed_android);
            }
            FlashbarFactory.create$default(flashbarFactory, viewGroup, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, Integer.valueOf(action.getDismissDialog() ? R$drawable.ic_clock_green : ru.ozon.uni.core.R$drawable.ic_m_danger), null, null, null, null, null, null, null, 6000L, null, null, this.refs.getContainer().g(), 57306, null).show();
        }
        if (action.getDismissDialog()) {
            C10727i.c(K.a(this.refs.getContainer().g()), null, null, new DocsDeliveryFormViewHolder$showMessage$2(null), 3);
            this.refs.getNavigator().popBackStack();
        }
    }

    private final void subscribeToActions() {
        this.viewModel.getAction().observe(this, new DocsDeliveryFormViewHolder$sam$androidx_lifecycle_Observer$0(new DocsDeliveryFormViewHolder$subscribeToActions$1(this)));
        P<DocsDeliveryFormVO.Input.TextInput> addressInput = this.viewModel.getAddressInput();
        View constraintLayout = this.addressBinding.getConstraintLayout();
        Intrinsics.g(constraintLayout, "null cannot be cast to non-null type ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.view.B2BTextWithErrorInputLayout");
        addressInput.observe(this, new DocsDeliveryFormViewHolder$sam$androidx_lifecycle_Observer$0(new DocsDeliveryFormViewHolder$subscribeToActions$2((B2BTextWithErrorInputLayout) constraintLayout)));
        this.viewModel.getInputs().observe(this, new DocsDeliveryFormViewHolder$sam$androidx_lifecycle_Observer$0(new DocsDeliveryFormViewHolder$subscribeToActions$3(this.inputsAdapter)));
        this.viewModel.getLoadingState().observe(this, new DocsDeliveryFormViewHolder$sam$androidx_lifecycle_Observer$0(new DocsDeliveryFormViewHolder$subscribeToActions$4(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        subscribeToActions();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DocsDeliveryFormVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.bindInputs(item.getAddressInput(), item.getDeliveryVariant().getInputs());
        TextInputWithErrorBinding textInputWithErrorBinding = this.addressBinding;
        PdpTextInputLayout pdpTextInputLayout = textInputWithErrorBinding.inputTIL;
        pdpTextInputLayout.setMultiline(true);
        pdpTextInputLayout.setEditable(false);
        ViewExtKt.setOnClickListenerThrottle$default(pdpTextInputLayout, 0L, new DocsDeliveryFormViewHolder$bind$1$1$1(this, item), 1, null);
        textInputWithErrorBinding.inputET.setInputType(131073);
        View constraintLayout = textInputWithErrorBinding.getConstraintLayout();
        Intrinsics.g(constraintLayout, "null cannot be cast to non-null type ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.view.B2BTextWithErrorInputLayout");
        ((B2BTextWithErrorInputLayout) constraintLayout).bind(item.getAddressInput());
        WidgetDocsDeliveryFormBinding widgetDocsDeliveryFormBinding = this.binding;
        TextAtomV2View titleTAV = widgetDocsDeliveryFormBinding.titleTAV;
        Intrinsics.checkNotNullExpressionValue(titleTAV, "titleTAV");
        TextHolderKt.bind$default(titleTAV, item.getTitle(), null, 2, null);
        TextAtomV2View orderTAV = widgetDocsDeliveryFormBinding.orderTAV;
        Intrinsics.checkNotNullExpressionValue(orderTAV, "orderTAV");
        TextHolderKt.bind$default(orderTAV, item.getText(), null, 2, null);
        DisclaimerAtom annotation = item.getDeliveryVariant().getAnnotation();
        if (annotation != null) {
            DisclaimerContainer tipDC = widgetDocsDeliveryFormBinding.tipDC;
            Intrinsics.checkNotNullExpressionValue(tipDC, "tipDC");
            DisclaimerHolderKt.bind$default(tipDC, annotation, null, 2, null);
        }
        widgetDocsDeliveryFormBinding.inputsRV.setAdapter(this.inputsAdapter);
        if (widgetDocsDeliveryFormBinding.inputsRV.getItemDecorationCount() == 0) {
            widgetDocsDeliveryFormBinding.inputsRV.addItemDecoration(this.itemDecoration);
        }
    }
}
