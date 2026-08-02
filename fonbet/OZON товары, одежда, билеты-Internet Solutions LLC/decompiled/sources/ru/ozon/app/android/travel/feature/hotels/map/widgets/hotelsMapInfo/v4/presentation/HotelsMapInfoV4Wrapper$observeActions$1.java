package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Sc.o;
import Sc.r;
import Sc.s;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.ThrowableExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4Wrapper$observeActions$1", f = "HotelsMapInfoV4Wrapper.kt", l = {156}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsMapInfoV4Wrapper$observeActions$1 extends j implements Function2<M, d<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ HotelsMapInfoV4Wrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4Wrapper$observeActions$1(HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper, d<? super HotelsMapInfoV4Wrapper$observeActions$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsMapInfoV4Wrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelsMapInfoV4Wrapper$observeActions$1 hotelsMapInfoV4Wrapper$observeActions$1 = new HotelsMapInfoV4Wrapper$observeActions$1(this.this$0, dVar);
        hotelsMapInfoV4Wrapper$observeActions$1.L$0 = obj;
        return hotelsMapInfoV4Wrapper$observeActions$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0100 A[Catch: all -> 0x0019, CancellationException -> 0x001c, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x001c, all -> 0x0019, blocks: (B:6:0x0015, B:7:0x004f, B:9:0x0057, B:11:0x0061, B:12:0x0040, B:16:0x0067, B:18:0x006b, B:19:0x0071, B:21:0x0075, B:22:0x007b, B:24:0x007f, B:25:0x0085, B:27:0x0089, B:28:0x0093, B:30:0x0097, B:31:0x009d, B:33:0x00a1, B:34:0x00a7, B:36:0x00ab, B:37:0x00b1, B:39:0x00b5, B:40:0x00bb, B:42:0x00bf, B:43:0x00c6, B:45:0x00ca, B:46:0x00d9, B:48:0x00dd, B:49:0x00e4, B:51:0x00e8, B:52:0x00ed, B:54:0x00f5, B:55:0x00fa, B:56:0x00ff, B:57:0x0100, B:66:0x0031), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057 A[Catch: all -> 0x0019, CancellationException -> 0x001c, TryCatch #2 {CancellationException -> 0x001c, all -> 0x0019, blocks: (B:6:0x0015, B:7:0x004f, B:9:0x0057, B:11:0x0061, B:12:0x0040, B:16:0x0067, B:18:0x006b, B:19:0x0071, B:21:0x0075, B:22:0x007b, B:24:0x007f, B:25:0x0085, B:27:0x0089, B:28:0x0093, B:30:0x0097, B:31:0x009d, B:33:0x00a1, B:34:0x00a7, B:36:0x00ab, B:37:0x00b1, B:39:0x00b5, B:40:0x00bb, B:42:0x00bf, B:43:0x00c6, B:45:0x00ca, B:46:0x00d9, B:48:0x00dd, B:49:0x00e4, B:51:0x00e8, B:52:0x00ed, B:54:0x00f5, B:55:0x00fa, B:56:0x00ff, B:57:0x0100, B:66:0x0031), top: B:2:0x0005 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004c -> B:7:0x004f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        M m11;
        ze.j<MapAction> it;
        HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper;
        Function1 function1;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            m11 = (M) this.L$0;
            HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper2 = this.this$0;
            r.Companion companion2 = r.INSTANCE;
            it = hotelsMapInfoV4Wrapper2.viewModel.actions().iterator();
            hotelsMapInfoV4Wrapper = hotelsMapInfoV4Wrapper2;
            this.L$0 = m11;
            this.L$1 = hotelsMapInfoV4Wrapper;
            this.L$2 = it;
            this.label = 1;
            obj = it.b(this);
            if (obj == aVar) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (ze.j) this.L$2;
            hotelsMapInfoV4Wrapper = (HotelsMapInfoV4Wrapper) this.L$1;
            m11 = (M) this.L$0;
            s.b(obj);
            if (((Boolean) obj).booleanValue()) {
                MapAction next = it.next();
                if (next instanceof MapAction.InitState) {
                    hotelsMapInfoV4Wrapper.bind((MapAction.InitState) next);
                } else if (next instanceof MapAction.RefreshState) {
                    hotelsMapInfoV4Wrapper.refreshState((MapAction.RefreshState) next);
                } else if (next instanceof MapAction.Move) {
                    hotelsMapInfoV4Wrapper.moveCamera((MapAction.Move) next);
                } else if (next instanceof MapAction.DrawPins) {
                    hotelsMapInfoV4Wrapper.drawPins((MapAction.DrawPins) next);
                } else if (next instanceof MapAction.UpdateInsets) {
                    hotelsMapInfoV4Wrapper.updateInsets(((MapAction.UpdateInsets) next).getInsets());
                } else if (next instanceof MapAction.ToggleCard) {
                    hotelsMapInfoV4Wrapper.toggleCard((MapAction.ToggleCard) next);
                } else if (next instanceof MapAction.UpdatePin) {
                    hotelsMapInfoV4Wrapper.updatePin((MapAction.UpdatePin) next);
                } else if (next instanceof MapAction.TogglePolygons) {
                    hotelsMapInfoV4Wrapper.togglePolygons((MapAction.TogglePolygons) next);
                } else if (next instanceof MapAction.TogglePolygonsPanel) {
                    hotelsMapInfoV4Wrapper.togglePolygonsPanel((MapAction.TogglePolygonsPanel) next);
                } else if (next instanceof MapAction.ToggleNotification) {
                    hotelsMapInfoV4Wrapper.toggleNotification((MapAction.ToggleNotification) next);
                } else if (next instanceof MapAction.PerformAction) {
                    function1 = hotelsMapInfoV4Wrapper.actionHandler;
                    function1.invoke(((MapAction.PerformAction) next).getAtomAction());
                } else if (next instanceof MapAction.ToggleLoader) {
                    hotelsMapInfoV4Wrapper.toggleLoader((MapAction.ToggleLoader) next);
                } else if (next instanceof MapAction.ShowErrorNotification) {
                    hotelsMapInfoV4Wrapper.showErrorNotification();
                } else {
                    if (!Intrinsics.d(next, MapAction.HideDistricts.INSTANCE)) {
                        throw new o();
                    }
                    hotelsMapInfoV4Wrapper.hideDistricts();
                }
                this.L$0 = m11;
                this.L$1 = hotelsMapInfoV4Wrapper;
                this.L$2 = it;
                this.label = 1;
                obj = it.b(this);
                if (obj == aVar) {
                    return aVar;
                }
                if (((Boolean) obj).booleanValue()) {
                    a11 = Unit.f71690a;
                    r.Companion companion3 = r.INSTANCE;
                    Throwable b11 = r.b(a11);
                    if (b11 != null) {
                        ThrowableExtKt.log(b11, m11.getClass().getSimpleName().concat("_observeActions"));
                    }
                    return Unit.f71690a;
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsMapInfoV4Wrapper$observeActions$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
