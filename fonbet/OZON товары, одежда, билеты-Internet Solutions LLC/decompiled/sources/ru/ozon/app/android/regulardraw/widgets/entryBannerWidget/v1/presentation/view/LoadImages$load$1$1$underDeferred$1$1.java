package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.view;

import Sc.s;
import Wc.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Lxe/M;)Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.view.LoadImages$load$1$1$underDeferred$1$1", f = "LoadImages.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class LoadImages$load$1$1$underDeferred$1$1 extends j implements Function2<M, d<? super Drawable>, Object> {
    final /* synthetic */ String $it;
    final /* synthetic */ ConstraintLayout $rootView;
    int label;
    final /* synthetic */ LoadImages this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoadImages$load$1$1$underDeferred$1$1(LoadImages loadImages, ConstraintLayout constraintLayout, String str, d<? super LoadImages$load$1$1$underDeferred$1$1> dVar) {
        super(2, dVar);
        this.this$0 = loadImages;
        this.$rootView = constraintLayout;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new LoadImages$load$1$1$underDeferred$1$1(this.this$0, this.$rootView, this.$it, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object suspendLoadImage;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        LoadImages loadImages = this.this$0;
        Context context = this.$rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String str = this.$it;
        this.label = 1;
        suspendLoadImage = loadImages.suspendLoadImage(context, str, true, this);
        return suspendLoadImage == aVar ? aVar : suspendLoadImage;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Drawable> dVar) {
        return ((LoadImages$load$1$1$underDeferred$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
