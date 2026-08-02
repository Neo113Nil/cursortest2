package ru.ozon.app.android.travel.molecules.view.travelTab.v2.container.adapter;

import EI.a;
import android.view.View;
import fd.InterfaceC6511n;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.travelTab.v2.TravelTabVO;
import ru.ozon.app.android.travel.molecules.view.travelTab.v2.TravelTabView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R,\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/travelTab/v2/container/adapter/TravelTabViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/travel/molecules/view/travelTab/v2/TravelTabView;", "containerView", "Lkotlin/Function3;", "", "Lru/ozon/app/android/travel/molecules/view/travelTab/v2/TravelTabVO;", "Landroid/view/View;", "", "onTabClickListener", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction$ViewAction;", "viewActionHandler", "<init>", "(Lru/ozon/app/android/travel/molecules/view/travelTab/v2/TravelTabView;Lfd/n;Lkotlin/jvm/functions/Function1;)V", "onViewInVisibleBounds", "()V", "item", "bind", "(Lru/ozon/app/android/travel/molecules/view/travelTab/v2/TravelTabVO;)V", "Lru/ozon/app/android/travel/molecules/view/travelTab/v2/TravelTabView;", "Lfd/n;", "Lkotlin/jvm/functions/Function1;", "boundData", "Lru/ozon/app/android/travel/molecules/view/travelTab/v2/TravelTabVO;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelTabViewHolder extends j {
    private TravelTabVO boundData;

    @NotNull
    private final TravelTabView containerView;

    @NotNull
    private final InterfaceC6511n<Integer, TravelTabVO, View, Unit> onTabClickListener;

    @NotNull
    private final Function1<AtomAction.ViewAction, Unit> viewActionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TravelTabViewHolder(@NotNull TravelTabView containerView, @NotNull InterfaceC6511n<? super Integer, ? super TravelTabVO, ? super View, Unit> onTabClickListener, @NotNull Function1<? super AtomAction.ViewAction, Unit> viewActionHandler) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(onTabClickListener, "onTabClickListener");
        Intrinsics.checkNotNullParameter(viewActionHandler, "viewActionHandler");
        this.containerView = containerView;
        this.onTabClickListener = onTabClickListener;
        this.viewActionHandler = viewActionHandler;
        containerView.setOnClickListener(new a(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(TravelTabViewHolder travelTabViewHolder, View view) {
        TravelTabVO travelTabVO = travelTabViewHolder.boundData;
        if (travelTabVO == null) {
            return;
        }
        InterfaceC6511n<Integer, TravelTabVO, View, Unit> interfaceC6511n = travelTabViewHolder.onTabClickListener;
        Integer valueOf = Integer.valueOf(travelTabViewHolder.getAdapterPosition());
        View itemView = travelTabViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        interfaceC6511n.invoke(valueOf, travelTabVO, itemView);
    }

    public final void bind(@NotNull TravelTabVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.boundData = item;
        this.containerView.bind(item);
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        TravelTabVO travelTabVO = this.boundData;
        this.viewActionHandler.invoke(new AtomAction.ViewAction(travelTabVO != null ? travelTabVO.getTrackingInfo() : null, null, 2, null));
    }
}
