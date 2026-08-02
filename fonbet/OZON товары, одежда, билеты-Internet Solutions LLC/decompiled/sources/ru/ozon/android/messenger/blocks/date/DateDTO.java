package ru.ozon.android.messenger.blocks.date;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/android/messenger/blocks/date/DateDTO;", "", "date", "Lorg/joda/time/DateTime;", "<init>", "(Lorg/joda/time/DateTime;)V", "getDate", "()Lorg/joda/time/DateTime;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DateDTO {
    public static final int $stable = 8;

    @NotNull
    private final DateTime date;

    public DateDTO(@NotNull DateTime date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.date = date;
    }

    @NotNull
    public final DateTime getDate() {
        return this.date;
    }
}
