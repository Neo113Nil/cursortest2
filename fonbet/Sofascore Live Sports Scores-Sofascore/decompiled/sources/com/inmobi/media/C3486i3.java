package com.inmobi.media;

import android.os.Message;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.a70;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.i3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3486i3 extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ C3357d3 b;
    public final /* synthetic */ HandlerC3641o3 c;
    public final /* synthetic */ AdConfig.ImaiConfig d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3486i3(C3357d3 c3357d3, HandlerC3641o3 handlerC3641o3, AdConfig.ImaiConfig imaiConfig, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = c3357d3;
        this.c = handlerC3641o3;
        this.d = imaiConfig;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3486i3(this.b, this.c, this.d, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3486i3) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            C3357d3 c3357d3 = this.b;
            this.a = 1;
            obj = c3357d3.a(this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            E3.g.set(false);
            return Unit.a;
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        return Boolean.valueOf(this.c.sendMessageDelayed(obtain, this.d.getPingInterval() * 1000));
    }
}
