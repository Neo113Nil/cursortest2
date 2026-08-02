package com.braze.storage;

import android.content.Context;
import com.braze.Constants;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;
import org.chromium.base.TimeUtils;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class b3 {
    public static final int f = (int) TimeUnit.SECONDS.toMillis(10);
    public static final int g = (int) TimeUnit.MINUTES.toMillis(5);

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.events.d f691a;
    public final a3 b;
    public final ReentrantLock c;
    public final Mutex d;
    public com.braze.models.response.m e;

    public b3(Context context, String apiKey, com.braze.events.d internalEventPublisher) {
        b3 b3Var;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        this.f691a = internalEventPublisher;
        a3 a3Var = new a3(context, apiKey);
        this.b = a3Var;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.c = reentrantLock;
        this.d = MutexKt.Mutex$default(false, 1, null);
        DataStoreKey dataStoreKey = DataStoreKey.LAST_ACCESSED_SDK_VERSION;
        final String readString = a3Var.readString(dataStoreKey, "");
        final String str = Constants.BRAZE_SDK_VERSION;
        if (Intrinsics.areEqual(Constants.BRAZE_SDK_VERSION, readString)) {
            b3Var = this;
        } else {
            b3Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b3Var, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.b3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b3.a(readString, str);
                }
            }, 6, (Object) null);
            a3Var.writeData(DataStoreKey.CONFIG_TIME, 0L);
            a3Var.writeData(dataStoreKey, Constants.BRAZE_SDK_VERSION);
        }
        com.braze.models.response.m mVar = new com.braze.models.response.m();
        mVar.c = e();
        mVar.b = f();
        mVar.d = g();
        mVar.f659a = i();
        mVar.k = r();
        mVar.e = t();
        mVar.f = s();
        mVar.g = q();
        mVar.i = I();
        mVar.h = J();
        mVar.j = E();
        mVar.l = G();
        mVar.m = H();
        mVar.n = m();
        mVar.o = L();
        mVar.p = u();
        mVar.t = F();
        mVar.u = D();
        mVar.q = K();
        mVar.r = o();
        mVar.s = n();
        mVar.v = v();
        mVar.y = l();
        mVar.w = k();
        mVar.x = j();
        mVar.z = M();
        mVar.A = y();
        mVar.C = A();
        mVar.D = B();
        mVar.E = C();
        mVar.B = Long.valueOf(z());
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar2 = b3Var.e;
            Map w = (mVar2 == null || (w = mVar2.F) == null) ? w() : w;
            reentrantLock.unlock();
            mVar.F = w;
            mVar.G = d();
            mVar.H = p();
            reentrantLock.lock();
            try {
                b3Var.e = mVar;
                Unit unit = Unit.INSTANCE;
            } finally {
            }
        } finally {
        }
    }

    public static final String O() {
        return "Attempting to unlock server config info";
    }

    public static final String P() {
        return "Unlocking config info lock.";
    }

    public static final String Q() {
        return "Tried to unlock server config info when not locked.";
    }

    public static final String R() {
        return "Could not persist server config to DataStore.";
    }

    public static final String S() {
        return "Could not persist server config to DataStore.";
    }

    public static final String T() {
        return "Server config is older than previous config time. Not sending out ConfigChangeEvent.";
    }

    public static final String a(String str, String str2) {
        return "Detected SDK update from '" + str + "' -> '" + str2 + "'. Clearing config update time.";
    }

    public static final String b(com.braze.models.response.m mVar) {
        return "Finishing updating server config to " + mVar;
    }

    public static final String c() {
        return "Not allowing server config info unlock. Returning null.";
    }

    public static final String h() {
        return "Experienced exception retrieving blocklisted strings from local storage. Returning empty set.";
    }

    public static final String x() {
        return "Failed to parse endpoint override from storage";
    }

    public final long A() {
        long j;
        long longValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null) {
                j = 0;
                Long readLong = this.b.readLong(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES, 0L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                return j;
            }
            longValue = mVar.C;
            j = longValue;
            return j;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long B() {
        long j;
        long longValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null) {
                j = 0;
                Long readLong = this.b.readLong(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS, 0L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                return j;
            }
            longValue = mVar.D;
            j = longValue;
            return j;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long C() {
        long j;
        long longValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null) {
                j = 0;
                Long readLong = this.b.readLong(DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES, 0L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                return j;
            }
            longValue = mVar.E;
            j = longValue;
            return j;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean D() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar != null) {
                booleanValue = mVar.u;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.DUST_SHOULD_BLOCK_CC_REFRESH, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            return booleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean E() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar != null) {
                booleanValue = mVar.j;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.CONTENT_CARDS_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            return booleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean F() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar != null) {
                booleanValue = mVar.t;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.DUST_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            return booleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean G() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar != null) {
                booleanValue = mVar.l;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.EPHEMERAL_EVENTS_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            return booleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean H() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar != null) {
                booleanValue = mVar.m;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.FEATURE_FLAGS_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            return booleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean I() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar != null) {
                booleanValue = mVar.i;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.GEOFENCES_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            return booleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean J() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar != null) {
                booleanValue = mVar.h;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.GEOFENCES_ENABLED_SET, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            return booleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean K() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar != null) {
                booleanValue = mVar.q;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_ENABLED, Boolean.TRUE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : true;
            }
            return booleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean L() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar != null) {
                booleanValue = mVar.o;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.PUSH_MAX_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            return booleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean M() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar != null) {
                booleanValue = mVar.z;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.SDK_DEBUGGER_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            return booleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void N() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.b3$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b3.O();
            }
        }, 6, (Object) null);
        if (this.d.isLocked()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.b3$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b3.P();
                }
            }, 7, (Object) null);
            try {
                Mutex.DefaultImpls.unlock$default(this.d, null, 1, null);
            } catch (IllegalStateException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.b3$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b3.Q();
                    }
                }, 4, (Object) null);
            }
        }
    }

    public final boolean d() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar != null) {
                booleanValue = mVar.G;
            } else {
                Boolean readBoolean = this.b.readBoolean(DataStoreKey.BANNERS_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            return booleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Set e() {
        Set a2;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null || (a2 = mVar.c) == null) {
                a2 = a(DataStoreKey.BLOCKLISTED_ATTRIBUTES);
            }
            return a2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Set f() {
        Set a2;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null || (a2 = mVar.b) == null) {
                a2 = a(DataStoreKey.BLOCKLISTED_EVENTS);
            }
            return a2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Set g() {
        Set a2;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null || (a2 = mVar.d) == null) {
                a2 = a(DataStoreKey.BLOCKLISTED_PURCHASES);
            }
            return a2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long i() {
        long j;
        long longValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null) {
                j = 0;
                Long readLong = this.b.readLong(DataStoreKey.CONFIG_TIME, 0L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                return j;
            }
            longValue = mVar.f659a;
            j = longValue;
            return j;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int j() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null) {
                a3 a3Var = this.b;
                DataStoreKey dataStoreKey = DataStoreKey.DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS;
                i = g;
                Integer readInt = a3Var.readInt(dataStoreKey, Integer.valueOf(i));
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                return i;
            }
            intValue = mVar.x;
            i = intValue;
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int k() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null) {
                a3 a3Var = this.b;
                DataStoreKey dataStoreKey = DataStoreKey.DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS;
                i = f;
                Integer readInt = a3Var.readInt(dataStoreKey, Integer.valueOf(i));
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                return i;
            }
            intValue = mVar.w;
            i = intValue;
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int l() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null) {
                i = 3;
                Integer readInt = this.b.readInt(DataStoreKey.DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR, 3);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                return i;
            }
            intValue = mVar.y;
            i = intValue;
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int m() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null) {
                i = -1;
                Integer readInt = this.b.readInt(DataStoreKey.FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT, -1);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                return i;
            }
            intValue = mVar.n;
            i = intValue;
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int n() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null) {
                i = 30;
                Integer readInt = this.b.readInt(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_CAPACITY, 30);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                return i;
            }
            intValue = mVar.s;
            i = intValue;
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int o() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null) {
                i = 30;
                Integer readInt = this.b.readInt(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE, 30);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                return i;
            }
            intValue = mVar.r;
            i = intValue;
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int p() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null) {
                i = 0;
                Integer readInt = this.b.readInt(DataStoreKey.MAX_BANNER_PLACEMENTS, 0);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                return i;
            }
            intValue = mVar.H;
            i = intValue;
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int q() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null) {
                i = -1;
                Integer readInt = this.b.readInt(DataStoreKey.GEOFENCES_MAX_NUM_TO_REGISTER, -1);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                return i;
            }
            intValue = mVar.g;
            i = intValue;
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long r() {
        long j;
        long longValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null) {
                j = -1;
                Long readLong = this.b.readLong(DataStoreKey.MESSAGING_SESSION_TIMEOUT, -1L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                return j;
            }
            longValue = mVar.k;
            j = longValue;
            return j;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int s() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null) {
                i = -1;
                Integer readInt = this.b.readInt(DataStoreKey.GEOFENCES_MIN_TIME_REPORT, -1);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                return i;
            }
            intValue = mVar.f;
            i = intValue;
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int t() {
        int i;
        int intValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null) {
                i = -1;
                Integer readInt = this.b.readInt(DataStoreKey.GEOFENCES_MIN_TIME_REQUEST, -1);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                return i;
            }
            intValue = mVar.e;
            i = intValue;
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long u() {
        long j;
        long longValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null) {
                a3 a3Var = this.b;
                DataStoreKey dataStoreKey = DataStoreKey.PUSH_MAX_REDELIVER_BUFFER;
                j = TimeUtils.SECONDS_PER_DAY;
                Long readLong = a3Var.readLong(dataStoreKey, Long.valueOf(TimeUtils.SECONDS_PER_DAY));
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                return j;
            }
            longValue = mVar.p;
            j = longValue;
            return j;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long v() {
        long j;
        long longValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null) {
                j = -1;
                Long readLong = this.b.readLong(DataStoreKey.PUSH_MAX_REDELIVER_DEDUPE_BUFFER, -1L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                return j;
            }
            longValue = mVar.v;
            j = longValue;
            return j;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final LinkedHashMap w() {
        String str = "";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String readString = this.b.readString(DataStoreKey.GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES, "");
            if (readString != null) {
                str = readString;
            }
            if (str.length() != 0) {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    com.braze.requests.m mVar = com.braze.requests.n.b;
                    Intrinsics.checkNotNull(next);
                    com.braze.requests.n a2 = mVar.a(next);
                    if (a2 != null) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        linkedHashMap.put(a2, new com.braze.models.response.j(jSONObject2.getInt("capacity"), jSONObject2.getInt("refill")));
                    }
                }
            }
            return linkedHashMap;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.b3$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b3.x();
                }
            }, 4, (Object) null);
            return linkedHashMap;
        }
    }

    public final String y() {
        String readString;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null || (readString = mVar.A) == null) {
                readString = this.b.readString(DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE, null);
            }
            return readString;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long z() {
        long j;
        long longValue;
        Long l;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar == null || (l = mVar.B) == null) {
                j = -1;
                Long readLong = this.b.readLong(DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME, -1L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                return j;
            }
            longValue = l.longValue();
            j = longValue;
            return j;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String b() {
        return "Attempting to acquire server config lock";
    }

    public final void a(final com.braze.models.response.m serverConfig) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            this.e = serverConfig;
            Unit unit = Unit.INSTANCE;
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Set set = serverConfig.b;
                String str3 = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                if (set != null) {
                    String key = DataStoreKey.BLOCKLISTED_EVENTS.getKey();
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    List list = CollectionsKt.toList(set);
                    try {
                        Json.Companion companion = Json.INSTANCE;
                        companion.getSerializersModule();
                        str2 = companion.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list);
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                        str2 = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
                    }
                    linkedHashMap.put(key, str2);
                }
                Set set2 = serverConfig.c;
                if (set2 != null) {
                    String key2 = DataStoreKey.BLOCKLISTED_ATTRIBUTES.getKey();
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    List list2 = CollectionsKt.toList(set2);
                    try {
                        Json.Companion companion2 = Json.INSTANCE;
                        companion2.getSerializersModule();
                        str = companion2.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list2);
                    } catch (Exception e2) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                        str = (!(list2 instanceof Map) && (list2 instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
                    }
                    linkedHashMap.put(key2, str);
                }
                Set set3 = serverConfig.d;
                if (set3 != null) {
                    String key3 = DataStoreKey.BLOCKLISTED_PURCHASES.getKey();
                    DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                    List list3 = CollectionsKt.toList(set3);
                    try {
                        Json.Companion companion3 = Json.INSTANCE;
                        companion3.getSerializersModule();
                        str3 = companion3.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list3);
                    } catch (Exception e3) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                        if ((list3 instanceof Map) || !(list3 instanceof List)) {
                            str3 = "{}";
                        }
                    }
                    linkedHashMap.put(key3, str3);
                }
                Map map = serverConfig.F;
                if (map != null) {
                    JSONObject jSONObject = new JSONObject();
                    for (com.braze.requests.n nVar : map.keySet()) {
                        com.braze.models.response.j jVar = (com.braze.models.response.j) map.get(nVar);
                        if (jVar != null) {
                            jSONObject.put(nVar.name(), new JSONObject().put("refill", jVar.b).put("capacity", jVar.f656a));
                        }
                    }
                    linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES.getKey(), jSONObject.toString());
                }
                linkedHashMap.put(DataStoreKey.CONFIG_TIME.getKey(), Long.valueOf(serverConfig.f659a));
                linkedHashMap.put(DataStoreKey.EPHEMERAL_EVENTS_ENABLED.getKey(), Boolean.valueOf(serverConfig.l));
                linkedHashMap.put(DataStoreKey.GEOFENCES_ENABLED_SET.getKey(), Boolean.valueOf(serverConfig.h));
                linkedHashMap.put(DataStoreKey.GEOFENCES_ENABLED.getKey(), Boolean.valueOf(serverConfig.i));
                linkedHashMap.put(DataStoreKey.GEOFENCES_MIN_TIME_REQUEST.getKey(), Integer.valueOf(serverConfig.e));
                linkedHashMap.put(DataStoreKey.GEOFENCES_MIN_TIME_REPORT.getKey(), Integer.valueOf(serverConfig.f));
                linkedHashMap.put(DataStoreKey.GEOFENCES_MAX_NUM_TO_REGISTER.getKey(), Integer.valueOf(serverConfig.g));
                linkedHashMap.put(DataStoreKey.MESSAGING_SESSION_TIMEOUT.getKey(), Long.valueOf(serverConfig.k));
                linkedHashMap.put(DataStoreKey.DUST_ENABLED.getKey(), Boolean.valueOf(serverConfig.t));
                linkedHashMap.put(DataStoreKey.DUST_SHOULD_BLOCK_CC_REFRESH.getKey(), Boolean.valueOf(serverConfig.u));
                linkedHashMap.put(DataStoreKey.CONTENT_CARDS_ENABLED.getKey(), Boolean.valueOf(serverConfig.j));
                linkedHashMap.put(DataStoreKey.FEATURE_FLAGS_ENABLED.getKey(), Boolean.valueOf(serverConfig.m));
                linkedHashMap.put(DataStoreKey.FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT.getKey(), Integer.valueOf(serverConfig.n));
                linkedHashMap.put(DataStoreKey.PUSH_MAX_ENABLED.getKey(), Boolean.valueOf(serverConfig.o));
                linkedHashMap.put(DataStoreKey.PUSH_MAX_REDELIVER_BUFFER.getKey(), Long.valueOf(serverConfig.p));
                linkedHashMap.put(DataStoreKey.PUSH_MAX_REDELIVER_DEDUPE_BUFFER.getKey(), Long.valueOf(serverConfig.v));
                linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_ENABLED.getKey(), Boolean.valueOf(serverConfig.q));
                linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_CAPACITY.getKey(), Integer.valueOf(serverConfig.s));
                linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE.getKey(), Integer.valueOf(serverConfig.r));
                linkedHashMap.put(DataStoreKey.DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS.getKey(), Integer.valueOf(serverConfig.w));
                linkedHashMap.put(DataStoreKey.DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS.getKey(), Integer.valueOf(serverConfig.x));
                linkedHashMap.put(DataStoreKey.DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR.getKey(), Integer.valueOf(serverConfig.y));
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_ENABLED.getKey(), Boolean.valueOf(serverConfig.z));
                Long l = serverConfig.B;
                if (l != null) {
                    linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME.getKey(), Long.valueOf(l.longValue()));
                }
                String str4 = serverConfig.A;
                if (str4 != null) {
                    linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE.getKey(), str4);
                }
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES.getKey(), Long.valueOf(serverConfig.C));
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS.getKey(), Long.valueOf(serverConfig.D));
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES.getKey(), Long.valueOf(serverConfig.E));
                linkedHashMap.put(DataStoreKey.BANNERS_ENABLED.getKey(), Boolean.valueOf(serverConfig.G));
                linkedHashMap.put(DataStoreKey.MAX_BANNER_PLACEMENTS.getKey(), Integer.valueOf(serverConfig.H));
                this.b.batchUpdate(linkedHashMap, SetsKt.emptySet());
            } catch (Exception e4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e4, false, new Function0() { // from class: com.braze.storage.b3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b3.S();
                    }
                }, 4, (Object) null);
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.b3$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b3.b(com.braze.models.response.m.this);
                }
            }, 6, (Object) null);
            if (mVar != null) {
                if (serverConfig.f659a > mVar.f659a) {
                    this.f691a.b(new com.braze.events.internal.d(mVar, serverConfig), com.braze.events.internal.d.class);
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.b3$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return b3.T();
                        }
                    }, 7, (Object) null);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(com.braze.managers.d1 sdkDebugConfig) {
        Intrinsics.checkNotNullParameter(sdkDebugConfig, "sdkDebugConfig");
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.e;
            if (mVar != null) {
                mVar.z = sdkDebugConfig.f580a;
            }
            if (mVar != null) {
                mVar.C = sdkDebugConfig.d;
            }
            if (mVar != null) {
                mVar.D = sdkDebugConfig.e;
            }
            if (mVar != null) {
                mVar.E = sdkDebugConfig.f;
            }
            String str = sdkDebugConfig.c;
            if (str != null && mVar != null) {
                mVar.A = str;
            }
            Long l = sdkDebugConfig.b;
            if (l != null) {
                long longValue = l.longValue();
                com.braze.models.response.m mVar2 = this.e;
                if (mVar2 != null) {
                    mVar2.B = Long.valueOf(longValue);
                }
                Unit unit = Unit.INSTANCE;
            }
            try {
                com.braze.models.response.m mVar3 = this.e;
                if (mVar3 != null) {
                    Map<String, ? extends Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(DataStoreKey.SDK_DEBUGGER_ENABLED.getKey(), Boolean.valueOf(mVar3.z)), TuplesKt.to(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES.getKey(), Long.valueOf(mVar3.C)), TuplesKt.to(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS.getKey(), Long.valueOf(mVar3.D)), TuplesKt.to(DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES.getKey(), Long.valueOf(mVar3.E)));
                    Long l2 = mVar3.B;
                    if (l2 != null) {
                        mutableMapOf.put(DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME.getKey(), Long.valueOf(l2.longValue()));
                    }
                    String str2 = mVar3.A;
                    if (str2 != null) {
                        mutableMapOf.put(DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE.getKey(), str2);
                    }
                    this.b.batchUpdate(mutableMapOf, SetsKt.emptySet());
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.b3$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b3.R();
                    }
                }, 4, (Object) null);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.b3$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b3.a(b3.this);
                }
            }, 6, (Object) null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(b3 b3Var) {
        return "Finishing updating server config to " + b3Var.e;
    }

    public final Pair a() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.storage.b3$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b3.b();
            }
        }, 6, (Object) null);
        if (!Mutex.DefaultImpls.tryLock$default(this.d, null, 1, null)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.storage.b3$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b3.c();
                }
            }, 6, (Object) null);
            return null;
        }
        return new Pair(Long.valueOf(i()), Boolean.valueOf(i() <= 0));
    }

    public final HashSet a(DataStoreKey dataStoreKey) {
        Iterable arrayList;
        List emptyList;
        try {
            a3 a3Var = this.b;
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new h0(dataStoreKey), 12, (Object) null);
                arrayList = new ArrayList();
            } else {
                try {
                    Object readData = a3Var.readData(dataStoreKey, "");
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
            return CollectionsKt.toHashSet(arrayList);
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, new Function0() { // from class: com.braze.storage.b3$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b3.h();
                }
            }, 4, (Object) null);
            return new HashSet();
        }
    }
}
