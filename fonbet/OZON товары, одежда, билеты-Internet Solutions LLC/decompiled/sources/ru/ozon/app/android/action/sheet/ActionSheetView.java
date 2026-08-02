package ru.ozon.app.android.action.sheet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.databinding.FragmentActionSheetBinding;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001b¨\u0006%"}, d2 = {"Lru/ozon/app/android/action/sheet/ActionSheetView;", "", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "handler", "setActionHandler", "(Lkotlin/jvm/functions/Function1;)V", "showLoader", "()V", "Lru/ozon/app/android/action/sheet/ActionSheetVO;", "vo", "showData", "(Lru/ozon/app/android/action/sheet/ActionSheetVO;)V", "showError", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/databinding/FragmentActionSheetBinding;", "binding", "Lru/ozon/app/android/composer/databinding/FragmentActionSheetBinding;", "Lkotlin/Function0;", "onRefreshClick", "Lkotlin/jvm/functions/Function0;", "getOnRefreshClick", "()Lkotlin/jvm/functions/Function0;", "setOnRefreshClick", "(Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "adapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "onRefreshAction", "Companion", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionSheetView {

    @NotNull
    private final AtomsAdapter adapter;

    @NotNull
    private final FragmentActionSheetBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final Function0<Unit> onRefreshAction;

    @NotNull
    private Function0<Unit> onRefreshClick;
    public static final int $stable = 8;

    public ActionSheetView(@NotNull View containerView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        FragmentActionSheetBinding bind = FragmentActionSheetBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.onRefreshClick = ActionSheetView$onRefreshClick$1.INSTANCE;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.adapter = atomsAdapter;
        this.onRefreshAction = new ActionSheetView$onRefreshAction$1(this);
        bind.contentVAL.setAdapter(atomsAdapter);
    }

    @NotNull
    public final Function0<Unit> getOnRefreshClick() {
        return this.onRefreshClick;
    }

    public final void setActionHandler(@NotNull Function1<? super AtomAction, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.adapter.setOnAction(handler);
    }

    public final void setOnRefreshClick(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onRefreshClick = function0;
    }

    public final void showData(@NotNull ActionSheetVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        FragmentActionSheetBinding fragmentActionSheetBinding = this.binding;
        VerticalAtomsLayout contentVAL = fragmentActionSheetBinding.contentVAL;
        Intrinsics.checkNotNullExpressionValue(contentVAL, "contentVAL");
        ViewExtKt.show(contentVAL);
        ConstraintLayout emptyStateContainer = fragmentActionSheetBinding.emptyStateContainer;
        Intrinsics.checkNotNullExpressionValue(emptyStateContainer, "emptyStateContainer");
        ViewExtKt.gone(emptyStateContainer);
        FrameLayout progressContainer = fragmentActionSheetBinding.progressContainer;
        Intrinsics.checkNotNullExpressionValue(progressContainer, "progressContainer");
        ViewExtKt.gone(progressContainer);
        TextView sheetTitleTV = fragmentActionSheetBinding.sheetTitleTV;
        Intrinsics.checkNotNullExpressionValue(sheetTitleTV, "sheetTitleTV");
        ViewExtKt.showOrGoneByPresence(sheetTitleTV, vo.getTitle());
        fragmentActionSheetBinding.sheetTitleTV.setText(vo.getTitle());
        AtomsAdapter atomsAdapter = this.adapter;
        Context context = this.containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, vo.getCells());
    }

    public final void showError() {
        FragmentActionSheetBinding fragmentActionSheetBinding = this.binding;
        FrameLayout progressContainer = fragmentActionSheetBinding.progressContainer;
        Intrinsics.checkNotNullExpressionValue(progressContainer, "progressContainer");
        ViewExtKt.gone(progressContainer);
        VerticalAtomsLayout contentVAL = fragmentActionSheetBinding.contentVAL;
        Intrinsics.checkNotNullExpressionValue(contentVAL, "contentVAL");
        ViewExtKt.gone(contentVAL);
        ConstraintLayout emptyStateContainer = fragmentActionSheetBinding.emptyStateContainer;
        Intrinsics.checkNotNullExpressionValue(emptyStateContainer, "emptyStateContainer");
        ViewExtKt.show(emptyStateContainer);
        this.binding.emptyStateActionButtonsContainer.setOnAction(new ActionSheetView$showError$2(this));
        AtomActionDTO atomActionDTO = new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, "refreshSheet", null, 10, null);
        ButtonV3Atom.SmallButton.SmallButtonStyle smallButtonStyle = null;
        TestInfo testInfo = null;
        SingleAtom.bind$default(this.binding.emptyStateActionButtonsContainer, new ButtonV3Atom.SmallButton(OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.common_action_refresh)), ButtonV3Atom.SmallButton.SmallButtonStyle.STYLE_TYPE_SECONDARY_SMALL, smallButtonStyle, atomActionDTO, null, testInfo, null, 116, null), false, 2, null);
    }

    public final void showLoader() {
        FrameLayout progressContainer = this.binding.progressContainer;
        Intrinsics.checkNotNullExpressionValue(progressContainer, "progressContainer");
        ViewExtKt.show(progressContainer);
        VerticalAtomsLayout contentVAL = this.binding.contentVAL;
        Intrinsics.checkNotNullExpressionValue(contentVAL, "contentVAL");
        ViewExtKt.gone(contentVAL);
        ConstraintLayout emptyStateContainer = this.binding.emptyStateContainer;
        Intrinsics.checkNotNullExpressionValue(emptyStateContainer, "emptyStateContainer");
        ViewExtKt.gone(emptyStateContainer);
    }
}
