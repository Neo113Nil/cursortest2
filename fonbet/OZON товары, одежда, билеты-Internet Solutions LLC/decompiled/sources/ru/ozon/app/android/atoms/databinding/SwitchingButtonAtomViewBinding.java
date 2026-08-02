package ru.ozon.app.android.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.atoms.R$layout;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes11.dex */
public final class SwitchingButtonAtomViewBinding implements a {

    @NonNull
    private final View rootView;

    @NonNull
    public final SingleAtom switchingButton;

    private SwitchingButtonAtomViewBinding(@NonNull View view, @NonNull SingleAtom singleAtom) {
        this.rootView = view;
        this.switchingButton = singleAtom;
    }

    @NonNull
    public static SwitchingButtonAtomViewBinding bind(@NonNull View view) {
        int i11 = R$id.switchingButton;
        SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
        if (singleAtom != null) {
            return new SwitchingButtonAtomViewBinding(view, singleAtom);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static SwitchingButtonAtomViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.switching_button_atom_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
