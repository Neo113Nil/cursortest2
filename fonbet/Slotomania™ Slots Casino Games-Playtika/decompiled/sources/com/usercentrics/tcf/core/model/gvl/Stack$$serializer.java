package com.usercentrics.tcf.core.model.gvl;

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

/* compiled from: Stack.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/usercentrics/tcf/core/model/gvl/Stack.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/usercentrics/tcf/core/model/gvl/Stack;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes2.dex */
public final class Stack$$serializer implements GeneratedSerializer<Stack> {
    public static final Stack$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Stack$$serializer stack$$serializer = new Stack$$serializer();
        INSTANCE = stack$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.tcf.core.model.gvl.Stack", stack$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("purposes", false);
        pluginGeneratedSerialDescriptor.addElement("specialFeatures", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Stack$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = Stack.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], StringSerializer.INSTANCE, IntSerializer.INSTANCE, StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Stack deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        int i2;
        List list;
        List list2;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = Stack.$childSerializers;
        int i3 = 0;
        if (beginStructure.decodeSequentially()) {
            List list3 = (List) beginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], null);
            List list4 = (List) beginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 2);
            list2 = list4;
            list = list3;
            i = beginStructure.decodeIntElement(descriptor2, 3);
            str2 = beginStructure.decodeStringElement(descriptor2, 4);
            str = decodeStringElement;
            i2 = 31;
        } else {
            int i4 = 1;
            int i5 = 0;
            List list5 = null;
            List list6 = null;
            String str3 = null;
            String str4 = null;
            int i6 = 0;
            while (i4 != 0) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                int i7 = i3;
                if (decodeElementIndex == -1) {
                    i3 = i7;
                    i4 = i3;
                } else if (decodeElementIndex != 0) {
                    if (decodeElementIndex == 1) {
                        list6 = (List) beginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], list6);
                        i6 |= 2;
                    } else if (decodeElementIndex == 2) {
                        str3 = beginStructure.decodeStringElement(descriptor2, 2);
                        i6 |= 4;
                    } else if (decodeElementIndex == 3) {
                        i5 = beginStructure.decodeIntElement(descriptor2, 3);
                        i6 |= 8;
                    } else {
                        if (decodeElementIndex != 4) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        str4 = beginStructure.decodeStringElement(descriptor2, 4);
                        i6 |= 16;
                    }
                    i3 = i7;
                } else {
                    list5 = (List) beginStructure.decodeSerializableElement(descriptor2, i7, kSerializerArr[i7], list5);
                    i6 |= 1;
                    i3 = i7;
                }
            }
            i = i5;
            i2 = i6;
            list = list5;
            list2 = list6;
            str = str3;
            str2 = str4;
        }
        beginStructure.endStructure(descriptor2);
        return new Stack(i2, list, list2, str, i, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Stack value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        Stack.write$Self$usercentrics_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
