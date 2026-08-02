package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes12.dex */
public final class MAttachmentItemBinding implements a {

    @NonNull
    public final ProductMediaView attachmentPreview;

    @NonNull
    public final IconButtonV3View cancelOrRefreshBtn;

    @NonNull
    public final LoaderView loaderView;

    @NonNull
    public final IconButtonV3View removePhotoBtn;

    @NonNull
    private final ConstraintLayout rootView;

    private MAttachmentItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ProductMediaView productMediaView, @NonNull IconButtonV3View iconButtonV3View, @NonNull LoaderView loaderView, @NonNull IconButtonV3View iconButtonV3View2) {
        this.rootView = constraintLayout;
        this.attachmentPreview = productMediaView;
        this.cancelOrRefreshBtn = iconButtonV3View;
        this.loaderView = loaderView;
        this.removePhotoBtn = iconButtonV3View2;
    }

    @NonNull
    public static MAttachmentItemBinding bind(@NonNull View view) {
        int i11 = R$id.attachmentPreview;
        ProductMediaView productMediaView = (ProductMediaView) C2548q.d(i11, view);
        if (productMediaView != null) {
            i11 = R$id.cancelOrRefreshBtn;
            IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
            if (iconButtonV3View != null) {
                i11 = R$id.loaderView;
                LoaderView loaderView = (LoaderView) C2548q.d(i11, view);
                if (loaderView != null) {
                    i11 = R$id.removePhotoBtn;
                    IconButtonV3View iconButtonV3View2 = (IconButtonV3View) C2548q.d(i11, view);
                    if (iconButtonV3View2 != null) {
                        return new MAttachmentItemBinding((ConstraintLayout) view, productMediaView, iconButtonV3View, loaderView, iconButtonV3View2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MAttachmentItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_attachment_item, viewGroup, false);
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
