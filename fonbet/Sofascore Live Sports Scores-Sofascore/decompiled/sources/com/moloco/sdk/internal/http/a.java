package com.moloco.sdk.internal.http;

import android.os.Build;
import com.moloco.sdk.internal.services.c0;
import com.moloco.sdk.internal.services.t;
import com.moloco.sdk.publisher.Moloco;
import defpackage.ak9;
import defpackage.as4;
import defpackage.bjb;
import defpackage.bs4;
import defpackage.c69;
import defpackage.cs4;
import defpackage.dl9;
import defpackage.gfk;
import defpackage.gk9;
import defpackage.kz3;
import defpackage.pm0;
import defpackage.t89;
import defpackage.zh9;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;
    public final /* synthetic */ c0 c;

    public /* synthetic */ a(t tVar, c0 c0Var, int i) {
        this.a = i;
        this.b = tVar;
        this.c = c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        c0 c0Var = this.c;
        t tVar = this.b;
        switch (i) {
            case 0:
                zh9 zh9Var = (zh9) obj;
                zh9Var.getClass();
                zh9Var.a(gfk.b, new com.appsflyer.internal.a(8));
                zh9Var.a(dl9.b, new c69(29));
                zh9Var.a(gk9.c, new c69(29));
                a aVar = new a(tVar, c0Var, 1);
                bjb bjbVar = cs4.a;
                zh9Var.a(bs4.b, new kz3(aVar, 6));
                break;
            case 1:
                as4 as4Var = (as4) obj;
                as4Var.getClass();
                a aVar2 = new a(tVar, c0Var, 2);
                pm0 pm0Var = ak9.a;
                aVar2.invoke(as4Var.a());
                break;
            default:
                t89 t89Var = (t89) obj;
                t89Var.getClass();
                t89Var.i("X-Moloco-App-Info", "AppBundle/" + tVar.a + "; AppVersion/" + tVar.b + "; AppKey/" + Moloco.INSTANCE.getAppKey$moloco_sdk_release() + ';');
                t89Var.i("X-Moloco-Device-Info", "make/" + c0Var.a + "; model/" + c0Var.b + "; hwv/" + c0Var.c + "; osv/" + Build.VERSION.RELEASE + "; OS/Android;");
                t89Var.i("X-Moloco-SDK-Info", "SdkVersion/4.10.1");
                break;
        }
        return Unit.a;
    }
}
