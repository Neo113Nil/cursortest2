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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: CCPASettings.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/usercentrics/sdk/v2/settings/data/CCPASettings.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes3.dex */
public final class CCPASettings$$serializer implements GeneratedSerializer<CCPASettings> {
    public static final CCPASettings$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CCPASettings$$serializer cCPASettings$$serializer = new CCPASettings$$serializer();
        INSTANCE = cCPASettings$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.settings.data.CCPASettings", cCPASettings$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("optOutNoticeLabel", false);
        pluginGeneratedSerialDescriptor.addElement("btnSave", false);
        pluginGeneratedSerialDescriptor.addElement("firstLayerTitle", false);
        pluginGeneratedSerialDescriptor.addElement("secondLayerTitle", false);
        pluginGeneratedSerialDescriptor.addElement("secondLayerDescription", false);
        pluginGeneratedSerialDescriptor.addElement("btnMoreInfo", false);
        pluginGeneratedSerialDescriptor.addElement("firstLayerMobileVariant", true);
        pluginGeneratedSerialDescriptor.addElement("isActive", true);
        pluginGeneratedSerialDescriptor.addElement("region", true);
        pluginGeneratedSerialDescriptor.addElement("showOnPageLoad", true);
        pluginGeneratedSerialDescriptor.addElement("reshowAfterDays", true);
        pluginGeneratedSerialDescriptor.addElement("iabAgreementExists", true);
        pluginGeneratedSerialDescriptor.addElement("removeDoNotSellToggle", true);
        pluginGeneratedSerialDescriptor.addElement("appFirstLayerDescription", true);
        pluginGeneratedSerialDescriptor.addElement("firstLayerMobileDescriptionIsActive", true);
        pluginGeneratedSerialDescriptor.addElement("firstLayerMobileDescription", true);
        pluginGeneratedSerialDescriptor.addElement("secondLayerHideLanguageSwitch", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CCPASettings$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = CCPASettings.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(kSerializerArr[6]), BooleanSerializer.INSTANCE, kSerializerArr[8], BooleanSerializer.INSTANCE, IntSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public CCPASettings deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        boolean z;
        String str;
        boolean z2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        boolean z3;
        boolean z4;
        FirstLayerMobileVariant firstLayerMobileVariant;
        String str8;
        CCPARegion cCPARegion;
        boolean z5;
        boolean z6;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = CCPASettings.$childSerializers;
        int i4 = 6;
        int i5 = 0;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 1);
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 2);
            String decodeStringElement4 = beginStructure.decodeStringElement(descriptor2, 3);
            String decodeStringElement5 = beginStructure.decodeStringElement(descriptor2, 4);
            String decodeStringElement6 = beginStructure.decodeStringElement(descriptor2, 5);
            FirstLayerMobileVariant firstLayerMobileVariant2 = (FirstLayerMobileVariant) beginStructure.decodeNullableSerializableElement(descriptor2, 6, kSerializerArr[6], null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 7);
            CCPARegion cCPARegion2 = (CCPARegion) beginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], null);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(descriptor2, 9);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 10);
            boolean decodeBooleanElement3 = beginStructure.decodeBooleanElement(descriptor2, 11);
            boolean decodeBooleanElement4 = beginStructure.decodeBooleanElement(descriptor2, 12);
            String str9 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 13, StringSerializer.INSTANCE, null);
            boolean decodeBooleanElement5 = beginStructure.decodeBooleanElement(descriptor2, 14);
            str = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 15, StringSerializer.INSTANCE, null);
            z2 = beginStructure.decodeBooleanElement(descriptor2, 16);
            firstLayerMobileVariant = firstLayerMobileVariant2;
            z5 = decodeBooleanElement2;
            str3 = decodeStringElement2;
            i = decodeIntElement;
            z3 = decodeBooleanElement3;
            z6 = decodeBooleanElement;
            z4 = decodeBooleanElement4;
            z = decodeBooleanElement5;
            str8 = str9;
            str2 = decodeStringElement;
            cCPARegion = cCPARegion2;
            str4 = decodeStringElement3;
            str7 = decodeStringElement6;
            str5 = decodeStringElement4;
            str6 = decodeStringElement5;
            i2 = 131071;
        } else {
            int i6 = 16;
            boolean z7 = true;
            boolean z8 = false;
            boolean z9 = false;
            int i7 = 0;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            FirstLayerMobileVariant firstLayerMobileVariant3 = null;
            String str10 = null;
            CCPARegion cCPARegion3 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            boolean z13 = false;
            while (z7) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z7 = false;
                        i6 = 16;
                    case 0:
                        str12 = beginStructure.decodeStringElement(descriptor2, 0);
                        i5 |= 1;
                        i6 = 16;
                    case 1:
                        str13 = beginStructure.decodeStringElement(descriptor2, 1);
                        i5 |= 2;
                        i6 = 16;
                    case 2:
                        str14 = beginStructure.decodeStringElement(descriptor2, 2);
                        i5 |= 4;
                        i6 = 16;
                    case 3:
                        str15 = beginStructure.decodeStringElement(descriptor2, 3);
                        i5 |= 8;
                        i6 = 16;
                    case 4:
                        str16 = beginStructure.decodeStringElement(descriptor2, 4);
                        i5 |= 16;
                        i6 = 16;
                    case 5:
                        str17 = beginStructure.decodeStringElement(descriptor2, 5);
                        i5 |= 32;
                        i6 = 16;
                    case 6:
                        int i8 = i4;
                        i4 = i8;
                        firstLayerMobileVariant3 = (FirstLayerMobileVariant) beginStructure.decodeNullableSerializableElement(descriptor2, i4, kSerializerArr[i8], firstLayerMobileVariant3);
                        i5 |= 64;
                        i6 = 16;
                    case 7:
                        i3 = i4;
                        z11 = beginStructure.decodeBooleanElement(descriptor2, 7);
                        i5 |= 128;
                        i4 = i3;
                        i6 = 16;
                    case 8:
                        i3 = i4;
                        cCPARegion3 = (CCPARegion) beginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], cCPARegion3);
                        i5 |= 256;
                        i4 = i3;
                        i6 = 16;
                    case 9:
                        i3 = i4;
                        z9 = beginStructure.decodeBooleanElement(descriptor2, 9);
                        i5 |= 512;
                        i4 = i3;
                        i6 = 16;
                    case 10:
                        i3 = i4;
                        i7 = beginStructure.decodeIntElement(descriptor2, 10);
                        i5 |= 1024;
                        i4 = i3;
                        i6 = 16;
                    case 11:
                        i3 = i4;
                        z10 = beginStructure.decodeBooleanElement(descriptor2, 11);
                        i5 |= 2048;
                        i4 = i3;
                        i6 = 16;
                    case 12:
                        i3 = i4;
                        z12 = beginStructure.decodeBooleanElement(descriptor2, 12);
                        i5 |= 4096;
                        i4 = i3;
                        i6 = 16;
                    case 13:
                        i3 = i4;
                        str10 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 13, StringSerializer.INSTANCE, str10);
                        i5 |= 8192;
                        i4 = i3;
                        i6 = 16;
                    case 14:
                        z13 = beginStructure.decodeBooleanElement(descriptor2, 14);
                        i5 |= 16384;
                        i6 = 16;
                    case 15:
                        str11 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 15, StringSerializer.INSTANCE, str11);
                        i5 |= 32768;
                        i6 = 16;
                    case 16:
                        z8 = beginStructure.decodeBooleanElement(descriptor2, i6);
                        i5 |= 65536;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            z = z13;
            str = str11;
            z2 = z8;
            str2 = str12;
            str3 = str13;
            str4 = str14;
            str5 = str15;
            str6 = str16;
            str7 = str17;
            i = i7;
            z3 = z10;
            z4 = z12;
            firstLayerMobileVariant = firstLayerMobileVariant3;
            str8 = str10;
            cCPARegion = cCPARegion3;
            z5 = z9;
            z6 = z11;
            i2 = i5;
        }
        beginStructure.endStructure(descriptor2);
        return new CCPASettings(i2, str2, str3, str4, str5, str6, str7, firstLayerMobileVariant, z6, cCPARegion, z5, i, z3, z4, str8, z, str, z2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, CCPASettings value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        CCPASettings.write$Self$usercentrics_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
