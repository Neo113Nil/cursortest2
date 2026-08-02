package ru.ozon.app.android.favorites.ui.atomactionsheethandlers;

import W10.c;
import android.content.Intent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.AtomActionSheetHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.R$string;
import ru.ozon.app.android.uikit.dialog.AlertDialogFragment;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/ComparisonActionSheetHandler;", "Lru/ozon/app/android/action/sheet/AtomActionSheetHandler;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "handle", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handleAction", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "showConfirmDeleteDialog", "", "encodeData", "", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComparisonActionSheetHandler implements AtomActionSheetHandler {

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = ComposerReferences.$stable;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/ComparisonActionSheetHandler$Companion;", "", "<init>", "()V", "REQUEST_CODE_DELETE_COMPARISON_LIST", "", "ENCODED_DATA_TAG", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ComparisonActionSheetHandler(@NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(references, "references");
        this.references = references;
    }

    private final boolean handleAction(AtomAction.ComposerAction action) {
        if (AtomActionSheetHandler.SheetAction.INSTANCE.fromValue(action.getId()) != AtomActionSheetHandler.SheetAction.DELETE_COMPARISON_LIST) {
            return false;
        }
        Map<String, String> params = action.getParams();
        if (params == null) {
            return true;
        }
        Intrinsics.checkNotNullParameter(params, "<this>");
        showConfirmDeleteDialog((String) U.d(params, "encodeData"));
        return true;
    }

    private final void showConfirmDeleteDialog(String encodeData) {
        AlertDialogFragment.Companion companion = AlertDialogFragment.INSTANCE;
        int i11 = R$string.favorites_comparison_delete_list_alert_title_android;
        int i12 = R$string.favorites_comparison_delete_list_alert_message_android;
        AlertDialogFragment.Params params = new AlertDialogFragment.Params(Integer.valueOf(i12), null, Integer.valueOf(i11), null, R$string.favorites_comparison_delete_list_ok_android, null, Integer.valueOf(ru.ozon.app.android.uikit.R$string.common_button_cancel), 0, 170, null);
        Intent intent = new Intent();
        intent.putExtra("encodeData", encodeData);
        Unit unit = Unit.f71690a;
        AlertDialogFragment newInstanceForFragmentResult = companion.newInstanceForFragmentResult(params, intent);
        newInstanceForFragmentResult.setTargetFragment(this.references.getContainer().c(), 9022);
        newInstanceForFragmentResult.show(this.references.getContainer().k(), (String) null);
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public void clear() {
        AtomActionSheetHandler.DefaultImpls.clear(this);
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public boolean handle(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.ComposerAction) {
            return handleAction((AtomAction.ComposerAction) action);
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
