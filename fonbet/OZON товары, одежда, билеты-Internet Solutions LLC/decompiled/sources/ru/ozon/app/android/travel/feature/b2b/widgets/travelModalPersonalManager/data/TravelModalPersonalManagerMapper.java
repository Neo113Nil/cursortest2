package ru.ozon.app.android.travel.feature.b2b.widgets.travelModalPersonalManager.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelModalPersonalManager.presentation.TravelModalPersonalManagerVO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelModalPersonalManager/data/TravelModalPersonalManagerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelModalPersonalManager/data/TravelModalPersonalManagerDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelModalPersonalManager/presentation/TravelModalPersonalManagerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelModalPersonalManager/presentation/TravelModalPersonalManagerVO$AdvantageVO;", "toAdvantageVO", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)Lru/ozon/app/android/travel/feature/b2b/widgets/travelModalPersonalManager/presentation/TravelModalPersonalManagerVO$AdvantageVO;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelModalPersonalManager/data/TravelModalPersonalManagerDTO;Ll20/d;)Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelModalPersonalManagerMapper implements Function2<TravelModalPersonalManagerDTO, d, List<? extends TravelModalPersonalManagerVO>> {
    private final TravelModalPersonalManagerVO.AdvantageVO toAdvantageVO(TextAtom textAtom) {
        return new TravelModalPersonalManagerVO.AdvantageVO(textAtom.getText().hashCode(), textAtom);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelModalPersonalManagerVO> invoke(@NotNull TravelModalPersonalManagerDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = dto.getTitle();
        String logo = dto.getLogo();
        boolean z11 = dto.getLogo() != null;
        String logoBackgroundColor = dto.getLogoBackgroundColor();
        List<TextAtom> contentList = dto.getContentList();
        ArrayList arrayList = new ArrayList(C7714v.z(contentList, 10));
        Iterator<T> it = contentList.iterator();
        while (it.hasNext()) {
            arrayList.add(toAdvantageVO((TextAtom) it.next()));
        }
        return C7714v.a0(new TravelModalPersonalManagerVO(hashCode, title, logo, z11, logoBackgroundColor, arrayList, dto.getNotificationText(), dto.getButtons()));
    }
}
