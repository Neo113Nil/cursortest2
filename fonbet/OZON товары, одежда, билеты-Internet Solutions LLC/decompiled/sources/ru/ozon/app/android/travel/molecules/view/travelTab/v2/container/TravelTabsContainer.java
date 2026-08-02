package ru.ozon.app.android.travel.molecules.view.travelTab.v2.container;

import L2.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.travelTab.v2.TravelTabVO;
import ru.ozon.app.android.travel.molecules.view.travelTab.v2.container.adapter.TravelTabsAdapter;
import ru.ozon.app.android.travel.molecules.view.travelTab.v2.container.adapter.TravelTabsDecoration;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0018\u001a\u00020\u000f2\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u0012j\u0002`\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R*\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0012j\u0004\u0018\u0001`\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/molecules/view/travelTab/v2/container/TravelTabsContainer;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "position", "Lru/ozon/app/android/travel/molecules/view/travelTab/v2/TravelTabVO;", "item", "Landroid/view/View;", "view", "", "onTabClicked", "(ILru/ozon/app/android/travel/molecules/view/travelTab/v2/TravelTabVO;Landroid/view/View;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "onAction", "Landroidx/lifecycle/J;", "lifecycleOwner", "setupAdapter", "(Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/J;)V", "", "data", "submitData", "(Ljava/util/List;)V", "Lru/ozon/app/android/travel/molecules/view/travelTab/v2/container/adapter/TravelTabsAdapter;", "tabsAdapter", "Lru/ozon/app/android/travel/molecules/view/travelTab/v2/container/adapter/TravelTabsAdapter;", "Lkotlin/jvm/functions/Function1;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelTabsContainer extends RecyclerView {
    public static final int $stable = 8;
    private Function1<? super AtomAction, Unit> onAction;
    private TravelTabsAdapter tabsAdapter;

    public /* synthetic */ TravelTabsContainer(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTabClicked(int position, TravelTabVO item, View view) {
        Function1<? super AtomAction, Unit> function1;
        RecyclerView.o layoutManager = getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        if (!layoutManager.isViewPartiallyVisible(view, true, true)) {
            smoothScrollToPosition(position);
            return;
        }
        AtomAction action = item.getAction();
        if (action == null || (function1 = this.onAction) == null) {
            return;
        }
        function1.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitData$lambda$3(List list, TravelTabsContainer travelTabsContainer) {
        Iterator it = list.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (((TravelTabVO) it.next()).getIsSelected()) {
                break;
            } else {
                i11++;
            }
        }
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            travelTabsContainer.smoothScrollToPosition(valueOf.intValue());
        }
    }

    public final void setupAdapter(@NotNull Function1<? super AtomAction, Unit> onAction, @NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        TravelTabsAdapter travelTabsAdapter = new TravelTabsAdapter(new TravelTabsContainer$setupAdapter$1(this), onAction, lifecycleOwner);
        setAdapter(travelTabsAdapter);
        this.tabsAdapter = travelTabsAdapter;
        this.onAction = onAction;
    }

    public final void submitData(@NotNull List<TravelTabVO> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        TravelTabsAdapter travelTabsAdapter = this.tabsAdapter;
        if (travelTabsAdapter != null) {
            travelTabsAdapter.submitList(data, new b(3, data, this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelTabsContainer(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        addItemDecoration(new TravelTabsDecoration(context));
        setNestedScrollingEnabled(false);
    }
}
