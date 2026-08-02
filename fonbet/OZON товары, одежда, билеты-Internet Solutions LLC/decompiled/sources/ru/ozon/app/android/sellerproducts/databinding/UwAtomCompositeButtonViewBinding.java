package ru.ozon.app.android.sellerproducts.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.sellerproducts.R$id;
import ru.ozon.app.android.sellerproducts.R$layout;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes2.dex */
public final class UwAtomCompositeButtonViewBinding implements a {

    @NonNull
    public final SingleAtom productSa;

    @NonNull
    private final View rootView;

    @NonNull
    public final SingleAtom secondaryProductButton;

    private UwAtomCompositeButtonViewBinding(@NonNull View view, @NonNull SingleAtom singleAtom, @NonNull SingleAtom singleAtom2) {
        this.rootView = view;
        this.productSa = singleAtom;
        this.secondaryProductButton = singleAtom2;
    }

    @NonNull
    public static UwAtomCompositeButtonViewBinding bind(@NonNull View view) {
        int i11 = R$id.productSa;
        SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
        if (singleAtom != null) {
            i11 = R$id.secondaryProductButton;
            SingleAtom singleAtom2 = (SingleAtom) C2548q.d(i11, view);
            if (singleAtom2 != null) {
                return new UwAtomCompositeButtonViewBinding(view, singleAtom, singleAtom2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static UwAtomCompositeButtonViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.uw_atom_composite_button_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
