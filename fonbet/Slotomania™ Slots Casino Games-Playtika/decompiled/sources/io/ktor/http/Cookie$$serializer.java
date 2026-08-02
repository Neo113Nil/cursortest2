package io.ktor.http;

import com.ironsource.X3;
import io.ktor.util.date.GMTDate;
import io.ktor.util.date.GMTDate$$serializer;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
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

/* compiled from: Cookie.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/ktor/http/Cookie.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lio/ktor/http/Cookie;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/ktor/http/Cookie;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/ktor/http/Cookie;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes7.dex */
public /* synthetic */ class Cookie$$serializer implements GeneratedSerializer<Cookie> {
    public static final Cookie$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private Cookie$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Cookie$$serializer cookie$$serializer = new Cookie$$serializer();
        INSTANCE = cookie$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.ktor.http.Cookie", cookie$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("encoding", true);
        pluginGeneratedSerialDescriptor.addElement("maxAge", true);
        pluginGeneratedSerialDescriptor.addElement("expires", true);
        pluginGeneratedSerialDescriptor.addElement(X3.j.D, true);
        pluginGeneratedSerialDescriptor.addElement("path", true);
        pluginGeneratedSerialDescriptor.addElement("secure", true);
        pluginGeneratedSerialDescriptor.addElement("httpOnly", true);
        pluginGeneratedSerialDescriptor.addElement("extensions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        Lazy[] lazyArr;
        lazyArr = Cookie.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, lazyArr[2].getValue(), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(GMTDate$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, lazyArr[9].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Cookie deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        GMTDate gMTDate;
        Integer num;
        CookieEncoding cookieEncoding;
        String str;
        String str2;
        boolean z;
        int i;
        boolean z2;
        String str3;
        String str4;
        Map map;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = Cookie.$childSerializers;
        int i2 = 7;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            CookieEncoding cookieEncoding2 = (CookieEncoding) beginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            Integer num2 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, null);
            GMTDate gMTDate2 = (GMTDate) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, GMTDate$$serializer.INSTANCE, null);
            String str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, null);
            String str6 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 7);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(serialDescriptor, 8);
            num = num2;
            i = 1023;
            cookieEncoding = cookieEncoding2;
            gMTDate = gMTDate2;
            str4 = decodeStringElement2;
            map = (Map) beginStructure.decodeSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), null);
            z2 = decodeBooleanElement;
            str3 = str6;
            str2 = str5;
            z = decodeBooleanElement2;
            str = decodeStringElement;
        } else {
            int i3 = 2;
            boolean z3 = true;
            boolean z4 = false;
            int i4 = 0;
            Map map2 = null;
            String str7 = null;
            String str8 = null;
            GMTDate gMTDate3 = null;
            Integer num3 = null;
            String str9 = null;
            String str10 = null;
            boolean z5 = false;
            CookieEncoding cookieEncoding3 = null;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z3 = false;
                        i2 = 7;
                        i3 = 2;
                    case 0:
                        str9 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 2;
                    case 1:
                        str10 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i2 = 7;
                    case 2:
                        cookieEncoding3 = (CookieEncoding) beginStructure.decodeSerializableElement(serialDescriptor, i3, (DeserializationStrategy) lazyArr[i3].getValue(), cookieEncoding3);
                        i4 |= 4;
                        i2 = 7;
                    case 3:
                        num3 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, num3);
                        i4 |= 8;
                        i2 = 7;
                    case 4:
                        gMTDate3 = (GMTDate) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, GMTDate$$serializer.INSTANCE, gMTDate3);
                        i4 |= 16;
                        i2 = 7;
                    case 5:
                        str7 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str7);
                        i4 |= 32;
                        i2 = 7;
                    case 6:
                        str8 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str8);
                        i4 |= 64;
                        i2 = 7;
                    case 7:
                        z4 = beginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i4 |= 128;
                    case 8:
                        z5 = beginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i4 |= 256;
                    case 9:
                        map2 = (Map) beginStructure.decodeSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), map2);
                        i4 |= 512;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            Integer num4 = num3;
            gMTDate = gMTDate3;
            num = num4;
            cookieEncoding = cookieEncoding3;
            str = str9;
            str2 = str7;
            z = z5;
            i = i4;
            z2 = z4;
            str3 = str8;
            str4 = str10;
            map = map2;
        }
        beginStructure.endStructure(serialDescriptor);
        return new Cookie(i, str, str4, cookieEncoding, num, gMTDate, str2, str3, z2, z, map, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Cookie value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Cookie.write$Self$ktor_http(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }
}
