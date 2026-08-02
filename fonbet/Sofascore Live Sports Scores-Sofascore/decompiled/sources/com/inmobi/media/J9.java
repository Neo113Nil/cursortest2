package com.inmobi.media;

import android.content.Context;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.ok3;
import defpackage.rq3;
import defpackage.td4;
import defpackage.xw3;
import defpackage.y6a;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class J9 extends hoi implements Function1 {
    public int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ SdkInitializationListener d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J9(Context context, String str, SdkInitializationListener sdkInitializationListener, long j, rq3 rq3Var) {
        super(1, rq3Var);
        this.b = context;
        this.c = str;
        this.d = sdkInitializationListener;
        this.e = j;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new J9(this.b, this.c, this.d, this.e, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((J9) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        try {
            if (i == 0) {
                y6a.M(obj);
                C3892xl.a(this.b);
                Context context = AbstractC3424fj.a;
                if (context != null) {
                    File file = new File(context.getFilesDir(), "im_cached_content");
                    if (!file.mkdir()) {
                        file.isDirectory();
                    }
                }
                ok3.J(new C3866wl(null));
                String str = this.c;
                str.getClass();
                Context context2 = AbstractC3424fj.a;
                if (context2 != null) {
                    ConcurrentHashMap concurrentHashMap = Qa.b;
                    Pa.a(context2, "coppa_store").a("im_accid", str, false);
                }
                Context context3 = this.b;
                this.a = 1;
                if (td4.t0(kotlin.coroutines.g.a, new C3840vl(context3, null)) == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
            }
            AbstractC3424fj.i = 2;
            InMobiSdk inMobiSdk = InMobiSdk.INSTANCE;
            InMobiSdk.access$provideCallback(inMobiSdk, this.d, null);
            C3422fh.a.getClass();
            xw3.L(L9.e, null, null, new C3319bh(null), 3);
            Map access$prepareTelemetryPayload = InMobiSdk.access$prepareTelemetryPayload(inMobiSdk, this.e);
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b("SdkInitialized", access$prepareTelemetryPayload, EnumC3943zk.SDK);
            InMobiUnifiedIdService.push(C3490i7.b);
        } catch (Exception e) {
            InMobiSdk.access$getTAG$p().getClass();
            e.getMessage();
            AbstractC3424fj.c = null;
            AbstractC3424fj.a = null;
            AbstractC3424fj.i = 3;
            InMobiSdk.access$provideCallback(InMobiSdk.INSTANCE, this.d, "SDK could not be initialized; an unexpected error was encountered.");
        }
        return Unit.a;
    }
}
