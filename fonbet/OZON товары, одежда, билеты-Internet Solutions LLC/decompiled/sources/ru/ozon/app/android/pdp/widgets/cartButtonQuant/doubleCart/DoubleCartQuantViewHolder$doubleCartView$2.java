package ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pdp.flags.HapticsActionEnabledFlag;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantViewImpl;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DoubleCartQuantViewHolder$doubleCartView$2 extends AbstractC7737t implements Function0<DoubleCartQuantViewImpl> {
    final /* synthetic */ DoubleCartQuantViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DoubleCartQuantViewHolder$doubleCartView$2(DoubleCartQuantViewHolder doubleCartQuantViewHolder) {
        super(0);
        this.this$0 = doubleCartQuantViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DoubleCartQuantViewImpl invoke() {
        i iVar;
        FeatureChecker featureChecker;
        iVar = this.this$0.container;
        Context L11 = iVar.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        featureChecker = this.this$0.featureChecker;
        return new DoubleCartQuantViewImpl(L11, null, 0, featureChecker.isEnabled(HapticsActionEnabledFlag.INSTANCE), 6, null);
    }
}
