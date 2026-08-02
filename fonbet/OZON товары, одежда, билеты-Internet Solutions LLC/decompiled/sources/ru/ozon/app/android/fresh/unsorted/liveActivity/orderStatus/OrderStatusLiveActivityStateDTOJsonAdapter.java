package ru.ozon.app.android.fresh.unsorted.liveActivity.orderStatus;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.fresh.unsorted.liveActivity.orderStatus.OrderStatusLiveActivityStateDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$OrderStatus;", "orderStatusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ProgressBar;", "progressBarAdapter", "Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$Button;", "nullableButtonAdapter", "Lorg/joda/time/DateTime;", "nullableDateTimeAdapter", "Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ActionButton;", "nullableActionButtonAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderStatusLiveActivityStateDTOJsonAdapter extends JsonAdapter<OrderStatusLiveActivityStateDTO> {
    public static final int $stable = 8;
    private volatile Constructor<OrderStatusLiveActivityStateDTO> constructorRef;

    @NotNull
    private final JsonAdapter<OrderStatusLiveActivityStateDTO.ActionButton> nullableActionButtonAdapter;

    @NotNull
    private final JsonAdapter<OrderStatusLiveActivityStateDTO.Button> nullableButtonAdapter;

    @NotNull
    private final JsonAdapter<DateTime> nullableDateTimeAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OrderStatusLiveActivityStateDTO.OrderStatus> orderStatusAdapter;

    @NotNull
    private final JsonAdapter<OrderStatusLiveActivityStateDTO.ProgressBar> progressBarAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public OrderStatusLiveActivityStateDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("status", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "progressBar", "button", "widgetLink", "serverTimestamp", "deadlineTimestamp", "bottomButton");
        M m11 = M.f71699a;
        this.orderStatusAdapter = moshi.f(OrderStatusLiveActivityStateDTO.OrderStatus.class, m11, "status");
        this.stringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.progressBarAdapter = moshi.f(OrderStatusLiveActivityStateDTO.ProgressBar.class, m11, "progressBar");
        this.nullableButtonAdapter = moshi.f(OrderStatusLiveActivityStateDTO.Button.class, m11, "button");
        this.nullableDateTimeAdapter = moshi.f(DateTime.class, m11, "serverTimestamp");
        this.nullableActionButtonAdapter = moshi.f(OrderStatusLiveActivityStateDTO.ActionButton.class, m11, "bottomButton");
    }

    @NotNull
    public String toString() {
        return b.c(53, "GeneratedJsonAdapter(OrderStatusLiveActivityStateDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OrderStatusLiveActivityStateDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        OrderStatusLiveActivityStateDTO.OrderStatus orderStatus = null;
        String str = null;
        String str2 = null;
        OrderStatusLiveActivityStateDTO.ProgressBar progressBar = null;
        OrderStatusLiveActivityStateDTO.Button button = null;
        String str3 = null;
        DateTime dateTime = null;
        DateTime dateTime2 = null;
        OrderStatusLiveActivityStateDTO.ActionButton actionButton = null;
        while (true) {
            OrderStatusLiveActivityStateDTO.OrderStatus orderStatus2 = orderStatus;
            if (!reader.hasNext()) {
                String str4 = str;
                reader.endObject();
                if (i12 == -17) {
                    if (orderStatus2 == null) {
                        throw c.j("status", "status", reader);
                    }
                    if (str4 == null) {
                        throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    if (str2 == null) {
                        throw c.j("subtitle", "subtitle", reader);
                    }
                    if (progressBar == null) {
                        throw c.j("progressBar", "progressBar", reader);
                    }
                    if (str3 == null) {
                        throw c.j("widgetLink", "widgetLink", reader);
                    }
                    OrderStatusLiveActivityStateDTO.ActionButton actionButton2 = actionButton;
                    DateTime dateTime3 = dateTime2;
                    DateTime dateTime4 = dateTime;
                    String str5 = str3;
                    return new OrderStatusLiveActivityStateDTO(orderStatus2, str4, str2, progressBar, button, str5, dateTime4, dateTime3, actionButton2);
                }
                Constructor<OrderStatusLiveActivityStateDTO> constructor = this.constructorRef;
                if (constructor == null) {
                    i11 = i12;
                    constructor = OrderStatusLiveActivityStateDTO.class.getDeclaredConstructor(OrderStatusLiveActivityStateDTO.OrderStatus.class, String.class, String.class, OrderStatusLiveActivityStateDTO.ProgressBar.class, OrderStatusLiveActivityStateDTO.Button.class, String.class, DateTime.class, DateTime.class, OrderStatusLiveActivityStateDTO.ActionButton.class, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i12;
                }
                Constructor<OrderStatusLiveActivityStateDTO> constructor2 = constructor;
                if (orderStatus2 == null) {
                    throw c.j("status", "status", reader);
                }
                if (str4 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (str2 == null) {
                    throw c.j("subtitle", "subtitle", reader);
                }
                if (progressBar == null) {
                    throw c.j("progressBar", "progressBar", reader);
                }
                if (str3 == null) {
                    throw c.j("widgetLink", "widgetLink", reader);
                }
                OrderStatusLiveActivityStateDTO newInstance = constructor2.newInstance(orderStatus2, str4, str2, progressBar, button, str3, dateTime, dateTime2, actionButton, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            String str6 = str;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str = str6;
                    orderStatus = orderStatus2;
                case 0:
                    orderStatus = this.orderStatusAdapter.fromJson(reader);
                    if (orderStatus == null) {
                        throw c.q("status", "status", reader);
                    }
                    str = str6;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    orderStatus = orderStatus2;
                case 2:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("subtitle", "subtitle", reader);
                    }
                    str = str6;
                    orderStatus = orderStatus2;
                case 3:
                    progressBar = this.progressBarAdapter.fromJson(reader);
                    if (progressBar == null) {
                        throw c.q("progressBar", "progressBar", reader);
                    }
                    str = str6;
                    orderStatus = orderStatus2;
                case 4:
                    button = this.nullableButtonAdapter.fromJson(reader);
                    str = str6;
                    orderStatus = orderStatus2;
                    i12 = -17;
                case 5:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("widgetLink", "widgetLink", reader);
                    }
                    str = str6;
                    orderStatus = orderStatus2;
                case 6:
                    dateTime = this.nullableDateTimeAdapter.fromJson(reader);
                    str = str6;
                    orderStatus = orderStatus2;
                case 7:
                    dateTime2 = this.nullableDateTimeAdapter.fromJson(reader);
                    str = str6;
                    orderStatus = orderStatus2;
                case 8:
                    actionButton = this.nullableActionButtonAdapter.fromJson(reader);
                    str = str6;
                    orderStatus = orderStatus2;
                default:
                    str = str6;
                    orderStatus = orderStatus2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OrderStatusLiveActivityStateDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("status");
        this.orderStatusAdapter.mo44toJson(writer, (x) value.getStatus());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.stringAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("progressBar");
        this.progressBarAdapter.mo44toJson(writer, (x) value.getProgressBar());
        writer.w("button");
        this.nullableButtonAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("widgetLink");
        this.stringAdapter.mo44toJson(writer, (x) value.getWidgetLink());
        writer.w("serverTimestamp");
        this.nullableDateTimeAdapter.mo44toJson(writer, (x) value.getServerTimestamp());
        writer.w("deadlineTimestamp");
        this.nullableDateTimeAdapter.mo44toJson(writer, (x) value.getDeadlineTimestamp());
        writer.w("bottomButton");
        this.nullableActionButtonAdapter.mo44toJson(writer, (x) value.getBottomButton());
        writer.p();
    }
}
