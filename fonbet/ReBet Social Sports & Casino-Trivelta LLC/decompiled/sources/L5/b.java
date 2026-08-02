package L5;

import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f7066e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public int f7068b;

    /* renamed from: c, reason: collision with root package name */
    public long f7069c;

    /* renamed from: a, reason: collision with root package name */
    public final Object f7067a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public String f7070d = "";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public ScreenshotContext a(long j10) {
        ScreenshotContext screenshotContext;
        synchronized (this.f7067a) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            int i10 = this.f7068b;
            screenshotContext = new ScreenshotContext(uuid, i10 / 20, i10 % 20, j10, false, 16, null);
            this.f7068b++;
            this.f7069c = j10;
            this.f7070d = screenshotContext.getScreenshotId();
        }
        return screenshotContext;
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f7067a) {
            z10 = this.f7068b > 0;
        }
        return z10;
    }

    public void c() {
        synchronized (this.f7067a) {
            this.f7068b = 0;
            Unit unit = Unit.INSTANCE;
        }
    }
}
