package ru.ozon.app.android.storefront.core.socialAtoms.rightPanel;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bJ\u0014\u0010\u0012\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014R\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelListView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelListAdapter;", "rightPanelAdapter", "setRightPanelAdapter", "(Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelListAdapter;)V", "init", "", "rightPanelListAdapter", "bind", "items", "", "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemVO;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RightPanelListView extends RecyclerView {
    private RightPanelListAdapter rightPanelAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RightPanelListView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setRightPanelAdapter(RightPanelListAdapter rightPanelListAdapter) {
        setAdapter(rightPanelListAdapter);
        this.rightPanelAdapter = rightPanelListAdapter;
    }

    public final void bind(@NotNull List<RightPanelItemVO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        RightPanelListAdapter rightPanelListAdapter = this.rightPanelAdapter;
        if (rightPanelListAdapter != null) {
            rightPanelListAdapter.setup(items);
        }
    }

    public final void init(@NotNull RightPanelListAdapter rightPanelListAdapter) {
        Intrinsics.checkNotNullParameter(rightPanelListAdapter, "rightPanelListAdapter");
        setRightPanelAdapter(rightPanelListAdapter);
    }

    public /* synthetic */ RightPanelListView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RightPanelListView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutManager(new LinearLayoutManager(context) { // from class: ru.ozon.app.android.storefront.core.socialAtoms.rightPanel.RightPanelListView.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
            public boolean canScrollHorizontally() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
            public boolean canScrollVertically() {
                return false;
            }
        });
        setOverScrollMode(2);
        setClipToPadding(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        RecyclerView.l itemAnimator = getItemAnimator();
        Intrinsics.g(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((C) itemAnimator).setSupportsChangeAnimations(false);
    }
}
