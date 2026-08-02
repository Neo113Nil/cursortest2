package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import zb.C6954b;
import zb.InterfaceC6953a;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final long f37827b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f37828c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static p f37829d;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6953a f37830a;

    public p(InterfaceC6953a interfaceC6953a) {
        this.f37830a = interfaceC6953a;
    }

    public static p c() {
        return d(C6954b.b());
    }

    public static p d(InterfaceC6953a interfaceC6953a) {
        if (f37829d == null) {
            f37829d = new p(interfaceC6953a);
        }
        return f37829d;
    }

    public static boolean g(String str) {
        return f37828c.matcher(str).matches();
    }

    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f37830a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(xb.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f37827b;
    }
}
