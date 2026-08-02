package ru.ozon.app.android.travel.feature.general.common.widgets.starsTile.data;

import android.content.Context;
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
import ru.ozon.app.android.travel.feature.general.common.widgets.starsTile.presentation.StarsTileVI;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.starsBlock.StarsBalanceMoleculeVI;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u0005*\u00020\u00022\n\u0010\f\u001a\u00060\u0003j\u0002`\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\f\u001a\u00060\u0003j\u0002`\u000bH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/data/StarsTileMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/data/StarsTileDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/presentation/StarsTileVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "toVI", "(Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/data/StarsTileDTO;Ll20/d;)Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/presentation/StarsTileVI;", "state", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/data/StarsTileDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StarsTileMapper implements Function2<StarsTileDTO, d, List<? extends StarsTileVI>> {

    @NotNull
    private final Context context;

    public StarsTileMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final StarsTileVI toVI(StarsTileDTO starsTileDTO, d dVar) {
        long hashCode = dVar.d().hashCode();
        StarsBalanceMoleculeVI vi2 = MapperExtKt.toVI(starsTileDTO.getFirstBlock(), this.context, hashCode);
        StarsBalanceMoleculeVI vi3 = MapperExtKt.toVI(starsTileDTO.getSecondBlock(), this.context, hashCode);
        String backgroundColor = starsTileDTO.getBackgroundColor();
        Map<String, TokenizedTrackingInfo> trackingInfo = starsTileDTO.getTrackingInfo();
        return new StarsTileVI(hashCode, vi2, vi3, backgroundColor, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<StarsTileVI> invoke(@NotNull StarsTileDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVI(state, widgetInfo));
    }
}
