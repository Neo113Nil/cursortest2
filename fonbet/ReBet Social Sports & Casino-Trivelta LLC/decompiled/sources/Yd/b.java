package Yd;

import com.google.gson.Gson;
import com.google.gson.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f14149a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final Gson f14150b;

    static {
        Gson b10 = new d().j(com.google.gson.b.f38070a).d().c().b();
        Intrinsics.checkNotNullExpressionValue(b10, "create(...)");
        f14150b = b10;
    }

    public static final Gson a() {
        return f14150b;
    }
}
