package ru.ozon.app.android.storefront.widgets.naviCategories.data;

import Sc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.storefront.widgets.naviCategories.data.NaviCategoriesDTO;
import ru.ozon.app.android.storefront.widgets.naviCategories.data.NaviCategoriesModel;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.BlockPositionVO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00142\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0014B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\u0004*\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002R\u0012\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesParser;", "Lkotlin/Function2;", "", "", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesModel;", "deserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "invoke", "params", "state", "mapToCategoryModels", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO;", "mapToModel", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$NaviCategoryBlockDTO;", "roundedCorners", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$RoundedCornersDTO;", "setItemPositions", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NaviCategoriesParser implements Function2<String, String, List<? extends NaviCategoriesModel>> {

    @NotNull
    private final JsonParser deserializer;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesParser$Companion;", "", "<init>", "()V", "ROW_SPAN_SIZE", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NaviCategoriesDTO.NaviCategoryBlockDTO.BlockTypeDTO.values().length];
            try {
                iArr[NaviCategoriesDTO.NaviCategoryBlockDTO.BlockTypeDTO.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NaviCategoriesDTO.NaviCategoryBlockDTO.BlockTypeDTO.DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NaviCategoriesParser(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.deserializer = deserializer;
    }

    private final List<NaviCategoriesModel> mapToCategoryModels(NaviCategoriesDTO naviCategoriesDTO) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = naviCategoriesDTO.getBlocks().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            NaviCategoriesModel mapToModel = mapToModel((NaviCategoriesDTO.NaviCategoryBlockDTO) it.next(), naviCategoriesDTO.getRoundedCorners());
            boolean z11 = mapToModel instanceof NaviCategoriesModel.DoubleNaviCategoryModel;
            int i12 = 2;
            if (i11 % 3 == 2 && z11) {
                arrayList.add(new NaviCategoriesModel.EmptyNaviCategoryModel(naviCategoriesDTO.getRoundedCorners()));
                i11++;
            }
            arrayList.add(mapToModel);
            if (!z11) {
                i12 = 1;
            }
            i11 += i12;
        }
        while (i11 % 3 != 0) {
            arrayList.add(new NaviCategoriesModel.EmptyNaviCategoryModel(naviCategoriesDTO.getRoundedCorners()));
            i11++;
        }
        return arrayList;
    }

    private final NaviCategoriesModel mapToModel(NaviCategoriesDTO.NaviCategoryBlockDTO naviCategoryBlockDTO, NaviCategoriesDTO.RoundedCornersDTO roundedCornersDTO) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[naviCategoryBlockDTO.getType().ordinal()];
        if (i11 == 1) {
            return new NaviCategoriesModel.SingleNaviCategoryModel(roundedCornersDTO, naviCategoryBlockDTO);
        }
        if (i11 == 2) {
            return new NaviCategoriesModel.DoubleNaviCategoryModel(roundedCornersDTO, naviCategoryBlockDTO);
        }
        throw new o();
    }

    private final List<NaviCategoriesModel> setItemPositions(List<? extends NaviCategoriesModel> list) {
        List<? extends NaviCategoriesModel> list2 = list;
        int i11 = 0;
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            NaviCategoriesModel naviCategoriesModel = (NaviCategoriesModel) obj;
            boolean z11 = naviCategoriesModel instanceof NaviCategoriesModel.DoubleNaviCategoryModel;
            int i14 = 2;
            naviCategoriesModel.setPosition((i11 == 0 && (i11 == C7714v.P(list) - 2 || i11 == C7714v.P(list) - 1)) ? BlockPositionVO.TOP_BOTTOM_LEFT : (i11 == 1 && i11 == C7714v.P(list) - 1) ? BlockPositionVO.TOP_BOTTOM_MIDDLE : ((i11 == 1 || i11 == 2) && i11 == C7714v.P(list)) ? BlockPositionVO.TOP_BOTTOM_RIGHT : i11 == 0 ? BlockPositionVO.TOP_LEFT : (i12 == 1 && i11 == 1 && !z11) ? BlockPositionVO.TOP_MIDDLE : (i12 < 1 || !(i11 == 1 || i11 == 2)) ? (i12 == 0 && (i11 == C7714v.P(list) - 2 || i11 == C7714v.P(list) - 1)) ? BlockPositionVO.BOTTOM_LEFT : (i12 == 1 && i11 == C7714v.P(list) - 1) ? BlockPositionVO.BOTTOM_MIDDLE : i11 == C7714v.P(list) ? BlockPositionVO.BOTTOM_RIGHT : i12 == 0 ? BlockPositionVO.MIDDLE_LEFT : (i12 != 1 || z11) ? BlockPositionVO.MIDDLE_RIGHT : BlockPositionVO.MIDDLE_MIDDLE : BlockPositionVO.TOP_RIGHT);
            if (!z11) {
                i14 = 1;
            }
            i12 = (i12 + i14) % 3;
            i11 = i13;
        }
        return list2;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<NaviCategoriesModel> invoke(String params, String state) {
        NaviCategoriesDTO naviCategoriesDTO;
        return (state == null || (naviCategoriesDTO = (NaviCategoriesDTO) this.deserializer.fromJson(state, NaviCategoriesDTO.class)) == null) ? K.f71697a : setItemPositions(mapToCategoryModels(naviCategoriesDTO));
    }
}
