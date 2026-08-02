package com.usercentrics.sdk.v2.consent.data;

import java.util.List;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: DataTransferObject.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/usercentrics/sdk/v2/consent/data/DataTransferObject.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes4.dex */
public final class DataTransferObject$$serializer implements GeneratedSerializer<DataTransferObject> {
    public static final DataTransferObject$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        DataTransferObject$$serializer dataTransferObject$$serializer = new DataTransferObject$$serializer();
        INSTANCE = dataTransferObject$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.consent.data.DataTransferObject", dataTransferObject$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("applicationVersion", false);
        pluginGeneratedSerialDescriptor.addElement("consent", false);
        pluginGeneratedSerialDescriptor.addElement("settings", false);
        pluginGeneratedSerialDescriptor.addElement("services", false);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DataTransferObject$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = DataTransferObject.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, DataTransferObjectConsent$$serializer.INSTANCE, DataTransferObjectSettings$$serializer.INSTANCE, kSerializerArr[3], LongSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public DataTransferObject deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        String str;
        long j;
        DataTransferObjectConsent dataTransferObjectConsent;
        DataTransferObjectSettings dataTransferObjectSettings;
        List list;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = DataTransferObject.$childSerializers;
        String str2 = null;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            DataTransferObjectConsent dataTransferObjectConsent2 = (DataTransferObjectConsent) beginStructure.decodeSerializableElement(descriptor2, 1, DataTransferObjectConsent$$serializer.INSTANCE, null);
            DataTransferObjectSettings dataTransferObjectSettings2 = (DataTransferObjectSettings) beginStructure.decodeSerializableElement(descriptor2, 2, DataTransferObjectSettings$$serializer.INSTANCE, null);
            list = (List) beginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            str = decodeStringElement;
            i = 31;
            dataTransferObjectSettings = dataTransferObjectSettings2;
            dataTransferObjectConsent = dataTransferObjectConsent2;
            j = beginStructure.decodeLongElement(descriptor2, 4);
        } else {
            long j2 = 0;
            boolean z = true;
            int i2 = 0;
            DataTransferObjectConsent dataTransferObjectConsent3 = null;
            DataTransferObjectSettings dataTransferObjectSettings3 = null;
            List list2 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str2 = beginStructure.decodeStringElement(descriptor2, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    dataTransferObjectConsent3 = (DataTransferObjectConsent) beginStructure.decodeSerializableElement(descriptor2, 1, DataTransferObjectConsent$$serializer.INSTANCE, dataTransferObjectConsent3);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    dataTransferObjectSettings3 = (DataTransferObjectSettings) beginStructure.decodeSerializableElement(descriptor2, 2, DataTransferObjectSettings$$serializer.INSTANCE, dataTransferObjectSettings3);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], list2);
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
            str = str2;
            j = j2;
            dataTransferObjectConsent = dataTransferObjectConsent3;
            dataTransferObjectSettings = dataTransferObjectSettings3;
            list = list2;
        }
        beginStructure.endStructure(descriptor2);
        return new DataTransferObject(i, str, dataTransferObjectConsent, dataTransferObjectSettings, list, j, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, DataTransferObject value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        DataTransferObject.write$Self$usercentrics_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
