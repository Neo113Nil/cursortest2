package ru.ozon.app.android.storefront.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.storefront.stories.setContainer.presentation.SetContainerView;

/* loaded from: classes2.dex */
public final class WidgetSetContainerBinding implements a {

    @NonNull
    public final SetContainerView root;

    @NonNull
    private final SetContainerView rootView;

    private WidgetSetContainerBinding(@NonNull SetContainerView setContainerView, @NonNull SetContainerView setContainerView2) {
        this.rootView = setContainerView;
        this.root = setContainerView2;
    }

    @NonNull
    public static WidgetSetContainerBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SetContainerView setContainerView = (SetContainerView) view;
        return new WidgetSetContainerBinding(setContainerView, setContainerView);
    }

    @Override // X4.a
    @NonNull
    public SetContainerView getRoot() {
        return this.rootView;
    }
}
