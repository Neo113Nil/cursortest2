package com.vungle.ads.internal.model;

import com.safedk.android.analytics.brandsafety.m;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.ContextualSerializer;
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
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: AdPayload.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/vungle/ads/internal/model/AdPayload.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/model/AdPayload;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes3.dex */
public final class AdPayload$$serializer implements GeneratedSerializer<AdPayload> {
    public static final AdPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AdPayload$$serializer adPayload$$serializer = new AdPayload$$serializer();
        INSTANCE = adPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload", adPayload$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement(m.S, true);
        pluginGeneratedSerialDescriptor.addElement("config", true);
        pluginGeneratedSerialDescriptor.addElement("expiryWindowStart", true);
        pluginGeneratedSerialDescriptor.addElement("mraidFiles", true);
        pluginGeneratedSerialDescriptor.addElement("incentivizedTextSettings", true);
        pluginGeneratedSerialDescriptor.addElement("assetsFullyDownloaded", true);
        pluginGeneratedSerialDescriptor.addElement("indexFilePath", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AdPayload$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(new ArrayListSerializer(AdPayload$PlacementAdUnit$$serializer.INSTANCE)), BuiltinSerializersKt.getNullable(ConfigPayload$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), new ContextualSerializer(Reflection.getOrCreateKotlinClass(ConcurrentHashMap.class), null, new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE}), new LinkedHashMapSerializer(StringSerializer.INSTANCE, StringSerializer.INSTANCE), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public AdPayload deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        boolean z;
        Object obj4;
        Object obj5;
        int i;
        Object obj6;
        char c;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i2 = 6;
        int i3 = 5;
        if (beginStructure.decodeSequentially()) {
            obj = beginStructure.decodeNullableSerializableElement(descriptor2, 0, new ArrayListSerializer(AdPayload$PlacementAdUnit$$serializer.INSTANCE), null);
            Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor2, 1, ConfigPayload$$serializer.INSTANCE, null);
            obj6 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, LongSerializer.INSTANCE, null);
            obj4 = beginStructure.decodeSerializableElement(descriptor2, 3, new ContextualSerializer(Reflection.getOrCreateKotlinClass(ConcurrentHashMap.class), null, new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE}), null);
            obj5 = beginStructure.decodeSerializableElement(descriptor2, 4, new LinkedHashMapSerializer(StringSerializer.INSTANCE, StringSerializer.INSTANCE), null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 5);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, null);
            i = 127;
            obj2 = decodeNullableSerializableElement;
            z = decodeBooleanElement;
        } else {
            int i4 = 1;
            boolean z2 = true;
            boolean z3 = false;
            int i5 = 0;
            obj = null;
            Object obj7 = null;
            obj2 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 5;
                    case 0:
                        obj = beginStructure.decodeNullableSerializableElement(descriptor2, 0, new ArrayListSerializer(AdPayload$PlacementAdUnit$$serializer.INSTANCE), obj);
                        i5 |= 1;
                        i4 = i4;
                        i2 = 6;
                        i3 = 5;
                    case 1:
                        obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, i4, ConfigPayload$$serializer.INSTANCE, obj2);
                        i5 |= 2;
                        i2 = 6;
                        i3 = 5;
                    case 2:
                        c = 3;
                        obj7 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, LongSerializer.INSTANCE, obj7);
                        i5 |= 4;
                        i2 = 6;
                        i3 = 5;
                    case 3:
                        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConcurrentHashMap.class);
                        KSerializer[] kSerializerArr = new KSerializer[2];
                        kSerializerArr[0] = StringSerializer.INSTANCE;
                        kSerializerArr[i4] = StringSerializer.INSTANCE;
                        ContextualSerializer contextualSerializer = new ContextualSerializer(orCreateKotlinClass, null, kSerializerArr);
                        c = 3;
                        obj9 = beginStructure.decodeSerializableElement(descriptor2, 3, contextualSerializer, obj9);
                        i5 |= 8;
                        i2 = 6;
                        i3 = 5;
                    case 4:
                        obj10 = beginStructure.decodeSerializableElement(descriptor2, 4, new LinkedHashMapSerializer(StringSerializer.INSTANCE, StringSerializer.INSTANCE), obj10);
                        i5 |= 16;
                        i2 = 6;
                        i3 = 5;
                    case 5:
                        z3 = beginStructure.decodeBooleanElement(descriptor2, i3);
                        i5 |= 32;
                    case 6:
                        obj8 = beginStructure.decodeNullableSerializableElement(descriptor2, i2, StringSerializer.INSTANCE, obj8);
                        i5 |= 64;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            obj3 = obj8;
            z = z3;
            obj4 = obj9;
            obj5 = obj10;
            i = i5;
            obj6 = obj7;
        }
        beginStructure.endStructure(descriptor2);
        return new AdPayload(i, (List) obj, (ConfigPayload) obj2, (Long) obj6, (ConcurrentHashMap) obj4, (Map) obj5, z, (String) obj3, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, AdPayload value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        AdPayload.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
