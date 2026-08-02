package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.holders;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.common.SelectedStateChangedEvent;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.toprightbuttons.TopRightButtonCheckBox;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "sku", "", "isSelected", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TopRightCheckBoxViewHolder$onAttach$1 extends AbstractC7737t implements Function2<Long, Boolean, Unit> {
    final /* synthetic */ TopRightCheckBoxViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TopRightCheckBoxViewHolder$onAttach$1(TopRightCheckBoxViewHolder topRightCheckBoxViewHolder) {
        super(2);
        this.this$0 = topRightCheckBoxViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Long l11, Boolean bool) {
        invoke(l11.longValue(), bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11, boolean z11) {
        TopRightButtonCheckBox topRightButtonCheckBox;
        ComposerReferences composerReferences;
        topRightButtonCheckBox = this.this$0.currentModel;
        if (topRightButtonCheckBox != null) {
            composerReferences = this.this$0.composerReferences;
            composerReferences.getController().update(new SelectedStateChangedEvent(j11, z11));
        }
    }
}
