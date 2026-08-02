package ru.ozon.app.android.uikit.databinding;

import X4.a;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class FragmentSortsBottomSheetDialogItemBinding implements a {

    @NonNull
    private final CheckedTextView rootView;

    @NonNull
    public final CheckedTextView textTv;

    private FragmentSortsBottomSheetDialogItemBinding(@NonNull CheckedTextView checkedTextView, @NonNull CheckedTextView checkedTextView2) {
        this.rootView = checkedTextView;
        this.textTv = checkedTextView2;
    }

    @NonNull
    public static FragmentSortsBottomSheetDialogItemBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CheckedTextView checkedTextView = (CheckedTextView) view;
        return new FragmentSortsBottomSheetDialogItemBinding(checkedTextView, checkedTextView);
    }

    @Override // X4.a
    @NonNull
    public CheckedTextView getRoot() {
        return this.rootView;
    }
}
