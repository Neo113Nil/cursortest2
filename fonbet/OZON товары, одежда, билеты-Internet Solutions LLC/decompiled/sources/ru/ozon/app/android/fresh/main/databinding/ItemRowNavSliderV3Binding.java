package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.row.NavigationSliderV3ItemView;

/* loaded from: classes12.dex */
public final class ItemRowNavSliderV3Binding implements a {

    @NonNull
    public final NavigationSliderV3ItemView leftItem;

    @NonNull
    public final NavigationSliderV3ItemView rightItem;

    @NonNull
    private final LinearLayoutCompat rootView;

    @NonNull
    public final LinearLayoutCompat rowContainer;

    private ItemRowNavSliderV3Binding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull NavigationSliderV3ItemView navigationSliderV3ItemView, @NonNull NavigationSliderV3ItemView navigationSliderV3ItemView2, @NonNull LinearLayoutCompat linearLayoutCompat2) {
        this.rootView = linearLayoutCompat;
        this.leftItem = navigationSliderV3ItemView;
        this.rightItem = navigationSliderV3ItemView2;
        this.rowContainer = linearLayoutCompat2;
    }

    @NonNull
    public static ItemRowNavSliderV3Binding bind(@NonNull View view) {
        int i11 = R$id.leftItem;
        NavigationSliderV3ItemView navigationSliderV3ItemView = (NavigationSliderV3ItemView) C2548q.d(i11, view);
        if (navigationSliderV3ItemView != null) {
            i11 = R$id.rightItem;
            NavigationSliderV3ItemView navigationSliderV3ItemView2 = (NavigationSliderV3ItemView) C2548q.d(i11, view);
            if (navigationSliderV3ItemView2 != null) {
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                return new ItemRowNavSliderV3Binding(linearLayoutCompat, navigationSliderV3ItemView, navigationSliderV3ItemView2, linearLayoutCompat);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}
