package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.domain.GeotrackingMessage;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2VO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModelImpl$processCourierLocationEvent$1", f = "GeotrackingMapV2ViewModelImpl.kt", l = {125}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class GeotrackingMapV2ViewModelImpl$processCourierLocationEvent$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ GeotrackingMessage.CourierLocation $courierLocation;
    final /* synthetic */ GeotrackingMapV2VO $state;
    int label;
    final /* synthetic */ GeotrackingMapV2ViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GeotrackingMapV2ViewModelImpl$processCourierLocationEvent$1(GeotrackingMapV2ViewModelImpl geotrackingMapV2ViewModelImpl, GeotrackingMapV2VO geotrackingMapV2VO, GeotrackingMessage.CourierLocation courierLocation, d<? super GeotrackingMapV2ViewModelImpl$processCourierLocationEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = geotrackingMapV2ViewModelImpl;
        this.$state = geotrackingMapV2VO;
        this.$courierLocation = courierLocation;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new GeotrackingMapV2ViewModelImpl$processCourierLocationEvent$1(this.this$0, this.$state, this.$courierLocation, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        GeotrackingMapV2VO copy;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            w0<GeotrackingMapV2VO> mapState = this.this$0.getMapState();
            GeotrackingMapV2VO geotrackingMapV2VO = this.$state;
            GeotrackingMapV2VO.Pin courierPin = geotrackingMapV2VO.getCourierPin();
            double direction = this.$courierLocation.getDirection();
            GeotrackingMapV2VO.Pin.Coordinates coordinates = new GeotrackingMapV2VO.Pin.Coordinates(this.$courierLocation.getLongitude(), this.$courierLocation.getLatitude());
            List<GeotrackingMapV2VO.Pin.Modification> courierPinModifications = this.$state.getCourierPinModifications();
            GeotrackingMessage.CourierLocation courierLocation = this.$courierLocation;
            Iterator<T> it = courierPinModifications.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (Intrinsics.d(((GeotrackingMapV2VO.Pin.Modification) obj2).getType(), courierLocation.getModificationType())) {
                    break;
                }
            }
            copy = geotrackingMapV2VO.copy((r32 & 1) != 0 ? geotrackingMapV2VO.id : 0L, (r32 & 2) != 0 ? geotrackingMapV2VO.courierPin : GeotrackingMapV2VO.Pin.copy$default(courierPin, coordinates, direction, null, false, (GeotrackingMapV2VO.Pin.Modification) obj2, 12, null), (r32 & 4) != 0 ? geotrackingMapV2VO.destinationPin : null, (r32 & 8) != 0 ? geotrackingMapV2VO.darkStorePin : null, (r32 & 16) != 0 ? geotrackingMapV2VO.largestPinSize : null, (r32 & 32) != 0 ? geotrackingMapV2VO.orderStatus : null, (r32 & 64) != 0 ? geotrackingMapV2VO.isReceived : false, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? geotrackingMapV2VO.currentSheetRatio : 0.0d, (r32 & 256) != 0 ? geotrackingMapV2VO.locationTrackingInfo : null, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? geotrackingMapV2VO.defaultSheetTrackingInfo : null, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? geotrackingMapV2VO.expandedSheetTrackingInfo : null, (r32 & 2048) != 0 ? geotrackingMapV2VO.webSocketUrl : null, (r32 & 4096) != 0 ? geotrackingMapV2VO.courierPinModifications : null);
            this.label = 1;
            if (mapState.emit(copy, this) == aVar) {
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
        return ((GeotrackingMapV2ViewModelImpl$processCourierLocationEvent$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
