package ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionText;

import WZ.l;
import WZ.m;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.android.atom.text.expandable.ExpandableTextAtomView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SelectionItemDescriptionTextVH$bind$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ DescriptionTextVO $item;
    final /* synthetic */ ExpandableTextAtomView $this_with;
    final /* synthetic */ SelectionItemDescriptionTextVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionItemDescriptionTextVH$bind$1$1(ExpandableTextAtomView expandableTextAtomView, DescriptionTextVO descriptionTextVO, SelectionItemDescriptionTextVH selectionItemDescriptionTextVH) {
        super(0);
        this.$this_with = expandableTextAtomView;
        this.$item = descriptionTextVO;
        this.this$0 = selectionItemDescriptionTextVH;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ComposerReferences refs;
        t clickEvent;
        l lVar;
        if (this.$this_with.getIsExpanded() && (clickEvent = this.$item.getClickEvent()) != null) {
            lVar = this.this$0.tokenizedAnalytics;
            m.a(lVar, clickEvent, null);
        }
        this.$this_with.setExpanded(true);
        refs = this.this$0.getRefs();
        refs.getController().update(new DescriptionTextUpdate(true));
    }
}
