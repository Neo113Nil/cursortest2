package defpackage;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u;
import com.sofascore.model.Sports;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Lineups;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.network.response.EventResponse;
import com.sofascore.model.network.response.EventStatisticsGroup;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.model.network.response.EventStatisticsPeriod;
import com.sofascore.model.network.response.EventStatisticsResponse;
import com.sofascore.model.network.response.FootballPlayerEventStatistics;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class x7c extends hoi implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int r = 0;
    public int s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ boolean v;
    public Object w;
    public final /* synthetic */ Serializable x;
    public Object y;
    public Serializable z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7c(XmlPullParser xmlPullParser, rq3 rq3Var, fsf fsfVar, fsf fsfVar2, fsf fsfVar3, fsf fsfVar4, fsf fsfVar5, boolean z) {
        super(2, rq3Var);
        this.w = xmlPullParser;
        this.x = fsfVar;
        this.y = fsfVar2;
        this.z = fsfVar3;
        this.A = fsfVar4;
        this.B = fsfVar5;
        this.v = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.B;
        Object obj3 = this.A;
        Serializable serializable = this.x;
        switch (i) {
            case 0:
                x7c x7cVar = new x7c((MediaPost) obj3, (Event) serializable, (u8c) obj2, this.v, rq3Var);
                x7cVar.u = obj;
                return x7cVar;
            default:
                x7c x7cVar2 = new x7c((XmlPullParser) this.w, rq3Var, (fsf) serializable, (fsf) this.y, (fsf) this.z, (fsf) obj3, (fsf) obj2, this.v);
                x7cVar2.u = obj;
                return x7cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((x7c) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:230:0x01ce, code lost:
    
        if (r3 == r11) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        if (r13 == r11) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
    
        if (r13 == r11) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0075 -> B:15:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007f -> B:15:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0086 -> B:15:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a5 -> B:14:0x00d8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00bd -> B:8:0x00c2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x013c -> B:15:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x014f -> B:15:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00d7 -> B:14:0x00d8). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int intValue;
        Event event;
        Object w;
        Object w2;
        av4 av4Var;
        int i;
        EventStatisticsResponse eventStatisticsResponse;
        List<EventStatisticsPeriod> statistics;
        EventStatisticsPeriod eventStatisticsPeriod;
        List<EventStatisticsGroup> groups;
        Object T;
        Event event2;
        ArrayList arrayList;
        LineupsResponse lineupsResponse;
        Double d;
        Double d2;
        List a;
        String slug;
        Lineups awayLineups$default;
        List<PlayerData> players;
        Lineups homeLineups$default;
        List<PlayerData> players2;
        int depth;
        fsf fsfVar;
        Object obj2;
        Object obj3;
        String text;
        int i2 = this.r;
        Object obj4 = this.A;
        Serializable serializable = this.x;
        boolean z = this.v;
        Object obj5 = this.B;
        int i3 = 3;
        int i4 = 2;
        rq3 rq3Var = null;
        switch (i2) {
            case 0:
                u8c u8cVar = (u8c) obj5;
                Context context = u8cVar.a;
                MediaPost mediaPost = (MediaPost) obj4;
                ku3 ku3Var = (ku3) this.u;
                lu3 lu3Var = lu3.a;
                int i5 = this.t;
                int i6 = 0;
                if (i5 == 0) {
                    y6a.M(obj);
                    Integer eventId = mediaPost.getEventId();
                    if (eventId == null) {
                        return null;
                    }
                    intValue = eventId.intValue();
                    av4 t = xw3.t(ku3Var, null, new w7c(u8cVar, intValue, rq3Var, i6), 3);
                    event = (Event) serializable;
                    if (event == null) {
                        this.u = ku3Var;
                        this.s = intValue;
                        this.t = 1;
                        w = t.w(this);
                        break;
                    }
                    av4 t2 = xw3.t(ku3Var, null, new s7c(u8cVar, event, rq3Var, i3), 3);
                    av4 t3 = xw3.t(ku3Var, null, new s7c(u8cVar, event, rq3Var, i4), 3);
                    this.u = null;
                    this.w = event;
                    this.y = t3;
                    this.s = intValue;
                    this.t = 2;
                    w2 = t2.w(this);
                    if (w2 != lu3Var) {
                        int i7 = intValue;
                        av4Var = t3;
                        i = i7;
                        eventStatisticsResponse = (EventStatisticsResponse) w2;
                        return eventStatisticsResponse != null ? null : null;
                    }
                    return lu3Var;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        i = this.s;
                        av4 av4Var2 = (av4) this.y;
                        Event event3 = (Event) this.w;
                        y6a.M(obj);
                        av4Var = av4Var2;
                        event = event3;
                        w2 = obj;
                        eventStatisticsResponse = (EventStatisticsResponse) w2;
                        if (eventStatisticsResponse != null || (statistics = eventStatisticsResponse.getStatistics()) == null || (eventStatisticsPeriod = statistics.get(0)) == null || (groups = eventStatisticsPeriod.getGroups()) == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList(k13.r(groups, 10));
                        for (EventStatisticsGroup eventStatisticsGroup : groups) {
                            Iterator<T> it = eventStatisticsGroup.getStatisticsItems().iterator();
                            while (it.hasNext()) {
                                ((EventStatisticsItem) it.next()).setShouldReverseTeams(event.shouldReverseTeams());
                            }
                            arrayList2.add(eventStatisticsGroup);
                        }
                        this.u = null;
                        this.w = event;
                        this.y = null;
                        this.z = arrayList2;
                        this.s = i;
                        this.t = 3;
                        T = av4Var.T(this);
                        if (T != lu3Var) {
                            event2 = event;
                            arrayList = arrayList2;
                            lineupsResponse = (LineupsResponse) T;
                            if (lineupsResponse != null) {
                            }
                            d = null;
                            if (lineupsResponse != null) {
                            }
                            d2 = null;
                            Set set = t4c.a;
                            Sport sport = mediaPost.getSport();
                            a = t4c.a(8, sport == null ? sport.getSlug() : null, arrayList, hkg.c0(context), z);
                            if (a != null) {
                            }
                        }
                        return lu3Var;
                    }
                    if (i5 != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = (ArrayList) this.z;
                    Event event4 = (Event) this.w;
                    y6a.M(obj);
                    event2 = event4;
                    T = obj;
                    lineupsResponse = (LineupsResponse) T;
                    if (lineupsResponse != null || (homeLineups$default = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null)) == null || (players2 = homeLineups$default.getPlayers()) == null) {
                        d = null;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator<T> it2 = players2.iterator();
                        while (it2.hasNext()) {
                            FootballPlayerEventStatistics footballStatistics = ((PlayerData) it2.next()).getFootballStatistics();
                            Double rating = footballStatistics != null ? footballStatistics.getRating() : null;
                            if (rating != null) {
                                arrayList3.add(rating);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            if (((Number) next).doubleValue() > 0.0d) {
                                arrayList4.add(next);
                            }
                        }
                        d = new Double(CollectionsKt.O(arrayList4));
                    }
                    if (lineupsResponse != null || (awayLineups$default = LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null)) == null || (players = awayLineups$default.getPlayers()) == null) {
                        d2 = null;
                    } else {
                        ArrayList arrayList5 = new ArrayList();
                        Iterator<T> it4 = players.iterator();
                        while (it4.hasNext()) {
                            FootballPlayerEventStatistics footballStatistics2 = ((PlayerData) it4.next()).getFootballStatistics();
                            Double rating2 = footballStatistics2 != null ? footballStatistics2.getRating() : null;
                            if (rating2 != null) {
                                arrayList5.add(rating2);
                            }
                        }
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it5 = arrayList5.iterator();
                        while (it5.hasNext()) {
                            Object next2 = it5.next();
                            if (((Number) next2).doubleValue() > 0.0d) {
                                arrayList6.add(next2);
                            }
                        }
                        d2 = new Double(CollectionsKt.O(arrayList6));
                    }
                    Set set2 = t4c.a;
                    Sport sport2 = mediaPost.getSport();
                    a = t4c.a(8, sport2 == null ? sport2.getSlug() : null, arrayList, hkg.c0(context), z);
                    if (a != null) {
                        return null;
                    }
                    int id = mediaPost.getId();
                    long createdAtTimestamp = mediaPost.getCreatedAtTimestamp();
                    Sport sport3 = mediaPost.getSport();
                    bx7 F = uxf.F(event2, context, true, Intrinsics.c(sport3 != null ? sport3.getSlug() : null, Sports.TENNIS), ((d == null || !Double.isNaN(d.doubleValue())) && !Intrinsics.c(event2.getSportSlug(), Sports.BASKETBALL)) ? d : null, ((d2 == null || !Double.isNaN(d2.doubleValue())) && !Intrinsics.c(event2.getSportSlug(), Sports.BASKETBALL)) ? d2 : null, 4);
                    Sport sport4 = mediaPost.getSport();
                    if (sport4 == null || (slug = sport4.getSlug()) == null) {
                        return null;
                    }
                    return new wa6(id, null, null, createdAtTimestamp, slug, F, l6g.W(a), new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
                }
                int i8 = this.s;
                y6a.M(obj);
                intValue = i8;
                w = obj;
                EventResponse eventResponse = (EventResponse) yaa.x((x2g) w);
                event = eventResponse != null ? eventResponse.getEvent() : null;
                if (event == null) {
                    return null;
                }
                av4 t22 = xw3.t(ku3Var, null, new s7c(u8cVar, event, rq3Var, i3), 3);
                av4 t32 = xw3.t(ku3Var, null, new s7c(u8cVar, event, rq3Var, i4), 3);
                this.u = null;
                this.w = event;
                this.y = t32;
                this.s = intValue;
                this.t = 2;
                w2 = t22.w(this);
                if (w2 != lu3Var) {
                }
                return lu3Var;
            default:
                XmlPullParser xmlPullParser = (XmlPullParser) this.w;
                lu3 lu3Var2 = lu3.a;
                int i9 = this.t;
                if (i9 == 0) {
                    y6a.M(obj);
                    s9a.t((ku3) this.u);
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
                } else if (i9 == 1) {
                    depth = this.s;
                    fsfVar = (fsf) this.u;
                    y6a.M(obj);
                    obj3 = obj;
                    u uVar = (u) obj3;
                    if (uVar != null) {
                        obj2 = new l(uVar);
                        fsfVar.a = obj2;
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth) {
                        }
                    }
                    obj2 = null;
                    fsfVar.a = obj2;
                    xmlPullParser.next();
                    if (xmlPullParser.getDepth() < depth) {
                    }
                } else {
                    if (i9 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    depth = this.s;
                    fsfVar = (fsf) this.u;
                    y6a.M(obj);
                    Object b = obj;
                    if (((List) b).isEmpty()) {
                        b = null;
                    }
                    List list = (List) b;
                    if (list != null) {
                        obj2 = new k(list);
                        fsfVar.a = obj2;
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth) {
                            return Unit.a;
                        }
                        int depth2 = xmlPullParser.getDepth() - depth;
                        if (depth2 == 0) {
                            mqi mqiVar = d1.a;
                            if (xmlPullParser.getEventType() == 2) {
                                ((fsf) serializable).a = d1.u(xmlPullParser, "id");
                                fsf fsfVar2 = (fsf) this.y;
                                String u = d1.u(xmlPullParser, "sequence");
                                if (u == null) {
                                    fsfVar2.a = null;
                                    ((fsf) this.z).a = d1.u(xmlPullParser, "adID");
                                    ((fsf) obj4).a = d1.u(xmlPullParser, "apiFramework");
                                } else {
                                    Integer intOrNull = StringsKt.toIntOrNull(u);
                                    fsfVar2.a = Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 999);
                                    ((fsf) this.z).a = d1.u(xmlPullParser, "adID");
                                    ((fsf) obj4).a = d1.u(xmlPullParser, "apiFramework");
                                }
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
                                fsfVar = (fsf) obj5;
                                if (fsfVar.a == null) {
                                    String name = xmlPullParser.getName();
                                    if (Intrinsics.c(name, "Linear")) {
                                        this.u = fsfVar;
                                        this.s = depth;
                                        this.t = 1;
                                        obj3 = d1.z(xmlPullParser, z, this);
                                        break;
                                    } else if (Intrinsics.c(name, "CompanionAds")) {
                                        this.u = fsfVar;
                                        this.s = depth;
                                        this.t = 2;
                                        b = d1.b(xmlPullParser, this);
                                        break;
                                    }
                                    return lu3Var2;
                                }
                            }
                        }
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth) {
                        }
                    }
                    obj2 = null;
                    fsfVar.a = obj2;
                    xmlPullParser.next();
                    if (xmlPullParser.getDepth() < depth) {
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7c(MediaPost mediaPost, Event event, u8c u8cVar, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.A = mediaPost;
        this.x = event;
        this.B = u8cVar;
        this.v = z;
    }
}
