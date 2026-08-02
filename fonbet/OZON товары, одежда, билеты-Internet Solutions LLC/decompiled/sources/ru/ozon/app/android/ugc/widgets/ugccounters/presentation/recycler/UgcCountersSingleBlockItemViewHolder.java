package ru.ozon.app.android.ugc.widgets.ugccounters.presentation.recycler;

import Lt.c;
import WZ.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.databinding.ItemUgcSingleBlockBinding;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders.UgcCountersSingleBlockItemBinder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\"\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/recycler/UgcCountersSingleBlockItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/binders/UgcCountersSingleBlockItemBinder;", "Lru/ozon/app/android/ugc/databinding/ItemUgcSingleBlockBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/t;", "onBlockInVisibleBounds", "<init>", "(Lru/ozon/app/android/ugc/databinding/ItemUgcSingleBlockBinding;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onViewInVisibleBounds", "()V", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Single;", "block", "bind", "(Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Single;)V", "Lru/ozon/app/android/ugc/databinding/ItemUgcSingleBlockBinding;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block;", "item", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UgcCountersSingleBlockItemViewHolder extends j implements UgcCountersSingleBlockItemBinder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemUgcSingleBlockBinding binding;
    private UgcCountersVO.Block item;

    @NotNull
    private final Function1<t, Unit> onBlockInVisibleBounds;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/recycler/UgcCountersSingleBlockItemViewHolder$Companion;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/t;", "onBlockInVisibleBounds", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/recycler/UgcCountersSingleBlockItemViewHolder;", "createViewHolder", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/recycler/UgcCountersSingleBlockItemViewHolder;", "Lru/ozon/app/android/ugc/databinding/ItemUgcSingleBlockBinding;", "createItemUgcSingleBlockBinding", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/ugc/databinding/ItemUgcSingleBlockBinding;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ItemUgcSingleBlockBinding createItemUgcSingleBlockBinding(@NotNull ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            ItemUgcSingleBlockBinding inflate = ItemUgcSingleBlockBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            inflate.ugcBlockTitleTav.setTextIsSelectable(false);
            inflate.ugcBlockSubtitleTav.setTextIsSelectable(false);
            return inflate;
        }

        @NotNull
        public final UgcCountersSingleBlockItemViewHolder createViewHolder(@NotNull ViewGroup parent, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super t, Unit> onBlockInVisibleBounds) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            Intrinsics.checkNotNullParameter(onBlockInVisibleBounds, "onBlockInVisibleBounds");
            return new UgcCountersSingleBlockItemViewHolder(createItemUgcSingleBlockBinding(parent), actionHandler, onBlockInVisibleBounds);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UgcCountersSingleBlockItemViewHolder(@NotNull ItemUgcSingleBlockBinding binding, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super t, Unit> onBlockInVisibleBounds) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onBlockInVisibleBounds, "onBlockInVisibleBounds");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.actionHandler = actionHandler;
        this.onBlockInVisibleBounds = onBlockInVisibleBounds;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1$lambda$0(UgcCountersSingleBlockItemViewHolder ugcCountersSingleBlockItemViewHolder, UgcCountersVO.Block.Single single, View view) {
        ugcCountersSingleBlockItemViewHolder.actionHandler.invoke(single.getAction());
    }

    public final void bind(@NotNull UgcCountersVO.Block.Single block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.item = block;
        UgcCountersSingleBlockItemBinder.DefaultImpls.bindSingleBlock$default(this, this.binding, block, 0.0f, 0.0f, block.getAction() != null ? new c(3, this, block) : null, 12, null);
    }

    @Override // ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders.UgcCountersSingleBlockItemBinder
    public void bindSingleBlock(@NotNull ItemUgcSingleBlockBinding itemUgcSingleBlockBinding, @NotNull UgcCountersVO.Block.Single single, float f7, float f11, View.OnClickListener onClickListener) {
        UgcCountersSingleBlockItemBinder.DefaultImpls.bindSingleBlock(this, itemUgcSingleBlockBinding, single, f7, f11, onClickListener);
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        Function1<t, Unit> function1 = this.onBlockInVisibleBounds;
        UgcCountersVO.Block block = this.item;
        function1.invoke(block != null ? block.getTokenizedEvent() : null);
    }
}
