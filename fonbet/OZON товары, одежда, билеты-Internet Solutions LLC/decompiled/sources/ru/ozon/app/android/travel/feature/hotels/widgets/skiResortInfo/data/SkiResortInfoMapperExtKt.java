package ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.data;

import Sc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.data.SkiResortInfoDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.presentation.SkiResortInfoVO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0002¢\u0006\u0002\u0010\u0007\u001a\f\u0010\u0000\u001a\u00020\b*\u00020\tH\u0002\u001a\f\u0010\u0000\u001a\u00020\n*\u00020\u000bH\u0002\u001a\f\u0010\u0000\u001a\u00020\f*\u00020\rH\u0002\u001a\f\u0010\u0000\u001a\u00020\u000e*\u00020\u000fH\u0002\u001a\f\u0010\u0000\u001a\u00020\u0010*\u00020\u0011H\u0002\u001a\u0013\u0010\u0000\u001a\u00020\u0012*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\f\u0010\u0000\u001a\u00020\u0016*\u00020\u0017H\u0002¨\u0006\u0018"}, d2 = {"toVO", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TopicVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$TopicDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$Content;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$AboutVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$AboutDTO;", "(Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$AboutDTO;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$TrailsDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$TrailItemVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$TrailItemDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$TrailCategoryDetailItemVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$TrailCategoryDetailItemDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$MapVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$MapDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$TrailLiftTypeDetailItemVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$TrailLiftTypeDetailItemDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$WeatherVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$WeatherDTO;", "toVO-3mHu3sc", "(Ljava/util/List;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$WeatherVO$WeatherItemVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$WeatherItemDTO;", "hotels_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SkiResortInfoMapperExtKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SkiResortInfoDTO.TrailCategoryDetailItemTypeDTO.values().length];
            try {
                iArr[SkiResortInfoDTO.TrailCategoryDetailItemTypeDTO.SPACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SkiResortInfoDTO.TrailCategoryDetailItemTypeDTO.CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final SkiResortInfoVO.TopicVO toVO(@NotNull SkiResortInfoDTO.TopicDTO topicDTO) {
        Intrinsics.checkNotNullParameter(topicDTO, "<this>");
        return new SkiResortInfoVO.TopicVO(topicDTO.getId(), toVO(topicDTO.getContent()), topicDTO.getCommon());
    }

    /* renamed from: toVO-3mHu3sc, reason: not valid java name */
    private static final List<? extends SkiResortInfoVO.WeatherVO.WeatherItemVO> m1426toVO3mHu3sc(List<? extends SkiResortInfoDTO.WeatherItemDTO> list) {
        List<? extends SkiResortInfoDTO.WeatherItemDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((SkiResortInfoDTO.WeatherItemDTO) it.next()));
        }
        return SkiResortInfoVO.WeatherVO.m1434constructorimpl(arrayList);
    }

    private static final SkiResortInfoVO.Content toVO(Object obj) {
        if (obj instanceof SkiResortInfoDTO.AboutDTO) {
            return SkiResortInfoVO.AboutVO.m1427boximpl(toVO((SkiResortInfoDTO.AboutDTO) obj));
        }
        if (obj instanceof SkiResortInfoDTO.TrailsDTO) {
            return toVO((SkiResortInfoDTO.TrailsDTO) obj);
        }
        if (obj instanceof SkiResortInfoDTO.WeatherDTO) {
            return SkiResortInfoVO.WeatherVO.m1433boximpl(m1426toVO3mHu3sc(((SkiResortInfoDTO.WeatherDTO) obj).getItems()));
        }
        throw new IllegalStateException("Unknown content");
    }

    private static final List<? extends TextDTO> toVO(SkiResortInfoDTO.AboutDTO aboutDTO) {
        List<TextDTO> general = aboutDTO.getGeneral();
        ArrayList arrayList = new ArrayList();
        for (TextDTO textDTO : general) {
            textDTO.setTagSupported(true);
            arrayList.add(textDTO);
        }
        arrayList.add(aboutDTO.getDescription());
        return SkiResortInfoVO.AboutVO.m1428constructorimpl(arrayList);
    }

    private static final SkiResortInfoVO.TrailsVO toVO(SkiResortInfoDTO.TrailsDTO trailsDTO) {
        List<SkiResortInfoDTO.TrailItemDTO> items = trailsDTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((SkiResortInfoDTO.TrailItemDTO) it.next()));
        }
        SkiResortInfoDTO.MapDTO map = trailsDTO.getMap();
        SkiResortInfoVO.TrailsVO.MapVO vo = map != null ? toVO(map) : null;
        TextDTO header = trailsDTO.getHeader();
        List<SkiResortInfoDTO.TrailLiftTypeDetailItemDTO> liftTypeDetailItems = trailsDTO.getLiftTypeDetailItems();
        ArrayList arrayList2 = new ArrayList(C7714v.z(liftTypeDetailItems, 10));
        Iterator<T> it2 = liftTypeDetailItems.iterator();
        while (it2.hasNext()) {
            arrayList2.add(toVO((SkiResortInfoDTO.TrailLiftTypeDetailItemDTO) it2.next()));
        }
        return new SkiResortInfoVO.TrailsVO(arrayList, vo, header, arrayList2);
    }

    private static final SkiResortInfoVO.TrailsVO.TrailItemVO toVO(SkiResortInfoDTO.TrailItemDTO trailItemDTO) {
        String trailColorToken = trailItemDTO.getTrailColorToken();
        TextDTO text = trailItemDTO.getText();
        List<SkiResortInfoDTO.TrailCategoryDetailItemDTO> categoryDetailItems = trailItemDTO.getCategoryDetailItems();
        ArrayList arrayList = new ArrayList(C7714v.z(categoryDetailItems, 10));
        Iterator<T> it = categoryDetailItems.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((SkiResortInfoDTO.TrailCategoryDetailItemDTO) it.next()));
        }
        return new SkiResortInfoVO.TrailsVO.TrailItemVO(trailColorToken, text, arrayList);
    }

    private static final SkiResortInfoVO.TrailsVO.TrailCategoryDetailItemVO toVO(SkiResortInfoDTO.TrailCategoryDetailItemDTO trailCategoryDetailItemDTO) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[trailCategoryDetailItemDTO.getItemType().ordinal()];
        if (i11 == 1) {
            return SkiResortInfoVO.TrailsVO.TrailCategoryDetailItemVO.Space.INSTANCE;
        }
        if (i11 == 2) {
            if (trailCategoryDetailItemDTO.getIcon() != null && trailCategoryDetailItemDTO.getText() != null) {
                return new SkiResortInfoVO.TrailsVO.TrailCategoryDetailItemVO.Content(trailCategoryDetailItemDTO.getIcon(), trailCategoryDetailItemDTO.getText());
            }
            throw new IllegalStateException("Content must contain an icon and text");
        }
        throw new o();
    }

    private static final SkiResortInfoVO.TrailsVO.MapVO toVO(SkiResortInfoDTO.MapDTO mapDTO) {
        return new SkiResortInfoVO.TrailsVO.MapVO(mapDTO.getImage(), mapDTO.getButton());
    }

    private static final SkiResortInfoVO.TrailsVO.TrailLiftTypeDetailItemVO toVO(SkiResortInfoDTO.TrailLiftTypeDetailItemDTO trailLiftTypeDetailItemDTO) {
        return new SkiResortInfoVO.TrailsVO.TrailLiftTypeDetailItemVO(trailLiftTypeDetailItemDTO.getIcon(), trailLiftTypeDetailItemDTO.getText());
    }

    private static final SkiResortInfoVO.WeatherVO.WeatherItemVO toVO(SkiResortInfoDTO.WeatherItemDTO weatherItemDTO) {
        List<TextDTO> details = weatherItemDTO.getDetails();
        return new SkiResortInfoVO.WeatherVO.WeatherItemVO(weatherItemDTO.getImage(), details.get(0), details.get(1), details.get(2));
    }
}
