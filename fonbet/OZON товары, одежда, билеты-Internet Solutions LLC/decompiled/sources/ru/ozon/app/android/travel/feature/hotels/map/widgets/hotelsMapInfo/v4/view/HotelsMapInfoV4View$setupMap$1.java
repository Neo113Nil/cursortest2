package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view;

import Ie0.c;
import Sc.s;
import Wc.a;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ve0.b;
import we0.q;
import we0.r;
import we0.y;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lve0/b;", "newController", "", "<anonymous>", "(Lve0/b;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view.HotelsMapInfoV4View$setupMap$1", f = "HotelsMapInfoV4View.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsMapInfoV4View$setupMap$1 extends j implements Function2<b, d<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onMapControllerReady;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HotelsMapInfoV4View this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "<unused var>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view.HotelsMapInfoV4View$setupMap$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<Integer, Integer, Unit> {
        final /* synthetic */ b $newController;
        final /* synthetic */ HotelsMapInfoV4View this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HotelsMapInfoV4View hotelsMapInfoV4View, b bVar) {
            super(2);
            this.this$0 = hotelsMapInfoV4View;
            this.$newController = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
            invoke(num.intValue(), num2.intValue());
            return Unit.f71690a;
        }

        public final void invoke(int i11, int i12) {
            MapExtKt.updateActiveZone(this.this$0.map, this.$newController);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4View$setupMap$1(HotelsMapInfoV4View hotelsMapInfoV4View, Function0<Unit> function0, d<? super HotelsMapInfoV4View$setupMap$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsMapInfoV4View;
        this.$onMapControllerReady = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelsMapInfoV4View$setupMap$1 hotelsMapInfoV4View$setupMap$1 = new HotelsMapInfoV4View$setupMap$1(this.this$0, this.$onMapControllerReady, dVar);
        hotelsMapInfoV4View$setupMap$1.L$0 = obj;
        return hotelsMapInfoV4View$setupMap$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b bVar;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        b bVar2 = (b) this.L$0;
        if (bVar2 != null) {
            bVar = this.this$0._controller;
            if (!bVar2.equals(bVar)) {
                this.this$0._controller = bVar2;
                this.this$0.map.p(new AnonymousClass1(this.this$0, bVar2));
                b controller = this.this$0.getController();
                HotelsMapInfoV4View hotelsMapInfoV4View = this.this$0;
                controller.b().f();
                controller.d().a(false);
                controller.d().b(false);
                c h11 = controller.h();
                Context context = hotelsMapInfoV4View.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                h11.b(ThemeExtKt.isDarkThemeActive(context) ? y.DARK : y.LIGHT);
                controller.d().setZoomFocusPoint(null);
                controller.setLogoConfig(new q(r.LEFT_BOTTOM, 2));
                this.$onMapControllerReady.invoke();
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b bVar, d<? super Unit> dVar) {
        return ((HotelsMapInfoV4View$setupMap$1) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
    }
}
