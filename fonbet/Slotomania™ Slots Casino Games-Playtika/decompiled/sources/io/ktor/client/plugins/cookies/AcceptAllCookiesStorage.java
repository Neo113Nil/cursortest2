package io.ktor.client.plugins.cookies;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.ktor.client.plugins.cookies.AcceptAllCookiesStorage;
import io.ktor.http.Cookie;
import io.ktor.http.Url;
import io.ktor.util.date.DateJvmKt;
import io.ktor.util.date.GMTDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: AcceptAllCookiesStorage.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001!B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u0003*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lio/ktor/client/plugins/cookies/AcceptAllCookiesStorage;", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "Lkotlin/Function0;", "", "clock", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lio/ktor/http/Url;", IronSourceConstants.REQUEST_URL, "", "Lio/ktor/http/Cookie;", "get", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cookie", "", "addCookie", "(Lio/ktor/http/Url;Lio/ktor/http/Cookie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", "timestamp", "cleanup", "(J)V", "createdAt", "maxAgeOrExpires", "(Lio/ktor/http/Cookie;J)Ljava/lang/Long;", "Lkotlin/jvm/functions/Function0;", "", "Lio/ktor/client/plugins/cookies/AcceptAllCookiesStorage$CookieWithTimestamp;", "container", "Ljava/util/List;", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "CookieWithTimestamp", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AcceptAllCookiesStorage implements CookiesStorage {
    private final Function0<Long> clock;
    private final List<CookieWithTimestamp> container;
    private final Mutex mutex;
    private volatile /* synthetic */ long oldestCookie;

    /* JADX WARN: Multi-variable type inference failed */
    public AcceptAllCookiesStorage() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public AcceptAllCookiesStorage(Function0<Long> clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.clock = clock;
        this.container = new ArrayList();
        this.oldestCookie = 0L;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
    }

    public /* synthetic */ AcceptAllCookiesStorage(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function0() { // from class: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                long timeMillis;
                timeMillis = DateJvmKt.getTimeMillis();
                return Long.valueOf(timeMillis);
            }
        } : function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AcceptAllCookiesStorage.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lio/ktor/client/plugins/cookies/AcceptAllCookiesStorage$CookieWithTimestamp;", "", "Lio/ktor/http/Cookie;", "cookie", "", "createdAt", "<init>", "(Lio/ktor/http/Cookie;J)V", "component1", "()Lio/ktor/http/Cookie;", "component2", "()J", "copy", "(Lio/ktor/http/Cookie;J)Lio/ktor/client/plugins/cookies/AcceptAllCookiesStorage$CookieWithTimestamp;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lio/ktor/http/Cookie;", "getCookie", "J", "getCreatedAt", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class CookieWithTimestamp {
        private final Cookie cookie;
        private final long createdAt;

        public static /* synthetic */ CookieWithTimestamp copy$default(CookieWithTimestamp cookieWithTimestamp, Cookie cookie, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                cookie = cookieWithTimestamp.cookie;
            }
            if ((i & 2) != 0) {
                j = cookieWithTimestamp.createdAt;
            }
            return cookieWithTimestamp.copy(cookie, j);
        }

        /* renamed from: component1, reason: from getter */
        public final Cookie getCookie() {
            return this.cookie;
        }

        /* renamed from: component2, reason: from getter */
        public final long getCreatedAt() {
            return this.createdAt;
        }

        public final CookieWithTimestamp copy(Cookie cookie, long createdAt) {
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            return new CookieWithTimestamp(cookie, createdAt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CookieWithTimestamp)) {
                return false;
            }
            CookieWithTimestamp cookieWithTimestamp = (CookieWithTimestamp) other;
            return Intrinsics.areEqual(this.cookie, cookieWithTimestamp.cookie) && this.createdAt == cookieWithTimestamp.createdAt;
        }

        public int hashCode() {
            return (this.cookie.hashCode() * 31) + Long.hashCode(this.createdAt);
        }

        public String toString() {
            return "CookieWithTimestamp(cookie=" + this.cookie + ", createdAt=" + this.createdAt + ')';
        }

        public CookieWithTimestamp(Cookie cookie, long j) {
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            this.cookie = cookie;
            this.createdAt = j;
        }

        public final Cookie getCookie() {
            return this.cookie;
        }

        public final long getCreatedAt() {
            return this.createdAt;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[Catch: all -> 0x00bd, TryCatch #0 {all -> 0x00bd, blocks: (B:11:0x004f, B:13:0x0061, B:14:0x0064, B:15:0x0073, B:17:0x0079, B:20:0x008a, B:25:0x008e, B:26:0x00a3, B:28:0x00a9, B:30:0x00b7), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079 A[Catch: all -> 0x00bd, TryCatch #0 {all -> 0x00bd, blocks: (B:11:0x004f, B:13:0x0061, B:14:0x0064, B:15:0x0073, B:17:0x0079, B:20:0x008a, B:25:0x008e, B:26:0x00a3, B:28:0x00a9, B:30:0x00b7), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9 A[Catch: all -> 0x00bd, LOOP:1: B:26:0x00a3->B:28:0x00a9, LOOP_END, TryCatch #0 {all -> 0x00bd, blocks: (B:11:0x004f, B:13:0x0061, B:14:0x0064, B:15:0x0073, B:17:0x0079, B:20:0x008a, B:25:0x008e, B:26:0x00a3, B:28:0x00a9, B:30:0x00b7), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object get(Url url, Continuation<? super List<Cookie>> continuation) {
        AcceptAllCookiesStorage$get$1 acceptAllCookiesStorage$get$1;
        int i;
        Mutex mutex;
        long longValue;
        Iterator it;
        try {
            if (continuation instanceof AcceptAllCookiesStorage$get$1) {
                acceptAllCookiesStorage$get$1 = (AcceptAllCookiesStorage$get$1) continuation;
                if ((acceptAllCookiesStorage$get$1.label & Integer.MIN_VALUE) != 0) {
                    acceptAllCookiesStorage$get$1.label -= Integer.MIN_VALUE;
                    Object obj = acceptAllCookiesStorage$get$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = acceptAllCookiesStorage$get$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.mutex;
                        acceptAllCookiesStorage$get$1.L$0 = url;
                        acceptAllCookiesStorage$get$1.L$1 = mutex;
                        acceptAllCookiesStorage$get$1.label = 1;
                        if (mutex.lock(null, acceptAllCookiesStorage$get$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex2 = (Mutex) acceptAllCookiesStorage$get$1.L$1;
                        Url url2 = (Url) acceptAllCookiesStorage$get$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        url = url2;
                    }
                    longValue = this.clock.invoke().longValue();
                    if (longValue >= this.oldestCookie) {
                        cleanup(longValue);
                    }
                    List<CookieWithTimestamp> list = this.container;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (CookiesStorageKt.matches(((CookieWithTimestamp) obj2).getCookie(), url)) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = arrayList;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((CookieWithTimestamp) it.next()).getCookie());
                    }
                    return arrayList3;
                }
            }
            longValue = this.clock.invoke().longValue();
            if (longValue >= this.oldestCookie) {
            }
            List<CookieWithTimestamp> list2 = this.container;
            ArrayList arrayList4 = new ArrayList();
            while (r0.hasNext()) {
            }
            ArrayList arrayList22 = arrayList4;
            ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList22, 10));
            it = arrayList22.iterator();
            while (it.hasNext()) {
            }
            return arrayList32;
        } finally {
            mutex.unlock(null);
        }
        acceptAllCookiesStorage$get$1 = new AcceptAllCookiesStorage$get$1(this, continuation);
        Object obj3 = acceptAllCookiesStorage$get$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = acceptAllCookiesStorage$get$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008e A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:11:0x0064, B:13:0x008e, B:15:0x009a, B:16:0x009c), top: B:10:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object addCookie(final Url url, final Cookie cookie, Continuation<? super Unit> continuation) {
        AcceptAllCookiesStorage$addCookie$1 acceptAllCookiesStorage$addCookie$1;
        int i;
        Mutex mutex;
        Long maxAgeOrExpires;
        try {
            if (continuation instanceof AcceptAllCookiesStorage$addCookie$1) {
                acceptAllCookiesStorage$addCookie$1 = (AcceptAllCookiesStorage$addCookie$1) continuation;
                if ((acceptAllCookiesStorage$addCookie$1.label & Integer.MIN_VALUE) != 0) {
                    acceptAllCookiesStorage$addCookie$1.label -= Integer.MIN_VALUE;
                    Object obj = acceptAllCookiesStorage$addCookie$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = acceptAllCookiesStorage$addCookie$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (StringsKt.isBlank(cookie.getName())) {
                            return Unit.INSTANCE;
                        }
                        mutex = this.mutex;
                        acceptAllCookiesStorage$addCookie$1.L$0 = url;
                        acceptAllCookiesStorage$addCookie$1.L$1 = cookie;
                        acceptAllCookiesStorage$addCookie$1.L$2 = mutex;
                        acceptAllCookiesStorage$addCookie$1.label = 1;
                        if (mutex.lock(null, acceptAllCookiesStorage$addCookie$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex2 = (Mutex) acceptAllCookiesStorage$addCookie$1.L$2;
                        cookie = (Cookie) acceptAllCookiesStorage$addCookie$1.L$1;
                        Url url2 = (Url) acceptAllCookiesStorage$addCookie$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        url = url2;
                    }
                    CollectionsKt.removeAll((List) this.container, new Function1() { // from class: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            boolean addCookie$lambda$7$lambda$5;
                            addCookie$lambda$7$lambda$5 = AcceptAllCookiesStorage.addCookie$lambda$7$lambda$5(Cookie.this, url, (AcceptAllCookiesStorage.CookieWithTimestamp) obj2);
                            return Boolean.valueOf(addCookie$lambda$7$lambda$5);
                        }
                    });
                    long longValue = this.clock.invoke().longValue();
                    this.container.add(new CookieWithTimestamp(CookiesStorageKt.fillDefaults(cookie, url), longValue));
                    maxAgeOrExpires = maxAgeOrExpires(cookie, longValue);
                    if (maxAgeOrExpires != null) {
                        long longValue2 = maxAgeOrExpires.longValue();
                        if (this.oldestCookie > longValue2) {
                            this.oldestCookie = longValue2;
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            CollectionsKt.removeAll((List) this.container, new Function1() { // from class: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    boolean addCookie$lambda$7$lambda$5;
                    addCookie$lambda$7$lambda$5 = AcceptAllCookiesStorage.addCookie$lambda$7$lambda$5(Cookie.this, url, (AcceptAllCookiesStorage.CookieWithTimestamp) obj2);
                    return Boolean.valueOf(addCookie$lambda$7$lambda$5);
                }
            });
            long longValue3 = this.clock.invoke().longValue();
            this.container.add(new CookieWithTimestamp(CookiesStorageKt.fillDefaults(cookie, url), longValue3));
            maxAgeOrExpires = maxAgeOrExpires(cookie, longValue3);
            if (maxAgeOrExpires != null) {
            }
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        acceptAllCookiesStorage$addCookie$1 = new AcceptAllCookiesStorage$addCookie$1(this, continuation);
        Object obj2 = acceptAllCookiesStorage$addCookie$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = acceptAllCookiesStorage$addCookie$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addCookie$lambda$7$lambda$5(Cookie cookie, Url url, CookieWithTimestamp cookieWithTimestamp) {
        Intrinsics.checkNotNullParameter(cookieWithTimestamp, "<destruct>");
        Cookie cookie2 = cookieWithTimestamp.getCookie();
        return Intrinsics.areEqual(cookie2.getName(), cookie.getName()) && CookiesStorageKt.matches(cookie2, url);
    }

    private final void cleanup(final long timestamp) {
        CollectionsKt.removeAll((List) this.container, new Function1() { // from class: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean cleanup$lambda$8;
                cleanup$lambda$8 = AcceptAllCookiesStorage.cleanup$lambda$8(AcceptAllCookiesStorage.this, timestamp, (AcceptAllCookiesStorage.CookieWithTimestamp) obj);
                return Boolean.valueOf(cleanup$lambda$8);
            }
        });
        long j = Long.MAX_VALUE;
        for (CookieWithTimestamp cookieWithTimestamp : this.container) {
            Long maxAgeOrExpires = maxAgeOrExpires(cookieWithTimestamp.getCookie(), cookieWithTimestamp.getCreatedAt());
            if (maxAgeOrExpires != null) {
                j = Math.min(j, maxAgeOrExpires.longValue());
            }
        }
        this.oldestCookie = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cleanup$lambda$8(AcceptAllCookiesStorage acceptAllCookiesStorage, long j, CookieWithTimestamp cookieWithTimestamp) {
        Intrinsics.checkNotNullParameter(cookieWithTimestamp, "<destruct>");
        Long maxAgeOrExpires = acceptAllCookiesStorage.maxAgeOrExpires(cookieWithTimestamp.getCookie(), cookieWithTimestamp.getCreatedAt());
        return maxAgeOrExpires != null && maxAgeOrExpires.longValue() < j;
    }

    private final Long maxAgeOrExpires(Cookie cookie, long j) {
        if (cookie.getMaxAgeInt() != null) {
            return Long.valueOf(j + (r0.intValue() * 1000));
        }
        GMTDate expires = cookie.getExpires();
        if (expires != null) {
            return Long.valueOf(expires.getTimestamp());
        }
        return null;
    }
}
