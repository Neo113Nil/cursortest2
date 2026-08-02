package com.usercentrics.sdk.services.tcf.interfaces;

import com.ironsource.X3;
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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/usercentrics/sdk/services/tcf/interfaces/TCFData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes.dex */
public final class TCFData$$serializer implements GeneratedSerializer<TCFData> {
    public static final TCFData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TCFData$$serializer tCFData$$serializer = new TCFData$$serializer();
        INSTANCE = tCFData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.services.tcf.interfaces.TCFData", tCFData$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement(X3.a.v, false);
        pluginGeneratedSerialDescriptor.addElement("purposes", false);
        pluginGeneratedSerialDescriptor.addElement("specialFeatures", false);
        pluginGeneratedSerialDescriptor.addElement("specialPurposes", false);
        pluginGeneratedSerialDescriptor.addElement("stacks", false);
        pluginGeneratedSerialDescriptor.addElement("vendors", false);
        pluginGeneratedSerialDescriptor.addElement("tcString", false);
        pluginGeneratedSerialDescriptor.addElement("thirdPartyCount", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TCFData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = TCFData.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], kSerializerArr[2], kSerializerArr[3], kSerializerArr[4], kSerializerArr[5], StringSerializer.INSTANCE, IntSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public TCFData deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        List list;
        int i;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        int i2;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = TCFData.$childSerializers;
        int i3 = 7;
        int i4 = 3;
        if (beginStructure.decodeSequentially()) {
            List list7 = (List) beginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], null);
            List list8 = (List) beginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            List list9 = (List) beginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            List list10 = (List) beginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            List list11 = (List) beginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            List list12 = (List) beginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 6);
            list = list12;
            i2 = beginStructure.decodeIntElement(descriptor2, 7);
            str = decodeStringElement;
            list5 = list10;
            list3 = list11;
            list2 = list9;
            list6 = list8;
            list4 = list7;
            i = 255;
        } else {
            int i5 = 2;
            int i6 = 1;
            boolean z = true;
            int i7 = 0;
            List list13 = null;
            List list14 = null;
            List list15 = null;
            List list16 = null;
            List list17 = null;
            String str2 = null;
            int i8 = 0;
            List list18 = null;
            while (z) {
                int i9 = i4;
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 7;
                        i4 = 3;
                        i6 = 1;
                        i5 = 2;
                    case 0:
                        list15 = (List) beginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], list15);
                        i8 |= 1;
                        i3 = 7;
                        i4 = 3;
                        i6 = 1;
                        i5 = 2;
                    case 1:
                        list16 = (List) beginStructure.decodeSerializableElement(descriptor2, i6, kSerializerArr[i6], list16);
                        i8 |= 2;
                        i3 = 7;
                        i4 = 3;
                        i5 = 2;
                    case 2:
                        list17 = (List) beginStructure.decodeSerializableElement(descriptor2, i5, kSerializerArr[i5], list17);
                        i8 |= 4;
                        i3 = 7;
                        i4 = 3;
                    case 3:
                        list18 = (List) beginStructure.decodeSerializableElement(descriptor2, i9, kSerializerArr[i9], list18);
                        i8 |= 8;
                        i4 = i9;
                        i3 = 7;
                    case 4:
                        list14 = (List) beginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], list14);
                        i8 |= 16;
                        i4 = i9;
                    case 5:
                        list13 = (List) beginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], list13);
                        i8 |= 32;
                        i4 = i9;
                    case 6:
                        str2 = beginStructure.decodeStringElement(descriptor2, 6);
                        i8 |= 64;
                        i4 = i9;
                    case 7:
                        i7 = beginStructure.decodeIntElement(descriptor2, i3);
                        i8 |= 128;
                        i4 = i9;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            List list19 = list17;
            list = list13;
            i = i8;
            list2 = list19;
            List list20 = list16;
            list3 = list14;
            list4 = list15;
            list5 = list18;
            list6 = list20;
            i2 = i7;
            str = str2;
        }
        beginStructure.endStructure(descriptor2);
        return new TCFData(i, list4, list6, list2, list5, list3, list, str, i2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, TCFData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        TCFData.write$Self$usercentrics_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
