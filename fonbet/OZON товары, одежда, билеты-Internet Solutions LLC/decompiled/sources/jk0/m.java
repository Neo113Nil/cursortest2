package jk0;

import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.RecyclerView;
import jk0.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class m<T extends j> extends f<T> {

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f70179d;

    @Override // jk0.f
    public final void d(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.d(recyclerView);
        this.f70179d = recyclerView;
    }

    @Override // jk0.f
    public final void e(@NotNull AbstractC5434v.b state, @NotNull AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(event, "event");
        super.e(state, event);
        RecyclerView recyclerView = this.f70179d;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                RecyclerView.C childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i11));
                j jVar = childViewHolder instanceof j ? (j) childViewHolder : null;
                if (jVar == null || event == AbstractC5434v.a.ON_CREATE || event == AbstractC5434v.a.ON_DESTROY) {
                    return;
                }
                jVar.setLifecycleState(state);
            }
        }
    }

    @Override // jk0.f
    public final void f(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.f(recyclerView);
        this.f70179d = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r0 == null) goto L9;
     */
    @Override // jk0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(@NotNull T holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.g(holder);
        AbstractC5434v.b b11 = b();
        if (b11 != null) {
            if (!b11.a(AbstractC5434v.b.STARTED)) {
                b11 = null;
            }
        }
        b11 = AbstractC5434v.b.CREATED;
        holder.setLifecycleState(b11);
    }

    @Override // jk0.f
    public final void h(@NotNull T holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.h(holder);
        holder.setLifecycleState(AbstractC5434v.b.DESTROYED);
    }

    @Override // jk0.f
    public final void i(@NotNull l info) {
        Intrinsics.checkNotNullParameter(info, "info");
    }
}
