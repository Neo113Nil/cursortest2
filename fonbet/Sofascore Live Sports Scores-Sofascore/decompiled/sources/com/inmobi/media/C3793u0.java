package com.inmobi.media;

import defpackage.a70;
import defpackage.fc6;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.u0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3793u0 {
    public final String a;
    public long b;
    public Map c;
    public String d;
    public String e;
    public final String f;
    public String g;
    public String h;
    public boolean i;
    public String j;
    public String k;

    public C3793u0(String str) {
        str.getClass();
        this.a = str;
        this.b = Long.MIN_VALUE;
        this.f = fc6.C();
        this.g = "";
        this.h = "";
        this.j = "activity";
    }

    public final C3845w0 a() {
        String str;
        boolean z;
        if (this.b == Long.MIN_VALUE) {
            a70.r("When the integration type is IM, IM-Plc can't be empty");
            return null;
        }
        long j = this.b;
        Map map = this.c;
        if (map == null || (str = (String) map.get("tp")) == null) {
            str = "";
        }
        C3845w0 c3845w0 = new C3845w0(j, str, this.a, this.e);
        c3845w0.d = this.d;
        c3845w0.c = this.c;
        String str2 = this.g;
        str2.getClass();
        c3845w0.h = str2;
        String str3 = this.h;
        str3.getClass();
        c3845w0.i = str3;
        Map map2 = this.c;
        if (Intrinsics.c(map2 != null ? (String) map2.get("ab-type") : null, "inline")) {
            if (CollectionsKt.R(C3845w0.n, map2 != null ? (String) map2.get("tp") : null)) {
                String str4 = map2 != null ? (String) map2.get("ab-ad-slot") : null;
                if (str4 != null && str4.length() != 0) {
                    z = true;
                    c3845w0.j = z;
                    String str5 = this.j;
                    str5.getClass();
                    c3845w0.k = str5;
                    c3845w0.g = this.f;
                    c3845w0.l = this.i;
                    c3845w0.m = this.k;
                    return c3845w0;
                }
            }
        }
        z = false;
        c3845w0.j = z;
        String str52 = this.j;
        str52.getClass();
        c3845w0.k = str52;
        c3845w0.g = this.f;
        c3845w0.l = this.i;
        c3845w0.m = this.k;
        return c3845w0;
    }
}
