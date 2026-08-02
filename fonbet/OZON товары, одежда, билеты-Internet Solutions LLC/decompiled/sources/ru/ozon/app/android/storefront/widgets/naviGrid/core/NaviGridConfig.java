package ru.ozon.app.android.storefront.widgets.naviGrid.core;

import Sc.o;
import e10.AbstractC6252b;
import j20.C7244b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.widgets.naviGrid.data.AccentPosition;
import ru.ozon.app.android.storefront.widgets.naviGrid.data.FloorDTO;
import ru.ozon.app.android.storefront.widgets.naviGrid.data.ItemDTO;
import ru.ozon.app.android.storefront.widgets.naviGrid.data.NaviGridDTO;
import ru.ozon.app.android.storefront.widgets.naviGrid.data.TileDTO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000f2\u00060\u0001j\u0002`\u0002:\u0001\u000fB\u0015\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviGrid/core/NaviGridConfig;", "Le10/b;", "Lru/ozon/app/android/composer/widgets/base/config/list/ListConfig;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lj20/b;", "state", "", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/TileDTO;", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NaviGridConfig extends AbstractC6252b {

    @NotNull
    private final JsonParser jsonDeserializer;
    public static final int $stable = 8;

    public NaviGridConfig(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public List<? extends Object> parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        NaviGridDTO naviGridDTO = (NaviGridDTO) this.jsonDeserializer.fromJson(state.b(), NaviGridDTO.class);
        String backgroundColor = naviGridDTO.getBackgroundColor();
        Map<String, TokenizedTrackingInfo> trackingInfo = naviGridDTO.getTrackingInfo();
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        boolean z12 = false;
        for (FloorDTO floorDTO : naviGridDTO.getFloors()) {
            if (floorDTO instanceof FloorDTO.AccentDTO) {
                FloorDTO.AccentDTO accentDTO = (FloorDTO.AccentDTO) floorDTO;
                if (accentDTO.getAccentItem().getTitle() == null || accentDTO.getItems().size() != 2) {
                    return K.f71697a;
                }
                Iterator<ItemDTO> it = accentDTO.getItems().iterator();
                while (it.hasNext()) {
                    if (it.next().getTitle() == null) {
                        return K.f71697a;
                    }
                }
                TileDTO.AccentDTO accentDTO2 = new TileDTO.AccentDTO(accentDTO.getAccentItem(), accentDTO.getAccentPosition(), backgroundColor, trackingInfo);
                TileDTO.CoupleDTO coupleDTO = new TileDTO.CoupleDTO(accentDTO.getItems(), accentDTO.getAccentPosition(), backgroundColor, trackingInfo);
                if (accentDTO.getAccentPosition() == AccentPosition.LEFT) {
                    arrayList.add(accentDTO2);
                    arrayList.add(coupleDTO);
                } else {
                    arrayList.add(coupleDTO);
                    arrayList.add(accentDTO2);
                }
                z11 = true;
            } else {
                if (!(floorDTO instanceof FloorDTO.PairDTO)) {
                    throw new o();
                }
                FloorDTO.PairDTO pairDTO = (FloorDTO.PairDTO) floorDTO;
                if (pairDTO.getItems().size() != 2) {
                    return K.f71697a;
                }
                Iterator<ItemDTO> it2 = pairDTO.getItems().iterator();
                while (it2.hasNext()) {
                    if (it2.next().getTitle() == null) {
                        z12 = true;
                    }
                }
                arrayList.add(new TileDTO.PairDTO(pairDTO.getItems(), backgroundColor, trackingInfo));
            }
        }
        if (z11 && z12) {
            return K.f71697a;
        }
        if (z12) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((TileDTO) it3.next()).setHideTitle(true);
            }
        }
        return arrayList;
    }
}
