package com.inmobi.media;

import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.vg6;
import defpackage.xw3;
import defpackage.y6a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class K7 extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ V7 b;
    public final /* synthetic */ ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K7(V7 v7, ArrayList arrayList, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = v7;
        this.c = arrayList;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new K7(this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new K7(this.b, this.c, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        K7 k7;
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            V7 v7 = this.b;
            if (!v7.f.get()) {
                v7.f.set(true);
                if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
                    ((vg6) v7.p).s(v7.B);
                } else {
                    xw3.L(v7.c, null, null, new A7(null, v7), 3);
                }
            }
            this.b.u = System.currentTimeMillis();
            V7 v72 = this.b;
            ExoPlayer exoPlayer = v72.p;
            ArrayList arrayList = this.c;
            InterfaceC3880x9 interfaceC3880x9 = v72.b;
            P2 p2 = v72.w;
            boolean isCache = v72.a.getIsCache();
            this.a = 1;
            k7 = this;
            obj = AbstractC3583ln.a(exoPlayer, arrayList, interfaceC3880x9, p2, isCache, k7);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            k7 = this;
        }
        k7.b.a((AbstractC3594m8) obj);
        return Unit.a;
    }
}
