package com.sofascore.model.network.response.serializers;

import com.sofascore.model.network.response.TeamAverageRatingVersion;
import defpackage.rfi;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/model/network/response/serializers/TeamAverageRatingVersionSerializer;", "Lcom/sofascore/model/network/response/serializers/EnumIntSerializer;", "Lcom/sofascore/model/network/response/TeamAverageRatingVersion;", "<init>", "()V", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TeamAverageRatingVersionSerializer extends EnumIntSerializer<TeamAverageRatingVersion> {
    public TeamAverageRatingVersionSerializer() {
        super("TeamAverageRatingVersionSerializer", new rfi(16), new rfi(17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _init_$lambda$0(TeamAverageRatingVersion teamAverageRatingVersion) {
        teamAverageRatingVersion.getClass();
        return teamAverageRatingVersion.getApiValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TeamAverageRatingVersion _init_$lambda$1(int i) {
        return TeamAverageRatingVersion.INSTANCE.fromApiValue(Integer.valueOf(i));
    }
}
