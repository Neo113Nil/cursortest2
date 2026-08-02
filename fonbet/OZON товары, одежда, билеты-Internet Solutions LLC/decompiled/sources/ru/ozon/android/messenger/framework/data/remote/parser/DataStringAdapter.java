package ru.ozon.android.messenger.framework.data.remote.parser;

import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.h;
import com.squareup.moshi.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/parser/DataStringAdapter;", "", "<init>", "()V", "", "jsonString", "toJson", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "Lcom/squareup/moshi/JsonAdapter;", "adapter", "fromJson", "(Lcom/squareup/moshi/n;Lcom/squareup/moshi/JsonAdapter;)Ljava/lang/String;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DataStringAdapter {
    @DataString
    @h
    @NotNull
    public final String fromJson(@NotNull n reader, @NotNull JsonAdapter<Object> adapter) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Object t2 = reader.t();
        Intrinsics.f(t2);
        String json = adapter.toJson(t2);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    @C
    @NotNull
    public final String toJson(@DataString @NotNull String jsonString) {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        return jsonString;
    }
}
