package ru.ozon.app.android.pdp.widgets.deliveryV6.core.header.title;

import Kk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.delivery.data.DeliveryDTO;
import ru.ozon.app.android.pdp.widgets.delivery.data.DeliveryDTOHolder;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.DeliveryV6VO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/core/header/title/DeliveryV6HeaderTitleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTOHolder;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Header$Title;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTOHolder;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryV6HeaderTitleMapper implements Function2<DeliveryDTOHolder, d, List<? extends DeliveryV6VO.Header.Title>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DeliveryV6VO.Header.Title> invoke(@NotNull DeliveryDTOHolder state, @NotNull d widgetInfo) {
        TextAtom title;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        DeliveryDTO value = state.getValue();
        if (value != null ? Intrinsics.d(value.isHidden(), Boolean.TRUE) : false) {
            return K.f71697a;
        }
        long a11 = c.a(widgetInfo.d(), "_DeliveryV6VO.Header.Title");
        DeliveryDTO value2 = state.getValue();
        TextDTO textDTO = null;
        String tabGroupId = value2 != null ? value2.getTabGroupId() : null;
        DeliveryDTO value3 = state.getValue();
        if (value3 != null && (title = value3.getTitle()) != null) {
            textDTO = TextMapperKt.getDsTextAtom(title);
        }
        return C7714v.a0(new DeliveryV6VO.Header.Title(a11, tabGroupId, textDTO));
    }
}
