package com.usercentrics.sdk.v2.consent.data;

import com.ironsource.X3;
import io.sentry.protocol.Device;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SaveConsentsDto.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/usercentrics/sdk/v2/consent/data/SaveConsentsDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes4.dex */
public final class SaveConsentsDto$$serializer implements GeneratedSerializer<SaveConsentsDto> {
    public static final SaveConsentsDto$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SaveConsentsDto$$serializer saveConsentsDto$$serializer = new SaveConsentsDto$$serializer();
        INSTANCE = saveConsentsDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.consent.data.SaveConsentsDto", saveConsentsDto$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("action", false);
        pluginGeneratedSerialDescriptor.addElement(X3.j.W, false);
        pluginGeneratedSerialDescriptor.addElement("controllerId", false);
        pluginGeneratedSerialDescriptor.addElement(Device.JsonKeys.LANGUAGE, false);
        pluginGeneratedSerialDescriptor.addElement("settingsId", false);
        pluginGeneratedSerialDescriptor.addElement("settingsVersion", false);
        pluginGeneratedSerialDescriptor.addElement("consentString", false);
        pluginGeneratedSerialDescriptor.addElement("consentMeta", false);
        pluginGeneratedSerialDescriptor.addElement("consents", false);
        pluginGeneratedSerialDescriptor.addElement("bundleId", false);
        pluginGeneratedSerialDescriptor.addElement("sdkVersion", false);
        pluginGeneratedSerialDescriptor.addElement("userOS", false);
        pluginGeneratedSerialDescriptor.addElement("xdevice", false);
        pluginGeneratedSerialDescriptor.addElement("analytics", false);
        pluginGeneratedSerialDescriptor.addElement("acString", false);
        pluginGeneratedSerialDescriptor.addElement("webhook", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SaveConsentsDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = SaveConsentsDto.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializerArr[8], StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, StringSerializer.INSTANCE, BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public SaveConsentsDto deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        boolean z;
        boolean z2;
        boolean z3;
        String str11;
        String str12;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = SaveConsentsDto.$childSerializers;
        int i2 = 8;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 1);
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 2);
            String decodeStringElement4 = beginStructure.decodeStringElement(descriptor2, 3);
            String decodeStringElement5 = beginStructure.decodeStringElement(descriptor2, 4);
            String decodeStringElement6 = beginStructure.decodeStringElement(descriptor2, 5);
            String decodeStringElement7 = beginStructure.decodeStringElement(descriptor2, 6);
            String decodeStringElement8 = beginStructure.decodeStringElement(descriptor2, 7);
            List list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], null);
            String decodeStringElement9 = beginStructure.decodeStringElement(descriptor2, 9);
            String decodeStringElement10 = beginStructure.decodeStringElement(descriptor2, 10);
            String decodeStringElement11 = beginStructure.decodeStringElement(descriptor2, 11);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 12);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(descriptor2, 13);
            str7 = decodeStringElement8;
            str4 = decodeStringElement5;
            str6 = decodeStringElement7;
            str5 = decodeStringElement6;
            str12 = beginStructure.decodeStringElement(descriptor2, 14);
            z3 = beginStructure.decodeBooleanElement(descriptor2, 15);
            z = decodeBooleanElement;
            z2 = decodeBooleanElement2;
            str3 = decodeStringElement4;
            list = list2;
            str = decodeStringElement;
            str8 = decodeStringElement9;
            str9 = decodeStringElement10;
            str11 = decodeStringElement2;
            i = 65535;
            str10 = decodeStringElement11;
            str2 = decodeStringElement3;
        } else {
            int i3 = 15;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = true;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            i = 0;
            boolean z7 = false;
            List list3 = null;
            while (z6) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z6 = false;
                    case 0:
                        str13 = beginStructure.decodeStringElement(descriptor2, 0);
                        i |= 1;
                        i2 = 8;
                        i3 = 15;
                    case 1:
                        str14 = beginStructure.decodeStringElement(descriptor2, 1);
                        i |= 2;
                        i2 = 8;
                        i3 = 15;
                    case 2:
                        str15 = beginStructure.decodeStringElement(descriptor2, 2);
                        i |= 4;
                        i3 = 15;
                    case 3:
                        str16 = beginStructure.decodeStringElement(descriptor2, 3);
                        i |= 8;
                        i3 = 15;
                    case 4:
                        str17 = beginStructure.decodeStringElement(descriptor2, 4);
                        i |= 16;
                        i3 = 15;
                    case 5:
                        str18 = beginStructure.decodeStringElement(descriptor2, 5);
                        i |= 32;
                        i3 = 15;
                    case 6:
                        str19 = beginStructure.decodeStringElement(descriptor2, 6);
                        i |= 64;
                        i3 = 15;
                    case 7:
                        str20 = beginStructure.decodeStringElement(descriptor2, 7);
                        i |= 128;
                        i3 = 15;
                    case 8:
                        list3 = (List) beginStructure.decodeSerializableElement(descriptor2, i2, kSerializerArr[i2], list3);
                        i |= 256;
                        i3 = 15;
                    case 9:
                        str21 = beginStructure.decodeStringElement(descriptor2, 9);
                        i |= 512;
                        i3 = 15;
                    case 10:
                        str22 = beginStructure.decodeStringElement(descriptor2, 10);
                        i |= 1024;
                        i3 = 15;
                    case 11:
                        str23 = beginStructure.decodeStringElement(descriptor2, 11);
                        i |= 2048;
                        i3 = 15;
                    case 12:
                        z4 = beginStructure.decodeBooleanElement(descriptor2, 12);
                        i |= 4096;
                        i3 = 15;
                    case 13:
                        z5 = beginStructure.decodeBooleanElement(descriptor2, 13);
                        i |= 8192;
                        i3 = 15;
                    case 14:
                        str24 = beginStructure.decodeStringElement(descriptor2, 14);
                        i |= 16384;
                    case 15:
                        z7 = beginStructure.decodeBooleanElement(descriptor2, i3);
                        i |= 32768;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            list = list3;
            str = str13;
            str2 = str15;
            str3 = str16;
            str4 = str17;
            str5 = str18;
            str6 = str19;
            str7 = str20;
            str8 = str21;
            str9 = str22;
            str10 = str23;
            z = z4;
            z2 = z5;
            z3 = z7;
            str11 = str14;
            str12 = str24;
        }
        beginStructure.endStructure(descriptor2);
        return new SaveConsentsDto(i, str, str11, str2, str3, str4, str5, str6, str7, list, str8, str9, str10, z, z2, str12, z3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, SaveConsentsDto value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        SaveConsentsDto.write$Self$usercentrics_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
