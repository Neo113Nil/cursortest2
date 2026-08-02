package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesView;
import ru.ozon.app.android.orderdetails.R$id;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

/* loaded from: classes13.dex */
public final class WidgetOrderDetailsItemBinding implements a {

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final HorizontalFlexAtomsLayout buttonsInRowFlexAL;

    @NonNull
    public final IconView iconV;

    @NonNull
    public final ImagesView imagesRv;

    @NonNull
    public final ConstraintLayout orderDetailsItemCL;

    @NonNull
    public final ButtonView primaryButtonV;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ButtonV3View secondaryButtonV;

    @NonNull
    public final View separatorV;

    @NonNull
    public final Space spaceView;

    @NonNull
    public final AppCompatTextView subtitleTv;

    @NonNull
    public final IconView titleIconIv;

    @NonNull
    public final AppCompatTextView titleTv;

    private WidgetOrderDetailsItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull IconView iconView, @NonNull ImagesView imagesView, @NonNull ConstraintLayout constraintLayout2, @NonNull ButtonView buttonView, @NonNull ButtonV3View buttonV3View, @NonNull View view, @NonNull Space space, @NonNull AppCompatTextView appCompatTextView, @NonNull IconView iconView2, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.barrier = barrier;
        this.buttonsInRowFlexAL = horizontalFlexAtomsLayout;
        this.iconV = iconView;
        this.imagesRv = imagesView;
        this.orderDetailsItemCL = constraintLayout2;
        this.primaryButtonV = buttonView;
        this.secondaryButtonV = buttonV3View;
        this.separatorV = view;
        this.spaceView = space;
        this.subtitleTv = appCompatTextView;
        this.titleIconIv = iconView2;
        this.titleTv = appCompatTextView2;
    }

    @NonNull
    public static WidgetOrderDetailsItemBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.barrier;
        Barrier barrier = (Barrier) C2548q.d(i11, view);
        if (barrier != null) {
            i11 = R$id.buttonsInRowFlexAL;
            HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) C2548q.d(i11, view);
            if (horizontalFlexAtomsLayout != null) {
                i11 = R$id.iconV;
                IconView iconView = (IconView) C2548q.d(i11, view);
                if (iconView != null) {
                    i11 = R$id.imagesRv;
                    ImagesView imagesView = (ImagesView) C2548q.d(i11, view);
                    if (imagesView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i11 = R$id.primaryButtonV;
                        ButtonView buttonView = (ButtonView) C2548q.d(i11, view);
                        if (buttonView != null) {
                            i11 = R$id.secondaryButtonV;
                            ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
                            if (buttonV3View != null && (d11 = C2548q.d((i11 = R$id.separatorV), view)) != null) {
                                i11 = R$id.spaceView;
                                Space space = (Space) C2548q.d(i11, view);
                                if (space != null) {
                                    i11 = R$id.subtitleTv;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                                    if (appCompatTextView != null) {
                                        i11 = R$id.titleIconIv;
                                        IconView iconView2 = (IconView) C2548q.d(i11, view);
                                        if (iconView2 != null) {
                                            i11 = R$id.titleTv;
                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                                            if (appCompatTextView2 != null) {
                                                return new WidgetOrderDetailsItemBinding(constraintLayout, barrier, horizontalFlexAtomsLayout, iconView, imagesView, constraintLayout, buttonView, buttonV3View, d11, space, appCompatTextView, iconView2, appCompatTextView2);
                                            }
                                        }
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
