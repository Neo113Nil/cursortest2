package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.d4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4032d4 implements InterfaceC4285r7 {

    @NotNull
    private final String a;

    @NotNull
    private final String b;
    private final boolean c;

    @NotNull
    private final C4005bd d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C4032d4(String str, String str2, boolean z, C4005bd c4005bd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new C4005bd(str) : c4005bd);
        str = (i & 1) != 0 ? "" : str;
    }

    @Override // com.ironsource.InterfaceC4285r7
    @NotNull
    public String a() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4285r7
    public boolean b() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC4285r7
    @NotNull
    public C4005bd c() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4285r7
    @NotNull
    public String d() {
        return this.b;
    }

    public C4032d4(@NotNull String str, @NotNull String str2, boolean z, @NotNull C4005bd c4005bd) {
        str.getClass();
        str2.getClass();
        c4005bd.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = c4005bd;
    }

    public C4032d4() {
        this(null, null, false, null, 15, null);
    }
}
