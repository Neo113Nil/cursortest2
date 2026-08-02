package ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewMapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.data.MinimalLimit;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.data.PhotosDTO;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.data.SignedLinkDTO;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItem;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItemViewState;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewObject.PhotosVO;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.SignedLink;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004*\b\u0012\u0004\u0012\u00020\r0\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewMapper/PhotosMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/PhotosDTO;", "Ll20/d;", "", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewObject/PhotosVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVo", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/PhotosDTO;Ljava/lang/String;)Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewObject/PhotosVO;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/SignedLinkDTO;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem;", "mapToVo", "(Ljava/util/List;)Ljava/util/List;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/PhotosDTO;Ll20/d;)Ljava/util/List;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhotosMapper implements Function2<PhotosDTO, d, List<? extends PhotosVO>> {
    private final List<PhotoItem> mapToVo(List<SignedLinkDTO> list) {
        List<SignedLinkDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new PhotoItem(r1.getImageLocation().hashCode(), SignedLink.INSTANCE.fromDTO((SignedLinkDTO) it.next()), PhotoItem.INSTANCE.createDeleteIconButton(), PhotoItemViewState.Success.INSTANCE));
        }
        return arrayList;
    }

    private final PhotosVO toVo(PhotosDTO photosDTO, String str) {
        List<PhotoItem> list;
        long hashCode = str.hashCode();
        ImageDTO emptyStateImage = photosDTO.getEmptyStateImage();
        List<SignedLinkDTO> existingImages = photosDTO.getExistingImages();
        if (existingImages == null || (list = mapToVo(existingImages)) == null) {
            list = K.f71697a;
        }
        List<PhotoItem> list2 = list;
        MinimalLimit minimalLimit = photosDTO.getMinimalLimit();
        return new PhotosVO(hashCode, emptyStateImage, list2, minimalLimit != null ? minimalLimit.getDisclaimer() : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PhotosVO> invoke(@NotNull PhotosDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d()));
    }
}
