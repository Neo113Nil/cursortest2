package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class PdpCartbuttonInCartPlusMinusV4Binding implements a {

    @NonNull
    public final LinearLayoutCompat inCartLl;

    @NonNull
    public final ImageButton minusIb;

    @NonNull
    public final ImageButton plusIb;

    @NonNull
    public final TextAtomV2View quantityTav;

    @NonNull
    private final LinearLayoutCompat rootView;

    private PdpCartbuttonInCartPlusMinusV4Binding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull ImageButton imageButton, @NonNull ImageButton imageButton2, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = linearLayoutCompat;
        this.inCartLl = linearLayoutCompat2;
        this.minusIb = imageButton;
        this.plusIb = imageButton2;
        this.quantityTav = textAtomV2View;
    }

    @NonNull
    public static PdpCartbuttonInCartPlusMinusV4Binding bind(@NonNull View view) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        int i11 = R$id.minusIb;
        ImageButton imageButton = (ImageButton) C2548q.d(i11, view);
        if (imageButton != null) {
            i11 = R$id.plusIb;
            ImageButton imageButton2 = (ImageButton) C2548q.d(i11, view);
            if (imageButton2 != null) {
                i11 = R$id.quantityTav;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    return new PdpCartbuttonInCartPlusMinusV4Binding(linearLayoutCompat, linearLayoutCompat, imageButton, imageButton2, textAtomV2View);
                }
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
