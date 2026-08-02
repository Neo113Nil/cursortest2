package ru.ozon.fintech.base.bottom;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.C5305a;
import y2.q;

/* loaded from: classes3.dex */
final class e extends C5305a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f94995a;

    e(g gVar) {
        this.f94995a = gVar;
    }

    @Override // androidx.core.view.C5305a
    public final void onInitializeAccessibilityNodeInfo(View view, @NonNull q qVar) {
        super.onInitializeAccessibilityNodeInfo(view, qVar);
        if (!this.f94995a.f95001f) {
            qVar.Q(false);
        } else {
            qVar.a(1048576);
            qVar.Q(true);
        }
    }

    @Override // androidx.core.view.C5305a
    public final boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
        if (i11 == 1048576) {
            g gVar = this.f94995a;
            if (gVar.f95001f) {
                gVar.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i11, bundle);
    }
}
