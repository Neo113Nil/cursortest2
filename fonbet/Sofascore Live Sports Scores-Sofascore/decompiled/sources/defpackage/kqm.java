package defpackage;

import com.blaze.blazesdk.database.BlazeDatabase;
import com.blaze.blazesdk.features.moments.models.local.MomentLikedStatus;
import com.blaze.blazesdk.features.moments.models.local.MomentViewed;
import com.blaze.blazesdk.features.stories.models.local.StoryPageStatus;
import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.user_activity.models.requests.UserActivityRequest;
import com.blaze.blazesdk.user_activity.models.responses.UserActivity;
import com.blaze.blazesdk.user_activity.models.responses.UserActivityInteraction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kqm {
    public static final kqm a = new kqm();

    public static void d() {
        tlm interactionStatusDao;
        s9m videosViewedDao;
        bsl videosLikedDao;
        i9m momentsViewedDao;
        frl momentsLikedDao;
        trl storyPageDao;
        StoriesRepositoryImpl storiesRepositoryImpl = StoriesRepositoryImpl.a;
        BlazeDatabase.Companion companion = BlazeDatabase.INSTANCE;
        BlazeDatabase instance = companion.instance();
        if (instance != null && (storyPageDao = instance.getStoryPageDao()) != null) {
            storyPageDao.e();
        }
        gum.b.getClass();
        BlazeDatabase instance2 = companion.instance();
        if (instance2 != null && (momentsLikedDao = instance2.getMomentsLikedDao()) != null) {
            momentsLikedDao.c();
        }
        BlazeDatabase instance3 = companion.instance();
        if (instance3 != null && (momentsViewedDao = instance3.getMomentsViewedDao()) != null) {
            momentsViewedDao.d();
        }
        qom.b.getClass();
        BlazeDatabase instance4 = companion.instance();
        if (instance4 != null && (videosLikedDao = instance4.getVideosLikedDao()) != null) {
            videosLikedDao.c();
        }
        BlazeDatabase instance5 = companion.instance();
        if (instance5 != null && (videosViewedDao = instance5.getVideosViewedDao()) != null) {
            videosViewedDao.e();
        }
        vym vymVar = vym.a;
        try {
            BlazeDatabase instance6 = companion.instance();
            if (instance6 != null && (interactionStatusDao = instance6.getInteractionStatusDao()) != null) {
                lsm lsmVar = (lsm) interactionStatusDao;
                k6g k6gVar = lsmVar.a;
                k6gVar.assertNotSuspendingTransaction();
                aqm aqmVar = lsmVar.d;
                mni a2 = aqmVar.a();
                k6gVar.beginTransaction();
                try {
                    a2.F();
                    k6gVar.setTransactionSuccessful();
                    k6gVar.endTransaction();
                    aqmVar.m(a2);
                } catch (Throwable th) {
                    k6gVar.endTransaction();
                    aqmVar.m(a2);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
        }
        Unit unit = Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0156, code lost:
    
        if (r13 != r14) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0071, code lost:
    
        if (r13 == r14) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:28:0x00c5, B:29:0x00c9, B:31:0x00cf, B:33:0x00e2, B:35:0x00e8, B:39:0x011d, B:40:0x00f8, B:42:0x0102, B:44:0x0108, B:46:0x010e), top: B:27:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        oim oimVar;
        int i;
        a9m a9mVar;
        UserActivity userActivity;
        a9m a9mVar2;
        Object p;
        a9m a9mVar3;
        Unit unit;
        a9m a9mVar4;
        Iterator<T> it;
        BlazeDatabase instance;
        frl momentsLikedDao;
        frl momentsLikedDao2;
        Object d;
        if (sq3Var instanceof oim) {
            oimVar = (oim) sq3Var;
            int i2 = oimVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oimVar.v = i2 - Integer.MIN_VALUE;
                Object obj = oimVar.t;
                lu3 lu3Var = lu3.a;
                i = oimVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    gkm gkmVar = new gkm(null);
                    oimVar.v = 1;
                    hs4 hs4Var = z45.a;
                    obj = xw3.R(hq4.c, new xsl(false, gkmVar, null), oimVar);
                } else if (i == 1) {
                    y6a.M(obj);
                } else {
                    if (i == 2) {
                        userActivity = oimVar.s;
                        a9mVar2 = oimVar.r;
                        y6a.M(obj);
                        List<String> viewedMoments = userActivity.getViewedMoments();
                        oimVar.r = a9mVar2;
                        oimVar.s = userActivity;
                        oimVar.v = 3;
                        p = gum.b.p(viewedMoments, oimVar);
                        if (p != lu3Var) {
                            p = Unit.a;
                        }
                        if (p != lu3Var) {
                            a9mVar3 = a9mVar2;
                            List<String> likedMoments = userActivity.getLikedMoments();
                            oimVar.r = a9mVar3;
                            oimVar.s = userActivity;
                            oimVar.v = 4;
                            gum.b.getClass();
                            it = likedMoments.iterator();
                            while (it.hasNext()) {
                            }
                            unit = Unit.a;
                            lu3 lu3Var2 = lu3.a;
                            if (unit != lu3Var) {
                            }
                        }
                        return lu3Var;
                    }
                    if (i == 3) {
                        userActivity = oimVar.s;
                        a9mVar3 = oimVar.r;
                        y6a.M(obj);
                        List<String> likedMoments2 = userActivity.getLikedMoments();
                        oimVar.r = a9mVar3;
                        oimVar.s = userActivity;
                        oimVar.v = 4;
                        gum.b.getClass();
                        try {
                            it = likedMoments2.iterator();
                            while (it.hasNext()) {
                                MomentLikedStatus momentLikedStatus = new MomentLikedStatus((String) it.next(), true);
                                BlazeDatabase.Companion companion = BlazeDatabase.INSTANCE;
                                BlazeDatabase instance2 = companion.instance();
                                Long l = (instance2 == null || (momentsLikedDao2 = instance2.getMomentsLikedDao()) == null) ? null : new Long(momentsLikedDao2.b(momentLikedStatus));
                                if (l != null && l.longValue() == -1 && (instance = companion.instance()) != null && (momentsLikedDao = instance.getMomentsLikedDao()) != null) {
                                    o02.K(momentsLikedDao.a(momentLikedStatus.getMomentId(), momentLikedStatus.isLiked()));
                                }
                                gum gumVar = gum.b;
                                String momentId = momentLikedStatus.getMomentId();
                                boolean isLiked = momentLikedStatus.isLiked();
                                gumVar.getClass();
                                gum.k(null, momentId, isLiked, false);
                            }
                        } catch (Throwable th) {
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                        }
                        unit = Unit.a;
                        lu3 lu3Var22 = lu3.a;
                        if (unit != lu3Var) {
                            a9mVar4 = a9mVar3;
                            List<UserActivityInteraction> interactionResponses = userActivity.getInteractionResponses();
                            oimVar.r = a9mVar4;
                            oimVar.s = null;
                            oimVar.v = 5;
                            d = vym.a.d(interactionResponses, oimVar);
                            if (d != lu3.a) {
                            }
                        }
                        return lu3Var;
                    }
                    if (i != 4) {
                        if (i == 5) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    userActivity = oimVar.s;
                    a9mVar4 = oimVar.r;
                    y6a.M(obj);
                    List<UserActivityInteraction> interactionResponses2 = userActivity.getInteractionResponses();
                    oimVar.r = a9mVar4;
                    oimVar.s = null;
                    oimVar.v = 5;
                    d = vym.a.d(interactionResponses2, oimVar);
                    if (d != lu3.a) {
                        d = Unit.a;
                    }
                }
                a9mVar = (a9m) obj;
                if (a9mVar instanceof qbm) {
                    userActivity = (UserActivity) ((qbm) a9mVar).a;
                    List<String> viewedStoryPages = userActivity.getViewedStoryPages();
                    oimVar.r = a9mVar;
                    oimVar.s = userActivity;
                    oimVar.v = 2;
                    Object l2 = StoriesRepositoryImpl.a.l(viewedStoryPages, oimVar);
                    if (l2 != lu3Var) {
                        l2 = Unit.a;
                    }
                    if (l2 != lu3Var) {
                        a9mVar2 = a9mVar;
                        List<String> viewedMoments2 = userActivity.getViewedMoments();
                        oimVar.r = a9mVar2;
                        oimVar.s = userActivity;
                        oimVar.v = 3;
                        p = gum.b.p(viewedMoments2, oimVar);
                        if (p != lu3Var) {
                        }
                        if (p != lu3Var) {
                        }
                    }
                    return lu3Var;
                }
                return Unit.a;
            }
        }
        oimVar = new oim(this, sq3Var);
        Object obj2 = oimVar.t;
        lu3 lu3Var3 = lu3.a;
        i = oimVar.v;
        if (i != 0) {
        }
        a9mVar = (a9m) obj2;
        if (a9mVar instanceof qbm) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:17|18))(8:19|20|21|(2:24|22)|25|26|(1:30)|31))(1:34))(7:52|(2:55|53)|56|57|(2:60|58)|61|62)|35|(8:37|38|(2:41|39)|42|43|(1:47)|48|(2:50|33)(7:51|21|(1:22)|25|26|(2:28|30)|31))|14|15))|66|6|7|(0)(0)|35|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0130, code lost:
    
        if (kotlin.Unit.a != r11) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bb, code lost:
    
        if (r8 == r11) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0033, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0133, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r8, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0113 A[Catch: all -> 0x0033, LOOP:0: B:22:0x010d->B:24:0x0113, LOOP_END, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002e, B:20:0x0044, B:21:0x0100, B:22:0x010d, B:24:0x0113, B:26:0x011d, B:28:0x0125, B:30:0x012b, B:31:0x012e, B:38:0x00cc, B:39:0x00d9, B:41:0x00df, B:43:0x00e9, B:45:0x00f1, B:47:0x00f7, B:48:0x00fa), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, List list2, rq3 rq3Var) {
        cmm cmmVar;
        int i;
        a9m a9mVar;
        a9m a9mVar2;
        trl storyPageDao;
        Iterator it;
        BlazeDatabase instance;
        i9m momentsViewedDao;
        if (rq3Var instanceof cmm) {
            cmmVar = (cmm) rq3Var;
            int i2 = cmmVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cmmVar.v = i2 - Integer.MIN_VALUE;
                Object obj = cmmVar.t;
                lu3 lu3Var = lu3.a;
                i = cmmVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    ArrayList arrayList = new ArrayList(k13.r(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((StoryPageStatus) it2.next()).getPageId());
                    }
                    ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((MomentViewed) it3.next()).getMomentId());
                    }
                    qnm qnmVar = new qnm(new UserActivityRequest(arrayList2, arrayList), null);
                    cmmVar.r = list;
                    cmmVar.s = list2;
                    cmmVar.v = 1;
                    hs4 hs4Var = z45.a;
                    obj = xw3.R(hq4.c, new xsl(false, qnmVar, null), cmmVar);
                } else if (i == 1) {
                    list2 = (List) cmmVar.s;
                    list = (List) cmmVar.r;
                    y6a.M(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a9mVar2 = (a9m) cmmVar.s;
                    list2 = (List) cmmVar.r;
                    y6a.M(obj);
                    cmmVar.r = a9mVar2;
                    cmmVar.s = null;
                    cmmVar.v = 3;
                    list2.getClass();
                    it = list2.iterator();
                    while (it.hasNext()) {
                        ((utl) it.next()).setSynced(true);
                    }
                    instance = BlazeDatabase.INSTANCE.instance();
                    if (instance != null && (momentsViewedDao = instance.getMomentsViewedDao()) != null) {
                        momentsViewedDao.b(list2);
                    }
                }
                a9mVar = (a9m) obj;
                if (a9mVar instanceof qbm) {
                    cmmVar.r = list2;
                    cmmVar.s = a9mVar;
                    cmmVar.v = 2;
                    list.getClass();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        ((utl) it4.next()).setSynced(true);
                    }
                    BlazeDatabase instance2 = BlazeDatabase.INSTANCE.instance();
                    if (instance2 != null && (storyPageDao = instance2.getStoryPageDao()) != null) {
                        storyPageDao.c(list);
                    }
                    if (Unit.a == lu3Var) {
                        return lu3Var;
                    }
                    a9mVar2 = a9mVar;
                    cmmVar.r = a9mVar2;
                    cmmVar.s = null;
                    cmmVar.v = 3;
                    list2.getClass();
                    it = list2.iterator();
                    while (it.hasNext()) {
                    }
                    instance = BlazeDatabase.INSTANCE.instance();
                    if (instance != null) {
                        momentsViewedDao.b(list2);
                    }
                }
                return Unit.a;
            }
        }
        cmmVar = new cmm(this, rq3Var);
        Object obj2 = cmmVar.t;
        lu3 lu3Var2 = lu3.a;
        i = cmmVar.v;
        if (i != 0) {
        }
        a9mVar = (a9m) obj2;
        if (a9mVar instanceof qbm) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(boolean z, sq3 sq3Var) {
        fpm fpmVar;
        int i;
        try {
            if (sq3Var instanceof fpm) {
                fpmVar = (fpm) sq3Var;
                int i2 = fpmVar.u;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fpmVar.u = i2 - Integer.MIN_VALUE;
                    Object obj = fpmVar.s;
                    lu3 lu3Var = lu3.a;
                    i = fpmVar.u;
                    if (i != 0) {
                        y6a.M(obj);
                        if (z) {
                            mgm mgmVar = mgm.a;
                            fpmVar.r = this;
                            fpmVar.u = 1;
                            if (mgm.a(0, fpmVar) == lu3Var) {
                                return lu3Var;
                            }
                        }
                        return new qbm(Unit.a);
                    }
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = fpmVar.r;
                    y6a.M(obj);
                    this.getClass();
                    d();
                    return new qbm(Unit.a);
                }
            }
            if (i != 0) {
            }
            this.getClass();
            d();
            return new qbm(Unit.a);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return new vca(null, null, null, 7, null);
        }
        fpmVar = new fpm(this, sq3Var);
        Object obj2 = fpmVar.s;
        lu3 lu3Var2 = lu3.a;
        i = fpmVar.u;
    }
}
