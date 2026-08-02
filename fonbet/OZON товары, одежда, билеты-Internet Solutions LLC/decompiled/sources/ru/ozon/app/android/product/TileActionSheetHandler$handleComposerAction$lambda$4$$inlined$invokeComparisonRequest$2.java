package ru.ozon.app.android.product;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
public final class TileActionSheetHandler$handleComposerAction$lambda$4$$inlined$invokeComparisonRequest$2 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ TileActionSheetHandler $receiver$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileActionSheetHandler$handleComposerAction$lambda$4$$inlined$invokeComparisonRequest$2(TileActionSheetHandler tileActionSheetHandler) {
        super(1);
        this.$receiver$inlined = tileActionSheetHandler;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        Intrinsics.f(th2);
        this.$receiver$inlined.onError(th2);
    }
}
