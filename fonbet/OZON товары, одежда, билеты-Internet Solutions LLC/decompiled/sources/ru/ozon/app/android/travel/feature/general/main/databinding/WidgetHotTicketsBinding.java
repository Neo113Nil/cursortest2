package ru.ozon.app.android.travel.feature.general.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import ru.ozon.app.android.travel.feature.general.main.R$id;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes4.dex */
public final class WidgetHotTicketsBinding implements a {

    @NonNull
    public final ShapeableImageView hotTicketsBackgroundImageIV;

    @NonNull
    public final ButtonV3View hotTicketsButtonBV;

    @NonNull
    public final RecyclerView hotTicketsFlightsRV;

    @NonNull
    public final Guideline hotTicketsGuideline;

    @NonNull
    public final ShapeableImageView hotTicketsImageIV;

    @NonNull
    public final ConstraintLayoutWithBorder hotTicketsRootView;

    @NonNull
    public final Barrier hotTicketsTitleBarrier;

    @NonNull
    public final Image hotTicketsTitleImageIV;

    @NonNull
    public final TextAtomV2View hotTicketsTitleTAV;

    @NonNull
    private final ConstraintLayoutWithBorder rootView;

    private WidgetHotTicketsBinding(@NonNull ConstraintLayoutWithBorder constraintLayoutWithBorder, @NonNull ShapeableImageView shapeableImageView, @NonNull ButtonV3View buttonV3View, @NonNull RecyclerView recyclerView, @NonNull Guideline guideline, @NonNull ShapeableImageView shapeableImageView2, @NonNull ConstraintLayoutWithBorder constraintLayoutWithBorder2, @NonNull Barrier barrier, @NonNull Image image, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = constraintLayoutWithBorder;
        this.hotTicketsBackgroundImageIV = shapeableImageView;
        this.hotTicketsButtonBV = buttonV3View;
        this.hotTicketsFlightsRV = recyclerView;
        this.hotTicketsGuideline = guideline;
        this.hotTicketsImageIV = shapeableImageView2;
        this.hotTicketsRootView = constraintLayoutWithBorder2;
        this.hotTicketsTitleBarrier = barrier;
        this.hotTicketsTitleImageIV = image;
        this.hotTicketsTitleTAV = textAtomV2View;
    }

    @NonNull
    public static WidgetHotTicketsBinding bind(@NonNull View view) {
        int i11 = R$id.hotTicketsBackgroundImageIV;
        ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i11, view);
        if (shapeableImageView != null) {
            i11 = R$id.hotTicketsButtonBV;
            ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
            if (buttonV3View != null) {
                i11 = R$id.hotTicketsFlightsRV;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    i11 = R$id.hotTicketsGuideline;
                    Guideline guideline = (Guideline) C2548q.d(i11, view);
                    if (guideline != null) {
                        i11 = R$id.hotTicketsImageIV;
                        ShapeableImageView shapeableImageView2 = (ShapeableImageView) C2548q.d(i11, view);
                        if (shapeableImageView2 != null) {
                            ConstraintLayoutWithBorder constraintLayoutWithBorder = (ConstraintLayoutWithBorder) view;
                            i11 = R$id.hotTicketsTitleBarrier;
                            Barrier barrier = (Barrier) C2548q.d(i11, view);
                            if (barrier != null) {
                                i11 = R$id.hotTicketsTitleImageIV;
                                Image image = (Image) C2548q.d(i11, view);
                                if (image != null) {
                                    i11 = R$id.hotTicketsTitleTAV;
                                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                                    if (textAtomV2View != null) {
                                        return new WidgetHotTicketsBinding(constraintLayoutWithBorder, shapeableImageView, buttonV3View, recyclerView, guideline, shapeableImageView2, constraintLayoutWithBorder, barrier, image, textAtomV2View);
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
    public ConstraintLayoutWithBorder getConstraintLayout() {
        return this.rootView;
    }
}
