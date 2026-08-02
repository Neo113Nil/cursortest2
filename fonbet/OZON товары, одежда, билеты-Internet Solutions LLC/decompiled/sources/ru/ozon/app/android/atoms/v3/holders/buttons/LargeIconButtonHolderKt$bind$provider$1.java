package ru.ozon.app.android.atoms.v3.holders.buttons;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.LargeIconButtonView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/atoms/v3/holders/buttons/LargeIconButtonHolder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class LargeIconButtonHolderKt$bind$provider$1 extends AbstractC7737t implements Function0<LargeIconButtonHolder> {
    final /* synthetic */ boolean $isSemanticBackground;
    final /* synthetic */ LargeIconButtonView $this_bind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LargeIconButtonHolderKt$bind$provider$1(LargeIconButtonView largeIconButtonView, boolean z11) {
        super(0);
        this.$this_bind = largeIconButtonView;
        this.$isSemanticBackground = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LargeIconButtonHolder invoke() {
        return new LargeIconButtonHolder(this.$this_bind, (String) null, this.$isSemanticBackground);
    }
}
