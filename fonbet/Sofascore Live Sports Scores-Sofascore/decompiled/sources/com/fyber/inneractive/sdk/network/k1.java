package com.fyber.inneractive.sdk.network;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
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
