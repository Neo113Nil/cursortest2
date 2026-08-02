package ru.ozon.app.android.dialog.sheetView;

import Fs.ViewOnClickListenerC3059a;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.dialog.Dialog;
import ru.ozon.app.android.dialog.DialogBuilder;
import ru.ozon.app.android.dialog.databinding.SheetViewDialogBinding;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.component.sheet.SheetMode;
import ru.ozon.uni.android.component.sheet.SheetView;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.controls.button.ButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J%\u0010\u001b\u001a\u00020\u000e*\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u000e*\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/dialog/sheetView/SheetViewDialogBuilder;", "Lru/ozon/app/android/dialog/DialogBuilder;", "Landroidx/fragment/app/r;", "activity", "<init>", "(Landroidx/fragment/app/r;)V", "Landroid/view/View;", "contentView", "Lru/ozon/uni/android/component/sheet/SheetView;", "createSheetView", "(Landroid/view/View;)Lru/ozon/uni/android/component/sheet/SheetView;", "Lru/ozon/app/android/dialog/databinding/SheetViewDialogBinding;", "Lru/ozon/app/android/dialog/sheetView/SheetViewDialog;", "dialog", "", "bind", "(Lru/ozon/app/android/dialog/databinding/SheetViewDialogBinding;Lru/ozon/app/android/dialog/sheetView/SheetViewDialog;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "bindTitle", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Ljava/lang/String;)V", "subtitle", "bindSubtitle", "Lru/ozon/uni/android/controls/button/ButtonView;", "Lru/ozon/app/android/dialog/DialogBuilder$Button;", "button", "bindOrGone", "(Lru/ozon/uni/android/controls/button/ButtonView;Lru/ozon/app/android/dialog/DialogBuilder$Button;Lru/ozon/app/android/dialog/sheetView/SheetViewDialog;)V", "focusVisibleButton", "(Lru/ozon/app/android/dialog/databinding/SheetViewDialogBinding;)V", "Lru/ozon/app/android/dialog/Dialog;", "build", "()Lru/ozon/app/android/dialog/Dialog;", "Landroidx/fragment/app/r;", "dialog_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SheetViewDialogBuilder extends DialogBuilder {

    @NotNull
    private final r activity;

    public SheetViewDialogBuilder(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
    }

    private final void bind(SheetViewDialogBinding sheetViewDialogBinding, SheetViewDialog sheetViewDialog) {
        boolean z11;
        TextAtomV2View textAtomV2View = sheetViewDialogBinding.titleTextAtomView;
        String title = getTitle();
        boolean z12 = true;
        if (title == null) {
            z11 = false;
        } else {
            Intrinsics.f(textAtomV2View);
            bindTitle(textAtomV2View, title);
            z11 = true;
        }
        textAtomV2View.setVisibility(z11 ? 0 : 8);
        TextAtomV2View textAtomV2View2 = sheetViewDialogBinding.subtitleTextAtomView;
        String subtitle = getSubtitle();
        if (subtitle == null) {
            z12 = false;
        } else {
            Intrinsics.f(textAtomV2View2);
            bindSubtitle(textAtomV2View2, subtitle);
        }
        textAtomV2View2.setVisibility(z12 ? 0 : 8);
        ButtonView submitButton = sheetViewDialogBinding.submitButton;
        Intrinsics.checkNotNullExpressionValue(submitButton, "submitButton");
        bindOrGone(submitButton, getSubmitButton(), sheetViewDialog);
        ButtonView cancelButton = sheetViewDialogBinding.cancelButton;
        Intrinsics.checkNotNullExpressionValue(cancelButton, "cancelButton");
        bindOrGone(cancelButton, getCancelButton(), sheetViewDialog);
        focusVisibleButton(sheetViewDialogBinding);
    }

    private final void bindOrGone(ButtonView buttonView, DialogBuilder.Button button, SheetViewDialog sheetViewDialog) {
        int i11;
        if (button == null) {
            i11 = 8;
        } else {
            ButtonHolderKt.bind$default(buttonView, new ButtonDTO(ButtonDTO.Preset.SIZE_600, button.getStyle(), null, new CommonAtomLabelDTO(OzonSpannableStringKt.toOzonSpannableString(button.getText()), null, null, null, null, null, null, false, null, 510, null), null, new CommonControlSettings(null, null, null, 7, null), 20, null), null, 2, null);
            buttonView.setOnClickListener(new ViewOnClickListenerC3059a(0, sheetViewDialog, button));
            i11 = 0;
        }
        buttonView.setVisibility(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindOrGone$lambda$3$lambda$2(SheetViewDialog sheetViewDialog, DialogBuilder.Button button, View view) {
        sheetViewDialog.dismiss();
        button.getOnClick().invoke();
    }

    private final void bindSubtitle(TextAtomV2View textAtomV2View, String str) {
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(str);
        boolean hasClickableSpan = OzonSpannableStringKt.hasClickableSpan(ozonSpannableString);
        TextHolderKt.bind$default(textAtomV2View, new TextDTO(ozonSpannableString, TextDTO.TextAlignment.LEADING, null, null, null, null, TextPreset.PARAGRAPH_COMPACT, null, UniColors.TEXT_SECONDARY.getToken(), Integer.MAX_VALUE, null, null, null, hasClickableSpan, null, null, null, null, null, 515260, null), null, 2, null);
    }

    private final void bindTitle(TextAtomV2View textAtomV2View, String str) {
        TextHolderKt.bind$default(textAtomV2View, new TextDTO(OzonSpannableStringKt.toOzonSpannableString(str), TextDTO.TextAlignment.LEADING, null, null, null, null, TextPreset.UI_H1, null, UniColors.TEXT_PRIMARY.getToken(), Integer.MAX_VALUE, null, null, null, false, null, null, null, null, null, 523452, null), null, 2, null);
    }

    private final SheetView createSheetView(View contentView) {
        return new SheetView(contentView, null, SheetMode.HUG_CONTENT, false, 2, null);
    }

    private final void focusVisibleButton(SheetViewDialogBinding sheetViewDialogBinding) {
        ButtonView submitButton = sheetViewDialogBinding.submitButton;
        Intrinsics.checkNotNullExpressionValue(submitButton, "submitButton");
        if (submitButton.getVisibility() == 0) {
            sheetViewDialogBinding.submitButton.requestFocus();
            return;
        }
        ButtonView cancelButton = sheetViewDialogBinding.cancelButton;
        Intrinsics.checkNotNullExpressionValue(cancelButton, "cancelButton");
        if (cancelButton.getVisibility() == 0) {
            sheetViewDialogBinding.cancelButton.requestFocus();
        }
    }

    @Override // ru.ozon.app.android.dialog.DialogBuilder
    @NotNull
    public Dialog build() {
        SheetViewDialogBinding inflate = SheetViewDialogBinding.inflate(this.activity.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        ConstraintLayout constraintLayout = inflate.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        SheetViewDialog sheetViewDialog = new SheetViewDialog(this.activity, createSheetView(constraintLayout));
        bind(inflate, sheetViewDialog);
        return sheetViewDialog;
    }
}
