package ru.ozon.app.android.bank.widgets.cbottom.core;

import Lm0.a;
import WZ.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.bank.widgets.cbottom.data.CbottomWidgetDTO;
import ru.ozon.app.android.bank.widgets.cbottom.presentation.CbottomWidgetVO;
import x40.C10656a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/bank/widgets/cbottom/core/CbottomWidgetMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/bank/widgets/cbottom/data/CbottomWidgetDTO;", "Ll20/d;", "", "Lru/ozon/app/android/bank/widgets/cbottom/presentation/CbottomWidgetVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lx40/a;", "cbottomMapper2", "Lru/ozon/app/android/bank/widgets/cbottom/core/CbottomWidgetListenersStore;", "listenersStore", "<init>", "(Lx40/a;Lru/ozon/app/android/bank/widgets/cbottom/core/CbottomWidgetListenersStore;)V", "dto", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "info", "invoke", "(Lru/ozon/app/android/bank/widgets/cbottom/data/CbottomWidgetDTO;Ll20/d;)Ljava/util/List;", "Lx40/a;", "Lru/ozon/app/android/bank/widgets/cbottom/core/CbottomWidgetListenersStore;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CbottomWidgetMapper implements Function2<CbottomWidgetDTO, d, List<? extends CbottomWidgetVO>> {

    @NotNull
    private final C10656a cbottomMapper2;

    @NotNull
    private final CbottomWidgetListenersStore listenersStore;

    public CbottomWidgetMapper(@NotNull C10656a cbottomMapper2, @NotNull CbottomWidgetListenersStore listenersStore) {
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(listenersStore, "listenersStore");
        this.cbottomMapper2 = cbottomMapper2;
        this.listenersStore = listenersStore;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CbottomWidgetVO> invoke(@NotNull CbottomWidgetDTO dto, @NotNull d info) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        try {
            arrayList = C10656a.b(String.valueOf(hashCode), this.cbottomMapper2.e(String.valueOf(dto.getWidgets())), new CbottomWidgetMapper$invoke$result$1(this, hashCode), null);
        } catch (Exception e11) {
            a.f17149a.e(e11, "Error parse dto.cbottomJson " + dto, new Object[0]);
            arrayList = null;
        }
        if (arrayList != null) {
            String backgroundColor = dto.getBackgroundColor();
            List<Integer> widgetPadding = dto.getWidgetPadding();
            List<Integer> backgroundRadius = dto.getBackgroundRadius();
            List<Integer> widgetMargin = dto.getWidgetMargin();
            Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
            List<CbottomWidgetVO> a02 = C7714v.a0(new CbottomWidgetVO(hashCode, arrayList, backgroundColor, widgetPadding, backgroundRadius, widgetMargin, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null));
            if (a02 != null) {
                return a02;
            }
        }
        return K.f71697a;
    }
}
