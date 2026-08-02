package pi0;

import Am.C2438a;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f81221a;

    /* renamed from: b, reason: collision with root package name */
    private final Boolean f81222b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f81223c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f81224d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f81225e;

    /* renamed from: f, reason: collision with root package name */
    private final Boolean f81226f;

    /* renamed from: g, reason: collision with root package name */
    private final Boolean f81227g;

    /* renamed from: h, reason: collision with root package name */
    private final Boolean f81228h;

    /* renamed from: i, reason: collision with root package name */
    private final Integer f81229i;

    /* renamed from: j, reason: collision with root package name */
    private final Boolean f81230j;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ m<Object>[] f81231d = {C2438a.c(a.class, "intExtractor", "getIntExtractor()Lru/ozon/tracker/debug/menu/config/ConfigurationExtractor;", 0), C2438a.c(a.class, "boolExtractor", "getBoolExtractor()Lru/ozon/tracker/debug/menu/config/ConfigurationExtractor;", 0)};

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Gj0.a f81232a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final d f81233b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final c f81234c;

        public a(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Gj0.a extractor = new Gj0.a(intent);
            this.f81232a = extractor;
            Intrinsics.checkNotNullParameter(extractor, "extractor");
            this.f81233b = new d(extractor);
            Intrinsics.checkNotNullParameter(extractor, "extractor");
            this.f81234c = new c(extractor);
        }

        private final b<Boolean> b() {
            return (b) this.f81234c.getValue(this, f81231d[1]);
        }

        @NotNull
        public final h a() {
            int i11 = 0;
            if (!this.f81232a.e()) {
                return new h(i11);
            }
            m<Object>[] mVarArr = f81231d;
            m<Object> mVar = mVarArr[0];
            d dVar = this.f81233b;
            return new h((Integer) ((b) dVar.getValue(this, mVar)).a("batchSize", null), b().a("trackLifecycle", "OZON_TRACKER_SDK_TRACK_LIFECYCLE"), b().a("testMode", "OZON_TRACKER_SDK_TEST_MODE_ENABLED"), b().a("logs", "OZON_TRACKER_SDK_LOGS_ENABLED"), b().a("forceSendingEventsOnMinimize", "OZON_TRACKER_SDK_FORCE_SENDING_EVENTS_ON_MINIMIZE"), b().a("delayedSendingEvents", "OZON_TRACKER_SDK_DELAYED_SENDING_EVENTS"), b().a("forceSendingTracesOnMinimize", "OZON_TRACKER_SDK_FORCE_SENDING_TRACES_ON_MINIMIZE"), b().a("delayedSendingTraces", "OZON_TRACKER_SDK_DELAYED_SENDING_TRACES"), (Integer) ((b) dVar.getValue(this, mVarArr[0])).a("performanceLifetimeEvent", null), b().a("hostDomain", null));
        }
    }

    public h() {
        this(0);
    }

    public final Integer a() {
        return this.f81221a;
    }

    public final Boolean b() {
        return this.f81226f;
    }

    public final Boolean c() {
        return this.f81228h;
    }

    public final Boolean d() {
        return this.f81225e;
    }

    public final Boolean e() {
        return this.f81227g;
    }

    public final Boolean f() {
        return this.f81224d;
    }

    public final Boolean g() {
        return this.f81222b;
    }

    public final Integer h() {
        return this.f81229i;
    }

    public final boolean i() {
        return (this.f81221a == null && this.f81222b == null && this.f81223c == null && this.f81224d == null && this.f81225e == null && this.f81226f == null && this.f81227g == null && this.f81228h == null && this.f81229i == null && this.f81230j == null) ? false : true;
    }

    public final Boolean j() {
        return this.f81223c;
    }

    public /* synthetic */ h(int i11) {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public h(Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Integer num2, Boolean bool8) {
        this.f81221a = num;
        this.f81222b = bool;
        this.f81223c = bool2;
        this.f81224d = bool3;
        this.f81225e = bool4;
        this.f81226f = bool5;
        this.f81227g = bool6;
        this.f81228h = bool7;
        this.f81229i = num2;
        this.f81230j = bool8;
    }
}
