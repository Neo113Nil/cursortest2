package io.sentry;

/* renamed from: io.sentry.m2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4782m2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f52192a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC4787n2 f52193b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f52194c;

    public C4782m2(String str, EnumC4787n2 enumC4787n2, Object obj) {
        this.f52192a = str;
        this.f52193b = enumC4787n2;
        this.f52194c = obj;
    }

    public static C4782m2 b(String str, Object obj) {
        return new C4782m2(str, null, obj);
    }

    public String a() {
        return this.f52192a;
    }
}
