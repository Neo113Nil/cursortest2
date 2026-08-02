package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class ExpressHeaderBinding implements a {

    @NonNull
    public final LargeBorderlessButtonView buttonView;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextAtomView titleTV;

    private ExpressHeaderBinding(@NonNull View view, @NonNull LargeBorderlessButtonView largeBorderlessButtonView, @NonNull TextAtomView textAtomView) {
        this.rootView = view;
        this.buttonView = largeBorderlessButtonView;
        this.titleTV = textAtomView;
    }

    @NonNull
    public static ExpressHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.buttonView;
        LargeBorderlessButtonView largeBorderlessButtonView = (LargeBorderlessButtonView) C2548q.d(i11, view);
        if (largeBorderlessButtonView != null) {
            i11 = R$id.titleTV;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                return new ExpressHeaderBinding(view, largeBorderlessButtonView, textAtomView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ExpressHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.express_header, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
