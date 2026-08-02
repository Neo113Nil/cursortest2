package ru.ozon.android.messenger.framework.composer.network.serialization;

import com.squareup.moshi.Moshi;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.WebSocketRequestDTO;

/* loaded from: classes10.dex */
public final class a implements U00.b, ru.ozon.android.messenger.framework.data.remote.serialize.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f86744a;

    public a(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f86744a = moshi;
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.serialize.b
    @NotNull
    public final String a(WebSocketRequestDTO webSocketRequestDTO) {
        Intrinsics.checkNotNullParameter(WebSocketRequestDTO.class, "clazz");
        String json = this.f86744a.c(WebSocketRequestDTO.class).toJson(webSocketRequestDTO);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    @Override // U00.b
    @NotNull
    public final <T> String toJson(T t2, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        String json = this.f86744a.d(type).toJson(t2);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }
}
