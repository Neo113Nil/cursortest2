package ru.ozon.app.android.cabinet.tabSelector.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.tabSelector.data.TabSelectorDTO;
import ru.ozon.app.android.cabinet.tabSelector.presentation.TabSelectorVO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cabinet/tabSelector/data/TabSelectorMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cabinet/tabSelector/data/TabSelectorDTO;", "Ll20/d;", "", "Lru/ozon/app/android/cabinet/tabSelector/presentation/TabSelectorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/cabinet/tabSelector/data/TabSelectorDTO$TabSelectorItemDTO;", "Lru/ozon/app/android/cabinet/tabSelector/presentation/TabSelectorVO$TabSelectorItemVO;", "toVO", "(Lru/ozon/app/android/cabinet/tabSelector/data/TabSelectorDTO$TabSelectorItemDTO;)Lru/ozon/app/android/cabinet/tabSelector/presentation/TabSelectorVO$TabSelectorItemVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/cabinet/tabSelector/data/TabSelectorDTO;Ll20/d;)Ljava/util/List;", "Companion", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TabSelectorMapper implements Function2<TabSelectorDTO, d, List<? extends TabSelectorVO>> {
    private static final long WIDGET_ID = -896565794;

    private final TabSelectorVO.TabSelectorItemVO toVO(TabSelectorDTO.TabSelectorItemDTO tabSelectorItemDTO) {
        return new TabSelectorVO.TabSelectorItemVO(tabSelectorItemDTO.isSelected(), tabSelectorItemDTO.getTitle(), tabSelectorItemDTO.getDeeplink());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TabSelectorVO> invoke(@NotNull TabSelectorDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long j11 = WIDGET_ID;
        List<TabSelectorDTO.TabSelectorItemDTO> tabs = state.getTabs();
        ArrayList arrayList = new ArrayList(C7714v.z(tabs, 10));
        Iterator<T> it = tabs.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((TabSelectorDTO.TabSelectorItemDTO) it.next()));
        }
        return C7714v.a0(new TabSelectorVO(j11, arrayList));
    }
}
