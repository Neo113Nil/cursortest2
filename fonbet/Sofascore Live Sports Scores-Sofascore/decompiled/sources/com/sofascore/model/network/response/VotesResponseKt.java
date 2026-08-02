package com.sofascore.model.network.response;

import com.sofascore.model.newNetwork.FirstTeamToScoreOptions;
import com.sofascore.model.newNetwork.MmaPostMatchVotingOptions;
import com.sofascore.model.newNetwork.WhoWillWinOptions;
import com.sofascore.model.newNetwork.WillBothTeamsScoreOptions;
import defpackage.k13;
import defpackage.wzb;
import defpackage.yhk;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\b\u001a\u001a\u0010\t\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r*\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a\u0014\u0010\u0010\u001a\u00020\u0007*\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0013\u001a\u001a\u0010\t\u001a\u00020\u0001*\u00020\u00122\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0013\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0012\u001a\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r*\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a\u0014\u0010\u0010\u001a\u00020\u0012*\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0015\u001a\u001a\u0010\t\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\n\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u0015\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0014\u001a\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r*\u00020\u00142\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a\u0014\u0010\u0010\u001a\u00020\u0014*\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0014\u001a\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\r*\b\u0012\u0004\u0012\u00020\u00170\r\u001a1\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00190\r\"\u0004\b\u0000\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00190\r2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u0002H\u0019¢\u0006\u0002\u0010\u001c¨\u0006\u001d"}, d2 = {"addVote", "", "Lcom/sofascore/model/network/response/MmaPostMatchVote;", "choice", "Lcom/sofascore/model/newNetwork/MmaPostMatchVotingOptions;", "getTotalVotes", "", "Lcom/sofascore/model/network/response/WillBothTeamsScoreVote;", "Lcom/sofascore/model/newNetwork/WillBothTeamsScoreOptions;", "changeVote", "oldVote", "newVote", "getVotingPercentage", "", "shouldReverseTeams", "", "correctVotesFromRemote", "localVote", "Lcom/sofascore/model/network/response/FirstTeamToScoreVote;", "Lcom/sofascore/model/newNetwork/FirstTeamToScoreOptions;", "Lcom/sofascore/model/network/response/Vote;", "Lcom/sofascore/model/newNetwork/WhoWillWinOptions;", "correctFinalPercentages", "", "copyWith", "T", "index", "newItem", "(Ljava/util/List;ILjava/lang/Object;)Ljava/util/List;", "model_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VotesResponseKt {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[MmaPostMatchVotingOptions.values().length];
            try {
                iArr[MmaPostMatchVotingOptions.FIRST_FIGHTER_WIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MmaPostMatchVotingOptions.SECOND_FIGHTER_WIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[WillBothTeamsScoreOptions.values().length];
            try {
                iArr2[WillBothTeamsScoreOptions.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[WillBothTeamsScoreOptions.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[FirstTeamToScoreOptions.values().length];
            try {
                iArr3[FirstTeamToScoreOptions.HOME_TEAM_SCORE_FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[FirstTeamToScoreOptions.AWAY_TEAM_SCORE_FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[FirstTeamToScoreOptions.NO_GOAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[WhoWillWinOptions.values().length];
            try {
                iArr4[WhoWillWinOptions.HOME_TEAM_WIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[WhoWillWinOptions.DRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[WhoWillWinOptions.AWAY_TEAM_WIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final void addVote(@NotNull Vote vote, @NotNull WhoWillWinOptions whoWillWinOptions) {
        vote.getClass();
        whoWillWinOptions.getClass();
        int i = WhenMappings.$EnumSwitchMapping$3[whoWillWinOptions.ordinal()];
        if (i == 1) {
            vote.setVote1(vote.getVote1() + 1);
            return;
        }
        if (i == 2) {
            Integer voteX = vote.getVoteX();
            vote.setVoteX(Integer.valueOf((voteX != null ? voteX.intValue() : 0) + 1));
        } else if (i == 3) {
            vote.setVote2(vote.getVote2() + 1);
        } else {
            zzl.b();
        }
    }

    public static final void changeVote(@NotNull Vote vote, @NotNull WhoWillWinOptions whoWillWinOptions, @NotNull WhoWillWinOptions whoWillWinOptions2) {
        int i;
        vote.getClass();
        whoWillWinOptions.getClass();
        whoWillWinOptions2.getClass();
        int i2 = WhenMappings.$EnumSwitchMapping$3[whoWillWinOptions.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                Integer voteX = vote.getVoteX();
                if ((voteX != null ? voteX.intValue() : 0) > 0) {
                    i = Integer.valueOf((vote.getVoteX() != null ? r3.intValue() : 1) - 1);
                } else {
                    i = 0;
                }
                vote.setVoteX(i);
            } else if (i2 != 3) {
                zzl.b();
                return;
            } else if (vote.getVote2() > 0) {
                vote.setVote2(vote.getVote2() - 1);
            }
        } else if (vote.getVote1() > 0) {
            vote.setVote1(vote.getVote1() - 1);
        }
        addVote(vote, whoWillWinOptions2);
    }

    @NotNull
    public static final <T> List<T> copyWith(@NotNull List<? extends T> list, int i, T t) {
        list.getClass();
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        int i2 = 0;
        for (T t2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            if (i2 == i) {
                t2 = t;
            }
            arrayList.add(t2);
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> correctFinalPercentages(@NotNull List<Double> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(wzb.a(((Number) it.next()).doubleValue())));
        }
        int K0 = CollectionsKt.K0(arrayList);
        if (K0 == 100) {
            return arrayList;
        }
        Iterator<T> it2 = list.iterator();
        if (!it2.hasNext()) {
            yhk.d();
            return null;
        }
        Object next = it2.next();
        if (it2.hasNext()) {
            double doubleValue = ((Number) next).doubleValue() % 1.0d;
            do {
                Object next2 = it2.next();
                double doubleValue2 = ((Number) next2).doubleValue() % 1.0d;
                if (Double.compare(doubleValue, doubleValue2) < 0) {
                    next = next2;
                    doubleValue = doubleValue2;
                }
            } while (it2.hasNext());
        }
        int indexOf = list.indexOf(Double.valueOf(((Number) next).doubleValue()));
        return copyWith(arrayList, indexOf, Integer.valueOf(((Number) arrayList.get(indexOf == -1 ? 0 : indexOf)).intValue() + (K0 < 100 ? 1 : -1)));
    }

    @NotNull
    public static final Vote correctVotesFromRemote(@NotNull Vote vote, @Nullable Vote vote2) {
        Integer valueOf;
        Integer voteX;
        Integer voteX2;
        Integer voteX3;
        vote.getClass();
        int max = Math.max(vote2 != null ? vote2.getVote1() : 0, (vote.getVote1() - (vote2 != null ? vote2.getVote2() : 0)) - ((vote2 == null || (voteX3 = vote2.getVoteX()) == null) ? 0 : voteX3.intValue()));
        if (max < 0) {
            max = 0;
        }
        int max2 = Math.max(vote2 != null ? vote2.getVote2() : 0, (vote.getVote2() - (vote2 != null ? vote2.getVote1() : 0)) - ((vote2 == null || (voteX2 = vote2.getVoteX()) == null) ? 0 : voteX2.intValue()));
        if (max2 < 0) {
            max2 = 0;
        }
        if (vote.getVoteX() == null) {
            valueOf = null;
        } else {
            int intValue = (vote2 == null || (voteX = vote2.getVoteX()) == null) ? 0 : voteX.intValue();
            Integer voteX4 = vote.getVoteX();
            int max3 = Math.max(intValue, ((voteX4 != null ? voteX4.intValue() : 0) - (vote2 != null ? vote2.getVote1() : 0)) - (vote2 != null ? vote2.getVote2() : 0));
            valueOf = Integer.valueOf(max3 >= 0 ? max3 : 0);
        }
        return new Vote(max, max2, valueOf);
    }

    public static final int getTotalVotes(@NotNull Vote vote) {
        vote.getClass();
        int abs = Math.abs(vote.getVote2()) + Math.abs(vote.getVote1());
        Integer voteX = vote.getVoteX();
        return Math.abs(voteX != null ? voteX.intValue() : 0) + abs;
    }

    @NotNull
    public static final List<Integer> getVotingPercentage(@NotNull Vote vote, boolean z) {
        vote.getClass();
        int totalVotes = getTotalVotes(vote);
        if (totalVotes <= 0) {
            return b.j(0, 0, 0);
        }
        Integer valueOf = Integer.valueOf(vote.getVote1());
        if (z) {
            valueOf = null;
        }
        double intValue = valueOf != null ? valueOf.intValue() : vote.getVote2();
        double d = totalVotes;
        return correctFinalPercentages(b.j(Double.valueOf((intValue / d) * 100.0d), Double.valueOf(((vote.getVoteX() != null ? r7.intValue() : 0.0d) / d) * 100.0d), Double.valueOf((((z ? null : Integer.valueOf(vote.getVote2())) != null ? r2.intValue() : vote.getVote1()) / d) * 100.0d)));
    }

    public static /* synthetic */ List getVotingPercentage$default(WillBothTeamsScoreVote willBothTeamsScoreVote, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return getVotingPercentage(willBothTeamsScoreVote, z);
    }

    public static /* synthetic */ List getVotingPercentage$default(FirstTeamToScoreVote firstTeamToScoreVote, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return getVotingPercentage(firstTeamToScoreVote, z);
    }

    public static /* synthetic */ List getVotingPercentage$default(Vote vote, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return getVotingPercentage(vote, z);
    }

    public static final int getTotalVotes(@NotNull WillBothTeamsScoreVote willBothTeamsScoreVote) {
        willBothTeamsScoreVote.getClass();
        return Math.abs(willBothTeamsScoreVote.getVoteNo()) + Math.abs(willBothTeamsScoreVote.getVoteYes());
    }

    public static final int getTotalVotes(@NotNull FirstTeamToScoreVote firstTeamToScoreVote) {
        firstTeamToScoreVote.getClass();
        return Math.abs(firstTeamToScoreVote.getVoteNoGoal()) + Math.abs(firstTeamToScoreVote.getVoteAway()) + Math.abs(firstTeamToScoreVote.getVoteHome());
    }

    public static final int getTotalVotes(@NotNull MmaPostMatchVote mmaPostMatchVote) {
        mmaPostMatchVote.getClass();
        return Math.abs(mmaPostMatchVote.getVote2()) + Math.abs(mmaPostMatchVote.getVote1());
    }

    public static final void addVote(@NotNull WillBothTeamsScoreVote willBothTeamsScoreVote, @NotNull WillBothTeamsScoreOptions willBothTeamsScoreOptions) {
        willBothTeamsScoreVote.getClass();
        willBothTeamsScoreOptions.getClass();
        int i = WhenMappings.$EnumSwitchMapping$1[willBothTeamsScoreOptions.ordinal()];
        if (i == 1) {
            willBothTeamsScoreVote.setVoteYes(willBothTeamsScoreVote.getVoteYes() + 1);
        } else if (i == 2) {
            willBothTeamsScoreVote.setVoteNo(willBothTeamsScoreVote.getVoteNo() + 1);
        } else {
            zzl.b();
        }
    }

    public static final void addVote(@NotNull FirstTeamToScoreVote firstTeamToScoreVote, @NotNull FirstTeamToScoreOptions firstTeamToScoreOptions) {
        firstTeamToScoreVote.getClass();
        firstTeamToScoreOptions.getClass();
        int i = WhenMappings.$EnumSwitchMapping$2[firstTeamToScoreOptions.ordinal()];
        if (i == 1) {
            firstTeamToScoreVote.setVoteHome(firstTeamToScoreVote.getVoteHome() + 1);
            return;
        }
        if (i == 2) {
            firstTeamToScoreVote.setVoteAway(firstTeamToScoreVote.getVoteAway() + 1);
        } else if (i == 3) {
            firstTeamToScoreVote.setVoteNoGoal(firstTeamToScoreVote.getVoteNoGoal() + 1);
        } else {
            zzl.b();
        }
    }

    public static final void addVote(@NotNull MmaPostMatchVote mmaPostMatchVote, @NotNull MmaPostMatchVotingOptions mmaPostMatchVotingOptions) {
        mmaPostMatchVote.getClass();
        mmaPostMatchVotingOptions.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[mmaPostMatchVotingOptions.ordinal()];
        if (i == 1) {
            mmaPostMatchVote.setVote1(mmaPostMatchVote.getVote1() + 1);
        } else if (i == 2) {
            mmaPostMatchVote.setVote2(mmaPostMatchVote.getVote2() + 1);
        } else {
            zzl.b();
        }
    }

    public static final void changeVote(@NotNull FirstTeamToScoreVote firstTeamToScoreVote, @NotNull FirstTeamToScoreOptions firstTeamToScoreOptions, @NotNull FirstTeamToScoreOptions firstTeamToScoreOptions2) {
        firstTeamToScoreVote.getClass();
        firstTeamToScoreOptions.getClass();
        firstTeamToScoreOptions2.getClass();
        int i = WhenMappings.$EnumSwitchMapping$2[firstTeamToScoreOptions.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (firstTeamToScoreVote.getVoteNoGoal() > 0) {
                        firstTeamToScoreVote.setVoteNoGoal(firstTeamToScoreVote.getVoteNoGoal() - 1);
                    }
                } else {
                    zzl.b();
                    return;
                }
            } else if (firstTeamToScoreVote.getVoteAway() > 0) {
                firstTeamToScoreVote.setVoteAway(firstTeamToScoreVote.getVoteAway() - 1);
            }
        } else if (firstTeamToScoreVote.getVoteHome() > 0) {
            firstTeamToScoreVote.setVoteHome(firstTeamToScoreVote.getVoteHome() - 1);
        }
        addVote(firstTeamToScoreVote, firstTeamToScoreOptions2);
    }

    public static final void changeVote(@NotNull WillBothTeamsScoreVote willBothTeamsScoreVote, @NotNull WillBothTeamsScoreOptions willBothTeamsScoreOptions, @NotNull WillBothTeamsScoreOptions willBothTeamsScoreOptions2) {
        willBothTeamsScoreVote.getClass();
        willBothTeamsScoreOptions.getClass();
        willBothTeamsScoreOptions2.getClass();
        int i = WhenMappings.$EnumSwitchMapping$1[willBothTeamsScoreOptions.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (willBothTeamsScoreVote.getVoteNo() > 0) {
                    willBothTeamsScoreVote.setVoteNo(willBothTeamsScoreVote.getVoteNo() - 1);
                }
            } else {
                zzl.b();
                return;
            }
        } else if (willBothTeamsScoreVote.getVoteYes() > 0) {
            willBothTeamsScoreVote.setVoteYes(willBothTeamsScoreVote.getVoteYes() - 1);
        }
        addVote(willBothTeamsScoreVote, willBothTeamsScoreOptions2);
    }

    @NotNull
    public static final List<Integer> getVotingPercentage(@NotNull FirstTeamToScoreVote firstTeamToScoreVote, boolean z) {
        firstTeamToScoreVote.getClass();
        int totalVotes = getTotalVotes(firstTeamToScoreVote);
        if (totalVotes > 0) {
            Integer valueOf = Integer.valueOf(firstTeamToScoreVote.getVoteHome());
            if (z) {
                valueOf = null;
            }
            double intValue = valueOf != null ? valueOf.intValue() : firstTeamToScoreVote.getVoteAway();
            double d = totalVotes;
            return correctFinalPercentages(b.j(Double.valueOf((intValue / d) * 100.0d), Double.valueOf((firstTeamToScoreVote.getVoteNoGoal() / d) * 100.0d), Double.valueOf((((z ? null : Integer.valueOf(firstTeamToScoreVote.getVoteAway())) != null ? r2.intValue() : firstTeamToScoreVote.getVoteHome()) / d) * 100.0d)));
        }
        return b.j(0, 0, 0);
    }

    @NotNull
    public static final List<Integer> getVotingPercentage(@NotNull WillBothTeamsScoreVote willBothTeamsScoreVote, boolean z) {
        willBothTeamsScoreVote.getClass();
        int totalVotes = getTotalVotes(willBothTeamsScoreVote);
        if (totalVotes > 0) {
            Integer valueOf = Integer.valueOf(willBothTeamsScoreVote.getVoteYes());
            if (z) {
                valueOf = null;
            }
            double intValue = valueOf != null ? valueOf.intValue() : willBothTeamsScoreVote.getVoteNo();
            double d = totalVotes;
            return correctFinalPercentages(b.j(Double.valueOf((intValue / d) * 100.0d), Double.valueOf((((z ? null : Integer.valueOf(willBothTeamsScoreVote.getVoteNo())) != null ? r2.intValue() : willBothTeamsScoreVote.getVoteYes()) / d) * 100.0d)));
        }
        return b.j(0, 0, 0);
    }

    @NotNull
    public static final FirstTeamToScoreVote correctVotesFromRemote(@NotNull FirstTeamToScoreVote firstTeamToScoreVote, @Nullable FirstTeamToScoreVote firstTeamToScoreVote2) {
        firstTeamToScoreVote.getClass();
        int max = Math.max(firstTeamToScoreVote2 != null ? firstTeamToScoreVote2.getVoteHome() : 0, (firstTeamToScoreVote.getVoteHome() - (firstTeamToScoreVote2 != null ? firstTeamToScoreVote2.getVoteNoGoal() : 0)) - (firstTeamToScoreVote2 != null ? firstTeamToScoreVote2.getVoteAway() : 0));
        if (max < 0) {
            max = 0;
        }
        int max2 = Math.max(firstTeamToScoreVote2 != null ? firstTeamToScoreVote2.getVoteNoGoal() : 0, (firstTeamToScoreVote.getVoteNoGoal() - (firstTeamToScoreVote2 != null ? firstTeamToScoreVote2.getVoteHome() : 0)) - (firstTeamToScoreVote2 != null ? firstTeamToScoreVote2.getVoteAway() : 0));
        if (max2 < 0) {
            max2 = 0;
        }
        int max3 = Math.max(firstTeamToScoreVote2 != null ? firstTeamToScoreVote2.getVoteAway() : 0, (firstTeamToScoreVote.getVoteAway() - (firstTeamToScoreVote2 != null ? firstTeamToScoreVote2.getVoteHome() : 0)) - (firstTeamToScoreVote2 != null ? firstTeamToScoreVote2.getVoteNoGoal() : 0));
        return new FirstTeamToScoreVote(max, max2, max3 >= 0 ? max3 : 0);
    }

    @NotNull
    public static final WillBothTeamsScoreVote correctVotesFromRemote(@NotNull WillBothTeamsScoreVote willBothTeamsScoreVote, @Nullable WillBothTeamsScoreVote willBothTeamsScoreVote2) {
        willBothTeamsScoreVote.getClass();
        int max = Math.max(willBothTeamsScoreVote2 != null ? willBothTeamsScoreVote2.getVoteYes() : 0, willBothTeamsScoreVote.getVoteYes() - (willBothTeamsScoreVote2 != null ? willBothTeamsScoreVote2.getVoteNo() : 0));
        if (max < 0) {
            max = 0;
        }
        int max2 = Math.max(willBothTeamsScoreVote2 != null ? willBothTeamsScoreVote2.getVoteNo() : 0, willBothTeamsScoreVote.getVoteNo() - (willBothTeamsScoreVote2 != null ? willBothTeamsScoreVote2.getVoteYes() : 0));
        return new WillBothTeamsScoreVote(max, max2 >= 0 ? max2 : 0);
    }
}
