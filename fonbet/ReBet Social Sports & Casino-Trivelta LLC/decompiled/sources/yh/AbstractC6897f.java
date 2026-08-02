package yh;

import java.util.Objects;

/* renamed from: yh.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6897f {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC6897f f68422a = b("");

    public static g a(String str) {
        return new g(str);
    }

    public static AbstractC6897f b(String str) {
        return c(str, null, null, oh.g.empty());
    }

    public static AbstractC6897f c(String str, String str2, String str3, oh.g gVar) {
        Objects.requireNonNull(str, "name");
        Objects.requireNonNull(gVar, "attributes");
        return new C6892a(str, str2, str3, gVar);
    }

    public abstract oh.g d();

    public abstract String e();

    public abstract String f();

    public abstract String g();
}
