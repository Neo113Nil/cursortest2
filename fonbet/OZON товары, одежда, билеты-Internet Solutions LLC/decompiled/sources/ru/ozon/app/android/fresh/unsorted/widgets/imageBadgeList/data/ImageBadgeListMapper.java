package ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.data.ImageBadgeListDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.domain.ImageBadgeListVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\n\u001a\u00020\u0013*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\n\u0010\u0014J\u0013\u0010\n\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\n\u0010\u0017J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "widgetInfo", "toVO", "(Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO;Ll20/d;)Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO;", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO$ImageBadge;", "", "widgetId", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO$ItemSettings;", "itemSettings", "", "betweenPadding", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$ImageBadge;", "(Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO$ImageBadge;JLru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO$ItemSettings;I)Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$ImageBadge;", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO$PaddingsDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$PaddingsVO;", "(Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO$PaddingsDTO;)Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$PaddingsVO;", "dto", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO;Ll20/d;)Ljava/util/List;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageBadgeListMapper implements Function2<ImageBadgeListDTO, d, List<? extends ImageBadgeListVO>> {
    private final ImageBadgeListVO toVO(ImageBadgeListDTO imageBadgeListDTO, d dVar) {
        long hashCode = dVar.d().hashCode();
        ImageBadgeListVO.PaddingsVO vo = toVO(imageBadgeListDTO.getPaddings());
        List<ImageBadgeListDTO.ImageBadge> items = imageBadgeListDTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            long j11 = hashCode;
            arrayList.add(toVO((ImageBadgeListDTO.ImageBadge) it.next(), j11, imageBadgeListDTO.getItemSettings(), vo.getBetween()));
            hashCode = j11;
        }
        long j12 = hashCode;
        Map<String, TokenizedTrackingInfo> trackingInfo = imageBadgeListDTO.getTrackingInfo();
        return new ImageBadgeListVO(j12, arrayList, vo, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, Long.valueOf(j12), null) : null, null, 16, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ImageBadgeListVO> invoke(@NotNull ImageBadgeListDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(dto, widgetInfo));
    }

    private final ImageBadgeListVO.ImageBadge toVO(ImageBadgeListDTO.ImageBadge imageBadge, long j11, ImageBadgeListDTO.ItemSettings itemSettings, int i11) {
        Paddings right = itemSettings.getRight();
        if (right == null) {
            right = imageBadge.getHasTrailingIcon() ? Paddings.PADDING_300 : Paddings.PADDING_450;
        }
        ImageDTO image = imageBadge.getImage();
        TextDTO title = imageBadge.getTitle();
        boolean hasSeparator = imageBadge.getHasSeparator();
        boolean hasTrailingIcon = imageBadge.getHasTrailingIcon();
        String backgroundColor = itemSettings.getBackgroundColor();
        float pxF = UiExtKt.toPxF(itemSettings.getCornerRadius().getPx());
        ImageBadgeListVO.PaddingsVO paddingsVO = new ImageBadgeListVO.PaddingsVO(UiExtKt.toPx(itemSettings.getTop().getPx()), UiExtKt.toPx(itemSettings.getBottom().getPx()), UiExtKt.toPx(itemSettings.getLeft().getPx()), UiExtKt.toPx(right.getPx()), i11);
        AtomActionDTO action = imageBadge.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = imageBadge.getTrackingInfo();
        return new ImageBadgeListVO.ImageBadge(image, title, hasSeparator, hasTrailingIcon, backgroundColor, pxF, paddingsVO, atomAction, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, Long.valueOf(j11), null) : null);
    }

    private final ImageBadgeListVO.PaddingsVO toVO(ImageBadgeListDTO.PaddingsDTO paddingsDTO) {
        return new ImageBadgeListVO.PaddingsVO(UiExtKt.toPx(paddingsDTO.getTop().getPx()), UiExtKt.toPx(paddingsDTO.getBottom().getPx()), UiExtKt.toPx(paddingsDTO.getLeft().getPx()), UiExtKt.toPx(paddingsDTO.getRight().getPx()), UiExtKt.toPx(paddingsDTO.getBetween().getPx()));
    }
}
