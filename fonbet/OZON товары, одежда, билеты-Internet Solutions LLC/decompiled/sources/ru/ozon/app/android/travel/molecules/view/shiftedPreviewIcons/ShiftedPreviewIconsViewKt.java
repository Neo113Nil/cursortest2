package ru.ozon.app.android.travel.molecules.view.shiftedPreviewIcons;

import kotlin.Metadata;
import kotlin.collections.C7714v;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/uni/android/atom/icon/IconView;", "", "loadWithBlur", "(Lru/ozon/uni/android/atom/icon/IconView;)V", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShiftedPreviewIconsViewKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadWithBlur(IconView iconView) {
        ImageViewExtKt.load$default(iconView, iconView.getBackgroundImage(), iconView.getBackgroundFitType() == IconDTO.FitType.FILL_CENTER ? C7714v.b0(ImageTransformation.CenterCrop.INSTANCE, new ImageTransformation.Blur(0, 0, 3, null)) : C7714v.b0(ImageTransformation.FitCenter.INSTANCE, new ImageTransformation.Blur(0, 0, 3, null)), null, null, null, false, null, 124, null);
    }
}
