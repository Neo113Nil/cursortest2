package ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.o;
import Vg.d;
import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetCompanyCardBinding;
import ru.ozon.app.android.fresh.feature.b2b.utils.UtilsKt;
import ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.presentation.CompanyCardVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.controls.button.UncontainedButtonView;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.button.ButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.button.UncontainedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00100$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardVO;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetCompanyCardBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetCompanyCardBinding;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardViewModel;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onDetach", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetCompanyCardBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardViewModel;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "optionsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CompanyCardViewHolder extends k<CompanyCardVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetCompanyCardBinding binding;

    @NotNull
    private final AtomsAdapter optionsAdapter;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final CompanyCardViewModel viewModel;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CompanyCardViewHolder(@NotNull WidgetCompanyCardBinding binding, @NotNull ComposerReferences references, @NotNull d customActionHandlersStoreFactory, @NotNull CompanyCardViewModel viewModel) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.references = references;
        this.viewModel = viewModel;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.optionsAdapter = atomsAdapter;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).customActionHandlers(new CompanyCardViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onComposerAction(new CompanyCardViewHolder$actionHandler$2(this)).buildHandler();
        this.actionHandler = buildHandler;
        binding.options.setAdapter(atomsAdapter);
        atomsAdapter.setOnAction(buildHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(NotificationDTO notification) {
        ViewGroup rootView;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        r a11 = this.references.getContainer().a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, notification, a11, this.actionHandler).show();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        C2399j.C(new C2408n0(this.viewModel.getActions(), new CompanyCardViewHolder$onAttachViewModel$1(this, null)), K.a(lifecycle));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.viewModel.setShouldUpdate(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CompanyCardVO item, @NotNull l20.d info) {
        Parcelable atom;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetCompanyCardBinding widgetCompanyCardBinding = this.binding;
        if (this.viewModel.getShouldUpdate()) {
            this.viewModel.setShouldUpdate(false);
            InterfaceC7851b.a.e(this.references.getController(), null, null, null, 7);
        }
        LinearLayout optionsBlock = widgetCompanyCardBinding.optionsBlock;
        Intrinsics.checkNotNullExpressionValue(optionsBlock, "optionsBlock");
        Integer mapColor = StyleParser.INSTANCE.mapColor(getContext(), item.getBackgroundColor());
        UtilsKt.setColoredDrawableBackground(optionsBlock, mapColor != null ? mapColor.intValue() : UniColors.BG_SECONDARY.getResId(), ResourceExtKt.toPxF(16));
        AtomsAdapter atomsAdapter = this.optionsAdapter;
        Context context = getContext();
        List<CompanyCardVO.CompanyCardOptionVO> companyOptions = item.getCompanyOptions();
        ArrayList arrayList = new ArrayList(C7714v.z(companyOptions, 10));
        for (CompanyCardVO.CompanyCardOptionVO companyCardOptionVO : companyOptions) {
            if (companyCardOptionVO instanceof CompanyCardVO.CompanyCardOptionVO.Disclosure) {
                atom = ((CompanyCardVO.CompanyCardOptionVO.Disclosure) companyCardOptionVO).getAtom();
            } else {
                if (!(companyCardOptionVO instanceof CompanyCardVO.CompanyCardOptionVO.Cell)) {
                    throw new o();
                }
                atom = ((CompanyCardVO.CompanyCardOptionVO.Cell) companyCardOptionVO).getAtom();
            }
            arrayList.add(atom);
        }
        atomsAdapter.bind(context, arrayList);
        UncontainedButtonView linkButton = widgetCompanyCardBinding.linkButton;
        Intrinsics.checkNotNullExpressionValue(linkButton, "linkButton");
        UncontainedButtonHolderKt.bindOrGone(linkButton, item.getLink(), this.actionHandler);
        TextAtomV2View title = widgetCompanyCardBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bindOrGone$default(title, item.getCompanyName(), null, 2, null);
        BadgeView badge = widgetCompanyCardBinding.badge;
        Intrinsics.checkNotNullExpressionValue(badge, "badge");
        BadgeHolderKt.bindOrGone(badge, item.getBadge(), this.actionHandler);
        CellView email = widgetCompanyCardBinding.email;
        Intrinsics.checkNotNullExpressionValue(email, "email");
        CellHolderKt.bindOrGone(email, item.getEmail(), this.actionHandler);
        ButtonView button = widgetCompanyCardBinding.button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        ButtonHolderKt.bindOrGone(button, item.getButton(), this.actionHandler);
    }
}
