package ru.ozon.android.messenger.framework.data.remote.parser;

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
import org.joda.time.format.i;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/parser/DateTimeTypeMoshiAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lorg/joda/time/DateTime;", "<init>", "()V", "Lcom/squareup/moshi/x;", "writer", "date", "", "toJson", "(Lcom/squareup/moshi/x;Lorg/joda/time/DateTime;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lorg/joda/time/DateTime;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DateTimeTypeMoshiAdapter extends JsonAdapter<DateTime> {
    public static final int $stable = 0;

    @Override // com.squareup.moshi.JsonAdapter
    @h
    public DateTime fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return DateTime.i(reader.nextString()).p(DateTimeZone.g());
    }

    @Override // com.squareup.moshi.JsonAdapter
    @C
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DateTime date) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        writer.R(i.c().g(date));
    }
}
