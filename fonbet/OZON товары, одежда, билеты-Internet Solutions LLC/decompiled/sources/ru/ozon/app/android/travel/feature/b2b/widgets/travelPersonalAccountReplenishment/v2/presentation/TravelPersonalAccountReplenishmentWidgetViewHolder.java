package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation;

import Sc.o;
import Sk.a;
import a00.C4911f;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.G;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.b2b.databinding.WidgetPersonalAccountReplenishmentBinding;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.TravelPersonalAccountReplenishmentVO;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.TravelPersonalAccountReplenishmentViewModel;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.adapter.TravelPersonalAccountReplenishmentAdapter;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.adapter.TravelPersonalAccountReplenishmentItemDecoration;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.view.CursorObservableEditText;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ+\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0014¢\u0006\u0004\b\u0017\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u000eJ\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u000eJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u000eJ\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010\u000eJ\u0017\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\fH\u0002¢\u0006\u0004\b3\u0010\u000eJ\u000f\u00104\u001a\u00020\fH\u0002¢\u0006\u0004\b4\u0010\u000eJ\u001f\u00108\u001a\u00020\f2\u0006\u00105\u001a\u00020/2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u0019\u0010;\u001a\u00020\f2\b\u0010:\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\b;\u0010<J!\u0010>\u001a\u00020\f2\b\u0010:\u001a\u0004\u0018\u0001062\u0006\u0010=\u001a\u00020\"H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010B\u001a\u00020\f2\u0006\u0010A\u001a\u00020@2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010M\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\f0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006X"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel;)V", "", "onViewInVisibleBounds", "()V", "onViewOutOfVisibleBounds", "onAttach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "payload", "bind", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO;Ll20/d;)V", "setUpRecyclerView", "setUpSumEditText", "bindTags", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO;)V", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO$InputVO;", "bindInput", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO$InputVO;)V", "observeLiveData", "", "isProgressVisible", "setProgress", "(Z)V", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel$Result;", "result", "handleSuccessResult", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel$Result;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "handleSuccess", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "showError", "", "errors", "showInputErrors", "(Ljava/lang/String;)V", "addTextWatcher", "removeTextWatcher", "formattedPrice", "", "cursorPosition", "setPrice", "(Ljava/lang/String;I)V", "position", "scrollTo", "(Ljava/lang/Integer;)V", "isSelected", "updateTagItem", "(Ljava/lang/Integer;Z)V", "Landroid/widget/EditText;", "view", "restoreFocusIfLostAndSetCursorPosition", "(Landroid/widget/EditText;I)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel;", "Lru/ozon/app/android/travel/feature/b2b/databinding/WidgetPersonalAccountReplenishmentBinding;", "binding", "Lru/ozon/app/android/travel/feature/b2b/databinding/WidgetPersonalAccountReplenishmentBinding;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/adapter/TravelPersonalAccountReplenishmentAdapter;", "tagAdapter", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/adapter/TravelPersonalAccountReplenishmentAdapter;", "Lru/ozon/uni/android/uikit/common/SimpleTextWatcher;", "textWatcher", "Lru/ozon/uni/android/uikit/common/SimpleTextWatcher;", "Landroidx/core/view/G;", "onPreDrawListener", "Landroidx/core/view/G;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelPersonalAccountReplenishmentWidgetViewHolder extends k<TravelPersonalAccountReplenishmentVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetPersonalAccountReplenishmentBinding binding;

    @NotNull
    private final View containerView;
    private G onPreDrawListener;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final TravelPersonalAccountReplenishmentAdapter tagAdapter;

    @NotNull
    private final SimpleTextWatcher textWatcher;

    @NotNull
    private final TravelPersonalAccountReplenishmentViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelPersonalAccountReplenishmentWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull TravelPersonalAccountReplenishmentViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.containerView = containerView;
        this.references = references;
        this.viewModel = viewModel;
        WidgetPersonalAccountReplenishmentBinding bind = WidgetPersonalAccountReplenishmentBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(references, this).onComposerAction(new TravelPersonalAccountReplenishmentWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.tagAdapter = new TravelPersonalAccountReplenishmentAdapter(new TravelPersonalAccountReplenishmentWidgetViewHolder$tagAdapter$1(viewModel));
        this.textWatcher = new SimpleTextWatcher(new TravelPersonalAccountReplenishmentWidgetViewHolder$textWatcher$1(this));
        setUpRecyclerView();
        setUpSumEditText();
    }

    private final void addTextWatcher() {
        this.binding.sumEditText.addTextChangedListener(this.textWatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1$lambda$0(TravelPersonalAccountReplenishmentWidgetViewHolder travelPersonalAccountReplenishmentWidgetViewHolder, TravelPersonalAccountReplenishmentVO travelPersonalAccountReplenishmentVO, View view) {
        String valueOf = String.valueOf(travelPersonalAccountReplenishmentWidgetViewHolder.binding.sumEditText.getText());
        TravelPersonalAccountReplenishmentViewModel travelPersonalAccountReplenishmentViewModel = travelPersonalAccountReplenishmentWidgetViewHolder.viewModel;
        String inputKey = travelPersonalAccountReplenishmentVO.getInputKey();
        String validateOnlyKey = travelPersonalAccountReplenishmentVO.getValidateOnlyKey();
        AtomActionDTO action = travelPersonalAccountReplenishmentVO.getSubmitButton().getAction();
        String link = action != null ? action.getLink() : null;
        AtomActionDTO action2 = travelPersonalAccountReplenishmentVO.getSubmitButton().getAction();
        travelPersonalAccountReplenishmentViewModel.validate(inputKey, validateOnlyKey, valueOf, link, action2 != null ? action2.getParams() : null);
    }

    private final void bindInput(TravelPersonalAccountReplenishmentVO.InputVO item) {
        MobilizationTextInputLayout mobilizationTextInputLayout = this.binding.inputLayout;
        mobilizationTextInputLayout.setShowError(item.getAreErrorsVisible());
        mobilizationTextInputLayout.setHint(item.getPlaceholder());
        AppCompatTextView appCompatTextView = this.binding.errorView;
        Intrinsics.f(appCompatTextView);
        appCompatTextView.setVisibility(item.getAreErrorsVisible() ? 0 : 8);
        appCompatTextView.setText(item.getErrors());
        setPrice(item.getValue(), item.getCursorPosition());
    }

    private final void bindTags(TravelPersonalAccountReplenishmentVO item) {
        RecyclerView tagList = this.binding.tagList;
        Intrinsics.checkNotNullExpressionValue(tagList, "tagList");
        tagList.setVisibility(item.getAreInputVariantsVisible() ? 0 : 8);
        this.tagAdapter.submitList(K.a(this), item.getInputVariants(), new TravelPersonalAccountReplenishmentWidgetViewHolder$bindTags$1(this, item));
    }

    private final void handleSuccess(AtomAction action) {
        if (action instanceof AtomAction.Move) {
            this.references.getNavigator().popBackStack();
        }
        this.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSuccessResult(TravelPersonalAccountReplenishmentViewModel.Result result) {
        if (result instanceof TravelPersonalAccountReplenishmentViewModel.Result.Success) {
            handleSuccess(((TravelPersonalAccountReplenishmentViewModel.Result.Success) result).getAction());
        } else if (Intrinsics.d(result, TravelPersonalAccountReplenishmentViewModel.Result.Error.INSTANCE)) {
            showError();
        } else {
            if (!(result instanceof TravelPersonalAccountReplenishmentViewModel.Result.InputError)) {
                throw new o();
            }
            showInputErrors(((TravelPersonalAccountReplenishmentViewModel.Result.InputError) result).getErrors());
        }
    }

    private final void observeLiveData() {
        TravelPersonalAccountReplenishmentViewModel travelPersonalAccountReplenishmentViewModel = this.viewModel;
        travelPersonalAccountReplenishmentViewModel.progressLiveData().observe(this, new TravelPersonalAccountReplenishmentWidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new TravelPersonalAccountReplenishmentWidgetViewHolder$observeLiveData$1$1(this)));
        travelPersonalAccountReplenishmentViewModel.resultLiveData().observe(this, new TravelPersonalAccountReplenishmentWidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new TravelPersonalAccountReplenishmentWidgetViewHolder$observeLiveData$1$2(this)));
        travelPersonalAccountReplenishmentViewModel.restoreInputLiveData().observe(this, new TravelPersonalAccountReplenishmentWidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new TravelPersonalAccountReplenishmentWidgetViewHolder$observeLiveData$1$3(this)));
        travelPersonalAccountReplenishmentViewModel.inputStateLiveData().observe(this, new TravelPersonalAccountReplenishmentWidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new TravelPersonalAccountReplenishmentWidgetViewHolder$observeLiveData$1$4(this)));
        travelPersonalAccountReplenishmentViewModel.cursorPositionLiveData().observe(this, new TravelPersonalAccountReplenishmentWidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new TravelPersonalAccountReplenishmentWidgetViewHolder$observeLiveData$1$5(this)));
    }

    private final void removeTextWatcher() {
        this.binding.sumEditText.removeTextChangedListener(this.textWatcher);
    }

    private final void restoreFocusIfLostAndSetCursorPosition(final EditText view, final int cursorPosition) {
        G g10 = this.onPreDrawListener;
        if (g10 != null) {
            g10.b();
        }
        this.onPreDrawListener = G.a(view, new Runnable() { // from class: ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.TravelPersonalAccountReplenishmentWidgetViewHolder$restoreFocusIfLostAndSetCursorPosition$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                EditText editText = view;
                if (!editText.hasFocus()) {
                    editText.requestFocus();
                }
                editText.setSelection(cursorPosition);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollTo(Integer position) {
        if (position != null) {
            this.binding.tagList.scrollToPosition(position.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPrice(String formattedPrice, int cursorPosition) {
        CursorObservableEditText cursorObservableEditText = this.binding.sumEditText;
        cursorObservableEditText.setText(formattedPrice);
        restoreFocusIfLostAndSetCursorPosition(cursorObservableEditText, cursorPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setProgress(boolean isProgressVisible) {
        if (isProgressVisible) {
            this.references.getController().e(new l.a.C1079a(0L, null, 3));
        } else {
            this.references.getController().hideLoader();
        }
    }

    private final void setUpRecyclerView() {
        RecyclerView recyclerView = this.binding.tagList;
        recyclerView.setAdapter(this.tagAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new TravelPersonalAccountReplenishmentItemDecoration(ResourceExtKt.toPx(4, context)));
    }

    private final void setUpSumEditText() {
        this.binding.sumEditText.setCursorPositionObserver(new TravelPersonalAccountReplenishmentWidgetViewHolder$setUpSumEditText$1(this));
    }

    private final void showError() {
        C4911f container = this.references.getContainer();
        ViewGroup rootView = ContextExtKt.getRootView(container.c());
        if (rootView == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, container.g(), 62, null).show();
    }

    private final void showInputErrors(String errors) {
        this.binding.inputLayout.setShowError(true);
        AppCompatTextView appCompatTextView = this.binding.errorView;
        Intrinsics.f(appCompatTextView);
        appCompatTextView.setVisibility(0);
        appCompatTextView.setText(errors);
    }

    private final void updateTagItem(Integer position, boolean isSelected) {
        if (position != null) {
            this.tagAdapter.updateItem(position.intValue(), new TravelPersonalAccountReplenishmentWidgetViewHolder$updateTagItem$1(isSelected), "TagSelectionPayload");
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeLiveData();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        addTextWatcher();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        removeTextWatcher();
        super.onViewOutOfVisibleBounds();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelPersonalAccountReplenishmentVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!Intrinsics.d(payload, "AccountReplenishmentPayload")) {
            super.bind((TravelPersonalAccountReplenishmentWidgetViewHolder) item, info, payload);
            return;
        }
        bindInput(item.getInput());
        updateTagItem(item.getPreviousSelectedTagPosition(), false);
        updateTagItem(item.getSelectedTagPosition(), true);
        scrollTo(item.getSelectedTagPosition());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelPersonalAccountReplenishmentVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.setUp(item);
        TextAtomView titleView = this.binding.titleView;
        Intrinsics.checkNotNullExpressionValue(titleView, "titleView");
        TextAtomHolderKt.bind$default(titleView, item.getTitle(), null, 2, null);
        TextAtomView descriptionTextView = this.binding.descriptionTextView;
        Intrinsics.checkNotNullExpressionValue(descriptionTextView, "descriptionTextView");
        TextAtomHolderKt.bindOrGone$default(descriptionTextView, item.getDescription(), null, 2, null);
        bindInput(item.getInput());
        bindTags(item);
        LargeButtonView largeButtonView = this.binding.submitButton;
        Intrinsics.f(largeButtonView);
        LargeButtonHolderKt.bind$default(largeButtonView, item.getSubmitButton(), null, 2, null);
        largeButtonView.setOnClickListener(new a(3, this, item));
        TextAtomView agreementTextView = this.binding.agreementTextView;
        Intrinsics.checkNotNullExpressionValue(agreementTextView, "agreementTextView");
        TextAtomHolderKt.bindOrGone(agreementTextView, item.getAgreementText(), this.actionHandler);
    }
}
