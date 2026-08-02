package hk0;

import android.view.ViewGroup;
import hk0.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lk0.InterfaceC7968a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class e<VH extends d<I>, I extends InterfaceC7968a> {
    private final Function1<VH, Unit> initializerBlock;

    public final void bindViewHolder(@NotNull VH holder, @NotNull I item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.bind(item);
        Function0<Unit> onBind$uikit_recycler_release = holder.getOnBind$uikit_recycler_release();
        if (onBind$uikit_recycler_release != null) {
            onBind$uikit_recycler_release.invoke();
        }
    }

    public abstract boolean canBind(int i11);

    public final VH createViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VH onCreateViewHolder = onCreateViewHolder(parent, i11);
        if (onCreateViewHolder == null) {
            return null;
        }
        Function1<VH, Unit> initializerBlock = getInitializerBlock();
        if (initializerBlock != null) {
            initializerBlock.invoke(onCreateViewHolder);
        }
        return onCreateViewHolder;
    }

    public Function1<VH, Unit> getInitializerBlock() {
        return this.initializerBlock;
    }

    protected abstract VH onCreateViewHolder(@NotNull ViewGroup viewGroup, int i11);

    public void onItemViewType(int i11, @NotNull I item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }
}
