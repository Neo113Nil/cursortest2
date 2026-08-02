package io.ktor.util.date;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: Date.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/ktor/util/date/GMTDate.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lio/ktor/util/date/GMTDate;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/ktor/util/date/GMTDate;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/ktor/util/date/GMTDate;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public /* synthetic */ class GMTDate$$serializer implements GeneratedSerializer<GMTDate> {
    public static final GMTDate$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private GMTDate$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        GMTDate$$serializer gMTDate$$serializer = new GMTDate$$serializer();
        INSTANCE = gMTDate$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.ktor.util.date.GMTDate", gMTDate$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("seconds", false);
        pluginGeneratedSerialDescriptor.addElement("minutes", false);
        pluginGeneratedSerialDescriptor.addElement("hours", false);
        pluginGeneratedSerialDescriptor.addElement("dayOfWeek", false);
        pluginGeneratedSerialDescriptor.addElement("dayOfMonth", false);
        pluginGeneratedSerialDescriptor.addElement("dayOfYear", false);
        pluginGeneratedSerialDescriptor.addElement("month", false);
        pluginGeneratedSerialDescriptor.addElement("year", false);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        Lazy[] lazyArr;
        lazyArr = GMTDate.$childSerializers;
        return new KSerializer[]{IntSerializer.INSTANCE, IntSerializer.INSTANCE, IntSerializer.INSTANCE, lazyArr[3].getValue(), IntSerializer.INSTANCE, IntSerializer.INSTANCE, lazyArr[6].getValue(), IntSerializer.INSTANCE, LongSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final GMTDate deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        int i;
        long j;
        int i2;
        int i3;
        int i4;
        WeekDay weekDay;
        int i5;
        int i6;
        int i7;
        Month month;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = GMTDate.$childSerializers;
        int i8 = 7;
        if (beginStructure.decodeSequentially()) {
            i = beginStructure.decodeIntElement(serialDescriptor, 0);
            int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 1);
            int decodeIntElement2 = beginStructure.decodeIntElement(serialDescriptor, 2);
            WeekDay weekDay2 = (WeekDay) beginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            int decodeIntElement3 = beginStructure.decodeIntElement(serialDescriptor, 4);
            int decodeIntElement4 = beginStructure.decodeIntElement(serialDescriptor, 5);
            month = (Month) beginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            i6 = beginStructure.decodeIntElement(serialDescriptor, 7);
            i4 = decodeIntElement4;
            i3 = decodeIntElement3;
            weekDay = weekDay2;
            j = beginStructure.decodeLongElement(serialDescriptor, 8);
            i2 = 511;
            i7 = decodeIntElement2;
            i5 = decodeIntElement;
        } else {
            boolean z = true;
            i = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            Month month2 = null;
            j = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            WeekDay weekDay3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i8 = 7;
                    case 0:
                        i14 |= 1;
                        i = beginStructure.decodeIntElement(serialDescriptor, 0);
                        i8 = 7;
                    case 1:
                        i11 = beginStructure.decodeIntElement(serialDescriptor, 1);
                        i14 |= 2;
                        i8 = 7;
                    case 2:
                        i10 = beginStructure.decodeIntElement(serialDescriptor, 2);
                        i14 |= 4;
                    case 3:
                        weekDay3 = (WeekDay) beginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), weekDay3);
                        i14 |= 8;
                    case 4:
                        i9 = beginStructure.decodeIntElement(serialDescriptor, 4);
                        i14 |= 16;
                    case 5:
                        i13 = beginStructure.decodeIntElement(serialDescriptor, 5);
                        i14 |= 32;
                    case 6:
                        month2 = (Month) beginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), month2);
                        i14 |= 64;
                    case 7:
                        i12 = beginStructure.decodeIntElement(serialDescriptor, i8);
                        i14 |= 128;
                    case 8:
                        j = beginStructure.decodeLongElement(serialDescriptor, 8);
                        i14 |= 256;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i2 = i14;
            i3 = i9;
            i4 = i13;
            weekDay = weekDay3;
            i5 = i11;
            i6 = i12;
            i7 = i10;
            month = month2;
        }
        beginStructure.endStructure(serialDescriptor);
        return new GMTDate(i2, i, i5, i7, weekDay, i3, i4, month, i6, j, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, GMTDate value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        GMTDate.write$Self$ktor_utils(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }
}
