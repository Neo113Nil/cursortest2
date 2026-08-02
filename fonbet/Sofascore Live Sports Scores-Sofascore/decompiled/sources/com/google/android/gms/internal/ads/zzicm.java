package com.google.android.gms.internal.ads;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzicm {
    public static final zzicm d = new zzicm("", "", false);
    public final String a;
    public final String b;
    public final boolean c;

    static {
        new zzicm("\n", "  ", true);
    }

    public zzicm(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            a70.p("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            a70.p("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
