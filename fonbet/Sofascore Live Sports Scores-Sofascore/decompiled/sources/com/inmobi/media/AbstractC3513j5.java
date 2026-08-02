package com.inmobi.media;

import android.content.Context;
import android.net.Uri;
import defpackage.ea4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.j5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3513j5 {
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, ea4 ea4Var, Uri uri, C3500ii c3500ii, C3571lb c3571lb, Eh eh, String str) {
        int i;
        context.getClass();
        ea4Var.getClass();
        uri.getClass();
        eh.getClass();
        str.getClass();
        String a = AbstractC3643o5.a(context);
        try {
            try {
                if (a == null) {
                    if (c3500ii != null) {
                        String uri2 = uri.toString();
                        uri2.getClass();
                        uri2.getClass();
                        str.getClass();
                        c3500ii.a.getLandingPageHandler().a(uri2, str, c3571lb);
                        return;
                    }
                    return;
                }
                ea4Var.a.setFlags(268435456);
                ea4Var.a.setPackage(a);
                ea4Var.a(context, uri);
                if (c3571lb != null) {
                    c3571lb.f = "IN_NATIVE";
                }
                if (c3500ii != null) {
                    O2.a(c3500ii, Za.LPStartSuccess, c3571lb);
                }
            } catch (Exception unused) {
                String uri3 = uri.toString();
                uri3.getClass();
                i = F3.a(context, uri3, eh, str);
                if (c3571lb != null) {
                    c3571lb.f = "EX_NATIVE";
                }
                if (i != 0 || i == 1) {
                    if (c3500ii == null) {
                        O2.a(c3500ii, Za.LPStartSuccess, c3571lb);
                    }
                } else if (c3500ii != null) {
                    Za za = Za.LPBrowserOpenFailed;
                    Integer valueOf = Integer.valueOf(i);
                    za.getClass();
                    c3500ii.a.getLandingPageHandler().a(za, c3571lb, valueOf);
                }
            }
        } catch (Exception unused2) {
            i = 9;
            if (c3571lb != null) {
            }
            if (i != 0) {
            }
            if (c3500ii == null) {
            }
        }
    }
}
