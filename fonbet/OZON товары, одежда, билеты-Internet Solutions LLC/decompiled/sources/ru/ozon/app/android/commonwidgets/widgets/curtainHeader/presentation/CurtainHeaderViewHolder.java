package ru.ozon.app.android.commonwidgets.widgets.curtainHeader.presentation;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.uni.android.component.sheet.SheetDialog;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainHeader/presentation/CurtainHeaderViewHolder;", "Ld20/b;", "Lru/ozon/app/android/commonwidgets/widgets/curtainHeader/presentation/CurtainHeaderVO;", "Ll10/i;", "container", "<init>", "(Ll10/i;)V", "item", "", "bind", "(Lru/ozon/app/android/commonwidgets/widgets/curtainHeader/presentation/CurtainHeaderVO;)V", "Ll10/i;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CurtainHeaderViewHolder extends AbstractC6065b<CurtainHeaderVO> {

    @NotNull
    private final i container;
    private final View metricView;

    public CurtainHeaderViewHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull CurtainHeaderVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ComponentCallbacksC5392m c11 = this.container.Q().c();
        ComponentCallbacksC5392m parentFragment = c11 != null ? c11.getParentFragment() : null;
        if (parentFragment instanceof BottomSheetComposerFragment) {
            Dialog dialog = ((BottomSheetComposerFragment) parentFragment).getDialog();
            if (dialog instanceof SheetDialog) {
                SheetDialog sheetDialog = (SheetDialog) dialog;
                sheetDialog.setNavBarTitle(item.getText());
                sheetDialog.setNavBarTitleColor(item.getTextColor());
            }
        }
    }
}
