package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import kotlin.Result;
import org.json.JSONObject;
import xsna.epx;
import xsna.go9;
import xsna.izs;
import xsna.s3q0;

/* renamed from: com.ironsource.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4250c implements InterfaceC4310f5<JSONObject> {
    private final Y5 a;
    private final String b;
    private final InterfaceC4670z7 c;
    private final izs<Result<? extends JSONObject>, s3q0> d;
    private C4671z8 e = new C4671z8(c(), X3.i);

    /* JADX WARN: Multi-variable type inference failed */
    public C4250c(Y5 y5, String str, InterfaceC4670z7 interfaceC4670z7, izs<? super Result<? extends JSONObject>, s3q0> izsVar) {
        this.a = y5;
        this.b = str;
        this.c = interfaceC4670z7;
        this.d = izsVar;
    }

    @Override // com.ironsource.Oc
    public void a(C4671z8 c4671z8) {
        if (epx.f(c4671z8.getName(), X3.i)) {
            try {
                i().invoke(new Result<>(c(c4671z8)));
            } catch (Exception e) {
                C4452n4.d().a(e);
                i().invoke(new Result<>(new Result.Failure(e)));
            }
        }
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
    public izs<Result<? extends JSONObject>, s3q0> i() {
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

    private final JSONObject c(C4671z8 c4671z8) {
        return new JSONObject(IronSourceStorageUtils.readFile(c4671z8));
    }

    @Override // com.ironsource.Oc
    public void a(C4671z8 c4671z8, C4510q8 c4510q8) {
        i().invoke(new Result<>(new Result.Failure(new Exception(go9.b("Unable to download abTestMap.json: ", c4510q8.b())))));
    }
}
