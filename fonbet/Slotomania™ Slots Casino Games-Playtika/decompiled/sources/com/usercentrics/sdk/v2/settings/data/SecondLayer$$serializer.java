package com.usercentrics.sdk.v2.settings.data;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SecondLayer.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/usercentrics/sdk/v2/settings/data/SecondLayer.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes5.dex */
public final class SecondLayer$$serializer implements GeneratedSerializer<SecondLayer> {
    public static final SecondLayer$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SecondLayer$$serializer secondLayer$$serializer = new SecondLayer$$serializer();
        INSTANCE = secondLayer$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.settings.data.SecondLayer", secondLayer$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("tabsCategoriesLabel", false);
        pluginGeneratedSerialDescriptor.addElement("tabsServicesLabel", false);
        pluginGeneratedSerialDescriptor.addElement("hideTogglesForServices", false);
        pluginGeneratedSerialDescriptor.addElement("hideDataProcessingServices", false);
        pluginGeneratedSerialDescriptor.addElement("hideButtonDeny", true);
        pluginGeneratedSerialDescriptor.addElement("hideLanguageSwitch", true);
        pluginGeneratedSerialDescriptor.addElement("acceptButtonText", true);
        pluginGeneratedSerialDescriptor.addElement("denyButtonText", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SecondLayer$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public SecondLayer deserialize(Decoder decoder) {
        boolean z;
        String str;
        String str2;
        Boolean bool;
        Boolean bool2;
        String str3;
        String str4;
        int i;
        boolean z2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 1);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 2);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(descriptor2, 3);
            Boolean bool3 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 4, BooleanSerializer.INSTANCE, null);
            Boolean bool4 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 5, BooleanSerializer.INSTANCE, null);
            String str5 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, null);
            str4 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, null);
            str = str5;
            bool2 = bool4;
            z2 = decodeBooleanElement2;
            bool = bool3;
            z = decodeBooleanElement;
            i = 255;
            str3 = decodeStringElement2;
            str2 = decodeStringElement;
        } else {
            boolean z3 = true;
            boolean z4 = false;
            int i2 = 0;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            Boolean bool5 = null;
            z = false;
            Boolean bool6 = null;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z3 = false;
                        break;
                    case 0:
                        i2 |= 1;
                        str8 = beginStructure.decodeStringElement(descriptor2, 0);
                        continue;
                    case 1:
                        i2 |= 2;
                        str9 = beginStructure.decodeStringElement(descriptor2, 1);
                        continue;
                    case 2:
                        i2 |= 4;
                        z = beginStructure.decodeBooleanElement(descriptor2, 2);
                        continue;
                    case 3:
                        z4 = beginStructure.decodeBooleanElement(descriptor2, 3);
                        i2 |= 8;
                        continue;
                    case 4:
                        bool5 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 4, BooleanSerializer.INSTANCE, bool5);
                        i2 |= 16;
                        break;
                    case 5:
                        bool6 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 5, BooleanSerializer.INSTANCE, bool6);
                        i2 |= 32;
                        break;
                    case 6:
                        str7 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, str7);
                        i2 |= 64;
                        break;
                    case 7:
                        str6 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, str6);
                        i2 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            Boolean bool7 = bool5;
            str = str7;
            str2 = str8;
            bool = bool7;
            String str10 = str9;
            bool2 = bool6;
            str3 = str10;
            str4 = str6;
            i = i2;
            z2 = z4;
        }
        beginStructure.endStructure(descriptor2);
        return new SecondLayer(i, str2, str3, z, z2, bool, bool2, str, str4, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, SecondLayer value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        SecondLayer.write$Self$usercentrics_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
