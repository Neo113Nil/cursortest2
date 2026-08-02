package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.a70;
import defpackage.hoi;
import defpackage.j8f;
import defpackage.k8f;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.v7a;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class s extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ View u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(View view, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = view;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                s sVar = new s(this.u, rq3Var, 0);
                sVar.t = obj;
                return sVar;
            default:
                s sVar2 = new s(this.u, rq3Var, 1);
                sVar2.t = obj;
                return sVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        k8f k8fVar = (k8f) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((s) create(k8fVar, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        if (defpackage.v7a.i(r1, r3, r7) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (((defpackage.j8f) r1).e.q(r7, r8) == r0) goto L31;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k8f k8fVar;
        int i = this.r;
        final View view = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                int i3 = 2;
                if (i2 == 0) {
                    y6a.M(obj);
                    k8fVar = (k8f) this.t;
                    Boolean valueOf = Boolean.valueOf(view.isAttachedToWindow());
                    this.t = k8fVar;
                    this.s = 1;
                    break;
                } else if (i2 == 1) {
                    k8fVar = (k8f) this.t;
                    y6a.M(obj);
                } else if (i2 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    break;
                }
                r rVar = new r(k8fVar);
                view.addOnAttachStateChangeListener(rVar);
                com.moloco.sdk.internal.b bVar = new com.moloco.sdk.internal.b(i3, view, rVar);
                this.t = null;
                this.s = 2;
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    final k8f k8fVar2 = (k8f) this.t;
                    boolean z = false;
                    final Rect rect = new Rect(0, 0, 0, 0);
                    ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v0
                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                        public final boolean onPreDraw() {
                            View view2 = view;
                            ((j8f) k8f.this).d(Boolean.valueOf(view2.isShown() && view2.getGlobalVisibleRect(rect)));
                            return true;
                        }
                    };
                    view.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
                    if (view.isShown() && view.getGlobalVisibleRect(rect)) {
                        z = true;
                    }
                    j8f j8fVar = (j8f) k8fVar2;
                    j8fVar.d(Boolean.valueOf(z));
                    com.moloco.sdk.internal.b bVar2 = new com.moloco.sdk.internal.b(7, view, onPreDrawListener);
                    this.s = 1;
                    if (v7a.i(j8fVar, bVar2, this) == lu3Var2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
