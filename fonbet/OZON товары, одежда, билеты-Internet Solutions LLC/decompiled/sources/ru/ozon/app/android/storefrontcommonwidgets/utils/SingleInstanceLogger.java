package ru.ozon.app.android.storefrontcommonwidgets.utils;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.c;
import ru.ozon.android.ozonLogger.core.h;
import sj.a;
import sj.d;
import sj.e;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefrontcommonwidgets/utils/SingleInstanceLogger;", "", "<init>", "()V", "", "onInstanceCreated", "onInstanceDestroyed", "Lsj/d;", "ozonLogger", "Lsj/d;", "Ljava/util/concurrent/atomic/AtomicInteger;", "instanceCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "storefrontcommonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleInstanceLogger {

    @NotNull
    public static final SingleInstanceLogger INSTANCE = new SingleInstanceLogger();

    @NotNull
    private static final d ozonLogger = e.f98817f.q(new a("Storefront", "HomeInstanceCount", null));

    @NotNull
    private static final AtomicInteger instanceCount = new AtomicInteger(0);

    @NotNull
    private static final Handler handler = new Handler(Looper.getMainLooper());

    private SingleInstanceLogger() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onInstanceCreated$lambda$0() {
        if (instanceCount.get() > 1) {
            h.a.d(ozonLogger, c.WARNING, "Unexpected instance created", null, Boolean.FALSE, 4);
        }
    }

    public final void onInstanceCreated() {
        AtomicInteger atomicInteger = instanceCount;
        atomicInteger.incrementAndGet();
        if (atomicInteger.get() > 1) {
            handler.postDelayed(new UL.a(), 150L);
        }
    }

    public final void onInstanceDestroyed() {
        instanceCount.decrementAndGet();
    }
}
