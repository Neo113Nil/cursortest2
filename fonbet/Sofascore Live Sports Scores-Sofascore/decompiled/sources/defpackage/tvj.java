package defpackage;

import com.sofascore.model.Country;
import com.sofascore.model.PlayerTransferFilterData;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.TransfersResponse;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tvj extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ uvj s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvj(uvj uvjVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = uvjVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new tvj(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((tvj) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        List<Transfer> list;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        rq3 rq3Var = null;
        uvj uvjVar = this.s;
        if (i == 0) {
            y6a.M(obj);
            if (uvjVar.e) {
                fxe fxeVar = uvjVar.n;
                if (fxeVar != null) {
                    fxeVar.invoke();
                }
                uvjVar.e = false;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("page", String.valueOf(uvjVar.d + 1));
                PlayerTransferFilterData playerTransferFilterData = uvjVar.g;
                if (playerTransferFilterData != null) {
                    Country country = playerTransferFilterData.getCountry();
                    if (country != null) {
                        linkedHashMap.put("nationality", country.getIso3Alpha());
                    }
                    UniqueTournament tournament = playerTransferFilterData.getTournament();
                    if (tournament != null) {
                        linkedHashMap.put("uniqueTournamentId", String.valueOf(tournament.getId()));
                    }
                    int i2 = svj.a[playerTransferFilterData.getIncomingOutgoing().ordinal()];
                    if (i2 == 1) {
                        linkedHashMap.put("joined", "true");
                    } else if (i2 == 2) {
                        linkedHashMap.put("joined", "false");
                    }
                    if (playerTransferFilterData.getAgeFrom() != 15) {
                        linkedHashMap.put("minAge", String.valueOf(playerTransferFilterData.getAgeFrom()));
                    } else {
                        linkedHashMap.put("minAge", "15");
                    }
                    if (playerTransferFilterData.getAgeTo() != 50) {
                        linkedHashMap.put("maxAge", String.valueOf(playerTransferFilterData.getAgeTo()));
                    } else {
                        linkedHashMap.put("maxAge", "50");
                    }
                    if (playerTransferFilterData.getMinFollowers() != PlayerTransferFilterData.FollowerCountSelection.F0) {
                        linkedHashMap.put("followersCount", playerTransferFilterData.getMinFollowers().getValue());
                    }
                    if (playerTransferFilterData.getPosition() != PlayerTransferFilterData.PlayerPositionSelection.ALL) {
                        linkedHashMap.put("position", playerTransferFilterData.getPosition().getValue());
                    }
                }
                linkedHashMap.put("sort", (uvjVar.g().a ? "-" : "").concat(uvjVar.g().b.a));
                vrj vrjVar = uvjVar.c;
                this.r = 1;
                vrjVar.getClass();
                obj = yaa.P(new fzh(vrjVar, linkedHashMap, rq3Var, 8), this);
                if (obj == lu3Var) {
                    return lu3Var;
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        TransfersResponse transfersResponse = (TransfersResponse) yaa.x((x2g) obj);
        if (transfersResponse == null || (list = transfersResponse.getTransfers()) == null) {
            list = km5.a;
        }
        if (!list.isEmpty()) {
            uvjVar.d++;
            uvjVar.e = true;
        }
        uvjVar.k.j(list);
        return Unit.a;
    }
}
