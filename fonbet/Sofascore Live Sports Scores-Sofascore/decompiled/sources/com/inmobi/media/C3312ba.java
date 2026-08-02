package com.inmobi.media;

import defpackage.dmi;
import defpackage.fc6;
import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ba, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3312ba extends AbstractC3614n2 {
    public final String e;
    public final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3312ba(String str, String str2, String str3, String str4) {
        super(str3, str4);
        me4.p(str, str2, str3);
        this.e = str;
        this.f = str2;
    }

    public final String toString() {
        return dmi.r(this.a, "@", this.f, " ");
    }

    public C3312ba(String str, String str2, String str3) {
        this(fc6.C(), str, str2, str3);
    }
}
