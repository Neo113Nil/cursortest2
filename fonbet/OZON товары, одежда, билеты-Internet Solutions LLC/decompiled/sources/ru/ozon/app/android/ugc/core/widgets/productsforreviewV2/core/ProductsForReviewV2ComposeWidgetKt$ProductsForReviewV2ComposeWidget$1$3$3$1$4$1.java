package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.core;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import xe.C10727i;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3$1$4$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ InterfaceC7851b $composerController;
    final /* synthetic */ M $scope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.core.ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3$1$4$1$1", f = "ProductsForReviewV2ComposeWidget.kt", l = {125}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.core.ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3$1$4$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ InterfaceC7851b $composerController;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC7851b interfaceC7851b, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$composerController = interfaceC7851b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$composerController, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                this.label = 1;
                if (Y.b(3000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            InterfaceC7851b.a.a(this.$composerController, null, null, null, null, 15);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3$1$4$1(M m11, InterfaceC7851b interfaceC7851b) {
        super(0);
        this.$scope = m11;
        this.$composerController = interfaceC7851b;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C10727i.c(this.$scope, null, null, new AnonymousClass1(this.$composerController, null), 3);
    }
}
