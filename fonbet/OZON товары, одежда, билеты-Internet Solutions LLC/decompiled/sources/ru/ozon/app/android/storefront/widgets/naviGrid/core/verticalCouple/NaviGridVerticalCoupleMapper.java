package ru.ozon.app.android.storefront.widgets.naviGrid.core.verticalCouple;

import Sc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.naviGrid.core.accent.NaviGridAccentMapperKt;
import ru.ozon.app.android.storefront.widgets.naviGrid.data.AccentPosition;
import ru.ozon.app.android.storefront.widgets.naviGrid.data.ItemDTO;
import ru.ozon.app.android.storefront.widgets.naviGrid.data.TileDTO;
import ru.ozon.app.android.storefront.widgets.naviGrid.presentation.CoupleVO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviGrid/core/verticalCouple/NaviGridVerticalCoupleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/TileDTO$CoupleDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/naviGrid/presentation/CoupleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/naviGrid/data/TileDTO$CoupleDTO;Ll20/d;)Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NaviGridVerticalCoupleMapper implements Function2<TileDTO.CoupleDTO, d, List<? extends CoupleVO>> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccentPosition.values().length];
            try {
                iArr[AccentPosition.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccentPosition.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CoupleVO> invoke(@NotNull TileDTO.CoupleDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.getAccentPosition().ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            if (i11 != 2) {
                throw new o();
            }
            i12 = 0;
        }
        int i13 = i12;
        List<ItemDTO> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(NaviGridAccentMapperKt.toVO((ItemDTO) it.next(), hashCode, i13, state.getMainBgColor(), state.getHideTitle(), state.getTrackingInfo()));
        }
        return C7714v.a0(new CoupleVO(hashCode, arrayList));
    }
}
