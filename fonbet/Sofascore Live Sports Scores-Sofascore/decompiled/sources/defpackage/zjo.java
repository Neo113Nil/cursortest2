package defpackage;

import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zjo implements vf {
    public final tf a;
    public final Object b;

    public zjo(tf tfVar, Object obj) {
        this.a = tfVar;
        this.b = obj;
    }

    public static String a(String str, String str2) {
        return (str2 == null || str2.length() == 0) ? str : wt3.m(str, " Caused by: ", new StringBuilder(fn0.c(12, str) + str2.length()), str2);
    }

    public final String toString() {
        return "AdErrorEvent: [error=" + this.a + U3.j.e;
    }

    public zjo(tf tfVar) {
        this.a = tfVar;
    }
}
