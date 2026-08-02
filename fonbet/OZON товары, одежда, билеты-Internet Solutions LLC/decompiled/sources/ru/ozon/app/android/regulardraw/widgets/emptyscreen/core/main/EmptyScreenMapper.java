package ru.ozon.app.android.regulardraw.widgets.emptyscreen.core.main;

import WZ.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.data.EmptyScreenDTO;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.data.Text$TextDTO;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.data.Text$TitleDTO;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.main.EmptyScreenVI;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/core/main/EmptyScreenMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/EmptyScreenDTO;", "Ll20/d;", "", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/EmptyScreenVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVi", "(Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/EmptyScreenDTO;J)Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/EmptyScreenVI;", "state", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/EmptyScreenDTO;Ll20/d;)Ljava/util/List;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmptyScreenMapper implements Function2<EmptyScreenDTO, d, List<? extends EmptyScreenVI>> {
    private final EmptyScreenVI toVi(EmptyScreenDTO emptyScreenDTO, long j11) {
        List<Object> items = emptyScreenDTO.getIsland().getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        for (Object obj : items) {
            if (obj instanceof Text$TextDTO) {
                obj = Text$TextDTO.copy$default((Text$TextDTO) obj, null, null, 0, null, emptyScreenDTO.getIsland().getShowBackground(), 15, null);
            } else if (obj instanceof Text$TitleDTO) {
                obj = Text$TitleDTO.copy$default((Text$TitleDTO) obj, null, null, 0, null, emptyScreenDTO.getIsland().getShowBackground(), 15, null);
            }
            arrayList.add(obj);
        }
        boolean showBackground = emptyScreenDTO.getIsland().getShowBackground();
        Integer topMargin = emptyScreenDTO.getIsland().getTopMargin();
        Map<String, TokenizedTrackingInfo> trackingInfo = emptyScreenDTO.getTrackingInfo();
        return new EmptyScreenVI(j11, arrayList, showBackground, topMargin, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<EmptyScreenVI> invoke(@NotNull EmptyScreenDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVi(state, widgetInfo.d().hashCode()));
    }
}
