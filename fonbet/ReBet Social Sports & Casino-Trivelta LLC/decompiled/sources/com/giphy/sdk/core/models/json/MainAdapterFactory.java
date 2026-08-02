package com.giphy.sdk.core.models.json;

import Jb.a;
import Jb.c;
import com.giphy.sdk.core.models.Media;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/giphy/sdk/core/models/json/MainAdapterFactory;", "Lcom/google/gson/v;", "<init>", "()V", "T", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/reflect/TypeToken;", "type", "Lcom/google/gson/TypeAdapter;", "create", "(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MainAdapterFactory implements v {
    @Override // com.google.gson.v
    @NotNull
    public <T> TypeAdapter create(@NotNull Gson gson, @NotNull TypeToken<T> type) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(type, "type");
        final TypeAdapter q10 = gson.q(this, type);
        return new TypeAdapter() { // from class: com.giphy.sdk.core.models.json.MainAdapterFactory$create$1
            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
            @Override // com.google.gson.TypeAdapter
            public T read(@NotNull a in) {
                Intrinsics.checkNotNullParameter(in, "in");
                ?? read = TypeAdapter.this.read(in);
                if (read instanceof Media) {
                    ((Media) read).postProcess();
                }
                return read;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(@NotNull c out, T value) {
                Intrinsics.checkNotNullParameter(out, "out");
                TypeAdapter.this.write(out, value);
            }
        };
    }
}
