package ru.ozon.app.android.fresh.unsorted.widgets.autoCatalog.data;

import Sc.r;
import Sc.s;
import Tc.b;
import e10.AbstractC6252b;
import j20.C7244b;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.common.widgets.header.CommonHeaderDTO;
import ru.ozon.app.android.fresh.common.widgets.header.HeaderApi;
import ru.ozon.app.android.fresh.common.widgets.header.HeaderState;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileMapperKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileType;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.data.FreshTileDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.data.FreshTileGridDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation.plug.FreshTileGridPlugVO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0001\u0018\u0000 \u001f2\u00060\u0001j\u0002`\u0002:\u0001\u001fB\u001f\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJC\u0010\u0016\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/autoCatalog/data/AutoCatalogConfig;", "Le10/b;", "Lru/ozon/app/android/composer/widgets/base/config/list/ListConfig;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "Lru/ozon/app/android/fresh/common/widgets/header/HeaderApi;", "headerApi", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/fresh/common/widgets/header/HeaderApi;)V", "", "", "", "parentStateId", "", "blockIndex", "Lru/ozon/app/android/fresh/unsorted/widgets/freshTileGrid/data/FreshTileGridDTO;", "dto", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;", "type", "columnCount", "", "addTileGrid", "(Ljava/util/List;Ljava/lang/String;ILru/ozon/app/android/fresh/unsorted/widgets/freshTileGrid/data/FreshTileGridDTO;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;I)V", "Lj20/b;", "state", "", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/fresh/common/widgets/header/HeaderApi;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutoCatalogConfig extends AbstractC6252b {

    @NotNull
    private final JsonParser deserializer;
    private final HeaderApi headerApi;
    public static final int $stable = 8;

    public AutoCatalogConfig(@NotNull JsonParser deserializer, HeaderApi headerApi) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.deserializer = deserializer;
        this.headerApi = headerApi;
    }

    private final void addTileGrid(List<Object> list, String str, int i11, FreshTileGridDTO freshTileGridDTO, FreshTileType freshTileType, int i12) {
        HeaderApi headerApi;
        Object a11;
        int size = freshTileGridDTO.getItems().size() % i12;
        CommonHeaderDTO header = freshTileGridDTO.getHeader();
        if (header != null && (headerApi = this.headerApi) != null) {
            try {
                r.Companion companion = r.INSTANCE;
                a11 = headerApi.toHeaderDTO(header);
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
            }
            if (a11 instanceof r.b) {
                a11 = null;
            }
            HeaderState headerState = (HeaderState) a11;
            if (headerState != null) {
                list.add(headerState);
            }
        }
        int size2 = freshTileGridDTO.getItems().size();
        int i13 = -1;
        int i14 = 0;
        while (i14 < size2) {
            FreshTileDTO freshTileDTO = freshTileGridDTO.getItems().get(i14);
            int hash = Objects.hash(str, Integer.valueOf(i11), freshTileDTO.getInnerAtoms());
            list.add(FreshTileMapperKt.toVO(freshTileDTO, hash, freshTileType, hash));
            i14++;
            i13 = hash;
        }
        if (size == 0) {
            return;
        }
        int i15 = i12 - size;
        for (int i16 = 0; i16 < i15; i16++) {
            list.add(new FreshTileGridPlugVO(i13 + i16, freshTileGridDTO.getBackgroundColor(), i12 == 3));
        }
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public List<? extends Object> parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        AutoCatalogDTO autoCatalogDTO = (AutoCatalogDTO) this.deserializer.fromJson(state.b(), AutoCatalogDTO.class);
        b builder = C7714v.B();
        int i11 = 0;
        for (Object obj : autoCatalogDTO.getItems()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            AutoCatalogItemDTO autoCatalogItemDTO = (AutoCatalogItemDTO) obj;
            String type = autoCatalogItemDTO.getType();
            if (Intrinsics.d(type, "tileGridMedium")) {
                String c11 = state.c().c();
                FreshTileGridDTO tileGridMedium = autoCatalogItemDTO.getTileGridMedium();
                if (tileGridMedium == null) {
                    throw new IllegalArgumentException("Missing tileGridMedium for type=tileGridMedium");
                }
                addTileGrid(builder, c11, i11, tileGridMedium, FreshTileType.MEDIUM, 2);
            } else if (Intrinsics.d(type, "tileGridMini")) {
                String c12 = state.c().c();
                FreshTileGridDTO tileGridMini = autoCatalogItemDTO.getTileGridMini();
                if (tileGridMini == null) {
                    throw new IllegalArgumentException("Missing tileGridMini for type=tileGridMini");
                }
                addTileGrid(builder, c12, i11, tileGridMini, FreshTileType.MINI, 3);
            } else {
                continue;
            }
            i11 = i12;
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
