package ru.ozon.app.android.pikazon.retry;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import V5.q;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l6.h;
import org.jetbrains.annotations.NotNull;
import rj.AbstractC9286a;
import rj.b;
import ru.ozon.app.android.pikazon.glide.thumbnail.Thumb;
import ru.ozon.app.android.pikazon.retry.utils.RetriesLogKt;
import xe.B0;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0016\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017JD\u0010\u001b\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\b\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010(\u001a\u00020&2\u0006\u0010'\u001a\u00020&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b9¨\u0006,"}, d2 = {"Lru/ozon/app/android/pikazon/retry/LostConnectionListener;", "R", "Ll6/h;", "Lrj/b;", "networkStatusTracker", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function0;", "", "retryRequest", "<init>", "(Lrj/b;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function0;)V", "", "cancelAwaitAndReturnFalse", "()Z", "LV5/q;", "e", "", "model", "Lm6/h;", "target", "isFirstResource", "onLoadFailed", "(LV5/q;Ljava/lang/Object;Lm6/h;Z)Z", "resource", "LT5/a;", "dataSource", "onResourceReady", "(Ljava/lang/Object;Ljava/lang/Object;Lm6/h;LT5/a;Z)Z", "", "toString", "()Ljava/lang/String;", "Lrj/b;", "Landroidx/lifecycle/J;", "Lkotlin/jvm/functions/Function0;", "Lxe/B0;", "awaitNetworkJob", "Lxe/B0;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "retryCount", "I", "getRetryCount", "()I", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LostConnectionListener<R> implements h<R> {
    private B0 awaitNetworkJob;

    @NotNull
    private final J lifecycleOwner;

    @NotNull
    private final b networkStatusTracker;
    private int retryCount;

    @NotNull
    private final Function0<Unit> retryRequest;

    public LostConnectionListener(@NotNull b networkStatusTracker, @NotNull J lifecycleOwner, @NotNull Function0<Unit> retryRequest) {
        Intrinsics.checkNotNullParameter(networkStatusTracker, "networkStatusTracker");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(retryRequest, "retryRequest");
        this.networkStatusTracker = networkStatusTracker;
        this.lifecycleOwner = lifecycleOwner;
        this.retryRequest = retryRequest;
    }

    private final boolean cancelAwaitAndReturnFalse() {
        B0 b02 = this.awaitNetworkJob;
        if (b02 == null) {
            return false;
        }
        b02.j(null);
        return false;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    @Override // l6.h
    public boolean onLoadFailed(q e11, Object model, @NotNull m6.h<R> target, boolean isFirstResource) {
        Intrinsics.checkNotNullParameter(target, "target");
        if (model instanceof Thumb) {
            RetriesLogKt.retriesLog("Load failed in " + this + ". Model is `Thumb`. Skip handling");
            return cancelAwaitAndReturnFalse();
        }
        if (Intrinsics.d(this.networkStatusTracker.e(), AbstractC9286a.C1429a.f83578a)) {
            RetriesLogKt.retriesLog("Load failed in " + this + ". Internet available. Skip handling");
            return cancelAwaitAndReturnFalse();
        }
        RetriesLogKt.retriesLog("Load failed in " + this + ". No internet. Begin awaiting internet connection");
        B0 b02 = this.awaitNetworkJob;
        if (b02 != null) {
            b02.j(null);
        }
        final InterfaceC2395h a11 = C5427n.a(this.networkStatusTracker.f(), this.lifecycleOwner.getLifecycle(), AbstractC5434v.b.STARTED);
        this.awaitNetworkJob = C2399j.C(new C(new C2408n0(C2399j.O(new InterfaceC2395h<AbstractC9286a>() { // from class: ru.ozon.app.android.pikazon.retry.LostConnectionListener$onLoadFailed$$inlined$filter$1

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.pikazon.retry.LostConnectionListener$onLoadFailed$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.pikazon.retry.LostConnectionListener$onLoadFailed$$inlined$filter$1$2", f = "LostConnectionListener.kt", l = {223}, m = "emit")
                /* renamed from: ru.ozon.app.android.pikazon.retry.LostConnectionListener$onLoadFailed$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, @NotNull d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (Intrinsics.d((AbstractC9286a) obj, AbstractC9286a.C1429a.f83578a)) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(@NotNull InterfaceC2397i<? super AbstractC9286a> interfaceC2397i, @NotNull d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, 1), new LostConnectionListener$onLoadFailed$2(this, null)), new LostConnectionListener$onLoadFailed$3(null)), K.a(this.lifecycleOwner));
        return false;
    }

    @Override // l6.h
    public boolean onResourceReady(@NotNull R resource, @NotNull Object model, m6.h<R> target, @NotNull T5.a dataSource, boolean isFirstResource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        RetriesLogKt.retriesLog("Resource ready in " + this + ". LostConnectionListener handles only when load failed. Skip handling");
        return cancelAwaitAndReturnFalse();
    }

    @NotNull
    public String toString() {
        String obj = super.toString();
        return Nk.a.b("LostConnectionListener@", kotlin.text.h.h0('@', obj, obj));
    }
}
