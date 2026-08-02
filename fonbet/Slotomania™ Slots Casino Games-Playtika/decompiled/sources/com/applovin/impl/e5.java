package com.applovin.impl;

import com.applovin.mediation.MaxError;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class e5 {
    private final f5 a;
    private final String b;
    private final String c;
    private final String d;
    private final MaxError e;
    private final long f;
    private final long g;
    private final boolean h;

    public interface a {
        void a(e5 e5Var);
    }

    private e5(f5 f5Var, com.applovin.impl.mediation.h hVar, String str, MaxError maxError, long j, long j2) {
        this(f5Var, str, maxError, j, j2, hVar != null ? hVar.i() : null, hVar != null ? hVar.b() : null, false);
    }

    public static e5 a(f5 f5Var, com.applovin.impl.mediation.h hVar, String str, long j, long j2) {
        if (f5Var == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (hVar != null) {
            return new e5(f5Var, hVar, str, null, j, j2);
        }
        throw new IllegalArgumentException("No adapterWrapper specified");
    }

    public long b() {
        return this.g;
    }

    public MaxError c() {
        return this.e;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.d;
    }

    public f5 f() {
        return this.a;
    }

    public boolean g() {
        return this.h;
    }

    public String toString() {
        StringBuilder append = new StringBuilder("SignalCollectionResult{mSignalProviderSpec=").append(this.a).append(", mSdkVersion='").append(this.b).append("', mAdapterVersion='").append(this.c).append("', mSignalDataLength='");
        String str = this.d;
        StringBuilder append2 = append.append(str != null ? str.length() : 0).append("', mErrorMessage=");
        MaxError maxError = this.e;
        return append2.append(maxError != null ? maxError.getMessage() : "").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    private e5(f5 f5Var, String str, MaxError maxError, long j, long j2, String str2, String str3, boolean z) {
        this.a = f5Var;
        this.d = str;
        this.e = maxError;
        this.f = j;
        this.g = j2;
        this.b = str2;
        this.c = str3;
        this.h = z;
    }

    public static e5 a(f5 f5Var, MaxError maxError) {
        return a(f5Var, (com.applovin.impl.mediation.h) null, maxError, -1L, -1L);
    }

    public static e5 a(f5 f5Var, com.applovin.impl.mediation.h hVar, MaxError maxError, long j, long j2) {
        if (f5Var != null) {
            return new e5(f5Var, hVar, null, maxError, j, j2);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public static e5 a(e5 e5Var) {
        return new e5(e5Var.f(), e5Var.e(), e5Var.c(), e5Var.f, e5Var.g, e5Var.d(), e5Var.a(), true);
    }

    public String a() {
        return this.c;
    }
}
