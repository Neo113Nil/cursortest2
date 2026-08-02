package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final Wh.h f25285a = Wh.l.b(1, 0, 2, null);

    public static final String b(b bVar) {
        return "Cache locked successfully for export: " + bVar;
    }

    public final synchronized Object a() {
        if (!this.f25285a.b()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.b.b();
                }
            }, 7, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.b.b(bo.app.b.this);
            }
        }, 7, (Object) null);
        return c();
    }

    public abstract Object c();

    public abstract void c(Object obj, boolean z10);

    public static final String b() {
        return "Received call to export dirty object, but the cache was already locked.";
    }

    public static final String b(Object obj, boolean z10) {
        return "Tried to confirm outboundObject [" + obj + "] with success [" + z10 + "], but the cache wasn't locked, so not doing anything.";
    }

    public final synchronized void a(final Object obj, final boolean z10) {
        if (this.f25285a.a() != 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.b.b(obj, z10);
                }
            }, 6, (Object) null);
            return;
        }
        c(obj, z10);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.b.a(bo.app.b.this);
            }
        }, 6, (Object) null);
        this.f25285a.release();
    }

    public static final String a(b bVar) {
        return "Notifying confirmAndUnlock listeners for cache: " + bVar;
    }
}
