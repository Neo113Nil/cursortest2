package com.ironsource;

import kotlin.Result;
import xsna.go9;
import xsna.izs;
import xsna.s3q0;

/* renamed from: com.ironsource.i4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4363i4 implements InterfaceC4310f5<C4671z8> {
    private final Y5 a;
    private final String b;
    private final InterfaceC4670z7 c;
    private final izs<Result<? extends C4671z8>, s3q0> d;
    private C4671z8 e = new C4671z8(c());

    /* JADX WARN: Multi-variable type inference failed */
    public C4363i4(Y5 y5, String str, InterfaceC4670z7 interfaceC4670z7, izs<? super Result<? extends C4671z8>, s3q0> izsVar) {
        this.a = y5;
        this.b = str;
        this.c = interfaceC4670z7;
        this.d = izsVar;
    }

    @Override // com.ironsource.Oc
    public void a(C4671z8 c4671z8) {
        i().invoke(new Result<>(c4671z8));
    }

    @Override // com.ironsource.InterfaceC4310f5
    public void b(C4671z8 c4671z8) {
        this.e = c4671z8;
    }

    @Override // com.ironsource.InterfaceC4310f5
    public String c() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4310f5
    public Y5 d() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4310f5
    public izs<Result<? extends C4671z8>, s3q0> i() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4310f5
    public C4671z8 k() {
        return this.e;
    }

    @Override // com.ironsource.InterfaceC4310f5
    public InterfaceC4670z7 l() {
        return this.c;
    }

    @Override // com.ironsource.Oc
    public void a(C4671z8 c4671z8, C4510q8 c4510q8) {
        i().invoke(new Result<>(new Result.Failure(new Exception(go9.b("Unable to download mobileController.html: ", c4510q8.b())))));
    }
}
