package ru.ozon.app.android.tabbar.feature.tab.boutique;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BoutiqueTabUiController$onStaticBadgeUpdated$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ BoutiqueTabUiController this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.tabbar.feature.tab.boutique.BoutiqueTabUiController$onStaticBadgeUpdated$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ BoutiqueTabUiController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BoutiqueTabUiController boutiqueTabUiController) {
            super(0);
            this.this$0 = boutiqueTabUiController;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.showBadgeWithAnimation();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BoutiqueTabUiController$onStaticBadgeUpdated$1(BoutiqueTabUiController boutiqueTabUiController) {
        super(0);
        this.this$0 = boutiqueTabUiController;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Handler handler;
        BoutiqueTabUiController boutiqueTabUiController = this.this$0;
        handler = boutiqueTabUiController.handler;
        boutiqueTabUiController.waitUntilWindowHasFocus(handler, 0L, new AnonymousClass1(this.this$0));
    }
}
