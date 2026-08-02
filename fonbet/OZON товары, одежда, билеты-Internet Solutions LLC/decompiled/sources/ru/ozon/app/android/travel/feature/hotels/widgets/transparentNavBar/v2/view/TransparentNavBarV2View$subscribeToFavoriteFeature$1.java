package ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.view;

import Sc.s;
import Wc.a;
import android.view.View;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.utils.viewGroup.TouchEventsThiefFrameLayout;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isActivated", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.view.TransparentNavBarV2View$subscribeToFavoriteFeature$1", f = "TransparentNavBarV2View.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TransparentNavBarV2View$subscribeToFavoriteFeature$1 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ TransparentNavBarV2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransparentNavBarV2View$subscribeToFavoriteFeature$1(TransparentNavBarV2View transparentNavBarV2View, d<? super TransparentNavBarV2View$subscribeToFavoriteFeature$1> dVar) {
        super(2, dVar);
        this.this$0 = transparentNavBarV2View;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TransparentNavBarV2View$subscribeToFavoriteFeature$1 transparentNavBarV2View$subscribeToFavoriteFeature$1 = new TransparentNavBarV2View$subscribeToFavoriteFeature$1(this.this$0, dVar);
        transparentNavBarV2View$subscribeToFavoriteFeature$1.Z$0 = ((Boolean) obj).booleanValue();
        return transparentNavBarV2View$subscribeToFavoriteFeature$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        boolean z11 = this.Z$0;
        this.this$0.isThiefActivated = z11;
        Iterator<View> it = C5316f0.b(this.this$0).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return Unit.f71690a;
            }
            View view = (View) c5314e0.next();
            if (view instanceof TouchEventsThiefFrameLayout) {
                ((TouchEventsThiefFrameLayout) view).setThiefActivated(z11);
            }
        }
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((TransparentNavBarV2View$subscribeToFavoriteFeature$1) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
