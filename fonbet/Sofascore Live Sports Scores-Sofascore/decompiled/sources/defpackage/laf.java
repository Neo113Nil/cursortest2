package defpackage;

import android.content.pm.ShortcutInfo;
import com.sofascore.model.database.VoteType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.newNetwork.PlayerSummaryEvent;
import com.sofascore.model.newNetwork.RefereeStatisticsItem;
import com.sofascore.model.newNetwork.Vote;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.model.profile.PlayerSubscription;
import com.sofascore.model.profile.TeamSubscription;
import com.sofascore.model.profile.UniqueTournamentSubscription;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceTeam;
import com.vungle.ads.internal.protos.Sdk;
import java.time.DayOfWeek;
import java.util.Comparator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class laf implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ laf(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0246 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        Integer valueOf;
        String str;
        Boolean bool;
        switch (this.a) {
            case 0:
                VoteType voteType = ((Vote) obj).getVoteType();
                Integer valueOf2 = voteType != null ? Integer.valueOf(voteType.getSerializedValue()) : null;
                VoteType voteType2 = ((Vote) obj2).getVoteType();
                return o93.b(valueOf2, voteType2 != null ? Integer.valueOf(voteType2.getSerializedValue()) : null);
            case 1:
                return Long.valueOf(((UniqueTournamentSubscription) obj2).getUserCount()).compareTo(Long.valueOf(((UniqueTournamentSubscription) obj).getUserCount()));
            case 2:
                return Long.valueOf(((TeamSubscription) obj2).getUserCount()).compareTo(Long.valueOf(((TeamSubscription) obj).getUserCount()));
            case 3:
                return Long.valueOf(((PlayerSubscription) obj2).getUserCount()).compareTo(Long.valueOf(((PlayerSubscription) obj).getUserCount()));
            case 4:
                return Integer.valueOf(((Number) ((Pair) obj).b).intValue()).compareTo(Integer.valueOf(((Number) ((Pair) obj2).b).intValue()));
            case 5:
                return Integer.valueOf(((RaceFlowModels$RaceEntrant) obj).f).compareTo(Integer.valueOf(((RaceFlowModels$RaceEntrant) obj2).f));
            case 6:
                ((qod) obj2).getClass();
                Integer num = 2;
                ((qod) obj).getClass();
                return num.compareTo(num);
            case 7:
                ((mm4) obj2).getClass();
                Integer num2 = 0;
                ((mm4) obj).getClass();
                return num2.compareTo(num2);
            case 8:
                return Integer.valueOf(((RefereeStatisticsItem) obj).getAppearances()).compareTo(Integer.valueOf(((RefereeStatisticsItem) obj2).getAppearances()));
            case 9:
                return o93.b((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
            case 10:
                return Integer.valueOf(((yig) obj).a).compareTo(Integer.valueOf(((yig) obj2).a));
            case 11:
                return Integer.valueOf(((yig) obj).a).compareTo(Integer.valueOf(((yig) obj2).a));
            case 12:
                ikg ikgVar = (ikg) obj2;
                int i = Integer.MAX_VALUE;
                String str2 = ((ikg) obj).a;
                if (str2 != null) {
                    try {
                        valueOf = Integer.valueOf(Integer.parseInt(str2));
                    } catch (NumberFormatException unused) {
                    }
                    str = ikgVar.a;
                    if (str != null) {
                        try {
                            i = Integer.valueOf(Integer.parseInt(str));
                        } catch (NumberFormatException unused2) {
                        }
                    }
                    return valueOf.compareTo(i);
                }
                valueOf = i;
                str = ikgVar.a;
                if (str != null) {
                }
                return valueOf.compareTo(i);
            case 13:
                alg algVar = (alg) obj;
                alg algVar2 = (alg) obj2;
                if (algVar.b() < algVar2.b()) {
                    return -1;
                }
                return algVar.b() > algVar2.b() ? 1 : 0;
            case 14:
                return o93.b((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 15:
                return o93.b((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 16:
                return Integer.valueOf(((e93) ((Map.Entry) obj).getKey()).ordinal()).compareTo(Integer.valueOf(((e93) ((Map.Entry) obj2).getKey()).ordinal()));
            case 17:
                return Integer.valueOf(((e93) obj).ordinal()).compareTo(Integer.valueOf(((e93) obj2).ordinal()));
            case 18:
                return Long.valueOf(((PlayerSummaryEvent) obj).getTimestamp()).compareTo(Long.valueOf(((PlayerSummaryEvent) obj2).getTimestamp()));
            case 19:
                return Integer.valueOf(((ShortcutInfo) obj).getRank()).compareTo(Integer.valueOf(((ShortcutInfo) obj2).getRank()));
            case 20:
                return Long.valueOf(((Stage) obj).getStartDateTimestamp()).compareTo(Long.valueOf(((Stage) obj2).getStartDateTimestamp()));
            case 21:
                return Integer.valueOf(((RaceFlowModels$RaceEntrant) obj).f).compareTo(Integer.valueOf(((RaceFlowModels$RaceEntrant) obj2).f));
            case 22:
                return o93.b(((RaceFlowModels$RaceTeam) obj).b, ((RaceFlowModels$RaceTeam) obj2).b);
            case 23:
                return Integer.valueOf(((RaceFlowModels$RaceEntrant) obj).f).compareTo(Integer.valueOf(((RaceFlowModels$RaceEntrant) obj2).f));
            case 24:
                return Integer.valueOf(((RaceFlowModels$RaceEntrant) obj).f).compareTo(Integer.valueOf(((RaceFlowModels$RaceEntrant) obj2).f));
            case 25:
                return Integer.valueOf(((ukf) obj).b.b).compareTo(Integer.valueOf(((ukf) obj2).b.b));
            case 26:
                w3i w3iVar = w3i.d;
                return Integer.valueOf(CollectionsKt.c0(w3iVar.b, ((Stage) obj).getType())).compareTo(Integer.valueOf(CollectionsKt.c0(w3iVar.b, ((Stage) obj2).getType())));
            case 27:
                return Boolean.valueOf(!((r5c) obj).a.getKeyHighlight()).compareTo(Boolean.valueOf(!((r5c) obj2).a.getKeyHighlight()));
            case 28:
                ProviderOdds providerOdds = (ProviderOdds) obj2;
                Stage stage = providerOdds.getStage();
                if (stage != null) {
                    DayOfWeek dayOfWeek = hwc.a;
                    bool = Boolean.valueOf(hwc.f(stage));
                } else {
                    bool = null;
                }
                Boolean bool2 = Boolean.TRUE;
                Boolean valueOf3 = Boolean.valueOf(Intrinsics.c(bool, bool2) || !providerOdds.isLive());
                ProviderOdds providerOdds2 = (ProviderOdds) obj;
                Stage stage2 = providerOdds2.getStage();
                if (stage2 != null) {
                    DayOfWeek dayOfWeek2 = hwc.a;
                    r0 = Boolean.valueOf(hwc.f(stage2));
                }
                return valueOf3.compareTo(Boolean.valueOf(Intrinsics.c(r0, bool2) || !providerOdds2.isLive()));
            default:
                Integer valueOf4 = Integer.valueOf(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                return Integer.valueOf(b.j(101, valueOf4, 103, 104).indexOf(Integer.valueOf(((ProviderOdds) obj).getMarketId()))).compareTo(Integer.valueOf(b.j(101, valueOf4, 103, 104).indexOf(Integer.valueOf(((ProviderOdds) obj2).getMarketId()))));
        }
    }
}
