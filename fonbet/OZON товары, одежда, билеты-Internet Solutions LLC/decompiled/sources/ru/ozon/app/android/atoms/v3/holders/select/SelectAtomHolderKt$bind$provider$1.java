package ru.ozon.app.android.atoms.v3.holders.select;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.uikit.view.atoms.select.SelectView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/atoms/v3/holders/select/SelectAtomHolder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SelectAtomHolderKt$bind$provider$1 extends AbstractC7737t implements Function0<SelectAtomHolder> {
    final /* synthetic */ SelectView $this_bind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectAtomHolderKt$bind$provider$1(SelectView selectView) {
        super(0);
        this.$this_bind = selectView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SelectAtomHolder invoke() {
        return new SelectAtomHolder(this.$this_bind, (String) null);
    }
}
