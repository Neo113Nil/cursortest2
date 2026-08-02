package ru.ozon.app.android.returns.ui.molecules.checkbox;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckboxBindingDelegate;", "", "<init>", "()V", "bind", "", "checkbox", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "item", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RmsCheckboxBindingDelegate {
    public final void bind(@NotNull CheckBoxView checkbox, RmsCheckbox item) {
        Intrinsics.checkNotNullParameter(checkbox, "checkbox");
        checkbox.setChecked(item != null ? Intrinsics.d(item.getChecked(), Boolean.TRUE) : false);
        checkbox.setEnabled(!(item != null ? Intrinsics.d(item.getDisabled(), Boolean.TRUE) : false));
    }
}
