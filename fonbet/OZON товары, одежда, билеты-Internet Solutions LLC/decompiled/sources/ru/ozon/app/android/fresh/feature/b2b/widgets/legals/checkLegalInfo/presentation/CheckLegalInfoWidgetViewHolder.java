package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.presentation;

import El.C2971a;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.feature.b2b.databinding.BannerEdoCompactBinding;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetCheckLegalInfoBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.CheckLegalInfoDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.common.LegalRouter;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.cell.text.TextFieldCellApi;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.cell.text.data.TextFieldPresets;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001?B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u000f*\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010#\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u00020\u000f*\u00020\u001a2\u0006\u0010%\u001a\u00020\u001fH\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010(\u001a\u00020\u000f*\u00020\u001aH\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000fH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000fH\u0002¢\u0006\u0004\b,\u0010+J\u000f\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b-\u0010+J\u001f\u00100\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00103R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u0010:\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u000f088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010>\u001a\u00020\u001f*\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoVO;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/common/LegalRouter;", "router", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/common/LegalRouter;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel;)V", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "info", "", "bindCell", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$KppCheckDTO;", "kppCheck", "bindOrGoneKpp", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$KppCheckDTO;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$Banner;", "banner", "bindOrGoneBanner", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$Banner;)Lkotlin/Unit;", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$KppCheckDTO$InputDTO;", "inputDto", "bindOrGone", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$KppCheckDTO$InputDTO;)V", "", "actionName", "postData", "checkLegalInfoMobileVO", "addLegal", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoVO;)V", "errorText", "showError", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;Ljava/lang/String;)V", "hideError", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;)V", "showErrorMessage", "()V", "setScreenMinHeight", "onAttach", "item", "Ll20/d;", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/common/LegalRouter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetCheckLegalInfoBinding;", "binding", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetCheckLegalInfoBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "buttonActionHandler", "Lkotlin/jvm/functions/Function1;", "getInputText", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;)Ljava/lang/String;", "inputText", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckLegalInfoWidgetViewHolder extends k<CheckLegalInfoVO> {

    @NotNull
    private final WidgetCheckLegalInfoBinding binding;

    @NotNull
    private final Function1<AtomAction, Unit> buttonActionHandler;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final LegalRouter router;

    @NotNull
    private final CheckLegalInfoViewModel viewModel;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckLegalInfoWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull LegalRouter router, @NotNull CheckLegalInfoViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.refs = refs;
        this.router = router;
        this.viewModel = viewModel;
        WidgetCheckLegalInfoBinding bind = WidgetCheckLegalInfoBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.buttonActionHandler = new ActionHandler.Builder(refs, this).onComposerAction(new CheckLegalInfoWidgetViewHolder$buttonActionHandler$1(this)).buildHandler();
        setScreenMinHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addLegal(String actionName, String postData, CheckLegalInfoVO checkLegalInfoMobileVO) {
        if (checkLegalInfoMobileVO.getKppCheck() == null) {
            this.viewModel.addLegal(actionName, postData);
            return;
        }
        WidgetCheckLegalInfoBinding widgetCheckLegalInfoBinding = this.binding;
        TextFieldCellView checkLegalInfoKppInputLayout = widgetCheckLegalInfoBinding.checkLegalInfoKppInputLayout;
        Intrinsics.checkNotNullExpressionValue(checkLegalInfoKppInputLayout, "checkLegalInfoKppInputLayout");
        String inputText = getInputText(checkLegalInfoKppInputLayout);
        if (inputText.length() == 0) {
            TextFieldCellView checkLegalInfoKppInputLayout2 = widgetCheckLegalInfoBinding.checkLegalInfoKppInputLayout;
            Intrinsics.checkNotNullExpressionValue(checkLegalInfoKppInputLayout2, "checkLegalInfoKppInputLayout");
            showError(checkLegalInfoKppInputLayout2, checkLegalInfoMobileVO.getKppCheck().getInput().getEmptyTextErrorMessage());
        } else {
            String jSONObject = new JSONObject(postData).put("kpp", inputText).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            this.viewModel.addLegal(actionName, jSONObject);
        }
    }

    private final void bindCell(CellDTO info) {
        CellView checkLegalInfoCompanyCell = this.binding.checkLegalInfoCompanyCell;
        Intrinsics.checkNotNullExpressionValue(checkLegalInfoCompanyCell, "checkLegalInfoCompanyCell");
        CellHolderKt.bind$default(checkLegalInfoCompanyCell, info, null, 2, null);
    }

    private final void bindOrGone(final TextFieldCellView textFieldCellView, CheckLegalInfoDTO.KppCheckDTO.InputDTO inputDTO) {
        if (inputDTO == null) {
            ViewExtKt.gone(textFieldCellView);
            return;
        }
        textFieldCellView.setInputState(OzonTextInputLayoutModel.State.DEFAULT);
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
        textFieldCellView.setInputKeyboardType(OzonTextInputLayoutModel.KeyboardType.NUMBER);
        textFieldCellView.setInputLabelText(inputDTO.getPlaceholder());
        textFieldCellView.setPreset(TextFieldPresets.INSTANCE.getDefault600End());
        OzonTextInput inputView = textFieldCellView.getMainView().getInputViewGroup().getInputView();
        InputFilter[] filters = inputView.getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
        inputView.setFilters((InputFilter[]) C7705l.U(filters, new InputFilter.LengthFilter(9)));
        inputView.addTextChangedListener(new TextWatcher() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.presentation.CheckLegalInfoWidgetViewHolder$bindOrGone$lambda$5$$inlined$doBeforeTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                CheckLegalInfoWidgetViewHolder.this.hideError(textFieldCellView);
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        textFieldCellView.setLabelText(null);
    }

    private final Unit bindOrGoneBanner(CheckLegalInfoDTO.Banner banner) {
        BannerEdoCompactBinding bannerEdoCompactBinding = this.binding.bannerEdoCompact;
        ConstraintLayout constraintLayout = bannerEdoCompactBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.showOrGone(constraintLayout, Boolean.valueOf(banner != null));
        if (banner == null) {
            return null;
        }
        TextAtomV2View title = bannerEdoCompactBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bind$default(title, banner.getTitle(), null, 2, null);
        TextAtomV2View subtitle = bannerEdoCompactBinding.subtitle;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        TextHolderKt.bindOrGone$default(subtitle, banner.getSubtitle(), null, 2, null);
        ImageView image = bannerEdoCompactBinding.image;
        Intrinsics.checkNotNullExpressionValue(image, "image");
        ImageViewExtKt.load$default(image, banner.getImage(), null, null, null, null, false, null, 126, null);
        TextFieldCellView checkLegalInfoKppInputLayout = this.binding.checkLegalInfoKppInputLayout;
        Intrinsics.checkNotNullExpressionValue(checkLegalInfoKppInputLayout, "checkLegalInfoKppInputLayout");
        int dp_4 = ViewExtKt.isVisible(checkLegalInfoKppInputLayout) ? Dimens.INSTANCE.getDP_4() : Dimens.INSTANCE.getDP_8();
        ConstraintLayout constraintLayout2 = bannerEdoCompactBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, dp_4, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        constraintLayout2.setLayoutParams(marginLayoutParams);
        return Unit.f71690a;
    }

    private final void bindOrGoneKpp(CheckLegalInfoDTO.KppCheckDTO kppCheck) {
        WidgetCheckLegalInfoBinding widgetCheckLegalInfoBinding = this.binding;
        TextAtomV2View checkLegalInfoKppTitle = widgetCheckLegalInfoBinding.checkLegalInfoKppTitle;
        Intrinsics.checkNotNullExpressionValue(checkLegalInfoKppTitle, "checkLegalInfoKppTitle");
        TextHolderKt.bindOrGone$default(checkLegalInfoKppTitle, kppCheck != null ? kppCheck.getTitle() : null, null, 2, null);
        TextAtomV2View checkLegalInfoKppDescription = widgetCheckLegalInfoBinding.checkLegalInfoKppDescription;
        Intrinsics.checkNotNullExpressionValue(checkLegalInfoKppDescription, "checkLegalInfoKppDescription");
        TextHolderKt.bindOrGone$default(checkLegalInfoKppDescription, kppCheck != null ? kppCheck.getDescription() : null, null, 2, null);
        TextFieldCellView checkLegalInfoKppInputLayout = widgetCheckLegalInfoBinding.checkLegalInfoKppInputLayout;
        Intrinsics.checkNotNullExpressionValue(checkLegalInfoKppInputLayout, "checkLegalInfoKppInputLayout");
        bindOrGone(checkLegalInfoKppInputLayout, kppCheck != null ? kppCheck.getInput() : null);
    }

    private final String getInputText(TextFieldCellView textFieldCellView) {
        return String.valueOf(textFieldCellView.getInputText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideError(TextFieldCellView textFieldCellView) {
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
        textFieldCellView.setLabelText(null);
    }

    private final void setScreenMinHeight() {
        Toolbar composerToolbar;
        int statusBarHeight = ResourceExtKt.getStatusBarHeight(getContext());
        ViewGroup b11 = C2971a.b(this.refs);
        this.binding.getConstraintLayout().setMinimumHeight(getContext().getResources().getDisplayMetrics().heightPixels - (statusBarHeight + ((b11 == null || (composerToolbar = ComposerViewExtensionKt.composerToolbar(b11)) == null) ? 0 : composerToolbar.getHeight())));
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
    public final void showErrorMessage() {
        ViewGroup rootView = ContextExtKt.getRootView(this.refs.getContainer().j());
        if (rootView != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.common_universal_network_error));
            int i11 = R$drawable.ic_m_exclamation_filled;
            FlashbarFactory.create$default(flashbarFactory, rootView, null, ozonSpannableString, null, null, Integer.valueOf(i11), null, UniColors.GRAPHIC_WARNING_PRIMARY.getToken(), null, null, null, null, null, 3000L, null, null, this.refs.getContainer().g(), 56666, null).show();
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.viewModel.getState().observe(this, new CheckLegalInfoWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new CheckLegalInfoWidgetViewHolder$onAttach$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CheckLegalInfoVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindCell(item.getInfo());
        bindOrGoneKpp(item.getKppCheck());
        bindOrGoneBanner(item.getBanner());
        ButtonV3View checkLegalInfoBtn = this.binding.checkLegalInfoBtn;
        Intrinsics.checkNotNullExpressionValue(checkLegalInfoBtn, "checkLegalInfoBtn");
        ButtonV3HolderKt.bindOrGone(checkLegalInfoBtn, item.getButton(), this.buttonActionHandler);
    }
}
