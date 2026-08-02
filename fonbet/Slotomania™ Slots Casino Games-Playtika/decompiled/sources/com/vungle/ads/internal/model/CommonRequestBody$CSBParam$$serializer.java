package com.vungle.ads.internal.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.vungle.ads.internal.model.CommonRequestBody;
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

/* compiled from: CommonRequestBody.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.CSBParam.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/model/CommonRequestBody$CSBParam;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes2.dex */
public final class CommonRequestBody$CSBParam$$serializer implements GeneratedSerializer<CommonRequestBody.CSBParam> {
    public static final CommonRequestBody$CSBParam$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CommonRequestBody$CSBParam$$serializer commonRequestBody$CSBParam$$serializer = new CommonRequestBody$CSBParam$$serializer();
        INSTANCE = commonRequestBody$CSBParam$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.CSBParam", commonRequestBody$CSBParam$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("bidfloor", false);
        pluginGeneratedSerialDescriptor.addElement(TypedValues.CycleType.S_WAVE_PHASE, false);
        pluginGeneratedSerialDescriptor.addElement("is_vx_winner", false);
        pluginGeneratedSerialDescriptor.addElement("parent_auction_id", false);
        pluginGeneratedSerialDescriptor.addElement("creative_id", false);
        pluginGeneratedSerialDescriptor.addElement("ad_unit_id", false);
        pluginGeneratedSerialDescriptor.addElement("ext", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CommonRequestBody$CSBParam$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{DoubleSerializer.INSTANCE, IntSerializer.INSTANCE, BooleanSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public CommonRequestBody.CSBParam deserialize(Decoder decoder) {
        int i;
        int i2;
        String str;
        Object obj;
        boolean z;
        String str2;
        String str3;
        double d;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            double decodeDoubleElement = beginStructure.decodeDoubleElement(descriptor2, 0);
            i = beginStructure.decodeIntElement(descriptor2, 1);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 2);
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 3);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 4);
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 5);
            obj = beginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, null);
            str = decodeStringElement3;
            str2 = decodeStringElement;
            str3 = decodeStringElement2;
            z = decodeBooleanElement;
            d = decodeDoubleElement;
            i2 = 127;
        } else {
            boolean z2 = true;
            i = 0;
            String str4 = null;
            String str5 = null;
            Object obj2 = null;
            double d2 = 0.0d;
            boolean z3 = false;
            i2 = 0;
            String str6 = null;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        d2 = beginStructure.decodeDoubleElement(descriptor2, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        i = beginStructure.decodeIntElement(descriptor2, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        z3 = beginStructure.decodeBooleanElement(descriptor2, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        str6 = beginStructure.decodeStringElement(descriptor2, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        str4 = beginStructure.decodeStringElement(descriptor2, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        str5 = beginStructure.decodeStringElement(descriptor2, 5);
                        i2 |= 32;
                        break;
                    case 6:
                        obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, obj2);
                        i2 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            str = str5;
            obj = obj2;
            z = z3;
            double d3 = d2;
            str2 = str6;
            str3 = str4;
            d = d3;
        }
        beginStructure.endStructure(descriptor2);
        return new CommonRequestBody.CSBParam(i2, d, i, z, str2, str3, str, (String) obj, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, CommonRequestBody.CSBParam value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        CommonRequestBody.CSBParam.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
