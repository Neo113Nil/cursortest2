package com.unity3d.ads.core.data.datasource;

import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "active", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@il4(c = "com.unity3d.ads.core.data.datasource.AppForegroundDurationObserver$invoke$2", f = "AppForegroundDurationObserver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AppForegroundDurationObserver$invoke$2 extends hoi implements Function2<Boolean, rq3<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ AppForegroundDurationObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppForegroundDurationObserver$invoke$2(AppForegroundDurationObserver appForegroundDurationObserver, rq3<? super AppForegroundDurationObserver$invoke$2> rq3Var) {
        super(2, rq3Var);
        this.this$0 = appForegroundDurationObserver;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        AppForegroundDurationObserver$invoke$2 appForegroundDurationObserver$invoke$2 = new AppForegroundDurationObserver$invoke$2(this.this$0, rq3Var);
        appForegroundDurationObserver$invoke$2.Z$0 = ((Boolean) obj).booleanValue();
        return appForegroundDurationObserver$invoke$2;
    }

    public final Object invoke(boolean z, rq3<? super Unit> rq3Var) {
        return ((AppForegroundDurationObserver$invoke$2) create(Boolean.valueOf(z), rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        boolean z = this.Z$0;
        AppForegroundDurationObserver appForegroundDurationObserver = this.this$0;
        if (z) {
            appForegroundDurationObserver.onForeground();
        } else {
            appForegroundDurationObserver.onBackground();
        }
        return Unit.a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (rq3<? super Unit>) obj2);
    }
}
