package f5;

import android.content.Context;
import d5.C6087b;
import i5.C7009b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: f5.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6437o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6423a f62749a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6425c f62750b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C6433k f62751c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C6435m f62752d;

    public C6437o(@NotNull Context context, @NotNull C7009b taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Context context2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context.applicationContext");
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        C6423a batteryChargingTracker = new C6423a(context2, taskExecutor);
        Context context3 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context.applicationContext");
        Intrinsics.checkNotNullParameter(context3, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        C6425c batteryNotLowTracker = new C6425c(context3, taskExecutor);
        Context context4 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context.applicationContext");
        int i11 = C6434l.f62747b;
        Intrinsics.checkNotNullParameter(context4, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        C6433k networkStateTracker = new C6433k(context4, taskExecutor);
        Context context5 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context.applicationContext");
        Intrinsics.checkNotNullParameter(context5, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        C6435m storageNotLowTracker = new C6435m(context5, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(networkStateTracker, "networkStateTracker");
        Intrinsics.checkNotNullParameter(storageNotLowTracker, "storageNotLowTracker");
        this.f62749a = batteryChargingTracker;
        this.f62750b = batteryNotLowTracker;
        this.f62751c = networkStateTracker;
        this.f62752d = storageNotLowTracker;
    }

    @NotNull
    public final AbstractC6430h<Boolean> a() {
        return this.f62749a;
    }

    @NotNull
    public final C6425c b() {
        return this.f62750b;
    }

    @NotNull
    public final AbstractC6430h<C6087b> c() {
        return this.f62751c;
    }

    @NotNull
    public final AbstractC6430h<Boolean> d() {
        return this.f62752d;
    }
}
