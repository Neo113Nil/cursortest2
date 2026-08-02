package ru.ozon.app.android.search.widgets.expandableCells.data.api;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2DTO;
import ru.ozon.app.android.storefront.data.tiles.tilescroll.TileScrollDTO;
import ru.ozon.app.android.widgets.buttonWidget.ButtonWidgetDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0001HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/data/api/GetWarlockSectionResponse;", "", "tiles", "button", "Lru/ozon/app/android/widgets/buttonWidget/ButtonWidgetDTO;", "<init>", "(Ljava/lang/Object;Lru/ozon/app/android/widgets/buttonWidget/ButtonWidgetDTO;)V", "getTiles", "()Ljava/lang/Object;", "getButton", "()Lru/ozon/app/android/widgets/buttonWidget/ButtonWidgetDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GetWarlockSectionResponse {
    public static final int $stable = 8;
    private final ButtonWidgetDTO button;

    @NotNull
    private final Object tiles;

    public GetWarlockSectionResponse(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "tileGrid2", type = TileGrid2DTO.class), @ProtoOneOfSignature(name = "tileScroll", type = TileScrollDTO.class)}) @NotNull @ProtoOneOf(label = "type") Object tiles, ButtonWidgetDTO buttonWidgetDTO) {
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        this.tiles = tiles;
        this.button = buttonWidgetDTO;
    }

    public static /* synthetic */ GetWarlockSectionResponse copy$default(GetWarlockSectionResponse getWarlockSectionResponse, Object obj, ButtonWidgetDTO buttonWidgetDTO, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = getWarlockSectionResponse.tiles;
        }
        if ((i11 & 2) != 0) {
            buttonWidgetDTO = getWarlockSectionResponse.button;
        }
        return getWarlockSectionResponse.copy(obj, buttonWidgetDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Object getTiles() {
        return this.tiles;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonWidgetDTO getButton() {
        return this.button;
    }

    @NotNull
    public final GetWarlockSectionResponse copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "tileGrid2", type = TileGrid2DTO.class), @ProtoOneOfSignature(name = "tileScroll", type = TileScrollDTO.class)}) @NotNull @ProtoOneOf(label = "type") Object tiles, ButtonWidgetDTO button) {
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        return new GetWarlockSectionResponse(tiles, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetWarlockSectionResponse)) {
            return false;
        }
        GetWarlockSectionResponse getWarlockSectionResponse = (GetWarlockSectionResponse) other;
        return Intrinsics.d(this.tiles, getWarlockSectionResponse.tiles) && Intrinsics.d(this.button, getWarlockSectionResponse.button);
    }

    public final ButtonWidgetDTO getButton() {
        return this.button;
    }

    @NotNull
    public final Object getTiles() {
        return this.tiles;
    }

    public int hashCode() {
        int hashCode = this.tiles.hashCode() * 31;
        ButtonWidgetDTO buttonWidgetDTO = this.button;
        return hashCode + (buttonWidgetDTO == null ? 0 : buttonWidgetDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "GetWarlockSectionResponse(tiles=" + this.tiles + ", button=" + this.button + ")";
    }
}
