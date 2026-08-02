package ru.ozon.app.android.storefront.widgets.naviBlocks.data;

import Sc.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlockModel;
import ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlocksDTO;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.NaviBlockPositionVO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002.\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`\u0005B\u0013\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksParser;", "Lkotlin/Function2;", "", "", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO;", "dto", "", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel;", "mapNaviBlockModelsToVo", "(Ljava/util/List;Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO;)Ljava/util/List;", "addLastEmptyItemIfNeed", "setItemPositions", "(Ljava/util/List;)Ljava/util/List;", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NaviBlocksParser implements Function2<String, String, List<? extends Object>> {

    @NotNull
    private final JsonParser deserializer;

    public NaviBlocksParser(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.deserializer = deserializer;
    }

    private final List<NaviBlockModel> addLastEmptyItemIfNeed(List<NaviBlockModel> list, NaviBlocksDTO naviBlocksDTO) {
        if (list.size() % 2 != 0) {
            list.add(new NaviBlockModel.LastEmptyNaviBlockModel(naviBlocksDTO.getRoundedCorners()));
        }
        return list;
    }

    private final List<NaviBlockModel> mapNaviBlockModelsToVo(List<? extends NaviBlocksDTO.NaviBlockDTO> list, NaviBlocksDTO naviBlocksDTO) {
        ArrayList arrayList = new ArrayList();
        for (NaviBlocksDTO.NaviBlockDTO naviBlockDTO : list) {
            if (naviBlockDTO instanceof NaviBlocksDTO.NaviBlockDTO.SquareSingleDTO) {
                NaviBlocksDTO.NaviBlockDTO.SquareSingleDTO squareSingleDTO = (NaviBlocksDTO.NaviBlockDTO.SquareSingleDTO) naviBlockDTO;
                if (squareSingleDTO.getFrames().isEmpty()) {
                    naviBlockDTO = null;
                }
                NaviBlocksDTO.NaviBlockDTO.SquareSingleDTO squareSingleDTO2 = (NaviBlocksDTO.NaviBlockDTO.SquareSingleDTO) naviBlockDTO;
                if (squareSingleDTO2 != null) {
                    arrayList.add(squareSingleDTO2.getFrames().size() > 1 ? new NaviBlockModel.CarouselNaviBlockModel(squareSingleDTO, naviBlocksDTO.getRoundedCorners()) : new NaviBlockModel.OneFrameNaviBlockModel((NaviBlocksDTO.NaviBlockDTO.SquareSingleDTO.FrameDTO) C7714v.K(squareSingleDTO.getFrames()), naviBlocksDTO.getRoundedCorners()));
                }
            } else {
                if (!(naviBlockDTO instanceof NaviBlocksDTO.NaviBlockDTO.SquareCoupleDTO)) {
                    throw new o();
                }
                arrayList.add(new NaviBlockModel.CoupleNaviBlockModel((NaviBlocksDTO.NaviBlockDTO.SquareCoupleDTO) naviBlockDTO, naviBlocksDTO.getRoundedCorners()));
            }
        }
        return arrayList;
    }

    private final List<NaviBlockModel> setItemPositions(List<NaviBlockModel> list) {
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ((NaviBlockModel) obj).setPosition(i11 == 0 ? i11 == C7714v.P(list) - 1 ? NaviBlockPositionVO.FIRST_PENULTIMATE : NaviBlockPositionVO.FIRST : i11 == 1 ? i11 == C7714v.P(list) ? NaviBlockPositionVO.SECOND_LAST : NaviBlockPositionVO.SECOND : i11 == C7714v.P(list) - 1 ? NaviBlockPositionVO.PENULTIMATE : i11 == C7714v.P(list) ? NaviBlockPositionVO.LAST : i11 % 2 == 0 ? NaviBlockPositionVO.MIDDLE_EVEN : NaviBlockPositionVO.MIDDLE_ODD);
            i11 = i12;
        }
        return list;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        NaviBlocksDTO naviBlocksDTO;
        return (state == null || (naviBlocksDTO = (NaviBlocksDTO) this.deserializer.fromJson(state, NaviBlocksDTO.class)) == null) ? K.f71697a : setItemPositions(addLastEmptyItemIfNeed(mapNaviBlockModelsToVo(naviBlocksDTO.getBlocks(), naviBlocksDTO), naviBlocksDTO));
    }
}
