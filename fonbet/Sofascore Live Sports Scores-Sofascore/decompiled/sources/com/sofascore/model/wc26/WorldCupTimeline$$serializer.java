package com.sofascore.model.wc26;

import com.ironsource.U3;
import defpackage.iw8;
import defpackage.lkb;
import defpackage.uf3;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yhk;
import defpackage.z8e;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/wc26/WorldCupTimeline.$serializer", "Liw8;", "Lcom/sofascore/model/wc26/WorldCupTimeline;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/wc26/WorldCupTimeline;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/wc26/WorldCupTimeline;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class WorldCupTimeline$$serializer implements iw8 {

    @NotNull
    public static final WorldCupTimeline$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        WorldCupTimeline$$serializer worldCupTimeline$$serializer = new WorldCupTimeline$$serializer();
        INSTANCE = worldCupTimeline$$serializer;
        uye uyeVar = new uye("com.sofascore.model.wc26.WorldCupTimeline", worldCupTimeline$$serializer, 7);
        uyeVar.j("myTeamCollapsable", false);
        uyeVar.j("midPhaseStart", false);
        uyeVar.j("liveTournamentPhaseStart", false);
        uyeVar.j("liveTournament2PhaseStart", false);
        uyeVar.j("liveTournament3PhaseStart", false);
        uyeVar.j("afterFinalPhaseStart", false);
        uyeVar.j("endPhaseStart", false);
        descriptor = uyeVar;
    }

    private WorldCupTimeline$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        lkb lkbVar = lkb.a;
        return new KSerializer[]{lkbVar, lkbVar, lkbVar, lkbVar, lkbVar, lkbVar, lkbVar};
    }

    @Override // defpackage.dy4
    @NotNull
    public final WorldCupTimeline deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        int i = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        boolean z = true;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    j = b.g(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    j2 = b.g(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    j3 = b.g(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    j4 = b.g(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    j5 = b.g(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    j6 = b.g(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    j7 = b.g(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new WorldCupTimeline(i, j, j2, j3, j4, j5, j6, j7, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull WorldCupTimeline value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        WorldCupTimeline.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
