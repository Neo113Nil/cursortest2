package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation;

import Ie0.c;
import Sc.s;
import Wc.a;
import android.content.Context;
import androidx.lifecycle.B;
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
import ru.ozon.mapsdk.OzonMapView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ve0.b;
import we0.q;
import we0.r;
import we0.y;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lve0/b;", "newController", "", "<anonymous>", "(Lve0/b;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapViewV2$setupMap$1", f = "HotelsMapViewV2.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsMapViewV2$setupMap$1 extends j implements Function2<b, d<? super Unit>, Object> {
    final /* synthetic */ B $lifecycleScope;
    final /* synthetic */ Function0<Unit> $onMapControllerReady;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HotelsMapViewV2 this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "<unused var>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapViewV2$setupMap$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<Integer, Integer, Unit> {
        final /* synthetic */ b $newController;
        final /* synthetic */ HotelsMapViewV2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HotelsMapViewV2 hotelsMapViewV2, b bVar) {
            super(2);
            this.this$0 = hotelsMapViewV2;
            this.$newController = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
            invoke(num.intValue(), num2.intValue());
            return Unit.f71690a;
        }

        public final void invoke(int i11, int i12) {
            OzonMapView hotelsMapInfoMap = this.this$0.binding.hotelsMapInfoMap;
            Intrinsics.checkNotNullExpressionValue(hotelsMapInfoMap, "hotelsMapInfoMap");
            MapExtKt.updateActiveZone(hotelsMapInfoMap, this.$newController);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapViewV2$setupMap$1(HotelsMapViewV2 hotelsMapViewV2, Function0<Unit> function0, B b11, d<? super HotelsMapViewV2$setupMap$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsMapViewV2;
        this.$onMapControllerReady = function0;
        this.$lifecycleScope = b11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelsMapViewV2$setupMap$1 hotelsMapViewV2$setupMap$1 = new HotelsMapViewV2$setupMap$1(this.this$0, this.$onMapControllerReady, this.$lifecycleScope, dVar);
        hotelsMapViewV2$setupMap$1.L$0 = obj;
        return hotelsMapViewV2$setupMap$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b bVar;
        Context context;
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
                this.this$0.binding.hotelsMapInfoMap.p(new AnonymousClass1(this.this$0, bVar2));
                b controller = this.this$0.getController();
                HotelsMapViewV2 hotelsMapViewV2 = this.this$0;
                controller.d().a(false);
                controller.d().b(false);
                c h11 = controller.h();
                context = hotelsMapViewV2.context;
                Intrinsics.checkNotNullExpressionValue(context, "access$getContext$p(...)");
                h11.b(ThemeExtKt.isDarkThemeActive(context) ? y.DARK : y.LIGHT);
                controller.d().setZoomFocusPoint(null);
                controller.setLogoConfig(new q(r.LEFT_BOTTOM, 2));
                this.$onMapControllerReady.invoke();
                this.this$0.observeActions(this.$lifecycleScope);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b bVar, d<? super Unit> dVar) {
        return ((HotelsMapViewV2$setupMap$1) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
    }
}
