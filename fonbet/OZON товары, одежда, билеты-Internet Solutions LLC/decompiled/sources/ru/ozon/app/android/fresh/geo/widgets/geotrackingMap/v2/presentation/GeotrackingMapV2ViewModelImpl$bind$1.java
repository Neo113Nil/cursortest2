package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.domain.GeotrackingWebSocket;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2VO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModelImpl$bind$1", f = "GeotrackingMapV2ViewModelImpl.kt", l = {42, 49}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class GeotrackingMapV2ViewModelImpl$bind$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ GeotrackingMapV2VO $vo;
    int label;
    final /* synthetic */ GeotrackingMapV2ViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GeotrackingMapV2ViewModelImpl$bind$1(GeotrackingMapV2VO geotrackingMapV2VO, GeotrackingMapV2ViewModelImpl geotrackingMapV2ViewModelImpl, d<? super GeotrackingMapV2ViewModelImpl$bind$1> dVar) {
        super(2, dVar);
        this.$vo = geotrackingMapV2VO;
        this.this$0 = geotrackingMapV2ViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new GeotrackingMapV2ViewModelImpl$bind$1(this.$vo, this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (r8 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object startSocketIfNeeded;
        GeotrackingWebSocket geotrackingWebSocket;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.$vo.setInitial(true);
            w0<GeotrackingMapV2VO> mapState = this.this$0.getMapState();
            GeotrackingMapV2VO geotrackingMapV2VO = this.$vo;
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        GeotrackingMapV2VO.Pin.Coordinates coordinates = this.$vo.getCourierPin().getCoordinates();
        if (coordinates != null) {
            geotrackingWebSocket = this.this$0.geotrackingWebSocket;
            geotrackingWebSocket.initCourierLocation(coordinates.getLatitude(), coordinates.getLongitude());
        }
        GeotrackingMapV2ViewModelImpl geotrackingMapV2ViewModelImpl = this.this$0;
        this.label = 2;
        startSocketIfNeeded = geotrackingMapV2ViewModelImpl.startSocketIfNeeded(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((GeotrackingMapV2ViewModelImpl$bind$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
