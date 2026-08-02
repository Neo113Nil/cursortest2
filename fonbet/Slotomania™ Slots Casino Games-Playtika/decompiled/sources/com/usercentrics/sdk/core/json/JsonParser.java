package com.usercentrics.sdk.core.json;

import com.usercentrics.sdk.log.UsercentricsLogger;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: JsonParser.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0002H\u0004\"\u0006\b\u0000\u0010\u0004\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\b¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\u0002H\u0004\"\u0006\b\u0000\u0010\u0004\u0018\u00012\u0006\u0010\t\u001a\u00020\nH\u0086\b¢\u0006\u0002\u0010\u000bJ,\u0010\b\u001a\u0002H\u0004\"\u0006\b\u0000\u0010\u0004\u0018\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00040\r2\u0006\u0010\t\u001a\u00020\nH\u0086\b¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\n\"\u0006\b\u0000\u0010\u0004\u0018\u00012\u0006\u0010\u0010\u001a\u0002H\u0004H\u0086\b¢\u0006\u0002\u0010\u0011J,\u0010\u000f\u001a\u00020\n\"\u0006\b\u0000\u0010\u0004\u0018\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00132\u0006\u0010\u0010\u001a\u0002H\u0004H\u0086\b¢\u0006\u0002\u0010\u0014J:\u0010\u0015\u001a\u0004\u0018\u0001H\u0004\"\u0006\b\u0000\u0010\u0004\u0018\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00040\r2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0086\b¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/usercentrics/sdk/core/json/JsonParser;", "", "()V", "decodeFromJsonElement", "T", "jsonElement", "Lkotlinx/serialization/json/JsonElement;", "(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "decodeFromString", "str", "", "(Ljava/lang/String;)Ljava/lang/Object;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;", "encodeToString", "input", "(Ljava/lang/Object;)Ljava/lang/String;", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;", "tryToDecodeFromString", SentryEvent.JsonKeys.LOGGER, "Lcom/usercentrics/sdk/log/UsercentricsLogger;", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;Lcom/usercentrics/sdk/log/UsercentricsLogger;)Ljava/lang/Object;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonParser {
    public final /* synthetic */ <T> T decodeFromString(String str) {
        Json json;
        Intrinsics.checkNotNullParameter(str, "str");
        json = JsonParserKt.json;
        Json json2 = json;
        SerializersModule serializersModule = json2.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        KSerializer<Object> serializer = SerializersKt.serializer(serializersModule, (KType) null);
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (T) json2.decodeFromString(serializer, str);
    }

    public final /* synthetic */ <T> T decodeFromString(DeserializationStrategy<T> deserializer, String str) {
        Json json;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(str, "str");
        json = JsonParserKt.json;
        return (T) json.decodeFromString(deserializer, str);
    }

    public static /* synthetic */ Object tryToDecodeFromString$default(JsonParser jsonParser, DeserializationStrategy deserializer, String str, UsercentricsLogger usercentricsLogger, int i, Object obj) {
        Json json;
        if ((i & 4) != 0) {
            usercentricsLogger = null;
        }
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(str, "str");
        json = JsonParserKt.json;
        return JsonParserKt.tryToDecodeFromString(json, deserializer, str, usercentricsLogger);
    }

    public final /* synthetic */ <T> T tryToDecodeFromString(DeserializationStrategy<T> deserializer, String str, UsercentricsLogger logger) {
        Json json;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(str, "str");
        json = JsonParserKt.json;
        return (T) JsonParserKt.tryToDecodeFromString(json, deserializer, str, logger);
    }

    public final /* synthetic */ <T> String encodeToString(T input) {
        Json json;
        json = JsonParserKt.json;
        Json json2 = json;
        SerializersModule serializersModule = json2.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        KSerializer<Object> serializer = SerializersKt.serializer(serializersModule, (KType) null);
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return json2.encodeToString(serializer, input);
    }

    public final /* synthetic */ <T> String encodeToString(SerializationStrategy<? super T> serializer, T input) {
        Json json;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        json = JsonParserKt.json;
        return json.encodeToString(serializer, input);
    }

    public final /* synthetic */ <T> T decodeFromJsonElement(JsonElement jsonElement) {
        Json json;
        Intrinsics.checkNotNullParameter(jsonElement, "jsonElement");
        json = JsonParserKt.json;
        SerializersModule serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        KSerializer<Object> serializer = SerializersKt.serializer(serializersModule, (KType) null);
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (T) json.decodeFromJsonElement(serializer, jsonElement);
    }
}
