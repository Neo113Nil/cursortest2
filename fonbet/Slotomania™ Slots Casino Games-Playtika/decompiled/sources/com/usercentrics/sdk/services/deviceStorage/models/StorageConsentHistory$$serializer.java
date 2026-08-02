package com.usercentrics.sdk.services.deviceStorage.models;

import io.sentry.protocol.Device;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: StorageSettings.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes3.dex */
public final class StorageConsentHistory$$serializer implements GeneratedSerializer<StorageConsentHistory> {
    public static final StorageConsentHistory$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        StorageConsentHistory$$serializer storageConsentHistory$$serializer = new StorageConsentHistory$$serializer();
        INSTANCE = storageConsentHistory$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.services.deviceStorage.models.StorageConsentHistory", storageConsentHistory$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("action", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement(Device.JsonKeys.LANGUAGE, false);
        pluginGeneratedSerialDescriptor.addElement("timestampInMillis", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StorageConsentHistory$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StorageConsentAction$$serializer.INSTANCE, BooleanSerializer.INSTANCE, StorageConsentType$$serializer.INSTANCE, StringSerializer.INSTANCE, LongSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public StorageConsentHistory deserialize(Decoder decoder) {
        int i;
        boolean z;
        long j;
        StorageConsentAction storageConsentAction;
        StorageConsentType storageConsentType;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            StorageConsentAction storageConsentAction2 = (StorageConsentAction) beginStructure.decodeSerializableElement(descriptor2, 0, StorageConsentAction$$serializer.INSTANCE, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 1);
            StorageConsentType storageConsentType2 = (StorageConsentType) beginStructure.decodeSerializableElement(descriptor2, 2, StorageConsentType$$serializer.INSTANCE, null);
            storageConsentAction = storageConsentAction2;
            str = beginStructure.decodeStringElement(descriptor2, 3);
            i = 31;
            storageConsentType = storageConsentType2;
            z = decodeBooleanElement;
            j = beginStructure.decodeLongElement(descriptor2, 4);
        } else {
            long j2 = 0;
            boolean z2 = true;
            int i2 = 0;
            StorageConsentAction storageConsentAction3 = null;
            StorageConsentType storageConsentType3 = null;
            String str2 = null;
            boolean z3 = false;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z2 = false;
                } else if (decodeElementIndex == 0) {
                    storageConsentAction3 = (StorageConsentAction) beginStructure.decodeSerializableElement(descriptor2, 0, StorageConsentAction$$serializer.INSTANCE, storageConsentAction3);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    z3 = beginStructure.decodeBooleanElement(descriptor2, 1);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    storageConsentType3 = (StorageConsentType) beginStructure.decodeSerializableElement(descriptor2, 2, StorageConsentType$$serializer.INSTANCE, storageConsentType3);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    str2 = beginStructure.decodeStringElement(descriptor2, 3);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    j2 = beginStructure.decodeLongElement(descriptor2, 4);
                    i2 |= 16;
                }
            }
            i = i2;
            z = z3;
            j = j2;
            storageConsentAction = storageConsentAction3;
            storageConsentType = storageConsentType3;
            str = str2;
        }
        beginStructure.endStructure(descriptor2);
        return new StorageConsentHistory(i, storageConsentAction, z, storageConsentType, str, j, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, StorageConsentHistory value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        StorageConsentHistory.write$Self$usercentrics_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
