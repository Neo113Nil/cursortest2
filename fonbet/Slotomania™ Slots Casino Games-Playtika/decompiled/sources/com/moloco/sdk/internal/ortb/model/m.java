package com.moloco.sdk.internal.ortb.model;

import androidx.compose.material.OutlinedTextFieldKt;
import com.braze.Constants;
import com.moloco.sdk.internal.ortb.model.o;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0002\u0014\u0017B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010*\u0012\u0004\b,\u0010&\u001a\u0004\b+\u0010\u001a¨\u0006."}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/m;", "", "", "size", "", "appIconUri", "Lcom/moloco/sdk/internal/ortb/model/o;", OutlinedTextFieldKt.BorderId, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/moloco/sdk/internal/ortb/model/o;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Lcom/moloco/sdk/internal/ortb/model/o;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lcom/moloco/sdk/internal/ortb/model/m;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/Integer;", "b", "()Ljava/lang/String;", "c", "()Lcom/moloco/sdk/internal/ortb/model/o;", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/moloco/sdk/internal/ortb/model/o;)Lcom/moloco/sdk/internal/ortb/model/m;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "h", "i", "()V", "Ljava/lang/String;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "e", "Lcom/moloco/sdk/internal/ortb/model/o;", "f", "g", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class m {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int d = 8;

    /* renamed from: a, reason: from kotlin metadata */
    public final Integer size;

    /* renamed from: b, reason: from kotlin metadata */
    public final String appIconUri;

    /* renamed from: c, reason: from kotlin metadata */
    public final o border;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements GeneratedSerializer<m> {
        public static final a a;
        public static final int b;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.DECAppIconSerializable", aVar, 3);
            pluginGeneratedSerialDescriptor.addElement("size", true);
            pluginGeneratedSerialDescriptor.addElement("app_icon_url", true);
            pluginGeneratedSerialDescriptor.addElement(OutlinedTextFieldKt.BorderId, true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m deserialize(Decoder decoder) {
            int i;
            Integer num;
            String str;
            o oVar;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            Integer num2 = null;
            if (beginStructure.decodeSequentially()) {
                Integer num3 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, null);
                String str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, null);
                num = num3;
                oVar = (o) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, o.a.a, null);
                str = str2;
                i = 7;
            } else {
                boolean z = true;
                int i2 = 0;
                String str3 = null;
                o oVar2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        num2 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, num2);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str3);
                        i2 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        oVar2 = (o) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, o.a.a, oVar2);
                        i2 |= 4;
                    }
                }
                i = i2;
                num = num2;
                str = str3;
                oVar = oVar2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new m(i, num, str, oVar, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(o.a.a)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, m value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            m.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.m$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<m> serializer() {
            return a.a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public m() {
        this((Integer) null, (String) null, (o) null, 7, (DefaultConstructorMarker) null);
    }

    @SerialName("app_icon_url")
    public static /* synthetic */ void e() {
    }

    @SerialName(OutlinedTextFieldKt.BorderId)
    public static /* synthetic */ void g() {
    }

    @SerialName("size")
    public static /* synthetic */ void i() {
    }

    /* renamed from: a, reason: from getter */
    public final Integer getSize() {
        return this.size;
    }

    /* renamed from: b, reason: from getter */
    public final String getAppIconUri() {
        return this.appIconUri;
    }

    /* renamed from: c, reason: from getter */
    public final o getBorder() {
        return this.border;
    }

    public final String d() {
        return this.appIconUri;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof m)) {
            return false;
        }
        m mVar = (m) other;
        return Intrinsics.areEqual(this.size, mVar.size) && Intrinsics.areEqual(this.appIconUri, mVar.appIconUri) && Intrinsics.areEqual(this.border, mVar.border);
    }

    public final o f() {
        return this.border;
    }

    public final Integer h() {
        return this.size;
    }

    public int hashCode() {
        Integer num = this.size;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.appIconUri;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        o oVar = this.border;
        return hashCode2 + (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "DECAppIconSerializable(size=" + this.size + ", appIconUri=" + this.appIconUri + ", border=" + this.border + ')';
    }

    public /* synthetic */ m(int i, Integer num, String str, o oVar, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.size = null;
        } else {
            this.size = num;
        }
        if ((i & 2) == 0) {
            this.appIconUri = null;
        } else {
            this.appIconUri = str;
        }
        if ((i & 4) == 0) {
            this.border = null;
        } else {
            this.border = oVar;
        }
    }

    public final m a(Integer size, String appIconUri, o border) {
        return new m(size, appIconUri, border);
    }

    public static /* synthetic */ m a(m mVar, Integer num, String str, o oVar, int i, Object obj) {
        if ((i & 1) != 0) {
            num = mVar.size;
        }
        if ((i & 2) != 0) {
            str = mVar.appIconUri;
        }
        if ((i & 4) != 0) {
            oVar = mVar.border;
        }
        return mVar.a(num, str, oVar);
    }

    @JvmStatic
    public static final /* synthetic */ void a(m self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.size != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.size);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.appIconUri != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.appIconUri);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.border == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, o.a.a, self.border);
    }

    public m(Integer num, String str, o oVar) {
        this.size = num;
        this.appIconUri = str;
        this.border = oVar;
    }

    public /* synthetic */ m(Integer num, String str, o oVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : oVar);
    }
}
