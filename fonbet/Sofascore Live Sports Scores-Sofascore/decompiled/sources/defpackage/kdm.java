package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.n;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class kdm implements opl {
    public final RecyclerView a;
    public final vxl b;
    public boolean c;

    public kdm(@NotNull RecyclerView recyclerView) {
        recyclerView.getClass();
        this.a = recyclerView;
        n layoutManager = recyclerView.getLayoutManager();
        boolean z = layoutManager instanceof LinearLayoutManager;
        Integer num = null;
        if (!z && !(layoutManager instanceof StaggeredGridLayoutManager)) {
            a70.p("Recycler views with custom layout managers are not supported by this adapter out of the box.Try implementing and providing an explicit 'impl' parameter to the other c'tors, or otherwise create a custom adapter subclass of your own.");
            throw null;
        }
        if (z) {
            num = Integer.valueOf(((LinearLayoutManager) layoutManager).getOrientation());
        } else {
            StaggeredGridLayoutManager staggeredGridLayoutManager = layoutManager instanceof StaggeredGridLayoutManager ? (StaggeredGridLayoutManager) layoutManager : null;
            if (staggeredGridLayoutManager != null) {
                num = Integer.valueOf(staggeredGridLayoutManager.e);
            }
        }
        this.b = (num != null && num.intValue() == 0) ? new v1m(this) : new f5m(this);
    }

    public kdm(@NotNull RecyclerView recyclerView, @NotNull vxl vxlVar) {
        recyclerView.getClass();
        vxlVar.getClass();
        this.a = recyclerView;
        this.b = vxlVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kdm(@NotNull RecyclerView recyclerView, @NotNull bca bcaVar) {
        this(recyclerView);
        recyclerView.getClass();
        bcaVar.getClass();
        new eca(new xam(bcaVar, this)).f(this.a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kdm(@NotNull RecyclerView recyclerView, @NotNull vxl vxlVar, @NotNull bca bcaVar) {
        this(recyclerView, vxlVar);
        recyclerView.getClass();
        vxlVar.getClass();
        bcaVar.getClass();
        new eca(new xam(bcaVar, this)).f(this.a);
    }
}
