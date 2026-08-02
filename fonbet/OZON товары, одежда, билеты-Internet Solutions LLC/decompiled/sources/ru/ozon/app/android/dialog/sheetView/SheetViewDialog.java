package ru.ozon.app.android.dialog.sheetView;

import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.dialog.Dialog;
import ru.ozon.uni.android.component.sheet.SheetView;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/dialog/sheetView/SheetViewDialog;", "Lru/ozon/app/android/dialog/Dialog;", "Landroidx/fragment/app/r;", "activity", "Lru/ozon/uni/android/component/sheet/SheetView;", "sheetView", "<init>", "(Landroidx/fragment/app/r;Lru/ozon/uni/android/component/sheet/SheetView;)V", "", "show", "()V", "dismiss", "Landroidx/fragment/app/r;", "Lru/ozon/uni/android/component/sheet/SheetView;", "dialog_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SheetViewDialog implements Dialog {

    @NotNull
    private final r activity;

    @NotNull
    private final SheetView sheetView;

    public SheetViewDialog(@NotNull r activity, @NotNull SheetView sheetView) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(sheetView, "sheetView");
        this.activity = activity;
        this.sheetView = sheetView;
    }

    public void dismiss() {
        this.sheetView.dismiss();
    }

    @Override // ru.ozon.app.android.dialog.Dialog
    public void show() {
        G supportFragmentManager = this.activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        Q p11 = supportFragmentManager.p();
        p11.d(this.sheetView, "SheetViewDialog");
        p11.i();
    }
}
