package com.facebook.soloader;

import y8.AbstractC6859b;

/* loaded from: classes2.dex */
public class o implements x {

    /* renamed from: a, reason: collision with root package name */
    public final x f31615a;

    public o(x xVar) {
        this.f31615a = xVar;
    }

    @Override // com.facebook.soloader.x
    public void a(String str, int i10) {
        AbstractC6859b.j(this.f31615a, "load", i10);
        try {
            this.f31615a.a(str, i10);
            AbstractC6859b.i(null);
        } finally {
        }
    }
}
