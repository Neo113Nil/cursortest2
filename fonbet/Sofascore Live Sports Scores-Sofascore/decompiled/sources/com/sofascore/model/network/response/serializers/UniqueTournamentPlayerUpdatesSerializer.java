package com.sofascore.model.network.response.serializers;

import com.sofascore.model.newNetwork.PlayerUpdatesItem;
import defpackage.duf;
import defpackage.dy4;
import defpackage.hfa;
import defpackage.qfa;
import kotlin.Metadata;
import kotlinx.serialization.json.b;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/network/response/serializers/UniqueTournamentPlayerUpdatesSerializer;", "Lhfa;", "Lcom/sofascore/model/newNetwork/PlayerUpdatesItem;", "<init>", "()V", "Lkotlinx/serialization/json/b;", "element", "Ldy4;", "selectDeserializer", "(Lkotlinx/serialization/json/b;)Ldy4;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UniqueTournamentPlayerUpdatesSerializer extends hfa {
    public UniqueTournamentPlayerUpdatesSerializer() {
        super(duf.a.getOrCreateKotlinClass(PlayerUpdatesItem.class));
    }

    @Override // defpackage.hfa
    @NotNull
    public dy4 selectDeserializer(@NotNull b element) {
        element.getClass();
        b bVar = (b) qfa.g(element).get("type");
        String c = bVar != null ? qfa.h(bVar).c() : null;
        if (c != null) {
            int hashCode = c.hashCode();
            if (hashCode != -1440156408) {
                if (hashCode != -1184045193) {
                    if (hashCode == 529503228 && c.equals("playerAward")) {
                        return PlayerUpdatesItem.Award.INSTANCE.serializer();
                    }
                } else if (c.equals("injury")) {
                    return PlayerUpdatesItem.Injury.INSTANCE.serializer();
                }
            } else if (c.equals("playerTransferHistory")) {
                return PlayerUpdatesItem.Transfer.INSTANCE.serializer();
            }
        }
        return PlayerUpdatesItem.Unknown.INSTANCE.serializer();
    }
}
