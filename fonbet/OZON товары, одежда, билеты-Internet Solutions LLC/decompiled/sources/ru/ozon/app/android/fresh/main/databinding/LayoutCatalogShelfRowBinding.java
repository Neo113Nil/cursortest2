package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row.CatalogShelfItemView;

/* loaded from: classes12.dex */
public final class LayoutCatalogShelfRowBinding implements a {

    @NonNull
    public final CatalogShelfItemView firstCategoryItem;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final CatalogShelfItemView secondCategoryItem;

    @NonNull
    public final LinearLayout shelfRowLl;

    @NonNull
    public final CatalogShelfItemView thirdCategoryItem;

    private LayoutCatalogShelfRowBinding(@NonNull LinearLayout linearLayout, @NonNull CatalogShelfItemView catalogShelfItemView, @NonNull CatalogShelfItemView catalogShelfItemView2, @NonNull LinearLayout linearLayout2, @NonNull CatalogShelfItemView catalogShelfItemView3) {
        this.rootView = linearLayout;
        this.firstCategoryItem = catalogShelfItemView;
        this.secondCategoryItem = catalogShelfItemView2;
        this.shelfRowLl = linearLayout2;
        this.thirdCategoryItem = catalogShelfItemView3;
    }

    @NonNull
    public static LayoutCatalogShelfRowBinding bind(@NonNull View view) {
        int i11 = R$id.firstCategoryItem;
        CatalogShelfItemView catalogShelfItemView = (CatalogShelfItemView) C2548q.d(i11, view);
        if (catalogShelfItemView != null) {
            i11 = R$id.secondCategoryItem;
            CatalogShelfItemView catalogShelfItemView2 = (CatalogShelfItemView) C2548q.d(i11, view);
            if (catalogShelfItemView2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i11 = R$id.thirdCategoryItem;
                CatalogShelfItemView catalogShelfItemView3 = (CatalogShelfItemView) C2548q.d(i11, view);
                if (catalogShelfItemView3 != null) {
                    return new LayoutCatalogShelfRowBinding(linearLayout, catalogShelfItemView, catalogShelfItemView2, linearLayout, catalogShelfItemView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
