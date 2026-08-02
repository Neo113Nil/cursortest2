package ru.ozon.app.android.travel.feature.hotels.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class ItemHotelsRoomsDetailsFullInfoCardBinding implements a {

    @NonNull
    public final AppCompatImageView hotelsRoomsDetailsInfoCardIv;

    @NonNull
    public final TextAtomView hotelsRoomsDetailsInfoCardKeyTAV;

    @NonNull
    public final TextAtomView hotelsRoomsDetailsInfoCardValueTAV;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemHotelsRoomsDetailsFullInfoCardBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.hotelsRoomsDetailsInfoCardIv = appCompatImageView;
        this.hotelsRoomsDetailsInfoCardKeyTAV = textAtomView;
        this.hotelsRoomsDetailsInfoCardValueTAV = textAtomView2;
    }

    @NonNull
    public static ItemHotelsRoomsDetailsFullInfoCardBinding bind(@NonNull View view) {
        int i11 = R$id.hotelsRoomsDetailsInfoCardIv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.hotelsRoomsDetailsInfoCardKeyTAV;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.hotelsRoomsDetailsInfoCardValueTAV;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    return new ItemHotelsRoomsDetailsFullInfoCardBinding((ConstraintLayout) view, appCompatImageView, textAtomView, textAtomView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemHotelsRoomsDetailsFullInfoCardBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_hotels_rooms_details_full_info_card, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
