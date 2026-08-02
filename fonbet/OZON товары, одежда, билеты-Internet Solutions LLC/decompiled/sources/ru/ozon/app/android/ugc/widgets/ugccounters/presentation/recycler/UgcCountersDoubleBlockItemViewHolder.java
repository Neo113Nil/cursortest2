package ru.ozon.app.android.ugc.widgets.ugccounters.presentation.recycler;

import ED.a;
import WZ.t;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.ugc.databinding.ItemUgcDoubleBlockBinding;
import ru.ozon.app.android.ugc.databinding.ItemUgcSingleBlockBinding;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders.UgcCountersSingleBlockItemBinder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\"\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/recycler/UgcCountersDoubleBlockItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/binders/UgcCountersSingleBlockItemBinder;", "Lru/ozon/app/android/ugc/databinding/ItemUgcDoubleBlockBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/t;", "onBlockInVisibleBounds", "<init>", "(Lru/ozon/app/android/ugc/databinding/ItemUgcDoubleBlockBinding;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onViewInVisibleBounds", "()V", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Double;", "block", "", "widgetBackgroundColor", "bind", "(Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Double;Ljava/lang/String;)V", "Lru/ozon/app/android/ugc/databinding/ItemUgcDoubleBlockBinding;", "Lkotlin/jvm/functions/Function1;", "item", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Double;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UgcCountersDoubleBlockItemViewHolder extends j implements UgcCountersSingleBlockItemBinder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemUgcDoubleBlockBinding binding;
    private UgcCountersVO.Block.Double item;

    @NotNull
    private final Function1<t, Unit> onBlockInVisibleBounds;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/recycler/UgcCountersDoubleBlockItemViewHolder$Companion;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/t;", "onBlockInVisibleBounds", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/recycler/UgcCountersDoubleBlockItemViewHolder;", "createViewHolder", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/recycler/UgcCountersDoubleBlockItemViewHolder;", "Lru/ozon/app/android/ugc/databinding/ItemUgcDoubleBlockBinding;", "createItemUgcDoubleBlockBinding", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/ugc/databinding/ItemUgcDoubleBlockBinding;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ItemUgcDoubleBlockBinding createItemUgcDoubleBlockBinding(@NotNull ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            ItemUgcDoubleBlockBinding inflate = ItemUgcDoubleBlockBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            inflate.ugcDoubleBlockFirstInclude.ugcBlockTitleTav.setTextIsSelectable(false);
            inflate.ugcDoubleBlockFirstInclude.ugcBlockSubtitleTav.setTextIsSelectable(false);
            inflate.ugcDoubleBlockSecondInclude.ugcBlockTitleTav.setTextIsSelectable(false);
            inflate.ugcDoubleBlockSecondInclude.ugcBlockSubtitleTav.setTextIsSelectable(false);
            return inflate;
        }

        @NotNull
        public final UgcCountersDoubleBlockItemViewHolder createViewHolder(@NotNull ViewGroup parent, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super t, Unit> onBlockInVisibleBounds) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            Intrinsics.checkNotNullParameter(onBlockInVisibleBounds, "onBlockInVisibleBounds");
            return new UgcCountersDoubleBlockItemViewHolder(createItemUgcDoubleBlockBinding(parent), actionHandler, onBlockInVisibleBounds);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UgcCountersDoubleBlockItemViewHolder(@NotNull ItemUgcDoubleBlockBinding binding, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super t, Unit> onBlockInVisibleBounds) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onBlockInVisibleBounds, "onBlockInVisibleBounds");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.actionHandler = actionHandler;
        this.onBlockInVisibleBounds = onBlockInVisibleBounds;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$4$lambda$1$lambda$0(UgcCountersDoubleBlockItemViewHolder ugcCountersDoubleBlockItemViewHolder, UgcCountersVO.Block.Single single, View view) {
        ugcCountersDoubleBlockItemViewHolder.actionHandler.invoke(single.getAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$4$lambda$3$lambda$2(UgcCountersDoubleBlockItemViewHolder ugcCountersDoubleBlockItemViewHolder, UgcCountersVO.Block.Single single, View view) {
        ugcCountersDoubleBlockItemViewHolder.actionHandler.invoke(single.getAction());
    }

    public final void bind(@NotNull UgcCountersVO.Block.Double block, @NotNull String widgetBackgroundColor) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(widgetBackgroundColor, "widgetBackgroundColor");
        ItemUgcDoubleBlockBinding itemUgcDoubleBlockBinding = this.binding;
        this.item = block;
        UgcCountersVO.Block.Single firstBlock = block.getFirstBlock();
        ItemUgcSingleBlockBinding ugcDoubleBlockFirstInclude = itemUgcDoubleBlockBinding.ugcDoubleBlockFirstInclude;
        Intrinsics.checkNotNullExpressionValue(ugcDoubleBlockFirstInclude, "ugcDoubleBlockFirstInclude");
        UgcCountersSingleBlockItemBinder.DefaultImpls.bindSingleBlock$default(this, ugcDoubleBlockFirstInclude, firstBlock, 0.0f, 0.0f, firstBlock.getAction() != null ? new a(2, this, firstBlock) : null, 4, null);
        UgcCountersVO.Block.Single secondBlock = block.getSecondBlock();
        ItemUgcSingleBlockBinding ugcDoubleBlockSecondInclude = itemUgcDoubleBlockBinding.ugcDoubleBlockSecondInclude;
        Intrinsics.checkNotNullExpressionValue(ugcDoubleBlockSecondInclude, "ugcDoubleBlockSecondInclude");
        UgcCountersSingleBlockItemBinder.DefaultImpls.bindSingleBlock$default(this, ugcDoubleBlockSecondInclude, secondBlock, 0.0f, 0.0f, secondBlock.getAction() != null ? new EE.a(5, this, secondBlock) : null, 8, null);
        View view = itemUgcDoubleBlockBinding.ugcDoubleBlockSeparatorV;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackgroundColor(ContextExtKt.parseColor(context, widgetBackgroundColor));
    }

    @Override // ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders.UgcCountersSingleBlockItemBinder
    public void bindSingleBlock(@NotNull ItemUgcSingleBlockBinding itemUgcSingleBlockBinding, @NotNull UgcCountersVO.Block.Single single, float f7, float f11, View.OnClickListener onClickListener) {
        UgcCountersSingleBlockItemBinder.DefaultImpls.bindSingleBlock(this, itemUgcSingleBlockBinding, single, f7, f11, onClickListener);
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        UgcCountersVO.Block.Single secondBlock;
        UgcCountersVO.Block.Single firstBlock;
        super.onViewInVisibleBounds();
        Function1<t, Unit> function1 = this.onBlockInVisibleBounds;
        UgcCountersVO.Block.Double r12 = this.item;
        t tVar = null;
        function1.invoke((r12 == null || (firstBlock = r12.getFirstBlock()) == null) ? null : firstBlock.getTokenizedEvent());
        Function1<t, Unit> function12 = this.onBlockInVisibleBounds;
        UgcCountersVO.Block.Double r13 = this.item;
        if (r13 != null && (secondBlock = r13.getSecondBlock()) != null) {
            tVar = secondBlock.getTokenizedEvent();
        }
        function12.invoke(tVar);
    }
}
