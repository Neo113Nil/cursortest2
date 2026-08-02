package ru.ozon.fintech.base.bottom;

import android.view.View;
import androidx.annotation.NonNull;
import y2.s;

/* loaded from: classes3.dex */
final class c implements s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f94992a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BaseBottomSheetBehaviour f94993b;

    c(BaseBottomSheetBehaviour baseBottomSheetBehaviour, int i11) {
        this.f94993b = baseBottomSheetBehaviour;
        this.f94992a = i11;
    }

    @Override // y2.s
    public final boolean a(@NonNull View view) {
        this.f94993b.setState(this.f94992a);
        return true;
    }
}
