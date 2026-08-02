package io.sentry;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class L3 {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f50442d = Pattern.compile("^[ \\t]*([0-9a-f]{32})-([0-9a-f]{16})(-[01])?[ \\t]*$", 2);

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.u f50443a;

    /* renamed from: b, reason: collision with root package name */
    public final d4 f50444b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f50445c;

    public L3(io.sentry.protocol.u uVar, d4 d4Var, Boolean bool) {
        this.f50443a = uVar;
        this.f50444b = d4Var;
        this.f50445c = bool;
    }

    public d4 a() {
        return this.f50444b;
    }

    public io.sentry.protocol.u b() {
        return this.f50443a;
    }

    public String c() {
        Boolean bool = this.f50445c;
        if (bool != null) {
            return String.format("%s-%s-%s", this.f50443a, this.f50444b, bool.booleanValue() ? "1" : "0");
        }
        return String.format("%s-%s", this.f50443a, this.f50444b);
    }

    public Boolean d() {
        return this.f50445c;
    }

    public L3(String str) {
        Matcher matcher = f50442d.matcher(str);
        if (matcher.matches()) {
            this.f50443a = new io.sentry.protocol.u(matcher.group(1));
            this.f50444b = new d4(matcher.group(2));
            String group = matcher.group(3);
            this.f50445c = group == null ? null : Boolean.valueOf("1".equals(group.substring(1)));
            return;
        }
        throw new io.sentry.exception.b(str);
    }
}
