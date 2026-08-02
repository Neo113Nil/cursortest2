package ru.ozon.app.android.storefront.filterWidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.android.uikit.view.atoms.tags.TagAtomView;

/* loaded from: classes2.dex */
public final class WidgetFiltersTagFilterItemTagBinding implements a {

    @NonNull
    private final TagAtomView rootView;

    @NonNull
    public final TagAtomView tag;

    private WidgetFiltersTagFilterItemTagBinding(@NonNull TagAtomView tagAtomView, @NonNull TagAtomView tagAtomView2) {
        this.rootView = tagAtomView;
        this.tag = tagAtomView2;
    }

    @NonNull
    public static WidgetFiltersTagFilterItemTagBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TagAtomView tagAtomView = (TagAtomView) view;
        return new WidgetFiltersTagFilterItemTagBinding(tagAtomView, tagAtomView);
    }

    @Override // X4.a
    @NonNull
    public TagAtomView getRoot() {
        return this.rootView;
    }
}
