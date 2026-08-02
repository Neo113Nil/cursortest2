package com.ironsource;

import com.ironsource.Ve;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.ne, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2566ne {
    private final C2727we a;
    private final Se b;
    private final C2364c9 c;

    public C2566ne(C2727we sdkInitResponse, Se se, C2364c9 c2364c9) {
        Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        this.a = sdkInitResponse;
        this.b = se;
        this.c = c2364c9;
    }

    public final M1 a() {
        return this.a.a().b().d();
    }

    public final F1 b() {
        return this.a.a().b().b();
    }

    public final L5 c() {
        return this.a.b();
    }

    public final Ve d() {
        return this.a.c();
    }

    public final Fb e() {
        return this.a.a().b().f();
    }

    public final C2364c9 f() {
        return this.c;
    }

    public final Ve.a g() {
        Ve.a i = this.a.c().i();
        Intrinsics.checkNotNullExpressionValue(i, "sdkInitResponse.fullResponse.origin");
        return i;
    }

    protected final C2727we h() {
        return this.a;
    }

    public final Se i() {
        return this.b;
    }

    public /* synthetic */ C2566ne(C2727we c2727we, Se se, C2364c9 c2364c9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2727we, (i & 2) != 0 ? null : se, (i & 4) != 0 ? null : c2364c9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2566ne(C2566ne sdkConfig) {
        this(sdkConfig.a, sdkConfig.b, sdkConfig.c);
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
    }
}
