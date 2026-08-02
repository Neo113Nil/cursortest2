package bo.app;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public final r7 f25445a;

    /* renamed from: b, reason: collision with root package name */
    public final ue f25446b;

    /* renamed from: c, reason: collision with root package name */
    public final xa f25447c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25448d;

    public f2(Context applicationContext, r7 eventPublisher, ue serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.f25445a = eventPublisher;
        this.f25446b = serverConfigStorageProvider;
        this.f25447c = new xa(applicationContext);
    }

    public static final String c() {
        return "Publishing new messaging session event.";
    }

    public static final String d() {
        return "Messaging session not started.";
    }

    public final boolean a() {
        final long s10 = this.f25446b.s();
        if (s10 != -1 && !this.f25448d) {
            Long readLong = this.f25447c.readLong(DataStoreKey.MESSAGING_SESSION_END_TIMESTAMP, -1L);
            final long longValue = readLong != null ? readLong.longValue() : -1L;
            final long nowInSeconds = DateTimeUtils.nowInSeconds();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.A1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.f2.a(s10, nowInSeconds, longValue);
                }
            }, 7, (Object) null);
            if (longValue + s10 < nowInSeconds) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        if (!a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.z1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.f2.d();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.y1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.f2.c();
            }
        }, 7, (Object) null);
        this.f25445a.b(ya.f26321a, ya.class);
        this.f25448d = true;
    }

    public final void e() {
        final long nowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.x1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.f2.a(nowInSeconds);
            }
        }, 7, (Object) null);
        this.f25447c.writeData(DataStoreKey.MESSAGING_SESSION_END_TIMESTAMP, Long.valueOf(nowInSeconds));
        this.f25448d = false;
    }

    public static final String a(long j10, long j11, long j12) {
        return "Messaging session timeout: " + j10 + ", current diff: " + (j11 - j12);
    }

    public static final String a(long j10) {
        return "Messaging session stopped. Adding new messaging session timestamp: " + j10;
    }
}
