package jk0;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import jk0.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: jk0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7435a<T extends j> extends f<T> {

    /* renamed from: d, reason: collision with root package name */
    private final M10.a f70161d;

    /* renamed from: e, reason: collision with root package name */
    private c f70162e;

    /* renamed from: f, reason: collision with root package name */
    private l f70163f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7435a(@NotNull J containerViewLifecycleOwner, M10.a aVar) {
        super(containerViewLifecycleOwner);
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        this.f70161d = aVar;
    }

    @Override // jk0.f
    public final void d(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.d(recyclerView);
        c cVar = new c(recyclerView, this.f70161d);
        this.f70162e = cVar;
        l lVar = this.f70163f;
        if (lVar != null) {
            cVar.l(lVar);
            this.f70163f = null;
        }
        boolean z11 = c() == AbstractC5434v.b.RESUMED;
        c cVar2 = this.f70162e;
        if (cVar2 != null) {
            cVar2.j(z11);
        } else {
            Intrinsics.n("visibilityTracker");
            throw null;
        }
    }

    @Override // jk0.f
    public final void e(@NotNull AbstractC5434v.b state, @NotNull AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(event, "event");
        super.e(state, event);
        c cVar = this.f70162e;
        if (cVar != null) {
            cVar.j(event == AbstractC5434v.a.ON_RESUME);
        }
    }

    @Override // jk0.f
    public final void f(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.f(recyclerView);
        c cVar = this.f70162e;
        if (cVar != null) {
            cVar.e();
        } else {
            Intrinsics.n("visibilityTracker");
            throw null;
        }
    }

    @Override // jk0.f
    public final void g(@NotNull T holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.setLifecycleState(AbstractC5434v.b.CREATED);
    }

    @Override // jk0.f
    public final void h(@NotNull T holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.setLifecycleState(AbstractC5434v.b.DESTROYED);
    }

    @Override // jk0.f
    public final void i(@NotNull l info) {
        Intrinsics.checkNotNullParameter(info, "info");
        c cVar = this.f70162e;
        if (cVar != null) {
            cVar.l(info);
        } else {
            this.f70163f = info;
        }
    }
}
