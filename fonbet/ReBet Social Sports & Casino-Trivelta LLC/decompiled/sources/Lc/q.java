package Lc;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.swmansion.rnscreens.C3834z;
import com.swmansion.rnscreens.Y;
import com.swmansion.rnscreens.bottomsheet.SheetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class q {
    public static final boolean a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.isLaidOut() || view.getHeight() > 0 || view.getWidth() > 0;
    }

    public static final boolean b(C3834z c3834z) {
        Intrinsics.checkNotNullParameter(c3834z, "<this>");
        return c3834z.getStackPresentation() == C3834z.e.f42124d && c3834z.getSheetDetents().d() == 1 && c3834z.getSheetDetents().l() == -1.0d;
    }

    public static final boolean c(C3834z c3834z) {
        Intrinsics.checkNotNullParameter(c3834z, "<this>");
        return !c3834z.getSheetShouldOverflowTopInset() && e(c3834z);
    }

    public static final boolean d(C3834z c3834z) {
        Y a10;
        SheetDelegate sheetDelegate;
        Intrinsics.checkNotNullParameter(c3834z, "<this>");
        Fragment fragment = c3834z.getFragment();
        return ((fragment == null || (a10 = Nc.a.a(fragment)) == null || (sheetDelegate = a10.getSheetDelegate()) == null) ? c3834z.getSheetInitialDetentIndex() : sheetDelegate.getLastStableDetentIndex()) > c3834z.getSheetLargestUndimmedDetentIndex();
    }

    public static final boolean e(C3834z c3834z) {
        Intrinsics.checkNotNullParameter(c3834z, "<this>");
        return c3834z.getStackPresentation() == C3834z.e.f42124d;
    }
}
