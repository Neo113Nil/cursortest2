package com.inmobi.media;

import defpackage.hoi;
import defpackage.ljg;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3559l extends hoi implements Function2 {
    public final /* synthetic */ InterfaceC3880x9 a;
    public final /* synthetic */ InterfaceC3507j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3559l(InterfaceC3880x9 interfaceC3880x9, InterfaceC3507j interfaceC3507j, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = interfaceC3880x9;
        this.b = interfaceC3507j;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3559l(this.a, this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3559l(this.a, this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("AdAudioTracker", ljg.j(C3689q.h.size(), "Adding audio volume change listener. Existing listeners - "));
        }
        Iterator it = C3689q.h.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                C3689q.h.remove(weakReference);
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet = C3689q.h;
        boolean isEmpty = copyOnWriteArraySet.isEmpty();
        copyOnWriteArraySet.add(new WeakReference(this.b));
        InterfaceC3507j interfaceC3507j = this.b;
        Float f = (Float) C3689q.e.get();
        ((C3449gi) interfaceC3507j).a(f != null ? new Float(N3.a(f.floatValue() * 100.0f)) : null);
        InterfaceC3880x9 interfaceC3880x92 = this.a;
        if (isEmpty) {
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).c("AdAudioTracker", "Starting audio volume change listener");
            }
            C3689q.a(this.a);
        } else if (interfaceC3880x92 != null) {
            ((C3906y9) interfaceC3880x92).c("AdAudioTracker", "Resuming audio volume change listener");
        }
        return Unit.a;
    }
}
