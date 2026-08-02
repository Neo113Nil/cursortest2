package com.zoho.livechat.android.utils;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import com.zoho.livechat.android.provider.MobilistenInitProvider;

/* loaded from: classes4.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static SharedPreferences f44400a = MobilistenInitProvider.k().getSharedPreferences("siq_permission", 0);

    public static /* synthetic */ void a(Activity activity, int i10, DialogInterface dialogInterface, int i11) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", MobilistenUtil.g(), null));
        androidx.core.app.b.j(activity, intent, i10, null);
        dialogInterface.dismiss();
    }

    public static void b(String str) {
        try {
            SharedPreferences.Editor edit = f44400a.edit();
            edit.putString(str, str);
            edit.apply();
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public static boolean c(String str) {
        try {
            return f44400a.contains(str);
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
            return false;
        }
    }

    public static androidx.appcompat.app.a d(final Activity activity, final int i10, String str) {
        return qe.d.e(activity, null, str, activity.getResources().getString(od.t.f60853E1), new DialogInterface.OnClickListener() { // from class: com.zoho.livechat.android.utils.J
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                K.a(activity, i10, dialogInterface, i11);
            }
        }, Integer.valueOf(P.a(activity)), activity.getResources().getString(od.t.f60847D1));
    }
}
