package com.inmobi.media;

import android.content.Context;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3611n extends hoi implements Function2 {
    public final /* synthetic */ InterfaceC3880x9 a;
    public final /* synthetic */ InterfaceC3507j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3611n(InterfaceC3880x9 interfaceC3880x9, InterfaceC3507j interfaceC3507j, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = interfaceC3880x9;
        this.b = interfaceC3507j;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3611n(this.a, this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3611n(this.a, this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("AdAudioTracker", "Removing audio volume change listener");
        }
        CopyOnWriteArraySet copyOnWriteArraySet = C3689q.h;
        InterfaceC3507j interfaceC3507j = this.b;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (Intrinsics.c(weakReference.get(), interfaceC3507j)) {
                C3689q.h.remove(weakReference);
            }
        }
        if (C3689q.h.isEmpty()) {
            InterfaceC3880x9 interfaceC3880x92 = this.a;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).c("AdAudioTracker", "Stopping audio volume change listener");
            }
            InterfaceC3880x9 interfaceC3880x93 = this.a;
            Context context = AbstractC3424fj.a;
            if (context == null) {
                if (interfaceC3880x93 != null) {
                    ((C3906y9) interfaceC3880x93).b("AdAudioTracker", "Context is null. Cannot stop audio volume tracking");
                }
                C3689q.a((Float) null);
            } else if (C3689q.d.compareAndSet(true, false)) {
                if (interfaceC3880x93 != null) {
                    ((C3906y9) interfaceC3880x93).c("AdAudioTracker", "Stopping audio volume tracking");
                }
                C3689q.a(context, interfaceC3880x93);
            } else if (interfaceC3880x93 != null) {
                ((C3906y9) interfaceC3880x93).c("AdAudioTracker", "Audio volume tracking is already stopped");
            }
        }
        return Unit.a;
    }
}
