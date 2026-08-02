package ru.ozon.app.android.commonwidgets.widgets.refresh;

import A00.e;
import Cm.RunnableC2781a;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import d20.AbstractC6065b;
import i10.h;
import i10.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/refresh/RefreshWidgetHolder;", "Ld20/b;", "Lru/ozon/app/android/commonwidgets/widgets/refresh/RefreshVO;", "Ll10/i;", "container", "<init>", "(Ll10/i;)V", "refreshVO", "", "scheduleRefresh", "(Lru/ozon/app/android/commonwidgets/widgets/refresh/RefreshVO;)V", "item", "bind", "onWidgetCreated", "()V", "onRefresh", "onWidgetDestroyed", "Ll10/i;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "refreshRunnable", "Ljava/lang/Runnable;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RefreshWidgetHolder extends AbstractC6065b<RefreshVO> {

    @NotNull
    private final i container;

    @NotNull
    private final Handler handler;
    private final View metricView;
    private Runnable refreshRunnable;

    public RefreshWidgetHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
        this.handler = new Handler(Looper.getMainLooper());
    }

    private final void scheduleRefresh(RefreshVO refreshVO) {
        Runnable runnable = this.refreshRunnable;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
        }
        RunnableC2781a runnableC2781a = new RunnableC2781a(10, refreshVO, this);
        this.handler.postDelayed(runnableC2781a, refreshVO.getRefreshAfter());
        this.refreshRunnable = runnableC2781a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleRefresh$lambda$3(RefreshVO refreshVO, RefreshWidgetHolder refreshWidgetHolder) {
        if (refreshVO.getScrollPosition() != ScrollPosition.TOP) {
            InterfaceC7851b.a.e(refreshWidgetHolder.container.M(), refreshVO.getLink(), null, null, 6);
            return;
        }
        e.a aVar = new e.a();
        aVar.g(0);
        InterfaceC7851b.a.a(refreshWidgetHolder.container.M(), refreshVO.getLink(), null, null, new h.b(aVar.b(), new l.a.b(0L, null, 3)), 6);
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onRefresh() {
        RefreshVO boundData = getBoundData();
        if (boundData != null) {
            scheduleRefresh(boundData);
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        RefreshVO boundData = getBoundData();
        if (boundData != null) {
            scheduleRefresh(boundData);
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        Runnable runnable = this.refreshRunnable;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
        }
        this.refreshRunnable = null;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull RefreshVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        scheduleRefresh(item);
    }
}
