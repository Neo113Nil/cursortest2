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
import ru.ozon.app.android.fresh.unsorted.liveActivity.orderStatus.OrderStatusLiveActivityStateDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO_ProgressBarJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ProgressBar;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ProgressBar;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ProgressBar;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ProgressBar$ProgressIcon;", "nullableProgressIconAdapter", "", "doubleAdapter", "Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ProgressBar$TimerMode;", "timerModeAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderStatusLiveActivityStateDTO_ProgressBarJsonAdapter extends JsonAdapter<OrderStatusLiveActivityStateDTO.ProgressBar> {
    public static final int $stable = 8;
    private volatile Constructor<OrderStatusLiveActivityStateDTO.ProgressBar> constructorRef;

    @NotNull
    private final JsonAdapter<Double> doubleAdapter;

    @NotNull
    private final JsonAdapter<OrderStatusLiveActivityStateDTO.ProgressBar.ProgressIcon> nullableProgressIconAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OrderStatusLiveActivityStateDTO.ProgressBar.TimerMode> timerModeAdapter;

    public OrderStatusLiveActivityStateDTO_ProgressBarJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "icon", "progress", "mode");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableProgressIconAdapter = moshi.f(OrderStatusLiveActivityStateDTO.ProgressBar.ProgressIcon.class, m11, "icon");
        this.doubleAdapter = moshi.f(Double.TYPE, m11, "progress");
        this.timerModeAdapter = moshi.f(OrderStatusLiveActivityStateDTO.ProgressBar.TimerMode.class, m11, "mode");
    }

    @NotNull
    public String toString() {
        return b.c(65, "GeneratedJsonAdapter(OrderStatusLiveActivityStateDTO.ProgressBar)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OrderStatusLiveActivityStateDTO.ProgressBar fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        OrderStatusLiveActivityStateDTO.ProgressBar.ProgressIcon progressIcon = null;
        Double d11 = null;
        OrderStatusLiveActivityStateDTO.ProgressBar.TimerMode timerMode = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.nullableStringAdapter.fromJson(reader);
                i11 &= -2;
            } else if (v11 == 1) {
                str2 = this.nullableStringAdapter.fromJson(reader);
                i11 &= -3;
            } else if (v11 == 2) {
                progressIcon = this.nullableProgressIconAdapter.fromJson(reader);
                i11 &= -5;
            } else if (v11 == 3) {
                d11 = this.doubleAdapter.fromJson(reader);
                if (d11 == null) {
                    throw c.q("progress", "progress", reader);
                }
            } else if (v11 == 4 && (timerMode = this.timerModeAdapter.fromJson(reader)) == null) {
                throw c.q("mode", "mode", reader);
            }
        }
        reader.endObject();
        if (i11 == -8) {
            Double d12 = d11;
            OrderStatusLiveActivityStateDTO.ProgressBar.ProgressIcon progressIcon2 = progressIcon;
            String str3 = str2;
            String str4 = str;
            if (d12 == null) {
                throw c.j("progress", "progress", reader);
            }
            OrderStatusLiveActivityStateDTO.ProgressBar.TimerMode timerMode2 = timerMode;
            double doubleValue = d12.doubleValue();
            if (timerMode2 != null) {
                return new OrderStatusLiveActivityStateDTO.ProgressBar(str4, str3, progressIcon2, doubleValue, timerMode2);
            }
            throw c.j("mode", "mode", reader);
        }
        OrderStatusLiveActivityStateDTO.ProgressBar.TimerMode timerMode3 = timerMode;
        Double d13 = d11;
        OrderStatusLiveActivityStateDTO.ProgressBar.ProgressIcon progressIcon3 = progressIcon;
        String str5 = str2;
        String str6 = str;
        Constructor<OrderStatusLiveActivityStateDTO.ProgressBar> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = OrderStatusLiveActivityStateDTO.ProgressBar.class.getDeclaredConstructor(String.class, String.class, OrderStatusLiveActivityStateDTO.ProgressBar.ProgressIcon.class, Double.TYPE, OrderStatusLiveActivityStateDTO.ProgressBar.TimerMode.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<OrderStatusLiveActivityStateDTO.ProgressBar> constructor2 = constructor;
        if (d13 == null) {
            throw c.j("progress", "progress", reader);
        }
        if (timerMode3 == null) {
            throw c.j("mode", "mode", reader);
        }
        OrderStatusLiveActivityStateDTO.ProgressBar newInstance = constructor2.newInstance(str6, str5, progressIcon3, d13, timerMode3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OrderStatusLiveActivityStateDTO.ProgressBar value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("icon");
        this.nullableProgressIconAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w("progress");
        this.doubleAdapter.mo44toJson(writer, (x) Double.valueOf(value.getProgress()));
        writer.w("mode");
        this.timerModeAdapter.mo44toJson(writer, (x) value.getMode());
        writer.p();
    }
}
