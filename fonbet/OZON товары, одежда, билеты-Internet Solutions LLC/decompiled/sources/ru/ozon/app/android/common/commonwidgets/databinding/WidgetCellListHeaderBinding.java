package ru.ozon.app.android.common.commonwidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class WidgetCellListHeaderBinding implements a {

    @NonNull
    public final TextAtomView cellListHeaderTav;

    @NonNull
    private final TextAtomView rootView;

    private WidgetCellListHeaderBinding(@NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = textAtomView;
        this.cellListHeaderTav = textAtomView2;
    }

    @NonNull
    public static WidgetCellListHeaderBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextAtomView textAtomView = (TextAtomView) view;
        return new WidgetCellListHeaderBinding(textAtomView, textAtomView);
    }

    @Override // X4.a
    @NonNull
    public TextAtomView getRoot() {
        return this.rootView;
    }
}
