package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.data;

import Ib.a;
import e10.AbstractC6252b;
import j20.C7244b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.data.dto.TileGrid3DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.data.mapper.TileGrid3Mapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.data.TileGrid3VO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.separator.TileGrid3SeparatorVO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u0000 \u00192\u00060\u0001j\u0002`\u0002:\u0001\u0019B#\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/TileGrid3Config;", "Le10/b;", "Lru/ozon/app/android/composer/widgets/base/config/list/ListConfig;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "LIb/a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/mapper/TileGrid3Mapper;", "mapper", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;LIb/a;)V", "", "", "", "bgColor", "", "addSeparator", "(Ljava/util/List;Ljava/lang/String;)V", "Lj20/b;", "state", "", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "LIb/a;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid3Config extends AbstractC6252b {

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final a<TileGrid3Mapper> mapper;

    public TileGrid3Config(@NotNull JsonParser jsonDeserializer, @NotNull a<TileGrid3Mapper> mapper) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.jsonDeserializer = jsonDeserializer;
        this.mapper = mapper;
    }

    private final void addSeparator(List<Object> list, String str) {
        list.add(new TileGrid3SeparatorVO(list.hashCode(), str));
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public List<? extends Object> parse(@NotNull C7244b state) {
        Object obj;
        Intrinsics.checkNotNullParameter(state, "state");
        TileGrid3DTO tileGrid3DTO = (TileGrid3DTO) this.jsonDeserializer.fromJson(state.b(), TileGrid3DTO.class);
        List<Object> arrayList = new ArrayList<>();
        Object header = tileGrid3DTO.getHeader();
        if (header != null) {
            arrayList.add(header);
        }
        List<Object> map = this.mapper.get().map(tileGrid3DTO, state.c().c());
        arrayList.add(map);
        Iterator<T> it = map.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof TileGrid3VO) {
                break;
            }
        }
        TileGrid3VO tileGrid3VO = obj instanceof TileGrid3VO ? (TileGrid3VO) obj : null;
        String backgroundColor = tileGrid3VO != null ? tileGrid3VO.getBackgroundColor() : null;
        int size = map.size() % 3;
        if (size == 1) {
            for (int i11 = 0; i11 < 2; i11++) {
                addSeparator(arrayList, backgroundColor);
            }
        } else if (size == 2) {
            addSeparator(arrayList, backgroundColor);
            return arrayList;
        }
        return arrayList;
    }
}
