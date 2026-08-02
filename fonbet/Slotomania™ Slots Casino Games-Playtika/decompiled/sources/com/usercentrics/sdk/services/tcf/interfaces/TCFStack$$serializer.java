package com.usercentrics.sdk.services.tcf.interfaces;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: PublicInterfaces.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/usercentrics/sdk/services/tcf/interfaces/TCFStack.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes5.dex */
public final class TCFStack$$serializer implements GeneratedSerializer<TCFStack> {
    public static final TCFStack$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TCFStack$$serializer tCFStack$$serializer = new TCFStack$$serializer();
        INSTANCE = tCFStack$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.services.tcf.interfaces.TCFStack", tCFStack$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("purposeIds", false);
        pluginGeneratedSerialDescriptor.addElement("specialFeatureIds", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TCFStack$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = TCFStack.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, IntSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializerArr[3], kSerializerArr[4]};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public TCFStack deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        int i2;
        String str;
        String str2;
        List list;
        List list2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = TCFStack.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 1);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 2);
            List list3 = (List) beginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            str = decodeStringElement;
            str2 = decodeStringElement2;
            list = list3;
            i = 31;
            i2 = decodeIntElement;
        } else {
            boolean z = true;
            int i3 = 0;
            String str3 = null;
            String str4 = null;
            List list4 = null;
            List list5 = null;
            int i4 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str3 = beginStructure.decodeStringElement(descriptor2, 0);
                    i3 |= 1;
                } else if (decodeElementIndex == 1) {
                    i4 = beginStructure.decodeIntElement(descriptor2, 1);
                    i3 |= 2;
                } else if (decodeElementIndex == 2) {
                    str4 = beginStructure.decodeStringElement(descriptor2, 2);
                    i3 |= 4;
                } else if (decodeElementIndex == 3) {
                    list4 = (List) beginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], list4);
                    i3 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    list5 = (List) beginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], list5);
                    i3 |= 16;
                }
            }
            i = i3;
            i2 = i4;
            str = str3;
            str2 = str4;
            list = list4;
            list2 = list5;
        }
        beginStructure.endStructure(descriptor2);
        return new TCFStack(i, str, i2, str2, list, list2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, TCFStack value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        TCFStack.write$Self$usercentrics_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
