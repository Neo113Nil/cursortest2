package jk0;

import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import jk0.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class d<T extends j> extends RecyclerView.g<T> {

    @NotNull
    private J containerViewLifecycleOwner;
    private f<T> delegate;

    @NotNull
    private final h<T> lifecycleAdapterDelegateFactory;

    public d(J j11, h hVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, (i11 & 2) != 0 ? new h() : hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        f<T> a11 = this.lifecycleAdapterDelegateFactory.a(recyclerView.getLayoutManager(), this.containerViewLifecycleOwner, null);
        this.delegate = a11;
        a11.d(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        f<T> fVar = this.delegate;
        if (fVar != null) {
            fVar.f(recyclerView);
        } else {
            Intrinsics.n("delegate");
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewAttachedToWindow(@NotNull T holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        f<T> fVar = this.delegate;
        if (fVar != null) {
            fVar.g(holder);
        } else {
            Intrinsics.n("delegate");
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewDetachedFromWindow(@NotNull T holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        f<T> fVar = this.delegate;
        if (fVar != null) {
            fVar.h(holder);
        } else {
            Intrinsics.n("delegate");
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewRecycled(@NotNull T holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.onRecycle();
    }

    public d(@NotNull J containerViewLifecycleOwner, @NotNull h<T> lifecycleAdapterDelegateFactory) {
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        Intrinsics.checkNotNullParameter(lifecycleAdapterDelegateFactory, "lifecycleAdapterDelegateFactory");
        this.containerViewLifecycleOwner = containerViewLifecycleOwner;
        this.lifecycleAdapterDelegateFactory = lifecycleAdapterDelegateFactory;
    }
}
