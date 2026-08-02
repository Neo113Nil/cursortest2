package com.braze.managers;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.storage.b3;
import com.braze.storage.e2;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.events.d f603a;
    public final b3 b;
    public final e2 c;
    public boolean d;

    public s(Context applicationContext, com.braze.events.d eventPublisher, b3 serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.f603a = eventPublisher;
        this.b = serverConfigStorageProvider;
        this.c = new e2(applicationContext);
    }

    public static final String c() {
        return "Publishing new messaging session event.";
    }

    public static final String d() {
        return "Messaging session not started.";
    }

    public final boolean a() {
        final long r = this.b.r();
        if (r != -1 && !this.d) {
            Long readLong = this.c.readLong(DataStoreKey.MESSAGING_SESSION_END_TIMESTAMP, -1L);
            final long longValue = readLong != null ? readLong.longValue() : -1L;
            final long nowInSeconds = DateTimeUtils.nowInSeconds();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.s$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.a(r, nowInSeconds, longValue);
                }
            }, 7, (Object) null);
            if (longValue + r < nowInSeconds) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        if (!a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.s$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.d();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.s$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.c();
            }
        }, 7, (Object) null);
        this.f603a.b(com.braze.events.internal.n.f530a, com.braze.events.internal.n.class);
        this.d = true;
    }

    public final void e() {
        final long nowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.s$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.a(nowInSeconds);
            }
        }, 7, (Object) null);
        this.c.writeData(DataStoreKey.MESSAGING_SESSION_END_TIMESTAMP, Long.valueOf(nowInSeconds));
        this.d = false;
    }

    public static final String a(long j, long j2, long j3) {
        return "Messaging session timeout: " + j + ", current diff: " + (j2 - j3);
    }

    public static final String a(long j) {
        return "Messaging session stopped. Adding new messaging session timestamp: " + j;
    }
}
