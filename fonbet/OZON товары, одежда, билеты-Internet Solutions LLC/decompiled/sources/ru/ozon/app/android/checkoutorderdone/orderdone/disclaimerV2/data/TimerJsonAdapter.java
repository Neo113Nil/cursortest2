package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.data;

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
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.data.Timer;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/TimerJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/Timer;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/Timer;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/Timer;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/Timer$TimerPosition;", "timerPositionAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TimerJsonAdapter extends JsonAdapter<Timer> {
    public static final int $stable = 8;
    private volatile Constructor<Timer> constructorRef;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Timer.TimerPosition> timerPositionAdapter;

    public TimerJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("timeLeft", "timerPosition");
        M m11 = M.f71699a;
        this.longAdapter = moshi.f(Long.TYPE, m11, "timeLeft");
        this.timerPositionAdapter = moshi.f(Timer.TimerPosition.class, m11, "timerPosition");
    }

    @NotNull
    public String toString() {
        return b.c(27, "GeneratedJsonAdapter(Timer)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Timer fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        Timer.TimerPosition timerPosition = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                l11 = this.longAdapter.fromJson(reader);
                if (l11 == null) {
                    throw c.q("timeLeft", "timeLeft", reader);
                }
            } else if (v11 == 1) {
                timerPosition = this.timerPositionAdapter.fromJson(reader);
                if (timerPosition == null) {
                    throw c.q("timerPosition", "timerPosition", reader);
                }
                i11 = -3;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -3) {
            if (l11 == null) {
                throw c.j("timeLeft", "timeLeft", reader);
            }
            long longValue = l11.longValue();
            Intrinsics.g(timerPosition, "null cannot be cast to non-null type ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.data.Timer.TimerPosition");
            return new Timer(longValue, timerPosition);
        }
        Constructor<Timer> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Timer.class.getDeclaredConstructor(Long.TYPE, Timer.TimerPosition.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (l11 == null) {
            throw c.j("timeLeft", "timeLeft", reader);
        }
        Timer newInstance = constructor.newInstance(l11, timerPosition, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, Timer value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("timeLeft");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getTimeLeft()));
        writer.w("timerPosition");
        this.timerPositionAdapter.mo44toJson(writer, (x) value.getTimerPosition());
        writer.p();
    }
}
