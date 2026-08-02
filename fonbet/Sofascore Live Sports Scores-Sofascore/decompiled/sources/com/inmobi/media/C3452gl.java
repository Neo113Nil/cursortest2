package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import defpackage.a70;
import defpackage.gc2;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.zu4;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.gl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3452gl extends hoi implements Function1 {
    public int a;
    public final /* synthetic */ SignalsConfig.UnifiedIdServiceConfig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3452gl(SignalsConfig.UnifiedIdServiceConfig unifiedIdServiceConfig, rq3 rq3Var) {
        super(1, rq3Var);
        this.b = unifiedIdServiceConfig;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new C3452gl(this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3452gl(this.b, (rq3) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bb, code lost:
    
        if (r1.a(r2, r12) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d2, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d0, code lost:
    
        if (r1.a(r3, r13, r12) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r13 == r0) goto L26;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            String url = this.b.getUrl();
            Hh hh = AbstractC3890xj.a;
            Ze a = new C3685pl(url, new Zk(((SignalsConfig) AbstractC3435g4.a.a(SignalsConfig.class)).getIncludeIds()), AbstractC3424fj.c, this.b.getMaxRetries(), this.b.getRetryInterval(), this.b.getTimeout()).a();
            HashMap hashMap = new HashMap();
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b("UnifiedIdNetworkCallRequested", hashMap, EnumC3943zk.SDK);
            zu4 a2 = ((F9) Ve.i.getValue()).a(a);
            C3503il.d = a2;
            this.a = 1;
            obj = a2.T(this);
        } else {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        InterfaceC3317bf interfaceC3317bf = (InterfaceC3317bf) obj;
        Objects.toString(interfaceC3317bf);
        IntRange intRange = AbstractC3446gf.a;
        interfaceC3317bf.getClass();
        gc2 d = interfaceC3317bf.d();
        Charset charset = Charsets.UTF_8;
        d.r(charset);
        C3503il c3503il = C3503il.a;
        C3503il.e = new C3581ll(interfaceC3317bf, C3503il.c);
        if (Fl.a(interfaceC3317bf)) {
            C3581ll c3581ll = C3503il.e;
            if (c3581ll != null) {
                JSONObject jSONObject = new JSONObject(interfaceC3317bf.d().r(charset));
                this.a = 2;
            }
            return Unit.a;
        }
        C3581ll c3581ll2 = C3503il.e;
        if (c3581ll2 != null) {
            int c = interfaceC3317bf.c();
            String e = interfaceC3317bf.e();
            this.a = 3;
        }
        return Unit.a;
    }
}
