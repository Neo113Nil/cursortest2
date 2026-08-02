package com.vk.network.eventhub.impl;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Base64;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.network.eventhub.api.ConnectionState;
import com.vk.network.eventhub.api.EventHubServiceUrlBuilder;
import com.vk.network.eventhub.api.Message;
import com.vk.network.eventhub.impl.backoff.BackoffType;
import com.vk.network.eventhub.impl.c;
import com.vk.network.eventhub.impl.exception.MessageUnhandledException;
import defpackage.WebSocketCriticalException;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import okhttp3.p;
import okhttp3.u;
import okio.ByteString;
import org.json.JSONObject;
import xsna.asp;
import xsna.asu0;
import xsna.b25;
import xsna.bpn0;
import xsna.cxe0;
import xsna.d6a;
import xsna.dof;
import xsna.emb;
import xsna.epx;
import xsna.eul0;
import xsna.fgh;
import xsna.gzs;
import xsna.hzs;
import xsna.izs;
import xsna.j1n;
import xsna.laq;
import xsna.mcy;
import xsna.msy;
import xsna.nfi0;
import xsna.ocg;
import xsna.osx0;
import xsna.ozp;
import xsna.pdh0;
import xsna.pr6;
import xsna.pzp;
import xsna.qzp;
import xsna.r1w0;
import xsna.rzp;
import xsna.s3q0;
import xsna.sc4;
import xsna.szp;
import xsna.tv9;
import xsna.uzp;
import xsna.vx2;
import xsna.wwe0;
import xsna.xoi0;
import xsna.xu0;
import xsna.xzp;
import xsna.yni0;
import xsna.zrp;

/* compiled from: EventHubServiceClient.kt */
/* loaded from: classes3.dex */
public final class EventHubServiceClient implements qzp {
    public static final Throwable t = new Throwable();
    public final hzs<Long, p, u, String, ByteString, Integer, String, String, byte[], String, s3q0> a;
    public final boolean b;
    public volatile xzp c;
    public volatile BackoffType d = BackoffType.NONE;
    public final Object e;
    public final Object f;
    public final Object g;
    public final boolean h;
    public final cxe0 i;
    public final LinkedTransferQueue<Result<Runnable>> j;
    public final rzp k;
    public final r1w0 l;
    public final PriorityBlockingQueue<Op> m;
    public final HashMap<yni0, ozp> n;
    public volatile yni0 o;
    public final ConcurrentHashMap<yni0, ExecutorService> p;
    public final com.vk.network.eventhub.impl.c q;
    public final CopyOnWriteArraySet<osx0.a> r;
    public volatile ConnectionState s;

    /* compiled from: EventHubServiceClient.kt */
    public static abstract class Op implements Comparable<Op> {

        /* compiled from: EventHubServiceClient.kt */
        public static final class NewMessage extends Op {
            public final Message b;
            public final Type c;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: EventHubServiceClient.kt */
            public static final class Type {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Type[] $VALUES;
                public static final Type INCOMING;
                public static final Type OUTGOING;

                static {
                    Type type = new Type("INCOMING", 0);
                    INCOMING = type;
                    Type type2 = new Type("OUTGOING", 1);
                    OUTGOING = type2;
                    Type[] typeArr = {type, type2};
                    $VALUES = typeArr;
                    $ENTRIES = new asp(typeArr);
                }

                public Type() {
                    throw null;
                }

                public static Type valueOf(String str) {
                    return (Type) Enum.valueOf(Type.class, str);
                }

                public static Type[] values() {
                    return (Type[]) $VALUES.clone();
                }
            }

