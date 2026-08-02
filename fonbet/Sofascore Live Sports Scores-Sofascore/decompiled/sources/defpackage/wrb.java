package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wrb {
    public static final ih2 g = new ih2("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", 0);
    public final Long a;
    public final Boolean b;
    public final Integer c;
    public final Integer d;
    public final z3g e;
    public final k99 f;

    public wrb(Map map, boolean z, int i, int i2) {
        long j;
        boolean z2;
        z3g z3gVar;
        k99 k99Var;
        this.a = aik.S("timeout", map);
        this.b = aik.K("waitForReady", map);
        Integer O = aik.O("maxResponseMessageBytes", map);
        this.c = O;
        if (O != null) {
            z1a.q(O, "maxInboundMessageSize %s exceeds bounds", O.intValue() >= 0);
        }
        Integer O2 = aik.O("maxRequestMessageBytes", map);
        this.d = O2;
        if (O2 != null) {
            z1a.q(O2, "maxOutboundMessageSize %s exceeds bounds", O2.intValue() >= 0);
        }
        Map P = z ? aik.P("retryPolicy", map) : null;
        if (P == null) {
            j = 0;
            z3gVar = null;
            z2 = true;
        } else {
            Integer O3 = aik.O("maxAttempts", P);
            z1a.y(O3, "maxAttempts cannot be empty");
            int intValue = O3.intValue();
            z1a.o(intValue, "maxAttempts must be greater than 1: %s", intValue >= 2);
            int min = Math.min(intValue, i);
            Long S = aik.S("initialBackoff", P);
            z1a.y(S, "initialBackoff cannot be empty");
            long longValue = S.longValue();
            z1a.p(longValue, longValue > 0, "initialBackoffNanos must be greater than 0: %s");
            Long S2 = aik.S("maxBackoff", P);
            z1a.y(S2, "maxBackoff cannot be empty");
            long longValue2 = S2.longValue();
            j = 0;
            z2 = true;
            z1a.p(longValue2, longValue2 > 0, "maxBackoff must be greater than 0: %s");
            Double N = aik.N("backoffMultiplier", P);
            z1a.y(N, "backoffMultiplier cannot be empty");
            double doubleValue = N.doubleValue();
            z1a.q(N, "backoffMultiplier must be greater than 0: %s", doubleValue > 0.0d);
            Long S3 = aik.S("perAttemptRecvTimeout", P);
            z1a.q(S3, "perAttemptRecvTimeout cannot be negative: %s", S3 == null || S3.longValue() >= 0);
            Set L = u6h.L("retryableStatusCodes", P);
            uaa.A("retryableStatusCodes", "%s is required in retry policy", L != null);
            uaa.A("retryableStatusCodes", "%s must not contain OK", !L.contains(vei.OK));
            z1a.r("retryableStatusCodes cannot be empty without perAttemptRecvTimeout", (S3 == null && L.isEmpty()) ? false : true);
            z3gVar = new z3g(min, longValue, longValue2, doubleValue, S3, L);
        }
        this.e = z3gVar;
        Map P2 = z ? aik.P("hedgingPolicy", map) : null;
        if (P2 == null) {
            k99Var = null;
        } else {
            Integer O4 = aik.O("maxAttempts", P2);
            z1a.y(O4, "maxAttempts cannot be empty");
            int intValue2 = O4.intValue();
            z1a.o(intValue2, "maxAttempts must be greater than 1: %s", intValue2 >= 2 ? z2 : false);
            int min2 = Math.min(intValue2, i2);
            Long S4 = aik.S("hedgingDelay", P2);
            z1a.y(S4, "hedgingDelay cannot be empty");
            long longValue3 = S4.longValue();
            z1a.p(longValue3, longValue3 >= j ? z2 : false, "hedgingDelay must not be negative: %s");
            Set L2 = u6h.L("nonFatalStatusCodes", P2);
            if (L2 == null) {
                L2 = Collections.unmodifiableSet(EnumSet.noneOf(vei.class));
            } else {
                uaa.A("nonFatalStatusCodes", "%s must not contain OK", !L2.contains(vei.OK));
            }
            k99Var = new k99(min2, longValue3, L2);
        }
        this.f = k99Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wrb)) {
            return false;
        }
        wrb wrbVar = (wrb) obj;
        return sha.r(this.a, wrbVar.a) && sha.r(this.b, wrbVar.b) && sha.r(this.c, wrbVar.c) && sha.r(this.d, wrbVar.d) && sha.r(this.e, wrbVar.e) && sha.r(this.f, wrbVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.e(this.a, "timeoutNanos");
        I.e(this.b, "waitForReady");
        I.e(this.c, "maxInboundMessageSize");
        I.e(this.d, "maxOutboundMessageSize");
        I.e(this.e, "retryPolicy");
        I.e(this.f, "hedgingPolicy");
        return I.toString();
    }
}
