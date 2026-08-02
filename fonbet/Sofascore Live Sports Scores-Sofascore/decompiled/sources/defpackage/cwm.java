package defpackage;

import com.blaze.blazesdk.analytics.AnalyticsDoNotTrackLocal;
import com.blaze.blazesdk.analytics.AnalyticsTrackLocal;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.analytics.models.AnalyticsEvent;
import com.blaze.blazesdk.database.BlazeDatabase;
import com.blaze.blazesdk.shared.BlazeSDK;
import java.util.Objects;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cwm implements spm {
    public static final cwm a = new cwm();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f3, code lost:
    
        if (r10 == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(AnalyticsEvent analyticsEvent, sq3 sq3Var) {
        dtm dtmVar;
        int i;
        cwm cwmVar;
        BlazeSDK blazeSDK;
        lxm analyticsTrackDao;
        Object d;
        m4m analyticsDoNotTrackDao;
        if (sq3Var instanceof dtm) {
            dtmVar = (dtm) sq3Var;
            int i2 = dtmVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dtmVar.u = i2 - Integer.MIN_VALUE;
                Object obj = dtmVar.t;
                lu3 lu3Var = lu3.a;
                i = dtmVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    EventActionName event_action = analyticsEvent.getEvent_action();
                    BlazeSDK blazeSDK2 = BlazeSDK.INSTANCE;
                    if (blazeSDK2.getDoNotTrack$blazesdk_release()) {
                        analyticsEvent.getUser().setExternal_user_id(null);
                        analyticsEvent.getUser().setGenerated_user_id("do_not_track");
                    }
                    Objects.toString(event_action);
                    blazeSDK2.getDoNotTrack$blazesdk_release();
                    analyticsEvent.toString();
                    hs4 hs4Var = z45.a;
                    r69 r69Var = rob.a;
                    kum kumVar = new kum(analyticsEvent, null);
                    cwm cwmVar2 = a;
                    dtmVar.r = cwmVar2;
                    dtmVar.s = analyticsEvent;
                    dtmVar.u = 1;
                    if (xw3.R(r69Var, kumVar, dtmVar) != lu3Var) {
                        cwmVar = cwmVar2;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                analyticsEvent = dtmVar.s;
                cwmVar = dtmVar.r;
                y6a.M(obj);
                blazeSDK = BlazeSDK.INSTANCE;
                if (!blazeSDK.getDisableAnalytics()) {
                    return Unit.a;
                }
                dtmVar.r = null;
                dtmVar.s = null;
                dtmVar.u = 2;
                cwmVar.getClass();
                String q = y6a.q(analyticsEvent);
                if (q != null) {
                    if (blazeSDK.getDoNotTrack$blazesdk_release()) {
                        AnalyticsDoNotTrackLocal analyticsDoNotTrackLocal = new AnalyticsDoNotTrackLocal(0L, q, "", "", 1, null);
                        BlazeDatabase instance = BlazeDatabase.INSTANCE.instance();
                        if (instance != null && (analyticsDoNotTrackDao = instance.getAnalyticsDoNotTrackDao()) != null) {
                            d = analyticsDoNotTrackDao.d(new AnalyticsDoNotTrackLocal[]{analyticsDoNotTrackLocal}, dtmVar);
                            if (d != lu3Var) {
                                d = Unit.a;
                            }
                        }
                        d = Unit.a;
                    } else {
                        AnalyticsTrackLocal analyticsTrackLocal = new AnalyticsTrackLocal(0L, q, "", "", 1, null);
                        BlazeDatabase instance2 = BlazeDatabase.INSTANCE.instance();
                        if (instance2 != null && (analyticsTrackDao = instance2.getAnalyticsTrackDao()) != null) {
                            d = analyticsTrackDao.d(new AnalyticsTrackLocal[]{analyticsTrackLocal}, dtmVar);
                            if (d != lu3Var) {
                                d = Unit.a;
                            }
                        }
                        d = Unit.a;
                    }
                    return Unit.a;
                }
                d = Unit.a;
            }
        }
        dtmVar = new dtm(sq3Var);
        Object obj2 = dtmVar.t;
        lu3 lu3Var2 = lu3.a;
        i = dtmVar.u;
        if (i != 0) {
        }
        blazeSDK = BlazeSDK.INSTANCE;
        if (!blazeSDK.getDisableAnalytics()) {
        }
    }
}
