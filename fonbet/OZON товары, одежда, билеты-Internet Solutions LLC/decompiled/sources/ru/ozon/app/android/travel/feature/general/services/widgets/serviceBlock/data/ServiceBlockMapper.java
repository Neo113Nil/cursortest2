package ru.ozon.app.android.travel.feature.general.services.widgets.serviceBlock.data;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.services.widgets.serviceBlock.presentation.ServiceBlockWidgetVO;
import ru.ozon.app.android.travel.molecules.dto.serviceBlock.v4.ServiceBlockV4DTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/serviceBlock/data/ServiceBlockMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v4/ServiceBlockV4DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/services/widgets/serviceBlock/presentation/ServiceBlockWidgetVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v4/ServiceBlockV4DTO;Ll20/d;)Ljava/util/List;", "", "", "Lru/ozon/app/android/travel/feature/general/services/widgets/serviceBlock/presentation/ServiceBlockWidgetVO$ServiceBlockTheme;", "mapTheme", "Ljava/util/Map;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ServiceBlockMapper implements Function2<ServiceBlockV4DTO, d, List<? extends ServiceBlockWidgetVO>> {

    @NotNull
    private final Map<String, ServiceBlockWidgetVO.ServiceBlockTheme> mapTheme = U.j(new Pair("serviceBlock", ServiceBlockWidgetVO.ServiceBlockTheme.DEFAULT), new Pair("serviceBlockShaded", ServiceBlockWidgetVO.ServiceBlockTheme.SHADED));

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ServiceBlockWidgetVO> invoke(@NotNull ServiceBlockV4DTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        ServiceBlockWidgetVO.ServiceBlockTheme serviceBlockTheme = this.mapTheme.get(widgetInfo.c().b());
        return serviceBlockTheme == null ? K.f71697a : C7714v.a0(new ServiceBlockWidgetVO(widgetInfo.d().hashCode(), MapperExtKt.toVO(dto), serviceBlockTheme));
    }
}
