package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Yc implements JsonParser, Converter {

    /* renamed from: a, reason: collision with root package name */
    public final RemoteConfigExtensionConfiguration f13222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JsonParser f13223b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Converter f13224c;

    public Yc(@NotNull RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration) {
        this.f13222a = remoteConfigExtensionConfiguration;
        this.f13223b = remoteConfigExtensionConfiguration.getJsonParser();
        this.f13224c = remoteConfigExtensionConfiguration.getProtobufConverter();
    }

    @NotNull
    public final byte[] a(@NotNull Object obj) {
        return (byte[]) this.f13224c.fromModel(obj);
    }

    @Nullable
    public final Object b(@NotNull JSONObject jSONObject) {
        return this.f13223b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return (byte[]) this.f13224c.fromModel(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parse(JSONObject jSONObject) {
        return this.f13223b.parse(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return this.f13223b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return this.f13224c.toModel((byte[]) obj);
    }

    @NotNull
    public final Object a(@NotNull JSONObject jSONObject) {
        return this.f13223b.parse(jSONObject);
    }

    @NotNull
    public final Object a(@NotNull byte[] bArr) {
        return this.f13224c.toModel(bArr);
    }

    @NotNull
    public final RemoteConfigExtensionConfiguration<Object> a() {
        return this.f13222a;
    }
}
