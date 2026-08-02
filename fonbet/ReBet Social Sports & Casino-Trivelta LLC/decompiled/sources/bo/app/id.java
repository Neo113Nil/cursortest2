package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class id {

    /* renamed from: a, reason: collision with root package name */
    public final d9 f25571a;

    /* renamed from: b, reason: collision with root package name */
    public long f25572b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25573c;

    /* renamed from: d, reason: collision with root package name */
    public jd f25574d;

    /* renamed from: e, reason: collision with root package name */
    public int f25575e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f25576f;

    /* renamed from: g, reason: collision with root package name */
    public long f25577g;

    /* renamed from: h, reason: collision with root package name */
    public int f25578h;

    public id(d9 request, long j10, long j11) {
        jd state = jd.f25623a;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f25571a = request;
        this.f25572b = j10;
        this.f25573c = j11;
        this.f25574d = state;
        this.f25575e = 0;
        this.f25576f = null;
        this.f25577g = j11;
    }

    public final void a(final long j10, final jd newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        if (this.f25574d != newState) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f29472V;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, true, new Function0() { // from class: c3.C3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.id.a(bo.app.id.this, newState, j10);
                }
            }, 2, (Object) null);
            this.f25577g = j10;
            this.f25574d = newState;
            if (newState == jd.f25624b) {
                this.f25578h++;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, true, new Function0() { // from class: c3.D3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.id.a(bo.app.id.this, j10);
                    }
                }, 2, (Object) null);
            }
        }
    }

    public static final String a(id idVar, jd jdVar, long j10) {
        return "Moving from " + idVar.f25574d + " -> " + jdVar + " with time " + j10 + " for \n" + idVar.a(j10);
    }

    public static final String a(id idVar, long j10) {
        return "Moving to pending retry.Updated retry count: " + idVar.f25578h + " for: \n" + idVar.a(j10);
    }

    public final String a(long j10) {
        return StringsKt.trimMargin$default("\n            |RequestInfo for " + this.f25571a.hashCode() + " \n            | at " + j10 + "\n            | request.target = " + ((i2) this.f25571a).e() + "\n            | nextAdvance = " + (this.f25572b - j10) + "\n            | createdAt = " + (this.f25573c - j10) + "\n            | state = " + this.f25574d + "\n            | lastStateMovedAt = " + (this.f25577g - j10) + "\n            | timesMovedToRetry = " + this.f25578h + "\n        ", null, 1, null);
    }
}
