package com.moloco.sdk.internal.ortb.model;

import com.braze.Constants;
import com.ironsource.C2608q2;
import com.moloco.sdk.internal.ortb.model.C2792f;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0002\u0018\u001cBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u001a\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001e\u0012\u0004\b!\u0010\u001d\u001a\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001a\u0012\u0004\b$\u0010\u001d\u001a\u0004\b#\u0010\u001bR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010\u001d\u001a\u0004\b'\u0010(R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001a\u0012\u0004\b+\u0010\u001d\u001a\u0004\b*\u0010\u001bR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001a\u0012\u0004\b%\u0010\u001d\u001a\u0004\b\"\u0010\u001b¨\u0006-"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/e;", "", "", "adm", "", "price", C2608q2.y, "Lcom/moloco/sdk/internal/ortb/model/f;", "ext", "crid", "bundle", "<init>", "(Ljava/lang/String;FLjava/lang/String;Lcom/moloco/sdk/internal/ortb/model/f;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;FLjava/lang/String;Lcom/moloco/sdk/internal/ortb/model/f;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lcom/moloco/sdk/internal/ortb/model/e;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "()V", "F", "k", "()F", "l", "c", "e", "f", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "Lcom/moloco/sdk/internal/ortb/model/f;", "i", "()Lcom/moloco/sdk/internal/ortb/model/f;", "j", "g", "h", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* renamed from: com.moloco.sdk.internal.ortb.model.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2791e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int g = 8;

    /* renamed from: a, reason: from kotlin metadata */
    public final String adm;

    /* renamed from: b, reason: from kotlin metadata */
    public final float price;

    /* renamed from: c, reason: from kotlin metadata */
    public final String burl;

    /* renamed from: d, reason: from kotlin metadata */
    public final C2792f ext;

    /* renamed from: e, reason: from kotlin metadata */
    public final String crid;

    /* renamed from: f, reason: from kotlin metadata */
    public final String bundle;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    /* renamed from: com.moloco.sdk.internal.ortb.model.e$a */
    public /* synthetic */ class a implements GeneratedSerializer<C2791e> {
        public static final a a;
        public static final int b;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.Bid", aVar, 6);
            pluginGeneratedSerialDescriptor.addElement("adm", false);
            pluginGeneratedSerialDescriptor.addElement("price", false);
            pluginGeneratedSerialDescriptor.addElement(C2608q2.y, true);
            pluginGeneratedSerialDescriptor.addElement("ext", false);
            pluginGeneratedSerialDescriptor.addElement("crid", true);
            pluginGeneratedSerialDescriptor.addElement("bundle", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2791e deserialize(Decoder decoder) {
            String str;
            String str2;
            String str3;
            C2792f c2792f;
            float f;
            String str4;
            int i;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            if (beginStructure.decodeSequentially()) {
                String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
                float decodeFloatElement = beginStructure.decodeFloatElement(serialDescriptor, 1);
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                String str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
                C2792f c2792f2 = (C2792f) beginStructure.decodeSerializableElement(serialDescriptor, 3, C2792f.a.a, null);
                String str6 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
                str4 = decodeStringElement;
                str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
                c2792f = c2792f2;
                str = str6;
                str3 = str5;
                f = decodeFloatElement;
                i = 63;
            } else {
                float f2 = 0.0f;
                boolean z = true;
                String str7 = null;
                String str8 = null;
                C2792f c2792f3 = null;
                String str9 = null;
                String str10 = null;
                int i2 = 0;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                            continue;
                        case 0:
                            str7 = beginStructure.decodeStringElement(serialDescriptor, 0);
                            i2 |= 1;
                            continue;
                        case 1:
                            f2 = beginStructure.decodeFloatElement(serialDescriptor, 1);
                            i2 |= 2;
                            break;
                        case 2:
                            str8 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str8);
                            i2 |= 4;
                            break;
                        case 3:
                            c2792f3 = (C2792f) beginStructure.decodeSerializableElement(serialDescriptor, 3, C2792f.a.a, c2792f3);
                            i2 |= 8;
                            break;
                        case 4:
                            str9 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str9);
                            i2 |= 16;
                            break;
                        case 5:
                            str10 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str10);
                            i2 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                str = str9;
                str2 = str10;
                str3 = str8;
                c2792f = c2792f3;
                f = f2;
                str4 = str7;
                i = i2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new C2791e(i, str4, f, str3, c2792f, str, str2, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{stringSerializer, FloatSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), C2792f.a.a, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, C2791e value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            C2791e.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.e$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<C2791e> serializer() {
            return a.a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C2791e(int i, String str, float f, String str2, C2792f c2792f, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i, 11, a.a.getDescriptor());
        }
        this.adm = str;
        this.price = f;
        if ((i & 4) == 0) {
            this.burl = null;
        } else {
            this.burl = str2;
        }
        this.ext = c2792f;
        if ((i & 16) == 0) {
            this.crid = null;
        } else {
            this.crid = str3;
        }
        if ((i & 32) == 0) {
            this.bundle = null;
        } else {
            this.bundle = str4;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void a(C2791e self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.adm);
        output.encodeFloatElement(serialDesc, 1, self.price);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.burl != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.burl);
        }
        output.encodeSerializableElement(serialDesc, 3, C2792f.a.a, self.ext);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.crid != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.crid);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.bundle == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.bundle);
    }

    @SerialName("adm")
    public static /* synthetic */ void b() {
    }

    @SerialName("bundle")
    public static /* synthetic */ void d() {
    }

    @SerialName(C2608q2.y)
    public static /* synthetic */ void f() {
    }

    @SerialName("crid")
    public static /* synthetic */ void h() {
    }

    @SerialName("ext")
    public static /* synthetic */ void j() {
    }

    @SerialName("price")
    public static /* synthetic */ void l() {
    }

    /* renamed from: c, reason: from getter */
    public final String getBundle() {
        return this.bundle;
    }

    /* renamed from: e, reason: from getter */
    public final String getBurl() {
        return this.burl;
    }

    /* renamed from: g, reason: from getter */
    public final String getCrid() {
        return this.crid;
    }

    /* renamed from: i, reason: from getter */
    public final C2792f getExt() {
        return this.ext;
    }

    /* renamed from: k, reason: from getter */
    public final float getPrice() {
        return this.price;
    }

    /* renamed from: a, reason: from getter */
    public final String getAdm() {
        return this.adm;
    }

    public C2791e(String adm, float f, String str, C2792f ext, String str2, String str3) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(ext, "ext");
        this.adm = adm;
        this.price = f;
        this.burl = str;
        this.ext = ext;
        this.crid = str2;
        this.bundle = str3;
    }

    public /* synthetic */ C2791e(String str, float f, String str2, C2792f c2792f, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, (i & 4) != 0 ? null : str2, c2792f, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
