package ru.ozon.app.android.mapcommon.map.sdk;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.mapsdk.OzonMapView;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mapcommon.map.sdk.SdkMapController$initMap$2", f = "SdkMapController.kt", l = {141}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SdkMapController$initMap$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ GeoProviderConfig $geoProviderConfig;
    final /* synthetic */ boolean $isReinitialization;
    final /* synthetic */ boolean $isUseViewPlacemarkController;
    final /* synthetic */ Function1<Boolean, Unit> $loading;
    final /* synthetic */ String $sessionId;
    int label;
    final /* synthetic */ SdkMapController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SdkMapController$initMap$2(Function1<? super Boolean, Unit> function1, boolean z11, SdkMapController sdkMapController, GeoProviderConfig geoProviderConfig, String str, boolean z12, d<? super SdkMapController$initMap$2> dVar) {
        super(2, dVar);
        this.$loading = function1;
        this.$isReinitialization = z11;
        this.this$0 = sdkMapController;
        this.$geoProviderConfig = geoProviderConfig;
        this.$sessionId = str;
        this.$isUseViewPlacemarkController = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SdkMapController$initMap$2(this.$loading, this.$isReinitialization, this.this$0, this.$geoProviderConfig, this.$sessionId, this.$isUseViewPlacemarkController, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            Function1<Boolean, Unit> function1 = this.$loading;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
            if (!this.$isReinitialization) {
                this.this$0.addContentViewToContainer();
            }
            OzonMapView contentView = this.this$0.getContentView();
            GeoProviderConfig geoProviderConfig = this.$geoProviderConfig;
            String str = this.$sessionId;
            boolean z11 = this.$isUseViewPlacemarkController;
            this.label = 1;
            if (OzonMapView.m(contentView, geoProviderConfig, str, z11, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SdkMapController$initMap$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
