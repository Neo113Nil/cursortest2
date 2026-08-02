package com.fyber.inneractive.sdk.network;

/* loaded from: classes12.dex */
public class k1 extends Exception {
    public final int a;

    public k1(String str, int i) {
        super(str);
        this.a = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return String.valueOf(this.a);
    }
}
