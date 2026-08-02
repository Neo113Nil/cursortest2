package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import defpackage.ba4;
import defpackage.ga4;
import defpackage.ja4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.k5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3539k5 extends ga4 {
    public final /* synthetic */ C3591m5 a;

    public C3539k5(C3591m5 c3591m5) {
        this.a = c3591m5;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        componentName.getClass();
        this.a.a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ga4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCustomTabsServiceConnected(ComponentName componentName, ba4 ba4Var) {
        int i;
        C3571lb c3571lb;
        C3500ii c3500ii;
        componentName.getClass();
        ba4Var.getClass();
        C3591m5 c3591m5 = this.a;
        c3591m5.a = ba4Var;
        Y2 y2 = c3591m5.c;
        if (y2 == null) {
            return;
        }
        try {
            C3591m5 c3591m52 = y2.e;
            ja4 ja4Var = c3591m52.d;
            if (ja4Var == null) {
                ba4 ba4Var2 = c3591m52.a;
                ja4Var = ba4Var2 != null ? ba4Var2.c(new C3565l5(c3591m52)) : null;
                c3591m52.d = ja4Var;
            }
            if (ja4Var != null) {
                Bundle bundle = Bundle.EMPTY;
                if (ja4Var.b()) {
                    ja4Var.d(y2.a());
                }
            }
        } catch (Throwable unused) {
        }
        try {
            try {
                Uri parse = Uri.parse(y2.a);
                parse.getClass();
                y2.a(parse);
            } catch (Throwable unused2) {
                Context context = y2.f;
                String str = y2.a;
                Object obj = y2.j.get();
                obj.getClass();
                i = F3.a(context, str, (Eh) obj, y2.d);
                c3571lb = y2.c;
                if (c3571lb != null) {
                    c3571lb.f = "EX_NATIVE";
                }
                if (i != 0 || i == 1) {
                    c3500ii = (C3500ii) y2.i.get();
                    if (c3500ii == null) {
                        O2.a(c3500ii, Za.LPStartSuccess, y2.c);
                        return;
                    }
                    return;
                }
                C3500ii c3500ii2 = (C3500ii) y2.i.get();
                if (c3500ii2 != null) {
                    Za za = Za.LPBrowserOpenFailed;
                    C3571lb c3571lb2 = y2.c;
                    Integer valueOf = Integer.valueOf(i);
                    za.getClass();
                    c3500ii2.a.getLandingPageHandler().a(za, c3571lb2, valueOf);
                }
            }
        } catch (Exception unused3) {
            i = 9;
            c3571lb = y2.c;
            if (c3571lb != null) {
            }
            if (i != 0) {
            }
            c3500ii = (C3500ii) y2.i.get();
            if (c3500ii == null) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        C3591m5 c3591m5 = this.a;
        c3591m5.a = null;
        Y2 y2 = c3591m5.c;
        if (y2 != null) {
            C3571lb c3571lb = y2.c;
            if (c3571lb != null) {
                c3571lb.f = "IN_NATIVE";
            }
            C3500ii c3500ii = (C3500ii) y2.i.get();
            if (c3500ii != null) {
                Za za = Za.LPBrowserOpenFailed;
                C3571lb c3571lb2 = y2.c;
                za.getClass();
                c3500ii.a.getLandingPageHandler().a(za, c3571lb2, (Integer) 8009);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
        this.a.a = null;
    }
}
