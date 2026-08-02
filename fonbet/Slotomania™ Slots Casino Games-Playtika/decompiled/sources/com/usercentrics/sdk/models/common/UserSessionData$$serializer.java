package com.usercentrics.sdk.models.common;

import io.sentry.protocol.Device;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: UserSessionData.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/usercentrics/sdk/models/common/UserSessionData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/usercentrics/sdk/models/common/UserSessionData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes4.dex */
public final class UserSessionData$$serializer implements GeneratedSerializer<UserSessionData> {
    public static final UserSessionData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UserSessionData$$serializer userSessionData$$serializer = new UserSessionData$$serializer();
        INSTANCE = userSessionData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.models.common.UserSessionData", userSessionData$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("consents", false);
        pluginGeneratedSerialDescriptor.addElement("controllerId", false);
        pluginGeneratedSerialDescriptor.addElement(Device.JsonKeys.LANGUAGE, false);
        pluginGeneratedSerialDescriptor.addElement("tcf", false);
        pluginGeneratedSerialDescriptor.addElement("ccpa", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UserSessionData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = UserSessionData.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], StringSerializer.INSTANCE, StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(UserSessionDataTCF$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(UserSessionDataCCPA$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public UserSessionData deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        List list;
        String str;
        String str2;
        UserSessionDataTCF userSessionDataTCF;
        UserSessionDataCCPA userSessionDataCCPA;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = UserSessionData.$childSerializers;
        int i2 = 0;
        List list2 = null;
        if (beginStructure.decodeSequentially()) {
            List list3 = (List) beginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], null);
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 1);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 2);
            list = list3;
            str = decodeStringElement;
            userSessionDataTCF = (UserSessionDataTCF) beginStructure.decodeNullableSerializableElement(descriptor2, 3, UserSessionDataTCF$$serializer.INSTANCE, null);
            userSessionDataCCPA = (UserSessionDataCCPA) beginStructure.decodeNullableSerializableElement(descriptor2, 4, UserSessionDataCCPA$$serializer.INSTANCE, null);
            str2 = decodeStringElement2;
            i = 31;
        } else {
            int i3 = 1;
            int i4 = 0;
            String str3 = null;
            String str4 = null;
            UserSessionDataTCF userSessionDataTCF2 = null;
            UserSessionDataCCPA userSessionDataCCPA2 = null;
            while (i3 != 0) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                int i5 = i2;
                if (decodeElementIndex == -1) {
                    i2 = i5;
                    i3 = i2;
                } else if (decodeElementIndex != 0) {
                    if (decodeElementIndex == 1) {
                        str3 = beginStructure.decodeStringElement(descriptor2, 1);
                        i4 |= 2;
                    } else if (decodeElementIndex == 2) {
                        str4 = beginStructure.decodeStringElement(descriptor2, 2);
                        i4 |= 4;
                    } else if (decodeElementIndex == 3) {
                        userSessionDataTCF2 = (UserSessionDataTCF) beginStructure.decodeNullableSerializableElement(descriptor2, 3, UserSessionDataTCF$$serializer.INSTANCE, userSessionDataTCF2);
                        i4 |= 8;
                    } else {
                        if (decodeElementIndex != 4) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        userSessionDataCCPA2 = (UserSessionDataCCPA) beginStructure.decodeNullableSerializableElement(descriptor2, 4, UserSessionDataCCPA$$serializer.INSTANCE, userSessionDataCCPA2);
                        i4 |= 16;
                    }
                    i2 = i5;
                } else {
                    list2 = (List) beginStructure.decodeSerializableElement(descriptor2, i5, kSerializerArr[i5], list2);
                    i4 |= 1;
                    i2 = i5;
                }
            }
            i = i4;
            list = list2;
            str = str3;
            str2 = str4;
            userSessionDataTCF = userSessionDataTCF2;
            userSessionDataCCPA = userSessionDataCCPA2;
        }
        beginStructure.endStructure(descriptor2);
        return new UserSessionData(i, list, str, str2, userSessionDataTCF, userSessionDataCCPA, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, UserSessionData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        UserSessionData.write$Self$usercentrics_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
