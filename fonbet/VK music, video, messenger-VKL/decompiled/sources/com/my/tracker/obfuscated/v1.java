package com.my.tracker.obfuscated;

/* loaded from: classes.dex */
public final class v1 implements u1 {
    private final int a;
    private long b;

    public v1(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // com.my.tracker.obfuscated.n2, com.my.tracker.obfuscated.e2
    public int a() {
        return this.a;
    }

    @Override // com.my.tracker.obfuscated.u1
    public void b(long j) {
        this.b = j;
    }

    @Override // com.my.tracker.obfuscated.u1
    public long e() {
        return this.b;
    }
}
