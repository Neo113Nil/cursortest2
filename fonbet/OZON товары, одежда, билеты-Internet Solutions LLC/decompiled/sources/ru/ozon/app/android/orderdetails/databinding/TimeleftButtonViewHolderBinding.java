package ru.ozon.app.android.orderdetails.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.orderdetails.R$layout;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes13.dex */
public final class TimeleftButtonViewHolderBinding implements a {

    @NonNull
    private final SingleAtom rootView;

    @NonNull
    public final SingleAtom timeLeftAtom;

    private TimeleftButtonViewHolderBinding(@NonNull SingleAtom singleAtom, @NonNull SingleAtom singleAtom2) {
        this.rootView = singleAtom;
        this.timeLeftAtom = singleAtom2;
    }

    @NonNull
    public static TimeleftButtonViewHolderBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SingleAtom singleAtom = (SingleAtom) view;
        return new TimeleftButtonViewHolderBinding(singleAtom, singleAtom);
    }

    @NonNull
    public static TimeleftButtonViewHolderBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.timeleft_button_view_holder, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public SingleAtom getRoot() {
        return this.rootView;
    }
}
