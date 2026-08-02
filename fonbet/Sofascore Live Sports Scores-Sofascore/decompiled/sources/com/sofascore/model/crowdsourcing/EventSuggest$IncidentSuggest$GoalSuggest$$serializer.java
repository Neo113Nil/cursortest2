package com.sofascore.model.crowdsourcing;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/crowdsourcing/EventSuggest.IncidentSuggest.GoalSuggest.$serializer", "Liw8;", "Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest$GoalSuggest;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest$GoalSuggest;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest$GoalSuggest;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class EventSuggest$IncidentSuggest$GoalSuggest$$serializer implements iw8 {

    @NotNull
    public static final EventSuggest$IncidentSuggest$GoalSuggest$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        EventSuggest$IncidentSuggest$GoalSuggest$$serializer eventSuggest$IncidentSuggest$GoalSuggest$$serializer = new EventSuggest$IncidentSuggest$GoalSuggest$$serializer();
        INSTANCE = eventSuggest$IncidentSuggest$GoalSuggest$$serializer;
        uye uyeVar = new uye("eventScoreSuggest", eventSuggest$IncidentSuggest$GoalSuggest$$serializer, 14);
        uyeVar.j("id", false);
        uyeVar.j("status", false);
        uyeVar.j("validated", false);
        uyeVar.j("homeScoreSuggest", false);
        uyeVar.j("awayScoreSuggest", false);
        uyeVar.j("scorer", false);
        uyeVar.j("assist", false);
        uyeVar.j("scorerName", false);
        uyeVar.j("assistName", false);
        uyeVar.j("from", false);
        uyeVar.j("scoringTeam", false);
        uyeVar.j("time", false);
        uyeVar.j("addedTime", false);
        uyeVar.j("applied", false);
        descriptor = uyeVar;
    }

    private EventSuggest$IncidentSuggest$GoalSuggest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = EventSuggest.IncidentSuggest.GoalSuggest.$childSerializers;
        a7a a7aVar = a7a.a;
        gz1 gz1Var = gz1.a;
        Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
        uhi uhiVar = uhi.a;
        return new KSerializer[]{a7aVar, joaVarArr[1].getValue(), gz1Var, a7aVar, a7aVar, l98.W(player$$serializer), l98.W(player$$serializer), l98.W(uhiVar), l98.W(uhiVar), joaVarArr[9].getValue(), joaVarArr[10].getValue(), l98.W(a7aVar), l98.W(a7aVar), l98.W(gz1Var)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final EventSuggest.IncidentSuggest.GoalSuggest deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        boolean z;
        int i;
        boolean z2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = EventSuggest.IncidentSuggest.GoalSuggest.$childSerializers;
        Integer num = null;
        TeamSide teamSide = null;
        CrowdsourcingIncidentType.Goal goal = null;
        String str = null;
        Integer num2 = null;
        String str2 = null;
        int i2 = 0;
        Boolean bool = null;
        SuggestStatus suggestStatus = null;
        boolean z3 = false;
        int i3 = 0;
        int i4 = 0;
        Player player = null;
        Player player2 = null;
        boolean z4 = true;
        int i5 = 0;
        while (z4) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z2 = z3;
                    z4 = false;
                    z3 = z2;
                case 0:
                    z = z3;
                    i = i3;
                    i5 = b.l(serialDescriptor, 0);
                    i2 |= 1;
                    z3 = z;
                    i3 = i;
                case 1:
                    z = z3;
                    i = i3;
                    suggestStatus = (SuggestStatus) b.w(serialDescriptor, 1, (dy4) joaVarArr[1].getValue(), suggestStatus);
                    i2 |= 2;
                    z3 = z;
                    i3 = i;
                case 2:
                    z3 = b.B(serialDescriptor, 2);
                    i2 |= 4;
                case 3:
                    z2 = z3;
                    i3 = b.l(serialDescriptor, 3);
                    i2 |= 8;
                    z3 = z2;
                case 4:
                    z2 = z3;
                    i4 = b.l(serialDescriptor, 4);
                    i2 |= 16;
                    z3 = z2;
                case 5:
                    z = z3;
                    i = i3;
                    player = (Player) b.i(serialDescriptor, 5, Player$$serializer.INSTANCE, player);
                    i2 |= 32;
                    z3 = z;
                    i3 = i;
                case 6:
                    z = z3;
                    i = i3;
                    player2 = (Player) b.i(serialDescriptor, 6, Player$$serializer.INSTANCE, player2);
                    i2 |= 64;
                    z3 = z;
                    i3 = i;
                case 7:
                    z = z3;
                    i = i3;
                    str2 = (String) b.i(serialDescriptor, 7, uhi.a, str2);
                    i2 |= 128;
                    z3 = z;
                    i3 = i;
                case 8:
                    z = z3;
                    i = i3;
                    str = (String) b.i(serialDescriptor, 8, uhi.a, str);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    z3 = z;
                    i3 = i;
                case 9:
                    z = z3;
                    i = i3;
                    goal = (CrowdsourcingIncidentType.Goal) b.w(serialDescriptor, 9, (dy4) joaVarArr[9].getValue(), goal);
                    i2 |= 512;
                    z3 = z;
                    i3 = i;
                case 10:
                    z = z3;
                    i = i3;
                    teamSide = (TeamSide) b.w(serialDescriptor, 10, (dy4) joaVarArr[10].getValue(), teamSide);
                    i2 |= 1024;
                    z3 = z;
                    i3 = i;
                case 11:
                    z = z3;
                    i = i3;
                    num = (Integer) b.i(serialDescriptor, 11, a7a.a, num);
                    i2 |= a.o;
                    z3 = z;
                    i3 = i;
                case 12:
                    z = z3;
                    i = i3;
                    num2 = (Integer) b.i(serialDescriptor, 12, a7a.a, num2);
                    i2 |= 4096;
                    z3 = z;
                    i3 = i;
                case 13:
                    z = z3;
                    i = i3;
                    bool = (Boolean) b.i(serialDescriptor, 13, gz1.a, bool);
                    i2 |= 8192;
                    z3 = z;
                    i3 = i;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new EventSuggest.IncidentSuggest.GoalSuggest(i2, i5, suggestStatus, z3, i3, i4, player, player2, str2, str, goal, teamSide, num, num2, bool, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull EventSuggest.IncidentSuggest.GoalSuggest value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        EventSuggest.IncidentSuggest.GoalSuggest.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
