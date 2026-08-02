package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzht extends IOException {
    public final int a;

    public zzht() {
        this.a = 2008;
    }

    public zzht(String str, int i) {
        super(str);
        this.a = i;
    }

    public zzht(int i, String str, Exception exc) {
        super(str, exc);
        this.a = i;
    }

    public zzht(int i, Exception exc) {
        super(exc);
        this.a = i;
    }
}
