package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.textclassifier.TextClassifier;
import com.blaze.blazesdk.features.stories.widgets.compose.BlazeComposeWidgetStoriesStateHandler;
import com.facebook.internal.t;
import com.facebook.login.i;
import com.moloco.sdk.acm.d;
import com.moloco.sdk.acm.eventprocessing.f;
import com.moloco.sdk.acm.services.a;
import com.moloco.sdk.acm.services.c;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.error.crash.b;
import com.moloco.sdk.internal.ilrd.m;
import com.moloco.sdk.internal.ilrd.n;
import com.moloco.sdk.internal.ilrd.p;
import com.moloco.sdk.internal.ilrd.q;
import com.moloco.sdk.internal.ilrd.r;
import com.moloco.sdk.internal.ilrd.s;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.services.init.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.b0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.service.OrderedSportsWorker;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.sofascore.results.wc26.bottomSheet.WorldCupTeamPickerBottomSheet;
import defpackage.cp4;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hje extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hje(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = obj;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                return new hje((kje) obj2, rq3Var, 0);
            case 1:
                return new hje((d6f) obj2, rq3Var, 1);
            case 2:
                return new hje((q9f) obj2, rq3Var, 2);
            case 3:
                return new hje((tdg) obj2, rq3Var, 3);
            case 4:
                return new hje((UserAccount) obj2, rq3Var, 4);
            case 5:
                return new hje((SegmentedButtonsView) obj2, rq3Var, 5);
            case 6:
                return new hje((o7h) obj2, rq3Var, 6);
            case 7:
                return new hje((Event) obj2, rq3Var, 7);
            case 8:
                return new hje((d3i) obj2, rq3Var, 8);
            case 9:
                return new hje((v2g) obj2, rq3Var, 9);
            case 10:
                return new hje((lci) obj2, rq3Var, 10);
            case 11:
                return new hje((TypeHeaderView) obj2, rq3Var, 11);
            case 12:
                return new hje((rlk) obj2, rq3Var, 12);
            case 13:
                return new hje((cvk) obj2, rq3Var, 13);
            case 14:
                return new hje((dvk) obj2, rq3Var, 14);
            case 15:
                return new hje((WorldCupTeamPickerBottomSheet) obj2, rq3Var, 15);
            case 16:
                return new hje((BlazeComposeWidgetStoriesStateHandler) obj2, rq3Var, 16);
            case 17:
                return new hje((f) obj2, rq3Var, 17);
            case 18:
                return new hje((a) obj2, rq3Var, 18);
            case 19:
                return new hje((i) obj2, rq3Var, 19);
            case 20:
                return new hje((b) obj2, rq3Var, 20);
            case 21:
                return new hje((n) obj2, rq3Var, 21);
            case 22:
                return new hje((g) obj2, rq3Var, 22);
            case 23:
                return new hje((g0) obj2, rq3Var, 23);
            case 24:
                return new hje((j0) obj2, rq3Var, 24);
            case 25:
                return new hje((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g) obj2, rq3Var, 25);
            case 26:
                return new hje((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i) obj2, rq3Var, 26);
            case 27:
                return new hje((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b) obj2, rq3Var, 27);
            case 28:
                return new hje((e) obj2, rq3Var, 28);
            default:
                return new hje((b0) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
        }
        return ((hje) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        gv9 itemsState;
        SharedPreferences d;
        gv9 itemsState2;
        boolean triggerOnInitialization;
        int i = 0;
        int i2 = 3;
        rq3 rq3Var = null;
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                kje kjeVar = (kje) this.s;
                TextClassifier k = c90.k(kjeVar.b, kjeVar.c);
                kjeVar.f = k;
                return k;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                ((d6f) this.s).getClass();
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                q9f q9fVar = (q9f) this.s;
                q9fVar.getClass();
                xw3.L(un0.z(q9fVar), null, null, new ac6(q9fVar, null), 3);
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                tdg tdgVar = (tdg) this.s;
                if (tdgVar.v == ndg.b) {
                    sdg sdgVar = tdgVar.n;
                    if (sdgVar == null) {
                        Intrinsics.i("rootLayout");
                        throw null;
                    }
                    sdgVar.requestFocus();
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                return (UserAccount) this.s;
            case 5:
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) this.s;
                itemsState = segmentedButtonsView.getItemsState();
                if (!itemsState.isEmpty() && segmentedButtonsView.g) {
                    segmentedButtonsView.r();
                }
                return Unit.a;
            case 6:
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                return (o7h) this.s;
            case 7:
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                uoh.b();
                we2 we2Var = uoh.a;
                Event event = (Event) this.s;
                synchronized (we2Var) {
                    try {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator it = we2Var.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (((JSONObject) entry.getValue()).optInt("id") == event.getId()) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Iterator it2 = linkedHashMap.entrySet().iterator();
                        while (it2.hasNext()) {
                            ufa.D((JSONObject) ((Map.Entry) it2.next()).getValue(), event);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.a;
            case 8:
                lu3 lu3Var9 = lu3.a;
                y6a.M(obj);
                d3i d3iVar = (d3i) this.s;
                d3iVar.n(null, new l2i(d3iVar));
                return Unit.a;
            case 9:
                lu3 lu3Var10 = lu3.a;
                y6a.M(obj);
                Object obj2 = ((v2g) this.s).a;
                rfo.F((List) obj2);
                return obj2;
            case 10:
                lu3 lu3Var11 = lu3.a;
                y6a.M(obj);
                Context i3 = ((lci) this.s).i();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = i3.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                long j = sharedPreferences.getLong("LastSportOrderFetchTimestamp", 0L);
                Context i4 = ((lci) this.s).i();
                SharedPreferences sharedPreferences2 = uic.j;
                if (sharedPreferences2 == null) {
                    Context applicationContext2 = i4.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext2);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences2 = d;
                }
                if (!sharedPreferences2.getBoolean("UserHasCustomizedSportOrder", false) && j < yaa.w() - 86400) {
                    Context i5 = ((lci) this.s).i();
                    SharedPreferences sharedPreferences3 = uic.j;
                    if (sharedPreferences3 == null) {
                        Context applicationContext3 = i5.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences3 = a5f.d(applicationContext3);
                            uic.j = sharedPreferences3;
                        }
                        sharedPreferences3.getClass();
                    }
                    SharedPreferences.Editor edit = sharedPreferences3.edit();
                    edit.getClass();
                    edit.putLong("LastSportOrderFetchTimestamp", yaa.w());
                    Unit unit = Unit.a;
                    edit.apply();
                    Context i6 = ((lci) this.s).i();
                    ktd A = mha.A(new ktd(OrderedSportsWorker.class));
                    mha.y(A);
                    vxd.h(i6).b("OrderedSportsWorker-".concat(""), nf6.a, (ltd) A.a());
                }
                return Unit.a;
            case 11:
                lu3 lu3Var12 = lu3.a;
                y6a.M(obj);
                TypeHeaderView typeHeaderView = (TypeHeaderView) this.s;
                itemsState2 = typeHeaderView.getItemsState();
                if (!itemsState2.isEmpty()) {
                    triggerOnInitialization = typeHeaderView.getTriggerOnInitialization();
                    if (triggerOnInitialization) {
                        typeHeaderView.v();
                    }
                }
                return Unit.a;
            case 12:
                lu3 lu3Var13 = lu3.a;
                y6a.M(obj);
                rlk rlkVar = (rlk) this.s;
                Iterator it3 = rlkVar.f.iterator();
                while (it3.hasNext()) {
                    ((pkk) it3.next()).s(rlkVar.d);
                }
                Unit unit2 = Unit.a;
                rlkVar.m = false;
                return Unit.a;
            case 13:
                lu3 lu3Var14 = lu3.a;
                y6a.M(obj);
                cvk cvkVar = (cvk) this.s;
                avk avkVar = cvkVar.d;
                if (avkVar != null) {
                    g6b g6bVar = avkVar.d;
                    avkVar.e.e(null);
                    sw8 sw8Var = avkVar.c;
                    if (sw8Var != null && g6bVar != null) {
                        g6bVar.d(sw8Var);
                    }
                    if (g6bVar != null) {
                        g6bVar.d(avkVar);
                    }
                }
                cvkVar.d = null;
                return Unit.a;
            case 14:
                lu3 lu3Var15 = lu3.a;
                y6a.M(obj);
                dvk dvkVar = (dvk) this.s;
                bvk bvkVar = dvkVar.d;
                if (bvkVar != null) {
                    g6b g6bVar2 = bvkVar.d;
                    bvkVar.e.e(null);
                    ku9 ku9Var = bvkVar.c;
                    if (ku9Var != null) {
                        g6bVar2.d(ku9Var);
                    }
                    g6bVar2.d(bvkVar);
                }
                dvkVar.d = null;
                return Unit.a;
            case 15:
                lu3 lu3Var16 = lu3.a;
                y6a.M(obj);
                WorldCupTeamPickerBottomSheet worldCupTeamPickerBottomSheet = (WorldCupTeamPickerBottomSheet) this.s;
                Bundle arguments = worldCupTeamPickerBottomSheet.getArguments();
                if (arguments != null && arguments.getBoolean("is_retarget")) {
                    qkl L = worldCupTeamPickerBottomSheet.L();
                    xw3.L(un0.z(L), null, null, new kkl(L, rq3Var, i), 3);
                }
                return Unit.a;
            case 16:
                lu3 lu3Var17 = lu3.a;
                y6a.M(obj);
                ((BlazeComposeWidgetStoriesStateHandler) this.s).reloadData(true);
                return Unit.a;
            case 17:
                lu3 lu3Var18 = lu3.a;
                y6a.M(obj);
                ((t) ((f) this.s).a).a();
                return Unit.a;
            case 18:
                lu3 lu3Var19 = lu3.a;
                y6a.M(obj);
                ((a) this.s).a.a();
                return Unit.a;
            case 19:
                lu3 lu3Var20 = lu3.a;
                y6a.M(obj);
                i iVar = (i) this.s;
                if (((AtomicBoolean) iVar.d).compareAndSet(false, true)) {
                    mqi mqiVar = c.a;
                    c.b("ApplicationLifecycleObserver", "Start observing application lifecycle events");
                    ((g6b) iVar.b).a((a) iVar.c);
                }
                return Unit.a;
            case 20:
                lu3 lu3Var21 = lu3.a;
                y6a.M(obj);
                final b bVar = (b) this.s;
                if (bVar.b == null) {
                    bVar.b = Thread.getDefaultUncaughtExceptionHandler();
                    Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.moloco.sdk.internal.error.crash.a
                        /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
                        
                            r3 = r18.getCause();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
                        
                            if (r3 != null) goto L29;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
                        
                            r3 = r3.getStackTrace();
                            r3.getClass();
                            r4 = r3.length;
                            r6 = 0;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
                        
                            if (r6 >= r4) goto L35;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
                        
                            r8 = r3[r6].getClassName();
                            r8.getClass();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
                        
                            if (kotlin.text.StringsKt.J(r8, "com.moloco.sdk", false) == false) goto L21;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
                        
                            r6 = r6 + 1;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
                        
                            r9 = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                            com.moloco.sdk.internal.MolocoLogger.error$default(r9, "MolocoSDKExceptionFilter", "SDK detected in stacktrace", null, false, 12, null);
                            r2 = r9;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:31:0x0011, code lost:
                        
                            continue;
                         */
                        @Override // java.lang.Thread.UncaughtExceptionHandler
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void uncaughtException(Thread thread, Throwable th2) {
                            MolocoLogger molocoLogger;
                            b bVar2 = b.this;
                            t tVar = bVar2.a;
                            th2.getClass();
                            Iterator it4 = ((List) tVar.b).iterator();
                            loop0: while (it4.hasNext()) {
                                ((com.moloco.sdk.internal.error.crash.filters.a) it4.next()).getClass();
                                StackTraceElement[] stackTrace = th2.getStackTrace();
                                stackTrace.getClass();
                                int length = stackTrace.length;
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= length) {
                                        break;
                                    }
                                    String className = stackTrace[i7].getClassName();
                                    className.getClass();
                                    if (StringsKt.J(className, "com.moloco.sdk", false)) {
                                        MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                                        MolocoLogger.error$default(molocoLogger2, "MolocoSDKExceptionFilter", "SDK detected in stacktrace", null, false, 12, null);
                                        molocoLogger = molocoLogger2;
                                        break loop0;
                                    }
                                    i7++;
                                }
                                com.moloco.sdk.acm.recorder.c cVar = (com.moloco.sdk.acm.recorder.c) tVar.c;
                                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
                                cVar.a(new d("crash_detected"));
                                MolocoLogger.error$default(molocoLogger, "ErrorReportingApi", "SDK Crashed", th2, false, 8, null);
                            }
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, "CrashHandlerService", "App Crashed", null, false, 12, null);
                            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = bVar2.b;
                            if (uncaughtExceptionHandler != null) {
                                uncaughtExceptionHandler.uncaughtException(thread, th2);
                            } else {
                                System.exit(2);
                                cp4.h("System.exit returned normally, while it was supposed to halt JVM.");
                            }
                        }
                    });
                }
                return Unit.a;
            case 21:
                lu3 lu3Var22 = lu3.a;
                y6a.M(obj);
                n nVar = (n) this.s;
                for (m mVar : (List) ((mqi) nVar.d).getValue()) {
                    s sVar = (s) mVar.getState().getValue();
                    if (sVar instanceof p) {
                        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "IlrdService", "Failed to subscribe to " + mVar.a() + " ILRD: " + ((p) sVar).a, null, false, 12, null);
                    } else if (sVar instanceof r) {
                        Object b = mVar.b();
                        Throwable a = w2g.a(b);
                        if (a != null) {
                            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "IlrdService", "Failed to subscribe to " + mVar.a() + " ILRD: " + a, null, false, 12, null);
                        }
                        if (!(b instanceof u2g)) {
                            ((Set) nVar.e).add(mVar);
                            fcp.m0(new v98(mVar.c(), new pdk(nVar, rq3Var, 15), i2), (ad2) nVar.a);
                        }
                    } else if (!(sVar instanceof q)) {
                        zzl.b();
                        return null;
                    }
                }
                return Unit.a;
            case 22:
                lu3 lu3Var23 = lu3.a;
                y6a.M(obj);
                ((g) this.s).a.edit().clear().commit();
                return Unit.a;
            case 23:
                lu3 lu3Var24 = lu3.a;
                y6a.M(obj);
                Regex regex = l0.a;
                g0 g0Var = (g0) this.s;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m a2 = l0.a(g0Var.c.a);
                g0Var.g = a2;
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AggregatedFullscreenAd", "Native ad resolved creativeType: " + a2, false, 4, null);
                return a2;
            case 24:
                lu3 lu3Var25 = lu3.a;
                y6a.M(obj);
                return Unit.a;
            case 25:
                lu3 lu3Var26 = lu3.a;
                y6a.M(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g) this.s;
                n nVar2 = (n) gVar.k;
                ArrayList arrayList = (ArrayList) nVar2.d;
                if (arrayList != null) {
                    ((f1) nVar2.e).a(arrayList, null, null, null);
                    nVar2.d = null;
                }
                gVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.a);
                return Unit.a;
            case 26:
                lu3 lu3Var27 = lu3.a;
                y6a.M(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g gVar2 = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i) this.s).a;
                n nVar3 = (n) gVar2.k;
                ArrayList arrayList2 = (ArrayList) nVar3.d;
                if (arrayList2 != null) {
                    ((f1) nVar3.e).a(arrayList2, null, null, null);
                    nVar3.d = null;
                }
                gVar2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.a);
                return Unit.a;
            case 27:
                lu3 lu3Var28 = lu3.a;
                y6a.M(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b bVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b) this.s;
                f fVar = bVar2.e;
                List list = (List) fVar.c;
                if (list != null) {
                    ((f1) fVar.f).a(list, null, null, null);
                    fVar.c = null;
                }
                xw3.L(bVar2.c, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(bVar2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a.a, rq3Var, 16), 3);
                return Unit.a;
            case 28:
                lu3 lu3Var29 = lu3.a;
                y6a.M(obj);
                ((e) this.s).d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b.c);
                return Unit.a;
            default:
                lu3 lu3Var30 = lu3.a;
                y6a.M(obj);
                ((b0) this.s).a.d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b.c);
                return Unit.a;
        }
    }
}
