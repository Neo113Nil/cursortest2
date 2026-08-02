package ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.list;

import a00.C4911f;
import aI.ViewOnClickListenerC4974b;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.b2b.databinding.WidgetTravelDocumentsToEmailListBinding;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.TravelDocumentsToEmailViewModel;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.list.TravelDocumentsToEmailListVO;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.list.adapter.TravelEmailAdapter;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J#\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00100&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/TravelDocumentsToEmailViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/TravelDocumentsToEmailViewModel;)V", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListVO$Input;", "input", "", "isInputVisible", "", "bindInput", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListVO$Input;Z)V", "setUpRecyclerView", "()V", "observeLiveData", "showError", "onAttach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/TravelDocumentsToEmailViewModel;", "Lru/ozon/app/android/travel/feature/b2b/databinding/WidgetTravelDocumentsToEmailListBinding;", "binding", "Lru/ozon/app/android/travel/feature/b2b/databinding/WidgetTravelDocumentsToEmailListBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/adapter/TravelEmailAdapter;", "emailsAdapter", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/adapter/TravelEmailAdapter;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TravelDocumentsToEmailListWidgetViewHolder extends k<TravelDocumentsToEmailListVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetTravelDocumentsToEmailListBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final TravelEmailAdapter emailsAdapter;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final TravelDocumentsToEmailViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelDocumentsToEmailListWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull TravelDocumentsToEmailViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.containerView = containerView;
        this.references = references;
        this.viewModel = viewModel;
        WidgetTravelDocumentsToEmailListBinding bind = WidgetTravelDocumentsToEmailListBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).onComposerAction(new TravelDocumentsToEmailListWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        this.emailsAdapter = new TravelEmailAdapter(buildHandler);
        setUpRecyclerView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1$lambda$0(LargeButtonView largeButtonView, TravelDocumentsToEmailListWidgetViewHolder travelDocumentsToEmailListWidgetViewHolder, TravelDocumentsToEmailListVO travelDocumentsToEmailListVO, View view) {
        AtomActionDTO action;
        AtomActionDTO action2;
        Intrinsics.f(largeButtonView);
        KeyboardUtilsKt.hideKeyboard(largeButtonView);
        TravelDocumentsToEmailViewModel travelDocumentsToEmailViewModel = travelDocumentsToEmailListWidgetViewHolder.viewModel;
        Editable text = travelDocumentsToEmailListWidgetViewHolder.binding.documentsToEmailListEditText.getText();
        Map<String, String> map = null;
        String obj = text != null ? text.toString() : null;
        ButtonV3Atom.LargeButton submitEmailButton = travelDocumentsToEmailListVO.getSubmitEmailButton();
        String link = (submitEmailButton == null || (action2 = submitEmailButton.getAction()) == null) ? null : action2.getLink();
        ButtonV3Atom.LargeButton submitEmailButton2 = travelDocumentsToEmailListVO.getSubmitEmailButton();
        if (submitEmailButton2 != null && (action = submitEmailButton2.getAction()) != null) {
            map = action.getParams();
        }
        travelDocumentsToEmailViewModel.addEmail(obj, link, map);
    }

    private final void bindInput(TravelDocumentsToEmailListVO.Input input, boolean isInputVisible) {
        MobilizationTextInputLayout documentsToEmailListInputLayout = this.binding.documentsToEmailListInputLayout;
        Intrinsics.checkNotNullExpressionValue(documentsToEmailListInputLayout, "documentsToEmailListInputLayout");
        documentsToEmailListInputLayout.setVisibility(isInputVisible ? 0 : 8);
        if (!isInputVisible) {
            AppCompatTextView documentsToEmailListErrorTextView = this.binding.documentsToEmailListErrorTextView;
            Intrinsics.checkNotNullExpressionValue(documentsToEmailListErrorTextView, "documentsToEmailListErrorTextView");
            documentsToEmailListErrorTextView.setVisibility(8);
        }
        if (input == null) {
            return;
        }
        MobilizationTextInputLayout mobilizationTextInputLayout = this.binding.documentsToEmailListInputLayout;
        String placeholder = input.getPlaceholder();
        if (placeholder == null) {
            placeholder = "";
        }
        mobilizationTextInputLayout.setHint(placeholder);
        this.binding.documentsToEmailListInputLayout.setShowError(input.getIsErrorVisible());
        this.binding.documentsToEmailListEditText.setText(input.getValue());
        AppCompatTextView documentsToEmailListErrorTextView2 = this.binding.documentsToEmailListErrorTextView;
        Intrinsics.checkNotNullExpressionValue(documentsToEmailListErrorTextView2, "documentsToEmailListErrorTextView");
        documentsToEmailListErrorTextView2.setVisibility(input.getIsErrorVisible() ? 0 : 8);
        this.binding.documentsToEmailListErrorTextView.setText(input.getError());
    }

    private final void observeLiveData() {
        this.viewModel.errorLiveData().observe(this, new TravelDocumentsToEmailListWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TravelDocumentsToEmailListWidgetViewHolder$observeLiveData$1$1(this)));
    }

    private final void setUpRecyclerView() {
        RecyclerView recyclerView = this.binding.documentsToEmailList;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.emailsAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError() {
        ViewGroup rootView;
        C4911f container = this.references.getContainer();
        ComponentCallbacksC5392m c11 = container.c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, container.g(), 62, null).show();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeLiveData();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelDocumentsToEmailListVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView documentsToEmailListTitle = this.binding.documentsToEmailListTitle;
        Intrinsics.checkNotNullExpressionValue(documentsToEmailListTitle, "documentsToEmailListTitle");
        TextAtomHolderKt.bindOrGone$default(documentsToEmailListTitle, item.getTitle(), null, 2, null);
        RecyclerView documentsToEmailList = this.binding.documentsToEmailList;
        Intrinsics.checkNotNullExpressionValue(documentsToEmailList, "documentsToEmailList");
        documentsToEmailList.setVisibility(item.getIsEmailListVisible() ? 0 : 8);
        this.emailsAdapter.setItems(item.getEmails());
        bindInput(item.getInput(), item.getIsInputVisible());
        LargeButtonView largeButtonView = this.binding.documentsToEmailListLargeButton;
        Intrinsics.f(largeButtonView);
        LargeButtonHolderKt.bindOrGone$default(largeButtonView, item.getSubmitEmailButton(), null, 2, null);
        largeButtonView.setOnClickListener(new ViewOnClickListenerC4974b(largeButtonView, this, item, 1));
        SmallBorderlessButtonView documentsToEmailListSmallButton = this.binding.documentsToEmailListSmallButton;
        Intrinsics.checkNotNullExpressionValue(documentsToEmailListSmallButton, "documentsToEmailListSmallButton");
        WrappedBorderlessButtonHolderKt.bindOrGone(documentsToEmailListSmallButton, item.getAddEmailButton(), this.actionHandler);
    }
}
