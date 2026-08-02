package com.vungle.ads.internal.signals;

import com.vungle.ads.internal.model.UnclosedAd$$serializer;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SessionData.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/vungle/ads/internal/signals/SessionData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/signals/SessionData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes4.dex */
public final class SessionData$$serializer implements GeneratedSerializer<SessionData> {
    public static final SessionData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SessionData$$serializer sessionData$$serializer = new SessionData$$serializer();
        INSTANCE = sessionData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.signals.SessionData", sessionData$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("103", false);
        pluginGeneratedSerialDescriptor.addElement("101", true);
        pluginGeneratedSerialDescriptor.addElement("100", true);
        pluginGeneratedSerialDescriptor.addElement("106", true);
        pluginGeneratedSerialDescriptor.addElement("102", true);
        pluginGeneratedSerialDescriptor.addElement("104", true);
        pluginGeneratedSerialDescriptor.addElement("105", true);
        pluginGeneratedSerialDescriptor.addElement("112", true);
        pluginGeneratedSerialDescriptor.addElement("113", true);
        pluginGeneratedSerialDescriptor.addElement("114", true);
        pluginGeneratedSerialDescriptor.addElement("115", true);
        pluginGeneratedSerialDescriptor.addElement("116", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SessionData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{IntSerializer.INSTANCE, StringSerializer.INSTANCE, LongSerializer.INSTANCE, new ArrayListSerializer(SignaledAd$$serializer.INSTANCE), LongSerializer.INSTANCE, IntSerializer.INSTANCE, new ArrayListSerializer(UnclosedAd$$serializer.INSTANCE), IntSerializer.INSTANCE, IntSerializer.INSTANCE, IntSerializer.INSTANCE, IntSerializer.INSTANCE, IntSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public SessionData deserialize(Decoder decoder) {
        int i;
        int i2;
        Object obj;
        Object obj2;
        int i3;
        int i4;
        int i5;
        String str;
        long j;
        int i6;
        int i7;
        int i8;
        long j2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i9 = 0;
        if (beginStructure.decodeSequentially()) {
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 0);
            str = beginStructure.decodeStringElement(descriptor2, 1);
            long decodeLongElement = beginStructure.decodeLongElement(descriptor2, 2);
            obj2 = beginStructure.decodeSerializableElement(descriptor2, 3, new ArrayListSerializer(SignaledAd$$serializer.INSTANCE), null);
            long decodeLongElement2 = beginStructure.decodeLongElement(descriptor2, 4);
            int decodeIntElement2 = beginStructure.decodeIntElement(descriptor2, 5);
            obj = beginStructure.decodeSerializableElement(descriptor2, 6, new ArrayListSerializer(UnclosedAd$$serializer.INSTANCE), null);
            int decodeIntElement3 = beginStructure.decodeIntElement(descriptor2, 7);
            int decodeIntElement4 = beginStructure.decodeIntElement(descriptor2, 8);
            int decodeIntElement5 = beginStructure.decodeIntElement(descriptor2, 9);
            i3 = 4095;
            j = decodeLongElement;
            j2 = decodeLongElement2;
            i2 = decodeIntElement;
            i4 = beginStructure.decodeIntElement(descriptor2, 10);
            i6 = decodeIntElement5;
            i7 = decodeIntElement3;
            i8 = decodeIntElement4;
            i = decodeIntElement2;
            i5 = beginStructure.decodeIntElement(descriptor2, 11);
        } else {
            int i10 = 11;
            boolean z = true;
            int i11 = 0;
            int i12 = 0;
            i = 0;
            int i13 = 0;
            Object obj3 = null;
            Object obj4 = null;
            String str2 = null;
            long j3 = 0;
            long j4 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i10 = 11;
                    case 0:
                        i9 |= 1;
                        i11 = beginStructure.decodeIntElement(descriptor2, 0);
                        i10 = 11;
                    case 1:
                        str2 = beginStructure.decodeStringElement(descriptor2, 1);
                        i9 |= 2;
                        i10 = 11;
                    case 2:
                        j4 = beginStructure.decodeLongElement(descriptor2, 2);
                        i9 |= 4;
                        i10 = 11;
                    case 3:
                        obj4 = beginStructure.decodeSerializableElement(descriptor2, 3, new ArrayListSerializer(SignaledAd$$serializer.INSTANCE), obj4);
                        i9 |= 8;
                        i10 = 11;
                    case 4:
                        j3 = beginStructure.decodeLongElement(descriptor2, 4);
                        i9 |= 16;
                        i10 = 11;
                    case 5:
                        i = beginStructure.decodeIntElement(descriptor2, 5);
                        i9 |= 32;
                        i10 = 11;
                    case 6:
                        obj3 = beginStructure.decodeSerializableElement(descriptor2, 6, new ArrayListSerializer(UnclosedAd$$serializer.INSTANCE), obj3);
                        i9 |= 64;
                        i10 = 11;
                    case 7:
                        i16 = beginStructure.decodeIntElement(descriptor2, 7);
                        i9 |= 128;
                    case 8:
                        i12 = beginStructure.decodeIntElement(descriptor2, 8);
                        i9 |= 256;
                    case 9:
                        i15 = beginStructure.decodeIntElement(descriptor2, 9);
                        i9 |= 512;
                    case 10:
                        i14 = beginStructure.decodeIntElement(descriptor2, 10);
                        i9 |= 1024;
                    case 11:
                        i13 = beginStructure.decodeIntElement(descriptor2, i10);
                        i9 |= 2048;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            Object obj5 = obj3;
            i2 = i11;
            obj = obj5;
            obj2 = obj4;
            i3 = i9;
            i4 = i14;
            i5 = i13;
            str = str2;
            j = j4;
            i6 = i15;
            long j5 = j3;
            i7 = i16;
            i8 = i12;
            j2 = j5;
        }
        beginStructure.endStructure(descriptor2);
        return new SessionData(i3, i2, str, j, (List) obj2, j2, i, (List) obj, i7, i8, i6, i4, i5, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, SessionData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        SessionData.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
