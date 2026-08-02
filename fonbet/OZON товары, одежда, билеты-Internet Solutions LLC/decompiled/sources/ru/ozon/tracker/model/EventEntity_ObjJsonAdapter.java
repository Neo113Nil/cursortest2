package ru.ozon.tracker.model;

import Ak.b;
import Y9.c;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.model.EventEntity;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/tracker/model/EventEntity_ObjJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/tracker/model/EventEntity$Obj;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/tracker/model/EventEntity$Obj;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/tracker/model/EventEntity$Obj;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableLongAdapter", "", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EventEntity_ObjJsonAdapter extends JsonAdapter<EventEntity.Obj> {
    private volatile Constructor<EventEntity.Obj> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public EventEntity_ObjJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("type", "id", "sku", "bannerId", "brandId", "brandName", "sellerId", "regionId", "reviewId", "searchString", "categoryId", "filterId", "sortId", "suggestType", "orderId", "messageId", "promocode", "postingId", "merchantId", "timeslotId", "imageId", "3dId", "arId", "marketingActionId", "shipmentId", "paymentType", "deliveryPointId", "menuId", "deliveryType", "deliveryService", "virtualPostingId");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "type");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<Long> f11 = moshi.f(Long.class, m11, "sku");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableLongAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.class, m11, "paymentType");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIntAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(EventEntity.Obj)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public EventEntity.Obj fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        String str = null;
        String str2 = null;
        Long l11 = null;
        String str3 = null;
        Long l12 = null;
        String str4 = null;
        Long l13 = null;
        Long l14 = null;
        Long l15 = null;
        String str5 = null;
        Long l16 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Long l17 = null;
        String str10 = null;
        String str11 = null;
        Long l18 = null;
        Long l19 = null;
        Long l21 = null;
        Long l22 = null;
        Long l23 = null;
        Long l24 = null;
        Long l25 = null;
        Integer num = null;
        Long l26 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    continue;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -2;
                    continue;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -3;
                    continue;
                case 2:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    i12 &= -5;
                    continue;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -9;
                    continue;
                case 4:
                    l12 = this.nullableLongAdapter.fromJson(reader);
                    i12 &= -17;
                    continue;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -33;
                    continue;
                case 6:
                    l13 = this.nullableLongAdapter.fromJson(reader);
                    i12 &= -65;
                    continue;
                case 7:
                    l14 = this.nullableLongAdapter.fromJson(reader);
                    i12 &= -129;
                    continue;
                case 8:
                    l15 = this.nullableLongAdapter.fromJson(reader);
                    i12 &= -257;
                    continue;
                case 9:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -513;
                    continue;
                case 10:
                    l16 = this.nullableLongAdapter.fromJson(reader);
                    i12 &= -1025;
                    continue;
                case 11:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -2049;
                    continue;
                case 12:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -4097;
                    continue;
                case 13:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -8193;
                    continue;
                case 14:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -16385;
                    continue;
                case 15:
                    l17 = this.nullableLongAdapter.fromJson(reader);
                    i11 = -32769;
                    break;
                case 16:
                    str10 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -65537;
                    break;
                case 17:
                    str11 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -131073;
                    break;
                case 18:
                    l18 = this.nullableLongAdapter.fromJson(reader);
                    i11 = -262145;
                    break;
                case 19:
                    l19 = this.nullableLongAdapter.fromJson(reader);
                    i11 = -524289;
                    break;
                case 20:
                    l21 = this.nullableLongAdapter.fromJson(reader);
                    i11 = -1048577;
                    break;
                case 21:
                    l22 = this.nullableLongAdapter.fromJson(reader);
                    i11 = -2097153;
                    break;
                case 22:
                    l23 = this.nullableLongAdapter.fromJson(reader);
                    i11 = -4194305;
                    break;
                case 23:
                    l24 = this.nullableLongAdapter.fromJson(reader);
                    i11 = -8388609;
                    break;
                case 24:
                    l25 = this.nullableLongAdapter.fromJson(reader);
                    i11 = -16777217;
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i11 = -33554433;
                    break;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    l26 = this.nullableLongAdapter.fromJson(reader);
                    i11 = -67108865;
                    break;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    str12 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -134217729;
                    break;
                case 28:
                    str13 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -268435457;
                    break;
                case 29:
                    str14 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -536870913;
                    break;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    str15 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -1073741825;
                    break;
            }
            i12 &= i11;
        }
        reader.endObject();
        if (i12 == Integer.MIN_VALUE) {
            Long l27 = l15;
            Long l28 = l14;
            Long l29 = l13;
            String str16 = str4;
            Long l31 = l12;
            String str17 = str3;
            return new EventEntity.Obj(str, str2, l11, str17, l31, str16, l29, l28, l27, str5, l16, str6, str7, str8, str9, l17, str10, str11, l18, l19, l21, l22, l23, l24, l25, num, l26, str12, str13, str14, str15);
        }
        Long l32 = l15;
        Long l33 = l14;
        Long l34 = l13;
        String str18 = str4;
        Long l35 = l12;
        String str19 = str3;
        Long l36 = l11;
        String str20 = str2;
        String str21 = str;
        Constructor<EventEntity.Obj> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = EventEntity.Obj.class.getDeclaredConstructor(String.class, String.class, Long.class, String.class, Long.class, String.class, Long.class, Long.class, Long.class, String.class, Long.class, String.class, String.class, String.class, String.class, Long.class, String.class, String.class, Long.class, Long.class, Long.class, Long.class, Long.class, Long.class, Long.class, Integer.class, Long.class, String.class, String.class, String.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        EventEntity.Obj newInstance = constructor.newInstance(str21, str20, l36, str19, l35, str18, l34, l33, l32, str5, l16, str6, str7, str8, str9, l17, str10, str11, l18, l19, l21, l22, l23, l24, l25, num, l26, str12, str13, str14, str15, Integer.valueOf(i12), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, EventEntity.Obj value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("type");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getType());
        writer.w("id");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getId());
        writer.w("sku");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getSku());
        writer.w("bannerId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBannerId());
        writer.w("brandId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getBrandId());
        writer.w("brandName");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBrandName());
        writer.w("sellerId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getSellerId());
        writer.w("regionId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getRegionId());
        writer.w("reviewId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getReviewId());
        writer.w("searchString");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSearchString());
        writer.w("categoryId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getCategoryId());
        writer.w("filterId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getFilterId());
        writer.w("sortId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSortId());
        writer.w("suggestType");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSuggestType());
        writer.w("orderId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getOrderId());
        writer.w("messageId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getMessageId());
        writer.w("promocode");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPromocode());
        writer.w("postingId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPostingId());
        writer.w("merchantId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getMerchantId());
        writer.w("timeslotId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getTimeslotId());
        writer.w("imageId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getImageId());
        writer.w("3dId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getImage3dId());
        writer.w("arId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getArId());
        writer.w("marketingActionId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getMarketingActionId());
        writer.w("shipmentId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getShipmentId());
        writer.w("paymentType");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getPaymentType());
        writer.w("deliveryPointId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getDeliveryPointId());
        writer.w("menuId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getMenuId());
        writer.w("deliveryType");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getDeliveryType());
        writer.w("deliveryService");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getDeliveryService());
        writer.w("virtualPostingId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getVirtualPostingId());
        writer.p();
    }
}
