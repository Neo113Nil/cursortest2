package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.model.newNetwork.mediaposts.MediaPostResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaType;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.feed.compose.model.ShortVideoFeedCardModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class u8c {
    public final Context a;
    public final m7c b;
    public final s96 c;
    public final w3b d;
    public final j0j e;
    public final g39 f;
    public final wve g;
    public final t9c h;
    public final umd i;
    public final amd j;
    public final String k;
    public final String l;
    public String m;
    public OddsCountryProvider n;
    public final boolean o;

    public u8c(Context context, m7c m7cVar, s96 s96Var, w3b w3bVar, j0j j0jVar, g39 g39Var, wve wveVar, t9c t9cVar, umd umdVar, amd amdVar, SharedPreferences sharedPreferences) {
        m7cVar.getClass();
        s96Var.getClass();
        w3bVar.getClass();
        j0jVar.getClass();
        g39Var.getClass();
        wveVar.getClass();
        t9cVar.getClass();
        umdVar.getClass();
        amdVar.getClass();
        sharedPreferences.getClass();
        this.a = context;
        this.b = m7cVar;
        this.c = s96Var;
        this.d = w3bVar;
        this.e = j0jVar;
        this.f = g39Var;
        this.g = wveVar;
        this.h = t9cVar;
        this.i = umdVar;
        this.j = amdVar;
        Calendar calendar = ke0.a;
        this.k = ke0.d(context);
        ArrayList arrayList = dv3.a;
        String d = dv3.d(Integer.valueOf(ke0.c));
        this.l = d;
        String string = sharedPreferences.getString("PREF_FEED_COUNTRY", d);
        this.m = string != null ? string : d;
        this.n = xld.a(context, true);
        this.o = sharedPreferences.getBoolean("DEV_MODE_FEED_IGNORE_CARD_RULES", false);
    }

    public static Object d(u8c u8cVar, MediaPost mediaPost, Set set, hoi hoiVar, int i) {
        if ((i & 8) != 0) {
            set = rm5.a;
        }
        return u8cVar.c(mediaPost, null, false, set, hoiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b A[EDGE_INSN: B:23:0x008b->B:24:0x008b BREAK  A[LOOP:0: B:19:0x006e->B:26:?], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, rq3 rq3Var) {
        l8c l8cVar;
        int i2;
        MediaPostResponse mediaPostResponse;
        MediaPost mediaPost;
        List list;
        if (rq3Var instanceof l8c) {
            l8cVar = (l8c) rq3Var;
            int i3 = l8cVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                l8cVar.t = i3 - Integer.MIN_VALUE;
                Object obj = l8cVar.r;
                lu3 lu3Var = lu3.a;
                i2 = l8cVar.t;
                int i4 = 1;
                rq3 rq3Var2 = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    l8cVar.t = 1;
                    m7c m7cVar = this.b;
                    m7cVar.getClass();
                    obj = yaa.P(new i7c(m7cVar, i, rq3Var2, i4), l8cVar);
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
                mediaPostResponse = (MediaPostResponse) yaa.x((x2g) obj);
                if (mediaPostResponse != null && (mediaPost = mediaPostResponse.getMediaPost()) != null && (list = (List) wdc.a.get(mediaPost.getType())) != null) {
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (mediaPost.getTags().containsAll((List) it.next())) {
                                break;
                            }
                        }
                    }
                    if (!list.isEmpty()) {
                        return mediaPost;
                    }
                }
                return null;
            }
        }
        l8cVar = new l8c(this, rq3Var);
        Object obj2 = l8cVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = l8cVar.t;
        int i42 = 1;
        rq3 rq3Var22 = null;
        if (i2 != 0) {
        }
        mediaPostResponse = (MediaPostResponse) yaa.x((x2g) obj2);
        if (mediaPostResponse != null) {
            if (!list.isEmpty()) {
            }
            if (!list.isEmpty()) {
            }
        }
        return null;
    }

    public final Object b(MediaPost mediaPost, Event event, et8 et8Var, hoi hoiVar) {
        return s9a.r(new m8c(mediaPost, et8Var, event, this, null), hoiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x052c, code lost:
    
        if (r0 == r8) goto L166;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0532 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r4v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object, java.util.Set, rq3] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(MediaPost mediaPost, Event event, boolean z, Set set, sq3 sq3Var) {
        s8c s8cVar;
        s8c s8cVar2;
        Set set2;
        boolean z2;
        w31 zbdVar;
        rq3 rq3Var;
        ShortVideoFeedCardModel shortVideoFeedCardModel;
        w31 w31Var;
        u8c u8cVar = this;
        if (sq3Var instanceof s8c) {
            s8cVar = (s8c) sq3Var;
            int i = s8cVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                s8cVar.v = i - Integer.MIN_VALUE;
                s8cVar2 = s8cVar;
                Object obj = s8cVar2.t;
                lu3 lu3Var = lu3.a;
                ?? r4 = 0;
                r4 = 0;
                r4 = 0;
                r4 = 0;
                r4 = 0;
                r4 = 0;
                switch (s8cVar2.v) {
                    case 0:
                        y6a.M(obj);
                        MediaType type = mediaPost.getType();
                        int i2 = 13;
                        switch (type == null ? -1 : n7c.a[type.ordinal()]) {
                            case 1:
                                s8cVar2.r = set;
                                s8cVar2.s = z;
                                s8cVar2.v = 1;
                                u8cVar = this;
                                obj = s9a.r(new u7c(u8cVar, mediaPost, event, r4, 1), s8cVar2);
                                if (obj != lu3Var) {
                                    set2 = set;
                                    z2 = z;
                                    zbdVar = (w31) obj;
                                    if (zbdVar != null) {
                                        return r4;
                                    }
                                    s8cVar2.r = r4;
                                    s8cVar2.s = z2;
                                    s8cVar2.v = 21;
                                    obj = s9a.r(new hj(set2, zbdVar, u8cVar, r4), s8cVar2);
                                    break;
                                }
                                return lu3Var;
                            case 2:
                                s8cVar2.r = set;
                                s8cVar2.s = z;
                                s8cVar2.v = 2;
                                obj = s9a.r(new u7c(this, mediaPost, event, r4, 6), s8cVar2);
                                if (obj != lu3Var) {
                                    set2 = set;
                                    z2 = z;
                                    zbdVar = (w31) obj;
                                    u8cVar = this;
                                    if (zbdVar != null) {
                                    }
                                }
                                return lu3Var;
                            case 3:
                                s8cVar2.r = set;
                                s8cVar2.s = z;
                                s8cVar2.v = 3;
                                obj = s9a.r(new u7c(this, mediaPost, event, r4, 4), s8cVar2);
                                if (obj != lu3Var) {
                                    set2 = set;
                                    z2 = z;
                                    zbdVar = (w31) obj;
                                    u8cVar = this;
                                    if (zbdVar != null) {
                                    }
                                }
                                return lu3Var;
                            case 4:
                                s8cVar2.r = set;
                                s8cVar2.s = z;
                                s8cVar2.v = 4;
                                obj = s9a.r(new u7c(this, mediaPost, event, r4, 5), s8cVar2);
                                if (obj != lu3Var) {
                                    set2 = set;
                                    z2 = z;
                                    zbdVar = (w31) obj;
                                    u8cVar = this;
                                    if (zbdVar != null) {
                                    }
                                }
                                return lu3Var;
                            case 5:
                                int id = mediaPost.getId();
                                String header = mediaPost.getHeader();
                                String description = mediaPost.getDescription();
                                long createdAtTimestamp = mediaPost.getCreatedAtTimestamp();
                                String contentId = mediaPost.getContentId();
                                String externalUrl = mediaPost.getExternalUrl();
                                List<String> images = mediaPost.getImages();
                                u8cVar = this;
                                set2 = set;
                                z2 = z;
                                r4 = 0;
                                zbdVar = new zbd(id, header, description, createdAtTimestamp, contentId, externalUrl, images != null ? (String) CollectionsKt.firstOrNull(images) : null, mediaPost.getPublishedAtTimestamp(), mediaPost.getNewsProvider());
                                if (zbdVar != null) {
                                }
                                break;
                            case 6:
                            case 7:
                                int id2 = mediaPost.getId();
                                String header2 = mediaPost.getHeader();
                                long createdAtTimestamp2 = mediaPost.getCreatedAtTimestamp();
                                String contentId2 = mediaPost.getContentId();
                                String externalUrl2 = mediaPost.getExternalUrl();
                                List<String> images2 = mediaPost.getImages();
                                u8cVar = this;
                                set2 = set;
                                z2 = z;
                                r4 = 0;
                                zbdVar = new il6(id2, null, header2, createdAtTimestamp2, contentId2, externalUrl2, images2 != null ? (String) CollectionsKt.firstOrNull(images2) : null, Long.valueOf(mediaPost.getPublishedAtTimestamp()), Intrinsics.c(mediaPost.getEmbeddable(), Boolean.TRUE), new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
                                if (zbdVar != null) {
                                }
                                break;
                            case 8:
                                rq3Var = null;
                                s8cVar2.r = set;
                                s8cVar2.s = z;
                                s8cVar2.v = 5;
                                obj = s9a.r(new x7c(mediaPost, event, u8cVar, z, null), s8cVar2);
                                if (obj != lu3Var) {
                                    set2 = set;
                                    z2 = z;
                                    w31Var = (w31) obj;
                                    u8cVar = this;
                                    zbdVar = w31Var;
                                    r4 = rq3Var;
                                    if (zbdVar != null) {
                                    }
                                }
                                return lu3Var;
                            case 9:
                                rq3Var = null;
                                Boolean embeddable = mediaPost.getEmbeddable();
                                Boolean bool = Boolean.TRUE;
                                if (Intrinsics.c(embeddable, bool)) {
                                    int id3 = mediaPost.getId();
                                    String header3 = mediaPost.getHeader();
                                    long createdAtTimestamp3 = mediaPost.getCreatedAtTimestamp();
                                    String contentId3 = mediaPost.getContentId();
                                    String externalUrl3 = mediaPost.getExternalUrl();
                                    List<String> images3 = mediaPost.getImages();
                                    shortVideoFeedCardModel = new ShortVideoFeedCardModel(id3, null, header3, createdAtTimestamp3, contentId3, externalUrl3, images3 != null ? (String) CollectionsKt.firstOrNull(images3) : null, Long.valueOf(mediaPost.getPublishedAtTimestamp()), Intrinsics.c(mediaPost.getEmbeddable(), bool));
                                } else {
                                    shortVideoFeedCardModel = null;
                                }
                                set2 = set;
                                zbdVar = shortVideoFeedCardModel;
                                z2 = z;
                                r4 = rq3Var;
                                if (zbdVar != null) {
                                }
                                break;
                            case 10:
                                rq3Var = null;
                                s8cVar2.r = set;
                                s8cVar2.s = z;
                                s8cVar2.v = 6;
                                obj = s9a.r(new v7c(null, u8cVar, mediaPost), s8cVar2);
                                if (obj != lu3Var) {
                                    set2 = set;
                                    z2 = z;
                                    w31Var = (w31) obj;
                                    zbdVar = w31Var;
                                    r4 = rq3Var;
                                    if (zbdVar != null) {
                                    }
                                }
                                return lu3Var;
                            case 11:
                                rq3Var = null;
                                s8cVar2.r = set;
                                s8cVar2.s = z;
                                s8cVar2.v = 7;
                                obj = s9a.r(new q7c(mediaPost, u8cVar, rq3Var, 0), s8cVar2);
                                if (obj != lu3Var) {
                                    set2 = set;
                                    z2 = z;
                                    w31Var = (w31) obj;
                                    zbdVar = w31Var;
                                    r4 = rq3Var;
                                    if (zbdVar != null) {
                                    }
                                }
                                return lu3Var;
                            case 12:
                                rq3Var = null;
                                s8cVar2.r = set;
                                s8cVar2.s = z;
                                s8cVar2.v = 8;
                                obj = s9a.r(new g8c(null, u8cVar, mediaPost), s8cVar2);
                                if (obj != lu3Var) {
                                    set2 = set;
                                    z2 = z;
                                    w31Var = (w31) obj;
                                    zbdVar = w31Var;
                                    r4 = rq3Var;
                                    if (zbdVar != null) {
                                    }
                                }
                                return lu3Var;
                            case 13:
                                rq3Var = null;
                                s8cVar2.r = set;
                                s8cVar2.s = z;
                                s8cVar2.v = 9;
                                obj = s9a.r(new b8c(null, u8cVar, mediaPost), s8cVar2);
                                if (obj != lu3Var) {
                                    set2 = set;
                                    z2 = z;
                                    w31Var = (w31) obj;
                                    zbdVar = w31Var;
                                    r4 = rq3Var;
                                    if (zbdVar != null) {
                                    }
                                }
                                return lu3Var;
                            case 14:
                                rq3Var = null;
                                s8cVar2.r = set;
                                s8cVar2.s = z;
                                s8cVar2.v = 10;
                                obj = s9a.r(new h10(mediaPost, u8cVar, rq3Var, i2), s8cVar2);
                                if (obj != lu3Var) {
                                    set2 = set;
                                    z2 = z;
                                    w31Var = (w31) obj;
                                    zbdVar = w31Var;
                                    r4 = rq3Var;
                                    if (zbdVar != null) {
                                    }
                                }
                                return lu3Var;
                            case 15:
                                rq3Var = null;
                                s8cVar2.r = set;
                                s8cVar2.s = z;
                                s8cVar2.v = 11;
                                obj = s9a.r(new r8c(null, u8cVar, event, mediaPost), s8cVar2);
                                if (obj != lu3Var) {
                                    set2 = set;
                                    z2 = z;
                                    w31Var = (w31) obj;
                                    zbdVar = w31Var;
                                    r4 = rq3Var;
                                    if (zbdVar != null) {
                                    }
                                }
                                return lu3Var;
                            case 16:
                                s8cVar2.r = set;
                                s8cVar2.s = z;
                                s8cVar2.v = 12;
                                u8cVar = this;
                                rq3Var = null;
                                obj = s9a.r(new u7c(u8cVar, mediaPost, event, r4, 10), s8cVar2);
                                if (obj != lu3Var) {
                                    set2 = set;
                                    z2 = z;
                                    w31Var = (w31) obj;
                                    zbdVar = w31Var;
                                    r4 = rq3Var;
                                    if (zbdVar != null) {
                                    }
                                }
                                return lu3Var;
                            case 17:
                                s8cVar2.r = set;
                                s8cVar2.s = z;
                                s8cVar2.v = 13;
                                obj = s9a.r(new u7c(this, mediaPost, event, r4, 7), s8cVar2);
                                if (obj != lu3Var) {
                                    set2 = set;
                                    z2 = z;
                                    zbdVar = (w31) obj;
                                    u8cVar = this;
                                    if (zbdVar != null) {
                                    }
                                }
                                return lu3Var;
                            case 18:
                                s8cVar2.r = set;
                                s8cVar2.s = z;
                                s8cVar2.v = 14;
                                obj = s9a.r(new u7c(this, mediaPost, event, r4, 8), s8cVar2);
                                if (obj != lu3Var) {
                                    set2 = set;
                                    z2 = z;
                                    zbdVar = (w31) obj;
                                    u8cVar = this;
                                    if (zbdVar != null) {
                                    }
                                }
                                return lu3Var;
                            case 19:
                                s8cVar2.r = set;
                                s8cVar2.s = z;
                                s8cVar2.v = 15;
                                obj = s9a.r(new u7c(u8cVar, mediaPost, event, r4, 3), s8cVar2);
                                if (obj != lu3Var) {
                                    set2 = set;
                                    z2 = z;
                                    zbdVar = (w31) obj;
                                    u8cVar = this;
                                    if (zbdVar != null) {
                                    }
                                }
                                return lu3Var;
                            case 20:
                                s8cVar2.r = set;
                                s8cVar2.s = z;
                                s8cVar2.v = 16;
                                obj = s9a.r(new j8c((rq3) null, u8cVar, event, mediaPost), s8cVar2);
                                if (obj != lu3Var) {
                                    set2 = set;
                                    z2 = z;
                                    zbdVar = (w31) obj;
                                    if (zbdVar != null) {
                                    }
                                }
                                return lu3Var;
                            case 21:
                                s8cVar2.r = set;
                                s8cVar2.s = z;
                                s8cVar2.v = 17;
                                obj = s9a.r(new vwb(null, u8cVar, event, mediaPost), s8cVar2);
                                if (obj != lu3Var) {
                                    set2 = set;
                                    z2 = z;
                                    zbdVar = (w31) obj;
                                    if (zbdVar != null) {
                                    }
                                }
                                return lu3Var;
                            case 22:
                                s8cVar2.r = set;
                                s8cVar2.s = z;
                                s8cVar2.v = 18;
                                u8cVar = this;
                                obj = s9a.r(new u7c(u8cVar, mediaPost, event, r4, 0), s8cVar2);
                                if (obj != lu3Var) {
                                    set2 = set;
                                    z2 = z;
                                    zbdVar = (w31) obj;
                                    if (zbdVar != null) {
                                    }
                                }
                                return lu3Var;
                            case 23:
                                s8cVar2.r = set;
                                s8cVar2.s = z;
                                s8cVar2.v = 19;
                                obj = s9a.r(new u7c(this, mediaPost, event, r4, 9), s8cVar2);
                                if (obj != lu3Var) {
                                    set2 = set;
                                    z2 = z;
                                    zbdVar = (w31) obj;
                                    u8cVar = this;
                                    if (zbdVar != null) {
                                    }
                                }
                                return lu3Var;
                            case 24:
                                s8cVar2.r = set;
                                s8cVar2.s = z;
                                s8cVar2.v = 20;
                                obj = s9a.r(new u7c(u8cVar, mediaPost, event, r4, 2), s8cVar2);
                                if (obj != lu3Var) {
                                    set2 = set;
                                    z2 = z;
                                    zbdVar = (w31) obj;
                                    u8cVar = this;
                                    if (zbdVar != null) {
                                    }
                                }
                                return lu3Var;
                            default:
                                set2 = set;
                                zbdVar = null;
                                z2 = z;
                                if (zbdVar != null) {
                                }
                                break;
                        }
                    case 1:
                        z2 = s8cVar2.s;
                        set2 = s8cVar2.r;
                        y6a.M(obj);
                        zbdVar = (w31) obj;
                        if (zbdVar != null) {
                        }
                        break;
                    case 2:
                        z2 = s8cVar2.s;
                        set2 = s8cVar2.r;
                        y6a.M(obj);
                        zbdVar = (w31) obj;
                        u8cVar = this;
                        if (zbdVar != null) {
                        }
                        break;
                    case 3:
                        z2 = s8cVar2.s;
                        set2 = s8cVar2.r;
                        y6a.M(obj);
                        zbdVar = (w31) obj;
                        u8cVar = this;
                        if (zbdVar != null) {
                        }
                        break;
                    case 4:
                        z2 = s8cVar2.s;
                        set2 = s8cVar2.r;
                        y6a.M(obj);
                        zbdVar = (w31) obj;
                        u8cVar = this;
                        if (zbdVar != null) {
                        }
                        break;
                    case 5:
                        z2 = s8cVar2.s;
                        set2 = s8cVar2.r;
                        y6a.M(obj);
                        rq3Var = null;
                        w31Var = (w31) obj;
                        u8cVar = this;
                        zbdVar = w31Var;
                        r4 = rq3Var;
                        if (zbdVar != null) {
                        }
                        break;
                    case 6:
                        z2 = s8cVar2.s;
                        set2 = s8cVar2.r;
                        y6a.M(obj);
                        rq3Var = null;
                        w31Var = (w31) obj;
                        zbdVar = w31Var;
                        r4 = rq3Var;
                        if (zbdVar != null) {
                        }
                        break;
                    case 7:
                        z2 = s8cVar2.s;
                        set2 = s8cVar2.r;
                        y6a.M(obj);
                        rq3Var = null;
                        w31Var = (w31) obj;
                        zbdVar = w31Var;
                        r4 = rq3Var;
                        if (zbdVar != null) {
                        }
                        break;
                    case 8:
                        z2 = s8cVar2.s;
                        set2 = s8cVar2.r;
                        y6a.M(obj);
                        rq3Var = null;
                        w31Var = (w31) obj;
                        zbdVar = w31Var;
                        r4 = rq3Var;
                        if (zbdVar != null) {
                        }
                        break;
                    case 9:
                        z2 = s8cVar2.s;
                        set2 = s8cVar2.r;
                        y6a.M(obj);
                        rq3Var = null;
                        w31Var = (w31) obj;
                        zbdVar = w31Var;
                        r4 = rq3Var;
                        if (zbdVar != null) {
                        }
                        break;
                    case 10:
                        z2 = s8cVar2.s;
                        set2 = s8cVar2.r;
                        y6a.M(obj);
                        rq3Var = null;
                        w31Var = (w31) obj;
                        zbdVar = w31Var;
                        r4 = rq3Var;
                        if (zbdVar != null) {
                        }
                        break;
                    case 11:
                        z2 = s8cVar2.s;
                        set2 = s8cVar2.r;
                        y6a.M(obj);
                        rq3Var = null;
                        w31Var = (w31) obj;
                        zbdVar = w31Var;
                        r4 = rq3Var;
                        if (zbdVar != null) {
                        }
                        break;
                    case 12:
                        z2 = s8cVar2.s;
                        set2 = s8cVar2.r;
                        y6a.M(obj);
                        rq3Var = null;
                        w31Var = (w31) obj;
                        zbdVar = w31Var;
                        r4 = rq3Var;
                        if (zbdVar != null) {
                        }
                        break;
                    case 13:
                        z2 = s8cVar2.s;
                        set2 = s8cVar2.r;
                        y6a.M(obj);
                        zbdVar = (w31) obj;
                        u8cVar = this;
                        if (zbdVar != null) {
                        }
                        break;
                    case 14:
                        z2 = s8cVar2.s;
                        set2 = s8cVar2.r;
                        y6a.M(obj);
                        zbdVar = (w31) obj;
                        u8cVar = this;
                        if (zbdVar != null) {
                        }
                        break;
                    case 15:
                        z2 = s8cVar2.s;
                        set2 = s8cVar2.r;
                        y6a.M(obj);
                        zbdVar = (w31) obj;
                        u8cVar = this;
                        if (zbdVar != null) {
                        }
                        break;
                    case 16:
                        z2 = s8cVar2.s;
                        set2 = s8cVar2.r;
                        y6a.M(obj);
                        zbdVar = (w31) obj;
                        if (zbdVar != null) {
                        }
                        break;
                    case 17:
                        z2 = s8cVar2.s;
                        set2 = s8cVar2.r;
                        y6a.M(obj);
                        zbdVar = (w31) obj;
                        if (zbdVar != null) {
                        }
                        break;
                    case 18:
                        z2 = s8cVar2.s;
                        set2 = s8cVar2.r;
                        y6a.M(obj);
                        zbdVar = (w31) obj;
                        if (zbdVar != null) {
                        }
                        break;
                    case 19:
                        z2 = s8cVar2.s;
                        set2 = s8cVar2.r;
                        y6a.M(obj);
                        zbdVar = (w31) obj;
                        u8cVar = this;
                        if (zbdVar != null) {
                        }
                        break;
                    case 20:
                        z2 = s8cVar2.s;
                        set2 = s8cVar2.r;
                        y6a.M(obj);
                        zbdVar = (w31) obj;
                        u8cVar = this;
                        if (zbdVar != null) {
                        }
                        break;
                    case 21:
                        Set set3 = s8cVar2.r;
                        y6a.M(obj);
                        return (w31) obj;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        s8cVar = new s8c(u8cVar, sq3Var);
        s8cVar2 = s8cVar;
        Object obj2 = s8cVar2.t;
        lu3 lu3Var2 = lu3.a;
        ?? r42 = 0;
        r42 = 0;
        r42 = 0;
        r42 = 0;
        r42 = 0;
        r42 = 0;
        switch (s8cVar2.v) {
        }
    }
}
