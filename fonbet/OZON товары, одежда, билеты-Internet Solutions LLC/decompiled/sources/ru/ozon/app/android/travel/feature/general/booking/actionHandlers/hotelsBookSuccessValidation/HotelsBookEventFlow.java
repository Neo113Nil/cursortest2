package ru.ozon.app.android.travel.feature.general.booking.actionHandlers.hotelsBookSuccessValidation;

import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.w0;
import Sc.C4005g;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ed.InterfaceC6346b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0081@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0096A¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010#\u001a\u00020 2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0096A¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0'8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020+8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-\u0088\u0001\u0003\u0092\u0001\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/actionHandlers/hotelsBookSuccessValidation/HotelsBookEventFlow;", "LAe/w0;", "", "flow", "constructor-impl", "(LAe/w0;)LAe/w0;", "", "toString-impl", "(LAe/w0;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(LAe/w0;)I", "hashCode", "", "other", "", "equals-impl", "(LAe/w0;Ljava/lang/Object;)Z", "equals", AppMeasurementSdk.ConditionalUserProperty.VALUE, "emit-impl", "(LAe/w0;Lkotlin/Unit;Lkotlin/coroutines/d;)Ljava/lang/Object;", "emit", "tryEmit-impl", "(LAe/w0;Lkotlin/Unit;)Z", "tryEmit", "resetReplayCache-impl", "(LAe/w0;)V", "resetReplayCache", "LAe/i;", "collector", "", "collect-impl", "(LAe/w0;LAe/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "collect", "LAe/w0;", "getFlow", "()LAe/w0;", "LAe/M0;", "getSubscriptionCount-impl", "(LAe/w0;)LAe/M0;", "subscriptionCount", "", "getReplayCache-impl", "(LAe/w0;)Ljava/util/List;", "replayCache", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookEventFlow implements w0<Unit> {

    @NotNull
    private final w0<Unit> flow;

    private /* synthetic */ HotelsBookEventFlow(w0 w0Var) {
        this.flow = w0Var;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ HotelsBookEventFlow m1088boximpl(w0 w0Var) {
        return new HotelsBookEventFlow(w0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: collect-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m1089collectimpl(w0<Unit> w0Var, @NotNull InterfaceC2397i<? super Unit> interfaceC2397i, @NotNull d<?> dVar) {
        HotelsBookEventFlow$collect$1 hotelsBookEventFlow$collect$1;
        int i11;
        if (dVar instanceof HotelsBookEventFlow$collect$1) {
            hotelsBookEventFlow$collect$1 = (HotelsBookEventFlow$collect$1) dVar;
            int i12 = hotelsBookEventFlow$collect$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hotelsBookEventFlow$collect$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = hotelsBookEventFlow$collect$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = hotelsBookEventFlow$collect$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    hotelsBookEventFlow$collect$1.label = 1;
                    if (w0Var.collect(interfaceC2397i, hotelsBookEventFlow$collect$1) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                throw new C4005g();
            }
        }
        hotelsBookEventFlow$collect$1 = new HotelsBookEventFlow$collect$1(dVar);
        Object obj2 = hotelsBookEventFlow$collect$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = hotelsBookEventFlow$collect$1.label;
        if (i11 != 0) {
        }
        throw new C4005g();
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static w0<Unit> m1090constructorimpl(@NotNull w0<Unit> flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        return flow;
    }

    /* renamed from: emit-impl, reason: not valid java name */
    public static Object m1091emitimpl(w0<Unit> w0Var, @NotNull Unit unit, @NotNull d<? super Unit> dVar) {
        Object emit = w0Var.emit(unit, dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1092equalsimpl(w0<Unit> w0Var, Object obj) {
        return (obj instanceof HotelsBookEventFlow) && Intrinsics.d(w0Var, ((HotelsBookEventFlow) obj).getFlow());
    }

    @NotNull
    /* renamed from: getReplayCache-impl, reason: not valid java name */
    public static List<Unit> m1093getReplayCacheimpl(w0<Unit> w0Var) {
        return w0Var.getReplayCache();
    }

    @NotNull
    /* renamed from: getSubscriptionCount-impl, reason: not valid java name */
    public static M0<Integer> m1094getSubscriptionCountimpl(w0<Unit> w0Var) {
        return w0Var.getSubscriptionCount();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1095hashCodeimpl(w0<Unit> w0Var) {
        return w0Var.hashCode();
    }

    /* renamed from: resetReplayCache-impl, reason: not valid java name */
    public static void m1096resetReplayCacheimpl(w0<Unit> w0Var) {
        w0Var.resetReplayCache();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1097toStringimpl(w0<Unit> w0Var) {
        return "HotelsBookEventFlow(flow=" + w0Var + ")";
    }

    /* renamed from: tryEmit-impl, reason: not valid java name */
    public static boolean m1098tryEmitimpl(w0<Unit> w0Var, @NotNull Unit value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return w0Var.tryEmit(value);
    }

    @Override // Ae.InterfaceC2395h
    public Object collect(@NotNull InterfaceC2397i<? super Unit> interfaceC2397i, @NotNull d<?> dVar) {
        return m1089collectimpl(this.flow, interfaceC2397i, dVar);
    }

    public Object emit(@NotNull Unit unit, @NotNull d<? super Unit> dVar) {
        return m1091emitimpl(this.flow, unit, dVar);
    }

    public boolean equals(Object obj) {
        return m1092equalsimpl(this.flow, obj);
    }

    @Override // Ae.B0
    @NotNull
    public List<Unit> getReplayCache() {
        return m1093getReplayCacheimpl(this.flow);
    }

    @Override // Ae.w0
    @NotNull
    public M0<Integer> getSubscriptionCount() {
        return m1094getSubscriptionCountimpl(this.flow);
    }

    public int hashCode() {
        return m1095hashCodeimpl(this.flow);
    }

    @Override // Ae.w0
    public void resetReplayCache() {
        m1096resetReplayCacheimpl(this.flow);
    }

    public String toString() {
        return m1097toStringimpl(this.flow);
    }

    @Override // Ae.w0
    public boolean tryEmit(@NotNull Unit value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return m1098tryEmitimpl(this.flow, value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ w0 getFlow() {
        return this.flow;
    }

    @Override // Ae.w0, Ae.InterfaceC2397i
    public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
        return emit((Unit) obj, (d<? super Unit>) dVar);
    }
}
