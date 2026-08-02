package ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.presentation.rv;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.presentation.HorizontalAutoScrollVO;
import ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.presentation.rv.HorizontalAutoScrollRV;

@Metadata(d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001 \b\u0001\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bJ#\u0010\u000f\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/rv/HorizontalAutoScrollRV;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/HorizontalAutoScrollVO$ImageItem;", "list", "", "restartAnimation", "submitList", "(Ljava/util/List;Z)V", "Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/rv/HorizontalAutoScrollRVAdapter;", "viewAdapter", "Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/rv/HorizontalAutoScrollRVAdapter;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "viewLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "", "scrollStep$delegate", "LSc/j;", "getScrollStep", "()I", "scrollStep", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "ru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/rv/HorizontalAutoScrollRV$scrollRunnable$1", "scrollRunnable", "Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/rv/HorizontalAutoScrollRV$scrollRunnable$1;", "Companion", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HorizontalAutoScrollRV extends RecyclerView {

    @NotNull
    private final Handler handler;

    @NotNull
    private final HorizontalAutoScrollRV$scrollRunnable$1 scrollRunnable;

    /* renamed from: scrollStep$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j scrollStep;

    @NotNull
    private final HorizontalAutoScrollRVAdapter viewAdapter;

    @NotNull
    private final LinearLayoutManager viewLayoutManager;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v4, types: [ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.presentation.rv.HorizontalAutoScrollRV$scrollRunnable$1] */
    public HorizontalAutoScrollRV(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        HorizontalAutoScrollRVAdapter horizontalAutoScrollRVAdapter = new HorizontalAutoScrollRVAdapter();
        this.viewAdapter = horizontalAutoScrollRVAdapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.viewLayoutManager = linearLayoutManager;
        this.scrollStep = k.b(HorizontalAutoScrollRV$scrollStep$2.INSTANCE);
        this.handler = new Handler(Looper.getMainLooper());
        this.scrollRunnable = new Runnable() { // from class: ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.presentation.rv.HorizontalAutoScrollRV$scrollRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                int scrollStep;
                Handler handler;
                HorizontalAutoScrollRV horizontalAutoScrollRV = HorizontalAutoScrollRV.this;
                scrollStep = horizontalAutoScrollRV.getScrollStep();
                horizontalAutoScrollRV.scrollBy(scrollStep, 0);
                handler = HorizontalAutoScrollRV.this.handler;
                handler.postDelayed(this, 16L);
            }
        };
        setItemAnimator(null);
        setLayoutManager(linearLayoutManager);
        setAdapter(horizontalAutoScrollRVAdapter);
        addItemDecoration(HorizontalAutoScrollRVDecoration.INSTANCE);
        addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.presentation.rv.HorizontalAutoScrollRV.1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (HorizontalAutoScrollRV.this.viewLayoutManager.findLastCompletelyVisibleItemPosition() == HorizontalAutoScrollRV.this.viewLayoutManager.getItemCount() - 1) {
                    HorizontalAutoScrollRV.this.scrollToPosition(0);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getScrollStep() {
        return ((Number) this.scrollStep.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitList$lambda$0(boolean z11, HorizontalAutoScrollRV horizontalAutoScrollRV) {
        if (z11) {
            horizontalAutoScrollRV.scrollToPosition(0);
            horizontalAutoScrollRV.handler.postDelayed(horizontalAutoScrollRV.scrollRunnable, 16L);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.handler.postDelayed(this.scrollRunnable, 16L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.handler.removeCallbacks(this.scrollRunnable);
    }

    public final void submitList(@NotNull List<HorizontalAutoScrollVO.ImageItem> list, final boolean restartAnimation) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (restartAnimation) {
            this.handler.removeCallbacks(this.scrollRunnable);
        }
        this.viewAdapter.submitList(list, new Runnable() { // from class: yK.a
            @Override // java.lang.Runnable
            public final void run() {
                HorizontalAutoScrollRV.submitList$lambda$0(restartAnimation, this);
            }
        });
    }
}
