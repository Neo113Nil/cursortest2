package ru.ozon.app.android.travel.feature.hotels.map.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.hotels.map.R$id;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonView;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.mapsdk.OzonMapView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetHotelsPageMapPreviewBinding implements a {

    @NonNull
    public final LinkButtonView hotelsPageMapPreviewCopyButton;

    @NonNull
    public final OzonMapView hotelsPageMapPreviewMap;

    @NonNull
    public final ConstraintLayoutWithBorder hotelsPageMapPreviewRoot;

    @NonNull
    public final TextAtomView hotelsPageMapPreviewSubtitle;

    @NonNull
    public final TextAtomView hotelsPageMapPreviewTitle;

    @NonNull
    private final ConstraintLayoutWithBorder rootView;

    private WidgetHotelsPageMapPreviewBinding(@NonNull ConstraintLayoutWithBorder constraintLayoutWithBorder, @NonNull LinkButtonView linkButtonView, @NonNull OzonMapView ozonMapView, @NonNull ConstraintLayoutWithBorder constraintLayoutWithBorder2, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayoutWithBorder;
        this.hotelsPageMapPreviewCopyButton = linkButtonView;
        this.hotelsPageMapPreviewMap = ozonMapView;
        this.hotelsPageMapPreviewRoot = constraintLayoutWithBorder2;
        this.hotelsPageMapPreviewSubtitle = textAtomView;
        this.hotelsPageMapPreviewTitle = textAtomView2;
    }

    @NonNull
    public static WidgetHotelsPageMapPreviewBinding bind(@NonNull View view) {
        int i11 = R$id.hotelsPageMapPreviewCopyButton;
        LinkButtonView linkButtonView = (LinkButtonView) C2548q.d(i11, view);
        if (linkButtonView != null) {
            i11 = R$id.hotelsPageMapPreviewMap;
            OzonMapView ozonMapView = (OzonMapView) C2548q.d(i11, view);
            if (ozonMapView != null) {
                ConstraintLayoutWithBorder constraintLayoutWithBorder = (ConstraintLayoutWithBorder) view;
                i11 = R$id.hotelsPageMapPreviewSubtitle;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.hotelsPageMapPreviewTitle;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        return new WidgetHotelsPageMapPreviewBinding(constraintLayoutWithBorder, linkButtonView, ozonMapView, constraintLayoutWithBorder, textAtomView, textAtomView2);
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
