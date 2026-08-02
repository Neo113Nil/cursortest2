package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.imageview.ShapeableImageView;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class ViewLuggageRequirementsBinding implements a {

    @NonNull
    public final TextAtomView luggageReqCompanyNameTav;

    @NonNull
    public final TextAtomView luggageReqHandCarryTextTav;

    @NonNull
    public final TextAtomView luggageReqHandCarryTitleTav;

    @NonNull
    public final ShapeableImageView luggageReqIconIv;

    @NonNull
    public final TextAtomView luggageReqLuggageTextTav;

    @NonNull
    public final TextAtomView luggageReqLuggageTitleTav;

    @NonNull
    public final View luggageReqSeparator;

    @NonNull
    private final View rootView;

    private ViewLuggageRequirementsBinding(@NonNull View view, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3, @NonNull ShapeableImageView shapeableImageView, @NonNull TextAtomView textAtomView4, @NonNull TextAtomView textAtomView5, @NonNull View view2) {
        this.rootView = view;
        this.luggageReqCompanyNameTav = textAtomView;
        this.luggageReqHandCarryTextTav = textAtomView2;
        this.luggageReqHandCarryTitleTav = textAtomView3;
        this.luggageReqIconIv = shapeableImageView;
        this.luggageReqLuggageTextTav = textAtomView4;
        this.luggageReqLuggageTitleTav = textAtomView5;
        this.luggageReqSeparator = view2;
    }

    @NonNull
    public static ViewLuggageRequirementsBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.luggageReqCompanyNameTav;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.luggageReqHandCarryTextTav;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                i11 = R$id.luggageReqHandCarryTitleTav;
                TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView3 != null) {
                    i11 = R$id.luggageReqIconIv;
                    ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i11, view);
                    if (shapeableImageView != null) {
                        i11 = R$id.luggageReqLuggageTextTav;
                        TextAtomView textAtomView4 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView4 != null) {
                            i11 = R$id.luggageReqLuggageTitleTav;
                            TextAtomView textAtomView5 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView5 != null && (d11 = C2548q.d((i11 = R$id.luggageReqSeparator), view)) != null) {
                                return new ViewLuggageRequirementsBinding(view, textAtomView, textAtomView2, textAtomView3, shapeableImageView, textAtomView4, textAtomView5, d11);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewLuggageRequirementsBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_luggage_requirements, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
