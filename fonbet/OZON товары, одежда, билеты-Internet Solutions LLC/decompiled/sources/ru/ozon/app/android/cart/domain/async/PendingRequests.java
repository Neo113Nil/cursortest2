package ru.ozon.app.android.cart.domain.async;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Je.InterfaceC3394a;
import Je.e;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t0\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R#\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00178\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010 \u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/cart/domain/async/PendingRequests;", "", "<init>", "()V", "Lru/ozon/app/android/cart/domain/async/UiAction;", "it", "putRequest", "(Lru/ozon/app/android/cart/domain/async/UiAction;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "", "", "getRequest", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "resetInProgress", "LJe/a;", "mutex", "LJe/a;", "LAe/x0;", "_requests", "LAe/x0;", "", "_inProcess", "LAe/M0;", "requests", "LAe/M0;", "getRequests", "()LAe/M0;", "inProcess", "getInProcess", "getHasPending", "()Z", "hasPending", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PendingRequests {

    @NotNull
    private final x0<Boolean> _inProcess;

    @NotNull
    private final x0<List<UiAction>> _requests;

    @NotNull
    private final M0<Boolean> inProcess;

    @NotNull
    private final InterfaceC3394a mutex = e.a();

    @NotNull
    private final M0<List<UiAction>> requests;

    public PendingRequests() {
        x0<List<UiAction>> a11 = O0.a(K.f71697a);
        this._requests = a11;
        x0<Boolean> a12 = O0.a(Boolean.FALSE);
        this._inProcess = a12;
        this.requests = C2399j.b(a11);
        this.inProcess = C2399j.b(a12);
    }

    public final boolean getHasPending() {
        return !this._requests.getValue().isEmpty();
    }

    @NotNull
    public final M0<Boolean> getInProcess() {
        return this.inProcess;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0079 A[Catch: all -> 0x0087, LOOP:0: B:13:0x0073->B:15:0x0079, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x0087, blocks: (B:12:0x004c, B:13:0x0073, B:15:0x0079), top: B:11:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getRequest(@NotNull d<? super List<? extends Map<String, ? extends Object>>> dVar) {
        PendingRequests$getRequest$1 pendingRequests$getRequest$1;
        int i11;
        PendingRequests pendingRequests;
        InterfaceC3394a interfaceC3394a;
        Iterator<T> it;
        try {
            if (dVar instanceof PendingRequests$getRequest$1) {
                pendingRequests$getRequest$1 = (PendingRequests$getRequest$1) dVar;
                int i12 = pendingRequests$getRequest$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    pendingRequests$getRequest$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = pendingRequests$getRequest$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = pendingRequests$getRequest$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        InterfaceC3394a interfaceC3394a2 = this.mutex;
                        pendingRequests$getRequest$1.L$0 = this;
                        pendingRequests$getRequest$1.L$1 = interfaceC3394a2;
                        pendingRequests$getRequest$1.label = 1;
                        if (interfaceC3394a2.a(pendingRequests$getRequest$1) == aVar) {
                            return aVar;
                        }
                        pendingRequests = this;
                        interfaceC3394a = interfaceC3394a2;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC3394a = (InterfaceC3394a) pendingRequests$getRequest$1.L$1;
                        pendingRequests = (PendingRequests) pendingRequests$getRequest$1.L$0;
                        s.b(obj);
                    }
                    List<UiAction> value = pendingRequests._requests.getValue();
                    pendingRequests._requests.setValue(K.f71697a);
                    pendingRequests._inProcess.setValue(Boolean.TRUE);
                    List<UiAction> list = value;
                    ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((UiAction) it.next()).getPayloads());
                    }
                    return arrayList;
                }
            }
            List<UiAction> value2 = pendingRequests._requests.getValue();
            pendingRequests._requests.setValue(K.f71697a);
            pendingRequests._inProcess.setValue(Boolean.TRUE);
            List<UiAction> list2 = value2;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
            }
            return arrayList2;
        } finally {
            interfaceC3394a.c(null);
        }
        pendingRequests$getRequest$1 = new PendingRequests$getRequest$1(this, dVar);
        Object obj2 = pendingRequests$getRequest$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = pendingRequests$getRequest$1.label;
        if (i11 != 0) {
        }
    }

    @NotNull
    public final M0<List<UiAction>> getRequests() {
        return this.requests;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object putRequest(@NotNull UiAction uiAction, @NotNull d<? super UiAction> dVar) {
        PendingRequests$putRequest$1 pendingRequests$putRequest$1;
        int i11;
        InterfaceC3394a interfaceC3394a;
        PendingRequests pendingRequests;
        try {
            if (dVar instanceof PendingRequests$putRequest$1) {
                pendingRequests$putRequest$1 = (PendingRequests$putRequest$1) dVar;
                int i12 = pendingRequests$putRequest$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    pendingRequests$putRequest$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = pendingRequests$putRequest$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = pendingRequests$putRequest$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        interfaceC3394a = this.mutex;
                        pendingRequests$putRequest$1.L$0 = this;
                        pendingRequests$putRequest$1.L$1 = uiAction;
                        pendingRequests$putRequest$1.L$2 = interfaceC3394a;
                        pendingRequests$putRequest$1.label = 1;
                        if (interfaceC3394a.a(pendingRequests$putRequest$1) == aVar) {
                            return aVar;
                        }
                        pendingRequests = this;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        InterfaceC3394a interfaceC3394a2 = (InterfaceC3394a) pendingRequests$putRequest$1.L$2;
                        UiAction uiAction2 = (UiAction) pendingRequests$putRequest$1.L$1;
                        pendingRequests = (PendingRequests) pendingRequests$putRequest$1.L$0;
                        s.b(obj);
                        interfaceC3394a = interfaceC3394a2;
                        uiAction = uiAction2;
                    }
                    x0<List<UiAction>> x0Var = pendingRequests._requests;
                    x0Var.setValue(C7714v.q0(uiAction, x0Var.getValue()));
                    return uiAction;
                }
            }
            x0<List<UiAction>> x0Var2 = pendingRequests._requests;
            x0Var2.setValue(C7714v.q0(uiAction, x0Var2.getValue()));
            return uiAction;
        } finally {
            interfaceC3394a.c(null);
        }
        pendingRequests$putRequest$1 = new PendingRequests$putRequest$1(this, dVar);
        Object obj2 = pendingRequests$putRequest$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = pendingRequests$putRequest$1.label;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object resetInProgress(@NotNull d<? super Unit> dVar) {
        PendingRequests$resetInProgress$1 pendingRequests$resetInProgress$1;
        int i11;
        PendingRequests pendingRequests;
        InterfaceC3394a interfaceC3394a;
        try {
            if (dVar instanceof PendingRequests$resetInProgress$1) {
                pendingRequests$resetInProgress$1 = (PendingRequests$resetInProgress$1) dVar;
                int i12 = pendingRequests$resetInProgress$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    pendingRequests$resetInProgress$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = pendingRequests$resetInProgress$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = pendingRequests$resetInProgress$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        InterfaceC3394a interfaceC3394a2 = this.mutex;
                        pendingRequests$resetInProgress$1.L$0 = this;
                        pendingRequests$resetInProgress$1.L$1 = interfaceC3394a2;
                        pendingRequests$resetInProgress$1.label = 1;
                        if (interfaceC3394a2.a(pendingRequests$resetInProgress$1) == aVar) {
                            return aVar;
                        }
                        pendingRequests = this;
                        interfaceC3394a = interfaceC3394a2;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC3394a = (InterfaceC3394a) pendingRequests$resetInProgress$1.L$1;
                        pendingRequests = (PendingRequests) pendingRequests$resetInProgress$1.L$0;
                        s.b(obj);
                    }
                    pendingRequests._inProcess.setValue(Boolean.FALSE);
                    return Unit.f71690a;
                }
            }
            pendingRequests._inProcess.setValue(Boolean.FALSE);
            return Unit.f71690a;
        } finally {
            interfaceC3394a.c(null);
        }
        pendingRequests$resetInProgress$1 = new PendingRequests$resetInProgress$1(this, dVar);
        Object obj2 = pendingRequests$resetInProgress$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = pendingRequests$resetInProgress$1.label;
        if (i11 != 0) {
        }
    }
}
