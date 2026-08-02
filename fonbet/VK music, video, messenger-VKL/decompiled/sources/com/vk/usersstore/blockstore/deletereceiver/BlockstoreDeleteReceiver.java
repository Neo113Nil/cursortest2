package com.vk.usersstore.blockstore.deletereceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import xsna.bg7;
import xsna.c2r0;
import xsna.epx;
import xsna.zf7;

/* compiled from: BlockstoreDeleteReceiver.kt */
/* loaded from: classes6.dex */
public final class BlockstoreDeleteReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    /* compiled from: BlockstoreDeleteReceiver.kt */
    public static final class a {
        public static String a(Context context) {
            String str = "";
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle != null) {
                    String string = bundle.getString("com.vkontakte.android.permission.BUILD_SUFFIX_KEY");
                    if (string != null) {
                        str = string;
                    }
                }
            } catch (Exception e) {
                L.B("BlockstoreDeleteReceiver", "com.vkontakte.android.permission.BUILD_SUFFIX_KEY not found:", e);
            }
            return "com.vk.blockstore.permission.DELETE".concat(str);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context == null) {
            return;
        }
        if (epx.f(intent != null ? intent.getAction() : null, "com.vk.blockstore.action.delete")) {
            long longExtra = intent.getLongExtra("userId", 0L);
            Long valueOf = Long.valueOf(longExtra);
            if (longExtra <= 0) {
                valueOf = null;
            }
            if (valueOf == null) {
                return;
            }
            new bg7(c2r0.a.a, new zf7(), io.reactivex.rxjava3.schedulers.a.b()).b(context, new UserId(valueOf.longValue()));
        }
        if (epx.f(intent != null ? intent.getAction() : null, "com.vk.blockstore.action.deleteall")) {
            bg7.g.getClass();
            bg7.b.a(context);
        }
    }
}
