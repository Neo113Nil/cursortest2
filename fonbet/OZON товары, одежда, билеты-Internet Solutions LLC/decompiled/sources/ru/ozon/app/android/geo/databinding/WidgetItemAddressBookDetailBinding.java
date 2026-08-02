package ru.ozon.app.android.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.af.layout.FrameAtomsLayout;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes12.dex */
public final class WidgetItemAddressBookDetailBinding implements a {

    @NonNull
    public final HorizontalAtomsLayout badgesHAL;

    @NonNull
    public final VerticalAtomsLayout bottomElementsVAL;

    @NonNull
    public final View bottomSeparatorV;

    @NonNull
    public final Space bottomSpace;

    @NonNull
    public final FrameAtomsLayout controlsFAL;

    @NonNull
    public final VerticalAtomsLayout elementsVAL;

    @NonNull
    public final TextAtomV2View numberPVZ;

    @NonNull
    public final AppCompatImageView radioIV;

    @NonNull
    public final AppCompatTextView radioTitleTv;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetItemAddressBookDetailBinding(@NonNull ConstraintLayout constraintLayout, @NonNull HorizontalAtomsLayout horizontalAtomsLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull View view, @NonNull Space space, @NonNull FrameAtomsLayout frameAtomsLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout2, @NonNull TextAtomV2View textAtomV2View, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.badgesHAL = horizontalAtomsLayout;
        this.bottomElementsVAL = verticalAtomsLayout;
        this.bottomSeparatorV = view;
        this.bottomSpace = space;
        this.controlsFAL = frameAtomsLayout;
        this.elementsVAL = verticalAtomsLayout2;
        this.numberPVZ = textAtomV2View;
        this.radioIV = appCompatImageView;
        this.radioTitleTv = appCompatTextView;
    }

    @NonNull
    public static WidgetItemAddressBookDetailBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.badgesHAL;
        HorizontalAtomsLayout horizontalAtomsLayout = (HorizontalAtomsLayout) C2548q.d(i11, view);
        if (horizontalAtomsLayout != null) {
            i11 = R$id.bottomElementsVAL;
            VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
            if (verticalAtomsLayout != null && (d11 = C2548q.d((i11 = R$id.bottomSeparatorV), view)) != null) {
                i11 = R$id.bottomSpace;
                Space space = (Space) C2548q.d(i11, view);
                if (space != null) {
                    i11 = R$id.controlsFAL;
                    FrameAtomsLayout frameAtomsLayout = (FrameAtomsLayout) C2548q.d(i11, view);
                    if (frameAtomsLayout != null) {
                        i11 = R$id.elementsVAL;
                        VerticalAtomsLayout verticalAtomsLayout2 = (VerticalAtomsLayout) C2548q.d(i11, view);
                        if (verticalAtomsLayout2 != null) {
                            i11 = R$id.numberPVZ;
                            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View != null) {
                                i11 = R$id.radioIV;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                                if (appCompatImageView != null) {
                                    i11 = R$id.radioTitleTv;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                                    if (appCompatTextView != null) {
                                        return new WidgetItemAddressBookDetailBinding((ConstraintLayout) view, horizontalAtomsLayout, verticalAtomsLayout, d11, space, frameAtomsLayout, verticalAtomsLayout2, textAtomV2View, appCompatImageView, appCompatTextView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
