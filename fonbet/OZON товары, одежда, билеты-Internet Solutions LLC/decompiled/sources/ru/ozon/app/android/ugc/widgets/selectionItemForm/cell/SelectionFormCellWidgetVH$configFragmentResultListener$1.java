package ru.ozon.app.android.ugc.widgets.selectionItemForm.cell;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.actionHandlers.ugc.updateCellSelectionFormMobile.data.SelectionFormCellDTO;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<unused var>", "", "bundle", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SelectionFormCellWidgetVH$configFragmentResultListener$1 extends AbstractC7737t implements Function2<String, Bundle, Unit> {
    final /* synthetic */ SelectionFormCellWidgetVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionFormCellWidgetVH$configFragmentResultListener$1(SelectionFormCellWidgetVH selectionFormCellWidgetVH) {
        super(2);
        this.this$0 = selectionFormCellWidgetVH;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Bundle bundle) {
        invoke2(str, bundle);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, Bundle bundle) {
        Parcelable parcelable;
        ComposerReferences composerReferences;
        Object parcelable2;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("CELL_SELECTION_FORM_ITEM_ID", SelectionFormCellDTO.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            parcelable = bundle.getParcelable("CELL_SELECTION_FORM_ITEM_ID");
        }
        SelectionFormCellDTO selectionFormCellDTO = (SelectionFormCellDTO) parcelable;
        if (selectionFormCellDTO != null) {
            composerReferences = this.this$0.refs;
            composerReferences.getController().update(new SelectionFormPlatformUpdateKey(selectionFormCellDTO));
        }
    }
}
