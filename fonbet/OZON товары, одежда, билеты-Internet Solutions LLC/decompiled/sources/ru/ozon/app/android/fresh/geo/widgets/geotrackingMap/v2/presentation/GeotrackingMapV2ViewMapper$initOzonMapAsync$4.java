package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import Ge.f;
import Sc.s;
import Wc.a;
import android.view.ViewGroup;
import io.reactivex.AbstractC7094b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewMapper$initOzonMapAsync$4", f = "GeotrackingMapV2ViewMapper.kt", l = {106}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class GeotrackingMapV2ViewMapper$initOzonMapAsync$4 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ i $container;
    final /* synthetic */ OzonMapController $ozonMapController;
    int label;
    final /* synthetic */ GeotrackingMapV2ViewMapper this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewMapper$initOzonMapAsync$4$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Boolean, Unit> {
        final /* synthetic */ i $container;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(i iVar) {
            super(1);
            this.$container = iVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            ViewGroup composerProgressBar = ComposerViewExtensionKt.composerProgressBar(this.$container.Z());
            if (composerProgressBar != null) {
                ViewExtKt.showOrGone(composerProgressBar, Boolean.valueOf(z11));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GeotrackingMapV2ViewMapper$initOzonMapAsync$4(OzonMapController ozonMapController, GeotrackingMapV2ViewMapper geotrackingMapV2ViewMapper, i iVar, d<? super GeotrackingMapV2ViewMapper$initOzonMapAsync$4> dVar) {
        super(2, dVar);
        this.$ozonMapController = ozonMapController;
        this.this$0 = geotrackingMapV2ViewMapper;
        this.$container = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new GeotrackingMapV2ViewMapper$initOzonMapAsync$4(this.$ozonMapController, this.this$0, this.$container, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        GeotrackingMapV2Binder geotrackingMapV2Binder;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            AbstractC7094b initMap$default = OzonMapController.DefaultImpls.initMap$default(this.$ozonMapController, null, false, new AnonymousClass1(this.$container), 3, null);
            this.label = 1;
            if (f.a(initMap$default, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        geotrackingMapV2Binder = this.this$0.binder;
        if (geotrackingMapV2Binder != null) {
            geotrackingMapV2Binder.onConstruct();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((GeotrackingMapV2ViewMapper$initOzonMapAsync$4) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
