package com.moloco.sdk.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.internal.l0;
import com.moloco.sdk.internal.publisher.g1;
import com.moloco.sdk.internal.services.init.j;
import com.moloco.sdk.internal.services.init.p;
import com.moloco.sdk.j2;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import com.moloco.sdk.service_locator.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s;
import defpackage.a70;
import defpackage.hje;
import defpackage.hoi;
import defpackage.hs4;
import defpackage.il4;
import defpackage.k13;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rob;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 0, 0})
@il4(c = "com.moloco.sdk.publisher.Moloco$initialize$2", f = "Moloco.kt", l = {149, 151, 174}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class Moloco$initialize$2 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ MolocoInitParams $initParam;
    final /* synthetic */ MolocoInitializationListener $listener;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Moloco$initialize$2(MolocoInitParams molocoInitParams, MolocoInitializationListener molocoInitializationListener, rq3<? super Moloco$initialize$2> rq3Var) {
        super(2, rq3Var);
        this.$initParam = molocoInitParams;
        this.$listener = molocoInitializationListener;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new Moloco$initialize$2(this.$initParam, this.$listener, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((Moloco$initialize$2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x014a, code lost:
    
        if (r13 == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00af, code lost:
    
        if (r14 == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0071, code lost:
    
        if (r14 == r0) goto L42;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g1 initializationHandler;
        Moloco$initialize$2 moloco$initialize$2;
        Set set;
        Object updateAndroidClientMetricsOnInitSuccess;
        Set set2;
        ArrayList s;
        boolean shouldInitializeILRD;
        ArrayList s2;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            y6a.M(obj);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "launched the scope to initialize sdk with thread name: " + Thread.currentThread().getName() + " and dispatcher DispatcherProvider().IO", null, false, 12, null);
            com.moloco.sdk.internal.error.crash.b bVar = (com.moloco.sdk.internal.error.crash.b) com.moloco.sdk.service_locator.d.a.getValue();
            this.label = 1;
            bVar.getClass();
            hs4 hs4Var = z45.a;
            Object R = xw3.R(rob.a, new hje(bVar, null, 20), this);
            if (R != lu3Var) {
                R = Unit.a;
            }
        } else if (i == 1) {
            y6a.M(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                moloco$initialize$2 = this;
                Moloco moloco = Moloco.INSTANCE;
                MolocoInitParams molocoInitParams = moloco$initialize$2.$initParam;
                synchronized (moloco) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    linkedHashSet.add(molocoInitParams.getMediationInfo().getName());
                    linkedHashSet.addAll(moloco.getPendingInitByMediator$moloco_sdk_release().keySet());
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            shouldInitializeILRD = Moloco.INSTANCE.shouldInitializeILRD((String) it.next());
                            if (shouldInitializeILRD) {
                                break;
                            }
                        }
                    }
                    z = false;
                }
                if (z) {
                    Moloco.INSTANCE.initializeILRD();
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Moloco SDK initialization success", null, false, 12, null);
                Moloco moloco2 = Moloco.INSTANCE;
                synchronized (moloco2) {
                    s2 = k13.s(moloco2.getPendingInitByMediator$moloco_sdk_release().values());
                    moloco2.getPendingInitByMediator$moloco_sdk_release().clear();
                }
                MolocoInitStatus molocoInitStatus = g1.g;
                MolocoInitializationListener molocoInitializationListener = moloco$initialize$2.$listener;
                if (molocoInitializationListener != null) {
                    s.i(molocoInitializationListener, molocoInitStatus);
                }
                Iterator it2 = s2.iterator();
                while (it2.hasNext()) {
                    s.i((MolocoInitializationListener) it2.next(), molocoInitStatus);
                }
                return Unit.a;
            }
            y6a.M(obj);
            moloco$initialize$2 = this;
            l0 l0Var = (l0) obj;
            if (l0Var instanceof j0) {
                set2 = Moloco._failedMediations;
                set2.add(moloco$initialize$2.$initParam.getMediationInfo().getName());
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Moloco SDK initialization failed", null, false, 12, null);
                Moloco moloco3 = Moloco.INSTANCE;
                synchronized (moloco3) {
                    s = k13.s(moloco3.getPendingInitByMediator$moloco_sdk_release().values());
                    moloco3.getPendingInitByMediator$moloco_sdk_release().clear();
                }
                MolocoInitStatus molocoInitStatus2 = g1.f;
                String obj2 = ((j) ((j0) l0Var).a).toString();
                obj2.getClass();
                MolocoInitStatus molocoInitStatus3 = new MolocoInitStatus(Initialization.FAILURE, obj2);
                MolocoInitializationListener molocoInitializationListener2 = moloco$initialize$2.$listener;
                if (molocoInitializationListener2 != null) {
                    s.i(molocoInitializationListener2, molocoInitStatus3);
                }
                Iterator it3 = s.iterator();
                while (it3.hasNext()) {
                    s.i((MolocoInitializationListener) it3.next(), molocoInitStatus3);
                }
                return Unit.a;
            }
            if (!(l0Var instanceof k0)) {
                zzl.b();
                return null;
            }
            set = Moloco._failedMediations;
            set.remove(moloco$initialize$2.$initParam.getMediationInfo().getName());
            Moloco moloco4 = Moloco.INSTANCE;
            moloco4.processInitConfigs((j2) ((k0) l0Var).a);
            moloco$initialize$2.label = 3;
            updateAndroidClientMetricsOnInitSuccess = moloco4.updateAndroidClientMetricsOnInitSuccess(moloco$initialize$2);
        }
        Moloco moloco5 = Moloco.INSTANCE;
        moloco5.initializeAndroidClientMetrics(this.$initParam);
        initializationHandler = moloco5.getInitializationHandler();
        String appKey = this.$initParam.getAppKey();
        MediationInfo mediationInfo = this.$initParam.getMediationInfo();
        p pVar = (p) f.c.getValue();
        com.moloco.sdk.acm.recorder.a aVar = com.moloco.sdk.acm.recorder.b.Companion;
        String name = this.$initParam.getMediationInfo().getName();
        aVar.getClass();
        com.moloco.sdk.acm.recorder.c a = com.moloco.sdk.acm.recorder.a.a(name);
        this.label = 2;
        moloco$initialize$2 = this;
        obj = initializationHandler.c(appKey, mediationInfo, pVar, a, moloco$initialize$2);
    }
}
