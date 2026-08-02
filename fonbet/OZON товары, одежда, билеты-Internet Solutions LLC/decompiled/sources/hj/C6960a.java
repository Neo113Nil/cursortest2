package hj;

import ei0.InterfaceC6369b;
import ij.C7084a;
import kotlin.jvm.functions.Function1;
import lj.c;
import org.jetbrains.annotations.NotNull;
import pj.C8938a;

/* renamed from: hj.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6960a {

    /* renamed from: a, reason: collision with root package name */
    private static c f65567a;

    /* renamed from: b, reason: collision with root package name */
    private static C7084a f65568b;

    /* renamed from: c, reason: collision with root package name */
    private static Function1<? super Ld0.c, ? extends InterfaceC6369b> f65569c;

    @NotNull
    public static C7084a a() {
        C7084a c7084a = f65568b;
        if (c7084a != null) {
            return c7084a;
        }
        C7084a c7084a2 = new C7084a();
        f65568b = c7084a2;
        return c7084a2;
    }

    @NotNull
    public static c b() {
        c cVar = f65567a;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        f65567a = cVar2;
        return cVar2;
    }

    public static Function1 c() {
        return f65569c;
    }

    public static void d() {
        e();
        int i11 = C8938a.f81237c;
        C8938a.b("Release ApkDownloadManager");
        f65568b = null;
    }

    public static void e() {
        int i11 = C8938a.f81237c;
        C8938a.b("Release PermissionManager resources");
        c cVar = f65567a;
        if (cVar != null) {
            cVar.e();
        }
        f65567a = null;
    }

    public static void f(Function1 function1) {
        f65569c = function1;
    }
}
