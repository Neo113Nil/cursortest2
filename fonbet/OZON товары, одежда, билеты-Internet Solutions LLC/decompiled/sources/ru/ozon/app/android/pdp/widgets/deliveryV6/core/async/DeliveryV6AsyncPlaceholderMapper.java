package ru.ozon.app.android.pdp.widgets.deliveryV6.core.async;

import Kk.c;
import T00.a;
import T00.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.delivery.data.DeliveryDTOHolder;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.DeliveryV6VO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u0007*\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u0007*\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u0003j\u0002`\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/core/async/DeliveryV6AsyncPlaceholderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTOHolder;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Placeholder;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "", "isSelect", "<init>", "(Z)V", "", "isPdp", "(Ljava/lang/String;)Z", "isPdpApparelSize", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTOHolder;Ll20/d;)Ljava/util/List;", "Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryV6AsyncPlaceholderMapper implements Function2<DeliveryDTOHolder, d, List<? extends DeliveryV6VO.Placeholder>> {
    private final boolean isSelect;

    public DeliveryV6AsyncPlaceholderMapper(boolean z11) {
        this.isSelect = z11;
    }

    private final boolean isPdp(String str) {
        return Intrinsics.d(str, "pdp");
    }

    private final boolean isPdpApparelSize(String str) {
        if (str == null) {
            str = "";
        }
        return h.t(str, "apparel-size", false);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DeliveryV6VO.Placeholder> invoke(@NotNull DeliveryDTOHolder state, @NotNull d widgetInfo) {
        e h11;
        e h12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String a11 = widgetInfo.c().a();
        if (a11 == null || h.K(a11)) {
            return K.f71697a;
        }
        a b11 = widgetInfo.b();
        String str = null;
        boolean isPdp = isPdp((b11 == null || (h12 = b11.h()) == null) ? null : h12.e());
        a b12 = widgetInfo.b();
        if (b12 != null && (h11 = b12.h()) != null) {
            str = h11.j();
        }
        return C7714v.a0(new DeliveryV6VO.Placeholder(c.a(widgetInfo.d(), "_DeliveryV6VO.Placeholder"), null, Boolean.valueOf((!isPdp || isPdpApparelSize(str) || this.isSelect) ? false : true), 2, null));
    }
}
