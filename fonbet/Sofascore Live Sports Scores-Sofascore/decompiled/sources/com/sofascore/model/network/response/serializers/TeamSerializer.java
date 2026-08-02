package com.sofascore.model.network.response.serializers;

import com.sofascore.model.mvvm.model.Team;
import defpackage.qfa;
import defpackage.zga;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/sofascore/model/network/response/serializers/TeamSerializer;", "Lzga;", "Lcom/sofascore/model/mvvm/model/Team;", "<init>", "()V", "Lkotlinx/serialization/json/b;", "element", "transformDeserialize", "(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/b;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TeamSerializer extends zga {
    public TeamSerializer() {
        super(Team.INSTANCE.generatedSerializer$model_release());
    }

    @Override // defpackage.zga
    @NotNull
    public b transformDeserialize(@NotNull b element) {
        element.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(qfa.g(element));
        b bVar = (b) linkedHashMap.get("subTeams");
        if (bVar != null) {
            a aVar = bVar instanceof a ? (a) bVar : null;
            if (aVar == null) {
                qfa.d("JsonArray", bVar);
                throw null;
            }
            List list = aVar.a;
            if (list.size() == 2) {
                linkedHashMap.put("subTeam1", (b) list.get(0));
                linkedHashMap.put("subTeam2", (b) list.get(1));
                linkedHashMap.remove("subTeams");
            }
        }
        return new c(linkedHashMap);
    }
}
