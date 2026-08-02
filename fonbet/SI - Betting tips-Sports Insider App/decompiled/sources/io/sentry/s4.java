package io.sentry;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s4 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17074a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f17075b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17076c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17077d;

    /* renamed from: e, reason: collision with root package name */
    public final a5 f17078e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17079f;

    /* renamed from: g, reason: collision with root package name */
    public final Callable f17080g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17081h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f17082i;

    public s4(a5 a5Var, int i5, String str, String str2, String str3, String str4, Integer num) {
        this.f17078e = a5Var;
        this.f17074a = str;
        this.f17079f = i5;
        this.f17076c = str2;
        this.f17080g = null;
        this.f17081h = str3;
        this.f17077d = str4;
        this.f17075b = num;
    }

    public final int a() {
        Callable callable = this.f17080g;
        if (callable == null) {
            return this.f17079f;
        }
        try {
            return ((Integer) callable.call()).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        String str = this.f17074a;
        if (str != null) {
            aVar.u("content_type");
            aVar.K(str);
        }
        String str2 = this.f17076c;
        if (str2 != null) {
            aVar.u("filename");
            aVar.K(str2);
        }
        aVar.u("type");
        aVar.H(iLogger, this.f17078e);
        String str3 = this.f17081h;
        if (str3 != null) {
            aVar.u("attachment_type");
            aVar.K(str3);
        }
        String str4 = this.f17077d;
        if (str4 != null) {
            aVar.u("platform");
            aVar.K(str4);
        }
        Integer num = this.f17075b;
        if (num != null) {
            aVar.u("item_count");
            aVar.J(num);
        }
        aVar.u("length");
        aVar.G(a());
        HashMap hashMap = this.f17082i;
        if (hashMap != null) {
            for (String str5 : hashMap.keySet()) {
                d9.e.u(this.f17082i, str5, aVar, str5, iLogger);
            }
        }
        aVar.o();
    }

    public s4(a5 a5Var, Callable callable, String str, String str2, String str3) {
        this(a5Var, callable, str, str2, str3, (String) null, (Integer) null);
    }

    public s4(a5 a5Var, Callable callable, String str, String str2, String str3, String str4, Integer num) {
        y4.a.C(a5Var, "type is required");
        this.f17078e = a5Var;
        this.f17074a = str;
        this.f17079f = -1;
        this.f17076c = str2;
        this.f17080g = callable;
        this.f17081h = str3;
        this.f17077d = str4;
        this.f17075b = num;
    }
}
