package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model;

import Kk.c;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.cellList.v2.data.CellListV2DTO;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B/\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J3\u0010\u0010\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopContainerDTO;", "", "content", "", "tracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getContent", "()Ljava/util/List;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TopContainerDTO {

    @NotNull
    public static final String CELL_LIST_FIELD_NAME = "cellList";

    @NotNull
    public static final String CELL_LIST_NAME = "CONTENT_TYPE_CELL_LIST";

    @NotNull
    public static final String ISLAND_SEPARATOR_FIELD_NAME = "islandSeparator";

    @NotNull
    public static final String ISLAND_SEPARATOR_NAME = "CONTENT_TYPE_ISLAND_SEPARATOR";

    @NotNull
    public static final String SEPARATOR_FIELD_NAME = "separator";

    @NotNull
    public static final String SEPARATOR_NAME = "CONTENT_TYPE_SEPARATOR";

    @NotNull
    public static final String TYPE = "type";
    private final List<Object> content;
    private final Map<String, TokenizedTrackingInfo> tracking;
    public static final int $stable = 8;

    public TopContainerDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "separator", name = "CONTENT_TYPE_SEPARATOR", type = SeparatorDTO.class), @ProtoOneOfSignature(fieldName = "islandSeparator", name = "CONTENT_TYPE_ISLAND_SEPARATOR", type = IslandSeparatorDTO.class), @ProtoOneOfSignature(fieldName = "cellList", name = "CONTENT_TYPE_CELL_LIST", type = CellListV2DTO.class)}) @ProtoOneOf(label = "type") List<? extends Object> list, Map<String, TokenizedTrackingInfo> map) {
        this.content = list;
        this.tracking = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TopContainerDTO copy$default(TopContainerDTO topContainerDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = topContainerDTO.content;
        }
        if ((i11 & 2) != 0) {
            map = topContainerDTO.tracking;
        }
        return topContainerDTO.copy(list, map);
    }

    public final List<Object> component1() {
        return this.content;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.tracking;
    }

    @NotNull
    public final TopContainerDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "separator", name = "CONTENT_TYPE_SEPARATOR", type = SeparatorDTO.class), @ProtoOneOfSignature(fieldName = "islandSeparator", name = "CONTENT_TYPE_ISLAND_SEPARATOR", type = IslandSeparatorDTO.class), @ProtoOneOfSignature(fieldName = "cellList", name = "CONTENT_TYPE_CELL_LIST", type = CellListV2DTO.class)}) @ProtoOneOf(label = "type") List<? extends Object> content, Map<String, TokenizedTrackingInfo> tracking) {
        return new TopContainerDTO(content, tracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopContainerDTO)) {
            return false;
        }
        TopContainerDTO topContainerDTO = (TopContainerDTO) other;
        return Intrinsics.d(this.content, topContainerDTO.content) && Intrinsics.d(this.tracking, topContainerDTO.tracking);
    }

    public final List<Object> getContent() {
        return this.content;
    }

    public final Map<String, TokenizedTrackingInfo> getTracking() {
        return this.tracking;
    }

    public int hashCode() {
        List<Object> list = this.content;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return c.d("TopContainerDTO(content=", ", tracking=", ")", this.content, this.tracking);
    }
}
