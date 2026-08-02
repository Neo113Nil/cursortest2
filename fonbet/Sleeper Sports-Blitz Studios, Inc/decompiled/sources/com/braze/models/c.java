package com.braze.models;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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

/* loaded from: classes6.dex */
public final /* synthetic */ class c implements GeneratedSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final c f620a;
    private static final SerialDescriptor descriptor;

    static {
        c cVar = new c();
        f620a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.braze.models.BrazeGeofence", cVar, 12);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("latitude", false);
        pluginGeneratedSerialDescriptor.addElement("longitude", false);
        pluginGeneratedSerialDescriptor.addElement(BrazeGeofence.RADIUS_METERS, false);
        pluginGeneratedSerialDescriptor.addElement(BrazeGeofence.COOLDOWN_ENTER_SECONDS, false);
        pluginGeneratedSerialDescriptor.addElement(BrazeGeofence.COOLDOWN_EXIT_SECONDS, false);
        pluginGeneratedSerialDescriptor.addElement(BrazeGeofence.ANALYTICS_ENABLED_ENTER, false);
        pluginGeneratedSerialDescriptor.addElement(BrazeGeofence.ANALYTICS_ENABLED_EXIT, false);
        pluginGeneratedSerialDescriptor.addElement(BrazeGeofence.ENTER_EVENTS, false);
        pluginGeneratedSerialDescriptor.addElement(BrazeGeofence.EXIT_EVENTS, false);
        pluginGeneratedSerialDescriptor.addElement(BrazeGeofence.NOTIFICATION_RESPONSIVENESS_MS, false);
        pluginGeneratedSerialDescriptor.addElement("distanceFromGeofenceRefresh", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{StringSerializer.INSTANCE, doubleSerializer, doubleSerializer, intSerializer, intSerializer, intSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, intSerializer, doubleSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        int i;
        double d;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        double d2;
        double d3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        if (beginStructure.decodeSequentially()) {
            str = beginStructure.decodeStringElement(serialDescriptor, 0);
            double decodeDoubleElement = beginStructure.decodeDoubleElement(serialDescriptor, 1);
            double decodeDoubleElement2 = beginStructure.decodeDoubleElement(serialDescriptor, 2);
            int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 3);
            int decodeIntElement2 = beginStructure.decodeIntElement(serialDescriptor, 4);
            int decodeIntElement3 = beginStructure.decodeIntElement(serialDescriptor, 5);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 6);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(serialDescriptor, 7);
            boolean decodeBooleanElement3 = beginStructure.decodeBooleanElement(serialDescriptor, 8);
            boolean decodeBooleanElement4 = beginStructure.decodeBooleanElement(serialDescriptor, 9);
            i2 = beginStructure.decodeIntElement(serialDescriptor, 10);
            z = decodeBooleanElement4;
            z2 = decodeBooleanElement2;
            z4 = decodeBooleanElement;
            i5 = decodeIntElement3;
            i4 = decodeIntElement;
            z3 = decodeBooleanElement3;
            i = decodeIntElement2;
            d3 = decodeDoubleElement2;
            d = beginStructure.decodeDoubleElement(serialDescriptor, 11);
            i3 = 4095;
            d2 = decodeDoubleElement;
        } else {
            str = null;
            boolean z5 = true;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            int i6 = 0;
            int i7 = 0;
            boolean z9 = false;
            i = 0;
            double d4 = 0.0d;
            double d5 = 0.0d;
            double d6 = 0.0d;
            int i8 = 0;
            int i9 = 0;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z5 = false;
                        continue;
                    case 0:
                        str = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i8 |= 1;
                        continue;
                    case 1:
                        d4 = beginStructure.decodeDoubleElement(serialDescriptor, 1);
                        i8 |= 2;
                        break;
                    case 2:
                        d5 = beginStructure.decodeDoubleElement(serialDescriptor, 2);
                        i8 |= 4;
                        break;
                    case 3:
                        i7 = beginStructure.decodeIntElement(serialDescriptor, 3);
                        i8 |= 8;
                        break;
                    case 4:
                        i = beginStructure.decodeIntElement(serialDescriptor, 4);
                        i8 |= 16;
                        break;
                    case 5:
                        i6 = beginStructure.decodeIntElement(serialDescriptor, 5);
                        i8 |= 32;
                        break;
                    case 6:
                        z8 = beginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i8 |= 64;
                        break;
                    case 7:
                        z7 = beginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i8 |= 128;
                        break;
                    case 8:
                        z9 = beginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i8 |= 256;
                        break;
                    case 9:
                        z6 = beginStructure.decodeBooleanElement(serialDescriptor, 9);
                        i8 |= 512;
                        break;
                    case 10:
                        i9 = beginStructure.decodeIntElement(serialDescriptor, 10);
                        i8 |= 1024;
                        break;
                    case 11:
                        d6 = beginStructure.decodeDoubleElement(serialDescriptor, 11);
                        i8 |= 2048;
                        break;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            d = d6;
            i2 = i9;
            z = z6;
            i3 = i8;
            double d7 = d5;
            z2 = z7;
            z3 = z9;
            i4 = i7;
            double d8 = d4;
            z4 = z8;
            i5 = i6;
            d2 = d8;
            d3 = d7;
        }
        String str2 = str;
        beginStructure.endStructure(serialDescriptor);
        return new BrazeGeofence(i3, str2, d2, d3, i4, i, i5, z4, z2, z3, z, i2, d, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        BrazeGeofence value = (BrazeGeofence) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        BrazeGeofence.write$Self$android_sdk_base_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }
}
