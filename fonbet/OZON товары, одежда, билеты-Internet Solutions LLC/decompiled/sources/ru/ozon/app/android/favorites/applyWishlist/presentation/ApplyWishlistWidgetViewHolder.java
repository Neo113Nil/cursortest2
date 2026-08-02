package ru.ozon.app.android.favorites.applyWishlist.presentation;

import Sc.InterfaceC4008j;
import Us.a;
import W10.c;
import WZ.l;
import WZ.t;
import android.graphics.drawable.PaintDrawable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.createshoppinglist.actiondelegate.WishlistActionDelegate;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.viewmodel.CreateShoppingListViewModel;
import ru.ozon.app.android.favorites.feature.databinding.WidgetApplyWishlistBinding;
import ru.ozon.app.android.favorites.ui.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 :2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001:B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00120$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/favorites/applyWishlist/presentation/ApplyWishlistWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/favorites/applyWishlist/presentation/ApplyWishlistVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel;)V", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cells", "", "bindCellsOrGone", "(Ljava/util/List;)V", "item", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/favorites/applyWishlist/presentation/ApplyWishlistVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/favorites/applyWishlist/presentation/ApplyWishlistVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/favorites/feature/databinding/WidgetApplyWishlistBinding;", "binding", "Lru/ozon/app/android/favorites/feature/databinding/WidgetApplyWishlistBinding;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "", "backgroundColor$delegate", "LSc/j;", "getBackgroundColor", "()I", "backgroundColor", "Lru/ozon/app/android/favorites/applyWishlist/presentation/WishlistNameTextWatcher;", "textWatcher", "Lru/ozon/app/android/favorites/applyWishlist/presentation/WishlistNameTextWatcher;", "Lru/ozon/app/android/favorites/createshoppinglist/actiondelegate/WishlistActionDelegate;", "actionDelegate", "Lru/ozon/app/android/favorites/createshoppinglist/actiondelegate/WishlistActionDelegate;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ApplyWishlistWidgetViewHolder extends k<ApplyWishlistVO> {

    @NotNull
    private static final float[] cornerRadii;
    private WishlistActionDelegate actionDelegate;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter atomsAdapter;

    /* renamed from: backgroundColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundColor;

    @NotNull
    private final WidgetApplyWishlistBinding binding;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final WishlistNameTextWatcher textWatcher;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final CreateShoppingListViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float cornerRadius = ResourceExtKt.toPxF(16);

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.favorites.applyWishlist.presentation.ApplyWishlistWidgetViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<CreateShoppingListViewModel.Action, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CreateShoppingListViewModel.Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CreateShoppingListViewModel.Action action) {
            WishlistActionDelegate wishlistActionDelegate = ApplyWishlistWidgetViewHolder.this.actionDelegate;
            if (wishlistActionDelegate != null) {
                Intrinsics.f(action);
                wishlistActionDelegate.handle(action);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/favorites/applyWishlist/presentation/ApplyWishlistWidgetViewHolder$Companion;", "", "<init>", "()V", "", "TITLE_MAX_LENGTH", "I", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = cornerRadius;
        }
        cornerRadii = fArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplyWishlistWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics, @NotNull CreateShoppingListViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(references, this).onComposerAction(new ApplyWishlistWidgetViewHolder$actionHandler$1(this)).buildHandler();
        WidgetApplyWishlistBinding bind = WidgetApplyWishlistBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        this.backgroundColor = Sc.k.b(new ApplyWishlistWidgetViewHolder$backgroundColor$2(this));
        TextInputEditText titleEt = bind.titleEt;
        Intrinsics.checkNotNullExpressionValue(titleEt, "titleEt");
        TextInputLayout titleTil = bind.titleTil;
        Intrinsics.checkNotNullExpressionValue(titleTil, "titleTil");
        WishlistNameTextWatcher wishlistNameTextWatcher = new WishlistNameTextWatcher(viewModel, titleEt, titleTil, 35, StringProvider.getString(R$string.error_create_list_long_title));
        this.textWatcher = wishlistNameTextWatcher;
        bind.cellsVAL.setAdapter(atomsAdapter);
        bind.titleEt.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(36)});
        bind.titleEt.addTextChangedListener(wishlistNameTextWatcher);
        bind.titleEt.setOnFocusChangeListener(new a());
        viewModel.getAction().observe(references.getContainer().g(), new ApplyWishlistWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2()));
    }

    private final void bindCellsOrGone(List<CellDTO> cells) {
        List<CellDTO> list = cells;
        if (list == null || list.isEmpty()) {
            VerticalAtomsLayout cellsVAL = this.binding.cellsVAL;
            Intrinsics.checkNotNullExpressionValue(cellsVAL, "cellsVAL");
            ViewExtKt.gone(cellsVAL);
            return;
        }
        VerticalAtomsLayout cellsVAL2 = this.binding.cellsVAL;
        Intrinsics.checkNotNullExpressionValue(cellsVAL2, "cellsVAL");
        ViewExtKt.show(cellsVAL2);
        this.atomsAdapter.bind(getContext(), cells);
        VerticalAtomsLayout verticalAtomsLayout = this.binding.cellsVAL;
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.getPaint().setColor(getBackgroundColor());
        paintDrawable.setCornerRadii(cornerRadii);
        verticalAtomsLayout.setBackground(paintDrawable);
    }

    private final int getBackgroundColor() {
        return ((Number) this.backgroundColor.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$lambda$0(View view, boolean z11) {
        if (z11) {
            return;
        }
        Intrinsics.f(view);
        KeyboardUtilsKt.hideKeyboard(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ApplyWishlistVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetApplyWishlistBinding widgetApplyWishlistBinding = this.binding;
        TextAtomV2View titleTav = widgetApplyWishlistBinding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextHolderKt.bind$default(titleTav, item.getTitle(), null, 2, null);
        TextAtomV2View subtitleTav = widgetApplyWishlistBinding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        TextHolderKt.bind$default(subtitleTav, item.getSubtitle(), null, 2, null);
        TextInputEditText titleEt = widgetApplyWishlistBinding.titleEt;
        Intrinsics.checkNotNullExpressionValue(titleEt, "titleEt");
        EditTextUtilsKt.setTextWithSelection(titleEt, item.getListTitle());
        widgetApplyWishlistBinding.titleEt.setHint(item.getHint());
        String errorForUser = item.getErrorForUser();
        if (errorForUser == null || errorForUser.length() == 0) {
            TextInputLayout titleTil = widgetApplyWishlistBinding.titleTil;
            Intrinsics.checkNotNullExpressionValue(titleTil, "titleTil");
            TextViewExtKt.hideError(titleTil);
        } else {
            TextInputLayout titleTil2 = widgetApplyWishlistBinding.titleTil;
            Intrinsics.checkNotNullExpressionValue(titleTil2, "titleTil");
            TextViewExtKt.showError(titleTil2, item.getErrorForUser());
        }
        bindCellsOrGone(item.getCells());
        ButtonV3View saveButton = widgetApplyWishlistBinding.saveButton;
        Intrinsics.checkNotNullExpressionValue(saveButton, "saveButton");
        ButtonV3HolderKt.bind(saveButton, item.getSaveButton(), this.actionHandler);
        ComposerReferences composerReferences = this.references;
        ViewGroup rootView = ContextExtKt.getRootView(composerReferences.getContainer().j());
        if (rootView == null) {
            return;
        }
        this.actionDelegate = new WishlistActionDelegate(composerReferences, rootView);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ApplyWishlistVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
