package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.search.R$id;
import ru.ozon.uni.android.controls.button.IconButtonView;

/* loaded from: classes13.dex */
public final class ItemSuggestionsTitleSubtitleCellBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final IconButtonView suggestionRemoveButton;

    @NonNull
    public final AppCompatTextView suggestionTitle;

    @NonNull
    public final View suggestionTitleSeparator;

    private ItemSuggestionsTitleSubtitleCellBinding(@NonNull ConstraintLayout constraintLayout, @NonNull IconButtonView iconButtonView, @NonNull AppCompatTextView appCompatTextView, @NonNull View view) {
        this.rootView = constraintLayout;
        this.suggestionRemoveButton = iconButtonView;
        this.suggestionTitle = appCompatTextView;
        this.suggestionTitleSeparator = view;
    }

    @NonNull
    public static ItemSuggestionsTitleSubtitleCellBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.suggestion_remove_button;
        IconButtonView iconButtonView = (IconButtonView) C2548q.d(i11, view);
        if (iconButtonView != null) {
            i11 = R$id.suggestion_title;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null && (d11 = C2548q.d((i11 = R$id.suggestion_title_separator), view)) != null) {
                return new ItemSuggestionsTitleSubtitleCellBinding((ConstraintLayout) view, iconButtonView, appCompatTextView, d11);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
