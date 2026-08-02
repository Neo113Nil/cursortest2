package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2;

import X4.a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\n\b\u0001\u0010\u0004 \u0001*\u00020\u00032\u00020\u00052\u00020\u0006B-\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00010\tj\b\u0012\u0004\u0012\u00028\u0001`\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000f0\tH\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0014\u001a\u00028\u00018\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "Item", "LX4/a;", "Binding", "Landroidx/recyclerview/widget/RecyclerView$C;", "", "Landroid/view/View;", "containerView", "Lkotlin/Function1;", "Lru/ozon/app/android/pdp/ui/configurators/base/Bind;", "bind", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "item", "", "(Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;)V", "getParandjaView", "()Landroid/view/View;", "bindingBlock", "binding", "(Lkotlin/jvm/functions/Function1;)V", "LX4/a;", "getBinding", "()LX4/a;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class VariantsViewHolder<Item extends AspectsCompactVO$Variant, Binding extends a> extends RecyclerView.C {

    @NotNull
    private final Binding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VariantsViewHolder(@NotNull View containerView, @NotNull Function1<? super View, ? extends Binding> bind) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(bind, "bind");
        this.binding = bind.invoke(containerView);
    }

    public abstract void bind(@NotNull Item item);

    protected final void binding(@NotNull Function1<? super Binding, Unit> bindingBlock) {
        Intrinsics.checkNotNullParameter(bindingBlock, "bindingBlock");
        bindingBlock.invoke(this.binding);
    }

    @NotNull
    protected final Binding getBinding() {
        return this.binding;
    }

    public View getParandjaView() {
        return this.itemView;
    }
}
