package com.usercentrics.sdk.v2.translation.data;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TranslationLabelsDto.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/usercentrics/sdk/v2/translation/data/TranslationLabelsDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class TranslationLabelsDto$$serializer implements GeneratedSerializer<TranslationLabelsDto> {
    public static final TranslationLabelsDto$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TranslationLabelsDto$$serializer translationLabelsDto$$serializer = new TranslationLabelsDto$$serializer();
        INSTANCE = translationLabelsDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.translation.data.TranslationLabelsDto", translationLabelsDto$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("COOKIE_REFRESH", false);
        pluginGeneratedSerialDescriptor.addElement("COOKIE_STORAGE", false);
        pluginGeneratedSerialDescriptor.addElement("CNIL_DENY_LINK_TEXT", false);
        pluginGeneratedSerialDescriptor.addElement("VENDORS_OUTSIDE_EU", false);
        pluginGeneratedSerialDescriptor.addElement("DETAILS", false);
        pluginGeneratedSerialDescriptor.addElement("CID_TITLE", false);
        pluginGeneratedSerialDescriptor.addElement("MOBILE_TCF_MAX_STORAGE_DURATION_TEXT", false);
        pluginGeneratedSerialDescriptor.addElement("MOBILE_TCF_MAX_STORAGE_DURATION_TITLE", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TranslationLabelsDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public TranslationLabelsDto deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i = 0;
        if (beginStructure.decodeSequentially()) {
            str = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 1);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 2);
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 3);
            String decodeStringElement4 = beginStructure.decodeStringElement(descriptor2, 4);
            String decodeStringElement5 = beginStructure.decodeStringElement(descriptor2, 5);
            String decodeStringElement6 = beginStructure.decodeStringElement(descriptor2, 6);
            i = 255;
            str7 = beginStructure.decodeStringElement(descriptor2, 7);
            str8 = decodeStringElement6;
            str2 = decodeStringElement5;
            str4 = decodeStringElement3;
            str6 = decodeStringElement4;
            str5 = decodeStringElement2;
            str3 = decodeStringElement;
        } else {
            str = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            boolean z = true;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i |= 1;
                        str = beginStructure.decodeStringElement(descriptor2, 0);
                        continue;
                    case 1:
                        str15 = beginStructure.decodeStringElement(descriptor2, 1);
                        i |= 2;
                        continue;
                    case 2:
                        str14 = beginStructure.decodeStringElement(descriptor2, 2);
                        i |= 4;
                        break;
                    case 3:
                        str12 = beginStructure.decodeStringElement(descriptor2, 3);
                        i |= 8;
                        break;
                    case 4:
                        str13 = beginStructure.decodeStringElement(descriptor2, 4);
                        i |= 16;
                        break;
                    case 5:
                        str11 = beginStructure.decodeStringElement(descriptor2, 5);
                        i |= 32;
                        break;
                    case 6:
                        str10 = beginStructure.decodeStringElement(descriptor2, 6);
                        i |= 64;
                        break;
                    case 7:
                        str9 = beginStructure.decodeStringElement(descriptor2, 7);
                        i |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            String str16 = str15;
            str2 = str11;
            str3 = str16;
            String str17 = str13;
            str4 = str12;
            str5 = str14;
            str6 = str17;
            str7 = str9;
            str8 = str10;
        }
        int i2 = i;
        beginStructure.endStructure(descriptor2);
        return new TranslationLabelsDto(i2, str, str3, str5, str4, str6, str2, str8, str7, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, TranslationLabelsDto value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        TranslationLabelsDto.write$Self$usercentrics_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
