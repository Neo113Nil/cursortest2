package C7;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: C7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1038b implements InterfaceC1052p {

    /* renamed from: f, reason: collision with root package name */
    public static final a f1260f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Executor f1261a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f1262b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f1263c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f1264d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f1265e;

    /* renamed from: C7.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C1038b(int i10) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2, new B(10, "FrescoIoBoundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(newFixedThreadPool, "newFixedThreadPool(...)");
        this.f1261a = newFixedThreadPool;
        ExecutorService newFixedThreadPool2 = Executors.newFixedThreadPool(i10, new B(10, "FrescoDecodeExecutor", true));
        Intrinsics.checkNotNullExpressionValue(newFixedThreadPool2, "newFixedThreadPool(...)");
        this.f1262b = newFixedThreadPool2;
        ExecutorService newFixedThreadPool3 = Executors.newFixedThreadPool(i10, new B(10, "FrescoBackgroundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(newFixedThreadPool3, "newFixedThreadPool(...)");
        this.f1263c = newFixedThreadPool3;
        ExecutorService newFixedThreadPool4 = Executors.newFixedThreadPool(1, new B(10, "FrescoLightWeightBackgroundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(newFixedThreadPool4, "newFixedThreadPool(...)");
        this.f1264d = newFixedThreadPool4;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(i10, new B(10, "FrescoBackgroundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(newScheduledThreadPool, "newScheduledThreadPool(...)");
        this.f1265e = newScheduledThreadPool;
    }

    @Override // C7.InterfaceC1052p
    public Executor a() {
        return this.f1264d;
    }

    @Override // C7.InterfaceC1052p
    public Executor b() {
        return this.f1261a;
    }

    @Override // C7.InterfaceC1052p
    public ScheduledExecutorService c() {
        return this.f1265e;
    }

    @Override // C7.InterfaceC1052p
    public Executor d() {
        return this.f1262b;
    }

    @Override // C7.InterfaceC1052p
    public Executor e() {
        return this.f1263c;
    }

    @Override // C7.InterfaceC1052p
    public Executor f() {
        return this.f1261a;
    }

    @Override // C7.InterfaceC1052p
    public Executor g() {
        return this.f1261a;
    }
}
