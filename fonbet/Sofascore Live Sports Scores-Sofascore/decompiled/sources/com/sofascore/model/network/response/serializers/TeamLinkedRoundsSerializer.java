package com.sofascore.model.network.response.serializers;

import com.sofascore.model.mvvm.model.TeamLinkedRound;
import defpackage.duf;
import defpackage.dy4;
import defpackage.hfa;
import defpackage.qfa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.b;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/network/response/serializers/TeamLinkedRoundsSerializer;", "Lhfa;", "Lcom/sofascore/model/mvvm/model/TeamLinkedRound;", "<init>", "()V", "Lkotlinx/serialization/json/b;", "element", "Ldy4;", "selectDeserializer", "(Lkotlinx/serialization/json/b;)Ldy4;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TeamLinkedRoundsSerializer extends hfa {

    @NotNull
    public static final TeamLinkedRoundsSerializer INSTANCE = new TeamLinkedRoundsSerializer();

    private TeamLinkedRoundsSerializer() {
        super(duf.a.getOrCreateKotlinClass(TeamLinkedRound.class));
    }

    @Override // defpackage.hfa
    @NotNull
    public dy4 selectDeserializer(@NotNull b element) {
        element.getClass();
        b bVar = (b) qfa.g(element).get("type");
        String c = bVar != null ? qfa.h(bVar).c() : null;
        return Intrinsics.c(c, "event") ? TeamLinkedRound.EventTeamLinkedRound.INSTANCE.serializer() : Intrinsics.c(c, "knockout") ? TeamLinkedRound.TournamentTeamLinkedRound.INSTANCE.serializer() : TeamLinkedRound.UnknownTeamLinkedRound.INSTANCE.serializer();
    }
}
