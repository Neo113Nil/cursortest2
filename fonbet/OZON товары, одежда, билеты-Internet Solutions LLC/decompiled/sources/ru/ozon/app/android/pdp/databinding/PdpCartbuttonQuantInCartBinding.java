package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.button.CartButtonQuant;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class PdpCartbuttonQuantInCartBinding implements a {

    @NonNull
    public final CartButtonQuant mainBtn;

    @NonNull
    public final ImageButton minusIb;

    @NonNull
    public final ImageButton plusIb;

    @NonNull
    public final LinearLayoutCompat plusMinuSLl;

    @NonNull
    public final TextAtomV2View quantityTav;

    @NonNull
    private final View rootView;

    private PdpCartbuttonQuantInCartBinding(@NonNull View view, @NonNull CartButtonQuant cartButtonQuant, @NonNull ImageButton imageButton, @NonNull ImageButton imageButton2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = view;
        this.mainBtn = cartButtonQuant;
        this.minusIb = imageButton;
        this.plusIb = imageButton2;
        this.plusMinuSLl = linearLayoutCompat;
        this.quantityTav = textAtomV2View;
    }

    @NonNull
    public static PdpCartbuttonQuantInCartBinding bind(@NonNull View view) {
        int i11 = R$id.mainBtn;
        CartButtonQuant cartButtonQuant = (CartButtonQuant) C2548q.d(i11, view);
        if (cartButtonQuant != null) {
            i11 = R$id.minusIb;
            ImageButton imageButton = (ImageButton) C2548q.d(i11, view);
            if (imageButton != null) {
                i11 = R$id.plusIb;
                ImageButton imageButton2 = (ImageButton) C2548q.d(i11, view);
                if (imageButton2 != null) {
                    i11 = R$id.plusMinuSLl;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) C2548q.d(i11, view);
                    if (linearLayoutCompat != null) {
                        i11 = R$id.quantityTav;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View != null) {
                            return new PdpCartbuttonQuantInCartBinding(view, cartButtonQuant, imageButton, imageButton2, linearLayoutCompat, textAtomV2View);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static PdpCartbuttonQuantInCartBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.pdp_cartbutton_quant_in_cart, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
