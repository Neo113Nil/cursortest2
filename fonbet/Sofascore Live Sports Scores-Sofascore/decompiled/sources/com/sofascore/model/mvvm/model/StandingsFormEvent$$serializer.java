package com.sofascore.model.mvvm.model;

import com.ironsource.U3;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/StandingsFormEvent.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/StandingsFormEvent;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/StandingsFormEvent;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/StandingsFormEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class StandingsFormEvent$$serializer implements iw8 {

    @NotNull
    public static final StandingsFormEvent$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        StandingsFormEvent$$serializer standingsFormEvent$$serializer = new StandingsFormEvent$$serializer();
        INSTANCE = standingsFormEvent$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.StandingsFormEvent", standingsFormEvent$$serializer, 6);
        uyeVar.j("winnerCode", false);
        uyeVar.j("homeTeam", false);
        uyeVar.j("awayTeam", false);
        uyeVar.j("startTimestamp", false);
        uyeVar.j("status", false);
        uyeVar.j("tournament", false);
        descriptor = uyeVar;
    }

    private StandingsFormEvent$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = StandingsFormEvent.$childSerializers;
        return new KSerializer[]{l98.W(a7a.a), joaVarArr[1].getValue(), joaVarArr[2].getValue(), lkb.a, Status$$serializer.INSTANCE, Tournament$$serializer.INSTANCE};
    }

    @Override // defpackage.dy4
    @NotNull
    public final StandingsFormEvent deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = StandingsFormEvent.$childSerializers;
        StandingsFormEvent standingsFormEvent = null;
        int i = 0;
        Integer num = null;
        Team team = null;
        Team team2 = null;
        Status status = null;
        long j = 0;
        boolean z = true;
        Tournament tournament = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    num = (Integer) b.i(serialDescriptor, 0, a7a.a, num);
                    i |= 1;
                    break;
                case 1:
                    team = (Team) b.w(serialDescriptor, 1, (dy4) joaVarArr[1].getValue(), team);
                    i |= 2;
                    break;
                case 2:
                    team2 = (Team) b.w(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), team2);
                    i |= 4;
                    break;
                case 3:
                    j = b.g(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    status = (Status) b.w(serialDescriptor, 4, Status$$serializer.INSTANCE, status);
                    i |= 16;
                    break;
                case 5:
                    tournament = (Tournament) b.w(serialDescriptor, 5, Tournament$$serializer.INSTANCE, tournament);
                    i |= 32;
                    break;
                default:
                    yhk.e(o);
                    return standingsFormEvent;
            }
            standingsFormEvent = null;
        }
        b.c(serialDescriptor);
        return new StandingsFormEvent(i, num, team, team2, j, status, tournament, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull StandingsFormEvent value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        StandingsFormEvent.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
