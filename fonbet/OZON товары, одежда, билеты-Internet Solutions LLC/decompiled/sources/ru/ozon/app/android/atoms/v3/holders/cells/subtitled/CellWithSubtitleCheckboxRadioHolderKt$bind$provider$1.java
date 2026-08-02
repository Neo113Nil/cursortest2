package ru.ozon.app.android.atoms.v3.holders.cells.subtitled;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCheckboxRadioView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/atoms/v3/holders/cells/subtitled/CellWithSubtitleCheckboxRadioHolder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CellWithSubtitleCheckboxRadioHolderKt$bind$provider$1 extends AbstractC7737t implements Function0<CellWithSubtitleCheckboxRadioHolder> {
    final /* synthetic */ CellWithSubtitleCheckboxRadioView $this_bind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CellWithSubtitleCheckboxRadioHolderKt$bind$provider$1(CellWithSubtitleCheckboxRadioView cellWithSubtitleCheckboxRadioView) {
        super(0);
        this.$this_bind = cellWithSubtitleCheckboxRadioView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CellWithSubtitleCheckboxRadioHolder invoke() {
        return new CellWithSubtitleCheckboxRadioHolder(this.$this_bind, (String) null);
    }
}
