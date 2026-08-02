package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w0;

/* loaded from: classes3.dex */
public class u0 {
    private final StringBuilder a = new StringBuilder();

    public void a(w0 w0Var, long j) {
        if (w0Var.d() == w0.b.DECISION) {
            return;
        }
        a(a(w0Var), j);
    }

    public void b() {
        a("Invalid Activity");
    }

    public String toString() {
        return this.a.toString();
    }

    public void b(String str) {
        a("Invalid state: " + str);
    }

    public void a(w0 w0Var, boolean z, long j) {
        a(a(w0Var) + ": " + z, j);
    }

    public void a() {
        this.a.setLength(0);
    }

    private void a(String str, long j) {
        a(str + " after " + j + "ms");
    }

    private void a(String str) {
        this.a.append(str).append("\n");
    }

    private String a(w0 w0Var) {
        w0.b d = w0Var.d();
        if (d == w0.b.EVENT) {
            return ((z0) w0Var).g();
        }
        if (d == w0.b.DECISION) {
            return StringUtils.emptyIfNull(w0Var.b());
        }
        return StringUtils.emptyIfNull(w0Var.e());
    }
}
