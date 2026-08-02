package ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.travel.data.storage.offline.OfflineTravelWidgetsStateDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation.OfflineTravelModelViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation.OfflineTravelModelViewModel$downloadWidgetStates$1", f = "OfflineTravelModelViewModel.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 55, 66}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OfflineTravelModelViewModel$downloadWidgetStates$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ OfflineTravelModeVI $item;
    final /* synthetic */ String $widgetsHash;
    int label;
    final /* synthetic */ OfflineTravelModelViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OfflineTravelModelViewModel$downloadWidgetStates$1(OfflineTravelModeVI offlineTravelModeVI, String str, AtomAction atomAction, OfflineTravelModelViewModel offlineTravelModelViewModel, d<? super OfflineTravelModelViewModel$downloadWidgetStates$1> dVar) {
        super(2, dVar);
        this.$item = offlineTravelModeVI;
        this.$widgetsHash = str;
        this.$action = atomAction;
        this.this$0 = offlineTravelModelViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OfflineTravelModelViewModel$downloadWidgetStates$1(this.$item, this.$widgetsHash, this.$action, this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c2, code lost:
    
        if (r13.emit(r3, r12) == r0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5 A[Catch: all -> 0x0015, CancellationException -> 0x0019, TryCatch #2 {CancellationException -> 0x0019, all -> 0x0015, blocks: (B:7:0x0010, B:13:0x0025, B:14:0x0095, B:16:0x00a5, B:18:0x00a9, B:21:0x00b3, B:25:0x002a, B:26:0x0041, B:28:0x0045, B:32:0x004f, B:34:0x005e, B:35:0x0062, B:37:0x006c, B:38:0x0070, B:44:0x0031), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e A[Catch: all -> 0x0015, CancellationException -> 0x0019, TryCatch #2 {CancellationException -> 0x0019, all -> 0x0015, blocks: (B:7:0x0010, B:13:0x0025, B:14:0x0095, B:16:0x00a5, B:18:0x00a9, B:21:0x00b3, B:25:0x002a, B:26:0x0041, B:28:0x0045, B:32:0x004f, B:34:0x005e, B:35:0x0062, B:37:0x006c, B:38:0x0070, B:44:0x0031), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c A[Catch: all -> 0x0015, CancellationException -> 0x0019, TryCatch #2 {CancellationException -> 0x0019, all -> 0x0015, blocks: (B:7:0x0010, B:13:0x0025, B:14:0x0095, B:16:0x00a5, B:18:0x00a9, B:21:0x00b3, B:25:0x002a, B:26:0x0041, B:28:0x0045, B:32:0x004f, B:34:0x005e, B:35:0x0062, B:37:0x006c, B:38:0x0070, B:44:0x0031), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map map;
        Map<String, String> params;
        ActionV2Repository actionV2Repository;
        OfflineTravelWidgetsStateDTO mapNewState;
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            this.this$0.currentHash = null;
            Lm0.a.f17149a.e(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            long delay = this.$item.getDelay();
            this.label = 1;
            if (Y.b(delay, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
                OfflineModelResponse offlineModelResponse = (OfflineModelResponse) ((ActionV2Response) obj).getData();
                mapNewState = this.this$0.mapNewState(offlineModelResponse);
                if (mapNewState != null) {
                    String widgetsHash = offlineModelResponse != null ? offlineModelResponse.getWidgetsHash() : null;
                    if (widgetsHash == null) {
                        widgetsHash = "";
                    }
                    OfflineTravelModelViewModel.Data data = new OfflineTravelModelViewModel.Data(widgetsHash, mapNewState);
                    w0Var = this.this$0._serializedWidgets;
                    this.label = 3;
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        String str = this.$widgetsHash;
        if (str != null) {
            if (h.K(str)) {
                str = null;
            }
            if (str != null) {
                map = U.i(new Pair("WIDGETS_HASH", str));
                if (map == null) {
                    map = U.c();
                }
                params = ((AtomAction.ComposerAction) this.$action).getParams();
                if (params == null) {
                    params = U.c();
                }
                ActionV2Request actionV2Request = new ActionV2Request(U.m(params, map), ((AtomAction.ComposerAction) this.$action).getActionName(), false, 4, null);
                actionV2Repository = this.this$0.repository;
                this.label = 2;
                obj = actionV2Repository.callActionSuspend(actionV2Request, OfflineModelResponse.class, this);
                if (obj == aVar) {
                    return aVar;
                }
                OfflineModelResponse offlineModelResponse2 = (OfflineModelResponse) ((ActionV2Response) obj).getData();
                mapNewState = this.this$0.mapNewState(offlineModelResponse2);
                if (mapNewState != null) {
                }
                return Unit.f71690a;
            }
        }
        map = null;
        if (map == null) {
        }
        params = ((AtomAction.ComposerAction) this.$action).getParams();
        if (params == null) {
        }
        ActionV2Request actionV2Request2 = new ActionV2Request(U.m(params, map), ((AtomAction.ComposerAction) this.$action).getActionName(), false, 4, null);
        actionV2Repository = this.this$0.repository;
        this.label = 2;
        obj = actionV2Repository.callActionSuspend(actionV2Request2, OfflineModelResponse.class, this);
        if (obj == aVar) {
        }
        OfflineModelResponse offlineModelResponse22 = (OfflineModelResponse) ((ActionV2Response) obj).getData();
        mapNewState = this.this$0.mapNewState(offlineModelResponse22);
        if (mapNewState != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OfflineTravelModelViewModel$downloadWidgetStates$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
