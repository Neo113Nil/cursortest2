package com.ironsource;

import xsna.zcl;

/* renamed from: com.ironsource.g4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4327g4 implements InterfaceC4598v7 {
    private final String a;
    private final String b;
    private final boolean c;
    private final C4264cd d;

    public C4327g4() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.ironsource.InterfaceC4598v7
    public String a() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4598v7
    public boolean b() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC4598v7
    public C4264cd c() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4598v7
    public String d() {
        return this.b;
    }

    public C4327g4(String str, String str2, boolean z, C4264cd c4264cd) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = c4264cd;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C4327g4(String str, String str2, boolean z, C4264cd c4264cd, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new C4264cd(str) : c4264cd);
        str = (i & 1) != 0 ? "" : str;
    }
}
