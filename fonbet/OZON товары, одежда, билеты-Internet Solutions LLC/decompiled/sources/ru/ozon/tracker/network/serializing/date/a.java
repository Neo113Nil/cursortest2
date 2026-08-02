package ru.ozon.tracker.network.serializing.date;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import ed.C6345a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* loaded from: classes7.dex */
public final class a implements JsonAdapter.a {
    @Override // com.squareup.moshi.JsonAdapter.a
    public final JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> set, @NotNull Moshi moshi) {
        DateTimeAdapter dateTimeAdapter;
        DateTimeAdapter dateTimeAdapter2;
        Intrinsics.checkNotNullParameter(type, "type");
        if (!Intrinsics.d(Ep.a.b(set, "annotations", moshi, "moshi", type), DateTime.class)) {
            return null;
        }
        Set<? extends Annotation> set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator<T> it = set2.iterator();
            while (it.hasNext()) {
                if (C6345a.a((Annotation) it.next()).equals(N.b(DateTimeWithMs.class))) {
                    DateTimeAdapter.INSTANCE.getClass();
                    dateTimeAdapter = DateTimeAdapter.WITH_MS;
                    return dateTimeAdapter;
                }
            }
        }
        DateTimeAdapter.INSTANCE.getClass();
        dateTimeAdapter2 = DateTimeAdapter.WITHOUT_MS;
        return dateTimeAdapter2;
    }
}
