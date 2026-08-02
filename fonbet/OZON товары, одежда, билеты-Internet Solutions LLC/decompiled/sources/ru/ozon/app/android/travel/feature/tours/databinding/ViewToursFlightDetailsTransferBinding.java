package ru.ozon.app.android.travel.feature.tours.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.travel.feature.tours.R$id;
import ru.ozon.app.android.travel.feature.tours.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class ViewToursFlightDetailsTransferBinding implements a {

    @NonNull
    private final View rootView;

    @NonNull
    public final TextAtomView toursFlightDetailsTransferDescriptionTAV;

    @NonNull
    public final AppCompatImageView toursFlightDetailsTransferIconACIV;

    @NonNull
    public final TextAtomView toursFlightDetailsTransferNotificationTAV;

    @NonNull
    public final TextAtomView toursFlightDetailsTransferTitleTAV;

    private ViewToursFlightDetailsTransferBinding(@NonNull View view, @NonNull TextAtomView textAtomView, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3) {
        this.rootView = view;
        this.toursFlightDetailsTransferDescriptionTAV = textAtomView;
        this.toursFlightDetailsTransferIconACIV = appCompatImageView;
        this.toursFlightDetailsTransferNotificationTAV = textAtomView2;
        this.toursFlightDetailsTransferTitleTAV = textAtomView3;
    }

    @NonNull
    public static ViewToursFlightDetailsTransferBinding bind(@NonNull View view) {
        int i11 = R$id.toursFlightDetailsTransferDescriptionTAV;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.toursFlightDetailsTransferIconACIV;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.toursFlightDetailsTransferNotificationTAV;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    i11 = R$id.toursFlightDetailsTransferTitleTAV;
                    TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView3 != null) {
                        return new ViewToursFlightDetailsTransferBinding(view, textAtomView, appCompatImageView, textAtomView2, textAtomView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewToursFlightDetailsTransferBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_tours_flight_details_transfer, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
