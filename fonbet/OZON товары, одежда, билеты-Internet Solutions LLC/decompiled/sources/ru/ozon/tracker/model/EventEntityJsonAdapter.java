package ru.ozon.tracker.model;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.network.serializing.date.DateTimeWithMs;
import ru.ozon.tracker.sendEvent.Cell;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0018R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0018R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0018R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0018R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0018R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0018R\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0018R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0018R\u001c\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0018R\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/tracker/model/EventEntityJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/tracker/model/EventEntity;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/tracker/model/EventEntity;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/tracker/model/EventEntity;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lorg/joda/time/DateTime;", "dateTimeAdapter", "stringAdapter", "Lru/ozon/tracker/model/EventEntity$Attributes;", "nullableAttributesAdapter", "Lru/ozon/tracker/model/EventEntity$User;", "nullableUserAdapter", "Lru/ozon/tracker/model/EventEntity$Page;", "nullablePageAdapter", "Lru/ozon/tracker/model/EventEntity$Obj;", "nullableObjAdapter", "Lru/ozon/tracker/model/EventEntity$Properties;", "nullablePropertiesAdapter", "Lru/ozon/tracker/model/EventEntity$Widget;", "nullableWidgetAdapter", "Lru/ozon/tracker/model/EventEntity$Form;", "nullableFormAdapter", "Lru/ozon/tracker/model/EventEntity$EventError;", "nullableEventErrorAdapter", "Lru/ozon/tracker/model/EventEntity$Posting;", "nullablePostingAdapter", "Lru/ozon/tracker/sendEvent/Cell$CustomCell;", "nullableCustomCellAdapter", "Lru/ozon/tracker/model/EventEntity$Filter;", "nullableFilterAdapter", "Lru/ozon/tracker/model/EventEntity$Sale;", "nullableSaleAdapter", "Lru/ozon/tracker/model/EventEntity$Review;", "nullableReviewAdapter", "", "nullableIntAdapter", "dateTimeAtDateTimeWithMsAdapter", "Lru/ozon/tracker/model/EventEntity$Courier;", "nullableCourierAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EventEntityJsonAdapter extends JsonAdapter<EventEntity> {
    private volatile Constructor<EventEntity> constructorRef;

    @NotNull
    private final JsonAdapter<DateTime> dateTimeAdapter;

    @NotNull
    private final JsonAdapter<DateTime> dateTimeAtDateTimeWithMsAdapter;

    @NotNull
    private final JsonAdapter<EventEntity.Attributes> nullableAttributesAdapter;

    @NotNull
    private final JsonAdapter<EventEntity.Courier> nullableCourierAdapter;

    @NotNull
    private final JsonAdapter<Cell.CustomCell> nullableCustomCellAdapter;

    @NotNull
    private final JsonAdapter<EventEntity.EventError> nullableEventErrorAdapter;

    @NotNull
    private final JsonAdapter<EventEntity.Filter> nullableFilterAdapter;

    @NotNull
    private final JsonAdapter<EventEntity.Form> nullableFormAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<EventEntity.Obj> nullableObjAdapter;

    @NotNull
    private final JsonAdapter<EventEntity.Page> nullablePageAdapter;

    @NotNull
    private final JsonAdapter<EventEntity.Posting> nullablePostingAdapter;

    @NotNull
    private final JsonAdapter<EventEntity.Properties> nullablePropertiesAdapter;

    @NotNull
    private final JsonAdapter<EventEntity.Review> nullableReviewAdapter;

    @NotNull
    private final JsonAdapter<EventEntity.Sale> nullableSaleAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<EventEntity.User> nullableUserAdapter;

    @NotNull
    private final JsonAdapter<EventEntity.Widget> nullableWidgetAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public EventEntityJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("uuid", "number", "timestamp", "version", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "attributes", "user", "page", "object", "properties", "widget", DynamicElementDTO.FORM, "eventError", "posting", "custom", "filter", "sale", "review", "discountRequestId", "advertisementCampaignId", "timestampMs", "courier", TrinityEventEntityKt.TRACK_CAMPAIGN_UUID_JSON_NAME);
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "uuid");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<DateTime> f11 = moshi.f(DateTime.class, m11, "timestamp");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.dateTimeAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "version");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.stringAdapter = f12;
        JsonAdapter<EventEntity.Attributes> f13 = moshi.f(EventEntity.Attributes.class, m11, "attributes");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableAttributesAdapter = f13;
        JsonAdapter<EventEntity.User> f14 = moshi.f(EventEntity.User.class, m11, "user");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableUserAdapter = f14;
        JsonAdapter<EventEntity.Page> f15 = moshi.f(EventEntity.Page.class, m11, "page");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullablePageAdapter = f15;
        JsonAdapter<EventEntity.Obj> f16 = moshi.f(EventEntity.Obj.class, m11, "object");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableObjAdapter = f16;
        JsonAdapter<EventEntity.Properties> f17 = moshi.f(EventEntity.Properties.class, m11, "properties");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullablePropertiesAdapter = f17;
        JsonAdapter<EventEntity.Widget> f18 = moshi.f(EventEntity.Widget.class, m11, "widget");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableWidgetAdapter = f18;
        JsonAdapter<EventEntity.Form> f19 = moshi.f(EventEntity.Form.class, m11, DynamicElementDTO.FORM);
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullableFormAdapter = f19;
        JsonAdapter<EventEntity.EventError> f21 = moshi.f(EventEntity.EventError.class, m11, "eventError");
        Intrinsics.checkNotNullExpressionValue(f21, "adapter(...)");
        this.nullableEventErrorAdapter = f21;
        JsonAdapter<EventEntity.Posting> f22 = moshi.f(EventEntity.Posting.class, m11, "posting");
        Intrinsics.checkNotNullExpressionValue(f22, "adapter(...)");
        this.nullablePostingAdapter = f22;
        JsonAdapter<Cell.CustomCell> f23 = moshi.f(Cell.CustomCell.class, m11, "custom");
        Intrinsics.checkNotNullExpressionValue(f23, "adapter(...)");
        this.nullableCustomCellAdapter = f23;
        JsonAdapter<EventEntity.Filter> f24 = moshi.f(EventEntity.Filter.class, m11, "filter");
        Intrinsics.checkNotNullExpressionValue(f24, "adapter(...)");
        this.nullableFilterAdapter = f24;
        JsonAdapter<EventEntity.Sale> f25 = moshi.f(EventEntity.Sale.class, m11, "sale");
        Intrinsics.checkNotNullExpressionValue(f25, "adapter(...)");
        this.nullableSaleAdapter = f25;
        JsonAdapter<EventEntity.Review> f26 = moshi.f(EventEntity.Review.class, m11, "review");
        Intrinsics.checkNotNullExpressionValue(f26, "adapter(...)");
        this.nullableReviewAdapter = f26;
        JsonAdapter<Integer> f27 = moshi.f(Integer.class, m11, "discountRequestId");
        Intrinsics.checkNotNullExpressionValue(f27, "adapter(...)");
        this.nullableIntAdapter = f27;
        JsonAdapter<DateTime> f28 = moshi.f(DateTime.class, e0.h(new DateTimeWithMs() { // from class: ru.ozon.tracker.model.EventEntityJsonAdapter$annotationImpl$ru_ozon_tracker_network_serializing_date_DateTimeWithMs$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return DateTimeWithMs.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof DateTimeWithMs;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.tracker.network.serializing.date.DateTimeWithMs()";
            }
        }), "timestampMs");
        Intrinsics.checkNotNullExpressionValue(f28, "adapter(...)");
        this.dateTimeAtDateTimeWithMsAdapter = f28;
        JsonAdapter<EventEntity.Courier> f29 = moshi.f(EventEntity.Courier.class, m11, "courier");
        Intrinsics.checkNotNullExpressionValue(f29, "adapter(...)");
        this.nullableCourierAdapter = f29;
    }

    @NotNull
    public String toString() {
        return b.c(33, "GeneratedJsonAdapter(EventEntity)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public EventEntity fromJson(@NotNull n reader) {
        int i11;
        EventEntity newInstance;
        int i12;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        boolean z11 = false;
        int i13 = -1;
        String str2 = null;
        String str3 = null;
        DateTime dateTime = null;
        String str4 = null;
        String str5 = null;
        EventEntity.Attributes attributes = null;
        EventEntity.User user = null;
        EventEntity.Page page = null;
        EventEntity.Obj obj = null;
        EventEntity.Properties properties = null;
        EventEntity.Widget widget = null;
        EventEntity.Form form = null;
        EventEntity.EventError eventError = null;
        EventEntity.Posting posting = null;
        Cell.CustomCell customCell = null;
        EventEntity.Filter filter = null;
        EventEntity.Sale sale = null;
        EventEntity.Review review = null;
        Integer num = null;
        Integer num2 = null;
        DateTime dateTime2 = null;
        EventEntity.Courier courier = null;
        while (true) {
            boolean z12 = z11;
            String str6 = str;
            if (!reader.hasNext()) {
                reader.endObject();
                if (i13 == -3145708) {
                    DateTime dateTime3 = dateTime;
                    String str7 = str3;
                    String str8 = str2;
                    if (dateTime3 == null) {
                        throw c.j("timestamp", "timestamp", reader);
                    }
                    Intrinsics.g(str4, "null cannot be cast to non-null type kotlin.String");
                    if (dateTime2 == null) {
                        throw c.j("timestampMs", "timestampMs", reader);
                    }
                    newInstance = new EventEntity(str8, str7, dateTime3, str4, str5, attributes, user, page, obj, properties, widget, form, eventError, posting, customCell, filter, sale, review, num, num2, dateTime2, courier);
                } else {
                    EventEntity.Page page2 = page;
                    EventEntity.User user2 = user;
                    EventEntity.Attributes attributes2 = attributes;
                    String str9 = str5;
                    String str10 = str4;
                    DateTime dateTime4 = dateTime;
                    String str11 = str3;
                    String str12 = str2;
                    Constructor<EventEntity> constructor = this.constructorRef;
                    if (constructor == null) {
                        i11 = i13;
                        constructor = EventEntity.class.getDeclaredConstructor(String.class, String.class, DateTime.class, String.class, String.class, EventEntity.Attributes.class, EventEntity.User.class, EventEntity.Page.class, EventEntity.Obj.class, EventEntity.Properties.class, EventEntity.Widget.class, EventEntity.Form.class, EventEntity.EventError.class, EventEntity.Posting.class, Cell.CustomCell.class, EventEntity.Filter.class, EventEntity.Sale.class, EventEntity.Review.class, Integer.class, Integer.class, DateTime.class, EventEntity.Courier.class, Integer.TYPE, c.f34864d);
                        this.constructorRef = constructor;
                        Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                    } else {
                        i11 = i13;
                    }
                    Constructor<EventEntity> constructor2 = constructor;
                    if (dateTime4 == null) {
                        throw c.j("timestamp", "timestamp", reader);
                    }
                    if (dateTime2 == null) {
                        throw c.j("timestampMs", "timestampMs", reader);
                    }
                    newInstance = constructor2.newInstance(str12, str11, dateTime4, str10, str9, attributes2, user2, page2, obj, properties, widget, form, eventError, posting, customCell, filter, sale, review, num, num2, dateTime2, courier, Integer.valueOf(i11), null);
                }
                if (z12) {
                    newInstance.setTrackCampaignUuid(str6);
                }
                return newInstance;
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    z11 = z12;
                    str = str6;
                case 0:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -2;
                    z11 = z12;
                    str = str6;
                case 1:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -3;
                    z11 = z12;
                    str = str6;
                case 2:
                    dateTime = this.dateTimeAdapter.fromJson(reader);
                    if (dateTime == null) {
                        throw c.q("timestamp", "timestamp", reader);
                    }
                    z11 = z12;
                    str = str6;
                case 3:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("version", "version", reader);
                    }
                    i13 &= -9;
                    z11 = z12;
                    str = str6;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    z11 = z12;
                    str = str6;
                case 5:
                    attributes = this.nullableAttributesAdapter.fromJson(reader);
                    i13 &= -33;
                    z11 = z12;
                    str = str6;
                case 6:
                    user = this.nullableUserAdapter.fromJson(reader);
                    i13 &= -65;
                    z11 = z12;
                    str = str6;
                case 7:
                    page = this.nullablePageAdapter.fromJson(reader);
                    i13 &= -129;
                    z11 = z12;
                    str = str6;
                case 8:
                    obj = this.nullableObjAdapter.fromJson(reader);
                    i13 &= -257;
                    z11 = z12;
                    str = str6;
                case 9:
                    properties = this.nullablePropertiesAdapter.fromJson(reader);
                    i13 &= -513;
                    z11 = z12;
                    str = str6;
                case 10:
                    widget = this.nullableWidgetAdapter.fromJson(reader);
                    i13 &= -1025;
                    z11 = z12;
                    str = str6;
                case 11:
                    form = this.nullableFormAdapter.fromJson(reader);
                    i13 &= -2049;
                    z11 = z12;
                    str = str6;
                case 12:
                    eventError = this.nullableEventErrorAdapter.fromJson(reader);
                    i13 &= -4097;
                    z11 = z12;
                    str = str6;
                case 13:
                    posting = this.nullablePostingAdapter.fromJson(reader);
                    i13 &= -8193;
                    z11 = z12;
                    str = str6;
                case 14:
                    customCell = this.nullableCustomCellAdapter.fromJson(reader);
                    i13 &= -16385;
                    z11 = z12;
                    str = str6;
                case 15:
                    filter = this.nullableFilterAdapter.fromJson(reader);
                    i12 = -32769;
                    i13 &= i12;
                    z11 = z12;
                    str = str6;
                case 16:
                    sale = this.nullableSaleAdapter.fromJson(reader);
                    i12 = -65537;
                    i13 &= i12;
                    z11 = z12;
                    str = str6;
                case 17:
                    review = this.nullableReviewAdapter.fromJson(reader);
                    i12 = -131073;
                    i13 &= i12;
                    z11 = z12;
                    str = str6;
                case 18:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i12 = -262145;
                    i13 &= i12;
                    z11 = z12;
                    str = str6;
                case 19:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    i12 = -524289;
                    i13 &= i12;
                    z11 = z12;
                    str = str6;
                case 20:
                    dateTime2 = this.dateTimeAtDateTimeWithMsAdapter.fromJson(reader);
                    if (dateTime2 == null) {
                        throw c.q("timestampMs", "timestampMs", reader);
                    }
                    z11 = z12;
                    str = str6;
                case 21:
                    courier = this.nullableCourierAdapter.fromJson(reader);
                    i12 = -2097153;
                    i13 &= i12;
                    z11 = z12;
                    str = str6;
                case 22:
                    str = this.nullableStringAdapter.fromJson(reader);
                    z11 = true;
                default:
                    z11 = z12;
                    str = str6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, EventEntity value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("uuid");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getUuid());
        writer.w("number");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getNumber());
        writer.w("timestamp");
        this.dateTimeAdapter.mo44toJson(writer, (x) value_.getTimestamp());
        writer.w("version");
        this.stringAdapter.mo44toJson(writer, (x) value_.getVersion());
        writer.w(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getActionType());
        writer.w("attributes");
        this.nullableAttributesAdapter.mo44toJson(writer, (x) value_.getAttributes());
        writer.w("user");
        this.nullableUserAdapter.mo44toJson(writer, (x) value_.getUser());
        writer.w("page");
        this.nullablePageAdapter.mo44toJson(writer, (x) value_.getPage());
        writer.w("object");
        this.nullableObjAdapter.mo44toJson(writer, (x) value_.getObject());
        writer.w("properties");
        this.nullablePropertiesAdapter.mo44toJson(writer, (x) value_.getProperties());
        writer.w("widget");
        this.nullableWidgetAdapter.mo44toJson(writer, (x) value_.getWidget());
        writer.w(DynamicElementDTO.FORM);
        this.nullableFormAdapter.mo44toJson(writer, (x) value_.getForm());
        writer.w("eventError");
        this.nullableEventErrorAdapter.mo44toJson(writer, (x) value_.getEventError());
        writer.w("posting");
        this.nullablePostingAdapter.mo44toJson(writer, (x) value_.getPosting());
        writer.w("custom");
        this.nullableCustomCellAdapter.mo44toJson(writer, (x) value_.getCustom());
        writer.w("filter");
        this.nullableFilterAdapter.mo44toJson(writer, (x) value_.getFilter());
        writer.w("sale");
        this.nullableSaleAdapter.mo44toJson(writer, (x) value_.getSale());
        writer.w("review");
        this.nullableReviewAdapter.mo44toJson(writer, (x) value_.getReview());
        writer.w("discountRequestId");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getDiscountRequestId());
        writer.w("advertisementCampaignId");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getAdvertisementCampaignId());
        writer.w("timestampMs");
        this.dateTimeAtDateTimeWithMsAdapter.mo44toJson(writer, (x) value_.getTimestampMs());
        writer.w("courier");
        this.nullableCourierAdapter.mo44toJson(writer, (x) value_.getCourier());
        writer.w(TrinityEventEntityKt.TRACK_CAMPAIGN_UUID_JSON_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTrackCampaignUuid());
        writer.p();
    }
}
