package ru.ozon.fintech.base.bottom;

import android.view.View;

/* loaded from: classes3.dex */
final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f94988a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f94989b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BaseBottomSheetBehaviour f94990c;

    a(BaseBottomSheetBehaviour baseBottomSheetBehaviour, View view, int i11) {
        this.f94990c = baseBottomSheetBehaviour;
        this.f94988a = view;
        this.f94989b = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f94988a;
        this.f94990c.k(this.f94989b, view);
    }
}
