package ru.ozon.app.android.ugc.core.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.google.android.flexbox.FlexboxLayout;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes2.dex */
public final class WidgetReviewGalleryPreviewBinding implements a {

    @NonNull
    public final FlexboxLayout reviewGalleryListFl;

    @NonNull
    public final TextAtomV2View reviewGalleryPreviewTav;

    @NonNull
    private final LinearLayout rootView;

    private WidgetReviewGalleryPreviewBinding(@NonNull LinearLayout linearLayout, @NonNull FlexboxLayout flexboxLayout, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = linearLayout;
        this.reviewGalleryListFl = flexboxLayout;
        this.reviewGalleryPreviewTav = textAtomV2View;
    }

    @NonNull
    public static WidgetReviewGalleryPreviewBinding bind(@NonNull View view) {
        int i11 = R$id.reviewGalleryListFl;
        FlexboxLayout flexboxLayout = (FlexboxLayout) C2548q.d(i11, view);
        if (flexboxLayout != null) {
            i11 = R$id.reviewGalleryPreviewTav;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                return new WidgetReviewGalleryPreviewBinding((LinearLayout) view, flexboxLayout, textAtomV2View);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
