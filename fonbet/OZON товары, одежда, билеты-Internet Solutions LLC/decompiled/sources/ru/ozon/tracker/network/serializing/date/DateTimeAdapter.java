package ru.ozon.tracker.network.serializing.date;

import ck0.C5841a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.h;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/tracker/network/serializing/date/DateTimeAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lorg/joda/time/DateTime;", "Lorg/joda/time/format/b;", "formatter", "<init>", "(Lorg/joda/time/format/b;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lorg/joda/time/DateTime;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lorg/joda/time/DateTime;)V", "Lorg/joda/time/format/b;", "Companion", "a", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DateTimeAdapter extends JsonAdapter<DateTime> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final DateTimeAdapter WITHOUT_MS = new DateTimeAdapter(C5841a.a());

    @NotNull
    private static final DateTimeAdapter WITH_MS = new DateTimeAdapter(C5841a.b());

    @NotNull
    private final b formatter;

    /* renamed from: ru.ozon.tracker.network.serializing.date.DateTimeAdapter$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    private DateTimeAdapter(b bVar) {
        this.formatter = bVar;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @h
    public DateTime fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return this.formatter.d(reader.nextString()).p(DateTimeZone.g());
    }

    @Override // com.squareup.moshi.JsonAdapter
    @C
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DateTime value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        writer.R(this.formatter.g(value));
    }
}
