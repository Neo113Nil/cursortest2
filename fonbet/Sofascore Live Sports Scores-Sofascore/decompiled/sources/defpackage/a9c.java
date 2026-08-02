package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a9c extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ t9c t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a9c(t9c t9cVar, int i, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = t9cVar;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        t9c t9cVar = this.t;
        switch (i) {
            case 0:
                return new a9c(t9cVar, i2, rq3Var, 0);
            case 1:
                return new a9c(t9cVar, i2, rq3Var, 1);
            case 2:
                return new a9c(t9cVar, i2, rq3Var, 2);
            case 3:
                return new a9c(t9cVar, i2, rq3Var, 3);
            case 4:
                return new a9c(t9cVar, i2, rq3Var, 4);
            case 5:
                return new a9c(t9cVar, i2, rq3Var, 5);
            case 6:
                return new a9c(t9cVar, i2, rq3Var, 6);
            case 7:
                return new a9c(t9cVar, i2, rq3Var, 7);
            case 8:
                return new a9c(t9cVar, i2, rq3Var, 8);
            case 9:
                return new a9c(t9cVar, i2, rq3Var, 9);
            case 10:
                return new a9c(t9cVar, i2, rq3Var, 10);
            case 11:
                return new a9c(t9cVar, i2, rq3Var, 11);
            case 12:
                return new a9c(t9cVar, i2, rq3Var, 12);
            case 13:
                return new a9c(t9cVar, i2, rq3Var, 13);
            case 14:
                return new a9c(t9cVar, i2, rq3Var, 14);
            case 15:
                return new a9c(t9cVar, i2, rq3Var, 15);
            case 16:
                return new a9c(t9cVar, i2, rq3Var, 16);
            case 17:
                return new a9c(t9cVar, i2, rq3Var, 17);
            case 18:
                return new a9c(t9cVar, i2, rq3Var, 18);
            default:
                return new a9c(t9cVar, i2, rq3Var, 19);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((a9c) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        t9c t9cVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI = t9cVar.a;
                this.s = 1;
                Object eventMediaNews = networkCoroutineAPI.getEventMediaNews(i2, this);
                return eventMediaNews == lu3Var ? lu3Var : eventMediaNews;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI2 = t9cVar.a;
                this.s = 1;
                Object eventTweets = networkCoroutineAPI2.getEventTweets(i2, this);
                return eventTweets == lu3Var2 ? lu3Var2 : eventTweets;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI3 = t9cVar.a;
                this.s = 1;
                Object highlights = networkCoroutineAPI3.getHighlights(i2, this);
                return highlights == lu3Var3 ? lu3Var3 : highlights;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI4 = t9cVar.a;
                this.s = 1;
                Object highlights2 = networkCoroutineAPI4.getHighlights(i2, this);
                return highlights2 == lu3Var4 ? lu3Var4 : highlights2;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI5 = t9cVar.a;
                this.s = 1;
                Object playerHighlights = networkCoroutineAPI5.getPlayerHighlights(i2, this);
                return playerHighlights == lu3Var5 ? lu3Var5 : playerHighlights;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI6 = t9cVar.a;
                this.s = 1;
                Object playerMediaNews = networkCoroutineAPI6.getPlayerMediaNews(i2, this);
                return playerMediaNews == lu3Var6 ? lu3Var6 : playerMediaNews;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i9 = this.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI7 = t9cVar.a;
                this.s = 1;
                Object playerVideos = networkCoroutineAPI7.getPlayerVideos(i2, this);
                return playerVideos == lu3Var7 ? lu3Var7 : playerVideos;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i10 = this.s;
                if (i10 != 0) {
                    if (i10 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI8 = t9cVar.a;
                this.s = 1;
                Object teamMediaNews = networkCoroutineAPI8.getTeamMediaNews(i2, this);
                return teamMediaNews == lu3Var8 ? lu3Var8 : teamMediaNews;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i11 = this.s;
                if (i11 != 0) {
                    if (i11 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI9 = t9cVar.a;
                this.s = 1;
                Object teamRssFeed = networkCoroutineAPI9.getTeamRssFeed(i2, this);
                return teamRssFeed == lu3Var9 ? lu3Var9 : teamRssFeed;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i12 = this.s;
                if (i12 != 0) {
                    if (i12 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI10 = t9cVar.a;
                this.s = 1;
                Object teamTweets = networkCoroutineAPI10.getTeamTweets(i2, this);
                return teamTweets == lu3Var10 ? lu3Var10 : teamTweets;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i13 = this.s;
                if (i13 != 0) {
                    if (i13 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI11 = t9cVar.a;
                this.s = 1;
                Object teamVideos = networkCoroutineAPI11.getTeamVideos(i2, this);
                return teamVideos == lu3Var11 ? lu3Var11 : teamVideos;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i14 = this.s;
                if (i14 != 0) {
                    if (i14 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI12 = t9cVar.a;
                this.s = 1;
                Object uniqueTournamentNews = networkCoroutineAPI12.uniqueTournamentNews(i2, this);
                return uniqueTournamentNews == lu3Var12 ? lu3Var12 : uniqueTournamentNews;
            case 12:
                lu3 lu3Var13 = lu3.a;
                int i15 = this.s;
                if (i15 != 0) {
                    if (i15 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI13 = t9cVar.a;
                this.s = 1;
                Object hasEventNews = networkCoroutineAPI13.hasEventNews(i2, this);
                return hasEventNews == lu3Var13 ? lu3Var13 : hasEventNews;
            case 13:
                lu3 lu3Var14 = lu3.a;
                int i16 = this.s;
                if (i16 != 0) {
                    if (i16 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI14 = t9cVar.a;
                this.s = 1;
                Object hasEventTweets = networkCoroutineAPI14.hasEventTweets(i2, this);
                return hasEventTweets == lu3Var14 ? lu3Var14 : hasEventTweets;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i17 = this.s;
                if (i17 != 0) {
                    if (i17 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI15 = t9cVar.a;
                this.s = 1;
                Object hasPlayerHighlights = networkCoroutineAPI15.hasPlayerHighlights(i2, this);
                return hasPlayerHighlights == lu3Var15 ? lu3Var15 : hasPlayerHighlights;
            case 15:
                lu3 lu3Var16 = lu3.a;
                int i18 = this.s;
                if (i18 != 0) {
                    if (i18 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI16 = t9cVar.a;
                this.s = 1;
                Object hasPlayerNews = networkCoroutineAPI16.hasPlayerNews(i2, this);
                return hasPlayerNews == lu3Var16 ? lu3Var16 : hasPlayerNews;
            case 16:
                lu3 lu3Var17 = lu3.a;
                int i19 = this.s;
                if (i19 != 0) {
                    if (i19 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI17 = t9cVar.a;
                this.s = 1;
                Object hasPlayerVideos = networkCoroutineAPI17.hasPlayerVideos(i2, this);
                return hasPlayerVideos == lu3Var17 ? lu3Var17 : hasPlayerVideos;
            case 17:
                lu3 lu3Var18 = lu3.a;
                int i20 = this.s;
                if (i20 != 0) {
                    if (i20 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI18 = t9cVar.a;
                this.s = 1;
                Object hasTeamNews = networkCoroutineAPI18.hasTeamNews(i2, this);
                return hasTeamNews == lu3Var18 ? lu3Var18 : hasTeamNews;
            case 18:
                lu3 lu3Var19 = lu3.a;
                int i21 = this.s;
                if (i21 != 0) {
                    if (i21 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI19 = t9cVar.a;
                this.s = 1;
                Object hasTeamTweets = networkCoroutineAPI19.hasTeamTweets(i2, this);
                return hasTeamTweets == lu3Var19 ? lu3Var19 : hasTeamTweets;
            default:
                lu3 lu3Var20 = lu3.a;
                int i22 = this.s;
                if (i22 != 0) {
                    if (i22 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI20 = t9cVar.a;
                this.s = 1;
                Object hasTeamVideos = networkCoroutineAPI20.hasTeamVideos(i2, this);
                return hasTeamVideos == lu3Var20 ? lu3Var20 : hasTeamVideos;
        }
    }
}
