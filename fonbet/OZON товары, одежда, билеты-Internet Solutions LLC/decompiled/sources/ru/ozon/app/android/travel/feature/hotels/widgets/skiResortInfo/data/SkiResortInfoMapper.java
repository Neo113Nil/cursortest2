package ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.data.SkiResortInfoDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.presentation.SkiResortInfoVO;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/core/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO;Ll20/d;)Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SkiResortInfoMapper implements Function2<SkiResortInfoDTO, d, List<? extends SkiResortInfoVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SkiResortInfoVO> invoke(@NotNull SkiResortInfoDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        Tabs tabs = state.getTabs();
        List<SkiResortInfoDTO.TopicDTO> topics = state.getTopics();
        ArrayList arrayList = new ArrayList(C7714v.z(topics, 10));
        Iterator<T> it = topics.iterator();
        while (it.hasNext()) {
            arrayList.add(SkiResortInfoMapperExtKt.toVO((SkiResortInfoDTO.TopicDTO) it.next()));
        }
        return C7714v.a0(new SkiResortInfoVO(hashCode, title, tabs, arrayList, state.getBackgroundColor(), state.getThemeImage(), state.getCommon()));
    }
}
