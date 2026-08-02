package ru.ozon.app.android.geo.map.clusterization;

import Ae.x0;
import Sc.s;
import Wc.a;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.geo.map.clusterization.PinsState;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.geo.map.clusterization.ClusterizationLoadingServiceImpl$loadPins$1", f = "ClusterizationLoadingService.kt", l = {49, 52, 55, 56, 60}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ClusterizationLoadingServiceImpl$loadPins$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ClusterizationLoadingServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClusterizationLoadingServiceImpl$loadPins$1(ClusterizationLoadingServiceImpl clusterizationLoadingServiceImpl, d<? super ClusterizationLoadingServiceImpl$loadPins$1> dVar) {
        super(2, dVar);
        this.this$0 = clusterizationLoadingServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ClusterizationLoadingServiceImpl$loadPins$1(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
    
        if (r1.emit(r4, r7) != r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
    
        if (r1.emit(r3, r7) != r0) goto L41;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        ClusterizationRepository clusterizationRepository;
        ClusterizationPinsDecoder clusterizationPinsDecoder;
        MapPlacemarkFactory mapPlacemarkFactory;
        x0 x0Var2;
        x0 x0Var3;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (CancellationException e11) {
            throw e11;
        } catch (Exception e12) {
            x0Var = this.this$0._pinsFlow;
            PinsState.Error error = new PinsState.Error(e12);
            this.label = 5;
        }
        if (i11 == 0) {
            s.b(obj);
            clusterizationRepository = this.this$0.repository;
            this.label = 1;
            obj = clusterizationRepository.getPins(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i11 == 1) {
            s.b(obj);
        } else {
            if (i11 == 2) {
                s.b(obj);
                return Unit.f71690a;
            }
            if (i11 != 3) {
                if (i11 == 4) {
                    s.b(obj);
                } else {
                    if (i11 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
            s.b(obj);
            x0Var3 = this.this$0._pinsFlow;
            PinsState.Success success = new PinsState.Success((List) obj);
            this.label = 4;
        }
        clusterizationPinsDecoder = this.this$0.decoder;
        ClusterizationData decodePins = clusterizationPinsDecoder.decodePins((PinsResponse) ((ActionV2Response) obj).getData());
        if (decodePins == null) {
            x0Var2 = this.this$0._pinsFlow;
            PinsState.Error error2 = new PinsState.Error(new IllegalStateException("Failed to decode pins"));
            this.label = 2;
            if (x0Var2.emit(error2, this) == aVar) {
            }
            return Unit.f71690a;
        }
        mapPlacemarkFactory = this.this$0.mapPlacemarkFactory;
        this.label = 3;
        obj = mapPlacemarkFactory.createMapPlacemarks(decodePins, this);
        if (obj == aVar) {
        }
        x0Var3 = this.this$0._pinsFlow;
        PinsState.Success success2 = new PinsState.Success((List) obj);
        this.label = 4;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ClusterizationLoadingServiceImpl$loadPins$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
