package ru.ozon.app.android.ugc.widgets.selectionItemForm.cellSelector;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.android.atom.selectionControls.ToggleView;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<unused var>", "Lru/ozon/uni/android/atom/selectionControls/ToggleView;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SelectionFormCellSelectorWidgetVH$changeStateListener$1 extends AbstractC7737t implements Function2<ToggleView, Boolean, Unit> {
    final /* synthetic */ SelectionFormCellSelectorWidgetVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionFormCellSelectorWidgetVH$changeStateListener$1(SelectionFormCellSelectorWidgetVH selectionFormCellSelectorWidgetVH) {
        super(2);
        this.this$0 = selectionFormCellSelectorWidgetVH;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ToggleView toggleView, Boolean bool) {
        invoke(toggleView, bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(ToggleView toggleView, boolean z11) {
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(toggleView, "<unused var>");
        SelectionFormCellSelectorVO boundData = this.this$0.getBoundData();
        if (boundData != null) {
            long id2 = boundData.getId();
            composerReferences = this.this$0.refs;
            composerReferences.getController().update(new SelectionFormCellSelectorUpdateKey(id2));
        }
    }
}
