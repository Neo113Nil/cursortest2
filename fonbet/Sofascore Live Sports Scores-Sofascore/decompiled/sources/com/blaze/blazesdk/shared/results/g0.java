package com.blaze.blazesdk.shared.results;

import com.blaze.blazesdk.logger.InternalErrorLogId;
import com.blaze.blazesdk.shared.results.BlazeResult;
import defpackage.bf3;
import defpackage.duf;
import defpackage.fn0;
import defpackage.gfm;
import defpackage.lm5;
import defpackage.mxm;
import defpackage.yqm;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class g0 extends gfm {
    public final int a;
    public final ErrorDomain b;
    public final ErrorReason c;
    public String d;
    public final long e;
    public Throwable f;
    public Map g;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    public g0(int i, ErrorDomain errorDomain, ErrorReason errorReason, String str, DefaultConstructorMarker defaultConstructorMarker) {
        super(null);
        this.a = i;
        this.b = errorDomain;
        this.c = errorReason;
        this.d = str;
        this.e = System.currentTimeMillis();
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.g = lm5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(String str) {
        if (str != null) {
            this.d = str;
            ((mxm) this).a(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BlazeResult.Error d() {
        if (!(this instanceof mxm)) {
            return new BlazeResult.Error(null, this.b, null, null, null, null, 61, null);
        }
        return new BlazeResult.Error(Integer.valueOf(this.a), this.b, this.c, ((mxm) this).c(), this.g, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String simpleName = duf.a.getOrCreateKotlinClass(getClass()).getSimpleName();
        Class<?> enclosingClass = getClass().getEnclosingClass();
        String simpleName2 = enclosingClass != null ? enclosingClass.getSimpleName() : null;
        if (simpleName2 != null) {
            simpleName = simpleName2 + '.' + simpleName;
        }
        String c = this instanceof mxm ? ((mxm) this).c() : null;
        InternalErrorLogId b = this instanceof yqm ? ((yqm) this).b() : null;
        StringBuilder p = bf3.p(simpleName, "(statusCode=");
        p.append(this.a);
        p.append(", domain=");
        p.append(this.b);
        p.append(", reason=");
        p.append(this.c);
        p.append(", message='");
        bf3.v(p, this.d, "', publicMessage=", c, ", logId=");
        p.append(b);
        p.append(", cause=");
        p.append(this.f);
        p.append(", metadata=");
        p.append(this.g);
        p.append(", timestamp=");
        return fn0.n(p, this.e, ')');
    }
}
