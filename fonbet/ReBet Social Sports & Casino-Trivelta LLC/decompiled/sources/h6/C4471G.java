package h6;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h6.G, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4471G implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f47731b = new a(null);
    private static final long serialVersionUID = 20160629001L;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f47732a;

    /* renamed from: h6.G$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: h6.G$b */
    public static final class b implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public static final a f47733b = new a(null);
        private static final long serialVersionUID = 20160629001L;

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f47734a;

        /* renamed from: h6.G$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        public b(HashMap proxyEvents) {
            Intrinsics.checkNotNullParameter(proxyEvents, "proxyEvents");
            this.f47734a = proxyEvents;
        }

        private final Object readResolve() {
            return new C4471G(this.f47734a);
        }
    }

    public C4471G() {
        this.f47732a = new HashMap();
    }

    private final Object writeReplace() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            return new b(this.f47732a);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final void a(C4474a accessTokenAppIdPair, List appEvents) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            if (!this.f47732a.containsKey(accessTokenAppIdPair)) {
                this.f47732a.put(accessTokenAppIdPair, CollectionsKt.toMutableList((Collection) appEvents));
                return;
            }
            List list = (List) this.f47732a.get(accessTokenAppIdPair);
            if (list == null) {
                return;
            }
            list.addAll(appEvents);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final Set b() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            Set entrySet = this.f47732a.entrySet();
            Intrinsics.checkNotNullExpressionValue(entrySet, "events.entries");
            return entrySet;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public C4471G(HashMap appEventMap) {
        Intrinsics.checkNotNullParameter(appEventMap, "appEventMap");
        HashMap hashMap = new HashMap();
        this.f47732a = hashMap;
        hashMap.putAll(appEventMap);
    }
}
