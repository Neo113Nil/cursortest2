package ru.ozon.app.android.fresh.main.widgets.orderTracking.adapter;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import jk0.b;
import jk0.k;
import jk0.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/orderTracking/adapter/OrderTrackingRVLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Ljk0/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ljk0/k;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnLayoutCompletedListener", "(Ljk0/k;)V", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "onLayoutCompleted", "(Landroidx/recyclerview/widget/RecyclerView$A;)V", "onLayoutCompletedListener", "Ljk0/k;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderTrackingRVLayoutManager extends LinearLayoutManager implements b {
    private k onLayoutCompletedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderTrackingRVLayoutManager(@NotNull Context context) {
        super(context, 0, false);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutCompleted(RecyclerView.A state) {
        super.onLayoutCompleted(state);
        k kVar = this.onLayoutCompletedListener;
        if (kVar != null) {
            ((u) kVar).a();
        }
    }

    @Override // jk0.b
    public void setOnLayoutCompletedListener(k listener) {
        this.onLayoutCompletedListener = listener;
    }
}
