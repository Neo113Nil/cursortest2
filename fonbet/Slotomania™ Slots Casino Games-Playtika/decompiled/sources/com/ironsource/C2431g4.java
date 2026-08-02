package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.g4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2431g4 implements InterfaceC2684u7 {
    private final String a;
    private final String b;
    private final boolean c;
    private final C2368cd d;

    public C2431g4() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.ironsource.InterfaceC2684u7
    public String a() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC2684u7
    public boolean b() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC2684u7
    public C2368cd c() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC2684u7
    public String d() {
        return this.b;
    }

    public C2431g4(String controllerUrl, String cacheFolder, boolean z, C2368cd rootFolder) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        Intrinsics.checkNotNullParameter(cacheFolder, "cacheFolder");
        Intrinsics.checkNotNullParameter(rootFolder, "rootFolder");
        this.a = controllerUrl;
        this.b = cacheFolder;
        this.c = z;
        this.d = rootFolder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C2431g4(String str, String str2, boolean z, C2368cd c2368cd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new C2368cd(str) : c2368cd);
        str = (i & 1) != 0 ? "" : str;
    }
}
