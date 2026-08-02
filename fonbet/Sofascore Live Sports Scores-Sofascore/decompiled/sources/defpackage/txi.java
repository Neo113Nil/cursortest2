package defpackage;

import android.app.Application;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.local_persistance.BrandingTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.Tweet;
import com.sofascore.model.network.response.TweetsResponse;
import com.sofascore.model.newNetwork.EventMediaNews;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.model.newNetwork.VideoHighlight;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ltxi;", "Lw41;", "Lcom/sofascore/model/mvvm/model/Team;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class txi extends w41 {
    public final t9c p;
    public final joa q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txi(Application application, t9c t9cVar) {
        super(application);
        t9cVar.getClass();
        this.p = t9cVar;
        this.q = ypa.a(ysa.c, new deh(19, application, this));
    }

    @Override // defpackage.w41
    public final Object A(rq3 rq3Var) {
        return this.p.s(((Team) u()).getId(), (sq3) rq3Var);
    }

    @Override // defpackage.w41
    public final Object B(t41 t41Var) {
        return this.p.q(((Team) u()).getId(), t41Var);
    }

    @Override // defpackage.w41
    public final Object D(t41 t41Var) {
        return this.p.r(((Team) u()).getId(), t41Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.w41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(rq3 rq3Var) {
        qxi qxiVar;
        int i;
        List<VideoHighlight> list;
        if (rq3Var instanceof qxi) {
            qxiVar = (qxi) rq3Var;
            int i2 = qxiVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qxiVar.t = i2 - Integer.MIN_VALUE;
                Object obj = qxiVar.r;
                lu3 lu3Var = lu3.a;
                i = qxiVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    int id = ((Team) u()).getId();
                    qxiVar.t = 1;
                    obj = this.p.j(id, qxiVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                list = (List) obj;
                if (list != null) {
                    return km5.a;
                }
                ArrayList arrayList = new ArrayList(k13.r(list, 10));
                for (VideoHighlight videoHighlight : list) {
                    int id2 = videoHighlight.getId();
                    String title = videoHighlight.getTitle();
                    String str = title == null ? "" : title;
                    String description = videoHighlight.getDescription();
                    arrayList.add(new r5c(new Highlight(id2, str, description == null ? "" : description, videoHighlight.getThumbnailUrl(), videoHighlight.getUrl(), Intrinsics.c(videoHighlight.getEmbeddable(), Boolean.TRUE) ? 6 : 1, false, null, 0L, videoHighlight.getUrl(), Boolean.FALSE, null, a.o, null), false, false, 0, new Integer(((Team) u()).getId()), 46));
                }
                return arrayList;
            }
        }
        qxiVar = new qxi(this, (sq3) rq3Var);
        Object obj2 = qxiVar.r;
        lu3 lu3Var2 = lu3.a;
        i = qxiVar.t;
        if (i != 0) {
        }
        list = (List) obj2;
        if (list != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.w41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(rq3 rq3Var) {
        rxi rxiVar;
        int i;
        List list;
        if (rq3Var instanceof rxi) {
            rxiVar = (rxi) rq3Var;
            int i2 = rxiVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rxiVar.t = i2 - Integer.MIN_VALUE;
                Object obj = rxiVar.r;
                lu3 lu3Var = lu3.a;
                i = rxiVar.t;
                ArrayList arrayList = null;
                if (i != 0) {
                    y6a.M(obj);
                    int id = ((Team) u()).getId();
                    rxiVar.t = 1;
                    obj = this.p.i(id, rxiVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                list = (List) obj;
                if (list != null) {
                    arrayList = new ArrayList(k13.r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new w5c((EventMediaNews) it.next()));
                    }
                }
                return (arrayList != null || arrayList.isEmpty()) ? km5.a : arrayList;
            }
        }
        rxiVar = new rxi(this, (sq3) rq3Var);
        Object obj2 = rxiVar.r;
        lu3 lu3Var2 = lu3.a;
        i = rxiVar.t;
        ArrayList arrayList2 = null;
        if (i != 0) {
        }
        list = (List) obj2;
        if (list != null) {
        }
        if (arrayList2 != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086 A[LOOP:0: B:15:0x0080->B:17:0x0086, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r3v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // defpackage.w41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(rq3 rq3Var) {
        sxi sxiVar;
        int i;
        ?? r3;
        TweetsResponse tweetsResponse;
        List<Tweet> tweets;
        Iterator it;
        if (rq3Var instanceof sxi) {
            sxiVar = (sxi) rq3Var;
            int i2 = sxiVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sxiVar.t = i2 - Integer.MIN_VALUE;
                Object obj = sxiVar.r;
                lu3 lu3Var = lu3.a;
                i = sxiVar.t;
                r3 = 0;
                r3 = 0;
                if (i != 0) {
                    y6a.M(obj);
                    Boolean bool = y05.a;
                    if (y05.a(i())) {
                        return km5.a;
                    }
                    int id = ((Team) u()).getId();
                    sxiVar.t = 1;
                    t9c t9cVar = this.p;
                    t9cVar.getClass();
                    obj = yaa.P(new a9c(t9cVar, id, r3, 9), sxiVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                tweetsResponse = (TweetsResponse) yaa.x((x2g) obj);
                if (tweetsResponse != null && (tweets = tweetsResponse.getTweets()) != null) {
                    r3 = new ArrayList(k13.r(tweets, 10));
                    it = tweets.iterator();
                    while (it.hasNext()) {
                        r3.add(new e6c(o3a.Q((Tweet) it.next(), ((Team) u()).getId(), "team")));
                    }
                }
                return r3 != 0 ? km5.a : r3;
            }
        }
        sxiVar = new sxi(this, (sq3) rq3Var);
        Object obj2 = sxiVar.r;
        lu3 lu3Var2 = lu3.a;
        i = sxiVar.t;
        r3 = 0;
        r3 = 0;
        if (i != 0) {
        }
        tweetsResponse = (TweetsResponse) yaa.x((x2g) obj2);
        if (tweetsResponse != null) {
            r3 = new ArrayList(k13.r(tweets, 10));
            it = tweets.iterator();
            while (it.hasNext()) {
            }
        }
        if (r3 != 0) {
        }
    }

    @Override // defpackage.w41
    public final Boolean z() {
        return Boolean.valueOf(tz9.G((BrandingTeam) this.q.getValue()));
    }
}
