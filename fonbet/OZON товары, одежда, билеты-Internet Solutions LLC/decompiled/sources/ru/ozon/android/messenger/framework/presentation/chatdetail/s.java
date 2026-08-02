package ru.ozon.android.messenger.framework.presentation.chatdetail;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class s extends RecyclerView.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f89939a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ LinearLayoutManager f89940b;

    s(k kVar, LinearLayoutManager linearLayoutManager) {
        this.f89939a = kVar;
        this.f89940b = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i11) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i11 == 0) {
            this.f89939a.P(this.f89940b.onSaveInstanceState());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i11, int i12) {
        int i13;
        Function1 function1;
        int i14;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        k kVar = this.f89939a;
        if (i12 >= 0) {
            k.e(kVar, recyclerView);
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        Intrinsics.g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        i13 = kVar.f89909x;
        if (findFirstVisibleItemPosition == i13) {
            i14 = kVar.f89910y;
            if (findLastVisibleItemPosition == i14) {
                return;
            }
        }
        if (findFirstVisibleItemPosition == -1 || findLastVisibleItemPosition == -1) {
            return;
        }
        kVar.f89909x = findFirstVisibleItemPosition;
        kVar.f89910y = findLastVisibleItemPosition;
        List<ru.ozon.android.messenger.framework.presentation.models.q> subList = kVar.D().getCurrentList().subList(findFirstVisibleItemPosition, findLastVisibleItemPosition + 1);
        function1 = kVar.f89889d;
        function1.invoke(subList);
    }
}
