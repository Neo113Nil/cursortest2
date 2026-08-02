package k30;

import Sc.s;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.d;
import androidx.work.e;
import androidx.work.p;
import androidx.work.q;
import g30.InterfaceC6618a;
import i30.C7005b;
import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q30.c;
import ru.ozon.fintech.analytic.models.HealthData;
import ru.ozon.fintech.analytic.worker.MobileHealthSendWorker;
import xe.C10727i;
import xe.J;
import ze.C;
import ze.C11112B;
import ze.w;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f70443a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final q30.c f70444b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final R30.a f70445c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final O30.b f70446d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C7005b f70447e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final a f70448f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final w<Unit> f70449g;

    public static final class a extends kotlin.coroutines.a implements J {
        @Override // xe.J
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
            L80.a.c("MobileHealthInteractor", "MobileHealthInteractor coroutineExceptionHandler", th2);
            th2.printStackTrace();
        }
    }

    public g(@NotNull Context context, @NotNull q30.c repository, @NotNull R30.a scopes, @NotNull O30.b fintechLibType, @NotNull C7005b mobileHealthConfig, @NotNull b exitAppDetector, @NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        Intrinsics.checkNotNullParameter(mobileHealthConfig, "mobileHealthConfig");
        Intrinsics.checkNotNullParameter(exitAppDetector, "exitAppDetector");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f70443a = context;
        this.f70444b = repository;
        this.f70445c = scopes;
        this.f70446d = fintechLibType;
        this.f70447e = mobileHealthConfig;
        this.f70448f = new a(J.f105405n0);
        this.f70449g = C11112B.c(mobileHealthConfig.b(), 0L, C.FIXED_PERIOD);
        new CopyOnWriteArrayList();
    }

    public static void b(g gVar, int i11) {
        C10727i.c(gVar.f70445c.b(), gVar.f70448f, null, new e(gVar, (i11 & 1) == 0, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i11, kotlin.coroutines.jvm.internal.c cVar) {
        f fVar;
        int i12;
        g gVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i13 = fVar.f70442h;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                fVar.f70442h = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = fVar.f70440f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i12 = fVar.f70442h;
                if (i12 != 0) {
                    s.b(obj);
                    fVar.f70438d = this;
                    fVar.f70439e = i11;
                    fVar.f70442h = 1;
                    obj = this.f70444b.d(fVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    gVar = this;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = fVar.f70439e;
                    gVar = fVar.f70438d;
                    s.b(obj);
                }
                return Boolean.valueOf(((Number) obj).intValue() >= gVar.f70447e.c() * i11);
            }
        }
        fVar = new f(this, cVar);
        Object obj2 = fVar.f70440f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i12 = fVar.f70442h;
        if (i12 != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() >= gVar.f70447e.c() * i11);
    }

    static void e(g gVar, boolean z11, boolean z12) {
        gVar.getClass();
        d.a aVar = new d.a();
        aVar.b(p.CONNECTED);
        androidx.work.d a11 = aVar.a();
        q.a a12 = new q.a(MobileHealthSendWorker.class).a("MobileHealthInteractor");
        O30.b bVar = gVar.f70446d;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        e.a aVar2 = new e.a();
        aVar2.e(bVar.ordinal(), "FINTECH_ACTIVITY_LIB_TYPE_KEY");
        Intrinsics.checkNotNullExpressionValue(aVar2, "putInt(...)");
        aVar2.d(z11);
        aVar2.e(1, "WORKER_PARAM_BATCH_MULT");
        androidx.work.e a13 = aVar2.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        q.a j11 = a12.m(a13).j(a11);
        if (z12) {
            Duration ofMinutes = Duration.ofMinutes(3L);
            Intrinsics.checkNotNullExpressionValue(ofMinutes, "ofMinutes(...)");
            j11.l(ofMinutes);
        }
        androidx.work.impl.C i11 = androidx.work.impl.C.i(gVar.f70443a);
        androidx.work.g gVar2 = androidx.work.g.REPLACE;
        q b11 = j11.b();
        i11.getClass();
        i11.c("SendMobileHealthEvents", gVar2, Collections.singletonList(b11)).t();
    }

    public static void f(g gVar, c.a eventClass, String domain, String name, HealthData healthData, String str, Long l11, int i11) {
        gVar.getClass();
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(name, "name");
        gVar.f70447e.getClass();
    }

    public final void g(@NotNull String sessionId, boolean z11, long j11, boolean z12, InterfaceC6618a.b bVar, @NotNull D80.a brightnessCallback, @NotNull Function1 eventWarningsCallback) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(brightnessCallback, "brightnessCallback");
        Intrinsics.checkNotNullParameter(eventWarningsCallback, "eventWarningsCallback");
        this.f70447e.getClass();
    }

    public final void h(@NotNull InterfaceC6618a.b session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.f70444b.e();
    }

    public final void i(String str) {
        this.f70447e.getClass();
    }
}
