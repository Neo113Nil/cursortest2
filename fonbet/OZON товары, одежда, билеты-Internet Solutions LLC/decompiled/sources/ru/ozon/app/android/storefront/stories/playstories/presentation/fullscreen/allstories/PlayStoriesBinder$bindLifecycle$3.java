package ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PlayStoriesBinder$bindLifecycle$3 extends AbstractC7737t implements Function1<Void, Unit> {
    final /* synthetic */ PlayStoriesBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayStoriesBinder$bindLifecycle$3(PlayStoriesBinder playStoriesBinder) {
        super(1);
        this.this$0 = playStoriesBinder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Void r12) {
        invoke2(r12);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Void r12) {
        this.this$0.closeWithoutTransition();
    }
}
