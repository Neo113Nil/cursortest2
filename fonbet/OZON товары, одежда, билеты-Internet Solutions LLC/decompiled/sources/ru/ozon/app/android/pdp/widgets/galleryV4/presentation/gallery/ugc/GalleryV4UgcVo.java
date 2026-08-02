package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc;

import android.util.Size;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u0011\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/ugc/GalleryV4UgcVo;", "", "", "getPreviewUrl", "()Ljava/lang/String;", "previewUrl", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$GalleryIcon;", "getPreviewIcon", "()Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$GalleryIcon;", "previewIcon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "getTitleIcon", "titleIcon", "getSubtitle", "subtitle", "", "isVerticalState", "()Z", "Landroid/util/Size;", "getSize", "()Landroid/util/Size;", "size", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface GalleryV4UgcVo {
    GalleryV4VO.GalleryIcon getPreviewIcon();

    @NotNull
    String getPreviewUrl();

    @NotNull
    Size getSize();

    @NotNull
    TextDTO getSubtitle();

    @NotNull
    TextDTO getTitle();

    @NotNull
    GalleryV4VO.GalleryIcon getTitleIcon();

    /* renamed from: isVerticalState */
    boolean getIsVerticalState();
}
