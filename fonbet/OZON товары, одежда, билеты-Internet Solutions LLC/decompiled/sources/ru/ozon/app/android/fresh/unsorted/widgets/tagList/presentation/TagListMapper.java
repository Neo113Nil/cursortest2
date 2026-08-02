package ru.ozon.app.android.fresh.unsorted.widgets.tagList.presentation;

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
import ru.ozon.app.android.fresh.unsorted.widgets.tagList.data.TagListDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.tagList.domain.TagListVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/tagList/presentation/TagListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/tagList/data/TagListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/tagList/domain/TagListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVO", "(Lru/ozon/app/android/fresh/unsorted/widgets/tagList/data/TagListDTO;J)Lru/ozon/app/android/fresh/unsorted/widgets/tagList/domain/TagListVO;", "Lru/ozon/app/android/fresh/unsorted/widgets/tagList/data/TagListDTO$SpacersDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/tagList/domain/TagListVO$SpacersVO;", "(Lru/ozon/app/android/fresh/unsorted/widgets/tagList/data/TagListDTO$SpacersDTO;)Lru/ozon/app/android/fresh/unsorted/widgets/tagList/domain/TagListVO$SpacersVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/tagList/data/TagListDTO;Ll20/d;)Ljava/util/List;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TagListMapper implements Function2<TagListDTO, d, List<? extends TagListVO>> {
    private final TagListVO toVO(TagListDTO tagListDTO, long j11) {
        List<TagButtonDTO> tags = tagListDTO.getTags();
        String backgroundColor = tagListDTO.getBackgroundColor();
        TagListDTO.SpacersDTO spacers = tagListDTO.getSpacers();
        if (spacers == null) {
            spacers = new TagListDTO.SpacersDTO(null, null, null, null, null, 31, null);
        }
        TagListVO.SpacersVO vo = toVO(spacers);
        Map<String, TokenizedTrackingInfo> trackingInfo = tagListDTO.getTrackingInfo();
        return new TagListVO(j11, tags, backgroundColor, vo, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TagListVO> invoke(@NotNull TagListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode()));
    }

    private final TagListVO.SpacersVO toVO(TagListDTO.SpacersDTO spacersDTO) {
        return new TagListVO.SpacersVO(UiExtKt.toPx(spacersDTO.getLeft().getPx()), UiExtKt.toPx(spacersDTO.getRight().getPx()), UiExtKt.toPx(spacersDTO.getTop().getPx()), UiExtKt.toPx(spacersDTO.getBottom().getPx()), UiExtKt.toPx(spacersDTO.getBetween().getPx()));
    }
}
