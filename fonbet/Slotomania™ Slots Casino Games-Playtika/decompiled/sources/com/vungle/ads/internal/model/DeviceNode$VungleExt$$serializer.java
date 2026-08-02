package com.vungle.ads.internal.model;

import com.ironsource.M6;
import com.vungle.ads.internal.model.DeviceNode;
import io.sentry.protocol.Device;
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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: DeviceNode.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/vungle/ads/internal/model/DeviceNode.VungleExt.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes2.dex */
public final class DeviceNode$VungleExt$$serializer implements GeneratedSerializer<DeviceNode.VungleExt> {
    public static final DeviceNode$VungleExt$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DeviceNode$VungleExt$$serializer deviceNode$VungleExt$$serializer = new DeviceNode$VungleExt$$serializer();
        INSTANCE = deviceNode$VungleExt$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.DeviceNode.VungleExt", deviceNode$VungleExt$$serializer, 23);
        pluginGeneratedSerialDescriptor.addElement("is_google_play_services_available", true);
        pluginGeneratedSerialDescriptor.addElement("app_set_id", true);
        pluginGeneratedSerialDescriptor.addElement("app_set_id_scope", true);
        pluginGeneratedSerialDescriptor.addElement(Device.JsonKeys.BATTERY_LEVEL, true);
        pluginGeneratedSerialDescriptor.addElement("battery_state", true);
        pluginGeneratedSerialDescriptor.addElement("battery_saver_enabled", true);
        pluginGeneratedSerialDescriptor.addElement(Device.JsonKeys.CONNECTION_TYPE, true);
        pluginGeneratedSerialDescriptor.addElement("connection_type_detail", true);
        pluginGeneratedSerialDescriptor.addElement(Device.JsonKeys.LOCALE, true);
        pluginGeneratedSerialDescriptor.addElement(Device.JsonKeys.LANGUAGE, true);
        pluginGeneratedSerialDescriptor.addElement("time_zone", true);
        pluginGeneratedSerialDescriptor.addElement("volume_level", true);
        pluginGeneratedSerialDescriptor.addElement("sound_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("is_tv", true);
        pluginGeneratedSerialDescriptor.addElement("sd_card_available", true);
        pluginGeneratedSerialDescriptor.addElement("is_sideload_enabled", true);
        pluginGeneratedSerialDescriptor.addElement(M6.X0, true);
        pluginGeneratedSerialDescriptor.addElement("amazon_advertising_id", true);
        pluginGeneratedSerialDescriptor.addElement("sit", true);
        pluginGeneratedSerialDescriptor.addElement("oit", true);
        pluginGeneratedSerialDescriptor.addElement("ort", true);
        pluginGeneratedSerialDescriptor.addElement("obt", true);
        pluginGeneratedSerialDescriptor.addElement("gp_version", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DeviceNode$VungleExt$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), FloatSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), FloatSerializer.INSTANCE, IntSerializer.INSTANCE, BooleanSerializer.INSTANCE, IntSerializer.INSTANCE, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public DeviceNode.VungleExt deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        int i;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        boolean z;
        float f;
        int i2;
        boolean z2;
        int i3;
        float f2;
        int i4;
        Object obj13;
        Object obj14;
        Object obj15;
        boolean z3;
        Object obj16;
        Object obj17;
        int i5;
        int i6;
        Object obj18;
        Object obj19;
        Object obj20;
        Object obj21;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 0);
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, null);
            obj15 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, null);
            float decodeFloatElement = beginStructure.decodeFloatElement(descriptor2, 3);
            obj5 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, null);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 5);
            Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, null);
            Object decodeNullableSerializableElement2 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, null);
            obj12 = beginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, null);
            Object decodeNullableSerializableElement3 = beginStructure.decodeNullableSerializableElement(descriptor2, 9, StringSerializer.INSTANCE, null);
            obj10 = beginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, null);
            float decodeFloatElement2 = beginStructure.decodeFloatElement(descriptor2, 11);
            int decodeIntElement2 = beginStructure.decodeIntElement(descriptor2, 12);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(descriptor2, 13);
            int decodeIntElement3 = beginStructure.decodeIntElement(descriptor2, 14);
            boolean decodeBooleanElement3 = beginStructure.decodeBooleanElement(descriptor2, 15);
            Object decodeNullableSerializableElement4 = beginStructure.decodeNullableSerializableElement(descriptor2, 16, StringSerializer.INSTANCE, null);
            obj9 = beginStructure.decodeNullableSerializableElement(descriptor2, 17, StringSerializer.INSTANCE, null);
            obj8 = beginStructure.decodeNullableSerializableElement(descriptor2, 18, LongSerializer.INSTANCE, null);
            Object decodeNullableSerializableElement5 = beginStructure.decodeNullableSerializableElement(descriptor2, 19, LongSerializer.INSTANCE, null);
            Object decodeNullableSerializableElement6 = beginStructure.decodeNullableSerializableElement(descriptor2, 20, LongSerializer.INSTANCE, null);
            obj14 = beginStructure.decodeNullableSerializableElement(descriptor2, 21, LongSerializer.INSTANCE, null);
            i = 8388607;
            obj3 = decodeNullableSerializableElement2;
            obj = decodeNullableSerializableElement6;
            obj6 = beginStructure.decodeNullableSerializableElement(descriptor2, 22, StringSerializer.INSTANCE, null);
            obj11 = decodeNullableSerializableElement3;
            f = decodeFloatElement;
            z = decodeBooleanElement3;
            obj7 = decodeNullableSerializableElement4;
            z2 = decodeBooleanElement2;
            i3 = decodeIntElement3;
            z3 = decodeBooleanElement;
            f2 = decodeFloatElement2;
            i4 = decodeIntElement2;
            obj2 = decodeNullableSerializableElement5;
            obj13 = decodeNullableSerializableElement;
            i2 = decodeIntElement;
        } else {
            int i7 = 0;
            obj = null;
            boolean z4 = false;
            int i8 = 0;
            boolean z5 = false;
            boolean z6 = false;
            int i9 = 0;
            int i10 = 0;
            boolean z7 = true;
            Object obj22 = null;
            Object obj23 = null;
            Object obj24 = null;
            Object obj25 = null;
            Object obj26 = null;
            obj2 = null;
            Object obj27 = null;
            Object obj28 = null;
            Object obj29 = null;
            Object obj30 = null;
            Object obj31 = null;
            Object obj32 = null;
            Object obj33 = null;
            float f3 = 0.0f;
            float f4 = 0.0f;
            Object obj34 = null;
            while (z7) {
                Object obj35 = obj25;
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        obj18 = obj23;
                        obj19 = obj26;
                        obj20 = obj32;
                        z7 = false;
                        obj25 = obj35;
                        i7 = i7;
                        obj26 = obj19;
                        obj32 = obj20;
                        obj23 = obj18;
                    case 0:
                        obj18 = obj23;
                        obj19 = obj26;
                        obj20 = obj32;
                        z6 = beginStructure.decodeBooleanElement(descriptor2, 0);
                        obj22 = obj22;
                        obj25 = obj35;
                        i7 |= 1;
                        obj26 = obj19;
                        obj32 = obj20;
                        obj23 = obj18;
                    case 1:
                        obj18 = obj23;
                        obj22 = obj22;
                        obj25 = obj35;
                        obj33 = obj33;
                        obj26 = obj26;
                        obj32 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, obj32);
                        i7 |= 2;
                        obj23 = obj18;
                    case 2:
                        obj21 = obj26;
                        obj33 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, obj33);
                        i7 |= 4;
                        obj22 = obj22;
                        obj25 = obj35;
                        obj23 = obj23;
                        obj26 = obj21;
                    case 3:
                        obj21 = obj26;
                        f3 = beginStructure.decodeFloatElement(descriptor2, 3);
                        obj22 = obj22;
                        obj25 = obj35;
                        i7 |= 8;
                        obj26 = obj21;
                    case 4:
                        obj21 = obj26;
                        obj25 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, obj35);
                        obj22 = obj22;
                        i7 |= 16;
                        obj26 = obj21;
                    case 5:
                        i8 = beginStructure.decodeIntElement(descriptor2, 5);
                        i7 |= 32;
                        obj26 = obj26;
                        obj22 = obj22;
                        obj25 = obj35;
                    case 6:
                        obj22 = beginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, obj22);
                        i7 |= 64;
                        obj26 = obj26;
                        obj25 = obj35;
                    case 7:
                        obj16 = obj22;
                        obj17 = obj26;
                        obj23 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, obj23);
                        i7 |= 128;
                        obj26 = obj17;
                        obj25 = obj35;
                        obj22 = obj16;
                    case 8:
                        obj16 = obj22;
                        obj17 = obj26;
                        obj31 = beginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, obj31);
                        i7 |= 256;
                        obj26 = obj17;
                        obj25 = obj35;
                        obj22 = obj16;
                    case 9:
                        obj16 = obj22;
                        obj17 = obj26;
                        obj30 = beginStructure.decodeNullableSerializableElement(descriptor2, 9, StringSerializer.INSTANCE, obj30);
                        i7 |= 512;
                        obj26 = obj17;
                        obj25 = obj35;
                        obj22 = obj16;
                    case 10:
                        obj16 = obj22;
                        obj17 = obj26;
                        obj29 = beginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, obj29);
                        i7 |= 1024;
                        obj26 = obj17;
                        obj25 = obj35;
                        obj22 = obj16;
                    case 11:
                        obj16 = obj22;
                        obj17 = obj26;
                        f4 = beginStructure.decodeFloatElement(descriptor2, 11);
                        i7 |= 2048;
                        obj26 = obj17;
                        obj25 = obj35;
                        obj22 = obj16;
                    case 12:
                        obj16 = obj22;
                        obj17 = obj26;
                        i10 = beginStructure.decodeIntElement(descriptor2, 12);
                        i7 |= 4096;
                        obj26 = obj17;
                        obj25 = obj35;
                        obj22 = obj16;
                    case 13:
                        obj16 = obj22;
                        obj17 = obj26;
                        z5 = beginStructure.decodeBooleanElement(descriptor2, 13);
                        i7 |= 8192;
                        obj26 = obj17;
                        obj25 = obj35;
                        obj22 = obj16;
                    case 14:
                        obj16 = obj22;
                        obj17 = obj26;
                        i9 = beginStructure.decodeIntElement(descriptor2, 14);
                        i7 |= 16384;
                        obj26 = obj17;
                        obj25 = obj35;
                        obj22 = obj16;
                    case 15:
                        obj16 = obj22;
                        obj17 = obj26;
                        z4 = beginStructure.decodeBooleanElement(descriptor2, 15);
                        i7 |= 32768;
                        obj26 = obj17;
                        obj25 = obj35;
                        obj22 = obj16;
                    case 16:
                        obj16 = obj22;
                        obj17 = obj26;
                        obj24 = beginStructure.decodeNullableSerializableElement(descriptor2, 16, StringSerializer.INSTANCE, obj24);
                        i5 = 65536;
                        i7 |= i5;
                        obj26 = obj17;
                        obj25 = obj35;
                        obj22 = obj16;
                    case 17:
                        obj16 = obj22;
                        obj17 = obj26;
                        obj28 = beginStructure.decodeNullableSerializableElement(descriptor2, 17, StringSerializer.INSTANCE, obj28);
                        i5 = 131072;
                        i7 |= i5;
                        obj26 = obj17;
                        obj25 = obj35;
                        obj22 = obj16;
                    case 18:
                        obj16 = obj22;
                        obj17 = obj26;
                        obj27 = beginStructure.decodeNullableSerializableElement(descriptor2, 18, LongSerializer.INSTANCE, obj27);
                        i5 = 262144;
                        i7 |= i5;
                        obj26 = obj17;
                        obj25 = obj35;
                        obj22 = obj16;
                    case 19:
                        obj16 = obj22;
                        obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 19, LongSerializer.INSTANCE, obj2);
                        i6 = 524288;
                        i7 |= i6;
                        obj25 = obj35;
                        obj22 = obj16;
                    case 20:
                        obj16 = obj22;
                        obj = beginStructure.decodeNullableSerializableElement(descriptor2, 20, LongSerializer.INSTANCE, obj);
                        i6 = 1048576;
                        i7 |= i6;
                        obj25 = obj35;
                        obj22 = obj16;
                    case 21:
                        obj16 = obj22;
                        obj34 = beginStructure.decodeNullableSerializableElement(descriptor2, 21, LongSerializer.INSTANCE, obj34);
                        i6 = 2097152;
                        i7 |= i6;
                        obj25 = obj35;
                        obj22 = obj16;
                    case 22:
                        obj16 = obj22;
                        obj26 = beginStructure.decodeNullableSerializableElement(descriptor2, 22, StringSerializer.INSTANCE, obj26);
                        i6 = 4194304;
                        i7 |= i6;
                        obj25 = obj35;
                        obj22 = obj16;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i = i7;
            obj3 = obj23;
            Object obj36 = obj26;
            Object obj37 = obj25;
            Object obj38 = obj22;
            obj4 = obj32;
            obj5 = obj37;
            obj6 = obj36;
            obj7 = obj24;
            obj8 = obj27;
            obj9 = obj28;
            obj10 = obj29;
            obj11 = obj30;
            obj12 = obj31;
            z = z4;
            f = f3;
            i2 = i8;
            z2 = z5;
            i3 = i9;
            f2 = f4;
            i4 = i10;
            obj13 = obj38;
            obj14 = obj34;
            obj15 = obj33;
            z3 = z6;
        }
        beginStructure.endStructure(descriptor2);
        return new DeviceNode.VungleExt(i, z3, (String) obj4, (Integer) obj15, f, (String) obj5, i2, (String) obj13, (String) obj3, (String) obj12, (String) obj11, (String) obj10, f2, i4, z2, i3, z, (String) obj7, (String) obj9, (Long) obj8, (Long) obj2, (Long) obj, (Long) obj14, (String) obj6, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, DeviceNode.VungleExt value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        DeviceNode.VungleExt.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
