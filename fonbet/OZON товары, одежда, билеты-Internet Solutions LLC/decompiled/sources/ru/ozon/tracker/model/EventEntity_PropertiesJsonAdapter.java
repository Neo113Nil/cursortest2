package ru.ozon.tracker.model;

import Ak.b;
import Y9.c;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.networkinfo.models.ConnectionType;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.tracker.model.EventEntity;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\"\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/tracker/model/EventEntity_PropertiesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/tracker/model/EventEntity$Properties;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/tracker/model/EventEntity$Properties;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/tracker/model/EventEntity$Properties;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableLongAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Ljava/math/BigDecimal;", "nullableBigDecimalAdapter", "", "nullableIntAdapter", "", "nullableBooleanAdapter", "", "nullableDoubleAdapter", "Lru/ozon/android/networkinfo/models/ConnectionType;", "nullableConnectionTypeAdapter", "", "Lru/ozon/tracker/model/EventEntity$Properties$Item;", "nullableListOfItemAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EventEntity_PropertiesJsonAdapter extends JsonAdapter<EventEntity.Properties> {
    private volatile Constructor<EventEntity.Properties> constructorRef;

    @NotNull
    private final JsonAdapter<BigDecimal> nullableBigDecimalAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<ConnectionType> nullableConnectionTypeAdapter;

    @NotNull
    private final JsonAdapter<Double> nullableDoubleAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<EventEntity.Properties.Item>> nullableListOfItemAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public EventEntity_PropertiesJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("regionId", "promocode", "availability", "paymentType", "orderId", "finalPrice", "originalPrice", "discount", "number", "stock", "sku", "categoryId", "phoneNumber", "quantity", "suggestType", "suggestValue", "countItems", "sellerId", "brandId", "errorCode", "brandName", "merchantId", "marketingActionId", "deliveryMarketingActionId", "flashsaleSlotId", "advId", "algo", "storehouseId", "postingId", "status", "unavailableReason", "filterValue", "cartType", "cardType", "checked", "due", "timeslotId", "deliveryService", "weight", "reason", "shipmentId", "date", "splitReason", "finalDeliveryPrice", "originalDeliveryPrice", "menuId", "deliveryType", "countPostings", "fromAbroad", "searchString", SelectionItemFormDTO.TITLE_FIELD_NAME, "cardIsRemember", "cardId", "longitude", "latitude", "virtualPostingId", "addressUid", "connectionType", "contentType", "imageHeight", "imageWidth", "priority", "statusCode", ImagesContract.URL, "items", "elementType", "cache", "stateId", "chatType", "language", "language_discarded", "courierTask", "turboPvzStaffId", "id", "type", "system_language", "context", "deliveryPointId");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Long> f7 = moshi.f(Long.class, m11, "regionId");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableLongAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "promocode");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<BigDecimal> f12 = moshi.f(BigDecimal.class, m11, "finalPrice");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableBigDecimalAdapter = f12;
        JsonAdapter<Integer> f13 = moshi.f(Integer.class, m11, "number");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableIntAdapter = f13;
        JsonAdapter<Boolean> f14 = moshi.f(Boolean.class, m11, "checked");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableBooleanAdapter = f14;
        JsonAdapter<Double> f15 = moshi.f(Double.class, m11, "longitude");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableDoubleAdapter = f15;
        JsonAdapter<ConnectionType> f16 = moshi.f(ConnectionType.class, m11, "connectionType");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableConnectionTypeAdapter = f16;
        JsonAdapter<List<EventEntity.Properties.Item>> f17 = moshi.f(D.e(List.class, EventEntity.Properties.Item.class), m11, "items");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableListOfItemAdapter = f17;
    }

    @NotNull
    public String toString() {
        return b.c(44, "GeneratedJsonAdapter(EventEntity.Properties)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public EventEntity.Properties fromJson(@NotNull n reader) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i13 = -1;
        Long l11 = null;
        String str = null;
        String str2 = null;
        Long l12 = null;
        String str3 = null;
        BigDecimal bigDecimal = null;
        BigDecimal bigDecimal2 = null;
        Long l13 = null;
        Integer num = null;
        Integer num2 = null;
        Long l14 = null;
        Long l15 = null;
        String str4 = null;
        Integer num3 = null;
        String str5 = null;
        String str6 = null;
        Integer num4 = null;
        Long l16 = null;
        Long l17 = null;
        String str7 = null;
        String str8 = null;
        Long l18 = null;
        Long l19 = null;
        Long l21 = null;
        Long l22 = null;
        String str9 = null;
        String str10 = null;
        Long l23 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        Boolean bool = null;
        String str17 = null;
        Long l24 = null;
        String str18 = null;
        BigDecimal bigDecimal3 = null;
        String str19 = null;
        Long l25 = null;
        String str20 = null;
        String str21 = null;
        BigDecimal bigDecimal4 = null;
        BigDecimal bigDecimal5 = null;
        String str22 = null;
        String str23 = null;
        Integer num5 = null;
        Boolean bool2 = null;
        String str24 = null;
        String str25 = null;
        Boolean bool3 = null;
        String str26 = null;
        Double d11 = null;
        Double d12 = null;
        String str27 = null;
        Boolean bool4 = null;
        ConnectionType connectionType = null;
        String str28 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        String str29 = null;
        List<EventEntity.Properties.Item> list = null;
        String str30 = null;
        String str31 = null;
        String str32 = null;
        String str33 = null;
        String str34 = null;
        String str35 = null;
        String str36 = null;
        Integer num10 = null;
        String str37 = null;
        String str38 = null;
        String str39 = null;
        String str40 = null;
        Long l26 = null;
        int i14 = -1;
        int i15 = -1;
        while (reader.hasNext()) {
            Long l27 = l11;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    l11 = l27;
                    break;
                case 0:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    i13 &= -2;
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -3;
                    l11 = l27;
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -5;
                    l11 = l27;
                    break;
                case 3:
                    l12 = this.nullableLongAdapter.fromJson(reader);
                    i13 &= -9;
                    l11 = l27;
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -17;
                    l11 = l27;
                    break;
                case 5:
                    bigDecimal = this.nullableBigDecimalAdapter.fromJson(reader);
                    i13 &= -33;
                    l11 = l27;
                    break;
                case 6:
                    bigDecimal2 = this.nullableBigDecimalAdapter.fromJson(reader);
                    i13 &= -65;
                    l11 = l27;
                    break;
                case 7:
                    l13 = this.nullableLongAdapter.fromJson(reader);
                    i13 &= -129;
                    l11 = l27;
                    break;
                case 8:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i13 &= -257;
                    l11 = l27;
                    break;
                case 9:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    i13 &= -513;
                    l11 = l27;
                    break;
                case 10:
                    l14 = this.nullableLongAdapter.fromJson(reader);
                    i13 &= -1025;
                    l11 = l27;
                    break;
                case 11:
                    l15 = this.nullableLongAdapter.fromJson(reader);
                    i13 &= -2049;
                    l11 = l27;
                    break;
                case 12:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -4097;
                    l11 = l27;
                    break;
                case 13:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    i13 &= -8193;
                    l11 = l27;
                    break;
                case 14:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -16385;
                    l11 = l27;
                    break;
                case 15:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -32769;
                    i13 &= i11;
                    l11 = l27;
                    break;
                case 16:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    i11 = -65537;
                    i13 &= i11;
                    l11 = l27;
                    break;
                case 17:
                    l16 = this.nullableLongAdapter.fromJson(reader);
                    i11 = -131073;
                    i13 &= i11;
                    l11 = l27;
                    break;
                case 18:
                    l17 = this.nullableLongAdapter.fromJson(reader);
                    i13 &= -262145;
                    l11 = l27;
                    break;
                case 19:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -524289;
                    l11 = l27;
                    break;
                case 20:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -1048577;
                    l11 = l27;
                    break;
                case 21:
                    l18 = this.nullableLongAdapter.fromJson(reader);
                    i13 &= -2097153;
                    l11 = l27;
                    break;
                case 22:
                    l19 = this.nullableLongAdapter.fromJson(reader);
                    i13 &= -4194305;
                    l11 = l27;
                    break;
                case 23:
                    l21 = this.nullableLongAdapter.fromJson(reader);
                    i13 &= -8388609;
                    l11 = l27;
                    break;
                case 24:
                    l22 = this.nullableLongAdapter.fromJson(reader);
                    i13 &= -16777217;
                    l11 = l27;
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -33554433;
                    l11 = l27;
                    break;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    str10 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -67108865;
                    l11 = l27;
                    break;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    l23 = this.nullableLongAdapter.fromJson(reader);
                    i13 &= -134217729;
                    l11 = l27;
                    break;
                case 28:
                    str11 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -268435457;
                    l11 = l27;
                    break;
                case 29:
                    str12 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -536870913;
                    l11 = l27;
                    break;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    str13 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -1073741825;
                    l11 = l27;
                    break;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    str14 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= Integer.MAX_VALUE;
                    l11 = l27;
                    break;
                case 32:
                    str15 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -2;
                    l11 = l27;
                    break;
                case 33:
                    str16 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -3;
                    l11 = l27;
                    break;
                case 34:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i14 &= -5;
                    l11 = l27;
                    break;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    str17 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -9;
                    l11 = l27;
                    break;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    l24 = this.nullableLongAdapter.fromJson(reader);
                    i14 &= -17;
                    l11 = l27;
                    break;
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    str18 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -33;
                    l11 = l27;
                    break;
                case 38:
                    bigDecimal3 = this.nullableBigDecimalAdapter.fromJson(reader);
                    i14 &= -65;
                    l11 = l27;
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    str19 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -129;
                    l11 = l27;
                    break;
                case 40:
                    l25 = this.nullableLongAdapter.fromJson(reader);
                    i14 &= -257;
                    l11 = l27;
                    break;
                case 41:
                    str20 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -513;
                    l11 = l27;
                    break;
                case 42:
                    str21 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -1025;
                    l11 = l27;
                    break;
                case 43:
                    bigDecimal4 = this.nullableBigDecimalAdapter.fromJson(reader);
                    i14 &= -2049;
                    l11 = l27;
                    break;
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    bigDecimal5 = this.nullableBigDecimalAdapter.fromJson(reader);
                    i14 &= -4097;
                    l11 = l27;
                    break;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    str22 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -8193;
                    l11 = l27;
                    break;
                case 46:
                    str23 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -16385;
                    l11 = l27;
                    break;
                case 47:
                    num5 = this.nullableIntAdapter.fromJson(reader);
                    i12 = -32769;
                    i14 &= i12;
                    l11 = l27;
                    break;
                case 48:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    i12 = -65537;
                    i14 &= i12;
                    l11 = l27;
                    break;
                case 49:
                    str24 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -131073;
                    i14 &= i12;
                    l11 = l27;
                    break;
                case 50:
                    str25 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -262145;
                    l11 = l27;
                    break;
                case 51:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    i14 &= -524289;
                    l11 = l27;
                    break;
                case 52:
                    str26 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -1048577;
                    l11 = l27;
                    break;
                case 53:
                    d11 = this.nullableDoubleAdapter.fromJson(reader);
                    i14 &= -2097153;
                    l11 = l27;
                    break;
                case 54:
                    d12 = this.nullableDoubleAdapter.fromJson(reader);
                    i14 &= -4194305;
                    l11 = l27;
                    break;
                case 55:
                    str27 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -8388609;
                    l11 = l27;
                    break;
                case 56:
                    bool4 = this.nullableBooleanAdapter.fromJson(reader);
                    i14 &= -16777217;
                    l11 = l27;
                    break;
                case 57:
                    connectionType = this.nullableConnectionTypeAdapter.fromJson(reader);
                    i14 &= -33554433;
                    l11 = l27;
                    break;
                case 58:
                    str28 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -67108865;
                    l11 = l27;
                    break;
                case 59:
                    num6 = this.nullableIntAdapter.fromJson(reader);
                    i14 &= -134217729;
                    l11 = l27;
                    break;
                case 60:
                    num7 = this.nullableIntAdapter.fromJson(reader);
                    i14 &= -268435457;
                    l11 = l27;
                    break;
                case 61:
                    num8 = this.nullableIntAdapter.fromJson(reader);
                    i14 &= -536870913;
                    l11 = l27;
                    break;
                case 62:
                    num9 = this.nullableIntAdapter.fromJson(reader);
                    i14 &= -1073741825;
                    l11 = l27;
                    break;
                case 63:
                    str29 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= Integer.MAX_VALUE;
                    l11 = l27;
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    list = this.nullableListOfItemAdapter.fromJson(reader);
                    i15 &= -2;
                    l11 = l27;
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    str30 = this.nullableStringAdapter.fromJson(reader);
                    i15 &= -3;
                    l11 = l27;
                    break;
                case 66:
                    str31 = this.nullableStringAdapter.fromJson(reader);
                    i15 &= -5;
                    l11 = l27;
                    break;
                case 67:
                    str32 = this.nullableStringAdapter.fromJson(reader);
                    i15 &= -9;
                    l11 = l27;
                    break;
                case 68:
                    str33 = this.nullableStringAdapter.fromJson(reader);
                    i15 &= -17;
                    l11 = l27;
                    break;
                case 69:
                    str34 = this.nullableStringAdapter.fromJson(reader);
                    i15 &= -33;
                    l11 = l27;
                    break;
                case 70:
                    str35 = this.nullableStringAdapter.fromJson(reader);
                    i15 &= -65;
                    l11 = l27;
                    break;
                case 71:
                    str36 = this.nullableStringAdapter.fromJson(reader);
                    i15 &= -129;
                    l11 = l27;
                    break;
                case 72:
                    num10 = this.nullableIntAdapter.fromJson(reader);
                    i15 &= -257;
                    l11 = l27;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 73 */:
                    str37 = this.nullableStringAdapter.fromJson(reader);
                    i15 &= -513;
                    l11 = l27;
                    break;
                case 74:
                    str38 = this.nullableStringAdapter.fromJson(reader);
                    i15 &= -1025;
                    l11 = l27;
                    break;
                case 75:
                    str39 = this.nullableStringAdapter.fromJson(reader);
                    i15 &= -2049;
                    l11 = l27;
                    break;
                case 76:
                    str40 = this.nullableStringAdapter.fromJson(reader);
                    i15 &= -4097;
                    l11 = l27;
                    break;
                case 77:
                    l26 = this.nullableLongAdapter.fromJson(reader);
                    i15 &= -8193;
                    l11 = l27;
                    break;
                default:
                    l11 = l27;
                    break;
            }
        }
        Long l28 = l11;
        reader.endObject();
        if (i13 == 0 && i14 == 0 && i15 == -16384) {
            Integer num11 = num;
            Long l29 = l13;
            BigDecimal bigDecimal6 = bigDecimal2;
            BigDecimal bigDecimal7 = bigDecimal;
            String str41 = str3;
            return new EventEntity.Properties(l28, str, str2, l12, str41, bigDecimal7, bigDecimal6, l29, num11, num2, l14, l15, str4, num3, str5, str6, num4, l16, l17, str7, str8, l18, l19, l21, l22, str9, str10, l23, str11, str12, str13, str14, str15, str16, bool, str17, l24, str18, bigDecimal3, str19, l25, str20, str21, bigDecimal4, bigDecimal5, str22, str23, num5, bool2, str24, str25, bool3, str26, d11, d12, str27, bool4, connectionType, str28, num6, num7, num8, num9, str29, list, str30, str31, str32, str33, str34, str35, str36, num10, str37, str38, str39, str40, l26);
        }
        Constructor<EventEntity.Properties> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = EventEntity.Properties.class.getDeclaredConstructor(Long.class, String.class, String.class, Long.class, String.class, BigDecimal.class, BigDecimal.class, Long.class, Integer.class, Integer.class, Long.class, Long.class, String.class, Integer.class, String.class, String.class, Integer.class, Long.class, Long.class, String.class, String.class, Long.class, Long.class, Long.class, Long.class, String.class, String.class, Long.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, String.class, Long.class, String.class, BigDecimal.class, String.class, Long.class, String.class, String.class, BigDecimal.class, BigDecimal.class, String.class, String.class, Integer.class, Boolean.class, String.class, String.class, Boolean.class, String.class, Double.class, Double.class, String.class, Boolean.class, ConnectionType.class, String.class, Integer.class, Integer.class, Integer.class, Integer.class, String.class, List.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.class, String.class, String.class, String.class, String.class, Long.class, cls2, cls2, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        EventEntity.Properties newInstance = constructor.newInstance(l28, str, str2, l12, str3, bigDecimal, bigDecimal2, l13, num, num2, l14, l15, str4, num3, str5, str6, num4, l16, l17, str7, str8, l18, l19, l21, l22, str9, str10, l23, str11, str12, str13, str14, str15, str16, bool, str17, l24, str18, bigDecimal3, str19, l25, str20, str21, bigDecimal4, bigDecimal5, str22, str23, num5, bool2, str24, str25, bool3, str26, d11, d12, str27, bool4, connectionType, str28, num6, num7, num8, num9, str29, list, str30, str31, str32, str33, str34, str35, str36, num10, str37, str38, str39, str40, l26, Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, EventEntity.Properties value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("regionId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getRegionId());
        writer.w("promocode");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPromocode());
        writer.w("availability");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAvailability());
        writer.w("paymentType");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getPaymentType());
        writer.w("orderId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getOrderId());
        writer.w("finalPrice");
        this.nullableBigDecimalAdapter.mo44toJson(writer, (x) value_.getFinalPrice());
        writer.w("originalPrice");
        this.nullableBigDecimalAdapter.mo44toJson(writer, (x) value_.getOriginalPrice());
        writer.w("discount");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getDiscount());
        writer.w("number");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getNumber());
        writer.w("stock");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getStock());
        writer.w("sku");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getSku());
        writer.w("categoryId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getCategoryId());
        writer.w("phoneNumber");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPhoneNumber());
        writer.w("quantity");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getQuantity());
        writer.w("suggestType");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSuggestType());
        writer.w("suggestValue");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSuggestValue());
        writer.w("countItems");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getCountItems());
        writer.w("sellerId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getSellerId());
        writer.w("brandId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getBrandId());
        writer.w("errorCode");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getErrorCode());
        writer.w("brandName");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBrandName());
        writer.w("merchantId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getMerchantId());
        writer.w("marketingActionId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getMarketingActionId());
        writer.w("deliveryMarketingActionId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getDeliveryMarketingActionId());
        writer.w("flashsaleSlotId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getFlashsaleSlotId());
        writer.w("advId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAdvId());
        writer.w("algo");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAlgo());
        writer.w("storehouseId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getStorehouseId());
        writer.w("postingId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPostingId());
        writer.w("status");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getStatus());
        writer.w("unavailableReason");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getUnavailableReason());
        writer.w("filterValue");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getFilterValue());
        writer.w("cartType");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCartType());
        writer.w("cardType");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCardType());
        writer.w("checked");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getChecked());
        writer.w("due");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getDue());
        writer.w("timeslotId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getTimeslotId());
        writer.w("deliveryService");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getDeliveryService());
        writer.w("weight");
        this.nullableBigDecimalAdapter.mo44toJson(writer, (x) value_.getWeight());
        writer.w("reason");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getReason());
        writer.w("shipmentId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getShipmentId());
        writer.w("date");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getDate());
        writer.w("splitReason");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSplitReason());
        writer.w("finalDeliveryPrice");
        this.nullableBigDecimalAdapter.mo44toJson(writer, (x) value_.getFinalDeliveryPrice());
        writer.w("originalDeliveryPrice");
        this.nullableBigDecimalAdapter.mo44toJson(writer, (x) value_.getOriginalDeliveryPrice());
        writer.w("menuId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getMenuId());
        writer.w("deliveryType");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getDeliveryType());
        writer.w("countPostings");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getCountPostings());
        writer.w("fromAbroad");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getFromAbroad());
        writer.w("searchString");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSearchString());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("cardIsRemember");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getCardIsRemember());
        writer.w("cardId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCardId());
        writer.w("longitude");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value_.getLongitude());
        writer.w("latitude");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value_.getLatitude());
        writer.w("virtualPostingId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getVirtualPostingId());
        writer.w("addressUid");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getAddressUid());
        writer.w("connectionType");
        this.nullableConnectionTypeAdapter.mo44toJson(writer, (x) value_.getConnectionType());
        writer.w("contentType");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContentType());
        writer.w("imageHeight");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getImageHeight());
        writer.w("imageWidth");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getImageWidth());
        writer.w("priority");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getPriority());
        writer.w("statusCode");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getStatusCode());
        writer.w(ImagesContract.URL);
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getUrl());
        writer.w("items");
        this.nullableListOfItemAdapter.mo44toJson(writer, (x) value_.getItems());
        writer.w("elementType");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getElementType());
        writer.w("cache");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCache());
        writer.w("stateId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getStateId());
        writer.w("chatType");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getChatType());
        writer.w("language");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLanguage());
        writer.w("language_discarded");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLanguage_discarded());
        writer.w("courierTask");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCourierTask());
        writer.w("turboPvzStaffId");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getTurboPvzStaffId());
        writer.w("id");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getId());
        writer.w("type");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getType());
        writer.w("system_language");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSystem_language());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("deliveryPointId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getDeliveryPointId());
        writer.p();
    }
}
