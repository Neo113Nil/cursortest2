package ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation;

import W10.c;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.AtomActionSheetHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.R$string;
import ru.ozon.app.android.uikit.dialog.AlertDialogFragment;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/SplitActionSheetHandler;", "Lru/ozon/app/android/action/sheet/AtomActionSheetHandler;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "handle", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handleClick", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "showConfirmDeleteDialog", "", "deleteUrl", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SplitActionSheetHandler implements AtomActionSheetHandler {
    public static final int $stable = ComposerReferences.$stable;

    @NotNull
    private final ComposerReferences references;

    public SplitActionSheetHandler(@NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(references, "references");
        this.references = references;
    }

    private final boolean handleClick(AtomAction.Click action) {
        if (AtomActionSheetHandler.SheetAction.INSTANCE.fromValue(action.getId()) != AtomActionSheetHandler.SheetAction.REMOVE_SPLIT) {
            return false;
        }
        String link = action.getLink();
        if (link == null) {
            return true;
        }
        showConfirmDeleteDialog(link);
        return true;
    }

    private final void showConfirmDeleteDialog(String deleteUrl) {
        AlertDialogFragment.Companion companion = AlertDialogFragment.INSTANCE;
        int i11 = R$string.common_remove_split_alert_title_android;
        int i12 = R$string.common_remove_split_alert_message_android;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i13 = 0;
        AlertDialogFragment.Params params = new AlertDialogFragment.Params(Integer.valueOf(i12), str, Integer.valueOf(i11), str2, R$string.common_remove_split_alert_action_android, str3, Integer.valueOf(R$string.common_remove_split_alert_cancel_action_android), i13, 170, null);
        Intent intent = new Intent();
        intent.putExtra("EXTRA_DELETE_DEEPLINK", deleteUrl);
        Unit unit = Unit.f71690a;
        AlertDialogFragment newInstanceForFragmentResult = companion.newInstanceForFragmentResult(params, intent);
        newInstanceForFragmentResult.setTargetFragment(this.references.getContainer().c(), 9010);
        newInstanceForFragmentResult.show(this.references.getContainer().k(), (String) null);
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public void clear() {
        AtomActionSheetHandler.DefaultImpls.clear(this);
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public boolean handle(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.Click) {
            return handleClick((AtomAction.Click) action);
        }
        return false;
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public void onBind() {
        AtomActionSheetHandler.DefaultImpls.onBind(this);
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public void setTrackingData(@NotNull c cVar) {
        AtomActionSheetHandler.DefaultImpls.setTrackingData(this, cVar);
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public void setWidgetViewItem(l lVar) {
        AtomActionSheetHandler.DefaultImpls.setWidgetViewItem(this, lVar);
    }
}
