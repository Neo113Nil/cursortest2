package ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.data;

import Sc.r;
import Sc.s;
import Tc.b;
import e10.AbstractC6252b;
import j20.C7244b;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.common.widgets.header.CommonHeaderDTO;
import ru.ozon.app.android.fresh.common.widgets.header.HeaderApi;
import ru.ozon.app.android.fresh.common.widgets.header.HeaderState;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileMapperKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileType;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.data.FreshTileDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation.plug.FreshTileGridPlugVO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00122\u00060\u0001j\u0002`\u0002:\u0001\u0012B\u001f\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/freshTileGrid/data/FreshTileGridConfig;", "Le10/b;", "Lru/ozon/app/android/composer/widgets/base/config/list/ListConfig;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "Lru/ozon/app/android/fresh/common/widgets/header/HeaderApi;", "headerApi", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/fresh/common/widgets/header/HeaderApi;)V", "Lj20/b;", "state", "", "", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/fresh/common/widgets/header/HeaderApi;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FreshTileGridConfig extends AbstractC6252b {

    @NotNull
    private final JsonParser deserializer;
    private final HeaderApi headerApi;
    public static final int $stable = 8;

    @NotNull
    private static final Map<String, Integer> columnCountByType = U.j(new Pair("tileGridMedium", 2), new Pair("tileGridMini", 3));

    public FreshTileGridConfig(@NotNull JsonParser deserializer, HeaderApi headerApi) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.deserializer = deserializer;
        this.headerApi = headerApi;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public List<? extends Object> parse(@NotNull C7244b state) {
        HeaderApi headerApi;
        Object a11;
        Intrinsics.checkNotNullParameter(state, "state");
        FreshTileGridDTO freshTileGridDTO = (FreshTileGridDTO) this.deserializer.fromJson(state.b(), FreshTileGridDTO.class);
        String b11 = state.c().b();
        FreshTileType freshTileType = Intrinsics.d(b11, "tileGridMini") ? FreshTileType.MINI : Intrinsics.d(b11, "tileGridMedium") ? FreshTileType.MEDIUM : FreshTileType.MAX;
        Integer num = columnCountByType.get(state.c().b());
        int intValue = num != null ? num.intValue() : 1;
        int size = freshTileGridDTO.getItems().size() % intValue;
        b builder = C7714v.B();
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
                builder.add(headerState);
            }
        }
        int size2 = freshTileGridDTO.getItems().size();
        int i11 = -1;
        int i12 = 0;
        while (i12 < size2) {
            FreshTileDTO freshTileDTO = freshTileGridDTO.getItems().get(i12);
            int hash = Objects.hash(state.c().c(), freshTileDTO.getInnerAtoms());
            builder.add(FreshTileMapperKt.toVO(freshTileDTO, hash, freshTileType, hash));
            i12++;
            i11 = hash;
        }
        if (size != 0) {
            int i13 = intValue - size;
            for (int i14 = 0; i14 < i13; i14++) {
                long j11 = i11 + i14;
                String backgroundColor = freshTileGridDTO.getBackgroundColor();
                Integer num2 = columnCountByType.get("tileGridMini");
                builder.add(new FreshTileGridPlugVO(j11, backgroundColor, num2 != null && intValue == num2.intValue()));
            }
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
