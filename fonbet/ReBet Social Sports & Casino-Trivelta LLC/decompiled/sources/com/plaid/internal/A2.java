package com.plaid.internal;

import com.plaid.internal.C3556a6;
import com.plaid.link.event.LinkEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.DelayQueue;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nLinkEventQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkEventQueue.kt\ncom/plaid/internal/event/LinkEventQueue\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n13309#2,2:103\n1855#3,2:105\n*S KotlinDebug\n*F\n+ 1 LinkEventQueue.kt\ncom/plaid/internal/event/LinkEventQueue\n*L\n46#1:103,2\n74#1:105,2\n*E\n"})
/* loaded from: classes3.dex */
public final class A2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final DelayQueue<DelayedC3793y0> f39148a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<LinkEvent> f39149b;

    public A2() {
        this(null);
    }

    public final void a(@NotNull LinkEvent event, int i10) {
        Intrinsics.checkNotNullParameter(event, "event");
        C3556a6.a.a(C3556a6.f39823a, "putting: " + event.getEventName() + " for " + i10);
        this.f39148a.put((DelayQueue<DelayedC3793y0>) new DelayedC3793y0(event, i10));
    }

    public final void b(Function1<? super LinkEvent, Unit> function1) {
        synchronized (this.f39149b) {
            try {
                List<LinkEvent> list = this.f39149b;
                C3556a6.a.a(C3556a6.f39823a, "flushing " + list.size() + " events");
                for (LinkEvent linkEvent : list) {
                    if (function1 != null) {
                        function1.invoke(linkEvent);
                    } else {
                        a(linkEvent, -1);
                    }
                }
                list.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public A2(Object obj) {
        DelayQueue<DelayedC3793y0> delayable = new DelayQueue<>();
        List<LinkEvent> enqueable = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(enqueable, "synchronizedList(...)");
        Intrinsics.checkNotNullParameter(delayable, "delayable");
        Intrinsics.checkNotNullParameter(enqueable, "enqueable");
        this.f39148a = delayable;
        this.f39149b = enqueable;
    }

    public final void a(@NotNull Function1<? super LinkEvent, Unit> deliver) {
        Intrinsics.checkNotNullParameter(deliver, "deliver");
        b(deliver);
        Object[] array = this.f39148a.toArray();
        this.f39148a.clear();
        Intrinsics.checkNotNull(array);
        ArraysKt.sort(array);
        C3556a6.a.a(C3556a6.f39823a, "draining: " + array.length + " events");
        for (Object obj : array) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.plaid.internal.event.DelayedLinkEvent");
            deliver.invoke(((DelayedC3793y0) obj).a());
        }
    }

    public final void a(@NotNull LinkEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        synchronized (this.f39149b) {
            C3556a6.a.a(C3556a6.f39823a, "enqueueing: " + event.getEventName(), new Object[]{""});
            this.f39149b.add(event);
        }
    }
}
