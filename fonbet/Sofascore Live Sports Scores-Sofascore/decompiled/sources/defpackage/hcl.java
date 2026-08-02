package defpackage;

import com.ironsource.Ua;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class hcl {
    public boolean a;
    public UUID b;
    public lcl c;
    public final Set d;

    public hcl(Class cls) {
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        String uuid = this.b.toString();
        uuid.getClass();
        this.c = new lcl(uuid, (sbl) null, cls.getName(), (String) null, (md4) null, (md4) null, 0L, 0L, 0L, (zm3) null, 0, (zy0) null, 0L, 0L, 0L, 0L, false, (pwd) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(sub.c(1));
        ph0.S(strArr, linkedHashSet);
        this.d = linkedHashSet;
    }

    public final icl a() {
        List split$default;
        icl b = b();
        zm3 zm3Var = this.c.j;
        boolean z = !zm3Var.i.isEmpty() || zm3Var.e || zm3Var.c || zm3Var.d;
        lcl lclVar = this.c;
        if (lclVar.q) {
            if (z) {
                a70.p("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (lclVar.g > 0) {
                a70.p("Expedited jobs cannot be delayed");
                return null;
            }
        }
        String str = lclVar.x;
        if (str == null) {
            split$default = StringsKt__StringsKt.split$default(lclVar.c, new String[]{"."}, false, 0, 6, null);
            String str2 = split$default.size() == 1 ? (String) split$default.get(0) : (String) CollectionsKt.h0(split$default);
            if (str2.length() > 127) {
                str2 = iii.H(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, str2);
            }
            lclVar.x = str2;
        } else if (str.length() > 127) {
            this.c.x = iii.H(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, str);
        }
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        String uuid = randomUUID.toString();
        uuid.getClass();
        lcl lclVar2 = this.c;
        this.c = new lcl(uuid, lclVar2.b, lclVar2.c, lclVar2.d, new md4(lclVar2.e), new md4(lclVar2.f), lclVar2.g, lclVar2.h, lclVar2.i, new zm3(lclVar2.j), lclVar2.k, lclVar2.l, lclVar2.m, lclVar2.n, lclVar2.o, lclVar2.p, lclVar2.q, lclVar2.r, lclVar2.s, lclVar2.u, lclVar2.v, lclVar2.w, lclVar2.x, lclVar2.y, 524288);
        return b;
    }

    public abstract icl b();

    public abstract hcl c();

    public final hcl d(zy0 zy0Var, long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.a = true;
        lcl lclVar = this.c;
        lclVar.l = zy0Var;
        long millis = timeUnit.toMillis(j);
        if (millis > 18000000) {
            rik.o().getClass();
        }
        if (millis < Ua.s) {
            rik.o().getClass();
        }
        lclVar.m = llf.e(millis, Ua.s, 18000000L);
        return c();
    }

    public final void e() {
        pwd pwdVar = pwd.a;
        lcl lclVar = this.c;
        lclVar.q = true;
        lclVar.r = pwdVar;
    }

    public final hcl f(md4 md4Var) {
        md4Var.getClass();
        this.c.e = md4Var;
        return c();
    }
}
