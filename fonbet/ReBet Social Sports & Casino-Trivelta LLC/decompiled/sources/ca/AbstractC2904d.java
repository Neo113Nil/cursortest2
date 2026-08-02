package ca;

import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.Scope;

/* renamed from: ca.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2904d {

    /* renamed from: a, reason: collision with root package name */
    public static final C3117a.g f27636a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3117a.g f27637b;

    /* renamed from: c, reason: collision with root package name */
    public static final C3117a.AbstractC0488a f27638c;

    /* renamed from: d, reason: collision with root package name */
    public static final C3117a.AbstractC0488a f27639d;

    /* renamed from: e, reason: collision with root package name */
    public static final Scope f27640e;

    /* renamed from: f, reason: collision with root package name */
    public static final Scope f27641f;

    /* renamed from: g, reason: collision with root package name */
    public static final C3117a f27642g;

    /* renamed from: h, reason: collision with root package name */
    public static final C3117a f27643h;

    static {
        C3117a.g gVar = new C3117a.g();
        f27636a = gVar;
        C3117a.g gVar2 = new C3117a.g();
        f27637b = gVar2;
        C2902b c2902b = new C2902b();
        f27638c = c2902b;
        C2903c c2903c = new C2903c();
        f27639d = c2903c;
        f27640e = new Scope("profile");
        f27641f = new Scope("email");
        f27642g = new C3117a("SignIn.API", c2902b, gVar);
        f27643h = new C3117a("SignIn.INTERNAL_API", c2903c, gVar2);
    }
}
