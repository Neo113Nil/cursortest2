package com.inmobi.unifiedId;

import android.content.Context;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.media.AbstractC3424fj;
import com.inmobi.media.AbstractC3435g4;
import com.inmobi.media.AbstractC3551kh;
import com.inmobi.media.AbstractC3633nl;
import com.inmobi.media.AbstractC3890xj;
import com.inmobi.media.C3478hl;
import com.inmobi.media.C3490i7;
import com.inmobi.media.C3503il;
import com.inmobi.media.C3839vk;
import com.inmobi.media.EnumC3943zk;
import com.inmobi.media.Hh;
import com.inmobi.media.L9;
import com.inmobi.media.N3;
import com.inmobi.media.Pa;
import com.inmobi.media.Q9;
import com.inmobi.media.Qa;
import com.inmobi.media.R9;
import com.inmobi.media.S9;
import com.inmobi.media.T9;
import com.inmobi.media.U9;
import com.inmobi.media.V9;
import com.inmobi.media.W9;
import com.inmobi.media.core.config.models.SignalsConfig;
import defpackage.a70;
import defpackage.h2d;
import defpackage.j2d;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0081@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/inmobi/unifiedId/InMobiUnifiedIdService;", "", "Lcom/inmobi/unifiedId/InMobiUserDataModel;", "inMobiUserDataModel", "", "push", "(Lcom/inmobi/unifiedId/InMobiUserDataModel;)V", "Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;", "inMobiUnifiedIdInterface", "fetchUnifiedIds", "(Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;)V", "fetchUnifiedIdsInternal$media_release", "(Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;Lrq3;)Ljava/lang/Object;", "fetchUnifiedIdsInternal", "reset", "()V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isPushCalled", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isPushCalled$annotations", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InMobiUnifiedIdService {

    @NotNull
    public static final InMobiUnifiedIdService INSTANCE = new InMobiUnifiedIdService();
    public static final AtomicBoolean a = new AtomicBoolean();
    public static final h2d b = new j2d();

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ce, code lost:
    
        if (r6.a((defpackage.sq3) r0) != r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00be, code lost:
    
        if (com.inmobi.media.C3490i7.a(r6, r0) == r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(InMobiUserDataModel inMobiUserDataModel, rq3 rq3Var) {
        U9 u9;
        int i;
        boolean booleanValue;
        InMobiUserDataModel inMobiUserDataModel2;
        if (rq3Var instanceof U9) {
            u9 = (U9) rq3Var;
            int i2 = u9.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u9.b = i2 - Integer.MIN_VALUE;
                Object obj = u9.a;
                lu3 lu3Var = lu3.a;
                i = u9.b;
                if (i != 0) {
                    y6a.M(obj);
                    Objects.toString(inMobiUserDataModel);
                    Hh hh = AbstractC3890xj.a;
                    boolean enabled = ((SignalsConfig) AbstractC3435g4.a.a(SignalsConfig.class)).getUnifiedIdServiceConfig().getEnabled();
                    if (!enabled) {
                        reset();
                    }
                    if (!enabled) {
                        return Unit.a;
                    }
                    if (AbstractC3633nl.c()) {
                        return Unit.a;
                    }
                    Boolean bool = AbstractC3551kh.b;
                    boolean z = false;
                    if (bool != null) {
                        booleanValue = bool.booleanValue();
                    } else {
                        Context context = AbstractC3424fj.a;
                        if (context != null) {
                            ConcurrentHashMap concurrentHashMap = Qa.b;
                            AbstractC3551kh.b = Boolean.valueOf(Pa.a(context, "user_info_store").a.getBoolean("user_age_restricted", false));
                        }
                        Boolean bool2 = AbstractC3551kh.b;
                        booleanValue = bool2 != null ? bool2.booleanValue() : false;
                    }
                    if (booleanValue) {
                        return Unit.a;
                    }
                    C3490i7 c3490i7 = C3490i7.a;
                    if (inMobiUserDataModel == null && C3490i7.b == null) {
                        z = true;
                    } else if (inMobiUserDataModel != null && (inMobiUserDataModel2 = C3490i7.b) != null) {
                        z = inMobiUserDataModel.equals(inMobiUserDataModel2);
                    }
                    if (z && a.get()) {
                        return Unit.a;
                    }
                    u9.b = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                a.set(true);
                C3503il c3503il = C3503il.a;
                u9.b = 2;
            }
        }
        u9 = new U9(rq3Var);
        Object obj2 = u9.a;
        lu3 lu3Var2 = lu3.a;
        i = u9.b;
        if (i != 0) {
        }
        a.set(true);
        C3503il c3503il2 = C3503il.a;
        u9.b = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r7 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (com.inmobi.media.C3490i7.a(null, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$resetInternal(rq3 rq3Var) {
        W9 w9;
        Object obj;
        int i;
        Object a2;
        if (rq3Var instanceof W9) {
            w9 = (W9) rq3Var;
            int i2 = w9.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w9.b = i2 - Integer.MIN_VALUE;
                Object obj2 = w9.a;
                obj = lu3.a;
                i = w9.b;
                if (i != 0) {
                    y6a.M(obj2);
                    a.set(false);
                    w9.b = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj2);
                        Q9.b(null);
                        Q9.a(null);
                        Q9.d = false;
                        Q9.c = false;
                        return Unit.a;
                    }
                    y6a.M(obj2);
                }
                C3503il c3503il = C3503il.a;
                w9.b = 2;
                a2 = N3.a(C3503il.b, new C3478hl(null), w9);
                if (a2 != obj) {
                    a2 = Unit.a;
                }
            }
        }
        w9 = new W9(rq3Var);
        Object obj22 = w9.a;
        obj = lu3.a;
        i = w9.b;
        if (i != 0) {
        }
        C3503il c3503il2 = C3503il.a;
        w9.b = 2;
        a2 = N3.a(C3503il.b, new C3478hl(null), w9);
        if (a2 != obj) {
        }
    }

    public static final void fetchUnifiedIds(@Nullable InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        if (!AbstractC3424fj.d()) {
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
        xw3.L(L9.c, null, null, new R9(inMobiUnifiedIdInterface, null), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|(1:(6:(1:(1:11)(2:22|23))(1:24)|12|13|14|15|16)(1:25))(3:41|(1:43)|(2:45|46)(2:47|(2:49|50)(3:51|(1:53)(4:59|(1:61)|62|(1:64)(1:65))|(2:55|56)(1:57))))|26|27|(6:29|(3:31|32|33)|35|14|15|16)(1:36)|19|20|21))|66|6|(0)(0)|26|27|(0)(0)|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0109, code lost:
    
        if (a(r9, r0) == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fd, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0113, code lost:
    
        r8 = r10;
        r10 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e3, code lost:
    
        if (r10.e(r0) == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0 A[Catch: all -> 0x00fd, TryCatch #0 {all -> 0x00fd, blocks: (B:27:0x00e6, B:29:0x00f0, B:36:0x00ff), top: B:26:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff A[Catch: all -> 0x00fd, TRY_LEAVE, TryCatch #0 {all -> 0x00fd, blocks: (B:27:0x00e6, B:29:0x00f0, B:36:0x00ff), top: B:26:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object fetchUnifiedIdsInternal$media_release(@Nullable InMobiUnifiedIdInterface inMobiUnifiedIdInterface, @NotNull rq3<? super Unit> rq3Var) {
        S9 s9;
        int i;
        boolean booleanValue;
        h2d h2dVar;
        h2d h2dVar2;
        if (rq3Var instanceof S9) {
            s9 = (S9) rq3Var;
            int i2 = s9.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s9.d = i2 - Integer.MIN_VALUE;
                Object obj = s9.c;
                lu3 lu3Var = lu3.a;
                i = s9.d;
                if (i != 0) {
                    y6a.M(obj);
                    HashMap hashMap = new HashMap();
                    C3839vk c3839vk = C3839vk.a;
                    C3839vk.b("FetchApiInvoked", hashMap, EnumC3943zk.SDK);
                    Hh hh = AbstractC3890xj.a;
                    boolean enabled = ((SignalsConfig) AbstractC3435g4.a.a(SignalsConfig.class)).getUnifiedIdServiceConfig().getEnabled();
                    if (!enabled) {
                        reset();
                    }
                    if (!enabled) {
                        AbstractC3633nl.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.UNIFIED_SERVICE_IS_NOT_ENABLED));
                        return Unit.a;
                    }
                    if (AbstractC3633nl.c()) {
                        AbstractC3633nl.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.USER_HAS_OPTED_OUT));
                        return Unit.a;
                    }
                    Boolean bool = AbstractC3551kh.b;
                    if (bool != null) {
                        booleanValue = bool.booleanValue();
                    } else {
                        Context context = AbstractC3424fj.a;
                        if (context != null) {
                            ConcurrentHashMap concurrentHashMap = Qa.b;
                            AbstractC3551kh.b = Boolean.valueOf(Pa.a(context, "user_info_store").a.getBoolean("user_age_restricted", false));
                        }
                        Boolean bool2 = AbstractC3551kh.b;
                        booleanValue = bool2 != null ? bool2.booleanValue() : false;
                    }
                    if (booleanValue) {
                        AbstractC3633nl.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.USER_HAS_AGE_RESTRICTION));
                        return Unit.a;
                    }
                    h2dVar = b;
                    s9.a = inMobiUnifiedIdInterface;
                    s9.b = h2dVar;
                    s9.d = 1;
                } else if (i != 1) {
                    if (i == 2) {
                        h2dVar2 = (h2d) s9.a;
                    } else {
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h2dVar2 = (h2d) s9.a;
                    }
                    try {
                        y6a.M(obj);
                        Unit unit = Unit.a;
                        h2dVar2.f(null);
                        return unit;
                    } catch (Throwable th) {
                        Throwable th2 = th;
                    }
                } else {
                    h2d h2dVar3 = s9.b;
                    InMobiUnifiedIdInterface inMobiUnifiedIdInterface2 = (InMobiUnifiedIdInterface) s9.a;
                    y6a.M(obj);
                    h2dVar = h2dVar3;
                    inMobiUnifiedIdInterface = inMobiUnifiedIdInterface2;
                }
                if (C3503il.b.b.get() == null) {
                    s9.a = h2dVar;
                    s9.b = null;
                    s9.d = 2;
                    if (C3503il.a(inMobiUnifiedIdInterface, s9) == lu3Var) {
                        return lu3Var;
                    }
                    h2dVar2 = h2dVar;
                    Unit unit2 = Unit.a;
                    h2dVar2.f(null);
                    return unit2;
                }
                s9.a = h2dVar;
                s9.b = null;
                s9.d = 3;
                Throwable th22 = th;
                h2dVar2.f(null);
                throw th22;
            }
        }
        s9 = new S9(rq3Var);
        Object obj2 = s9.c;
        lu3 lu3Var2 = lu3.a;
        i = s9.d;
        if (i != 0) {
        }
        if (C3503il.b.b.get() == null) {
        }
        Throwable th222 = th;
        h2dVar2.f(null);
        throw th222;
    }

    public static final void push(@Nullable InMobiUserDataModel inMobiUserDataModel) {
        Objects.toString(inMobiUserDataModel);
        if (!AbstractC3424fj.d()) {
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
        xw3.L(L9.c, null, null, new T9(inMobiUserDataModel, null), 3);
    }

    public static final void reset() {
        if (!AbstractC3424fj.d()) {
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
        xw3.L(L9.c, null, null, new V9(null), 3);
    }

    @NotNull
    public final AtomicBoolean isPushCalled() {
        return a;
    }

    public static /* synthetic */ void isPushCalled$annotations() {
    }

    public static final Object a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, rq3 rq3Var) {
        JSONObject b2 = Q9.b();
        if (!AbstractC3633nl.b(b2) && b2 != null && AbstractC3633nl.c(b2)) {
            Object a2 = C3503il.a(inMobiUnifiedIdInterface, rq3Var);
            return a2 == lu3.a ? a2 : Unit.a;
        }
        if (inMobiUnifiedIdInterface != null) {
            if (AbstractC3633nl.b(b2)) {
                if (a.get()) {
                    Object a3 = C3503il.a(inMobiUnifiedIdInterface, rq3Var);
                    return a3 == lu3.a ? a3 : Unit.a;
                }
                AbstractC3633nl.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.PUSH_NEEDS_TO_BE_CALLED_FIRST));
            } else {
                AbstractC3633nl.a(inMobiUnifiedIdInterface, b2, null);
            }
        }
        return Unit.a;
    }
}
