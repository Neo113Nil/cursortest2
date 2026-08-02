package com.vungle.ads.internal.model;

import com.ironsource.C2601pd;
import com.vungle.ads.internal.model.ConfigPayload;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: ConfigPayload.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/vungle/ads/internal/model/ConfigPayload.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes2.dex */
public final class ConfigPayload$$serializer implements GeneratedSerializer<ConfigPayload> {
    public static final ConfigPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ConfigPayload$$serializer configPayload$$serializer = new ConfigPayload$$serializer();
        INSTANCE = configPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload", configPayload$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("reuse_assets", true);
        pluginGeneratedSerialDescriptor.addElement("config", true);
        pluginGeneratedSerialDescriptor.addElement("endpoints", true);
        pluginGeneratedSerialDescriptor.addElement("log_metrics", true);
        pluginGeneratedSerialDescriptor.addElement(C2601pd.c, true);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement(Cookie.CONFIG_EXTENSION, true);
        pluginGeneratedSerialDescriptor.addElement(Cookie.COPPA_DISABLE_AD_ID, true);
        pluginGeneratedSerialDescriptor.addElement("ri_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("session_timeout", true);
        pluginGeneratedSerialDescriptor.addElement("wait_for_connectivity_for_tpat", true);
        pluginGeneratedSerialDescriptor.addElement("sdk_session_timeout", true);
        pluginGeneratedSerialDescriptor.addElement("signals_disabled", true);
        pluginGeneratedSerialDescriptor.addElement("fpd_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("rta_debugging", true);
        pluginGeneratedSerialDescriptor.addElement("config_last_validated_ts", true);
        pluginGeneratedSerialDescriptor.addElement("auto_redirect", true);
        pluginGeneratedSerialDescriptor.addElement("enable_ot", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ConfigPayload$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(ConfigPayload$CleverCache$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ConfigPayload$ConfigSettings$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ConfigPayload$Endpoints$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ConfigPayload$LogMetricsSettings$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(new ArrayListSerializer(Placement$$serializer.INSTANCE)), BuiltinSerializersKt.getNullable(ConfigPayload$UserPrivacy$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(ConfigPayload$AutoRedirect$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ConfigPayload deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        Object obj21;
        Object obj22;
        Object obj23;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor2, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, null);
            obj9 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, null);
            obj8 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, null);
            Object decodeNullableSerializableElement2 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, null);
            obj10 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, new ArrayListSerializer(Placement$$serializer.INSTANCE), null);
            Object decodeNullableSerializableElement3 = beginStructure.decodeNullableSerializableElement(descriptor2, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, null);
            Object decodeNullableSerializableElement4 = beginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, null);
            Object decodeNullableSerializableElement5 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, BooleanSerializer.INSTANCE, null);
            Object decodeNullableSerializableElement6 = beginStructure.decodeNullableSerializableElement(descriptor2, 8, BooleanSerializer.INSTANCE, null);
            obj18 = beginStructure.decodeNullableSerializableElement(descriptor2, 9, IntSerializer.INSTANCE, null);
            obj17 = beginStructure.decodeNullableSerializableElement(descriptor2, 10, BooleanSerializer.INSTANCE, null);
            obj16 = beginStructure.decodeNullableSerializableElement(descriptor2, 11, IntSerializer.INSTANCE, null);
            obj15 = beginStructure.decodeNullableSerializableElement(descriptor2, 12, BooleanSerializer.INSTANCE, null);
            obj14 = beginStructure.decodeNullableSerializableElement(descriptor2, 13, BooleanSerializer.INSTANCE, null);
            obj13 = beginStructure.decodeNullableSerializableElement(descriptor2, 14, BooleanSerializer.INSTANCE, null);
            obj12 = beginStructure.decodeNullableSerializableElement(descriptor2, 15, LongSerializer.INSTANCE, null);
            Object decodeNullableSerializableElement7 = beginStructure.decodeNullableSerializableElement(descriptor2, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, null);
            i = 262143;
            obj5 = beginStructure.decodeNullableSerializableElement(descriptor2, 17, BooleanSerializer.INSTANCE, null);
            obj7 = decodeNullableSerializableElement2;
            obj4 = decodeNullableSerializableElement3;
            obj3 = decodeNullableSerializableElement4;
            obj2 = decodeNullableSerializableElement5;
            obj = decodeNullableSerializableElement6;
            obj11 = decodeNullableSerializableElement7;
            obj6 = decodeNullableSerializableElement;
        } else {
            boolean z = true;
            Object obj24 = null;
            Object obj25 = null;
            Object obj26 = null;
            Object obj27 = null;
            Object obj28 = null;
            Object obj29 = null;
            obj = null;
            obj2 = null;
            obj3 = null;
            Object obj30 = null;
            obj4 = null;
            Object obj31 = null;
            Object obj32 = null;
            Object obj33 = null;
            Object obj34 = null;
            Object obj35 = null;
            Object obj36 = null;
            i = 0;
            Object obj37 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        obj19 = obj24;
                        obj20 = obj27;
                        obj21 = obj37;
                        z = false;
                        obj37 = obj21;
                        obj27 = obj20;
                        obj24 = obj19;
                    case 0:
                        obj20 = obj27;
                        obj21 = obj37;
                        obj19 = obj24;
                        obj36 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, obj36);
                        i |= 1;
                        obj37 = obj21;
                        obj27 = obj20;
                        obj24 = obj19;
                    case 1:
                        i |= 2;
                        obj37 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, obj37);
                        obj27 = obj27;
                        obj31 = obj31;
                    case 2:
                        obj22 = obj37;
                        obj23 = obj27;
                        obj26 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, obj26);
                        i |= 4;
                        obj27 = obj23;
                        obj37 = obj22;
                    case 3:
                        obj22 = obj37;
                        obj23 = obj27;
                        obj25 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, obj25);
                        i |= 8;
                        obj27 = obj23;
                        obj37 = obj22;
                    case 4:
                        obj22 = obj37;
                        obj23 = obj27;
                        obj30 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, new ArrayListSerializer(Placement$$serializer.INSTANCE), obj30);
                        i |= 16;
                        obj27 = obj23;
                        obj37 = obj22;
                    case 5:
                        obj22 = obj37;
                        obj23 = obj27;
                        obj4 = beginStructure.decodeNullableSerializableElement(descriptor2, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, obj4);
                        i |= 32;
                        obj27 = obj23;
                        obj37 = obj22;
                    case 6:
                        obj22 = obj37;
                        obj23 = obj27;
                        obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, obj3);
                        i |= 64;
                        obj27 = obj23;
                        obj37 = obj22;
                    case 7:
                        obj22 = obj37;
                        obj23 = obj27;
                        obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, BooleanSerializer.INSTANCE, obj2);
                        i |= 128;
                        obj27 = obj23;
                        obj37 = obj22;
                    case 8:
                        obj22 = obj37;
                        obj23 = obj27;
                        obj = beginStructure.decodeNullableSerializableElement(descriptor2, 8, BooleanSerializer.INSTANCE, obj);
                        i |= 256;
                        obj27 = obj23;
                        obj37 = obj22;
                    case 9:
                        obj22 = obj37;
                        obj23 = obj27;
                        obj24 = beginStructure.decodeNullableSerializableElement(descriptor2, 9, IntSerializer.INSTANCE, obj24);
                        i |= 512;
                        obj27 = obj23;
                        obj37 = obj22;
                    case 10:
                        obj22 = obj37;
                        obj23 = obj27;
                        obj29 = beginStructure.decodeNullableSerializableElement(descriptor2, 10, BooleanSerializer.INSTANCE, obj29);
                        i |= 1024;
                        obj27 = obj23;
                        obj37 = obj22;
                    case 11:
                        obj22 = obj37;
                        obj23 = obj27;
                        obj28 = beginStructure.decodeNullableSerializableElement(descriptor2, 11, IntSerializer.INSTANCE, obj28);
                        i |= 2048;
                        obj27 = obj23;
                        obj37 = obj22;
                    case 12:
                        obj22 = obj37;
                        obj31 = beginStructure.decodeNullableSerializableElement(descriptor2, 12, BooleanSerializer.INSTANCE, obj31);
                        i |= 4096;
                        obj27 = obj27;
                        obj32 = obj32;
                        obj37 = obj22;
                    case 13:
                        obj22 = obj37;
                        obj32 = beginStructure.decodeNullableSerializableElement(descriptor2, 13, BooleanSerializer.INSTANCE, obj32);
                        i |= 8192;
                        obj27 = obj27;
                        obj33 = obj33;
                        obj37 = obj22;
                    case 14:
                        obj22 = obj37;
                        obj33 = beginStructure.decodeNullableSerializableElement(descriptor2, 14, BooleanSerializer.INSTANCE, obj33);
                        i |= 16384;
                        obj27 = obj27;
                        obj34 = obj34;
                        obj37 = obj22;
                    case 15:
                        obj22 = obj37;
                        obj34 = beginStructure.decodeNullableSerializableElement(descriptor2, 15, LongSerializer.INSTANCE, obj34);
                        i |= 32768;
                        obj27 = obj27;
                        obj35 = obj35;
                        obj37 = obj22;
                    case 16:
                        obj22 = obj37;
                        obj23 = obj27;
                        obj35 = beginStructure.decodeNullableSerializableElement(descriptor2, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, obj35);
                        i |= 65536;
                        obj27 = obj23;
                        obj37 = obj22;
                    case 17:
                        obj27 = beginStructure.decodeNullableSerializableElement(descriptor2, 17, BooleanSerializer.INSTANCE, obj27);
                        i |= 131072;
                        obj37 = obj37;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            Object obj38 = obj24;
            obj5 = obj27;
            Object obj39 = obj37;
            obj6 = obj36;
            obj7 = obj25;
            obj8 = obj26;
            obj9 = obj39;
            obj10 = obj30;
            obj11 = obj35;
            obj12 = obj34;
            obj13 = obj33;
            obj14 = obj32;
            obj15 = obj31;
            obj16 = obj28;
            obj17 = obj29;
            obj18 = obj38;
        }
        beginStructure.endStructure(descriptor2);
        return new ConfigPayload(i, (ConfigPayload.CleverCache) obj6, (ConfigPayload.ConfigSettings) obj9, (ConfigPayload.Endpoints) obj8, (ConfigPayload.LogMetricsSettings) obj7, (List) obj10, (ConfigPayload.UserPrivacy) obj4, (String) obj3, (Boolean) obj2, (Boolean) obj, (Integer) obj18, (Boolean) obj17, (Integer) obj16, (Boolean) obj15, (Boolean) obj14, (Boolean) obj13, (Long) obj12, (ConfigPayload.AutoRedirect) obj11, (Boolean) obj5, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, ConfigPayload value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        ConfigPayload.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
