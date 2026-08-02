package com.moloco.sdk.internal.ortb.model;

import androidx.compose.ui.graphics.Color;
import com.braze.Constants;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.UIntSerializer;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0001\u0018\u0000 *2\u00020\u0001:\u0002\u0017\u001eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010\u001d\u001a\u0004\b \u0010!R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u001d\u001a\u0004\b%\u0010&R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010(\u0012\u0004\b#\u0010\u001d\u001a\u0004\b\u001e\u0010)¨\u0006+"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/A;", "", "Lkotlin/UInt;", "padding", "Lcom/moloco/sdk/internal/ortb/model/u;", "horizontalAlignment", "Lcom/moloco/sdk/internal/ortb/model/F;", "verticalAlignment", "Landroidx/compose/ui/graphics/Color;", "foregroundColor", "<init>", "(ILcom/moloco/sdk/internal/ortb/model/u;Lcom/moloco/sdk/internal/ortb/model/F;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlin/UInt;Lcom/moloco/sdk/internal/ortb/model/u;Lcom/moloco/sdk/internal/ortb/model/F;Landroidx/compose/ui/graphics/Color;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lcom/moloco/sdk/internal/ortb/model/A;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "I", "f", "()I", "g", "()V", "b", "Lcom/moloco/sdk/internal/ortb/model/u;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "()Lcom/moloco/sdk/internal/ortb/model/u;", "e", "c", "Lcom/moloco/sdk/internal/ortb/model/F;", "h", "()Lcom/moloco/sdk/internal/ortb/model/F;", "i", "J", "()J", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes5.dex */
public final class A {
    public static final int e = 0;

    /* renamed from: a, reason: from kotlin metadata */
    public final int padding;

    /* renamed from: b, reason: from kotlin metadata */
    public final u horizontalAlignment;

    /* renamed from: c, reason: from kotlin metadata */
    public final F verticalAlignment;

    /* renamed from: d, reason: from kotlin metadata */
    public final long foregroundColor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final KSerializer<Object>[] f = {null, u.INSTANCE.serializer(), F.INSTANCE.serializer(), null};

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements GeneratedSerializer<A> {
        public static final a a;
        public static final int b;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.ProgressBar", aVar, 4);
            pluginGeneratedSerialDescriptor.addElement("padding", false);
            pluginGeneratedSerialDescriptor.addElement(AnalyticsEvents.PARAMETER_LIKE_VIEW_HORIZONTAL_ALIGNMENT, false);
            pluginGeneratedSerialDescriptor.addElement("vertical_alignment", false);
            pluginGeneratedSerialDescriptor.addElement("foreground_color", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A deserialize(Decoder decoder) {
            int i;
            UInt uInt;
            u uVar;
            F f;
            Color color;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            KSerializer[] kSerializerArr = A.f;
            UInt uInt2 = null;
            if (beginStructure.decodeSequentially()) {
                UInt uInt3 = (UInt) beginStructure.decodeSerializableElement(serialDescriptor, 0, UIntSerializer.INSTANCE, null);
                u uVar2 = (u) beginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
                f = (F) beginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
                uInt = uInt3;
                color = (Color) beginStructure.decodeSerializableElement(serialDescriptor, 3, j.a, null);
                i = 15;
                uVar = uVar2;
            } else {
                boolean z = true;
                int i2 = 0;
                u uVar3 = null;
                F f2 = null;
                Color color2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        uInt2 = (UInt) beginStructure.decodeSerializableElement(serialDescriptor, 0, UIntSerializer.INSTANCE, uInt2);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        uVar3 = (u) beginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], uVar3);
                        i2 |= 2;
                    } else if (decodeElementIndex == 2) {
                        f2 = (F) beginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], f2);
                        i2 |= 4;
                    } else {
                        if (decodeElementIndex != 3) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        color2 = (Color) beginStructure.decodeSerializableElement(serialDescriptor, 3, j.a, color2);
                        i2 |= 8;
                    }
                }
                i = i2;
                uInt = uInt2;
                uVar = uVar3;
                f = f2;
                color = color2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new A(i, uInt, uVar, f, color, null, null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?>[] kSerializerArr = A.f;
            return new KSerializer[]{UIntSerializer.INSTANCE, kSerializerArr[1], kSerializerArr[2], j.a};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, A value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            A.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.A$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<A> serializer() {
            return a.a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ A(int i, u uVar, F f2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, uVar, f2, j);
    }

    @SerialName("foreground_color")
    @Serializable(with = j.class)
    public static /* synthetic */ void c() {
    }

    @SerialName(AnalyticsEvents.PARAMETER_LIKE_VIEW_HORIZONTAL_ALIGNMENT)
    public static /* synthetic */ void e() {
    }

    @SerialName("padding")
    public static /* synthetic */ void g() {
    }

    @SerialName("vertical_alignment")
    public static /* synthetic */ void i() {
    }

    /* renamed from: b, reason: from getter */
    public final long getForegroundColor() {
        return this.foregroundColor;
    }

    /* renamed from: d, reason: from getter */
    public final u getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* renamed from: f, reason: from getter */
    public final int getPadding() {
        return this.padding;
    }

    /* renamed from: h, reason: from getter */
    public final F getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public /* synthetic */ A(int i, UInt uInt, u uVar, F f2, Color color, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, uInt, uVar, f2, color, serializationConstructorMarker);
    }

    @JvmStatic
    public static final /* synthetic */ void a(A self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = f;
        output.encodeSerializableElement(serialDesc, 0, UIntSerializer.INSTANCE, UInt.m11271boximpl(self.padding));
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.horizontalAlignment);
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.verticalAlignment);
        output.encodeSerializableElement(serialDesc, 3, j.a, Color.m2102boximpl(self.foregroundColor));
    }

    public /* synthetic */ A(int i, UInt uInt, u uVar, F f2, Color color, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, a.a.getDescriptor());
        }
        this.padding = uInt.getData();
        this.horizontalAlignment = uVar;
        this.verticalAlignment = f2;
        this.foregroundColor = color.m2122unboximpl();
    }

    public A(int i, u horizontalAlignment, F verticalAlignment, long j) {
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        this.padding = i;
        this.horizontalAlignment = horizontalAlignment;
        this.verticalAlignment = verticalAlignment;
        this.foregroundColor = j;
    }
}
