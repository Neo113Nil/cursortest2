package ru.ozon.app.android.common.widgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.view.atoms.select.SelectView;

/* loaded from: classes11.dex */
public final class SelectLinkWidgetHolderBinding implements a {

    @NonNull
    private final SelectView rootView;

    @NonNull
    public final SelectView selectLink;

    private SelectLinkWidgetHolderBinding(@NonNull SelectView selectView, @NonNull SelectView selectView2) {
        this.rootView = selectView;
        this.selectLink = selectView2;
    }

    @NonNull
    public static SelectLinkWidgetHolderBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SelectView selectView = (SelectView) view;
        return new SelectLinkWidgetHolderBinding(selectView, selectView);
    }

    @Override // X4.a
    @NonNull
    public SelectView getRoot() {
        return this.rootView;
    }
}
