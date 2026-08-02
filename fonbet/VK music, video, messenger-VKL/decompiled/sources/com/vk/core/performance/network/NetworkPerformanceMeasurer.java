package com.vk.core.performance.network;

import com.vk.log.L;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.stat.model.builders.aggregate.AggregateEventKey;
import io.reactivex.rxjava3.disposables.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import xsna.asp;
import xsna.asu0;
import xsna.b04;
import xsna.m900;
import xsna.s3q0;
import xsna.sk3;
import xsna.zrp;

/* compiled from: NetworkPerformanceMeasurer.kt */
/* loaded from: classes.dex */
public final class NetworkPerformanceMeasurer {
    public static volatile boolean b;
    public static volatile boolean c;
    public static boolean e;
    public static volatile int f;
    public static volatile double g;
    public static volatile boolean h;
    public static volatile c i;
    public static volatile boolean j;
    public static NetworkClass m;
    public static final NetworkPerformanceMeasurer a = new NetworkPerformanceMeasurer();
    public static boolean d = true;
    public static volatile int k = -2;
    public static final ArrayList l = new ArrayList();
    public static final m900<String, Double> n = new m900<>(100);
    public static final m900<String, Boolean> o = new m900<>(100);
    public static b<Double> p = new b<>(60);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NetworkPerformanceMeasurer.kt */
    /* loaded from: classes17.dex */
    public static final class NetworkClass {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NetworkClass[] $VALUES;
        public static final NetworkClass BAD_NETWORK_CLASS;
        public static final NetworkClass GOOD_NETWORK_CLASS;
        public static final NetworkClass SO_SO_NETWORK_CLASS;

        static {
            NetworkClass networkClass = new NetworkClass("BAD_NETWORK_CLASS", 0);
            BAD_NETWORK_CLASS = networkClass;
            NetworkClass networkClass2 = new NetworkClass("SO_SO_NETWORK_CLASS", 1);
            SO_SO_NETWORK_CLASS = networkClass2;
            NetworkClass networkClass3 = new NetworkClass("GOOD_NETWORK_CLASS", 2);
            GOOD_NETWORK_CLASS = networkClass3;
            NetworkClass[] networkClassArr = {networkClass, networkClass2, networkClass3};
            $VALUES = networkClassArr;
            $ENTRIES = new asp(networkClassArr);
        }

        public NetworkClass() {
            throw null;
        }

        public static NetworkClass valueOf(String str) {
            return (NetworkClass) Enum.valueOf(NetworkClass.class, str);
        }

        public static NetworkClass[] values() {
            return (NetworkClass[]) $VALUES.clone();
        }
    }

    /* compiled from: NetworkPerformanceMeasurer.kt */
    public interface a {
        void a(NetworkClass networkClass, boolean z);
    }

    /* compiled from: NetworkPerformanceMeasurer.kt */
    public static final class b<T> {
        public final int a;
        public final sk3<Pair<T, Long>> b = new sk3<>();

        public b(int i) {
            this.a = i;
        }
    }

    public static void a(a aVar) {
        asu0.a.getClass();
        asu0.j().submit(new b04(aVar, 9));
    }

    public static void b(NetworkClass networkClass, boolean z) {
        L.e("NetworkPerformanceMeasurer", "onNetworkClassChange: networkClass = " + networkClass.name() + ", predictive = " + z);
        if (z) {
            AggregateEventBuilder aggregateEventBuilder = new AggregateEventBuilder(AggregateEventKey.FEED_INITIAL_MODE);
            aggregateEventBuilder.v(0, networkClass.ordinal());
            aggregateEventBuilder.q();
        }
        NetworkClass networkClass2 = m;
        if (networkClass2 != null) {
            if (networkClass2 == networkClass) {
                return;
            }
            if (!z) {
                AggregateEventBuilder aggregateEventBuilder2 = new AggregateEventBuilder(AggregateEventKey.FEED_MODE_CHANGE);
                NetworkClass networkClass3 = m;
                if (networkClass3 == null) {
                    networkClass3 = null;
                }
                aggregateEventBuilder2.v(0, networkClass3.ordinal());
                aggregateEventBuilder2.v(1, networkClass.ordinal());
                aggregateEventBuilder2.q();
            }
        }
        m = networkClass;
        ArrayList arrayList = l;
        synchronized (arrayList) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a aVar = (a) ((WeakReference) it.next()).get();
                    if (aVar != null) {
                        aVar.a(networkClass, z);
                    } else {
                        it.remove();
                    }
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(String str) {
        o.put(str, Boolean.TRUE);
    }

    public static NetworkClass d(int i2) {
        return i2 > 38 ? NetworkClass.BAD_NETWORK_CLASS : i2 > 21 ? NetworkClass.SO_SO_NETWORK_CLASS : NetworkClass.GOOD_NETWORK_CLASS;
    }
}
