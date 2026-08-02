package defpackage;

import com.sofascore.model.newNetwork.EventMediaNewsResponse;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.model.newNetwork.HighlightsResponse;
import com.sofascore.model.newNetwork.MatchdayHighlightsResponse;
import com.sofascore.model.newNetwork.MediaResponse;
import com.sofascore.model.newNetwork.SportRadarStreamUrlResponse;
import com.sofascore.model.newNetwork.SportRadarTokenResponse;
import com.sofascore.model.newNetwork.StreamData;
import com.sofascore.model.newNetwork.YoutubeVideoResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t9c {
    public final NetworkCoroutineAPI a;
    public final NetworkCoroutineAPI b;

    public t9c(NetworkCoroutineAPI networkCoroutineAPI, NetworkCoroutineAPI networkCoroutineAPI2) {
        networkCoroutineAPI.getClass();
        networkCoroutineAPI2.getClass();
        this.a = networkCoroutineAPI;
        this.b = networkCoroutineAPI2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, sq3 sq3Var) {
        z8c z8cVar;
        int i2;
        EventMediaNewsResponse eventMediaNewsResponse;
        if (sq3Var instanceof z8c) {
            z8cVar = (z8c) sq3Var;
            int i3 = z8cVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z8cVar.t = i3 - Integer.MIN_VALUE;
                Object obj = z8cVar.r;
                lu3 lu3Var = lu3.a;
                i2 = z8cVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a9c a9cVar = new a9c(this, i, rq3Var, 0);
                    z8cVar.t = 1;
                    obj = yaa.P(a9cVar, z8cVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                eventMediaNewsResponse = (EventMediaNewsResponse) yaa.x((x2g) obj);
                if (eventMediaNewsResponse == null) {
                    return eventMediaNewsResponse.getNewsArticles();
                }
                return null;
            }
        }
        z8cVar = new z8c(this, sq3Var);
        Object obj2 = z8cVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = z8cVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        eventMediaNewsResponse = (EventMediaNewsResponse) yaa.x((x2g) obj2);
        if (eventMediaNewsResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(int i, String str, sq3 sq3Var) {
        b9c b9cVar;
        int i2;
        HighlightsResponse highlightsResponse;
        List<Highlight> highlights;
        if (sq3Var instanceof b9c) {
            b9cVar = (b9c) sq3Var;
            int i3 = b9cVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b9cVar.u = i3 - Integer.MIN_VALUE;
                Object obj = b9cVar.s;
                lu3 lu3Var = lu3.a;
                i2 = b9cVar.u;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a9c a9cVar = new a9c(this, i, rq3Var, 3);
                    b9cVar.r = str;
                    b9cVar.u = 1;
                    obj = yaa.P(a9cVar, b9cVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = b9cVar.r;
                    y6a.M(obj);
                }
                highlightsResponse = (HighlightsResponse) yaa.x((x2g) obj);
                if (highlightsResponse != null || (highlights = highlightsResponse.getHighlights()) == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : highlights) {
                    Highlight highlight = (Highlight) obj2;
                    List<String> forCountries = highlight.getForCountries();
                    if (forCountries != null && !forCountries.isEmpty()) {
                        List<String> forCountries2 = highlight.getForCountries();
                        if (Intrinsics.c(forCountries2 != null ? Boolean.valueOf(forCountries2.contains(str)) : null, Boolean.TRUE)) {
                        }
                    }
                    arrayList.add(obj2);
                }
                return arrayList;
            }
        }
        b9cVar = new b9c(this, sq3Var);
        Object obj3 = b9cVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = b9cVar.u;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        highlightsResponse = (HighlightsResponse) yaa.x((x2g) obj3);
        if (highlightsResponse != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(int i, String str, boolean z, sq3 sq3Var) {
        c9c c9cVar;
        int i2;
        HighlightsResponse highlightsResponse;
        List<Highlight> highlights;
        Iterator it;
        Object obj;
        Highlight highlight;
        if (sq3Var instanceof c9c) {
            c9cVar = (c9c) sq3Var;
            int i3 = c9cVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c9cVar.v = i3 - Integer.MIN_VALUE;
                Object obj2 = c9cVar.t;
                lu3 lu3Var = lu3.a;
                i2 = c9cVar.v;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj2);
                    c9cVar.r = str;
                    c9cVar.s = z;
                    c9cVar.v = 1;
                    obj2 = yaa.P(new a9c(this, i, rq3Var, 2), c9cVar);
                    if (obj2 == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = c9cVar.s;
                    str = c9cVar.r;
                    y6a.M(obj2);
                }
                highlightsResponse = (HighlightsResponse) yaa.x((x2g) obj2);
                if (highlightsResponse != null && (highlights = highlightsResponse.getHighlights()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : highlights) {
                        Highlight highlight2 = (Highlight) obj3;
                        mqi mqiVar = qhi.a;
                        if (qhi.c(highlight2.getUrl(), false) != null) {
                            List<String> forCountries = highlight2.getForCountries();
                            if (forCountries != null && !forCountries.isEmpty()) {
                                List<String> forCountries2 = highlight2.getForCountries();
                                if (Intrinsics.c(forCountries2 != null ? Boolean.valueOf(CollectionsKt.R(forCountries2, str)) : null, Boolean.TRUE)) {
                                }
                            }
                            arrayList.add(obj3);
                        }
                    }
                    it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((Highlight) obj).getKeyHighlight()) {
                            break;
                        }
                    }
                    highlight = (Highlight) obj;
                    if (highlight == null) {
                        return highlight;
                    }
                    if (z) {
                        return (Highlight) CollectionsKt.firstOrNull(arrayList);
                    }
                }
                return null;
            }
        }
        c9cVar = new c9c(this, sq3Var);
        Object obj22 = c9cVar.t;
        lu3 lu3Var2 = lu3.a;
        i2 = c9cVar.v;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        highlightsResponse = (HighlightsResponse) yaa.x((x2g) obj22);
        if (highlightsResponse != null) {
            ArrayList arrayList2 = new ArrayList();
            while (r5.hasNext()) {
            }
            it = arrayList2.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            highlight = (Highlight) obj;
            if (highlight == null) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, int i2, sq3 sq3Var) {
        d9c d9cVar;
        int i3;
        MatchdayHighlightsResponse matchdayHighlightsResponse;
        if (sq3Var instanceof d9c) {
            d9cVar = (d9c) sq3Var;
            int i4 = d9cVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                d9cVar.t = i4 - Integer.MIN_VALUE;
                Object obj = d9cVar.r;
                lu3 lu3Var = lu3.a;
                i3 = d9cVar.t;
                rq3 rq3Var = null;
                if (i3 != 0) {
                    y6a.M(obj);
                    ni5 ni5Var = new ni5(this, i, i2, rq3Var, 1);
                    d9cVar.t = 1;
                    obj = yaa.P(ni5Var, d9cVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                matchdayHighlightsResponse = (MatchdayHighlightsResponse) yaa.x((x2g) obj);
                if (matchdayHighlightsResponse == null) {
                    return matchdayHighlightsResponse.getMatchdayHighlights();
                }
                return null;
            }
        }
        d9cVar = new d9c(this, sq3Var);
        Object obj2 = d9cVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = d9cVar.t;
        rq3 rq3Var2 = null;
        if (i3 != 0) {
        }
        matchdayHighlightsResponse = (MatchdayHighlightsResponse) yaa.x((x2g) obj2);
        if (matchdayHighlightsResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, sq3 sq3Var) {
        e9c e9cVar;
        int i2;
        MediaResponse mediaResponse;
        if (sq3Var instanceof e9c) {
            e9cVar = (e9c) sq3Var;
            int i3 = e9cVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e9cVar.t = i3 - Integer.MIN_VALUE;
                Object obj = e9cVar.r;
                lu3 lu3Var = lu3.a;
                i2 = e9cVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a9c a9cVar = new a9c(this, i, rq3Var, 4);
                    e9cVar.t = 1;
                    obj = yaa.P(a9cVar, e9cVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                mediaResponse = (MediaResponse) yaa.x((x2g) obj);
                if (mediaResponse == null) {
                    return mediaResponse.getMedia();
                }
                return null;
            }
        }
        e9cVar = new e9c(this, sq3Var);
        Object obj2 = e9cVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = e9cVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        mediaResponse = (MediaResponse) yaa.x((x2g) obj2);
        if (mediaResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, sq3 sq3Var) {
        f9c f9cVar;
        int i2;
        EventMediaNewsResponse eventMediaNewsResponse;
        if (sq3Var instanceof f9c) {
            f9cVar = (f9c) sq3Var;
            int i3 = f9cVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                f9cVar.t = i3 - Integer.MIN_VALUE;
                Object obj = f9cVar.r;
                lu3 lu3Var = lu3.a;
                i2 = f9cVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a9c a9cVar = new a9c(this, i, rq3Var, 5);
                    f9cVar.t = 1;
                    obj = yaa.P(a9cVar, f9cVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                eventMediaNewsResponse = (EventMediaNewsResponse) yaa.x((x2g) obj);
                if (eventMediaNewsResponse == null) {
                    return eventMediaNewsResponse.getNewsArticles();
                }
                return null;
            }
        }
        f9cVar = new f9c(this, sq3Var);
        Object obj2 = f9cVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = f9cVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        eventMediaNewsResponse = (EventMediaNewsResponse) yaa.x((x2g) obj2);
        if (eventMediaNewsResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i, sq3 sq3Var) {
        g9c g9cVar;
        int i2;
        YoutubeVideoResponse youtubeVideoResponse;
        if (sq3Var instanceof g9c) {
            g9cVar = (g9c) sq3Var;
            int i3 = g9cVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g9cVar.t = i3 - Integer.MIN_VALUE;
                Object obj = g9cVar.r;
                lu3 lu3Var = lu3.a;
                i2 = g9cVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a9c a9cVar = new a9c(this, i, rq3Var, 6);
                    g9cVar.t = 1;
                    obj = yaa.P(a9cVar, g9cVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                youtubeVideoResponse = (YoutubeVideoResponse) yaa.x((x2g) obj);
                if (youtubeVideoResponse == null) {
                    return youtubeVideoResponse.getVideos();
                }
                return null;
            }
        }
        g9cVar = new g9c(this, sq3Var);
        Object obj2 = g9cVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = g9cVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        youtubeVideoResponse = (YoutubeVideoResponse) yaa.x((x2g) obj2);
        if (youtubeVideoResponse == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (r13 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
    
        if (r13 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(int i, sq3 sq3Var) {
        h9c h9cVar;
        int i2;
        StreamData data;
        if (sq3Var instanceof h9c) {
            h9cVar = (h9c) sq3Var;
            int i3 = h9cVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h9cVar.u = i3 - Integer.MIN_VALUE;
                Object obj = h9cVar.s;
                lu3 lu3Var = lu3.a;
                i2 = h9cVar.u;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    r3 r3Var = new r3(this, rq3Var, 16);
                    h9cVar.r = i;
                    h9cVar.u = 1;
                    obj = yaa.P(r3Var, h9cVar);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        SportRadarStreamUrlResponse sportRadarStreamUrlResponse = (SportRadarStreamUrlResponse) yaa.x((x2g) obj);
                        if (sportRadarStreamUrlResponse == null || (data = sportRadarStreamUrlResponse.getData()) == null) {
                            return null;
                        }
                        return data.getStream();
                    }
                    i = h9cVar.r;
                    y6a.M(obj);
                }
                int i4 = i;
                SportRadarTokenResponse sportRadarTokenResponse = (SportRadarTokenResponse) yaa.x((x2g) obj);
                y8c y8cVar = new y8c(this, i4, sportRadarTokenResponse == null ? sportRadarTokenResponse.getToken() : null, rq3Var, 2);
                h9cVar.r = i4;
                h9cVar.u = 2;
                obj = yaa.P(y8cVar, h9cVar);
            }
        }
        h9cVar = new h9c(this, sq3Var);
        Object obj2 = h9cVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = h9cVar.u;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        int i42 = i;
        SportRadarTokenResponse sportRadarTokenResponse2 = (SportRadarTokenResponse) yaa.x((x2g) obj2);
        y8c y8cVar2 = new y8c(this, i42, sportRadarTokenResponse2 == null ? sportRadarTokenResponse2.getToken() : null, rq3Var2, 2);
        h9cVar.r = i42;
        h9cVar.u = 2;
        obj2 = yaa.P(y8cVar2, h9cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(int i, sq3 sq3Var) {
        i9c i9cVar;
        int i2;
        EventMediaNewsResponse eventMediaNewsResponse;
        if (sq3Var instanceof i9c) {
            i9cVar = (i9c) sq3Var;
            int i3 = i9cVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                i9cVar.t = i3 - Integer.MIN_VALUE;
                Object obj = i9cVar.r;
                lu3 lu3Var = lu3.a;
                i2 = i9cVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a9c a9cVar = new a9c(this, i, rq3Var, 7);
                    i9cVar.t = 1;
                    obj = yaa.P(a9cVar, i9cVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                eventMediaNewsResponse = (EventMediaNewsResponse) yaa.x((x2g) obj);
                if (eventMediaNewsResponse == null) {
                    return eventMediaNewsResponse.getNewsArticles();
                }
                return null;
            }
        }
        i9cVar = new i9c(this, sq3Var);
        Object obj2 = i9cVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = i9cVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        eventMediaNewsResponse = (EventMediaNewsResponse) yaa.x((x2g) obj2);
        if (eventMediaNewsResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(int i, sq3 sq3Var) {
        j9c j9cVar;
        int i2;
        YoutubeVideoResponse youtubeVideoResponse;
        if (sq3Var instanceof j9c) {
            j9cVar = (j9c) sq3Var;
            int i3 = j9cVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j9cVar.t = i3 - Integer.MIN_VALUE;
                Object obj = j9cVar.r;
                lu3 lu3Var = lu3.a;
                i2 = j9cVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a9c a9cVar = new a9c(this, i, rq3Var, 10);
                    j9cVar.t = 1;
                    obj = yaa.P(a9cVar, j9cVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                youtubeVideoResponse = (YoutubeVideoResponse) yaa.x((x2g) obj);
                if (youtubeVideoResponse == null) {
                    return youtubeVideoResponse.getVideos();
                }
                return null;
            }
        }
        j9cVar = new j9c(this, sq3Var);
        Object obj2 = j9cVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = j9cVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        youtubeVideoResponse = (YoutubeVideoResponse) yaa.x((x2g) obj2);
        if (youtubeVideoResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(int i, sq3 sq3Var) {
        k9c k9cVar;
        int i2;
        EventMediaNewsResponse eventMediaNewsResponse;
        if (sq3Var instanceof k9c) {
            k9cVar = (k9c) sq3Var;
            int i3 = k9cVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                k9cVar.t = i3 - Integer.MIN_VALUE;
                Object obj = k9cVar.r;
                lu3 lu3Var = lu3.a;
                i2 = k9cVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a9c a9cVar = new a9c(this, i, rq3Var, 11);
                    k9cVar.t = 1;
                    obj = yaa.P(a9cVar, k9cVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                eventMediaNewsResponse = (EventMediaNewsResponse) yaa.x((x2g) obj);
                if (eventMediaNewsResponse == null) {
                    return eventMediaNewsResponse.getNewsArticles();
                }
                return null;
            }
        }
        k9cVar = new k9c(this, sq3Var);
        Object obj2 = k9cVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = k9cVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        eventMediaNewsResponse = (EventMediaNewsResponse) yaa.x((x2g) obj2);
        if (eventMediaNewsResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(int i, sq3 sq3Var) {
        l9c l9cVar;
        int i2;
        if (sq3Var instanceof l9c) {
            l9cVar = (l9c) sq3Var;
            int i3 = l9cVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                l9cVar.t = i3 - Integer.MIN_VALUE;
                Object obj = l9cVar.r;
                lu3 lu3Var = lu3.a;
                i2 = l9cVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a9c a9cVar = new a9c(this, i, rq3Var, 12);
                    l9cVar.t = 1;
                    obj = yaa.P(a9cVar, l9cVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        l9cVar = new l9c(this, sq3Var);
        Object obj2 = l9cVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = l9cVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(int i, sq3 sq3Var) {
        m9c m9cVar;
        int i2;
        if (sq3Var instanceof m9c) {
            m9cVar = (m9c) sq3Var;
            int i3 = m9cVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m9cVar.t = i3 - Integer.MIN_VALUE;
                Object obj = m9cVar.r;
                lu3 lu3Var = lu3.a;
                i2 = m9cVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a9c a9cVar = new a9c(this, i, rq3Var, 13);
                    m9cVar.t = 1;
                    obj = yaa.P(a9cVar, m9cVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        m9cVar = new m9c(this, sq3Var);
        Object obj2 = m9cVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = m9cVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(int i, sq3 sq3Var) {
        n9c n9cVar;
        int i2;
        if (sq3Var instanceof n9c) {
            n9cVar = (n9c) sq3Var;
            int i3 = n9cVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                n9cVar.t = i3 - Integer.MIN_VALUE;
                Object obj = n9cVar.r;
                lu3 lu3Var = lu3.a;
                i2 = n9cVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a9c a9cVar = new a9c(this, i, rq3Var, 14);
                    n9cVar.t = 1;
                    obj = yaa.P(a9cVar, n9cVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        n9cVar = new n9c(this, sq3Var);
        Object obj2 = n9cVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = n9cVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(int i, sq3 sq3Var) {
        o9c o9cVar;
        int i2;
        if (sq3Var instanceof o9c) {
            o9cVar = (o9c) sq3Var;
            int i3 = o9cVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o9cVar.t = i3 - Integer.MIN_VALUE;
                Object obj = o9cVar.r;
                lu3 lu3Var = lu3.a;
                i2 = o9cVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a9c a9cVar = new a9c(this, i, rq3Var, 15);
                    o9cVar.t = 1;
                    obj = yaa.P(a9cVar, o9cVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        o9cVar = new o9c(this, sq3Var);
        Object obj2 = o9cVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = o9cVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(int i, sq3 sq3Var) {
        p9c p9cVar;
        int i2;
        if (sq3Var instanceof p9c) {
            p9cVar = (p9c) sq3Var;
            int i3 = p9cVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p9cVar.t = i3 - Integer.MIN_VALUE;
                Object obj = p9cVar.r;
                lu3 lu3Var = lu3.a;
                i2 = p9cVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a9c a9cVar = new a9c(this, i, rq3Var, 16);
                    p9cVar.t = 1;
                    obj = yaa.P(a9cVar, p9cVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        p9cVar = new p9c(this, sq3Var);
        Object obj2 = p9cVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = p9cVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(int i, sq3 sq3Var) {
        q9c q9cVar;
        int i2;
        if (sq3Var instanceof q9c) {
            q9cVar = (q9c) sq3Var;
            int i3 = q9cVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q9cVar.t = i3 - Integer.MIN_VALUE;
                Object obj = q9cVar.r;
                lu3 lu3Var = lu3.a;
                i2 = q9cVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a9c a9cVar = new a9c(this, i, rq3Var, 17);
                    q9cVar.t = 1;
                    obj = yaa.P(a9cVar, q9cVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        q9cVar = new q9c(this, sq3Var);
        Object obj2 = q9cVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = q9cVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(int i, sq3 sq3Var) {
        r9c r9cVar;
        int i2;
        if (sq3Var instanceof r9c) {
            r9cVar = (r9c) sq3Var;
            int i3 = r9cVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r9cVar.t = i3 - Integer.MIN_VALUE;
                Object obj = r9cVar.r;
                lu3 lu3Var = lu3.a;
                i2 = r9cVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a9c a9cVar = new a9c(this, i, rq3Var, 18);
                    r9cVar.t = 1;
                    obj = yaa.P(a9cVar, r9cVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        r9cVar = new r9c(this, sq3Var);
        Object obj2 = r9cVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = r9cVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(int i, sq3 sq3Var) {
        s9c s9cVar;
        int i2;
        if (sq3Var instanceof s9c) {
            s9cVar = (s9c) sq3Var;
            int i3 = s9cVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                s9cVar.t = i3 - Integer.MIN_VALUE;
                Object obj = s9cVar.r;
                lu3 lu3Var = lu3.a;
                i2 = s9cVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a9c a9cVar = new a9c(this, i, rq3Var, 19);
                    s9cVar.t = 1;
                    obj = yaa.P(a9cVar, s9cVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        s9cVar = new s9c(this, sq3Var);
        Object obj2 = s9cVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = s9cVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }
}
