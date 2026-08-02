package ru.ozon.app.android.regulardraw.deeplinkhandlers;

import a00.C4908c;
import a00.C4911f;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Metadata;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.uni.android.component.sheet.SheetDialog;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003¨\u0006\n"}, d2 = {"Lru/ozon/app/android/regulardraw/deeplinkhandlers/MorkovskModalMenuConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "Landroidx/fragment/app/m;", "fragment", "", "configModal", "(Landroidx/fragment/app/m;)V", "onComposerInitialized", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MorkovskModalMenuConfigurator extends ComposerScreenConfig.PageConfigurator {
    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ResourceType"})
    public final void configModal(ComponentCallbacksC5392m fragment) {
        ComponentCallbacksC5392m parentFragment = fragment.getParentFragment();
        if (parentFragment instanceof BottomSheetComposerFragment) {
            Dialog dialog = ((BottomSheetComposerFragment) parentFragment).getDialog();
            SheetDialog sheetDialog = dialog instanceof SheetDialog ? (SheetDialog) dialog : null;
            if (sheetDialog != null) {
                sheetDialog.setShowHandle(false);
                sheetDialog.setBackgroundColor(sheetDialog.getContext().getString(R$color.modal_bg_color));
            }
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        Context context;
        ConfiguratorReferences references;
        C4911f ownerContainer2;
        C4908c g10;
        AbstractC5434v lifecycle;
        ConfiguratorReferences references2 = getReferences();
        if (references2 == null || (ownerContainer = references2.getOwnerContainer()) == null || (c11 = ownerContainer.c()) == null || (context = c11.getContext()) == null || (references = getReferences()) == null || (ownerContainer2 = references.getOwnerContainer()) == null || (g10 = ownerContainer2.g()) == null || (lifecycle = g10.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(new MorkovskModalMenuConfigurator$onComposerInitialized$1(c11, context, this));
    }
}
