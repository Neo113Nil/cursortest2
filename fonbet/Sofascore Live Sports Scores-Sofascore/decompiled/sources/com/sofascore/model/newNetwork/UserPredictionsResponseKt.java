package com.sofascore.model.newNetwork;

import com.sofascore.model.database.VoteType;
import com.sofascore.model.mvvm.model.StatusKt;
import defpackage.k13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"mapMyPredictions", "", "Lcom/sofascore/model/newNetwork/PredictedEvent;", "dbPredictions", "", "", "currentTimeSeconds", "", "model_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserPredictionsResponseKt {
    @NotNull
    public static final List<PredictedEvent> mapMyPredictions(@NotNull List<PredictedEvent> list, @NotNull Map<String, String> map, long j) {
        List<Vote> votes;
        Object obj;
        list.getClass();
        map.getClass();
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        for (PredictedEvent predictedEvent : list) {
            if (predictedEvent.getStartDateTimestamp() > j && Intrinsics.c(predictedEvent.getStatus().getType(), StatusKt.STATUS_NOT_STARTED)) {
                for (VoteType voteType : VoteType.getEntries()) {
                    String str = map.get(predictedEvent.getId() + "_" + voteType.getSerializedValue());
                    if (str != null && (votes = predictedEvent.getVotes()) != null) {
                        Iterator<T> it = votes.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (((Vote) obj).getVoteType() == voteType) {
                                break;
                            }
                        }
                        Vote vote = (Vote) obj;
                        if (vote != null) {
                            vote.setVote(str);
                        }
                    }
                }
            }
            arrayList.add(predictedEvent);
        }
        return arrayList;
    }
}
