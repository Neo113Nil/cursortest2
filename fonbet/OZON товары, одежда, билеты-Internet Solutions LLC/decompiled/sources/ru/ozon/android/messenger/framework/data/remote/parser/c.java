package ru.ozon.android.messenger.framework.data.remote.parser;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.data.remote.models.RpcResponseDTO;
import ru.ozon.android.messenger.utils.i;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final JsonParser f87829a;

    public c(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f87829a = deserializer;
    }

    @NotNull
    public final <R> i<R> a(@NotNull RpcResponseDTO response, @NotNull Class<R> responseResultType) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(responseResultType, "responseResultType");
        if (!Intrinsics.d(response.getJsonrpc(), "2.0") || ((response.getError() == null || response.getResult() != null) && (response.getResult() == null || response.getError() != null))) {
            return new i.a.g("Invalid response");
        }
        if (response.getResult() == null) {
            return response.getError() != null ? new i.a.g(response.getError().toString()) : new i.a.g("Invalid RPC response: no result or error presented");
        }
        try {
            return new i.b(this.f87829a.fromJson(response.getResult(), (Class) responseResultType));
        } catch (Exception e11) {
            String b11 = Nk.a.b("Failed to parse rpc result ", response.getResult());
            Lm0.a.f17149a.w(e11, b11, new Object[0]);
            return new i.a.f(b11, e11);
        }
    }
}
