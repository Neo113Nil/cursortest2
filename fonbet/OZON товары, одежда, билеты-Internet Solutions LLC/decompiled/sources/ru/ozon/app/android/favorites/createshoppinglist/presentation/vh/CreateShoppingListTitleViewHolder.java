package ru.ozon.app.android.favorites.createshoppinglist.presentation.vh;

import Z.u;
import Zs.a;
import android.text.InputFilter;
import android.view.View;
import androidx.lifecycle.J;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.applyWishlist.presentation.WishlistNameTextWatcher;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListTitleVO;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.viewmodel.CreateShoppingListViewModel;
import ru.ozon.app.android.favorites.feature.databinding.WidgetCreateShoppingListTitleBinding;
import ru.ozon.app.android.favorites.ui.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 !2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001!B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/presentation/vh/CreateShoppingListTitleViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListTitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel;)V", "", "onViewInVisibleBounds", "()V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListTitleVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel;", "Lru/ozon/app/android/favorites/feature/databinding/WidgetCreateShoppingListTitleBinding;", "binding", "Lru/ozon/app/android/favorites/feature/databinding/WidgetCreateShoppingListTitleBinding;", "Lru/ozon/app/android/favorites/applyWishlist/presentation/WishlistNameTextWatcher;", "textWatcher", "Lru/ozon/app/android/favorites/applyWishlist/presentation/WishlistNameTextWatcher;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CreateShoppingListTitleViewHolder extends k<CreateShoppingListTitleVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final WidgetCreateShoppingListTitleBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final WishlistNameTextWatcher textWatcher;

    @NotNull
    private final CreateShoppingListViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/presentation/vh/CreateShoppingListTitleViewHolder$Companion;", "", "<init>", "()V", "TITLE_MAX_LENGTH", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateShoppingListTitleViewHolder(@NotNull View containerView, @NotNull CreateShoppingListViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.containerView = containerView;
        this.viewModel = viewModel;
        WidgetCreateShoppingListTitleBinding bind = WidgetCreateShoppingListTitleBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        TextInputEditText titleEt = bind.titleEt;
        Intrinsics.checkNotNullExpressionValue(titleEt, "titleEt");
        TextInputLayout titleTil = bind.titleTil;
        Intrinsics.checkNotNullExpressionValue(titleTil, "titleTil");
        WishlistNameTextWatcher wishlistNameTextWatcher = new WishlistNameTextWatcher(viewModel, titleEt, titleTil, 35, StringProvider.getString(R$string.error_create_list_long_title));
        this.textWatcher = wishlistNameTextWatcher;
        bind.titleEt.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(36)});
        bind.titleEt.addTextChangedListener(wishlistNameTextWatcher);
        bind.titleEt.setOnFocusChangeListener(new a());
        bind.titleEt.post(new u(bind, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$0(View view, boolean z11) {
        if (z11) {
            return;
        }
        Intrinsics.f(view);
        KeyboardUtilsKt.hideKeyboard(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$1(WidgetCreateShoppingListTitleBinding widgetCreateShoppingListTitleBinding) {
        TextInputEditText titleEt = widgetCreateShoppingListTitleBinding.titleEt;
        Intrinsics.checkNotNullExpressionValue(titleEt, "titleEt");
        KeyboardUtilsKt.showKeyboard(titleEt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewInVisibleBounds$lambda$4$lambda$3(WidgetCreateShoppingListTitleBinding widgetCreateShoppingListTitleBinding) {
        widgetCreateShoppingListTitleBinding.titleEt.requestFocus();
        TextInputEditText titleEt = widgetCreateShoppingListTitleBinding.titleEt;
        Intrinsics.checkNotNullExpressionValue(titleEt, "titleEt");
        KeyboardUtilsKt.showKeyboard(titleEt);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.viewModel.getAction().observe(lifecycle, new CreateShoppingListTitleViewHolder$sam$androidx_lifecycle_Observer$0(new CreateShoppingListTitleViewHolder$onAttachViewModel$1(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        WidgetCreateShoppingListTitleBinding widgetCreateShoppingListTitleBinding = this.binding;
        widgetCreateShoppingListTitleBinding.titleEt.post(new M30.a(widgetCreateShoppingListTitleBinding, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CreateShoppingListTitleVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetCreateShoppingListTitleBinding widgetCreateShoppingListTitleBinding = this.binding;
        TextInputEditText textInputEditText = widgetCreateShoppingListTitleBinding.titleEt;
        String newListTitle = item.getNewListTitle();
        if (newListTitle == null && (newListTitle = item.getTitle()) == null) {
            newListTitle = "";
        }
        textInputEditText.setText(newListTitle);
        textInputEditText.setSelection(newListTitle.length());
        textInputEditText.setHint(item.getHint());
        if (item.getErrorText() != null) {
            TextInputLayout titleTil = widgetCreateShoppingListTitleBinding.titleTil;
            Intrinsics.checkNotNullExpressionValue(titleTil, "titleTil");
            TextViewExtKt.showError(titleTil, item.getErrorText());
        } else if (item.getErrorForUser() != null) {
            TextInputLayout titleTil2 = widgetCreateShoppingListTitleBinding.titleTil;
            Intrinsics.checkNotNullExpressionValue(titleTil2, "titleTil");
            TextViewExtKt.showError(titleTil2, item.getErrorForUser());
        } else {
            TextInputLayout titleTil3 = widgetCreateShoppingListTitleBinding.titleTil;
            Intrinsics.checkNotNullExpressionValue(titleTil3, "titleTil");
            TextViewExtKt.hideError(titleTil3);
        }
    }
}
