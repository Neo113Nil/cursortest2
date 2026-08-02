package ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.data;

import Ak.b;
import Y9.c;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.data.CommonLayoutGridDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.core.models.UniPaddingToken;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R(\u0010(\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$GridType;", "gridTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$Item;", "listOfItemAdapter", "nullableStringAdapter", "Lru/ozon/uni/core/models/UniPaddingToken;", "nullableUniPaddingTokenAdapter", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$Paddings;", "nullablePaddingsAdapter", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$CornerRadii;", "nullableCornerRadiiAdapter", "", "nullableBooleanAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CommonLayoutGridDTOJsonAdapter extends JsonAdapter<CommonLayoutGridDTO> {
    public static final int $stable = 8;
    private volatile Constructor<CommonLayoutGridDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CommonLayoutGridDTO.GridType> gridTypeAdapter;

    @NotNull
    private final JsonAdapter<List<CommonLayoutGridDTO.Item>> listOfItemAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CommonLayoutGridDTO.CornerRadii> nullableCornerRadiiAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<CommonLayoutGridDTO.Paddings> nullablePaddingsAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<UniPaddingToken> nullableUniPaddingTokenAdapter;

    @NotNull
    private final n.a options;

    public CommonLayoutGridDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("gridType", "items", "backgroundColor", "itemsSpacing", "paddings", "cornerRadii", "badgeTopRightMargin", "isTextInsideCard", "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<CommonLayoutGridDTO.GridType> f7 = moshi.f(CommonLayoutGridDTO.GridType.class, m11, "gridType");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.gridTypeAdapter = f7;
        JsonAdapter<List<CommonLayoutGridDTO.Item>> f11 = moshi.f(D.e(List.class, CommonLayoutGridDTO.Item.class), m11, "items");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.listOfItemAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "backgroundColor");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
        JsonAdapter<UniPaddingToken> f13 = moshi.f(UniPaddingToken.class, m11, "itemsSpacing");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableUniPaddingTokenAdapter = f13;
        JsonAdapter<CommonLayoutGridDTO.Paddings> f14 = moshi.f(CommonLayoutGridDTO.Paddings.class, m11, "paddings");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullablePaddingsAdapter = f14;
        JsonAdapter<CommonLayoutGridDTO.CornerRadii> f15 = moshi.f(CommonLayoutGridDTO.CornerRadii.class, m11, "cornerRadii");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableCornerRadiiAdapter = f15;
        JsonAdapter<Boolean> f16 = moshi.f(Boolean.class, m11, "isTextInsideCard");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableBooleanAdapter = f16;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f17 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f17;
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(CommonLayoutGridDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CommonLayoutGridDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        CommonLayoutGridDTO.GridType gridType = null;
        List<CommonLayoutGridDTO.Item> list = null;
        String str = null;
        UniPaddingToken uniPaddingToken = null;
        CommonLayoutGridDTO.Paddings paddings = null;
        CommonLayoutGridDTO.CornerRadii cornerRadii = null;
        UniPaddingToken uniPaddingToken2 = null;
        Boolean bool = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    gridType = this.gridTypeAdapter.fromJson(reader);
                    if (gridType == null) {
                        throw c.q("gridType", "gridType", reader);
                    }
                    break;
                case 1:
                    list = this.listOfItemAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("items", "items", reader);
                    }
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    uniPaddingToken = this.nullableUniPaddingTokenAdapter.fromJson(reader);
                    break;
                case 4:
                    paddings = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 5:
                    cornerRadii = this.nullableCornerRadiiAdapter.fromJson(reader);
                    break;
                case 6:
                    uniPaddingToken2 = this.nullableUniPaddingTokenAdapter.fromJson(reader);
                    break;
                case 7:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -385) {
            Map<String, TokenizedTrackingInfo> map2 = map;
            Boolean bool2 = bool;
            UniPaddingToken uniPaddingToken3 = uniPaddingToken2;
            CommonLayoutGridDTO.CornerRadii cornerRadii2 = cornerRadii;
            CommonLayoutGridDTO.Paddings paddings2 = paddings;
            UniPaddingToken uniPaddingToken4 = uniPaddingToken;
            String str2 = str;
            List<CommonLayoutGridDTO.Item> list2 = list;
            CommonLayoutGridDTO.GridType gridType2 = gridType;
            if (gridType2 == null) {
                throw c.j("gridType", "gridType", reader);
            }
            if (list2 != null) {
                return new CommonLayoutGridDTO(gridType2, list2, str2, uniPaddingToken4, paddings2, cornerRadii2, uniPaddingToken3, bool2, map2);
            }
            throw c.j("items", "items", reader);
        }
        Map<String, TokenizedTrackingInfo> map3 = map;
        Boolean bool3 = bool;
        UniPaddingToken uniPaddingToken5 = uniPaddingToken2;
        CommonLayoutGridDTO.CornerRadii cornerRadii3 = cornerRadii;
        CommonLayoutGridDTO.Paddings paddings3 = paddings;
        UniPaddingToken uniPaddingToken6 = uniPaddingToken;
        String str3 = str;
        List<CommonLayoutGridDTO.Item> list3 = list;
        CommonLayoutGridDTO.GridType gridType3 = gridType;
        Constructor<CommonLayoutGridDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CommonLayoutGridDTO.class.getDeclaredConstructor(CommonLayoutGridDTO.GridType.class, List.class, String.class, UniPaddingToken.class, CommonLayoutGridDTO.Paddings.class, CommonLayoutGridDTO.CornerRadii.class, UniPaddingToken.class, Boolean.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<CommonLayoutGridDTO> constructor2 = constructor;
        if (gridType3 == null) {
            throw c.j("gridType", "gridType", reader);
        }
        if (list3 == null) {
            throw c.j("items", "items", reader);
        }
        CommonLayoutGridDTO newInstance = constructor2.newInstance(gridType3, list3, str3, uniPaddingToken6, paddings3, cornerRadii3, uniPaddingToken5, bool3, map3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CommonLayoutGridDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("gridType");
        this.gridTypeAdapter.mo44toJson(writer, (x) value_.getGridType());
        writer.w("items");
        this.listOfItemAdapter.mo44toJson(writer, (x) value_.getItems());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("itemsSpacing");
        this.nullableUniPaddingTokenAdapter.mo44toJson(writer, (x) value_.getItemsSpacing());
        writer.w("paddings");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value_.getPaddings());
        writer.w("cornerRadii");
        this.nullableCornerRadiiAdapter.mo44toJson(writer, (x) value_.getCornerRadii());
        writer.w("badgeTopRightMargin");
        this.nullableUniPaddingTokenAdapter.mo44toJson(writer, (x) value_.getBadgeTopRightMargin());
        writer.w("isTextInsideCard");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isTextInsideCard());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.p();
    }
}
