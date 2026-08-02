package com.sofascore.model.network.response.serializers;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.ServerType;
import defpackage.a70;
import defpackage.aik;
import defpackage.d7f;
import defpackage.mfa;
import defpackage.ofa;
import defpackage.qfa;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0096\u0080\u0004J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004R\u0015\u0010\u0005\u001a\u00020\u0006X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/sofascore/model/network/response/serializers/ServerTypeSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/ServerType;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", U3.i.X, "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ServerTypeSerializer implements KSerializer {

    @NotNull
    public static final ServerTypeSerializer INSTANCE = new ServerTypeSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = aik.g("ServerType", d7f.k);

    private ServerTypeSerializer() {
    }

    @Override // defpackage.dy4
    @Nullable
    public ServerType deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        b bVar = (b) qfa.g(((mfa) decoder).j()).get("id");
        if (bVar == null) {
            a70.p("Missing 'id' field in type object");
            return null;
        }
        d h = qfa.h(bVar);
        try {
            long i = qfa.i(h);
            if (-2147483648L <= i && i <= 2147483647L) {
                return ServerType.INSTANCE.fromId((int) i);
            }
            throw new NumberFormatException(h.c() + " is not an Int");
        } catch (ofa e) {
            throw new NumberFormatException(e.a);
        }
    }

    @Override // defpackage.dy4
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @Nullable ServerType value) {
        encoder.getClass();
        if (value == null || value.name() == null) {
            return;
        }
        encoder.l(ServerTypeJson.INSTANCE.serializer(), new ServerTypeJson(value.getId(), value.name()));
    }
}
