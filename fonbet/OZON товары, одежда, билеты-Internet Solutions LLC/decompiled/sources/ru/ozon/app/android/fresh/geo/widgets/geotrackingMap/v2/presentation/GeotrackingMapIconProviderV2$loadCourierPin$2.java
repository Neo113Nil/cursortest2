package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.core.NetworkImageDataLoader;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2VO;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import ru.ozon.app.android.pinlocator.PinLocator;
import we0.InterfaceC10542A;
import we0.InterfaceC10545a;
import we0.m;
import we0.u;
import we0.z;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapIconProviderV2$loadCourierPin$2", f = "GeotrackingMapIconProviderV2.kt", l = {185}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class GeotrackingMapIconProviderV2$loadCourierPin$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ m $coordinates;
    final /* synthetic */ boolean $isDefaultPin;
    final /* synthetic */ Function1<u, Unit> $onCourierPinInserted;
    final /* synthetic */ GeotrackingMapV2VO.Pin $pin;
    final /* synthetic */ String $pinIconUrl;
    int label;
    final /* synthetic */ GeotrackingMapIconProviderV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GeotrackingMapIconProviderV2$loadCourierPin$2(GeotrackingMapIconProviderV2 geotrackingMapIconProviderV2, String str, boolean z11, GeotrackingMapV2VO.Pin pin, m mVar, Function1<? super u, Unit> function1, d<? super GeotrackingMapIconProviderV2$loadCourierPin$2> dVar) {
        super(2, dVar);
        this.this$0 = geotrackingMapIconProviderV2;
        this.$pinIconUrl = str;
        this.$isDefaultPin = z11;
        this.$pin = pin;
        this.$coordinates = mVar;
        this.$onCourierPinInserted = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new GeotrackingMapIconProviderV2$loadCourierPin$2(this.this$0, this.$pinIconUrl, this.$isDefaultPin, this.$pin, this.$coordinates, this.$onCourierPinInserted, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        NetworkImageDataLoader networkImageDataLoader;
        Object obj2;
        OzonMapController ozonMapController;
        u uVar;
        u uVar2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            networkImageDataLoader = this.this$0.networkImageDataLoader;
            String str = this.$pinIconUrl;
            NetworkImageDataLoader.FileFormat fileFormat = NetworkImageDataLoader.FileFormat.PNG;
            this.label = 1;
            Object m746getBytesFromUrl0E7RQCE = networkImageDataLoader.m746getBytesFromUrl0E7RQCE(str, fileFormat, this);
            if (m746getBytesFromUrl0E7RQCE == aVar) {
                return aVar;
            }
            obj2 = m746getBytesFromUrl0E7RQCE;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            obj2 = ((r) obj).getF26106a();
        }
        r.Companion companion = r.INSTANCE;
        if (obj2 instanceof r.b) {
            obj2 = null;
        }
        byte[] bArr = (byte[]) obj2;
        if (bArr == null) {
            return Unit.f71690a;
        }
        this.this$0.courierPinPlacemark = new u(this.$coordinates, new z(new InterfaceC10542A.a(new InterfaceC10545a.b(bArr)), this.$pin.getIcon().getOptions().getContentAnchor(), false, false, 0.0f, 1.0f, this.$isDefaultPin ? 0.0f : (float) this.$pin.getDirection(), 156), PinLocator.Courier.INSTANCE, "freshCourierId", null, 1008);
        ozonMapController = this.this$0.mapController;
        uVar = this.this$0.courierPinPlacemark;
        if (uVar == null) {
            return Unit.f71690a;
        }
        ozonMapController.insertPlacemark(uVar);
        Function1<u, Unit> function1 = this.$onCourierPinInserted;
        uVar2 = this.this$0.courierPinPlacemark;
        if (uVar2 == null) {
            return Unit.f71690a;
        }
        function1.invoke(uVar2);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((GeotrackingMapIconProviderV2$loadCourierPin$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
