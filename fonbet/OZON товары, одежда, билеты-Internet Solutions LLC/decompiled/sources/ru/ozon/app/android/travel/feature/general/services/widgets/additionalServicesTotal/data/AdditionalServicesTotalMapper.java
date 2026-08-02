package ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesTotal.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
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
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesTotal.data.AdditionalServicesTotalDTO;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesTotal.presentation.AdditionalServicesTotalVO;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0003j\u0002`\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/data/AdditionalServicesTotalMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/data/AdditionalServicesTotalDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/presentation/AdditionalServicesTotalVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/data/AdditionalServicesTotalDTO$ServiceItem;", "item", "", "stateId", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/presentation/AdditionalServicesTotalVO$ServiceItem;", "mapServiceItem", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/data/AdditionalServicesTotalDTO$ServiceItem;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/presentation/AdditionalServicesTotalVO$ServiceItem;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/data/AdditionalServicesTotalDTO;Ll20/d;)Ljava/util/List;", "", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/presentation/AdditionalServicesTotalVO$AdditionalServicesTotalTheme;", "mapTheme", "Ljava/util/Map;", "", "dpf12", "F", "", "dp16", "I", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalServicesTotalMapper implements Function2<AdditionalServicesTotalDTO, d, List<? extends AdditionalServicesTotalVO>> {
    private final int dp16;
    private final float dpf12;

    @NotNull
    private final Map<String, AdditionalServicesTotalVO.AdditionalServicesTotalTheme> mapTheme;

    public AdditionalServicesTotalMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mapTheme = U.j(new Pair("additionalServicesTotal", AdditionalServicesTotalVO.AdditionalServicesTotalTheme.DEFAULT), new Pair("additionalServicesTotalShaded", AdditionalServicesTotalVO.AdditionalServicesTotalTheme.SHADED));
        this.dpf12 = ResourceExtKt.toPxF(12, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
    }

    private final AdditionalServicesTotalVO.ServiceItem mapServiceItem(AdditionalServicesTotalDTO.ServiceItem item, String stateId) {
        OzonSpannableString text = item.getServiceKey().getText();
        return new AdditionalServicesTotalVO.ServiceItem((stateId + "-" + ((Object) text)).hashCode(), item.getServiceKey(), item.getServiceValues());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AdditionalServicesTotalVO> invoke(@NotNull AdditionalServicesTotalDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        AdditionalServicesTotalVO.AdditionalServicesTotalTheme additionalServicesTotalTheme = this.mapTheme.get(widgetInfo.c().b());
        if (additionalServicesTotalTheme == null) {
            return K.f71697a;
        }
        Pair pair = additionalServicesTotalTheme == AdditionalServicesTotalVO.AdditionalServicesTotalTheme.DEFAULT ? new Pair(Float.valueOf(0.0f), 0) : new Pair(Float.valueOf(this.dpf12), Integer.valueOf(this.dp16));
        float floatValue = ((Number) pair.a()).floatValue();
        int intValue = ((Number) pair.b()).intValue();
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = state.getTitle();
        List<AdditionalServicesTotalDTO.ServiceItem> serviceItems = state.getServiceItems();
        ArrayList arrayList = new ArrayList(C7714v.z(serviceItems, 10));
        Iterator<T> it = serviceItems.iterator();
        while (it.hasNext()) {
            arrayList.add(mapServiceItem((AdditionalServicesTotalDTO.ServiceItem) it.next(), widgetInfo.d()));
        }
        TextAtom totalPrice = state.getTotalPrice();
        TextAtom priceDescription = state.getPriceDescription();
        LinkButtonDTO detailsLinkButton = state.getDetailsLinkButton();
        return C7714v.a0(new AdditionalServicesTotalVO(hashCode, title, arrayList, totalPrice, priceDescription, detailsLinkButton != null ? MapperExtKt.toVO(detailsLinkButton) : null, floatValue, intValue));
    }
}
