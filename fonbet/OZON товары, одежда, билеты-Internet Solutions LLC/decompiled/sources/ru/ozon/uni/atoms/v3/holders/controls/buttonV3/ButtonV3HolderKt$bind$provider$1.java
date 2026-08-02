package ru.ozon.uni.atoms.v3.holders.controls.buttonV3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/atoms/v3/holders/controls/buttonV3/ButtonV3Holder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class ButtonV3HolderKt$bind$provider$1 extends AbstractC7737t implements Function0<ButtonV3Holder> {
    final /* synthetic */ ButtonV3View $this_bind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonV3HolderKt$bind$provider$1(ButtonV3View buttonV3View) {
        super(0);
        this.$this_bind = buttonV3View;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ButtonV3Holder invoke() {
        return new ButtonV3Holder(this.$this_bind, (String) null);
    }
}
