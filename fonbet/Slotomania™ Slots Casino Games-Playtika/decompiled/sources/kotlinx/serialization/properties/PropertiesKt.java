package kotlinx.serialization.properties;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.reflect.KType;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: Properties.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\t\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a.\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\"\u0006\b\u0000\u0010\b\u0018\u0001*\u00020\u00012\u0006\u0010\t\u001a\u0002H\bH\u0087\b¢\u0006\u0002\u0010\n\u001a.\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\"\u0006\b\u0000\u0010\b\u0018\u0001*\u00020\u00012\u0006\u0010\t\u001a\u0002H\bH\u0087\b¢\u0006\u0002\u0010\n\u001a.\u0010\f\u001a\u0002H\b\"\u0006\b\u0000\u0010\b\u0018\u0001*\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0087\b¢\u0006\u0002\u0010\u000e\u001a.\u0010\u000f\u001a\u0002H\b\"\u0006\b\u0000\u0010\b\u0018\u0001*\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\b¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, d2 = {"Properties", "Lkotlinx/serialization/properties/Properties;", "module", "Lkotlinx/serialization/modules/SerializersModule;", "encodeToMap", "", "", "", "T", "value", "(Lkotlinx/serialization/properties/Properties;Ljava/lang/Object;)Ljava/util/Map;", "encodeToStringMap", "decodeFromMap", "map", "(Lkotlinx/serialization/properties/Properties;Ljava/util/Map;)Ljava/lang/Object;", "decodeFromStringMap", "kotlinx-serialization-properties"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PropertiesKt {
    @ExperimentalSerializationApi
    public static final Properties Properties(SerializersModule module) {
        Intrinsics.checkNotNullParameter(module, "module");
        return new PropertiesImpl(module);
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> Map<String, Object> encodeToMap(Properties properties, T t) {
        Intrinsics.checkNotNullParameter(properties, "<this>");
        SerializersModule serializersModule = properties.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return properties.encodeToMap(SerializersKt.serializer(serializersModule, (KType) null), t);
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> Map<String, String> encodeToStringMap(Properties properties, T t) {
        Intrinsics.checkNotNullParameter(properties, "<this>");
        SerializersModule serializersModule = properties.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return properties.encodeToStringMap(SerializersKt.serializer(serializersModule, (KType) null), t);
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> T decodeFromMap(Properties properties, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(properties, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        SerializersModule serializersModule = properties.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) properties.decodeFromMap(SerializersKt.serializer(serializersModule, (KType) null), map);
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> T decodeFromStringMap(Properties properties, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(properties, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        SerializersModule serializersModule = properties.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) properties.decodeFromStringMap(SerializersKt.serializer(serializersModule, (KType) null), map);
    }
}
