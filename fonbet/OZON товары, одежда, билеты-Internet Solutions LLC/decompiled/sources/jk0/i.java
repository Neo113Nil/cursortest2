package jk0;

import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import jk0.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class i<T, VH extends j> extends androidx.recyclerview.widget.t<T, VH> {

    @NotNull
    private final J containerViewLifecycleOwner;
    private f<VH> lifecycleAdapterDelegate;

    @NotNull
    private final g<VH> lifecycleAdapterDelegateFactory;

    public i(i.d dVar, J j11, g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j11, (i11 & 4) != 0 ? new h() : gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        f<VH> a11 = this.lifecycleAdapterDelegateFactory.a(recyclerView.getLayoutManager(), this.containerViewLifecycleOwner, null);
        this.lifecycleAdapterDelegate = a11;
        a11.d(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        f<VH> fVar = this.lifecycleAdapterDelegate;
        if (fVar != null) {
            fVar.f(recyclerView);
        } else {
            Intrinsics.n("lifecycleAdapterDelegate");
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewAttachedToWindow(@NotNull VH holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow((i<T, VH>) holder);
        f<VH> fVar = this.lifecycleAdapterDelegate;
        if (fVar != null) {
            fVar.g(holder);
        } else {
            Intrinsics.n("lifecycleAdapterDelegate");
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewDetachedFromWindow(@NotNull VH holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow((i<T, VH>) holder);
        f<VH> fVar = this.lifecycleAdapterDelegate;
        if (fVar != null) {
            fVar.h(holder);
        } else {
            Intrinsics.n("lifecycleAdapterDelegate");
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewRecycled(@NotNull VH holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled((i<T, VH>) holder);
        if (this.lifecycleAdapterDelegate == null) {
            Intrinsics.n("lifecycleAdapterDelegate");
            throw null;
        }
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.onRecycle();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@NotNull i.d<T> diffCallback, @NotNull J containerViewLifecycleOwner, @NotNull g<VH> lifecycleAdapterDelegateFactory) {
        super(diffCallback);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        Intrinsics.checkNotNullParameter(lifecycleAdapterDelegateFactory, "lifecycleAdapterDelegateFactory");
        this.containerViewLifecycleOwner = containerViewLifecycleOwner;
        this.lifecycleAdapterDelegateFactory = lifecycleAdapterDelegateFactory;
    }
}
