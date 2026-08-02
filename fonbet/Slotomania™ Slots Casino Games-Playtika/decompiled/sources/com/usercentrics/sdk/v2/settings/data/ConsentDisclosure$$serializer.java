package com.usercentrics.sdk.v2.settings.data;

import com.ironsource.X3;
import io.sentry.protocol.ViewHierarchyNode;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: ConsentDisclosure.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/usercentrics/sdk/v2/settings/data/ConsentDisclosure.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes5.dex */
public final class ConsentDisclosure$$serializer implements GeneratedSerializer<ConsentDisclosure> {
    public static final ConsentDisclosure$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ConsentDisclosure$$serializer consentDisclosure$$serializer = new ConsentDisclosure$$serializer();
        INSTANCE = consentDisclosure$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.settings.data.ConsentDisclosure", consentDisclosure$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement(ViewHierarchyNode.JsonKeys.IDENTIFIER, true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("maxAgeSeconds", true);
        pluginGeneratedSerialDescriptor.addElement("cookieRefresh", true);
        pluginGeneratedSerialDescriptor.addElement("purposes", true);
        pluginGeneratedSerialDescriptor.addElement(X3.j.D, true);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ConsentDisclosure$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = ConsentDisclosure.$childSerializers;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[1]), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BooleanSerializer.INSTANCE, kSerializerArr[5], BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ConsentDisclosure deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        String str;
        String str2;
        int i;
        String str3;
        List list;
        String str4;
        Long l;
        ConsentDisclosureType consentDisclosureType;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = ConsentDisclosure.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        if (beginStructure.decodeSequentially()) {
            String str5 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, null);
            ConsentDisclosureType consentDisclosureType2 = (ConsentDisclosureType) beginStructure.decodeNullableSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            String str6 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, null);
            Long l2 = (Long) beginStructure.decodeNullableSerializableElement(descriptor2, 3, LongSerializer.INSTANCE, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 4);
            List list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            String str7 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, null);
            i = 255;
            list = list2;
            str = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, null);
            str2 = str7;
            l = l2;
            z = decodeBooleanElement;
            str3 = str6;
            consentDisclosureType = consentDisclosureType2;
            str4 = str5;
        } else {
            int i4 = 1;
            boolean z2 = true;
            boolean z3 = false;
            String str8 = null;
            String str9 = null;
            List list3 = null;
            String str10 = null;
            ConsentDisclosureType consentDisclosureType3 = null;
            String str11 = null;
            int i5 = 0;
            Long l3 = null;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 6;
                        i4 = 1;
                    case 0:
                        str10 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, str10);
                        i5 |= 1;
                        i2 = 7;
                        i3 = 6;
                        i4 = 1;
                    case 1:
                        consentDisclosureType3 = (ConsentDisclosureType) beginStructure.decodeNullableSerializableElement(descriptor2, i4, kSerializerArr[i4], consentDisclosureType3);
                        i5 |= 2;
                        i2 = 7;
                        i3 = 6;
                    case 2:
                        str11 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, str11);
                        i5 |= 4;
                        i2 = 7;
                        i3 = 6;
                    case 3:
                        l3 = (Long) beginStructure.decodeNullableSerializableElement(descriptor2, 3, LongSerializer.INSTANCE, l3);
                        i5 |= 8;
                        i2 = 7;
                        i3 = 6;
                    case 4:
                        z3 = beginStructure.decodeBooleanElement(descriptor2, 4);
                        i5 |= 16;
                    case 5:
                        list3 = (List) beginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], list3);
                        i5 |= 32;
                    case 6:
                        str9 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, i3, StringSerializer.INSTANCE, str9);
                        i5 |= 64;
                    case 7:
                        str8 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, i2, StringSerializer.INSTANCE, str8);
                        i5 |= 128;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            str = str8;
            str2 = str9;
            i = i5;
            str3 = str11;
            list = list3;
            str4 = str10;
            l = l3;
            consentDisclosureType = consentDisclosureType3;
            z = z3;
        }
        beginStructure.endStructure(descriptor2);
        return new ConsentDisclosure(i, str4, consentDisclosureType, str3, l, z, list, str2, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, ConsentDisclosure value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        ConsentDisclosure.write$Self$usercentrics_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
