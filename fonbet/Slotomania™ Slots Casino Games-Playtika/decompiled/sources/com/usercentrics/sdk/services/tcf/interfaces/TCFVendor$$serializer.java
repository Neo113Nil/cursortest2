package com.usercentrics.sdk.services.tcf.interfaces;

import com.ironsource.X3;
import com.usercentrics.tcf.core.model.gvl.DataRetention;
import com.usercentrics.tcf.core.model.gvl.DataRetention$$serializer;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: PublicInterfaces.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/usercentrics/sdk/services/tcf/interfaces/TCFVendor.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes4.dex */
public final class TCFVendor$$serializer implements GeneratedSerializer<TCFVendor> {
    public static final TCFVendor$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TCFVendor$$serializer tCFVendor$$serializer = new TCFVendor$$serializer();
        INSTANCE = tCFVendor$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.services.tcf.interfaces.TCFVendor", tCFVendor$$serializer, 23);
        pluginGeneratedSerialDescriptor.addElement("consent", false);
        pluginGeneratedSerialDescriptor.addElement(X3.a.v, false);
        pluginGeneratedSerialDescriptor.addElement("flexiblePurposes", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("legitimateInterestConsent", false);
        pluginGeneratedSerialDescriptor.addElement("legitimateInterestPurposes", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("policyUrl", false);
        pluginGeneratedSerialDescriptor.addElement("purposes", false);
        pluginGeneratedSerialDescriptor.addElement("restrictions", false);
        pluginGeneratedSerialDescriptor.addElement("specialFeatures", false);
        pluginGeneratedSerialDescriptor.addElement("specialPurposes", false);
        pluginGeneratedSerialDescriptor.addElement("showConsentToggle", false);
        pluginGeneratedSerialDescriptor.addElement("showLegitimateInterestToggle", false);
        pluginGeneratedSerialDescriptor.addElement("cookieMaxAgeSeconds", true);
        pluginGeneratedSerialDescriptor.addElement("usesNonCookieAccess", false);
        pluginGeneratedSerialDescriptor.addElement("deviceStorageDisclosureUrl", true);
        pluginGeneratedSerialDescriptor.addElement("usesCookies", true);
        pluginGeneratedSerialDescriptor.addElement("cookieRefresh", true);
        pluginGeneratedSerialDescriptor.addElement("dataSharedOutsideEU", true);
        pluginGeneratedSerialDescriptor.addElement("dataRetention", true);
        pluginGeneratedSerialDescriptor.addElement("dataCategories", false);
        pluginGeneratedSerialDescriptor.addElement("vendorUrls", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TCFVendor$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = TCFVendor.$childSerializers;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), kSerializerArr[1], kSerializerArr[2], IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), kSerializerArr[5], StringSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializerArr[8], kSerializerArr[9], kSerializerArr[10], kSerializerArr[11], BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(DoubleSerializer.INSTANCE), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(DataRetention$$serializer.INSTANCE), kSerializerArr[21], kSerializerArr[22]};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public TCFVendor deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        Boolean bool;
        Double d;
        List list;
        List list2;
        List list3;
        List list4;
        int i;
        int i2;
        boolean z;
        List list5;
        String str;
        String str2;
        boolean z2;
        DataRetention dataRetention;
        boolean z3;
        boolean z4;
        List list6;
        Boolean bool2;
        String str3;
        Boolean bool3;
        List list7;
        List list8;
        List list9;
        Boolean bool4;
        boolean z5;
        List list10;
        List list11;
        List list12;
        boolean z6;
        List list13;
        boolean z7;
        List list14;
        boolean z8;
        List list15;
        boolean z9;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = TCFVendor.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            Boolean bool5 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 0, BooleanSerializer.INSTANCE, null);
            List list16 = (List) beginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            List list17 = (List) beginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 3);
            Boolean bool6 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 4, BooleanSerializer.INSTANCE, null);
            List list18 = (List) beginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 6);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 7);
            List list19 = (List) beginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], null);
            List list20 = (List) beginStructure.decodeSerializableElement(descriptor2, 9, kSerializerArr[9], null);
            List list21 = (List) beginStructure.decodeSerializableElement(descriptor2, 10, kSerializerArr[10], null);
            List list22 = (List) beginStructure.decodeSerializableElement(descriptor2, 11, kSerializerArr[11], null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 12);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(descriptor2, 13);
            Double d2 = (Double) beginStructure.decodeNullableSerializableElement(descriptor2, 14, DoubleSerializer.INSTANCE, null);
            boolean decodeBooleanElement3 = beginStructure.decodeBooleanElement(descriptor2, 15);
            String str4 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 16, StringSerializer.INSTANCE, null);
            boolean decodeBooleanElement4 = beginStructure.decodeBooleanElement(descriptor2, 17);
            Boolean bool7 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 18, BooleanSerializer.INSTANCE, null);
            Boolean bool8 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 19, BooleanSerializer.INSTANCE, null);
            DataRetention dataRetention2 = (DataRetention) beginStructure.decodeNullableSerializableElement(descriptor2, 20, DataRetention$$serializer.INSTANCE, null);
            list6 = (List) beginStructure.decodeSerializableElement(descriptor2, 21, kSerializerArr[21], null);
            list7 = (List) beginStructure.decodeSerializableElement(descriptor2, 22, kSerializerArr[22], null);
            bool = bool7;
            z4 = decodeBooleanElement4;
            d = d2;
            bool3 = bool8;
            dataRetention = dataRetention2;
            str2 = decodeStringElement2;
            str = decodeStringElement;
            z2 = decodeBooleanElement2;
            str3 = str4;
            z3 = decodeBooleanElement3;
            bool2 = bool5;
            list = list22;
            list3 = list20;
            list4 = list19;
            i = 8388607;
            bool4 = bool6;
            z = decodeBooleanElement;
            list9 = list16;
            i2 = decodeIntElement;
            list2 = list21;
            list8 = list18;
            list5 = list17;
        } else {
            int i4 = 0;
            List list23 = null;
            int i5 = 22;
            int i6 = 1;
            boolean z10 = true;
            boolean z11 = false;
            int i7 = 0;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            int i8 = 10;
            int i9 = 9;
            int i10 = 8;
            int i11 = 2;
            List list24 = null;
            Boolean bool9 = null;
            String str5 = null;
            Double d3 = null;
            Boolean bool10 = null;
            List list25 = null;
            List list26 = null;
            List list27 = null;
            List list28 = null;
            Boolean bool11 = null;
            List list29 = null;
            String str6 = null;
            String str7 = null;
            Boolean bool12 = null;
            DataRetention dataRetention3 = null;
            List list30 = null;
            int i12 = 5;
            List list31 = null;
            while (z10) {
                int i13 = i5;
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z5 = z11;
                        list10 = list29;
                        list11 = list24;
                        z10 = false;
                        list23 = list23;
                        i4 = i4;
                        list24 = list11;
                        i6 = 1;
                        i5 = 22;
                        i11 = 2;
                        i12 = 5;
                        i10 = 8;
                        i9 = 9;
                        i8 = 10;
                        list29 = list10;
                        z11 = z5;
                    case 0:
                        z5 = z11;
                        list10 = list29;
                        list11 = list24;
                        bool11 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 0, BooleanSerializer.INSTANCE, bool11);
                        i4 |= 1;
                        list23 = list23;
                        list24 = list11;
                        i6 = 1;
                        i5 = 22;
                        i11 = 2;
                        i12 = 5;
                        i10 = 8;
                        i9 = 9;
                        i8 = 10;
                        list29 = list10;
                        z11 = z5;
                    case 1:
                        boolean z15 = z11;
                        List list32 = (List) beginStructure.decodeSerializableElement(descriptor2, i6, kSerializerArr[i6], list29);
                        i4 |= 2;
                        list23 = list23;
                        list24 = list24;
                        z11 = z15;
                        i11 = 2;
                        i12 = 5;
                        i10 = 8;
                        i9 = 9;
                        i8 = 10;
                        list29 = list32;
                        i5 = 22;
                    case 2:
                        list12 = list23;
                        z6 = z11;
                        list24 = (List) beginStructure.decodeSerializableElement(descriptor2, i11, kSerializerArr[i11], list24);
                        i4 |= 4;
                        list23 = list12;
                        z11 = z6;
                        i5 = 22;
                        i12 = 5;
                        i10 = 8;
                        i9 = 9;
                        i8 = 10;
                    case 3:
                        list12 = list23;
                        z6 = z11;
                        i7 = beginStructure.decodeIntElement(descriptor2, 3);
                        i4 |= 8;
                        list23 = list12;
                        z11 = z6;
                        i5 = 22;
                        i12 = 5;
                        i10 = 8;
                        i9 = 9;
                        i8 = 10;
                    case 4:
                        list12 = list23;
                        z6 = z11;
                        bool10 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 4, BooleanSerializer.INSTANCE, bool10);
                        i4 |= 16;
                        list23 = list12;
                        z11 = z6;
                        i5 = 22;
                        i12 = 5;
                        i10 = 8;
                        i9 = 9;
                        i8 = 10;
                    case 5:
                        list13 = list23;
                        z7 = z11;
                        list27 = (List) beginStructure.decodeSerializableElement(descriptor2, i12, kSerializerArr[i12], list27);
                        i4 |= 32;
                        list23 = list13;
                        z11 = z7;
                        i5 = 22;
                        i10 = 8;
                        i9 = 9;
                        i8 = 10;
                    case 6:
                        list13 = list23;
                        z7 = z11;
                        str6 = beginStructure.decodeStringElement(descriptor2, 6);
                        i4 |= 64;
                        list23 = list13;
                        z11 = z7;
                        i5 = 22;
                        i10 = 8;
                        i9 = 9;
                        i8 = 10;
                    case 7:
                        list14 = list23;
                        z8 = z11;
                        str7 = beginStructure.decodeStringElement(descriptor2, 7);
                        i4 |= 128;
                        list23 = list14;
                        z11 = z8;
                        i5 = 22;
                        i9 = 9;
                        i8 = 10;
                    case 8:
                        list14 = list23;
                        z8 = z11;
                        list28 = (List) beginStructure.decodeSerializableElement(descriptor2, i10, kSerializerArr[i10], list28);
                        i4 |= 256;
                        list23 = list14;
                        z11 = z8;
                        i5 = 22;
                        i9 = 9;
                        i8 = 10;
                    case 9:
                        list31 = (List) beginStructure.decodeSerializableElement(descriptor2, i9, kSerializerArr[i9], list31);
                        i4 |= 512;
                        list23 = list23;
                        z11 = z11;
                        i5 = 22;
                        i8 = 10;
                    case 10:
                        list15 = list23;
                        z9 = z11;
                        list26 = (List) beginStructure.decodeSerializableElement(descriptor2, i8, kSerializerArr[i8], list26);
                        i4 |= 1024;
                        list23 = list15;
                        z11 = z9;
                        i5 = 22;
                    case 11:
                        list15 = list23;
                        z9 = z11;
                        list25 = (List) beginStructure.decodeSerializableElement(descriptor2, 11, kSerializerArr[11], list25);
                        i4 |= 2048;
                        list23 = list15;
                        z11 = z9;
                        i5 = 22;
                    case 12:
                        list15 = list23;
                        z9 = z11;
                        z12 = beginStructure.decodeBooleanElement(descriptor2, 12);
                        i4 |= 4096;
                        list23 = list15;
                        z11 = z9;
                        i5 = 22;
                    case 13:
                        list15 = list23;
                        z9 = z11;
                        z13 = beginStructure.decodeBooleanElement(descriptor2, 13);
                        i4 |= 8192;
                        list23 = list15;
                        z11 = z9;
                        i5 = 22;
                    case 14:
                        list15 = list23;
                        z9 = z11;
                        d3 = (Double) beginStructure.decodeNullableSerializableElement(descriptor2, 14, DoubleSerializer.INSTANCE, d3);
                        i4 |= 16384;
                        list23 = list15;
                        z11 = z9;
                        i5 = 22;
                    case 15:
                        list15 = list23;
                        z9 = z11;
                        z14 = beginStructure.decodeBooleanElement(descriptor2, 15);
                        i4 |= 32768;
                        list23 = list15;
                        z11 = z9;
                        i5 = 22;
                    case 16:
                        list15 = list23;
                        z9 = z11;
                        str5 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 16, StringSerializer.INSTANCE, str5);
                        i3 = 65536;
                        i4 |= i3;
                        list23 = list15;
                        z11 = z9;
                        i5 = 22;
                    case 17:
                        i4 |= 131072;
                        list23 = list23;
                        z11 = beginStructure.decodeBooleanElement(descriptor2, 17);
                        i5 = 22;
                    case 18:
                        list15 = list23;
                        z9 = z11;
                        bool9 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 18, BooleanSerializer.INSTANCE, bool9);
                        i3 = 262144;
                        i4 |= i3;
                        list23 = list15;
                        z11 = z9;
                        i5 = 22;
                    case 19:
                        list15 = list23;
                        z9 = z11;
                        bool12 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 19, BooleanSerializer.INSTANCE, bool12);
                        i3 = 524288;
                        i4 |= i3;
                        list23 = list15;
                        z11 = z9;
                        i5 = 22;
                    case 20:
                        dataRetention3 = (DataRetention) beginStructure.decodeNullableSerializableElement(descriptor2, 20, DataRetention$$serializer.INSTANCE, dataRetention3);
                        i4 |= 1048576;
                        list23 = list23;
                        z11 = z11;
                        list30 = list30;
                        i5 = 22;
                    case 21:
                        z9 = z11;
                        list15 = list23;
                        list30 = (List) beginStructure.decodeSerializableElement(descriptor2, 21, kSerializerArr[21], list30);
                        i4 |= 2097152;
                        list23 = list15;
                        z11 = z9;
                        i5 = 22;
                    case 22:
                        z5 = z11;
                        list23 = (List) beginStructure.decodeSerializableElement(descriptor2, i13, kSerializerArr[i13], list23);
                        i4 |= 4194304;
                        i5 = i13;
                        z11 = z5;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            boolean z16 = z11;
            List list33 = list29;
            List list34 = list24;
            Boolean bool13 = bool11;
            bool = bool9;
            d = d3;
            list = list25;
            list2 = list26;
            list3 = list31;
            list4 = list28;
            i = i4;
            i2 = i7;
            z = z12;
            list5 = list34;
            str = str6;
            str2 = str7;
            z2 = z13;
            dataRetention = dataRetention3;
            z3 = z14;
            z4 = z16;
            list6 = list30;
            bool2 = bool13;
            str3 = str5;
            bool3 = bool12;
            list7 = list23;
            list8 = list27;
            list9 = list33;
            bool4 = bool10;
        }
        beginStructure.endStructure(descriptor2);
        return new TCFVendor(i, bool2, list9, list5, i2, bool4, list8, str, str2, list4, list3, list2, list, z, z2, d, z3, str3, z4, bool, bool3, dataRetention, list6, list7, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, TCFVendor value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        TCFVendor.write$Self$usercentrics_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
