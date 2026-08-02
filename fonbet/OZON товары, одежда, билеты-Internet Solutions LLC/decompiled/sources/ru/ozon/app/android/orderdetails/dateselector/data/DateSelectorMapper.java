package ru.ozon.app.android.orderdetails.dateselector.data;

import Kk.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.dateselector.data.DateSelectorDTO;
import ru.ozon.app.android.orderdetails.dateselector.presentation.DateSelectorVO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\u0005*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/orderdetails/dateselector/data/DateSelectorMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/orderdetails/dateselector/data/DateSelectorDTO;", "Ll20/d;", "", "Lru/ozon/app/android/orderdetails/dateselector/presentation/DateSelectorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/orderdetails/dateselector/data/DateSelectorDTO$DateItem;", "", "stateId", "", "isSelected", "toVO", "(Lru/ozon/app/android/orderdetails/dateselector/data/DateSelectorDTO$DateItem;Ljava/lang/String;Z)Lru/ozon/app/android/orderdetails/dateselector/presentation/DateSelectorVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/orderdetails/dateselector/data/DateSelectorDTO;Ll20/d;)Ljava/util/List;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DateSelectorMapper implements Function2<DateSelectorDTO, d, List<? extends DateSelectorVO>> {
    private final DateSelectorVO toVO(DateSelectorDTO.DateItem dateItem, String str, boolean z11) {
        return new DateSelectorVO(c.a(str, dateItem.getTitle()), dateItem.getTitle(), dateItem.getDeeplink(), z11);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DateSelectorVO> invoke(@NotNull DateSelectorDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<DateSelectorDTO.DateItem> dates = state.getDates();
        ArrayList arrayList = new ArrayList(C7714v.z(dates, 10));
        int i11 = 0;
        for (Object obj : dates) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(toVO((DateSelectorDTO.DateItem) obj, widgetInfo.d(), i11 == state.getSelectedIndex()));
            i11 = i12;
        }
        return arrayList;
    }
}
