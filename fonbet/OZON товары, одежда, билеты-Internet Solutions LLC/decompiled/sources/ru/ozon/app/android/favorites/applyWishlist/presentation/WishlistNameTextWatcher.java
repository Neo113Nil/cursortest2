package ru.ozon.app.android.favorites.applyWishlist.presentation;

import android.text.Editable;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.viewmodel.CreateShoppingListViewModel;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/favorites/applyWishlist/presentation/WishlistNameTextWatcher;", "Lru/ozon/uni/android/uikit/common/SimpleTextWatcher;", "viewModel", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel;", "editText", "Landroid/widget/EditText;", "textInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "maxLength", "", "errorText", "", "<init>", "(Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel;Landroid/widget/EditText;Lcom/google/android/material/textfield/TextInputLayout;ILjava/lang/String;)V", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WishlistNameTextWatcher extends SimpleTextWatcher {

    @NotNull
    private final EditText editText;

    @NotNull
    private final String errorText;
    private final int maxLength;

    @NotNull
    private final TextInputLayout textInputLayout;

    @NotNull
    private final CreateShoppingListViewModel viewModel;

    public WishlistNameTextWatcher(@NotNull CreateShoppingListViewModel viewModel, @NotNull EditText editText, @NotNull TextInputLayout textInputLayout, int i11, @NotNull String errorText) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(textInputLayout, "textInputLayout");
        Intrinsics.checkNotNullParameter(errorText, "errorText");
        this.viewModel = viewModel;
        this.editText = editText;
        this.textInputLayout = textInputLayout;
        this.maxLength = i11;
        this.errorText = errorText;
    }

    @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
    public void afterTextChanged(@NotNull Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "editable");
        if (editable.length() <= this.maxLength) {
            TextViewExtKt.hideError(this.textInputLayout);
            this.viewModel.onShoppingListTitleChanged(editable.toString());
            return;
        }
        TextViewExtKt.showError(this.textInputLayout, this.errorText);
        EditText editText = this.editText;
        editText.removeTextChangedListener(this);
        Intrinsics.checkNotNullParameter(editable, "<this>");
        int length = editable.length() - 1;
        if (length < 0) {
            length = 0;
        }
        String obj = h.p0(editable, length).toString();
        EditTextUtilsKt.setTextWithSelection(editText, obj);
        editText.addTextChangedListener(this);
        this.viewModel.onShoppingListTitleChanged(obj);
    }
}
