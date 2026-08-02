package defpackage;

import com.blaze.blazesdk.database.BlazeDatabase;
import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import com.blaze.blazesdk.interactions.models.local.InteractionStatus;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.user_activity.models.responses.UserActivityInteraction;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vym {
    public static final vym a = new vym();
    public static final HashMap b = new HashMap();

    public static Integer a(String str, String str2) {
        tlm interactionStatusDao;
        try {
            BlazeDatabase instance = BlazeDatabase.INSTANCE.instance();
            if (instance == null || (interactionStatusDao = instance.getInteractionStatusDao()) == null) {
                return null;
            }
            return new Integer(((lsm) interactionStatusDao).a(str, str2));
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(InteractionStatus interactionStatus, sq3 sq3Var) {
        ivm ivmVar;
        int i;
        tlm interactionStatusDao;
        try {
            if (sq3Var instanceof ivm) {
                ivmVar = (ivm) sq3Var;
                int i2 = ivmVar.t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ivmVar.t = i2 - Integer.MIN_VALUE;
                    Object obj = ivmVar.r;
                    lu3 lu3Var = lu3.a;
                    i = ivmVar.t;
                    if (i != 0) {
                        y6a.M(obj);
                        BlazeDatabase instance = BlazeDatabase.INSTANCE.instance();
                        if (instance == null || (interactionStatusDao = instance.getInteractionStatusDao()) == null) {
                            return null;
                        }
                        ivmVar.t = 1;
                        lsm lsmVar = (lsm) interactionStatusDao;
                        obj = rd0.f.m(lsmVar.a, true, new crm(lsmVar, interactionStatus), ivmVar);
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
                    return (Long) obj;
                }
            }
            if (i != 0) {
            }
            return (Long) obj;
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return null;
        }
        ivmVar = new ivm(this, sq3Var);
        Object obj2 = ivmVar.r;
        lu3 lu3Var2 = lu3.a;
        i = ivmVar.t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r9 == r13) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, String str3, sq3 sq3Var) {
        mvm mvmVar;
        int i;
        a9m a9mVar;
        boolean z;
        if (sq3Var instanceof mvm) {
            mvmVar = (mvm) sq3Var;
            int i2 = mvmVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mvmVar.v = i2 - Integer.MIN_VALUE;
                mvm mvmVar2 = mvmVar;
                Object obj = mvmVar2.t;
                lu3 lu3Var = lu3.a;
                i = mvmVar2.v;
                if (i != 0) {
                    y6a.M(obj);
                    rwl rwlVar = rwl.a;
                    kxm kxmVar = new kxm(str, str2, str3, null);
                    mvmVar2.r = str;
                    mvmVar2.s = str3;
                    mvmVar2.v = 1;
                    obj = rwl.safeApiCall$default(rwlVar, false, kxmVar, mvmVar2, 1, null);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a9m a9mVar2 = (a9m) mvmVar2.r;
                        y6a.M(obj);
                        return a9mVar2;
                    }
                    str3 = mvmVar2.s;
                    str = (String) mvmVar2.r;
                    y6a.M(obj);
                }
                a9mVar = (a9m) obj;
                z = a9mVar instanceof a6m;
                vym vymVar = a;
                if (z) {
                    Objects.toString((a6m) a9mVar);
                    vymVar.getClass();
                }
                if (a9mVar instanceof qbm) {
                    vymVar.getClass();
                    List c = a.c(new UserActivityInteraction(str, str3));
                    mvmVar2.r = a9mVar;
                    mvmVar2.s = null;
                    mvmVar2.v = 2;
                    if (vymVar.d(c, mvmVar2) == lu3Var) {
                        return lu3Var;
                    }
                }
                return a9mVar;
            }
        }
        mvmVar = new mvm(this, sq3Var);
        mvm mvmVar22 = mvmVar;
        Object obj2 = mvmVar22.t;
        lu3 lu3Var2 = lu3.a;
        i = mvmVar22.v;
        if (i != 0) {
        }
        a9mVar = (a9m) obj2;
        z = a9mVar instanceof a6m;
        vym vymVar2 = a;
        if (z) {
        }
        if (a9mVar instanceof qbm) {
        }
        return a9mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r5.c(r6, r0) != r7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r5.f(r6, r0) == r7) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(List list, sq3 sq3Var) {
        bym bymVar;
        int i;
        if (sq3Var instanceof bym) {
            bymVar = (bym) sq3Var;
            int i2 = bymVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bymVar.u = i2 - Integer.MIN_VALUE;
                Object obj = bymVar.s;
                lu3 lu3Var = lu3.a;
                i = bymVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    gum gumVar = gum.b;
                    bymVar.r = list;
                    bymVar.u = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = bymVar.r;
                    y6a.M(obj);
                }
                StoriesRepositoryImpl storiesRepositoryImpl = StoriesRepositoryImpl.a;
                bymVar.r = null;
                bymVar.u = 2;
            }
        }
        bymVar = new bym(this, sq3Var);
        Object obj2 = bymVar.s;
        lu3 lu3Var2 = lu3.a;
        i = bymVar.u;
        if (i != 0) {
        }
        StoriesRepositoryImpl storiesRepositoryImpl2 = StoriesRepositoryImpl.a;
        bymVar.r = null;
        bymVar.u = 2;
    }
}
