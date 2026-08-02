package com.google.firebase.sessions.api;

import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.epx;
import xsna.n4k;
import xsna.on00;
import xsna.ui50;
import xsna.wi50;

/* compiled from: FirebaseSessionsDependencies.kt */
/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();
    public static final Map<SessionSubscriber.Name, C0146a> b = Collections.synchronizedMap(new LinkedHashMap());

    /* compiled from: FirebaseSessionsDependencies.kt */
    /* renamed from: com.google.firebase.sessions.api.a$a, reason: collision with other inner class name */
    public static final class C0146a {
        public final wi50 a;
        public n4k b = null;

        public C0146a(wi50 wi50Var) {
            this.a = wi50Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0146a)) {
                return false;
            }
            C0146a c0146a = (C0146a) obj;
            return this.a.equals(c0146a.a) && epx.f(this.b, c0146a.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            n4k n4kVar = this.b;
            return hashCode + (n4kVar == null ? 0 : n4kVar.hashCode());
        }

        public final String toString() {
            return "Dependency(mutex=" + this.a + ", subscriber=" + this.b + ')';
        }
    }

    public static C0146a a(SessionSubscriber.Name name) {
        C0146a c0146a = b.get(name);
        if (c0146a != null) {
            return c0146a;
        }
        throw new IllegalStateException("Cannot get dependency " + name + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9 A[Catch: all -> 0x00c2, TRY_ENTER, TryCatch #0 {all -> 0x00c2, blocks: (B:12:0x0099, B:23:0x00a9, B:24:0x00c1), top: B:11:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0097 -> B:10:0x0098). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        b bVar;
        int i;
        Map linkedHashMap;
        Iterator it;
        if (continuationImpl instanceof b) {
            bVar = (b) continuationImpl;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Map<SessionSubscriber.Name, C0146a> map = b;
                    linkedHashMap = new LinkedHashMap(on00.e(map.size()));
                    it = map.entrySet().iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object key = bVar.L$5;
                    linkedHashMap = (Map) bVar.L$4;
                    ui50 ui50Var = (ui50) bVar.L$3;
                    SessionSubscriber.Name name = (SessionSubscriber.Name) bVar.L$2;
                    it = (Iterator) bVar.L$1;
                    Map map2 = (Map) bVar.L$0;
                    kotlin.a.a(obj);
                    try {
                        n4k n4kVar = a(name).b;
                        if (n4kVar == null) {
                            ui50Var.c(null);
                            linkedHashMap.put(key, n4kVar);
                            linkedHashMap = map2;
                            if (it.hasNext()) {
                                return linkedHashMap;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            key = entry.getKey();
                            name = (SessionSubscriber.Name) entry.getKey();
                            ui50Var = ((C0146a) entry.getValue()).a;
                            bVar.L$0 = linkedHashMap;
                            bVar.L$1 = it;
                            bVar.L$2 = name;
                            bVar.L$3 = ui50Var;
                            bVar.L$4 = linkedHashMap;
                            bVar.L$5 = key;
                            bVar.label = 1;
                            if (ui50Var.b(bVar) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            map2 = linkedHashMap;
                            n4k n4kVar2 = a(name).b;
                            if (n4kVar2 == null) {
                                throw new IllegalStateException("Subscriber " + name + " has not been registered.");
                            }
                        }
                    } catch (Throwable th) {
                        ui50Var.c(null);
                        throw th;
                    }
                }
            }
        }
        bVar = new b(this, continuationImpl);
        Object obj2 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
    }
}
