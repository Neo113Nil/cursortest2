package com.google.android.material.datepicker;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.C5305a;
import ru.ozon.app.android.R;

/* loaded from: classes9.dex */
final class j extends C5305a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f58263a;

    j(h hVar) {
        this.f58263a = hVar;
    }

    @Override // androidx.core.view.C5305a
    public final void onInitializeAccessibilityNodeInfo(View view, @NonNull y2.q qVar) {
        View view2;
        super.onInitializeAccessibilityNodeInfo(view, qVar);
        h hVar = this.f58263a;
        view2 = hVar.f58256k;
        qVar.X(view2.getVisibility() == 0 ? hVar.getString(R.string.mtrl_picker_toggle_to_year_selection) : hVar.getString(R.string.mtrl_picker_toggle_to_day_selection));
    }
}
