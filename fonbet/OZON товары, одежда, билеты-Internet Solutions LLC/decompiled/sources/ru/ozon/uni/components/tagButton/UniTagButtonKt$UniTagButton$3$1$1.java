package ru.ozon.uni.components.tagButton;

import S0.A1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UniTagButtonKt$UniTagButton$3$1$1 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ A1<Boolean> $isPressed$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniTagButtonKt$UniTagButton$3$1$1(A1<Boolean> a12) {
        super(0);
        this.$isPressed$delegate = a12;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean UniTagButton$lambda$2;
        UniTagButton$lambda$2 = UniTagButtonKt.UniTagButton$lambda$2(this.$isPressed$delegate);
        return Boolean.valueOf(UniTagButton$lambda$2);
    }
}
