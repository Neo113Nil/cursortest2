package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Dl {

    /* renamed from: a, reason: collision with root package name */
    public final String f12163a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12164b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f12165c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f12166d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12167e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f12168f;

    public Dl(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f12163a = str;
        this.f12164b = str2;
        this.f12165c = num;
        this.f12166d = num2;
        this.f12167e = str3;
        this.f12168f = bool;
    }

    public Dl(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
