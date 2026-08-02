package com.usercentrics.sdk.v2.settings.data;

import io.ktor.http.ContentType;
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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: UsercentricsCustomization.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/usercentrics/sdk/v2/settings/data/UsercentricsCustomization.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes4.dex */
public final class UsercentricsCustomization$$serializer implements GeneratedSerializer<UsercentricsCustomization> {
    public static final UsercentricsCustomization$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UsercentricsCustomization$$serializer usercentricsCustomization$$serializer = new UsercentricsCustomization$$serializer();
        INSTANCE = usercentricsCustomization$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.settings.data.UsercentricsCustomization", usercentricsCustomization$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("logoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("borderRadiusLayer", true);
        pluginGeneratedSerialDescriptor.addElement("borderRadiusButton", true);
        pluginGeneratedSerialDescriptor.addElement("overlayOpacity", true);
        pluginGeneratedSerialDescriptor.addElement(ContentType.Font.TYPE, true);
        pluginGeneratedSerialDescriptor.addElement("color", true);
        pluginGeneratedSerialDescriptor.addElement("logoAltTag", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UsercentricsCustomization$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(FloatSerializer.INSTANCE), BuiltinSerializersKt.getNullable(CustomizationFont$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CustomizationColor$$serializer.INSTANCE), StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public UsercentricsCustomization deserialize(Decoder decoder) {
        CustomizationColor customizationColor;
        String str;
        Float f;
        CustomizationFont customizationFont;
        Integer num;
        Integer num2;
        int i;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i2 = 6;
        String str3 = null;
        if (beginStructure.decodeSequentially()) {
            String str4 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, null);
            Integer num3 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, 1, IntSerializer.INSTANCE, null);
            Integer num4 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, null);
            Float f2 = (Float) beginStructure.decodeNullableSerializableElement(descriptor2, 3, FloatSerializer.INSTANCE, null);
            CustomizationFont customizationFont2 = (CustomizationFont) beginStructure.decodeNullableSerializableElement(descriptor2, 4, CustomizationFont$$serializer.INSTANCE, null);
            CustomizationColor customizationColor2 = (CustomizationColor) beginStructure.decodeNullableSerializableElement(descriptor2, 5, CustomizationColor$$serializer.INSTANCE, null);
            str2 = str4;
            str = beginStructure.decodeStringElement(descriptor2, 6);
            customizationColor = customizationColor2;
            f = f2;
            customizationFont = customizationFont2;
            num2 = num4;
            num = num3;
            i = 127;
        } else {
            boolean z = true;
            int i3 = 0;
            Integer num5 = null;
            Integer num6 = null;
            Float f3 = null;
            CustomizationFont customizationFont3 = null;
            CustomizationColor customizationColor3 = null;
            String str5 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                    case 0:
                        str3 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, str3);
                        i3 |= 1;
                        i2 = 6;
                    case 1:
                        num5 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, 1, IntSerializer.INSTANCE, num5);
                        i3 |= 2;
                    case 2:
                        num6 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, num6);
                        i3 |= 4;
                    case 3:
                        f3 = (Float) beginStructure.decodeNullableSerializableElement(descriptor2, 3, FloatSerializer.INSTANCE, f3);
                        i3 |= 8;
                    case 4:
                        customizationFont3 = (CustomizationFont) beginStructure.decodeNullableSerializableElement(descriptor2, 4, CustomizationFont$$serializer.INSTANCE, customizationFont3);
                        i3 |= 16;
                    case 5:
                        customizationColor3 = (CustomizationColor) beginStructure.decodeNullableSerializableElement(descriptor2, 5, CustomizationColor$$serializer.INSTANCE, customizationColor3);
                        i3 |= 32;
                    case 6:
                        str5 = beginStructure.decodeStringElement(descriptor2, i2);
                        i3 |= 64;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            customizationColor = customizationColor3;
            str = str5;
            f = f3;
            customizationFont = customizationFont3;
            num = num5;
            num2 = num6;
            i = i3;
            str2 = str3;
        }
        beginStructure.endStructure(descriptor2);
        return new UsercentricsCustomization(i, str2, num, num2, f, customizationFont, customizationColor, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, UsercentricsCustomization value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        UsercentricsCustomization.write$Self$usercentrics_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
