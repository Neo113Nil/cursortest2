package com.google.android.material.datepicker;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes9.dex */
final class k extends RecyclerView.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f58264a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MaterialButton f58265b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f58266c;

    k(h hVar, x xVar, MaterialButton materialButton) {
        this.f58266c = hVar;
        this.f58264a = xVar;
        this.f58265b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i11) {
        if (i11 == 0) {
            recyclerView.announceForAccessibility(this.f58265b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(@NonNull RecyclerView recyclerView, int i11, int i12) {
        h hVar = this.f58266c;
        int findFirstVisibleItemPosition = i11 < 0 ? hVar.F().findFirstVisibleItemPosition() : hVar.F().findLastVisibleItemPosition();
        x xVar = this.f58264a;
        hVar.f58250e = xVar.g(findFirstVisibleItemPosition);
        this.f58265b.setText(xVar.g(findFirstVisibleItemPosition).h());
    }
}
