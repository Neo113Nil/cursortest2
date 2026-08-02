package com.usercentrics.sdk.services.deviceStorage.migrations;

import com.usercentrics.sdk.core.json.JsonParser;
import com.usercentrics.sdk.core.json.JsonParserKt;
import com.usercentrics.sdk.services.deviceStorage.KeyValueStorage;
import com.usercentrics.sdk.services.deviceStorage.StorageHolder;
import com.usercentrics.sdk.services.deviceStorage.StorageKeys;
import com.usercentrics.sdk.services.deviceStorage.models.StorageTCF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: MigrationToVersion6.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/usercentrics/sdk/services/deviceStorage/migrations/MigrationToVersion6;", "Lcom/usercentrics/sdk/services/deviceStorage/migrations/Migration;", "storageHolder", "Lcom/usercentrics/sdk/services/deviceStorage/StorageHolder;", "jsonParser", "Lcom/usercentrics/sdk/core/json/JsonParser;", "(Lcom/usercentrics/sdk/services/deviceStorage/StorageHolder;Lcom/usercentrics/sdk/core/json/JsonParser;)V", "migrate", "", "migrateSettings", "", "migrateTCF", "settingsId", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MigrationToVersion6 extends Migration {
    private final JsonParser jsonParser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MigrationToVersion6(StorageHolder storageHolder, JsonParser jsonParser) {
        super(storageHolder, 6);
        Intrinsics.checkNotNullParameter(storageHolder, "storageHolder");
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        this.jsonParser = jsonParser;
    }

    @Override // com.usercentrics.sdk.services.deviceStorage.migrations.Migration
    public void migrate() {
        String migrateSettings = migrateSettings();
        if (migrateSettings != null) {
            migrateTCF(migrateSettings);
        }
    }

    private final String migrateSettings() {
        Json json;
        JsonPrimitive jsonPrimitive;
        String string = getStorageHolder().getUsercentricsKeyValueStorage().getString("settings", null);
        String str = string;
        if (str != null && !StringsKt.isBlank(str)) {
            json = JsonParserKt.json;
            Json json2 = json;
            KSerializer<Object> serializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(JsonObject.class));
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            JsonElement jsonElement = (JsonElement) ((JsonObject) json2.decodeFromString(serializer, string)).get((Object) "id");
            String content = (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : jsonPrimitive.getContent();
            String str2 = content;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                KeyValueStorage usercentricsKeyValueStorage = getStorageHolder().getUsercentricsKeyValueStorage();
                usercentricsKeyValueStorage.put(StorageKeys.SETTINGS_PATTERN.getText() + content, string);
                usercentricsKeyValueStorage.deleteKey("settings");
                return content;
            }
        }
        return null;
    }

    private final void migrateTCF(String settingsId) {
        Json json;
        Json json2;
        String string = getStorageHolder().getUsercentricsKeyValueStorage().getString("tcf", null);
        String str = string;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        json = JsonParserKt.json;
        Json json3 = json;
        KSerializer<Object> serializer = SerializersKt.serializer(json3.getSerializersModule(), Reflection.typeOf(StorageTCF.class));
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        StorageTCF copy$default = StorageTCF.copy$default((StorageTCF) json3.decodeFromString(serializer, string), null, null, getStorageHolder().getDefaultKeyValueStorage().getString("IABTCF_AddtlConsent", ""), 3, null);
        json2 = JsonParserKt.json;
        Json json4 = json2;
        KSerializer<Object> serializer2 = SerializersKt.serializer(json4.getSerializersModule(), Reflection.typeOf(StorageTCF.class));
        Intrinsics.checkNotNull(serializer2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        String encodeToString = json4.encodeToString(serializer2, copy$default);
        KeyValueStorage usercentricsKeyValueStorage = getStorageHolder().getUsercentricsKeyValueStorage();
        usercentricsKeyValueStorage.put(StorageKeys.TCF_PATTERN.getText() + settingsId, encodeToString);
        usercentricsKeyValueStorage.put(StorageKeys.ACTUAL_TCF_SETTINGS_ID.getText(), settingsId);
        usercentricsKeyValueStorage.deleteKey("tcf");
    }
}
