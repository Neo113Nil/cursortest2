package ru.ozon.app.android.pdp.widgets.aspectProductV2.presentation;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/aspectProductV2/presentation/AspectProductV2View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AspectProductV2ViewHolder$view$2 extends AbstractC7737t implements Function0<AspectProductV2View> {
    final /* synthetic */ AspectProductV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectProductV2ViewHolder$view$2(AspectProductV2ViewHolder aspectProductV2ViewHolder) {
        super(0);
        this.this$0 = aspectProductV2ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AspectProductV2View invoke() {
        i iVar;
        iVar = this.this$0.container;
        Context L11 = iVar.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        return new AspectProductV2View(L11, null, 0, 6, null);
    }
}
