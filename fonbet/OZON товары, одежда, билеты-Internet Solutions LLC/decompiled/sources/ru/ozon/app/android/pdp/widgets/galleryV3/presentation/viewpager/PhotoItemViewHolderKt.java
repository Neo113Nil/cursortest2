package ru.ozon.app.android.pdp.widgets.galleryV3.presentation.viewpager;

import android.widget.ImageView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/widget/ImageView;", "", "position", "", "updateLocator", "(Landroid/widget/ImageView;I)V", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhotoItemViewHolderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateLocator(ImageView imageView, int i11) {
        imageView.setContentDescription("imageV_" + (i11 + 1));
    }
}
