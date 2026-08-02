package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import defpackage.ogj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.rg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4294rg {
    public static void a(Context context, String str, String str2) throws Exception {
        if (TextUtils.isEmpty(str)) {
            ogj.k("url is null");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (!TextUtils.isEmpty(str2)) {
            intent.setPackage(str2);
        }
        context.startActivity(intent);
    }

    public static void a(Context context, String str) throws Exception {
        a(context, str, null);
    }
}
