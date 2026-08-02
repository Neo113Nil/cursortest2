package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class p extends RecyclerView.t implements u {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ u f91259a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DOWN;
        public static final a UP;

        static {
            a aVar = new a("UP", 0);
            UP = aVar;
            a aVar2 = new a("DOWN", 1);
            DOWN = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public p(@NotNull u paginationController) {
        Intrinsics.checkNotNullParameter(paginationController, "paginationController");
        this.f91259a = paginationController;
    }

    private final void a(RecyclerView recyclerView, a aVar) {
        u uVar = this.f91259a;
        if (uVar.Y()) {
            return;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (aVar == a.DOWN && uVar.S()) {
            if (linearLayoutManager.getItemCount() - linearLayoutManager.findLastVisibleItemPosition() <= 15) {
                H();
            }
        } else if (aVar == a.UP && uVar.A() && findFirstVisibleItemPosition <= 15) {
            G();
        }
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final boolean A() {
        return this.f91259a.A();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final void G() {
        this.f91259a.G();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final void H() {
        this.f91259a.H();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final boolean S() {
        return this.f91259a.S();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final boolean Y() {
        return this.f91259a.Y();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i11) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i11);
        if (!recyclerView.canScrollVertically(-1)) {
            a(recyclerView, a.UP);
        } else {
            if (recyclerView.canScrollVertically(1)) {
                return;
            }
            a(recyclerView, a.DOWN);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(@NotNull RecyclerView rv, int i11, int i12) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        if (i12 == 0) {
            return;
        }
        a(rv, i12 > 0 ? a.DOWN : a.UP);
    }
}
