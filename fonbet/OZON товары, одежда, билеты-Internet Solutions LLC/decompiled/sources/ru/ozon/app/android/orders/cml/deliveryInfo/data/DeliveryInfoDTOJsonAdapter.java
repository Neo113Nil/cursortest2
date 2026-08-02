package ru.ozon.app.android.orders.cml.deliveryInfo.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.orders.cml.common.data.VerticalPadding;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R(\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryInfo/data/DeliveryInfoDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/orders/cml/deliveryInfo/data/DeliveryInfoDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/orders/cml/deliveryInfo/data/DeliveryInfoDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/orders/cml/deliveryInfo/data/DeliveryInfoDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "nullableVerticalPaddingAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "", "Lru/ozon/app/android/orders/cml/deliveryInfo/data/InfoCellDTO;", "listOfInfoCellDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryInfoDTOJsonAdapter extends JsonAdapter<DeliveryInfoDTO> {
    public static final int $stable = 8;
    private volatile Constructor<DeliveryInfoDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<InfoCellDTO>> listOfInfoCellDTOAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final JsonAdapter<VerticalPadding> nullableVerticalPaddingAdapter;

    @NotNull
    private final n.a options;

    public DeliveryInfoDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("islandCornerRadius", "backgroundColor", "verticalPadding", "trackingInfo", "testInfo", "cellList");
        M m11 = M.f71699a;
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "islandCornerRadius");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableVerticalPaddingAdapter = moshi.f(VerticalPadding.class, m11, "verticalPadding");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
        this.listOfInfoCellDTOAdapter = moshi.f(D.e(List.class, InfoCellDTO.class), m11, "cellList");
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(DeliveryInfoDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DeliveryInfoDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        CornerRadius cornerRadius = null;
        String str = null;
        VerticalPadding verticalPadding = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TestInfo testInfo = null;
        List<InfoCellDTO> list = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    i11 = -2;
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    verticalPadding = this.nullableVerticalPaddingAdapter.fromJson(reader);
                    break;
                case 3:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 4:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    break;
                case 5:
                    list = this.listOfInfoCellDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("cellList", "cellList", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (i11 == -2) {
            List<InfoCellDTO> list2 = list;
            TestInfo testInfo2 = testInfo;
            Map<String, TokenizedTrackingInfo> map2 = map;
            VerticalPadding verticalPadding2 = verticalPadding;
            String str2 = str;
            CornerRadius cornerRadius2 = cornerRadius;
            if (list2 != null) {
                return new DeliveryInfoDTO(cornerRadius2, str2, verticalPadding2, map2, testInfo2, list2);
            }
            throw c.j("cellList", "cellList", reader);
        }
        List<InfoCellDTO> list3 = list;
        TestInfo testInfo3 = testInfo;
        Map<String, TokenizedTrackingInfo> map3 = map;
        VerticalPadding verticalPadding3 = verticalPadding;
        String str3 = str;
        CornerRadius cornerRadius3 = cornerRadius;
        Constructor<DeliveryInfoDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = DeliveryInfoDTO.class.getDeclaredConstructor(CornerRadius.class, String.class, VerticalPadding.class, Map.class, TestInfo.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (list3 == null) {
            throw c.j("cellList", "cellList", reader);
        }
        DeliveryInfoDTO newInstance = constructor.newInstance(cornerRadius3, str3, verticalPadding3, map3, testInfo3, list3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DeliveryInfoDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("islandCornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getIslandCornerRadius());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("verticalPadding");
        this.nullableVerticalPaddingAdapter.mo44toJson(writer, (x) value.getVerticalPadding());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value.getTestInfo());
        writer.w("cellList");
        this.listOfInfoCellDTOAdapter.mo44toJson(writer, (x) value.getCellList());
        writer.p();
    }
}
