package com.my.tracker.obfuscated;

/* loaded from: classes.dex */
public final class w implements u {
    private final int a;
    private int b;

    public w(int i) {
        this.a = i;
        g();
    }

    @Override // com.my.tracker.obfuscated.n2, com.my.tracker.obfuscated.e2
    public int a() {
        return this.a;
    }

    @Override // com.my.tracker.obfuscated.u, com.my.tracker.obfuscated.v
    public int d() {
        return this.b;
    }

    @Override // com.my.tracker.obfuscated.u
    public void f() {
        this.b++;
    }

    public void g() {
        this.b = 0;
    }

    public String toString() {
        return "[CountBased TS] id = " + this.a + ", count = " + this.b;
    }
}
