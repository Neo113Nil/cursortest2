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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes3.dex */
public final class TCFSpecialFeature$$serializer implements GeneratedSerializer<TCFSpecialFeature> {
    public static final TCFSpecialFeature$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TCFSpecialFeature$$serializer tCFSpecialFeature$$serializer = new TCFSpecialFeature$$serializer();
        INSTANCE = tCFSpecialFeature$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialFeature", tCFSpecialFeature$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("purposeDescription", false);
        pluginGeneratedSerialDescriptor.addElement("illustrations", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("consent", false);
        pluginGeneratedSerialDescriptor.addElement("isPartOfASelectedStack", false);
        pluginGeneratedSerialDescriptor.addElement("stackId", false);
        pluginGeneratedSerialDescriptor.addElement("showConsentToggle", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TCFSpecialFeature$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = TCFSpecialFeature.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, kSerializerArr[1], IntSerializer.INSTANCE, StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public TCFSpecialFeature deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        List list;
        Integer num;
        int i;
        Boolean bool;
        String str;
        boolean z;
        int i2;
        String str2;
        boolean z2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = TCFSpecialFeature.$childSerializers;
        int i3 = 7;
        int i4 = 6;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            List list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 2);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 3);
            Boolean bool2 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 4, BooleanSerializer.INSTANCE, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 5);
            Integer num2 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, 6, IntSerializer.INSTANCE, null);
            list = list2;
            z2 = beginStructure.decodeBooleanElement(descriptor2, 7);
            num = num2;
            z = decodeBooleanElement;
            str2 = decodeStringElement2;
            bool = bool2;
            i2 = decodeIntElement;
            i = 255;
            str = decodeStringElement;
        } else {
            boolean z3 = true;
            boolean z4 = false;
            int i5 = 0;
            int i6 = 0;
            Integer num3 = null;
            Boolean bool3 = null;
            String str3 = null;
            String str4 = null;
            boolean z5 = false;
            list = null;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z3 = false;
                        i3 = 7;
                    case 0:
                        str3 = beginStructure.decodeStringElement(descriptor2, 0);
                        i6 |= 1;
                        i3 = 7;
                        i4 = 6;
                    case 1:
                        list = (List) beginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], list);
                        i6 |= 2;
                        i3 = 7;
                        i4 = 6;
                    case 2:
                        i6 |= 4;
                        i5 = beginStructure.decodeIntElement(descriptor2, 2);
                    case 3:
                        str4 = beginStructure.decodeStringElement(descriptor2, 3);
                        i6 |= 8;
                    case 4:
                        bool3 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 4, BooleanSerializer.INSTANCE, bool3);
                        i6 |= 16;
                    case 5:
                        z5 = beginStructure.decodeBooleanElement(descriptor2, 5);
                        i6 |= 32;
                    case 6:
                        num3 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, i4, IntSerializer.INSTANCE, num3);
                        i6 |= 64;
                    case 7:
                        z4 = beginStructure.decodeBooleanElement(descriptor2, i3);
                        i6 |= 128;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            String str5 = str4;
            num = num3;
            i = i6;
            bool = bool3;
            str = str3;
            z = z5;
            i2 = i5;
            str2 = str5;
            z2 = z4;
        }
        beginStructure.endStructure(descriptor2);
        return new TCFSpecialFeature(i, str, list, i2, str2, bool, z, num, z2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, TCFSpecialFeature value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        TCFSpecialFeature.write$Self$usercentrics_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
