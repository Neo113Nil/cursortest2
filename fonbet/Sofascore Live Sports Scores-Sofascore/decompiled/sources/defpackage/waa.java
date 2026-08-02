package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.MediaFormat;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.EventBestPlayer;
import com.sofascore.model.newNetwork.EventBestPlayersSummaryResponse;
import com.sofascore.model.newNetwork.FanPlayerOfTheMatchOption;
import com.sofascore.model.newNetwork.FanPlayerOfTheMatchResponse;
import com.sofascore.model.newNetwork.FanPlayerOfTheMatchStatus;
import com.sofascore.model.newNetwork.newRankings.RankingRow;
import com.sofascore.model.profile.InvitedUser;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeLeagueAsset;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.text.StringsKt;
import kotlin.text.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class waa implements gml {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    public static final j55 B(nt9 nt9Var, av4 av4Var) {
        tti ttiVar = nt9Var.c;
        if (!(ttiVar instanceof sw8)) {
            return new yia(av4Var, 8);
        }
        cvk Q = aik.Q(((sw8) ttiVar).getView());
        synchronized (Q) {
            ggf ggfVar = Q.b;
            if (ggfVar != null) {
                Bitmap.Config[] configArr = gjk.a;
                if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper()) && Q.e) {
                    Q.e = false;
                    ggfVar.b = av4Var;
                    return ggfVar;
                }
            }
            g9i g9iVar = Q.c;
            if (g9iVar != null) {
                g9iVar.e(null);
            }
            Q.c = null;
            View view = Q.a;
            ggf ggfVar2 = new ggf();
            ggfVar2.a = view;
            ggfVar2.b = av4Var;
            Q.b = ggfVar2;
            return ggfVar2;
        }
    }

    public static final void C(of3 of3Var, Integer num, Function2 function2) {
        if (((av8) of3Var).S) {
            ((av8) of3Var).b(num, function2);
        }
    }

    public static final boolean D(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        return (connectivityManager != null ? connectivityManager.getActiveNetwork() : null) != null;
    }

    public static final boolean E(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return Intrinsics.c(serialDescriptor.getKind(), nii.f) && serialDescriptor.isInline() && serialDescriptor.d() == 1;
    }

    public static final boolean F(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        return (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasTransport(1)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x01dd, code lost:
    
        if (r29.getTotalVotes() > 0) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vte G(Context context, EventBestPlayersSummaryResponse eventBestPlayersSummaryResponse, FanPlayerOfTheMatchResponse fanPlayerOfTheMatchResponse, Integer num) {
        mte mteVar;
        gv9 gv9Var;
        List<FanPlayerOfTheMatchOption> options;
        int votes;
        gv9 gv9Var2;
        Double d;
        Long closeTimestamp;
        List L0;
        EventBestPlayer playerOfTheMatch;
        context.getClass();
        List<EventBestPlayer> leaderboard = eventBestPlayersSummaryResponse != null ? eventBestPlayersSummaryResponse.getLeaderboard() : null;
        if (eventBestPlayersSummaryResponse != null && (playerOfTheMatch = eventBestPlayersSummaryResponse.getPlayerOfTheMatch()) != null) {
            Team team = playerOfTheMatch.getTeam();
            if (team == null) {
                team = playerOfTheMatch.getPlayer().getTeam();
            }
            if (team != null) {
                mteVar = N(playerOfTheMatch, context, team, playerOfTheMatch.getValue());
                if (leaderboard != null) {
                    ArrayList arrayList = new ArrayList();
                    for (EventBestPlayer eventBestPlayer : leaderboard) {
                        Team team2 = eventBestPlayer.getTeam();
                        if (team2 == null) {
                            team2 = eventBestPlayer.getPlayer().getTeam();
                        }
                        mte N = team2 != null ? N(eventBestPlayer, context, team2, eventBestPlayer.getValue()) : null;
                        if (N != null) {
                            arrayList.add(N);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        mte mteVar2 = (mte) next;
                        if (mteVar == null || mteVar2.a != mteVar.a) {
                            arrayList2.add(next);
                        }
                    }
                    List H0 = CollectionsKt.H0(arrayList2, new wpb(13));
                    if (H0 != null && (L0 = CollectionsKt.L0(H0, 3)) != null) {
                        gv9Var = l6g.W(L0);
                        if ((gv9Var != null || gv9Var.size() < 3) && fanPlayerOfTheMatchResponse == null) {
                            return null;
                        }
                        List<FanPlayerOfTheMatchOption> options2 = fanPlayerOfTheMatchResponse != null ? fanPlayerOfTheMatchResponse.getOptions() : null;
                        if (options2 == null || options2.isEmpty()) {
                            gv9 gv9Var3 = gv9Var;
                            mte mteVar3 = mteVar;
                            if (gv9Var3 != null) {
                                return new ste(mteVar3, gv9Var3, Intrinsics.c((fanPlayerOfTheMatchResponse == null || (options = fanPlayerOfTheMatchResponse.getOptions()) == null) ? null : Boolean.valueOf(options.isEmpty()), Boolean.TRUE));
                            }
                            return null;
                        }
                        int i = 0;
                        boolean z = fanPlayerOfTheMatchResponse.getStatus() != FanPlayerOfTheMatchStatus.OPEN || ((closeTimestamp = fanPlayerOfTheMatchResponse.getCloseTimestamp()) != null && closeTimestamp.longValue() <= yaa.w());
                        List<FanPlayerOfTheMatchOption> options3 = fanPlayerOfTheMatchResponse.getOptions();
                        if (options3 == null || !options3.isEmpty()) {
                            Iterator<T> it2 = options3.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                FanPlayerOfTheMatchOption fanPlayerOfTheMatchOption = (FanPlayerOfTheMatchOption) it2.next();
                                int id = fanPlayerOfTheMatchOption.getPlayer().getId();
                                if (num != null && id == num.intValue() && fanPlayerOfTheMatchOption.getVotes() == 0) {
                                    i = 1;
                                    break;
                                }
                            }
                        }
                        long totalVotes = fanPlayerOfTheMatchResponse.getTotalVotes() + i;
                        List<FanPlayerOfTheMatchOption> options4 = fanPlayerOfTheMatchResponse.getOptions();
                        ArrayList arrayList3 = new ArrayList(k13.r(options4, 10));
                        for (FanPlayerOfTheMatchOption fanPlayerOfTheMatchOption2 : options4) {
                            int id2 = fanPlayerOfTheMatchOption2.getPlayer().getId();
                            if (num != null && id2 == num.intValue()) {
                                votes = fanPlayerOfTheMatchOption2.getVotes();
                                if (votes < 1) {
                                    votes = 1;
                                }
                            } else {
                                votes = fanPlayerOfTheMatchOption2.getVotes();
                            }
                            int id3 = fanPlayerOfTheMatchOption2.getPlayer().getId();
                            String C = tba.C(fanPlayerOfTheMatchOption2.getPlayer());
                            if (C == null) {
                                C = tba.t(fanPlayerOfTheMatchOption2.getPlayer());
                            }
                            Double rating = fanPlayerOfTheMatchOption2.getRating();
                            if (totalVotes > 0) {
                                gv9Var2 = gv9Var;
                                d = Double.valueOf((votes / totalVotes) * 100.0d);
                            } else {
                                gv9Var2 = gv9Var;
                                d = null;
                            }
                            Integer valueOf = Integer.valueOf(votes);
                            int id4 = fanPlayerOfTheMatchOption2.getTeam().getId();
                            String A = tba.A(context, fanPlayerOfTheMatchOption2.getTeam());
                            if (A == null) {
                                A = tba.p(context, fanPlayerOfTheMatchOption2.getTeam());
                            }
                            arrayList3.add(new mte(id3, C, rating, d, valueOf, id4, A, fanPlayerOfTheMatchOption2.getPlayer().getGender(), fanPlayerOfTheMatchOption2.getPlayer().getPosition()));
                            gv9Var = gv9Var2;
                        }
                        gv9 gv9Var4 = gv9Var;
                        Collection collection = arrayList3;
                        if (!z) {
                            if (num != null) {
                                collection = arrayList3;
                            }
                            collection = CollectionsKt.H0(arrayList3, new wpb(14));
                        }
                        gv9 W = l6g.W(collection);
                        if (!z) {
                            return gv9Var4 != null ? new tte(mteVar, gv9Var4, num, W, s(W, num, null), fanPlayerOfTheMatchResponse.getCloseTimestamp(), totalVotes) : new ute(num, W, s(W, num, null), fanPlayerOfTheMatchResponse.getCloseTimestamp(), totalVotes);
                        }
                        mte mteVar4 = (mte) CollectionsKt.firstOrNull(W);
                        return gv9Var4 != null ? new qte(mteVar, gv9Var4, mteVar4, num, W, s(W, num, mteVar4), totalVotes) : new rte(mteVar4, num, W, s(W, num, mteVar4), totalVotes);
                    }
                }
                gv9Var = null;
                if (gv9Var != null) {
                }
                return null;
            }
        }
        mteVar = null;
        if (leaderboard != null) {
        }
        gv9Var = null;
        if (gv9Var != null) {
        }
        return null;
    }

    public static void H(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static hok I(String str) {
        String group;
        if (str == null || StringsKt.R(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (group = matcher.group(1)) == null) {
            return null;
        }
        int parseInt = Integer.parseInt(group);
        String group2 = matcher.group(2);
        if (group2 == null) {
            return null;
        }
        int parseInt2 = Integer.parseInt(group2);
        String group3 = matcher.group(3);
        if (group3 == null) {
            return null;
        }
        int parseInt3 = Integer.parseInt(group3);
        String group4 = matcher.group(4) != null ? matcher.group(4) : "";
        group4.getClass();
        return new hok(parseInt, parseInt2, parseInt3, group4);
    }

    public static final void J(of3 of3Var, Function1 function1) {
        ((av8) of3Var).b(Unit.a, new o34(13, function1));
    }

    public static final void K(of3 of3Var, Object obj, Function2 function2) {
        if (((av8) of3Var).S || !Intrinsics.c(((av8) of3Var).O(), obj)) {
            av8 av8Var = (av8) of3Var;
            av8Var.n0(obj);
            av8Var.b(obj, function2);
        }
    }

    public static void L(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(ljg.j(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static final p4b M(WeeklyChallengeLeagueAsset weeklyChallengeLeagueAsset, boolean z, boolean z2) {
        int parseColor;
        try {
            parseColor = Color.parseColor(weeklyChallengeLeagueAsset.getHex());
        } catch (Exception unused) {
            parseColor = Color.parseColor("#DD9E73");
        }
        return new p4b(z, z2, weeklyChallengeLeagueAsset.getTitle(), weeklyChallengeLeagueAsset.getImageUrl().getPng(), weeklyChallengeLeagueAsset.getLockedImageLightUrl().getPng(), weeklyChallengeLeagueAsset.getLockedImageAmoledUrl().getPng(), weeklyChallengeLeagueAsset.getLevel(), parseColor);
    }

    public static mte N(EventBestPlayer eventBestPlayer, Context context, Team team, String str) {
        int id = eventBestPlayer.getPlayer().getId();
        String C = tba.C(eventBestPlayer.getPlayer());
        if (C == null) {
            C = tba.t(eventBestPlayer.getPlayer());
        }
        Double f = str != null ? b.f(str) : null;
        int id2 = team.getId();
        String A = tba.A(context, team);
        if (A == null) {
            A = tba.p(context, team);
        }
        return new mte(id, C, f, null, null, id2, A, eventBestPlayer.getPlayer().getGender(), eventBestPlayer.getPlayer().getPosition());
    }

    public static final b7 O(List list) {
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(M((WeeklyChallengeLeagueAsset) it.next(), true, false));
        }
        return l6g.Z(arrayList);
    }

    public static final String P(String str, String str2, String str3, String str4) {
        return wt3.m(str2, " - typeMap received was ", mz1.s("Route ", str3, " could not find any NavType for argument ", str, " of type "), str4);
    }

    public static int Q(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static final void a(int i, long j, of3 of3Var, ekh ekhVar, Function2 function2) {
        List x;
        ekh ekhVar2 = ekhVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1526030150);
        Function2 function22 = function2;
        int i2 = (av8Var.g(ekhVar2) ? 4 : 2) | i | (av8Var.f(j) ? 32 : 16) | (av8Var.g(function22) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if ((i2 & 147) == 146 && av8Var.D()) {
            av8Var.W();
        } else {
            if (ekhVar2 instanceof dkh) {
                av8Var.e0(-1173540356);
                av8Var.s(false);
                x = a.c(new s75(j));
            } else {
                if (!(ekhVar2 instanceof ckh)) {
                    av8Var.e0(-1173645715);
                    av8Var.s(false);
                    zzl.b();
                    return;
                }
                av8Var.e0(-1173538668);
                if (Build.VERSION.SDK_INT >= 31) {
                    av8Var.e0(-2019914396);
                    Bundle bundle = (Bundle) av8Var.k(ch3.a);
                    av8Var.e0(-1173535336);
                    boolean f = av8Var.f(j);
                    Object O = av8Var.O();
                    if (f || O == nf3.a) {
                        O = new tjh(j);
                        av8Var.n0(O);
                    }
                    av8Var.s(false);
                    x = l98.Q(bundle, (Function0) O);
                    av8Var.s(false);
                } else {
                    av8Var.e0(-2019826759);
                    Bundle bundle2 = (Bundle) av8Var.k(ch3.a);
                    int i3 = bundle2.getInt("appWidgetMinHeight", 0);
                    int i4 = bundle2.getInt("appWidgetMaxWidth", 0);
                    s75 s75Var = null;
                    s75 s75Var2 = (i3 == 0 || i4 == 0) ? null : new s75(hz8.i(i4, i3));
                    int i5 = bundle2.getInt("appWidgetMaxHeight", 0);
                    int i6 = bundle2.getInt("appWidgetMinWidth", 0);
                    if (i5 != 0 && i6 != 0) {
                        s75Var = new s75(hz8.i(i6, i5));
                    }
                    x = ph0.x(new s75[]{s75Var2, s75Var});
                    if (((ArrayList) x).isEmpty()) {
                        x = a.c(new s75(j));
                    }
                    av8Var.s(false);
                }
                av8Var.s(false);
            }
            x.getClass();
            List S0 = CollectionsKt.S0(CollectionsKt.V0(x));
            ArrayList arrayList = new ArrayList(k13.r(S0, 10));
            Iterator it = S0.iterator();
            while (it.hasNext()) {
                j(((i2 << 3) & 112) | (i2 & 896), ((s75) it.next()).a, av8Var, ekhVar2, function22);
                arrayList.add(Unit.a);
                ekhVar2 = ekhVar;
                function22 = function2;
            }
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new sjh(i, j, ekhVar, function2);
        }
    }

    public static final long b(int i) {
        if (!(i > 0)) {
            u3a.a("The span value should be higher than 0");
        }
        return i;
    }

    public static final void c(final InvitedUser invitedUser, final int i, final Function0 function0, final xtc xtcVar, of3 of3Var, final int i2) {
        xtc xtcVar2;
        eqf u;
        Function2 function2;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1543510357);
        int i3 = i2 | (av8Var.i(invitedUser) ? 4 : 2) | (av8Var.e(i) ? 32 : 16) | (av8Var.g(xtcVar) ? com.ironsource.mediationsdk.metadata.a.o : 1024);
        if (!av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            xtcVar2 = xtcVar;
            av8Var.W();
        } else {
            if (invitedUser == null) {
                u = av8Var.u();
                if (u != null) {
                    final int i4 = 0;
                    function2 = new Function2(invitedUser, i, function0, xtcVar, i2, i4) { // from class: vaa
                        public final /* synthetic */ int a;
                        public final /* synthetic */ InvitedUser b;
                        public final /* synthetic */ int c;
                        public final /* synthetic */ Function0 d;
                        public final /* synthetic */ xtc e;

                        {
                            this.a = i4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.a) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int K = aba.K(385);
                                    waa.c(this.b, this.c, this.d, this.e, (of3) obj, K);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int K2 = aba.K(385);
                                    waa.c(this.b, this.c, this.d, this.e, (of3) obj, K2);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    u.d = function2;
                }
                return;
            }
            xtcVar2 = xtcVar;
            dfh g = ctc.g(null, av8Var, 6, 2);
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = hz8.G(g.a, av8Var);
                av8Var.n0(O);
            }
            tz9.l(true, function0, m6k.r(xtcVar2, "InvitedFriendDetailsModal", new su(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, invitedUser.isProgressFinished() ? "completed" : "pending", null)), false, g, null, null, null, yqo.H(-819078062, av8Var, new de7(i, 1, invitedUser, (ku3) O, g, function0)), av8Var, 100663350, 232);
        }
        u = av8Var.u();
        if (u != null) {
            final int i5 = 1;
            final xtc xtcVar3 = xtcVar2;
            function2 = new Function2(invitedUser, i, function0, xtcVar3, i2, i5) { // from class: vaa
                public final /* synthetic */ int a;
                public final /* synthetic */ InvitedUser b;
                public final /* synthetic */ int c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ xtc e;

                {
                    this.a = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int K = aba.K(385);
                            waa.c(this.b, this.c, this.d, this.e, (of3) obj, K);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int K2 = aba.K(385);
                            waa.c(this.b, this.c, this.d, this.e, (of3) obj, K2);
                            break;
                    }
                    return Unit.a;
                }
            };
            u.d = function2;
        }
    }

    public static final void d(InvitedUser invitedUser, int i, Function0 function0, of3 of3Var, int i2) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1936720101);
        int i3 = i2 | (av8Var2.i(invitedUser) ? 4 : 2) | (av8Var2.e(i) ? 32 : 16) | (av8Var2.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            K(av8Var2, a2, hf3.g);
            K(av8Var2, m, hf3.f);
            K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            J(av8Var2, hf3.k);
            K(av8Var2, C, hf3.d);
            xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
            String nickname = invitedUser.getNickname();
            if (nickname == null) {
                av8Var2.d0(313559991);
                nickname = oea.w(R.string.referral_friend_header, new Object[]{String.valueOf(i + 1)}, av8Var2);
            } else {
                av8Var2.d0(313559247);
            }
            av8Var2.s(false);
            yf8 yf8Var = xth.a;
            udj.c(nickname, f0, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var2, 48, 0, 131064);
            h(invitedUser, l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), av8Var2, (i3 & 14) | 48);
            mha.h(oea.v(R.string.close, av8Var2), function0, l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 1), kqh.a, null, false, false, false, 0L, 0, 0, av8Var2, ((i3 >> 3) & 112) | 3456, 0, 2032);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lj(i, i2, 23, invitedUser, function0);
        }
    }

    public static x10 e(String str, dfj dfjVar, long j, kx4 kx4Var, sf8 sf8Var, km5 km5Var, int i, int i2) {
        if ((i2 & 32) != 0) {
            km5Var = km5.a;
        }
        return new x10(new a20(str, dfjVar, km5Var, km5.a, sf8Var, kx4Var), i, 1, j);
    }

    public static final void f(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        boolean z;
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1870788731);
        int i2 = (av8Var.g(gv9Var) ? 4 : 2) | i | 48;
        int i3 = 1;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            utc utcVar = utc.a;
            xtc q = n9e.q(wnn.A(bkh.d(utcVar, 1.0f), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            K(av8Var, a2, hf3.g);
            K(av8Var, m, hf3.f);
            K(av8Var, Integer.valueOf(hashCode), hf3.j);
            J(av8Var, hf3.k);
            K(av8Var, C, hf3.d);
            av8Var.d0(2022825238);
            for (int i4 = 0; i4 < 2; i4++) {
                l8g a3 = k8g.a(ww9.b, uxf.l, av8Var, 0);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, utcVar);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                K(av8Var, a3, hf3.g);
                K(av8Var, m2, hf3.f);
                K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                J(av8Var, hf3.k);
                K(av8Var, C2, hf3.d);
                av8Var.d0(1562798487);
                for (int i5 = 0; i5 < 2; i5++) {
                    g((l9f) gv9Var.get((i4 * 2) + i5), new goa(1.0f, true), av8Var, 0);
                }
                av8Var.s(false);
                av8Var.s(true);
            }
            av8Var.s(false);
            td4.w(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.n_lv_4, av8Var), av8Var, 0, 3);
            String v = oea.v(R.string.profile_view_top_editors, av8Var);
            if (!gv9Var.isEmpty()) {
                Iterator<E> it = gv9Var.iterator();
                while (it.hasNext()) {
                    if (((l9f) it.next()).a != null) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            boolean i6 = av8Var.i(context);
            Object O = av8Var.O();
            if (i6 || O == nf3.a) {
                O = new k9f(context, i3);
                av8Var.n0(O);
            }
            xtcVar2 = utcVar;
            xtc y = tol.y(xtcVar2, z, false, false, 0L, null, (Function0) O, av8Var, 30);
            av8Var = av8Var;
            i9a.g(0, av8Var, l98.c0(y, 16.0f, 12.0f), Integer.valueOf(R.drawable.ic_top_editor_badge), v);
            av8Var.s(true);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new y81(gv9Var, xtcVar2, i, 18);
        }
    }

    public static final void g(l9f l9fVar, xtc xtcVar, of3 of3Var, int i) {
        String str;
        Long k0;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1173503728);
        int i2 = (av8Var.g(l9fVar) ? 4 : 2) | i | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xtc d0 = l98.d0(bkh.d(xtcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10.0f, 1);
            u23 a2 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.p, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            K(av8Var, a2, hf3.g);
            K(av8Var, m, hf3.f);
            K(av8Var, Integer.valueOf(hashCode), hf3.j);
            J(av8Var, hf3.k);
            K(av8Var, C, hf3.d);
            String str2 = l9fVar.a;
            if (str2 == null || (k0 = StringsKt.k0(str2)) == null) {
                str = l9fVar.a;
                if (str == null) {
                    str = "";
                }
            } else {
                str = uxf.E(k0.longValue(), 58, false);
            }
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110586);
            udj.c(l9fVar.b.a(av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.b(), av8Var, 0, 24576, 114682);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gme(l9fVar, xtcVar, i, 14);
        }
    }

    public static final void h(InvitedUser invitedUser, xtc xtcVar, of3 of3Var, int i) {
        invitedUser.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2051606559);
        int i2 = (av8Var.i(invitedUser) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            K(av8Var, a2, hf3.g);
            K(av8Var, m, hf3.f);
            K(av8Var, Integer.valueOf(hashCode), hf3.j);
            J(av8Var, hf3.k);
            K(av8Var, C, hf3.d);
            s02.u("1", R.string.referral_program_step_download, null, Boolean.valueOf(invitedUser.getCreatedAccount()), av8Var, 6, 4);
            s02.u("2", R.string.referral_program_step_favourite_player, null, Boolean.valueOf(invitedUser.getFollowPlayer()), av8Var, 6, 4);
            s02.u("3", R.string.referral_program_step_favourite_team, null, Boolean.valueOf(invitedUser.getFollowTeam()), av8Var, 6, 4);
            s02.u("4", R.string.referral_program_step_open_matches, null, Boolean.valueOf(invitedUser.getVisitEvents()), av8Var, 6, 4);
            s02.u(CampaignEx.CLICKMODE_ON, R.string.referral_program_step_use_app, null, Boolean.valueOf(invitedUser.getMetActivityThreshold()), av8Var, 6, 4);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lj(invitedUser, xtcVar, i, 22);
        }
    }

    public static final void i(boolean z, jfj jfjVar, jfj jfjVar2, boolean z2, vy8 vy8Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1165070632);
        int i2 = (av8Var.g(jfjVar) ? 32 : 16) | i | (av8Var.g(jfjVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(vy8Var) ? 16384 : 8192);
        if (av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) av8Var.k(bh3.b);
            int i3 = 4;
            vy8 X = (z2 && z) ? l98.X(vy8Var, context, 2) : (z2 || !z) ? l98.X(vy8Var, context, 6) : l98.X(vy8Var, context, 4);
            if (z2 && z) {
                i3 = 5;
            } else if (z2 || !z) {
                i3 = 3;
            }
            rd0.b(X, 0, 1, yqo.H(1195556766, av8Var, new w54(jfjVar, i3, jfjVar2, 7)), av8Var, 3072, 2);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u93(z, jfjVar, jfjVar2, z2, vy8Var, i);
        }
    }

    public static final void j(int i, long j, of3 of3Var, ekh ekhVar, Function2 function2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-53921383);
        int i2 = (av8Var.f(j) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            int i3 = i & 64;
            i2 |= av8Var.g(ekhVar) ? 32 : 16;
        }
        if (((i2 | (av8Var.g(function2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128)) & 147) == 146 && av8Var.D()) {
            av8Var.W();
        } else {
            tol.c(new gb0[]{bh3.a.a(new s75(j))}, yqo.y(-1209815847, av8Var, new sjh(function2, j, ekhVar)), av8Var, 48);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vjh(i, j, ekhVar, function2);
        }
    }

    public static final void l(final int i, final boolean z, final Bitmap bitmap, final Bitmap bitmap2, final Integer num, final jfj jfjVar, final jfj jfjVar2, final String str, final jfj jfjVar3, final jfj jfjVar4, final jfj jfjVar5, final jfj jfjVar6, final jfj jfjVar7, final jfj jfjVar8, final int i2, of3 of3Var, final int i3, final int i4) {
        int i5;
        str.getClass();
        jfjVar5.getClass();
        jfjVar6.getClass();
        jfjVar7.getClass();
        jfjVar8.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1117447301);
        int i6 = i3 | (av8Var.e(i) ? 4 : 2) | (av8Var.h(z) ? 32 : 16);
        boolean i7 = av8Var.i(bitmap);
        int i8 = NotificationCompat.FLAG_LOCAL_ONLY;
        int i9 = i6 | (i7 ? 256 : 128);
        boolean i10 = av8Var.i(bitmap2);
        int i11 = com.ironsource.mediationsdk.metadata.a.o;
        int i12 = i9 | (i10 ? 2048 : 1024) | (av8Var.g(num) ? 16384 : 8192);
        boolean g = av8Var.g(jfjVar);
        int i13 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        int i14 = i12 | (g ? 131072 : 65536) | (av8Var.g(jfjVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.g(str) ? 8388608 : 4194304) | (av8Var.g(jfjVar3) ? 67108864 : 33554432) | (av8Var.g(jfjVar4) ? 536870912 : 268435456);
        if ((i4 & 6) == 0) {
            i5 = i4 | (av8Var.g(jfjVar5) ? 4 : 2);
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= av8Var.g(jfjVar6) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            if (!av8Var.g(jfjVar7)) {
                i8 = 128;
            }
            i5 |= i8;
        }
        if ((i4 & 3072) == 0) {
            if (!av8Var.g(jfjVar8)) {
                i11 = 1024;
            }
            i5 |= i11;
        }
        if ((i4 & 24576) == 0) {
            i5 |= av8Var.e(i2) ? 16384 : 8192;
        }
        int i15 = i4 & 196608;
        ty8 ty8Var = ty8.a;
        if (i15 == 0) {
            if (av8Var.g(ty8Var)) {
                i13 = 131072;
            }
            i5 |= i13;
        }
        if (av8Var.T(i14 & 1, ((i14 & 306783379) == 306783378 && (i5 & 74899) == 74898) ? false : true)) {
            int i16 = i5 >> 9;
            z9.a(i, i2, ty8Var, yqo.H(1642125890, av8Var, new g6l(z, bitmap, num, jfjVar, 0)), yqo.H(-2018542397, av8Var, new rc7(str.equals(StatusKt.STATUS_IN_PROGRESS) || str.equals(StatusKt.STATUS_FINISHED) || str.equals(StatusKt.STATUS_WILL_CONTINUE), jfjVar3, jfjVar4, jfjVar5, jfjVar6, jfjVar7, jfjVar8)), yqo.H(-1384243388, av8Var, new g6l(z, bitmap2, num, jfjVar2, 1)), av8Var, (i14 & 14) | 224256 | (i16 & 112) | (i16 & 896));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(i, z, bitmap, bitmap2, num, jfjVar, jfjVar2, str, jfjVar3, jfjVar4, jfjVar5, jfjVar6, jfjVar7, jfjVar8, i2, i3, i4) { // from class: h6l
                public final /* synthetic */ int a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Bitmap c;
                public final /* synthetic */ Bitmap d;
                public final /* synthetic */ Integer e;
                public final /* synthetic */ jfj f;
                public final /* synthetic */ jfj g;
                public final /* synthetic */ String h;
                public final /* synthetic */ jfj i;
                public final /* synthetic */ jfj j;
                public final /* synthetic */ jfj k;
                public final /* synthetic */ jfj l;
                public final /* synthetic */ jfj m;
                public final /* synthetic */ jfj n;
                public final /* synthetic */ int o;
                public final /* synthetic */ int p;

                {
                    this.p = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    int K2 = aba.K(this.p);
                    waa.l(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (of3) obj, K, K2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void m(boolean z, jfj jfjVar, jfj jfjVar2, jfj jfjVar3, jfj jfjVar4, jfj jfjVar5, jfj jfjVar6, vy8 vy8Var, of3 of3Var, int i) {
        vy8 vy8Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-530413912);
        int i2 = i | (av8Var.h(z) ? 4 : 2) | (av8Var.g(jfjVar) ? 32 : 16) | (av8Var.g(jfjVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(jfjVar3) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var.g(jfjVar4) ? 16384 : 8192) | (av8Var.g(jfjVar5) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.g(jfjVar6) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 12582912;
        if (av8Var.T(i2 & 1, (4793491 & i2) != 4793490)) {
            vy8Var2 = ty8.a;
            nq8.g(h5a.O(nq8.A(vy8Var2), 16.0f, 2), 1, 1, yqo.H(-1378726132, av8Var, new l3k(z, jfjVar3, jfjVar4, jfjVar5, jfjVar6, jfjVar, jfjVar2)), av8Var, 3072, 0);
        } else {
            av8Var.W();
            vy8Var2 = vy8Var;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hi4(z, jfjVar, jfjVar2, jfjVar3, jfjVar4, jfjVar5, jfjVar6, vy8Var2, i);
        }
    }

    public static final void n(int i, of3 of3Var, gv9 gv9Var, xtc xtcVar, Function1 function1) {
        gv9Var.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1695625956);
        int i2 = i | (av8Var.g(xtcVar) ? 4 : 2) | (av8Var.g(gv9Var) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            xtc f0 = l98.f0(bkh.d(xtcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            u23 a2 = t23.a(new ng0(16.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            K(av8Var, C, f50Var3);
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a3 = k8g.a(ww9.h, uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            K(av8Var, a3, f50Var);
            K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            K(av8Var, C2, f50Var3);
            String v = oea.v(R.string.videos, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            String v2 = oea.v(R.string.see_more, av8Var);
            int i3 = i2 & 112;
            int i4 = i2 & 896;
            boolean z = (i3 == 32) | (i4 == 256);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = new w27(gv9Var, function1);
                av8Var.n0(O);
            }
            tz9.s(0, 0, av8Var, kda.O(utcVar, "wc26_videos_see_more", av8Var), v2, (Function0) O);
            av8Var.s(true);
            xtc d = bkh.d(utcVar, 1.0f);
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            t3e C3 = l98.C(8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            boolean z2 = (i3 == 32) | (i4 == 256);
            Object O2 = av8Var.O();
            if (z2 || O2 == a99Var) {
                O2 = new ij7(gv9Var, function1, 3);
                av8Var.n0(O2);
            }
            v8a.c(d, null, C3, ng0Var, null, null, false, null, (Function1) O2, av8Var, 24966, 490);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new tr6(xtcVar, gv9Var, function1, i);
        }
    }

    public static final void o(String str, Function1 function1, Function1 function12, Function0 function0, Function0 function02, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        boolean z;
        int i3;
        String str2;
        xtc xtcVar2;
        str.getClass();
        function1.getClass();
        function12.getClass();
        function0.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1326789996);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.i(function0) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.i(function02) ? 16384 : 8192;
        }
        int i4 = i2 | 196608;
        if ((74899 & i4) == 74898 && av8Var.D()) {
            av8Var.W();
            xtcVar2 = xtcVar;
        } else {
            mvh mvhVar = (mvh) av8Var.k(dh3.q);
            wd8 wd8Var = (wd8) av8Var.k(dh3.i);
            utc utcVar = utc.a;
            xtc d = bkh.d(utcVar, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            K(av8Var, m, ff3Var);
            f50 f50Var2 = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var2);
            }
            f50 f50Var3 = hf3.d;
            K(av8Var, C, f50Var3);
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int G2 = z8e.G(av8Var);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            K(av8Var, a3, f50Var);
            K(av8Var, m2, ff3Var);
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G2))) {
                mz1.t(G2, av8Var, G2, f50Var2);
            }
            K(av8Var, C2, f50Var3);
            xtc l = bkh.l(utcVar, 40.0f);
            qzl.a.getClass();
            ao2.h(function02, l, false, null, qzl.b, av8Var, ((i4 >> 12) & 14) | 196656);
            xtc b0 = l98.b0(new goa(1.0f, true), 16.0f);
            k1c c2 = e12.c(uxf.c, false);
            int G3 = z8e.G(av8Var);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, b0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            K(av8Var, c2, f50Var);
            K(av8Var, m3, ff3Var);
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G3))) {
                mz1.t(G3, av8Var, G3, f50Var2);
            }
            K(av8Var, C3, f50Var3);
            xtc d0 = l98.d0(n9e.q(wnn.A(bkh.e(bkh.d(utcVar, 1.0f), 32.0f), o7g.a(4.0f)), l3m.d, oyn.e), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            dfj dfjVar = new dfj(l3m.f, v8a.v(16), null, null, 0L, 0, 0, 0L, 16777212);
            pvh pvhVar = new pvh(l3m.h);
            kja kjaVar = new kja(0, 0, 3, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            av8Var.d0(478778422);
            int i5 = i4 & 14;
            boolean g = (i5 == 4) | ((i4 & 896) == 256) | av8Var.g(mvhVar) | av8Var.i(wd8Var);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                z = false;
                i3 = i4;
                str2 = str;
                lwc lwcVar = new lwc(str2, function12, mvhVar, wd8Var, 17);
                av8Var.n0(lwcVar);
                O = lwcVar;
            } else {
                str2 = str;
                z = false;
                i3 = i4;
            }
            av8Var.s(z);
            yo1.d(str2, function1, d0, false, false, dfjVar, kjaVar, new ija(null, (Function1) O, 47), true, 0, 0, null, null, null, pvhVar, yqo.H(386507159, av8Var, new r6m(str2, function0)), av8Var, 102432768 | i5 | (i3 & 112), 221184, 15896);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
            td4.w(null, 1.0f, l3m.e, av8Var, 432, 1);
            av8Var.s(true);
            xtcVar2 = utcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bi(str, function1, function12, function0, function02, xtcVar2, i, 10);
        }
    }

    public static Object p(flb flbVar, plb plbVar, int i, float f, float f2, olb olbVar, hoi hoiVar, int i2) {
        float f3;
        int d = (i2 & 2) != 0 ? flbVar.d() : 2;
        int intValue = (i2 & 4) != 0 ? ((Number) ((eoh) flbVar.c).getValue()).intValue() : i;
        boolean booleanValue = (i2 & 8) != 0 ? ((Boolean) ((eoh) flbVar.d).getValue()).booleanValue() : false;
        float f4 = (i2 & 16) != 0 ? flbVar.f() : f;
        if ((i2 & 32) != 0) {
            flbVar.c();
        }
        if ((i2 & 64) != 0) {
            float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if ((f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && plbVar == null) || (plbVar != null && f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                f5 = 1.0f;
            }
            f3 = f5;
        } else {
            f3 = f2;
        }
        Object a2 = q1d.a(flbVar.o, new blb(flbVar, d, intValue, booleanValue, f4, plbVar, f3, false, false, (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? olb.a : olbVar, null), hoiVar);
        return a2 == lu3.a ? a2 : Unit.a;
    }

    public static int q(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    public static d6j r(Context context, RankingRow rankingRow, c6j c6jVar) {
        String str;
        StringBuilder sb = new StringBuilder(yid.p(rankingRow.getPosition()));
        Double points = rankingRow.getPoints();
        Boolean bool = null;
        if (points != null) {
            double doubleValue = points.doubleValue();
            int ordinal = c6jVar.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                str = ((int) doubleValue) + " " + context.getString(R.string.tennis_points_short);
            } else {
                if (ordinal != 2 && ordinal != 3) {
                    zzl.b();
                    return null;
                }
                str = String.format(dla.d(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue)}, 1));
            }
            sb.append(" (" + str + ")");
        }
        String sb2 = sb.toString();
        Integer previousPosition = rankingRow.getPreviousPosition();
        if (previousPosition != null) {
            int intValue = previousPosition.intValue();
            Boolean valueOf = Boolean.valueOf(rankingRow.getPosition() < intValue);
            if (rankingRow.getPosition() != intValue) {
                bool = valueOf;
            }
        }
        return new d6j(sb2, bool, new mth(4, context, c6jVar, rankingRow));
    }

    public static gv9 s(gv9 gv9Var, Integer num, mte mteVar) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : gv9Var) {
            mte mteVar2 = (mte) obj2;
            if (mteVar == null || mteVar2.a != mteVar.a) {
                arrayList.add(obj2);
            }
        }
        List L0 = CollectionsKt.L0(arrayList, 3);
        if (num != null && (mteVar == null || mteVar.a != num.intValue())) {
            if (L0 == null || !L0.isEmpty()) {
                Iterator it = L0.iterator();
                while (it.hasNext()) {
                    if (((mte) it.next()).a == num.intValue()) {
                        break;
                    }
                }
            }
            Iterator<E> it2 = gv9Var.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((mte) obj).a == num.intValue()) {
                    break;
                }
            }
            mte mteVar3 = (mte) obj;
            if (mteVar3 != null) {
                L0 = CollectionsKt.x0(CollectionsKt.T(L0), mteVar3);
            }
        }
        return l6g.W(L0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        if (r8 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final b8d t(SerialDescriptor serialDescriptor, Map map) {
        Object obj;
        b8d b8dVar;
        boolean equals;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            KType kType = (KType) obj;
            serialDescriptor.getClass();
            kType.getClass();
            if (serialDescriptor.b() != kType.isMarkedNullable()) {
                equals = false;
            } else {
                KSerializer T = sha.T(h6h.a, kType);
                if (T == null) {
                    vp2.b(serialDescriptor.h(), "]. If applicable, custom KSerializers for custom and third-party KType is currently not supported when declared directly on a class field via @Serializable(with = ...). Please use @Serializable or @Serializable(with = ...) on the class or object declaration.", "Cannot find KSerializer for [");
                    return null;
                }
                equals = serialDescriptor.equals(T.getDescriptor());
            }
            if (equals) {
                break;
            }
        }
        KType kType2 = (KType) obj;
        b8d b8dVar2 = kType2 != null ? (b8d) map.get(kType2) : null;
        if (b8dVar2 == null) {
            b8dVar2 = null;
        }
        k8k k8kVar = k8k.s;
        if (b8dVar2 == null) {
            serialDescriptor.getClass();
            switch (t6a.M(serialDescriptor).ordinal()) {
                case 0:
                    b8dVar = b8d.b;
                    b8dVar2 = b8dVar;
                    break;
                case 1:
                    b8dVar = l98.h;
                    b8dVar2 = b8dVar;
                    break;
                case 2:
                    b8dVar = b8d.l;
                    b8dVar2 = b8dVar;
                    break;
                case 3:
                    b8dVar = l98.i;
                    b8dVar2 = b8dVar;
                    break;
                case 4:
                    b8dVar = l98.j;
                    b8dVar2 = b8dVar;
                    break;
                case 5:
                    b8dVar = l98.k;
                    b8dVar2 = b8dVar;
                    break;
                case 6:
                    b8dVar = b8d.i;
                    b8dVar2 = b8dVar;
                    break;
                case 7:
                    b8dVar = l98.l;
                    b8dVar2 = b8dVar;
                    break;
                case 8:
                    b8dVar = b8d.f;
                    b8dVar2 = b8dVar;
                    break;
                case 9:
                    b8dVar = l98.m;
                    b8dVar2 = b8dVar;
                    break;
                case 10:
                    b8dVar = l98.n;
                    b8dVar2 = b8dVar;
                    break;
                case 11:
                    b8dVar = b8d.o;
                    b8dVar2 = b8dVar;
                    break;
                case 12:
                    b8dVar = b8d.d;
                    b8dVar2 = b8dVar;
                    break;
                case 13:
                    b8dVar = b8d.m;
                    b8dVar2 = b8dVar;
                    break;
                case 14:
                    b8dVar = l98.q;
                    b8dVar2 = b8dVar;
                    break;
                case 15:
                    b8dVar = b8d.j;
                    b8dVar2 = b8dVar;
                    break;
                case 16:
                    b8dVar = b8d.g;
                    b8dVar2 = b8dVar;
                    break;
                case 17:
                    int ordinal = t6a.M(serialDescriptor.g(0)).ordinal();
                    if (ordinal != 10) {
                        if (ordinal == 11) {
                            b8dVar = l98.o;
                        }
                        b8dVar2 = k8kVar;
                        break;
                    } else {
                        b8dVar = b8d.p;
                    }
                    b8dVar2 = b8dVar;
                    break;
                case 18:
                    int ordinal2 = t6a.M(serialDescriptor.g(0)).ordinal();
                    if (ordinal2 == 0) {
                        b8dVar = b8d.e;
                    } else if (ordinal2 == 2) {
                        b8dVar = b8d.n;
                    } else if (ordinal2 == 4) {
                        b8dVar = l98.r;
                    } else if (ordinal2 == 6) {
                        b8dVar = b8d.k;
                    } else if (ordinal2 == 8) {
                        b8dVar = b8d.h;
                    } else if (ordinal2 == 19) {
                        b8dVar2 = new x7a(y6a.B(serialDescriptor.g(0)));
                        break;
                    } else if (ordinal2 != 10) {
                        if (ordinal2 == 11) {
                            b8dVar = l98.p;
                        }
                        b8dVar2 = k8kVar;
                        break;
                    } else {
                        b8dVar = b8d.q;
                    }
                    b8dVar2 = b8dVar;
                    break;
                case 19:
                    Class B = y6a.B(serialDescriptor);
                    if (!Parcelable.class.isAssignableFrom(B)) {
                        if (!Enum.class.isAssignableFrom(B)) {
                            if (!Serializable.class.isAssignableFrom(B)) {
                                b8dVar2 = null;
                                break;
                            } else {
                                b8dVar2 = new a8d(B);
                                break;
                            }
                        } else {
                            b8dVar2 = new w7d(B);
                            break;
                        }
                    } else {
                        b8dVar2 = new y7d(B);
                        break;
                    }
                case 20:
                    Class B2 = y6a.B(serialDescriptor);
                    if (Enum.class.isAssignableFrom(B2)) {
                        b8dVar2 = new y7a(B2);
                        break;
                    }
                    b8dVar2 = k8kVar;
                    break;
                default:
                    b8dVar2 = k8kVar;
                    break;
            }
        }
        if (b8dVar2.equals(k8kVar)) {
            return null;
        }
        return b8dVar2;
    }

    public static StaticLayout u(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            s3a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            s3a.a("invalid end value");
        }
        if (i3 < 0) {
            s3a.a("invalid maxLines value");
        }
        if (i < 0) {
            s3a.a("invalid width value");
        }
        if (i4 < 0) {
            s3a.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i3);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i4);
        obtain.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i6);
        obtain.setHyphenationFrequency(i9);
        obtain.setIndents(null, null);
        obtain.setJustificationMode(i5);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            c90.T(obtain);
        }
        if (i10 >= 33) {
            z9.B(obtain, i7, i8);
        }
        if (i10 >= 35) {
            li5.a(obtain);
        }
        return obtain.build();
    }

    public static final long v() {
        return Thread.currentThread().getId();
    }

    public static final lec w(yzc yzcVar) {
        lec lecVar;
        yzcVar.getClass();
        asf asfVar = new asf();
        asfVar.a = true;
        if (yzcVar.e != keb.k) {
            asfVar.a = false;
            lecVar = new lec(yzcVar.d());
            lecVar.l = new uog();
        } else {
            lecVar = new lec();
        }
        lecVar.l(yzcVar, new ygi(7, new dvi(29, lecVar, asfVar)));
        return lecVar;
    }

    public static final int y(KSerializer kSerializer) {
        int hashCode = kSerializer.getDescriptor().h().hashCode();
        int d = kSerializer.getDescriptor().d();
        for (int i = 0; i < d; i++) {
            hashCode = (hashCode * 31) + kSerializer.getDescriptor().e(i).hashCode();
        }
        return hashCode;
    }

    public static final String z(Object obj, LinkedHashMap linkedHashMap) {
        obj.getClass();
        KSerializer R = sha.R(duf.a.getOrCreateKotlinClass(obj.getClass()));
        y7g y7gVar = new y7g(R, linkedHashMap);
        R.serialize(y7gVar, obj);
        Map p = tub.p(y7gVar.r);
        ujg ujgVar = new ujg(R);
        yya yyaVar = new yya(19, p, ujgVar);
        int d = R.getDescriptor().d();
        for (int i = 0; i < d; i++) {
            String e = R.getDescriptor().e(i);
            b8d b8dVar = (b8d) linkedHashMap.get(e);
            if (b8dVar == null) {
                hc5.f(dmi.j(']', "Cannot locate NavType for argument [", e));
                return null;
            }
            yyaVar.invoke(Integer.valueOf(i), e, b8dVar);
        }
        return ((String) ujgVar.c) + ((String) ujgVar.d) + ((String) ujgVar.e);
    }

    public int A() {
        return 10;
    }

    @Override // defpackage.gml
    public lw1 k(String str, int i, EnumMap enumMap) {
        if (str.isEmpty()) {
            a70.p("Found empty contents");
            return null;
        }
        int A = A();
        cn5 cn5Var = cn5.f;
        if (enumMap.containsKey(cn5Var)) {
            A = Integer.parseInt(enumMap.get(cn5Var).toString());
        }
        boolean[] x = x(str);
        int length = x.length;
        int i2 = A + length;
        int max = Math.max(200, i2);
        int max2 = Math.max(1, 200);
        int i3 = max / i2;
        int i4 = (max - (length * i3)) / 2;
        lw1 lw1Var = new lw1(max, max2);
        int i5 = 0;
        while (i5 < length) {
            if (x[i5]) {
                lw1Var.c(i4, 0, i3, max2);
            }
            i5++;
            i4 += i3;
        }
        return lw1Var;
    }

    public abstract boolean[] x(String str);
}
