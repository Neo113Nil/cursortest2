package com.unity3d.ads.core.domain.events;

import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.s3q0;
import xsna.spj;

/* compiled from: EventObservers.kt */
/* loaded from: classes14.dex */
public final class EventObservers {
    private final DiagnosticEventObserver diagnosticEventObserver;
    private final OperativeEventObserver operativeEventObserver;
    private final TransactionEventObserver transactionEventObserver;

    public EventObservers(OperativeEventObserver operativeEventObserver, DiagnosticEventObserver diagnosticEventObserver, TransactionEventObserver transactionEventObserver) {
        this.operativeEventObserver = operativeEventObserver;
        this.diagnosticEventObserver = diagnosticEventObserver;
        this.transactionEventObserver = transactionEventObserver;
    }

    public final DiagnosticEventObserver getDiagnosticEventObserver() {
        return this.diagnosticEventObserver;
    }

    public final OperativeEventObserver getOperativeEventObserver() {
        return this.operativeEventObserver;
    }

    public final TransactionEventObserver getTransactionEventObserver() {
        return this.transactionEventObserver;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r6.invoke(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r6.invoke(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(spj<? super s3q0> spjVar) {
        EventObservers$invoke$1 eventObservers$invoke$1;
        int i;
        if (spjVar instanceof EventObservers$invoke$1) {
            eventObservers$invoke$1 = (EventObservers$invoke$1) spjVar;
            int i2 = eventObservers$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eventObservers$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eventObservers$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eventObservers$invoke$1.label;
                if (i != 0) {
                    a.a(obj);
                    OperativeEventObserver operativeEventObserver = this.operativeEventObserver;
                    eventObservers$invoke$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a.a(obj);
                        this.transactionEventObserver.invoke();
                        return s3q0.a;
                    }
                    a.a(obj);
                }
                DiagnosticEventObserver diagnosticEventObserver = this.diagnosticEventObserver;
                eventObservers$invoke$1.label = 2;
            }
        }
        eventObservers$invoke$1 = new EventObservers$invoke$1(this, spjVar);
        Object obj2 = eventObservers$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eventObservers$invoke$1.label;
        if (i != 0) {
        }
        DiagnosticEventObserver diagnosticEventObserver2 = this.diagnosticEventObserver;
        eventObservers$invoke$1.label = 2;
    }
}
