package ru.ozon.app.android.videocover;

import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.multiframebinder.ScrollStateListener;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/videocover/HorizontalScrollDelegate;", "", "Lru/ozon/app/android/composer/view/multiframebinder/ScrollStateListener;", "widgetsScrollStateListener", "<init>", "(Lru/ozon/app/android/composer/view/multiframebinder/ScrollStateListener;)V", "Lio/reactivex/p;", "", "subscribeOnHorizontalScroll", "()Lio/reactivex/p;", "", "dispose", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "rv", "attachToRv", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lru/ozon/app/android/composer/view/multiframebinder/ScrollStateListener;", "Lnc/b;", "disposable", "Lnc/b;", "getDisposable", "()Lnc/b;", "setDisposable", "(Lnc/b;)V", "videocover_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HorizontalScrollDelegate {
    private InterfaceC8487b disposable;

    @NotNull
    private final ScrollStateListener widgetsScrollStateListener;

    public HorizontalScrollDelegate(@NotNull ScrollStateListener widgetsScrollStateListener) {
        Intrinsics.checkNotNullParameter(widgetsScrollStateListener, "widgetsScrollStateListener");
        this.widgetsScrollStateListener = widgetsScrollStateListener;
    }

    public final void attachToRv(@NotNull RecyclerView rv) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        this.widgetsScrollStateListener.setOn(rv);
    }

    public final void dispose() {
        InterfaceC8487b interfaceC8487b = this.disposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }

    public final void setDisposable(InterfaceC8487b interfaceC8487b) {
        this.disposable = interfaceC8487b;
    }

    @NotNull
    public final p<Boolean> subscribeOnHorizontalScroll() {
        return this.widgetsScrollStateListener.getScrollingState();
    }

    public /* synthetic */ HorizontalScrollDelegate(ScrollStateListener scrollStateListener, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ScrollStateListener() : scrollStateListener);
    }
}
