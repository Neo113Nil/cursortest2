package ru.ozon.app.android.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.geo.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class ItemOptionCellBinding implements a {

    @NonNull
    public final HorizontalAtomsLayout badgesHAL;

    @NonNull
    public final ImageView disclosureIv;

    @NonNull
    public final ImageView imageIv;

    @NonNull
    public final TextAtomV2View numberPVZ;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView subtitleTv;

    @NonNull
    public final TextView titleTv;

    private ItemOptionCellBinding(@NonNull ConstraintLayout constraintLayout, @NonNull HorizontalAtomsLayout horizontalAtomsLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextAtomV2View textAtomV2View, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.badgesHAL = horizontalAtomsLayout;
        this.disclosureIv = imageView;
        this.imageIv = imageView2;
        this.numberPVZ = textAtomV2View;
        this.subtitleTv = textView;
        this.titleTv = textView2;
    }

    @NonNull
    public static ItemOptionCellBinding bind(@NonNull View view) {
        int i11 = R$id.badgesHAL;
        HorizontalAtomsLayout horizontalAtomsLayout = (HorizontalAtomsLayout) C2548q.d(i11, view);
        if (horizontalAtomsLayout != null) {
            i11 = R$id.disclosureIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.imageIv;
                ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                if (imageView2 != null) {
                    i11 = R$id.numberPVZ;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        i11 = R$id.subtitleTv;
                        TextView textView = (TextView) C2548q.d(i11, view);
                        if (textView != null) {
                            i11 = R$id.titleTv;
                            TextView textView2 = (TextView) C2548q.d(i11, view);
                            if (textView2 != null) {
                                return new ItemOptionCellBinding((ConstraintLayout) view, horizontalAtomsLayout, imageView, imageView2, textAtomV2View, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemOptionCellBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_option_cell, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
