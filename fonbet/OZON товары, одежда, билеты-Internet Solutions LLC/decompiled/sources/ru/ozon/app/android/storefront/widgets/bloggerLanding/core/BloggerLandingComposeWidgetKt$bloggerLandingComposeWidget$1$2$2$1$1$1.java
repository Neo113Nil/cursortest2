package ru.ozon.app.android.storefront.widgets.bloggerLanding.core;

import Sc.s;
import Wc.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.bloggerLanding.core.BloggerLandingComposeWidgetKt$bloggerLandingComposeWidget$1$2$2$1$1$1", f = "BloggerLandingComposeWidget.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BloggerLandingComposeWidgetKt$bloggerLandingComposeWidget$1$2$2$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ View $localView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BloggerLandingComposeWidgetKt$bloggerLandingComposeWidget$1$2$2$1$1$1(View view, d<? super BloggerLandingComposeWidgetKt$bloggerLandingComposeWidget$1$2$2$1$1$1> dVar) {
        super(2, dVar);
        this.$localView = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BloggerLandingComposeWidgetKt$bloggerLandingComposeWidget$1$2$2$1$1$1(this.$localView, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Object parent = this.$localView.getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
        ((View) parent).setBackground(null);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BloggerLandingComposeWidgetKt$bloggerLandingComposeWidget$1$2$2$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
