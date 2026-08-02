package bo.app;

import android.content.Context;
import bo.app.dg;
import bo.app.mg;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.IEventSubscriber;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import di.C4087f;
import di.Z0;
import ei.AbstractC4212b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mg {

    /* renamed from: p, reason: collision with root package name */
    public static final jg f25762p = new jg();

    /* renamed from: q, reason: collision with root package name */
    public static final long f25763q = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final Context f25764a;

    /* renamed from: b, reason: collision with root package name */
    public final e2 f25765b;

    /* renamed from: c, reason: collision with root package name */
    public final r7 f25766c;

    /* renamed from: d, reason: collision with root package name */
    public final m9 f25767d;

    /* renamed from: e, reason: collision with root package name */
    public final long f25768e;

    /* renamed from: f, reason: collision with root package name */
    public final com.braze.storage.t f25769f;

    /* renamed from: g, reason: collision with root package name */
    public final zf f25770g;

    /* renamed from: h, reason: collision with root package name */
    public final qg f25771h;

    /* renamed from: i, reason: collision with root package name */
    public final Queue f25772i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f25773j;

    /* renamed from: k, reason: collision with root package name */
    public long f25774k;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f25775l;

    /* renamed from: m, reason: collision with root package name */
    public final ReentrantLock f25776m;

    /* renamed from: n, reason: collision with root package name */
    public final ReentrantLock f25777n;

    /* renamed from: o, reason: collision with root package name */
    public final hd f25778o;

    public mg(Context context, e2 brazeManager, r7 internalEventPublisher, m9 externalEventPublisher, BrazeConfigurationProvider configurationProvider, String str, String apiKey, hd requestFramework) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(requestFramework, "requestFramework");
        this.f25776m = new ReentrantLock();
        this.f25777n = new ReentrantLock();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f25764a = applicationContext;
        this.f25765b = brazeManager;
        this.f25766c = internalEventPublisher;
        Intrinsics.checkNotNullParameter(externalEventPublisher, "<set-?>");
        this.f25767d = externalEventPublisher;
        this.f25768e = configurationProvider.getTriggerActionMinimumTimeIntervalInSeconds();
        com.braze.storage.t tVar = new com.braze.storage.t(context, str, apiKey);
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.f25769f = tVar;
        this.f25770g = new zf(context, apiKey);
        this.f25771h = new qg(tVar);
        this.f25773j = g();
        this.f25772i = new ArrayDeque();
        this.f25778o = requestFramework;
        l();
    }

    public static final String a(long j10) {
        return "TriggerManager lastDisplayTimeSeconds updated to " + j10;
    }

    public static final String c(List list) {
        return "Successfully saved " + list.size() + " triggered actions to DataStore";
    }

    public static final String d(y9 y9Var) {
        return "Registering triggered action id " + ((rg) y9Var).f26028a + " ";
    }

    public static final String e() {
        return "Test triggered actions found, triggering test event.";
    }

    public static final String f() {
        return "No test triggered actions found.";
    }

    public static final String g(y9 y9Var) {
        return "Fallback trigger has expired. Trigger id: " + ((rg) y9Var).f26028a;
    }

    public static final String h() {
        return "No triggered actions found in DataStore";
    }

    public static final String i() {
        return "Skipping blank triggered action string from DataStore";
    }

    public static final String j() {
        return "Triggered action has no trigger metadata and cannot fallback. Doing nothing.";
    }

    public static final String k() {
        return "Triggered action has no fallback action to perform. Doing nothing.";
    }

    public static final String m() {
        return "Subscribing to trigger dispatch events.";
    }

    public static final String n() {
        return "Executing pending events after trigger dispatch completed.";
    }

    public final void b(final long j10) {
        this.f25774k = this.f25775l;
        this.f25775l = j10;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.J5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mg.a(j10);
            }
        }, 7, (Object) null);
    }

    public final void l() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.b6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mg.m();
            }
        }, 6, (Object) null);
        this.f25766c.c(dg.class, new IEventSubscriber() { // from class: c3.c6
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                mg.a(mg.this, (dg) obj);
            }
        });
    }

    public static final String c(y9 y9Var) {
        return "Trigger manager received reenqueue with action with id: <" + ((rg) y9Var).f26028a + ">.";
    }

    public static final String e(v9 v9Var) {
        return "Failed to match triggered action for incoming <" + v9Var.a() + ">.";
    }

    public static final String f(y9 y9Var) {
        return "Trigger manager received failed triggered action with id: <" + ((rg) y9Var).f26028a + ">. Will attempt to perform fallback triggered actions, if present.";
    }

    public final void a(final List triggeredActions) {
        String str;
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        uf ufVar = new uf();
        ReentrantLock reentrantLock = this.f25776m;
        reentrantLock.lock();
        try {
            this.f25773j.clear();
            com.braze.storage.t tVar = this.f25769f;
            com.braze.storage.t tVar2 = null;
            if (tVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("triggerDataStoreProvider");
                tVar = null;
            }
            tVar.clearData(DataStoreKey.TRIGGERED_ACTIONS);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.M5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return mg.b(triggeredActions);
                }
            }, 7, (Object) null);
            Iterator it = triggeredActions.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                try {
                    final y9 y9Var = (y9) it.next();
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.N5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return mg.d(bo.app.y9.this);
                        }
                    }, 7, (Object) null);
                    this.f25773j.put(((rg) y9Var).f26028a, y9Var);
                    if (((rg) y9Var).b(ufVar)) {
                        z10 = true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    reentrantLock.unlock();
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(triggeredActions, 10));
            Iterator it2 = triggeredActions.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(((y9) it2.next()).getKey()));
            }
            com.braze.storage.t tVar3 = this.f25769f;
            if (tVar3 != null) {
                tVar2 = tVar3;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("triggerDataStoreProvider");
            }
            DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS;
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                        aVar.a();
                        str = aVar.b(new C4087f(Z0.f45341a), arrayList);
                    } catch (Exception e10) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                        str = arrayList instanceof Map ? "{}" : HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                    }
                    tVar2.writeData(dataStoreKey, str);
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
                }
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.P5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return mg.c(triggeredActions);
                }
            }, 7, (Object) null);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            this.f25771h.a(triggeredActions);
            this.f25770g.a(triggeredActions);
            if (!z10) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.R5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return mg.f();
                    }
                }, 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.Q5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return mg.e();
                    }
                }, 6, (Object) null);
                a((gg) ufVar);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final String e(y9 y9Var) {
        return "Retrieving templated triggered action id " + ((rg) y9Var).f26028a + " from DataStore.";
    }

    public static final String b(List list) {
        return "Registering " + list.size() + " new triggered actions.";
    }

    public static final String d() {
        return "Trigger request is in-flight. Not processing trigger event.";
    }

    public final LinkedHashMap g() {
        List arrayList;
        List emptyList;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.braze.storage.t tVar = this.f25769f;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("triggerDataStoreProvider");
            tVar = null;
        }
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object readData = tVar.readData(dataStoreKey, "");
                Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                String str = (String) readData;
                if (StringsKt.isBlank(str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str)) {
                        emptyList = CollectionsKt.emptyList();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), "null")) {
                        emptyList = CollectionsKt.emptyList();
                    } else {
                        try {
                            AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                            aVar.a();
                            emptyList = (List) aVar.d(new C4087f(Z0.f45341a), str);
                        } catch (Exception e10) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) new DataStoreUtils.a(str), 4, (Object) null);
                            emptyList = CollectionsKt.emptyList();
                        }
                    }
                    arrayList = CollectionsKt.toMutableList((Collection) emptyList);
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.j(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        final List<String> list = arrayList;
        if (list.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.D5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return mg.h();
                }
            }, 7, (Object) null);
            return linkedHashMap;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.O5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mg.d(list);
            }
        }, 7, (Object) null);
        for (final String str2 : list) {
            if (StringsKt.isBlank(str2)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.X5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return mg.i();
                    }
                }, 7, (Object) null);
            } else {
                try {
                    final tg b10 = og.f25896a.b(new JSONObject(str2), this.f25765b);
                    if (b10 != null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Y5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return mg.e(bo.app.y9.this);
                            }
                        }, 7, (Object) null);
                        linkedHashMap.put(b10.f26028a, b10);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception e12) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e12, false, new Function0() { // from class: c3.Z5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return mg.a(str2);
                        }
                    }, 4, (Object) null);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.a6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mg.a(linkedHashMap);
            }
        }, 7, (Object) null);
        return linkedHashMap;
    }

    public static final String c(v9 v9Var) {
        return "No action found for " + v9Var.a() + " event, publishing NoMatchingTriggerEvent";
    }

    public final void b(final y9 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.I5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mg.c(bo.app.y9.this);
            }
        }, 7, (Object) null);
        b(this.f25774k);
        this.f25774k = 0L;
        this.f25771h.e(action);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, bo.app.rg, bo.app.y9, java.lang.Object] */
    public final y9 d(v9 v9Var) {
        v9 v9Var2;
        v9 event = v9Var;
        Intrinsics.checkNotNullParameter(event, "event");
        ReentrantLock reentrantLock = this.f25776m;
        reentrantLock.lock();
        try {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f25773j.values().iterator();
            int i10 = Integer.MIN_VALUE;
            while (it.hasNext()) {
                final ?? r42 = (rg) ((y9) it.next());
                if (r42.b(event) && this.f25771h.a((y9) r42)) {
                    v9Var2 = event;
                    if (f25762p.a(event, r42, this.f25775l, this.f25768e)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.U5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return mg.a(bo.app.y9.this);
                            }
                        }, 7, (Object) null);
                        int i11 = r42.f26029b.f25828c;
                        if (i11 > i10) {
                            objectRef.element = r42;
                            i10 = i11;
                        }
                        arrayList.add(r42);
                    }
                } else {
                    v9Var2 = event;
                }
                event = v9Var2;
            }
            final v9 v9Var3 = event;
            Object obj = objectRef.element;
            if (obj == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.V5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return mg.e(bo.app.v9.this);
                    }
                }, 7, (Object) null);
                reentrantLock.unlock();
                return null;
            }
            arrayList.remove(obj);
            ((rg) ((y9) objectRef.element)).f26031d = new ng(arrayList);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.W5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return mg.a(bo.app.v9.this, objectRef);
                }
            }, 7, (Object) null);
            y9 y9Var = (y9) objectRef.element;
            reentrantLock.unlock();
            return y9Var;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String c() {
        return "In flight trigger requests is empty. Executing any pending trigger events.";
    }

    public static final String b(v9 v9Var) {
        return "New incoming <" + v9Var.a() + ">. Searching for matching triggers.";
    }

    public final void b() {
        ReentrantLock reentrantLock = this.f25777n;
        reentrantLock.lock();
        try {
            if (a()) {
                reentrantLock.unlock();
                return;
            }
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.L5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return mg.c();
                    }
                }, 7, (Object) null);
                while (!((ArrayDeque) this.f25772i).isEmpty()) {
                    v9 v9Var = (v9) ((ArrayDeque) this.f25772i).poll();
                    if (v9Var != null) {
                        a(v9Var);
                    }
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
            } catch (Throwable th2) {
                th = th2;
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final String d(List list) {
        return "Retrieved " + list.size() + " triggered actions from DataStore";
    }

    public final void a(gg triggerEvent) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        ReentrantLock reentrantLock = this.f25777n;
        reentrantLock.lock();
        try {
            ((ArrayDeque) this.f25772i).add(triggerEvent);
            if (!a()) {
                b();
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.H5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return mg.d();
                    }
                }, 7, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void a(v9 triggerEvent, final y9 failedAction) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        Intrinsics.checkNotNullParameter(failedAction, "failedAction");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.d6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mg.f(bo.app.y9.this);
            }
        }, 7, (Object) null);
        ng ngVar = ((rg) failedAction).f26031d;
        if (ngVar == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.e6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return mg.j();
                }
            }, 7, (Object) null);
            return;
        }
        final y9 y9Var = (y9) ngVar.f25838a.poll();
        if (y9Var == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.E5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return mg.k();
                }
            }, 7, (Object) null);
            return;
        }
        rg rgVar = (rg) y9Var;
        rgVar.f26031d = ngVar;
        Map remoteAssetToLocalAssetPaths = this.f25770g.a(y9Var);
        Intrinsics.checkNotNullParameter(remoteAssetToLocalAssetPaths, "remoteAssetToLocalAssetPaths");
        ((tg) y9Var).f26091f = new HashMap(remoteAssetToLocalAssetPaths);
        long j10 = ((gg) triggerEvent).f25492b;
        long j11 = rgVar.f26029b.f25830e;
        long millis = TimeUnit.SECONDS.toMillis(r1.f25829d);
        long j12 = j11 != -1 ? j11 + j10 : j10 + millis + f25763q;
        if (j12 < DateTimeUtils.nowInMilliseconds()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.F5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return mg.g(bo.app.y9.this);
                }
            }, 7, (Object) null);
            a(triggerEvent, y9Var);
        } else {
            final long max = Math.max(0L, (millis + j10) - DateTimeUtils.nowInMilliseconds());
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.G5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return mg.a(bo.app.y9.this, max);
                }
            }, 7, (Object) null);
            BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(max), null, new lg(y9Var, this, triggerEvent, j12, null), 2, null);
        }
    }

    public static final String a(y9 y9Var, long j10) {
        return "Performing fallback triggered action with id: <" + ((rg) y9Var).f26028a + "> with a delay: " + j10 + " ms";
    }

    public static final void a(mg mgVar, dg it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mgVar, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.K5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mg.n();
            }
        }, 6, (Object) null);
        mgVar.b();
    }

    public final void a(final v9 event) {
        Intrinsics.checkNotNullParameter(event, "triggerEvent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.S5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mg.b(bo.app.v9.this);
            }
        }, 7, (Object) null);
        y9 action = d(event);
        if (action != null) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(action, "action");
            Map remoteAssetToLocalAssetPaths = this.f25770g.a(action);
            Intrinsics.checkNotNullParameter(remoteAssetToLocalAssetPaths, "remoteAssetToLocalAssetPaths");
            ((tg) action).f26091f = new HashMap(remoteAssetToLocalAssetPaths);
            int i10 = ((rg) action).f26029b.f25830e;
            long j10 = i10 != -1 ? ((gg) event).f25492b + i10 : -1L;
            long millis = TimeUnit.SECONDS.toMillis(r0.f25829d);
            BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(millis), null, new kg(this, action, event, j10, millis, null), 2, null);
            return;
        }
        String a10 = event.a();
        int hashCode = a10.hashCode();
        if (hashCode != 3417674) {
            if (hashCode != 717572172) {
                if (hashCode != 1743324417 || !a10.equals("purchase")) {
                    return;
                }
            } else if (!a10.equals("custom_event")) {
                return;
            }
        } else if (!a10.equals("open")) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.T5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mg.c(bo.app.v9.this);
            }
        }, 7, (Object) null);
        m9 m9Var = this.f25767d;
        if (m9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("externalEventMessenger");
            m9Var = null;
        }
        String a11 = event.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getTriggerEventType(...)");
        ((r7) m9Var).b(new NoMatchingTriggerEvent(a11), NoMatchingTriggerEvent.class);
    }

    public static final String a(y9 y9Var) {
        return "Found potential triggered action for incoming trigger event. Action id " + ((rg) y9Var).f26028a + ".";
    }

    public static final String a(v9 v9Var, Ref.ObjectRef objectRef) {
        String str;
        y8 y8Var = ((gg) v9Var).f25493c;
        if (y8Var != null) {
            str = JsonUtils.getPrettyPrintedString(((k1) y8Var).getKey());
        } else {
            str = "";
        }
        return StringsKt.trimIndent("\n     Found best triggered action for incoming trigger event " + str + ".\n     Matched Action id: " + ((rg) ((y9) objectRef.element)).f26028a + ".\n                ");
    }

    public static final String a(String str) {
        return "Failed to parse triggered action JSON:'" + str + "' from DataStore.";
    }

    public static final String a(Map map) {
        return "Successfully loaded " + map.size() + " triggered actions from DataStore";
    }

    public final boolean a() {
        c7 c7Var = (c7) this.f25778o.f25527e.get(c9.f25336f);
        if (!(c7Var instanceof f4)) {
            return false;
        }
        ArrayList arrayList = ((f4) c7Var).f25327e;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            id idVar = (id) obj;
            d9 d9Var = idVar.f25571a;
            if ((d9Var instanceof l4) && ((l4) d9Var).f25694l.b() && idVar.f25574d == jd.f25625c) {
                return true;
            }
        }
        return false;
    }
}
