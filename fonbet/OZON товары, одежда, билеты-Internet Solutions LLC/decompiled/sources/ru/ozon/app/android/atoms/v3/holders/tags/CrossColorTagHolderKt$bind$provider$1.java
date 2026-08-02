package ru.ozon.app.android.atoms.v3.holders.tags;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.uikit.view.atoms.tags.CrossColorTagAtomView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/atoms/v3/holders/tags/CrossColorTagHolder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CrossColorTagHolderKt$bind$provider$1 extends AbstractC7737t implements Function0<CrossColorTagHolder> {
    final /* synthetic */ CrossColorTagAtomView $this_bind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CrossColorTagHolderKt$bind$provider$1(CrossColorTagAtomView crossColorTagAtomView) {
        super(0);
        this.$this_bind = crossColorTagAtomView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CrossColorTagHolder invoke() {
        return new CrossColorTagHolder(this.$this_bind, (String) null);
    }
}
