package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.R$layout;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes13.dex */
public final class MultiButtonItemViewBinding implements a {

    @NonNull
    public final SingleAtom multiButtonButtonView;

    @NonNull
    public final SingleAtom multiButtonFooter;

    @NonNull
    private final View rootView;

    private MultiButtonItemViewBinding(@NonNull View view, @NonNull SingleAtom singleAtom, @NonNull SingleAtom singleAtom2) {
        this.rootView = view;
        this.multiButtonButtonView = singleAtom;
        this.multiButtonFooter = singleAtom2;
    }

    @NonNull
    public static MultiButtonItemViewBinding bind(@NonNull View view) {
        int i11 = R$id.multiButtonButtonView;
        SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
        if (singleAtom != null) {
            i11 = R$id.multiButtonFooter;
            SingleAtom singleAtom2 = (SingleAtom) C2548q.d(i11, view);
            if (singleAtom2 != null) {
                return new MultiButtonItemViewBinding(view, singleAtom, singleAtom2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MultiButtonItemViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.multi_button_item_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
