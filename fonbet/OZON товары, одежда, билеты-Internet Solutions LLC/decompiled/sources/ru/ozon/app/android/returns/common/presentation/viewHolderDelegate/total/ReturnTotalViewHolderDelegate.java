package ru.ozon.app.android.returns.common.presentation.viewHolderDelegate.total;

import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import hk0.C6969b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolderDelegate;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolderKt;
import ru.ozon.app.android.returns.common.presentation.viewHolderDelegate.total.adapter.PhotosAdapter;
import ru.ozon.app.android.returns.common.presentation.viewHolderDelegate.total.adapter.PhotosDecoration;
import ru.ozon.app.android.returns.common.presentation.viewObject.ReturnTotalVO;
import ru.ozon.app.android.returns.details.presentation.viewHolder.decoration.AmountDetailingDecoration;
import ru.ozon.app.android.returns.list.presentation.views.ReturnTotalView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/common/presentation/viewHolderDelegate/total/ReturnTotalViewHolderDelegate;", "", "Lru/ozon/app/android/returns/list/presentation/views/ReturnTotalView;", "totalView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function0;", "onTotalClick", "Landroidx/recyclerview/widget/RecyclerView$n;", "photosDecoration", "amountDetailingDecoration", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lru/ozon/app/android/returns/list/presentation/views/ReturnTotalView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/recyclerview/widget/RecyclerView$n;Landroidx/recyclerview/widget/RecyclerView$n;Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/returns/common/presentation/viewObject/ReturnTotalVO;", "item", "bind", "(Lru/ozon/app/android/returns/common/presentation/viewObject/ReturnTotalVO;)V", "Lru/ozon/app/android/returns/list/presentation/views/ReturnTotalView;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/returns/common/presentation/viewHolderDelegate/total/adapter/PhotosAdapter;", "photosAdapter", "Lru/ozon/app/android/returns/common/presentation/viewHolderDelegate/total/adapter/PhotosAdapter;", "Lhk0/b;", "Lru/ozon/app/android/uikit/recycler/ItemListAdapter;", "totalAdapter", "Lhk0/b;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnTotalViewHolderDelegate {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final PhotosAdapter photosAdapter;

    @NotNull
    private final C6969b totalAdapter;

    @NotNull
    private final ReturnTotalView totalView;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.returns.common.presentation.viewHolderDelegate.total.ReturnTotalViewHolderDelegate$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReturnTotalViewHolderDelegate(@NotNull ReturnTotalView totalView, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function0<Unit> onTotalClick, @NotNull RecyclerView.n photosDecoration, @NotNull RecyclerView.n amountDetailingDecoration, @NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(totalView, "totalView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onTotalClick, "onTotalClick");
        Intrinsics.checkNotNullParameter(photosDecoration, "photosDecoration");
        Intrinsics.checkNotNullParameter(amountDetailingDecoration, "amountDetailingDecoration");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.totalView = totalView;
        this.actionHandler = actionHandler;
        PhotosAdapter photosAdapter = new PhotosAdapter(lifecycleOwner, actionHandler);
        this.photosAdapter = photosAdapter;
        totalView.getPhotosRecyclerView().setAdapter(photosAdapter);
        totalView.getPhotosRecyclerView().addItemDecoration(photosDecoration);
        totalView.getPhotosRecyclerView().setItemAnimator(null);
        totalView.getTotalTableRecyclerView().addItemDecoration(amountDetailingDecoration);
        C6969b c6969b = new C6969b(new AtomItemViewHolderDelegate(new ReturnTotalViewHolderDelegate$atomItemViewHolderDelegate$1(onTotalClick), null, null, 6, null));
        this.totalAdapter = c6969b;
        totalView.getTotalTableRecyclerView().setAdapter(c6969b);
    }

    public final void bind(ReturnTotalVO item) {
        this.totalView.setVisibility(item != null ? 0 : 8);
        if (item == null) {
            return;
        }
        List<ReturnTotalVO.ItemPhoto> itemPhotos = item.getItemPhotos();
        if (itemPhotos != null) {
            this.photosAdapter.setItems(itemPhotos);
        }
        this.totalAdapter.submitList(item.getAmountDetailing());
        DisclaimerHolderKt.bindOrGone(this.totalView.getDisclaimerContainer(), item.getDisclaimer(), this.actionHandler);
    }

    public /* synthetic */ ReturnTotalViewHolderDelegate(ReturnTotalView returnTotalView, Function1 function1, Function0 function0, RecyclerView.n nVar, RecyclerView.n nVar2, J j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(returnTotalView, function1, (i11 & 4) != 0 ? AnonymousClass1.INSTANCE : function0, (i11 & 8) != 0 ? new PhotosDecoration() : nVar, (i11 & 16) != 0 ? new AmountDetailingDecoration() : nVar2, j11);
    }
}
