package com.moloco.sdk.internal.ortb.model;

import com.braze.Constants;
import com.ironsource.C2399e8;
import com.moloco.sdk.internal.ortb.model.B;
import com.moloco.sdk.internal.ortb.model.w;
import com.moloco.sdk.internal.ortb.model.x;
import com.moloco.sdk.internal.ortb.model.z;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0001\u0018\u0000 /2\u00020\u0001:\u0002\u0019 BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010\u001f\u001a\u0004\b\"\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b \u0010\u001f\u001a\u0004\b\u0019\u0010'R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u001f\u001a\u0004\b*\u0010+R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010-\u0012\u0004\b(\u0010\u001f\u001a\u0004\b%\u0010.¨\u00060"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/f;", "", "Lcom/moloco/sdk/internal/ortb/model/z;", "player", "", "mtid", "Lcom/moloco/sdk/internal/ortb/model/x;", C2399e8.p, "Lcom/moloco/sdk/internal/ortb/model/B;", "sdkEvents", "Lcom/moloco/sdk/internal/ortb/model/w;", "molocoSdkClickMetaData", "<init>", "(Lcom/moloco/sdk/internal/ortb/model/z;Ljava/lang/String;Lcom/moloco/sdk/internal/ortb/model/x;Lcom/moloco/sdk/internal/ortb/model/B;Lcom/moloco/sdk/internal/ortb/model/w;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/moloco/sdk/internal/ortb/model/z;Ljava/lang/String;Lcom/moloco/sdk/internal/ortb/model/x;Lcom/moloco/sdk/internal/ortb/model/B;Lcom/moloco/sdk/internal/ortb/model/w;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lcom/moloco/sdk/internal/ortb/model/f;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/moloco/sdk/internal/ortb/model/z;", "g", "()Lcom/moloco/sdk/internal/ortb/model/z;", "h", "()V", "b", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "f", "c", "Lcom/moloco/sdk/internal/ortb/model/x;", "()Lcom/moloco/sdk/internal/ortb/model/x;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "Lcom/moloco/sdk/internal/ortb/model/B;", "i", "()Lcom/moloco/sdk/internal/ortb/model/B;", "j", "Lcom/moloco/sdk/internal/ortb/model/w;", "()Lcom/moloco/sdk/internal/ortb/model/w;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* renamed from: com.moloco.sdk.internal.ortb.model.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2792f {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int f = 8;

    /* renamed from: a, reason: from kotlin metadata */
    public final z player;

    /* renamed from: b, reason: from kotlin metadata */
    public final String mtid;

    /* renamed from: c, reason: from kotlin metadata */
    public final x configs;

    /* renamed from: d, reason: from kotlin metadata */
    public final B sdkEvents;

    /* renamed from: e, reason: from kotlin metadata */
    public final w molocoSdkClickMetaData;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    /* renamed from: com.moloco.sdk.internal.ortb.model.f$a */
    public /* synthetic */ class a implements GeneratedSerializer<C2792f> {
        public static final a a;
        public static final int b;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.BidExt", aVar, 5);
            pluginGeneratedSerialDescriptor.addElement("player", true);
            pluginGeneratedSerialDescriptor.addElement("mtid", true);
            pluginGeneratedSerialDescriptor.addElement("moloco_sdk_configs", true);
            pluginGeneratedSerialDescriptor.addElement("moloco_sdk_events", true);
            pluginGeneratedSerialDescriptor.addElement("moloco_sdk_click_metadata", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2792f deserialize(Decoder decoder) {
            int i;
            z zVar;
            String str;
            x xVar;
            B b2;
            w wVar;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            z zVar2 = null;
            if (beginStructure.decodeSequentially()) {
                z zVar3 = (z) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, z.a.a, null);
                String str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, null);
                x xVar2 = (x) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, x.a.a, null);
                zVar = zVar3;
                b2 = (B) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, B.a.a, null);
                wVar = (w) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, w.a.a, null);
                xVar = xVar2;
                str = str2;
                i = 31;
            } else {
                boolean z = true;
                int i2 = 0;
                String str3 = null;
                x xVar3 = null;
                B b3 = null;
                w wVar2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        zVar2 = (z) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, z.a.a, zVar2);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str3);
                        i2 |= 2;
                    } else if (decodeElementIndex == 2) {
                        xVar3 = (x) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, x.a.a, xVar3);
                        i2 |= 4;
                    } else if (decodeElementIndex == 3) {
                        b3 = (B) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, B.a.a, b3);
                        i2 |= 8;
                    } else {
                        if (decodeElementIndex != 4) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        wVar2 = (w) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, w.a.a, wVar2);
                        i2 |= 16;
                    }
                }
                i = i2;
                zVar = zVar2;
                str = str3;
                xVar = xVar3;
                b2 = b3;
                wVar = wVar2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new C2792f(i, zVar, str, xVar, b2, wVar, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{BuiltinSerializersKt.getNullable(z.a.a), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(x.a.a), BuiltinSerializersKt.getNullable(B.a.a), BuiltinSerializersKt.getNullable(w.a.a)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, C2792f value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            C2792f.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.f$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<C2792f> serializer() {
            return a.a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C2792f() {
        this((z) null, (String) null, (x) null, (B) null, (w) null, 31, (DefaultConstructorMarker) null);
    }

    @JvmStatic
    public static final /* synthetic */ void a(C2792f self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.player != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, z.a.a, self.player);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.mtid != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.mtid);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.configs != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, x.a.a, self.configs);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.sdkEvents != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, B.a.a, self.sdkEvents);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.molocoSdkClickMetaData == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, w.a.a, self.molocoSdkClickMetaData);
    }

    @SerialName("moloco_sdk_configs")
    public static /* synthetic */ void b() {
    }

    @SerialName("moloco_sdk_click_metadata")
    public static /* synthetic */ void d() {
    }

    @SerialName("mtid")
    public static /* synthetic */ void f() {
    }

    @SerialName("player")
    public static /* synthetic */ void h() {
    }

    @SerialName("moloco_sdk_events")
    public static /* synthetic */ void j() {
    }

    /* renamed from: c, reason: from getter */
    public final w getMolocoSdkClickMetaData() {
        return this.molocoSdkClickMetaData;
    }

    /* renamed from: e, reason: from getter */
    public final String getMtid() {
        return this.mtid;
    }

    /* renamed from: g, reason: from getter */
    public final z getPlayer() {
        return this.player;
    }

    /* renamed from: i, reason: from getter */
    public final B getSdkEvents() {
        return this.sdkEvents;
    }

    public /* synthetic */ C2792f(int i, z zVar, String str, x xVar, B b, w wVar, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.player = null;
        } else {
            this.player = zVar;
        }
        if ((i & 2) == 0) {
            this.mtid = null;
        } else {
            this.mtid = str;
        }
        if ((i & 4) == 0) {
            this.configs = null;
        } else {
            this.configs = xVar;
        }
        if ((i & 8) == 0) {
            this.sdkEvents = null;
        } else {
            this.sdkEvents = b;
        }
        if ((i & 16) == 0) {
            this.molocoSdkClickMetaData = null;
        } else {
            this.molocoSdkClickMetaData = wVar;
        }
    }

    /* renamed from: a, reason: from getter */
    public final x getConfigs() {
        return this.configs;
    }

    public C2792f(z zVar, String str, x xVar, B b, w wVar) {
        this.player = zVar;
        this.mtid = str;
        this.configs = xVar;
        this.sdkEvents = b;
        this.molocoSdkClickMetaData = wVar;
    }

    public /* synthetic */ C2792f(z zVar, String str, x xVar, B b, w wVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : zVar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : xVar, (i & 8) != 0 ? null : b, (i & 16) != 0 ? null : wVar);
    }
}
