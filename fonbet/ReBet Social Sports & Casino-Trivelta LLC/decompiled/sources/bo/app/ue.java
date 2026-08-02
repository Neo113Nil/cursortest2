package bo.app;

import Wh.a;
import android.content.Context;
import bo.app.re;
import bo.app.ue;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import di.C4087f;
import di.Z0;
import ei.AbstractC4212b;
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
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ue {

    /* renamed from: f, reason: collision with root package name */
    public static final int f26122f = (int) TimeUnit.SECONDS.toMillis(10);

    /* renamed from: g, reason: collision with root package name */
    public static final int f26123g = (int) TimeUnit.MINUTES.toMillis(5);

    /* renamed from: a, reason: collision with root package name */
    public final r7 f26124a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.storage.p f26125b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f26126c;

    /* renamed from: d, reason: collision with root package name */
    public final Wh.a f26127d;

    /* renamed from: e, reason: collision with root package name */
    public re f26128e;

    public ue(Context context, String apiKey, r7 internalEventPublisher) {
        ue ueVar;
        Map x10;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        this.f26124a = internalEventPublisher;
        com.braze.storage.p pVar = new com.braze.storage.p(context, apiKey);
        this.f26125b = pVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f26126c = reentrantLock;
        this.f26127d = Wh.g.b(false, 1, null);
        DataStoreKey dataStoreKey = DataStoreKey.LAST_ACCESSED_SDK_VERSION;
        final String readString = pVar.readString(dataStoreKey, "");
        final String str = "42.2.0";
        if (Intrinsics.areEqual("42.2.0", readString)) {
            ueVar = this;
        } else {
            ueVar = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) ueVar, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.Ab
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ue.a(readString, str);
                }
            }, 6, (Object) null);
            pVar.writeData(DataStoreKey.CONFIG_TIME, 0L);
            pVar.writeData(dataStoreKey, "42.2.0");
        }
        re reVar = new re();
        reVar.f26003c = e();
        reVar.f26002b = f();
        reVar.f26004d = g();
        reVar.f26001a = i();
        reVar.f26011k = s();
        reVar.f26005e = u();
        reVar.f26006f = t();
        reVar.f26007g = r();
        reVar.f26009i = J();
        reVar.f26008h = K();
        reVar.f26010j = F();
        reVar.f26012l = H();
        reVar.f26013m = I();
        reVar.f26014n = n();
        reVar.f26015o = M();
        reVar.f26016p = v();
        reVar.f26020t = G();
        reVar.f26021u = E();
        reVar.f26017q = L();
        reVar.f26018r = p();
        reVar.f26019s = o();
        reVar.f26022v = w();
        reVar.f26025y = l();
        reVar.f26023w = k();
        reVar.f26024x = j();
        reVar.f26026z = N();
        reVar.f25992A = z();
        reVar.f25994C = B();
        reVar.f25995D = C();
        reVar.f25996E = D();
        reVar.f25993B = Long.valueOf(A());
        reentrantLock.lock();
        try {
            re reVar2 = ueVar.f26128e;
            try {
                if (reVar2 != null) {
                    x10 = reVar2.f25997F;
                    if (x10 == null) {
                    }
                    reentrantLock.unlock();
                    reVar.f25997F = x10;
                    reVar.f25998G = d();
                    reVar.f25999H = q();
                    reVar.f26000I = m();
                    reentrantLock.lock();
                    ueVar.f26128e = reVar;
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                ueVar.f26128e = reVar;
                Unit unit2 = Unit.INSTANCE;
                return;
            } finally {
                reentrantLock.unlock();
            }
            x10 = x();
            reentrantLock.unlock();
            reVar.f25997F = x10;
            reVar.f25998G = d();
            reVar.f25999H = q();
            reVar.f26000I = m();
            reentrantLock.lock();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static final String P() {
        return "Attempting to unlock server config info";
    }

    public static final String Q() {
        return "Unlocking config info lock.";
    }

    public static final String R() {
        return "Tried to unlock server config info when not locked.";
    }

    public static final String S() {
        return "Could not persist server config to DataStore.";
    }

    public static final String T() {
        return "Could not persist server config to DataStore.";
    }

    public static final String U() {
        return "Server config is older than previous config time. Not sending out ConfigChangeEvent.";
    }

    public static final String a(String str, String str2) {
        return "Detected SDK update from '" + str + "' -> '" + str2 + "'. Clearing config update time.";
    }

    public static final String b(re reVar) {
        return "Finishing updating server config to " + reVar;
    }

    public static final String c() {
        return "Not allowing server config info unlock. Returning null.";
    }

    public static final String h() {
        return "Experienced exception retrieving blocklisted strings from local storage. Returning empty set.";
    }

    public static final String y() {
        return "Failed to parse endpoint override from storage";
    }

    public final long A() {
        long j10;
        long longValue;
        Long l10;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar == null || (l10 = reVar.f25993B) == null) {
                j10 = -1;
                Long readLong = this.f26125b.readLong(DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME, -1L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j10;
            }
            longValue = l10.longValue();
            j10 = longValue;
            reentrantLock.unlock();
            return j10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long B() {
        long j10;
        long longValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar == null) {
                j10 = 0;
                Long readLong = this.f26125b.readLong(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES, 0L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j10;
            }
            longValue = reVar.f25994C;
            j10 = longValue;
            reentrantLock.unlock();
            return j10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long C() {
        long j10;
        long longValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar == null) {
                j10 = 0;
                Long readLong = this.f26125b.readLong(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS, 0L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j10;
            }
            longValue = reVar.f25995D;
            j10 = longValue;
            reentrantLock.unlock();
            return j10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long D() {
        long j10;
        long longValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar == null) {
                j10 = 0;
                Long readLong = this.f26125b.readLong(DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES, 0L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j10;
            }
            longValue = reVar.f25996E;
            j10 = longValue;
            reentrantLock.unlock();
            return j10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean E() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar != null) {
                booleanValue = reVar.f26021u;
            } else {
                Boolean readBoolean = this.f26125b.readBoolean(DataStoreKey.DUST_SHOULD_BLOCK_CC_REFRESH, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean F() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar != null) {
                booleanValue = reVar.f26010j;
            } else {
                Boolean readBoolean = this.f26125b.readBoolean(DataStoreKey.CONTENT_CARDS_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean G() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar != null) {
                booleanValue = reVar.f26020t;
            } else {
                Boolean readBoolean = this.f26125b.readBoolean(DataStoreKey.DUST_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean H() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar != null) {
                booleanValue = reVar.f26012l;
            } else {
                Boolean readBoolean = this.f26125b.readBoolean(DataStoreKey.EPHEMERAL_EVENTS_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean I() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar != null) {
                booleanValue = reVar.f26013m;
            } else {
                Boolean readBoolean = this.f26125b.readBoolean(DataStoreKey.FEATURE_FLAGS_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean J() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar != null) {
                booleanValue = reVar.f26009i;
            } else {
                Boolean readBoolean = this.f26125b.readBoolean(DataStoreKey.GEOFENCES_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean K() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar != null) {
                booleanValue = reVar.f26008h;
            } else {
                Boolean readBoolean = this.f26125b.readBoolean(DataStoreKey.GEOFENCES_ENABLED_SET, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean L() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar != null) {
                booleanValue = reVar.f26017q;
            } else {
                Boolean readBoolean = this.f26125b.readBoolean(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_ENABLED, Boolean.TRUE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : true;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean M() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar != null) {
                booleanValue = reVar.f26015o;
            } else {
                Boolean readBoolean = this.f26125b.readBoolean(DataStoreKey.PUSH_MAX_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean N() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar != null) {
                booleanValue = reVar.f26026z;
            } else {
                Boolean readBoolean = this.f26125b.readBoolean(DataStoreKey.SDK_DEBUGGER_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void O() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.tb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ue.P();
            }
        }, 6, (Object) null);
        if (this.f26127d.d()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.ub
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ue.Q();
                }
            }, 7, (Object) null);
            try {
                a.C0274a.b(this.f26127d, null, 1, null);
            } catch (IllegalStateException e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.vb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ue.R();
                    }
                }, 4, (Object) null);
            }
        }
    }

    public final boolean d() {
        boolean booleanValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar != null) {
                booleanValue = reVar.f25998G;
            } else {
                Boolean readBoolean = this.f26125b.readBoolean(DataStoreKey.BANNERS_ENABLED, Boolean.FALSE);
                booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
            }
            reentrantLock.unlock();
            return booleanValue;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final Set e() {
        Set a10;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar != null) {
                a10 = reVar.f26003c;
                if (a10 == null) {
                }
                reentrantLock.unlock();
                return a10;
            }
            a10 = a(DataStoreKey.BLOCKLISTED_ATTRIBUTES);
            reentrantLock.unlock();
            return a10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final Set f() {
        Set a10;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar != null) {
                a10 = reVar.f26002b;
                if (a10 == null) {
                }
                reentrantLock.unlock();
                return a10;
            }
            a10 = a(DataStoreKey.BLOCKLISTED_EVENTS);
            reentrantLock.unlock();
            return a10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final Set g() {
        Set a10;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar != null) {
                a10 = reVar.f26004d;
                if (a10 == null) {
                }
                reentrantLock.unlock();
                return a10;
            }
            a10 = a(DataStoreKey.BLOCKLISTED_PURCHASES);
            reentrantLock.unlock();
            return a10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long i() {
        long j10;
        long longValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar == null) {
                j10 = 0;
                Long readLong = this.f26125b.readLong(DataStoreKey.CONFIG_TIME, 0L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j10;
            }
            longValue = reVar.f26001a;
            j10 = longValue;
            reentrantLock.unlock();
            return j10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int j() {
        int i10;
        int intValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar == null) {
                com.braze.storage.p pVar = this.f26125b;
                DataStoreKey dataStoreKey = DataStoreKey.DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS;
                i10 = f26123g;
                Integer readInt = pVar.readInt(dataStoreKey, Integer.valueOf(i10));
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i10;
            }
            intValue = reVar.f26024x;
            i10 = intValue;
            reentrantLock.unlock();
            return i10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int k() {
        int i10;
        int intValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar == null) {
                com.braze.storage.p pVar = this.f26125b;
                DataStoreKey dataStoreKey = DataStoreKey.DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS;
                i10 = f26122f;
                Integer readInt = pVar.readInt(dataStoreKey, Integer.valueOf(i10));
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i10;
            }
            intValue = reVar.f26023w;
            i10 = intValue;
            reentrantLock.unlock();
            return i10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int l() {
        int i10;
        int intValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar == null) {
                i10 = 3;
                Integer readInt = this.f26125b.readInt(DataStoreKey.DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR, 3);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i10;
            }
            intValue = reVar.f26025y;
            i10 = intValue;
            reentrantLock.unlock();
            return i10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int m() {
        int intValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar != null) {
                intValue = reVar.f26000I;
            } else {
                Integer readInt = this.f26125b.readInt(DataStoreKey.BANNERS_DISMISSALS_CACHE_SIZE, 200);
                intValue = readInt != null ? readInt.intValue() : 200;
            }
            int i10 = intValue > 0 ? intValue : 200;
            reentrantLock.unlock();
            return i10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int n() {
        int i10;
        int intValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar == null) {
                i10 = 5;
                Integer readInt = this.f26125b.readInt(DataStoreKey.FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT, 5);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i10;
            }
            intValue = reVar.f26014n;
            i10 = intValue;
            reentrantLock.unlock();
            return i10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int o() {
        int i10;
        int intValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar == null) {
                i10 = 30;
                Integer readInt = this.f26125b.readInt(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_CAPACITY, 30);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i10;
            }
            intValue = reVar.f26019s;
            i10 = intValue;
            reentrantLock.unlock();
            return i10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int p() {
        int i10;
        int intValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar == null) {
                i10 = 30;
                Integer readInt = this.f26125b.readInt(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE, 30);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i10;
            }
            intValue = reVar.f26018r;
            i10 = intValue;
            reentrantLock.unlock();
            return i10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int q() {
        int i10;
        int intValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar == null) {
                i10 = 0;
                Integer readInt = this.f26125b.readInt(DataStoreKey.MAX_BANNER_PLACEMENTS, 0);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i10;
            }
            intValue = reVar.f25999H;
            i10 = intValue;
            reentrantLock.unlock();
            return i10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int r() {
        int i10;
        int intValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar == null) {
                i10 = -1;
                Integer readInt = this.f26125b.readInt(DataStoreKey.GEOFENCES_MAX_NUM_TO_REGISTER, -1);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i10;
            }
            intValue = reVar.f26007g;
            i10 = intValue;
            reentrantLock.unlock();
            return i10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long s() {
        long j10;
        long longValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar == null) {
                j10 = -1;
                Long readLong = this.f26125b.readLong(DataStoreKey.MESSAGING_SESSION_TIMEOUT, -1L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j10;
            }
            longValue = reVar.f26011k;
            j10 = longValue;
            reentrantLock.unlock();
            return j10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int t() {
        int i10;
        int intValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar == null) {
                i10 = -1;
                Integer readInt = this.f26125b.readInt(DataStoreKey.GEOFENCES_MIN_TIME_REPORT, -1);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i10;
            }
            intValue = reVar.f26006f;
            i10 = intValue;
            reentrantLock.unlock();
            return i10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int u() {
        int i10;
        int intValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar == null) {
                i10 = -1;
                Integer readInt = this.f26125b.readInt(DataStoreKey.GEOFENCES_MIN_TIME_REQUEST, -1);
                if (readInt != null) {
                    intValue = readInt.intValue();
                }
                reentrantLock.unlock();
                return i10;
            }
            intValue = reVar.f26005e;
            i10 = intValue;
            reentrantLock.unlock();
            return i10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long v() {
        long j10;
        long longValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar == null) {
                j10 = 86400;
                Long readLong = this.f26125b.readLong(DataStoreKey.PUSH_MAX_REDELIVER_BUFFER, 86400L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j10;
            }
            longValue = reVar.f26016p;
            j10 = longValue;
            reentrantLock.unlock();
            return j10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long w() {
        long j10;
        long longValue;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar == null) {
                j10 = -1;
                Long readLong = this.f26125b.readLong(DataStoreKey.PUSH_MAX_REDELIVER_DEDUPE_BUFFER, -1L);
                if (readLong != null) {
                    longValue = readLong.longValue();
                }
                reentrantLock.unlock();
                return j10;
            }
            longValue = reVar.f26022v;
            j10 = longValue;
            reentrantLock.unlock();
            return j10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final LinkedHashMap x() {
        String str = "";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String readString = this.f26125b.readString(DataStoreKey.GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES, "");
            if (readString != null) {
                str = readString;
            }
            if (str.length() != 0) {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    b9 b9Var = c9.f25332b;
                    Intrinsics.checkNotNull(next);
                    c9 a10 = b9Var.a(next);
                    if (a10 != null) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        linkedHashMap.put(a10, new oe(jSONObject2.getInt("capacity"), jSONObject2.getInt("refill")));
                    }
                }
            }
            return linkedHashMap;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Cb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ue.y();
                }
            }, 4, (Object) null);
            return linkedHashMap;
        }
    }

    public final String z() {
        String readString;
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar != null) {
                readString = reVar.f25992A;
                if (readString == null) {
                }
                reentrantLock.unlock();
                return readString;
            }
            readString = this.f26125b.readString(DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE, null);
            reentrantLock.unlock();
            return readString;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String b() {
        return "Attempting to acquire server config lock";
    }

    public final void a(final re serverConfig) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            this.f26128e = serverConfig;
            Unit unit = Unit.INSTANCE;
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Set set = serverConfig.f26002b;
                String str3 = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                if (set != null) {
                    String key = DataStoreKey.BLOCKLISTED_EVENTS.getKey();
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    List list = CollectionsKt.toList(set);
                    try {
                        AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                        aVar.a();
                        str2 = aVar.b(new C4087f(Z0.f45341a), list);
                    } catch (Exception e10) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                        str2 = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
                    }
                    linkedHashMap.put(key, str2);
                }
                Set set2 = serverConfig.f26003c;
                if (set2 != null) {
                    String key2 = DataStoreKey.BLOCKLISTED_ATTRIBUTES.getKey();
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    List list2 = CollectionsKt.toList(set2);
                    try {
                        AbstractC4212b.a aVar2 = AbstractC4212b.f46079d;
                        aVar2.a();
                        str = aVar2.b(new C4087f(Z0.f45341a), list2);
                    } catch (Exception e11) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                        str = (!(list2 instanceof Map) && (list2 instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
                    }
                    linkedHashMap.put(key2, str);
                }
                Set set3 = serverConfig.f26004d;
                if (set3 != null) {
                    String key3 = DataStoreKey.BLOCKLISTED_PURCHASES.getKey();
                    DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                    List list3 = CollectionsKt.toList(set3);
                    try {
                        AbstractC4212b.a aVar3 = AbstractC4212b.f46079d;
                        aVar3.a();
                        str3 = aVar3.b(new C4087f(Z0.f45341a), list3);
                    } catch (Exception e12) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.f29470E, (Throwable) e12, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                        if ((list3 instanceof Map) || !(list3 instanceof List)) {
                            str3 = "{}";
                        }
                    }
                    linkedHashMap.put(key3, str3);
                }
                Map map = serverConfig.f25997F;
                if (map != null) {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        c9 c9Var = (c9) entry.getKey();
                        oe oeVar = (oe) entry.getValue();
                        jSONObject.put(c9Var.name(), new JSONObject().put("refill", oeVar.f25894b).put("capacity", oeVar.f25893a));
                    }
                    linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES.getKey(), jSONObject.toString());
                }
                linkedHashMap.put(DataStoreKey.CONFIG_TIME.getKey(), Long.valueOf(serverConfig.f26001a));
                linkedHashMap.put(DataStoreKey.EPHEMERAL_EVENTS_ENABLED.getKey(), Boolean.valueOf(serverConfig.f26012l));
                linkedHashMap.put(DataStoreKey.GEOFENCES_ENABLED_SET.getKey(), Boolean.valueOf(serverConfig.f26008h));
                linkedHashMap.put(DataStoreKey.GEOFENCES_ENABLED.getKey(), Boolean.valueOf(serverConfig.f26009i));
                linkedHashMap.put(DataStoreKey.GEOFENCES_MIN_TIME_REQUEST.getKey(), Integer.valueOf(serverConfig.f26005e));
                linkedHashMap.put(DataStoreKey.GEOFENCES_MIN_TIME_REPORT.getKey(), Integer.valueOf(serverConfig.f26006f));
                linkedHashMap.put(DataStoreKey.GEOFENCES_MAX_NUM_TO_REGISTER.getKey(), Integer.valueOf(serverConfig.f26007g));
                linkedHashMap.put(DataStoreKey.MESSAGING_SESSION_TIMEOUT.getKey(), Long.valueOf(serverConfig.f26011k));
                linkedHashMap.put(DataStoreKey.DUST_ENABLED.getKey(), Boolean.valueOf(serverConfig.f26020t));
                linkedHashMap.put(DataStoreKey.DUST_SHOULD_BLOCK_CC_REFRESH.getKey(), Boolean.valueOf(serverConfig.f26021u));
                linkedHashMap.put(DataStoreKey.CONTENT_CARDS_ENABLED.getKey(), Boolean.valueOf(serverConfig.f26010j));
                linkedHashMap.put(DataStoreKey.FEATURE_FLAGS_ENABLED.getKey(), Boolean.valueOf(serverConfig.f26013m));
                linkedHashMap.put(DataStoreKey.FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT.getKey(), Integer.valueOf(serverConfig.f26014n));
                linkedHashMap.put(DataStoreKey.PUSH_MAX_ENABLED.getKey(), Boolean.valueOf(serverConfig.f26015o));
                linkedHashMap.put(DataStoreKey.PUSH_MAX_REDELIVER_BUFFER.getKey(), Long.valueOf(serverConfig.f26016p));
                linkedHashMap.put(DataStoreKey.PUSH_MAX_REDELIVER_DEDUPE_BUFFER.getKey(), Long.valueOf(serverConfig.f26022v));
                linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_ENABLED.getKey(), Boolean.valueOf(serverConfig.f26017q));
                linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_CAPACITY.getKey(), Integer.valueOf(serverConfig.f26019s));
                linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE.getKey(), Integer.valueOf(serverConfig.f26018r));
                linkedHashMap.put(DataStoreKey.DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS.getKey(), Integer.valueOf(serverConfig.f26023w));
                linkedHashMap.put(DataStoreKey.DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS.getKey(), Integer.valueOf(serverConfig.f26024x));
                linkedHashMap.put(DataStoreKey.DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR.getKey(), Integer.valueOf(serverConfig.f26025y));
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_ENABLED.getKey(), Boolean.valueOf(serverConfig.f26026z));
                Long l10 = serverConfig.f25993B;
                if (l10 != null) {
                    linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME.getKey(), Long.valueOf(l10.longValue()));
                }
                String str4 = serverConfig.f25992A;
                if (str4 != null) {
                    linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE.getKey(), str4);
                }
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES.getKey(), Long.valueOf(serverConfig.f25994C));
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS.getKey(), Long.valueOf(serverConfig.f25995D));
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES.getKey(), Long.valueOf(serverConfig.f25996E));
                linkedHashMap.put(DataStoreKey.BANNERS_ENABLED.getKey(), Boolean.valueOf(serverConfig.f25998G));
                linkedHashMap.put(DataStoreKey.MAX_BANNER_PLACEMENTS.getKey(), Integer.valueOf(serverConfig.f25999H));
                linkedHashMap.put(DataStoreKey.BANNERS_DISMISSALS_CACHE_SIZE.getKey(), Integer.valueOf(serverConfig.f26000I));
                this.f26125b.batchUpdate(linkedHashMap, SetsKt.emptySet());
            } catch (Exception e13) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e13, false, new Function0() { // from class: c3.sb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ue.T();
                    }
                }, 4, (Object) null);
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.wb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ue.b(re.this);
                }
            }, 6, (Object) null);
            if (reVar != null) {
                if (serverConfig.f26001a > reVar.f26001a) {
                    this.f26124a.b(new o3(reVar, serverConfig), o3.class);
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.xb
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ue.U();
                        }
                    }, 7, (Object) null);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(td sdkDebugConfig) {
        Intrinsics.checkNotNullParameter(sdkDebugConfig, "sdkDebugConfig");
        ReentrantLock reentrantLock = this.f26126c;
        reentrantLock.lock();
        try {
            re reVar = this.f26128e;
            if (reVar != null) {
                reVar.f26026z = sdkDebugConfig.f26084a;
            }
            if (reVar != null) {
                reVar.f25994C = sdkDebugConfig.f26087d;
            }
            if (reVar != null) {
                reVar.f25995D = sdkDebugConfig.f26088e;
            }
            if (reVar != null) {
                reVar.f25996E = sdkDebugConfig.f26089f;
            }
            String str = sdkDebugConfig.f26086c;
            if (str != null && reVar != null) {
                reVar.f25992A = str;
            }
            Long l10 = sdkDebugConfig.f26085b;
            if (l10 != null) {
                long longValue = l10.longValue();
                re reVar2 = this.f26128e;
                if (reVar2 != null) {
                    reVar2.f25993B = Long.valueOf(longValue);
                }
                Unit unit = Unit.INSTANCE;
            }
            reentrantLock.unlock();
            try {
                re reVar3 = this.f26128e;
                if (reVar3 != null) {
                    Map<String, ? extends Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(DataStoreKey.SDK_DEBUGGER_ENABLED.getKey(), Boolean.valueOf(reVar3.f26026z)), TuplesKt.to(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES.getKey(), Long.valueOf(reVar3.f25994C)), TuplesKt.to(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS.getKey(), Long.valueOf(reVar3.f25995D)), TuplesKt.to(DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES.getKey(), Long.valueOf(reVar3.f25996E)));
                    Long l11 = reVar3.f25993B;
                    if (l11 != null) {
                        mutableMapOf.put(DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME.getKey(), Long.valueOf(l11.longValue()));
                    }
                    String str2 = reVar3.f25992A;
                    if (str2 != null) {
                        mutableMapOf.put(DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE.getKey(), str2);
                    }
                    this.f26125b.batchUpdate(mutableMapOf, SetsKt.emptySet());
                }
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Db
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ue.S();
                    }
                }, 4, (Object) null);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.Eb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ue.a(ue.this);
                }
            }, 6, (Object) null);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String a(ue ueVar) {
        return "Finishing updating server config to " + ueVar.f26128e;
    }

    public final Pair a() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f29472V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.yb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ue.b();
            }
        }, 6, (Object) null);
        if (!a.C0274a.a(this.f26127d, null, 1, null)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.zb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ue.c();
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
            com.braze.storage.p pVar = this.f26125b;
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
                arrayList = new ArrayList();
            } else {
                try {
                    Object readData = pVar.readData(dataStoreKey, "");
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
            return CollectionsKt.toHashSet(arrayList);
        } catch (Exception e12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e12, false, new Function0() { // from class: c3.Bb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ue.h();
                }
            }, 4, (Object) null);
            return new HashSet();
        }
    }
}
