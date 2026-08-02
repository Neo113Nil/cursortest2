package com.fyber.inneractive.sdk.config.global;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f implements d {
    public final String a;
    public final boolean b;

    public f(boolean z, String str) {
        this.a = str;
        this.b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        String str = this.a;
        if (str == null) {
            return false;
        }
        boolean equalsIgnoreCase = str.equalsIgnoreCase("android");
        boolean z = this.b;
        return equalsIgnoreCase ? !z : z;
    }

    public final String toString() {
        return "os - " + this.a + " include: " + this.b;
    }
}
