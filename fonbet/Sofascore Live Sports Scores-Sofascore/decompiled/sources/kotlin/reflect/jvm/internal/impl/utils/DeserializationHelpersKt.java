package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DeserializationHelpersKt {
    @NotNull
    public static final JvmMetadataVersion jvmMetadataVersionOrDefault(@NotNull DeserializationConfiguration deserializationConfiguration) {
        deserializationConfiguration.getClass();
        BinaryVersion binaryVersion = deserializationConfiguration.getBinaryVersion();
        JvmMetadataVersion jvmMetadataVersion = binaryVersion instanceof JvmMetadataVersion ? (JvmMetadataVersion) binaryVersion : null;
        return jvmMetadataVersion == null ? JvmMetadataVersion.INSTANCE : jvmMetadataVersion;
    }
}
