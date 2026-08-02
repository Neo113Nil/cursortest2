package ru.ozon.app.android.commonwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.commonwidgets.R$id;
import ru.ozon.uni.android.atom.image.Image;

/* loaded from: classes11.dex */
public final class WidgetCommonCurtainBinding implements a {

    @NonNull
    public final RecyclerView atomsRv;

    @NonNull
    public final Image pictureIv;

    @NonNull
    private final LinearLayout rootView;

    private WidgetCommonCurtainBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull Image image) {
        this.rootView = linearLayout;
        this.atomsRv = recyclerView;
        this.pictureIv = image;
    }

    @NonNull
    public static WidgetCommonCurtainBinding bind(@NonNull View view) {
        int i11 = R$id.atomsRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.pictureIv;
            Image image = (Image) C2548q.d(i11, view);
            if (image != null) {
                return new WidgetCommonCurtainBinding((LinearLayout) view, recyclerView, image);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
