package com.moloco.sdk.internal.ortb.model;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes8.dex */
public final class j implements KSerializer<Color> {
    public static final j a = new j();
    public static final SerialDescriptor b = SerialDescriptorsKt.PrimitiveSerialDescriptor("Color", PrimitiveKind.STRING.INSTANCE);

    public long a(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return ColorKt.Color(android.graphics.Color.parseColor(decoder.decodeString()));
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return Color.m2102boximpl(a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        a(encoder, ((Color) obj).m2122unboximpl());
    }

    public void a(Encoder encoder, long j) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        throw new NotImplementedError("Color encoding is not supported");
    }
}
