package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageRoomsSearchForm.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageRoomsSearchForm.presentation.HotelsPageRoomsSearchFormVI;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageRoomsSearchForm/data/HotelsPageRoomsSearchFormMapper;", "Lkotlin/Function2;", "", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageRoomsSearchForm/presentation/HotelsPageRoomsSearchFormVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lkotlin/Unit;Ll20/d;)Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageRoomsSearchFormMapper implements Function2<Unit, d, List<? extends HotelsPageRoomsSearchFormVI>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsPageRoomsSearchFormVI> invoke(@NotNull Unit state, @NotNull d widgetInfo) {
        List<HotelsPageRoomsSearchFormVI> a02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String a11 = widgetInfo.c().a();
        return (a11 == null || (a02 = C7714v.a0(new HotelsPageRoomsSearchFormVI((long) widgetInfo.d().hashCode(), a11))) == null) ? K.f71697a : a02;
    }
}
