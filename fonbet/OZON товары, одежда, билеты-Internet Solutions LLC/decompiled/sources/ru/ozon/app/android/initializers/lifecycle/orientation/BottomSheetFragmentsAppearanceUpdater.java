package ru.ozon.app.android.initializers.lifecycle.orientation;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.google.android.material.bottomsheet.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.uikit.R$bool;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/initializers/lifecycle/orientation/BottomSheetFragmentsAppearanceUpdater;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/fragment/app/m;", "fragment", "", "changeFragmentAppearance", "(Landroidx/fragment/app/m;)V", "onFragmentStarted", "", "isTablet", "Z", "", "sheetWidth", "I", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BottomSheetFragmentsAppearanceUpdater {
    private final boolean isTablet;
    private final int sheetWidth;

    public BottomSheetFragmentsAppearanceUpdater(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.isTablet = context.getResources().getBoolean(R$bool.isTablet);
        this.sheetWidth = ResourceExtKt.toPx(540);
    }

    private final void changeFragmentAppearance(ComponentCallbacksC5392m fragment) {
        b bVar;
        Dialog dialog;
        Window window;
        if (!(fragment instanceof b) || (dialog = (bVar = (b) fragment).getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        Dialog dialog2 = bVar.getDialog();
        View findViewById = dialog2 != null ? dialog2.findViewById(R.id.design_bottom_sheet) : null;
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.width = this.sheetWidth;
            findViewById.setLayoutParams(layoutParams);
        }
    }

    public final void onFragmentStarted(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (this.isTablet) {
            changeFragmentAppearance(fragment);
        }
    }
}
