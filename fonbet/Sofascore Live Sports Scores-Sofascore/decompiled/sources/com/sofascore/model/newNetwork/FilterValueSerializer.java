package com.sofascore.model.newNetwork;

import com.ironsource.U3;
import com.sofascore.model.network.response.serializers.EnumCaches;
import com.sofascore.model.network.response.serializers.EnumSerializerKt;
import defpackage.aik;
import defpackage.d7f;
import defpackage.duf;
import defpackage.fc6;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0081\u0004J\u001c\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0096\u0081\u0004R\u0013\u0010\r\u001a\u00020\u000eX\u0096\u0085\b¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/sofascore/model/newNetwork/FilterValueSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/FilterValue;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", U3.i.X, "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FilterValueSerializer implements KSerializer {

    @NotNull
    public static final FilterValueSerializer INSTANCE = new FilterValueSerializer();
    private final /* synthetic */ KSerializer $$delegate_0 = new KSerializer() { // from class: com.sofascore.model.newNetwork.FilterValueSerializer$special$$inlined$enumSerializer$1
        private final SerialDescriptor descriptor = aik.g("EnumSerializer", d7f.n);

        @Override // defpackage.dy4
        public FilterValue deserialize(Decoder decoder) {
            decoder.getClass();
            String z = decoder.z();
            EnumCaches enumCaches = EnumCaches.INSTANCE;
            FilterValue filterValue = (FilterValue) enumCaches.enumBySerialName(FilterValue.class, z);
            if (filterValue != null) {
                return filterValue;
            }
            FilterValue filterValue2 = (FilterValue) enumCaches.enumByName(FilterValue.class, z);
            if (filterValue2 != null) {
                return filterValue2;
            }
            System.out.println((Object) fc6.n("Unknown enum value found: \"", z, "\" in ", duf.a.getOrCreateKotlinClass(FilterValue.class).getSimpleName()));
            return null;
        }

        @Override // defpackage.dy4
        public SerialDescriptor getDescriptor() {
            return this.descriptor;
        }

        @Override // kotlinx.serialization.KSerializer
        public void serialize(Encoder encoder, FilterValue value) {
            String name;
            encoder.getClass();
            if (value == null || (name = EnumSerializerKt.getSerialName(value)) == null) {
                name = value != null ? value.name() : null;
            }
            if (name != null) {
                encoder.F(name);
            }
        }
    };

    private FilterValueSerializer() {
    }

    @Override // defpackage.dy4
    @Nullable
    public FilterValue deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        return (FilterValue) this.$$delegate_0.deserialize(decoder);
    }

    @Override // defpackage.dy4
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.$$delegate_0.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @Nullable FilterValue value) {
        encoder.getClass();
        this.$$delegate_0.serialize(encoder, value);
    }
}
