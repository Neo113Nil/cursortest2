package com.usercentrics.sdk.services.tcf.interfaces;

import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: PublicInterfaces.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/usercentrics/sdk/services/tcf/interfaces/TCFPurpose.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes3.dex */
public final class TCFPurpose$$serializer implements GeneratedSerializer<TCFPurpose> {
    public static final TCFPurpose$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TCFPurpose$$serializer tCFPurpose$$serializer = new TCFPurpose$$serializer();
        INSTANCE = tCFPurpose$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose", tCFPurpose$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("purposeDescription", false);
        pluginGeneratedSerialDescriptor.addElement("illustrations", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("consent", false);
        pluginGeneratedSerialDescriptor.addElement("isPartOfASelectedStack", false);
        pluginGeneratedSerialDescriptor.addElement("legitimateInterestConsent", false);
        pluginGeneratedSerialDescriptor.addElement("showConsentToggle", false);
        pluginGeneratedSerialDescriptor.addElement("showLegitimateInterestToggle", false);
        pluginGeneratedSerialDescriptor.addElement("stackId", false);
        pluginGeneratedSerialDescriptor.addElement("numberOfVendors", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TCFPurpose$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = TCFPurpose.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, kSerializerArr[1], IntSerializer.INSTANCE, StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public TCFPurpose deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        Integer num;
        int i;
        boolean z;
        String str;
        String str2;
        boolean z2;
        Integer num2;
        boolean z3;
        Boolean bool;
        int i2;
        Boolean bool2;
        List list;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = TCFPurpose.$childSerializers;
        int i3 = 10;
        int i4 = 9;
        int i5 = 7;
        int i6 = 0;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            List list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 2);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 3);
            Boolean bool3 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 4, BooleanSerializer.INSTANCE, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 5);
            Boolean bool4 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 6, BooleanSerializer.INSTANCE, null);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(descriptor2, 7);
            boolean decodeBooleanElement3 = beginStructure.decodeBooleanElement(descriptor2, 8);
            Integer num3 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, 9, IntSerializer.INSTANCE, null);
            num = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, 10, IntSerializer.INSTANCE, null);
            num2 = num3;
            z2 = decodeBooleanElement2;
            bool2 = bool4;
            z3 = decodeBooleanElement;
            str2 = decodeStringElement2;
            z = decodeBooleanElement3;
            bool = bool3;
            i = 2047;
            str = decodeStringElement;
            i2 = decodeIntElement;
            list = list2;
        } else {
            boolean z4 = true;
            boolean z5 = false;
            boolean z6 = false;
            int i7 = 0;
            Integer num4 = null;
            Integer num5 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            String str3 = null;
            List list3 = null;
            String str4 = null;
            boolean z7 = false;
            while (z4) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z4 = false;
                        i3 = 10;
                        i4 = 9;
                    case 0:
                        str3 = beginStructure.decodeStringElement(descriptor2, 0);
                        i6 |= 1;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                    case 1:
                        i6 |= 2;
                        list3 = (List) beginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], list3);
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                    case 2:
                        i7 = beginStructure.decodeIntElement(descriptor2, 2);
                        i6 |= 4;
                        i3 = 10;
                        i4 = 9;
                    case 3:
                        str4 = beginStructure.decodeStringElement(descriptor2, 3);
                        i6 |= 8;
                        i3 = 10;
                        i4 = 9;
                    case 4:
                        bool6 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 4, BooleanSerializer.INSTANCE, bool6);
                        i6 |= 16;
                        i3 = 10;
                        i4 = 9;
                    case 5:
                        z7 = beginStructure.decodeBooleanElement(descriptor2, 5);
                        i6 |= 32;
                    case 6:
                        bool5 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 6, BooleanSerializer.INSTANCE, bool5);
                        i6 |= 64;
                    case 7:
                        z5 = beginStructure.decodeBooleanElement(descriptor2, i5);
                        i6 |= 128;
                    case 8:
                        z6 = beginStructure.decodeBooleanElement(descriptor2, 8);
                        i6 |= 256;
                    case 9:
                        num4 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, i4, IntSerializer.INSTANCE, num4);
                        i6 |= 512;
                    case 10:
                        num5 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, i3, IntSerializer.INSTANCE, num5);
                        i6 |= 1024;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            List list4 = list3;
            num = num5;
            i = i6;
            z = z6;
            str = str3;
            str2 = str4;
            z2 = z5;
            num2 = num4;
            z3 = z7;
            bool = bool6;
            i2 = i7;
            bool2 = bool5;
            list = list4;
        }
        beginStructure.endStructure(descriptor2);
        return new TCFPurpose(i, str, list, i2, str2, bool, z3, bool2, z2, z, num2, num, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, TCFPurpose value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        TCFPurpose.write$Self$usercentrics_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
