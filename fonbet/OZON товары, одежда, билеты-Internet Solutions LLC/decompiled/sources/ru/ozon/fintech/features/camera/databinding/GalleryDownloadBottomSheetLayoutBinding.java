package ru.ozon.fintech.features.camera.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.promoV2.PromoV2View;

/* loaded from: classes3.dex */
public final class GalleryDownloadBottomSheetLayoutBinding implements a {

    @NonNull
    public final PromoV2View pvDocument;

    @NonNull
    public final PromoV2View pvPhoto;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvTitle;

    private GalleryDownloadBottomSheetLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull PromoV2View promoV2View, @NonNull PromoV2View promoV2View2, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.pvDocument = promoV2View;
        this.pvPhoto = promoV2View2;
        this.tvTitle = textView;
    }

    @NonNull
    public static GalleryDownloadBottomSheetLayoutBinding bind(@NonNull View view) {
        int i11 = R.id.pv_document;
        PromoV2View promoV2View = (PromoV2View) C2548q.d(R.id.pv_document, view);
        if (promoV2View != null) {
            i11 = R.id.pv_photo;
            PromoV2View promoV2View2 = (PromoV2View) C2548q.d(R.id.pv_photo, view);
            if (promoV2View2 != null) {
                i11 = R.id.tv_title;
                TextView textView = (TextView) C2548q.d(R.id.tv_title, view);
                if (textView != null) {
                    return new GalleryDownloadBottomSheetLayoutBinding((LinearLayout) view, promoV2View, promoV2View2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static GalleryDownloadBottomSheetLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static GalleryDownloadBottomSheetLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.gallery_download_bottom_sheet_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
