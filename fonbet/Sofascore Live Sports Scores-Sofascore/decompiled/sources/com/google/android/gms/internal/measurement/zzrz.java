package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import defpackage.bf3;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.hv9;
import defpackage.ih2;
import defpackage.mz1;
import defpackage.vvf;
import defpackage.wt3;
import defpackage.zu9;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzrz {
    public final String a;
    public String b = "files";
    public String c = "common";
    public final Account d = zzsa.b;
    public String e = "";
    public final zu9 f = hv9.s();

    public /* synthetic */ zzrz(Context context) {
        this.a = context.getPackageName();
    }

    public final void a(String str) {
        zzsq.a(zzsa.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        zzsq.a(!zzsa.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.c = str;
    }

    public final void b(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = zzsa.a;
        this.e = str;
    }

    public final Uri c() {
        String m;
        String str = this.b;
        String str2 = this.c;
        Account account = zzrv.a;
        Account account2 = this.d;
        zzsq.a(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        zzsq.a(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        zzsq.a(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (zzrv.a.equals(account2)) {
            m = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            m = wt3.m(str3, ":", new StringBuilder(fn0.c(1, str3) + String.valueOf(str4).length()), str4);
        }
        String str5 = this.e;
        StringBuilder sb = new StringBuilder(mz1.d(mz1.d(str.length() + 2, 1, str2), 1, m) + str5.length());
        bf3.v(sb, "/", str, "/", str2);
        String o = fc6.o(sb, "/", m, "/", str5);
        vvf g = this.f.g();
        Pattern pattern = zzsp.a;
        return new Uri.Builder().scheme("android").authority(this.a).path(o).encodedFragment(g.isEmpty() ? null : "transform=".concat(new ih2("+").e(g))).build();
    }
}
