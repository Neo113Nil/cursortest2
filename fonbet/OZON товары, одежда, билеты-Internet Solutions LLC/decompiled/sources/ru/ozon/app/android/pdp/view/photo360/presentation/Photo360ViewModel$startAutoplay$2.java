package ru.ozon.app.android.pdp.view.photo360.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Float;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class Photo360ViewModel$startAutoplay$2 extends AbstractC7737t implements Function1<Float, Unit> {
    final /* synthetic */ Photo360ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Photo360ViewModel$startAutoplay$2(Photo360ViewModel photo360ViewModel) {
        super(1);
        this.this$0 = photo360ViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f7) {
        invoke2(f7);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Float f7) {
        Photo360ViewModel photo360ViewModel = this.this$0;
        Intrinsics.f(f7);
        photo360ViewModel.updateFrameIndex(f7.floatValue());
    }
}
