package ru.ozon.app.android.travel.ui.molecules.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.ui.molecules.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class ViewQuantityCellBinding implements a {

    @NonNull
    public final TextView quantityCellCounter;

    @NonNull
    public final SmallIconButtonView quantityCellMinusBtn;

    @NonNull
    public final SmallIconButtonView quantityCellPlusBtn;

    @NonNull
    public final TextAtomView quantityCellSubTitle;

    @NonNull
    public final TextAtomView quantityCellTitle;

    @NonNull
    private final View rootView;

    private ViewQuantityCellBinding(@NonNull View view, @NonNull TextView textView, @NonNull SmallIconButtonView smallIconButtonView, @NonNull SmallIconButtonView smallIconButtonView2, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = view;
        this.quantityCellCounter = textView;
        this.quantityCellMinusBtn = smallIconButtonView;
        this.quantityCellPlusBtn = smallIconButtonView2;
        this.quantityCellSubTitle = textAtomView;
        this.quantityCellTitle = textAtomView2;
    }

    @NonNull
    public static ViewQuantityCellBinding bind(@NonNull View view) {
        int i11 = R$id.quantityCellCounter;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.quantityCellMinusBtn;
            SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
            if (smallIconButtonView != null) {
                i11 = R$id.quantityCellPlusBtn;
                SmallIconButtonView smallIconButtonView2 = (SmallIconButtonView) C2548q.d(i11, view);
                if (smallIconButtonView2 != null) {
                    i11 = R$id.quantityCellSubTitle;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.quantityCellTitle;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null) {
                            return new ViewQuantityCellBinding(view, textView, smallIconButtonView, smallIconButtonView2, textAtomView, textAtomView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewQuantityCellBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_quantity_cell, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
