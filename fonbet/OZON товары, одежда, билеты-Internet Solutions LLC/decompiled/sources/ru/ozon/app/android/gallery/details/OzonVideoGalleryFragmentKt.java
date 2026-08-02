package ru.ozon.app.android.gallery.details;

import kotlin.Metadata;
import ru.ozon.app.android.gallery.ItemVO;
import ru.ozon.app.android.pdpvideomolecule.data.VideoFormat;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/gallery/ItemVO$OzonVideo;", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "toMolecule", "(Lru/ozon/app/android/gallery/ItemVO$OzonVideo;)Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "", "VIDEO_MOLECULE_MARGIN_BOTTOM_PORTRAIT", "I", "gallery_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OzonVideoGalleryFragmentKt {
    private static final int VIDEO_MOLECULE_MARGIN_BOTTOM_PORTRAIT = ResourceExtKt.toPx(88);

    /* JADX INFO: Access modifiers changed from: private */
    public static final VideoMolecule toMolecule(ItemVO.OzonVideo ozonVideo) {
        return new VideoMolecule(ozonVideo.getVideoUrl(), VideoFormat.MP4, false, null, 12, null);
    }
}
