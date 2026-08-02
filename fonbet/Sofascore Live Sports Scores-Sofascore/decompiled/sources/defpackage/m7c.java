package defpackage;

import com.sofascore.model.database.DbFeedPostFeedback;
import com.sofascore.model.database.DbMediaLike;
import com.sofascore.model.database.DbMediaShare;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.newNetwork.mediaposts.MediaPostReactionsResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class m7c {
    public final NetworkCoroutineAPI a;
    public final x8c b;
    public final dx7 c;

    public m7c(NetworkCoroutineAPI networkCoroutineAPI, x8c x8cVar, dx7 dx7Var) {
        networkCoroutineAPI.getClass();
        this.a = networkCoroutineAPI;
        this.b = x8cVar;
        this.c = dx7Var;
    }

    public static /* synthetic */ Object d(m7c m7cVar, String str, String str2, List list, List list2, hoi hoiVar, int i) {
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            list2 = null;
        }
        return m7cVar.c(str, str2, list, list2, hoiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (defpackage.yaa.P(r14, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r14 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, int i2, sq3 sq3Var) {
        h7c h7cVar;
        int i3;
        if (sq3Var instanceof h7c) {
            h7cVar = (h7c) sq3Var;
            int i4 = h7cVar.v;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                h7cVar.v = i4 - Integer.MIN_VALUE;
                Object obj = h7cVar.t;
                Object obj2 = lu3.a;
                i3 = h7cVar.v;
                int i5 = 0;
                rq3 rq3Var = null;
                if (i3 != 0) {
                    y6a.M(obj);
                    DbMediaShare dbMediaShare = new DbMediaShare(i, i2 + 1, System.currentTimeMillis() / 1000);
                    h7cVar.r = i;
                    h7cVar.s = i2;
                    h7cVar.v = 1;
                    x8c x8cVar = this.b;
                    Object U = gz8.U(h7cVar, x8cVar.a, false, true, new lsb(4, x8cVar, dbMediaShare));
                    if (U != obj2) {
                        U = Unit.a;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = h7cVar.s;
                    i = h7cVar.r;
                    y6a.M(obj);
                }
                i7c i7cVar = new i7c(this, i, rq3Var, i5);
                h7cVar.r = i;
                h7cVar.s = i2;
                h7cVar.v = 2;
            }
        }
        h7cVar = new h7c(this, sq3Var);
        Object obj3 = h7cVar.t;
        Object obj22 = lu3.a;
        i3 = h7cVar.v;
        int i52 = 0;
        rq3 rq3Var2 = null;
        if (i3 != 0) {
        }
        i7c i7cVar2 = new i7c(this, i, rq3Var2, i52);
        h7cVar.r = i;
        h7cVar.s = i2;
        h7cVar.v = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[LOOP:0: B:11:0x0057->B:13:0x005d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(sq3 sq3Var) {
        j7c j7cVar;
        int i;
        Iterator it;
        if (sq3Var instanceof j7c) {
            j7cVar = (j7c) sq3Var;
            int i2 = j7cVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j7cVar.t = i2 - Integer.MIN_VALUE;
                Object obj = j7cVar.r;
                lu3 lu3Var = lu3.a;
                i = j7cVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    j7cVar.t = 1;
                    obj = gz8.U(j7cVar, this.c.a, true, false, new gl7(9));
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
                    w1l.A(arrayList, ((DbFeedPostFeedback) it.next()).getPostId());
                }
                return arrayList;
            }
        }
        j7cVar = new j7c(this, sq3Var);
        Object obj2 = j7cVar.r;
        lu3 lu3Var2 = lu3.a;
        i = j7cVar.t;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(k13.r(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, List list, List list2, sq3 sq3Var) {
        k7c k7cVar;
        int i;
        if (sq3Var instanceof k7c) {
            k7cVar = (k7c) sq3Var;
            int i2 = k7cVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k7cVar.t = i2 - Integer.MIN_VALUE;
                Object obj = k7cVar.r;
                lu3 lu3Var = lu3.a;
                i = k7cVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    dl dlVar = new dl(list, list2, this, str, str2, (rq3) null);
                    k7cVar.t = 1;
                    obj = yaa.P(dlVar, k7cVar);
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
                return yaa.x((x2g) obj);
            }
        }
        k7cVar = new k7c(this, sq3Var);
        Object obj2 = k7cVar.r;
        lu3 lu3Var2 = lu3.a;
        i = k7cVar.t;
        if (i != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (r2 == r4) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, MediaReactionType mediaReactionType, MediaReactionType mediaReactionType2, sq3 sq3Var) {
        l7c l7cVar;
        Object obj;
        lu3 lu3Var;
        int i2;
        MediaReactionType mediaReactionType3;
        int i3;
        Integer num;
        int i4 = i;
        MediaReactionType mediaReactionType4 = mediaReactionType2;
        if (sq3Var instanceof l7c) {
            l7cVar = (l7c) sq3Var;
            int i5 = l7cVar.w;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                l7cVar.w = i5 - Integer.MIN_VALUE;
                obj = l7cVar.u;
                lu3Var = lu3.a;
                i2 = l7cVar.w;
                if (i2 != 0) {
                    y6a.M(obj);
                    DbMediaLike dbMediaLike = new DbMediaLike(i4, mediaReactionType4, System.currentTimeMillis() / 1000);
                    mediaReactionType3 = mediaReactionType;
                    l7cVar.s = mediaReactionType3;
                    l7cVar.t = mediaReactionType4;
                    l7cVar.r = i4;
                    l7cVar.w = 1;
                    x8c x8cVar = this.b;
                    Object U = gz8.U(l7cVar, x8cVar.a, false, true, new lsb(3, x8cVar, dbMediaLike));
                    if (U != lu3Var) {
                        U = Unit.a;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i3 = l7cVar.r;
                        y6a.M(obj);
                        MediaPostReactionsResponse mediaPostReactionsResponse = (MediaPostReactionsResponse) yaa.x((x2g) obj);
                        num = mediaPostReactionsResponse != null ? new Integer(mediaPostReactionsResponse.getTotalReactionsCount()) : null;
                        if (num != null) {
                            qv5.a(new b52(i3, num));
                        }
                        return Unit.a;
                    }
                    i4 = l7cVar.r;
                    mediaReactionType4 = l7cVar.t;
                    mediaReactionType3 = l7cVar.s;
                    y6a.M(obj);
                }
                int i6 = i4;
                bs2 bs2Var = new bs2(this, i6, mediaReactionType3, mediaReactionType4, null, 6);
                l7cVar.s = null;
                l7cVar.t = null;
                l7cVar.r = i6;
                l7cVar.w = 2;
                obj = yaa.P(bs2Var, l7cVar);
                if (obj != lu3Var) {
                    i3 = i6;
                    MediaPostReactionsResponse mediaPostReactionsResponse2 = (MediaPostReactionsResponse) yaa.x((x2g) obj);
                    if (mediaPostReactionsResponse2 != null) {
                    }
                    if (num != null) {
                    }
                    return Unit.a;
                }
                return lu3Var;
            }
        }
        l7cVar = new l7c(this, sq3Var);
        obj = l7cVar.u;
        lu3Var = lu3.a;
        i2 = l7cVar.w;
        if (i2 != 0) {
        }
        int i62 = i4;
        bs2 bs2Var2 = new bs2(this, i62, mediaReactionType3, mediaReactionType4, null, 6);
        l7cVar.s = null;
        l7cVar.t = null;
        l7cVar.r = i62;
        l7cVar.w = 2;
        obj = yaa.P(bs2Var2, l7cVar);
        if (obj != lu3Var) {
        }
        return lu3Var;
    }
}