            public NewMessage(Message message, Type type) {
                this.b = message;
                this.c = type;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NewMessage)) {
                    return false;
                }
                NewMessage newMessage = (NewMessage) obj;
                return epx.f(this.b, newMessage.b) && this.c == newMessage.c;
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "NewMessage(message=" + this.b + ", type=" + this.c + ')';
            }
        }

        /* compiled from: EventHubServiceClient.kt */
        public static final class a extends Op {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 675768859;
            }

            public final String toString() {
                return "Close";
            }
        }

        /* compiled from: EventHubServiceClient.kt */
        public static final class b extends Op {
            public final com.vk.network.eventhub.impl.a b;

            public b(com.vk.network.eventhub.impl.a aVar) {
                this.b = aVar;
            }
        }

        /* compiled from: EventHubServiceClient.kt */
        public static final class c extends Op {
            public final j1n b;
            public final com.vk.network.eventhub.impl.a c;
            public final AtomicBoolean d;

            public c(j1n j1nVar, com.vk.network.eventhub.impl.a aVar, AtomicBoolean atomicBoolean) {
                this.b = j1nVar;
                this.c = aVar;
                this.d = atomicBoolean;
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(Op op) {
            Op op2 = op;
            boolean z = this instanceof NewMessage;
            if (!z || !(op2 instanceof NewMessage)) {
                if (z) {
                    return 1;
                }
                return op2 instanceof NewMessage ? -1 : 0;
            }
            Message message = ((NewMessage) op2).b;
            Message message2 = ((NewMessage) this).b;
            int compareTo = message2.c.compareTo(message.c);
            return compareTo == 0 ? epx.h(message2.d, message.d) : compareTo;
        }
    }

    /* compiled from: EventHubServiceClient.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Op.NewMessage.Type.values().length];
            try {
                iArr[Op.NewMessage.Type.INCOMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Op.NewMessage.Type.OUTGOING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: EventHubServiceClient.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.gzs
        public final s3q0 invoke() {
            b25 b25Var = (b25) ((EventHubServiceClient) this.receiver).g.getValue();
            vx2.a.getClass();
            b25Var.Y(vx2.b());
            return s3q0.a;
        }
    }

    /* compiled from: EventHubServiceClient.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<BackoffType, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(BackoffType backoffType) {
            ((mcy) this.receiver).set(backoffType);
            return s3q0.a;
        }
    }

    /* compiled from: EventHubServiceClient.kt */
    public static final /* synthetic */ class d extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((EventHubServiceClient) this.receiver).d;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((EventHubServiceClient) this.receiver).d = (BackoffType) obj;
        }
    }

    public EventHubServiceClient(EventHubServiceUrlBuilder eventHubServiceUrlBuilder, pdh0 pdh0Var, eul0 eul0Var, hzs hzsVar, int i, bpn0 bpn0Var, Pair pair, wwe0 wwe0Var, boolean z) {
        this.a = hzsVar;
        this.b = z;
        pr6 pr6Var = new pr6(12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, pr6Var);
        this.f = msy.a(lazyThreadSafetyMode, new xu0(13));
        this.g = msy.a(lazyThreadSafetyMode, new ocg(bpn0Var, 15));
        this.h = wwe0Var != null;
        this.i = new cxe0(wwe0Var != null ? new pzp(wwe0Var) : null, new fgh(this, 11));
        LinkedTransferQueue<Result<Runnable>> linkedTransferQueue = new LinkedTransferQueue<>();
        this.j = linkedTransferQueue;
        this.k = new rzp(0, linkedTransferQueue, uzp.class, "asExecutor", "asExecutor(Ljava/util/Queue;)Ljava/util/concurrent/Executor;", 1, 0);
        szp szpVar = new szp(this);
        Uri.Builder clearQuery = Uri.parse(eventHubServiceUrlBuilder.a).buildUpon().scheme("wss").clearQuery();
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        numberInstance.setMaximumFractionDigits(3);
        numberInstance.setMinimumFractionDigits(3);
        numberInstance.setRoundingMode(RoundingMode.DOWN);
        Uri.Builder appendQueryParameter = clearQuery.appendQueryParameter("v", numberInstance.format(Double.valueOf(1.002d))).appendQueryParameter("format", eventHubServiceUrlBuilder.c.h()).appendQueryParameter("app_id", String.valueOf(eventHubServiceUrlBuilder.e));
        JSONObject put = new JSONObject().put("api_version", eventHubServiceUrlBuilder.f);
        if (eventHubServiceUrlBuilder.g) {
            put.put("user_agent", eventHubServiceUrlBuilder.b);
        }
        this.l = new r1w0(appendQueryParameter.appendQueryParameter("payload", Base64.encodeToString(put.toString().getBytes(emb.b), 10)).build().toString(), eventHubServiceUrlBuilder.b, pdh0Var, eventHubServiceUrlBuilder.d, szpVar, eul0Var, i, pair);
        this.m = new PriorityBlockingQueue<>();
        this.n = new HashMap<>();
        this.p = new ConcurrentHashMap<>();
        this.q = com.vk.network.eventhub.impl.c.a;
        this.r = new CopyOnWriteArraySet<>();
        this.s = ConnectionState.DISCONNECTED;
    }

    @Override // xsna.osx0
    public final void a(osx0.a aVar) {
        this.r.remove(aVar);
    }

    @Override // xsna.osx0
    public final ConnectionState b() {
        return this.s;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qzp
    public final void c(gzs<s3q0> gzsVar) {
        ThreadFactory a2;
        if (this.h) {
            cxe0 cxe0Var = this.i;
            if (cxe0Var.f.compareAndSet(false, true)) {
                ReentrantLock reentrantLock = cxe0Var.c;
                reentrantLock.lock();
                try {
                    cxe0Var.e.clear();
                    cxe0Var.h = null;
                    cxe0Var.i = false;
                    s3q0 s3q0Var = s3q0.a;
                    reentrantLock.unlock();
                    a2 = asu0.a.a((r3 & 4) != 0 ? 5 : 10, "RateLimitedMessageQueue", (r3 & 2) == 0);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(a2);
                    cxe0Var.g = newSingleThreadExecutor;
                    newSingleThreadExecutor.submit(new tv9(cxe0Var, 11));
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }
        this.j.clear();
        ConcurrentHashMap<yni0, ExecutorService> concurrentHashMap = this.p;
        Iterator<T> it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            ((ExecutorService) it.next()).shutdown();
        }
        concurrentHashMap.clear();
        k(new Op.b(new nfi0(this.j, (laq) this.e.getValue(), (laq) this.f.getValue(), this.d, gzsVar, new b(0, this, EventHubServiceClient.class, "refreshTokens", "refreshTokens()V", 0), new c(1, new d(this, EventHubServiceClient.class, "backoffType", "getBackoffType()Lcom/vk/network/eventhub/impl/backoff/BackoffType;", 0), mcy.class, "set", "set(Ljava/lang/Object;)V", 0), new dof(this, 20), this.b)));
        ((Executor) this.k.invoke()).execute(new sc4(this, 6));
    }

    @Override // xsna.qzp
    public final void d() {
        this.n.remove(new yni0((byte) 1));
    }

    @Override // xsna.qzp
    public final void e(Message.b bVar) {
        bVar.toString();
        if (this.h) {
            this.i.a(bVar);
        } else {
            k(new Op.NewMessage(bVar, Op.NewMessage.Type.OUTGOING));
        }
    }

    @Override // xsna.qzp
    public final void f(Message message) {
        if (!this.h) {
            Iterator<T> it = this.m.iterator();
            while (it.hasNext()) {
                Op op = (Op) it.next();
                if ((op instanceof Op.NewMessage) && epx.f(((Op.NewMessage) op).b, message)) {
                    it.remove();
                }
            }
            return;
        }
        cxe0 cxe0Var = this.i;
        ReentrantLock reentrantLock = cxe0Var.c;
        reentrantLock.lock();
        try {
            if (message.equals(cxe0Var.h)) {
                cxe0Var.i = true;
            }
            cxe0Var.e.remove(message);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // xsna.qzp
    public final void g() {
        if (this.h) {
            cxe0 cxe0Var = this.i;
            if (cxe0Var.f.compareAndSet(true, false)) {
                ExecutorService executorService = cxe0Var.g;
                cxe0Var.g = null;
                if (executorService != null) {
                    executorService.shutdownNow();
                }
                if (executorService != null) {
                    try {
                        executorService.awaitTermination(100L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                ReentrantLock reentrantLock = cxe0Var.c;
                reentrantLock.lock();
                try {
                    cxe0Var.e.clear();
                    s3q0 s3q0Var = s3q0.a;
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        try {
            this.l.a();
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(new WebSocketCriticalException("EventHubServiceClient stopService()", e));
            this.l.j.cancel();
        }
        Iterator<osx0.a> it = this.r.iterator();
        while (it.hasNext()) {
            it.next().a(ConnectionState.DISCONNECTED);
        }
        this.r.clear();
        this.q.getClass();
        long uptimeMillis = SystemClock.uptimeMillis() / 1000;
        com.vk.network.eventhub.impl.c.m = Long.valueOf(uptimeMillis);
        Preference.F(uptimeMillis, "master_service_perf_prefs", "closeRequestedTime");
        com.vk.network.eventhub.impl.c.g();
        ConcurrentHashMap<yni0, ExecutorService> concurrentHashMap = this.p;
        Iterator<T> it2 = concurrentHashMap.values().iterator();
        while (it2.hasNext()) {
            ((ExecutorService) it2.next()).shutdown();
        }
        concurrentHashMap.clear();
    }

    @Override // xsna.osx0
    public final void h(osx0.a aVar) {
        this.r.add(aVar);
    }

    @Override // xsna.qzp
    public final void i(yni0 yni0Var, d6a d6aVar) {
        Throwable a2;
        this.o = yni0Var;
        do {
            try {
                Object d2 = this.j.take().d();
                if (!(d2 instanceof Result.Failure)) {
                    ((Runnable) d2).run();
                }
                a2 = Result.a(d2);
            } catch (Throwable th) {
                d6aVar.invoke();
                throw th;
            }
        } while (a2 == null);
        if (a2 != t) {
            throw a2;
        }
        d6aVar.invoke();
    }

    @Override // xsna.qzp
    public final void j(ozp ozpVar) {
        if (this.n.put(new yni0(ozpVar.a()), ozpVar) != null) {
            throw new IllegalStateException("Currently only one message handler per service is supported");
        }
    }

    public final void k(Op op) {
        this.m.add(op);
    }

    public final void l(Message message) {
        Object failure;
        ozp ozpVar = this.n.get(new yni0(message.c()));
        if (ozpVar == null) {
            com.vk.metrics.eventtracking.b.a.a(new MessageUnhandledException("Missing handler for service " + ((Object) yni0.a(message.c())), null));
            return;
        }
        try {
            ozpVar.d(message);
            if (!ozpVar.b(message)) {
                ozpVar.c(new IllegalArgumentException("Unknown message: " + message));
            }
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            com.vk.metrics.eventtracking.b.a.a(new MessageUnhandledException("Unhandled exception for message " + message, a2));
            xzp xzpVar = this.c;
            if (xzpVar != null) {
                byte c2 = message.c();
                Iterator<xoi0> it = xzpVar.c.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().b(c2, a2, null);
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public final boolean m(Message message) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"EventHubServiceClient", "Send: " + message});
        }
        byte[] bArr = message.b;
        int length = bArr.length;
        new String(bArr, emb.b);
        r1w0 r1w0Var = this.l;
        byte[] bArr2 = message.b;
        szp szpVar = r1w0Var.e;
        szpVar.b.a.b(Long.valueOf(szpVar.a.incrementAndGet()), null, null, null, null, null, null, null, (127 & 128) != 0 ? null : bArr2, (127 & 256) != 0 ? null : r1w0Var.a);
        if (r1w0Var.j.f(ByteString.a.c(bArr2))) {
            com.vk.network.eventhub.impl.c cVar = this.q;
            int length2 = message.b.length;
            cVar.getClass();
            long addAndGet = com.vk.network.eventhub.impl.c.f.addAndGet(length2);
            long incrementAndGet = com.vk.network.eventhub.impl.c.d.incrementAndGet();
            Preference.F(addAndGet, "master_service_perf_prefs", "sentTraffic");
            Preference.F(incrementAndGet, "master_service_perf_prefs", "sentMsgCount");
            com.vk.network.eventhub.impl.c.g();
            return true;
        }
        if (Thread.interrupted()) {
            com.vk.network.eventhub.impl.c cVar2 = this.q;
            c.a.b bVar = c.a.b.a;
            cVar2.getClass();
            com.vk.network.eventhub.impl.c.e(bVar);
            throw new InterruptedException();
        }
        com.vk.network.eventhub.impl.c cVar3 = this.q;
        c.a.d dVar = c.a.d.a;
        cVar3.getClass();
        com.vk.network.eventhub.impl.c.e(dVar);
        return false;
    }

    public final void n(ConnectionState connectionState) {
        this.s = connectionState;
        Iterator<osx0.a> it = this.r.iterator();
        while (it.hasNext()) {
            it.next().a(connectionState);
        }
    }
}
