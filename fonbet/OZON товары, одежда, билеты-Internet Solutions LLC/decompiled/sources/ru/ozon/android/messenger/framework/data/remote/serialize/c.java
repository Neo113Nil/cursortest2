package ru.ozon.android.messenger.framework.data.remote.serialize;

import com.squareup.moshi.Moshi;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

/* loaded from: classes10.dex */
public final class c implements JsonParser {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f87835a;

    public c(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f87835a = moshi;
    }

    @Override // ru.ozon.android.composerCommonViewKit.parsing.JsonParser
    public final <T> T fromJson(@NotNull String json, @NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        T fromJson = this.f87835a.c(clazz).fromJson(json);
        Intrinsics.f(fromJson);
        return fromJson;
    }

    @Override // ru.ozon.android.composerCommonViewKit.parsing.JsonParser
    public final <T> T fromJson(@NotNull String json, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(type, "type");
        T fromJson = this.f87835a.d(type).fromJson(json);
        Intrinsics.f(fromJson);
        return fromJson;
    }
}
