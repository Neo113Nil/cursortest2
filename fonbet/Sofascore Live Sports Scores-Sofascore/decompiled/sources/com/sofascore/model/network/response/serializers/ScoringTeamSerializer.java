package com.sofascore.model.network.response.serializers;

import com.sofascore.model.crowdsourcing.TeamSide;
import defpackage.pvd;
import defpackage.vqg;
import defpackage.zzl;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/model/network/response/serializers/ScoringTeamSerializer;", "Lcom/sofascore/model/network/response/serializers/EnumIntSerializer;", "Lcom/sofascore/model/crowdsourcing/TeamSide;", "<init>", "()V", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScoringTeamSerializer extends EnumIntSerializer<TeamSide> {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TeamSide.values().length];
            try {
                iArr[TeamSide.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TeamSide.AWAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ScoringTeamSerializer() {
        super("ScoringTeamSerializer", new vqg(18), new vqg(19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _init_$lambda$0(TeamSide teamSide) {
        teamSide.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[teamSide.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        zzl.b();
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TeamSide _init_$lambda$1(int i) {
        if (i == 1) {
            return TeamSide.HOME;
        }
        if (i == 2) {
            return TeamSide.AWAY;
        }
        pvd.l(i, "unknown type ");
        return null;
    }
}
