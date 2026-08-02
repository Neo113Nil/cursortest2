package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Size;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j0;
import com.sofascore.model.Country;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.TvType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.ManagerData;
import com.sofascore.model.mvvm.model.TournamentRoundWrapper;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.model.mvvm.model.TvChannelVote;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.model.newNetwork.TransferHistoryResponse;
import com.sofascore.model.newNetwork.TvCountryChannelsResponse;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.service.PinnedLeagueWorker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jr5 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public Object s;
    public int t;
    public int u;
    public Object v;
    public final /* synthetic */ Object w;
    public Object x;
    public Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr5(qkl qklVar, ArrayList arrayList, TournamentRoundWrapper tournamentRoundWrapper, xxi xxiVar, nn6 nn6Var, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 16;
        this.s = qklVar;
        this.v = arrayList;
        this.x = tournamentRoundWrapper;
        this.y = xxiVar;
        this.w = nn6Var;
        this.u = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0055, code lost:
    
        if (r13 == r2) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007d A[LOOP:1: B:50:0x0077->B:52:0x007d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b9  */
    /* JADX WARN: Type inference failed for: r7v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj) {
        x2g x2gVar;
        TransferHistoryResponse transferHistoryResponse;
        Iterator it;
        Object u;
        x2g x2gVar2;
        TransferHistoryResponse transferHistoryResponse2;
        List<Transfer> transferHistory;
        Iterator it2;
        Drawable drawable;
        Bitmap U;
        pxe pxeVar = (pxe) this.w;
        ku3 ku3Var = (ku3) this.v;
        lu3 lu3Var = lu3.a;
        int i = this.t;
        ?? r7 = 0;
        r7 = 0;
        if (i == 0) {
            y6a.M(obj);
            Set set = wyh.a;
            if (!wyh.d.contains((String) this.y)) {
                x2gVar = null;
                if (x2gVar != null && (transferHistoryResponse = (TransferHistoryResponse) yaa.x(x2gVar)) != null) {
                    List<Transfer> transferHistory2 = transferHistoryResponse.getTransferHistory();
                    ArrayList arrayList = new ArrayList(k13.r(transferHistory2, 10));
                    it = transferHistory2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(xw3.t(ku3Var, null, new gje(pxeVar, (Transfer) it.next(), r7, 5), 3));
                    }
                    this.v = null;
                    this.s = x2gVar;
                    this.x = pxeVar;
                    this.t = 2;
                    u = m6k.u(arrayList, this);
                    if (u != lu3Var) {
                        x2g x2gVar3 = x2gVar;
                        obj = u;
                        x2gVar2 = x2gVar3;
                        Iterable iterable = (Iterable) obj;
                        ArrayList arrayList2 = new ArrayList(k13.r(iterable, 10));
                        it2 = iterable.iterator();
                        while (it2.hasNext()) {
                        }
                        x2gVar = x2gVar2;
                        r7 = arrayList2;
                    }
                    return lu3Var;
                }
                if (x2gVar != null) {
                }
                List list = km5.a;
                if (r7 != 0) {
                }
                List list2 = km5.a;
                return new cxe(list, list2);
            }
            wve wveVar = pxeVar.b;
            int i2 = this.u;
            this.v = ku3Var;
            this.t = 1;
            wveVar.getClass();
            obj = yaa.P(new ive(wveVar, i2, r7, 9), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pxeVar = (pxe) this.x;
                x2gVar2 = (x2g) this.s;
                y6a.M(obj);
                Iterable iterable2 = (Iterable) obj;
                ArrayList arrayList22 = new ArrayList(k13.r(iterable2, 10));
                it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    nr9 b = ((wt9) it2.next()).b();
                    if (b != null) {
                        Resources resources = pxeVar.a.getResources();
                        resources.getClass();
                        drawable = rfo.t(b, resources);
                    } else {
                        drawable = null;
                    }
                    BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                    if (bitmapDrawable == null || (U = bitmapDrawable.getBitmap()) == null) {
                        drawable.getClass();
                        U = u6h.U(drawable, 0, 0, 7);
                    }
                    arrayList22.add(U);
                }
                x2gVar = x2gVar2;
                r7 = arrayList22;
                if (x2gVar != null || (transferHistoryResponse2 = (TransferHistoryResponse) yaa.x(x2gVar)) == null || (transferHistory = transferHistoryResponse2.getTransferHistory()) == null || (list = CollectionsKt.B0(transferHistory)) == null) {
                    List list3 = km5.a;
                }
                if (r7 != 0 || (list2 = CollectionsKt.B0(r7)) == null) {
                    List list22 = km5.a;
                }
                return new cxe(list3, list22);
            }
            y6a.M(obj);
        }
        x2gVar = (x2g) obj;
        if (x2gVar != null) {
            List<Transfer> transferHistory22 = transferHistoryResponse.getTransferHistory();
            ArrayList arrayList3 = new ArrayList(k13.r(transferHistory22, 10));
            it = transferHistory22.iterator();
            while (it.hasNext()) {
            }
            this.v = null;
            this.s = x2gVar;
            this.x = pxeVar;
            this.t = 2;
            u = m6k.u(arrayList3, this);
            if (u != lu3Var) {
            }
            return lu3Var;
        }
        if (x2gVar != null) {
        }
        List list32 = km5.a;
        if (r7 != 0) {
        }
        List list222 = km5.a;
        return new cxe(list32, list222);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(1:19)|25|26|27|(3:40|(1:43)|42)(1:29)|30|(1:39)|33|34|(3:36|9|cd)|23) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r2 == r7) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (((java.lang.Boolean) r2).booleanValue() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c0 -> B:9:0x00c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00f8 -> B:16:0x0036). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object f(Object obj) {
        int i;
        Throwable th;
        int i2;
        xlb xlbVar;
        Throwable th2;
        String concat;
        Object E;
        Object obj2;
        lu3 lu3Var = lu3.a;
        int i3 = this.u;
        if (i3 == 0) {
            y6a.M(obj);
            i = 0;
            th = null;
            if (!((Boolean) ((xlb) ((e1d) this.w).getValue()).e.getValue()).booleanValue()) {
            }
            if (!((Boolean) ((xlb) ((e1d) this.w).getValue()).d.getValue()).booleanValue()) {
                xlbVar = (xlb) ((e1d) this.w).getValue();
                synchronized (xlbVar) {
                }
            }
            return Unit.a;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = this.t;
            Throwable th3 = (Throwable) this.s;
            try {
                y6a.M(obj);
                th2 = th3;
                E = obj;
            } catch (Throwable th4) {
                th = th4;
                i2 = i4;
                th = th;
                i = i2 + 1;
                if (!((Boolean) ((xlb) ((e1d) this.w).getValue()).e.getValue()).booleanValue()) {
                }
                if (!((Boolean) ((xlb) ((e1d) this.w).getValue()).d.getValue()).booleanValue()) {
                }
                return Unit.a;
            }
            plb plbVar = (plb) E;
            xlb xlbVar2 = (xlb) ((e1d) this.w).getValue();
            synchronized (xlbVar2) {
            }
            plbVar.getClass();
            if (!((Boolean) xlbVar2.d.getValue()).booleanValue()) {
                ((eoh) xlbVar2.b).setValue(plbVar);
                xlbVar2.a.V(plbVar);
            }
            i = i4;
            th = th2;
            if (!((Boolean) ((xlb) ((e1d) this.w).getValue()).e.getValue()).booleanValue()) {
                if (i != 0) {
                    xf2 xf2Var = (xf2) this.v;
                    Integer num = new Integer(i);
                    th.getClass();
                    this.s = th;
                    this.t = i;
                    this.u = 1;
                    xf2Var.invoke(num, th, this);
                    obj2 = Boolean.FALSE;
                }
                i2 = i;
                th2 = th;
                Context context = (Context) this.x;
                ylb ylbVar = (ylb) this.y;
                if (StringsKt.R("fonts/")) {
                    concat = null;
                } else {
                    concat = StringsKt.L("fonts/", '/') ? "fonts/" : "fonts/".concat("/");
                }
                String str = ".ttf";
                if (!StringsKt.R(".ttf") && !c.v(".ttf", ".", false)) {
                    str = ".".concat(".ttf");
                }
                String str2 = str;
                this.s = th2;
                this.t = i2;
                this.u = 2;
                E = x2a.E(context, ylbVar, null, concat, str2, "__LottieInternalDefaultCacheKey__", this);
                if (E != lu3Var) {
                    i4 = i2;
                    plb plbVar2 = (plb) E;
                    xlb xlbVar22 = (xlb) ((e1d) this.w).getValue();
                    synchronized (xlbVar22) {
                    }
                }
                return lu3Var;
            }
            if (!((Boolean) ((xlb) ((e1d) this.w).getValue()).d.getValue()).booleanValue() && th != null) {
                xlbVar = (xlb) ((e1d) this.w).getValue();
                synchronized (xlbVar) {
                    if (!((Boolean) xlbVar.d.getValue()).booleanValue()) {
                        ((eoh) xlbVar.c).setValue(th);
                        xlbVar.a.j0(th);
                    }
                }
            }
            return Unit.a;
        }
        i = this.t;
        th = (Throwable) this.s;
        y6a.M(obj);
        obj2 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d7, code lost:
    
        if (r15 == r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d9, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b4, code lost:
    
        if (r15 == r8) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(Object obj) {
        ArrayList<TvChannel> W;
        vng vngVar = (vng) this.x;
        ku3 ku3Var = (ku3) this.v;
        lu3 lu3Var = lu3.a;
        int i = this.t;
        if (i == 0) {
            y6a.M(obj);
            Country country = (Country) this.y;
            country.getClass();
            vngVar.d = country;
            Map map = (Map) vngVar.e;
            if (map == null || map.isEmpty()) {
                TvCountryChannelsResponse tvCountryChannelsResponse = (TvCountryChannelsResponse) vngVar.f;
                vngVar.e = tvCountryChannelsResponse != null ? tvCountryChannelsResponse.getCountryChannels() : null;
            }
            Country country2 = (Country) vngVar.d;
            Map map2 = (Map) vngVar.e;
            List<Integer> list = map2 != null ? (List) map2.get(country2.getIso2Alpha()) : null;
            if (list == null) {
                list = km5.a;
            }
            country2.setChannelIds(list);
            List<Integer> channelIds = ((Country) vngVar.d).getChannelIds();
            TvType tvType = (TvType) this.w;
            int i2 = this.u;
            ArrayList arrayList = new ArrayList(k13.r(channelIds, 10));
            Iterator<T> it = channelIds.iterator();
            while (it.hasNext()) {
                arrayList.add(xw3.t(ku3Var, null, new gz6(vngVar, ((Number) it.next()).intValue(), tvType, i2, (rq3) null, 11), 3));
            }
            this.v = null;
            this.t = 1;
            obj = m6k.u(arrayList, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                W = (ArrayList) this.s;
                y6a.M(obj);
                int i3 = this.u;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (((TvChannelVote) obj2).getEventId() == i3) {
                        arrayList2.add(obj2);
                    }
                }
                int c = sub.c(k13.r(arrayList2, 10));
                if (c < 16) {
                    c = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    TvChannelVote tvChannelVote = (TvChannelVote) it2.next();
                    linkedHashMap.put(new Integer(tvChannelVote.getChannelId()), tvChannelVote.isConfirmed() ? o3k.a : o3k.b);
                }
                yzc yzcVar = (yzc) vngVar.b;
                Country country3 = (Country) vngVar.d;
                ArrayList arrayList3 = new ArrayList(k13.r(W, 10));
                for (TvChannel tvChannel : W) {
                    arrayList3.add(new i3k(tvChannel.getId(), tvChannel.getName(), tvChannel.getLink(), tvChannel.getUpvote(), tvChannel.getDownvote(), (o3k) linkedHashMap.get(new Integer(tvChannel.getId()))));
                }
                yzcVar.k(new v3k(country3, l6g.W(arrayList3)));
                return Unit.a;
            }
            y6a.M(obj);
        }
        W = CollectionsKt.W((Iterable) obj);
        z3k z3kVar = (z3k) vngVar.a;
        this.v = null;
        this.s = W;
        this.t = 2;
        obj = gz8.U(this, z3kVar.a.a, true, false, new crj(15));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r13 == r7) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(Object obj) {
        av4 t;
        EventListResponse eventListResponse;
        EventListResponse eventListResponse2;
        String str = (String) this.w;
        int i = this.u;
        onk onkVar = (onk) this.y;
        ku3 ku3Var = (ku3) this.v;
        lu3 lu3Var = lu3.a;
        int i2 = this.t;
        rq3 rq3Var = null;
        if (i2 == 0) {
            y6a.M(obj);
            av4 t2 = xw3.t(ku3Var, null, new nnk(onkVar, i, str, rq3Var, 0), 3);
            t = xw3.t(ku3Var, null, new nnk(onkVar, i, str, rq3Var, 1), 3);
            this.v = null;
            this.s = t;
            this.t = 1;
            obj = t2.w(this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                eventListResponse = (EventListResponse) this.x;
                y6a.M(obj);
                eventListResponse2 = (EventListResponse) obj;
                ArrayList arrayList = new ArrayList();
                if (eventListResponse != null) {
                    arrayList.addAll(eventListResponse.getEvents());
                }
                if (eventListResponse2 != null) {
                    arrayList.addAll(eventListResponse2.getEvents());
                }
                Collections.reverse(arrayList);
                onkVar.f.j(arrayList);
                return Unit.a;
            }
            t = (av4) this.s;
            y6a.M(obj);
        }
        EventListResponse eventListResponse3 = (EventListResponse) obj;
        this.v = null;
        this.s = null;
        this.x = eventListResponse3;
        this.t = 2;
        Object T = t.T(this);
        if (T != lu3Var) {
            obj = T;
            eventListResponse = eventListResponse3;
            eventListResponse2 = (EventListResponse) obj;
            ArrayList arrayList2 = new ArrayList();
            if (eventListResponse != null) {
            }
            if (eventListResponse2 != null) {
            }
            Collections.reverse(arrayList2);
            onkVar.f.j(arrayList2);
            return Unit.a;
        }
        return lu3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r11 == r3) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object j(Object obj) {
        av4 t;
        vel velVar;
        vel velVar2;
        List<Event> list;
        int i = this.u;
        qkl qklVar = (qkl) this.w;
        ku3 ku3Var = (ku3) this.v;
        lu3 lu3Var = lu3.a;
        int i2 = this.t;
        int i3 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i2 == 0) {
            y6a.M(obj);
            av4 t2 = xw3.t(ku3Var, null, new xjl(qklVar, i, objArr2 == true ? 1 : 0, 0), 3);
            t = xw3.t(ku3Var, null, new xjl(qklVar, i, objArr == true ? 1 : 0, i3), 3);
            velVar = vel.a;
            this.v = null;
            this.s = t;
            this.y = velVar;
            this.t = 1;
            obj = t2.w(this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = (List) this.x;
                velVar2 = (vel) this.y;
                y6a.M(obj);
                EventListResponse eventListResponse = (EventListResponse) obj;
                List<Event> events = eventListResponse != null ? eventListResponse.getEvents() : null;
                velVar2.getClass();
                return vel.c(3, list, events);
            }
            velVar = (vel) this.y;
            t = (av4) this.s;
            y6a.M(obj);
        }
        EventListResponse eventListResponse2 = (EventListResponse) obj;
        List<Event> events2 = eventListResponse2 != null ? eventListResponse2.getEvents() : null;
        this.v = null;
        this.s = null;
        this.y = velVar;
        this.x = events2;
        this.t = 2;
        Object T = t.T(this);
        if (T != lu3Var) {
            List<Event> list2 = events2;
            obj = T;
            velVar2 = velVar;
            list = list2;
            EventListResponse eventListResponse3 = (EventListResponse) obj;
            if (eventListResponse3 != null) {
            }
            velVar2.getClass();
            return vel.c(3, list, events);
        }
        return lu3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r11 == r3) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        av4 t;
        vel velVar;
        vel velVar2;
        List<Event> list;
        int i = this.u;
        tll tllVar = (tll) this.w;
        ku3 ku3Var = (ku3) this.v;
        lu3 lu3Var = lu3.a;
        int i2 = this.t;
        int i3 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i2 == 0) {
            y6a.M(obj);
            av4 t2 = xw3.t(ku3Var, null, new pll(tllVar, i, objArr2 == true ? 1 : 0, 0), 3);
            t = xw3.t(ku3Var, null, new pll(tllVar, i, objArr == true ? 1 : 0, i3), 3);
            velVar = vel.a;
            this.v = null;
            this.s = t;
            this.y = velVar;
            this.t = 1;
            obj = t2.w(this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = (List) this.x;
                velVar2 = (vel) this.y;
                y6a.M(obj);
                EventListResponse eventListResponse = (EventListResponse) obj;
                List<Event> events = eventListResponse != null ? eventListResponse.getEvents() : null;
                velVar2.getClass();
                return vel.c(2, list, events);
            }
            velVar = (vel) this.y;
            t = (av4) this.s;
            y6a.M(obj);
        }
        EventListResponse eventListResponse2 = (EventListResponse) obj;
        List<Event> events2 = eventListResponse2 != null ? eventListResponse2.getEvents() : null;
        this.v = null;
        this.s = null;
        this.y = velVar;
        this.x = events2;
        this.t = 2;
        Object T = t.T(this);
        if (T != lu3Var) {
            List<Event> list2 = events2;
            obj = T;
            velVar2 = velVar;
            list = list2;
            EventListResponse eventListResponse3 = (EventListResponse) obj;
            if (eventListResponse3 != null) {
            }
            velVar2.getClass();
            return vel.c(2, list, events);
        }
        return lu3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        if (r8 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005c -> B:9:0x00ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0066 -> B:9:0x00ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008f -> B:9:0x00ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009b -> B:6:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b2 -> B:9:0x00ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d3 -> B:9:0x00ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e7 -> B:9:0x00ec). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object l(Object obj) {
        int depth;
        String text;
        XmlPullParser xmlPullParser = (XmlPullParser) this.s;
        lu3 lu3Var = lu3.a;
        int i = this.u;
        if (i == 0) {
            y6a.M(obj);
            s9a.t((ku3) this.v);
            if (d1.B(xmlPullParser)) {
                xmlPullParser.nextTag();
            }
            if (xmlPullParser.getEventType() == 1) {
                return Unit.a;
            }
            if (xmlPullParser.getEventType() != 2) {
                pvd.r("iterateCurrentTagEvents call is allowed only for START_TAG event");
                return null;
            }
            depth = xmlPullParser.getDepth();
            if (xmlPullParser.getDepth() < depth) {
            }
        } else if (i == 1) {
            depth = this.t;
            fsf fsfVar = (fsf) this.v;
            y6a.M(obj);
            fsfVar.a = obj;
            xmlPullParser.next();
            if (xmlPullParser.getDepth() < depth) {
            }
        } else {
            if (i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            depth = this.t;
            y6a.M(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c) obj;
            if (cVar != null) {
                ((ArrayList) this.w).add(cVar);
            }
            xmlPullParser.next();
            if (xmlPullParser.getDepth() < depth) {
                return Unit.a;
            }
            int depth2 = xmlPullParser.getDepth() - depth;
            if (depth2 == 0) {
                mqi mqiVar = d1.a;
                if (xmlPullParser.getEventType() == 2) {
                    ((fsf) this.x).a = d1.u(xmlPullParser, "version");
                } else if (xmlPullParser.getEventType() == 4 && (text = xmlPullParser.getText()) != null && !StringsKt.R(text)) {
                    String text2 = xmlPullParser.getText();
                    text2.getClass();
                    StringsKt.l0(text2).toString();
                } else if (xmlPullParser.getEventType() == 3) {
                    return Unit.a;
                }
            } else if (depth2 == 1) {
                mqi mqiVar2 = d1.a;
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    if (Intrinsics.c(name, "Error")) {
                        fsf fsfVar2 = (fsf) this.y;
                        this.v = fsfVar2;
                        this.t = depth;
                        this.u = 1;
                        Object o = d1.o(xmlPullParser, this);
                        if (o != lu3Var) {
                            fsfVar2.a = o;
                        }
                        return lu3Var;
                    }
                    if (Intrinsics.c(name, "Ad")) {
                        this.v = null;
                        this.t = depth;
                        this.u = 2;
                        obj = d1.a(xmlPullParser, this);
                    }
                    if (xmlPullParser.getDepth() < depth) {
                    }
                }
            }
            xmlPullParser.next();
            if (xmlPullParser.getDepth() < depth) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        if (r10 == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        if (r10 == r1) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0067 -> B:10:0x0128). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0071 -> B:10:0x0128). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0077 -> B:10:0x0128). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008a -> B:10:0x0128). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0094 -> B:10:0x0128). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a7 -> B:10:0x0128). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a9 -> B:10:0x0128). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b8 -> B:10:0x0128). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00c6 -> B:7:0x00c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00db -> B:10:0x0128). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00f9 -> B:10:0x0128). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0110 -> B:10:0x0128). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0123 -> B:10:0x0128). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m(Object obj) {
        int depth;
        String text;
        String name;
        XmlPullParser xmlPullParser = (XmlPullParser) this.s;
        lu3 lu3Var = lu3.a;
        int i = this.u;
        if (i == 0) {
            y6a.M(obj);
            s9a.t((ku3) this.v);
            if (d1.B(xmlPullParser)) {
                xmlPullParser.nextTag();
            }
            if (xmlPullParser.getEventType() == 1) {
                return Unit.a;
            }
            if (xmlPullParser.getEventType() != 2) {
                pvd.r("iterateCurrentTagEvents call is allowed only for START_TAG event");
                return null;
            }
            depth = xmlPullParser.getDepth();
            if (xmlPullParser.getDepth() < depth) {
            }
        } else if (i == 1) {
            depth = this.t;
            fsf fsfVar = (fsf) this.v;
            y6a.M(obj);
            fsfVar.a = obj;
            xmlPullParser.next();
            if (xmlPullParser.getDepth() < depth) {
            }
        } else if (i == 2) {
            depth = this.t;
            y6a.M(obj);
            j0 j0Var = (j0) obj;
            if (j0Var != null) {
                ((ArrayList) this.y).add(j0Var);
            }
            xmlPullParser.next();
            if (xmlPullParser.getDepth() < depth) {
            }
        } else {
            if (i != 3) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            depth = this.t;
            y6a.M(obj);
            j0 j0Var2 = (j0) obj;
            if (j0Var2 != null) {
                ((ArrayList) this.w).add(j0Var2);
            }
            xmlPullParser.next();
            if (xmlPullParser.getDepth() < depth) {
                return Unit.a;
            }
            int depth2 = xmlPullParser.getDepth() - depth;
            if (depth2 == 0) {
                mqi mqiVar = d1.a;
                if (xmlPullParser.getEventType() != 2) {
                    if (xmlPullParser.getEventType() == 4 && (text = xmlPullParser.getText()) != null && !StringsKt.R(text)) {
                        String text2 = xmlPullParser.getText();
                        text2.getClass();
                        StringsKt.l0(text2).toString();
                    } else if (xmlPullParser.getEventType() == 3) {
                        return Unit.a;
                    }
                }
            } else if (depth2 == 1) {
                mqi mqiVar2 = d1.a;
                if (xmlPullParser.getEventType() == 2 && (name = xmlPullParser.getName()) != null) {
                    int hashCode = name.hashCode();
                    if (hashCode == -617879491) {
                        if (name.equals("ClickThrough")) {
                            fsf fsfVar2 = (fsf) this.x;
                            this.v = fsfVar2;
                            this.t = depth;
                            this.u = 1;
                            Object s = d1.s(xmlPullParser, this);
                            if (s != lu3Var) {
                                fsfVar2.a = s;
                            }
                            return lu3Var;
                        }
                    } else if (hashCode == -135761801) {
                        if (name.equals("CustomClick")) {
                            this.v = null;
                            this.t = depth;
                            this.u = 3;
                            obj = d1.s(xmlPullParser, this);
                        }
                    } else if (hashCode == 2107600959 && name.equals("ClickTracking")) {
                        this.v = null;
                        this.t = depth;
                        this.u = 2;
                        obj = d1.s(xmlPullParser, this);
                    }
                    if (xmlPullParser.getDepth() < depth) {
                    }
                }
            }
            xmlPullParser.next();
            if (xmlPullParser.getDepth() < depth) {
            }
        }
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                jr5 jr5Var = new jr5((List) this.x, (mr5) this.y, (Event) obj2, rq3Var, 0);
                jr5Var.v = obj;
                return jr5Var;
            case 1:
                jr5 jr5Var2 = new jr5((OddsCountryProvider) this.x, (dz5) this.y, (Event) obj2, rq3Var, 1);
                jr5Var2.v = obj;
                return jr5Var2;
            case 2:
                jr5 jr5Var3 = new jr5((yc7) this.y, (nc7) obj2, this.u, rq3Var, 2);
                jr5Var3.v = obj;
                return jr5Var3;
            case 3:
                jr5 jr5Var4 = new jr5((tu7) this.y, (List) this.x, (Event) obj2, rq3Var);
                jr5Var4.v = obj;
                return jr5Var4;
            case 4:
                return new jr5((my7) obj2, rq3Var);
            case 5:
                return new jr5((Context) this.x, (Uri) this.y, (Size) obj2, rq3Var, 5);
            case 6:
                jr5 jr5Var5 = new jr5((gya) obj2, this.u, rq3Var, 6);
                jr5Var5.v = obj;
                return jr5Var5;
            case 7:
                jr5 jr5Var6 = new jr5((osb) this.y, (ManagerData) obj2, this.u, rq3Var, 7);
                jr5Var6.v = obj;
                return jr5Var6;
            case 8:
                return new jr5((f5d) this.y, (FirebaseBundle) obj2, rq3Var, 8);
            case 9:
                jr5 jr5Var7 = new jr5((int[]) this.y, (PinnedLeagueWorker) obj2, rq3Var, 9);
                jr5Var7.v = obj;
                return jr5Var7;
            case 10:
                return new jr5((roe) obj2, this.u, rq3Var, 10);
            case 11:
                jr5 jr5Var8 = new jr5((String) this.y, (pxe) obj2, this.u, rq3Var, 11);
                jr5Var8.v = obj;
                return jr5Var8;
            case 12:
                return new jr5((xf2) this.v, (Context) this.x, (ylb) this.y, (e1d) obj2, rq3Var);
            case 13:
                jr5 jr5Var9 = new jr5((vng) this.x, (Country) this.y, (TvType) obj2, this.u, rq3Var);
                jr5Var9.v = obj;
                return jr5Var9;
            case 14:
                jr5 jr5Var10 = new jr5((onk) this.y, this.u, (String) obj2, rq3Var);
                jr5Var10.v = obj;
                return jr5Var10;
            case 15:
                jr5 jr5Var11 = new jr5((qkl) obj2, this.u, rq3Var, 15);
                jr5Var11.v = obj;
                return jr5Var11;
            case 16:
                return new jr5((qkl) this.s, (ArrayList) this.v, (TournamentRoundWrapper) this.x, (xxi) this.y, (nn6) obj2, this.u, rq3Var);
            case 17:
                jr5 jr5Var12 = new jr5((tll) obj2, this.u, rq3Var, 17);
                jr5Var12.v = obj;
                return jr5Var12;
            case 18:
                jr5 jr5Var13 = new jr5((XmlPullParser) this.s, rq3Var, (fsf) this.x, (fsf) this.y, (ArrayList) obj2, 18);
                jr5Var13.v = obj;
                return jr5Var13;
            case 19:
                jr5 jr5Var14 = new jr5((XmlPullParser) this.s, rq3Var, (fsf) this.x, (ArrayList) this.y, (ArrayList) obj2, 19);
                jr5Var14.v = obj;
                return jr5Var14;
            default:
                jr5 jr5Var15 = new jr5((XmlPullParser) this.s, rq3Var, (fsf) this.x, (fsf) this.y, (fsf) obj2, 20);
                jr5Var15.v = obj;
                return jr5Var15;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((jr5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:463:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x08c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x086c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v24, types: [km5] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r16v10, types: [and] */
    /* JADX WARN: Type inference failed for: r4v55, types: [h2d] */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30, types: [com.sofascore.model.odds.ProviderOdds] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:12:0x0131). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0080 -> B:12:0x0131). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0087 -> B:12:0x0131). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:247:0x04a4 -> B:238:0x04a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00bc -> B:8:0x00c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:412:0x07b3 -> B:408:0x078b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0119 -> B:12:0x0131). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x012c -> B:12:0x0131). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 3062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr5(tu7 tu7Var, List list, Event event, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 3;
        this.y = tu7Var;
        this.x = list;
        this.w = event;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr5(my7 my7Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 4;
        this.w = my7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr5(vng vngVar, Country country, TvType tvType, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 13;
        this.x = vngVar;
        this.y = country;
        this.w = tvType;
        this.u = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr5(onk onkVar, int i, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 14;
        this.y = onkVar;
        this.u = i;
        this.w = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr5(xf2 xf2Var, Context context, ylb ylbVar, e1d e1dVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 12;
        this.v = xf2Var;
        this.x = context;
        this.y = ylbVar;
        this.w = e1dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jr5(Object obj, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.w = obj;
        this.u = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jr5(Object obj, Object obj2, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.y = obj;
        this.w = obj2;
        this.u = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jr5(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.y = obj;
        this.w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jr5(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.x = obj;
        this.y = obj2;
        this.w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jr5(XmlPullParser xmlPullParser, rq3 rq3Var, fsf fsfVar, Serializable serializable, Serializable serializable2, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = xmlPullParser;
        this.x = fsfVar;
        this.y = serializable;
        this.w = serializable2;
    }
}
