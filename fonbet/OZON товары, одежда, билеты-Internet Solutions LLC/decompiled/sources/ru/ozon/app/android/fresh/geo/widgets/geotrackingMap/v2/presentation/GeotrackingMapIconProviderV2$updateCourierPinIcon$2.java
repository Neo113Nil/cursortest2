package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.core.NetworkImageDataLoader;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import we0.InterfaceC10542A;
import we0.InterfaceC10545a;
import we0.u;
import we0.z;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapIconProviderV2$updateCourierPinIcon$2", f = "GeotrackingMapIconProviderV2.kt", l = {210}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class GeotrackingMapIconProviderV2$updateCourierPinIcon$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ u $courierPin;
    final /* synthetic */ String $iconUrl;
    final /* synthetic */ Function0<Unit> $onCourierChanged;
    int label;
    final /* synthetic */ GeotrackingMapIconProviderV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GeotrackingMapIconProviderV2$updateCourierPinIcon$2(GeotrackingMapIconProviderV2 geotrackingMapIconProviderV2, String str, u uVar, Function0<Unit> function0, d<? super GeotrackingMapIconProviderV2$updateCourierPinIcon$2> dVar) {
        super(2, dVar);
        this.this$0 = geotrackingMapIconProviderV2;
        this.$iconUrl = str;
        this.$courierPin = uVar;
        this.$onCourierChanged = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new GeotrackingMapIconProviderV2$updateCourierPinIcon$2(this.this$0, this.$iconUrl, this.$courierPin, this.$onCourierChanged, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        NetworkImageDataLoader networkImageDataLoader;
        Object m746getBytesFromUrl0E7RQCE;
        OzonMapController ozonMapController;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            networkImageDataLoader = this.this$0.networkImageDataLoader;
            String str = this.$iconUrl;
            NetworkImageDataLoader.FileFormat fileFormat = NetworkImageDataLoader.FileFormat.PNG;
            this.label = 1;
            m746getBytesFromUrl0E7RQCE = networkImageDataLoader.m746getBytesFromUrl0E7RQCE(str, fileFormat, this);
            if (m746getBytesFromUrl0E7RQCE == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            m746getBytesFromUrl0E7RQCE = ((r) obj).getF26106a();
        }
        r.Companion companion = r.INSTANCE;
        if (m746getBytesFromUrl0E7RQCE instanceof r.b) {
            m746getBytesFromUrl0E7RQCE = null;
        }
        byte[] bArr = (byte[]) m746getBytesFromUrl0E7RQCE;
        if (bArr == null) {
            return Unit.f71690a;
        }
        u uVar = this.$courierPin;
        u a11 = u.a(uVar, null, new z(new InterfaceC10542A.a(new InterfaceC10545a.b(bArr)), null, false, false, 0.0f, 0.0f, uVar.d().c(), 190), null, null, 1021);
        if (!a11.equals(this.$courierPin)) {
            ozonMapController = this.this$0.mapController;
            ozonMapController.updateMarker(a11);
            this.this$0.courierPinPlacemark = a11;
        }
        this.$onCourierChanged.invoke();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((GeotrackingMapIconProviderV2$updateCourierPinIcon$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
