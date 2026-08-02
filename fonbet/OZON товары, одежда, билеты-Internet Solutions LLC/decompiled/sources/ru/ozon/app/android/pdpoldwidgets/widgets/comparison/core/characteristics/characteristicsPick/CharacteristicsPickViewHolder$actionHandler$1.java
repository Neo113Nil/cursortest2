package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.characteristicsPick;

import GZ.g;
import LZ.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet.CharacteristicsPickBottomSheetFragment;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.characteristicsPick.CharacteristicsPickVO;
import ru.ozon.uni.atoms.af.AtomAction;
import uZ.C9992d;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CharacteristicsPickViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ CharacteristicsPickViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CharacteristicsPickViewHolder$actionHandler$1(CharacteristicsPickViewHolder characteristicsPickViewHolder) {
        super(1);
        this.this$0 = characteristicsPickViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click it) {
        CharacteristicsPickVO characteristicsPickVO;
        g gVar;
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(it, "it");
        characteristicsPickVO = this.this$0.itemVO;
        if (characteristicsPickVO != null) {
            CharacteristicsPickViewHolder characteristicsPickViewHolder = this.this$0;
            gVar = characteristicsPickViewHolder.ozonRouter;
            CharacteristicsPickBottomSheetFragment.Companion companion = CharacteristicsPickBottomSheetFragment.INSTANCE;
            CharacteristicsPickVO.CellData cellData = characteristicsPickVO.getCellData();
            composerReferences = characteristicsPickViewHolder.composerReferences;
            gVar.c(new b(new C9992d(companion.newInstance(cellData, composerReferences.getTokenizedAnalytics()), null, 2, null)), null);
        }
    }
}
