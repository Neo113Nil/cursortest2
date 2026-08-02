package com.sofascore.model.newNetwork;

import com.ironsource.U3;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatistics;
import defpackage.a70;
import defpackage.aik;
import defpackage.mfa;
import defpackage.qfa;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0080\u0004J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096\u0080\u0004R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\b\u001a\u00020\tX\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/sofascore/model/newNetwork/ApiResponseDeserializer;", "T", "Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatistics;", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TeamStatisticsResponse;", "dataSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", U3.i.X, "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ApiResponseDeserializer<T extends TeamSeasonStatistics> implements KSerializer {

    @NotNull
    private final KSerializer dataSerializer;

    @NotNull
    private final SerialDescriptor descriptor;

    public ApiResponseDeserializer(@NotNull KSerializer kSerializer) {
        kSerializer.getClass();
        this.dataSerializer = kSerializer;
        this.descriptor = aik.v("TeamStatisticsResponse", new SerialDescriptor[0]);
    }

    @Override // defpackage.dy4
    @NotNull
    public TeamStatisticsResponse<T> deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        if (!(decoder instanceof mfa)) {
            a70.p("Failed requirement.");
            return null;
        }
        mfa mfaVar = (mfa) decoder;
        b bVar = (b) qfa.g(mfaVar.j()).get(TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS);
        TeamSeasonStatistics teamSeasonStatistics = bVar != null ? (TeamSeasonStatistics) mfaVar.d().a(this.dataSerializer, bVar) : null;
        if (teamSeasonStatistics != null) {
            return new TeamStatisticsResponse<>(teamSeasonStatistics);
        }
        a70.p("Failed requirement.");
        return null;
    }

    @Override // defpackage.dy4
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @NotNull TeamStatisticsResponse<? extends T> value) {
        encoder.getClass();
        value.getClass();
        throw new UnsupportedOperationException("Serialization is not supported");
    }
}
