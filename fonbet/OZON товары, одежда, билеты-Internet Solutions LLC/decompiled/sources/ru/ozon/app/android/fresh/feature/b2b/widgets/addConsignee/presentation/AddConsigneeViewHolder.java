package ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Bl.b;
import Gu.ViewOnClickListenerC3129b;
import UZ.a;
import WZ.e;
import WZ.g;
import WZ.l;
import WZ.m;
import WZ.t;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.d;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import hk0.C6969b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolderDelegate;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetAddConsigneeBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation.AddConsigneeVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation.AddConsigneeViewHolder;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.text.TextFieldCellApi;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.cell.text.data.TextFieldPresets;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 W2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001WB'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001f\u001a\u00020\u0010*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\u00102\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u0002¢\u0006\u0004\b$\u0010%J%\u0010)\u001a\u00020\u00102\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020'\u0018\u00010&H\u0002¢\u0006\u0004\b)\u0010*J#\u0010+\u001a\u00020\u00102\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020'0&H\u0002¢\u0006\u0004\b+\u0010*J\u0017\u0010,\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b,\u0010\u0012J\u000f\u0010-\u001a\u00020\u0010H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0010H\u0002¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0010H\u0002¢\u0006\u0004\b0\u0010.J\u000f\u00101\u001a\u00020\u0010H\u0002¢\u0006\u0004\b1\u0010.J\u000f\u00102\u001a\u00020\u0010H\u0002¢\u0006\u0004\b2\u0010.J\u0017\u00105\u001a\u00020\u00102\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u000203H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u001dH\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00102\u0006\u0010<\u001a\u00020'H\u0002¢\u0006\u0004\b=\u0010>J\u001b\u0010@\u001a\u00020\u0010*\u00020\u001c2\u0006\u0010?\u001a\u00020\u001dH\u0002¢\u0006\u0004\b@\u0010 J\u001b\u0010A\u001a\u00020\u0010*\u00020\u001c2\u0006\u0010?\u001a\u00020\u001dH\u0002¢\u0006\u0004\bA\u0010 J\u001b\u0010B\u001a\u00020\u0010*\u00020\u001c2\u0006\u0010?\u001a\u00020\u001dH\u0002¢\u0006\u0004\bB\u0010 J\u001b\u0010D\u001a\u00020\u0010*\u00020\u001c2\u0006\u0010C\u001a\u00020'H\u0002¢\u0006\u0004\bD\u0010EJ\u0013\u0010F\u001a\u00020\u0010*\u00020\u001cH\u0002¢\u0006\u0004\bF\u0010GJ\u0013\u0010H\u001a\u00020\u0010*\u00020\u001cH\u0002¢\u0006\u0004\bH\u0010GR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010IR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010JR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010KR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010LR \u0010O\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00100M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010V\u001a\u00020'*\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006X"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddConsigneeBinding;", "binding", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddConsigneeBinding;Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "Landroidx/lifecycle/J;", "lifecycle", "", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$AdditionalFields;", "additionalFields", "bindAdditionalFieldsOrGone", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$AdditionalFields;)V", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputField;", "field", "showAndBind", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputField;)V", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "requisitesCells", "bindRequisitesCells", "(Ljava/util/List;)V", "", "", "params", "addConsignee", "(Ljava/util/Map;)V", "addSuggestedConsignee", "observeScreenState", "observeChangeKpp", "()V", "observeChangeBranchName", "sendConsigneeResultActions", "observeSelectAddress", "observeInputErrors", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showNotificationBar", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getDefaultNotificationDTO", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "addressInput", "openSearchDialog", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputField;)V", "customParam", "sendCustomParamsEvent", "(Ljava/lang/String;)V", "inputField", "bindKppInputField", "bindInputField", "setInputType", "errorText", "showError", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;Ljava/lang/String;)V", "hideError", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;)V", "disable", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddConsigneeBinding;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lhk0/b;", "cellsAdapter", "Lhk0/b;", "getInputText", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;)Ljava/lang/String;", "inputText", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddConsigneeViewHolder extends k<AddConsigneeVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetAddConsigneeBinding binding;

    @NotNull
    private final C6969b cellsAdapter;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final AddConsigneeViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewHolder$Companion;", "", "<init>", "()V", "STATUS_KEY", "", "CORRECT_KEY", "ERROR_KEY", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    public AddConsigneeViewHolder(@NotNull final WidgetAddConsigneeBinding binding, @NotNull AddConsigneeViewModel viewModel, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.viewModel = viewModel;
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(references, this).onPreProcess(new AddConsigneeViewHolder$actionHandler$1(this)).onComposerAction(new AddConsigneeViewHolder$actionHandler$2(this)).buildHandler();
        C6969b c6969b = new C6969b(new AtomItemViewHolderDelegate(new AddConsigneeViewHolder$cellsAdapter$1(this), null, null, 6, null));
        this.cellsAdapter = c6969b;
        binding.requisitesCellsList.setAdapter(c6969b);
        binding.addressClickableArea.setOnClickListener(new ViewOnClickListenerC3129b(0, this, binding));
        OzonTextInput inputView = binding.kppInput.getMainView().getInputViewGroup().getInputView();
        InputFilter[] filters = inputView.getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
        inputView.setFilters((InputFilter[]) C7705l.U(filters, new InputFilter.LengthFilter(9)));
        inputView.addTextChangedListener(new TextWatcher() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation.AddConsigneeViewHolder$lambda$5$lambda$2$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                AddConsigneeViewModel addConsigneeViewModel;
                AddConsigneeViewHolder addConsigneeViewHolder = AddConsigneeViewHolder.this;
                TextFieldCellView kppInput = binding.kppInput;
                Intrinsics.checkNotNullExpressionValue(kppInput, "kppInput");
                addConsigneeViewHolder.hideError(kppInput);
                addConsigneeViewModel = AddConsigneeViewHolder.this.viewModel;
                addConsigneeViewModel.updateKpp(String.valueOf(s11));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        binding.branchNameInput.getMainView().getInputViewGroup().getInputView().addTextChangedListener(new TextWatcher() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation.AddConsigneeViewHolder$lambda$5$lambda$4$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                AddConsigneeViewModel addConsigneeViewModel;
                AddConsigneeViewHolder addConsigneeViewHolder = AddConsigneeViewHolder.this;
                TextFieldCellView branchNameInput = binding.branchNameInput;
                Intrinsics.checkNotNullExpressionValue(branchNameInput, "branchNameInput");
                addConsigneeViewHolder.hideError(branchNameInput);
                addConsigneeViewModel = AddConsigneeViewHolder.this.viewModel;
                addConsigneeViewModel.updateBranchName(String.valueOf(s11));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addConsignee(Map<String, String> params) {
        WidgetAddConsigneeBinding widgetAddConsigneeBinding = this.binding;
        if (params != null) {
            addSuggestedConsignee(params);
            return;
        }
        AddConsigneeVO boundData = getBoundData();
        if ((boundData != null ? boundData.getAdditionalFields() : null) == null) {
            AddConsigneeViewModel addConsigneeViewModel = this.viewModel;
            TextFieldCellView kppInput = widgetAddConsigneeBinding.kppInput;
            Intrinsics.checkNotNullExpressionValue(kppInput, "kppInput");
            AddConsigneeViewModel.addConsignee$default(addConsigneeViewModel, getInputText(kppInput), null, null, 6, null);
            return;
        }
        AddConsigneeViewModel addConsigneeViewModel2 = this.viewModel;
        TextFieldCellView kppInput2 = widgetAddConsigneeBinding.kppInput;
        Intrinsics.checkNotNullExpressionValue(kppInput2, "kppInput");
        String inputText = getInputText(kppInput2);
        TextFieldCellView branchNameInput = widgetAddConsigneeBinding.branchNameInput;
        Intrinsics.checkNotNullExpressionValue(branchNameInput, "branchNameInput");
        String inputText2 = getInputText(branchNameInput);
        TextFieldCellView addressInput = widgetAddConsigneeBinding.addressInput;
        Intrinsics.checkNotNullExpressionValue(addressInput, "addressInput");
        addConsigneeViewModel2.addConsignee(inputText, inputText2, getInputText(addressInput));
    }

    private final void addSuggestedConsignee(Map<String, String> params) {
        String str;
        String str2;
        String str3 = params.get("kpp");
        if (str3 == null || (str = params.get(AppMeasurementSdk.ConditionalUserProperty.NAME)) == null || (str2 = params.get(FormPageDTO.Field.FIELD_TYPE_ADDRESS)) == null) {
            return;
        }
        this.viewModel.addConsignee(str3, str, str2);
    }

    private final void bindAdditionalFieldsOrGone(AddConsigneeVO.AdditionalFields additionalFields) {
        WidgetAddConsigneeBinding widgetAddConsigneeBinding = this.binding;
        if (additionalFields != null) {
            TextFieldCellView branchNameInput = widgetAddConsigneeBinding.branchNameInput;
            Intrinsics.checkNotNullExpressionValue(branchNameInput, "branchNameInput");
            showAndBind(branchNameInput, additionalFields.getBranchNameField());
            TextFieldCellView addressInput = widgetAddConsigneeBinding.addressInput;
            Intrinsics.checkNotNullExpressionValue(addressInput, "addressInput");
            showAndBind(addressInput, additionalFields.getAddressField());
            return;
        }
        TextFieldCellView branchNameInput2 = widgetAddConsigneeBinding.branchNameInput;
        Intrinsics.checkNotNullExpressionValue(branchNameInput2, "branchNameInput");
        ViewExtKt.gone(branchNameInput2);
        TextFieldCellView addressInput2 = widgetAddConsigneeBinding.addressInput;
        Intrinsics.checkNotNullExpressionValue(addressInput2, "addressInput");
        ViewExtKt.gone(addressInput2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindInputField(TextFieldCellView textFieldCellView, AddConsigneeVO.InputField inputField) {
        textFieldCellView.clearFocus();
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
        textFieldCellView.setInputState(OzonTextInputLayoutModel.State.DEFAULT);
        textFieldCellView.setInputLabelText(inputField.getPlaceholder());
        String value = inputField.getValue();
        if (value != null) {
            textFieldCellView.setInputText(value);
        }
        textFieldCellView.setPreset(TextFieldPresets.INSTANCE.getDefault600End());
        textFieldCellView.setLabelText(null);
        setInputType(textFieldCellView, inputField);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindKppInputField(TextFieldCellView textFieldCellView, AddConsigneeVO.InputField inputField) {
        bindInputField(textFieldCellView, inputField);
        if (inputField.getIsDisabled()) {
            disable(textFieldCellView);
        }
        String anotherFieldError = inputField.getInputFieldErrors().getAnotherFieldError();
        if (anotherFieldError != null) {
            showError(textFieldCellView, anotherFieldError);
        }
    }

    private final void bindRequisitesCells(List<CellDTO> requisitesCells) {
        WidgetAddConsigneeBinding widgetAddConsigneeBinding = this.binding;
        if (requisitesCells == null) {
            RecyclerView requisitesCellsList = widgetAddConsigneeBinding.requisitesCellsList;
            Intrinsics.checkNotNullExpressionValue(requisitesCellsList, "requisitesCellsList");
            ViewExtKt.gone(requisitesCellsList);
        } else {
            RecyclerView requisitesCellsList2 = widgetAddConsigneeBinding.requisitesCellsList;
            Intrinsics.checkNotNullExpressionValue(requisitesCellsList2, "requisitesCellsList");
            ViewExtKt.show(requisitesCellsList2);
            this.cellsAdapter.submitList(requisitesCells);
        }
    }

    private final void disable(TextFieldCellView textFieldCellView) {
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.READONLY);
        textFieldCellView.setInputState(OzonTextInputLayoutModel.State.DISABLED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationDTO getDefaultNotificationDTO() {
        return new NotificationDTO(StringProvider.getString(R$string.error_common_error_technical_error_title), null, null, null, new NotificationDTO.LeftContent(new IconDTO(IconDTO.IconSize.SIZE_500, null, IconDTO.IconShape.SQUIRCLE, null, new CommonAtomIconDTO("ic_m_exclamation_filled", UniColors.GRAPHIC_WARNING_PRIMARY.getToken()), null, UniColors.BG_SECONDARY_INVERTED.getToken(), null, null, null, null, null, null, null, null, null, IconDTO.FitType.FIT_CENTER, 65450, null), NotificationDTO.Alignment.CENTER), null, null, null, null, null, 1006, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getInputText(TextFieldCellView textFieldCellView) {
        return String.valueOf(textFieldCellView.getInputText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideError(TextFieldCellView textFieldCellView) {
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
        textFieldCellView.setLabelText(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$5$lambda$0(AddConsigneeViewHolder addConsigneeViewHolder, WidgetAddConsigneeBinding widgetAddConsigneeBinding, View view) {
        AddConsigneeVO.AdditionalFields additionalFields;
        AddConsigneeVO.InputField addressField;
        AddConsigneeVO boundData = addConsigneeViewHolder.getBoundData();
        if (boundData != null && (additionalFields = boundData.getAdditionalFields()) != null && (addressField = additionalFields.getAddressField()) != null) {
            addConsigneeViewHolder.openSearchDialog(addressField);
        }
        widgetAddConsigneeBinding.getConstraintLayout().clearFocus();
    }

    private final void observeChangeBranchName() {
        C2399j.C(new C2408n0(this.viewModel.getBranchInput(), new AddConsigneeViewHolder$observeChangeBranchName$1(this, null)), K.a(this));
    }

    private final void observeChangeKpp() {
        C2399j.C(new C2408n0(this.viewModel.getKppInput(), new AddConsigneeViewHolder$observeChangeKpp$1(this, null)), K.a(this));
    }

    private final void observeInputErrors() {
        AddConsigneeVO.InputField kppField;
        AddConsigneeVO.InputFieldErrors inputFieldErrors;
        AddConsigneeVO boundData = getBoundData();
        if (boundData == null || (kppField = boundData.getKppField()) == null || (inputFieldErrors = kppField.getInputFieldErrors()) == null) {
            return;
        }
        C2399j.C(new C2408n0(this.viewModel.getKppError(), new AddConsigneeViewHolder$observeInputErrors$1(this, inputFieldErrors, null)), K.a(this));
        C2399j.C(new C2408n0(this.viewModel.getNotFullAddressError(), new AddConsigneeViewHolder$observeInputErrors$2(this, null)), K.a(this));
        AddConsigneeVO boundData2 = getBoundData();
        AddConsigneeVO.AdditionalFields additionalFields = boundData2 != null ? boundData2.getAdditionalFields() : null;
        C2399j.C(new C2408n0(this.viewModel.getHasBranchEmptyError(), new AddConsigneeViewHolder$observeInputErrors$3(this, additionalFields, null)), K.a(this));
        C2399j.C(new C2408n0(this.viewModel.getHasAddressEmptyError(), new AddConsigneeViewHolder$observeInputErrors$4(this, additionalFields, null)), K.a(this));
    }

    private final void observeScreenState(J lifecycle) {
        this.viewModel.resetScreenState();
        C2399j.C(new C2408n0(this.viewModel.getScreenState(), new AddConsigneeViewHolder$observeScreenState$1(this, null)), K.a(lifecycle));
    }

    private final void observeSelectAddress() {
        C2399j.C(new C2408n0(this.viewModel.getAddressInput(), new AddConsigneeViewHolder$observeSelectAddress$1(this, null)), K.a(this));
    }

    private final void openSearchDialog(AddConsigneeVO.InputField addressInput) {
        String name = addressInput.getName();
        String string = StringProvider.getString(ru.ozon.app.android.fresh.feature.b2b.R$string.consignee_list_search_hint);
        TextFieldCellView addressInput2 = this.binding.addressInput;
        Intrinsics.checkNotNullExpressionValue(addressInput2, "addressInput");
        String inputText = getInputText(addressInput2);
        String string2 = StringProvider.getString(ru.ozon.app.android.fresh.feature.b2b.R$string.add_consignee_adress);
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        String str = null;
        YandexSearchSheetFragment newInstance = YandexSearchSheetFragment.INSTANCE.newInstance(new YandexSearchSheetFragment.Data(name, str, string, inputText, new FormBuilderBlockVO.Field.YandexSearchField.SearchOptions("validateCourierAddressV2?fl=1&pv=2&q={q}", string2, 1, null, null, k11, k11, 16, null), null, null, null, null, null, 992, null), getTrackingData());
        newInstance.setTargetFragment(this.references.getContainer().j(), 1000);
        newInstance.show(this.references.getContainer().k(), YandexSearchSheetFragment.class.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendConsigneeResultActions() {
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        if (c11 != null) {
            c11.getParentFragmentManager().m1(d.a(), "consignee_added_refresh");
        }
        G d11 = this.references.getContainer().d();
        if (d11 != null) {
            d11.m1(d.a(), "consignee_changed_refresh");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendCustomParamsEvent(final String customParam) {
        t tokenizedEvent;
        AddConsigneeVO boundData = getBoundData();
        if (boundData == null || (tokenizedEvent = boundData.getTokenizedEvent()) == null) {
            return;
        }
        m.a(this.tokenizedAnalytics, tokenizedEvent, new e() { // from class: Gu.a
            @Override // WZ.e
            public final g modifyParams(UZ.a aVar, g gVar) {
                g sendCustomParamsEvent$lambda$12$lambda$11;
                sendCustomParamsEvent$lambda$12$lambda$11 = AddConsigneeViewHolder.sendCustomParamsEvent$lambda$12$lambda$11(customParam, (UZ.d) aVar, gVar);
                return sendCustomParamsEvent$lambda$12$lambda$11;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g sendCustomParamsEvent$lambda$12$lambda$11(String str, a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return g.a(params, U.i(new Pair("status", str)), null, 2);
    }

    private final void setInputType(TextFieldCellView textFieldCellView, AddConsigneeVO.InputField inputField) {
        if (h.t(inputField.getName(), "kpp", false)) {
            textFieldCellView.setInputKeyboardType(OzonTextInputLayoutModel.KeyboardType.NUMBER);
        } else {
            textFieldCellView.setInputKeyboardType(OzonTextInputLayoutModel.KeyboardType.TEXT);
        }
    }

    private final void showAndBind(TextFieldCellView textFieldCellView, AddConsigneeVO.InputField inputField) {
        ViewExtKt.show(textFieldCellView);
        bindInputField(textFieldCellView, inputField);
        textFieldCellView.setTruncateOnLostFocus(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(TextFieldCellView textFieldCellView, String str) {
        textFieldCellView.setInputState(OzonTextInputLayoutModel.State.DEFAULT);
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.ERROR);
        Context context = textFieldCellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextFieldCellApi.DefaultImpls.setLabelColor$default(textFieldCellView, ResourceExtKt.color(context, UniColors.TEXT_NEGATIVE.getResId()), 0.0f, 2, null);
        textFieldCellView.setLabelText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotificationBar(NotificationDTO notification) {
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        ViewGroup b11 = b.b(this.references);
        if (b11 == null || (composerContainer = ComposerViewExtensionKt.composerContainer(b11)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, notification, this.references.getContainer().i(), this.actionHandler).show();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        observeScreenState(lifecycle);
        observeChangeKpp();
        observeChangeBranchName();
        observeInputErrors();
        observeSelectAddress();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddConsigneeVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetAddConsigneeBinding widgetAddConsigneeBinding = this.binding;
        TextAtomV2View description = widgetAddConsigneeBinding.description;
        Intrinsics.checkNotNullExpressionValue(description, "description");
        TextHolderKt.bind$default(description, item.getDescription(), null, 2, null);
        TextFieldCellView kppInput = widgetAddConsigneeBinding.kppInput;
        Intrinsics.checkNotNullExpressionValue(kppInput, "kppInput");
        bindKppInputField(kppInput, item.getKppField());
        bindAdditionalFieldsOrGone(item.getAdditionalFields());
        bindRequisitesCells(item.getRequisitesCells());
        ButtonV3View button = widgetAddConsigneeBinding.button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        ButtonV3HolderKt.bindOrGone(button, item.getButton(), this.actionHandler);
    }
}
