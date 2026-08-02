package com.sofascore.model.fantasy;

import com.ironsource.U3;
import com.sofascore.model.network.response.serializers.EnumCaches;
import com.sofascore.model.network.response.serializers.EnumSerializerKt;
import defpackage.aik;
import defpackage.d7f;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0081\u0004J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0081\u0004R\u0013\u0010\r\u001a\u00020\u000eX\u0096\u0085\b¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPriceChangeReasonSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyPriceChangeReason;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", U3.i.X, "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyPriceChangeReasonSerializer implements KSerializer {

    @NotNull
    public static final FantasyPriceChangeReasonSerializer INSTANCE = new FantasyPriceChangeReasonSerializer();
    private final /* synthetic */ KSerializer $$delegate_0;

    private FantasyPriceChangeReasonSerializer() {
        final FantasyPriceChangeReason fantasyPriceChangeReason = FantasyPriceChangeReason.UNKNOWN;
        this.$$delegate_0 = new KSerializer() { // from class: com.sofascore.model.fantasy.FantasyPriceChangeReasonSerializer$special$$inlined$enumSerializerWithDefaultValue$1
            private final SerialDescriptor descriptor = aik.g("EnumSerializer", d7f.n);

            /* JADX WARN: Type inference failed for: r3v1, types: [com.sofascore.model.fantasy.FantasyPriceChangeReason, java.lang.Enum] */
            @Override // defpackage.dy4
            public FantasyPriceChangeReason deserialize(Decoder decoder) {
                decoder.getClass();
                String z = decoder.z();
                EnumCaches enumCaches = EnumCaches.INSTANCE;
                FantasyPriceChangeReason fantasyPriceChangeReason2 = (FantasyPriceChangeReason) enumCaches.enumBySerialName(FantasyPriceChangeReason.class, z);
                if (fantasyPriceChangeReason2 != null) {
                    return fantasyPriceChangeReason2;
                }
                FantasyPriceChangeReason fantasyPriceChangeReason3 = (FantasyPriceChangeReason) enumCaches.enumByName(FantasyPriceChangeReason.class, z);
                return fantasyPriceChangeReason3 == null ? fantasyPriceChangeReason : fantasyPriceChangeReason3;
            }

            @Override // defpackage.dy4
            public SerialDescriptor getDescriptor() {
                return this.descriptor;
            }

            @Override // kotlinx.serialization.KSerializer
            public void serialize(Encoder encoder, FantasyPriceChangeReason value) {
                encoder.getClass();
                value.getClass();
                String serialName = EnumSerializerKt.getSerialName(value);
                if (serialName == null) {
                    serialName = value.name();
                }
                encoder.F(serialName);
            }
        };
    }

    @Override // defpackage.dy4
    @NotNull
    public FantasyPriceChangeReason deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        return (FantasyPriceChangeReason) this.$$delegate_0.deserialize(decoder);
    }

    @Override // defpackage.dy4
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.$$delegate_0.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @NotNull FantasyPriceChangeReason value) {
        encoder.getClass();
        value.getClass();
        this.$$delegate_0.serialize(encoder, value);
    }
}
