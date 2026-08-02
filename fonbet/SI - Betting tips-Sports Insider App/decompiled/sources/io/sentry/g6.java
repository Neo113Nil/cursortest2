package io.sentry;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g6 {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.v f16440a;

    /* renamed from: b, reason: collision with root package name */
    public final p6 f16441b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f16442c;

    static {
        Pattern.compile("^[ \\t]*([0-9a-f]{32})-([0-9a-f]{16})(-[01])?[ \\t]*$", 2);
    }

    public g6(io.sentry.protocol.v vVar, p6 p6Var, Boolean bool) {
        this.f16440a = vVar;
        this.f16441b = p6Var;
        this.f16442c = bool;
    }

    public final String a() {
        p6 p6Var = this.f16441b;
        io.sentry.protocol.v vVar = this.f16440a;
        Boolean bool = this.f16442c;
        if (bool == null) {
            return vVar + "-" + p6Var;
        }
        return vVar + "-" + p6Var + "-" + (bool.booleanValue() ? "1" : CommonUrlParts.Values.FALSE_INTEGER);
    }
}
