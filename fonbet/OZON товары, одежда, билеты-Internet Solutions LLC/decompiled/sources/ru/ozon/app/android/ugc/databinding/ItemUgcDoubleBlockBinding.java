package ru.ozon.app.android.ugc.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.R$layout;

/* loaded from: classes2.dex */
public final class ItemUgcDoubleBlockBinding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final ItemUgcSingleBlockBinding ugcDoubleBlockFirstInclude;

    @NonNull
    public final ItemUgcSingleBlockBinding ugcDoubleBlockSecondInclude;

    @NonNull
    public final View ugcDoubleBlockSeparatorV;

    private ItemUgcDoubleBlockBinding(@NonNull LinearLayout linearLayout, @NonNull ItemUgcSingleBlockBinding itemUgcSingleBlockBinding, @NonNull ItemUgcSingleBlockBinding itemUgcSingleBlockBinding2, @NonNull View view) {
        this.rootView = linearLayout;
        this.ugcDoubleBlockFirstInclude = itemUgcSingleBlockBinding;
        this.ugcDoubleBlockSecondInclude = itemUgcSingleBlockBinding2;
        this.ugcDoubleBlockSeparatorV = view;
    }

    @NonNull
    public static ItemUgcDoubleBlockBinding bind(@NonNull View view) {
        int i11 = R$id.ugcDoubleBlockFirstInclude;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            ItemUgcSingleBlockBinding bind = ItemUgcSingleBlockBinding.bind(d11);
            int i12 = R$id.ugcDoubleBlockSecondInclude;
            View d12 = C2548q.d(i12, view);
            if (d12 != null) {
                ItemUgcSingleBlockBinding bind2 = ItemUgcSingleBlockBinding.bind(d12);
                int i13 = R$id.ugcDoubleBlockSeparatorV;
                View d13 = C2548q.d(i13, view);
                if (d13 != null) {
                    return new ItemUgcDoubleBlockBinding((LinearLayout) view, bind, bind2, d13);
                }
                i11 = i13;
            } else {
                i11 = i12;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemUgcDoubleBlockBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_ugc_double_block, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
