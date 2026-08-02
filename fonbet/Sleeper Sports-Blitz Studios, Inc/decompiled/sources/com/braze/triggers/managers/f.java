package com.braze.triggers.managers;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.IEventSubscriber;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.events.internal.c0;
import com.braze.managers.r;
import com.braze.requests.n;
import com.braze.requests.o;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.h0;
import com.braze.storage.i0;
import com.braze.storage.m3;
import com.braze.storage.o0;
import com.braze.storage.p0;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.braze.support.i;
import com.google.firebase.analytics.FirebaseAnalytics;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class f {
    public static final c p = new c();
    public static final long q = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final Context f817a;
    public final r b;
    public final com.braze.events.e c;
    public final com.braze.events.e d;
    public final long e;
    public final m3 f;
    public final b g;
    public final h h;
    public final Queue i;
    public final LinkedHashMap j;
    public long k;
    public volatile long l;
    public final ReentrantLock m;
    public final ReentrantLock n;
    public final com.braze.requests.framework.g o;

    public f(Context context, r brazeManager, com.braze.events.e internalEventPublisher, com.braze.events.e externalEventPublisher, BrazeConfigurationProvider configurationProvider, String str, String apiKey, com.braze.requests.framework.g requestFramework) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(requestFramework, "requestFramework");
        this.m = new ReentrantLock();
        this.n = new ReentrantLock();
        this.f817a = context.getApplicationContext();
        this.b = brazeManager;
        this.c = internalEventPublisher;
        Intrinsics.checkNotNullParameter(externalEventPublisher, "<set-?>");
        this.d = externalEventPublisher;
        this.e = configurationProvider.getTriggerActionMinimumTimeIntervalInSeconds();
        m3 m3Var = new m3(context, str, apiKey);
        Intrinsics.checkNotNullParameter(m3Var, "<set-?>");
        this.f = m3Var;
        this.g = new b(context, apiKey);
        this.h = new h(m3Var);
        this.j = g();
        this.i = new ArrayDeque();
        this.o = requestFramework;
        l();
    }

    public static final String a(long j) {
        return "TriggerManager lastDisplayTimeSeconds updated to " + j;
    }

    public static final String c(List list) {
        return "Successfully saved " + list.size() + " triggered actions to DataStore";
    }

    public static final String d(com.braze.triggers.actions.a aVar) {
        return "Registering triggered action id " + ((com.braze.triggers.actions.g) aVar).c() + " ";
    }

    public static final String e() {
        return "Test triggered actions found, triggering test event.";
    }

    public static final String f() {
        return "No test triggered actions found.";
    }

    public static final String g(com.braze.triggers.actions.a aVar) {
        return "Fallback trigger has expired. Trigger id: " + ((com.braze.triggers.actions.g) aVar).c();
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

    public final void b(final long j) {
        this.k = this.l;
        this.l = j;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.a(j);
            }
        }, 7, (Object) null);
    }

    public final void l() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.m();
            }
        }, 6, (Object) null);
        ((com.braze.events.d) this.c).c(c0.class, new IEventSubscriber() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda17
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                f.a(f.this, (c0) obj);
            }
        });
    }

    public static final String c(com.braze.triggers.actions.a aVar) {
        return "Trigger manager received reenqueue with action with id: <" + ((com.braze.triggers.actions.g) aVar).c() + ">.";
    }

    public static final String d() {
        return "Trigger request is in-flight. Not processing trigger event.";
    }

    public static final String e(com.braze.triggers.events.b bVar) {
        return "Failed to match triggered action for incoming <" + bVar.a() + ">.";
    }

    public static final String f(com.braze.triggers.actions.a aVar) {
        return "Trigger manager received failed triggered action with id: <" + ((com.braze.triggers.actions.g) aVar).c() + ">. Will attempt to perform fallback triggered actions, if present.";
    }

    public final void a(final List triggeredActions) {
        String str;
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        com.braze.triggers.events.h hVar = new com.braze.triggers.events.h();
        ReentrantLock reentrantLock = this.m;
        reentrantLock.lock();
        try {
            this.j.clear();
            m3 m3Var = this.f;
            m3 m3Var2 = null;
            if (m3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("triggerDataStoreProvider");
                m3Var = null;
            }
            m3Var.clearData(DataStoreKey.TRIGGERED_ACTIONS);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.b(triggeredActions);
                }
            }, 7, (Object) null);
            Iterator it = triggeredActions.iterator();
            boolean z = false;
            while (it.hasNext()) {
                try {
                    final com.braze.triggers.actions.a aVar = (com.braze.triggers.actions.a) it.next();
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return f.d(com.braze.triggers.actions.a.this);
                        }
                    }, 7, (Object) null);
                    this.j.put(((com.braze.triggers.actions.g) aVar).f801a, aVar);
                    if (((com.braze.triggers.actions.g) aVar).b(hVar)) {
                        z = true;
                    }
                } catch (Throwable th) {
                    th = th;
                    reentrantLock.unlock();
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(triggeredActions, 10));
            Iterator it2 = triggeredActions.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(((com.braze.triggers.actions.a) it2.next()).getJsonKey()));
            }
            m3 m3Var3 = this.f;
            if (m3Var3 != null) {
                m3Var2 = m3Var3;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("triggerDataStoreProvider");
            }
            DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS;
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        Json.Companion companion = Json.INSTANCE;
                        companion.getSerializersModule();
                        str = companion.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), arrayList);
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) i.f781a, 4, (Object) null);
                        str = arrayList instanceof Map ? "{}" : HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                    }
                    m3Var2.writeData(dataStoreKey, str);
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new p0(dataStoreKey), 8, (Object) null);
                }
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.c(triggeredActions);
                }
            }, 7, (Object) null);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            this.h.a(triggeredActions);
            this.g.a(triggeredActions);
            if (!z) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return f.f();
                    }
                }, 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return f.e();
                    }
                }, 6, (Object) null);
                a((com.braze.triggers.events.i) hVar);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final LinkedHashMap g() {
        List arrayList;
        List emptyList;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        m3 m3Var = this.f;
        if (m3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("triggerDataStoreProvider");
            m3Var = null;
        }
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new h0(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object readData = m3Var.readData(dataStoreKey, "");
                Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                String str = (String) readData;
                if (StringsKt.isBlank(str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str)) {
                        emptyList = CollectionsKt.emptyList();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), AbstractJsonLexerKt.NULL)) {
                        emptyList = CollectionsKt.emptyList();
                    } else {
                        try {
                            Json.Companion companion = Json.INSTANCE;
                            companion.getSerializersModule();
                            emptyList = (List) companion.decodeFromString(new ArrayListSerializer(StringSerializer.INSTANCE), str);
                        } catch (Exception e) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new com.braze.support.e(str), 4, (Object) null);
                            emptyList = CollectionsKt.emptyList();
                        }
                    }
                    arrayList = CollectionsKt.toMutableList((Collection) emptyList);
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new i0(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        final List<String> list = arrayList;
        if (list.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.h();
                }
            }, 7, (Object) null);
            return linkedHashMap;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.d(list);
            }
        }, 7, (Object) null);
        for (final String str2 : list) {
            if (StringsKt.isBlank(str2)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return f.i();
                    }
                }, 7, (Object) null);
            } else {
                try {
                    final com.braze.triggers.actions.h b = com.braze.triggers.utils.c.f822a.b(new JSONObject(str2), this.b);
                    if (b != null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return f.e(com.braze.triggers.actions.a.this);
                            }
                        }, 7, (Object) null);
                        linkedHashMap.put(b.f801a, b);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception e3) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return f.a(str2);
                        }
                    }, 4, (Object) null);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.a(linkedHashMap);
            }
        }, 7, (Object) null);
        return linkedHashMap;
    }

    public static final String c(com.braze.triggers.events.b bVar) {
        return "No action found for " + bVar.a() + " event, publishing NoMatchingTriggerEvent";
    }

    public static final String e(com.braze.triggers.actions.a aVar) {
        return "Retrieving templated triggered action id " + ((com.braze.triggers.actions.g) aVar).c() + " from DataStore.";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, com.braze.triggers.actions.a, com.braze.triggers.actions.g, java.lang.Object] */
    public final com.braze.triggers.actions.a d(com.braze.triggers.events.b bVar) {
        com.braze.triggers.events.b bVar2;
        com.braze.triggers.events.b event = bVar;
        Intrinsics.checkNotNullParameter(event, "event");
        ReentrantLock reentrantLock = this.m;
        reentrantLock.lock();
        try {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.j.values().iterator();
            int i = Integer.MIN_VALUE;
            while (it.hasNext()) {
                final ?? r4 = (com.braze.triggers.actions.g) ((com.braze.triggers.actions.a) it.next());
                if (r4.b(event) && this.h.a((com.braze.triggers.actions.g) r4)) {
                    bVar2 = event;
                    if (p.a(event, r4, this.l, this.e)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return f.a(com.braze.triggers.actions.a.this);
                            }
                        }, 7, (Object) null);
                        int i2 = r4.b.c;
                        if (i2 > i) {
                            objectRef.element = r4;
                            i = i2;
                        }
                        arrayList.add(r4);
                    }
                } else {
                    bVar2 = event;
                }
                event = bVar2;
            }
            final com.braze.triggers.events.b bVar3 = event;
            Object obj = objectRef.element;
            if (obj == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return f.e(com.braze.triggers.events.b.this);
                    }
                }, 7, (Object) null);
                reentrantLock.unlock();
                return null;
            }
            arrayList.remove(obj);
            ((com.braze.triggers.actions.g) ((com.braze.triggers.actions.a) objectRef.element)).d = new com.braze.triggers.utils.b(arrayList);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.a(com.braze.triggers.events.b.this, objectRef);
                }
            }, 7, (Object) null);
            return (com.braze.triggers.actions.a) objectRef.element;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String b(List list) {
        return "Registering " + list.size() + " new triggered actions.";
    }

    public static final String c() {
        return "In flight trigger requests is empty. Executing any pending trigger events.";
    }

    public final void b(final com.braze.triggers.actions.a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.c(com.braze.triggers.actions.a.this);
            }
        }, 7, (Object) null);
        b(this.k);
        this.k = 0L;
        this.h.d(action);
    }

    public static final String b(com.braze.triggers.events.b bVar) {
        return "New incoming <" + bVar.a() + ">. Searching for matching triggers.";
    }

    public final void b() {
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            if (a()) {
                reentrantLock.unlock();
                return;
            }
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return f.c();
                    }
                }, 7, (Object) null);
                while (!((ArrayDeque) this.i).isEmpty()) {
                    com.braze.triggers.events.b bVar = (com.braze.triggers.events.b) ((ArrayDeque) this.i).poll();
                    if (bVar != null) {
                        a(bVar);
                    }
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
            } catch (Throwable th) {
                th = th;
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final String d(List list) {
        return "Retrieved " + list.size() + " triggered actions from DataStore";
    }

    public final void a(com.braze.triggers.events.i triggerEvent) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            ((ArrayDeque) this.i).add(triggerEvent);
            if (!a()) {
                b();
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return f.d();
                    }
                }, 7, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(com.braze.triggers.events.b triggerEvent, final com.braze.triggers.actions.a failedAction) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        Intrinsics.checkNotNullParameter(failedAction, "failedAction");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.f(com.braze.triggers.actions.a.this);
            }
        }, 7, (Object) null);
        com.braze.triggers.utils.b bVar = ((com.braze.triggers.actions.g) failedAction).d;
        if (bVar == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.j();
                }
            }, 7, (Object) null);
            return;
        }
        final com.braze.triggers.actions.a aVar = (com.braze.triggers.actions.a) bVar.f821a.poll();
        if (aVar == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.k();
                }
            }, 7, (Object) null);
            return;
        }
        com.braze.triggers.actions.g gVar = (com.braze.triggers.actions.g) aVar;
        gVar.d = bVar;
        Map remoteAssetToLocalAssetPaths = this.g.a(aVar);
        Intrinsics.checkNotNullParameter(remoteAssetToLocalAssetPaths, "remoteAssetToLocalAssetPaths");
        ((com.braze.triggers.actions.h) aVar).f = new HashMap(remoteAssetToLocalAssetPaths);
        long j = ((com.braze.triggers.events.i) triggerEvent).b;
        long j2 = gVar.b.e;
        long millis = TimeUnit.SECONDS.toMillis(r1.d);
        long j3 = j2 != -1 ? j2 + j : j + millis + q;
        if (j3 < DateTimeUtils.nowInMilliseconds()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.g(com.braze.triggers.actions.a.this);
                }
            }, 7, (Object) null);
            a(triggerEvent, aVar);
        } else {
            final long max = Math.max(0L, (millis + j) - DateTimeUtils.nowInMilliseconds());
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.a(com.braze.triggers.actions.a.this, max);
                }
            }, 7, (Object) null);
            BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(max), null, new e(aVar, this, triggerEvent, j3, null), 2, null);
        }
    }

    public static final String a(com.braze.triggers.actions.a aVar, long j) {
        return "Performing fallback triggered action with id: <" + ((com.braze.triggers.actions.g) aVar).c() + "> with a delay: " + j + " ms";
    }

    public static final void a(f fVar, c0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) fVar, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.n();
            }
        }, 6, (Object) null);
        fVar.b();
    }

    public final void a(final com.braze.triggers.events.b event) {
        Intrinsics.checkNotNullParameter(event, "triggerEvent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.b(com.braze.triggers.events.b.this);
            }
        }, 7, (Object) null);
        com.braze.triggers.actions.a action = d(event);
        if (action != null) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(action, "action");
            Map remoteAssetToLocalAssetPaths = this.g.a(action);
            Intrinsics.checkNotNullParameter(remoteAssetToLocalAssetPaths, "remoteAssetToLocalAssetPaths");
            ((com.braze.triggers.actions.h) action).f = new HashMap(remoteAssetToLocalAssetPaths);
            int i = ((com.braze.triggers.actions.g) action).b.e;
            long j = i != -1 ? ((com.braze.triggers.events.i) event).b + i : -1L;
            long millis = TimeUnit.SECONDS.toMillis(r0.d);
            BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(millis), null, new d(this, action, event, j, millis, null), 2, null);
            return;
        }
        String a2 = event.a();
        int hashCode = a2.hashCode();
        if (hashCode != 3417674) {
            if (hashCode != 717572172) {
                if (hashCode != 1743324417 || !a2.equals(FirebaseAnalytics.Event.PURCHASE)) {
                    return;
                }
            } else if (!a2.equals("custom_event")) {
                return;
            }
        } else if (!a2.equals("open")) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.f$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.c(com.braze.triggers.events.b.this);
            }
        }, 7, (Object) null);
        com.braze.events.e eVar = this.d;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("externalEventMessenger");
            eVar = null;
        }
        String a3 = event.a();
        Intrinsics.checkNotNullExpressionValue(a3, "getTriggerEventType(...)");
        ((com.braze.events.d) eVar).b(new NoMatchingTriggerEvent(a3), NoMatchingTriggerEvent.class);
    }

    public static final String a(com.braze.triggers.actions.a aVar) {
        return "Found potential triggered action for incoming trigger event. Action id " + ((com.braze.triggers.actions.g) aVar).c() + ".";
    }

    public static final String a(com.braze.triggers.events.b bVar, Ref.ObjectRef objectRef) {
        String str;
        com.braze.triggers.events.i iVar = (com.braze.triggers.events.i) bVar;
        if (iVar.b() != null) {
            str = JsonUtils.getPrettyPrintedString((JSONObject) ((com.braze.models.outgoing.event.b) iVar.b()).getJsonKey());
        } else {
            str = "";
        }
        return StringsKt.trimIndent("\n     Found best triggered action for incoming trigger event " + str + ".\n     Matched Action id: " + ((com.braze.triggers.actions.g) ((com.braze.triggers.actions.a) objectRef.element)).c() + ".\n                ");
    }

    public static final String a(String str) {
        return "Failed to parse triggered action JSON:'" + str + "' from DataStore.";
    }

    public static final String a(Map map) {
        return "Successfully loaded " + map.size() + " triggered actions from DataStore";
    }

    public final boolean a() {
        com.braze.requests.framework.b bVar = (com.braze.requests.framework.b) this.o.e.get(n.f);
        if (bVar == null || !(bVar instanceof com.braze.requests.framework.queue.c)) {
            return false;
        }
        ArrayList arrayList = ((com.braze.requests.framework.queue.c) bVar).e;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.braze.requests.framework.h hVar = (com.braze.requests.framework.h) it.next();
            o oVar = hVar.f673a;
            if ((oVar instanceof com.braze.requests.g) && ((com.braze.requests.g) oVar).k.c() && hVar.d == com.braze.requests.framework.i.c) {
                return true;
            }
        }
        return false;
    }
}
