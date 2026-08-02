package com.sofascore.model.firebase;

import com.ironsource.U3;
import defpackage.a70;
import defpackage.l98;
import defpackage.mfa;
import defpackage.q79;
import defpackage.qfa;
import defpackage.v5h;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0080\u0004J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096\u0080\u0004R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\b\u001a\u00020\tX\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/sofascore/model/firebase/AdPlacementsSerializer;", "Lkotlinx/serialization/KSerializer;", "", "Lcom/sofascore/model/firebase/AdType;", "Lcom/sofascore/model/firebase/AdConfig;", "<init>", "()V", "mapSerializer", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", U3.i.X, "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdPlacementsSerializer implements KSerializer {

    @NotNull
    public static final AdPlacementsSerializer INSTANCE = new AdPlacementsSerializer();

    @NotNull
    private static final SerialDescriptor descriptor;

    @NotNull
    private static final KSerializer mapSerializer;

    static {
        q79 x = l98.x(AdTypeSerializer.INSTANCE, AdConfig.INSTANCE.serializer());
        mapSerializer = x;
        descriptor = x.d;
    }

    private AdPlacementsSerializer() {
    }

    @Override // defpackage.dy4
    @NotNull
    public Map<AdType, AdConfig> deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        if (!(decoder instanceof mfa)) {
            a70.p("Failed requirement.");
            return null;
        }
        mfa mfaVar = (mfa) decoder;
        c g = qfa.g(mfaVar.j());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : g.a.entrySet()) {
            String str = (String) entry.getKey();
            b bVar = (b) entry.getValue();
            try {
                linkedHashMap.put((AdType) mfaVar.d().a(AdTypeSerializer.INSTANCE, qfa.c(str)), ((mfa) decoder).d().a(AdConfig.INSTANCE.serializer(), bVar));
            } catch (v5h unused) {
            }
        }
        return linkedHashMap;
    }

    @Override // defpackage.dy4
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @NotNull Map<AdType, ? extends AdConfig> value) {
        encoder.getClass();
        value.getClass();
        mapSerializer.serialize(encoder, value);
    }
}
