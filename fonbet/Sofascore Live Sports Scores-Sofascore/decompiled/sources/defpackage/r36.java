package defpackage;

import android.app.Application;
import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.Tweet;
import com.sofascore.model.network.response.TweetsResponse;
import com.sofascore.model.newNetwork.EventMediaNews;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.model.newNetwork.WSCStoriesResponse;
import com.sofascore.model.newNetwork.WSCStory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lr36;", "Lw41;", "Lcom/sofascore/model/mvvm/model/Event;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class r36 extends w41 {
    public final t9c p;
    public final iqk q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r36(Application application, t9c t9cVar, iqk iqkVar) {
        super(application);
        t9cVar.getClass();
        iqkVar.getClass();
        this.p = t9cVar;
        this.q = iqkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.w41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(rq3 rq3Var) {
        p36 p36Var;
        int i;
        if (rq3Var instanceof p36) {
            p36Var = (p36) rq3Var;
            int i2 = p36Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p36Var.t = i2 - Integer.MIN_VALUE;
                Object obj = p36Var.r;
                lu3 lu3Var = lu3.a;
                i = p36Var.t;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj);
                    int id = ((Event) u()).getId();
                    p36Var.t = 1;
                    obj = s9a.r(new qu1(this, id, rq3Var2, 6), p36Var);
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
                return Boolean.valueOf(!((Collection) obj).isEmpty());
            }
        }
        p36Var = new p36(this, (sq3) rq3Var);
        Object obj2 = p36Var.r;
        lu3 lu3Var2 = lu3.a;
        i = p36Var.t;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
        return Boolean.valueOf(!((Collection) obj2).isEmpty());
    }

    @Override // defpackage.w41
    public final Object B(t41 t41Var) {
        return this.p.l(((Event) u()).getId(), t41Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.w41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(rq3 rq3Var) {
        q36 q36Var;
        int i;
        if (rq3Var instanceof q36) {
            q36Var = (q36) rq3Var;
            int i2 = q36Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q36Var.t = i2 - Integer.MIN_VALUE;
                Object obj = q36Var.r;
                Object obj2 = lu3.a;
                i = q36Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    q36Var.t = 1;
                    obj = x(q36Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Boolean.valueOf(!((Collection) obj).isEmpty());
            }
        }
        q36Var = new q36(this, (sq3) rq3Var);
        Object obj3 = q36Var.r;
        Object obj22 = lu3.a;
        i = q36Var.t;
        if (i != 0) {
        }
        return Boolean.valueOf(!((Collection) obj3).isEmpty());
    }

    @Override // defpackage.w41
    public final Object D(t41 t41Var) {
        return this.p.m(((Event) u()).getId(), t41Var);
    }

    @Override // defpackage.w41
    public final Object E(t41 t41Var) {
        return this.q.b(((Event) u()).getId(), this.m, t41Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.w41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(rq3 rq3Var) {
        j36 j36Var;
        int i;
        WSCStoriesResponse wSCStoriesResponse;
        List<WSCStory> sportVideoHighlights;
        if (rq3Var instanceof j36) {
            j36Var = (j36) rq3Var;
            int i2 = j36Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j36Var.t = i2 - Integer.MIN_VALUE;
                Object obj = j36Var.r;
                Object obj2 = lu3.a;
                i = j36Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    int id = ((Event) u()).getId();
                    String c = dv3.c();
                    j36Var.t = 1;
                    obj = this.q.a(id, c, j36Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                wSCStoriesResponse = (WSCStoriesResponse) obj;
                if (wSCStoriesResponse != null || (sportVideoHighlights = wSCStoriesResponse.getSportVideoHighlights()) == null) {
                    return km5.a;
                }
                ArrayList arrayList = new ArrayList(k13.r(sportVideoHighlights, 10));
                for (WSCStory wSCStory : sportVideoHighlights) {
                    arrayList.add(wSCStory.getStoryUrl() != null ? new o5c(wSCStory, ((Event) u()).getId(), ((Event) u()).getSportSlug()) : new n5c(wSCStory, ((Event) u()).getId(), ((Event) u()).getSportSlug()));
                }
                return arrayList;
            }
        }
        j36Var = new j36(this, (sq3) rq3Var);
        Object obj3 = j36Var.r;
        Object obj22 = lu3.a;
        i = j36Var.t;
        if (i != 0) {
        }
        wSCStoriesResponse = (WSCStoriesResponse) obj3;
        if (wSCStoriesResponse != null) {
        }
        return km5.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063 A[LOOP:0: B:11:0x005d->B:13:0x0063, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.w41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(rq3 rq3Var) {
        l36 l36Var;
        int i;
        Iterator it;
        if (rq3Var instanceof l36) {
            l36Var = (l36) rq3Var;
            int i2 = l36Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l36Var.t = i2 - Integer.MIN_VALUE;
                Object obj = l36Var.r;
                lu3 lu3Var = lu3.a;
                i = l36Var.t;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj);
                    int id = ((Event) u()).getId();
                    l36Var.t = 1;
                    obj = s9a.r(new qu1(this, id, rq3Var2, 6), l36Var);
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
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(new r5c((Highlight) it.next(), false, false, 0, new Integer(((Event) u()).getId()), 46));
                }
                return CollectionsKt.H0(arrayList, new cp(new y73(28), 11));
            }
        }
        l36Var = new l36(this, (sq3) rq3Var);
        Object obj2 = l36Var.r;
        lu3 lu3Var2 = lu3.a;
        i = l36Var.t;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(k13.r(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return CollectionsKt.H0(arrayList2, new cp(new y73(28), 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.w41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(rq3 rq3Var) {
        m36 m36Var;
        int i;
        List list;
        if (rq3Var instanceof m36) {
            m36Var = (m36) rq3Var;
            int i2 = m36Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m36Var.t = i2 - Integer.MIN_VALUE;
                Object obj = m36Var.r;
                lu3 lu3Var = lu3.a;
                i = m36Var.t;
                ArrayList arrayList = null;
                if (i != 0) {
                    y6a.M(obj);
                    int id = ((Event) u()).getId();
                    m36Var.t = 1;
                    obj = this.p.a(id, m36Var);
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
        m36Var = new m36(this, (sq3) rq3Var);
        Object obj2 = m36Var.r;
        lu3 lu3Var2 = lu3.a;
        i = m36Var.t;
        ArrayList arrayList2 = null;
        if (i != 0) {
        }
        list = (List) obj2;
        if (list != null) {
        }
        if (arrayList2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.w41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(rq3 rq3Var) {
        n36 n36Var;
        int i;
        Iterator it;
        a6c a6cVar;
        if (rq3Var instanceof n36) {
            n36Var = (n36) rq3Var;
            int i2 = n36Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n36Var.t = i2 - Integer.MIN_VALUE;
                Object obj = n36Var.r;
                lu3 lu3Var = lu3.a;
                i = n36Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    ArrayList arrayList = dv3.a;
                    Country b = dv3.b(new Integer(ke0.c));
                    String iso2Alpha = b != null ? b.getIso2Alpha() : null;
                    Event event = (Event) u();
                    n36Var.t = 1;
                    obj = s9a.r(new i36(iso2Alpha, this, event, null), n36Var);
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
                ArrayList arrayList2 = new ArrayList();
                for (c9g c9gVar : (List) obj) {
                    String str = c9gVar.b;
                    String str2 = c9gVar.f;
                    if (str == null || str2 == null) {
                        a6cVar = null;
                    } else {
                        String str3 = c9gVar.a;
                        if (str3 == null) {
                            str3 = fc6.C();
                        }
                        String str4 = str3;
                        String str5 = c9gVar.h;
                        String str6 = str5 == null ? "" : str5;
                        String str7 = c9gVar.d;
                        a6cVar = new a6c(new f9g(str4, str, str2, str6, str7 == null ? "" : str7, c9gVar.e != null ? rik.h(rik.w(c9gVar), bi4.PATTERN_DDMMY) : ""));
                    }
                    if (a6cVar != null) {
                        arrayList2.add(a6cVar);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (hashSet.add(((a6c) next).a.a)) {
                        arrayList3.add(next);
                    }
                }
                return arrayList3;
            }
        }
        n36Var = new n36(this, (sq3) rq3Var);
        Object obj2 = n36Var.r;
        lu3 lu3Var2 = lu3.a;
        i = n36Var.t;
        if (i != 0) {
        }
        ArrayList arrayList22 = new ArrayList();
        while (r13.hasNext()) {
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList32 = new ArrayList();
        it = arrayList22.iterator();
        while (it.hasNext()) {
        }
        return arrayList32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084 A[LOOP:0: B:15:0x007e->B:17:0x0084, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8 A[RETURN] */
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
        o36 o36Var;
        int i;
        ?? r3;
        TweetsResponse tweetsResponse;
        List<Tweet> tweets;
        Iterator it;
        if (rq3Var instanceof o36) {
            o36Var = (o36) rq3Var;
            int i2 = o36Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o36Var.t = i2 - Integer.MIN_VALUE;
                Object obj = o36Var.r;
                lu3 lu3Var = lu3.a;
                i = o36Var.t;
                r3 = 0;
                r3 = 0;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    Boolean bool = y05.a;
                    if (y05.a(i())) {
                        return km5.a;
                    }
                    int id = ((Event) u()).getId();
                    o36Var.t = 1;
                    t9c t9cVar = this.p;
                    t9cVar.getClass();
                    obj = yaa.P(new a9c(t9cVar, id, r3, i3), o36Var);
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
                        r3.add(new e6c(o3a.Q((Tweet) it.next(), ((Event) u()).getId(), "event")));
                    }
                }
                return r3 != 0 ? km5.a : r3;
            }
        }
        o36Var = new o36(this, (sq3) rq3Var);
        Object obj2 = o36Var.r;
        lu3 lu3Var2 = lu3.a;
        i = o36Var.t;
        r3 = 0;
        r3 = 0;
        int i32 = 1;
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
}
