package com.inmobi.media;

import android.os.Message;
import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.l3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3563l3 extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ Z2 b;
    public final /* synthetic */ HandlerC3641o3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3563l3(Z2 z2, HandlerC3641o3 handlerC3641o3, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = z2;
        this.c = handlerC3641o3;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3563l3(this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3563l3(this.b, this.c, (rq3) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r8 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0044, code lost:
    
        if (r8 == r0) goto L20;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        int i2 = 2;
        if (i == 0) {
            y6a.M(obj);
            C3357d3 c3357d3 = (C3357d3) E3.b.getValue();
            int i3 = this.b.a;
            this.a = 1;
            Object a = c3357d3.a.a("click", "id=?", new String[]{String.valueOf(i3)}, this);
            if (a != lu3Var) {
                a = Unit.a;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                if (!((Boolean) obj).booleanValue()) {
                    E3.g.set(false);
                    return Unit.a;
                }
                Message obtain = Message.obtain();
                obtain.what = 1;
                return Boolean.valueOf(this.c.sendMessage(obtain));
            }
            y6a.M(obj);
        }
        E3.f.remove(this.b);
        if (!E3.f.isEmpty()) {
            HandlerC3641o3 handlerC3641o3 = this.c;
            Z2 z2 = (Z2) E3.f.get(0);
            int i4 = HandlerC3641o3.a;
            Message obtain2 = Message.obtain();
            if (z2 != null && z2.e) {
                i2 = 3;
            }
            obtain2.what = i2;
            obtain2.obj = z2;
            handlerC3641o3.sendMessage(obtain2);
            return Unit.a;
        }
        C3357d3 c3357d32 = (C3357d3) E3.b.getValue();
        this.a = 2;
        obj = c3357d32.a(this);
    }
}
