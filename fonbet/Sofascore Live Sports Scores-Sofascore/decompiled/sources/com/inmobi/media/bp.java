package com.inmobi.media;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.inmobi.media.bp;
import defpackage.a70;
import defpackage.bsk;
import defpackage.hoi;
import defpackage.j8f;
import defpackage.k8f;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.v7a;
import defpackage.wel;
import defpackage.y6a;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class bp extends hoi implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(ViewGroup viewGroup, rq3 rq3Var) {
        super(2, rq3Var);
        this.c = viewGroup;
    }

    public static final void a(k8f k8fVar, boolean z) {
        ((j8f) k8fVar).d(Boolean.valueOf(z));
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        bp bpVar = new bp(this.c, rq3Var);
        bpVar.b = obj;
        return bpVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        bp bpVar = new bp(this.c, (rq3) obj2);
        bpVar.b = (k8f) obj;
        return bpVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            final k8f k8fVar = (k8f) this.b;
            ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: hyl
                @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                public final void onWindowFocusChanged(boolean z) {
                    bp.a(k8f.this, z);
                }
            };
            this.c.getViewTreeObserver().addOnWindowFocusChangeListener(onWindowFocusChangeListener);
            ViewGroup viewGroup = this.c;
            WeakHashMap weakHashMap = bsk.a;
            if (viewGroup.isAttachedToWindow()) {
                viewGroup.addOnAttachStateChangeListener(new ap(viewGroup, viewGroup, onWindowFocusChangeListener));
            } else {
                viewGroup.getViewTreeObserver().removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
            }
            wel welVar = new wel(14);
            this.a = 1;
            if (v7a.i(k8fVar, welVar, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    public static final Unit a() {
        return Unit.a;
    }
}
