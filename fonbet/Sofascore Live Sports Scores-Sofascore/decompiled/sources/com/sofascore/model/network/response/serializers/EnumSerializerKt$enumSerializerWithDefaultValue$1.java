package com.sofascore.model.network.response.serializers;

import com.ironsource.U3;
import defpackage.aik;
import defpackage.d7f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX WARN: Incorrect field signature: TT; */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0080\u0004¢\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0080\u0004¢\u0006\u0002\u0010\u000fR\u0015\u0010\u0002\u001a\u00020\u0003X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"com/sofascore/model/network/response/serializers/EnumSerializerKt$enumSerializerWithDefaultValue$1", "Lkotlinx/serialization/KSerializer;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", U3.i.X, "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Enum;)V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Enum;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes5.dex */
public final class EnumSerializerKt$enumSerializerWithDefaultValue$1 implements KSerializer {
    final /* synthetic */ Enum $defaultValue;
    private final SerialDescriptor descriptor = aik.g("EnumSerializer", d7f.n);

    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    public EnumSerializerKt$enumSerializerWithDefaultValue$1(Enum r2) {
        this.$defaultValue = r2;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlinx/serialization/encoding/Decoder;)TT; */
    @Override // defpackage.dy4
    public Enum deserialize(Decoder decoder) {
        decoder.getClass();
        decoder.z();
        EnumCaches enumCaches = EnumCaches.INSTANCE;
        Intrinsics.h();
        throw null;
    }

    @Override // defpackage.dy4
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* JADX WARN: Incorrect types in method signature: (Lkotlinx/serialization/encoding/Encoder;TT;)V */
    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Enum value) {
        encoder.getClass();
        value.getClass();
        String serialName = EnumSerializerKt.getSerialName(value);
        if (serialName == null) {
            serialName = value.name();
        }
        encoder.F(serialName);
    }
}
