package ru.ozon.android.messenger.framework.data.remote.parser;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.data.remote.models.RpcResponseDTO;
import ru.ozon.android.messenger.framework.data.remote.models.WebSocketMessageDTO;
import ru.ozon.android.messenger.utils.i;

/* loaded from: classes10.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final JsonParser f87833a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f87834b;

    public f(@NotNull JsonParser deserializer, @NotNull c jsonRpcParser) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(jsonRpcParser, "jsonRpcParser");
        this.f87833a = deserializer;
        this.f87834b = jsonRpcParser;
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.parser.e
    @NotNull
    public final <R> i<R> a(@NotNull RpcResponseDTO response, @NotNull Class<R> responseResultDTOType) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(responseResultDTOType, "responseResultDTOType");
        return this.f87834b.a(response, responseResultDTOType);
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.parser.e
    public final WebSocketMessageDTO b(@NotNull String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            String jSONObject = new JSONObject(source).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            return (WebSocketMessageDTO) this.f87833a.fromJson(jSONObject, WebSocketMessageDTO.class);
        } catch (Exception e11) {
            Lm0.a.f17149a.w(e11, Nk.a.b("Failed to parse message ", source), new Object[0]);
            return null;
        }
    }
}
