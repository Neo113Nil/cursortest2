package oj;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import gj.C6743a;
import kotlin.jvm.internal.Intrinsics;
import pj.C8938a;
import ru.ozon.tracker.sendEvent.ActionType;

/* renamed from: oj.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8745b extends BottomSheetBehavior.f {

    /* renamed from: a, reason: collision with root package name */
    private int f78407a = -1;

    C8745b() {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
    public final void onSlide(View bottomSheet, float f7) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
    public final void onStateChanged(View bottomSheet, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        if (i11 == 5 && ((i12 = this.f78407a) == 1 || i12 == 2)) {
            C6743a.b(ActionType.CLOSE.INSTANCE, null);
            int i13 = C8938a.f81237c;
            C8938a.b("Bottom sheet was closed by user action");
        }
        this.f78407a = i11;
    }
}
