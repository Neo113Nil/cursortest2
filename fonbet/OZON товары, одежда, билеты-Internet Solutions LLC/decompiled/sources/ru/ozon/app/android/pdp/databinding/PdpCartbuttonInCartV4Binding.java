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
import ru.ozon.app.android.pdp.widgets.cartButtonV4.button.CartButton;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class PdpCartbuttonInCartV4Binding implements a {

    @NonNull
    public final CartButton mainBtn;

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

    private PdpCartbuttonInCartV4Binding(@NonNull View view, @NonNull CartButton cartButton, @NonNull ImageButton imageButton, @NonNull ImageButton imageButton2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = view;
        this.mainBtn = cartButton;
        this.minusIb = imageButton;
        this.plusIb = imageButton2;
        this.plusMinuSLl = linearLayoutCompat;
        this.quantityTav = textAtomV2View;
    }

    @NonNull
    public static PdpCartbuttonInCartV4Binding bind(@NonNull View view) {
        int i11 = R$id.mainBtn;
        CartButton cartButton = (CartButton) C2548q.d(i11, view);
        if (cartButton != null) {
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
                            return new PdpCartbuttonInCartV4Binding(view, cartButton, imageButton, imageButton2, linearLayoutCompat, textAtomV2View);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static PdpCartbuttonInCartV4Binding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.pdp_cartbutton_in_cart_v4, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
